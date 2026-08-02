package com.payair.hce;

/* loaded from: classes4.dex */
final class setVerticalFadingEdgeEnabled extends com.payair.hce.setTouchDelegate {
    private static int AlternateContactlessPaymentDataJson = 0;
    private static int DigitizedCardProfile = 1;

    public static /* synthetic */ java.lang.Object values(java.lang.Object[] objArr, int i, int i2, int i3) {
        return AlternateContactlessPaymentDataJson(objArr);
    }

    setVerticalFadingEdgeEnabled(android.content.Context context) {
        super(context, false);
    }

    private static /* synthetic */ java.lang.Object AlternateContactlessPaymentDataJson(java.lang.Object[] objArr) {
        java.lang.Boolean bool = java.lang.Boolean.FALSE;
        com.payair.hce.setVerticalFadingEdgeEnabled setverticalfadingedgeenabled = (com.payair.hce.setVerticalFadingEdgeEnabled) objArr[0];
        int i = AlternateContactlessPaymentDataJson;
        int i2 = i & 49;
        int i3 = (i ^ 49) | i2;
        DigitizedCardProfile = (((i2 | i3) << 1) - (i3 ^ i2)) % 128;
        if (!super.values()) {
            int i4 = (AlternateContactlessPaymentDataJson + 85) % 128;
            DigitizedCardProfile = i4;
            int i5 = i4 & com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE;
            AlternateContactlessPaymentDataJson = (((((i4 ^ com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) | i5) << 1) - (~(-((i4 | com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) & (~i5))))) - 1) % 128;
            return bool;
        }
        com.payair.hce.setPreferKeepClear setpreferkeepclear = (com.payair.hce.setPreferKeepClear) com.payair.hce.setIsHandwritingDelegate.AlternateContactlessPaymentDataJson(new java.lang.Object[0], -1657390037, 1657390053, (int) java.lang.System.currentTimeMillis());
        if (setpreferkeepclear == null) {
            int i6 = AlternateContactlessPaymentDataJson;
            DigitizedCardProfile = ((i6 ^ 73) + ((i6 & 73) << 1)) % 128;
            return bool;
        }
        if (((com.payair.hce.sendRequest) com.payair.hce.setPreferKeepClear.DigitizedCardProfile(new java.lang.Object[]{setpreferkeepclear}, 1132877524, -1132877522, java.lang.System.identityHashCode(setpreferkeepclear))) == null) {
            int i7 = DigitizedCardProfile;
            int i8 = ((i7 & 54) + (i7 | 54)) - 1;
            AlternateContactlessPaymentDataJson = i8 % 128;
            if (i8 % 2 != 0) {
                com.payair.hce.setPreferKeepClear setpreferkeepclear2 = (com.payair.hce.setPreferKeepClear) com.payair.hce.setIsHandwritingDelegate.AlternateContactlessPaymentDataJson(new java.lang.Object[0], -1657390037, 1657390053, (int) java.lang.System.currentTimeMillis());
                android.text.TextUtils.isEmpty((java.lang.String) com.payair.hce.setPreferKeepClear.DigitizedCardProfile(new java.lang.Object[]{setpreferkeepclear2}, -1463023114, 1463023119, java.lang.System.identityHashCode(setpreferkeepclear2)));
                throw null;
            }
            com.payair.hce.setPreferKeepClear setpreferkeepclear3 = (com.payair.hce.setPreferKeepClear) com.payair.hce.setIsHandwritingDelegate.AlternateContactlessPaymentDataJson(new java.lang.Object[0], -1657390037, 1657390053, (int) java.lang.System.currentTimeMillis());
            if (android.text.TextUtils.isEmpty((java.lang.String) com.payair.hce.setPreferKeepClear.DigitizedCardProfile(new java.lang.Object[]{setpreferkeepclear3}, -1463023114, 1463023119, java.lang.System.identityHashCode(setpreferkeepclear3)))) {
                int i9 = AlternateContactlessPaymentDataJson;
                int i10 = i9 & 3;
                int i11 = (i9 ^ 3) | i10;
                int i12 = ((i10 | i11) << 1) - (i11 ^ i10);
                DigitizedCardProfile = i12 % 128;
                if (i12 % 2 != 0) {
                    return bool;
                }
                throw null;
            }
        }
        int i13 = DigitizedCardProfile;
        int i14 = i13 & 67;
        int i15 = ((i13 ^ 67) | i14) << 1;
        int i16 = -((i13 | 67) & (~i14));
        int i17 = ((i15 | i16) << 1) - (i16 ^ i15);
        AlternateContactlessPaymentDataJson = i17 % 128;
        if (i17 % 2 == 0) {
            return java.lang.Boolean.TRUE;
        }
        throw new java.lang.ArithmeticException();
    }

    @Override // com.payair.hce.setTouchDelegate, com.payair.hce.setUpMCBP
    public final boolean values() {
        return ((java.lang.Boolean) values(new java.lang.Object[]{this}, -920590084, 920590084, java.lang.System.identityHashCode(this))).booleanValue();
    }
}
