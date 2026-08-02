package org.bouncycastle.crypto.engines;

/* loaded from: classes17.dex */
public class Grainv1Engine implements org.bouncycastle.crypto.StreamCipher {
    private int[] Camera2StreamConfigurationMap;
    private byte[] getHighResolutionOutputSizeshNQ4ISI;
    private int[] getHighSpeedVideoSizes;
    private int getInputFormats;
    private byte[] getOutputFormats;
    private byte[] getOutputMinFrameDuration;
    private int getHighSpeedVideoFpsRangesFor = 2;
    private boolean getHighSpeedVideoFpsRanges = false;

    private byte getHighSpeedVideoFpsRangesFor() {
        if (this.getHighSpeedVideoFpsRangesFor > 1) {
            int highSpeedVideoSizes = getHighSpeedVideoSizes();
            this.getInputFormats = highSpeedVideoSizes;
            byte[] bArr = this.getHighResolutionOutputSizeshNQ4ISI;
            bArr[0] = (byte) highSpeedVideoSizes;
            bArr[1] = (byte) (highSpeedVideoSizes >> 8);
            int[] iArr = this.Camera2StreamConfigurationMap;
            int Camera2StreamConfigurationMap = Camera2StreamConfigurationMap();
            int[] iArr2 = this.getHighSpeedVideoSizes;
            int i = Camera2StreamConfigurationMap ^ iArr2[0];
            iArr[0] = iArr[1];
            iArr[1] = iArr[2];
            iArr[2] = iArr[3];
            iArr[3] = iArr[4];
            iArr[4] = i;
            this.Camera2StreamConfigurationMap = iArr;
            int highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI();
            iArr2[0] = iArr2[1];
            iArr2[1] = iArr2[2];
            iArr2[2] = iArr2[3];
            iArr2[3] = iArr2[4];
            iArr2[4] = highResolutionOutputSizeshNQ4ISI;
            this.getHighSpeedVideoSizes = iArr2;
            this.getHighSpeedVideoFpsRangesFor = 0;
        }
        byte[] bArr2 = this.getHighResolutionOutputSizeshNQ4ISI;
        int i2 = this.getHighSpeedVideoFpsRangesFor;
        this.getHighSpeedVideoFpsRangesFor = i2 + 1;
        return bArr2[i2];
    }

    @Override // org.bouncycastle.crypto.StreamCipher
    public void reset() {
        this.getHighSpeedVideoFpsRangesFor = 2;
        byte[] bArr = this.getOutputFormats;
        byte[] bArr2 = this.getOutputMinFrameDuration;
        bArr2[8] = -1;
        bArr2[9] = -1;
        this.getOutputFormats = bArr;
        this.getOutputMinFrameDuration = bArr2;
        int i = 0;
        int i2 = 0;
        while (true) {
            int[] iArr = this.Camera2StreamConfigurationMap;
            if (i >= iArr.length) {
                break;
            }
            byte[] bArr3 = this.getOutputFormats;
            int i3 = i2 + 1;
            iArr[i] = ((bArr3[i2] & 255) | (bArr3[i3] << 8)) & 65535;
            int[] iArr2 = this.getHighSpeedVideoSizes;
            byte[] bArr4 = this.getOutputMinFrameDuration;
            iArr2[i] = ((bArr4[i2] & 255) | (bArr4[i3] << 8)) & 65535;
            i2 += 2;
            i++;
        }
        for (int i4 = 0; i4 < 10; i4++) {
            this.getInputFormats = getHighSpeedVideoSizes();
            int[] iArr3 = this.Camera2StreamConfigurationMap;
            int Camera2StreamConfigurationMap = Camera2StreamConfigurationMap();
            int[] iArr4 = this.getHighSpeedVideoSizes;
            int i5 = (Camera2StreamConfigurationMap ^ iArr4[0]) ^ this.getInputFormats;
            iArr3[0] = iArr3[1];
            iArr3[1] = iArr3[2];
            iArr3[2] = iArr3[3];
            iArr3[3] = iArr3[4];
            iArr3[4] = i5;
            this.Camera2StreamConfigurationMap = iArr3;
            int highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI() ^ this.getInputFormats;
            iArr4[0] = iArr4[1];
            iArr4[1] = iArr4[2];
            iArr4[2] = iArr4[3];
            iArr4[3] = iArr4[4];
            iArr4[4] = highResolutionOutputSizeshNQ4ISI;
            this.getHighSpeedVideoSizes = iArr4;
        }
        this.getHighSpeedVideoFpsRanges = true;
    }

    @Override // org.bouncycastle.crypto.StreamCipher
    public byte returnByte(byte b) {
        if (this.getHighSpeedVideoFpsRanges) {
            return (byte) (b ^ getHighSpeedVideoFpsRangesFor());
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(getAlgorithmName());
        sb.append(" not initialised");
        throw new java.lang.IllegalStateException(sb.toString());
    }

    @Override // org.bouncycastle.crypto.StreamCipher
    public int processBytes(byte[] bArr, int i, int i2, byte[] bArr2, int i3) throws org.bouncycastle.crypto.DataLengthException {
        if (!this.getHighSpeedVideoFpsRanges) {
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
            bArr2[i3 + i4] = (byte) (bArr[i + i4] ^ getHighSpeedVideoFpsRangesFor());
        }
        return i2;
    }

    @Override // org.bouncycastle.crypto.StreamCipher
    public void init(boolean z, org.bouncycastle.crypto.CipherParameters cipherParameters) throws java.lang.IllegalArgumentException {
        if (!(cipherParameters instanceof org.bouncycastle.crypto.params.ParametersWithIV)) {
            throw new java.lang.IllegalArgumentException("Grain v1 Init parameters must include an IV");
        }
        org.bouncycastle.crypto.params.ParametersWithIV parametersWithIV = (org.bouncycastle.crypto.params.ParametersWithIV) cipherParameters;
        byte[] iv = parametersWithIV.getIV();
        if (iv == null || iv.length != 8) {
            throw new java.lang.IllegalArgumentException("Grain v1 requires exactly 8 bytes of IV");
        }
        if (!(parametersWithIV.getParameters() instanceof org.bouncycastle.crypto.params.KeyParameter)) {
            throw new java.lang.IllegalArgumentException("Grain v1 Init parameters must include a key");
        }
        org.bouncycastle.crypto.params.KeyParameter keyParameter = (org.bouncycastle.crypto.params.KeyParameter) parametersWithIV.getParameters();
        this.getOutputMinFrameDuration = new byte[keyParameter.getKey().length];
        this.getOutputFormats = new byte[keyParameter.getKey().length];
        this.getHighSpeedVideoSizes = new int[5];
        this.Camera2StreamConfigurationMap = new int[5];
        this.getHighResolutionOutputSizeshNQ4ISI = new byte[2];
        java.lang.System.arraycopy(iv, 0, this.getOutputMinFrameDuration, 0, iv.length);
        java.lang.System.arraycopy(keyParameter.getKey(), 0, this.getOutputFormats, 0, keyParameter.getKey().length);
        reset();
    }

    @Override // org.bouncycastle.crypto.StreamCipher
    public java.lang.String getAlgorithmName() {
        return "Grain v1";
    }

    private int Camera2StreamConfigurationMap() {
        int[] iArr = this.Camera2StreamConfigurationMap;
        int i = iArr[0];
        int i2 = iArr[1];
        int i3 = (i >>> 9) | (i2 << 7);
        int i4 = (i >>> 15) | (i2 << 1);
        int i5 = iArr[2];
        int i6 = (i2 >>> 5) | (i5 << 11);
        int i7 = (i2 >>> 12) | (i5 << 4);
        int i8 = iArr[3];
        int i9 = (i5 >>> 1) | (i8 << 15);
        int i10 = (i5 >>> 5) | (i8 << 11);
        int i11 = (i5 >>> 13) | (i8 << 3);
        int i12 = iArr[4];
        int i13 = (i8 >>> 4) | (i12 << 12);
        int i14 = (i8 >>> 12) | (i12 << 4);
        int i15 = (i12 << 1) | (i8 >>> 15);
        int i16 = i15 & i14;
        int i17 = i14 & i13;
        int i18 = i9 & i7 & i6;
        return (((((((((((((((((((((((i12 << 2) | (i8 >>> 14)) ^ i14) ^ i13) ^ i11) ^ i10) ^ i9) ^ i7) ^ i6) ^ ((i2 << 2) | (i >>> 14))) ^ i3) ^ i) ^ i16) ^ (i10 & i9)) ^ (i4 & i3)) ^ (i17 & i11)) ^ i18) ^ (((i15 & i11) & i7) & i3)) ^ ((i17 & i10) & i9)) ^ ((i16 & i6) & i4)) ^ (((i16 & i13) & i11) & i10)) ^ ((i18 & i4) & i3)) ^ (((((i13 & i11) & i10) & i9) & i7) & i6)) & 65535;
    }

    private int getHighResolutionOutputSizeshNQ4ISI() {
        int[] iArr = this.getHighSpeedVideoSizes;
        int i = iArr[0];
        int i2 = iArr[1];
        int i3 = iArr[2];
        int i4 = iArr[3];
        int i5 = iArr[4];
        return ((((i5 << 13) | (i4 >>> 3)) ^ (((i ^ ((i >>> 13) | (i2 << 3))) ^ ((i2 >>> 7) | (i3 << 9))) ^ ((i3 >>> 6) | (i4 << 10)))) ^ ((i5 << 2) | (i4 >>> 14))) & 65535;
    }

    private int getHighSpeedVideoSizes() {
        int[] iArr = this.Camera2StreamConfigurationMap;
        int i = iArr[0];
        int i2 = iArr[1];
        int i3 = iArr[2];
        int i4 = iArr[3];
        int i5 = iArr[4];
        int i6 = (i5 << 1) | (i4 >>> 15);
        int[] iArr2 = this.getHighSpeedVideoSizes;
        int i7 = iArr2[0];
        int i8 = iArr2[1];
        int i9 = (i7 >>> 3) | (i8 << 13);
        int i10 = iArr2[2];
        int i11 = (i8 >>> 9) | (i10 << 7);
        int i12 = (iArr2[3] << 2) | (i10 >>> 14);
        int i13 = iArr2[4];
        int i14 = i12 & i13;
        int i15 = i9 & i12;
        int i16 = i14 ^ ((i11 ^ i6) ^ (i9 & i13));
        return (((i5 << 8) | (i4 >>> 8)) ^ (((((((((((((i9 & i11) & i12) ^ ((i13 & i6) ^ i16)) ^ (i15 & i13)) ^ (i15 & i6)) ^ ((i11 & i12) & i6)) ^ (i6 & i14)) ^ ((i >>> 1) | (i2 << 15))) ^ ((i >>> 2) | (i2 << 14))) ^ ((i >>> 4) | (i2 << 12))) ^ ((i >>> 10) | (i2 << 6))) ^ ((i2 >>> 15) | (i3 << 1))) ^ ((i3 >>> 11) | (i4 << 5)))) & 65535;
    }
}
