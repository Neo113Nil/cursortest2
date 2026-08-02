package com.payair.hce;

/* loaded from: classes4.dex */
public final class setExtractedText extends com.payair.hce.setEms {
    private static int AlternateContactlessPaymentDataJson = 1;
    private static int writeReplace;
    private final byte[] valueOf;

    public static /* synthetic */ java.lang.Object writeReplace(java.lang.Object[] objArr, int i, int i2, int i3) {
        int i4 = ~i2;
        int i5 = i4 | i;
        switch ((i * (-129)) + (i2 * 131) + ((~(i4 | (~i3) | i)) * 130) + ((~i5) * (-260)) + (((~((~i) | i2)) | (~(i5 | i3))) * 130)) {
            case 1:
                return AlternateContactlessPaymentDataJson(objArr);
            case 2:
                com.payair.hce.setExtractedText setextractedtext = (com.payair.hce.setExtractedText) objArr[0];
                int i6 = AlternateContactlessPaymentDataJson;
                int i7 = i6 | 101;
                int i8 = i7 << 1;
                int i9 = -((~(i6 & 101)) & i7);
                writeReplace = (((i8 | i9) << 1) - (i9 ^ i8)) % 128;
                java.lang.String str = (java.lang.String) writeReplace(new java.lang.Object[]{setextractedtext}, -1749841527, 1749841531, java.lang.System.identityHashCode(setextractedtext));
                int i10 = writeReplace;
                int i11 = i10 ^ 97;
                int i12 = ((i10 & 97) | i11) << 1;
                int i13 = -i11;
                AlternateContactlessPaymentDataJson = ((i12 & i13) + (i12 | i13)) % 128;
                return str;
            case 3:
                return valueOf(objArr);
            case 4:
                return DigitizedCardProfile(objArr);
            case 5:
                com.payair.hce.setExtractedText setextractedtext2 = (com.payair.hce.setExtractedText) objArr[0];
                int i14 = AlternateContactlessPaymentDataJson;
                int i15 = (i14 | 125) << 1;
                int i16 = -((i14 & (-126)) | ((~i14) & 125));
                writeReplace = (((i15 | i16) << 1) - (i16 ^ i15)) % 128;
                int length = setextractedtext2.valueOf.length;
                int intValue = ((java.lang.Integer) com.payair.hce.setNavigationIcon.DigitizedCardProfile(new java.lang.Object[]{java.lang.Integer.valueOf(length)}, -1174070258, 1174070259, length)).intValue();
                int i17 = intValue & 1;
                int i18 = (intValue | 1) & (~i17);
                int i19 = -(-(i17 << 1));
                int i20 = ((i18 | i19) << 1) - (i18 ^ i19);
                int length2 = setextractedtext2.valueOf.length;
                int identityHashCode = java.lang.System.identityHashCode(setextractedtext2);
                int i21 = ~length2;
                int i22 = (i21 | length2) & i21;
                int i23 = i20 & identityHashCode;
                int i24 = (identityHashCode | i20) & (~i23);
                int i25 = ~(i24 | i23);
                int i26 = i22 ^ i25;
                int i27 = i25 & i22;
                int i28 = (((length2 * (-109)) - (~(-(-(i20 * 111))))) - 1) + (((i27 & i26) | (i27 ^ i26)) * (-220));
                int i29 = ~i20;
                int i30 = i29 & length2;
                int i31 = (i21 & i20) | i30;
                int i32 = length2 & i20;
                int i33 = ~((i31 ^ i32) | (i31 & i32));
                int i34 = ~((i24 ^ i23) | (i24 & i23));
                int i35 = i33 ^ i34;
                int i36 = i34 & i33;
                int i37 = -(-((-(-(((i36 ^ i35) | (i36 & i35)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_SHIELD_CAUTION_VALUE))) | i28));
                int i38 = i22 & i20;
                int i39 = (i20 | i22) & (~i38);
                int i40 = ~((i39 ^ i38) | (i39 & i38));
                int i41 = (length2 | i29) & (~i30);
                int i42 = ~((i41 ^ i30) | (i41 & i30));
                int i43 = i40 ^ i42;
                int i44 = i42 & i40;
                int i45 = -(-(((i44 ^ i43) | (i44 & i43)) * 110));
                writeReplace = ((-2) - (~(AlternateContactlessPaymentDataJson + 14))) % 128;
                return java.lang.Integer.valueOf(((((r7 & i28) - (~i37)) - 1) - (~i45)) - 1);
            case 6:
                return values(objArr);
            default:
                return writeReplace(objArr);
        }
    }

    setExtractedText(byte[] bArr) {
        this.valueOf = bArr;
    }

    private static /* synthetic */ java.lang.Object DigitizedCardProfile(java.lang.Object[] objArr) {
        com.payair.hce.setExtractedText setextractedtext = (com.payair.hce.setExtractedText) objArr[0];
        int i = writeReplace;
        int i2 = i & 17;
        int i3 = i2 + ((i ^ 17) | i2);
        AlternateContactlessPaymentDataJson = i3 % 128;
        byte[] bArr = setextractedtext.valueOf;
        if (i3 % 2 != 0) {
            return com.payair.hce.isGooglePlayServicesUid.DigitizedCardProfile(bArr);
        }
        com.payair.hce.isGooglePlayServicesUid.DigitizedCardProfile(bArr);
        throw null;
    }

    private static /* synthetic */ java.lang.Object valueOf(java.lang.Object[] objArr) {
        int i = AlternateContactlessPaymentDataJson;
        int i2 = i & 53;
        int i3 = ((((i ^ 53) | i2) << 1) - ((i | 53) & (~i2))) % 128;
        writeReplace = i3;
        int i4 = ((i3 ^ 121) | (i3 & 121)) << 1;
        int i5 = -(((~i3) & 121) | (i3 & (-122)));
        int i6 = (i4 ^ i5) + ((i4 & i5) << 1);
        AlternateContactlessPaymentDataJson = i6 % 128;
        if (i6 % 2 != 0) {
            return java.lang.Boolean.FALSE;
        }
        throw new java.lang.ArithmeticException();
    }

    private static /* synthetic */ java.lang.Object AlternateContactlessPaymentDataJson(java.lang.Object[] objArr) {
        com.payair.hce.setExtractedText setextractedtext = (com.payair.hce.setExtractedText) objArr[0];
        com.payair.hce.setMaxLines setmaxlines = (com.payair.hce.setMaxLines) objArr[1];
        int i = AlternateContactlessPaymentDataJson;
        int i2 = (i & (-106)) | ((~i) & 105);
        int i3 = (i & 105) << 1;
        writeReplace = ((i2 ^ i3) + ((i3 & i2) << 1)) % 128;
        setmaxlines.AlternateContactlessPaymentDataJson(27, setextractedtext.valueOf);
        int i4 = writeReplace;
        int i5 = i4 ^ 107;
        int i6 = ((i4 & 107) | i5) << 1;
        int i7 = -i5;
        int i8 = (i6 & i7) + (i6 | i7);
        AlternateContactlessPaymentDataJson = i8 % 128;
        if (i8 % 2 != 0) {
            return null;
        }
        throw null;
    }

    private static /* synthetic */ java.lang.Object writeReplace(java.lang.Object[] objArr) {
        com.payair.hce.setExtractedText setextractedtext = (com.payair.hce.setExtractedText) objArr[0];
        int i = (-2) - (~(writeReplace + 28));
        AlternateContactlessPaymentDataJson = i % 128;
        byte[] bArr = setextractedtext.valueOf;
        if (i % 2 == 0) {
            com.payair.hce.getClientVersion.AlternateContactlessPaymentDataJson(bArr);
            throw null;
        }
        int AlternateContactlessPaymentDataJson2 = com.payair.hce.getClientVersion.AlternateContactlessPaymentDataJson(bArr);
        int i2 = AlternateContactlessPaymentDataJson + 25;
        writeReplace = i2 % 128;
        if (i2 % 2 == 0) {
            return java.lang.Integer.valueOf(AlternateContactlessPaymentDataJson2);
        }
        throw new java.lang.ArithmeticException();
    }

    private static /* synthetic */ java.lang.Object values(java.lang.Object[] objArr) {
        com.payair.hce.setExtractedText setextractedtext = (com.payair.hce.setExtractedText) objArr[0];
        com.payair.hce.setEms setems = (com.payair.hce.setEms) objArr[1];
        int i = writeReplace;
        int i2 = i + 39;
        AlternateContactlessPaymentDataJson = i2 % 128;
        if (i2 % 2 == 0) {
            throw new java.lang.ArithmeticException();
        }
        if (setems instanceof com.payair.hce.setExtractedText) {
            boolean AlternateContactlessPaymentDataJson2 = com.payair.hce.getClientVersion.AlternateContactlessPaymentDataJson(setextractedtext.valueOf, ((com.payair.hce.setExtractedText) setems).valueOf);
            int i3 = writeReplace;
            int i4 = i3 & 91;
            int i5 = (i3 | 91) & (~i4);
            int i6 = i4 << 1;
            int i7 = (i5 & i6) + (i5 | i6);
            AlternateContactlessPaymentDataJson = i7 % 128;
            if (i7 % 2 != 0) {
                return java.lang.Boolean.valueOf(AlternateContactlessPaymentDataJson2);
            }
            throw null;
        }
        int i8 = i ^ 69;
        int i9 = ((i & 69) | i8) << 1;
        int i10 = -i8;
        AlternateContactlessPaymentDataJson = ((i9 & i10) + (i10 | i9)) % 128;
        int i11 = i & 57;
        int i12 = (i11 - (~((i ^ 57) | i11))) - 1;
        AlternateContactlessPaymentDataJson = i12 % 128;
        if (i12 % 2 != 0) {
            return java.lang.Boolean.FALSE;
        }
        throw new java.lang.ArithmeticException();
    }

    @Override // com.payair.hce.setEms
    final boolean AlternateContactlessPaymentDataJson(com.payair.hce.setEms setems) {
        return ((java.lang.Boolean) writeReplace(new java.lang.Object[]{this, setems}, -1852374321, 1852374327, java.lang.System.identityHashCode(this))).booleanValue();
    }

    @Override // com.payair.hce.setGravity
    public final int hashCode() {
        return ((java.lang.Integer) writeReplace(new java.lang.Object[]{this}, -111622030, 111622030, java.lang.System.identityHashCode(this))).intValue();
    }

    @Override // com.payair.hce.setEms
    final void values(com.payair.hce.setMaxLines setmaxlines) throws java.io.IOException {
        writeReplace(new java.lang.Object[]{this, setmaxlines}, -897262966, 897262967, java.lang.System.identityHashCode(this));
    }

    @Override // com.payair.hce.setEms
    final int AlternateContactlessPaymentDataJson() {
        return ((java.lang.Integer) writeReplace(new java.lang.Object[]{this}, -1576089205, 1576089210, java.lang.System.identityHashCode(this))).intValue();
    }

    @Override // com.payair.hce.setEms
    final boolean writeReplace() {
        return ((java.lang.Boolean) writeReplace(new java.lang.Object[]{this}, 1466503503, -1466503500, java.lang.System.identityHashCode(this))).booleanValue();
    }

    public final java.lang.String toString() {
        return (java.lang.String) writeReplace(new java.lang.Object[]{this}, -335181604, 335181606, java.lang.System.identityHashCode(this));
    }

    private java.lang.String values() {
        return (java.lang.String) writeReplace(new java.lang.Object[]{this}, -1749841527, 1749841531, java.lang.System.identityHashCode(this));
    }
}
