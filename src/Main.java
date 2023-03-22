public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }
    public static void task1() {
        System.out.println("Задача 1");
        short monthCount = 0;
        short monthlyDeposit = 15_000;
        int goalDeposit = 2_459_000;
        int deposit = 0;
        while (deposit < goalDeposit) {
            deposit+=monthlyDeposit;
            monthCount++;
            System.out.println("Месяц " + monthCount + ", сумма накоплений равна " + deposit + " рублей");
        }
    }
    public static void task2() {
        System.out.println("Задача 2");
        int i = 1;
        while (i <= 10) {
            System.out.print(i + " ");
            i++;
        }
        i--;
        System.out.println();
        for (; i >= 1; i--) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
    public static void task3() {
        System.out.println("Задача 3");
        int totalPopulation = 12_000_000;
        byte birthRate = 17;
        byte deathRate = 8;
        int populationGrowth = birthRate - deathRate;
        for (int i = 1; i <= 10; i++) {
            totalPopulation += totalPopulation/1000*populationGrowth;
            System.out.println("Год " + i + ", численность населения составляет " + totalPopulation);
        }
    }
    public static void task4() {
        System.out.println("Задача 4");
        int deposit = 15_000;
        byte savingsPercentage = 7;
        short monthCount = 0;
        while (deposit < 12_000_000) {
            deposit += deposit/100*7;
            monthCount++;
            System.out.println(monthCount + " месяц, сумма накоплений: " + deposit);
        }
    }
    public static void task5() {
        System.out.println("Задача 5");
        int deposit = 15_000;
        byte savingsPercentage = 7;
        short monthCount = 0;
        while (deposit < 12_000_000) {
            deposit += deposit/100*7;
            monthCount++;
            if (monthCount % 6 == 0) {
                System.out.println(monthCount + " месяц, сумма накоплений: " + deposit);
            }
        }
    }
    public static void task6() {
        System.out.println("Задача 6");
        int deposit = 15_000;
        byte savingsPercentage = 7;
        short monthCount = 0;
        while (monthCount < 9*12) {
            deposit += deposit/100*7;
            monthCount++;
            if (monthCount % 6 == 0) {
                System.out.println(monthCount + " месяц, сумма накоплений: " + deposit);
            }
        }
    }
    public static void task7() {
        System.out.println("Задача 7");
        int firstFriday = 3;
        for (; firstFriday <= 31; firstFriday+=7) {
            System.out.println("Сегодня пятница, " + firstFriday + "-е число. Необходимо подготовить отчет");
        }
    }
    public static void task8() {
        System.out.println("Задача 8");
        short currentYear = 2023;
        int previousYear = currentYear - 200;
        int futureYear = currentYear + 100;
        while (previousYear % 79 != 0) { //
            previousYear++;
        }
        for (; previousYear < futureYear; previousYear += 79) {
            System.out.println(previousYear);
        }
    }
}