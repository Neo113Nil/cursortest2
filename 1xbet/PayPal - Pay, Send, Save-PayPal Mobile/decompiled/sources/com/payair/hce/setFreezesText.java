package com.payair.hce;

/* loaded from: classes4.dex */
public final class setFreezesText extends com.payair.hce.setMaxEms {
    private static int valueOf = 0;
    private static int writeReplace = 1;

    public static /* synthetic */ java.lang.Object valueOf(java.lang.Object[] objArr, int i, int i2, int i3) {
        int i4 = ~i2;
        int i5 = i4 | i;
        return ((((i * 624) + (i2 * (-622))) + ((~(i5 | i3)) * 623)) + (((~(i2 | (~i))) | (~i3)) * (-623))) + (((~(i | i3)) | ((~i5) | (~(i3 | i4)))) * 623) != 1 ? values(objArr) : valueOf(objArr);
    }

    public setFreezesText() {
    }

    public setFreezesText(com.payair.hce.setHintTextColor sethinttextcolor) {
        super(sethinttextcolor);
    }

    private static /* synthetic */ java.lang.Object values(java.lang.Object[] objArr) {
        int i;
        java.util.Enumeration values;
        com.payair.hce.setFreezesText setfreezestext = (com.payair.hce.setFreezesText) objArr[0];
        int i2 = writeReplace;
        int i3 = i2 ^ 73;
        int i4 = (((i2 & 73) | i3) << 1) - i3;
        valueOf = i4 % 128;
        if (i4 % 2 != 0) {
            values = setfreezestext.values();
            i = 1;
        } else {
            i = 0;
            values = setfreezestext.values();
        }
        while (values.hasMoreElements()) {
            int i5 = valueOf;
            writeReplace = (((i5 & (-50)) | ((~i5) & 49)) + ((i5 & 49) << 1)) % 128;
            i += ((com.payair.hce.setShadowLayer) values.nextElement()).getAid().AlternateContactlessPaymentDataJson();
            int i6 = valueOf + 50;
            writeReplace = ((~i6) + (i6 << 1)) % 128;
        }
        int i7 = i & 2;
        int i8 = (i | 2) & (~i7);
        int i9 = i7 << 1;
        int i10 = (i8 ^ i9) + ((i9 & i8) << 1);
        int identityHashCode = java.lang.System.identityHashCode(setfreezestext);
        int i11 = -(~(-(-(i10 * (-167)))));
        int i12 = ((i11 ^ (-334)) + ((i11 & (-334)) << 1)) - 1;
        int i13 = ~i10;
        int i14 = (i13 | i10) & i13;
        int i15 = ((~i14) & (-3)) | (i14 & 2);
        int i16 = i14 & (-3);
        int i17 = (i16 ^ i15) | (i16 & i15);
        int i18 = ~i17;
        int i19 = (i17 | i18) & i18;
        int i20 = i13 & identityHashCode;
        int i21 = (i13 | identityHashCode) & (~i20);
        int i22 = ~identityHashCode;
        int i23 = ~((i20 ^ i21) | (i21 & i20));
        int i24 = ((i19 ^ i23) | (i23 & i19)) * 336;
        int i25 = ((~i24) & i12) | ((~i12) & i24);
        int i26 = (i12 & i24) << 1;
        int i27 = (i25 & i26) + (i26 | i25);
        int i28 = ~((i13 & 2) | (i10 & (-3)) | (i10 & 2));
        int i29 = i22 & 2;
        int i30 = (identityHashCode & (-3)) | i29;
        int i31 = identityHashCode & 2;
        int i32 = ~((i31 ^ i30) | (i31 & i30));
        int i33 = i28 ^ i32;
        int i34 = i32 & i28;
        int i35 = -(~(-(-(((i34 ^ i33) | (i34 & i33)) * (-168)))));
        int i36 = (-2) - (~(((i27 | i35) << 1) - (i35 ^ i27)));
        int i37 = (~i29) & (i22 | 2);
        int i38 = (i37 ^ i29) | (i29 & i37);
        int i39 = ~i38;
        int i40 = (i38 | i39) & i39;
        int i41 = ((~i40) & i13) | ((~i13) & i40);
        int i42 = i13 & i40;
        int i43 = ((i42 ^ i41) | (i42 & i41)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_VALUE;
        int i44 = (i36 ^ i43) + ((i36 & i43) << 1);
        int i45 = valueOf;
        int i46 = (i45 ^ 65) + ((i45 & 65) << 1);
        writeReplace = i46 % 128;
        if (i46 % 2 != 0) {
            return java.lang.Integer.valueOf(i44);
        }
        throw new java.lang.ArithmeticException();
    }

    private static /* synthetic */ java.lang.Object valueOf(java.lang.Object[] objArr) {
        com.payair.hce.setFreezesText setfreezestext = (com.payair.hce.setFreezesText) objArr[0];
        com.payair.hce.setMaxLines setmaxlines = (com.payair.hce.setMaxLines) objArr[1];
        int i = valueOf;
        writeReplace = ((i & 103) + (i | 103)) % 128;
        setmaxlines.DigitizedCardProfile(48);
        setmaxlines.DigitizedCardProfile(128);
        java.util.Enumeration values = setfreezestext.values();
        writeReplace = (valueOf + 55) % 128;
        while (values.hasMoreElements()) {
            int i2 = writeReplace;
            int i3 = i2 ^ 53;
            int i4 = (i2 & 53) << 1;
            int i5 = ((i3 | i4) << 1) - (i4 ^ i3);
            valueOf = i5 % 128;
            if (i5 % 2 != 0) {
                setmaxlines.DigitizedCardProfile((com.payair.hce.setShadowLayer) values.nextElement());
                throw null;
            }
            setmaxlines.DigitizedCardProfile((com.payair.hce.setShadowLayer) values.nextElement());
        }
        setmaxlines.DigitizedCardProfile(0);
        setmaxlines.DigitizedCardProfile(0);
        int i6 = writeReplace + 61;
        valueOf = i6 % 128;
        if (i6 % 2 == 0) {
            return null;
        }
        throw null;
    }

    @Override // com.payair.hce.setMaxEms, com.payair.hce.setEms
    final void values(com.payair.hce.setMaxLines setmaxlines) throws java.io.IOException {
        valueOf(new java.lang.Object[]{this, setmaxlines}, 2141615778, -2141615777, java.lang.System.identityHashCode(this));
    }

    @Override // com.payair.hce.setEms
    final int AlternateContactlessPaymentDataJson() throws java.io.IOException {
        return ((java.lang.Integer) valueOf(new java.lang.Object[]{this}, 1668287888, -1668287888, java.lang.System.identityHashCode(this))).intValue();
    }
}
