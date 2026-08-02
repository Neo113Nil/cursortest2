package com.payair.hce;

/* loaded from: classes4.dex */
public final class setTitleMarginBottom extends com.payair.hce.setMaxEms {
    private static int AlternateContactlessPaymentDataJson = 0;
    private static int DigitizedCardProfile = 1;
    private int writeReplace;

    public static /* synthetic */ java.lang.Object valueOf(java.lang.Object[] objArr, int i, int i2, int i3) {
        com.payair.hce.setMaxLines valueOf;
        int intValue;
        int i4;
        int i5 = ~i;
        int i6 = ~i3;
        int i7 = ~(i | i2);
        int i8 = (~i2) | i5;
        int i9 = (i * (-716)) + (i2 * 1435) + ((i5 | i2) * (-1434)) + (((~(i6 | i2)) | i7 | (~(i8 | i3))) * 717) + (((~(i2 | i3)) | (~(i8 | i6)) | i7) * 717);
        int i10 = 0;
        if (i9 != 1) {
            if (i9 != 2) {
                return AlternateContactlessPaymentDataJson(objArr);
            }
            com.payair.hce.setTitleMarginBottom settitlemarginbottom = (com.payair.hce.setTitleMarginBottom) objArr[0];
            com.payair.hce.setMaxLines setmaxlines = (com.payair.hce.setMaxLines) objArr[1];
            int i11 = (-2) - (~(AlternateContactlessPaymentDataJson + 56));
            DigitizedCardProfile = i11 % 128;
            if (i11 % 2 == 0) {
                valueOf = setmaxlines.valueOf();
                intValue = ((java.lang.Integer) valueOf(new java.lang.Object[]{settitlemarginbottom}, 726349305, -726349304, java.lang.System.identityHashCode(settitlemarginbottom))).intValue();
                i4 = 21;
            } else {
                valueOf = setmaxlines.valueOf();
                intValue = ((java.lang.Integer) valueOf(new java.lang.Object[]{settitlemarginbottom}, 726349305, -726349304, java.lang.System.identityHashCode(settitlemarginbottom))).intValue();
                i4 = 48;
            }
            setmaxlines.DigitizedCardProfile(i4);
            setmaxlines.AlternateContactlessPaymentDataJson(intValue);
            java.util.Enumeration values = settitlemarginbottom.values();
            while (values.hasMoreElements()) {
                int i12 = AlternateContactlessPaymentDataJson;
                int i13 = (i12 & androidx.media3.common.PlaybackException.ERROR_CODE_CONTENT_ALREADY_PLAYING) | ((~i12) & 109);
                int i14 = -(-((i12 & 109) << 1));
                DigitizedCardProfile = ((i13 ^ i14) + ((i14 & i13) << 1)) % 128;
                valueOf.DigitizedCardProfile((com.payair.hce.setShadowLayer) values.nextElement());
                int i15 = DigitizedCardProfile;
                AlternateContactlessPaymentDataJson = ((i15 & 113) + (i15 | 113)) % 128;
            }
            int i16 = DigitizedCardProfile;
            int i17 = i16 & com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE;
            AlternateContactlessPaymentDataJson = (i17 + ((i16 ^ com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) | i17)) % 128;
            return null;
        }
        com.payair.hce.setTitleMarginBottom settitlemarginbottom2 = (com.payair.hce.setTitleMarginBottom) objArr[0];
        int i18 = (DigitizedCardProfile + 59) % 128;
        AlternateContactlessPaymentDataJson = i18;
        if (settitlemarginbottom2.writeReplace < 0) {
            int i19 = i18 & 7;
            int i20 = (i18 ^ 7) | i19;
            DigitizedCardProfile = (((i19 | i20) << 1) - (i20 ^ i19)) % 128;
            java.util.Enumeration values2 = settitlemarginbottom2.values();
            int i21 = DigitizedCardProfile;
            AlternateContactlessPaymentDataJson = (((i21 | 17) << 1) - (i21 ^ 17)) % 128;
            while (values2.hasMoreElements()) {
                int i22 = DigitizedCardProfile + 83;
                AlternateContactlessPaymentDataJson = i22 % 128;
                if (i22 % 2 != 0) {
                    i10 /= ((com.payair.hce.setShadowLayer) values2.nextElement()).getAid().IccPrivateKeyCrtComponentsJson().AlternateContactlessPaymentDataJson();
                } else {
                    int AlternateContactlessPaymentDataJson2 = ((com.payair.hce.setShadowLayer) values2.nextElement()).getAid().IccPrivateKeyCrtComponentsJson().AlternateContactlessPaymentDataJson();
                    int i23 = (i10 | AlternateContactlessPaymentDataJson2) << 1;
                    int i24 = -((i10 & (~AlternateContactlessPaymentDataJson2)) | ((~i10) & AlternateContactlessPaymentDataJson2));
                    i10 = ((i23 | i24) << 1) - (i24 ^ i23);
                }
                int i25 = AlternateContactlessPaymentDataJson + 84;
                DigitizedCardProfile = ((~i25) + (i25 << 1)) % 128;
            }
            settitlemarginbottom2.writeReplace = i10;
            int i26 = AlternateContactlessPaymentDataJson;
            DigitizedCardProfile = ((i26 & 11) + (i26 | 11)) % 128;
        }
        int i27 = settitlemarginbottom2.writeReplace;
        int i28 = AlternateContactlessPaymentDataJson;
        DigitizedCardProfile = ((i28 & 65) + (i28 | 65)) % 128;
        return java.lang.Integer.valueOf(i27);
    }

    public setTitleMarginBottom() {
        this.writeReplace = -1;
    }

    public setTitleMarginBottom(com.payair.hce.setHintTextColor sethinttextcolor) {
        super(sethinttextcolor);
        this.writeReplace = -1;
    }

    private static /* synthetic */ java.lang.Object AlternateContactlessPaymentDataJson(java.lang.Object[] objArr) {
        com.payair.hce.setTitleMarginBottom settitlemarginbottom = (com.payair.hce.setTitleMarginBottom) objArr[0];
        int i = AlternateContactlessPaymentDataJson;
        DigitizedCardProfile = ((i & 39) + (i | 39)) % 128;
        int intValue = ((java.lang.Integer) valueOf(new java.lang.Object[]{settitlemarginbottom}, 726349305, -726349304, java.lang.System.identityHashCode(settitlemarginbottom))).intValue();
        int intValue2 = ((java.lang.Integer) com.payair.hce.setNavigationIcon.DigitizedCardProfile(new java.lang.Object[]{java.lang.Integer.valueOf(intValue)}, -1174070258, 1174070259, intValue)).intValue();
        int identityHashCode = java.lang.System.identityHashCode(settitlemarginbottom);
        int i2 = intValue2 * 483;
        int i3 = (i2 ^ com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ACCOUNT_NUMBER_SEARCH_VALUE) + ((i2 & com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ACCOUNT_NUMBER_SEARCH_VALUE) << 1);
        int i4 = (~i3) + (i3 << 1);
        int i5 = ~intValue2;
        int i6 = i5 & 1;
        int i7 = ((~i5) & (-2)) | i6;
        int i8 = i5 & (-2);
        int i9 = ~((i7 ^ i8) | (i7 & i8));
        int i10 = (i5 | intValue2) & i5;
        int i11 = ~identityHashCode;
        int i12 = ((~i11) & i10) | ((~i10) & i11);
        int i13 = i10 & i11;
        int i14 = ~((i13 ^ i12) | (i13 & i12));
        int i15 = i9 & i14;
        int i16 = (i9 | i14) & (~i15);
        int i17 = -(-(((i16 ^ i15) | (i16 & i15)) * (-241)));
        int i18 = i4 & i17;
        int i19 = (i4 | i17) & (~i18);
        int i20 = -(-(i18 << 1));
        int i21 = (i19 & i20) + (i19 | i20);
        int i22 = intValue2 & (-2);
        int i23 = i6 | i22;
        int i24 = intValue2 & 1;
        int i25 = -(-(((i23 ^ i24) | (i23 & i24)) * (-482)));
        int i26 = i21 & i25;
        int i27 = (i25 | i21) & (~i26);
        int i28 = -(-(i26 << 1));
        int i29 = (i27 ^ i28) + ((i27 & i28) << 1);
        int i30 = (intValue2 | (-2)) & (~i22);
        int i31 = (i30 ^ i22) | (i30 & i22);
        int i32 = ~i31;
        int i33 = (i31 | i32) & i32;
        int i34 = i5 & i11;
        int i35 = (i11 | i5) & (~i34);
        int i36 = (i35 ^ i34) | (i35 & i34);
        int i37 = (i36 ^ 1) | (i36 & 1);
        int i38 = ~i37;
        int i39 = (i37 | i38) & i38;
        int i40 = ((i39 ^ i33) | (i39 & i33)) * 241;
        int i41 = ((i29 ^ i40) | (i29 & i40)) << 1;
        int i42 = -(((~i40) & i29) | ((~i29) & i40));
        int i43 = ((i41 | i42) << 1) - (i42 ^ i41);
        int i44 = -(-intValue);
        int i45 = i43 ^ i44;
        int i46 = (i44 & i43) << 1;
        int i47 = (i45 & i46) + (i46 | i45);
        int i48 = DigitizedCardProfile + 116;
        int i49 = (~i48) + (i48 << 1);
        AlternateContactlessPaymentDataJson = i49 % 128;
        if (i49 % 2 == 0) {
            return java.lang.Integer.valueOf(i47);
        }
        throw new java.lang.ArithmeticException();
    }

    @Override // com.payair.hce.setMaxEms, com.payair.hce.setEms
    final void values(com.payair.hce.setMaxLines setmaxlines) throws java.io.IOException {
        valueOf(new java.lang.Object[]{this, setmaxlines}, -1553590401, 1553590403, java.lang.System.identityHashCode(this));
    }

    @Override // com.payair.hce.setEms
    final int AlternateContactlessPaymentDataJson() throws java.io.IOException {
        return ((java.lang.Integer) valueOf(new java.lang.Object[]{this}, 495101564, -495101564, java.lang.System.identityHashCode(this))).intValue();
    }

    private int RecordsJson() throws java.io.IOException {
        return ((java.lang.Integer) valueOf(new java.lang.Object[]{this}, 726349305, -726349304, java.lang.System.identityHashCode(this))).intValue();
    }
}
