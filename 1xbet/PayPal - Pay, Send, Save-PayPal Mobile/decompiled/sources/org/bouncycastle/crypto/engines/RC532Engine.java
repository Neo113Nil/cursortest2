package org.bouncycastle.crypto.engines;

/* loaded from: classes17.dex */
public class RC532Engine implements org.bouncycastle.crypto.BlockCipher {
    private boolean getHighSpeedVideoSizes;
    private int getHighSpeedVideoFpsRangesFor = 12;
    private int[] getHighResolutionOutputSizeshNQ4ISI = null;

    private void Camera2StreamConfigurationMap(byte[] bArr) {
        int[] iArr;
        int length = (bArr.length + 3) / 4;
        int[] iArr2 = new int[length];
        for (int i = 0; i != bArr.length; i++) {
            int i2 = i / 4;
            iArr2[i2] = iArr2[i2] + ((bArr[i] & 255) << ((i % 4) * 8));
        }
        int[] iArr3 = new int[(this.getHighSpeedVideoFpsRangesFor + 1) * 2];
        this.getHighResolutionOutputSizeshNQ4ISI = iArr3;
        iArr3[0] = -1209970333;
        int i3 = 1;
        while (true) {
            iArr = this.getHighResolutionOutputSizeshNQ4ISI;
            if (i3 >= iArr.length) {
                break;
            }
            iArr[i3] = iArr[i3 - 1] - 1640531527;
            i3++;
        }
        int length2 = length > iArr.length ? length * 3 : iArr.length * 3;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        for (int i8 = 0; i8 < length2; i8++) {
            int[] iArr4 = this.getHighResolutionOutputSizeshNQ4ISI;
            int i9 = iArr4[i4] + i5 + i6;
            i5 = (i9 >>> 29) | (i9 << 3);
            iArr4[i4] = i5;
            int i10 = iArr2[i7] + i5 + i6;
            int i11 = (i6 + i5) & 31;
            i6 = (i10 << i11) | (i10 >>> (32 - i11));
            iArr2[i7] = i6;
            i4 = (i4 + 1) % iArr4.length;
            i7 = (i7 + 1) % length;
        }
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public int getBlockSize() {
        return 8;
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public void reset() {
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public int processBlock(byte[] bArr, int i, byte[] bArr2, int i2) {
        if (!this.getHighSpeedVideoSizes) {
            int highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges(bArr, i);
            int highSpeedVideoFpsRanges2 = getHighSpeedVideoFpsRanges(bArr, i + 4);
            for (int i3 = this.getHighSpeedVideoFpsRangesFor; i3 > 0; i3--) {
                int[] iArr = this.getHighResolutionOutputSizeshNQ4ISI;
                int i4 = i3 * 2;
                int i5 = highSpeedVideoFpsRanges2 - iArr[i4 + 1];
                int i6 = highSpeedVideoFpsRanges & 31;
                highSpeedVideoFpsRanges2 = ((i5 >>> i6) | (i5 << (32 - i6))) ^ highSpeedVideoFpsRanges;
                int i7 = highSpeedVideoFpsRanges - iArr[i4];
                int i8 = highSpeedVideoFpsRanges2 & 31;
                highSpeedVideoFpsRanges = ((i7 >>> i8) | (i7 << (32 - i8))) ^ highSpeedVideoFpsRanges2;
            }
            getHighSpeedVideoSizes(highSpeedVideoFpsRanges - this.getHighResolutionOutputSizeshNQ4ISI[0], bArr2, i2);
            getHighSpeedVideoSizes(highSpeedVideoFpsRanges2 - this.getHighResolutionOutputSizeshNQ4ISI[1], bArr2, i2 + 4);
            return 8;
        }
        int highSpeedVideoFpsRanges3 = getHighSpeedVideoFpsRanges(bArr, i) + this.getHighResolutionOutputSizeshNQ4ISI[0];
        int highSpeedVideoFpsRanges4 = getHighSpeedVideoFpsRanges(bArr, i + 4) + this.getHighResolutionOutputSizeshNQ4ISI[1];
        for (int i9 = 1; i9 <= this.getHighSpeedVideoFpsRangesFor; i9++) {
            int i10 = highSpeedVideoFpsRanges3 ^ highSpeedVideoFpsRanges4;
            int i11 = highSpeedVideoFpsRanges4 & 31;
            int i12 = (i10 << i11) | (i10 >>> (32 - i11));
            int[] iArr2 = this.getHighResolutionOutputSizeshNQ4ISI;
            int i13 = i9 * 2;
            highSpeedVideoFpsRanges3 = i12 + iArr2[i13];
            int i14 = highSpeedVideoFpsRanges4 ^ highSpeedVideoFpsRanges3;
            int i15 = highSpeedVideoFpsRanges3 & 31;
            highSpeedVideoFpsRanges4 = ((i14 << i15) | (i14 >>> (32 - i15))) + iArr2[i13 + 1];
        }
        getHighSpeedVideoSizes(highSpeedVideoFpsRanges3, bArr2, i2);
        getHighSpeedVideoSizes(highSpeedVideoFpsRanges4, bArr2, i2 + 4);
        return 8;
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public void init(boolean z, org.bouncycastle.crypto.CipherParameters cipherParameters) {
        if (cipherParameters instanceof org.bouncycastle.crypto.params.RC5Parameters) {
            org.bouncycastle.crypto.params.RC5Parameters rC5Parameters = (org.bouncycastle.crypto.params.RC5Parameters) cipherParameters;
            this.getHighSpeedVideoFpsRangesFor = rC5Parameters.getRounds();
            Camera2StreamConfigurationMap(rC5Parameters.getKey());
        } else {
            if (!(cipherParameters instanceof org.bouncycastle.crypto.params.KeyParameter)) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("invalid parameter passed to RC532 init - ");
                sb.append(cipherParameters.getClass().getName());
                throw new java.lang.IllegalArgumentException(sb.toString());
            }
            Camera2StreamConfigurationMap(((org.bouncycastle.crypto.params.KeyParameter) cipherParameters).getKey());
        }
        this.getHighSpeedVideoSizes = z;
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public java.lang.String getAlgorithmName() {
        return "RC5-32";
    }

    private static void getHighSpeedVideoSizes(int i, byte[] bArr, int i2) {
        bArr[i2] = (byte) i;
        bArr[i2 + 1] = (byte) (i >> 8);
        bArr[i2 + 2] = (byte) (i >> 16);
        bArr[i2 + 3] = (byte) (i >> 24);
    }

    private static int getHighSpeedVideoFpsRanges(byte[] bArr, int i) {
        return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }
}
