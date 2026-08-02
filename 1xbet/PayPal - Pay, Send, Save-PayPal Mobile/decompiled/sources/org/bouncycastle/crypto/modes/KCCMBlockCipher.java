package org.bouncycastle.crypto.modes;

/* loaded from: classes17.dex */
public class KCCMBlockCipher implements org.bouncycastle.crypto.modes.AEADBlockCipher {
    private byte[] Camera2StreamConfigurationMap;
    private byte[] getHighResolutionOutputSizeshNQ4ISI;
    private org.bouncycastle.crypto.modes.KCCMBlockCipher.ExposedByteArrayOutputStream getHighSpeedVideoFpsRanges;
    private int getHighSpeedVideoFpsRangesFor;
    private byte[] getHighSpeedVideoSizes;
    private org.bouncycastle.crypto.BlockCipher getHighSpeedVideoSizesFor;
    private org.bouncycastle.crypto.modes.KCCMBlockCipher.ExposedByteArrayOutputStream getInputFormats;
    private byte[] getInputSizeshNQ4ISI;
    private boolean getOutputFormats;
    private byte[] getOutputMinFrameDuration;
    private int getOutputSizes;
    private byte[] getOutputSizeshNQ4ISI;
    private byte[] getOutputStallDuration;
    private byte[] getOutputStallDurationlomOqCM;

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public int getUpdateOutputSize(int i) {
        return i;
    }

    public KCCMBlockCipher(org.bouncycastle.crypto.BlockCipher blockCipher, int i) {
        this.getHighSpeedVideoFpsRanges = new org.bouncycastle.crypto.modes.KCCMBlockCipher.ExposedByteArrayOutputStream();
        this.getInputFormats = new org.bouncycastle.crypto.modes.KCCMBlockCipher.ExposedByteArrayOutputStream();
        this.getHighSpeedVideoFpsRangesFor = 4;
        this.getHighSpeedVideoSizesFor = blockCipher;
        this.getOutputSizes = blockCipher.getBlockSize();
        this.getOutputStallDuration = new byte[blockCipher.getBlockSize()];
        this.getInputSizeshNQ4ISI = new byte[blockCipher.getBlockSize()];
        this.getOutputMinFrameDuration = new byte[blockCipher.getBlockSize()];
        this.getOutputSizeshNQ4ISI = new byte[blockCipher.getBlockSize()];
        this.getHighResolutionOutputSizeshNQ4ISI = new byte[blockCipher.getBlockSize()];
        this.Camera2StreamConfigurationMap = new byte[blockCipher.getBlockSize()];
        this.getOutputStallDurationlomOqCM = new byte[blockCipher.getBlockSize()];
        this.getHighSpeedVideoSizes = new byte[blockCipher.getBlockSize()];
        if (i != 4 && i != 6 && i != 8) {
            throw new java.lang.IllegalArgumentException("Nb = 4 is recommended by DSTU7624 but can be changed to only 6 or 8 in this implementation");
        }
        this.getHighSpeedVideoFpsRangesFor = i;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0085 A[LOOP:0: B:18:0x007f->B:20:0x0085, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00fe  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void Camera2StreamConfigurationMap(byte[] bArr, int i, int i2, int i3) {
        java.lang.String str;
        java.lang.String binaryString;
        if (i2 < this.getHighSpeedVideoSizesFor.getBlockSize()) {
            throw new java.lang.IllegalArgumentException("authText buffer too short");
        }
        if (i2 % this.getHighSpeedVideoSizesFor.getBlockSize() != 0) {
            throw new java.lang.IllegalArgumentException("padding not supported");
        }
        byte[] bArr2 = this.getOutputStallDuration;
        java.lang.System.arraycopy(bArr2, 0, this.getHighResolutionOutputSizeshNQ4ISI, 0, (bArr2.length - this.getHighSpeedVideoFpsRangesFor) - 1);
        byte[] bArr3 = this.Camera2StreamConfigurationMap;
        bArr3[3] = (byte) (i3 >> 24);
        bArr3[2] = (byte) (i3 >> 16);
        bArr3[1] = (byte) (i3 >> 8);
        bArr3[0] = (byte) i3;
        java.lang.System.arraycopy(bArr3, 0, this.getHighResolutionOutputSizeshNQ4ISI, (this.getOutputStallDuration.length - this.getHighSpeedVideoFpsRangesFor) - 1, 4);
        byte[] bArr4 = this.getHighResolutionOutputSizeshNQ4ISI;
        int length = bArr4.length - 1;
        int i4 = this.getOutputSizes;
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append("1");
        if (i4 == 8) {
            str = "010";
        } else if (i4 == 16) {
            str = "011";
        } else if (i4 == 32) {
            str = "100";
        } else {
            if (i4 != 48) {
                if (i4 == 64) {
                    str = "110";
                }
                binaryString = java.lang.Integer.toBinaryString(this.getHighSpeedVideoFpsRangesFor - 1);
                while (binaryString.length() < 4) {
                    binaryString = new java.lang.StringBuffer(binaryString).insert(0, "0").toString();
                }
                stringBuffer.append(binaryString);
                bArr4[length] = (byte) java.lang.Integer.parseInt(stringBuffer.toString(), 2);
                this.getHighSpeedVideoSizesFor.processBlock(this.getHighResolutionOutputSizeshNQ4ISI, 0, this.getOutputSizeshNQ4ISI, 0);
                byte[] bArr5 = this.Camera2StreamConfigurationMap;
                bArr5[3] = (byte) (i2 >> 24);
                bArr5[2] = (byte) (i2 >> 16);
                bArr5[1] = (byte) (i2 >> 8);
                bArr5[0] = (byte) i2;
                if (i2 > this.getHighSpeedVideoSizesFor.getBlockSize() - this.getHighSpeedVideoFpsRangesFor) {
                    for (int i5 = 0; i5 < i2; i5++) {
                        byte[] bArr6 = this.Camera2StreamConfigurationMap;
                        int i6 = this.getHighSpeedVideoFpsRangesFor + i5;
                        bArr6[i6] = (byte) (bArr6[i6] ^ bArr[i5]);
                    }
                    for (int i7 = 0; i7 < this.getHighSpeedVideoSizesFor.getBlockSize(); i7++) {
                        byte[] bArr7 = this.getOutputSizeshNQ4ISI;
                        bArr7[i7] = (byte) (bArr7[i7] ^ this.Camera2StreamConfigurationMap[i7]);
                    }
                    org.bouncycastle.crypto.BlockCipher blockCipher = this.getHighSpeedVideoSizesFor;
                    byte[] bArr8 = this.getOutputSizeshNQ4ISI;
                    blockCipher.processBlock(bArr8, 0, bArr8, 0);
                    return;
                }
                for (int i8 = 0; i8 < this.getHighSpeedVideoSizesFor.getBlockSize(); i8++) {
                    byte[] bArr9 = this.getOutputSizeshNQ4ISI;
                    bArr9[i8] = (byte) (bArr9[i8] ^ this.Camera2StreamConfigurationMap[i8]);
                }
                org.bouncycastle.crypto.BlockCipher blockCipher2 = this.getHighSpeedVideoSizesFor;
                byte[] bArr10 = this.getOutputSizeshNQ4ISI;
                blockCipher2.processBlock(bArr10, 0, bArr10, 0);
                while (i2 != 0) {
                    for (int i9 = 0; i9 < this.getHighSpeedVideoSizesFor.getBlockSize(); i9++) {
                        byte[] bArr11 = this.getOutputSizeshNQ4ISI;
                        bArr11[i9] = (byte) (bArr11[i9] ^ bArr[i9 + i]);
                    }
                    org.bouncycastle.crypto.BlockCipher blockCipher3 = this.getHighSpeedVideoSizesFor;
                    byte[] bArr12 = this.getOutputSizeshNQ4ISI;
                    blockCipher3.processBlock(bArr12, 0, bArr12, 0);
                    i += this.getHighSpeedVideoSizesFor.getBlockSize();
                    i2 -= this.getHighSpeedVideoSizesFor.getBlockSize();
                }
                return;
            }
            str = "101";
        }
        stringBuffer.append(str);
        binaryString = java.lang.Integer.toBinaryString(this.getHighSpeedVideoFpsRangesFor - 1);
        while (binaryString.length() < 4) {
        }
        stringBuffer.append(binaryString);
        bArr4[length] = (byte) java.lang.Integer.parseInt(stringBuffer.toString(), 2);
        this.getHighSpeedVideoSizesFor.processBlock(this.getHighResolutionOutputSizeshNQ4ISI, 0, this.getOutputSizeshNQ4ISI, 0);
        byte[] bArr52 = this.Camera2StreamConfigurationMap;
        bArr52[3] = (byte) (i2 >> 24);
        bArr52[2] = (byte) (i2 >> 16);
        bArr52[1] = (byte) (i2 >> 8);
        bArr52[0] = (byte) i2;
        if (i2 > this.getHighSpeedVideoSizesFor.getBlockSize() - this.getHighSpeedVideoFpsRangesFor) {
        }
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public void reset() {
        org.bouncycastle.util.Arrays.fill(this.getHighResolutionOutputSizeshNQ4ISI, (byte) 0);
        org.bouncycastle.util.Arrays.fill(this.Camera2StreamConfigurationMap, (byte) 0);
        org.bouncycastle.util.Arrays.fill(this.getHighSpeedVideoSizes, (byte) 0);
        org.bouncycastle.util.Arrays.fill(this.getOutputSizeshNQ4ISI, (byte) 0);
        this.getHighSpeedVideoSizes[0] = 1;
        this.getInputFormats.reset();
        this.getHighSpeedVideoFpsRanges.reset();
        byte[] bArr = this.getInputSizeshNQ4ISI;
        if (bArr != null) {
            processAADBytes(bArr, 0, bArr.length);
        }
    }

    public int processPacket(byte[] bArr, int i, int i2, byte[] bArr2, int i3) throws java.lang.IllegalStateException, org.bouncycastle.crypto.InvalidCipherTextException {
        int i4;
        if (bArr.length - i < i2) {
            throw new org.bouncycastle.crypto.DataLengthException("input buffer too short");
        }
        if (bArr2.length - i3 < i2) {
            throw new org.bouncycastle.crypto.OutputLengthException("output buffer too short");
        }
        if (this.getHighSpeedVideoFpsRanges.size() > 0) {
            if (this.getOutputFormats) {
                Camera2StreamConfigurationMap(this.getHighSpeedVideoFpsRanges.Camera2StreamConfigurationMap(), 0, this.getHighSpeedVideoFpsRanges.size(), this.getInputFormats.size());
            } else {
                Camera2StreamConfigurationMap(this.getHighSpeedVideoFpsRanges.Camera2StreamConfigurationMap(), 0, this.getHighSpeedVideoFpsRanges.size(), this.getInputFormats.size() - this.getOutputSizes);
            }
        }
        if (!this.getOutputFormats) {
            if ((i2 - this.getOutputSizes) % this.getHighSpeedVideoSizesFor.getBlockSize() != 0) {
                throw new org.bouncycastle.crypto.DataLengthException("partial blocks not supported");
            }
            this.getHighSpeedVideoSizesFor.processBlock(this.getOutputStallDuration, 0, this.getOutputStallDurationlomOqCM, 0);
            int blockSize = i2 / this.getHighSpeedVideoSizesFor.getBlockSize();
            for (int i5 = 0; i5 < blockSize; i5++) {
                getHighResolutionOutputSizeshNQ4ISI(bArr, i, bArr2, i3);
                i += this.getHighSpeedVideoSizesFor.getBlockSize();
                i3 += this.getHighSpeedVideoSizesFor.getBlockSize();
            }
            if (i2 > i) {
                int i6 = 0;
                while (true) {
                    byte[] bArr3 = this.getHighSpeedVideoSizes;
                    if (i6 >= bArr3.length) {
                        break;
                    }
                    byte[] bArr4 = this.getOutputStallDurationlomOqCM;
                    bArr4[i6] = (byte) (bArr4[i6] + bArr3[i6]);
                    i6++;
                }
                this.getHighSpeedVideoSizesFor.processBlock(this.getOutputStallDurationlomOqCM, 0, this.Camera2StreamConfigurationMap, 0);
                int i7 = 0;
                while (true) {
                    i4 = this.getOutputSizes;
                    if (i7 >= i4) {
                        break;
                    }
                    bArr2[i3 + i7] = (byte) (this.Camera2StreamConfigurationMap[i7] ^ bArr[i + i7]);
                    i7++;
                }
                i3 += i4;
            }
            int i8 = 0;
            while (true) {
                byte[] bArr5 = this.getHighSpeedVideoSizes;
                if (i8 >= bArr5.length) {
                    break;
                }
                byte[] bArr6 = this.getOutputStallDurationlomOqCM;
                bArr6[i8] = (byte) (bArr6[i8] + bArr5[i8]);
                i8++;
            }
            this.getHighSpeedVideoSizesFor.processBlock(this.getOutputStallDurationlomOqCM, 0, this.Camera2StreamConfigurationMap, 0);
            int i9 = this.getOutputSizes;
            java.lang.System.arraycopy(bArr2, i3 - i9, this.Camera2StreamConfigurationMap, 0, i9);
            getHighSpeedVideoSizes(bArr2, 0, i3 - this.getOutputSizes);
            java.lang.System.arraycopy(this.getOutputSizeshNQ4ISI, 0, this.getOutputMinFrameDuration, 0, this.getOutputSizes);
            int i10 = this.getOutputSizes;
            byte[] bArr7 = new byte[i10];
            java.lang.System.arraycopy(this.Camera2StreamConfigurationMap, 0, bArr7, 0, i10);
            if (!org.bouncycastle.util.Arrays.constantTimeAreEqual(this.getOutputMinFrameDuration, bArr7)) {
                throw new org.bouncycastle.crypto.InvalidCipherTextException("mac check failed");
            }
            reset();
            return i2 - this.getOutputSizes;
        }
        if (i2 % this.getHighSpeedVideoSizesFor.getBlockSize() != 0) {
            throw new org.bouncycastle.crypto.DataLengthException("partial blocks not supported");
        }
        getHighSpeedVideoSizes(bArr, i, i2);
        this.getHighSpeedVideoSizesFor.processBlock(this.getOutputStallDuration, 0, this.getOutputStallDurationlomOqCM, 0);
        int i11 = i2;
        while (i11 > 0) {
            getHighResolutionOutputSizeshNQ4ISI(bArr, i, bArr2, i3);
            i11 -= this.getHighSpeedVideoSizesFor.getBlockSize();
            i += this.getHighSpeedVideoSizesFor.getBlockSize();
            i3 += this.getHighSpeedVideoSizesFor.getBlockSize();
        }
        int i12 = 0;
        while (true) {
            byte[] bArr8 = this.getHighSpeedVideoSizes;
            if (i12 >= bArr8.length) {
                break;
            }
            byte[] bArr9 = this.getOutputStallDurationlomOqCM;
            bArr9[i12] = (byte) (bArr9[i12] + bArr8[i12]);
            i12++;
        }
        this.getHighSpeedVideoSizesFor.processBlock(this.getOutputStallDurationlomOqCM, 0, this.Camera2StreamConfigurationMap, 0);
        int i13 = 0;
        while (true) {
            int i14 = this.getOutputSizes;
            if (i13 >= i14) {
                java.lang.System.arraycopy(this.getOutputSizeshNQ4ISI, 0, this.getOutputMinFrameDuration, 0, i14);
                reset();
                return this.getOutputSizes + i2;
            }
            bArr2[i3 + i13] = (byte) (this.Camera2StreamConfigurationMap[i13] ^ this.getOutputSizeshNQ4ISI[i13]);
            i13++;
        }
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public int processBytes(byte[] bArr, int i, int i2, byte[] bArr2, int i3) throws org.bouncycastle.crypto.DataLengthException, java.lang.IllegalStateException {
        if (bArr.length < i + i2) {
            throw new org.bouncycastle.crypto.DataLengthException("input buffer too short");
        }
        this.getInputFormats.write(bArr, i, i2);
        return 0;
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public int processByte(byte b, byte[] bArr, int i) throws org.bouncycastle.crypto.DataLengthException, java.lang.IllegalStateException {
        this.getInputFormats.write(b);
        return 0;
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public void processAADBytes(byte[] bArr, int i, int i2) {
        this.getHighSpeedVideoFpsRanges.write(bArr, i, i2);
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public void processAADByte(byte b) {
        this.getHighSpeedVideoFpsRanges.write(b);
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public void init(boolean z, org.bouncycastle.crypto.CipherParameters cipherParameters) throws java.lang.IllegalArgumentException {
        org.bouncycastle.crypto.CipherParameters parameters;
        if (cipherParameters instanceof org.bouncycastle.crypto.params.AEADParameters) {
            org.bouncycastle.crypto.params.AEADParameters aEADParameters = (org.bouncycastle.crypto.params.AEADParameters) cipherParameters;
            if (aEADParameters.getMacSize() > 512 || aEADParameters.getMacSize() < 64 || aEADParameters.getMacSize() % 8 != 0) {
                throw new java.lang.IllegalArgumentException("Invalid mac size specified");
            }
            this.getOutputStallDuration = aEADParameters.getNonce();
            this.getOutputSizes = aEADParameters.getMacSize() / 8;
            this.getInputSizeshNQ4ISI = aEADParameters.getAssociatedText();
            parameters = aEADParameters.getKey();
        } else {
            if (!(cipherParameters instanceof org.bouncycastle.crypto.params.ParametersWithIV)) {
                throw new java.lang.IllegalArgumentException("Invalid parameters specified");
            }
            org.bouncycastle.crypto.params.ParametersWithIV parametersWithIV = (org.bouncycastle.crypto.params.ParametersWithIV) cipherParameters;
            this.getOutputStallDuration = parametersWithIV.getIV();
            this.getOutputSizes = this.getHighSpeedVideoSizesFor.getBlockSize();
            this.getInputSizeshNQ4ISI = null;
            parameters = parametersWithIV.getParameters();
        }
        this.getOutputMinFrameDuration = new byte[this.getOutputSizes];
        this.getOutputFormats = z;
        this.getHighSpeedVideoSizesFor.init(true, parameters);
        this.getHighSpeedVideoSizes[0] = 1;
        byte[] bArr = this.getInputSizeshNQ4ISI;
        if (bArr != null) {
            processAADBytes(bArr, 0, bArr.length);
        }
    }

    @Override // org.bouncycastle.crypto.modes.AEADBlockCipher
    public org.bouncycastle.crypto.BlockCipher getUnderlyingCipher() {
        return this.getHighSpeedVideoSizesFor;
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public int getOutputSize(int i) {
        return i + this.getOutputSizes;
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public byte[] getMac() {
        return org.bouncycastle.util.Arrays.clone(this.getOutputMinFrameDuration);
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public java.lang.String getAlgorithmName() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(this.getHighSpeedVideoSizesFor.getAlgorithmName());
        sb.append("/KCCM");
        return sb.toString();
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public int doFinal(byte[] bArr, int i) throws java.lang.IllegalStateException, org.bouncycastle.crypto.InvalidCipherTextException {
        int processPacket = processPacket(this.getInputFormats.Camera2StreamConfigurationMap(), 0, this.getInputFormats.size(), bArr, i);
        reset();
        return processPacket;
    }

    class ExposedByteArrayOutputStream extends java.io.ByteArrayOutputStream {
        public final byte[] Camera2StreamConfigurationMap() {
            return this.buf;
        }

        public ExposedByteArrayOutputStream() {
        }
    }

    private void getHighResolutionOutputSizeshNQ4ISI(byte[] bArr, int i, byte[] bArr2, int i2) {
        int i3 = 0;
        while (true) {
            byte[] bArr3 = this.getHighSpeedVideoSizes;
            if (i3 >= bArr3.length) {
                break;
            }
            byte[] bArr4 = this.getOutputStallDurationlomOqCM;
            bArr4[i3] = (byte) (bArr4[i3] + bArr3[i3]);
            i3++;
        }
        this.getHighSpeedVideoSizesFor.processBlock(this.getOutputStallDurationlomOqCM, 0, this.Camera2StreamConfigurationMap, 0);
        for (int i4 = 0; i4 < this.getHighSpeedVideoSizesFor.getBlockSize(); i4++) {
            bArr2[i2 + i4] = (byte) (this.Camera2StreamConfigurationMap[i4] ^ bArr[i + i4]);
        }
    }

    private void getHighSpeedVideoSizes(byte[] bArr, int i, int i2) {
        while (i2 > 0) {
            for (int i3 = 0; i3 < this.getHighSpeedVideoSizesFor.getBlockSize(); i3++) {
                byte[] bArr2 = this.getOutputSizeshNQ4ISI;
                bArr2[i3] = (byte) (bArr2[i3] ^ bArr[i + i3]);
            }
            org.bouncycastle.crypto.BlockCipher blockCipher = this.getHighSpeedVideoSizesFor;
            byte[] bArr3 = this.getOutputSizeshNQ4ISI;
            blockCipher.processBlock(bArr3, 0, bArr3, 0);
            i2 -= this.getHighSpeedVideoSizesFor.getBlockSize();
            i += this.getHighSpeedVideoSizesFor.getBlockSize();
        }
    }

    public KCCMBlockCipher(org.bouncycastle.crypto.BlockCipher blockCipher) {
        this(blockCipher, 4);
    }
}
