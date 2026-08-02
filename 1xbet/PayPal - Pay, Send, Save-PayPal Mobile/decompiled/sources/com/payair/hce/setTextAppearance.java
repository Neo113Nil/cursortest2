package com.payair.hce;

/* loaded from: classes4.dex */
public final class setTextAppearance extends com.payair.hce.setTextSelectHandleLeft {
    private static int valueOf = 1;
    private static int writeReplace;

    public static /* synthetic */ java.lang.Object AlternateContactlessPaymentDataJson(java.lang.Object[] objArr, int i, int i2, int i3) {
        java.lang.Object obj = objArr[1];
        int i4 = writeReplace;
        int i5 = i4 & 53;
        valueOf = (((((i4 ^ 53) | i5) << 1) - (~(-((i4 | 53) & (~i5))))) - 1) % 128;
        com.payair.hce.setSelection DigitizedCardProfile = DigitizedCardProfile();
        com.payair.hce.setSelection.DigitizedCardProfile(new java.lang.Object[]{DigitizedCardProfile, obj.toString()}, 1396003107, -1396003102, java.lang.System.identityHashCode(DigitizedCardProfile));
        valueOf = (writeReplace + 73) % 128;
        return null;
    }

    @Override // com.payair.hce.setTextMetricsParams
    public final void AlternateContactlessPaymentDataJson(java.lang.Object obj) {
        AlternateContactlessPaymentDataJson(new java.lang.Object[]{this, obj}, 575748913, -575748913, java.lang.System.identityHashCode(this));
    }
}
