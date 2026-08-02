package org.bouncycastle.math.ec.rfc7748;

/* loaded from: classes17.dex */
public abstract class X25519Field {
    public static final int SIZE = 10;
    private static final int[] getHighSpeedVideoFpsRanges = {-19, -1, -1, -1, -1, -1, -1, Integer.MAX_VALUE};
    private static final int[] Camera2StreamConfigurationMap = {34513072, 59165138, 4688974, 3500415, 6194736, 33281959, 54535759, 32551604, 163342, 5703241};

    public static boolean sqrtRatioVar(int[] iArr, int[] iArr2, int[] iArr3) {
        int[] create = create();
        int[] create2 = create();
        mul(iArr, iArr2, create);
        sqr(iArr2, create2);
        mul(create, create2, create);
        sqr(create2, create2);
        mul(create2, create, create2);
        int[] create3 = create();
        int[] create4 = create();
        sqr(create2, create3);
        mul(create2, create3, create3);
        int[] create5 = create();
        sqr(create3, create5);
        mul(create2, create5, create5);
        sqr(create5, 2, create5);
        mul(create3, create5, create5);
        int[] create6 = create();
        sqr(create5, 5, create6);
        mul(create5, create6, create6);
        int[] create7 = create();
        sqr(create6, 5, create7);
        mul(create5, create7, create7);
        sqr(create7, 10, create5);
        mul(create6, create5, create5);
        sqr(create5, 25, create6);
        mul(create5, create6, create6);
        sqr(create6, 25, create7);
        mul(create5, create7, create7);
        sqr(create7, 50, create5);
        mul(create6, create5, create5);
        sqr(create5, 125, create6);
        mul(create5, create6, create6);
        sqr(create6, 2, create5);
        mul(create5, create2, create4);
        mul(create4, create, create4);
        int[] create8 = create();
        sqr(create4, create8);
        mul(create8, iArr2, create8);
        sub(create8, iArr, create3);
        normalize(create3);
        if (isZeroVar(create3)) {
            copy(create4, 0, iArr3, 0);
            return true;
        }
        add(create8, iArr, create3);
        normalize(create3);
        if (!isZeroVar(create3)) {
            return false;
        }
        mul(create4, Camera2StreamConfigurationMap, iArr3);
        return true;
    }

    public static void zero(int[] iArr) {
        for (int i = 0; i < 10; i++) {
            iArr[i] = 0;
        }
    }

    public static void subOne(int[] iArr) {
        iArr[0] = iArr[0] - 1;
    }

    public static void sub(int[] iArr, int[] iArr2, int[] iArr3) {
        for (int i = 0; i < 10; i++) {
            iArr3[i] = iArr[i] - iArr2[i];
        }
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
        long j = i;
        long j2 = i2 * 2;
        long j3 = i3 * 2;
        long j4 = i2;
        long j5 = i4 * 2;
        long j6 = i5 * 2;
        long j7 = (i3 * j3) + (j * j6) + (j4 * j5);
        long j8 = i4;
        long j9 = i6;
        long j10 = i7 * 2;
        long j11 = i8 * 2;
        long j12 = i7;
        long j13 = i9 * 2;
        long j14 = i10 * 2;
        long j15 = (i8 * j11) + (j9 * j14) + (j12 * j13);
        long j16 = i9;
        long j17 = (j * j) - (((j10 * j14) + (j11 * j13)) * 38);
        long j18 = (j * j2) - (((j11 * j14) + (j16 * j16)) * 38);
        long j19 = ((j * j3) + (j4 * j4)) - ((j16 * j14) * 38);
        long j20 = ((j2 * j3) + (j * j5)) - ((i10 * j14) * 38);
        long j21 = ((j2 * j6) + (j3 * j5)) - (j9 * j9);
        long j22 = ((j3 * j6) + (j8 * j8)) - (j9 * j10);
        long j23 = (j8 * j6) - ((j9 * j11) + (j12 * j12));
        long j24 = (i5 * j6) - ((j11 * j10) + (j9 * j13));
        int i11 = i2 + i7;
        int i12 = i3 + i8;
        int i13 = i4 + i9;
        int i14 = i5 + i10;
        long j25 = i + i6;
        long j26 = i11 * 2;
        long j27 = i12 * 2;
        long j28 = i11;
        long j29 = i13 * 2;
        long j30 = i14 * 2;
        long j31 = i13;
        long j32 = j24 + (((j26 * j27) + (j25 * j29)) - j20);
        int i15 = (int) j32;
        long j33 = (j32 >> 26) + (((((i12 * j27) + (j25 * j30)) + (j28 * j29)) - j7) - j15);
        int i16 = (int) j33;
        long j34 = j17 + ((((j33 >> 25) + ((j26 * j30) + (j29 * j27))) - j21) * 38);
        iArr2[0] = ((int) j34) & 67108863;
        long j35 = (j34 >> 26) + j18 + ((((j27 * j30) + (j31 * j31)) - j22) * 38);
        iArr2[1] = ((int) j35) & 67108863;
        long j36 = (j35 >> 26) + j19 + (((j31 * j30) - j23) * 38);
        iArr2[2] = ((int) j36) & 33554431;
        long j37 = (j36 >> 25) + j20 + (((i14 * j30) - j24) * 38);
        iArr2[3] = ((int) j37) & 67108863;
        long j38 = (j37 >> 26) + j7 + (j15 * 38);
        iArr2[4] = ((int) j38) & 33554431;
        long j39 = (j38 >> 25) + j21 + ((j25 * j25) - j17);
        iArr2[5] = ((int) j39) & 67108863;
        long j40 = (j39 >> 26) + j22 + ((j26 * j25) - j18);
        iArr2[6] = ((int) j40) & 67108863;
        long j41 = (j40 >> 26) + j23 + (((j25 * j27) + (j28 * j28)) - j19);
        iArr2[7] = ((int) j41) & 33554431;
        long j42 = (j41 >> 25) + (i15 & 67108863);
        iArr2[8] = 67108863 & ((int) j42);
        iArr2[9] = (i16 & 33554431) + ((int) (j42 >> 26));
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
        int i2 = iArr[9];
        long j = (((i2 >> 24) + i) * 19) + iArr[0];
        iArr[0] = ((int) j) & 67108863;
        long j2 = (j >> 26) + iArr[1];
        iArr[1] = ((int) j2) & 67108863;
        long j3 = (j2 >> 26) + iArr[2];
        iArr[2] = ((int) j3) & 33554431;
        long j4 = (j3 >> 25) + iArr[3];
        iArr[3] = ((int) j4) & 67108863;
        long j5 = (j4 >> 26) + iArr[4];
        iArr[4] = ((int) j5) & 33554431;
        long j6 = (j5 >> 25) + iArr[5];
        iArr[5] = ((int) j6) & 67108863;
        long j7 = (j6 >> 26) + iArr[6];
        iArr[6] = ((int) j7) & 67108863;
        long j8 = (j7 >> 26) + iArr[7];
        iArr[7] = 33554431 & ((int) j8);
        long j9 = (j8 >> 25) + iArr[8];
        iArr[8] = 67108863 & ((int) j9);
        iArr[9] = (i2 & 16777215) + ((int) (j9 >> 26));
    }

    public static void one(int[] iArr) {
        iArr[0] = 1;
        for (int i = 1; i < 10; i++) {
            iArr[i] = 0;
        }
    }

    public static void normalize(int[] iArr) {
        int i = (iArr[9] >>> 23) & 1;
        Camera2StreamConfigurationMap(iArr, i);
        Camera2StreamConfigurationMap(iArr, -i);
    }

    public static void negate(int[] iArr, int[] iArr2) {
        for (int i = 0; i < 10; i++) {
            iArr2[i] = -iArr[i];
        }
    }

    public static void mul(int[] iArr, int[] iArr2, int[] iArr3) {
        int i = iArr[0];
        int i2 = iArr2[0];
        int i3 = iArr[1];
        int i4 = iArr2[1];
        int i5 = iArr[2];
        int i6 = iArr2[2];
        int i7 = iArr[3];
        int i8 = iArr2[3];
        int i9 = iArr[4];
        int i10 = iArr2[4];
        int i11 = iArr[5];
        int i12 = iArr2[5];
        int i13 = iArr[6];
        int i14 = iArr2[6];
        int i15 = iArr[7];
        int i16 = iArr2[7];
        int i17 = iArr[8];
        int i18 = iArr2[8];
        int i19 = iArr[9];
        int i20 = iArr2[9];
        long j = i;
        long j2 = i2;
        long j3 = i4;
        long j4 = i3;
        long j5 = i6;
        long j6 = i5;
        long j7 = i8;
        long j8 = i7;
        long j9 = i10;
        long j10 = i9;
        long j11 = ((j6 * j5) << 1) + (j * j9) + (j4 * j7) + (j8 * j3) + (j2 * j10);
        long j12 = i11;
        long j13 = i12;
        long j14 = i14;
        long j15 = i13;
        long j16 = i16;
        long j17 = i15;
        long j18 = i18;
        long j19 = i17;
        long j20 = i20;
        long j21 = i19;
        long j22 = ((j17 * j16) << 1) + (j12 * j20) + (j15 * j18) + (j19 * j14) + (j13 * j21);
        long j23 = (j * j2) - (((((j15 * j20) + (j17 * j18)) + (j19 * j16)) + (j21 * j14)) * 76);
        long j24 = ((j * j3) + (j4 * j2)) - (((((j17 * j20) + (j21 * j16)) << 1) + (j19 * j18)) * 38);
        long j25 = (((j * j5) + (j4 * j3)) + (j6 * j2)) - (((j19 * j20) + (j21 * j18)) * 38);
        long j26 = ((((j4 * j5) + (j6 * j3)) << 1) + ((j * j7) + (j2 * j8))) - ((j21 * j20) * 76);
        long j27 = (((((j4 * j9) + (j6 * j7)) + (j8 * j5)) + (j10 * j3)) << 1) - (j12 * j13);
        long j28 = ((((j6 * j9) + (j10 * j5)) << 1) + (j8 * j7)) - ((j12 * j14) + (j15 * j13));
        long j29 = ((j8 * j9) + (j10 * j7)) - (((j12 * j16) + (j15 * j14)) + (j17 * j13));
        long j30 = ((j10 * j9) << 1) - ((((j16 * j15) + (j17 * j14)) << 1) + ((j12 * j18) + (j19 * j13)));
        long j31 = i + i11;
        long j32 = i2 + i12;
        long j33 = i4 + i14;
        long j34 = i3 + i13;
        long j35 = i6 + i16;
        long j36 = i5 + i15;
        long j37 = i8 + i18;
        long j38 = i7 + i17;
        long j39 = i10 + i20;
        long j40 = i9 + i19;
        long j41 = j30 + (((((j34 * j35) + (j36 * j33)) << 1) + ((j31 * j37) + (j38 * j32))) - j26);
        int i21 = (int) j41;
        long j42 = (j41 >> 26) + (((((j36 * j35) << 1) + ((((j31 * j39) + (j34 * j37)) + (j38 * j33)) + (j40 * j32))) - j11) - j22);
        int i22 = (int) j42;
        long j43 = j23 + ((((j42 >> 25) + (((((j34 * j39) + (j36 * j37)) + (j38 * j35)) + (j40 * j33)) << 1)) - j27) * 38);
        iArr3[0] = ((int) j43) & 67108863;
        long j44 = (j43 >> 26) + j24 + ((((((j36 * j39) + (j35 * j40)) << 1) + (j38 * j37)) - j28) * 38);
        iArr3[1] = ((int) j44) & 67108863;
        long j45 = (j44 >> 26) + j25 + ((((j38 * j39) + (j37 * j40)) - j29) * 38);
        iArr3[2] = ((int) j45) & 33554431;
        long j46 = (j45 >> 25) + j26 + ((((j40 * j39) << 1) - j30) * 38);
        iArr3[3] = ((int) j46) & 67108863;
        long j47 = (j46 >> 26) + j11 + (j22 * 38);
        iArr3[4] = ((int) j47) & 33554431;
        long j48 = (j47 >> 25) + j27 + ((j31 * j32) - j23);
        iArr3[5] = ((int) j48) & 67108863;
        long j49 = (j48 >> 26) + j28 + (((j31 * j33) + (j34 * j32)) - j24);
        iArr3[6] = ((int) j49) & 67108863;
        long j50 = (j49 >> 26) + j29 + ((((j31 * j35) + (j34 * j33)) + (j36 * j32)) - j25);
        iArr3[7] = ((int) j50) & 33554431;
        long j51 = (j50 >> 25) + (i21 & 67108863);
        iArr3[8] = ((int) j51) & 67108863;
        iArr3[9] = (i22 & 33554431) + ((int) (j51 >> 26));
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
        long j = i;
        long j2 = i4 * j;
        int i11 = (int) j2;
        long j3 = i6 * j;
        int i12 = (int) j3;
        long j4 = i9 * j;
        int i13 = (int) j4;
        long j5 = iArr[9] * j;
        int i14 = (int) j5;
        long j6 = ((j5 >> 25) * 38) + (i2 * j);
        iArr2[0] = ((int) j6) & 67108863;
        long j7 = (j3 >> 25) + (i7 * j);
        iArr2[5] = ((int) j7) & 67108863;
        long j8 = (j6 >> 26) + (i3 * j);
        iArr2[1] = ((int) j8) & 67108863;
        long j9 = (j2 >> 25) + (i5 * j);
        iArr2[3] = ((int) j9) & 67108863;
        long j10 = (j7 >> 26) + (i8 * j);
        iArr2[6] = ((int) j10) & 67108863;
        long j11 = (j4 >> 25) + (i10 * j);
        iArr2[8] = ((int) j11) & 67108863;
        iArr2[2] = (i11 & 33554431) + ((int) (j8 >> 26));
        iArr2[4] = (i12 & 33554431) + ((int) (j9 >> 26));
        iArr2[7] = (i13 & 33554431) + ((int) (j10 >> 26));
        iArr2[9] = (i14 & 33554431) + ((int) (j11 >> 26));
    }

    public static boolean isZeroVar(int[] iArr) {
        return isZero(iArr) != 0;
    }

    public static int isZero(int[] iArr) {
        int i = 0;
        for (int i2 = 0; i2 < 10; i2++) {
            i |= iArr[i2];
        }
        return (((i >>> 1) | (i & 1)) - 1) >> 31;
    }

    public static boolean isOneVar(int[] iArr) {
        return isOne(iArr) != 0;
    }

    public static int isOne(int[] iArr) {
        int i = iArr[0] ^ 1;
        for (int i2 = 1; i2 < 10; i2++) {
            i |= iArr[i2];
        }
        return (((i >>> 1) | (i & 1)) - 1) >> 31;
    }

    public static void invVar(int[] iArr, int[] iArr2) {
        int[] create = create();
        int[] iArr3 = new int[8];
        copy(iArr, 0, create, 0);
        normalize(create);
        encode(create, iArr3, 0);
        org.bouncycastle.math.raw.Mod.modOddInverseVar(getHighSpeedVideoFpsRanges, iArr3, iArr3);
        decode(iArr3, 0, iArr2);
    }

    public static void inv(int[] iArr, int[] iArr2) {
        int[] create = create();
        int[] iArr3 = new int[8];
        copy(iArr, 0, create, 0);
        normalize(create);
        encode(create, iArr3, 0);
        org.bouncycastle.math.raw.Mod.modOddInverse(getHighSpeedVideoFpsRanges, iArr3, iArr3);
        decode(iArr3, 0, iArr2);
    }

    private static void getHighResolutionOutputSizeshNQ4ISI(int i, byte[] bArr, int i2) {
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
        iArr2[i2] = (i4 << 26) | i3;
        iArr2[i2 + 1] = (i4 >>> 6) | (i5 << 20);
        iArr2[i2 + 2] = (i5 >>> 12) | (i6 << 13);
        iArr2[i2 + 3] = (i7 << 7) | (i6 >>> 19);
    }

    private static void Camera2StreamConfigurationMap(int[] iArr, int i, byte[] bArr, int i2) {
        int i3 = iArr[i];
        int i4 = iArr[i + 1];
        int i5 = iArr[i + 2];
        int i6 = iArr[i + 3];
        int i7 = iArr[i + 4];
        getHighResolutionOutputSizeshNQ4ISI((i4 << 26) | i3, bArr, i2);
        getHighResolutionOutputSizeshNQ4ISI((i4 >>> 6) | (i5 << 20), bArr, i2 + 4);
        getHighResolutionOutputSizeshNQ4ISI((i5 >>> 12) | (i6 << 13), bArr, i2 + 8);
        getHighResolutionOutputSizeshNQ4ISI((i7 << 7) | (i6 >>> 19), bArr, i2 + 12);
    }

    public static void encode(int[] iArr, int[] iArr2, int i) {
        Camera2StreamConfigurationMap(iArr, 0, iArr2, i);
        Camera2StreamConfigurationMap(iArr, 5, iArr2, i + 4);
    }

    public static void encode(int[] iArr, byte[] bArr, int i) {
        Camera2StreamConfigurationMap(iArr, 0, bArr, i);
        Camera2StreamConfigurationMap(iArr, 5, bArr, i + 16);
    }

    private static int getHighSpeedVideoFpsRangesFor(byte[] bArr, int i) {
        return (bArr[i + 3] << com.google.common.base.Ascii.CAN) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    private static void getHighResolutionOutputSizeshNQ4ISI(int[] iArr, int i, int[] iArr2, int i2) {
        int i3 = iArr[i];
        int i4 = iArr[i + 1];
        int i5 = iArr[i + 2];
        int i6 = iArr[i + 3];
        iArr2[i2] = i3 & 67108863;
        iArr2[i2 + 1] = ((i3 >>> 26) | (i4 << 6)) & 67108863;
        iArr2[i2 + 2] = ((i4 >>> 20) | (i5 << 12)) & 33554431;
        iArr2[i2 + 3] = 67108863 & ((i6 << 19) | (i5 >>> 13));
        iArr2[i2 + 4] = i6 >>> 7;
    }

    private static void getHighSpeedVideoSizes(byte[] bArr, int i, int[] iArr, int i2) {
        int highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor(bArr, i);
        int highSpeedVideoFpsRangesFor2 = getHighSpeedVideoFpsRangesFor(bArr, i + 4);
        int highSpeedVideoFpsRangesFor3 = getHighSpeedVideoFpsRangesFor(bArr, i + 8);
        int highSpeedVideoFpsRangesFor4 = getHighSpeedVideoFpsRangesFor(bArr, i + 12);
        iArr[i2] = highSpeedVideoFpsRangesFor & 67108863;
        iArr[i2 + 1] = ((highSpeedVideoFpsRangesFor >>> 26) | (highSpeedVideoFpsRangesFor2 << 6)) & 67108863;
        iArr[i2 + 2] = ((highSpeedVideoFpsRangesFor2 >>> 20) | (highSpeedVideoFpsRangesFor3 << 12)) & 33554431;
        iArr[i2 + 3] = 67108863 & ((highSpeedVideoFpsRangesFor4 << 19) | (highSpeedVideoFpsRangesFor3 >>> 13));
        iArr[i2 + 4] = highSpeedVideoFpsRangesFor4 >>> 7;
    }

    public static void decode(int[] iArr, int i, int[] iArr2) {
        getHighResolutionOutputSizeshNQ4ISI(iArr, i, iArr2, 0);
        getHighResolutionOutputSizeshNQ4ISI(iArr, i + 4, iArr2, 5);
        iArr2[9] = iArr2[9] & 16777215;
    }

    public static void decode(byte[] bArr, int i, int[] iArr) {
        getHighSpeedVideoSizes(bArr, i, iArr, 0);
        getHighSpeedVideoSizes(bArr, i + 16, iArr, 5);
        iArr[9] = iArr[9] & 16777215;
    }

    public static void cswap(int i, int[] iArr, int[] iArr2) {
        for (int i2 = 0; i2 < 10; i2++) {
            int i3 = iArr[i2];
            int i4 = iArr2[i2];
            int i5 = (i3 ^ i4) & (0 - i);
            iArr[i2] = i3 ^ i5;
            iArr2[i2] = i4 ^ i5;
        }
    }

    public static int[] createTable(int i) {
        return new int[i * 10];
    }

    public static int[] create() {
        return new int[10];
    }

    public static void copy(int[] iArr, int i, int[] iArr2, int i2) {
        for (int i3 = 0; i3 < 10; i3++) {
            iArr2[i2 + i3] = iArr[i + i3];
        }
    }

    public static void cnegate(int i, int[] iArr) {
        int i2 = 0 - i;
        for (int i3 = 0; i3 < 10; i3++) {
            iArr[i3] = (iArr[i3] ^ i2) - i2;
        }
    }

    public static void cmov(int i, int[] iArr, int i2, int[] iArr2, int i3) {
        for (int i4 = 0; i4 < 10; i4++) {
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
        int i10 = i3 + (i2 >> 26);
        int i11 = i5 + (i4 >> 26);
        int i12 = i8 + (i7 >> 26);
        int i13 = iArr[9] + (i9 >> 26);
        int i14 = (i4 & 67108863) + (i10 >> 25);
        int i15 = i6 + (i11 >> 25);
        int i16 = (i9 & 67108863) + (i12 >> 25);
        int i17 = i + ((i13 >> 25) * 38);
        int i18 = (i2 & 67108863) + (i17 >> 26);
        int i19 = (i7 & 67108863) + (i15 >> 26);
        iArr[0] = i17 & 67108863;
        iArr[1] = i18 & 67108863;
        iArr[2] = (i10 & 33554431) + (i18 >> 26);
        iArr[3] = i14 & 67108863;
        iArr[4] = (i11 & 33554431) + (i14 >> 26);
        iArr[5] = i15 & 67108863;
        iArr[6] = i19 & 67108863;
        iArr[7] = (i12 & 33554431) + (i19 >> 26);
        iArr[8] = i16 & 67108863;
        iArr[9] = (i13 & 33554431) + (i16 >> 26);
    }

    public static boolean areEqualVar(int[] iArr, int[] iArr2) {
        return areEqual(iArr, iArr2) != 0;
    }

    public static int areEqual(int[] iArr, int[] iArr2) {
        int i = 0;
        for (int i2 = 0; i2 < 10; i2++) {
            i |= iArr[i2] ^ iArr2[i2];
        }
        return (((i >>> 1) | (i & 1)) - 1) >> 31;
    }

    public static void apm(int[] iArr, int[] iArr2, int[] iArr3, int[] iArr4) {
        for (int i = 0; i < 10; i++) {
            int i2 = iArr[i];
            int i3 = iArr2[i];
            iArr3[i] = i2 + i3;
            iArr4[i] = i2 - i3;
        }
    }

    public static void addOne(int[] iArr, int i) {
        iArr[i] = iArr[i] + 1;
    }

    public static void addOne(int[] iArr) {
        iArr[0] = iArr[0] + 1;
    }

    public static void add(int[] iArr, int[] iArr2, int[] iArr3) {
        for (int i = 0; i < 10; i++) {
            iArr3[i] = iArr[i] + iArr2[i];
        }
    }
}
