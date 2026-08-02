package com.facetec.sdk;

/* loaded from: classes8.dex */
public final class hd {
    private static byte[] f = new byte[256];
    static final byte[] b = new byte[256];
    static final int[] c = new int[256];
    static final int[] d = new int[256];

    /* renamed from: a, reason: collision with root package name */
    static final int[] f3624a = new int[256];
    static final int[] e = new int[256];
    private static int[] j = new int[10];

    private static int b(byte b2, int i) {
        int i2 = b2 & 255;
        return (i2 << i) | (i2 >> (8 - i));
    }

    static {
        int i;
        byte b2 = 1;
        byte b3 = 1;
        do {
            b2 = (byte) ((b2 ^ (b2 << 1)) ^ ((b2 & 128) != 0 ? 27 : 0));
            byte b4 = (byte) (b3 ^ (b3 << 1));
            byte b5 = (byte) (b4 ^ (b4 << 2));
            byte b6 = (byte) (b5 ^ (b5 << 4));
            b3 = (byte) (b6 ^ ((b6 & 128) != 0 ? (byte) 9 : (byte) 0));
            i = b2 & 255;
            f[i] = (byte) (((((b3 ^ 99) ^ b(b3, 1)) ^ b(b3, 2)) ^ b(b3, 3)) ^ b(b3, 4));
        } while (i != 1);
        f[0] = 99;
        for (int i2 = 0; i2 < 256; i2++) {
            int i3 = f[i2] & 255;
            b[i3] = (byte) i2;
            int i4 = i2 << 1;
            if (i4 >= 256) {
                i4 ^= 283;
            }
            int i5 = i4 << 1;
            if (i5 >= 256) {
                i5 ^= 283;
            }
            int i6 = i5 << 1;
            if (i6 >= 256) {
                i6 ^= 283;
            }
            int i7 = i6 ^ i2;
            int i8 = (i4 ^ i7) | ((i5 ^ i7) << 8) | (((i6 ^ i5) ^ i4) << 24) | (i7 << 16);
            c[i3] = i8;
            d[i3] = (i8 >>> 8) | (i8 << 24);
            f3624a[i3] = (i8 >>> 16) | (i8 << 16);
            e[i3] = (i8 >>> 24) | (i8 << 8);
        }
        j[0] = 16777216;
        int i9 = 1;
        for (int i10 = 1; i10 < 10; i10++) {
            i9 <<= 1;
            if (i9 >= 256) {
                i9 ^= 283;
            }
            j[i10] = i9 << 24;
        }
    }

    public static byte[][] d(int i) {
        byte[][] bArr = new byte[4][];
        for (int i2 = 0; i2 < 4; i2++) {
            int i3 = i >>> (i2 << 3);
            bArr[i2] = new byte[]{(byte) (i3 & 3), (byte) ((i3 >> 2) & 3), (byte) ((i3 >> 4) & 3), (byte) ((i3 >> 6) & 3)};
        }
        return bArr;
    }

    static int[] d(byte[] bArr, int i) throws java.lang.IllegalArgumentException {
        int i2;
        if (bArr.length != 16) {
            throw new java.lang.IllegalArgumentException();
        }
        int i3 = 4;
        int i4 = (i + 1) * 4;
        int[] iArr = new int[i4];
        int i5 = 0;
        int i6 = 0;
        while (i6 < 4) {
            byte b2 = bArr[i5];
            byte b3 = bArr[i5 + 1];
            byte b4 = bArr[i5 + 2];
            iArr[i6] = (bArr[i5 + 3] & 255) | (b2 << com.google.common.base.Ascii.CAN) | ((b3 & 255) << 16) | ((b4 & 255) << 8);
            i6++;
            i5 += 4;
        }
        int i7 = 4;
        int i8 = 0;
        int i9 = 0;
        while (true) {
            i2 = 1;
            if (i7 >= i4) {
                break;
            }
            int i10 = iArr[i7 - 1];
            if (i8 == 0) {
                byte[] bArr2 = f;
                i10 = j[i9] ^ ((bArr2[i10 >>> 24] & 255) | (((bArr2[(i10 >>> 16) & 255] << com.google.common.base.Ascii.CAN) | ((bArr2[(i10 >>> 8) & 255] & 255) << 16)) | ((bArr2[i10 & 255] & 255) << 8)));
                i9++;
                i8 = 4;
            }
            iArr[i7] = i10 ^ iArr[i7 - 4];
            i7++;
            i8--;
        }
        if (bArr.length != 16) {
            throw new java.lang.IllegalArgumentException();
        }
        int[] iArr2 = new int[i4];
        int i11 = i * 4;
        iArr2[0] = iArr[i11];
        iArr2[1] = iArr[i11 + 1];
        iArr2[2] = iArr[i11 + 2];
        iArr2[3] = iArr[i11 + 3];
        int i12 = i11 - 4;
        while (i2 < i) {
            int i13 = iArr[i12];
            int[] iArr3 = c;
            byte[] bArr3 = f;
            int i14 = iArr3[bArr3[i13 >>> 24] & 255];
            int[] iArr4 = d;
            int i15 = iArr4[bArr3[(i13 >>> 16) & 255] & 255];
            int[] iArr5 = f3624a;
            int i16 = iArr5[bArr3[(i13 >>> 8) & 255] & 255];
            int[] iArr6 = e;
            iArr2[i3] = iArr6[bArr3[i13 & 255] & 255] ^ ((i14 ^ i15) ^ i16);
            int i17 = iArr[i12 + 1];
            iArr2[i3 + 1] = iArr6[bArr3[i17 & 255] & 255] ^ ((iArr3[bArr3[i17 >>> 24] & 255] ^ iArr4[bArr3[(i17 >>> 16) & 255] & 255]) ^ iArr5[bArr3[(i17 >>> 8) & 255] & 255]);
            int i18 = iArr[i12 + 2];
            iArr2[i3 + 2] = iArr6[bArr3[i18 & 255] & 255] ^ ((iArr3[bArr3[i18 >>> 24] & 255] ^ iArr4[bArr3[(i18 >>> 16) & 255] & 255]) ^ iArr5[bArr3[(i18 >>> 8) & 255] & 255]);
            int i19 = iArr[i12 + 3];
            iArr2[i3 + 3] = iArr6[bArr3[i19 & 255] & 255] ^ ((iArr3[bArr3[i19 >>> 24] & 255] ^ iArr4[bArr3[(i19 >>> 16) & 255] & 255]) ^ iArr5[bArr3[(i19 >>> 8) & 255] & 255]);
            i12 -= 4;
            i2++;
            i3 += 4;
        }
        iArr2[i3] = iArr[i12];
        iArr2[i3 + 1] = iArr[i12 + 1];
        iArr2[i3 + 2] = iArr[i12 + 2];
        iArr2[i3 + 3] = iArr[i12 + 3];
        return iArr2;
    }
}
