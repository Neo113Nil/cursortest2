package com.payair.hce;

/* loaded from: classes4.dex */
final class setPrivateImeOptions extends java.io.InputStream {
    private static int AlternateContactlessPaymentDataJson = 0;
    private static int DigitizedCardProfile = 1;
    private final com.payair.hce.setHighlights valueOf;
    private boolean values = true;
    private java.io.InputStream writeReplace;

    public static /* synthetic */ java.lang.Object valueOf(java.lang.Object[] objArr, int i, int i2, int i3) {
        int i4 = ~i3;
        int i5 = ~i2;
        return ((((i * 758) + (i2 * (-756))) + ((i | i4) * (-757))) + ((~((i5 | i) | i3)) * 1514)) + ((((~((~i) | i5)) | (~(i4 | i5))) | (~((i2 | i) | i3))) * 757) != 1 ? valueOf(objArr) : values(objArr);
    }

    setPrivateImeOptions(com.payair.hce.setHighlights sethighlights) {
        this.valueOf = sethighlights;
    }

    private static /* synthetic */ java.lang.Object values(java.lang.Object[] objArr) {
        int i = 0;
        com.payair.hce.setPrivateImeOptions setprivateimeoptions = (com.payair.hce.setPrivateImeOptions) objArr[0];
        int i2 = 1;
        byte[] bArr = (byte[]) objArr[1];
        int intValue = ((java.lang.Number) objArr[2]).intValue();
        int intValue2 = ((java.lang.Number) objArr[3]).intValue();
        int i3 = AlternateContactlessPaymentDataJson;
        DigitizedCardProfile = ((i3 ^ 5) + ((i3 & 5) << 1)) % 128;
        java.lang.Integer num = -1;
        if (setprivateimeoptions.writeReplace == null) {
            int i4 = (i3 & (-64)) | ((~i3) & 63);
            int i5 = (i3 & 63) << 1;
            DigitizedCardProfile = ((i4 ^ i5) + ((i4 & i5) << 1)) % 128;
            if (!setprivateimeoptions.values) {
                int i6 = ((i3 & 59) + (i3 | 59)) % 128;
                DigitizedCardProfile = i6;
                int i7 = i6 & 59;
                int i8 = (((i6 | 59) & (~i7)) - (~(-(-(i7 << 1))))) - 1;
                AlternateContactlessPaymentDataJson = i8 % 128;
                if (i8 % 2 == 0) {
                    return num;
                }
                throw null;
            }
            com.payair.hce.setMinEms setminems = (com.payair.hce.setMinEms) setprivateimeoptions.valueOf.DigitizedCardProfile();
            if (setminems == null) {
                int i9 = DigitizedCardProfile;
                int i10 = i9 & 67;
                int i11 = (i10 + ((i9 ^ 67) | i10)) % 128;
                AlternateContactlessPaymentDataJson = i11;
                DigitizedCardProfile = (((i11 ^ com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE) + ((i11 & com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE) << 1)) - 1) % 128;
                return num;
            }
            setprivateimeoptions.values = false;
            setprivateimeoptions.writeReplace = setminems.values();
            int i12 = AlternateContactlessPaymentDataJson;
            int i13 = i12 & 67;
            int i14 = -(-((i12 ^ 67) | i13));
            DigitizedCardProfile = ((i13 & i14) + (i14 | i13)) % 128;
        }
        int i15 = DigitizedCardProfile;
        int i16 = i15 & 1;
        AlternateContactlessPaymentDataJson = ((((i15 ^ 1) | i16) << 1) - ((i15 | 1) & (~i16))) % 128;
        while (true) {
            java.io.InputStream inputStream = setprivateimeoptions.writeReplace;
            int i17 = i * (-496);
            int i18 = intValue * (-496);
            int i19 = i17 & i18;
            int i20 = (((i17 | i18) & (~i19)) - (~(-(-(i19 << 1))))) - i2;
            int i21 = ~i;
            int i22 = ~intValue;
            int i23 = ~i22;
            int i24 = (i23 & i21) | ((~i21) & i22);
            int i25 = i21 & i22;
            int i26 = (~((i24 ^ i25) | (i24 & i25))) * 497;
            int i27 = i24 | i25;
            int i28 = i27 ^ intValue;
            int i29 = i27 & intValue;
            int i30 = (i28 ^ i29) | (i29 & i28);
            int i31 = i23 & i22;
            int i32 = i31 | i31;
            int i33 = i22 & i22;
            int i34 = (i32 ^ i33) | (i32 & i33);
            int i35 = i34 & i;
            int i36 = (~i35) & (i34 | i);
            int i37 = (i36 & i35) | (i36 ^ i35);
            int i38 = ~((i21 ^ i22) | i25);
            int i39 = i21 & (i21 | i);
            int i40 = i39 & intValue;
            java.lang.Integer num2 = num;
            int i41 = (i39 ^ intValue) | i40;
            com.payair.hce.setPrivateImeOptions setprivateimeoptions2 = setprivateimeoptions;
            int i42 = ~i41;
            int i43 = i42 & (i41 | i42);
            int i44 = i38 & i43;
            int i45 = (i43 | i38) & (~i44);
            int i46 = (i45 ^ i44) | (i45 & i44);
            int i47 = i22 & i;
            int i48 = (~i47) & (i22 | i);
            int i49 = (i48 ^ i47) | (i47 & i48);
            int i50 = (i49 & intValue) | ((~i49) & intValue) | (i49 & i22);
            int i51 = ~i50;
            int i52 = (i50 | i51) & i51;
            int i53 = i46 & i52;
            int i54 = (i46 | i52) & (~i53);
            int i55 = (((~i20) & i26) | ((~i26) & i20)) + ((i20 & i26) << 1);
            int i56 = ~i37;
            int i57 = (i37 | i56) & i56;
            int i58 = ~i30;
            int i59 = (((i55 - (~((i57 | (i58 & (i30 | i58))) * 497))) - 1) - (~(-(~(-(-(((i54 ^ i53) | (i54 & i53)) * 497))))))) - 1;
            int i60 = -i;
            int i61 = ((i60 * (-183)) - (~(-(-(intValue2 * (-183)))))) - 1;
            int i62 = ~i60;
            int i63 = (i23 & i62) | ((~i62) & i22);
            int i64 = i62 & i22;
            int i65 = (i63 & i64) | (i63 ^ i64);
            int i66 = i65 & intValue2;
            int i67 = (i65 | intValue2) & (~i66);
            int i68 = ~intValue2;
            int i69 = ~((i67 & i66) | (i67 ^ i66));
            int i70 = i68 & i22;
            int i71 = (~i70) & (i68 | i22);
            int i72 = (i70 & i71) | (i71 ^ i70);
            int i73 = i72 ^ i60;
            int i74 = i72 & i60;
            int i75 = (i74 & i73) | (i73 ^ i74);
            int i76 = ~i75;
            int i77 = (i75 | i76) & i76;
            int i78 = i69 ^ i77;
            int i79 = i69 & i77;
            int i80 = -(-(((i79 & i78) | (i78 ^ i79)) * (-184)));
            int i81 = i61 & i80;
            int i82 = (i61 | i80) & (~i81);
            int i83 = -(-(i81 << 1));
            int i84 = ((i82 | i83) << 1) - (i82 ^ i83);
            int i85 = i62 & (i62 | i60);
            int i86 = (i85 ^ i68) | (i85 & i68);
            int i87 = ~i86;
            int i88 = (i86 | i87) & i87;
            int i89 = i85 & i22;
            int i90 = (i85 | i22) & (~i89);
            int i91 = ~((i90 & i89) | (i90 ^ i89));
            int i92 = i88 & i91;
            int i93 = (i91 | i88) & (~i92);
            int i94 = (i93 & i92) | (i93 ^ i92);
            int i95 = (i22 | intValue) & i22;
            int i96 = ((~i95) & i68) | ((~i68) & i95);
            int i97 = i95 & i68;
            int i98 = (i97 ^ i96) | (i96 & i97);
            int i99 = ~i98;
            int i100 = (i98 | i99) & i99;
            int i101 = i94 & i100;
            int i102 = (i94 | i100) & (~i101);
            int i103 = ((i102 ^ i101) | (i102 & i101)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_PINWHEEL_TEXT_VALUE;
            int i104 = i84 & i103;
            int i105 = (i103 | i84) & (~i104);
            int i106 = -(-(i104 << 1));
            int read = inputStream.read(bArr, (~i59) + (i59 << 1), (((i105 | i106) << 1) - (i105 ^ i106)) + (((i60 & intValue2) | (i60 ^ intValue2)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_PINWHEEL_TEXT_VALUE));
            if (read >= 0) {
                int i107 = AlternateContactlessPaymentDataJson;
                int i108 = i107 & 107;
                int i109 = -(-((i107 ^ 107) | i108));
                int i110 = ((i108 ^ i109) + ((i109 & i108) << 1)) % 128;
                DigitizedCardProfile = i110;
                int i111 = read * (-112);
                int i112 = i * (-112);
                int i113 = (i111 ^ i112) + ((i111 & i112) << 1);
                int i114 = read ^ i38;
                int i115 = i38 & read;
                int i116 = -(-(((i114 ^ i115) | (i115 & i114)) * 226));
                int i117 = i113 ^ i116;
                int i118 = ((i116 & i113) | i117) << 1;
                int i119 = -i117;
                int i120 = (i118 & i119) + (i118 | i119);
                int i121 = ~read;
                int i122 = i121 ^ i;
                int i123 = i & i121;
                int i124 = ~((i123 ^ i122) | (i122 & i123));
                int i125 = i121 & intValue;
                int i126 = (i121 | intValue) & (~i125);
                int i127 = ~((i126 ^ i125) | (i126 & i125));
                int i128 = i124 & i127;
                int i129 = (i124 | i127) & (~i128);
                int i130 = (i129 ^ i128) | (i129 & i128);
                int i131 = i39 & i22;
                int i132 = (i39 | i22) & (~i131);
                int i133 = (i132 ^ i131) | (i132 & i131);
                int i134 = ~((read ^ i133) | (read & i133));
                int i135 = (((~i130) & i134) | ((~i134) & i130) | (i134 & i130)) * (-113);
                int i136 = ((~i135) & i120) | ((~i120) & i135);
                int i137 = -(-((i135 & i120) << 1));
                int i138 = (i136 ^ i137) + ((i137 & i136) << 1);
                int i139 = ((~i39) & intValue) | i131;
                int i140 = -(-((~((i139 ^ i40) | (i139 & i40))) * 113));
                i2 = 1;
                i = ((i138 | i140) << 1) - (i140 ^ i138);
                if (i == intValue2) {
                    int i141 = ((-2) - (~(((i110 | 92) << 1) - (i110 ^ 92)))) % 128;
                    AlternateContactlessPaymentDataJson = i141;
                    DigitizedCardProfile = ((-2) - (~((i141 & 76) + (i141 | 76)))) % 128;
                    break;
                }
                setprivateimeoptions = setprivateimeoptions2;
                num = num2;
            } else {
                setprivateimeoptions = setprivateimeoptions2;
                com.payair.hce.setMinEms setminems2 = (com.payair.hce.setMinEms) setprivateimeoptions.valueOf.DigitizedCardProfile();
                if (setminems2 == null) {
                    int i142 = AlternateContactlessPaymentDataJson;
                    int i143 = i142 & 91;
                    int i144 = (i142 ^ 91) | i143;
                    int i145 = (i143 ^ i144) + ((i143 & i144) << 1);
                    int i146 = i145 % 128;
                    DigitizedCardProfile = i146;
                    if (i145 % 2 == 0) {
                        setprivateimeoptions.writeReplace = null;
                        throw null;
                    }
                    setprivateimeoptions.writeReplace = null;
                    if (i <= 0) {
                        int i147 = i146 & 25;
                        int i148 = (~i147) & (i146 | 25);
                        int i149 = i147 << 1;
                        AlternateContactlessPaymentDataJson = ((i148 ^ i149) + ((i149 & i148) << 1)) % 128;
                        return num2;
                    }
                    int i150 = i142 & 113;
                    int i151 = -(-((i142 ^ 113) | i150));
                    DigitizedCardProfile = ((i150 ^ i151) + ((i150 & i151) << 1)) % 128;
                } else {
                    setprivateimeoptions.writeReplace = setminems2.values();
                    int i152 = AlternateContactlessPaymentDataJson;
                    int i153 = i152 & 17;
                    int i154 = ((i152 ^ 17) | i153) << 1;
                    int i155 = -((i152 | 17) & (~i153));
                    DigitizedCardProfile = ((i154 ^ i155) + ((i155 & i154) << 1)) % 128;
                    i2 = 1;
                    num = num2;
                }
            }
        }
        return java.lang.Integer.valueOf(i);
    }

    private static /* synthetic */ java.lang.Object valueOf(java.lang.Object[] objArr) {
        com.payair.hce.setPrivateImeOptions setprivateimeoptions = (com.payair.hce.setPrivateImeOptions) objArr[0];
        int i = AlternateContactlessPaymentDataJson;
        int i2 = i & 95;
        int i3 = -(-((i ^ 95) | i2));
        int i4 = ((i2 ^ i3) + ((i3 & i2) << 1)) % 128;
        DigitizedCardProfile = i4;
        if (setprivateimeoptions.writeReplace == null) {
            int i5 = i4 & 93;
            int i6 = -(-((i4 ^ 93) | i5));
            AlternateContactlessPaymentDataJson = (((i5 | i6) << 1) - (i5 ^ i6)) % 128;
            if (!setprivateimeoptions.values) {
                int i7 = ((i4 ^ 111) + ((i4 & 111) << 1)) % 128;
                AlternateContactlessPaymentDataJson = i7;
                int i8 = (((i7 | 6) << 1) - (i7 ^ 6)) - 1;
                DigitizedCardProfile = i8 % 128;
                if (i8 % 2 != 0) {
                    return -1;
                }
                throw null;
            }
            com.payair.hce.setMinEms setminems = (com.payair.hce.setMinEms) setprivateimeoptions.valueOf.DigitizedCardProfile();
            if (setminems == null) {
                int i9 = DigitizedCardProfile;
                int i10 = (i9 & 117) + (i9 | 117);
                AlternateContactlessPaymentDataJson = i10 % 128;
                if (i10 % 2 != 0) {
                    throw new java.lang.ArithmeticException();
                }
                AlternateContactlessPaymentDataJson = (i9 + 39) % 128;
                return -1;
            }
            setprivateimeoptions.values = false;
            setprivateimeoptions.writeReplace = setminems.values();
            int i11 = DigitizedCardProfile;
            int i12 = ((i11 ^ 111) | (i11 & 111)) << 1;
            int i13 = -((i11 & (-112)) | ((~i11) & 111));
            AlternateContactlessPaymentDataJson = ((i12 & i13) + (i13 | i12)) % 128;
        }
        while (true) {
            int read = setprivateimeoptions.writeReplace.read();
            if (read >= 0) {
                int i14 = AlternateContactlessPaymentDataJson;
                int i15 = ~i14;
                int i16 = (i14 & (-78)) | (i15 & 77);
                int i17 = (i14 & 77) << 1;
                DigitizedCardProfile = ((i16 & i17) + (i16 | i17)) % 128;
                int i18 = ((((i14 ^ 1) | (i14 & 1)) << 1) - (~(-((i14 & (-2)) | (i15 & 1))))) - 1;
                DigitizedCardProfile = i18 % 128;
                if (i18 % 2 != 0) {
                    return java.lang.Integer.valueOf(read);
                }
                throw null;
            }
            com.payair.hce.setMinEms setminems2 = (com.payair.hce.setMinEms) setprivateimeoptions.valueOf.DigitizedCardProfile();
            if (setminems2 == null) {
                int i19 = AlternateContactlessPaymentDataJson;
                int i20 = ((i19 ^ 67) | (i19 & 67)) << 1;
                int i21 = -((i19 & (-68)) | ((~i19) & 67));
                DigitizedCardProfile = ((i20 ^ i21) + ((i20 & i21) << 1)) % 128;
                setprivateimeoptions.writeReplace = null;
                int i22 = i19 & 7;
                int i23 = (i19 | 7) & (~i22);
                int i24 = -(-(i22 << 1));
                DigitizedCardProfile = ((i23 & i24) + (i24 | i23)) % 128;
                return -1;
            }
            setprivateimeoptions.writeReplace = setminems2.values();
            DigitizedCardProfile = (AlternateContactlessPaymentDataJson + 19) % 128;
        }
    }

    @Override // java.io.InputStream
    public final int read() throws java.io.IOException {
        return ((java.lang.Integer) valueOf(new java.lang.Object[]{this}, 546126033, -546126033, java.lang.System.identityHashCode(this))).intValue();
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws java.io.IOException {
        return ((java.lang.Integer) valueOf(new java.lang.Object[]{this, bArr, java.lang.Integer.valueOf(i), java.lang.Integer.valueOf(i2)}, 1550666854, -1550666853, i)).intValue();
    }
}
