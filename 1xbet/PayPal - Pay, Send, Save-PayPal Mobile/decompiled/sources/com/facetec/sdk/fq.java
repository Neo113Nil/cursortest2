package com.facetec.sdk;

/* loaded from: classes8.dex */
public final class fq {
    public static java.text.DateFormat b(int i, int i2) {
        java.lang.String str;
        java.lang.String str2;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        if (i == 0) {
            str = "EEEE, MMMM d, yyyy";
        } else if (i == 1) {
            str = com.paypal.oslo.feature.savings.constants.SavingsConstants.DateFormatting.DATE_DISPLAY_FORMAT;
        } else if (i == 2) {
            str = com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.DateTimeFormatConstants.KEY_TRANSACTION_DATE_WITH_YEAR_FORMAT;
        } else if (i == 3) {
            str = "M/d/yy";
        } else {
            throw new java.lang.IllegalArgumentException("Unknown DateFormat style: ".concat(java.lang.String.valueOf(i)));
        }
        sb.append(str);
        sb.append(" ");
        if (i2 == 0 || i2 == 1) {
            str2 = "h:mm:ss a z";
        } else if (i2 == 2) {
            str2 = "h:mm:ss a";
        } else if (i2 == 3) {
            str2 = "h:mm a";
        } else {
            throw new java.lang.IllegalArgumentException("Unknown DateFormat style: ".concat(java.lang.String.valueOf(i2)));
        }
        sb.append(str2);
        return new java.text.SimpleDateFormat(sb.toString(), java.util.Locale.US);
    }
}
