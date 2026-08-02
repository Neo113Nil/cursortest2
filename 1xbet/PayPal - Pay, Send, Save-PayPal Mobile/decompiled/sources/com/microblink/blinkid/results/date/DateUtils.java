package com.microblink.blinkid.results.date;

/* loaded from: classes10.dex */
public final class DateUtils {
    public static boolean isDatePassed(com.microblink.blinkid.results.date.SimpleDate simpleDate) {
        java.util.Calendar calendar = java.util.Calendar.getInstance();
        com.microblink.blinkid.results.date.SimpleDate simpleDate2 = new com.microblink.blinkid.results.date.SimpleDate(calendar.get(5), calendar.get(2) + 1, calendar.get(1));
        int[] iArr = {simpleDate2.getYear(), simpleDate2.getMonth(), simpleDate2.getDay()};
        int[] iArr2 = {simpleDate.getYear(), simpleDate.getMonth(), simpleDate.getDay()};
        for (int i = 0; i < 3; i++) {
            int i2 = iArr[i];
            int i3 = iArr2[i];
            if (i3 < i2) {
                return true;
            }
            if (i3 > i2) {
                return false;
            }
        }
        return false;
    }

    public static int yearsPassedFrom(com.microblink.blinkid.results.date.SimpleDate simpleDate) {
        java.util.Calendar calendar = java.util.Calendar.getInstance();
        com.microblink.blinkid.results.date.SimpleDate simpleDate2 = new com.microblink.blinkid.results.date.SimpleDate(calendar.get(5), calendar.get(2) + 1, calendar.get(1));
        java.util.Locale locale = java.util.Locale.US;
        return (java.lang.Integer.parseInt(java.lang.String.format(locale, "%04d%02d%02d", java.lang.Integer.valueOf(simpleDate2.getYear()), java.lang.Integer.valueOf(simpleDate2.getMonth()), java.lang.Integer.valueOf(simpleDate2.getDay()))) - java.lang.Integer.parseInt(java.lang.String.format(locale, "%04d%02d%02d", java.lang.Integer.valueOf(simpleDate.getYear()), java.lang.Integer.valueOf(simpleDate.getMonth()), java.lang.Integer.valueOf(simpleDate.getDay())))) / 10000;
    }
}
