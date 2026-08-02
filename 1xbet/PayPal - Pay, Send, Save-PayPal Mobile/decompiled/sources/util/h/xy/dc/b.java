package util.h.xy.dc;

/* loaded from: classes5.dex */
public final class b {
    private static int getInputFormats = 1;
    private static int getInputSizeshNQ4ISI;
    static final byte[] Camera2StreamConfigurationMap = new byte[256];
    static final byte[] getHighResolutionOutputSizeshNQ4ISI = new byte[256];
    static final int[] getHighSpeedVideoSizes = new int[256];
    static final int[] getOutputFormats = new int[256];
    static final int[] getHighSpeedVideoFpsRangesFor = new int[256];
    static final int[] getHighSpeedVideoSizesFor = new int[256];
    static final int[] getHighSpeedVideoFpsRanges = new int[10];

    static {
        byte b;
        byte b2;
        int i;
        byte[] bArr;
        int i2;
        int i3 = getInputFormats + 45;
        getInputSizeshNQ4ISI = i3 % 128;
        if (i3 % 2 != 0) {
            b = 0;
            b2 = 1;
        } else {
            b = 1;
            b2 = 1;
        }
        do {
            int i4 = b << 1;
            int i5 = ((~i4) & b) | ((~b) & i4);
            int i6 = b & 128;
            byte b3 = com.visa.cbp.getEncExpo.addOnTrimMemoryListener;
            if (i6 != 0) {
                int i7 = getInputFormats + 95;
                getInputSizeshNQ4ISI = i7 % 128;
                i = i7 % 2 != 0 ? 62 : 27;
            } else {
                i = 0;
            }
            b = (byte) (((~i) & i5) | ((~i5) & i));
            int i8 = b2 << 1;
            byte b4 = (byte) ((b2 & (~i8)) | ((~b2) & i8));
            byte b5 = (byte) (b4 ^ (b4 << 2));
            byte b6 = (byte) (b5 ^ (b5 << 4));
            if ((b6 & 128) != 0) {
                int i9 = getInputFormats;
                int i10 = (i9 ^ 21) + ((i9 & 21) << 1);
                int i11 = i10 % 128;
                getInputSizeshNQ4ISI = i11;
                if (i10 % 2 == 0) {
                    b3 = 9;
                }
                getInputFormats = (((i11 | 93) << 1) - (i11 ^ 93)) % 128;
            } else {
                b3 = 0;
            }
            b2 = (byte) ((~(b6 & b3)) & (b6 | b3));
            bArr = Camera2StreamConfigurationMap;
            i2 = b & 255;
            int i12 = (~(b2 & 99)) & (b2 | 99);
            int highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges(b2, 1);
            int i13 = (i12 & (~highSpeedVideoFpsRanges)) | ((~i12) & highSpeedVideoFpsRanges);
            int highSpeedVideoFpsRanges2 = getHighSpeedVideoFpsRanges(b2, 2);
            int highSpeedVideoFpsRanges3 = ((i13 & (~highSpeedVideoFpsRanges2)) | ((~i13) & highSpeedVideoFpsRanges2)) ^ getHighSpeedVideoFpsRanges(b2, 3);
            int highSpeedVideoFpsRanges4 = getHighSpeedVideoFpsRanges(b2, 4);
            bArr[i2] = (byte) ((highSpeedVideoFpsRanges3 & (~highSpeedVideoFpsRanges4)) | ((~highSpeedVideoFpsRanges3) & highSpeedVideoFpsRanges4));
        } while (i2 != 1);
        int i14 = getInputSizeshNQ4ISI;
        int i15 = ((i14 | 9) << 1) - (i14 ^ 9);
        getInputFormats = i15 % 128;
        if (i15 % 2 == 0) {
            bArr[0] = 44;
        } else {
            bArr[0] = 99;
        }
        int i16 = ((i14 | 33) << 1) - (i14 ^ 33);
        getInputFormats = i16 % 128;
        int i17 = i16 % 2;
        for (int i18 = 0; i18 < 256; i18 = (i18 & (-67)) + (i18 | (-67)) + 68) {
            int i19 = (getInputSizeshNQ4ISI + 13) % 128;
            getInputFormats = i19;
            int i20 = Camera2StreamConfigurationMap[i18] & 255;
            getHighResolutionOutputSizeshNQ4ISI[i20] = (byte) i18;
            int i21 = i18 << 1;
            if (i21 >= 256) {
                int i22 = (i19 ^ 11) + ((i19 & 11) << 1);
                getInputSizeshNQ4ISI = i22 % 128;
                if (i22 % 2 != 0) {
                    throw new java.lang.ArithmeticException();
                }
                i21 ^= 283;
            }
            int i23 = i21 << 1;
            if (i23 >= 256) {
                int i24 = ((i19 | 43) << 1) - (i19 ^ 43);
                getInputSizeshNQ4ISI = i24 % 128;
                if (i24 % 2 != 0) {
                    throw null;
                }
                i23 = (i23 & (-284)) | ((~i23) & 283);
                int i25 = (i19 ^ 39) + ((i19 & 39) << 1);
                getInputSizeshNQ4ISI = i25 % 128;
                int i26 = i25 % 2;
            }
            int i27 = i23 << 1;
            if (i27 >= 256) {
                int i28 = getInputSizeshNQ4ISI + 53;
                getInputFormats = i28 % 128;
                if (i28 % 2 == 0) {
                    throw null;
                }
                i27 = ((~i27) & 283) | (i27 & (-284));
            }
            int i29 = (~(i27 & i18)) & (i27 | i18);
            int i30 = (((~(i27 & i23)) & (i27 | i23)) ^ i21) << 24;
            int i31 = i29 << 16;
            int i32 = (i30 ^ i31) | (i31 & i30);
            int i33 = ((i23 & (~i29)) | ((~i23) & i29)) << 8;
            int i34 = (i32 ^ i33) | (i32 & i33) | (i21 ^ i29);
            getHighSpeedVideoSizes[i20] = i34;
            int i35 = i34 >>> 8;
            int i36 = i34 << 24;
            getOutputFormats[i20] = (i35 ^ i36) | (i35 & i36);
            int i37 = i34 >>> 16;
            int i38 = i34 << 16;
            getHighSpeedVideoFpsRangesFor[i20] = (i37 ^ i38) | (i37 & i38);
            int i39 = i34 >>> 24;
            int i40 = i34 << 8;
            getHighSpeedVideoSizesFor[i20] = (i40 ^ i39) | (i40 & i39);
        }
        getHighSpeedVideoFpsRanges();
    }

    static int[] getHighResolutionOutputSizeshNQ4ISI(byte[] bArr, int i) throws java.lang.IllegalArgumentException {
        int i2;
        int i3 = getInputFormats;
        getInputSizeshNQ4ISI = ((i3 & 27) + (i3 | 27)) % 128;
        if (bArr.length != 16) {
            throw new java.lang.IllegalArgumentException();
        }
        int i4 = 915 - (~(-(-(i * 306))));
        int i5 = ~(i | 1);
        int i6 = ~((i ^ 1) | (i & 1));
        int i7 = -(-(((i5 ^ i6) | (i5 & i6)) * 305));
        int i8 = (i4 & i7) + (i4 | i7);
        int i9 = ~i;
        int i10 = ~(i9 | 1);
        int i11 = -(-(((i10 ^ i9) | (i10 & i9)) * 305));
        int i12 = (i8 & i11) + (i11 | i8);
        int i13 = 4;
        int i14 = i12 * 4;
        int[] iArr = new int[i14];
        int i15 = i3 + 21;
        getInputSizeshNQ4ISI = i15 % 128;
        int i16 = i15 % 2;
        int i17 = 0;
        int i18 = 0;
        while (true) {
            i2 = 1;
            if (i17 >= 4) {
                break;
            }
            int i19 = getInputFormats;
            getInputSizeshNQ4ISI = (((i19 | 65) << 1) - (i19 ^ 65)) % 128;
            int i20 = ((i18 | 1) << 1) - (i18 ^ 1);
            int i21 = bArr[i18] << com.google.common.base.Ascii.CAN;
            int i22 = i20 + 25;
            int i23 = ((i22 | (-24)) << 1) - (i22 ^ (-24));
            int i24 = (bArr[i20] & 255) << 16;
            int i25 = (i21 ^ i24) | (i21 & i24);
            int i26 = i23 + 1;
            int i27 = (bArr[i23] & 255) << 8;
            int i28 = (i25 ^ i27) | (i25 & i27);
            int i29 = bArr[i26] & 255;
            iArr[i17] = (i28 ^ i29) | (i28 & i29);
            i17++;
            getInputSizeshNQ4ISI = (((i19 | com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) << 1) - (i19 ^ com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE)) % 128;
            i18 = ((i26 | 1) << 1) - (1 ^ i26);
        }
        int i30 = getInputSizeshNQ4ISI;
        getInputFormats = ((i30 & 29) + (i30 | 29)) % 128;
        int i31 = 0;
        int i32 = 0;
        int i33 = 4;
        while (i33 < i14) {
            int i34 = getInputSizeshNQ4ISI;
            getInputFormats = (((i34 | 121) << 1) - (i34 ^ 121)) % 128;
            int i35 = (i33 * (-978)) - 980;
            int i36 = ~i33;
            int i37 = (~((i36 ^ i9) | (i36 & i9))) * 979;
            int i38 = (i35 & i37) + (i37 | i35);
            int i39 = ((i ^ (-1)) | i) * (-979);
            int i40 = ((i38 | i39) << 1) - (i39 ^ i38);
            int i41 = -(-((~((i36 ^ i) | (i36 & i))) * 979));
            int i42 = iArr[((i40 | i41) << 1) - (i41 ^ i40)];
            if (i32 == 0) {
                getInputFormats = ((i34 ^ 27) + ((i34 & 27) << 1)) % 128;
                byte[] bArr2 = Camera2StreamConfigurationMap;
                int i43 = bArr2[(i42 >>> 16) & 255] << com.google.common.base.Ascii.CAN;
                int i44 = (bArr2[(i42 >>> 8) & 255] & 255) << 16;
                int i45 = (i43 ^ i44) | (i43 & i44);
                int i46 = (bArr2[i42 & 255] & 255) << 8;
                int i47 = (i45 ^ i46) | (i45 & i46);
                int i48 = bArr2[i42 >>> 24] & 255;
                int i49 = (i48 ^ i47) | (i48 & i47);
                int i50 = (i31 ^ (-7)) + ((i31 & (-7)) << 1);
                int i51 = getHighSpeedVideoFpsRanges[i31];
                i42 = (i49 | i51) & (~(i49 & i51));
                i31 = ((i50 | 8) << 1) - (i50 ^ 8);
                i32 = 4;
            }
            int i52 = (-3737) - (~(-(-(i33 * (-932)))));
            int i53 = ~((i9 ^ 3) | (i9 & 3));
            int i54 = -(-(((i36 ^ i53) | (i53 & i36)) * (-933)));
            int i55 = ((i52 | i54) << 1) - (i52 ^ i54);
            int i56 = ~(i9 | i36);
            int i57 = ~(i36 | (-4));
            int i58 = -(-(((i56 ^ i57) | (i56 & i57)) * 933));
            int i59 = (i55 & i58) + (i55 | i58);
            int i60 = (~((i33 & (-4)) | (i33 ^ (-4)))) * 933;
            int i61 = iArr[(i59 ^ i60) + ((i60 & i59) << 1)];
            iArr[i33] = ((~i42) & i61) | ((~i61) & i42);
            int i62 = i33 + 22;
            i33 = (i62 ^ (-21)) + ((i62 & (-21)) << 1);
            i32 = (((i32 | (-68)) << 1) - (i32 ^ (-68))) + 67;
        }
        int i63 = getInputFormats;
        getInputSizeshNQ4ISI = ((i63 ^ 99) + ((i63 & 99) << 1)) % 128;
        int i64 = (i63 + 45) % 128;
        getInputSizeshNQ4ISI = i64;
        if (bArr.length != 16) {
            throw new java.lang.IllegalArgumentException();
        }
        int[] iArr2 = new int[(i + 1) * 4];
        int i65 = i * 4;
        int i66 = (i65 ^ 1) + ((i65 & 1) << 1);
        iArr2[0] = iArr[i65];
        int i67 = i66 + 1;
        iArr2[1] = iArr[i66];
        int i68 = (i67 & (-36)) + (i67 | (-36));
        int i69 = (i68 ^ 37) + ((i68 & 37) << 1);
        iArr2[2] = iArr[i67];
        iArr2[3] = iArr[i69];
        int i70 = ((i69 | (-7)) << 1) - (i69 ^ (-7));
        getInputFormats = (i64 + 79) % 128;
        int i71 = 1;
        while (i71 < i) {
            int i72 = getInputFormats;
            getInputSizeshNQ4ISI = (((i72 | 121) << i2) - (i72 ^ 121)) % 128;
            int i73 = (i70 & (-65)) + (i70 | (-65)) + 66;
            int i74 = iArr[i70];
            int i75 = (i13 & (-74)) + (i13 | (-74));
            int i76 = (i75 & 75) + (i75 | 75);
            int[] iArr3 = getHighSpeedVideoSizes;
            byte[] bArr3 = Camera2StreamConfigurationMap;
            int i77 = iArr3[bArr3[i74 >>> 24] & 255];
            int[] iArr4 = getOutputFormats;
            int i78 = iArr4[bArr3[(i74 >>> 16) & 255] & 255];
            int[] iArr5 = getHighSpeedVideoFpsRangesFor;
            int i79 = ((~(i77 & i78)) & (i77 | i78)) ^ iArr5[bArr3[(i74 >>> 8) & 255] & 255];
            int[] iArr6 = getHighSpeedVideoSizesFor;
            int i80 = iArr6[bArr3[i74 & 255] & 255];
            iArr2[i13] = (~(i80 & i79)) & (i80 | i79);
            int i81 = (i73 ^ (-114)) + ((i73 & (-114)) << i2) + 115;
            int i82 = iArr[i73];
            int i83 = i76 + 1;
            int i84 = iArr3[bArr3[i82 >>> 24] & 255] ^ iArr4[bArr3[(i82 >>> 16) & 255] & 255];
            int i85 = iArr5[bArr3[(i82 >>> 8) & 255] & 255];
            int i86 = (i84 | i85) & (~(i84 & i85));
            int i87 = iArr6[bArr3[i82 & 255] & 255];
            iArr2[i76] = ((~i87) & i86) | ((~i86) & i87);
            int i88 = ((i81 | 16) << 1) - (i81 ^ 16);
            int i89 = (i88 & (-15)) + (i88 | (-15));
            int i90 = iArr[i81];
            int i91 = (i83 ^ 1) + ((i83 & 1) << 1);
            int i92 = (iArr3[bArr3[i90 >>> 24] & 255] ^ iArr4[bArr3[(i90 >>> 16) & 255] & 255]) ^ iArr5[bArr3[(i90 >>> 8) & 255] & 255];
            int i93 = iArr6[bArr3[i90 & 255] & 255];
            iArr2[i83] = ((~i93) & i92) | ((~i92) & i93);
            int i94 = iArr[i89];
            int i95 = ((i91 | 77) << 1) - (i91 ^ 77);
            int i96 = iArr3[bArr3[i94 >>> 24] & 255] ^ iArr4[bArr3[(i94 >>> 16) & 255] & 255];
            int i97 = iArr5[bArr3[(i94 >>> 8) & 255] & 255];
            iArr2[i91] = iArr6[bArr3[i94 & 255] & 255] ^ ((~(i96 & i97)) & (i96 | i97));
            i70 = ((i89 | (-7)) << 1) - (i89 ^ (-7));
            i71++;
            i13 = (i95 & (-76)) + (i95 | (-76));
            i2 = 1;
        }
        int i98 = (i13 & (-116)) + (i13 | (-116));
        int i99 = (i98 ^ 117) + ((i98 & 117) << 1);
        int i100 = (i70 & 1) + (i70 | 1);
        iArr2[i13] = iArr[i70];
        int i101 = ((i99 | (-88)) << 1) - (i99 ^ (-88));
        int i102 = (i100 & (-26)) + (i100 | (-26)) + 27;
        iArr2[i99] = iArr[i100];
        int i103 = i101 + 72;
        iArr2[i101 + 89] = iArr[i102];
        iArr2[((i103 | 18) << 1) - (i103 ^ 18)] = iArr[(i102 & 1) + (i102 | 1)];
        int i104 = getInputFormats;
        getInputSizeshNQ4ISI = (((i104 | 61) << 1) - (i104 ^ 61)) % 128;
        return iArr2;
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    public static byte[][] m26266(int i) {
        int i2 = getInputFormats + 119;
        int i3 = i2 % 128;
        getInputSizeshNQ4ISI = i3;
        byte[][] bArr = i2 % 2 != 0 ? new byte[2][] : new byte[4][];
        getInputFormats = ((i3 ^ 43) + ((i3 & 43) << 1)) % 128;
        int i4 = 0;
        while (i4 < bArr.length) {
            int i5 = (getInputSizeshNQ4ISI + 5) % 128;
            getInputFormats = i5;
            int i6 = i >>> (i4 * 8);
            bArr[i4] = new byte[]{(byte) (i6 & 3), (byte) ((i6 >> 2) & 3), (byte) ((i6 >> 4) & 3), (byte) ((i6 >> 6) & 3)};
            i4 = (i4 ^ 1) + ((i4 & 1) << 1);
            getInputSizeshNQ4ISI = (((i5 | 65) << 1) - (i5 ^ 65)) % 128;
        }
        int i7 = getInputFormats;
        getInputSizeshNQ4ISI = ((i7 ^ 87) + ((i7 & 87) << 1)) % 128;
        return bArr;
    }

    private static void getHighSpeedVideoFpsRanges() {
        int i = getInputSizeshNQ4ISI;
        getInputFormats = (((i | 35) << 1) - (i ^ 35)) % 128;
        getHighSpeedVideoFpsRanges[0] = 16777216;
        int i2 = 1;
        int i3 = 1;
        while (i2 < 10) {
            int i4 = getInputFormats;
            getInputSizeshNQ4ISI = (i4 + 119) % 128;
            i3 <<= 1;
            if (i3 >= 256) {
                int i5 = i4 + 47;
                int i6 = i5 % 128;
                getInputSizeshNQ4ISI = i6;
                if (i5 % 2 != 0) {
                    throw new java.lang.ArithmeticException();
                }
                i3 = (~(i3 & 283)) & (i3 | 283);
                getInputFormats = (((i6 | 111) << 1) - (i6 ^ 111)) % 128;
            }
            getHighSpeedVideoFpsRanges[i2] = i3 << 24;
            int i7 = ((i2 | (-41)) << 1) - (i2 ^ (-41));
            i2 = (i7 & 42) + (i7 | 42);
            int i8 = getInputSizeshNQ4ISI;
            getInputFormats = ((i8 & 5) + (i8 | 5)) % 128;
        }
        int i9 = getInputSizeshNQ4ISI + 7;
        getInputFormats = i9 % 128;
        if (i9 % 2 == 0) {
            throw null;
        }
    }

    private static int getHighSpeedVideoFpsRanges(byte b, int i) {
        int i2 = getInputSizeshNQ4ISI;
        getInputFormats = (i2 + 65) % 128;
        int i3 = b & 255;
        int i4 = i3 << i;
        int i5 = -i;
        int i6 = ~i;
        int i7 = ~((i6 & (-9)) | (i6 ^ (-9)));
        int i8 = ~((i5 ^ (-9)) | (i5 & (-9)));
        int i9 = (i7 ^ i8) | (i7 & i8);
        int i10 = ~((i6 ^ i5) | (i6 & i5));
        int i11 = (~i5) | i;
        int i12 = i3 >> (((((((i5 * 465) - 3704) + (((i10 ^ i9) | (i9 & i10)) * 464)) - (~(-(-(((i11 & (-9)) | (i11 ^ (-9))) * (-464)))))) - 1) - (~(((~((i ^ i5) | (i & i5))) | i8) * 464))) - 1);
        getInputFormats = (i2 + 101) % 128;
        return (i12 ^ i4) | (i12 & i4);
    }
}
