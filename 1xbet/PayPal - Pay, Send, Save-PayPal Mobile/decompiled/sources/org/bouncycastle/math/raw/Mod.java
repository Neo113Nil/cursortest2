package org.bouncycastle.math.raw;

/* loaded from: classes17.dex */
public abstract class Mod {
    public static int inverse32(int i) {
        int i2 = (2 - (i * i)) * i;
        int i3 = i2 * (2 - (i * i2));
        int i4 = i3 * (2 - (i * i3));
        return i4 * (2 - (i * i4));
    }

    public static int modOddInverse(int[] iArr, int[] iArr2, int[] iArr3) {
        int length = iArr.length;
        int numberOfLeadingZeros = (length << 5) - org.bouncycastle.util.Integers.numberOfLeadingZeros(iArr[length - 1]);
        int i = 30;
        int i2 = (numberOfLeadingZeros + 29) / 30;
        int[] iArr4 = new int[4];
        int[] iArr5 = new int[i2];
        int[] iArr6 = new int[i2];
        int[] iArr7 = new int[i2];
        int[] iArr8 = new int[i2];
        int[] iArr9 = new int[i2];
        int i3 = 0;
        iArr6[0] = 1;
        Camera2StreamConfigurationMap(numberOfLeadingZeros, iArr2, iArr8, 0);
        Camera2StreamConfigurationMap(numberOfLeadingZeros, iArr, iArr9, 0);
        java.lang.System.arraycopy(iArr9, 0, iArr7, 0, i2);
        int inverse32 = inverse32(iArr9[0]);
        int i4 = ((numberOfLeadingZeros * 49) + (numberOfLeadingZeros < 46 ? 80 : 47)) / 17;
        int i5 = -1;
        int i6 = 0;
        while (i6 < i4) {
            int i7 = iArr7[i3];
            int i8 = 1;
            int i9 = 1;
            int i10 = i3;
            int i11 = i10;
            int i12 = i5;
            int i13 = iArr8[i3];
            while (i3 < i) {
                int i14 = i12 >> 31;
                int i15 = -(i13 & 1);
                int i16 = i13 + (((i7 ^ i14) - i14) & i15);
                i11 += ((i8 ^ i14) - i14) & i15;
                i9 += ((i10 ^ i14) - i14) & i15;
                int i17 = i14 & i15;
                i12 = (i12 ^ i17) - (i17 + 1);
                i7 += i16 & i17;
                i13 = i16 >> 1;
                i8 = (i8 + (i11 & i17)) << 1;
                i10 = (i10 + (i17 & i9)) << 1;
                i3++;
                i = 30;
            }
            iArr4[0] = i8;
            iArr4[1] = i10;
            iArr4[2] = i11;
            iArr4[3] = i9;
            getHighSpeedVideoFpsRanges(i2, iArr5, iArr6, iArr4, inverse32, iArr9);
            getHighSpeedVideoFpsRangesFor(i2, iArr7, iArr8, iArr4);
            i6 += 30;
            i3 = 0;
            i5 = i12;
            i4 = i4;
            i = 30;
        }
        int i18 = i3;
        int i19 = i2 - 1;
        int i20 = iArr7[i19] >> 31;
        int i21 = i18;
        for (int i22 = i21; i22 < i19; i22++) {
            int i23 = i21 + ((iArr7[i22] ^ i20) - i20);
            iArr7[i22] = 1073741823 & i23;
            i21 = i23 >> 30;
        }
        iArr7[i19] = i21 + ((iArr7[i19] ^ i20) - i20);
        int i24 = iArr5[i19] >> 31;
        int i25 = i18;
        for (int i26 = i25; i26 < i19; i26++) {
            int i27 = i25 + (((iArr5[i26] + (iArr9[i26] & i24)) ^ i20) - i20);
            iArr5[i26] = i27 & kotlinx.coroutines.internal.LockFreeTaskQueueCore.MAX_CAPACITY_MASK;
            i25 = i27 >> 30;
        }
        int i28 = i25 + (((iArr5[i19] + (i24 & iArr9[i19])) ^ i20) - i20);
        iArr5[i19] = i28;
        int i29 = i28 >> 31;
        int i30 = i18;
        for (int i31 = i30; i31 < i19; i31++) {
            int i32 = i30 + iArr5[i31] + (iArr9[i31] & i29);
            iArr5[i31] = i32 & kotlinx.coroutines.internal.LockFreeTaskQueueCore.MAX_CAPACITY_MASK;
            i30 = i32 >> 30;
        }
        iArr5[i19] = i30 + iArr5[i19] + (i29 & iArr9[i19]);
        getHighSpeedVideoFpsRangesFor(numberOfLeadingZeros, iArr5, iArr3, i18);
        return org.bouncycastle.math.raw.Nat.equalTo(i2, iArr7, 1) & org.bouncycastle.math.raw.Nat.equalToZero(i2, iArr8);
    }

    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r8v5 */
    public static boolean modOddInverseVar(int[] iArr, int[] iArr2, int[] iArr3) {
        int i;
        int i2;
        int i3;
        int i4;
        int length = iArr.length;
        int i5 = 1;
        int numberOfLeadingZeros = (length << 5) - org.bouncycastle.util.Integers.numberOfLeadingZeros(iArr[length - 1]);
        int i6 = (numberOfLeadingZeros + 29) / 30;
        int[] iArr4 = new int[4];
        int[] iArr5 = new int[i6];
        int[] iArr6 = new int[i6];
        int[] iArr7 = new int[i6];
        int[] iArr8 = new int[i6];
        int[] iArr9 = new int[i6];
        ?? r8 = 0;
        iArr6[0] = 1;
        Camera2StreamConfigurationMap(numberOfLeadingZeros, iArr2, iArr8, 0);
        Camera2StreamConfigurationMap(numberOfLeadingZeros, iArr, iArr9, 0);
        java.lang.System.arraycopy(iArr9, 0, iArr7, 0, i6);
        int i7 = i6 - 1;
        int numberOfLeadingZeros2 = (-1) - (org.bouncycastle.util.Integers.numberOfLeadingZeros(iArr8[i7] | 1) - (((i6 * 30) + 2) - numberOfLeadingZeros));
        int inverse32 = inverse32(iArr9[0]);
        int i8 = ((numberOfLeadingZeros * 49) + (numberOfLeadingZeros < 46 ? 80 : 47)) / 17;
        int i9 = i6;
        int i10 = 0;
        while (!org.bouncycastle.math.raw.Nat.isZero(i9, iArr8)) {
            if (i10 >= i8) {
                return r8;
            }
            int i11 = i10 + 30;
            int i12 = iArr7[r8];
            int i13 = iArr8[r8];
            int i14 = i5;
            int i15 = i14;
            int i16 = r8;
            int i17 = i16;
            int i18 = i12;
            int i19 = 30;
            while (true) {
                int numberOfTrailingZeros = org.bouncycastle.util.Integers.numberOfTrailingZeros(((-1) << i19) | i13);
                int i20 = i13 >> numberOfTrailingZeros;
                i = i14 << numberOfTrailingZeros;
                i2 = i16 << numberOfTrailingZeros;
                numberOfLeadingZeros2 -= numberOfTrailingZeros;
                i3 = i11;
                int i21 = i19 - numberOfTrailingZeros;
                if (i21 <= 0) {
                    break;
                }
                int i22 = i8;
                int[] iArr10 = iArr9;
                int[] iArr11 = iArr6;
                int[] iArr12 = iArr8;
                if (numberOfLeadingZeros2 < 0) {
                    numberOfLeadingZeros2 = -numberOfLeadingZeros2;
                    int i23 = -i18;
                    int i24 = -i;
                    int i25 = -i2;
                    int i26 = numberOfLeadingZeros2 + 1;
                    if (i26 > i21) {
                        i26 = i21;
                    }
                    i4 = ((-1) >>> (32 - i26)) & 63 & (i20 * i23 * ((i20 * i20) - 2));
                    i18 = i20;
                    i16 = i15;
                    i15 = i25;
                    i20 = i23;
                    int i27 = i17;
                    i17 = i24;
                    i = i27;
                } else {
                    int i28 = numberOfLeadingZeros2 + 1;
                    if (i28 > i21) {
                        i28 = i21;
                    }
                    i4 = ((-((((i18 + 1) & 4) << 1) + i18)) * i20) & ((-1) >>> (32 - i28)) & 15;
                    i16 = i2;
                }
                i13 = i20 + (i18 * i4);
                i17 += i * i4;
                i15 += i4 * i16;
                iArr9 = iArr10;
                iArr8 = iArr12;
                iArr6 = iArr11;
                i8 = i22;
                i14 = i;
                i19 = i21;
                i11 = i3;
            }
            iArr4[0] = i;
            iArr4[1] = i2;
            iArr4[2] = i17;
            iArr4[3] = i15;
            int i29 = i9;
            int i30 = i8;
            int[] iArr13 = iArr6;
            int[] iArr14 = iArr9;
            int[] iArr15 = iArr6;
            int[] iArr16 = iArr8;
            getHighSpeedVideoFpsRanges(i6, iArr5, iArr13, iArr4, inverse32, iArr14);
            getHighSpeedVideoFpsRangesFor(i29, iArr7, iArr16, iArr4);
            i9 = i29 - 1;
            int i31 = iArr7[i9];
            int i32 = iArr16[i9];
            int i33 = i29 - 2;
            if (((i33 >> 31) | ((i31 >> 31) ^ i31) | ((i32 >> 31) ^ i32)) == 0) {
                iArr7[i33] = iArr7[i33] | (i31 << 30);
                iArr16[i33] = (i32 << 30) | iArr16[i33];
            } else {
                i9 = i29;
            }
            i10 = i3;
            iArr9 = iArr14;
            numberOfLeadingZeros2 = numberOfLeadingZeros2;
            r8 = 0;
            iArr8 = iArr16;
            iArr6 = iArr15;
            i8 = i30;
            i5 = 1;
        }
        boolean z = r8;
        int[] iArr17 = iArr9;
        int i34 = iArr7[i9 - 1];
        int i35 = iArr5[i7] >> 31;
        if (i35 < 0) {
            i35 = getHighSpeedVideoFpsRangesFor(i6, iArr5, iArr17);
        }
        if ((i34 >> 31) < 0) {
            i35 = getHighSpeedVideoFpsRangesFor(i6, iArr5);
            getHighSpeedVideoFpsRangesFor(i9, iArr7);
        }
        if (!org.bouncycastle.math.raw.Nat.isOne(i9, iArr7)) {
            return z;
        }
        if (i35 < 0) {
            getHighSpeedVideoFpsRangesFor(i6, iArr5, iArr17);
        }
        getHighSpeedVideoFpsRangesFor(numberOfLeadingZeros, iArr5, iArr3, z ? 1 : 0);
        return true;
    }

    private static void getHighSpeedVideoFpsRangesFor(int i, int[] iArr, int[] iArr2, int[] iArr3) {
        int i2 = i;
        int i3 = iArr3[0];
        int i4 = 1;
        int i5 = iArr3[1];
        int i6 = iArr3[2];
        int i7 = iArr3[3];
        long j = i3;
        long j2 = iArr[0];
        long j3 = i5;
        long j4 = iArr2[0];
        long j5 = i6;
        long j6 = i7;
        long j7 = ((j * j2) + (j3 * j4)) >> 30;
        long j8 = ((j2 * j5) + (j4 * j6)) >> 30;
        while (i4 < i2) {
            long j9 = iArr[i4];
            long j10 = iArr2[i4];
            long j11 = j7 + (j * j9) + (j3 * j10);
            long j12 = j8 + (j9 * j5) + (j10 * j6);
            int i8 = i4 - 1;
            iArr[i8] = ((int) j11) & kotlinx.coroutines.internal.LockFreeTaskQueueCore.MAX_CAPACITY_MASK;
            j7 = j11 >> 30;
            iArr2[i8] = ((int) j12) & kotlinx.coroutines.internal.LockFreeTaskQueueCore.MAX_CAPACITY_MASK;
            j8 = j12 >> 30;
            i4++;
            i2 = i;
        }
        int i9 = i - 1;
        iArr[i9] = (int) j7;
        iArr2[i9] = (int) j8;
    }

    private static void getHighSpeedVideoFpsRanges(int i, int[] iArr, int[] iArr2, int[] iArr3, int i2, int[] iArr4) {
        int i3 = i;
        int i4 = iArr3[0];
        int i5 = iArr3[1];
        int i6 = iArr3[2];
        int i7 = iArr3[3];
        int i8 = i3 - 1;
        int i9 = iArr[i8] >> 31;
        int i10 = iArr2[i8] >> 31;
        int i11 = (i4 & i9) + (i5 & i10);
        int i12 = (i9 & i6) + (i10 & i7);
        int i13 = iArr4[0];
        long j = i4;
        long j2 = iArr[0];
        long j3 = i5;
        long j4 = iArr2[0];
        long j5 = (j * j2) + (j3 * j4);
        long j6 = i6;
        long j7 = i7;
        long j8 = (j2 * j6) + (j4 * j7);
        long j9 = i13;
        long j10 = i11 - (((((int) j5) * i2) + i11) & kotlinx.coroutines.internal.LockFreeTaskQueueCore.MAX_CAPACITY_MASK);
        long j11 = i12 - (((((int) j8) * i2) + i12) & kotlinx.coroutines.internal.LockFreeTaskQueueCore.MAX_CAPACITY_MASK);
        long j12 = (j8 + (j9 * j11)) >> 30;
        long j13 = (j5 + (j9 * j10)) >> 30;
        int i14 = 1;
        while (i14 < i3) {
            int i15 = iArr4[i14];
            long j14 = j12;
            long j15 = iArr[i14];
            int i16 = i8;
            long j16 = iArr2[i14];
            long j17 = j11;
            long j18 = i15;
            long j19 = j13 + (j * j15) + (j3 * j16) + (j18 * j10);
            long j20 = j14 + (j15 * j6) + (j7 * j16) + (j18 * j17);
            int i17 = i14 - 1;
            iArr[i17] = ((int) j19) & kotlinx.coroutines.internal.LockFreeTaskQueueCore.MAX_CAPACITY_MASK;
            j13 = j19 >> 30;
            iArr2[i17] = ((int) j20) & kotlinx.coroutines.internal.LockFreeTaskQueueCore.MAX_CAPACITY_MASK;
            j12 = j20 >> 30;
            i14++;
            i3 = i;
            i8 = i16;
            j11 = j17;
        }
        int i18 = i8;
        iArr[i18] = (int) j13;
        iArr2[i18] = (int) j12;
    }

    public static int[] random(int[] iArr) {
        int length = iArr.length;
        java.util.Random random = new java.util.Random();
        int[] create = org.bouncycastle.math.raw.Nat.create(length);
        int i = length - 1;
        int i2 = iArr[i];
        int i3 = i2 | (i2 >>> 1);
        int i4 = i3 | (i3 >>> 2);
        int i5 = i4 | (i4 >>> 4);
        int i6 = i5 | (i5 >>> 8);
        do {
            for (int i7 = 0; i7 != length; i7++) {
                create[i7] = random.nextInt();
            }
            create[i] = create[i] & ((i6 >>> 16) | i6);
        } while (org.bouncycastle.math.raw.Nat.gte(length, create, iArr));
        return create;
    }

    private static int getHighSpeedVideoFpsRangesFor(int i, int[] iArr) {
        int i2 = i - 1;
        int i3 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            int i5 = i3 - iArr[i4];
            iArr[i4] = 1073741823 & i5;
            i3 = i5 >> 30;
        }
        int i6 = i3 - iArr[i2];
        iArr[i2] = i6;
        return i6 >> 30;
    }

    private static void Camera2StreamConfigurationMap(int i, int[] iArr, int[] iArr2, int i2) {
        long j = 0;
        int i3 = 0;
        int i4 = 0;
        while (i > 0) {
            if (i3 < java.lang.Math.min(30, i)) {
                j |= (iArr[i4] & 4294967295L) << i3;
                i3 += 32;
                i4++;
            }
            iArr2[i2] = ((int) j) & kotlinx.coroutines.internal.LockFreeTaskQueueCore.MAX_CAPACITY_MASK;
            j >>>= 30;
            i3 -= 30;
            i -= 30;
            i2++;
        }
    }

    private static void getHighSpeedVideoFpsRangesFor(int i, int[] iArr, int[] iArr2, int i2) {
        long j = 0;
        int i3 = 0;
        int i4 = 0;
        while (i > 0) {
            while (i3 < java.lang.Math.min(32, i)) {
                j |= iArr[i4] << i3;
                i3 += 30;
                i4++;
            }
            iArr2[i2] = (int) j;
            j >>>= 32;
            i3 -= 32;
            i -= 32;
            i2++;
        }
    }

    public static void checkedModOddInverseVar(int[] iArr, int[] iArr2, int[] iArr3) {
        if (!modOddInverseVar(iArr, iArr2, iArr3)) {
            throw new java.lang.ArithmeticException("Inverse does not exist.");
        }
    }

    public static void checkedModOddInverse(int[] iArr, int[] iArr2, int[] iArr3) {
        if (modOddInverse(iArr, iArr2, iArr3) == 0) {
            throw new java.lang.ArithmeticException("Inverse does not exist.");
        }
    }

    private static int getHighSpeedVideoFpsRangesFor(int i, int[] iArr, int[] iArr2) {
        int i2 = i - 1;
        int i3 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            int i5 = i3 + iArr[i4] + iArr2[i4];
            iArr[i4] = 1073741823 & i5;
            i3 = i5 >> 30;
        }
        int i6 = i3 + iArr[i2] + iArr2[i2];
        iArr[i2] = i6;
        return i6 >> 30;
    }
}
