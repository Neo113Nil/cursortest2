package org.bouncycastle.crypto.engines;

/* loaded from: classes17.dex */
public class SkipjackEngine implements org.bouncycastle.crypto.BlockCipher {
    static short[] getHighSpeedVideoFpsRangesFor = {163, 215, 9, 131, 248, 72, 246, 244, 179, 33, 21, 120, 153, 177, 175, 249, 231, 45, 77, 138, 206, 76, 202, 46, 82, 149, 217, 30, 78, 56, 68, 40, 10, 223, 2, 160, 23, 241, 96, 104, 18, 183, 122, 195, 233, 250, 61, 83, 150, com.visa.cbp.setDeviceName.getHighSpeedVideoFpsRanges, 107, 186, 242, 99, 154, 25, 124, 174, 229, 245, 247, 22, 106, 162, 57, 182, 123, 15, 193, com.visa.cbp.setDeviceName.isOutputSupportedFor, 129, 27, 238, 180, 26, 234, 208, com.visa.cbp.setDeviceName.getHighSpeedVideoSizesFor, 47, 184, 85, 185, 218, 133, 63, 65, 191, 224, 90, 88, 128, 95, 102, 11, 216, com.visa.cbp.setDeviceName.Camera2StreamConfigurationMap, 53, 213, 192, 167, 51, 6, 101, 105, 69, 0, com.visa.cbp.setDeviceName.coroutineBoundary, 86, 109, 152, 155, 118, 151, 252, com.visa.cbp.getEncExpo.invoke, 194, 176, 254, 219, 32, 225, 235, 214, 228, 221, 71, 74, 29, 66, 237, 158, 110, 73, 60, 205, 67, 39, 210, 7, 212, 222, 199, 103, 24, 137, 203, 48, 31, 141, 198, com.visa.cbp.setDeviceName.getOutputSizeshNQ4ISI, 170, 200, 116, 220, 201, 93, 92, 49, com.visa.cbp.getEncExpo.ResultReceiverMyResultReceiver, 112, 136, 97, 44, 159, 13, 43, com.visa.cbp.setDeviceName.unwrapAs, 80, 130, 84, 100, 38, 125, 3, 64, 52, 75, 28, 115, 209, 196, 253, 59, 204, 251, 127, 171, 230, 62, 91, com.visa.cbp.setDeviceName._CREATION, 173, 4, 35, 156, 20, 81, 34, 240, 41, 121, 113, 126, 255, 140, 14, 226, 12, 239, 188, 114, 117, com.visa.cbp.setDeviceName.getHighResolutionOutputSizeshNQ4ISI, 55, 161, 236, 211, 142, 98, 139, 134, 16, 232, 8, 119, 17, 190, com.visa.cbp.setDeviceName.getOutputStallDurationlomOqCM, 79, 36, 197, 50, 54, 157, 207, 243, 166, 187, 172, 94, 108, 169, 19, 87, 37, 181, 227, 189, 168, 58, 1, 5, 89, 42, 70};
    private boolean Camera2StreamConfigurationMap;
    private int[] getHighResolutionOutputSizeshNQ4ISI;
    private int[] getHighSpeedVideoFpsRanges;
    private int[] getHighSpeedVideoSizes;
    private int[] getInputFormats;

    @Override // org.bouncycastle.crypto.BlockCipher
    public int getBlockSize() {
        return 8;
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public void reset() {
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public int processBlock(byte[] bArr, int i, byte[] bArr2, int i2) {
        if (this.getHighSpeedVideoFpsRanges == null) {
            throw new java.lang.IllegalStateException("SKIPJACK engine not initialised");
        }
        if (i + 8 > bArr.length) {
            throw new org.bouncycastle.crypto.DataLengthException("input buffer too short");
        }
        if (i2 + 8 > bArr2.length) {
            throw new org.bouncycastle.crypto.OutputLengthException("output buffer too short");
        }
        if (this.Camera2StreamConfigurationMap) {
            encryptBlock(bArr, i, bArr2, i2);
            return 8;
        }
        decryptBlock(bArr, i, bArr2, i2);
        return 8;
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public void init(boolean z, org.bouncycastle.crypto.CipherParameters cipherParameters) {
        if (!(cipherParameters instanceof org.bouncycastle.crypto.params.KeyParameter)) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("invalid parameter passed to SKIPJACK init - ");
            sb.append(cipherParameters.getClass().getName());
            throw new java.lang.IllegalArgumentException(sb.toString());
        }
        byte[] key = ((org.bouncycastle.crypto.params.KeyParameter) cipherParameters).getKey();
        this.Camera2StreamConfigurationMap = z;
        this.getHighSpeedVideoSizes = new int[32];
        this.getHighSpeedVideoFpsRanges = new int[32];
        this.getHighResolutionOutputSizeshNQ4ISI = new int[32];
        this.getInputFormats = new int[32];
        for (int i = 0; i < 32; i++) {
            int i2 = i * 4;
            this.getHighSpeedVideoSizes[i] = key[i2 % 10] & 255;
            this.getHighSpeedVideoFpsRanges[i] = key[(i2 + 1) % 10] & 255;
            this.getHighResolutionOutputSizeshNQ4ISI[i] = key[(i2 + 2) % 10] & 255;
            this.getInputFormats[i] = key[(i2 + 3) % 10] & 255;
        }
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public java.lang.String getAlgorithmName() {
        return "SKIPJACK";
    }

    public int encryptBlock(byte[] bArr, int i, byte[] bArr2, int i2) {
        int i3 = (bArr[i] << 8) + (bArr[i + 1] & 255);
        int i4 = (bArr[i + 2] << 8) + (bArr[i + 3] & 255);
        int i5 = (bArr[i + 4] << 8) + (bArr[i + 5] & 255);
        int i6 = (bArr[i + 6] << 8) + (bArr[i + 7] & 255);
        int i7 = 0;
        for (int i8 = 0; i8 < 2; i8++) {
            int i9 = 0;
            while (i9 < 8) {
                int highSpeedVideoSizes = getHighSpeedVideoSizes(i7, i3);
                i7++;
                i9++;
                int i10 = i4;
                i4 = highSpeedVideoSizes;
                i3 = (i6 ^ highSpeedVideoSizes) ^ i7;
                i6 = i5;
                i5 = i10;
            }
            int i11 = 0;
            while (i11 < 8) {
                int i12 = i7 + 1;
                int highSpeedVideoSizes2 = getHighSpeedVideoSizes(i7, i3);
                i11++;
                int i13 = (i3 ^ i4) ^ i12;
                i4 = highSpeedVideoSizes2;
                i7 = i12;
                int i14 = i5;
                i5 = i13;
                i3 = i6;
                i6 = i14;
            }
        }
        bArr2[i2] = (byte) (i3 >> 8);
        bArr2[i2 + 1] = (byte) i3;
        bArr2[i2 + 2] = (byte) (i4 >> 8);
        bArr2[i2 + 3] = (byte) i4;
        bArr2[i2 + 4] = (byte) (i5 >> 8);
        bArr2[i2 + 5] = (byte) i5;
        bArr2[i2 + 6] = (byte) (i6 >> 8);
        bArr2[i2 + 7] = (byte) i6;
        return 8;
    }

    public int decryptBlock(byte[] bArr, int i, byte[] bArr2, int i2) {
        int i3 = (bArr[i] << 8) + (bArr[i + 1] & 255);
        int i4 = (bArr[i + 2] << 8) + (bArr[i + 3] & 255);
        int i5 = (bArr[i + 4] << 8) + (bArr[i + 5] & 255);
        int i6 = (bArr[i + 6] << 8) + (bArr[i + 7] & 255);
        int i7 = 31;
        for (int i8 = 0; i8 < 2; i8++) {
            int i9 = 0;
            int i10 = i6;
            int i11 = i5;
            int i12 = i10;
            while (i9 < 8) {
                int highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges(i7, i4);
                int i13 = i7 - 1;
                i9++;
                int i14 = (i7 + 1) ^ (i11 ^ highSpeedVideoFpsRanges);
                i11 = i12;
                i12 = i3;
                i3 = highSpeedVideoFpsRanges;
                i4 = i14;
                i7 = i13;
            }
            int i15 = 0;
            int i16 = i11;
            i6 = i12;
            i5 = i16;
            while (i15 < 8) {
                int highSpeedVideoFpsRanges2 = getHighSpeedVideoFpsRanges(i7, i4);
                int i17 = i7 - 1;
                i15++;
                int i18 = (i7 + 1) ^ (i3 ^ i4);
                i4 = i5;
                i5 = i6;
                i3 = highSpeedVideoFpsRanges2;
                i6 = i18;
                i7 = i17;
            }
        }
        bArr2[i2] = (byte) (i3 >> 8);
        bArr2[i2 + 1] = (byte) i3;
        bArr2[i2 + 2] = (byte) (i4 >> 8);
        bArr2[i2 + 3] = (byte) i4;
        bArr2[i2 + 4] = (byte) (i5 >> 8);
        bArr2[i2 + 5] = (byte) i5;
        bArr2[i2 + 6] = (byte) (i6 >> 8);
        bArr2[i2 + 7] = (byte) i6;
        return 8;
    }

    private int getHighSpeedVideoFpsRanges(int i, int i2) {
        int i3 = (i2 >> 8) & 255;
        short[] sArr = getHighSpeedVideoFpsRangesFor;
        int i4 = (i2 & 255) ^ sArr[this.getInputFormats[i] ^ i3];
        int i5 = i3 ^ sArr[this.getHighResolutionOutputSizeshNQ4ISI[i] ^ i4];
        int i6 = i4 ^ sArr[this.getHighSpeedVideoFpsRanges[i] ^ i5];
        return ((sArr[this.getHighSpeedVideoSizes[i] ^ i6] ^ i5) << 8) + i6;
    }

    private int getHighSpeedVideoSizes(int i, int i2) {
        int i3 = i2 & 255;
        short[] sArr = getHighSpeedVideoFpsRangesFor;
        int i4 = ((i2 >> 8) & 255) ^ sArr[this.getHighSpeedVideoSizes[i] ^ i3];
        int i5 = i3 ^ sArr[this.getHighSpeedVideoFpsRanges[i] ^ i4];
        int i6 = i4 ^ sArr[this.getHighResolutionOutputSizeshNQ4ISI[i] ^ i5];
        return (i6 << 8) + (sArr[this.getInputFormats[i] ^ i6] ^ i5);
    }
}
