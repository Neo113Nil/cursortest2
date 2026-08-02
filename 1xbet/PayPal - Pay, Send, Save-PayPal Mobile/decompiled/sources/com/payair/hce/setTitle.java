package com.payair.hce;

/* loaded from: classes4.dex */
public final class setTitle extends com.payair.hce.setJustificationMode {
    private static int valueOf = 0;
    private static int writeReplace = 1;

    public static /* synthetic */ java.lang.Object DigitizedCardProfile(java.lang.Object[] objArr, int i, int i2, int i3) {
        int i4 = ~i3;
        int i5 = ~(i4 | i);
        int i6 = ~((~i) | i2);
        int i7 = (i * 765) + (i2 * (-1527)) + ((i2 | i5) * 764) + (((~(i4 | i2)) | i6) * (-1528)) + (((~(i | (~i2))) | i6 | i5) * 764);
        if (i7 == 1) {
            com.payair.hce.setTitle settitle = (com.payair.hce.setTitle) objArr[0];
            com.payair.hce.setMaxLines setmaxlines = (com.payair.hce.setMaxLines) objArr[1];
            int i8 = valueOf;
            writeReplace = ((i8 ^ 37) + ((i8 & 37) << 1)) % 128;
            byte[] bArr = settitle.DigitizedCardProfile;
            int length = bArr.length;
            int identityHashCode = java.lang.System.identityHashCode(settitle);
            int i9 = length * (-565);
            int i10 = i9 & 567;
            int i11 = ~length;
            int i12 = i11 & (-2);
            int i13 = (length & 1) | i12;
            int i14 = length & (-2);
            int i15 = (i13 ^ i14) | (i13 & i14);
            int i16 = ~i15;
            int i17 = (i15 | i16) & i16;
            int i18 = ((~identityHashCode) & (-2)) | (identityHashCode & 1);
            int i19 = identityHashCode & (-2);
            int i20 = (i18 ^ i19) | (i18 & i19);
            int i21 = ~i20;
            int i22 = (i20 | i21) & i21;
            int i23 = i17 & i22;
            int i24 = (i17 | i22) & (~i23);
            int i25 = ((((i9 | 567) & (~i10)) + (i10 << 1)) - (~(-(~(-(-(((i24 & i23) | (i24 ^ i23)) * (-566)))))))) - 2;
            int i26 = (length | i11) & i11;
            int i27 = i26 & 1;
            int i28 = (i26 | 1) & (~i27);
            int i29 = -(-((~((i28 ^ i27) | (i28 & i27))) * com.gemalto.mfs.mwsdk.provisioning.model.KnownCpsErrorCodes.PULL_TOKEN_DOES_NOT_EXIST));
            int i30 = ((~i29) & i25) | ((~i25) & i29);
            int i31 = (i29 & i25) << 1;
            int i32 = (i30 ^ i31) + ((i31 & i30) << 1);
            int i33 = (i11 | (-2)) & (~i12);
            int i34 = (i33 ^ i12) | (i33 & i12);
            int i35 = (i34 ^ identityHashCode) | (i34 & identityHashCode);
            int i36 = ~i35;
            int i37 = ((i35 | i36) & i36) * com.gemalto.mfs.mwsdk.provisioning.model.KnownCpsErrorCodes.PULL_TOKEN_DOES_NOT_EXIST;
            int i38 = (i32 & i37) + (i37 | i32);
            byte[] bArr2 = new byte[i38];
            bArr2[0] = (byte) settitle.values();
            int identityHashCode2 = java.lang.System.identityHashCode(settitle);
            int i39 = (i38 * (-271)) - 273;
            int i40 = ~i38;
            int i41 = ~identityHashCode2;
            int i42 = (i40 & i41) | (i40 ^ i41);
            int i43 = ~i42;
            int i44 = (i40 ^ i38) | (i40 & i38);
            int i45 = ~((i44 ^ identityHashCode2) | (i44 & identityHashCode2));
            int i46 = -(-(((i45 ^ i43) | (i43 & i45)) * (-272)));
            int i47 = i39 & i46;
            int i48 = i47 + ((i39 ^ i46) | i47);
            int i49 = -(-(i42 * (-272)));
            int i50 = ((~i49) & i48) | ((~i48) & i49);
            int i51 = (i49 & i48) << 1;
            int i52 = (i50 & i51) + (i51 | i50);
            int i53 = (identityHashCode2 ^ i41) | (identityHashCode2 & i41);
            int i54 = ~i53;
            int i55 = (i53 | i54) & i54;
            int i56 = i38 ^ i55;
            int i57 = i55 & i38;
            int i58 = -(-(((i57 ^ i56) | (i57 & i56)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_USER_BRUSHSTROKE_VALUE));
            int i59 = i52 ^ i58;
            int i60 = ((i58 & i52) | i59) << 1;
            int i61 = -i59;
            java.lang.System.arraycopy(bArr, 0, bArr2, 1, (i60 & i61) + (i60 | i61));
            setmaxlines.AlternateContactlessPaymentDataJson(3, bArr2);
            writeReplace = (valueOf + 37) % 128;
            return null;
        }
        if (i7 != 2) {
            int i62 = writeReplace;
            valueOf = (((i62 ^ 15) - (~((i62 & 15) << 1))) - 1) % 128;
            int i63 = i62 & 111;
            int i64 = ((i62 ^ 111) | i63) << 1;
            int i65 = -((i62 | 111) & (~i63));
            valueOf = ((i64 & i65) + (i65 | i64)) % 128;
            return java.lang.Boolean.FALSE;
        }
        com.payair.hce.setTitle settitle2 = (com.payair.hce.setTitle) objArr[0];
        int i66 = valueOf;
        int i67 = i66 & 95;
        int i68 = (i66 ^ 95) | i67;
        writeReplace = ((i67 ^ i68) + ((i68 & i67) << 1)) % 128;
        int length2 = settitle2.DigitizedCardProfile.length;
        int i69 = ((length2 ^ 2) + ((2 & length2) << 1)) - 1;
        int intValue = ((java.lang.Integer) com.payair.hce.setNavigationIcon.DigitizedCardProfile(new java.lang.Object[]{java.lang.Integer.valueOf(i69)}, -1174070258, 1174070259, i69)).intValue();
        int i70 = (intValue * 765) - 1527;
        int i71 = ~java.lang.System.identityHashCode(settitle2);
        int i72 = i71 & intValue;
        int i73 = (~i72) & (i71 | intValue);
        int i74 = ~intValue;
        int i75 = ~((i72 ^ i73) | (i72 & i73));
        int i76 = i75 & 1;
        int i77 = (i75 | 1) & (~i76);
        int i78 = ((i76 ^ i77) | (i77 & i76)) * 764;
        int i79 = ((i70 ^ i78) | (i70 & i78)) << 1;
        int i80 = -((i70 & (~i78)) | ((~i70) & i78));
        int i81 = ((i79 | i80) << 1) - (i80 ^ i79);
        int i82 = (i74 | intValue) & i74;
        int i83 = i82 & 1;
        int i84 = i82 ^ 1;
        int i85 = i83 | i84;
        int i86 = ~i85;
        int i87 = (i85 | i86) & i86;
        int i88 = (i71 & (-2)) | ((~i71) & 1);
        int i89 = i71 & 1;
        int i90 = (i89 ^ i88) | (i89 & i88);
        int i91 = ~i90;
        int i92 = (i90 | i91) & i91;
        int i93 = ((i92 ^ i87) | (i92 & i87)) * (-1528);
        int i94 = i81 ^ i93;
        int i95 = ((((i93 & i81) | i94) << 1) - (~(-i94))) - 1;
        int i96 = (i84 ^ i83) | (i83 & i84);
        int i97 = ~i96;
        int i98 = (i96 | i97) & i97;
        int i99 = (i74 & (-2)) | (intValue & 1);
        int i100 = intValue & (-2);
        int i101 = ~((i100 ^ i99) | (i100 & i99));
        int i102 = ((~i101) & i98) | ((~i98) & i101);
        int i103 = i101 & i98;
        int i104 = (i103 ^ i102) | (i103 & i102);
        int i105 = i104 & i75;
        int i106 = (i104 | i75) & (~i105);
        int i107 = -(-(((i106 ^ i105) | (i106 & i105)) * 764));
        int i108 = i95 & i107;
        int i109 = (i107 | i95) & (~i108);
        int i110 = -(-(i108 << 1));
        int i111 = (i109 & i110) + (i109 | i110);
        int i112 = -(~(-(-settitle2.DigitizedCardProfile.length)));
        int i113 = ((i111 ^ i112) + ((i112 & i111) << 1)) - 1;
        int i114 = i113 & 1;
        int i115 = (i113 | 1) & (~i114);
        int i116 = -(-(i114 << 1));
        int i117 = writeReplace;
        int i118 = (i117 & (-24)) | ((~i117) & 23);
        int i119 = (i117 & 23) << 1;
        valueOf = (((i118 | i119) << 1) - (i119 ^ i118)) % 128;
        return java.lang.Integer.valueOf((i115 ^ i116) + ((i116 & i115) << 1));
    }

    public setTitle(byte[] bArr, int i) {
        super(bArr, i);
    }

    @Override // com.payair.hce.setJustificationMode, com.payair.hce.setEms
    final void values(com.payair.hce.setMaxLines setmaxlines) throws java.io.IOException {
        DigitizedCardProfile(new java.lang.Object[]{this, setmaxlines}, -1313607214, 1313607215, java.lang.System.identityHashCode(this));
    }

    @Override // com.payair.hce.setEms
    final int AlternateContactlessPaymentDataJson() {
        return ((java.lang.Integer) DigitizedCardProfile(new java.lang.Object[]{this}, 1967935260, -1967935258, java.lang.System.identityHashCode(this))).intValue();
    }

    @Override // com.payair.hce.setEms
    final boolean writeReplace() {
        return ((java.lang.Boolean) DigitizedCardProfile(new java.lang.Object[]{this}, -1450102907, 1450102907, java.lang.System.identityHashCode(this))).booleanValue();
    }
}
