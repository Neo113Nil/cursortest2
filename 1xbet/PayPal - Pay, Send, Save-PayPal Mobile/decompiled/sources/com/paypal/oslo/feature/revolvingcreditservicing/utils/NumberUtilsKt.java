package com.paypal.oslo.feature.revolvingcreditservicing.utils;

@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0015\u0010\u0005\u001a\u00020\u0000*\u0004\u0018\u00010\u0000H\u0000¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "amount", "", "isValidPositiveAmount", "(Ljava/lang/String;)Z", "toPercentage", "(Ljava/lang/String;)Ljava/lang/String;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class NumberUtilsKt {
    public static final boolean isValidPositiveAmount(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        java.math.BigDecimal bigDecimalOrNull = kotlin.text.StringsKt.toBigDecimalOrNull(str);
        return bigDecimalOrNull != null && bigDecimalOrNull.compareTo(java.math.BigDecimal.ZERO) > 0;
    }

    public static final java.lang.String toPercentage(java.lang.String str) {
        java.lang.String str2 = str;
        if (str2 == null || kotlin.text.StringsKt.isBlank(str2) || kotlin.text.StringsKt.toBigDecimalOrNull(str) == null) {
            return "";
        }
        java.lang.String plainString = com.paypal.oslo.core.money.Tax$$ExternalSyntheticBackportWithForwarding0.m(new java.math.BigDecimal(str)).toPlainString();
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(plainString);
        sb.append("%");
        return sb.toString();
    }
}
