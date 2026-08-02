package com.payair.hce;

/* loaded from: classes4.dex */
public final class setTitleMarginTop extends com.payair.hce.setEms {
    private static int AlternateContactlessPaymentDataJson = 1;
    private static int DigitizedCardProfile;
    private byte[] values;

    public static /* synthetic */ java.lang.Object AlternateContactlessPaymentDataJson(java.lang.Object[] objArr, int i, int i2, int i3) {
        int i4 = ~i;
        int i5 = ~i3;
        int i6 = i4 | i5;
        int i7 = ~i2;
        int i8 = i5 | i7;
        switch ((i * (-183)) + (i2 * (-183)) + (((~(i6 | i2)) | (~(i8 | i))) * (-184)) + (((~i8) | (~(i4 | i7)) | (~i6)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_PINWHEEL_TEXT_VALUE) + ((i | i2) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_PINWHEEL_TEXT_VALUE)) {
            case 1:
                com.payair.hce.setTitleMarginTop settitlemargintop = (com.payair.hce.setTitleMarginTop) objArr[0];
                int i9 = AlternateContactlessPaymentDataJson;
                int i10 = i9 & 57;
                int i11 = ((i9 ^ 57) | i10) << 1;
                int i12 = -((i9 | 57) & (~i10));
                DigitizedCardProfile = ((i11 & i12) + (i12 | i11)) % 128;
                int AlternateContactlessPaymentDataJson2 = com.payair.hce.getClientVersion.AlternateContactlessPaymentDataJson(settitlemargintop.values);
                int i13 = DigitizedCardProfile;
                int i14 = i13 & 21;
                int i15 = (i13 ^ 21) | i14;
                AlternateContactlessPaymentDataJson = (((i14 | i15) << 1) - (i15 ^ i14)) % 128;
                return java.lang.Integer.valueOf(AlternateContactlessPaymentDataJson2);
            case 2:
                return DigitizedCardProfile(objArr);
            case 3:
                com.payair.hce.setTitleMarginTop settitlemargintop2 = (com.payair.hce.setTitleMarginTop) objArr[0];
                int i16 = DigitizedCardProfile;
                int i17 = i16 & 111;
                int i18 = ((i16 ^ 111) | i17) << 1;
                int i19 = -((i16 | 111) & (~i17));
                AlternateContactlessPaymentDataJson = (((i18 | i19) << 1) - (i19 ^ i18)) % 128;
                int length = settitlemargintop2.values.length;
                int intValue = ((java.lang.Integer) com.payair.hce.setNavigationIcon.DigitizedCardProfile(new java.lang.Object[]{java.lang.Integer.valueOf(length)}, -1174070258, 1174070259, length)).intValue();
                int identityHashCode = java.lang.System.identityHashCode(settitlemargintop2);
                int i20 = (intValue * 677) - 675;
                int i21 = intValue & identityHashCode;
                int i22 = (~i21) & (intValue | identityHashCode);
                int i23 = (i21 ^ i22) | (i21 & i22);
                int i24 = i23 ^ (-2);
                int i25 = i23 & (-2);
                int i26 = -(-(((i25 ^ i24) | (i25 & i24)) * (-676)));
                int i27 = i20 & i26;
                int i28 = intValue & (-2);
                int i29 = (~i28) & (intValue | (-2));
                int i30 = ~intValue;
                int i31 = ~((i28 ^ i29) | (i28 & i29));
                int i32 = ~identityHashCode;
                int i33 = ~i32;
                int i34 = (i32 & i30) | (i33 & intValue);
                int i35 = i32 & intValue;
                int i36 = ~((i34 ^ i35) | (i34 & i35));
                int i37 = i31 & i36;
                int i38 = ((((i20 | i26) & (~i27)) + (i27 << 1)) - (~(-(~(-(-((((i31 | i36) & (~i37)) | i37) * 676))))))) - 2;
                int i39 = (i30 | intValue) & i30;
                int i40 = (i39 & 1) | ((~i39) & (-2));
                int i41 = i39 & (-2);
                int i42 = (i41 ^ i40) | (i41 & i40);
                int i43 = ~i42;
                int i44 = (i42 | i43) & i43;
                int i45 = (i33 & (-2)) | (i32 & 1);
                int i46 = i32 & (-2);
                int i47 = ~((i45 ^ i46) | (i46 & i45));
                int i48 = i44 ^ i47;
                int i49 = i44 & i47;
                int i50 = (i49 ^ i48) | (i49 & i48);
                int i51 = (intValue ^ 1) | (intValue & 1);
                int i52 = (i51 ^ identityHashCode) | (i51 & identityHashCode);
                int i53 = ~i52;
                int i54 = (i52 | i53) & i53;
                int i55 = ((~i54) & i50) | ((~i50) & i54);
                int i56 = i54 & i50;
                int i57 = -(-(((i56 ^ i55) | (i56 & i55)) * 676));
                int i58 = (((i38 | i57) << 1) - (~(-(i57 ^ i38)))) - 1;
                int length2 = settitlemargintop2.values.length;
                int i59 = i58 | length2;
                int i60 = i59 << 1;
                int i61 = -((~(length2 & i58)) & i59);
                int i62 = AlternateContactlessPaymentDataJson;
                int i63 = i62 & 47;
                DigitizedCardProfile = ((((i62 ^ 47) | i63) << 1) - ((i62 | 47) & (~i63))) % 128;
                return java.lang.Integer.valueOf((i60 ^ i61) + ((i61 & i60) << 1));
            case 4:
                return values(objArr);
            case 5:
                return writeReplace(objArr);
            case 6:
                com.payair.hce.setTitleMarginTop settitlemargintop3 = (com.payair.hce.setTitleMarginTop) objArr[0];
                com.payair.hce.setEms setems = (com.payair.hce.setEms) objArr[1];
                int i64 = (DigitizedCardProfile + 5) % 128;
                AlternateContactlessPaymentDataJson = i64;
                if (!(setems instanceof com.payair.hce.setTitleMarginTop)) {
                    DigitizedCardProfile = (i64 + 87) % 128;
                    return java.lang.Boolean.FALSE;
                }
                boolean AlternateContactlessPaymentDataJson3 = com.payair.hce.getClientVersion.AlternateContactlessPaymentDataJson(settitlemargintop3.values, ((com.payair.hce.setTitleMarginTop) setems).values);
                int i65 = AlternateContactlessPaymentDataJson;
                DigitizedCardProfile = ((i65 ^ 85) + ((i65 & 85) << 1)) % 128;
                return java.lang.Boolean.valueOf(AlternateContactlessPaymentDataJson3);
            default:
                int i66 = DigitizedCardProfile;
                int i67 = ((i66 & 101) - (~(i66 | 101))) - 1;
                AlternateContactlessPaymentDataJson = i67 % 128;
                return java.lang.Boolean.valueOf(i67 % 2 == 0);
        }
    }

    public setTitleMarginTop(byte[] bArr) {
        this.values = com.payair.hce.getClientVersion.values(bArr);
    }

    private static /* synthetic */ java.lang.Object values(java.lang.Object[] objArr) {
        com.payair.hce.setTitleMarginTop settitlemargintop = (com.payair.hce.setTitleMarginTop) objArr[0];
        int i = AlternateContactlessPaymentDataJson;
        int i2 = ((i ^ 116) + ((i & 116) << 1)) - 1;
        DigitizedCardProfile = i2 % 128;
        byte[] bArr = settitlemargintop.values;
        if (i2 % 2 != 0) {
            com.payair.hce.isGooglePlayServicesUid.DigitizedCardProfile(bArr);
            throw new java.lang.ArithmeticException();
        }
        java.lang.String DigitizedCardProfile2 = com.payair.hce.isGooglePlayServicesUid.DigitizedCardProfile(bArr);
        int i3 = DigitizedCardProfile;
        int i4 = i3 | 11;
        int i5 = i4 << 1;
        int i6 = -((~(i3 & 11)) & i4);
        AlternateContactlessPaymentDataJson = (((i5 | i6) << 1) - (i6 ^ i5)) % 128;
        return DigitizedCardProfile2;
    }

    private static /* synthetic */ java.lang.Object writeReplace(java.lang.Object[] objArr) {
        com.payair.hce.setTitleMarginTop settitlemargintop = (com.payair.hce.setTitleMarginTop) objArr[0];
        int i = AlternateContactlessPaymentDataJson;
        int i2 = i ^ 1;
        int i3 = ((i & 1) | i2) << 1;
        int i4 = -i2;
        int i5 = ((i3 | i4) << 1) - (i3 ^ i4);
        DigitizedCardProfile = i5 % 128;
        int i6 = i5 % 2;
        java.lang.String str = (java.lang.String) AlternateContactlessPaymentDataJson(new java.lang.Object[]{settitlemargintop}, 1238484213, -1238484209, java.lang.System.identityHashCode(settitlemargintop));
        if (i6 == 0) {
            return str;
        }
        throw null;
    }

    private static /* synthetic */ java.lang.Object DigitizedCardProfile(java.lang.Object[] objArr) {
        com.payair.hce.setTitleMarginTop settitlemargintop = (com.payair.hce.setTitleMarginTop) objArr[0];
        com.payair.hce.setMaxLines setmaxlines = (com.payair.hce.setMaxLines) objArr[1];
        int i = AlternateContactlessPaymentDataJson;
        DigitizedCardProfile = ((-2) - (~((i & 78) + (i | 78)))) % 128;
        setmaxlines.AlternateContactlessPaymentDataJson(20, settitlemargintop.values);
        int i2 = DigitizedCardProfile;
        int i3 = i2 | 15;
        int i4 = (i3 << 1) - ((~(i2 & 15)) & i3);
        AlternateContactlessPaymentDataJson = i4 % 128;
        if (i4 % 2 != 0) {
            return null;
        }
        throw null;
    }

    @Override // com.payair.hce.setGravity
    public final int hashCode() {
        return ((java.lang.Integer) AlternateContactlessPaymentDataJson(new java.lang.Object[]{this}, 2054055057, -2054055056, java.lang.System.identityHashCode(this))).intValue();
    }

    @Override // com.payair.hce.setEms
    final boolean AlternateContactlessPaymentDataJson(com.payair.hce.setEms setems) {
        return ((java.lang.Boolean) AlternateContactlessPaymentDataJson(new java.lang.Object[]{this, setems}, -2086670832, 2086670838, java.lang.System.identityHashCode(this))).booleanValue();
    }

    @Override // com.payair.hce.setEms
    final void values(com.payair.hce.setMaxLines setmaxlines) throws java.io.IOException {
        AlternateContactlessPaymentDataJson(new java.lang.Object[]{this, setmaxlines}, -1485508106, 1485508108, java.lang.System.identityHashCode(this));
    }

    @Override // com.payair.hce.setEms
    final int AlternateContactlessPaymentDataJson() {
        return ((java.lang.Integer) AlternateContactlessPaymentDataJson(new java.lang.Object[]{this}, 1087433182, -1087433179, java.lang.System.identityHashCode(this))).intValue();
    }

    @Override // com.payair.hce.setEms
    final boolean writeReplace() {
        return ((java.lang.Boolean) AlternateContactlessPaymentDataJson(new java.lang.Object[]{this}, 927021591, -927021591, java.lang.System.identityHashCode(this))).booleanValue();
    }

    public final java.lang.String toString() {
        return (java.lang.String) AlternateContactlessPaymentDataJson(new java.lang.Object[]{this}, 916108963, -916108958, java.lang.System.identityHashCode(this));
    }

    private java.lang.String valueOf() {
        return (java.lang.String) AlternateContactlessPaymentDataJson(new java.lang.Object[]{this}, 1238484213, -1238484209, java.lang.System.identityHashCode(this));
    }
}
