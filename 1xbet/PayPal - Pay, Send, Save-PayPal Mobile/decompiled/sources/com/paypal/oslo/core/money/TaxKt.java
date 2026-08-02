package com.paypal.oslo.core.money;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\u001a\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\"\u0014\u0010\u0005\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006"}, d2 = {"", "Lcom/paypal/oslo/core/money/Tax;", "asTaxOrNull", "(Ljava/lang/String;)Lcom/paypal/oslo/core/money/Tax;", "", "PercentMultiplier", com.visa.cbp.getEncExpo.warmup}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class TaxKt {
    public static final int PercentMultiplier = 100;

    public static final com.paypal.oslo.core.money.Tax asTaxOrNull(java.lang.String str) {
        java.lang.Double doubleOrNull;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        if (kotlin.text.StringsKt.isBlank(str) || (doubleOrNull = kotlin.text.StringsKt.toDoubleOrNull(str)) == null) {
            return null;
        }
        return new com.paypal.oslo.core.money.Tax(doubleOrNull.doubleValue() / 100.0d);
    }
}
