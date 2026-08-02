package com.visa.cbp;

/* loaded from: classes5.dex */
public final class setTokenInfo {
    private static byte[] getOutputFormats = new byte[256];
    static final byte[] getHighSpeedVideoSizes = new byte[256];
    static final int[] getHighSpeedVideoFpsRangesFor = new int[256];
    static final int[] getHighSpeedVideoFpsRanges = new int[256];
    static final int[] getHighResolutionOutputSizeshNQ4ISI = new int[256];
    static final int[] Camera2StreamConfigurationMap = new int[256];
    private static int[] getInputFormats = new int[10];

    static {
        byte[] bArr;
        int i;
        byte b = 1;
        byte b2 = 1;
        do {
            b = (byte) ((b ^ (b << 1)) ^ ((b & 128) != 0 ? 27 : 0));
            byte b3 = (byte) (b2 ^ (b2 << 1));
            byte b4 = (byte) (b3 ^ (b3 << 2));
            byte b5 = (byte) (b4 ^ (b4 << 4));
            b2 = (byte) (b5 ^ ((b5 & 128) != 0 ? (byte) 9 : (byte) 0));
            bArr = getOutputFormats;
            i = b & 255;
            int i2 = b2 & 255;
            bArr[i] = (byte) (((i2 << 4) | (i2 >> 4)) ^ ((((b2 ^ 99) ^ ((i2 << 1) | (i2 >> 7))) ^ ((i2 << 2) | (i2 >> 6))) ^ ((i2 << 3) | (i2 >> 5))));
        } while (i != 1);
        bArr[0] = 99;
        for (int i3 = 0; i3 < 256; i3++) {
            int i4 = getOutputFormats[i3] & 255;
            getHighSpeedVideoSizes[i4] = (byte) i3;
            int i5 = i3 << 1;
            if (i5 >= 256) {
                i5 ^= 283;
            }
            int i6 = i5 << 1;
            if (i6 >= 256) {
                i6 ^= 283;
            }
            int i7 = i6 << 1;
            if (i7 >= 256) {
                i7 ^= 283;
            }
            int i8 = i7 ^ i3;
            int i9 = (i5 ^ i8) | ((i6 ^ i8) << 8) | (((i7 ^ i6) ^ i5) << 24) | (i8 << 16);
            getHighSpeedVideoFpsRangesFor[i4] = i9;
            getHighSpeedVideoFpsRanges[i4] = (i9 >>> 8) | (i9 << 24);
            getHighResolutionOutputSizeshNQ4ISI[i4] = (i9 >>> 16) | (i9 << 16);
            Camera2StreamConfigurationMap[i4] = (i9 >>> 24) | (i9 << 8);
        }
        getInputFormats[0] = 16777216;
        int i10 = 1;
        for (int i11 = 1; i11 < 10; i11++) {
            i10 <<= 1;
            if (i10 >= 256) {
                i10 ^= 283;
            }
            getInputFormats[i11] = i10 << 24;
        }
    }

    public static byte[][] ReplenishAckRequest(int i) {
        byte[][] bArr = new byte[4][];
        for (int i2 = 0; i2 < 4; i2++) {
            int i3 = i >>> (i2 << 3);
            bArr[i2] = new byte[]{(byte) (i3 & 3), (byte) ((i3 >> 2) & 3), (byte) ((i3 >> 4) & 3), (byte) ((i3 >> 6) & 3)};
        }
        return bArr;
    }

    static int[] getHighSpeedVideoSizes(byte[] bArr, int i) throws java.lang.IllegalArgumentException {
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
            byte b = bArr[i5];
            byte b2 = bArr[i5 + 1];
            byte b3 = bArr[i5 + 2];
            iArr[i6] = (bArr[i5 + 3] & 255) | (b << com.google.common.base.Ascii.CAN) | ((b2 & 255) << 16) | ((b3 & 255) << 8);
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
                byte[] bArr2 = getOutputFormats;
                i10 = getInputFormats[i9] ^ ((bArr2[i10 >>> 24] & 255) | (((bArr2[(i10 >>> 16) & 255] << com.google.common.base.Ascii.CAN) | ((bArr2[(i10 >>> 8) & 255] & 255) << 16)) | ((bArr2[i10 & 255] & 255) << 8)));
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
            int[] iArr3 = getHighSpeedVideoFpsRangesFor;
            byte[] bArr3 = getOutputFormats;
            int i14 = iArr3[bArr3[i13 >>> 24] & 255];
            int[] iArr4 = getHighSpeedVideoFpsRanges;
            int i15 = iArr4[bArr3[(i13 >>> 16) & 255] & 255];
            int[] iArr5 = getHighResolutionOutputSizeshNQ4ISI;
            int i16 = iArr5[bArr3[(i13 >>> 8) & 255] & 255];
            int[] iArr6 = Camera2StreamConfigurationMap;
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
