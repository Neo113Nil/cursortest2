package org.bouncycastle.crypto.modes;

/* loaded from: classes17.dex */
public class EAXBlockCipher implements org.bouncycastle.crypto.modes.AEADBlockCipher {
    private byte[] Camera2StreamConfigurationMap;
    private byte[] getHighResolutionOutputSizeshNQ4ISI;
    private int getHighSpeedVideoFpsRanges;
    private org.bouncycastle.crypto.modes.SICBlockCipher getHighSpeedVideoFpsRangesFor;
    private int getHighSpeedVideoSizes;
    private org.bouncycastle.crypto.Mac getHighSpeedVideoSizesFor;
    private boolean getInputFormats;
    private byte[] getInputSizeshNQ4ISI;
    private byte[] getOutputFormats;
    private boolean getOutputMinFrameDuration;
    private byte[] getOutputSizeshNQ4ISI;
    private int getOutputStallDurationlomOqCM;

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public int doFinal(byte[] bArr, int i) throws java.lang.IllegalStateException, org.bouncycastle.crypto.InvalidCipherTextException {
        Camera2StreamConfigurationMap();
        int i2 = this.getHighSpeedVideoFpsRanges;
        byte[] bArr2 = this.getHighResolutionOutputSizeshNQ4ISI;
        byte[] bArr3 = new byte[bArr2.length];
        this.getHighSpeedVideoFpsRanges = 0;
        if (this.getOutputMinFrameDuration) {
            int i3 = i + i2;
            if (bArr.length < this.getOutputStallDurationlomOqCM + i3) {
                throw new org.bouncycastle.crypto.OutputLengthException("Output buffer too short");
            }
            this.getHighSpeedVideoFpsRangesFor.processBlock(bArr2, 0, bArr3, 0);
            java.lang.System.arraycopy(bArr3, 0, bArr, i, i2);
            this.getHighSpeedVideoSizesFor.update(bArr3, 0, i2);
            getHighSpeedVideoSizes();
            java.lang.System.arraycopy(this.getOutputFormats, 0, bArr, i3, this.getOutputStallDurationlomOqCM);
            getHighSpeedVideoFpsRangesFor(false);
            return i2 + this.getOutputStallDurationlomOqCM;
        }
        int i4 = this.getOutputStallDurationlomOqCM;
        if (i2 < i4) {
            throw new org.bouncycastle.crypto.InvalidCipherTextException("data too short");
        }
        if (bArr.length < (i + i2) - i4) {
            throw new org.bouncycastle.crypto.OutputLengthException("Output buffer too short");
        }
        if (i2 > i4) {
            this.getHighSpeedVideoSizesFor.update(bArr2, 0, i2 - i4);
            this.getHighSpeedVideoFpsRangesFor.processBlock(this.getHighResolutionOutputSizeshNQ4ISI, 0, bArr3, 0);
            java.lang.System.arraycopy(bArr3, 0, bArr, i, i2 - this.getOutputStallDurationlomOqCM);
        }
        getHighSpeedVideoSizes();
        byte[] bArr4 = this.getHighResolutionOutputSizeshNQ4ISI;
        int i5 = i2 - this.getOutputStallDurationlomOqCM;
        int i6 = 0;
        for (int i7 = 0; i7 < this.getOutputStallDurationlomOqCM; i7++) {
            i6 |= this.getOutputFormats[i7] ^ bArr4[i5 + i7];
        }
        if (i6 != 0) {
            throw new org.bouncycastle.crypto.InvalidCipherTextException("mac check in EAX failed");
        }
        getHighSpeedVideoFpsRangesFor(false);
        return i2 - this.getOutputStallDurationlomOqCM;
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public void reset() {
        getHighSpeedVideoFpsRangesFor(true);
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public int processBytes(byte[] bArr, int i, int i2, byte[] bArr2, int i3) throws org.bouncycastle.crypto.DataLengthException {
        Camera2StreamConfigurationMap();
        if (bArr.length < i + i2) {
            throw new org.bouncycastle.crypto.DataLengthException("Input buffer too short");
        }
        int i4 = 0;
        for (int i5 = 0; i5 != i2; i5++) {
            i4 += getHighSpeedVideoSizes(bArr[i + i5], bArr2, i3 + i4);
        }
        return i4;
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public int processByte(byte b, byte[] bArr, int i) throws org.bouncycastle.crypto.DataLengthException {
        Camera2StreamConfigurationMap();
        return getHighSpeedVideoSizes(b, bArr, i);
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public void processAADBytes(byte[] bArr, int i, int i2) {
        if (this.getInputFormats) {
            throw new java.lang.IllegalStateException("AAD data cannot be added after encryption/decryption processing has begun.");
        }
        this.getHighSpeedVideoSizesFor.update(bArr, i, i2);
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public void processAADByte(byte b) {
        if (this.getInputFormats) {
            throw new java.lang.IllegalStateException("AAD data cannot be added after encryption/decryption processing has begun.");
        }
        this.getHighSpeedVideoSizesFor.update(b);
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public void init(boolean z, org.bouncycastle.crypto.CipherParameters cipherParameters) throws java.lang.IllegalArgumentException {
        byte[] iv;
        org.bouncycastle.crypto.CipherParameters parameters;
        this.getOutputMinFrameDuration = z;
        if (cipherParameters instanceof org.bouncycastle.crypto.params.AEADParameters) {
            org.bouncycastle.crypto.params.AEADParameters aEADParameters = (org.bouncycastle.crypto.params.AEADParameters) cipherParameters;
            iv = aEADParameters.getNonce();
            this.getInputSizeshNQ4ISI = aEADParameters.getAssociatedText();
            this.getOutputStallDurationlomOqCM = aEADParameters.getMacSize() / 8;
            parameters = aEADParameters.getKey();
        } else {
            if (!(cipherParameters instanceof org.bouncycastle.crypto.params.ParametersWithIV)) {
                throw new java.lang.IllegalArgumentException("invalid parameters passed to EAX");
            }
            org.bouncycastle.crypto.params.ParametersWithIV parametersWithIV = (org.bouncycastle.crypto.params.ParametersWithIV) cipherParameters;
            iv = parametersWithIV.getIV();
            this.getInputSizeshNQ4ISI = null;
            this.getOutputStallDurationlomOqCM = this.getHighSpeedVideoSizesFor.getMacSize() / 2;
            parameters = parametersWithIV.getParameters();
        }
        this.getHighResolutionOutputSizeshNQ4ISI = new byte[z ? this.getHighSpeedVideoSizes : this.getHighSpeedVideoSizes + this.getOutputStallDurationlomOqCM];
        byte[] bArr = new byte[this.getHighSpeedVideoSizes];
        this.getHighSpeedVideoSizesFor.init(parameters);
        int i = this.getHighSpeedVideoSizes;
        bArr[i - 1] = 0;
        this.getHighSpeedVideoSizesFor.update(bArr, 0, i);
        this.getHighSpeedVideoSizesFor.update(iv, 0, iv.length);
        this.getHighSpeedVideoSizesFor.doFinal(this.getOutputSizeshNQ4ISI, 0);
        this.getHighSpeedVideoFpsRangesFor.init(true, new org.bouncycastle.crypto.params.ParametersWithIV(null, this.getOutputSizeshNQ4ISI));
        reset();
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public int getUpdateOutputSize(int i) {
        int i2 = i + this.getHighSpeedVideoFpsRanges;
        if (!this.getOutputMinFrameDuration) {
            int i3 = this.getOutputStallDurationlomOqCM;
            if (i2 < i3) {
                return 0;
            }
            i2 -= i3;
        }
        return i2 - (i2 % this.getHighSpeedVideoSizes);
    }

    @Override // org.bouncycastle.crypto.modes.AEADBlockCipher
    public org.bouncycastle.crypto.BlockCipher getUnderlyingCipher() {
        return this.getHighSpeedVideoFpsRangesFor.getUnderlyingCipher();
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public int getOutputSize(int i) {
        int i2 = i + this.getHighSpeedVideoFpsRanges;
        if (this.getOutputMinFrameDuration) {
            return i2 + this.getOutputStallDurationlomOqCM;
        }
        int i3 = this.getOutputStallDurationlomOqCM;
        if (i2 < i3) {
            return 0;
        }
        return i2 - i3;
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public byte[] getMac() {
        int i = this.getOutputStallDurationlomOqCM;
        byte[] bArr = new byte[i];
        java.lang.System.arraycopy(this.getOutputFormats, 0, bArr, 0, i);
        return bArr;
    }

    public int getBlockSize() {
        return this.getHighSpeedVideoFpsRangesFor.getBlockSize();
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public java.lang.String getAlgorithmName() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(this.getHighSpeedVideoFpsRangesFor.getUnderlyingCipher().getAlgorithmName());
        sb.append("/EAX");
        return sb.toString();
    }

    private void getHighSpeedVideoFpsRangesFor(boolean z) {
        this.getHighSpeedVideoFpsRangesFor.reset();
        this.getHighSpeedVideoSizesFor.reset();
        this.getHighSpeedVideoFpsRanges = 0;
        org.bouncycastle.util.Arrays.fill(this.getHighResolutionOutputSizeshNQ4ISI, (byte) 0);
        if (z) {
            org.bouncycastle.util.Arrays.fill(this.getOutputFormats, (byte) 0);
        }
        int i = this.getHighSpeedVideoSizes;
        byte[] bArr = new byte[i];
        bArr[i - 1] = 1;
        this.getHighSpeedVideoSizesFor.update(bArr, 0, i);
        this.getInputFormats = false;
        byte[] bArr2 = this.getInputSizeshNQ4ISI;
        if (bArr2 != null) {
            processAADBytes(bArr2, 0, bArr2.length);
        }
    }

    private int getHighSpeedVideoSizes(byte b, byte[] bArr, int i) {
        int processBlock;
        byte[] bArr2 = this.getHighResolutionOutputSizeshNQ4ISI;
        int i2 = this.getHighSpeedVideoFpsRanges;
        int i3 = i2 + 1;
        this.getHighSpeedVideoFpsRanges = i3;
        bArr2[i2] = b;
        if (i3 != bArr2.length) {
            return 0;
        }
        int length = bArr.length;
        int i4 = this.getHighSpeedVideoSizes;
        if (length < i + i4) {
            throw new org.bouncycastle.crypto.OutputLengthException("Output buffer is too short");
        }
        if (this.getOutputMinFrameDuration) {
            processBlock = this.getHighSpeedVideoFpsRangesFor.processBlock(bArr2, 0, bArr, i);
            this.getHighSpeedVideoSizesFor.update(bArr, i, this.getHighSpeedVideoSizes);
        } else {
            this.getHighSpeedVideoSizesFor.update(bArr2, 0, i4);
            processBlock = this.getHighSpeedVideoFpsRangesFor.processBlock(this.getHighResolutionOutputSizeshNQ4ISI, 0, bArr, i);
        }
        this.getHighSpeedVideoFpsRanges = 0;
        if (!this.getOutputMinFrameDuration) {
            byte[] bArr3 = this.getHighResolutionOutputSizeshNQ4ISI;
            java.lang.System.arraycopy(bArr3, this.getHighSpeedVideoSizes, bArr3, 0, this.getOutputStallDurationlomOqCM);
            this.getHighSpeedVideoFpsRanges = this.getOutputStallDurationlomOqCM;
        }
        return processBlock;
    }

    private void Camera2StreamConfigurationMap() {
        if (this.getInputFormats) {
            return;
        }
        this.getInputFormats = true;
        this.getHighSpeedVideoSizesFor.doFinal(this.Camera2StreamConfigurationMap, 0);
        int i = this.getHighSpeedVideoSizes;
        byte[] bArr = new byte[i];
        bArr[i - 1] = 2;
        this.getHighSpeedVideoSizesFor.update(bArr, 0, i);
    }

    private void getHighSpeedVideoSizes() {
        byte[] bArr = new byte[this.getHighSpeedVideoSizes];
        int i = 0;
        this.getHighSpeedVideoSizesFor.doFinal(bArr, 0);
        while (true) {
            byte[] bArr2 = this.getOutputFormats;
            if (i >= bArr2.length) {
                return;
            }
            bArr2[i] = (byte) ((this.getOutputSizeshNQ4ISI[i] ^ this.Camera2StreamConfigurationMap[i]) ^ bArr[i]);
            i++;
        }
    }

    public EAXBlockCipher(org.bouncycastle.crypto.BlockCipher blockCipher) {
        this.getHighSpeedVideoSizes = blockCipher.getBlockSize();
        org.bouncycastle.crypto.macs.CMac cMac = new org.bouncycastle.crypto.macs.CMac(blockCipher);
        this.getHighSpeedVideoSizesFor = cMac;
        this.getOutputFormats = new byte[this.getHighSpeedVideoSizes];
        this.Camera2StreamConfigurationMap = new byte[cMac.getMacSize()];
        this.getOutputSizeshNQ4ISI = new byte[this.getHighSpeedVideoSizesFor.getMacSize()];
        this.getHighSpeedVideoFpsRangesFor = new org.bouncycastle.crypto.modes.SICBlockCipher(blockCipher);
    }
}
