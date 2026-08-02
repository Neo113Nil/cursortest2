package com.paypal.oslo.feature.wallet.fifo.common.util;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0010\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"", "", "isPositiveDouble", "(Ljava/lang/String;)Z"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class TransferAmountValidatorKt {
    public static final boolean isPositiveDouble(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        java.lang.Double doubleOrNull = kotlin.text.StringsKt.toDoubleOrNull(str);
        return doubleOrNull != null && doubleOrNull.doubleValue() > 0.0d;
    }
}
