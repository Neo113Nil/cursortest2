package com.paypal.oslo.feature.wallet.cards.ui.scan;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a!\u0010\u0003\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\"\u0018\u0010\b\u001a\u0006*\u00020\u00050\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007"}, d2 = {"", "month", com.paypal.oslo.feature.taxanddocumentcenter.data.taxreports.mapper.StringResourceConstants.YEAR, "formatExpiryDate", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "Ljava/time/format/DateTimeFormatter;", "Camera2StreamConfigurationMap", "Ljava/time/format/DateTimeFormatter;", "getHighSpeedVideoFpsRanges"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class ExpiryDateUtilsKt {
    private static final java.time.format.DateTimeFormatter Camera2StreamConfigurationMap = java.time.format.DateTimeFormatter.ofPattern("MMyy");

    public static final java.lang.String formatExpiryDate(java.lang.String str, java.lang.String str2) {
        java.lang.Integer intOrNull;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        if (str.length() != 0 && str2.length() != 0 && (intOrNull = kotlin.text.StringsKt.toIntOrNull(str)) != null) {
            int intValue = intOrNull.intValue();
            java.lang.Integer intOrNull2 = kotlin.text.StringsKt.toIntOrNull(str2);
            if (intOrNull2 != null) {
                int intValue2 = intOrNull2.intValue();
                if (intValue != 0 && intValue2 != 0) {
                    int length = str2.length();
                    if (length == 2) {
                        intValue2 += 2000;
                    } else if (length != 4) {
                        return null;
                    }
                    try {
                        return java.time.YearMonth.of(intValue2, intValue).format(Camera2StreamConfigurationMap);
                    } catch (java.time.DateTimeException unused) {
                    }
                }
            }
        }
        return null;
    }
}
