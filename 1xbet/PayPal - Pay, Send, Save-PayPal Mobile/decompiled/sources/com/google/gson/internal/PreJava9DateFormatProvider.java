package com.google.gson.internal;

/* loaded from: classes4.dex */
public class PreJava9DateFormatProvider {
    private PreJava9DateFormatProvider() {
    }

    public static java.text.DateFormat getUsDateTimeFormat(int i, int i2) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(getDatePartOfDateTimePattern(i));
        sb.append(" ");
        sb.append(getTimePartOfDateTimePattern(i2));
        return new java.text.SimpleDateFormat(sb.toString(), java.util.Locale.US);
    }

    private static java.lang.String getDatePartOfDateTimePattern(int i) {
        if (i == 0) {
            return "EEEE, MMMM d, yyyy";
        }
        if (i == 1) {
            return com.paypal.oslo.feature.savings.constants.SavingsConstants.DateFormatting.DATE_DISPLAY_FORMAT;
        }
        if (i == 2) {
            return com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.DateTimeFormatConstants.KEY_TRANSACTION_DATE_WITH_YEAR_FORMAT;
        }
        if (i == 3) {
            return "M/d/yy";
        }
        throw new java.lang.IllegalArgumentException("Unknown DateFormat style: ".concat(java.lang.String.valueOf(i)));
    }

    private static java.lang.String getTimePartOfDateTimePattern(int i) {
        if (i == 0 || i == 1) {
            return "h:mm:ss a z";
        }
        if (i == 2) {
            return "h:mm:ss a";
        }
        if (i == 3) {
            return "h:mm a";
        }
        throw new java.lang.IllegalArgumentException("Unknown DateFormat style: ".concat(java.lang.String.valueOf(i)));
    }
}
