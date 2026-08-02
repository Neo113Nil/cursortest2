package com.paypal.oslo.core.money;

/* loaded from: classes2.dex */
public final /* synthetic */ class Tax$$ExternalSyntheticBackportWithForwarding0 {
    public static /* synthetic */ java.math.BigDecimal m(java.math.BigDecimal bigDecimal) {
        return bigDecimal.signum() == 0 ? new java.math.BigDecimal(java.math.BigInteger.ZERO, 0) : bigDecimal.stripTrailingZeros();
    }
}
