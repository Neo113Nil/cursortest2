package com.paypal.oslo.feature.home.data.accountsnapshot;

@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u001a\u0017\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0017\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0002\u0010\u0005"}, d2 = {"", "amount", "formatAmount", "(Ljava/lang/String;)Ljava/lang/String;", "Ljava/math/BigDecimal;", "(Ljava/math/BigDecimal;)Ljava/lang/String;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class MoneyUtilsKt {
    public static final java.lang.String formatAmount(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        java.math.BigDecimal bigDecimalOrNull = kotlin.text.StringsKt.toBigDecimalOrNull(str);
        return bigDecimalOrNull == null ? "" : formatAmount(bigDecimalOrNull);
    }

    public static final java.lang.String formatAmount(java.math.BigDecimal bigDecimal) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bigDecimal, "");
        java.lang.String format = java.text.NumberFormat.getCurrencyInstance(java.util.Locale.US).format(bigDecimal);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(format, "");
        return format;
    }
}
