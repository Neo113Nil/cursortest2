package io.appmetrica.analytics.coreutils.internal.parsing;

/* loaded from: classes.dex */
public class ParseUtils {
    public static final int NEGATIVE_INT = -1;
    public static final int ZERO = 0;

    public static java.lang.Integer intValueOf(java.lang.String str) {
        if (str == null) {
            return null;
        }
        try {
            return java.lang.Integer.valueOf(str);
        } catch (java.lang.NumberFormatException unused) {
            return null;
        }
    }

    public static java.lang.Float parseFloat(java.lang.String str) {
        try {
            return java.lang.Float.valueOf(java.lang.Float.parseFloat(str));
        } catch (java.lang.NumberFormatException unused) {
            return null;
        }
    }

    public static int parseInt(java.lang.String str, int i2) {
        if (str == null) {
            return i2;
        }
        try {
            return java.lang.Integer.parseInt(str);
        } catch (java.lang.NumberFormatException unused) {
            return i2;
        }
    }

    public static int parseIntOrNegative(java.lang.String str) {
        return parseInt(str, -1);
    }

    public static int parseIntOrZero(java.lang.String str) {
        return parseInt(str, 0);
    }

    public static long parseLong(java.lang.String str, long j2) {
        try {
            return java.lang.Long.parseLong(str);
        } catch (java.lang.NumberFormatException unused) {
            return j2;
        }
    }

    public static java.lang.Integer parseInt(java.lang.String str) {
        try {
            return java.lang.Integer.valueOf(java.lang.Integer.parseInt(str));
        } catch (java.lang.NumberFormatException unused) {
            return null;
        }
    }

    public static java.lang.Long parseLong(java.lang.String str) {
        try {
            return java.lang.Long.valueOf(java.lang.Long.parseLong(str));
        } catch (java.lang.NumberFormatException unused) {
            return null;
        }
    }
}
