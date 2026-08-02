package com.payair.hce;

/* loaded from: classes4.dex */
final class setTitleTextColor extends com.payair.hce.setNavigationOnClickListener {
    private static int SdkCoreAlternateContactlessPaymentDataImpl = 0;
    private static int getAid = 1;
    private int AlternateContactlessPaymentDataJson;
    private int DigitizedCardProfile;
    private boolean valueOf;
    private boolean writeReplace;

    public static /* synthetic */ java.lang.Object DigitizedCardProfile(java.lang.Object[] objArr, int i, int i2, int i3) {
        int i4 = ~i;
        int i5 = ~i3;
        int i6 = ~i2;
        int i7 = i4 | i6;
        int i8 = (i * 868) + (i2 * 868) + (((~(i4 | i5)) | (~(i6 | i5))) * (-867)) + (((~i7) | (~(i4 | i3)) | (~(i6 | i3))) * (-1734)) + (((~(i | i6 | i3)) | (~(i2 | i4 | i3)) | (~(i5 | i7))) * 867);
        return i8 != 1 ? i8 != 2 ? i8 != 3 ? DigitizedCardProfile(objArr) : AlternateContactlessPaymentDataJson(objArr) : valueOf(objArr) : writeReplace(objArr);
    }

    setTitleTextColor(java.io.InputStream inputStream, int i) throws java.io.IOException {
        super(inputStream, i);
        this.writeReplace = false;
        this.valueOf = true;
        this.DigitizedCardProfile = inputStream.read();
        int read = inputStream.read();
        this.AlternateContactlessPaymentDataJson = read;
        if (read < 0) {
            throw new java.io.EOFException();
        }
    }

    private static /* synthetic */ java.lang.Object writeReplace(java.lang.Object[] objArr) {
        com.payair.hce.setTitleTextColor settitletextcolor = (com.payair.hce.setTitleTextColor) objArr[0];
        boolean booleanValue = ((java.lang.Boolean) objArr[1]).booleanValue();
        int i = SdkCoreAlternateContactlessPaymentDataImpl;
        int i2 = i & 107;
        int i3 = ((i | 107) & (~i2)) + (i2 << 1);
        getAid = i3 % 128;
        if (i3 % 2 != 0) {
            settitletextcolor.valueOf = booleanValue;
            int i4 = SdkCoreAlternateContactlessPaymentDataImpl + 71;
            getAid = i4 % 128;
            if (i4 % 2 != 0) {
                return null;
            }
            throw null;
        }
        settitletextcolor.valueOf = booleanValue;
        throw null;
    }

    private static /* synthetic */ java.lang.Object DigitizedCardProfile(java.lang.Object[] objArr) {
        com.payair.hce.setTitleTextColor settitletextcolor = (com.payair.hce.setTitleTextColor) objArr[0];
        int i = SdkCoreAlternateContactlessPaymentDataImpl;
        int i2 = i & 31;
        int i3 = -(-((i ^ 31) | i2));
        int i4 = ((i2 & i3) + (i3 | i2)) % 128;
        getAid = i4;
        if (!settitletextcolor.writeReplace) {
            int i5 = i4 & 93;
            int i6 = (i5 - (~((i4 ^ 93) | i5))) - 1;
            int i7 = i6 % 128;
            SdkCoreAlternateContactlessPaymentDataImpl = i7;
            if (i6 % 2 != 0) {
                boolean z = settitletextcolor.valueOf;
                throw null;
            }
            if (settitletextcolor.valueOf && settitletextcolor.DigitizedCardProfile == 0) {
                int i8 = i7 & 71;
                getAid = ((i8 - (~((i7 ^ 71) | i8))) - 1) % 128;
                if (settitletextcolor.AlternateContactlessPaymentDataJson == 0) {
                    int i9 = i7 ^ com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE;
                    getAid = (((((i7 & com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) | i9) << 1) - (~(-i9))) - 1) % 128;
                    settitletextcolor.writeReplace = true;
                    settitletextcolor.AlternateContactlessPaymentDataJson();
                    int i10 = getAid;
                    int i11 = i10 & 29;
                    int i12 = ((i10 ^ 29) | i11) << 1;
                    int i13 = -((i10 | 29) & (~i11));
                    SdkCoreAlternateContactlessPaymentDataImpl = (((i12 | i13) << 1) - (i13 ^ i12)) % 128;
                }
            }
        }
        boolean z2 = settitletextcolor.writeReplace;
        int i14 = SdkCoreAlternateContactlessPaymentDataImpl + 121;
        getAid = i14 % 128;
        if (i14 % 2 != 0) {
            return java.lang.Boolean.valueOf(z2);
        }
        throw new java.lang.ArithmeticException();
    }

    private static /* synthetic */ java.lang.Object valueOf(java.lang.Object[] objArr) {
        com.payair.hce.setTitleTextColor settitletextcolor = (com.payair.hce.setTitleTextColor) objArr[0];
        byte[] bArr = (byte[]) objArr[1];
        int intValue = ((java.lang.Number) objArr[2]).intValue();
        int intValue2 = ((java.lang.Number) objArr[3]).intValue();
        int i = SdkCoreAlternateContactlessPaymentDataImpl;
        int i2 = ((i & (-98)) | ((~i) & 97)) + ((i & 97) << 1);
        getAid = i2 % 128;
        if (i2 % 2 == 0) {
            boolean z = settitletextcolor.valueOf;
            throw null;
        }
        if (settitletextcolor.valueOf || intValue2 < 3) {
            int read = super.read(bArr, intValue, intValue2);
            int i3 = SdkCoreAlternateContactlessPaymentDataImpl + 100;
            getAid = ((~i3) + (i3 << 1)) % 128;
            return java.lang.Integer.valueOf(read);
        }
        if (settitletextcolor.writeReplace) {
            int i4 = i | 121;
            int i5 = (((i4 << 1) - (~(-(i4 & (~(i & 121)))))) - 1) % 128;
            getAid = i5;
            SdkCoreAlternateContactlessPaymentDataImpl = (((i5 & 84) + (i5 | 84)) - 1) % 128;
            return -1;
        }
        java.io.InputStream inputStream = settitletextcolor.values;
        int i6 = (intValue * (-661)) - 1322;
        int i7 = ~intValue;
        int i8 = (i7 | intValue) & i7;
        int i9 = i7 & (-3);
        int i10 = (~i9) & (i7 | (-3));
        int i11 = ~((i10 & i9) | (i10 ^ i9));
        int i12 = i8 ^ i11;
        int i13 = i11 & i8;
        int i14 = -(~(((i13 ^ i12) | (i13 & i12)) * 1324));
        int i15 = (i6 & i14) + (i6 | i14);
        int i16 = (~i15) + (i15 << 1);
        int i17 = ~(intValue | 2);
        int i18 = i7 & intValue;
        int i19 = ~((i18 ^ intValue) | (i18 & intValue));
        int i20 = -(~(-(-(((i17 ^ i19) | (i17 & i19)) * (-1324)))));
        int i21 = ((i16 & i20) + (i16 | i20)) - 1;
        int i22 = intValue & 2;
        int i23 = ~(i9 | i22 | (intValue & (-3)));
        int i24 = i7 | 2;
        int i25 = ~i24;
        int i26 = (i24 | i25) & i25;
        int i27 = i23 & i26;
        int i28 = (i26 | i23) & (~i27);
        int i29 = -(~(((i28 ^ i27) | (i28 & i27)) * 662));
        int i30 = -(-(intValue2 * (-987)));
        int i31 = i30 & (-1978);
        int i32 = -(-((i30 ^ (-1978)) | i31));
        int i33 = (i31 & i32) + (i32 | i31);
        int i34 = ~intValue2;
        int i35 = (~i8) & i34;
        int i36 = ~i34;
        int i37 = i35 | (i36 & i8);
        int i38 = i34 & i8;
        int i39 = (i37 & i38) | (i37 ^ i38);
        int i40 = i39 & (-2);
        int i41 = (~i40) & (i39 | (-2));
        int i42 = (i41 ^ i40) | (i41 & i40);
        int i43 = ~i42;
        int i44 = (i42 | i43) & i43;
        int i45 = intValue2 | (-2);
        int i46 = (i45 ^ intValue) | (i45 & intValue);
        int i47 = ~i46;
        int i48 = (i46 | i47) & i47;
        int i49 = -(-((((~i48) & i44) | ((~i44) & i48) | (i48 & i44)) * 988));
        int i50 = (i33 & i49) + (i49 | i33);
        int i51 = i34 & 1;
        int i52 = (i36 & (-2)) | i51;
        int i53 = i34 & (-2);
        int i54 = ((i52 ^ i53) | (i53 & i52)) * (-988);
        int i55 = i50 & i54;
        int i56 = (i54 | i50) & (~i55);
        int i57 = -(-(i55 << 1));
        int i58 = ~(i51 | (i34 ^ 1));
        int i59 = i34 & (i34 | intValue2);
        int i60 = i59 ^ intValue;
        int i61 = i59 & intValue;
        int i62 = ~((i61 ^ i60) | (i61 & i60));
        int i63 = (i58 ^ i62) | (i62 & i58);
        int i64 = (i8 & (-2)) | (i8 ^ (-2));
        int i65 = i64 & intValue2;
        int i66 = ~(((intValue2 | i64) & (~i65)) | i65);
        int read2 = inputStream.read(bArr, (((i21 | i29) << 1) - (i29 ^ i21)) - 1, (-2) - (~(((((i56 | i57) << 1) - (i56 ^ i57)) - (~(-(~(-(-(((i63 & i66) | (i63 ^ i66)) * 988))))))) - 1)));
        if (read2 < 0) {
            throw new java.io.EOFException();
        }
        bArr[intValue] = (byte) settitletextcolor.DigitizedCardProfile;
        bArr[((intValue ^ 2) + (i22 << 1)) - 1] = (byte) settitletextcolor.AlternateContactlessPaymentDataJson;
        settitletextcolor.DigitizedCardProfile = settitletextcolor.values.read();
        int read3 = settitletextcolor.values.read();
        settitletextcolor.AlternateContactlessPaymentDataJson = read3;
        if (read3 < 0) {
            throw new java.io.EOFException();
        }
        int i67 = read2 & 2;
        int i68 = (read2 ^ 2) | i67;
        int i69 = getAid;
        int i70 = i69 & 119;
        int i71 = (((i69 ^ 119) | i70) << 1) - ((i69 | 119) & (~i70));
        SdkCoreAlternateContactlessPaymentDataImpl = i71 % 128;
        if (i71 % 2 == 0) {
            return java.lang.Integer.valueOf(((i67 | i68) << 1) - (i67 ^ i68));
        }
        throw null;
    }

    private static /* synthetic */ java.lang.Object AlternateContactlessPaymentDataJson(java.lang.Object[] objArr) {
        com.payair.hce.setTitleTextColor settitletextcolor = (com.payair.hce.setTitleTextColor) objArr[0];
        int i = SdkCoreAlternateContactlessPaymentDataImpl;
        int i2 = (i & 39) + (i | 39);
        getAid = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
        if (((java.lang.Boolean) DigitizedCardProfile(new java.lang.Object[]{settitletextcolor}, -1523817988, 1523817988, java.lang.System.identityHashCode(settitletextcolor))).booleanValue()) {
            int i3 = getAid + 90;
            int i4 = (~i3) + (i3 << 1);
            SdkCoreAlternateContactlessPaymentDataImpl = i4 % 128;
            if (i4 % 2 == 0) {
                return -1;
            }
            throw null;
        }
        int read = settitletextcolor.values.read();
        if (read < 0) {
            throw new java.io.EOFException();
        }
        int i5 = settitletextcolor.DigitizedCardProfile;
        settitletextcolor.DigitizedCardProfile = settitletextcolor.AlternateContactlessPaymentDataJson;
        settitletextcolor.AlternateContactlessPaymentDataJson = read;
        int i6 = SdkCoreAlternateContactlessPaymentDataImpl + 15;
        getAid = i6 % 128;
        if (i6 % 2 != 0) {
            return java.lang.Integer.valueOf(i5);
        }
        throw null;
    }

    @Override // java.io.InputStream
    public final int read() throws java.io.IOException {
        return ((java.lang.Integer) DigitizedCardProfile(new java.lang.Object[]{this}, -1443158578, 1443158581, java.lang.System.identityHashCode(this))).intValue();
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws java.io.IOException {
        return ((java.lang.Integer) DigitizedCardProfile(new java.lang.Object[]{this, bArr, java.lang.Integer.valueOf(i), java.lang.Integer.valueOf(i2)}, 1072647244, -1072647242, i)).intValue();
    }

    private boolean valueOf() {
        return ((java.lang.Boolean) DigitizedCardProfile(new java.lang.Object[]{this}, -1523817988, 1523817988, java.lang.System.identityHashCode(this))).booleanValue();
    }

    final void DigitizedCardProfile(boolean z) {
        DigitizedCardProfile(new java.lang.Object[]{this, java.lang.Boolean.valueOf(z)}, -2016885196, 2016885197, java.lang.System.identityHashCode(this));
    }
}
