package com.nimbusds.jwt.util;

/* loaded from: classes4.dex */
public class DateUtils {
    public static java.util.Date nowWithSecondsPrecision() {
        return fromSecondsSinceEpoch(toSecondsSinceEpoch(new java.util.Date()));
    }

    public static long toSecondsSinceEpoch(java.util.Date date) {
        return date.getTime() / 1000;
    }

    public static java.util.Date fromSecondsSinceEpoch(long j) {
        return new java.util.Date(j * 1000);
    }

    public static boolean isAfter(java.util.Date date, java.util.Date date2, long j) {
        return new java.util.Date(date.getTime() + (j * 1000)).after(date2);
    }

    public static boolean isBefore(java.util.Date date, java.util.Date date2, long j) {
        return new java.util.Date(date.getTime() - (j * 1000)).before(date2);
    }

    public static boolean isWithin(java.util.Date date, java.util.Date date2, long j) {
        long j2 = j * 1000;
        return date.getTime() > date2.getTime() - j2 && date.getTime() < date2.getTime() + j2;
    }

    private DateUtils() {
    }
}
