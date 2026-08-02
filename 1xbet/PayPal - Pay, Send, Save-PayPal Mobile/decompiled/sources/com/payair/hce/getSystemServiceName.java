package com.payair.hce;

/* loaded from: classes4.dex */
public final class getSystemServiceName extends com.payair.hce.setTextSelectHandleLeft {
    private static int AlternateContactlessPaymentDataJson = 0;
    private static int values = 1;

    public static /* synthetic */ java.lang.Object values(java.lang.Object[] objArr, int i, int i2, int i3) {
        int i4 = ~i;
        int i5 = ~i2;
        int i6 = ~(i | i3);
        return ((((i * 881) + (i2 * 881)) + ((((~(i5 | i4)) | (~(i4 | i3))) | (~(i5 | i3))) * (-880))) + (((i2 | (~((~i3) | i4))) | i6) * (-880))) + (i6 * 880) != 1 ? values(objArr) : writeReplace(objArr);
    }

    private static /* synthetic */ java.lang.Object values(java.lang.Object[] objArr) {
        java.lang.Object obj = objArr[1];
        int i = values;
        int i2 = i & 97;
        int i3 = (i | 97) & (~i2);
        int i4 = -(-(i2 << 1));
        int i5 = (i3 & i4) + (i3 | i4);
        AlternateContactlessPaymentDataJson = i5 % 128;
        if (i5 % 2 == 0) {
            return null;
        }
        throw null;
    }

    private static /* synthetic */ java.lang.Object writeReplace(java.lang.Object[] objArr) {
        int i = values;
        int i2 = (i & (-70)) | ((~i) & 69);
        int i3 = -(-((i & 69) << 1));
        int i4 = ((i2 | i3) << 1) - (i3 ^ i2);
        AlternateContactlessPaymentDataJson = i4 % 128;
        java.lang.Boolean bool = java.lang.Boolean.TRUE;
        if (i4 % 2 == 0) {
            return bool;
        }
        throw null;
    }

    @Override // com.payair.hce.setTextSelectHandleLeft, com.payair.hce.setElegantTextHeight
    public final java.lang.Boolean writeReplace() {
        return (java.lang.Boolean) values(new java.lang.Object[]{this}, 225810043, -225810042, java.lang.System.identityHashCode(this));
    }

    @Override // com.payair.hce.setTextMetricsParams
    public final void AlternateContactlessPaymentDataJson(java.lang.Object obj) {
        values(new java.lang.Object[]{this, obj}, 1044387888, -1044387888, java.lang.System.identityHashCode(this));
    }
}
