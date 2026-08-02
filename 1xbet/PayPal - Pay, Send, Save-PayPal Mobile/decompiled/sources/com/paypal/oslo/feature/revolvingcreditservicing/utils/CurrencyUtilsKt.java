package com.paypal.oslo.feature.revolvingcreditservicing.utils;

@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "currencyString", "Ljava/math/BigDecimal;", "parseCurrencyString", "(Ljava/lang/String;)Ljava/math/BigDecimal;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class CurrencyUtilsKt {
    public static final java.math.BigDecimal parseCurrencyString(java.lang.String str) {
        java.math.BigDecimal negate;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        java.lang.String str2 = str;
        boolean startsWith$default = kotlin.text.StringsKt.startsWith$default(kotlin.text.StringsKt.trim(str2).toString(), "-", false, 2, (java.lang.Object) null);
        java.lang.String replace = new kotlin.text.Regex("[^0-9.]").replace(str2, "");
        try {
            if (replace.length() == 0) {
                negate = java.math.BigDecimal.ZERO;
            } else {
                java.math.BigDecimal bigDecimal = new java.math.BigDecimal(replace);
                negate = startsWith$default ? bigDecimal.negate() : bigDecimal;
            }
            kotlin.jvm.internal.Intrinsics.checkNotNull(negate);
            return negate;
        } catch (java.lang.NumberFormatException unused) {
            java.math.BigDecimal bigDecimal2 = java.math.BigDecimal.ZERO;
            kotlin.jvm.internal.Intrinsics.checkNotNull(bigDecimal2);
            return bigDecimal2;
        }
    }
}
