package org.apache.commons.codec.digest;

/* loaded from: classes17.dex */
public final class MurmurHash3 {
    public static final int DEFAULT_SEED = 104729;

    @java.lang.Deprecated
    public static final long NULL_HASHCODE = 2862933555777941757L;

    static /* synthetic */ int getHighSpeedVideoSizes(int i) {
        int i2 = (i ^ (i >>> 16)) * (-2048144789);
        int i3 = (i2 ^ (i2 >>> 13)) * (-1028477387);
        return i3 ^ (i3 >>> 16);
    }

    @java.lang.Deprecated
    public static class IncrementalHash32 extends org.apache.commons.codec.digest.MurmurHash3.IncrementalHash32x86 {
        @Override // org.apache.commons.codec.digest.MurmurHash3.IncrementalHash32x86
        @java.lang.Deprecated
        final int getHighSpeedVideoFpsRanges(int i, int i2, byte[] bArr, int i3) {
            int i4;
            int i5;
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 == 3) {
                        i5 = bArr[2] << 16;
                    }
                    return org.apache.commons.codec.digest.MurmurHash3.getHighSpeedVideoSizes(i ^ i3);
                }
                i5 = 0;
                i4 = i5 ^ (bArr[1] << 8);
            } else {
                i4 = 0;
            }
            i ^= java.lang.Integer.rotateLeft((i4 ^ bArr[0]) * androidx.collection.ScatterMapKt.MurmurHashC1, 15) * 461845907;
            return org.apache.commons.codec.digest.MurmurHash3.getHighSpeedVideoSizes(i ^ i3);
        }
    }

    public static class IncrementalHash32x86 {
        private int getHighResolutionOutputSizeshNQ4ISI;
        private int getHighSpeedVideoFpsRanges;
        private int getHighSpeedVideoFpsRangesFor;
        private final byte[] getHighSpeedVideoSizes = new byte[3];

        private static int getHighSpeedVideoFpsRangesFor(byte b, byte b2, byte b3, byte b4) {
            return (b & 255) | ((b2 & 255) << 8) | ((b3 & 255) << 16) | ((b4 & 255) << 24);
        }

        public final void add(byte[] bArr, int i, int i2) {
            int highSpeedVideoFpsRangesFor;
            if (i2 > 0) {
                this.getHighSpeedVideoFpsRangesFor += i2;
                int i3 = this.getHighResolutionOutputSizeshNQ4ISI;
                if ((i3 + i2) - 4 < 0) {
                    java.lang.System.arraycopy(bArr, i, this.getHighSpeedVideoSizes, i3, i2);
                    this.getHighResolutionOutputSizeshNQ4ISI += i2;
                    return;
                }
                if (i3 > 0) {
                    if (i3 == 1) {
                        highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor(this.getHighSpeedVideoSizes[0], bArr[i], bArr[i + 1], bArr[i + 2]);
                    } else if (i3 == 2) {
                        byte[] bArr2 = this.getHighSpeedVideoSizes;
                        highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor(bArr2[0], bArr2[1], bArr[i], bArr[i + 1]);
                    } else if (i3 == 3) {
                        byte[] bArr3 = this.getHighSpeedVideoSizes;
                        highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor(bArr3[0], bArr3[1], bArr3[2], bArr[i]);
                    } else {
                        java.lang.StringBuilder sb = new java.lang.StringBuilder("Unprocessed length should be 1, 2, or 3: ");
                        sb.append(this.getHighResolutionOutputSizeshNQ4ISI);
                        throw new java.lang.IllegalStateException(sb.toString());
                    }
                    this.getHighSpeedVideoFpsRanges = org.apache.commons.codec.digest.MurmurHash3.Camera2StreamConfigurationMap(highSpeedVideoFpsRangesFor, this.getHighSpeedVideoFpsRanges);
                    int i4 = 4 - this.getHighResolutionOutputSizeshNQ4ISI;
                    i += i4;
                    i2 -= i4;
                }
                int i5 = i2 >> 2;
                for (int i6 = 0; i6 < i5; i6++) {
                    this.getHighSpeedVideoFpsRanges = org.apache.commons.codec.digest.MurmurHash3.Camera2StreamConfigurationMap(org.apache.commons.codec.digest.MurmurHash3.getHighSpeedVideoFpsRanges(bArr, (i6 << 2) + i), this.getHighSpeedVideoFpsRanges);
                }
                int i7 = i5 << 2;
                int i8 = i2 - i7;
                this.getHighResolutionOutputSizeshNQ4ISI = i8;
                if (i8 != 0) {
                    java.lang.System.arraycopy(bArr, i + i7, this.getHighSpeedVideoSizes, 0, i8);
                }
            }
        }

        public final int end() {
            return getHighSpeedVideoFpsRanges(this.getHighSpeedVideoFpsRanges, this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRangesFor);
        }

        int getHighSpeedVideoFpsRanges(int i, int i2, byte[] bArr, int i3) {
            int i4;
            int i5;
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 == 3) {
                        i5 = (bArr[2] & 255) << 16;
                    }
                    return org.apache.commons.codec.digest.MurmurHash3.getHighSpeedVideoSizes(i ^ i3);
                }
                i5 = 0;
                i4 = i5 ^ ((bArr[1] & 255) << 8);
            } else {
                i4 = 0;
            }
            i ^= java.lang.Integer.rotateLeft((i4 ^ (bArr[0] & 255)) * androidx.collection.ScatterMapKt.MurmurHashC1, 15) * 461845907;
            return org.apache.commons.codec.digest.MurmurHash3.getHighSpeedVideoSizes(i ^ i3);
        }

        public final void start(int i) {
            this.getHighSpeedVideoFpsRangesFor = 0;
            this.getHighResolutionOutputSizeshNQ4ISI = 0;
            this.getHighSpeedVideoFpsRanges = i;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int getHighSpeedVideoFpsRanges(byte[] bArr, int i) {
        return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    private static long getHighSpeedVideoSizes(byte[] bArr, int i) {
        return (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24) | ((bArr[i + 4] & 255) << 32) | ((bArr[i + 5] & 255) << 40) | ((bArr[i + 6] & 255) << 48) | ((bArr[i + 7] & 255) << 56);
    }

    public static long[] hash128(byte[] bArr) {
        return hash128(bArr, 0, bArr.length, 104729);
    }

    @java.lang.Deprecated
    public static long[] hash128(byte[] bArr, int i, int i2, int i3) {
        return getHighSpeedVideoFpsRangesFor(bArr, i, i2, i3);
    }

    @java.lang.Deprecated
    public static long[] hash128(java.lang.String str) {
        byte[] bytesUtf8 = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(str);
        return hash128(bytesUtf8, 0, bytesUtf8.length, 104729);
    }

    public static long[] hash128x64(byte[] bArr) {
        return hash128x64(bArr, 0, bArr.length, 0);
    }

    public static long[] hash128x64(byte[] bArr, int i, int i2, int i3) {
        return getHighSpeedVideoFpsRangesFor(bArr, i, i2, i3 & 4294967295L);
    }

    private static long[] getHighSpeedVideoFpsRangesFor(byte[] bArr, int i, int i2, long j) {
        byte[] bArr2 = bArr;
        int i3 = i2 >> 4;
        long j2 = j;
        long j3 = j2;
        int i4 = 0;
        while (i4 < i3) {
            int i5 = i + (i4 << 4);
            long highSpeedVideoSizes = getHighSpeedVideoSizes(bArr2, i5);
            long highSpeedVideoSizes2 = getHighSpeedVideoSizes(bArr2, i5 + 8);
            long rotateLeft = ((java.lang.Long.rotateLeft((java.lang.Long.rotateLeft(highSpeedVideoSizes * (-8663945395140668459L), 31) * 5545529020109919103L) ^ j3, 27) + j2) * 5) + 1390208809;
            j2 = ((java.lang.Long.rotateLeft(j2 ^ (java.lang.Long.rotateLeft(5545529020109919103L * highSpeedVideoSizes2, 33) * (-8663945395140668459L)), 31) + rotateLeft) * 5) + 944331445;
            i4++;
            j3 = rotateLeft;
            bArr2 = bArr;
        }
        long j4 = 0;
        switch ((i + i2) - (i + (i3 << 4))) {
            case 15:
                j4 = (bArr[r0 + 14] & 255) << 48;
            case 14:
                j4 ^= (bArr[r0 + 13] & 255) << 40;
            case 13:
                j4 ^= (bArr[r0 + 12] & 255) << 32;
            case 12:
                j4 ^= (bArr[r0 + 11] & 255) << 24;
            case 11:
                j4 ^= (bArr[r0 + 10] & 255) << 16;
            case 10:
                j4 ^= (bArr[r0 + 9] & 255) << 8;
            case 9:
                j2 ^= java.lang.Long.rotateLeft((j4 ^ (bArr[r0 + 8] & 255)) * 5545529020109919103L, 33) * (-8663945395140668459L);
            case 8:
                j4 = (bArr[r0 + 7] & 255) << 56;
            case 7:
                j4 ^= (bArr[r0 + 6] & 255) << 48;
            case 6:
                j4 ^= (bArr[r0 + 5] & 255) << 40;
            case 5:
                j4 ^= (bArr[r0 + 4] & 255) << 32;
            case 4:
                j4 ^= (bArr[r0 + 3] & 255) << 24;
            case 3:
                j4 ^= (bArr[r0 + 2] & 255) << 16;
            case 2:
                j4 ^= (bArr[r0 + 1] & 255) << 8;
            case 1:
                j3 ^= java.lang.Long.rotateLeft((j4 ^ (bArr[r0] & 255)) * (-8663945395140668459L), 31) * 5545529020109919103L;
                break;
        }
        long j5 = i2;
        long j6 = j5 ^ j2;
        long j7 = (j5 ^ j3) + j6;
        long j8 = ((j7 >>> 33) ^ j7) * (-49064778989728563L);
        long j9 = (j8 ^ (j8 >>> 33)) * (-4265267296055464877L);
        long j10 = j6 + j7;
        long j11 = ((j10 >>> 33) ^ j10) * (-49064778989728563L);
        long j12 = (j11 ^ (j11 >>> 33)) * (-4265267296055464877L);
        long j13 = j12 ^ (j12 >>> 33);
        long j14 = (j9 ^ (j9 >>> 33)) + j13;
        return new long[]{j14, j13 + j14};
    }

    @java.lang.Deprecated
    public static int hash32(byte[] bArr) {
        return hash32(bArr, 0, bArr.length, 104729);
    }

    @java.lang.Deprecated
    public static int hash32(byte[] bArr, int i) {
        return hash32(bArr, i, 104729);
    }

    @java.lang.Deprecated
    public static int hash32(byte[] bArr, int i, int i2) {
        return hash32(bArr, 0, i, i2);
    }

    @java.lang.Deprecated
    public static int hash32(byte[] bArr, int i, int i2, int i3) {
        int i4 = i2 >> 2;
        for (int i5 = 0; i5 < i4; i5++) {
            i3 = (java.lang.Integer.rotateLeft(i3 ^ (java.lang.Integer.rotateLeft(getHighSpeedVideoFpsRanges(bArr, (i5 << 2) + i) * androidx.collection.ScatterMapKt.MurmurHashC1, 15) * 461845907), 13) * 5) - 430675100;
        }
        int i6 = (i4 << 2) + i;
        int i7 = (i + i2) - i6;
        if (i7 != 1) {
            if (i7 != 2) {
                r1 = i7 == 3 ? bArr[i6 + 2] << 16 : 0;
                int i8 = i3 ^ i2;
                int i9 = (i8 ^ (i8 >>> 16)) * (-2048144789);
                int i10 = (i9 ^ (i9 >>> 13)) * (-1028477387);
                return i10 ^ (i10 >>> 16);
            }
            r1 ^= bArr[i6 + 1] << 8;
        }
        i3 ^= java.lang.Integer.rotateLeft((bArr[i6] ^ r1) * androidx.collection.ScatterMapKt.MurmurHashC1, 15) * 461845907;
        int i82 = i3 ^ i2;
        int i92 = (i82 ^ (i82 >>> 16)) * (-2048144789);
        int i102 = (i92 ^ (i92 >>> 13)) * (-1028477387);
        return i102 ^ (i102 >>> 16);
    }

    public static int hash32(long j) {
        return hash32(j, 104729);
    }

    public static int hash32(long j, int i) {
        long reverseBytes = java.lang.Long.reverseBytes(j);
        int rotateLeft = ((java.lang.Integer.rotateLeft((java.lang.Integer.rotateLeft(((int) (reverseBytes >>> 32)) * androidx.collection.ScatterMapKt.MurmurHashC1, 15) * 461845907) ^ ((java.lang.Integer.rotateLeft(i ^ (java.lang.Integer.rotateLeft(((int) reverseBytes) * androidx.collection.ScatterMapKt.MurmurHashC1, 15) * 461845907), 13) * 5) - 430675100), 13) * 5) - 430675100) ^ 8;
        int i2 = (rotateLeft ^ (rotateLeft >>> 16)) * (-2048144789);
        int i3 = (i2 ^ (i2 >>> 13)) * (-1028477387);
        return i3 ^ (i3 >>> 16);
    }

    public static int hash32(long j, long j2) {
        return hash32(j, j2, 104729);
    }

    public static int hash32(long j, long j2, int i) {
        long reverseBytes = java.lang.Long.reverseBytes(j);
        long reverseBytes2 = java.lang.Long.reverseBytes(j2);
        int rotateLeft = ((java.lang.Integer.rotateLeft(((java.lang.Integer.rotateLeft(((java.lang.Integer.rotateLeft((java.lang.Integer.rotateLeft(((int) (reverseBytes >>> 32)) * androidx.collection.ScatterMapKt.MurmurHashC1, 15) * 461845907) ^ ((java.lang.Integer.rotateLeft(i ^ (java.lang.Integer.rotateLeft(((int) reverseBytes) * androidx.collection.ScatterMapKt.MurmurHashC1, 15) * 461845907), 13) * 5) - 430675100), 13) * 5) - 430675100) ^ (java.lang.Integer.rotateLeft(((int) reverseBytes2) * androidx.collection.ScatterMapKt.MurmurHashC1, 15) * 461845907), 13) * 5) - 430675100) ^ (java.lang.Integer.rotateLeft(((int) (reverseBytes2 >>> 32)) * androidx.collection.ScatterMapKt.MurmurHashC1, 15) * 461845907), 13) * 5) - 430675100) ^ 16;
        int i2 = (rotateLeft ^ (rotateLeft >>> 16)) * (-2048144789);
        int i3 = (i2 ^ (i2 >>> 13)) * (-1028477387);
        return i3 ^ (i3 >>> 16);
    }

    @java.lang.Deprecated
    public static int hash32(java.lang.String str) {
        byte[] bytesUtf8 = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(str);
        return hash32(bytesUtf8, 0, bytesUtf8.length, 104729);
    }

    public static int hash32x86(byte[] bArr) {
        return hash32x86(bArr, 0, bArr.length, 0);
    }

    public static int hash32x86(byte[] bArr, int i, int i2, int i3) {
        int i4 = i2 >> 2;
        for (int i5 = 0; i5 < i4; i5++) {
            i3 = (java.lang.Integer.rotateLeft(i3 ^ (java.lang.Integer.rotateLeft(getHighSpeedVideoFpsRanges(bArr, (i5 << 2) + i) * androidx.collection.ScatterMapKt.MurmurHashC1, 15) * 461845907), 13) * 5) - 430675100;
        }
        int i6 = (i4 << 2) + i;
        int i7 = (i + i2) - i6;
        if (i7 != 1) {
            if (i7 != 2) {
                r1 = i7 == 3 ? (bArr[i6 + 2] & 255) << 16 : 0;
                int i8 = i3 ^ i2;
                int i9 = (i8 ^ (i8 >>> 16)) * (-2048144789);
                int i10 = (i9 ^ (i9 >>> 13)) * (-1028477387);
                return i10 ^ (i10 >>> 16);
            }
            r1 ^= (bArr[i6 + 1] & 255) << 8;
        }
        i3 ^= java.lang.Integer.rotateLeft(((bArr[i6] & 255) ^ r1) * androidx.collection.ScatterMapKt.MurmurHashC1, 15) * 461845907;
        int i82 = i3 ^ i2;
        int i92 = (i82 ^ (i82 >>> 16)) * (-2048144789);
        int i102 = (i92 ^ (i92 >>> 13)) * (-1028477387);
        return i102 ^ (i102 >>> 16);
    }

    @java.lang.Deprecated
    public static long hash64(byte[] bArr) {
        return hash64(bArr, 0, bArr.length, 104729);
    }

    @java.lang.Deprecated
    public static long hash64(byte[] bArr, int i, int i2) {
        return hash64(bArr, i, i2, 104729);
    }

    @java.lang.Deprecated
    public static long hash64(byte[] bArr, int i, int i2, int i3) {
        long j = i3;
        int i4 = i2 >> 3;
        for (int i5 = 0; i5 < i4; i5++) {
            j = (java.lang.Long.rotateLeft(j ^ (java.lang.Long.rotateLeft(getHighSpeedVideoSizes(bArr, i + (i5 << 3)) * (-8663945395140668459L), 31) * 5545529020109919103L), 27) * 5) + 1390208809;
        }
        long j2 = 0;
        switch ((i + i2) - (i + (i4 << 3))) {
            case 7:
                j2 = (bArr[r4 + 6] & 255) << 48;
            case 6:
                j2 ^= (bArr[r4 + 5] & 255) << 40;
            case 5:
                j2 ^= (bArr[r4 + 4] & 255) << 32;
            case 4:
                j2 ^= (bArr[r4 + 3] & 255) << 24;
            case 3:
                j2 ^= (bArr[r4 + 2] & 255) << 16;
            case 2:
                j2 ^= (bArr[r4 + 1] & 255) << 8;
            case 1:
                j ^= java.lang.Long.rotateLeft(((bArr[r4] & 255) ^ j2) * (-8663945395140668459L), 31) * 5545529020109919103L;
                break;
        }
        long j3 = i2 ^ j;
        long j4 = (j3 ^ (j3 >>> 33)) * (-49064778989728563L);
        long j5 = (j4 ^ (j4 >>> 33)) * (-4265267296055464877L);
        return j5 ^ (j5 >>> 33);
    }

    @java.lang.Deprecated
    public static long hash64(int i) {
        long rotateLeft = (java.lang.Long.rotateLeft((java.lang.Integer.reverseBytes(i) & 4294967295L) * (-8663945395140668459L), 31) * 5545529020109919103L) ^ 104733;
        long j = (rotateLeft ^ (rotateLeft >>> 33)) * (-49064778989728563L);
        long j2 = (j ^ (j >>> 33)) * (-4265267296055464877L);
        return j2 ^ (j2 >>> 33);
    }

    @java.lang.Deprecated
    public static long hash64(long j) {
        long rotateLeft = ((java.lang.Long.rotateLeft((java.lang.Long.rotateLeft(java.lang.Long.reverseBytes(j) * (-8663945395140668459L), 31) * 5545529020109919103L) ^ 104729, 27) * 5) + 1390208809) ^ 8;
        long j2 = (rotateLeft ^ (rotateLeft >>> 33)) * (-49064778989728563L);
        long j3 = (j2 ^ (j2 >>> 33)) * (-4265267296055464877L);
        return j3 ^ (j3 >>> 33);
    }

    @java.lang.Deprecated
    public static long hash64(short s) {
        long rotateLeft = (java.lang.Long.rotateLeft((((s & 255) << 8) ^ (((s & 65280) >> 8) & 255)) * (-8663945395140668459L), 31) * 5545529020109919103L) ^ 104731;
        long j = (rotateLeft ^ (rotateLeft >>> 33)) * (-49064778989728563L);
        long j2 = (j ^ (j >>> 33)) * (-4265267296055464877L);
        return j2 ^ (j2 >>> 33);
    }

    private MurmurHash3() {
    }

    static /* synthetic */ int Camera2StreamConfigurationMap(int i, int i2) {
        return (java.lang.Integer.rotateLeft((java.lang.Integer.rotateLeft(i * androidx.collection.ScatterMapKt.MurmurHashC1, 15) * 461845907) ^ i2, 13) * 5) - 430675100;
    }
}
