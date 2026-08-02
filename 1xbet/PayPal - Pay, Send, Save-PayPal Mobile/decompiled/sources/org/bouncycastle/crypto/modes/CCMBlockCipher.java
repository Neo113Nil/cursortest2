package org.bouncycastle.crypto.modes;

/* loaded from: classes17.dex */
public class CCMBlockCipher implements org.bouncycastle.crypto.modes.AEADBlockCipher {
    private int getHighResolutionOutputSizeshNQ4ISI;
    private org.bouncycastle.crypto.BlockCipher getHighSpeedVideoFpsRanges;
    private boolean getHighSpeedVideoFpsRangesFor;
    private org.bouncycastle.crypto.CipherParameters getHighSpeedVideoSizesFor;
    private byte[] getInputFormats;
    private byte[] getInputSizeshNQ4ISI;
    private int getOutputFormats;
    private byte[] getOutputMinFrameDuration;
    private org.bouncycastle.crypto.modes.CCMBlockCipher.ExposedByteArrayOutputStream getHighSpeedVideoSizes = new org.bouncycastle.crypto.modes.CCMBlockCipher.ExposedByteArrayOutputStream();
    private org.bouncycastle.crypto.modes.CCMBlockCipher.ExposedByteArrayOutputStream Camera2StreamConfigurationMap = new org.bouncycastle.crypto.modes.CCMBlockCipher.ExposedByteArrayOutputStream();

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public int getUpdateOutputSize(int i) {
        return 0;
    }

    private int getHighResolutionOutputSizeshNQ4ISI(byte[] bArr, int i, int i2, byte[] bArr2) {
        org.bouncycastle.crypto.macs.CBCBlockCipherMac cBCBlockCipherMac = new org.bouncycastle.crypto.macs.CBCBlockCipherMac(this.getHighSpeedVideoFpsRanges, this.getOutputFormats * 8);
        cBCBlockCipherMac.init(this.getHighSpeedVideoSizesFor);
        byte[] bArr3 = new byte[16];
        int size = this.getHighSpeedVideoSizes.size();
        byte[] bArr4 = this.getOutputMinFrameDuration;
        if (size + (bArr4 == null ? 0 : bArr4.length) > 0) {
            bArr3[0] = (byte) (bArr3[0] | 64);
        }
        int i3 = 2;
        byte macSize = (byte) (bArr3[0] | ((((cBCBlockCipherMac.getMacSize() - 2) / 2) & 7) << 3));
        bArr3[0] = macSize;
        byte[] bArr5 = this.getInputFormats;
        bArr3[0] = (byte) (macSize | ((14 - bArr5.length) & 7));
        java.lang.System.arraycopy(bArr5, 0, bArr3, 1, bArr5.length);
        int i4 = i2;
        int i5 = 1;
        while (i4 > 0) {
            bArr3[16 - i5] = (byte) (i4 & 255);
            i4 >>>= 8;
            i5++;
        }
        cBCBlockCipherMac.update(bArr3, 0, 16);
        int size2 = this.getHighSpeedVideoSizes.size();
        byte[] bArr6 = this.getOutputMinFrameDuration;
        if (size2 + (bArr6 == null ? 0 : bArr6.length) > 0) {
            int size3 = this.getHighSpeedVideoSizes.size();
            byte[] bArr7 = this.getOutputMinFrameDuration;
            int length = size3 + (bArr7 == null ? 0 : bArr7.length);
            if (length < 65280) {
                cBCBlockCipherMac.update((byte) (length >> 8));
                cBCBlockCipherMac.update((byte) length);
            } else {
                cBCBlockCipherMac.update((byte) -1);
                cBCBlockCipherMac.update((byte) -2);
                cBCBlockCipherMac.update((byte) (length >> 24));
                cBCBlockCipherMac.update((byte) (length >> 16));
                cBCBlockCipherMac.update((byte) (length >> 8));
                cBCBlockCipherMac.update((byte) length);
                i3 = 6;
            }
            byte[] bArr8 = this.getOutputMinFrameDuration;
            if (bArr8 != null) {
                cBCBlockCipherMac.update(bArr8, 0, bArr8.length);
            }
            if (this.getHighSpeedVideoSizes.size() > 0) {
                cBCBlockCipherMac.update(this.getHighSpeedVideoSizes.getHighSpeedVideoSizes(), 0, this.getHighSpeedVideoSizes.size());
            }
            int i6 = (i3 + length) % 16;
            if (i6 != 0) {
                while (i6 != 16) {
                    cBCBlockCipherMac.update((byte) 0);
                    i6++;
                }
            }
        }
        cBCBlockCipherMac.update(bArr, i, i2);
        return cBCBlockCipherMac.doFinal(bArr2, 0);
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public void reset() {
        this.getHighSpeedVideoFpsRanges.reset();
        this.getHighSpeedVideoSizes.reset();
        this.Camera2StreamConfigurationMap.reset();
    }

    public byte[] processPacket(byte[] bArr, int i, int i2) throws java.lang.IllegalStateException, org.bouncycastle.crypto.InvalidCipherTextException {
        int i3;
        if (this.getHighSpeedVideoFpsRangesFor) {
            i3 = this.getOutputFormats + i2;
        } else {
            int i4 = this.getOutputFormats;
            if (i2 < i4) {
                throw new org.bouncycastle.crypto.InvalidCipherTextException("data too short");
            }
            i3 = i2 - i4;
        }
        byte[] bArr2 = new byte[i3];
        processPacket(bArr, i, i2, bArr2, 0);
        return bArr2;
    }

    public int processPacket(byte[] bArr, int i, int i2, byte[] bArr2, int i3) throws java.lang.IllegalStateException, org.bouncycastle.crypto.InvalidCipherTextException, org.bouncycastle.crypto.DataLengthException {
        int i4;
        if (this.getHighSpeedVideoSizesFor == null) {
            throw new java.lang.IllegalStateException("CCM cipher unitialized.");
        }
        byte[] bArr3 = this.getInputFormats;
        int length = bArr3.length;
        int i5 = 15 - length;
        if (i5 < 4 && i2 >= (1 << (i5 * 8))) {
            throw new java.lang.IllegalStateException("CCM packet too large for choice of q.");
        }
        byte[] bArr4 = new byte[this.getHighResolutionOutputSizeshNQ4ISI];
        bArr4[0] = (byte) ((14 - length) & 7);
        java.lang.System.arraycopy(bArr3, 0, bArr4, 1, bArr3.length);
        org.bouncycastle.crypto.modes.SICBlockCipher sICBlockCipher = new org.bouncycastle.crypto.modes.SICBlockCipher(this.getHighSpeedVideoFpsRanges);
        sICBlockCipher.init(this.getHighSpeedVideoFpsRangesFor, new org.bouncycastle.crypto.params.ParametersWithIV(this.getHighSpeedVideoSizesFor, bArr4));
        if (!this.getHighSpeedVideoFpsRangesFor) {
            int i6 = this.getOutputFormats;
            if (i2 < i6) {
                throw new org.bouncycastle.crypto.InvalidCipherTextException("data too short");
            }
            int i7 = i2 - i6;
            if (bArr2.length < i7 + i3) {
                throw new org.bouncycastle.crypto.OutputLengthException("Output buffer too short.");
            }
            int i8 = i + i7;
            java.lang.System.arraycopy(bArr, i8, this.getInputSizeshNQ4ISI, 0, i6);
            byte[] bArr5 = this.getInputSizeshNQ4ISI;
            sICBlockCipher.processBlock(bArr5, 0, bArr5, 0);
            int i9 = this.getOutputFormats;
            while (true) {
                byte[] bArr6 = this.getInputSizeshNQ4ISI;
                if (i9 == bArr6.length) {
                    break;
                }
                bArr6[i9] = 0;
                i9++;
            }
            int i10 = i;
            int i11 = i3;
            while (true) {
                i4 = this.getHighResolutionOutputSizeshNQ4ISI;
                if (i10 >= i8 - i4) {
                    break;
                }
                sICBlockCipher.processBlock(bArr, i10, bArr2, i11);
                int i12 = this.getHighResolutionOutputSizeshNQ4ISI;
                i11 += i12;
                i10 += i12;
            }
            byte[] bArr7 = new byte[i4];
            int i13 = i7 - (i10 - i);
            java.lang.System.arraycopy(bArr, i10, bArr7, 0, i13);
            sICBlockCipher.processBlock(bArr7, 0, bArr7, 0);
            java.lang.System.arraycopy(bArr7, 0, bArr2, i11, i13);
            byte[] bArr8 = new byte[this.getHighResolutionOutputSizeshNQ4ISI];
            getHighResolutionOutputSizeshNQ4ISI(bArr2, i3, i7, bArr8);
            if (org.bouncycastle.util.Arrays.constantTimeAreEqual(this.getInputSizeshNQ4ISI, bArr8)) {
                return i7;
            }
            throw new org.bouncycastle.crypto.InvalidCipherTextException("mac check in CCM failed");
        }
        int i14 = this.getOutputFormats + i2;
        if (bArr2.length < i14 + i3) {
            throw new org.bouncycastle.crypto.OutputLengthException("Output buffer too short.");
        }
        getHighResolutionOutputSizeshNQ4ISI(bArr, i, i2, this.getInputSizeshNQ4ISI);
        byte[] bArr9 = new byte[this.getHighResolutionOutputSizeshNQ4ISI];
        sICBlockCipher.processBlock(this.getInputSizeshNQ4ISI, 0, bArr9, 0);
        int i15 = i;
        int i16 = i3;
        while (true) {
            int i17 = i + i2;
            int i18 = this.getHighResolutionOutputSizeshNQ4ISI;
            if (i15 >= i17 - i18) {
                byte[] bArr10 = new byte[i18];
                int i19 = i17 - i15;
                java.lang.System.arraycopy(bArr, i15, bArr10, 0, i19);
                sICBlockCipher.processBlock(bArr10, 0, bArr10, 0);
                java.lang.System.arraycopy(bArr10, 0, bArr2, i16, i19);
                java.lang.System.arraycopy(bArr9, 0, bArr2, i3 + i2, this.getOutputFormats);
                return i14;
            }
            sICBlockCipher.processBlock(bArr, i15, bArr2, i16);
            int i20 = this.getHighResolutionOutputSizeshNQ4ISI;
            i16 += i20;
            i15 += i20;
        }
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public int processBytes(byte[] bArr, int i, int i2, byte[] bArr2, int i3) throws org.bouncycastle.crypto.DataLengthException, java.lang.IllegalStateException {
        if (bArr.length < i + i2) {
            throw new org.bouncycastle.crypto.DataLengthException("Input buffer too short");
        }
        this.Camera2StreamConfigurationMap.write(bArr, i, i2);
        return 0;
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public int processByte(byte b, byte[] bArr, int i) throws org.bouncycastle.crypto.DataLengthException, java.lang.IllegalStateException {
        this.Camera2StreamConfigurationMap.write(b);
        return 0;
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public void processAADBytes(byte[] bArr, int i, int i2) {
        this.getHighSpeedVideoSizes.write(bArr, i, i2);
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public void processAADByte(byte b) {
        this.getHighSpeedVideoSizes.write(b);
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public void init(boolean z, org.bouncycastle.crypto.CipherParameters cipherParameters) throws java.lang.IllegalArgumentException {
        org.bouncycastle.crypto.CipherParameters parameters;
        this.getHighSpeedVideoFpsRangesFor = z;
        if (cipherParameters instanceof org.bouncycastle.crypto.params.AEADParameters) {
            org.bouncycastle.crypto.params.AEADParameters aEADParameters = (org.bouncycastle.crypto.params.AEADParameters) cipherParameters;
            this.getInputFormats = aEADParameters.getNonce();
            this.getOutputMinFrameDuration = aEADParameters.getAssociatedText();
            this.getOutputFormats = Camera2StreamConfigurationMap(z, aEADParameters.getMacSize());
            parameters = aEADParameters.getKey();
        } else {
            if (!(cipherParameters instanceof org.bouncycastle.crypto.params.ParametersWithIV)) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("invalid parameters passed to CCM: ");
                sb.append(cipherParameters.getClass().getName());
                throw new java.lang.IllegalArgumentException(sb.toString());
            }
            org.bouncycastle.crypto.params.ParametersWithIV parametersWithIV = (org.bouncycastle.crypto.params.ParametersWithIV) cipherParameters;
            this.getInputFormats = parametersWithIV.getIV();
            this.getOutputMinFrameDuration = null;
            this.getOutputFormats = Camera2StreamConfigurationMap(z, 64);
            parameters = parametersWithIV.getParameters();
        }
        if (parameters != null) {
            this.getHighSpeedVideoSizesFor = parameters;
        }
        byte[] bArr = this.getInputFormats;
        if (bArr == null || bArr.length < 7 || bArr.length > 13) {
            throw new java.lang.IllegalArgumentException("nonce must have length from 7 to 13 octets");
        }
        reset();
    }

    @Override // org.bouncycastle.crypto.modes.AEADBlockCipher
    public org.bouncycastle.crypto.BlockCipher getUnderlyingCipher() {
        return this.getHighSpeedVideoFpsRanges;
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public int getOutputSize(int i) {
        int size = i + this.Camera2StreamConfigurationMap.size();
        if (this.getHighSpeedVideoFpsRangesFor) {
            return size + this.getOutputFormats;
        }
        int i2 = this.getOutputFormats;
        if (size < i2) {
            return 0;
        }
        return size - i2;
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public byte[] getMac() {
        int i = this.getOutputFormats;
        byte[] bArr = new byte[i];
        java.lang.System.arraycopy(this.getInputSizeshNQ4ISI, 0, bArr, 0, i);
        return bArr;
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public java.lang.String getAlgorithmName() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(this.getHighSpeedVideoFpsRanges.getAlgorithmName());
        sb.append("/CCM");
        return sb.toString();
    }

    class ExposedByteArrayOutputStream extends java.io.ByteArrayOutputStream {
        public final byte[] getHighSpeedVideoSizes() {
            return this.buf;
        }

        public ExposedByteArrayOutputStream() {
        }
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public int doFinal(byte[] bArr, int i) throws java.lang.IllegalStateException, org.bouncycastle.crypto.InvalidCipherTextException {
        int processPacket = processPacket(this.Camera2StreamConfigurationMap.getHighSpeedVideoSizes(), 0, this.Camera2StreamConfigurationMap.size(), bArr, i);
        reset();
        return processPacket;
    }

    private static int Camera2StreamConfigurationMap(boolean z, int i) {
        if (!z || (i >= 32 && i <= 128 && (i & 15) == 0)) {
            return i >>> 3;
        }
        throw new java.lang.IllegalArgumentException("tag length in octets must be one of {4,6,8,10,12,14,16}");
    }

    public CCMBlockCipher(org.bouncycastle.crypto.BlockCipher blockCipher) {
        this.getHighSpeedVideoFpsRanges = blockCipher;
        int blockSize = blockCipher.getBlockSize();
        this.getHighResolutionOutputSizeshNQ4ISI = blockSize;
        this.getInputSizeshNQ4ISI = new byte[blockSize];
        if (blockSize != 16) {
            throw new java.lang.IllegalArgumentException("cipher required with a block size of 16.");
        }
    }
}
