package com.payair.hce;

/* loaded from: classes4.dex */
public final class setCustomInsertionActionModeCallback extends com.payair.hce.setMaxEms {
    private static int AlternateContactlessPaymentDataJson = 0;
    private static int writeReplace = 1;
    private int valueOf;

    public static /* synthetic */ java.lang.Object valueOf(java.lang.Object[] objArr, int i, int i2, int i3) {
        int i4 = ~i;
        int i5 = ~i3;
        int i6 = ~((~i2) | i);
        int i7 = (i * 55) + (i2 * (-107)) + (((~(i2 | i5)) | (~(i4 | i2))) * (-108)) + (((~(i | i5)) | (~(i4 | i3)) | i6) * 54) + ((i3 | i6) * 54);
        return i7 != 1 ? i7 != 2 ? values(objArr) : writeReplace(objArr) : valueOf(objArr);
    }

    public setCustomInsertionActionModeCallback() {
        this.valueOf = -1;
    }

    public setCustomInsertionActionModeCallback(com.payair.hce.setHintTextColor sethinttextcolor) {
        super(sethinttextcolor);
        this.valueOf = -1;
    }

    private static /* synthetic */ java.lang.Object writeReplace(java.lang.Object[] objArr) {
        int i = 0;
        com.payair.hce.setCustomInsertionActionModeCallback setcustominsertionactionmodecallback = (com.payair.hce.setCustomInsertionActionModeCallback) objArr[0];
        int i2 = AlternateContactlessPaymentDataJson;
        int i3 = i2 + 25;
        writeReplace = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = setcustominsertionactionmodecallback.valueOf;
            throw null;
        }
        if (setcustominsertionactionmodecallback.valueOf < 0) {
            int i5 = i2 + 50;
            writeReplace = ((~i5) + (i5 << 1)) % 128;
            java.util.Enumeration values = setcustominsertionactionmodecallback.values();
            int i6 = writeReplace;
            AlternateContactlessPaymentDataJson = ((i6 & 5) + (i6 | 5)) % 128;
            while (values.hasMoreElements()) {
                int i7 = writeReplace;
                int i8 = (((i7 ^ 79) | (i7 & 79)) << 1) - ((i7 & (-80)) | ((~i7) & 79));
                AlternateContactlessPaymentDataJson = i8 % 128;
                if (i8 % 2 != 0) {
                    i /= ((com.payair.hce.setShadowLayer) values.nextElement()).getAid().DigitizedCardProfile().AlternateContactlessPaymentDataJson();
                } else {
                    int i9 = -(-((com.payair.hce.setShadowLayer) values.nextElement()).getAid().DigitizedCardProfile().AlternateContactlessPaymentDataJson());
                    int i10 = i & i9;
                    int i11 = -(-((i ^ i9) | i10));
                    i = ((i10 | i11) << 1) - (i11 ^ i10);
                }
            }
            setcustominsertionactionmodecallback.valueOf = i;
            int i12 = AlternateContactlessPaymentDataJson;
            int i13 = i12 & 15;
            int i14 = (i12 | 15) & (~i13);
            int i15 = -(-(i13 << 1));
            writeReplace = ((i14 & i15) + (i14 | i15)) % 128;
        }
        int i16 = setcustominsertionactionmodecallback.valueOf;
        int i17 = AlternateContactlessPaymentDataJson;
        writeReplace = ((i17 ^ 65) + ((i17 & 65) << 1)) % 128;
        return java.lang.Integer.valueOf(i16);
    }

    private static /* synthetic */ java.lang.Object valueOf(java.lang.Object[] objArr) {
        com.payair.hce.setCustomInsertionActionModeCallback setcustominsertionactionmodecallback = (com.payair.hce.setCustomInsertionActionModeCallback) objArr[0];
        int i = writeReplace & 89;
        AlternateContactlessPaymentDataJson = ((((r0 | 89) & (~i)) - (~(i << 1))) - 1) % 128;
        int intValue = ((java.lang.Integer) valueOf(new java.lang.Object[]{setcustominsertionactionmodecallback}, 560100071, -560100069, java.lang.System.identityHashCode(setcustominsertionactionmodecallback))).intValue();
        int intValue2 = ((java.lang.Integer) com.payair.hce.setNavigationIcon.DigitizedCardProfile(new java.lang.Object[]{java.lang.Integer.valueOf(intValue)}, -1174070258, 1174070259, intValue)).intValue();
        int identityHashCode = java.lang.System.identityHashCode(setcustominsertionactionmodecallback);
        int i2 = intValue2 * 367;
        int i3 = i2 ^ 367;
        int i4 = -(-((i2 & 367) << 1));
        int i5 = (i3 & i4) + (i4 | i3);
        int i6 = intValue2 & 1;
        int i7 = (~i6) & (intValue2 | 1);
        int i8 = ((i6 ^ i7) | (i6 & i7)) * (-366);
        int i9 = i5 & i8;
        int i10 = ((i5 ^ i8) | i9) << 1;
        int i11 = -((i8 | i5) & (~i9));
        int i12 = ((i10 | i11) << 1) - (i11 ^ i10);
        int i13 = identityHashCode & (-2);
        int i14 = (~i13) & (identityHashCode | (-2));
        int i15 = ~((i13 ^ i14) | (i13 & i14));
        int i16 = ~intValue2;
        int i17 = ((~i15) & intValue2) | (i15 & i16);
        int i18 = i15 & intValue2;
        int i19 = -(-(((i18 ^ i17) | (i18 & i17)) * (-366)));
        int i20 = ((~i19) & i12) | ((~i12) & i19);
        int i21 = (i19 & i12) << 1;
        int i22 = (i16 | intValue2) & i16;
        int i23 = i22 ^ 1;
        int i24 = i22 & 1;
        int i25 = (i24 ^ i23) | (i24 & i23);
        int i26 = ~i25;
        int i27 = (i25 | i26) & i26;
        int i28 = intValue2 & (-2);
        int i29 = (intValue2 | (-2)) & (~i28);
        int i30 = (i29 ^ i28) | (i29 & i28);
        int i31 = ((~identityHashCode) & i30) | ((~i30) & identityHashCode);
        int i32 = i30 & identityHashCode;
        int i33 = (i32 ^ i31) | (i32 & i31);
        int i34 = ~i33;
        int i35 = (i33 | i34) & i34;
        int i36 = i27 ^ i35;
        int i37 = i35 & i27;
        int i38 = (((i20 | i21) << 1) - (i21 ^ i20)) + (((i37 ^ i36) | (i37 & i36)) * 366);
        int identityHashCode2 = java.lang.System.identityHashCode(setcustominsertionactionmodecallback);
        int i39 = intValue * (-1965);
        int i40 = i38 * 984;
        int i41 = i39 ^ i40;
        int i42 = ((i39 & i40) | i41) << 1;
        int i43 = -i41;
        int i44 = ((i42 | i43) << 1) - (i42 ^ i43);
        int i45 = ~i38;
        int i46 = ~intValue;
        int i47 = ((~i45) & intValue) | (i45 & i46);
        int i48 = intValue & i45;
        int i49 = -(-(((i48 ^ i47) | (i47 & i48)) * 983));
        int i50 = i44 & i49;
        int i51 = (i49 ^ i44) | i50;
        int i52 = i45 & (i45 | i38);
        int i53 = ~identityHashCode2;
        int i54 = ((~i53) & i52) | ((~i52) & i53);
        int i55 = i52 & i53;
        int i56 = ~((i55 ^ i54) | (i55 & i54));
        int i57 = (((i50 & i51) + (i51 | i50)) - (~(-(-(((i56 & i46) | (i56 ^ i46)) * (-983)))))) - 1;
        int i58 = (identityHashCode2 | i53) & i53;
        int i59 = ~((i58 ^ i46) | (i58 & i46));
        int i60 = i46 & i38;
        int i61 = (~i60) & (i46 | i38);
        int i62 = (i60 ^ i61) | (i60 & i61);
        int i63 = ~i62;
        int i64 = (i62 | i63) & i63;
        int i65 = i59 & i64;
        int i66 = (i59 | i64) & (~i65);
        int i67 = -(-(((i66 ^ i65) | (i66 & i65)) * 983));
        int i68 = writeReplace;
        int i69 = (i68 ^ com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) + ((i68 & com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) << 1);
        AlternateContactlessPaymentDataJson = i69 % 128;
        if (i69 % 2 == 0) {
            return java.lang.Integer.valueOf((i57 ^ i67) + ((i67 & i57) << 1));
        }
        throw null;
    }

    private static /* synthetic */ java.lang.Object values(java.lang.Object[] objArr) {
        com.payair.hce.setCustomInsertionActionModeCallback setcustominsertionactionmodecallback = (com.payair.hce.setCustomInsertionActionModeCallback) objArr[0];
        com.payair.hce.setMaxLines setmaxlines = (com.payair.hce.setMaxLines) objArr[1];
        int i = AlternateContactlessPaymentDataJson;
        writeReplace = (((i & 97) - (~(-(-(i | 97))))) - 1) % 128;
        com.payair.hce.setMaxLines AlternateContactlessPaymentDataJson2 = setmaxlines.AlternateContactlessPaymentDataJson();
        int intValue = ((java.lang.Integer) valueOf(new java.lang.Object[]{setcustominsertionactionmodecallback}, 560100071, -560100069, java.lang.System.identityHashCode(setcustominsertionactionmodecallback))).intValue();
        setmaxlines.DigitizedCardProfile(48);
        setmaxlines.AlternateContactlessPaymentDataJson(intValue);
        java.util.Enumeration values = setcustominsertionactionmodecallback.values();
        int i2 = AlternateContactlessPaymentDataJson;
        writeReplace = (((i2 ^ 110) + ((i2 & 110) << 1)) - 1) % 128;
        while (values.hasMoreElements()) {
            int i3 = AlternateContactlessPaymentDataJson;
            int i4 = i3 & 61;
            int i5 = (i3 ^ 61) | i4;
            int i6 = ((i4 | i5) << 1) - (i5 ^ i4);
            writeReplace = i6 % 128;
            if (i6 % 2 != 0) {
                AlternateContactlessPaymentDataJson2.DigitizedCardProfile((com.payair.hce.setShadowLayer) values.nextElement());
            } else {
                AlternateContactlessPaymentDataJson2.DigitizedCardProfile((com.payair.hce.setShadowLayer) values.nextElement());
                throw null;
            }
        }
        int i7 = writeReplace;
        int i8 = (i7 | 23) << 1;
        int i9 = -(i7 ^ 23);
        int i10 = (i8 & i9) + (i9 | i8);
        AlternateContactlessPaymentDataJson = i10 % 128;
        if (i10 % 2 == 0) {
            return null;
        }
        throw null;
    }

    @Override // com.payair.hce.setMaxEms, com.payair.hce.setEms
    final void values(com.payair.hce.setMaxLines setmaxlines) throws java.io.IOException {
        valueOf(new java.lang.Object[]{this, setmaxlines}, 1323247878, -1323247878, java.lang.System.identityHashCode(this));
    }

    @Override // com.payair.hce.setEms
    final int AlternateContactlessPaymentDataJson() throws java.io.IOException {
        return ((java.lang.Integer) valueOf(new java.lang.Object[]{this}, -436831164, 436831165, java.lang.System.identityHashCode(this))).intValue();
    }

    private int RecordsJson() throws java.io.IOException {
        return ((java.lang.Integer) valueOf(new java.lang.Object[]{this}, 560100071, -560100069, java.lang.System.identityHashCode(this))).intValue();
    }
}
