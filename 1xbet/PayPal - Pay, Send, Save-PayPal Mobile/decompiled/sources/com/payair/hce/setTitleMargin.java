package com.payair.hce;

/* loaded from: classes4.dex */
public final class setTitleMargin extends com.payair.hce.setEms {
    private static int AlternateContactlessPaymentDataJson = 0;
    private static int valueOf = 1;
    private final byte[] values;

    public static /* synthetic */ java.lang.Object DigitizedCardProfile(java.lang.Object[] objArr, int i, int i2, int i3) {
        int i4 = ~i;
        int i5 = (i * 236) + (i2 * 471) + (((~((~i3) | i4)) | i2) * (-235)) + (((~(i4 | i3)) | i2) * (-470)) + (((~(i | (~i2))) | (~(i2 | i4 | i3))) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_INSTITUTION_LINK_CIRCLE_VALUE);
        if (i5 == 1) {
            return valueOf(objArr);
        }
        if (i5 == 2) {
            return writeReplace(objArr);
        }
        if (i5 == 3) {
            return DigitizedCardProfile(objArr);
        }
        if (i5 != 4) {
            return values(objArr);
        }
        int i6 = AlternateContactlessPaymentDataJson;
        int i7 = (((i6 ^ 12) + ((i6 & 12) << 1)) - 1) % 128;
        valueOf = i7;
        AlternateContactlessPaymentDataJson = ((i7 ^ 79) + ((i7 & 79) << 1)) % 128;
        return java.lang.Boolean.FALSE;
    }

    public setTitleMargin(byte[] bArr) {
        this.values = com.payair.hce.getClientVersion.values(bArr);
    }

    private static /* synthetic */ java.lang.Object values(java.lang.Object[] objArr) {
        com.payair.hce.setTitleMargin settitlemargin = (com.payair.hce.setTitleMargin) objArr[0];
        int i = valueOf;
        AlternateContactlessPaymentDataJson = (((i & (-46)) | ((~i) & 45)) + ((i & 45) << 1)) % 128;
        int length = settitlemargin.values.length;
        int intValue = ((java.lang.Integer) com.payair.hce.setNavigationIcon.DigitizedCardProfile(new java.lang.Object[]{java.lang.Integer.valueOf(length)}, -1174070258, 1174070259, length)).intValue();
        int identityHashCode = java.lang.System.identityHashCode(settitlemargin);
        int i2 = intValue * (-103);
        int i3 = ~intValue;
        int i4 = ~(((~i3) & (-2)) | (i3 & 1) | (i3 & (-2)));
        int i5 = identityHashCode & (-2);
        int i6 = (~i5) & (identityHashCode | (-2));
        int i7 = ~((i5 ^ i6) | (i5 & i6));
        int i8 = ((~i7) & i4) | ((~i4) & i7);
        int i9 = i4 & i7;
        int i10 = ((((i2 & (-103)) - (~(i2 | (-103)))) - 1) - (~(((i9 & i8) | (i9 ^ i8)) * 104))) - 1;
        int i11 = ~identityHashCode;
        int i12 = i11 ^ intValue;
        int i13 = i11 & intValue;
        int i14 = (i13 ^ i12) | (i13 & i12);
        int i15 = i14 ^ 1;
        int i16 = i14 & 1;
        int i17 = (i16 ^ i15) | (i16 & i15);
        int i18 = ~i17;
        int i19 = -(~(-(-(((i17 | i18) & i18) * (-104)))));
        int i20 = (((i10 | i19) << 1) - (i19 ^ i10)) - 1;
        int i21 = intValue & identityHashCode;
        int i22 = (intValue | identityHashCode) & (~i21);
        int i23 = ((i22 ^ i21) | (i22 & i21)) * 104;
        int i24 = (i20 ^ i23) + ((i23 & i20) << 1);
        int length2 = settitlemargin.values.length;
        int identityHashCode2 = java.lang.System.identityHashCode(settitlemargin);
        int i25 = length2 * (-519);
        int i26 = -(-(i24 * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_ATTEST_SCRP_FAIL));
        int i27 = ((i25 ^ i26) | (i25 & i26)) << 1;
        int i28 = -((i25 & (~i26)) | ((~i25) & i26));
        int i29 = (i27 & i28) + (i28 | i27);
        int i30 = ~length2;
        int i31 = (i30 | length2) & i30;
        int i32 = ~i24;
        int i33 = (i32 | i24) & i32;
        int i34 = i31 & i33;
        int i35 = (i31 | i33) & (~i34);
        int i36 = (i35 ^ i34) | (i35 & i34);
        int i37 = ~identityHashCode2;
        int i38 = i36 & i37;
        int i39 = (i36 | i37) & (~i38);
        int i40 = (i39 ^ i38) | (i39 & i38);
        int i41 = ~i40;
        int i42 = (i40 | i41) & i41;
        int i43 = ~((i24 & i37) | (identityHashCode2 & i32) | (i24 & identityHashCode2));
        int i44 = -(-(((i43 ^ i42) | (i43 & i42)) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_ATTEST_COTS_FAIL));
        int i45 = ((i29 | i44) << 1) - (i44 ^ i29);
        int i46 = (i37 | identityHashCode2) & i37;
        int i47 = ~((i46 ^ i32) | (i46 & i32));
        int i48 = length2 ^ identityHashCode2;
        int i49 = identityHashCode2 & length2;
        int i50 = ~((i48 ^ i49) | (i48 & i49));
        int i51 = ((~i50) & i47) | ((~i47) & i50);
        int i52 = i47 & i50;
        int i53 = -(-(((i52 ^ i51) | (i52 & i51)) * (-1040)));
        int i54 = ((i45 ^ i53) | (i45 & i53)) << 1;
        int i55 = -(((~i53) & i45) | ((~i45) & i53));
        int i56 = ((i54 | i55) << 1) - (i55 ^ i54);
        int i57 = i30 & i37;
        int i58 = (i30 | i37) & (~i57);
        int i59 = (i57 ^ i58) | (i58 & i57);
        int i60 = ~i59;
        int i61 = (i59 | i60) & i60;
        int i62 = i32 & length2;
        int i63 = (length2 | i32) & (~i62);
        int i64 = (i63 ^ i62) | (i63 & i62);
        int i65 = ~i64;
        int i66 = (i64 | i65) & i65;
        int i67 = ((~i66) & i61) | ((~i61) & i66);
        int i68 = i66 & i61;
        int i69 = (i68 ^ i67) | (i68 & i67);
        int i70 = i49 | i48;
        int i71 = ~i70;
        int i72 = (i70 | i71) & i71;
        int i73 = i69 & i72;
        int i74 = (i72 | i69) & (~i73);
        int i75 = -(-(((i74 ^ i73) | (i74 & i73)) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_ATTEST_COTS_FAIL));
        int i76 = ((i56 ^ i75) | (i56 & i75)) << 1;
        int i77 = -(((~i75) & i56) | ((~i56) & i75));
        int i78 = AlternateContactlessPaymentDataJson;
        int i79 = i78 & 23;
        int i80 = ((i78 ^ 23) | i79) << 1;
        int i81 = -((i78 | 23) & (~i79));
        int i82 = (i80 & i81) + (i81 | i80);
        valueOf = i82 % 128;
        if (i82 % 2 != 0) {
            return java.lang.Integer.valueOf((i76 ^ i77) + ((i77 & i76) << 1));
        }
        throw null;
    }

    private static /* synthetic */ java.lang.Object DigitizedCardProfile(java.lang.Object[] objArr) {
        com.payair.hce.setTitleMargin settitlemargin = (com.payair.hce.setTitleMargin) objArr[0];
        com.payair.hce.setMaxLines setmaxlines = (com.payair.hce.setMaxLines) objArr[1];
        AlternateContactlessPaymentDataJson = (valueOf + 85) % 128;
        setmaxlines.AlternateContactlessPaymentDataJson(21, settitlemargin.values);
        int i = valueOf;
        int i2 = i & 7;
        int i3 = -(-((i ^ 7) | i2));
        int i4 = (i2 & i3) + (i3 | i2);
        AlternateContactlessPaymentDataJson = i4 % 128;
        if (i4 % 2 == 0) {
            return null;
        }
        throw null;
    }

    private static /* synthetic */ java.lang.Object writeReplace(java.lang.Object[] objArr) {
        com.payair.hce.setTitleMargin settitlemargin = (com.payair.hce.setTitleMargin) objArr[0];
        int i = AlternateContactlessPaymentDataJson;
        int i2 = i & 77;
        int i3 = -(-((i ^ 77) | i2));
        valueOf = (((i2 | i3) << 1) - (i3 ^ i2)) % 128;
        int AlternateContactlessPaymentDataJson2 = com.payair.hce.getClientVersion.AlternateContactlessPaymentDataJson(settitlemargin.values);
        int i4 = valueOf;
        int i5 = (((i4 | 76) << 1) - (i4 ^ 76)) - 1;
        AlternateContactlessPaymentDataJson = i5 % 128;
        if (i5 % 2 == 0) {
            return java.lang.Integer.valueOf(AlternateContactlessPaymentDataJson2);
        }
        throw null;
    }

    private static /* synthetic */ java.lang.Object valueOf(java.lang.Object[] objArr) {
        com.payair.hce.setTitleMargin settitlemargin = (com.payair.hce.setTitleMargin) objArr[0];
        com.payair.hce.setEms setems = (com.payair.hce.setEms) objArr[1];
        int i = valueOf;
        int i2 = i & 15;
        int i3 = ((((i ^ 15) | i2) << 1) - (~(-((i | 15) & (~i2))))) - 1;
        int i4 = i3 % 128;
        AlternateContactlessPaymentDataJson = i4;
        if (i3 % 2 != 0) {
            throw null;
        }
        if (!(setems instanceof com.payair.hce.setTitleMargin)) {
            valueOf = ((-2) - (~((i4 ^ 60) + ((i4 & 60) << 1)))) % 128;
            return java.lang.Boolean.FALSE;
        }
        boolean AlternateContactlessPaymentDataJson2 = com.payair.hce.getClientVersion.AlternateContactlessPaymentDataJson(settitlemargin.values, ((com.payair.hce.setTitleMargin) setems).values);
        int i5 = AlternateContactlessPaymentDataJson;
        int i6 = ((i5 ^ 52) + ((i5 & 52) << 1)) - 1;
        valueOf = i6 % 128;
        if (i6 % 2 != 0) {
            return java.lang.Boolean.valueOf(AlternateContactlessPaymentDataJson2);
        }
        throw null;
    }

    @Override // com.payair.hce.setEms
    final boolean AlternateContactlessPaymentDataJson(com.payair.hce.setEms setems) {
        return ((java.lang.Boolean) DigitizedCardProfile(new java.lang.Object[]{this, setems}, 1965773804, -1965773803, java.lang.System.identityHashCode(this))).booleanValue();
    }

    @Override // com.payair.hce.setGravity
    public final int hashCode() {
        return ((java.lang.Integer) DigitizedCardProfile(new java.lang.Object[]{this}, -754903905, 754903907, java.lang.System.identityHashCode(this))).intValue();
    }

    @Override // com.payair.hce.setEms
    final void values(com.payair.hce.setMaxLines setmaxlines) throws java.io.IOException {
        DigitizedCardProfile(new java.lang.Object[]{this, setmaxlines}, 1431958306, -1431958303, java.lang.System.identityHashCode(this));
    }

    @Override // com.payair.hce.setEms
    final int AlternateContactlessPaymentDataJson() {
        return ((java.lang.Integer) DigitizedCardProfile(new java.lang.Object[]{this}, -1035319600, 1035319600, java.lang.System.identityHashCode(this))).intValue();
    }

    @Override // com.payair.hce.setEms
    final boolean writeReplace() {
        return ((java.lang.Boolean) DigitizedCardProfile(new java.lang.Object[]{this}, -403997672, 403997676, java.lang.System.identityHashCode(this))).booleanValue();
    }
}
