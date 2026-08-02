package com.payair.hce;

/* loaded from: classes4.dex */
public final class setCursorVisible extends com.payair.hce.setWidth {
    private static int AlternateContactlessPaymentDataJson = 1;
    private static int valueOf;
    private int values;

    public static /* synthetic */ java.lang.Object AlternateContactlessPaymentDataJson(java.lang.Object[] objArr, int i, int i2, int i3) {
        int i4 = ~i3;
        int i5 = (i * (-159)) + (i2 * (-159)) + (((~i) | i2) * 160) + (((~(i4 | i)) | (~(i | i2))) * (-160)) + ((i | (~((~i2) | i4))) * 160);
        if (i5 != 1) {
            return i5 != 2 ? values(objArr) : writeReplace(objArr);
        }
        int i6 = 0;
        com.payair.hce.setCursorVisible setcursorvisible = (com.payair.hce.setCursorVisible) objArr[0];
        int i7 = AlternateContactlessPaymentDataJson;
        int i8 = i7 & 27;
        valueOf = (i8 + ((i7 ^ 27) | i8)) % 128;
        if (setcursorvisible.values < 0) {
            int i9 = ((i7 ^ 75) | (i7 & 75)) << 1;
            int i10 = -((i7 & (-76)) | ((~i7) & 75));
            valueOf = (((i9 | i10) << 1) - (i10 ^ i9)) % 128;
            java.util.Enumeration valueOf2 = setcursorvisible.valueOf();
            int i11 = AlternateContactlessPaymentDataJson;
            int i12 = i11 & 47;
            int i13 = i11 | 47;
            int i14 = (i12 ^ i13) + ((i13 & i12) << 1);
            valueOf = i14 % 128;
            if (i14 % 2 != 0) {
                int i15 = 3 / 5;
            }
            while (valueOf2.hasMoreElements()) {
                int i16 = valueOf;
                AlternateContactlessPaymentDataJson = ((i16 ^ 53) + ((i16 & 53) << 1)) % 128;
                int AlternateContactlessPaymentDataJson2 = ((com.payair.hce.setShadowLayer) valueOf2.nextElement()).getAid().DigitizedCardProfile().AlternateContactlessPaymentDataJson();
                int identityHashCode = java.lang.System.identityHashCode(setcursorvisible);
                int i17 = -(-(i6 * com.paypal.oslo.feature.onboarding.signup.welcome.ui.state.WelcomeAnimationConstantsKt.TransferFrameEnd));
                int i18 = ~AlternateContactlessPaymentDataJson2;
                int i19 = i18 ^ i6;
                int i20 = i18 & i6;
                int i21 = ~((i19 ^ i20) | (i20 & i19));
                int i22 = ~identityHashCode;
                int i23 = ((~i21) & identityHashCode) | (i21 & i22);
                int i24 = i21 & identityHashCode;
                int i25 = (-2) - (~(((-2) - (~((AlternateContactlessPaymentDataJson2 * (-1975)) - (~i17)))) - (~(-(-(((i24 ^ i23) | (i24 & i23)) * 988))))));
                int i26 = ~i6;
                int i27 = i26 & AlternateContactlessPaymentDataJson2;
                int i28 = (~i27) & (i26 | AlternateContactlessPaymentDataJson2);
                int i29 = ~((i27 ^ i28) | (i27 & i28));
                int i30 = (i22 | identityHashCode) & i22;
                int i31 = i30 & AlternateContactlessPaymentDataJson2;
                int i32 = ~(((AlternateContactlessPaymentDataJson2 | i30) & (~i31)) | i31);
                int i33 = ((i32 ^ i29) | (i29 & i32)) * (-1976);
                int i34 = i25 & i33;
                int i35 = i33 | i25;
                int i36 = (i34 ^ i35) + ((i35 & i34) << 1);
                int i37 = ~((i18 & i26) | ((~i18) & i6) | i20);
                int i38 = i26 & identityHashCode;
                int i39 = (identityHashCode | i26) & (~i38);
                int i40 = (i39 ^ i38) | (i39 & i38);
                int i41 = ~i40;
                int i42 = (i40 | i41) & i41;
                int i43 = (i37 ^ i42) | (i37 & i42);
                int i44 = ~((i6 ^ i22) | (i6 & i22));
                int i45 = ((~i44) & i43) | ((~i43) & i44);
                int i46 = i43 & i44;
                int i47 = -(-(((i46 ^ i45) | (i46 & i45)) * 988));
                i6 = ((i36 & i47) - (~(i47 | i36))) - 1;
                int i48 = valueOf;
                int i49 = i48 & 65;
                int i50 = ((i48 ^ 65) | i49) << 1;
                int i51 = -((i48 | 65) & (~i49));
                AlternateContactlessPaymentDataJson = ((i50 ^ i51) + ((i51 & i50) << 1)) % 128;
            }
            setcursorvisible.values = i6;
            AlternateContactlessPaymentDataJson = (valueOf + 75) % 128;
        }
        int i52 = setcursorvisible.values;
        AlternateContactlessPaymentDataJson = (valueOf + 21) % 128;
        return java.lang.Integer.valueOf(i52);
    }

    public setCursorVisible() {
        this.values = -1;
    }

    setCursorVisible(com.payair.hce.setHintTextColor sethinttextcolor) {
        super(sethinttextcolor, false);
        this.values = -1;
    }

    private static /* synthetic */ java.lang.Object values(java.lang.Object[] objArr) {
        com.payair.hce.setCursorVisible setcursorvisible = (com.payair.hce.setCursorVisible) objArr[0];
        AlternateContactlessPaymentDataJson = (valueOf + 97) % 128;
        int intValue = ((java.lang.Integer) AlternateContactlessPaymentDataJson(new java.lang.Object[]{setcursorvisible}, -890711338, 890711339, java.lang.System.identityHashCode(setcursorvisible))).intValue();
        int intValue2 = ((java.lang.Integer) com.payair.hce.setNavigationIcon.DigitizedCardProfile(new java.lang.Object[]{java.lang.Integer.valueOf(intValue)}, -1174070258, 1174070259, intValue)).intValue();
        int identityHashCode = java.lang.System.identityHashCode(setcursorvisible);
        int i = intValue2 * 69;
        int i2 = (i | (-67)) << 1;
        int i3 = -((i & 66) | ((~i) & (-67)));
        int i4 = (i2 ^ i3) + ((i3 & i2) << 1);
        int i5 = ~intValue2;
        int i6 = ~i5;
        int i7 = (i5 & 1) | (i6 & (-2));
        int i8 = i5 & (-2);
        int i9 = (i7 ^ i8) | (i7 & i8);
        int i10 = ~identityHashCode;
        int i11 = ~((i9 ^ i10) | (i9 & i10));
        int i12 = intValue2 ^ 1;
        int i13 = intValue2 & 1;
        int i14 = ~((i13 ^ i12) | (i12 & i13));
        int i15 = ((~i14) & i11) | ((~i11) & i14);
        int i16 = i14 & i11;
        int i17 = (i16 ^ i15) | (i16 & i15);
        int i18 = ~((identityHashCode ^ 1) | (identityHashCode & 1));
        int i19 = ((i17 ^ i18) | (i17 & i18)) * (-68);
        int i20 = i4 & i19;
        int i21 = (((i4 ^ i19) | i20) << 1) - ((i19 | i4) & (~i20));
        int i22 = (identityHashCode | i10) & i10;
        int i23 = (i6 & i22) | ((~i22) & i5);
        int i24 = i22 & i5;
        int i25 = (i24 ^ i23) | (i24 & i23);
        int i26 = i25 & 1;
        int i27 = (~(((i25 | 1) & (~i26)) | i26)) * (-68);
        int i28 = (((i21 ^ i27) | (i21 & i27)) << 1) - (((~i27) & i21) | ((~i21) & i27));
        int i29 = ((~i10) & (-2)) | (i10 & 1);
        int i30 = i10 & (-2);
        int i31 = ~((i29 ^ i30) | (i29 & i30));
        int i32 = ((~i31) & i5) | (i6 & i31);
        int i33 = i31 & i5;
        int i34 = -(~(((i33 ^ i32) | (i33 & i32)) * 68));
        int i35 = ((i28 ^ i34) + ((i34 & i28) << 1)) - 1;
        int i36 = AlternateContactlessPaymentDataJson;
        int i37 = i36 & 65;
        int i38 = -(-((i36 ^ 65) | i37));
        int i39 = (i37 ^ i38) + ((i38 & i37) << 1);
        valueOf = i39 % 128;
        if (i39 % 2 == 0) {
            return java.lang.Integer.valueOf((i35 ^ intValue) + ((intValue & i35) << 1));
        }
        throw null;
    }

    private static /* synthetic */ java.lang.Object writeReplace(java.lang.Object[] objArr) {
        com.payair.hce.setMaxLines AlternateContactlessPaymentDataJson2;
        int intValue;
        int i;
        com.payair.hce.setCursorVisible setcursorvisible = (com.payair.hce.setCursorVisible) objArr[0];
        com.payair.hce.setMaxLines setmaxlines = (com.payair.hce.setMaxLines) objArr[1];
        int i2 = AlternateContactlessPaymentDataJson;
        int i3 = i2 & 31;
        int i4 = (((i2 | 31) & (~i3)) - (~(i3 << 1))) - 1;
        valueOf = i4 % 128;
        if (i4 % 2 != 0) {
            AlternateContactlessPaymentDataJson2 = setmaxlines.AlternateContactlessPaymentDataJson();
            intValue = ((java.lang.Integer) AlternateContactlessPaymentDataJson(new java.lang.Object[]{setcursorvisible}, -890711338, 890711339, java.lang.System.identityHashCode(setcursorvisible))).intValue();
            i = 28;
        } else {
            AlternateContactlessPaymentDataJson2 = setmaxlines.AlternateContactlessPaymentDataJson();
            intValue = ((java.lang.Integer) AlternateContactlessPaymentDataJson(new java.lang.Object[]{setcursorvisible}, -890711338, 890711339, java.lang.System.identityHashCode(setcursorvisible))).intValue();
            i = 49;
        }
        setmaxlines.DigitizedCardProfile(i);
        setmaxlines.AlternateContactlessPaymentDataJson(intValue);
        java.util.Enumeration valueOf2 = setcursorvisible.valueOf();
        int i5 = AlternateContactlessPaymentDataJson;
        int i6 = i5 & 3;
        int i7 = ((i5 ^ 3) | i6) << 1;
        int i8 = -((i5 | 3) & (~i6));
        valueOf = ((i7 ^ i8) + ((i8 & i7) << 1)) % 128;
        while (valueOf2.hasMoreElements()) {
            int i9 = AlternateContactlessPaymentDataJson;
            int i10 = i9 & 43;
            int i11 = i9 | 43;
            int i12 = (i10 & i11) + (i11 | i10);
            valueOf = i12 % 128;
            if (i12 % 2 == 0) {
                AlternateContactlessPaymentDataJson2.DigitizedCardProfile((com.payair.hce.setShadowLayer) valueOf2.nextElement());
                valueOf = (AlternateContactlessPaymentDataJson + 69) % 128;
            } else {
                AlternateContactlessPaymentDataJson2.DigitizedCardProfile((com.payair.hce.setShadowLayer) valueOf2.nextElement());
                throw null;
            }
        }
        int i13 = valueOf;
        int i14 = (((i13 & (-52)) | ((~i13) & 51)) - (~((i13 & 51) << 1))) - 1;
        AlternateContactlessPaymentDataJson = i14 % 128;
        if (i14 % 2 != 0) {
            return null;
        }
        throw null;
    }

    @Override // com.payair.hce.setWidth, com.payair.hce.setEms
    final void values(com.payair.hce.setMaxLines setmaxlines) throws java.io.IOException {
        AlternateContactlessPaymentDataJson(new java.lang.Object[]{this, setmaxlines}, -2089409850, 2089409852, java.lang.System.identityHashCode(this));
    }

    @Override // com.payair.hce.setEms
    final int AlternateContactlessPaymentDataJson() throws java.io.IOException {
        return ((java.lang.Integer) AlternateContactlessPaymentDataJson(new java.lang.Object[]{this}, -427142012, 427142012, java.lang.System.identityHashCode(this))).intValue();
    }

    private int values() throws java.io.IOException {
        return ((java.lang.Integer) AlternateContactlessPaymentDataJson(new java.lang.Object[]{this}, -890711338, 890711339, java.lang.System.identityHashCode(this))).intValue();
    }
}
