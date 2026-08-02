package com.payair.hce;

/* loaded from: classes4.dex */
public final class setTitleMarginStart extends com.payair.hce.setFocusedSearchResultIndex {
    private static int AlternateContactlessPaymentDataJson = 0;
    private static int getProfileVersion = 21;

    public static /* synthetic */ java.lang.Object DigitizedCardProfile(java.lang.Object[] objArr, int i, int i2, int i3) {
        int i4 = ~i;
        int i5 = ~i3;
        int i6 = ~(i | i2);
        int i7 = (~i2) | i4;
        int i8 = (i * (-716)) + (i2 * 1435) + ((i4 | i2) * (-1434)) + (((~(i5 | i2)) | i6 | (~(i7 | i3))) * 717) + (((~(i2 | i3)) | (~(i7 | i5)) | i6) * 717);
        return i8 != 1 ? i8 != 2 ? valueOf(objArr) : values(objArr) : AlternateContactlessPaymentDataJson(objArr);
    }

    static {
        int i = 21 % 2;
    }

    public setTitleMarginStart(boolean z, int i, com.payair.hce.setShadowLayer setshadowlayer) {
        super(z, i, setshadowlayer);
    }

    private static /* synthetic */ java.lang.Object values(java.lang.Object[] objArr) {
        com.payair.hce.setTitleMarginStart settitlemarginstart = (com.payair.hce.setTitleMarginStart) objArr[0];
        int i = AlternateContactlessPaymentDataJson;
        int i2 = (i & (-64)) | ((~i) & 63);
        int i3 = (i & 63) << 1;
        int i4 = (i2 & i3) + (i3 | i2);
        getProfileVersion = i4 % 128;
        if (i4 % 2 != 0) {
            boolean z = settitlemarginstart.valueOf;
            if (settitlemarginstart.writeReplace) {
                int i5 = getProfileVersion;
                AlternateContactlessPaymentDataJson = (i5 + 11) % 128;
                int i6 = i5 + 41;
                AlternateContactlessPaymentDataJson = i6 % 128;
                if (i6 % 2 == 0) {
                    return java.lang.Boolean.TRUE;
                }
                throw new java.lang.ArithmeticException();
            }
            boolean writeReplace = settitlemarginstart.values.getAid().DigitizedCardProfile().writeReplace();
            int i7 = getProfileVersion;
            AlternateContactlessPaymentDataJson = (((i7 & (-100)) | ((~i7) & 99)) + ((i7 & 99) << 1)) % 128;
            return java.lang.Boolean.valueOf(writeReplace);
        }
        boolean z2 = settitlemarginstart.valueOf;
        boolean z3 = settitlemarginstart.writeReplace;
        throw null;
    }

    private static /* synthetic */ java.lang.Object AlternateContactlessPaymentDataJson(java.lang.Object[] objArr) {
        int i;
        int i2;
        com.payair.hce.setTitleMarginStart settitlemarginstart = (com.payair.hce.setTitleMarginStart) objArr[0];
        int i3 = AlternateContactlessPaymentDataJson;
        int i4 = i3 ^ 113;
        getProfileVersion = ((((i3 & 113) | i4) << 1) - i4) % 128;
        boolean z = settitlemarginstart.valueOf;
        int AlternateContactlessPaymentDataJson2 = settitlemarginstart.values.getAid().DigitizedCardProfile().AlternateContactlessPaymentDataJson();
        if (settitlemarginstart.writeReplace) {
            int i5 = getProfileVersion;
            AlternateContactlessPaymentDataJson = ((i5 ^ 59) + ((i5 & 59) << 1)) % 128;
            int i6 = settitlemarginstart.DigitizedCardProfile;
            int intValue = ((java.lang.Integer) com.payair.hce.setNavigationIcon.DigitizedCardProfile(new java.lang.Object[]{java.lang.Integer.valueOf(i6)}, -334301909, 334301909, i6)).intValue();
            int intValue2 = ((java.lang.Integer) com.payair.hce.setNavigationIcon.DigitizedCardProfile(new java.lang.Object[]{java.lang.Integer.valueOf(AlternateContactlessPaymentDataJson2)}, -1174070258, 1174070259, AlternateContactlessPaymentDataJson2)).intValue();
            int identityHashCode = java.lang.System.identityHashCode(settitlemarginstart);
            int i7 = intValue2 * 595;
            int i8 = -(-(intValue * (-1187)));
            int i9 = (i7 & i8) + (i7 | i8);
            int i10 = ~intValue2;
            int i11 = i10 & (i10 | intValue2);
            int i12 = i11 & intValue;
            int i13 = ~((i11 ^ intValue) | i12);
            int i14 = ~identityHashCode;
            int i15 = ~((i14 ^ intValue) | (i14 & intValue));
            int i16 = ((i13 ^ i15) | (i13 & i15)) * (-1188);
            int i17 = i9 & i16;
            int i18 = -(-((i9 ^ i16) | i17));
            int i19 = ((i17 | i18) << 1) - (i18 ^ i17);
            int i20 = ~intValue;
            int i21 = ((~i11) & intValue) | (i11 & i20);
            int i22 = ~((i21 ^ i12) | (i12 & i21));
            int i23 = i20 & identityHashCode;
            int i24 = (~i23) & (i20 | identityHashCode);
            int i25 = (i23 ^ i24) | (i23 & i24);
            int i26 = ~i25;
            int i27 = (i25 | i26) & i26;
            int i28 = (i22 ^ i27) | (i22 & i27);
            int i29 = (identityHashCode | i14) & i14;
            int i30 = i29 & intValue2;
            int i31 = (i29 | intValue2) & (~i30);
            int i32 = ~((i31 ^ i30) | (i31 & i30));
            int i33 = i28 ^ i32;
            int i34 = i28 & i32;
            int i35 = -(-(((i34 ^ i33) | (i34 & i33)) * 594));
            int i36 = i19 & i35;
            int i37 = -(-((i35 ^ i19) | i36));
            int i38 = ((~i14) & i20) | ((~i20) & i14);
            int i39 = i14 & i20;
            int i40 = ~((i38 ^ i39) | (i38 & i39));
            int i41 = (intValue | i20) & i20;
            int i42 = (i41 ^ intValue2) | (i41 & intValue2);
            int i43 = ~i42;
            int i44 = (i42 | i43) & i43;
            int i45 = i40 ^ i44;
            int i46 = i44 & i40;
            int i47 = (i46 ^ i45) | (i46 & i45);
            int i48 = i47 & i32;
            int i49 = (i47 | i32) & (~i48);
            int i50 = (i36 ^ i37) + ((i37 & i36) << 1) + (((i49 ^ i48) | (i49 & i48)) * 594);
            int identityHashCode2 = java.lang.System.identityHashCode(settitlemarginstart);
            int i51 = AlternateContactlessPaymentDataJson2 * 592;
            int i52 = i50 * (-590);
            int i53 = i51 & i52;
            int i54 = -(-(i51 | i52));
            int i55 = ~AlternateContactlessPaymentDataJson2;
            int i56 = i55 & i50;
            int i57 = ((i53 | i54) << 1) - (i54 ^ i53);
            int i58 = ~((i55 ^ i50) | i56);
            int i59 = (-2) - (~((i57 - (~(-(~((i58 & (r5 | i58)) * (-1182)))))) - 1));
            int i60 = ~i50;
            int i61 = (~i60) & i55;
            int i62 = ~i55;
            int i63 = (i60 & i55) | i61 | (i62 & i60);
            int i64 = ~identityHashCode2;
            int i65 = ((~i64) & i63) | ((~i63) & i64);
            int i66 = i63 & i64;
            int i67 = ~((i66 ^ i65) | (i66 & i65));
            int i68 = i56 | (AlternateContactlessPaymentDataJson2 & i60);
            int i69 = AlternateContactlessPaymentDataJson2 & i50;
            int i70 = ~((i69 ^ i68) | (i69 & i68));
            int i71 = i67 & i70;
            int i72 = (((i70 | i67) & (~i71)) | i71) * (-591);
            int i73 = i59 ^ i72;
            int i74 = (identityHashCode2 & i62) | (i55 & i64) | (identityHashCode2 & i55);
            int i75 = (i60 | i50) & i60;
            int i76 = i74 & i75;
            getProfileVersion = (AlternateContactlessPaymentDataJson + 43) % 128;
            i2 = ((((i72 & i59) | i73) << 1) - (~(-i73))) - 1;
            i = (((i74 | i75) & (~i76)) | i76) * 591;
        } else {
            int i77 = AlternateContactlessPaymentDataJson2 + 108;
            int i78 = i77 & (-109);
            int i79 = ((i77 ^ (-109)) | i78) << 1;
            int i80 = -((i77 | (-109)) & (~i78));
            int i81 = settitlemarginstart.DigitizedCardProfile;
            int intValue3 = ((java.lang.Integer) com.payair.hce.setNavigationIcon.DigitizedCardProfile(new java.lang.Object[]{java.lang.Integer.valueOf(i81)}, -334301909, 334301909, i81)).intValue();
            int i82 = -(-((i79 & i80) + (i80 | i79)));
            int i83 = intValue3 | i82;
            i = -((~(intValue3 & i82)) & i83);
            int i84 = AlternateContactlessPaymentDataJson;
            int i85 = i84 ^ 109;
            int i86 = (((i84 & 109) | i85) << 1) - i85;
            getProfileVersion = i86 % 128;
            if (i86 % 2 == 0) {
                throw null;
            }
            i2 = i83 << 1;
        }
        return java.lang.Integer.valueOf((i2 - (~i)) - 1);
    }

    private static /* synthetic */ java.lang.Object valueOf(java.lang.Object[] objArr) {
        com.payair.hce.setTitleMarginStart settitlemarginstart = (com.payair.hce.setTitleMarginStart) objArr[0];
        com.payair.hce.setMaxLines setmaxlines = (com.payair.hce.setMaxLines) objArr[1];
        int i = AlternateContactlessPaymentDataJson;
        int i2 = (i | 33) << 1;
        int i3 = -((i & (-34)) | ((~i) & 33));
        int i4 = ((i2 | i3) << 1) - (i3 ^ i2);
        int i5 = 128;
        getProfileVersion = i4 % 128;
        boolean z = settitlemarginstart.valueOf;
        com.payair.hce.setEms DigitizedCardProfile = settitlemarginstart.values.getAid().DigitizedCardProfile();
        if (settitlemarginstart.writeReplace) {
            int i6 = getProfileVersion;
            AlternateContactlessPaymentDataJson = ((((i6 & (-72)) | ((~i6) & 71)) - (~(-(-((i6 & 71) << 1))))) - 1) % 128;
            com.payair.hce.setMaxLines.DigitizedCardProfile(new java.lang.Object[]{setmaxlines, 160, java.lang.Integer.valueOf(settitlemarginstart.DigitizedCardProfile)}, -584468000, 584468000, 160);
            setmaxlines.AlternateContactlessPaymentDataJson(DigitizedCardProfile.AlternateContactlessPaymentDataJson());
            setmaxlines.DigitizedCardProfile(DigitizedCardProfile);
            AlternateContactlessPaymentDataJson = (getProfileVersion + 29) % 128;
            return null;
        }
        if (DigitizedCardProfile.writeReplace()) {
            int i7 = getProfileVersion;
            int i8 = i7 + 77;
            AlternateContactlessPaymentDataJson = i8 % 128;
            int i9 = i8 % 2 != 0 ? 31215 : 160;
            int i10 = i7 & 113;
            int i11 = ((i7 ^ 113) | i10) << 1;
            int i12 = -((i7 | 113) & (~i10));
            int i13 = (i11 ^ i12) + ((i12 & i11) << 1);
            AlternateContactlessPaymentDataJson = i13 % 128;
            if (i13 % 2 != 0) {
                int i14 = 4 / 3;
            }
            i5 = i9;
        } else {
            int i15 = AlternateContactlessPaymentDataJson;
            int i16 = i15 & 83;
            getProfileVersion = ((((i15 ^ 83) | i16) << 1) - ((i15 | 83) & (~i16))) % 128;
        }
        com.payair.hce.setMaxLines.DigitizedCardProfile(new java.lang.Object[]{setmaxlines, java.lang.Integer.valueOf(i5), java.lang.Integer.valueOf(settitlemarginstart.DigitizedCardProfile)}, -584468000, 584468000, i5);
        setmaxlines.values(DigitizedCardProfile);
        int i17 = AlternateContactlessPaymentDataJson;
        int i18 = i17 ^ 15;
        int i19 = ((i17 & 15) | i18) << 1;
        int i20 = -i18;
        int i21 = (i19 & i20) + (i19 | i20);
        getProfileVersion = i21 % 128;
        if (i21 % 2 != 0) {
            return null;
        }
        throw null;
    }

    @Override // com.payair.hce.setFocusedSearchResultIndex, com.payair.hce.setEms
    final void values(com.payair.hce.setMaxLines setmaxlines) throws java.io.IOException {
        DigitizedCardProfile(new java.lang.Object[]{this, setmaxlines}, 351239883, -351239883, java.lang.System.identityHashCode(this));
    }

    @Override // com.payair.hce.setEms
    final int AlternateContactlessPaymentDataJson() throws java.io.IOException {
        return ((java.lang.Integer) DigitizedCardProfile(new java.lang.Object[]{this}, 1342181626, -1342181625, java.lang.System.identityHashCode(this))).intValue();
    }

    @Override // com.payair.hce.setEms
    final boolean writeReplace() {
        return ((java.lang.Boolean) DigitizedCardProfile(new java.lang.Object[]{this}, 417933240, -417933238, java.lang.System.identityHashCode(this))).booleanValue();
    }
}
