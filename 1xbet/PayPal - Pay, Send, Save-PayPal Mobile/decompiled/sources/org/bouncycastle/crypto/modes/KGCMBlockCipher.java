package org.bouncycastle.crypto.modes;

/* loaded from: classes17.dex */
public class KGCMBlockCipher implements org.bouncycastle.crypto.modes.AEADBlockCipher {
    private final int Camera2StreamConfigurationMap;
    private long[] getHighResolutionOutputSizeshNQ4ISI;
    private org.bouncycastle.crypto.BufferedBlockCipher getHighSpeedVideoFpsRangesFor;
    private byte[] getHighSpeedVideoSizesFor;
    private byte[] getInputFormats;
    private byte[] getInputSizeshNQ4ISI;
    private org.bouncycastle.crypto.BlockCipher getOutputFormats;
    private boolean getOutputMinFrameDuration;
    private org.bouncycastle.crypto.modes.kgcm.KGCMMultiplier getOutputSizeshNQ4ISI;
    private org.bouncycastle.crypto.modes.KGCMBlockCipher.ExposedByteArrayOutputStream getHighSpeedVideoFpsRanges = new org.bouncycastle.crypto.modes.KGCMBlockCipher.ExposedByteArrayOutputStream();
    private org.bouncycastle.crypto.modes.KGCMBlockCipher.ExposedByteArrayOutputStream getHighSpeedVideoSizes = new org.bouncycastle.crypto.modes.KGCMBlockCipher.ExposedByteArrayOutputStream();
    private int getOutputSizes = -1;

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public int getUpdateOutputSize(int i) {
        return 0;
    }

    public KGCMBlockCipher(org.bouncycastle.crypto.BlockCipher blockCipher) {
        org.bouncycastle.crypto.modes.kgcm.KGCMMultiplier tables4kKGCMMultiplier_128;
        this.getOutputFormats = blockCipher;
        this.getHighSpeedVideoFpsRangesFor = new org.bouncycastle.crypto.BufferedBlockCipher(new org.bouncycastle.crypto.modes.KCTRBlockCipher(blockCipher));
        int blockSize = this.getOutputFormats.getBlockSize();
        this.Camera2StreamConfigurationMap = blockSize;
        this.getInputFormats = new byte[blockSize];
        this.getInputSizeshNQ4ISI = new byte[blockSize];
        if (blockSize == 16) {
            tables4kKGCMMultiplier_128 = new org.bouncycastle.crypto.modes.kgcm.Tables4kKGCMMultiplier_128();
        } else if (blockSize == 32) {
            tables4kKGCMMultiplier_128 = new org.bouncycastle.crypto.modes.kgcm.Tables8kKGCMMultiplier_256();
        } else {
            if (blockSize != 64) {
                throw new java.lang.IllegalArgumentException("Only 128, 256, and 512 -bit block sizes supported");
            }
            tables4kKGCMMultiplier_128 = new org.bouncycastle.crypto.modes.kgcm.Tables16kKGCMMultiplier_512();
        }
        this.getOutputSizeshNQ4ISI = tables4kKGCMMultiplier_128;
        this.getHighResolutionOutputSizeshNQ4ISI = new long[blockSize >>> 3];
        this.getHighSpeedVideoSizesFor = null;
    }

    private void getHighSpeedVideoFpsRanges(byte[] bArr, int i, int i2, int i3) {
        int i4 = i;
        while (true) {
            if (i4 >= i + i2) {
                long[] jArr = this.getHighResolutionOutputSizeshNQ4ISI;
                jArr[0] = ((i3 & 4294967295L) << 3) ^ jArr[0];
                int i5 = this.Camera2StreamConfigurationMap >>> 4;
                jArr[i5] = ((i2 & 4294967295L) << 3) ^ jArr[i5];
                byte[] longToLittleEndian = org.bouncycastle.util.Pack.longToLittleEndian(jArr);
                this.getHighSpeedVideoSizesFor = longToLittleEndian;
                this.getOutputFormats.processBlock(longToLittleEndian, 0, longToLittleEndian, 0);
                return;
            }
            long[] jArr2 = this.getHighResolutionOutputSizeshNQ4ISI;
            int i6 = i4;
            for (int i7 = 0; i7 < jArr2.length; i7++) {
                jArr2[i7] = jArr2[i7] ^ org.bouncycastle.util.Pack.littleEndianToLong(bArr, i6);
                i6 += 8;
            }
            this.getOutputSizeshNQ4ISI.multiplyH(this.getHighResolutionOutputSizeshNQ4ISI);
            i4 += this.Camera2StreamConfigurationMap;
        }
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public int doFinal(byte[] bArr, int i) throws java.lang.IllegalStateException, org.bouncycastle.crypto.InvalidCipherTextException {
        int doFinal;
        int size = this.getHighSpeedVideoSizes.size();
        if (!this.getOutputMinFrameDuration && size < this.getOutputSizes) {
            throw new org.bouncycastle.crypto.InvalidCipherTextException("data too short");
        }
        byte[] bArr2 = new byte[this.Camera2StreamConfigurationMap];
        this.getOutputFormats.processBlock(bArr2, 0, bArr2, 0);
        long[] jArr = new long[this.Camera2StreamConfigurationMap >>> 3];
        org.bouncycastle.util.Pack.littleEndianToLong(bArr2, 0, jArr);
        this.getOutputSizeshNQ4ISI.init(jArr);
        org.bouncycastle.util.Arrays.fill(bArr2, (byte) 0);
        org.bouncycastle.util.Arrays.fill(jArr, 0L);
        int size2 = this.getHighSpeedVideoFpsRanges.size();
        if (size2 > 0) {
            byte[] Camera2StreamConfigurationMap = this.getHighSpeedVideoFpsRanges.Camera2StreamConfigurationMap();
            int i2 = 0;
            while (i2 < size2) {
                long[] jArr2 = this.getHighResolutionOutputSizeshNQ4ISI;
                int i3 = i2;
                for (int i4 = 0; i4 < jArr2.length; i4++) {
                    jArr2[i4] = jArr2[i4] ^ org.bouncycastle.util.Pack.littleEndianToLong(Camera2StreamConfigurationMap, i3);
                    i3 += 8;
                }
                this.getOutputSizeshNQ4ISI.multiplyH(this.getHighResolutionOutputSizeshNQ4ISI);
                i2 += this.Camera2StreamConfigurationMap;
            }
        }
        if (!this.getOutputMinFrameDuration) {
            int i5 = size - this.getOutputSizes;
            if (bArr.length - i < i5) {
                throw new org.bouncycastle.crypto.OutputLengthException("Output buffer too short");
            }
            getHighSpeedVideoFpsRanges(this.getHighSpeedVideoSizes.Camera2StreamConfigurationMap(), 0, i5, size2);
            int processBytes = this.getHighSpeedVideoFpsRangesFor.processBytes(this.getHighSpeedVideoSizes.Camera2StreamConfigurationMap(), 0, i5, bArr, i);
            doFinal = processBytes + this.getHighSpeedVideoFpsRangesFor.doFinal(bArr, i + processBytes);
        } else {
            if ((bArr.length - i) - this.getOutputSizes < size) {
                throw new org.bouncycastle.crypto.OutputLengthException("Output buffer too short");
            }
            int processBytes2 = this.getHighSpeedVideoFpsRangesFor.processBytes(this.getHighSpeedVideoSizes.Camera2StreamConfigurationMap(), 0, size, bArr, i);
            doFinal = processBytes2 + this.getHighSpeedVideoFpsRangesFor.doFinal(bArr, i + processBytes2);
            getHighSpeedVideoFpsRanges(bArr, i, size, size2);
        }
        byte[] bArr3 = this.getHighSpeedVideoSizesFor;
        if (bArr3 == null) {
            throw new java.lang.IllegalStateException("mac is not calculated");
        }
        if (this.getOutputMinFrameDuration) {
            java.lang.System.arraycopy(bArr3, 0, bArr, i + doFinal, this.getOutputSizes);
            reset();
            return doFinal + this.getOutputSizes;
        }
        byte[] bArr4 = new byte[this.getOutputSizes];
        byte[] Camera2StreamConfigurationMap2 = this.getHighSpeedVideoSizes.Camera2StreamConfigurationMap();
        int i6 = this.getOutputSizes;
        java.lang.System.arraycopy(Camera2StreamConfigurationMap2, size - i6, bArr4, 0, i6);
        int i7 = this.getOutputSizes;
        byte[] bArr5 = new byte[i7];
        java.lang.System.arraycopy(this.getHighSpeedVideoSizesFor, 0, bArr5, 0, i7);
        if (!org.bouncycastle.util.Arrays.constantTimeAreEqual(bArr4, bArr5)) {
            throw new org.bouncycastle.crypto.InvalidCipherTextException("mac verification failed");
        }
        reset();
        return doFinal;
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public void reset() {
        org.bouncycastle.util.Arrays.fill(this.getHighResolutionOutputSizeshNQ4ISI, 0L);
        this.getOutputFormats.reset();
        this.getHighSpeedVideoSizes.reset();
        this.getHighSpeedVideoFpsRanges.reset();
        byte[] bArr = this.getInputFormats;
        if (bArr != null) {
            processAADBytes(bArr, 0, bArr.length);
        }
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public int processBytes(byte[] bArr, int i, int i2, byte[] bArr2, int i3) throws org.bouncycastle.crypto.DataLengthException, java.lang.IllegalStateException {
        if (bArr.length < i + i2) {
            throw new org.bouncycastle.crypto.DataLengthException("input buffer too short");
        }
        this.getHighSpeedVideoSizes.write(bArr, i, i2);
        return 0;
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public int processByte(byte b, byte[] bArr, int i) throws org.bouncycastle.crypto.DataLengthException, java.lang.IllegalStateException {
        this.getHighSpeedVideoSizes.write(b);
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
        org.bouncycastle.crypto.params.KeyParameter keyParameter;
        this.getOutputMinFrameDuration = z;
        if (cipherParameters instanceof org.bouncycastle.crypto.params.AEADParameters) {
            org.bouncycastle.crypto.params.AEADParameters aEADParameters = (org.bouncycastle.crypto.params.AEADParameters) cipherParameters;
            byte[] nonce = aEADParameters.getNonce();
            byte[] bArr = this.getInputSizeshNQ4ISI;
            int length = bArr.length;
            int length2 = nonce.length;
            org.bouncycastle.util.Arrays.fill(bArr, (byte) 0);
            java.lang.System.arraycopy(nonce, 0, this.getInputSizeshNQ4ISI, length - length2, nonce.length);
            this.getInputFormats = aEADParameters.getAssociatedText();
            int macSize = aEADParameters.getMacSize();
            if (macSize < 64 || macSize > (this.Camera2StreamConfigurationMap << 3) || (macSize & 7) != 0) {
                throw new java.lang.IllegalArgumentException("Invalid value for MAC size: ".concat(java.lang.String.valueOf(macSize)));
            }
            this.getOutputSizes = macSize >>> 3;
            keyParameter = aEADParameters.getKey();
            byte[] bArr2 = this.getInputFormats;
            if (bArr2 != null) {
                processAADBytes(bArr2, 0, bArr2.length);
            }
        } else {
            if (!(cipherParameters instanceof org.bouncycastle.crypto.params.ParametersWithIV)) {
                throw new java.lang.IllegalArgumentException("Invalid parameter passed");
            }
            org.bouncycastle.crypto.params.ParametersWithIV parametersWithIV = (org.bouncycastle.crypto.params.ParametersWithIV) cipherParameters;
            byte[] iv = parametersWithIV.getIV();
            byte[] bArr3 = this.getInputSizeshNQ4ISI;
            int length3 = bArr3.length;
            int length4 = iv.length;
            org.bouncycastle.util.Arrays.fill(bArr3, (byte) 0);
            java.lang.System.arraycopy(iv, 0, this.getInputSizeshNQ4ISI, length3 - length4, iv.length);
            this.getInputFormats = null;
            this.getOutputSizes = this.Camera2StreamConfigurationMap;
            keyParameter = (org.bouncycastle.crypto.params.KeyParameter) parametersWithIV.getParameters();
        }
        this.getHighSpeedVideoSizesFor = new byte[this.Camera2StreamConfigurationMap];
        this.getHighSpeedVideoFpsRangesFor.init(true, new org.bouncycastle.crypto.params.ParametersWithIV(keyParameter, this.getInputSizeshNQ4ISI));
        this.getOutputFormats.init(true, keyParameter);
    }

    @Override // org.bouncycastle.crypto.modes.AEADBlockCipher
    public org.bouncycastle.crypto.BlockCipher getUnderlyingCipher() {
        return this.getOutputFormats;
    }

    class ExposedByteArrayOutputStream extends java.io.ByteArrayOutputStream {
        public final byte[] Camera2StreamConfigurationMap() {
            return this.buf;
        }

        public ExposedByteArrayOutputStream() {
        }
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public int getOutputSize(int i) {
        int size = i + this.getHighSpeedVideoSizes.size();
        if (this.getOutputMinFrameDuration) {
            return size + this.getOutputSizes;
        }
        int i2 = this.getOutputSizes;
        if (size < i2) {
            return 0;
        }
        return size - i2;
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public byte[] getMac() {
        int i = this.getOutputSizes;
        byte[] bArr = new byte[i];
        java.lang.System.arraycopy(this.getHighSpeedVideoSizesFor, 0, bArr, 0, i);
        return bArr;
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public java.lang.String getAlgorithmName() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(this.getOutputFormats.getAlgorithmName());
        sb.append("/KGCM");
        return sb.toString();
    }
}
