package org.bouncycastle.crypto.macs;

/* loaded from: classes17.dex */
public class VMPCMac implements org.bouncycastle.crypto.Mac {
    private byte[] Camera2StreamConfigurationMap;
    private byte getHighSpeedVideoSizes;
    private byte getHighSpeedVideoSizesFor;
    private byte getInputFormats;
    private byte[] getInputSizeshNQ4ISI;
    private byte getOutputFormats;
    private byte[] getOutputMinFrameDuration;
    private byte getOutputSizes;
    private byte getHighSpeedVideoFpsRangesFor = 0;
    private byte[] getHighResolutionOutputSizeshNQ4ISI = null;
    private byte getHighSpeedVideoFpsRanges = 0;

    @Override // org.bouncycastle.crypto.Mac
    public int getMacSize() {
        return 20;
    }

    @Override // org.bouncycastle.crypto.Mac
    public void reset() {
        byte[] bArr = this.getInputSizeshNQ4ISI;
        byte[] bArr2 = this.getOutputMinFrameDuration;
        this.getHighSpeedVideoFpsRanges = (byte) 0;
        this.getHighResolutionOutputSizeshNQ4ISI = new byte[256];
        for (int i = 0; i < 256; i++) {
            this.getHighResolutionOutputSizeshNQ4ISI[i] = (byte) i;
        }
        for (int i2 = 0; i2 < 768; i2++) {
            byte[] bArr3 = this.getHighResolutionOutputSizeshNQ4ISI;
            byte b = this.getHighSpeedVideoFpsRanges;
            int i3 = i2 & 255;
            byte b2 = bArr3[i3];
            byte b3 = bArr3[(b + b2 + bArr[i2 % bArr.length]) & 255];
            this.getHighSpeedVideoFpsRanges = b3;
            int i4 = b3 & 255;
            bArr3[i3] = bArr3[i4];
            bArr3[i4] = b2;
        }
        for (int i5 = 0; i5 < 768; i5++) {
            byte[] bArr4 = this.getHighResolutionOutputSizeshNQ4ISI;
            byte b4 = this.getHighSpeedVideoFpsRanges;
            int i6 = i5 & 255;
            byte b5 = bArr4[i6];
            byte b6 = bArr4[(b4 + b5 + bArr2[i5 % bArr2.length]) & 255];
            this.getHighSpeedVideoFpsRanges = b6;
            int i7 = b6 & 255;
            bArr4[i6] = bArr4[i7];
            bArr4[i7] = b5;
        }
        this.getHighSpeedVideoFpsRangesFor = (byte) 0;
        this.getOutputSizes = (byte) 0;
        this.getInputFormats = (byte) 0;
        this.getHighSpeedVideoSizesFor = (byte) 0;
        this.getOutputFormats = (byte) 0;
        this.getHighSpeedVideoSizes = (byte) 0;
        this.Camera2StreamConfigurationMap = new byte[32];
        for (int i8 = 0; i8 < 32; i8++) {
            this.Camera2StreamConfigurationMap[i8] = 0;
        }
    }

    @Override // org.bouncycastle.crypto.Mac
    public void update(byte[] bArr, int i, int i2) throws org.bouncycastle.crypto.DataLengthException, java.lang.IllegalStateException {
        if (i + i2 > bArr.length) {
            throw new org.bouncycastle.crypto.DataLengthException("input buffer too short");
        }
        for (int i3 = 0; i3 < i2; i3++) {
            update(bArr[i + i3]);
        }
    }

    @Override // org.bouncycastle.crypto.Mac
    public void update(byte b) throws java.lang.IllegalStateException {
        byte[] bArr = this.getHighResolutionOutputSizeshNQ4ISI;
        byte b2 = this.getHighSpeedVideoFpsRanges;
        byte b3 = this.getHighSpeedVideoFpsRangesFor;
        int i = b3 & 255;
        byte b4 = bArr[(b2 + bArr[i]) & 255];
        this.getHighSpeedVideoFpsRanges = b4;
        int i2 = b4 & 255;
        byte b5 = (byte) (b ^ bArr[(bArr[bArr[i2] & 255] + 1) & 255]);
        byte b6 = this.getOutputSizes;
        byte b7 = this.getInputFormats;
        byte b8 = bArr[(b6 + b7) & 255];
        this.getOutputSizes = b8;
        byte b9 = this.getHighSpeedVideoSizesFor;
        byte b10 = bArr[(b7 + b9) & 255];
        this.getInputFormats = b10;
        byte b11 = this.getOutputFormats;
        byte b12 = bArr[(b9 + b11) & 255];
        this.getHighSpeedVideoSizesFor = b12;
        byte b13 = bArr[(b11 + b4 + b5) & 255];
        this.getOutputFormats = b13;
        byte[] bArr2 = this.Camera2StreamConfigurationMap;
        byte b14 = this.getHighSpeedVideoSizes;
        int i3 = b14 & com.google.common.base.Ascii.US;
        bArr2[i3] = (byte) (b13 ^ bArr2[i3]);
        int i4 = (b14 + 1) & 31;
        bArr2[i4] = (byte) (b12 ^ bArr2[i4]);
        int i5 = (b14 + 2) & 31;
        bArr2[i5] = (byte) (b10 ^ bArr2[i5]);
        int i6 = (b14 + 3) & 31;
        bArr2[i6] = (byte) (b8 ^ bArr2[i6]);
        this.getHighSpeedVideoSizes = (byte) ((b14 + 4) & 31);
        byte b15 = bArr[i];
        bArr[i] = bArr[i2];
        bArr[i2] = b15;
        this.getHighSpeedVideoFpsRangesFor = (byte) ((b3 + 1) & 255);
    }

    @Override // org.bouncycastle.crypto.Mac
    public void init(org.bouncycastle.crypto.CipherParameters cipherParameters) throws java.lang.IllegalArgumentException {
        if (!(cipherParameters instanceof org.bouncycastle.crypto.params.ParametersWithIV)) {
            throw new java.lang.IllegalArgumentException("VMPC-MAC Init parameters must include an IV");
        }
        org.bouncycastle.crypto.params.ParametersWithIV parametersWithIV = (org.bouncycastle.crypto.params.ParametersWithIV) cipherParameters;
        org.bouncycastle.crypto.params.KeyParameter keyParameter = (org.bouncycastle.crypto.params.KeyParameter) parametersWithIV.getParameters();
        if (!(parametersWithIV.getParameters() instanceof org.bouncycastle.crypto.params.KeyParameter)) {
            throw new java.lang.IllegalArgumentException("VMPC-MAC Init parameters must include a key");
        }
        byte[] iv = parametersWithIV.getIV();
        this.getOutputMinFrameDuration = iv;
        if (iv == null || iv.length <= 0 || iv.length > 768) {
            throw new java.lang.IllegalArgumentException("VMPC-MAC requires 1 to 768 bytes of IV");
        }
        this.getInputSizeshNQ4ISI = keyParameter.getKey();
        reset();
    }

    @Override // org.bouncycastle.crypto.Mac
    public java.lang.String getAlgorithmName() {
        return "VMPC-MAC";
    }

    @Override // org.bouncycastle.crypto.Mac
    public int doFinal(byte[] bArr, int i) throws org.bouncycastle.crypto.DataLengthException, java.lang.IllegalStateException {
        for (int i2 = 1; i2 < 25; i2++) {
            byte[] bArr2 = this.getHighResolutionOutputSizeshNQ4ISI;
            byte b = this.getHighSpeedVideoFpsRanges;
            byte b2 = this.getHighSpeedVideoFpsRangesFor;
            int i3 = b2 & 255;
            byte b3 = bArr2[(b + bArr2[i3]) & 255];
            this.getHighSpeedVideoFpsRanges = b3;
            byte b4 = this.getOutputSizes;
            byte b5 = this.getInputFormats;
            byte b6 = bArr2[(b4 + b5 + i2) & 255];
            this.getOutputSizes = b6;
            byte b7 = this.getHighSpeedVideoSizesFor;
            byte b8 = bArr2[(b5 + b7 + i2) & 255];
            this.getInputFormats = b8;
            byte b9 = this.getOutputFormats;
            byte b10 = bArr2[(b7 + b9 + i2) & 255];
            this.getHighSpeedVideoSizesFor = b10;
            byte b11 = bArr2[(b9 + b3 + i2) & 255];
            this.getOutputFormats = b11;
            byte[] bArr3 = this.Camera2StreamConfigurationMap;
            byte b12 = this.getHighSpeedVideoSizes;
            int i4 = b12 & com.google.common.base.Ascii.US;
            bArr3[i4] = (byte) (b11 ^ bArr3[i4]);
            int i5 = (b12 + 1) & 31;
            bArr3[i5] = (byte) (b10 ^ bArr3[i5]);
            int i6 = (b12 + 2) & 31;
            bArr3[i6] = (byte) (b8 ^ bArr3[i6]);
            int i7 = (b12 + 3) & 31;
            bArr3[i7] = (byte) (b6 ^ bArr3[i7]);
            this.getHighSpeedVideoSizes = (byte) ((b12 + 4) & 31);
            byte b13 = bArr2[i3];
            int i8 = b3 & 255;
            bArr2[i3] = bArr2[i8];
            bArr2[i8] = b13;
            this.getHighSpeedVideoFpsRangesFor = (byte) ((b2 + 1) & 255);
        }
        for (int i9 = 0; i9 < 768; i9++) {
            byte[] bArr4 = this.getHighResolutionOutputSizeshNQ4ISI;
            byte b14 = this.getHighSpeedVideoFpsRanges;
            int i10 = i9 & 255;
            byte b15 = bArr4[i10];
            byte b16 = bArr4[(b14 + b15 + this.Camera2StreamConfigurationMap[i9 & 31]) & 255];
            this.getHighSpeedVideoFpsRanges = b16;
            int i11 = b16 & 255;
            bArr4[i10] = bArr4[i11];
            bArr4[i11] = b15;
        }
        byte[] bArr5 = new byte[20];
        for (int i12 = 0; i12 < 20; i12++) {
            byte[] bArr6 = this.getHighResolutionOutputSizeshNQ4ISI;
            int i13 = i12 & 255;
            byte b17 = bArr6[(this.getHighSpeedVideoFpsRanges + bArr6[i13]) & 255];
            this.getHighSpeedVideoFpsRanges = b17;
            int i14 = b17 & 255;
            bArr5[i12] = bArr6[(bArr6[bArr6[i14] & 255] + 1) & 255];
            byte b18 = bArr6[i13];
            bArr6[i13] = bArr6[i14];
            bArr6[i14] = b18;
        }
        java.lang.System.arraycopy(bArr5, 0, bArr, i, 20);
        reset();
        return 20;
    }
}
