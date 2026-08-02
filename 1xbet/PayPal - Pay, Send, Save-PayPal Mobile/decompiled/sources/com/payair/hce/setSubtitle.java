package com.payair.hce;

/* loaded from: classes4.dex */
public final class setSubtitle extends com.payair.hce.setWidth {
    private static int valueOf = 0;
    private static int values = 1;
    private int DigitizedCardProfile;

    public static /* synthetic */ java.lang.Object valueOf(java.lang.Object[] objArr, int i, int i2, int i3) {
        int i4 = ~i;
        int i5 = ~i3;
        int i6 = ~(i4 | i2);
        int i7 = (i * 398) + (i2 * (-396)) + (((~(i4 | i5)) | i6 | (~(i5 | i2))) * (-397)) + (i6 * (-397)) + (((~(i | (~i2))) | i3 | i6) * 397);
        if (i7 == 1) {
            return values(objArr);
        }
        if (i7 == 2) {
            return DigitizedCardProfile(objArr);
        }
        com.payair.hce.setSubtitle setsubtitle = (com.payair.hce.setSubtitle) objArr[0];
        valueOf = (values + 47) % 128;
        int intValue = ((java.lang.Integer) valueOf(new java.lang.Object[]{setsubtitle}, -947085921, 947085922, java.lang.System.identityHashCode(setsubtitle))).intValue();
        int intValue2 = ((java.lang.Integer) com.payair.hce.setNavigationIcon.DigitizedCardProfile(new java.lang.Object[]{java.lang.Integer.valueOf(intValue)}, -1174070258, 1174070259, intValue)).intValue();
        int i8 = ((~intValue2) & 1) | (intValue2 & (-2));
        int i9 = (intValue2 & 1) << 1;
        int i10 = ((i8 | i9) << 1) - (i9 ^ i8);
        int identityHashCode = java.lang.System.identityHashCode(setsubtitle);
        int i11 = (intValue * lib.android.paypal.com.magnessdk.g.e) + (i10 * 407);
        int i12 = ~i10;
        int i13 = (i12 | i10) & i12;
        int i14 = ~identityHashCode;
        int i15 = (i13 & i14) | ((~i13) & identityHashCode);
        int i16 = i13 & identityHashCode;
        int i17 = ~((i16 ^ i15) | (i16 & i15));
        int i18 = (i14 | identityHashCode) & i14;
        int i19 = ~intValue;
        int i20 = ((~i18) & intValue) | (i18 & i19) | (i18 & intValue);
        int i21 = (i20 & i12) | ((~i20) & i10);
        int i22 = i20 & i10;
        int i23 = ~((i22 ^ i21) | (i22 & i21));
        int i24 = -(-(((i17 ^ i23) | (i17 & i23)) * (-406)));
        int i25 = i11 & i24;
        int i26 = (((i11 ^ i24) | i25) << 1) - ((i11 | i24) & (~i25));
        int i27 = (i12 ^ i14) | (i12 & i14);
        int i28 = (i27 & i19) | ((~i27) & intValue);
        int i29 = i27 & intValue;
        int i30 = (~((i29 ^ i28) | (i29 & i28))) * (-406);
        int i31 = (i26 & i30) + (i30 | i26);
        int i32 = (intValue | i19) & i19;
        int i33 = (i32 & i14) | ((~i32) & identityHashCode);
        int i34 = identityHashCode & i32;
        int i35 = ~((i34 ^ i33) | (i34 & i33));
        int i36 = i14 ^ i10;
        int i37 = i14 & i10;
        int i38 = (i36 ^ i37) | (i36 & i37);
        int i39 = ~i38;
        int i40 = (i38 | i39) & i39;
        int i41 = i35 & i40;
        int i42 = (i35 | i40) & (~i41);
        int i43 = -(-(((i42 ^ i41) | (i42 & i41)) * 406));
        valueOf = (values + 93) % 128;
        return java.lang.Integer.valueOf((i31 ^ i43) + ((i43 & i31) << 1));
    }

    public setSubtitle() {
        this.DigitizedCardProfile = -1;
    }

    public setSubtitle(com.payair.hce.setHintTextColor sethinttextcolor) {
        super(sethinttextcolor, false);
        this.DigitizedCardProfile = -1;
    }

    private static /* synthetic */ java.lang.Object values(java.lang.Object[] objArr) {
        int i = 0;
        com.payair.hce.setSubtitle setsubtitle = (com.payair.hce.setSubtitle) objArr[0];
        int i2 = valueOf;
        int i3 = i2 ^ 121;
        int i4 = -(-((i2 & 121) << 1));
        int i5 = (i3 & i4) + (i3 | i4);
        values = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = setsubtitle.DigitizedCardProfile;
            throw null;
        }
        if (setsubtitle.DigitizedCardProfile < 0) {
            int i7 = ((i2 ^ 41) | (i2 & 41)) << 1;
            int i8 = -((i2 & (-42)) | ((~i2) & 41));
            values = ((i7 & i8) + (i8 | i7)) % 128;
            java.util.Enumeration valueOf2 = setsubtitle.valueOf();
            int i9 = values;
            valueOf = ((i9 & 79) + (i9 | 79)) % 128;
            while (valueOf2.hasMoreElements()) {
                int i10 = valueOf;
                values = (((i10 | 115) << 1) - (i10 ^ 115)) % 128;
                int AlternateContactlessPaymentDataJson = ((com.payair.hce.setShadowLayer) valueOf2.nextElement()).getAid().IccPrivateKeyCrtComponentsJson().AlternateContactlessPaymentDataJson();
                int identityHashCode = java.lang.System.identityHashCode(setsubtitle);
                int i11 = AlternateContactlessPaymentDataJson * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_SEARCH_CIRCLE_VALUE;
                int i12 = -(-(i * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_SEARCH_CIRCLE_VALUE));
                int i13 = i11 & i12;
                int i14 = ((((i11 ^ i12) | i13) << 1) - (~(-((i11 | i12) & (~i13))))) - 1;
                int i15 = ~AlternateContactlessPaymentDataJson;
                int i16 = ~i;
                int i17 = (i16 & i15) | (i15 ^ i16);
                int i18 = ~i17;
                int i19 = (i17 | i18) & i18;
                int i20 = ~identityHashCode;
                int i21 = i16 & i20;
                int i22 = (i20 | i16) & (~i21);
                int i23 = (i22 ^ i21) | (i22 & i21);
                int i24 = ~i23;
                int i25 = i19 ^ i24;
                int i26 = i19 & i24;
                int i27 = (i26 ^ i25) | (i26 & i25);
                int i28 = (i15 & i) | (i16 & AlternateContactlessPaymentDataJson);
                int i29 = AlternateContactlessPaymentDataJson & i;
                int i30 = (i28 ^ i29) | (i28 & i29);
                int i31 = ~((i30 ^ identityHashCode) | (i30 & identityHashCode));
                int i32 = i27 & i31;
                int i33 = (i31 | i27) & (~i32);
                int i34 = -(-(((i33 ^ i32) | (i33 & i32)) * (-252)));
                int i35 = (i14 & i34) + (i34 | i14);
                int i36 = (~i29) & (AlternateContactlessPaymentDataJson | i);
                int i37 = -(~(((i36 ^ i29) | (i36 & i29)) * (-252)));
                int i38 = (-2) - (~((i35 ^ i37) + ((i37 & i35) << 1)));
                int i39 = i23 ^ AlternateContactlessPaymentDataJson;
                int i40 = i23 & AlternateContactlessPaymentDataJson;
                int i41 = (i39 ^ i40) | (i40 & i39);
                int i42 = ~i41;
                int i43 = (i41 | i42) & i42;
                int i44 = (i ^ AlternateContactlessPaymentDataJson) | i29;
                int i45 = i44 ^ identityHashCode;
                int i46 = i44 & identityHashCode;
                int i47 = ~((i46 ^ i45) | (i46 & i45));
                int i48 = i43 ^ i47;
                int i49 = i47 & i43;
                int i50 = ((i49 ^ i48) | (i49 & i48)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_CONFIRMED_CIRCLE_VALUE;
                int i51 = i38 ^ i50;
                int i52 = (i50 & i38) << 1;
                i = (i52 & i51) + (i52 | i51);
                int i53 = values;
                int i54 = i53 & 105;
                int i55 = (i53 ^ 105) | i54;
                valueOf = ((i54 & i55) + (i55 | i54)) % 128;
            }
            setsubtitle.DigitizedCardProfile = i;
            int i56 = values;
            valueOf = ((i56 & 3) + (i56 | 3)) % 128;
        }
        int i57 = setsubtitle.DigitizedCardProfile;
        int i58 = values;
        valueOf = ((i58 ^ 21) + ((i58 & 21) << 1)) % 128;
        return java.lang.Integer.valueOf(i57);
    }

    private static /* synthetic */ java.lang.Object DigitizedCardProfile(java.lang.Object[] objArr) {
        com.payair.hce.setMaxLines valueOf2;
        int intValue;
        int i;
        com.payair.hce.setSubtitle setsubtitle = (com.payair.hce.setSubtitle) objArr[0];
        com.payair.hce.setMaxLines setmaxlines = (com.payair.hce.setMaxLines) objArr[1];
        int i2 = values;
        int i3 = i2 & 37;
        int i4 = ((((i2 ^ 37) | i3) << 1) - (~(-((i2 | 37) & (~i3))))) - 1;
        valueOf = i4 % 128;
        if (i4 % 2 != 0) {
            valueOf2 = setmaxlines.valueOf();
            intValue = ((java.lang.Integer) valueOf(new java.lang.Object[]{setsubtitle}, -947085921, 947085922, java.lang.System.identityHashCode(setsubtitle))).intValue();
            i = 125;
        } else {
            valueOf2 = setmaxlines.valueOf();
            intValue = ((java.lang.Integer) valueOf(new java.lang.Object[]{setsubtitle}, -947085921, 947085922, java.lang.System.identityHashCode(setsubtitle))).intValue();
            i = 49;
        }
        setmaxlines.DigitizedCardProfile(i);
        setmaxlines.AlternateContactlessPaymentDataJson(intValue);
        java.util.Enumeration valueOf3 = setsubtitle.valueOf();
        while (valueOf3.hasMoreElements()) {
            int i5 = values;
            int i6 = i5 & 5;
            int i7 = ((i5 ^ 5) | i6) << 1;
            int i8 = -((i5 | 5) & (~i6));
            valueOf = (((i7 | i8) << 1) - (i8 ^ i7)) % 128;
            valueOf2.DigitizedCardProfile((com.payair.hce.setShadowLayer) valueOf3.nextElement());
            int i9 = values;
            valueOf = (((i9 | 119) << 1) - (i9 ^ 119)) % 128;
        }
        int i10 = valueOf;
        int i11 = ((i10 ^ 114) + ((i10 & 114) << 1)) - 1;
        values = i11 % 128;
        if (i11 % 2 != 0) {
            return null;
        }
        throw null;
    }

    @Override // com.payair.hce.setWidth, com.payair.hce.setEms
    final void values(com.payair.hce.setMaxLines setmaxlines) throws java.io.IOException {
        valueOf(new java.lang.Object[]{this, setmaxlines}, -2043022062, 2043022064, java.lang.System.identityHashCode(this));
    }

    @Override // com.payair.hce.setEms
    final int AlternateContactlessPaymentDataJson() throws java.io.IOException {
        return ((java.lang.Integer) valueOf(new java.lang.Object[]{this}, 811296426, -811296426, java.lang.System.identityHashCode(this))).intValue();
    }

    private int values() throws java.io.IOException {
        return ((java.lang.Integer) valueOf(new java.lang.Object[]{this}, -947085921, 947085922, java.lang.System.identityHashCode(this))).intValue();
    }
}
