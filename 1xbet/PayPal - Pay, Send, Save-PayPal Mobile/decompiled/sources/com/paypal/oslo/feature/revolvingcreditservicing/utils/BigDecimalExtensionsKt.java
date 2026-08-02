package com.paypal.oslo.feature.revolvingcreditservicing.utils;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0004\u001a\u00020\u0000*\u00020\u0001H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0013\u0010\u0006\u001a\u00020\u0001*\u00020\u0001H\u0000¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Ljava/math/BigDecimal;", "", "toCentsString", "(Ljava/math/BigDecimal;)Ljava/lang/String;", "centsStringToDollars", "(Ljava/lang/String;)Ljava/math/BigDecimal;", "toMoneyString", "(Ljava/lang/String;)Ljava/lang/String;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class BigDecimalExtensionsKt {
    public static final java.lang.String toCentsString(java.math.BigDecimal bigDecimal) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bigDecimal, "");
        java.lang.String plainString = com.paypal.oslo.core.money.Tax$$ExternalSyntheticBackportWithForwarding0.m(bigDecimal.multiply(new java.math.BigDecimal("100"))).toPlainString();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(plainString, "");
        return plainString;
    }

    public static final java.math.BigDecimal centsStringToDollars(java.lang.String str) {
        java.math.BigDecimal divide;
        java.math.BigDecimal scale;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        java.math.BigDecimal bigDecimalOrNull = kotlin.text.StringsKt.toBigDecimalOrNull(str);
        if (bigDecimalOrNull != null && (divide = bigDecimalOrNull.divide(new java.math.BigDecimal("100"))) != null && (scale = divide.setScale(2, java.math.RoundingMode.HALF_UP)) != null) {
            return scale;
        }
        java.math.BigDecimal bigDecimal = java.math.BigDecimal.ZERO;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(bigDecimal, "");
        return bigDecimal;
    }

    public static final java.lang.String toMoneyString(java.lang.String str) {
        java.math.BigDecimal scale;
        java.lang.String plainString;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        java.math.BigDecimal bigDecimalOrNull = kotlin.text.StringsKt.toBigDecimalOrNull(str);
        return (bigDecimalOrNull == null || (scale = bigDecimalOrNull.setScale(2, java.math.RoundingMode.HALF_UP)) == null || (plainString = scale.toPlainString()) == null) ? "0.00" : plainString;
    }
}
