package com.payair.hce;

/* loaded from: classes4.dex */
public abstract class setTextSelectHandleLeft implements com.payair.hce.setElegantTextHeight, com.payair.hce.setTextMetricsParams {
    private static int DigitizedCardProfile = 1;
    private static int valueOf;

    public static /* synthetic */ java.lang.Object DigitizedCardProfile(java.lang.Object[] objArr, int i, int i2, int i3) {
        return DigitizedCardProfile(objArr);
    }

    private static /* synthetic */ java.lang.Object DigitizedCardProfile(java.lang.Object[] objArr) {
        int i = valueOf;
        int i2 = i ^ 121;
        int i3 = -(-((i & 121) << 1));
        int i4 = (i2 & i3) + (i3 | i2);
        DigitizedCardProfile = i4 % 128;
        if (i4 % 2 == 0) {
            com.payair.hce.setSelection.getAid();
            throw null;
        }
        com.payair.hce.setSelection aid = com.payair.hce.setSelection.getAid();
        valueOf = (DigitizedCardProfile + 59) % 128;
        return aid;
    }

    @Override // com.payair.hce.setElegantTextHeight
    public java.lang.Boolean writeReplace() {
        int i = valueOf & 5;
        DigitizedCardProfile = ((((r0 | 5) & (~i)) - (~(i << 1))) - 1) % 128;
        java.lang.Boolean bool = java.lang.Boolean.FALSE;
        int i2 = valueOf;
        int i3 = i2 ^ 25;
        int i4 = (((i2 & 25) | i3) << 1) - i3;
        DigitizedCardProfile = i4 % 128;
        if (i4 % 2 != 0) {
            return bool;
        }
        throw null;
    }

    public static com.payair.hce.setSelection DigitizedCardProfile() {
        return (com.payair.hce.setSelection) DigitizedCardProfile(new java.lang.Object[0], 1993028063, -1993028063, (int) java.lang.System.currentTimeMillis());
    }
}
