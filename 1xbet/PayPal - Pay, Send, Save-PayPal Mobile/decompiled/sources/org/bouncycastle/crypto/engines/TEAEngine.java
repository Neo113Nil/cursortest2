package org.bouncycastle.crypto.engines;

/* loaded from: classes17.dex */
public class TEAEngine implements org.bouncycastle.crypto.BlockCipher {
    private int Camera2StreamConfigurationMap;
    private boolean getHighResolutionOutputSizeshNQ4ISI;
    private int getHighSpeedVideoFpsRanges;
    private int getHighSpeedVideoFpsRangesFor;
    private int getHighSpeedVideoSizes;
    private boolean getOutputFormats = false;

    @Override // org.bouncycastle.crypto.BlockCipher
    public int getBlockSize() {
        return 8;
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public void reset() {
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public void init(boolean z, org.bouncycastle.crypto.CipherParameters cipherParameters) {
        if (!(cipherParameters instanceof org.bouncycastle.crypto.params.KeyParameter)) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("invalid parameter passed to TEA init - ");
            sb.append(cipherParameters.getClass().getName());
            throw new java.lang.IllegalArgumentException(sb.toString());
        }
        this.getHighResolutionOutputSizeshNQ4ISI = z;
        this.getOutputFormats = true;
        byte[] key = ((org.bouncycastle.crypto.params.KeyParameter) cipherParameters).getKey();
        if (key.length != 16) {
            throw new java.lang.IllegalArgumentException("Key size must be 128 bits.");
        }
        this.getHighSpeedVideoFpsRanges = getHighResolutionOutputSizeshNQ4ISI(key, 0);
        this.getHighSpeedVideoSizes = getHighResolutionOutputSizeshNQ4ISI(key, 4);
        this.getHighSpeedVideoFpsRangesFor = getHighResolutionOutputSizeshNQ4ISI(key, 8);
        this.Camera2StreamConfigurationMap = getHighResolutionOutputSizeshNQ4ISI(key, 12);
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public int processBlock(byte[] bArr, int i, byte[] bArr2, int i2) {
        if (!this.getOutputFormats) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(getAlgorithmName());
            sb.append(" not initialised");
            throw new java.lang.IllegalStateException(sb.toString());
        }
        if (i + 8 > bArr.length) {
            throw new org.bouncycastle.crypto.DataLengthException("input buffer too short");
        }
        if (i2 + 8 > bArr2.length) {
            throw new org.bouncycastle.crypto.OutputLengthException("output buffer too short");
        }
        int i3 = 0;
        if (this.getHighResolutionOutputSizeshNQ4ISI) {
            int highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI(bArr, i);
            int highResolutionOutputSizeshNQ4ISI2 = getHighResolutionOutputSizeshNQ4ISI(bArr, i + 4);
            int i4 = 0;
            while (i3 != 32) {
                i4 -= 1640531527;
                highResolutionOutputSizeshNQ4ISI += (((highResolutionOutputSizeshNQ4ISI2 << 4) + this.getHighSpeedVideoFpsRanges) ^ (highResolutionOutputSizeshNQ4ISI2 + i4)) ^ ((highResolutionOutputSizeshNQ4ISI2 >>> 5) + this.getHighSpeedVideoSizes);
                highResolutionOutputSizeshNQ4ISI2 += (((highResolutionOutputSizeshNQ4ISI << 4) + this.getHighSpeedVideoFpsRangesFor) ^ (highResolutionOutputSizeshNQ4ISI + i4)) ^ ((highResolutionOutputSizeshNQ4ISI >>> 5) + this.Camera2StreamConfigurationMap);
                i3++;
            }
            Camera2StreamConfigurationMap(highResolutionOutputSizeshNQ4ISI, bArr2, i2);
            Camera2StreamConfigurationMap(highResolutionOutputSizeshNQ4ISI2, bArr2, i2 + 4);
            return 8;
        }
        int highResolutionOutputSizeshNQ4ISI3 = getHighResolutionOutputSizeshNQ4ISI(bArr, i);
        int highResolutionOutputSizeshNQ4ISI4 = getHighResolutionOutputSizeshNQ4ISI(bArr, i + 4);
        int i5 = -957401312;
        while (i3 != 32) {
            highResolutionOutputSizeshNQ4ISI4 -= (((highResolutionOutputSizeshNQ4ISI3 << 4) + this.getHighSpeedVideoFpsRangesFor) ^ (highResolutionOutputSizeshNQ4ISI3 + i5)) ^ ((highResolutionOutputSizeshNQ4ISI3 >>> 5) + this.Camera2StreamConfigurationMap);
            highResolutionOutputSizeshNQ4ISI3 -= (((highResolutionOutputSizeshNQ4ISI4 << 4) + this.getHighSpeedVideoFpsRanges) ^ (highResolutionOutputSizeshNQ4ISI4 + i5)) ^ ((highResolutionOutputSizeshNQ4ISI4 >>> 5) + this.getHighSpeedVideoSizes);
            i5 += 1640531527;
            i3++;
        }
        Camera2StreamConfigurationMap(highResolutionOutputSizeshNQ4ISI3, bArr2, i2);
        Camera2StreamConfigurationMap(highResolutionOutputSizeshNQ4ISI4, bArr2, i2 + 4);
        return 8;
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public java.lang.String getAlgorithmName() {
        return "TEA";
    }

    private static void Camera2StreamConfigurationMap(int i, byte[] bArr, int i2) {
        bArr[i2] = (byte) (i >>> 24);
        bArr[i2 + 1] = (byte) (i >>> 16);
        bArr[i2 + 2] = (byte) (i >>> 8);
        bArr[i2 + 3] = (byte) i;
    }

    private static int getHighResolutionOutputSizeshNQ4ISI(byte[] bArr, int i) {
        byte b = bArr[i];
        return (bArr[i + 3] & 255) | ((bArr[i + 1] & 255) << 16) | (b << com.google.common.base.Ascii.CAN) | ((bArr[i + 2] & 255) << 8);
    }
}
