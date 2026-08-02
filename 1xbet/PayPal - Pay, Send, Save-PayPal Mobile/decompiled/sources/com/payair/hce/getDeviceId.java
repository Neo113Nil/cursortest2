package com.payair.hce;

/* loaded from: classes4.dex */
public final class getDeviceId extends com.payair.hce.setTextSelectHandleLeft {
    private static int valueOf = 0;
    private static int values = 1;

    public static /* synthetic */ java.lang.Object writeReplace(java.lang.Object[] objArr, int i, int i2, int i3) {
        int i4 = ~i2;
        int i5 = ~((~i3) | i | i2);
        return ((((i * 471) + (i2 * 471)) + ((i2 | i) * (-470))) + ((((~((~i) | i4)) | (~(i4 | i3))) | i5) * (-470))) + (((~((i | i4) | i3)) | i5) * 470) != 1 ? writeReplace(objArr) : valueOf(objArr);
    }

    private static /* synthetic */ java.lang.Object valueOf(java.lang.Object[] objArr) {
        java.lang.Object obj = objArr[1];
        int i = valueOf;
        int i2 = ((i & com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) - (~(-(-(i | com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE))))) - 1;
        values = i2 % 128;
        if (i2 % 2 != 0) {
            return null;
        }
        throw null;
    }

    private static /* synthetic */ java.lang.Object writeReplace(java.lang.Object[] objArr) {
        int i = valueOf;
        int i2 = i ^ 103;
        int i3 = -(-((i & 103) << 1));
        int i4 = ((i2 | i3) << 1) - (i3 ^ i2);
        values = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
        java.lang.Boolean bool = java.lang.Boolean.TRUE;
        int i5 = valueOf;
        int i6 = i5 & 7;
        int i7 = (i5 | 7) & (~i6);
        int i8 = -(-(i6 << 1));
        values = (((i7 | i8) << 1) - (i7 ^ i8)) % 128;
        return bool;
    }

    @Override // com.payair.hce.setTextSelectHandleLeft, com.payair.hce.setElegantTextHeight
    public final java.lang.Boolean writeReplace() {
        return (java.lang.Boolean) writeReplace(new java.lang.Object[]{this}, 1053518393, -1053518393, java.lang.System.identityHashCode(this));
    }

    @Override // com.payair.hce.setTextMetricsParams
    public final void AlternateContactlessPaymentDataJson(java.lang.Object obj) {
        writeReplace(new java.lang.Object[]{this, obj}, -1785804943, 1785804944, java.lang.System.identityHashCode(this));
    }
}
