package com.payair.hce;

/* loaded from: classes4.dex */
public final class setTextScaleX extends com.payair.hce.setTextSelectHandleLeft {
    private static int AlternateContactlessPaymentDataJson = 0;
    private static int values = 1;

    public static /* synthetic */ java.lang.Object AlternateContactlessPaymentDataJson(java.lang.Object[] objArr, int i, int i2, int i3) {
        java.lang.Object obj = objArr[1];
        int i4 = AlternateContactlessPaymentDataJson;
        int i5 = i4 & 107;
        int i6 = ((i4 ^ 107) | i5) << 1;
        int i7 = -((i4 | 107) & (~i5));
        values = ((i6 ^ i7) + ((i7 & i6) << 1)) % 128;
        com.payair.hce.setGroupIndicator IccPrivateKeyCrtComponentsJson = DigitizedCardProfile().IccPrivateKeyCrtComponentsJson();
        values = (AlternateContactlessPaymentDataJson + 11) % 128;
        for (java.lang.Object obj2 : (java.lang.Iterable) obj) {
            int i8 = AlternateContactlessPaymentDataJson;
            values = (((i8 & 70) + (i8 | 70)) - 1) % 128;
            if (!((java.lang.Boolean) com.payair.hce.setGroupIndicator.AlternateContactlessPaymentDataJson(new java.lang.Object[]{IccPrivateKeyCrtComponentsJson}, 1811763571, -1811763570, java.lang.System.identityHashCode(IccPrivateKeyCrtComponentsJson))).booleanValue()) {
                AlternateContactlessPaymentDataJson = (values + 79) % 128;
                com.payair.hce.setSelection DigitizedCardProfile = DigitizedCardProfile();
                com.payair.hce.setSelection.DigitizedCardProfile(new java.lang.Object[]{DigitizedCardProfile}, -944109026, 944109029, java.lang.System.identityHashCode(DigitizedCardProfile));
                int i9 = AlternateContactlessPaymentDataJson;
                int i10 = i9 & 117;
                int i11 = (i9 | 117) & (~i10);
                int i12 = i10 << 1;
                values = (((i11 | i12) << 1) - (i11 ^ i12)) % 128;
            }
            com.payair.hce.setGroupIndicator.AlternateContactlessPaymentDataJson(new java.lang.Object[]{IccPrivateKeyCrtComponentsJson}, 1431129342, -1431129340, java.lang.System.identityHashCode(IccPrivateKeyCrtComponentsJson));
            DigitizedCardProfile().AlternateContactlessPaymentDataJson(obj2);
            int i13 = AlternateContactlessPaymentDataJson;
            int i14 = (i13 | 3) << 1;
            int i15 = -((i13 & (-4)) | ((~i13) & 3));
            int i16 = ((i14 | i15) << 1) - (i15 ^ i14);
            values = i16 % 128;
            if (i16 % 2 == 0) {
                int i17 = 4 / 2;
            }
        }
        DigitizedCardProfile().getProfileVersion();
        int i18 = AlternateContactlessPaymentDataJson;
        int i19 = i18 & 23;
        int i20 = -(-((i18 ^ 23) | i19));
        values = (((i19 | i20) << 1) - (i20 ^ i19)) % 128;
        return null;
    }

    @Override // com.payair.hce.setTextMetricsParams
    public final void AlternateContactlessPaymentDataJson(java.lang.Object obj) {
        AlternateContactlessPaymentDataJson(new java.lang.Object[]{this, obj}, 1768159902, -1768159902, java.lang.System.identityHashCode(this));
    }
}
