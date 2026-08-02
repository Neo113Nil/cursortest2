package com.nimbusds.jose.util;

@java.lang.Deprecated
/* loaded from: classes10.dex */
public class DateUtils {
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

    private DateUtils() {
    }
}
