package org.bouncycastle.pqc.crypto.newhope;

/* loaded from: classes17.dex */
class ErrorCorrection {
    private static int Camera2StreamConfigurationMap(int i) {
        int i2 = (i * 2730) >> 27;
        int i3 = i2 - ((49155 - (i - (49156 * i2))) >> 31);
        int i4 = (((i3 >> 1) + (i3 & 1)) * 98312) - i;
        int i5 = i4 >> 31;
        return (i4 ^ i5) - i5;
    }

    private static int getHighSpeedVideoFpsRanges(int[] iArr, int i, int i2, int i3) {
        int i4 = (i3 * 2730) >> 25;
        int i5 = i4 - ((12288 - (i3 - (i4 * 12289))) >> 31);
        iArr[i] = (i5 >> 1) + (i5 & 1);
        int i6 = i5 - 1;
        iArr[i2] = (i6 >> 1) + (i6 & 1);
        int i7 = i3 - (iArr[i] * 24578);
        int i8 = i7 >> 31;
        return (i7 ^ i8) - i8;
    }

    static void Camera2StreamConfigurationMap(byte[] bArr, short[] sArr, short[] sArr2) {
        org.bouncycastle.util.Arrays.fill(bArr, (byte) 0);
        for (int i = 0; i < 256; i++) {
            short s = sArr[i];
            short s2 = sArr2[i];
            int i2 = i + com.google.android.material.internal.ViewUtils.EDGE_TO_EDGE_FLAGS;
            short s3 = sArr2[i2];
            int i3 = i + 256;
            int i4 = i + 512;
            int[] iArr = {((s * 8) + 196624) - (((s2 * 2) + s3) * 12289), ((sArr[i3] * 8) + 196624) - (((sArr2[i3] * 2) + s3) * 12289), ((sArr[i4] * 8) + 196624) - (((sArr2[i4] * 2) + s3) * 12289), ((sArr[i2] * 8) + 196624) - (s3 * 12289)};
            int i5 = i >>> 3;
            bArr[i5] = (byte) ((((short) (((((Camera2StreamConfigurationMap(iArr[0]) + Camera2StreamConfigurationMap(iArr[1])) + Camera2StreamConfigurationMap(iArr[2])) + Camera2StreamConfigurationMap(iArr[3])) - 98312) >>> 31)) << (i & 7)) | bArr[i5]);
        }
    }

    static void getHighSpeedVideoFpsRangesFor(short[] sArr, short[] sArr2, byte[] bArr) {
        short s = 8;
        byte[] bArr2 = new byte[8];
        bArr2[0] = 3;
        byte[] bArr3 = new byte[32];
        org.bouncycastle.pqc.crypto.newhope.ChaCha20.getHighResolutionOutputSizeshNQ4ISI(bArr, bArr2, bArr3, 32);
        int[] iArr = new int[8];
        int i = 0;
        while (i < 256) {
            int i2 = ((bArr3[i >>> 3] >>> (i & 7)) & 1) * 4;
            int highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges(iArr, 0, 4, (sArr2[i] * s) + i2);
            int i3 = i + 256;
            int highSpeedVideoFpsRanges2 = getHighSpeedVideoFpsRanges(iArr, 1, 5, (sArr2[i3] * s) + i2);
            int i4 = i + 512;
            int highSpeedVideoFpsRanges3 = getHighSpeedVideoFpsRanges(iArr, 2, 6, (sArr2[i4] * s) + i2);
            int i5 = i + com.google.android.material.internal.ViewUtils.EDGE_TO_EDGE_FLAGS;
            int highSpeedVideoFpsRanges4 = (24577 - (((highSpeedVideoFpsRanges + highSpeedVideoFpsRanges2) + highSpeedVideoFpsRanges3) + getHighSpeedVideoFpsRanges(iArr, 3, 7, (sArr2[i5] * s) + i2))) >> 31;
            int i6 = ~highSpeedVideoFpsRanges4;
            int i7 = iArr[0];
            int[] iArr2 = {(iArr[4] & highSpeedVideoFpsRanges4) ^ (i7 & i6), (i6 & iArr[1]) ^ (iArr[5] & highSpeedVideoFpsRanges4), (i6 & iArr[2]) ^ (iArr[6] & highSpeedVideoFpsRanges4), (iArr[7] & highSpeedVideoFpsRanges4) ^ (i6 & iArr[3])};
            int i8 = iArr2[0];
            int i9 = iArr2[3];
            sArr[i] = (short) ((i8 - i9) & 3);
            sArr[i3] = (short) ((iArr2[1] - i9) & 3);
            sArr[i4] = (short) ((iArr2[2] - i9) & 3);
            sArr[i5] = (short) (((-highSpeedVideoFpsRanges4) + (i9 * 2)) & 3);
            i++;
            s = 8;
        }
    }

    ErrorCorrection() {
    }
}
