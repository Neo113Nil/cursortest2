package com.payair.hce;

/* loaded from: classes4.dex */
public final class setHyphenationFrequency extends com.payair.hce.setTextSelectHandleLeft {
    private static int AlternateContactlessPaymentDataJson = 1;
    private static int writeReplace;

    public static /* synthetic */ java.lang.Object values(java.lang.Object[] objArr, int i, int i2, int i3) {
        return writeReplace(objArr);
    }

    private static /* synthetic */ java.lang.Object writeReplace(java.lang.Object[] objArr) {
        java.lang.Object obj = objArr[1];
        int i = AlternateContactlessPaymentDataJson + 79;
        writeReplace = i % 128;
        if (i % 2 == 0) {
            com.payair.hce.setSelection DigitizedCardProfile = DigitizedCardProfile();
            com.payair.hce.setSelection.DigitizedCardProfile(new java.lang.Object[]{DigitizedCardProfile, (java.lang.String) obj}, 1396003107, -1396003102, java.lang.System.identityHashCode(DigitizedCardProfile));
            int i2 = writeReplace;
            int i3 = i2 & 117;
            int i4 = -(-(i2 | 117));
            AlternateContactlessPaymentDataJson = (((i3 | i4) << 1) - (i4 ^ i3)) % 128;
            return null;
        }
        com.payair.hce.setSelection DigitizedCardProfile2 = DigitizedCardProfile();
        com.payair.hce.setSelection.DigitizedCardProfile(new java.lang.Object[]{DigitizedCardProfile2, (java.lang.String) obj}, 1396003107, -1396003102, java.lang.System.identityHashCode(DigitizedCardProfile2));
        throw new java.lang.ArithmeticException();
    }

    @Override // com.payair.hce.setTextMetricsParams
    public final void AlternateContactlessPaymentDataJson(java.lang.Object obj) {
        values(new java.lang.Object[]{this, obj}, 1823051434, -1823051434, java.lang.System.identityHashCode(this));
    }
}
