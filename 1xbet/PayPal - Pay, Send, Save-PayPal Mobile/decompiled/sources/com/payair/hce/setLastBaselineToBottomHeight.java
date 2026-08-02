package com.payair.hce;

/* loaded from: classes4.dex */
public final class setLastBaselineToBottomHeight extends com.payair.hce.setTextSelectHandleLeft {
    private static int valueOf = 0;
    private static int writeReplace = 1;

    public static /* synthetic */ java.lang.Object AlternateContactlessPaymentDataJson(java.lang.Object[] objArr, int i, int i2, int i3) {
        return values(objArr);
    }

    private static /* synthetic */ java.lang.Object values(java.lang.Object[] objArr) {
        int i = 0;
        java.lang.Object obj = objArr[1];
        int i2 = valueOf + 120;
        writeReplace = ((~i2) + (i2 << 1)) % 128;
        com.payair.hce.setGroupIndicator IccPrivateKeyCrtComponentsJson = DigitizedCardProfile().IccPrivateKeyCrtComponentsJson();
        int length = java.lang.reflect.Array.getLength(obj);
        int i3 = writeReplace;
        int i4 = (i3 | 89) << 1;
        int i5 = -(i3 ^ 89);
        int i6 = (i4 & i5) + (i5 | i4);
        valueOf = i6 % 128;
        int i7 = i6 % 2;
        while (i < length) {
            int i8 = writeReplace;
            int i9 = i8 & 13;
            int i10 = -(-((i8 ^ 13) | i9));
            valueOf = ((i9 ^ i10) + ((i10 & i9) << 1)) % 128;
            if (!((java.lang.Boolean) com.payair.hce.setGroupIndicator.AlternateContactlessPaymentDataJson(new java.lang.Object[]{IccPrivateKeyCrtComponentsJson}, 1811763571, -1811763570, java.lang.System.identityHashCode(IccPrivateKeyCrtComponentsJson))).booleanValue()) {
                int i11 = writeReplace;
                valueOf = ((((i11 | 50) << 1) - (i11 ^ 50)) - 1) % 128;
                com.payair.hce.setSelection DigitizedCardProfile = DigitizedCardProfile();
                com.payair.hce.setSelection.DigitizedCardProfile(new java.lang.Object[]{DigitizedCardProfile}, -944109026, 944109029, java.lang.System.identityHashCode(DigitizedCardProfile));
                valueOf = (writeReplace + 53) % 128;
            }
            com.payair.hce.setGroupIndicator.AlternateContactlessPaymentDataJson(new java.lang.Object[]{IccPrivateKeyCrtComponentsJson}, 1431129342, -1431129340, java.lang.System.identityHashCode(IccPrivateKeyCrtComponentsJson));
            DigitizedCardProfile().AlternateContactlessPaymentDataJson(java.lang.reflect.Array.get(obj, i));
            int i12 = (-2) - (~(i - 112));
            int i13 = i12 & 114;
            int i14 = -(-((i12 ^ 114) | i13));
            i = ((i13 | i14) << 1) - (i14 ^ i13);
            int i15 = writeReplace;
            int i16 = ((i15 ^ 13) | (i15 & 13)) << 1;
            int i17 = -((i15 & (-14)) | ((~i15) & 13));
            valueOf = ((i16 & i17) + (i17 | i16)) % 128;
        }
        DigitizedCardProfile().getProfileVersion();
        int i18 = writeReplace;
        int i19 = i18 & 73;
        int i20 = (((i18 ^ 73) | i19) << 1) - ((i18 | 73) & (~i19));
        valueOf = i20 % 128;
        if (i20 % 2 == 0) {
            return null;
        }
        throw null;
    }

    @Override // com.payair.hce.setTextMetricsParams
    public final void AlternateContactlessPaymentDataJson(java.lang.Object obj) {
        AlternateContactlessPaymentDataJson(new java.lang.Object[]{this, obj}, -213591713, 213591713, java.lang.System.identityHashCode(this));
    }
}
