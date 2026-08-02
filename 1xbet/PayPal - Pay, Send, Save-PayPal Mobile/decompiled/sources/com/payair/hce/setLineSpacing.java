package com.payair.hce;

/* loaded from: classes4.dex */
public final class setLineSpacing extends com.payair.hce.setEms {
    private static int DigitizedCardProfile = 1;
    private static int writeReplace;
    private byte[] AlternateContactlessPaymentDataJson;

    public static /* synthetic */ java.lang.Object valueOf(java.lang.Object[] objArr, int i, int i2, int i3) {
        int i4 = ~((~i) | i2);
        int i5 = (i * 71) + (i2 * (-69)) + (((~(i2 | i3)) | i4) * (-140)) + ((~(i | i2 | i3)) * 70) + (((~(i | (~i2))) | i4 | (~(i3 | i))) * 70);
        if (i5 == 1) {
            return DigitizedCardProfile(objArr);
        }
        if (i5 == 2) {
            return writeReplace(objArr);
        }
        int i6 = 0;
        if (i5 != 3) {
            if (i5 != 4) {
                return i5 != 5 ? values(objArr) : valueOf(objArr);
            }
            com.payair.hce.setLineSpacing setlinespacing = (com.payair.hce.setLineSpacing) objArr[0];
            int i7 = DigitizedCardProfile;
            int i8 = ((i7 ^ 25) | (i7 & 25)) << 1;
            int i9 = -((i7 & (-26)) | ((~i7) & 25));
            writeReplace = ((i8 & i9) + (i8 | i9)) % 128;
            java.lang.String DigitizedCardProfile2 = com.payair.hce.isGooglePlayServicesUid.DigitizedCardProfile(setlinespacing.AlternateContactlessPaymentDataJson);
            writeReplace = (DigitizedCardProfile + 85) % 128;
            return DigitizedCardProfile2;
        }
        com.payair.hce.setLineSpacing setlinespacing2 = (com.payair.hce.setLineSpacing) objArr[0];
        com.payair.hce.setMaxLines setmaxlines = (com.payair.hce.setMaxLines) objArr[1];
        DigitizedCardProfile = (writeReplace + 61) % 128;
        setmaxlines.DigitizedCardProfile(23);
        int length = setlinespacing2.AlternateContactlessPaymentDataJson.length;
        setmaxlines.AlternateContactlessPaymentDataJson(length);
        int i10 = writeReplace;
        int i11 = i10 & 63;
        int i12 = (i10 | 63) & (~i11);
        int i13 = -(-(i11 << 1));
        DigitizedCardProfile = ((i12 ^ i13) + ((i12 & i13) << 1)) % 128;
        while (i6 != length) {
            int i14 = DigitizedCardProfile;
            writeReplace = (((i14 | 81) << 1) - (i14 ^ 81)) % 128;
            setmaxlines.DigitizedCardProfile(setlinespacing2.AlternateContactlessPaymentDataJson[i6]);
            int i15 = (((i6 | 61) << 1) - (~(-(i6 ^ 61)))) - 1;
            i6 = (((i15 ^ (-60)) | (i15 & (-60))) << 1) - ((i15 & 59) | ((~i15) & (-60)));
            DigitizedCardProfile = (writeReplace + 9) % 128;
        }
        int i16 = DigitizedCardProfile;
        int i17 = (i16 & (-84)) | ((~i16) & 83);
        int i18 = (i16 & 83) << 1;
        writeReplace = ((i17 ^ i18) + ((i18 & i17) << 1)) % 128;
        return null;
    }

    setLineSpacing(byte[] bArr) {
        this.AlternateContactlessPaymentDataJson = bArr;
    }

    private static /* synthetic */ java.lang.Object writeReplace(java.lang.Object[] objArr) {
        int i = DigitizedCardProfile ^ 117;
        int i2 = (((((r1 & 117) | i) << 1) - (~(-i))) - 1) % 128;
        writeReplace = i2;
        int i3 = i2 + 61;
        DigitizedCardProfile = i3 % 128;
        if (i3 % 2 != 0) {
            return java.lang.Boolean.FALSE;
        }
        throw null;
    }

    private static /* synthetic */ java.lang.Object DigitizedCardProfile(java.lang.Object[] objArr) {
        com.payair.hce.setLineSpacing setlinespacing = (com.payair.hce.setLineSpacing) objArr[0];
        int i = writeReplace;
        DigitizedCardProfile = ((-2) - (~(((i | 126) << 1) - (i ^ 126)))) % 128;
        int length = setlinespacing.AlternateContactlessPaymentDataJson.length;
        int intValue = ((java.lang.Integer) com.payair.hce.setNavigationIcon.DigitizedCardProfile(new java.lang.Object[]{java.lang.Integer.valueOf(length)}, -1174070258, 1174070259, length)).intValue();
        int identityHashCode = java.lang.System.identityHashCode(setlinespacing);
        int i2 = (intValue * 471) + 471;
        int i3 = intValue & 1;
        int i4 = (~i3) & (intValue | 1);
        int i5 = -(-(((i4 ^ i3) | (i3 & i4)) * (-470)));
        int i6 = i2 & i5;
        int i7 = ((i2 ^ i5) | i6) << 1;
        int i8 = -((i2 | i5) & (~i6));
        int i9 = (i7 & i8) + (i8 | i7);
        int i10 = ~intValue;
        int i11 = (i10 | intValue) & i10;
        int i12 = i11 & (-2);
        int i13 = (i11 | (-2)) & (~i12);
        int i14 = ~((i13 ^ i12) | (i13 & i12));
        int i15 = identityHashCode & (-2);
        int i16 = (~i15) & (identityHashCode | (-2));
        int i17 = ~identityHashCode;
        int i18 = ~((i15 ^ i16) | (i15 & i16));
        int i19 = ((~i18) & i14) | ((~i14) & i18);
        int i20 = i14 & i18;
        int i21 = (i20 ^ i19) | (i20 & i19);
        int i22 = i17 & intValue;
        int i23 = (~i22) & (i17 | intValue);
        int i24 = (i23 ^ i22) | (i22 & i23);
        int i25 = (i24 & (-2)) | ((~i24) & 1);
        int i26 = i24 & 1;
        int i27 = ~((i26 ^ i25) | (i26 & i25));
        int i28 = ((~i27) & i21) | ((~i21) & i27);
        int i29 = i21 & i27;
        int i30 = ((i29 ^ i28) | (i29 & i28)) * (-470);
        int i31 = ((((~i30) & i9) | ((~i9) & i30)) - (~(-(-((i9 & i30) << 1))))) - 1;
        int i32 = (i10 & (-2)) | i3;
        int i33 = intValue & (-2);
        int i34 = (i32 ^ i33) | (i33 & i32);
        int i35 = i34 & identityHashCode;
        int i36 = ~(((identityHashCode | i34) & (~i35)) | i35);
        int i37 = intValue ^ i17;
        int i38 = (i37 ^ i22) | (i22 & i37);
        int i39 = i38 & 1;
        int i40 = ((i38 | 1) & (~i39)) | i39;
        int i41 = ~i40;
        int i42 = (i40 | i41) & i41;
        int i43 = ((~i42) & i36) | ((~i36) & i42);
        int i44 = i42 & i36;
        int i45 = -(-(((i44 ^ i43) | (i44 & i43)) * 470));
        int i46 = i31 & i45;
        int i47 = (i45 ^ i31) | i46;
        int i48 = (i46 ^ i47) + ((i47 & i46) << 1);
        int identityHashCode2 = java.lang.System.identityHashCode(setlinespacing);
        int i49 = length * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CARD_DARK_APPEARANCE_VALUE;
        int i50 = i48 * (-282);
        int i51 = i49 ^ i50;
        int i52 = (i49 & i50) << 1;
        int i53 = (i51 ^ i52) + ((i52 & i51) << 1);
        int i54 = ~length;
        int i55 = (i54 | length) & i54;
        int i56 = i55 & i48;
        int i57 = (i55 | i48) & (~i56);
        int i58 = ~i48;
        int i59 = (i57 ^ i56) | (i57 & i56);
        int i60 = ~i59;
        int i61 = (i59 | i60) & i60;
        int i62 = ~((i54 & identityHashCode2) | (i54 ^ identityHashCode2));
        int i63 = ((i61 ^ i62) | (i61 & i62)) * (-283);
        int i64 = (i53 & i63) + (i53 | i63);
        int i65 = -(-((~((length ^ i58) | (i58 & length))) * 283));
        int i66 = ((i64 | i65) << 1) - (i65 ^ i64);
        int i67 = i54 ^ i58;
        int i68 = i54 & i58;
        int i69 = (i67 ^ i68) | (i68 & i67);
        int i70 = i69 & identityHashCode2;
        int i71 = (identityHashCode2 | i69) & (~i70);
        int i72 = (~((i71 ^ i70) | (i71 & i70))) * 283;
        int i73 = i66 & i72;
        int i74 = i72 | i66;
        int i75 = ((i73 | i74) << 1) - (i74 ^ i73);
        int i76 = DigitizedCardProfile;
        int i77 = i76 & 121;
        int i78 = (i77 - (~(-(-((i76 ^ 121) | i77))))) - 1;
        writeReplace = i78 % 128;
        if (i78 % 2 == 0) {
            return java.lang.Integer.valueOf(i75);
        }
        throw new java.lang.ArithmeticException();
    }

    private static /* synthetic */ java.lang.Object valueOf(java.lang.Object[] objArr) {
        com.payair.hce.setLineSpacing setlinespacing = (com.payair.hce.setLineSpacing) objArr[0];
        com.payair.hce.setEms setems = (com.payair.hce.setEms) objArr[1];
        int i = writeReplace;
        int i2 = (i & (-58)) | ((~i) & 57);
        int i3 = -(-((i & 57) << 1));
        int i4 = (i2 & i3) + (i2 | i3);
        DigitizedCardProfile = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
        if (!(setems instanceof com.payair.hce.setLineSpacing)) {
            int i5 = i & 67;
            int i6 = ((i5 - (~((i ^ 67) | i5))) - 1) % 128;
            DigitizedCardProfile = i6;
            writeReplace = (i6 + 95) % 128;
            return java.lang.Boolean.FALSE;
        }
        boolean AlternateContactlessPaymentDataJson = com.payair.hce.getClientVersion.AlternateContactlessPaymentDataJson(setlinespacing.AlternateContactlessPaymentDataJson, ((com.payair.hce.setLineSpacing) setems).AlternateContactlessPaymentDataJson);
        int i7 = writeReplace;
        int i8 = (i7 & 49) + (i7 | 49);
        DigitizedCardProfile = i8 % 128;
        if (i8 % 2 != 0) {
            return java.lang.Boolean.valueOf(AlternateContactlessPaymentDataJson);
        }
        throw new java.lang.ArithmeticException();
    }

    private static /* synthetic */ java.lang.Object values(java.lang.Object[] objArr) {
        com.payair.hce.setLineSpacing setlinespacing = (com.payair.hce.setLineSpacing) objArr[0];
        int i = DigitizedCardProfile + 125;
        writeReplace = i % 128;
        byte[] bArr = setlinespacing.AlternateContactlessPaymentDataJson;
        if (i % 2 != 0) {
            com.payair.hce.getClientVersion.AlternateContactlessPaymentDataJson(bArr);
            throw null;
        }
        int AlternateContactlessPaymentDataJson = com.payair.hce.getClientVersion.AlternateContactlessPaymentDataJson(bArr);
        int i2 = writeReplace;
        int i3 = i2 & 101;
        int i4 = -(-((i2 ^ 101) | i3));
        int i5 = (i3 ^ i4) + ((i4 & i3) << 1);
        DigitizedCardProfile = i5 % 128;
        if (i5 % 2 != 0) {
            return java.lang.Integer.valueOf(AlternateContactlessPaymentDataJson);
        }
        throw null;
    }

    public final java.lang.String toString() {
        return (java.lang.String) valueOf(new java.lang.Object[]{this}, 1281649799, -1281649795, java.lang.System.identityHashCode(this));
    }

    @Override // com.payair.hce.setGravity
    public final int hashCode() {
        return ((java.lang.Integer) valueOf(new java.lang.Object[]{this}, -1754430042, 1754430042, java.lang.System.identityHashCode(this))).intValue();
    }

    @Override // com.payair.hce.setEms
    final boolean AlternateContactlessPaymentDataJson(com.payair.hce.setEms setems) {
        return ((java.lang.Boolean) valueOf(new java.lang.Object[]{this, setems}, -1138240025, 1138240030, java.lang.System.identityHashCode(this))).booleanValue();
    }

    @Override // com.payair.hce.setEms
    final void values(com.payair.hce.setMaxLines setmaxlines) throws java.io.IOException {
        valueOf(new java.lang.Object[]{this, setmaxlines}, -1433544380, 1433544383, java.lang.System.identityHashCode(this));
    }

    @Override // com.payair.hce.setEms
    final int AlternateContactlessPaymentDataJson() {
        return ((java.lang.Integer) valueOf(new java.lang.Object[]{this}, 313233984, -313233983, java.lang.System.identityHashCode(this))).intValue();
    }

    @Override // com.payair.hce.setEms
    final boolean writeReplace() {
        return ((java.lang.Boolean) valueOf(new java.lang.Object[]{this}, 34978628, -34978626, java.lang.System.identityHashCode(this))).booleanValue();
    }
}
