package com.paypal.oslo.feature.p2p.ui.utils;

@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u001a\u0015\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "amount", "", "isValidPositiveAmount", "(Ljava/lang/String;)Z"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class AmountValidationKt {
    public static final boolean isValidPositiveAmount(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        java.lang.Double doubleOrNull = kotlin.text.StringsKt.toDoubleOrNull(str);
        return (doubleOrNull != null ? doubleOrNull.doubleValue() : 0.0d) > 0.0d;
    }
}
