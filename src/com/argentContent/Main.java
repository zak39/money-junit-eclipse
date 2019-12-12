package com.argentContent;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        Money myMoney01 = new Money(15,"EUR");
        Money myMoney02 = new Money(210,"USD");
        Money myMoney03 = new Money(1500,"CHF");
        Money myMoney04 = new Money(150,"GBP");

        System.out.println(myMoney01.getfAmount() + myMoney01.getfCurrency());
        System.out.println(myMoney02.getfAmount() + myMoney02.getfCurrency());
        System.out.println(myMoney03.getfAmount() + myMoney03.getfCurrency());
        System.out.println(myMoney04.getfAmount() + myMoney04.getfCurrency());

        myMoney01 = myMoney01.add(30,"EUR");
        System.out.println(myMoney01.getfAmount() + myMoney01.getfCurrency());

        myMoney02 = myMoney02.add(50,"USD");
        System.out.println(myMoney02.getfAmount() + myMoney02.getfCurrency());

        MoneyBag poche = new MoneyBag();
        poche.add(myMoney01);
        poche.add(myMoney02);
        poche.add(myMoney03);
        System.out.println(poche);
         
        //poche.getPortefeuil().forEach(System.out.println());
        System.out.println("Parcours la liste");
        for(Money MyMoney : poche.getPortefeuil())
        {
        	System.out.println(MyMoney.getfAmount() + MyMoney.getfCurrency());
        }
        
        poche.subb(myMoney02);

        System.out.println("Suppresion de myMoney02 dans ma poche");
        for(Money MyMoney : poche.getPortefeuil())
        {
        	System.out.println(MyMoney.getfAmount() + MyMoney.getfCurrency());
        }
        
    }
	
}
