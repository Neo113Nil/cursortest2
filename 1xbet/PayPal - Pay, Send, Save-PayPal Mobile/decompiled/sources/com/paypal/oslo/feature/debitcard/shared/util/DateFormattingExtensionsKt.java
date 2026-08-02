package com.paypal.oslo.feature.debitcard.shared.util;

@kotlin.Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a\u0013\u0010\u0001\u001a\u00020\u0000*\u00020\u0000H\u0000¢\u0006\u0004\b\u0001\u0010\u0002\u001a\u0013\u0010\u0003\u001a\u00020\u0000*\u00020\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0002"}, d2 = {"", "formatToMonthYear", "(Ljava/lang/String;)Ljava/lang/String;", "formatToMonthDayYear"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class DateFormattingExtensionsKt {
    public static final java.lang.String formatToMonthYear(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        try {
            java.util.Date parse = new java.text.SimpleDateFormat("yyyy-MM", java.util.Locale.US).parse(str);
            if (parse == null) {
                return str;
            }
            java.lang.String format = new java.text.SimpleDateFormat("MM/yy", java.util.Locale.US).format(parse);
            kotlin.jvm.internal.Intrinsics.checkNotNull(format);
            return format;
        } catch (java.text.ParseException e) {
            com.paypal.android.logger.Logger.w$default(com.paypal.oslo.feature.debitcard.LoggerKt.log, "Failed to parse date string: ".concat(java.lang.String.valueOf(e)), null, null, 6, null);
            return str;
        }
    }

    public static final java.lang.String formatToMonthDayYear(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        try {
            java.util.Date parse = new java.text.SimpleDateFormat("yyyy-MM-dd", java.util.Locale.US).parse(str);
            if (parse == null) {
                return str;
            }
            java.lang.String format = new java.text.SimpleDateFormat("MM/dd/yy", java.util.Locale.US).format(parse);
            kotlin.jvm.internal.Intrinsics.checkNotNull(format);
            return format;
        } catch (java.text.ParseException e) {
            com.paypal.android.logger.Logger.w$default(com.paypal.oslo.feature.debitcard.LoggerKt.log, "Failed to parse date string: ".concat(java.lang.String.valueOf(e)), null, null, 6, null);
            return str;
        }
    }
}
