package com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0015\u0010\u0002\u001a\u00020\u0001*\u0004\u0018\u00010\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"", "Ljava/math/BigDecimal;", "toBigDecimalFromCurrency", "(Ljava/lang/String;)Ljava/math/BigDecimal;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class CurrencyAmountKt {
    public static final java.math.BigDecimal toBigDecimalFromCurrency(java.lang.String str) {
        if (str == null) {
            java.math.BigDecimal bigDecimal = java.math.BigDecimal.ZERO;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(bigDecimal, "");
            return bigDecimal;
        }
        java.lang.String obj = kotlin.text.StringsKt.trim(str).toString();
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        int length = obj.length();
        for (int i = 0; i < length; i++) {
            char charAt = obj.charAt(i);
            if (java.lang.Character.isDigit(charAt) || charAt == '.' || charAt == '-') {
                sb.append(charAt);
            }
        }
        java.math.BigDecimal bigDecimalOrNull = kotlin.text.StringsKt.toBigDecimalOrNull(sb.toString());
        if (bigDecimalOrNull != null) {
            return bigDecimalOrNull;
        }
        java.math.BigDecimal bigDecimal2 = java.math.BigDecimal.ZERO;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(bigDecimal2, "");
        return bigDecimal2;
    }
}
