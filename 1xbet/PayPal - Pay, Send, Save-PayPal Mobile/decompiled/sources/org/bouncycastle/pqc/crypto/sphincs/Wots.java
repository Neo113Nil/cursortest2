package org.bouncycastle.pqc.crypto.sphincs;

/* loaded from: classes17.dex */
class Wots {
    private static void getHighResolutionOutputSizeshNQ4ISI(byte[] bArr, int i, byte[] bArr2, int i2) {
        for (int i3 = 0; i3 != 2144; i3++) {
            bArr[i3 + i] = 0;
        }
        org.bouncycastle.pqc.crypto.sphincs.Seed.Camera2StreamConfigurationMap(bArr, i, 2144L, bArr2, i2);
    }

    private static void getHighSpeedVideoSizes(org.bouncycastle.pqc.crypto.sphincs.HashFunctions hashFunctions, byte[] bArr, int i, byte[] bArr2, int i2, byte[] bArr3, int i3, int i4) {
        for (int i5 = 0; i5 < 32; i5++) {
            bArr[i5 + i] = bArr2[i5 + i2];
        }
        for (int i6 = 0; i6 < i4 && i6 < 16; i6++) {
            int i7 = (i6 * 32) + i3;
            byte[] bArr4 = new byte[32];
            for (int i8 = 0; i8 < 32; i8++) {
                bArr4[i8] = (byte) (bArr[i + i8] ^ bArr3[i7 + i8]);
            }
            hashFunctions.getHighSpeedVideoSizes(bArr, i, bArr4, 0);
        }
    }

    static void getHighSpeedVideoFpsRanges(org.bouncycastle.pqc.crypto.sphincs.HashFunctions hashFunctions, byte[] bArr, byte[] bArr2, int i, byte[] bArr3, byte[] bArr4) {
        int[] iArr = new int[67];
        int i2 = 0;
        int i3 = 0;
        while (i2 < 64) {
            byte b = bArr3[i2 / 2];
            iArr[i2] = b & com.google.common.base.Ascii.SI;
            int i4 = (b & 255) >>> 4;
            iArr[i2 + 1] = i4;
            i3 = i3 + (15 - iArr[i2]) + (15 - i4);
            i2 += 2;
        }
        while (i2 < 67) {
            iArr[i2] = i3 & 15;
            i3 >>>= 4;
            i2++;
        }
        for (int i5 = 0; i5 < 67; i5++) {
            int i6 = i5 * 32;
            int i7 = iArr[i5];
            getHighSpeedVideoSizes(hashFunctions, bArr, i6, bArr2, i + i6, bArr4, i7 * 32, 15 - i7);
        }
    }

    static void Camera2StreamConfigurationMap(org.bouncycastle.pqc.crypto.sphincs.HashFunctions hashFunctions, byte[] bArr, int i, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        int[] iArr = new int[67];
        int i2 = 0;
        int i3 = 0;
        while (i2 < 64) {
            byte b = bArr2[i2 / 2];
            iArr[i2] = b & com.google.common.base.Ascii.SI;
            int i4 = (b & 255) >>> 4;
            iArr[i2 + 1] = i4;
            i3 = i3 + (15 - iArr[i2]) + (15 - i4);
            i2 += 2;
        }
        while (i2 < 67) {
            iArr[i2] = i3 & 15;
            i3 >>>= 4;
            i2++;
        }
        getHighResolutionOutputSizeshNQ4ISI(bArr, i, bArr3, 0);
        for (int i5 = 0; i5 < 67; i5++) {
            int i6 = i + (i5 * 32);
            getHighSpeedVideoSizes(hashFunctions, bArr, i6, bArr, i6, bArr4, 0, iArr[i5]);
        }
    }

    static void getHighSpeedVideoFpsRangesFor(org.bouncycastle.pqc.crypto.sphincs.HashFunctions hashFunctions, byte[] bArr, int i, byte[] bArr2, int i2, byte[] bArr3, int i3) {
        getHighResolutionOutputSizeshNQ4ISI(bArr, i, bArr2, i2);
        for (int i4 = 0; i4 < 67; i4++) {
            int i5 = i + (i4 * 32);
            getHighSpeedVideoSizes(hashFunctions, bArr, i5, bArr, i5, bArr3, i3, 15);
        }
    }

    Wots() {
    }
}
