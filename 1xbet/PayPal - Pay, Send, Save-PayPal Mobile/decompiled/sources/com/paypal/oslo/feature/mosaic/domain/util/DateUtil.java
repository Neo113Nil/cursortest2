package com.paypal.oslo.feature.mosaic.domain.util;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\u000b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0004¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\r\u001a\u00020\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u001d\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u0004¢\u0006\u0004\b\u0013\u0010\u0014"}, d2 = {"Lcom/paypal/oslo/feature/mosaic/domain/util/DateUtil;", "", "<init>", "()V", "", "text", "format", "Ljava/time/LocalDate;", "parseDate", "(Ljava/lang/String;Ljava/lang/String;)Ljava/time/LocalDate;", com.daon.sdk.face.license.License.FEATURE_MASK, "convertMaskToDateFormat", "(Ljava/lang/String;)Ljava/lang/String;", "from", "", "calculateAge", "(Ljava/time/LocalDate;)Ljava/lang/Integer;", "digits", "dateFormat", "formatDigitsToDatePattern", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class DateUtil {
    public static final int $stable = 0;
    public static final com.paypal.oslo.feature.mosaic.domain.util.DateUtil INSTANCE = new com.paypal.oslo.feature.mosaic.domain.util.DateUtil();

    private DateUtil() {
    }

    public final java.time.LocalDate parseDate(java.lang.String text, java.lang.String format) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(text, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(format, "");
        try {
            return java.time.LocalDate.parse(text, java.time.format.DateTimeFormatter.ofPattern(convertMaskToDateFormat(format)));
        } catch (java.time.DateTimeException e) {
            com.paypal.android.logger.Logger.e$default(com.paypal.oslo.feature.mosaic.LoggerKt.log, "Failed to parse date", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("error", e.getMessage())), null, null, 12, null);
            return null;
        }
    }

    public final java.lang.String convertMaskToDateFormat(java.lang.String mask) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mask, "");
        return kotlin.text.StringsKt.replace$default(kotlin.text.StringsKt.replace$default(kotlin.text.StringsKt.replace$default(mask, "YYYY", com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.DateTimeFormatConstants.KEY_YEAR_FORMAT, false, 4, (java.lang.Object) null), "mm", "MM", false, 4, (java.lang.Object) null), "DD", "dd", false, 4, (java.lang.Object) null);
    }

    public final java.lang.Integer calculateAge(java.time.LocalDate from) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(from, "");
        try {
            return java.lang.Integer.valueOf(java.time.Period.between(from, java.time.LocalDate.now()).getYears());
        } catch (java.time.DateTimeException e) {
            com.paypal.android.logger.Logger.e$default(com.paypal.oslo.feature.mosaic.LoggerKt.log, "Failed to calculate Age", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("error", e.getMessage())), null, null, 12, null);
            return null;
        }
    }

    public final java.lang.String formatDigitsToDatePattern(java.lang.String digits, java.lang.String dateFormat) {
        java.lang.String str = "";
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(digits, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dateFormat, "");
        int length = dateFormat.length();
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            char charAt = dateFormat.charAt(i2);
            if (i >= digits.length()) {
                break;
            }
            if (java.lang.Character.isLetter(charAt)) {
                char charAt2 = digits.charAt(i);
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                sb.append(str);
                sb.append(charAt2);
                str = sb.toString();
                i++;
            } else {
                java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
                sb2.append(str);
                sb2.append(charAt);
                str = sb2.toString();
            }
        }
        return str;
    }
}
