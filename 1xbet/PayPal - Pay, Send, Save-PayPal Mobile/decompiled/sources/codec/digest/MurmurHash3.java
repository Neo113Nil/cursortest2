package codec.digest;

/* loaded from: classes7.dex */
public final class MurmurHash3 {
    public static final int DEFAULT_SEED = 104729;
    public static final long NULL_HASHCODE = 2862933555777941757L;

    public static class IncrementalHash32 {

        /* renamed from: a, reason: collision with root package name */
        public final byte[] f2773a = new byte[3];
        public int b;
        public int c;
        public int d;

        public final void add(byte[] bArr, int i, int i2) {
            int i3;
            int a2;
            if (i2 != 0) {
                this.c += i2;
                int i4 = this.b;
                if (i4 + i2 < 4) {
                    java.lang.System.arraycopy(bArr, i, this.f2773a, i4, i2);
                    this.b += i2;
                    return;
                }
                if (i4 > 0) {
                    i3 = 4 - i4;
                    if (i4 == 1) {
                        a2 = codec.digest.MurmurHash3.a(this.f2773a[0], bArr[i], bArr[i + 1], bArr[i + 2]);
                    } else if (i4 == 2) {
                        byte[] bArr2 = this.f2773a;
                        a2 = codec.digest.MurmurHash3.a(bArr2[0], bArr2[1], bArr[i], bArr[i + 1]);
                    } else {
                        if (i4 != 3) {
                            throw new java.lang.AssertionError(this.b);
                        }
                        byte[] bArr3 = this.f2773a;
                        a2 = codec.digest.MurmurHash3.a(bArr3[0], bArr3[1], bArr3[2], bArr[i]);
                    }
                    int rotateLeft = (java.lang.Integer.rotateLeft(a2 * androidx.collection.ScatterMapKt.MurmurHashC1, 15) * 461845907) ^ this.d;
                    this.d = rotateLeft;
                    this.d = (java.lang.Integer.rotateLeft(rotateLeft, 13) * 5) - 430675100;
                } else {
                    i3 = 0;
                }
                int i5 = i2 - i3;
                int i6 = i + i3;
                int i7 = i5 >> 2;
                for (int i8 = 0; i8 < i7; i8++) {
                    int i9 = (i8 << 2) + i6;
                    int rotateLeft2 = (java.lang.Integer.rotateLeft(codec.digest.MurmurHash3.a(bArr[i9], bArr[i9 + 1], bArr[i9 + 2], bArr[i9 + 3]) * androidx.collection.ScatterMapKt.MurmurHashC1, 15) * 461845907) ^ this.d;
                    this.d = rotateLeft2;
                    this.d = (java.lang.Integer.rotateLeft(rotateLeft2, 13) * 5) - 430675100;
                }
                int i10 = i7 << 2;
                int i11 = i5 - i10;
                this.b = i11;
                if (i10 == i5) {
                    return;
                }
                java.lang.System.arraycopy(bArr, i6 + i10, this.f2773a, 0, i11);
            }
        }

        public final int end() {
            int i;
            int i2;
            int i3 = this.b;
            if (i3 != 1) {
                if (i3 != 2) {
                    if (i3 == 3) {
                        i2 = this.f2773a[2] << 16;
                    }
                    int i4 = this.d ^ this.c;
                    int i5 = (i4 ^ (i4 >>> 16)) * (-2048144789);
                    int i6 = (i5 ^ (i5 >>> 13)) * (-1028477387);
                    int i7 = i6 ^ (i6 >>> 16);
                    this.d = i7;
                    return i7;
                }
                i2 = 0;
                i = i2 ^ (this.f2773a[1] << 8);
            } else {
                i = 0;
            }
            this.d = (java.lang.Integer.rotateLeft((i ^ this.f2773a[0]) * androidx.collection.ScatterMapKt.MurmurHashC1, 15) * 461845907) ^ this.d;
            int i42 = this.d ^ this.c;
            int i52 = (i42 ^ (i42 >>> 16)) * (-2048144789);
            int i62 = (i52 ^ (i52 >>> 13)) * (-1028477387);
            int i72 = i62 ^ (i62 >>> 16);
            this.d = i72;
            return i72;
        }

        public final void start(int i) {
            this.c = 0;
            this.b = 0;
            this.d = i;
        }
    }

    public static int a(byte b, byte b2, byte b3, byte b4) {
        return (b & 255) | ((b2 & 255) << 8) | ((b3 & 255) << 16) | ((b4 & 255) << 24);
    }

    public static long a(long j) {
        long j2 = (j ^ (j >>> 33)) * (-49064778989728563L);
        long j3 = (j2 ^ (j2 >>> 33)) * (-4265267296055464877L);
        return j3 ^ (j3 >>> 33);
    }

    public static long[] hash128(byte[] bArr) {
        return hash128(bArr, 0, bArr.length, 104729);
    }

    public static int hash32(long j, long j2) {
        return hash32(j, j2, 104729);
    }

    public static long hash64(byte[] bArr) {
        return hash64(bArr, 0, bArr.length, 104729);
    }

    public static long[] hash128(java.lang.String str) {
        byte[] bytes = str.getBytes();
        return hash128(bytes, 0, bytes.length, 104729);
    }

    public static int hash32(long j) {
        return hash32(j, 104729);
    }

    public static long hash64(long j) {
        return a(((java.lang.Long.rotateLeft((java.lang.Long.rotateLeft(java.lang.Long.reverseBytes(j) * (-8663945395140668459L), 31) * 5545529020109919103L) ^ 104729, 27) * 5) + 1390208809) ^ 8);
    }

    public static int a(int i, int i2) {
        return (java.lang.Integer.rotateLeft((java.lang.Integer.rotateLeft(i * androidx.collection.ScatterMapKt.MurmurHashC1, 15) * 461845907) ^ i2, 13) * 5) - 430675100;
    }

    public static int hash32(long j, int i) {
        long reverseBytes = java.lang.Long.reverseBytes(j);
        int a2 = a((int) (reverseBytes >>> 32), a((int) reverseBytes, i)) ^ 8;
        int i2 = (a2 ^ (a2 >>> 16)) * (-2048144789);
        int i3 = (i2 ^ (i2 >>> 13)) * (-1028477387);
        return i3 ^ (i3 >>> 16);
    }

    public static long[] hash128(byte[] bArr, int i, int i2, int i3) {
        long rotateLeft;
        long j = i3;
        int i4 = i2 >> 4;
        long j2 = j;
        int i5 = 0;
        while (i5 < i4) {
            int i6 = i + (i5 << 4);
            long j3 = bArr[i6];
            long j4 = bArr[i6 + 1];
            long j5 = bArr[i6 + 2];
            long j6 = bArr[i6 + 3];
            int i7 = i4;
            long j7 = bArr[i6 + 4];
            byte b = bArr[i6 + 5];
            long j8 = j;
            long j9 = j2;
            long j10 = bArr[i6 + 6];
            long j11 = bArr[i6 + 7];
            long j12 = bArr[i6 + 8];
            long j13 = bArr[i6 + 9];
            long j14 = bArr[i6 + 10];
            long j15 = bArr[i6 + 11];
            long j16 = bArr[i6 + 12];
            long j17 = bArr[i6 + 13];
            long j18 = bArr[i6 + 14];
            long j19 = bArr[i6 + 15];
            long rotateLeft2 = ((java.lang.Long.rotateLeft(j9 ^ (java.lang.Long.rotateLeft((((((b & 255) << 40) | (((j7 & 255) << 32) | ((((j5 & 255) << 16) | ((j3 & 255) | ((j4 & 255) << 8))) | ((j6 & 255) << 24)))) | ((j10 & 255) << 48)) | ((j11 & 255) << 56)) * (-8663945395140668459L), 31) * 5545529020109919103L), 27) + j8) * 5) + 1390208809;
            long rotateLeft3 = ((java.lang.Long.rotateLeft(j8 ^ (java.lang.Long.rotateLeft(((((((((j12 & 255) | ((j13 & 255) << 8)) | ((j14 & 255) << 16)) | ((j15 & 255) << 24)) | ((j16 & 255) << 32)) | ((j17 & 255) << 40)) | ((j18 & 255) << 48)) | ((j19 & 255) << 56)) * 5545529020109919103L, 33) * (-8663945395140668459L)), 31) + rotateLeft2) * 5) + 944331445;
            i5++;
            j2 = rotateLeft2;
            j = rotateLeft3;
            i4 = i7;
        }
        long j20 = j;
        long j21 = j2;
        long j22 = 0;
        switch (i2 - (i4 << 4)) {
            case 15:
                j22 = (bArr[(i + r0) + 14] & 255) << 48;
            case 14:
                j22 ^= (bArr[(i + r0) + 13] & 255) << 40;
            case 13:
                j22 ^= (bArr[(i + r0) + 12] & 255) << 32;
            case 12:
                j22 ^= (bArr[(i + r0) + 11] & 255) << 24;
            case 11:
                j22 ^= (bArr[(i + r0) + 10] & 255) << 16;
            case 10:
                j22 ^= (bArr[(i + r0) + 9] & 255) << 8;
            case 9:
                j20 ^= java.lang.Long.rotateLeft((j22 ^ (bArr[(i + r0) + 8] & 255)) * 5545529020109919103L, 33) * (-8663945395140668459L);
            case 8:
                j22 = (bArr[(i + r0) + 7] & 255) << 56;
            case 7:
                j22 ^= (bArr[(i + r0) + 6] & 255) << 48;
            case 6:
                j22 ^= (bArr[(i + r0) + 5] & 255) << 40;
            case 5:
                j22 ^= (bArr[(i + r0) + 4] & 255) << 32;
            case 4:
                j22 ^= (bArr[(i + r0) + 3] & 255) << 24;
            case 3:
                j22 ^= (bArr[(i + r0) + 2] & 255) << 16;
            case 2:
                j22 ^= (bArr[(i + r0) + 1] & 255) << 8;
            case 1:
                rotateLeft = j21 ^ (java.lang.Long.rotateLeft((j22 ^ (bArr[i + r0] & 255)) * (-8663945395140668459L), 31) * 5545529020109919103L);
                break;
            default:
                rotateLeft = j21;
                break;
        }
        long j23 = i2;
        long j24 = j20 ^ j23;
        long j25 = (j23 ^ rotateLeft) + j24;
        long a2 = a(j25);
        long a3 = a(j24 + j25);
        long j26 = a2 + a3;
        return new long[]{j26, a3 + j26};
    }

    public static int hash32(long j, long j2, int i) {
        long reverseBytes = java.lang.Long.reverseBytes(j);
        long reverseBytes2 = java.lang.Long.reverseBytes(j2);
        int i2 = (int) reverseBytes2;
        int a2 = a((int) (reverseBytes2 >>> 32), a(i2, a((int) (reverseBytes >>> 32), a((int) reverseBytes, i)))) ^ 16;
        int i3 = (a2 ^ (a2 >>> 16)) * (-2048144789);
        int i4 = (i3 ^ (i3 >>> 13)) * (-1028477387);
        return i4 ^ (i4 >>> 16);
    }

    public static long hash64(int i) {
        return a((java.lang.Long.rotateLeft((java.lang.Integer.reverseBytes(i) & 4294967295L) * (-8663945395140668459L), 31) * 5545529020109919103L) ^ 104733);
    }

    public static int hash32(byte[] bArr) {
        return hash32(bArr, 0, bArr.length, 104729);
    }

    public static int hash32(java.lang.String str) {
        byte[] bytes = str.getBytes();
        return hash32(bytes, 0, bytes.length, 104729);
    }

    public static int hash32(byte[] bArr, int i) {
        return hash32(bArr, i, 104729);
    }

    public static int hash32(byte[] bArr, int i, int i2) {
        return hash32(bArr, 0, i, i2);
    }

    public static int hash32(byte[] bArr, int i, int i2, int i3) {
        int i4 = i2 >> 2;
        for (int i5 = 0; i5 < i4; i5++) {
            int i6 = (i5 << 2) + i;
            i3 = a(((bArr[i6 + 3] & 255) << 24) | (bArr[i6] & 255) | ((bArr[i6 + 1] & 255) << 8) | ((bArr[i6 + 2] & 255) << 16), i3);
        }
        int i7 = i4 << 2;
        int i8 = i2 - i7;
        if (i8 != 1) {
            if (i8 != 2) {
                r1 = i8 == 3 ? bArr[(i + i7) + 2] << 16 : 0;
                int i9 = i3 ^ i2;
                int i10 = (i9 ^ (i9 >>> 16)) * (-2048144789);
                int i11 = (i10 ^ (i10 >>> 13)) * (-1028477387);
                return i11 ^ (i11 >>> 16);
            }
            r1 ^= bArr[(i + i7) + 1] << 8;
        }
        i3 ^= java.lang.Integer.rotateLeft((bArr[i + i7] ^ r1) * androidx.collection.ScatterMapKt.MurmurHashC1, 15) * 461845907;
        int i92 = i3 ^ i2;
        int i102 = (i92 ^ (i92 >>> 16)) * (-2048144789);
        int i112 = (i102 ^ (i102 >>> 13)) * (-1028477387);
        return i112 ^ (i112 >>> 16);
    }

    public static long hash64(short s) {
        return a((java.lang.Long.rotateLeft((((s & 255) << 8) ^ (((s & 65280) >> 8) & 255)) * (-8663945395140668459L), 31) * 5545529020109919103L) ^ 104731);
    }

    public static long hash64(byte[] bArr, int i, int i2) {
        return hash64(bArr, i, i2, 104729);
    }

    public static long hash64(byte[] bArr, int i, int i2, int i3) {
        long j = i3;
        int i4 = i2 >> 3;
        int i5 = 0;
        while (i5 < i4) {
            int i6 = i + (i5 << 3);
            long j2 = bArr[i6];
            long j3 = bArr[i6 + 1];
            long j4 = bArr[i6 + 2];
            long j5 = bArr[i6 + 3];
            long j6 = bArr[i6 + 4];
            int i7 = i4;
            j = (java.lang.Long.rotateLeft(j ^ (java.lang.Long.rotateLeft((((bArr[i6 + 7] & 255) << 56) | ((((bArr[i6 + 5] & 255) << 40) | (((((j2 & 255) | ((j3 & 255) << 8)) | ((j4 & 255) << 16)) | ((j5 & 255) << 24)) | ((j6 & 255) << 32))) | ((bArr[i6 + 6] & 255) << 48))) * (-8663945395140668459L), 31) * 5545529020109919103L), 27) * 5) + 1390208809;
            i5++;
            i4 = i7;
        }
        long j7 = j;
        int i8 = i4 << 3;
        long j8 = 0;
        switch (i2 - i8) {
            case 7:
                j8 = (bArr[(i + i8) + 6] & 255) << 48;
            case 6:
                j8 ^= (bArr[(i + i8) + 5] & 255) << 40;
            case 5:
                j8 ^= (bArr[(i + i8) + 4] & 255) << 32;
            case 4:
                j8 ^= (bArr[(i + i8) + 3] & 255) << 24;
            case 3:
                j8 ^= (bArr[(i + i8) + 2] & 255) << 16;
            case 2:
                j8 ^= (bArr[(i + i8) + 1] & 255) << 8;
            case 1:
                j7 ^= java.lang.Long.rotateLeft(((bArr[i + i8] & 255) ^ j8) * (-8663945395140668459L), 31) * 5545529020109919103L;
                break;
        }
        return a(j7 ^ i2);
    }
}
