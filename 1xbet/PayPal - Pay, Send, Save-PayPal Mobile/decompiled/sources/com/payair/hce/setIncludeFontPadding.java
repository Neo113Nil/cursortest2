package com.payair.hce;

/* loaded from: classes4.dex */
public final class setIncludeFontPadding extends com.payair.hce.setEms {
    private static int valueOf = 0;
    private static int values = 1;
    private final byte[] writeReplace;

    public static /* synthetic */ java.lang.Object DigitizedCardProfile(java.lang.Object[] objArr, int i, int i2, int i3) {
        int i4 = ~i2;
        int i5 = ~((~i3) | i | i2);
        switch ((i * 471) + (i2 * 471) + ((i2 | i) * (-470)) + (((~((~i) | i4)) | (~(i4 | i3)) | i5) * (-470)) + (((~(i | i4 | i3)) | i5) * 470)) {
            case 1:
                return AlternateContactlessPaymentDataJson(objArr);
            case 2:
                return DigitizedCardProfile(objArr);
            case 3:
                return valueOf(objArr);
            case 4:
                return values(objArr);
            case 5:
                com.payair.hce.setIncludeFontPadding setincludefontpadding = (com.payair.hce.setIncludeFontPadding) objArr[0];
                int i6 = values;
                int i7 = i6 ^ 45;
                int i8 = ((i6 & 45) | i7) << 1;
                int i9 = -i7;
                valueOf = ((i8 & i9) + (i8 | i9)) % 128;
                int AlternateContactlessPaymentDataJson = com.payair.hce.getClientVersion.AlternateContactlessPaymentDataJson(setincludefontpadding.writeReplace);
                int i10 = valueOf;
                int i11 = i10 & 1;
                int i12 = (i10 | 1) & (~i11);
                int i13 = i11 << 1;
                values = (((i12 | i13) << 1) - (i12 ^ i13)) % 128;
                return java.lang.Integer.valueOf(AlternateContactlessPaymentDataJson);
            case 6:
                return getAid(objArr);
            default:
                return writeReplace(objArr);
        }
    }

    setIncludeFontPadding(byte[] bArr) {
        this.writeReplace = bArr;
    }

    private static /* synthetic */ java.lang.Object getAid(java.lang.Object[] objArr) {
        com.payair.hce.setIncludeFontPadding setincludefontpadding = (com.payair.hce.setIncludeFontPadding) objArr[0];
        int i = values;
        int i2 = i & 117;
        int i3 = i | 117;
        valueOf = ((i2 & i3) + (i3 | i2)) % 128;
        java.lang.String DigitizedCardProfile = com.payair.hce.isGooglePlayServicesUid.DigitizedCardProfile(setincludefontpadding.writeReplace);
        int i4 = valueOf;
        int i5 = i4 & 81;
        int i6 = (((i4 | 81) & (~i5)) - (~(i5 << 1))) - 1;
        values = i6 % 128;
        if (i6 % 2 != 0) {
            return DigitizedCardProfile;
        }
        throw null;
    }

    private static /* synthetic */ java.lang.Object writeReplace(java.lang.Object[] objArr) {
        com.payair.hce.setIncludeFontPadding setincludefontpadding = (com.payair.hce.setIncludeFontPadding) objArr[0];
        int i = values + 79;
        valueOf = i % 128;
        if (i % 2 == 0) {
            return (java.lang.String) DigitizedCardProfile(new java.lang.Object[]{setincludefontpadding}, -890488144, 890488150, java.lang.System.identityHashCode(setincludefontpadding));
        }
        throw null;
    }

    private static /* synthetic */ java.lang.Object valueOf(java.lang.Object[] objArr) {
        int i = valueOf;
        int i2 = i & 113;
        int i3 = ((i ^ 113) | i2) << 1;
        int i4 = -((~i2) & (i | 113));
        values = ((i3 & i4) + (i4 | i3)) % 128;
        int i5 = i & 5;
        int i6 = (i5 - (~((i ^ 5) | i5))) - 1;
        values = i6 % 128;
        if (i6 % 2 != 0) {
            return java.lang.Boolean.FALSE;
        }
        throw null;
    }

    private static /* synthetic */ java.lang.Object values(java.lang.Object[] objArr) {
        com.payair.hce.setIncludeFontPadding setincludefontpadding = (com.payair.hce.setIncludeFontPadding) objArr[0];
        int i = valueOf;
        values = (((i & (-76)) | ((~i) & 75)) + ((i & 75) << 1)) % 128;
        int length = setincludefontpadding.writeReplace.length;
        int intValue = ((java.lang.Integer) com.payair.hce.setNavigationIcon.DigitizedCardProfile(new java.lang.Object[]{java.lang.Integer.valueOf(length)}, -1174070258, 1174070259, length)).intValue();
        int identityHashCode = java.lang.System.identityHashCode(setincludefontpadding);
        int i2 = ~intValue;
        int i3 = ~identityHashCode;
        int i4 = ~((i3 & i2) | ((~i3) & i2) | ((~i2) & i3));
        int i5 = (i2 | intValue) & i2;
        int i6 = ~((i5 ^ 1) | (i5 & 1));
        int i7 = (i4 ^ i6) | (i6 & i4);
        int i8 = i3 & 1;
        int i9 = (i3 | 1) & (~i8);
        int i10 = (i9 ^ i8) | (i9 & i8);
        int i11 = ~i10;
        int i12 = (i10 | i11) & i11;
        int i13 = (-2) - (~(((intValue * 398) - 396) - (~(((i12 ^ i7) | (i7 & i12)) * (-397)))));
        int i14 = i2 & 1;
        int i15 = (i2 | 1) & (~i14);
        int i16 = ~((i15 ^ i14) | (i14 & i15));
        int i17 = i16 * (-397);
        int i18 = i13 & i17;
        int i19 = (i13 | i17) & (~i18);
        int i20 = i18 << 1;
        int i21 = ((i19 | i20) << 1) - (i19 ^ i20);
        int i22 = identityHashCode & i16;
        int i23 = ((identityHashCode | i16) & (~i22)) | i22;
        int i24 = ~((intValue ^ (-2)) | (intValue & (-2)));
        int i25 = i23 & i24;
        int i26 = (i24 | i23) & (~i25);
        int i27 = -(-(((i26 ^ i25) | (i26 & i25)) * 397));
        int i28 = i21 & i27;
        int i29 = (i27 | i21) & (~i28);
        int i30 = -(-(i28 << 1));
        int i31 = ((i29 | i30) << 1) - (i29 ^ i30);
        int i32 = -(-setincludefontpadding.writeReplace.length);
        int i33 = i31 & i32;
        int i34 = ((i31 ^ i32) | i33) << 1;
        int i35 = -((i32 | i31) & (~i33));
        int i36 = (i34 ^ i35) + ((i35 & i34) << 1);
        int i37 = values;
        int i38 = (i37 & 95) + (i37 | 95);
        valueOf = i38 % 128;
        if (i38 % 2 == 0) {
            return java.lang.Integer.valueOf(i36);
        }
        throw new java.lang.ArithmeticException();
    }

    private static /* synthetic */ java.lang.Object AlternateContactlessPaymentDataJson(java.lang.Object[] objArr) {
        com.payair.hce.setIncludeFontPadding setincludefontpadding = (com.payair.hce.setIncludeFontPadding) objArr[0];
        com.payair.hce.setMaxLines setmaxlines = (com.payair.hce.setMaxLines) objArr[1];
        int i = valueOf;
        int i2 = i & 99;
        int i3 = (i ^ 99) | i2;
        values = (((i2 | i3) << 1) - (i3 ^ i2)) % 128;
        setmaxlines.AlternateContactlessPaymentDataJson(18, setincludefontpadding.writeReplace);
        int i4 = valueOf;
        int i5 = (-2) - (~((i4 ^ 54) + ((i4 & 54) << 1)));
        values = i5 % 128;
        if (i5 % 2 != 0) {
            return null;
        }
        throw new java.lang.ArithmeticException();
    }

    private static /* synthetic */ java.lang.Object DigitizedCardProfile(java.lang.Object[] objArr) {
        com.payair.hce.setIncludeFontPadding setincludefontpadding = (com.payair.hce.setIncludeFontPadding) objArr[0];
        com.payair.hce.setEms setems = (com.payair.hce.setEms) objArr[1];
        int i = valueOf;
        int i2 = i + 11;
        values = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
        if (!(setems instanceof com.payair.hce.setIncludeFontPadding)) {
            int i3 = i & 119;
            int i4 = -(-((i ^ 119) | i3));
            values = (((i3 | i4) << 1) - (i3 ^ i4)) % 128;
            return java.lang.Boolean.FALSE;
        }
        boolean AlternateContactlessPaymentDataJson = com.payair.hce.getClientVersion.AlternateContactlessPaymentDataJson(setincludefontpadding.writeReplace, ((com.payair.hce.setIncludeFontPadding) setems).writeReplace);
        int i5 = valueOf + 65;
        values = i5 % 128;
        if (i5 % 2 != 0) {
            return java.lang.Boolean.valueOf(AlternateContactlessPaymentDataJson);
        }
        throw new java.lang.ArithmeticException();
    }

    @Override // com.payair.hce.setEms
    final boolean AlternateContactlessPaymentDataJson(com.payair.hce.setEms setems) {
        return ((java.lang.Boolean) DigitizedCardProfile(new java.lang.Object[]{this, setems}, 499356580, -499356578, java.lang.System.identityHashCode(this))).booleanValue();
    }

    @Override // com.payair.hce.setGravity
    public final int hashCode() {
        return ((java.lang.Integer) DigitizedCardProfile(new java.lang.Object[]{this}, -1088628454, 1088628459, java.lang.System.identityHashCode(this))).intValue();
    }

    @Override // com.payair.hce.setEms
    final void values(com.payair.hce.setMaxLines setmaxlines) throws java.io.IOException {
        DigitizedCardProfile(new java.lang.Object[]{this, setmaxlines}, 2052950116, -2052950115, java.lang.System.identityHashCode(this));
    }

    @Override // com.payair.hce.setEms
    final int AlternateContactlessPaymentDataJson() {
        return ((java.lang.Integer) DigitizedCardProfile(new java.lang.Object[]{this}, -998135402, 998135406, java.lang.System.identityHashCode(this))).intValue();
    }

    @Override // com.payair.hce.setEms
    final boolean writeReplace() {
        return ((java.lang.Boolean) DigitizedCardProfile(new java.lang.Object[]{this}, 1852337066, -1852337063, java.lang.System.identityHashCode(this))).booleanValue();
    }

    public final java.lang.String toString() {
        return (java.lang.String) DigitizedCardProfile(new java.lang.Object[]{this}, 2053350364, -2053350364, java.lang.System.identityHashCode(this));
    }

    private java.lang.String values() {
        return (java.lang.String) DigitizedCardProfile(new java.lang.Object[]{this}, -890488144, 890488150, java.lang.System.identityHashCode(this));
    }
}
