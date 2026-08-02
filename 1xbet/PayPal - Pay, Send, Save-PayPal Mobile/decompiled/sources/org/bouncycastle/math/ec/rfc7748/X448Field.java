package org.bouncycastle.math.ec.rfc7748;

/* loaded from: classes17.dex */
public abstract class X448Field {
    public static final int SIZE = 16;
    private static final int[] getHighSpeedVideoSizes = {-1, -1, -1, -1, -1, -1, -1, -2, -1, -1, -1, -1, -1, -1};

    private static void Camera2StreamConfigurationMap(int[] iArr, int i, byte[] bArr, int i2) {
        int i3 = iArr[i];
        int i4 = iArr[i + 1];
        getHighSpeedVideoFpsRangesFor((i4 << 28) | i3, bArr, i2);
        bArr[i2 + 4] = (byte) (i4 >>> 4);
        bArr[i2 + 5] = (byte) (i4 >>> 12);
        bArr[i2 + 6] = (byte) (i4 >>> 20);
    }

    public static boolean sqrtRatioVar(int[] iArr, int[] iArr2, int[] iArr3) {
        int[] create = create();
        int[] create2 = create();
        sqr(iArr, create);
        mul(create, iArr2, create);
        sqr(create, create2);
        mul(create, iArr, create);
        mul(create2, iArr, create2);
        mul(create2, iArr2, create2);
        int[] create3 = create();
        int[] create4 = create();
        sqr(create2, create4);
        mul(create2, create4, create4);
        int[] create5 = create();
        sqr(create4, create5);
        mul(create2, create5, create5);
        int[] create6 = create();
        sqr(create5, 3, create6);
        mul(create5, create6, create6);
        int[] create7 = create();
        sqr(create6, 3, create7);
        mul(create5, create7, create7);
        int[] create8 = create();
        sqr(create7, 9, create8);
        mul(create7, create8, create8);
        int[] create9 = create();
        sqr(create8, create9);
        mul(create2, create9, create9);
        int[] create10 = create();
        sqr(create9, 18, create10);
        mul(create8, create10, create10);
        int[] create11 = create();
        sqr(create10, 37, create11);
        mul(create10, create11, create11);
        int[] create12 = create();
        sqr(create11, 37, create12);
        mul(create10, create12, create12);
        int[] create13 = create();
        sqr(create12, 111, create13);
        mul(create12, create13, create13);
        int[] create14 = create();
        sqr(create13, create14);
        mul(create2, create14, create14);
        int[] create15 = create();
        sqr(create14, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_ACCOUNT_CIRCLE_VALUE, create15);
        mul(create15, create13, create3);
        mul(create3, create, create3);
        int[] create16 = create();
        sqr(create3, create16);
        mul(create16, iArr2, create16);
        sub(iArr, create16, create16);
        normalize(create16);
        if (!isZeroVar(create16)) {
            return false;
        }
        copy(create3, 0, iArr3, 0);
        return true;
    }

    public static void zero(int[] iArr) {
        for (int i = 0; i < 16; i++) {
            iArr[i] = 0;
        }
    }

    public static void subOne(int[] iArr) {
        int[] create = create();
        create[0] = 1;
        sub(iArr, create, iArr);
    }

    public static void sub(int[] iArr, int[] iArr2, int[] iArr3) {
        int i = iArr[0];
        int i2 = iArr[1];
        int i3 = iArr[2];
        int i4 = iArr[3];
        int i5 = iArr[4];
        int i6 = iArr[5];
        int i7 = iArr[6];
        int i8 = iArr[7];
        int i9 = iArr[8];
        int i10 = iArr[9];
        int i11 = iArr[10];
        int i12 = iArr[11];
        int i13 = iArr[12];
        int i14 = iArr[13];
        int i15 = iArr[14];
        int i16 = iArr[15];
        int i17 = iArr2[0];
        int i18 = iArr2[1];
        int i19 = iArr2[2];
        int i20 = iArr2[3];
        int i21 = iArr2[4];
        int i22 = iArr2[5];
        int i23 = iArr2[6];
        int i24 = iArr2[7];
        int i25 = iArr2[8];
        int i26 = iArr2[9];
        int i27 = iArr2[10];
        int i28 = iArr2[11];
        int i29 = iArr2[12];
        int i30 = iArr2[13];
        int i31 = (i2 + 536870910) - i18;
        int i32 = (i6 + 536870910) - i22;
        int i33 = (i10 + 536870910) - i26;
        int i34 = (i14 + 536870910) - i30;
        int i35 = ((i3 + 536870910) - i19) + (i31 >>> 28);
        int i36 = ((i7 + 536870910) - i23) + (i32 >>> 28);
        int i37 = ((i11 + 536870910) - i27) + (i33 >>> 28);
        int i38 = ((i15 + 536870910) - iArr2[14]) + (i34 >>> 28);
        int i39 = ((i4 + 536870910) - i20) + (i35 >>> 28);
        int i40 = ((i8 + 536870910) - i24) + (i36 >>> 28);
        int i41 = ((i12 + 536870910) - i28) + (i37 >>> 28);
        int i42 = ((i16 + 536870910) - iArr2[15]) + (i38 >>> 28);
        int i43 = i42 >>> 28;
        int i44 = ((i + 536870910) - i17) + i43;
        int i45 = ((i5 + 536870910) - i21) + (i39 >>> 28);
        int i46 = ((i9 + 536870908) - i25) + i43 + (i40 >>> 28);
        int i47 = ((i13 + 536870910) - i29) + (i41 >>> 28);
        iArr3[0] = i44 & 268435455;
        iArr3[1] = (i31 & 268435455) + (i44 >>> 28);
        iArr3[2] = i35 & 268435455;
        iArr3[3] = i39 & 268435455;
        iArr3[4] = i45 & 268435455;
        iArr3[5] = (i32 & 268435455) + (i45 >>> 28);
        iArr3[6] = i36 & 268435455;
        iArr3[7] = i40 & 268435455;
        iArr3[8] = i46 & 268435455;
        iArr3[9] = (i33 & 268435455) + (i46 >>> 28);
        iArr3[10] = i37 & 268435455;
        iArr3[11] = i41 & 268435455;
        iArr3[12] = i47 & 268435455;
        iArr3[13] = (i34 & 268435455) + (i47 >>> 28);
        iArr3[14] = i38 & 268435455;
        iArr3[15] = i42 & 268435455;
    }

    public static void sqr(int[] iArr, int[] iArr2) {
        int i = iArr[0];
        int i2 = iArr[1];
        int i3 = iArr[2];
        int i4 = iArr[3];
        int i5 = iArr[4];
        int i6 = iArr[5];
        int i7 = iArr[6];
        int i8 = iArr[7];
        int i9 = iArr[8];
        int i10 = iArr[9];
        int i11 = iArr[10];
        int i12 = iArr[11];
        int i13 = iArr[12];
        int i14 = iArr[13];
        int i15 = iArr[14];
        int i16 = iArr[15];
        int i17 = i3 + i11;
        int i18 = i4 + i12;
        int i19 = i5 + i13;
        int i20 = i6 + i14;
        int i21 = i7 + i15;
        long j = i;
        long j2 = j * j;
        long j3 = i8;
        long j4 = i2 * 2;
        long j5 = i7;
        long j6 = i3 * 2;
        long j7 = i6;
        long j8 = i4 * 2;
        long j9 = i5;
        long j10 = i9;
        long j11 = i16;
        long j12 = i10 * 2;
        long j13 = i15;
        long j14 = i11 * 2;
        long j15 = i14;
        long j16 = i12 * 2;
        long j17 = i13;
        long j18 = i + i9;
        long j19 = i8 + i16;
        long j20 = (r4 * 2) & 4294967295L;
        long j21 = i21;
        long j22 = (i17 * 2) & 4294967295L;
        long j23 = i20;
        long j24 = (i18 * 2) & 4294967295L;
        long j25 = i19;
        long j26 = (j19 * j20) + (j21 * j22) + (j23 * j24) + (j25 * j25);
        long j27 = ((j2 + (j10 * j10)) + j26) - ((((j3 * j4) + (j5 * j6)) + (j7 * j8)) + (j9 * j9));
        int i22 = (int) j27;
        long j28 = ((((((j11 * j12) + (j13 * j14)) + (j15 * j16)) + (j17 * j17)) + (j18 * j18)) - j2) + j26;
        int i23 = (int) j28;
        long j29 = i2;
        long j30 = i * 2;
        long j31 = j29 * j30;
        long j32 = i5 * 2;
        long j33 = i10;
        long j34 = i9 * 2;
        long j35 = i13 * 2;
        long j36 = i2 + i10;
        long j37 = (r4 * 2) & 4294967295L;
        long j38 = (i19 * 2) & 4294967295L;
        long j39 = (j19 * j22) + (j21 * j24) + (j23 * j38);
        long j40 = (j27 >>> 28) + (((j31 + (j33 * j34)) + j39) - (((j3 * j6) + (j5 * j8)) + (j7 * j32)));
        int i24 = (int) j40;
        long j41 = (j28 >>> 28) + (((((j11 * j14) + (j13 * j16)) + (j15 * j35)) + (j36 * j37)) - j31) + j39;
        int i25 = (int) j41;
        long j42 = i3;
        long j43 = (j42 * j30) + (j29 * j29);
        long j44 = i11;
        long j45 = i17;
        long j46 = (j19 * j24) + (j21 * j38) + (j23 * j23);
        long j47 = (j40 >>> 28) + (((j43 + ((j44 * j34) + (j33 * j33))) + j46) - (((j3 * j8) + (j5 * j32)) + (j7 * j7)));
        int i26 = (int) j47;
        long j48 = (j41 >>> 28) + (((((j11 * j16) + (j13 * j35)) + (j15 * j15)) + ((j45 * j37) + (j36 * j36))) - j43) + j46;
        int i27 = (int) j48;
        long j49 = i4;
        long j50 = (j49 * j30) + (j42 * j4);
        long j51 = i6 * 2;
        long j52 = i12;
        long j53 = i14 * 2;
        long j54 = i18;
        long j55 = (i20 * 2) & 4294967295L;
        long j56 = (j38 * j19) + (j21 * j55);
        long j57 = (j47 >>> 28) + (((j50 + ((j52 * j34) + (j44 * j12))) + j56) - ((j32 * j3) + (j5 * j51)));
        int i28 = (int) j57;
        long j58 = (j48 >>> 28) + ((((j11 * j35) + (j13 * j53)) + ((j54 * j37) + (j45 * j20))) - j50) + j56;
        int i29 = (int) j58;
        long j59 = (j9 * j30) + (j49 * j4) + (j42 * j42);
        long j60 = (j55 * j19) + (j21 * j21);
        long j61 = (j57 >>> 28) + (((j59 + (((j17 * j34) + (j52 * j12)) + (j44 * j44))) + j60) - ((j51 * j3) + (j5 * j5)));
        int i30 = (int) j61;
        long j62 = (j58 >>> 28) + ((((j53 * j11) + (j13 * j13)) + (((j25 * j37) + (j54 * j20)) + (j45 * j45))) - j59) + j60;
        int i31 = (int) j62;
        long j63 = (j7 * j30) + (j9 * j4) + (j49 * j6);
        long j64 = i15 * 2;
        long j65 = ((i21 * 2) & 4294967295L) * j19;
        long j66 = (j61 >>> 28) + (((j63 + (((j15 * j34) + (j17 * j12)) + (j52 * j14))) + j65) - ((i7 * 2) * j3));
        int i32 = (int) j66;
        long j67 = (j62 >>> 28) + (((j64 * j11) + (((j23 * j37) + (j25 * j20)) + (j54 * j22))) - j63) + j65;
        int i33 = (int) j67;
        long j68 = (j5 * j30) + (j7 * j4) + (j9 * j6) + (j49 * j49);
        long j69 = j19 * j19;
        long j70 = (j66 >>> 28) + (((j68 + ((((j13 * j34) + (j15 * j12)) + (j17 * j14)) + (j52 * j52))) + j69) - (j3 * j3));
        int i34 = (int) j70;
        long j71 = (j67 >>> 28) + (((j11 * j11) + ((((j21 * j37) + (j23 * j20)) + (j25 * j22)) + (j54 * j54))) - j68) + j69;
        int i35 = (int) j71;
        long j72 = (j3 * j30) + (j5 * j4) + (j7 * j6) + (j8 * j9);
        long j73 = (j70 >>> 28) + (j11 * j34) + (j13 * j12) + (j15 * j14) + (j17 * j16) + j72;
        int i36 = (int) j73;
        long j74 = (j71 >>> 28) + (((((j19 * j37) + (j21 * j20)) + (j23 * j22)) + (j25 * j24)) - j72);
        int i37 = (int) j74;
        long j75 = j74 >>> 28;
        long j76 = (j73 >>> 28) + j75 + (i23 & 268435455);
        long j77 = j75 + (i22 & 268435455);
        iArr2[0] = ((int) j77) & 268435455;
        iArr2[1] = (i24 & 268435455) + ((int) (j77 >>> 28));
        iArr2[2] = i26 & 268435455;
        iArr2[3] = i28 & 268435455;
        iArr2[4] = i30 & 268435455;
        iArr2[5] = i32 & 268435455;
        iArr2[6] = i34 & 268435455;
        iArr2[7] = i36 & 268435455;
        iArr2[8] = ((int) j76) & 268435455;
        iArr2[9] = (i25 & 268435455) + ((int) (j76 >>> 28));
        iArr2[10] = i27 & 268435455;
        iArr2[11] = i29 & 268435455;
        iArr2[12] = i31 & 268435455;
        iArr2[13] = i33 & 268435455;
        iArr2[14] = i35 & 268435455;
        iArr2[15] = i37 & 268435455;
    }

    public static void sqr(int[] iArr, int i, int[] iArr2) {
        sqr(iArr, iArr2);
        while (true) {
            i--;
            if (i <= 0) {
                return;
            } else {
                sqr(iArr2, iArr2);
            }
        }
    }

    private static void Camera2StreamConfigurationMap(int[] iArr, int i) {
        int i2;
        int i3 = iArr[15];
        long j = (i3 >>> 28) + i;
        int i4 = 0;
        long j2 = j;
        while (true) {
            if (i4 >= 8) {
                break;
            }
            long j3 = j2 + (4294967295L & iArr[i4]);
            iArr[i4] = ((int) j3) & 268435455;
            j2 = j3 >> 28;
            i4++;
        }
        long j4 = j2 + j;
        for (i2 = 8; i2 < 15; i2++) {
            long j5 = j4 + (iArr[i2] & 4294967295L);
            iArr[i2] = ((int) j5) & 268435455;
            j4 = j5 >> 28;
        }
        iArr[15] = (i3 & 268435455) + ((int) j4);
    }

    public static void one(int[] iArr) {
        iArr[0] = 1;
        for (int i = 1; i < 16; i++) {
            iArr[i] = 0;
        }
    }

    public static void normalize(int[] iArr) {
        Camera2StreamConfigurationMap(iArr, 1);
        Camera2StreamConfigurationMap(iArr, -1);
    }

    public static void negate(int[] iArr, int[] iArr2) {
        sub(create(), iArr, iArr2);
    }

    public static void mul(int[] iArr, int[] iArr2, int[] iArr3) {
        int i = iArr[0];
        int i2 = iArr[1];
        int i3 = iArr[2];
        int i4 = iArr[3];
        int i5 = iArr[4];
        int i6 = iArr[5];
        int i7 = iArr[6];
        int i8 = iArr[7];
        int i9 = iArr[8];
        int i10 = iArr[9];
        int i11 = iArr[10];
        int i12 = iArr[11];
        int i13 = iArr[12];
        int i14 = iArr[13];
        int i15 = iArr[14];
        int i16 = iArr[15];
        int i17 = iArr2[0];
        int i18 = iArr2[1];
        int i19 = iArr2[2];
        int i20 = iArr2[3];
        int i21 = iArr2[4];
        int i22 = iArr2[5];
        int i23 = iArr2[6];
        int i24 = iArr2[7];
        int i25 = iArr2[8];
        int i26 = iArr2[9];
        int i27 = iArr2[10];
        int i28 = iArr2[11];
        int i29 = iArr2[12];
        int i30 = iArr2[13];
        int i31 = iArr2[14];
        int i32 = iArr2[15];
        long j = i;
        long j2 = i17;
        long j3 = j * j2;
        long j4 = i8;
        long j5 = i18;
        long j6 = i7;
        long j7 = i19;
        long j8 = i6;
        long j9 = i20;
        long j10 = i5;
        long j11 = i21;
        long j12 = i4;
        long j13 = i22;
        long j14 = i3;
        long j15 = i23;
        long j16 = i2;
        long j17 = i24;
        long j18 = i9;
        long j19 = i25;
        long j20 = i16;
        long j21 = i26;
        long j22 = i15;
        long j23 = i27;
        long j24 = i14;
        long j25 = i28;
        long j26 = i13;
        long j27 = i29;
        long j28 = i12;
        long j29 = i30;
        long j30 = i11;
        long j31 = i31;
        long j32 = i10;
        long j33 = i32;
        long j34 = i + i9;
        long j35 = i17 + i25;
        long j36 = i8 + i16;
        long j37 = i18 + i26;
        long j38 = i7 + i15;
        long j39 = i19 + i27;
        long j40 = i6 + i14;
        long j41 = i20 + i28;
        long j42 = i5 + i13;
        long j43 = i21 + i29;
        long j44 = i4 + i12;
        long j45 = i22 + i30;
        long j46 = i3 + i11;
        long j47 = i23 + i31;
        long j48 = i2 + i10;
        long j49 = i32 + i24;
        long j50 = (j36 * j37) + (j38 * j39) + (j40 * j41) + (j42 * j43) + (j44 * j45) + (j46 * j47) + (j48 * j49);
        long j51 = ((j3 + (j18 * j19)) + j50) - (((((((j4 * j5) + (j6 * j7)) + (j8 * j9)) + (j10 * j11)) + (j12 * j13)) + (j14 * j15)) + (j16 * j17));
        int i33 = (int) j51;
        long j52 = (((((((((j20 * j21) + (j22 * j23)) + (j24 * j25)) + (j26 * j27)) + (j28 * j29)) + (j30 * j31)) + (j32 * j33)) + (j34 * j35)) - j3) + j50;
        int i34 = (int) j52;
        long j53 = (j16 * j2) + (j * j5);
        long j54 = (j36 * j39) + (j38 * j41) + (j40 * j43) + (j42 * j45) + (j44 * j47) + (j46 * j49);
        long j55 = (j51 >>> 28) + (((j53 + ((j32 * j19) + (j18 * j21))) + j54) - ((((((j4 * j7) + (j6 * j9)) + (j8 * j11)) + (j10 * j13)) + (j12 * j15)) + (j14 * j17)));
        int i35 = (int) j55;
        long j56 = (j52 >>> 28) + ((((((((j20 * j23) + (j22 * j25)) + (j24 * j27)) + (j26 * j29)) + (j28 * j31)) + (j30 * j33)) + ((j48 * j35) + (j34 * j37))) - j53) + j54;
        int i36 = (int) j56;
        long j57 = (j14 * j2) + (j16 * j5) + (j * j7);
        long j58 = (j36 * j41) + (j38 * j43) + (j40 * j45) + (j42 * j47) + (j44 * j49);
        long j59 = (j55 >>> 28) + (((j57 + (((j30 * j19) + (j32 * j21)) + (j18 * j23))) + j58) - (((((j4 * j9) + (j6 * j11)) + (j8 * j13)) + (j10 * j15)) + (j12 * j17)));
        int i37 = (int) j59;
        long j60 = (j56 >>> 28) + (((((((j20 * j25) + (j22 * j27)) + (j24 * j29)) + (j26 * j31)) + (j28 * j33)) + (((j46 * j35) + (j48 * j37)) + (j34 * j39))) - j57) + j58;
        int i38 = (int) j60;
        long j61 = (j12 * j2) + (j14 * j5) + (j16 * j7) + (j * j9);
        long j62 = (j36 * j43) + (j38 * j45) + (j40 * j47) + (j42 * j49);
        long j63 = (j59 >>> 28) + (((j61 + ((((j28 * j19) + (j30 * j21)) + (j32 * j23)) + (j18 * j25))) + j62) - ((((j4 * j11) + (j6 * j13)) + (j8 * j15)) + (j10 * j17)));
        int i39 = (int) j63;
        long j64 = (j60 >>> 28) + ((((((j20 * j27) + (j22 * j29)) + (j24 * j31)) + (j26 * j33)) + ((((j44 * j35) + (j46 * j37)) + (j48 * j39)) + (j34 * j41))) - j61) + j62;
        int i40 = (int) j64;
        long j65 = (j10 * j2) + (j12 * j5) + (j14 * j7) + (j16 * j9) + (j * j11);
        long j66 = (j36 * j45) + (j38 * j47) + (j40 * j49);
        long j67 = (j63 >>> 28) + (((j65 + (((((j26 * j19) + (j28 * j21)) + (j30 * j23)) + (j32 * j25)) + (j18 * j27))) + j66) - (((j4 * j13) + (j6 * j15)) + (j8 * j17)));
        int i41 = (int) j67;
        long j68 = (j64 >>> 28) + (((((j20 * j29) + (j22 * j31)) + (j24 * j33)) + (((((j42 * j35) + (j44 * j37)) + (j46 * j39)) + (j48 * j41)) + (j34 * j43))) - j65) + j66;
        int i42 = (int) j68;
        long j69 = (j8 * j2) + (j10 * j5) + (j12 * j7) + (j14 * j9) + (j16 * j11) + (j * j13);
        long j70 = (j36 * j47) + (j38 * j49);
        long j71 = (j67 >>> 28) + (((j69 + ((((((j24 * j19) + (j26 * j21)) + (j28 * j23)) + (j30 * j25)) + (j32 * j27)) + (j18 * j29))) + j70) - ((j4 * j15) + (j6 * j17)));
        int i43 = (int) j71;
        long j72 = (j68 >>> 28) + ((((j20 * j31) + (j22 * j33)) + ((((((j40 * j35) + (j42 * j37)) + (j44 * j39)) + (j46 * j41)) + (j48 * j43)) + (j34 * j45))) - j69) + j70;
        int i44 = (int) j72;
        long j73 = (j6 * j2) + (j8 * j5) + (j10 * j7) + (j12 * j9) + (j14 * j11) + (j16 * j13) + (j * j15);
        long j74 = j36 * j49;
        long j75 = (j71 >>> 28) + (((j73 + (((((((j22 * j19) + (j24 * j21)) + (j26 * j23)) + (j28 * j25)) + (j30 * j27)) + (j32 * j29)) + (j18 * j31))) + j74) - (j4 * j17));
        int i45 = (int) j75;
        long j76 = (j72 >>> 28) + (((j20 * j33) + (((((((j38 * j35) + (j40 * j37)) + (j42 * j39)) + (j44 * j41)) + (j46 * j43)) + (j48 * j45)) + (j34 * j47))) - j73) + j74;
        int i46 = (int) j76;
        long j77 = (j2 * j4) + (j6 * j5) + (j8 * j7) + (j10 * j9) + (j12 * j11) + (j14 * j13) + (j16 * j15) + (j * j17);
        long j78 = (j75 >>> 28) + j77 + (j20 * j19) + (j22 * j21) + (j24 * j23) + (j26 * j25) + (j28 * j27) + (j30 * j29) + (j32 * j31) + (j18 * j33);
        int i47 = (int) j78;
        long j79 = (j76 >>> 28) + (((((((((j36 * j35) + (j38 * j37)) + (j40 * j39)) + (j42 * j41)) + (j44 * j43)) + (j46 * j45)) + (j48 * j47)) + (j34 * j49)) - j77);
        long j80 = j79 >>> 28;
        long j81 = (j78 >>> 28) + j80 + (i34 & 268435455);
        long j82 = j80 + (i33 & 268435455);
        iArr3[0] = ((int) j82) & 268435455;
        iArr3[1] = (i35 & 268435455) + ((int) (j82 >>> 28));
        iArr3[2] = i37 & 268435455;
        iArr3[3] = i39 & 268435455;
        iArr3[4] = i41 & 268435455;
        iArr3[5] = i43 & 268435455;
        iArr3[6] = i45 & 268435455;
        iArr3[7] = i47 & 268435455;
        iArr3[8] = ((int) j81) & 268435455;
        iArr3[9] = (i36 & 268435455) + ((int) (j81 >>> 28));
        iArr3[10] = i38 & 268435455;
        iArr3[11] = i40 & 268435455;
        iArr3[12] = i42 & 268435455;
        iArr3[13] = i44 & 268435455;
        iArr3[14] = i46 & 268435455;
        iArr3[15] = ((int) j79) & 268435455;
    }

    public static void mul(int[] iArr, int i, int[] iArr2) {
        int i2 = iArr[0];
        int i3 = iArr[1];
        int i4 = iArr[2];
        int i5 = iArr[3];
        int i6 = iArr[4];
        int i7 = iArr[5];
        int i8 = iArr[6];
        int i9 = iArr[7];
        int i10 = iArr[8];
        int i11 = iArr[9];
        int i12 = iArr[10];
        int i13 = iArr[11];
        int i14 = iArr[12];
        int i15 = iArr[13];
        int i16 = iArr[14];
        int i17 = iArr[15];
        long j = i3;
        long j2 = i;
        long j3 = j * j2;
        int i18 = (int) j3;
        long j4 = i7 * j2;
        int i19 = (int) j4;
        long j5 = i11 * j2;
        int i20 = (int) j5;
        long j6 = i15 * j2;
        long j7 = (j3 >>> 28) + (i4 * j2);
        iArr2[2] = ((int) j7) & 268435455;
        long j8 = (j4 >>> 28) + (i8 * j2);
        iArr2[6] = ((int) j8) & 268435455;
        long j9 = (j5 >>> 28) + (i12 * j2);
        iArr2[10] = ((int) j9) & 268435455;
        long j10 = (j6 >>> 28) + (i16 * j2);
        iArr2[14] = ((int) j10) & 268435455;
        long j11 = (j7 >>> 28) + (i5 * j2);
        iArr2[3] = ((int) j11) & 268435455;
        long j12 = (j8 >>> 28) + (i9 * j2);
        iArr2[7] = ((int) j12) & 268435455;
        long j13 = (j9 >>> 28) + (i13 * j2);
        iArr2[11] = ((int) j13) & 268435455;
        long j14 = (j10 >>> 28) + (i17 * j2);
        iArr2[15] = ((int) j14) & 268435455;
        long j15 = j14 >>> 28;
        long j16 = (j11 >>> 28) + (i6 * j2);
        iArr2[4] = ((int) j16) & 268435455;
        long j17 = (j12 >>> 28) + j15 + (i10 * j2);
        iArr2[8] = ((int) j17) & 268435455;
        long j18 = (j13 >>> 28) + (i14 * j2);
        iArr2[12] = ((int) j18) & 268435455;
        long j19 = j15 + (i2 * j2);
        iArr2[0] = ((int) j19) & 268435455;
        iArr2[1] = (i18 & 268435455) + ((int) (j19 >>> 28));
        iArr2[5] = (i19 & 268435455) + ((int) (j16 >>> 28));
        iArr2[9] = (i20 & 268435455) + ((int) (j17 >>> 28));
        iArr2[13] = (((int) j6) & 268435455) + ((int) (j18 >>> 28));
    }

    public static boolean isZeroVar(int[] iArr) {
        return isZero(iArr) != 0;
    }

    public static int isZero(int[] iArr) {
        int i = 0;
        for (int i2 = 0; i2 < 16; i2++) {
            i |= iArr[i2];
        }
        return (((i >>> 1) | (i & 1)) - 1) >> 31;
    }

    public static boolean isOneVar(int[] iArr) {
        return isOne(iArr) != 0;
    }

    public static int isOne(int[] iArr) {
        int i = iArr[0] ^ 1;
        for (int i2 = 1; i2 < 16; i2++) {
            i |= iArr[i2];
        }
        return (((i >>> 1) | (i & 1)) - 1) >> 31;
    }

    public static void invVar(int[] iArr, int[] iArr2) {
        int[] create = create();
        int[] iArr3 = new int[14];
        copy(iArr, 0, create, 0);
        normalize(create);
        encode(create, iArr3, 0);
        org.bouncycastle.math.raw.Mod.modOddInverseVar(getHighSpeedVideoSizes, iArr3, iArr3);
        decode(iArr3, 0, iArr2);
    }

    public static void inv(int[] iArr, int[] iArr2) {
        int[] create = create();
        int[] iArr3 = new int[14];
        copy(iArr, 0, create, 0);
        normalize(create);
        encode(create, iArr3, 0);
        org.bouncycastle.math.raw.Mod.modOddInverse(getHighSpeedVideoSizes, iArr3, iArr3);
        decode(iArr3, 0, iArr2);
    }

    private static void getHighSpeedVideoFpsRangesFor(int i, byte[] bArr, int i2) {
        bArr[i2] = (byte) i;
        bArr[i2 + 1] = (byte) (i >>> 8);
        bArr[i2 + 2] = (byte) (i >>> 16);
        bArr[i2 + 3] = (byte) (i >>> 24);
    }

    private static void Camera2StreamConfigurationMap(int[] iArr, int i, int[] iArr2, int i2) {
        int i3 = iArr[i];
        int i4 = iArr[i + 1];
        int i5 = iArr[i + 2];
        int i6 = iArr[i + 3];
        int i7 = iArr[i + 4];
        int i8 = iArr[i + 5];
        int i9 = iArr[i + 6];
        int i10 = iArr[i + 7];
        iArr2[i2] = (i4 << 28) | i3;
        iArr2[i2 + 1] = (i4 >>> 4) | (i5 << 24);
        iArr2[i2 + 2] = (i5 >>> 8) | (i6 << 20);
        iArr2[i2 + 3] = (i6 >>> 12) | (i7 << 16);
        iArr2[i2 + 4] = (i7 >>> 16) | (i8 << 12);
        iArr2[i2 + 5] = (i8 >>> 20) | (i9 << 8);
        iArr2[i2 + 6] = (i10 << 4) | (i9 >>> 24);
    }

    public static void encode(int[] iArr, int[] iArr2, int i) {
        Camera2StreamConfigurationMap(iArr, 0, iArr2, i);
        Camera2StreamConfigurationMap(iArr, 8, iArr2, i + 7);
    }

    public static void encode(int[] iArr, byte[] bArr, int i) {
        Camera2StreamConfigurationMap(iArr, 0, bArr, i);
        Camera2StreamConfigurationMap(iArr, 2, bArr, i + 7);
        Camera2StreamConfigurationMap(iArr, 4, bArr, i + 14);
        Camera2StreamConfigurationMap(iArr, 6, bArr, i + 21);
        Camera2StreamConfigurationMap(iArr, 8, bArr, i + 28);
        Camera2StreamConfigurationMap(iArr, 10, bArr, i + 35);
        Camera2StreamConfigurationMap(iArr, 12, bArr, i + 42);
        Camera2StreamConfigurationMap(iArr, 14, bArr, i + 49);
    }

    private static void Camera2StreamConfigurationMap(byte[] bArr, int i, int[] iArr, int i2) {
        int highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor(bArr, i);
        int highSpeedVideoSizes = getHighSpeedVideoSizes(bArr, i + 4);
        iArr[i2] = 268435455 & highSpeedVideoFpsRangesFor;
        iArr[i2 + 1] = (highSpeedVideoSizes << 4) | (highSpeedVideoFpsRangesFor >>> 28);
    }

    private static int getHighSpeedVideoFpsRangesFor(byte[] bArr, int i) {
        return (bArr[i + 3] << com.google.common.base.Ascii.CAN) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    private static int getHighSpeedVideoSizes(byte[] bArr, int i) {
        return ((bArr[i + 2] & 255) << 16) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8);
    }

    private static void getHighSpeedVideoFpsRangesFor(int[] iArr, int i, int[] iArr2, int i2) {
        int i3 = iArr[i];
        int i4 = iArr[i + 1];
        int i5 = iArr[i + 2];
        int i6 = iArr[i + 3];
        int i7 = iArr[i + 4];
        int i8 = iArr[i + 5];
        int i9 = iArr[i + 6];
        iArr2[i2] = i3 & 268435455;
        iArr2[i2 + 1] = ((i3 >>> 28) | (i4 << 4)) & 268435455;
        iArr2[i2 + 2] = ((i4 >>> 24) | (i5 << 8)) & 268435455;
        iArr2[i2 + 3] = ((i5 >>> 20) | (i6 << 12)) & 268435455;
        iArr2[i2 + 4] = ((i6 >>> 16) | (i7 << 16)) & 268435455;
        iArr2[i2 + 5] = ((i7 >>> 12) | (i8 << 20)) & 268435455;
        iArr2[i2 + 6] = 268435455 & ((i8 >>> 8) | (i9 << 24));
        iArr2[i2 + 7] = i9 >>> 4;
    }

    public static void decode(int[] iArr, int i, int[] iArr2) {
        getHighSpeedVideoFpsRangesFor(iArr, i, iArr2, 0);
        getHighSpeedVideoFpsRangesFor(iArr, i + 7, iArr2, 8);
    }

    public static void decode(byte[] bArr, int i, int[] iArr) {
        Camera2StreamConfigurationMap(bArr, i, iArr, 0);
        Camera2StreamConfigurationMap(bArr, i + 7, iArr, 2);
        Camera2StreamConfigurationMap(bArr, i + 14, iArr, 4);
        Camera2StreamConfigurationMap(bArr, i + 21, iArr, 6);
        Camera2StreamConfigurationMap(bArr, i + 28, iArr, 8);
        Camera2StreamConfigurationMap(bArr, i + 35, iArr, 10);
        Camera2StreamConfigurationMap(bArr, i + 42, iArr, 12);
        Camera2StreamConfigurationMap(bArr, i + 49, iArr, 14);
    }

    public static void cswap(int i, int[] iArr, int[] iArr2) {
        for (int i2 = 0; i2 < 16; i2++) {
            int i3 = iArr[i2];
            int i4 = iArr2[i2];
            int i5 = (i3 ^ i4) & (0 - i);
            iArr[i2] = i3 ^ i5;
            iArr2[i2] = i4 ^ i5;
        }
    }

    public static int[] createTable(int i) {
        return new int[i * 16];
    }

    public static int[] create() {
        return new int[16];
    }

    public static void copy(int[] iArr, int i, int[] iArr2, int i2) {
        for (int i3 = 0; i3 < 16; i3++) {
            iArr2[i2 + i3] = iArr[i + i3];
        }
    }

    public static void cnegate(int i, int[] iArr) {
        int[] create = create();
        sub(create, iArr, create);
        cmov(-i, create, 0, iArr, 0);
    }

    public static void cmov(int i, int[] iArr, int i2, int[] iArr2, int i3) {
        for (int i4 = 0; i4 < 16; i4++) {
            int i5 = i3 + i4;
            int i6 = iArr2[i5];
            iArr2[i5] = i6 ^ ((iArr[i2 + i4] ^ i6) & i);
        }
    }

    public static void carry(int[] iArr) {
        int i = iArr[0];
        int i2 = iArr[1];
        int i3 = iArr[2];
        int i4 = iArr[3];
        int i5 = iArr[4];
        int i6 = iArr[5];
        int i7 = iArr[6];
        int i8 = iArr[7];
        int i9 = iArr[8];
        int i10 = iArr[9];
        int i11 = iArr[10];
        int i12 = iArr[11];
        int i13 = iArr[12];
        int i14 = iArr[13];
        int i15 = i2 + (i >>> 28);
        int i16 = i6 + (i5 >>> 28);
        int i17 = i10 + (i9 >>> 28);
        int i18 = i14 + (i13 >>> 28);
        int i19 = i3 + (i15 >>> 28);
        int i20 = i7 + (i16 >>> 28);
        int i21 = i11 + (i17 >>> 28);
        int i22 = iArr[14] + (i18 >>> 28);
        int i23 = i4 + (i19 >>> 28);
        int i24 = i8 + (i20 >>> 28);
        int i25 = i12 + (i21 >>> 28);
        int i26 = iArr[15] + (i22 >>> 28);
        int i27 = i26 >>> 28;
        int i28 = (i & 268435455) + i27;
        int i29 = (i5 & 268435455) + (i23 >>> 28);
        int i30 = (i9 & 268435455) + i27 + (i24 >>> 28);
        int i31 = (i13 & 268435455) + (i25 >>> 28);
        iArr[0] = i28 & 268435455;
        iArr[1] = (i15 & 268435455) + (i28 >>> 28);
        iArr[2] = i19 & 268435455;
        iArr[3] = i23 & 268435455;
        iArr[4] = i29 & 268435455;
        iArr[5] = (i16 & 268435455) + (i29 >>> 28);
        iArr[6] = i20 & 268435455;
        iArr[7] = i24 & 268435455;
        iArr[8] = i30 & 268435455;
        iArr[9] = (i17 & 268435455) + (i30 >>> 28);
        iArr[10] = i21 & 268435455;
        iArr[11] = i25 & 268435455;
        iArr[12] = i31 & 268435455;
        iArr[13] = (i18 & 268435455) + (i31 >>> 28);
        iArr[14] = i22 & 268435455;
        iArr[15] = i26 & 268435455;
    }

    public static boolean areEqualVar(int[] iArr, int[] iArr2) {
        return areEqual(iArr, iArr2) != 0;
    }

    public static int areEqual(int[] iArr, int[] iArr2) {
        int i = 0;
        for (int i2 = 0; i2 < 16; i2++) {
            i |= iArr[i2] ^ iArr2[i2];
        }
        return (((i >>> 1) | (i & 1)) - 1) >> 31;
    }

    public static void addOne(int[] iArr, int i) {
        iArr[i] = iArr[i] + 1;
    }

    public static void addOne(int[] iArr) {
        iArr[0] = iArr[0] + 1;
    }

    public static void add(int[] iArr, int[] iArr2, int[] iArr3) {
        for (int i = 0; i < 16; i++) {
            iArr3[i] = iArr[i] + iArr2[i];
        }
    }
}
