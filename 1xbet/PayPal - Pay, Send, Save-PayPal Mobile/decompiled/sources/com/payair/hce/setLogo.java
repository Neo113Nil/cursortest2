package com.payair.hce;

/* loaded from: classes4.dex */
public final class setLogo extends com.payair.hce.setEms {
    private static int DigitizedCardProfile = 0;
    private static int values = 1;
    private final byte[] valueOf;

    public static /* synthetic */ java.lang.Object DigitizedCardProfile(java.lang.Object[] objArr, int i, int i2, int i3) {
        switch ((i * (-55)) + (i2 * (-55)) + (((~(i | i3)) | i2) * 56) + ((~(i | i2)) * (-56)) + ((i | (~(i2 | (~i3)))) * 56)) {
            case 1:
                return AlternateContactlessPaymentDataJson(objArr);
            case 2:
                return writeReplace(objArr);
            case 3:
                com.payair.hce.setLogo setlogo = (com.payair.hce.setLogo) objArr[0];
                com.payair.hce.setMaxLines setmaxlines = (com.payair.hce.setMaxLines) objArr[1];
                int i4 = DigitizedCardProfile;
                int i5 = i4 & 107;
                int i6 = -(-((i4 ^ 107) | i5));
                values = ((i5 ^ i6) + ((i6 & i5) << 1)) % 128;
                setmaxlines.AlternateContactlessPaymentDataJson(26, setlogo.valueOf);
                int i7 = DigitizedCardProfile;
                values = (((i7 | 91) << 1) - (i7 ^ 91)) % 128;
                return null;
            case 4:
                return valueOf(objArr);
            case 5:
                return values(objArr);
            case 6:
                return DigitizedCardProfile(objArr);
            default:
                com.payair.hce.setLogo setlogo2 = (com.payair.hce.setLogo) objArr[0];
                int i8 = values;
                int i9 = i8 ^ 3;
                int i10 = ((i8 & 3) | i9) << 1;
                int i11 = -i9;
                DigitizedCardProfile = ((i10 ^ i11) + ((i10 & i11) << 1)) % 128;
                int length = setlogo2.valueOf.length;
                int intValue = ((java.lang.Integer) com.payair.hce.setNavigationIcon.DigitizedCardProfile(new java.lang.Object[]{java.lang.Integer.valueOf(length)}, -1174070258, 1174070259, length)).intValue() + 1;
                int length2 = setlogo2.valueOf.length;
                int identityHashCode = java.lang.System.identityHashCode(setlogo2);
                int i12 = ((length2 * (-380)) - (~(-(-(intValue * 382))))) - 1;
                int i13 = (intValue ^ identityHashCode) | (intValue & identityHashCode);
                int i14 = ~length2;
                int i15 = ~i14;
                int i16 = (i15 & i13) | ((~i13) & i14);
                int i17 = i13 & i14;
                int i18 = ((i17 ^ i16) | (i17 & i16)) * (-381);
                int i19 = (i12 | i18) << 1;
                int i20 = -((i12 & (~i18)) | ((~i12) & i18));
                int i21 = (i19 ^ i20) + ((i20 & i19) << 1);
                int i22 = ~intValue;
                int i23 = (i15 & i22) | ((~i22) & i14);
                int i24 = i22 & i14;
                int i25 = ~((i24 ^ i23) | (i24 & i23));
                int i26 = ~identityHashCode;
                int i27 = i26 & intValue;
                int i28 = (i26 | intValue) & (~i27);
                int i29 = ~((i28 ^ i27) | (i28 & i27));
                int i30 = ((~i29) & i25) | ((~i25) & i29);
                int i31 = i29 & i25;
                int i32 = (i31 ^ i30) | (i31 & i30);
                int i33 = length2 & intValue;
                int i34 = (length2 | intValue) & (~i33);
                int i35 = ~((i34 ^ i33) | (i34 & i33));
                int i36 = -(-(((i32 ^ i35) | (i32 & i35)) * 381));
                int i37 = (i21 ^ i36) + ((i36 & i21) << 1);
                int i38 = i14 & intValue;
                int i39 = (intValue | i14) & (~i38);
                int i40 = -(-((~((i38 ^ i39) | (i38 & i39))) * 381));
                int i41 = i37 & i40;
                int i42 = ((i37 ^ i40) | i41) << 1;
                int i43 = -((i40 | i37) & (~i41));
                int i44 = values;
                int i45 = i44 ^ 89;
                int i46 = -(-((i44 & 89) << 1));
                DigitizedCardProfile = ((i45 & i46) + (i46 | i45)) % 128;
                return java.lang.Integer.valueOf((i42 & i43) + (i43 | i42));
        }
    }

    setLogo(byte[] bArr) {
        this.valueOf = bArr;
    }

    private static /* synthetic */ java.lang.Object AlternateContactlessPaymentDataJson(java.lang.Object[] objArr) {
        com.payair.hce.setLogo setlogo = (com.payair.hce.setLogo) objArr[0];
        int i = values & 9;
        DigitizedCardProfile = ((((r0 | 9) & (~i)) - (~(i << 1))) - 1) % 128;
        java.lang.String DigitizedCardProfile2 = com.payair.hce.isGooglePlayServicesUid.DigitizedCardProfile(setlogo.valueOf);
        int i2 = DigitizedCardProfile;
        int i3 = i2 & 15;
        int i4 = i2 | 15;
        int i5 = ((i3 | i4) << 1) - (i4 ^ i3);
        values = i5 % 128;
        if (i5 % 2 != 0) {
            return DigitizedCardProfile2;
        }
        throw null;
    }

    private static /* synthetic */ java.lang.Object valueOf(java.lang.Object[] objArr) {
        com.payair.hce.setLogo setlogo = (com.payair.hce.setLogo) objArr[0];
        int i = DigitizedCardProfile;
        int i2 = i & 109;
        int i3 = i | 109;
        int i4 = ((i2 | i3) << 1) - (i3 ^ i2);
        values = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
        java.lang.String str = (java.lang.String) DigitizedCardProfile(new java.lang.Object[]{setlogo}, 1863443670, -1863443669, java.lang.System.identityHashCode(setlogo));
        int i5 = DigitizedCardProfile + 67;
        values = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        throw null;
    }

    private static /* synthetic */ java.lang.Object DigitizedCardProfile(java.lang.Object[] objArr) {
        int i = DigitizedCardProfile;
        int i2 = i & 3;
        values = (i2 + ((i ^ 3) | i2)) % 128;
        int i3 = (i ^ 69) + ((i & 69) << 1);
        values = i3 % 128;
        if (i3 % 2 != 0) {
            return java.lang.Boolean.FALSE;
        }
        throw null;
    }

    private static /* synthetic */ java.lang.Object writeReplace(java.lang.Object[] objArr) {
        com.payair.hce.setLogo setlogo = (com.payair.hce.setLogo) objArr[0];
        com.payair.hce.setEms setems = (com.payair.hce.setEms) objArr[1];
        int i = values;
        int i2 = i & 55;
        int i3 = ((i ^ 55) | i2) << 1;
        int i4 = -((i | 55) & (~i2));
        int i5 = (i3 & i4) + (i4 | i3);
        int i6 = i5 % 128;
        DigitizedCardProfile = i6;
        if (i5 % 2 != 0) {
            throw null;
        }
        if (setems instanceof com.payair.hce.setLogo) {
            boolean AlternateContactlessPaymentDataJson = com.payair.hce.getClientVersion.AlternateContactlessPaymentDataJson(setlogo.valueOf, ((com.payair.hce.setLogo) setems).valueOf);
            int i7 = DigitizedCardProfile;
            int i8 = ((i7 ^ 37) | (i7 & 37)) << 1;
            int i9 = -((i7 & (-38)) | ((~i7) & 37));
            int i10 = (i8 & i9) + (i9 | i8);
            values = i10 % 128;
            if (i10 % 2 == 0) {
                throw null;
            }
            return java.lang.Boolean.valueOf(AlternateContactlessPaymentDataJson);
        }
        int i11 = i6 & 55;
        int i12 = (i6 ^ 55) | i11;
        values = (((i11 | i12) << 1) - (i11 ^ i12)) % 128;
        return java.lang.Boolean.FALSE;
    }

    private static /* synthetic */ java.lang.Object values(java.lang.Object[] objArr) {
        com.payair.hce.setLogo setlogo = (com.payair.hce.setLogo) objArr[0];
        int i = values + 93;
        DigitizedCardProfile = i % 128;
        byte[] bArr = setlogo.valueOf;
        if (i % 2 != 0) {
            com.payair.hce.getClientVersion.AlternateContactlessPaymentDataJson(bArr);
            throw null;
        }
        int AlternateContactlessPaymentDataJson = com.payair.hce.getClientVersion.AlternateContactlessPaymentDataJson(bArr);
        DigitizedCardProfile = (values + 35) % 128;
        return java.lang.Integer.valueOf(AlternateContactlessPaymentDataJson);
    }

    @Override // com.payair.hce.setGravity
    public final int hashCode() {
        return ((java.lang.Integer) DigitizedCardProfile(new java.lang.Object[]{this}, -1199425993, 1199425998, java.lang.System.identityHashCode(this))).intValue();
    }

    @Override // com.payair.hce.setEms
    final boolean AlternateContactlessPaymentDataJson(com.payair.hce.setEms setems) {
        return ((java.lang.Boolean) DigitizedCardProfile(new java.lang.Object[]{this, setems}, -1043970946, 1043970948, java.lang.System.identityHashCode(this))).booleanValue();
    }

    @Override // com.payair.hce.setEms
    final void values(com.payair.hce.setMaxLines setmaxlines) throws java.io.IOException {
        DigitizedCardProfile(new java.lang.Object[]{this, setmaxlines}, 960838678, -960838675, java.lang.System.identityHashCode(this));
    }

    @Override // com.payair.hce.setEms
    final int AlternateContactlessPaymentDataJson() {
        return ((java.lang.Integer) DigitizedCardProfile(new java.lang.Object[]{this}, -1867673111, 1867673111, java.lang.System.identityHashCode(this))).intValue();
    }

    @Override // com.payair.hce.setEms
    final boolean writeReplace() {
        return ((java.lang.Boolean) DigitizedCardProfile(new java.lang.Object[]{this}, 1257896792, -1257896786, java.lang.System.identityHashCode(this))).booleanValue();
    }

    public final java.lang.String toString() {
        return (java.lang.String) DigitizedCardProfile(new java.lang.Object[]{this}, -585546064, 585546068, java.lang.System.identityHashCode(this));
    }

    private java.lang.String values() {
        return (java.lang.String) DigitizedCardProfile(new java.lang.Object[]{this}, 1863443670, -1863443669, java.lang.System.identityHashCode(this));
    }
}
