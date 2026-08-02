package org.bouncycastle.crypto.engines;

/* loaded from: classes17.dex */
public class Grain128Engine implements org.bouncycastle.crypto.StreamCipher {
    private int Camera2StreamConfigurationMap = 4;
    private boolean getHighResolutionOutputSizeshNQ4ISI = false;
    private int[] getHighSpeedVideoFpsRanges;
    private byte[] getHighSpeedVideoFpsRangesFor;
    private int[] getHighSpeedVideoSizes;
    private int getHighSpeedVideoSizesFor;
    private byte[] getInputFormats;
    private byte[] getInputSizeshNQ4ISI;

    private byte Camera2StreamConfigurationMap() {
        if (this.Camera2StreamConfigurationMap > 3) {
            int highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI();
            this.getHighSpeedVideoSizesFor = highResolutionOutputSizeshNQ4ISI;
            byte[] bArr = this.getHighSpeedVideoFpsRangesFor;
            bArr[0] = (byte) highResolutionOutputSizeshNQ4ISI;
            bArr[1] = (byte) (highResolutionOutputSizeshNQ4ISI >> 8);
            bArr[2] = (byte) (highResolutionOutputSizeshNQ4ISI >> 16);
            bArr[3] = (byte) (highResolutionOutputSizeshNQ4ISI >> 24);
            int[] iArr = this.getHighSpeedVideoFpsRanges;
            int highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor();
            int[] iArr2 = this.getHighSpeedVideoSizes;
            int i = highSpeedVideoFpsRangesFor ^ iArr2[0];
            iArr[0] = iArr[1];
            iArr[1] = iArr[2];
            iArr[2] = iArr[3];
            iArr[3] = i;
            this.getHighSpeedVideoFpsRanges = iArr;
            int highSpeedVideoSizes = getHighSpeedVideoSizes();
            iArr2[0] = iArr2[1];
            iArr2[1] = iArr2[2];
            iArr2[2] = iArr2[3];
            iArr2[3] = highSpeedVideoSizes;
            this.getHighSpeedVideoSizes = iArr2;
            this.Camera2StreamConfigurationMap = 0;
        }
        byte[] bArr2 = this.getHighSpeedVideoFpsRangesFor;
        int i2 = this.Camera2StreamConfigurationMap;
        this.Camera2StreamConfigurationMap = i2 + 1;
        return bArr2[i2];
    }

    @Override // org.bouncycastle.crypto.StreamCipher
    public void reset() {
        this.Camera2StreamConfigurationMap = 4;
        byte[] bArr = this.getInputFormats;
        byte[] bArr2 = this.getInputSizeshNQ4ISI;
        bArr2[12] = -1;
        bArr2[13] = -1;
        bArr2[14] = -1;
        bArr2[15] = -1;
        this.getInputFormats = bArr;
        this.getInputSizeshNQ4ISI = bArr2;
        int i = 0;
        int i2 = 0;
        while (true) {
            int[] iArr = this.getHighSpeedVideoFpsRanges;
            if (i >= iArr.length) {
                break;
            }
            byte[] bArr3 = this.getInputFormats;
            int i3 = i2 + 3;
            int i4 = i2 + 2;
            int i5 = i2 + 1;
            iArr[i] = (bArr3[i2] & 255) | (bArr3[i3] << com.google.common.base.Ascii.CAN) | ((bArr3[i4] << 16) & 16711680) | ((bArr3[i5] << 8) & androidx.core.view.MotionEventCompat.ACTION_POINTER_INDEX_MASK);
            int[] iArr2 = this.getHighSpeedVideoSizes;
            byte[] bArr4 = this.getInputSizeshNQ4ISI;
            byte b = bArr4[i3];
            byte b2 = bArr4[i4];
            iArr2[i] = (bArr4[i2] & 255) | ((bArr4[i5] << 8) & androidx.core.view.MotionEventCompat.ACTION_POINTER_INDEX_MASK) | (b << com.google.common.base.Ascii.CAN) | ((b2 << 16) & 16711680);
            i2 += 4;
            i++;
        }
        for (int i6 = 0; i6 < 8; i6++) {
            this.getHighSpeedVideoSizesFor = getHighResolutionOutputSizeshNQ4ISI();
            int[] iArr3 = this.getHighSpeedVideoFpsRanges;
            int highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor();
            int[] iArr4 = this.getHighSpeedVideoSizes;
            int i7 = (highSpeedVideoFpsRangesFor ^ iArr4[0]) ^ this.getHighSpeedVideoSizesFor;
            iArr3[0] = iArr3[1];
            iArr3[1] = iArr3[2];
            iArr3[2] = iArr3[3];
            iArr3[3] = i7;
            this.getHighSpeedVideoFpsRanges = iArr3;
            int highSpeedVideoSizes = getHighSpeedVideoSizes() ^ this.getHighSpeedVideoSizesFor;
            iArr4[0] = iArr4[1];
            iArr4[1] = iArr4[2];
            iArr4[2] = iArr4[3];
            iArr4[3] = highSpeedVideoSizes;
            this.getHighSpeedVideoSizes = iArr4;
        }
        this.getHighResolutionOutputSizeshNQ4ISI = true;
    }

    @Override // org.bouncycastle.crypto.StreamCipher
    public byte returnByte(byte b) {
        if (this.getHighResolutionOutputSizeshNQ4ISI) {
            return (byte) (b ^ Camera2StreamConfigurationMap());
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(getAlgorithmName());
        sb.append(" not initialised");
        throw new java.lang.IllegalStateException(sb.toString());
    }

    @Override // org.bouncycastle.crypto.StreamCipher
    public int processBytes(byte[] bArr, int i, int i2, byte[] bArr2, int i3) throws org.bouncycastle.crypto.DataLengthException {
        if (!this.getHighResolutionOutputSizeshNQ4ISI) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(getAlgorithmName());
            sb.append(" not initialised");
            throw new java.lang.IllegalStateException(sb.toString());
        }
        if (i + i2 > bArr.length) {
            throw new org.bouncycastle.crypto.DataLengthException("input buffer too short");
        }
        if (i3 + i2 > bArr2.length) {
            throw new org.bouncycastle.crypto.OutputLengthException("output buffer too short");
        }
        for (int i4 = 0; i4 < i2; i4++) {
            bArr2[i3 + i4] = (byte) (bArr[i + i4] ^ Camera2StreamConfigurationMap());
        }
        return i2;
    }

    @Override // org.bouncycastle.crypto.StreamCipher
    public void init(boolean z, org.bouncycastle.crypto.CipherParameters cipherParameters) throws java.lang.IllegalArgumentException {
        if (!(cipherParameters instanceof org.bouncycastle.crypto.params.ParametersWithIV)) {
            throw new java.lang.IllegalArgumentException("Grain-128 Init parameters must include an IV");
        }
        org.bouncycastle.crypto.params.ParametersWithIV parametersWithIV = (org.bouncycastle.crypto.params.ParametersWithIV) cipherParameters;
        byte[] iv = parametersWithIV.getIV();
        if (iv == null || iv.length != 12) {
            throw new java.lang.IllegalArgumentException("Grain-128  requires exactly 12 bytes of IV");
        }
        if (!(parametersWithIV.getParameters() instanceof org.bouncycastle.crypto.params.KeyParameter)) {
            throw new java.lang.IllegalArgumentException("Grain-128 Init parameters must include a key");
        }
        org.bouncycastle.crypto.params.KeyParameter keyParameter = (org.bouncycastle.crypto.params.KeyParameter) parametersWithIV.getParameters();
        this.getInputSizeshNQ4ISI = new byte[keyParameter.getKey().length];
        this.getInputFormats = new byte[keyParameter.getKey().length];
        this.getHighSpeedVideoSizes = new int[4];
        this.getHighSpeedVideoFpsRanges = new int[4];
        this.getHighSpeedVideoFpsRangesFor = new byte[4];
        java.lang.System.arraycopy(iv, 0, this.getInputSizeshNQ4ISI, 0, iv.length);
        java.lang.System.arraycopy(keyParameter.getKey(), 0, this.getInputFormats, 0, keyParameter.getKey().length);
        reset();
    }

    @Override // org.bouncycastle.crypto.StreamCipher
    public java.lang.String getAlgorithmName() {
        return "Grain-128";
    }

    private int getHighSpeedVideoFpsRangesFor() {
        int[] iArr = this.getHighSpeedVideoFpsRanges;
        int i = iArr[0];
        int i2 = iArr[1];
        int i3 = iArr[2];
        int i4 = iArr[3];
        return (((i4 << 12) | (i3 >>> 20)) & ((i3 >>> 4) | (i4 << 28))) ^ ((((((i >>> 27) | (i2 << 5)) & ((i2 >>> 27) | (i3 << 5))) ^ (((((((((i >>> 26) | (i2 << 6)) ^ i) ^ ((i2 >>> 24) | (i3 << 8))) ^ ((i3 >>> 27) | (i4 << 5))) ^ i4) ^ (((i >>> 3) | (i2 << 29)) & ((i3 >>> 3) | (i4 << 29)))) ^ (((i >>> 11) | (i2 << 21)) & ((i >>> 13) | (i2 << 19)))) ^ (((i >>> 17) | (i2 << 15)) & ((i >>> 18) | (i2 << 14))))) ^ (((i2 >>> 8) | (i3 << 24)) & ((i2 >>> 16) | (i3 << 16)))) ^ (((i2 >>> 29) | (i3 << 3)) & ((i3 >>> 1) | (i4 << 31))));
    }

    private int getHighSpeedVideoSizes() {
        int[] iArr = this.getHighSpeedVideoSizes;
        int i = iArr[0];
        int i2 = iArr[1];
        int i3 = iArr[2];
        int i4 = iArr[3];
        return i4 ^ ((((i ^ ((i >>> 7) | (i2 << 25))) ^ ((i2 >>> 6) | (i3 << 26))) ^ ((i3 >>> 6) | (i4 << 26))) ^ ((i3 >>> 17) | (i4 << 15)));
    }

    private int getHighResolutionOutputSizeshNQ4ISI() {
        int[] iArr = this.getHighSpeedVideoFpsRanges;
        int i = iArr[0];
        int i2 = iArr[1];
        int i3 = (i >>> 12) | (i2 << 20);
        int i4 = iArr[2];
        int i5 = iArr[3];
        int i6 = (i5 << 1) | (i4 >>> 31);
        int[] iArr2 = this.getHighSpeedVideoSizes;
        int i7 = iArr2[0];
        int i8 = iArr2[1];
        int i9 = iArr2[2];
        int i10 = iArr2[3];
        return ((i5 << 7) | (i4 >>> 25)) ^ ((((((((((((((i7 >>> 8) | (i8 << 24)) & i3) ^ (((i7 >>> 13) | (i8 << 19)) & ((i7 >>> 20) | (i8 << 12)))) ^ (((i8 >>> 10) | (i9 << 22)) & i6)) ^ (((i8 >>> 28) | (i9 << 4)) & ((i9 >>> 15) | (i10 << 17)))) ^ ((i6 & i3) & ((i10 << 1) | (i9 >>> 31)))) ^ ((i9 >>> 29) | (i10 << 3))) ^ ((i >>> 2) | (i2 << 30))) ^ ((i >>> 15) | (i2 << 17))) ^ ((i2 >>> 4) | (i4 << 28))) ^ ((i2 >>> 13) | (i4 << 19))) ^ i4) ^ ((i4 >>> 9) | (i5 << 23)));
    }
}
