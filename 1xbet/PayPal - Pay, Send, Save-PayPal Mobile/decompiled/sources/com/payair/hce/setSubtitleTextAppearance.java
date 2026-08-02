package com.payair.hce;

/* loaded from: classes4.dex */
public final class setSubtitleTextAppearance extends com.payair.hce.setFocusedSearchResultIndex {
    private static int AlternateContactlessPaymentDataJson = 0;
    private static int RecordsJson = 47;

    public static /* synthetic */ java.lang.Object DigitizedCardProfile(java.lang.Object[] objArr, int i, int i2, int i3) {
        int i4 = ~((~i2) | i);
        int i5 = ~(i3 | i);
        int i6 = (i * 659) + (i2 * (-657)) + (((~((~i) | i2)) | i4 | i5) * (-658)) + (i4 * 658) + ((i5 | i4) * 658);
        return i6 != 1 ? i6 != 2 ? values(objArr) : writeReplace(objArr) : AlternateContactlessPaymentDataJson(objArr);
    }

    public setSubtitleTextAppearance(boolean z, int i, com.payair.hce.setShadowLayer setshadowlayer) {
        super(z, i, setshadowlayer);
    }

    private static /* synthetic */ java.lang.Object AlternateContactlessPaymentDataJson(java.lang.Object[] objArr) {
        com.payair.hce.setSubtitleTextAppearance setsubtitletextappearance = (com.payair.hce.setSubtitleTextAppearance) objArr[0];
        int i = RecordsJson;
        int i2 = i & 103;
        AlternateContactlessPaymentDataJson = (i2 + ((i ^ 103) | i2)) % 128;
        boolean z = setsubtitletextappearance.valueOf;
        if (setsubtitletextappearance.writeReplace) {
            int i3 = RecordsJson;
            int i4 = i3 & 17;
            int i5 = i4 + ((i3 ^ 17) | i4);
            AlternateContactlessPaymentDataJson = i5 % 128;
            boolean z2 = i5 % 2 == 0;
            int i6 = i3 + 103;
            AlternateContactlessPaymentDataJson = i6 % 128;
            if (i6 % 2 == 0) {
                return java.lang.Boolean.valueOf(z2);
            }
            throw null;
        }
        boolean writeReplace = setsubtitletextappearance.values.getAid().IccPrivateKeyCrtComponentsJson().writeReplace();
        int i7 = RecordsJson;
        int i8 = ((i7 ^ 5) | (i7 & 5)) << 1;
        int i9 = -((i7 & (-6)) | ((~i7) & 5));
        AlternateContactlessPaymentDataJson = (((i8 | i9) << 1) - (i9 ^ i8)) % 128;
        return java.lang.Boolean.valueOf(writeReplace);
    }

    private static /* synthetic */ java.lang.Object writeReplace(java.lang.Object[] objArr) {
        int i;
        com.payair.hce.setSubtitleTextAppearance setsubtitletextappearance = (com.payair.hce.setSubtitleTextAppearance) objArr[0];
        int i2 = AlternateContactlessPaymentDataJson;
        RecordsJson = ((-2) - (~((i2 ^ 20) + ((i2 & 20) << 1)))) % 128;
        boolean z = setsubtitletextappearance.valueOf;
        int AlternateContactlessPaymentDataJson2 = setsubtitletextappearance.values.getAid().IccPrivateKeyCrtComponentsJson().AlternateContactlessPaymentDataJson();
        if (setsubtitletextappearance.writeReplace) {
            int i3 = RecordsJson;
            int i4 = i3 & 73;
            AlternateContactlessPaymentDataJson = (i4 + ((i3 ^ 73) | i4)) % 128;
            int i5 = setsubtitletextappearance.DigitizedCardProfile;
            int intValue = ((java.lang.Integer) com.payair.hce.setNavigationIcon.DigitizedCardProfile(new java.lang.Object[]{java.lang.Integer.valueOf(i5)}, -334301909, 334301909, i5)).intValue();
            int intValue2 = ((java.lang.Integer) com.payair.hce.setNavigationIcon.DigitizedCardProfile(new java.lang.Object[]{java.lang.Integer.valueOf(AlternateContactlessPaymentDataJson2)}, -1174070258, 1174070259, AlternateContactlessPaymentDataJson2)).intValue();
            int i6 = intValue & intValue2;
            int i7 = (intValue ^ intValue2) | i6;
            int i8 = (i6 & i7) + (i7 | i6);
            int identityHashCode = java.lang.System.identityHashCode(setsubtitletextappearance);
            int i9 = AlternateContactlessPaymentDataJson2 * (-515);
            int i10 = -(~(-(-(i8 * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_INVALID_CERTIFICATE))));
            int i11 = (((i9 | i10) << 1) - (i9 ^ i10)) - 1;
            int i12 = ~i8;
            int i13 = (i12 | i8) & i12;
            int i14 = i13 ^ identityHashCode;
            int i15 = ~identityHashCode;
            int i16 = i13 & identityHashCode;
            int i17 = ~((i16 ^ i14) | (i16 & i14));
            int i18 = i15 & AlternateContactlessPaymentDataJson2;
            int i19 = ~(i18 | ((~i18) & (i15 | AlternateContactlessPaymentDataJson2)));
            int i20 = (i17 ^ i19) | (i17 & i19);
            int i21 = (i15 & i12) | ((~i15) & i8);
            int i22 = i15 & i8;
            int i23 = (i21 ^ i22) | (i21 & i22);
            int i24 = ~i23;
            int i25 = (i23 | i24) & i24;
            int i26 = -(-(((i20 ^ i25) | (i20 & i25)) * (-516)));
            int i27 = i11 & i26;
            int i28 = (i26 ^ i11) | i27;
            int i29 = (i27 & i28) + (i28 | i27);
            int i30 = ~AlternateContactlessPaymentDataJson2;
            int i31 = ((~i12) & i30) | ((~i30) & i12);
            int i32 = i12 & i30;
            int i33 = (i31 ^ i32) | (i32 & i31);
            int i34 = (i33 & i15) | ((~i33) & identityHashCode);
            int i35 = i33 & identityHashCode;
            int i36 = ~((i35 ^ i34) | (i35 & i34));
            int i37 = (AlternateContactlessPaymentDataJson2 | i30) & i30;
            int i38 = (i15 & i37) | (i37 ^ i15);
            int i39 = i38 ^ i8;
            int i40 = i38 & i8;
            int i41 = ~((i40 ^ i39) | (i40 & i39));
            int i42 = ((~i41) & i36) | ((~i36) & i41);
            int i43 = i41 & i36;
            int i44 = -(-(((i43 ^ i42) | (i43 & i42)) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_CRYPTO_ERROR));
            int i45 = i29 ^ i44;
            int i46 = (((i44 & i29) | i45) << 1) - i45;
            int i47 = (i12 & i37) | ((~i37) & i8);
            int i48 = i37 & i8;
            int i49 = (i48 ^ i47) | (i48 & i47);
            int i50 = ~i49;
            int i51 = (i49 | i50) & i50;
            int i52 = (identityHashCode | i15) & i15;
            int i53 = i52 & i8;
            int i54 = (i52 | i8) & (~i53);
            int i55 = (i54 ^ i53) | (i54 & i53);
            int i56 = ~i55;
            int i57 = (i55 | i56) & i56;
            int i58 = -(-(((i57 ^ i51) | (i57 & i51)) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_CRYPTO_ERROR));
            int i59 = RecordsJson;
            int i60 = (i59 & (-6)) | ((~i59) & 5);
            int i61 = (i59 & 5) << 1;
            int i62 = ((i60 | i61) << 1) - (i61 ^ i60);
            AlternateContactlessPaymentDataJson = i62 % 128;
            if (i62 % 2 != 0) {
                throw null;
            }
            i = ((i46 ^ i58) - (~((i58 & i46) << 1))) - 1;
        } else {
            int i63 = (-2) - (~AlternateContactlessPaymentDataJson2);
            int i64 = setsubtitletextappearance.DigitizedCardProfile;
            int intValue3 = ((java.lang.Integer) com.payair.hce.setNavigationIcon.DigitizedCardProfile(new java.lang.Object[]{java.lang.Integer.valueOf(i64)}, -334301909, 334301909, i64)).intValue();
            int i65 = (intValue3 | i63) << 1;
            int i66 = -(intValue3 ^ i63);
            int i67 = RecordsJson;
            AlternateContactlessPaymentDataJson = ((-2) - (~((i67 & 102) + (i67 | 102)))) % 128;
            i = (i65 & i66) + (i66 | i65);
        }
        return java.lang.Integer.valueOf(i);
    }

    private static /* synthetic */ java.lang.Object values(java.lang.Object[] objArr) {
        com.payair.hce.setSubtitleTextAppearance setsubtitletextappearance = (com.payair.hce.setSubtitleTextAppearance) objArr[0];
        com.payair.hce.setMaxLines setmaxlines = (com.payair.hce.setMaxLines) objArr[1];
        int i = AlternateContactlessPaymentDataJson;
        int i2 = i & 45;
        int i3 = (i ^ 45) | i2;
        int i4 = ((i2 | i3) << 1) - (i3 ^ i2);
        int i5 = 128;
        RecordsJson = i4 % 128;
        boolean z = setsubtitletextappearance.valueOf;
        com.payair.hce.setEms IccPrivateKeyCrtComponentsJson = setsubtitletextappearance.values.getAid().IccPrivateKeyCrtComponentsJson();
        if (setsubtitletextappearance.writeReplace) {
            int i6 = RecordsJson + 75;
            AlternateContactlessPaymentDataJson = i6 % 128;
            if (i6 % 2 != 0) {
                com.payair.hce.setMaxLines.DigitizedCardProfile(new java.lang.Object[]{setmaxlines, 3452, java.lang.Integer.valueOf(setsubtitletextappearance.DigitizedCardProfile)}, -584468000, 584468000, 3452);
            } else {
                com.payair.hce.setMaxLines.DigitizedCardProfile(new java.lang.Object[]{setmaxlines, 160, java.lang.Integer.valueOf(setsubtitletextappearance.DigitizedCardProfile)}, -584468000, 584468000, 160);
            }
            setmaxlines.AlternateContactlessPaymentDataJson(IccPrivateKeyCrtComponentsJson.AlternateContactlessPaymentDataJson());
            setmaxlines.DigitizedCardProfile(IccPrivateKeyCrtComponentsJson);
            int i7 = AlternateContactlessPaymentDataJson;
            RecordsJson = ((i7 ^ 113) + ((i7 & 113) << 1)) % 128;
            return null;
        }
        if (IccPrivateKeyCrtComponentsJson.writeReplace()) {
            int i8 = AlternateContactlessPaymentDataJson;
            int i9 = i8 ^ 91;
            int i10 = -(-((i8 & 91) << 1));
            int i11 = (i9 ^ i10) + ((i10 & i9) << 1);
            RecordsJson = i11 % 128;
            i5 = i11 % 2 == 0 ? 12413 : 160;
        } else {
            int i12 = RecordsJson;
            int i13 = i12 & 101;
            int i14 = (i12 | 101) & (~i13);
            int i15 = -(-(i13 << 1));
            AlternateContactlessPaymentDataJson = ((i14 ^ i15) + ((i14 & i15) << 1)) % 128;
        }
        com.payair.hce.setMaxLines.DigitizedCardProfile(new java.lang.Object[]{setmaxlines, java.lang.Integer.valueOf(i5), java.lang.Integer.valueOf(setsubtitletextappearance.DigitizedCardProfile)}, -584468000, 584468000, i5);
        setmaxlines.values(IccPrivateKeyCrtComponentsJson);
        int i16 = RecordsJson + 35;
        AlternateContactlessPaymentDataJson = i16 % 128;
        if (i16 % 2 == 0) {
            return null;
        }
        throw null;
    }

    @Override // com.payair.hce.setFocusedSearchResultIndex, com.payair.hce.setEms
    final void values(com.payair.hce.setMaxLines setmaxlines) throws java.io.IOException {
        DigitizedCardProfile(new java.lang.Object[]{this, setmaxlines}, 1508612580, -1508612580, java.lang.System.identityHashCode(this));
    }

    @Override // com.payair.hce.setEms
    final int AlternateContactlessPaymentDataJson() throws java.io.IOException {
        return ((java.lang.Integer) DigitizedCardProfile(new java.lang.Object[]{this}, -1928486828, 1928486830, java.lang.System.identityHashCode(this))).intValue();
    }

    @Override // com.payair.hce.setEms
    final boolean writeReplace() {
        return ((java.lang.Boolean) DigitizedCardProfile(new java.lang.Object[]{this}, 1307889002, -1307889001, java.lang.System.identityHashCode(this))).booleanValue();
    }
}
