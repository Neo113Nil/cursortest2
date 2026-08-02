package com.payair.hce;

/* loaded from: classes4.dex */
public abstract class setHighlightColor extends com.payair.hce.setEms {
    private static int DigitizedCardProfile = 0;
    private static int writeReplace = 1;
    protected final boolean AlternateContactlessPaymentDataJson;
    protected final byte[] valueOf;
    protected final int values;

    public static /* synthetic */ java.lang.Object values(java.lang.Object[] objArr, int i, int i2, int i3) {
        int i4 = ~i2;
        int i5 = ~i3;
        int i6 = (i * (-830)) + (i2 * 832) + (((~(i4 | i5)) | (~(i | i2 | i3))) * (-831)) + ((~(i4 | i | i3)) * (-1662)) + (((~((~i) | i5)) | (~(i | i3)) | (~(i2 | i3))) * 831);
        if (i6 == 1) {
            return AlternateContactlessPaymentDataJson(objArr);
        }
        if (i6 == 2) {
            return writeReplace(objArr);
        }
        if (i6 != 3) {
            return values(objArr);
        }
        com.payair.hce.setHighlightColor sethighlightcolor = (com.payair.hce.setHighlightColor) objArr[0];
        int i7 = DigitizedCardProfile;
        writeReplace = ((i7 & 57) + (i7 | 57)) % 128;
        int i8 = sethighlightcolor.values;
        int intValue = ((java.lang.Integer) com.payair.hce.setNavigationIcon.DigitizedCardProfile(new java.lang.Object[]{java.lang.Integer.valueOf(i8)}, -334301909, 334301909, i8)).intValue();
        int length = sethighlightcolor.valueOf.length;
        int intValue2 = ((java.lang.Integer) com.payair.hce.setNavigationIcon.DigitizedCardProfile(new java.lang.Object[]{java.lang.Integer.valueOf(length)}, -1174070258, 1174070259, length)).intValue();
        int i9 = ((~intValue2) & intValue) | ((~intValue) & intValue2);
        int i10 = -(-((intValue & intValue2) << 1));
        int i11 = (i9 & i10) + (i10 | i9);
        int length2 = sethighlightcolor.valueOf.length;
        int identityHashCode = java.lang.System.identityHashCode(sethighlightcolor);
        int i12 = length2 * (-661);
        int i13 = -(~(i11 * (-661)));
        int i14 = ~identityHashCode;
        int i15 = (i14 | identityHashCode) & i14;
        int i16 = ~length2;
        int i17 = ~i11;
        int i18 = (i17 | i11) & i17;
        int i19 = i18 & i16;
        int i20 = ~i18;
        int i21 = ~i16;
        int i22 = ~((i20 & i16) | (i21 & i18) | i19);
        int i23 = ((~i15) & i22) | ((~i22) & i15);
        int i24 = i15 & i22;
        int i25 = (((i12 & i13) + (i12 | i13)) - 1) - (~(((i23 ^ i24) | (i24 & i23)) * 1324));
        int i26 = (~i25) + (i25 << 1);
        int i27 = (i14 & length2) | (identityHashCode & i16);
        int i28 = length2 & identityHashCode;
        int i29 = ~((i27 ^ i28) | (i27 & i28));
        int i30 = ~((identityHashCode ^ i11) | (identityHashCode & i11));
        int i31 = -(-(((i30 ^ i29) | (i30 & i29)) * (-1324)));
        int i32 = i26 & i31;
        int i33 = i26 | i31;
        int i34 = (i32 ^ i33) + ((i33 & i32) << 1);
        int i35 = (i16 & i17) | (i21 & i11);
        int i36 = i11 & i16;
        int i37 = ~((i35 ^ i36) | (i36 & i35));
        int i38 = (i20 & length2) | i19;
        int i39 = length2 & i18;
        int i40 = ~((i39 ^ i38) | (i39 & i38));
        int i41 = ((~i40) & i37) | ((~i37) & i40);
        int i42 = i37 & i40;
        int i43 = -(-(((i42 ^ i41) | (i42 & i41)) * 662));
        int i44 = i34 & i43;
        int i45 = -(-((i43 ^ i34) | i44));
        int i46 = DigitizedCardProfile;
        writeReplace = ((((i46 | 84) << 1) - (i46 ^ 84)) - 1) % 128;
        return java.lang.Integer.valueOf((i44 - (~i45)) - 1);
    }

    setHighlightColor(boolean z, int i, byte[] bArr) {
        this.AlternateContactlessPaymentDataJson = z;
        this.values = i;
        this.valueOf = com.payair.hce.getClientVersion.values(bArr);
    }

    private static /* synthetic */ java.lang.Object writeReplace(java.lang.Object[] objArr) {
        com.payair.hce.setHighlightColor sethighlightcolor = (com.payair.hce.setHighlightColor) objArr[0];
        int i = DigitizedCardProfile;
        int i2 = i + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE;
        writeReplace = i2 % 128;
        boolean z = sethighlightcolor.AlternateContactlessPaymentDataJson;
        if (i2 % 2 == 0) {
            throw new java.lang.ArithmeticException();
        }
        int i3 = i + 95;
        writeReplace = i3 % 128;
        if (i3 % 2 != 0) {
            return java.lang.Boolean.valueOf(z);
        }
        throw null;
    }

    private static /* synthetic */ java.lang.Object AlternateContactlessPaymentDataJson(java.lang.Object[] objArr) {
        com.payair.hce.setHighlightColor sethighlightcolor = (com.payair.hce.setHighlightColor) objArr[0];
        int i = writeReplace;
        int i2 = ((i & 10) + (i | 10)) - 1;
        DigitizedCardProfile = i2 % 128;
        int i3 = sethighlightcolor.values;
        if (i2 % 2 != 0) {
            throw new java.lang.ArithmeticException();
        }
        int i4 = i ^ 71;
        int i5 = -(-((i & 71) << 1));
        DigitizedCardProfile = ((i4 ^ i5) + ((i5 & i4) << 1)) % 128;
        return java.lang.Integer.valueOf(i3);
    }

    @Override // com.payair.hce.setEms
    void values(com.payair.hce.setMaxLines setmaxlines) throws java.io.IOException {
        int i;
        int i2 = writeReplace;
        int i3 = i2 & 53;
        int i4 = i2 | 53;
        int i5 = (((i3 | i4) << 1) - (i4 ^ i3)) % 128;
        DigitizedCardProfile = i5;
        if (this.AlternateContactlessPaymentDataJson) {
            int i6 = i5 & 31;
            int i7 = i5 | 31;
            int i8 = (i6 ^ i7) + ((i6 & i7) << 1);
            writeReplace = i8 % 128;
            i = i8 % 2 == 0 ? 43 : 96;
            int i9 = (i5 ^ 23) + ((i5 & 23) << 1);
            writeReplace = i9 % 128;
            int i10 = i9 % 2;
        } else {
            i = 64;
        }
        setmaxlines.DigitizedCardProfile(i, this.values, this.valueOf);
        int i11 = DigitizedCardProfile;
        int i12 = i11 & 47;
        int i13 = (((i11 | 47) & (~i12)) - (~(i12 << 1))) - 1;
        writeReplace = i13 % 128;
        if (i13 % 2 == 0) {
            throw new java.lang.ArithmeticException();
        }
    }

    private static /* synthetic */ java.lang.Object values(java.lang.Object[] objArr) {
        java.lang.Boolean bool = java.lang.Boolean.FALSE;
        com.payair.hce.setHighlightColor sethighlightcolor = (com.payair.hce.setHighlightColor) objArr[0];
        com.payair.hce.setEms setems = (com.payair.hce.setEms) objArr[1];
        int i = writeReplace;
        DigitizedCardProfile = ((-2) - (~(i + 12))) % 128;
        if (!(setems instanceof com.payair.hce.setHighlightColor)) {
            int i2 = ((i & 111) + (i | 111)) % 128;
            DigitizedCardProfile = i2;
            int i3 = i2 & 15;
            int i4 = (i2 | 15) & (~i3);
            int i5 = i3 << 1;
            int i6 = (i4 & i5) + (i4 | i5);
            writeReplace = i6 % 128;
            if (i6 % 2 != 0) {
                return bool;
            }
            throw null;
        }
        com.payair.hce.setHighlightColor sethighlightcolor2 = (com.payair.hce.setHighlightColor) setems;
        if (sethighlightcolor.AlternateContactlessPaymentDataJson == sethighlightcolor2.AlternateContactlessPaymentDataJson) {
            int i7 = (((i | 29) << 1) - ((i & (-30)) | ((~i) & 29))) % 128;
            DigitizedCardProfile = i7;
            if (sethighlightcolor.values == sethighlightcolor2.values) {
                int i8 = (((i7 | 82) << 1) - (i7 ^ 82)) - 1;
                writeReplace = i8 % 128;
                byte[] bArr = sethighlightcolor.valueOf;
                byte[] bArr2 = sethighlightcolor2.valueOf;
                if (i8 % 2 == 0) {
                    com.payair.hce.getClientVersion.AlternateContactlessPaymentDataJson(bArr, bArr2);
                    throw new java.lang.ArithmeticException();
                }
                if (com.payair.hce.getClientVersion.AlternateContactlessPaymentDataJson(bArr, bArr2)) {
                    int i9 = DigitizedCardProfile;
                    int i10 = (-2) - (~((i9 & 24) + (i9 | 24)));
                    writeReplace = i10 % 128;
                    return java.lang.Boolean.valueOf(i10 % 2 != 0);
                }
            }
        }
        int i11 = writeReplace;
        int i12 = (i11 ^ 67) + ((i11 & 67) << 1);
        DigitizedCardProfile = i12 % 128;
        if (i12 % 2 == 0) {
            return bool;
        }
        throw null;
    }

    @Override // com.payair.hce.setGravity
    public int hashCode() {
        int i = writeReplace;
        int i2 = i & 101;
        int i3 = (i2 + ((i ^ 101) | i2)) % 128;
        DigitizedCardProfile = i3;
        int i4 = 1;
        if (this.AlternateContactlessPaymentDataJson) {
            int i5 = i3 & 5;
            int i6 = -(-((i3 ^ 5) | i5));
            writeReplace = ((i5 ^ i6) + ((i5 & i6) << 1)) % 128;
            int i7 = ((i3 ^ 21) | (i3 & 21)) << 1;
            int i8 = -((i3 & (-22)) | ((~i3) & 21));
            writeReplace = ((i7 & i8) + (i7 | i8)) % 128;
        } else {
            writeReplace = ((i3 ^ 61) + ((i3 & 61) << 1)) % 128;
            i4 = 0;
        }
        int i9 = this.values;
        int i10 = i4 & i9;
        int i11 = ((i9 ^ i4) | i10) & (~i10);
        int AlternateContactlessPaymentDataJson = com.payair.hce.getClientVersion.AlternateContactlessPaymentDataJson(this.valueOf);
        DigitizedCardProfile = (writeReplace + 111) % 128;
        return (~(i11 & AlternateContactlessPaymentDataJson)) & (i11 | AlternateContactlessPaymentDataJson);
    }

    @Override // com.payair.hce.setEms
    final boolean AlternateContactlessPaymentDataJson(com.payair.hce.setEms setems) {
        return ((java.lang.Boolean) values(new java.lang.Object[]{this, setems}, -580473624, 580473624, java.lang.System.identityHashCode(this))).booleanValue();
    }

    @Override // com.payair.hce.setEms
    final int AlternateContactlessPaymentDataJson() throws java.io.IOException {
        return ((java.lang.Integer) values(new java.lang.Object[]{this}, -1246311726, 1246311729, java.lang.System.identityHashCode(this))).intValue();
    }

    public final int values() {
        return ((java.lang.Integer) values(new java.lang.Object[]{this}, -17796902, 17796903, java.lang.System.identityHashCode(this))).intValue();
    }

    @Override // com.payair.hce.setEms
    public final boolean writeReplace() {
        return ((java.lang.Boolean) values(new java.lang.Object[]{this}, 455393978, -455393976, java.lang.System.identityHashCode(this))).booleanValue();
    }
}
