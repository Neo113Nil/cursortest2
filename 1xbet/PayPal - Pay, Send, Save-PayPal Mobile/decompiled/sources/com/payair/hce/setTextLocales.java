package com.payair.hce;

/* loaded from: classes4.dex */
public final class setTextLocales extends com.payair.hce.setTextSelectHandleLeft {
    private static int AlternateContactlessPaymentDataJson = 0;
    private static int writeReplace = 1;

    public static /* synthetic */ java.lang.Object values(java.lang.Object[] objArr, int i, int i2, int i3) {
        return DigitizedCardProfile(objArr);
    }

    private static /* synthetic */ java.lang.Object DigitizedCardProfile(java.lang.Object[] objArr) {
        java.lang.Object obj = objArr[1];
        int i = AlternateContactlessPaymentDataJson;
        int i2 = i ^ 51;
        int i3 = -(-((i & 51) << 1));
        writeReplace = ((i2 & i3) + (i3 | i2)) % 128;
        com.payair.hce.setSelection DigitizedCardProfile = DigitizedCardProfile();
        com.payair.hce.setSelection.DigitizedCardProfile(new java.lang.Object[]{DigitizedCardProfile, ((java.lang.Enum) obj).name()}, 1396003107, -1396003102, java.lang.System.identityHashCode(DigitizedCardProfile));
        int i4 = AlternateContactlessPaymentDataJson;
        int i5 = (i4 & 117) + (i4 | 117);
        writeReplace = i5 % 128;
        if (i5 % 2 != 0) {
            return null;
        }
        throw null;
    }

    @Override // com.payair.hce.setTextMetricsParams
    public final void AlternateContactlessPaymentDataJson(java.lang.Object obj) {
        values(new java.lang.Object[]{this, obj}, -1837566326, 1837566326, java.lang.System.identityHashCode(this));
    }
}
