package org.bouncycastle.crypto.engines;

/* loaded from: classes17.dex */
public class XTEAEngine implements org.bouncycastle.crypto.BlockCipher {
    private boolean getHighSpeedVideoFpsRangesFor;
    private int[] getHighSpeedVideoSizes = new int[4];
    private int[] getHighSpeedVideoFpsRanges = new int[32];
    private int[] getHighResolutionOutputSizeshNQ4ISI = new int[32];
    private boolean Camera2StreamConfigurationMap = false;

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
        this.getHighSpeedVideoFpsRangesFor = z;
        this.Camera2StreamConfigurationMap = true;
        byte[] key = ((org.bouncycastle.crypto.params.KeyParameter) cipherParameters).getKey();
        if (key.length != 16) {
            throw new java.lang.IllegalArgumentException("Key size must be 128 bits.");
        }
        int i = 0;
        int i2 = 0;
        while (i < 4) {
            this.getHighSpeedVideoSizes[i] = Camera2StreamConfigurationMap(key, i2);
            i++;
            i2 += 4;
        }
        int i3 = 0;
        for (int i4 = 0; i4 < 32; i4++) {
            int[] iArr = this.getHighSpeedVideoFpsRanges;
            int[] iArr2 = this.getHighSpeedVideoSizes;
            iArr[i4] = iArr2[i3 & 3] + i3;
            i3 -= 1640531527;
            this.getHighResolutionOutputSizeshNQ4ISI[i4] = iArr2[(i3 >>> 11) & 3] + i3;
        }
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public int processBlock(byte[] bArr, int i, byte[] bArr2, int i2) {
        if (!this.Camera2StreamConfigurationMap) {
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
        if (this.getHighSpeedVideoFpsRangesFor) {
            int Camera2StreamConfigurationMap = Camera2StreamConfigurationMap(bArr, i);
            int Camera2StreamConfigurationMap2 = Camera2StreamConfigurationMap(bArr, i + 4);
            for (int i3 = 0; i3 < 32; i3++) {
                Camera2StreamConfigurationMap += (((Camera2StreamConfigurationMap2 << 4) ^ (Camera2StreamConfigurationMap2 >>> 5)) + Camera2StreamConfigurationMap2) ^ this.getHighSpeedVideoFpsRanges[i3];
                Camera2StreamConfigurationMap2 += (((Camera2StreamConfigurationMap << 4) ^ (Camera2StreamConfigurationMap >>> 5)) + Camera2StreamConfigurationMap) ^ this.getHighResolutionOutputSizeshNQ4ISI[i3];
            }
            getHighSpeedVideoSizes(Camera2StreamConfigurationMap, bArr2, i2);
            getHighSpeedVideoSizes(Camera2StreamConfigurationMap2, bArr2, i2 + 4);
            return 8;
        }
        int Camera2StreamConfigurationMap3 = Camera2StreamConfigurationMap(bArr, i);
        int Camera2StreamConfigurationMap4 = Camera2StreamConfigurationMap(bArr, i + 4);
        for (int i4 = 31; i4 >= 0; i4--) {
            Camera2StreamConfigurationMap4 -= (((Camera2StreamConfigurationMap3 << 4) ^ (Camera2StreamConfigurationMap3 >>> 5)) + Camera2StreamConfigurationMap3) ^ this.getHighResolutionOutputSizeshNQ4ISI[i4];
            Camera2StreamConfigurationMap3 -= (((Camera2StreamConfigurationMap4 << 4) ^ (Camera2StreamConfigurationMap4 >>> 5)) + Camera2StreamConfigurationMap4) ^ this.getHighSpeedVideoFpsRanges[i4];
        }
        getHighSpeedVideoSizes(Camera2StreamConfigurationMap3, bArr2, i2);
        getHighSpeedVideoSizes(Camera2StreamConfigurationMap4, bArr2, i2 + 4);
        return 8;
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public java.lang.String getAlgorithmName() {
        return "XTEA";
    }

    private static void getHighSpeedVideoSizes(int i, byte[] bArr, int i2) {
        bArr[i2] = (byte) (i >>> 24);
        bArr[i2 + 1] = (byte) (i >>> 16);
        bArr[i2 + 2] = (byte) (i >>> 8);
        bArr[i2 + 3] = (byte) i;
    }

    private static int Camera2StreamConfigurationMap(byte[] bArr, int i) {
        byte b = bArr[i];
        return (bArr[i + 3] & 255) | ((bArr[i + 1] & 255) << 16) | (b << com.google.common.base.Ascii.CAN) | ((bArr[i + 2] & 255) << 8);
    }
}
