package org.bouncycastle.crypto.modes;

/* loaded from: classes17.dex */
public class CBCBlockCipher implements org.bouncycastle.crypto.BlockCipher {
    private org.bouncycastle.crypto.BlockCipher Camera2StreamConfigurationMap;
    private byte[] getHighResolutionOutputSizeshNQ4ISI;
    private int getHighSpeedVideoFpsRanges;
    private byte[] getHighSpeedVideoFpsRangesFor;
    private byte[] getHighSpeedVideoSizes;
    private boolean getOutputMinFrameDuration;

    @Override // org.bouncycastle.crypto.BlockCipher
    public int processBlock(byte[] bArr, int i, byte[] bArr2, int i2) throws org.bouncycastle.crypto.DataLengthException, java.lang.IllegalStateException {
        if (this.getOutputMinFrameDuration) {
            if (this.getHighSpeedVideoFpsRanges + i > bArr.length) {
                throw new org.bouncycastle.crypto.DataLengthException("input buffer too short");
            }
            for (int i3 = 0; i3 < this.getHighSpeedVideoFpsRanges; i3++) {
                byte[] bArr3 = this.getHighResolutionOutputSizeshNQ4ISI;
                bArr3[i3] = (byte) (bArr3[i3] ^ bArr[i + i3]);
            }
            int processBlock = this.Camera2StreamConfigurationMap.processBlock(this.getHighResolutionOutputSizeshNQ4ISI, 0, bArr2, i2);
            byte[] bArr4 = this.getHighResolutionOutputSizeshNQ4ISI;
            java.lang.System.arraycopy(bArr2, i2, bArr4, 0, bArr4.length);
            return processBlock;
        }
        int i4 = this.getHighSpeedVideoFpsRanges;
        if (i + i4 > bArr.length) {
            throw new org.bouncycastle.crypto.DataLengthException("input buffer too short");
        }
        java.lang.System.arraycopy(bArr, i, this.getHighSpeedVideoSizes, 0, i4);
        int processBlock2 = this.Camera2StreamConfigurationMap.processBlock(bArr, i, bArr2, i2);
        for (int i5 = 0; i5 < this.getHighSpeedVideoFpsRanges; i5++) {
            int i6 = i2 + i5;
            bArr2[i6] = (byte) (bArr2[i6] ^ this.getHighResolutionOutputSizeshNQ4ISI[i5]);
        }
        byte[] bArr5 = this.getHighResolutionOutputSizeshNQ4ISI;
        this.getHighResolutionOutputSizeshNQ4ISI = this.getHighSpeedVideoSizes;
        this.getHighSpeedVideoSizes = bArr5;
        return processBlock2;
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public void reset() {
        byte[] bArr = this.getHighSpeedVideoFpsRangesFor;
        java.lang.System.arraycopy(bArr, 0, this.getHighResolutionOutputSizeshNQ4ISI, 0, bArr.length);
        org.bouncycastle.util.Arrays.fill(this.getHighSpeedVideoSizes, (byte) 0);
        this.Camera2StreamConfigurationMap.reset();
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public void init(boolean z, org.bouncycastle.crypto.CipherParameters cipherParameters) throws java.lang.IllegalArgumentException {
        org.bouncycastle.crypto.BlockCipher blockCipher;
        boolean z2 = this.getOutputMinFrameDuration;
        this.getOutputMinFrameDuration = z;
        if (cipherParameters instanceof org.bouncycastle.crypto.params.ParametersWithIV) {
            org.bouncycastle.crypto.params.ParametersWithIV parametersWithIV = (org.bouncycastle.crypto.params.ParametersWithIV) cipherParameters;
            byte[] iv = parametersWithIV.getIV();
            if (iv.length != this.getHighSpeedVideoFpsRanges) {
                throw new java.lang.IllegalArgumentException("initialisation vector must be the same length as block size");
            }
            java.lang.System.arraycopy(iv, 0, this.getHighSpeedVideoFpsRangesFor, 0, iv.length);
            reset();
            if (parametersWithIV.getParameters() == null) {
                if (z2 != z) {
                    throw new java.lang.IllegalArgumentException("cannot change encrypting state without providing key.");
                }
                return;
            } else {
                blockCipher = this.Camera2StreamConfigurationMap;
                cipherParameters = parametersWithIV.getParameters();
            }
        } else {
            reset();
            if (cipherParameters == null) {
                if (z2 != z) {
                    throw new java.lang.IllegalArgumentException("cannot change encrypting state without providing key.");
                }
                return;
            }
            blockCipher = this.Camera2StreamConfigurationMap;
        }
        blockCipher.init(z, cipherParameters);
    }

    public org.bouncycastle.crypto.BlockCipher getUnderlyingCipher() {
        return this.Camera2StreamConfigurationMap;
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public int getBlockSize() {
        return this.Camera2StreamConfigurationMap.getBlockSize();
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public java.lang.String getAlgorithmName() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(this.Camera2StreamConfigurationMap.getAlgorithmName());
        sb.append("/CBC");
        return sb.toString();
    }

    public CBCBlockCipher(org.bouncycastle.crypto.BlockCipher blockCipher) {
        this.Camera2StreamConfigurationMap = blockCipher;
        int blockSize = blockCipher.getBlockSize();
        this.getHighSpeedVideoFpsRanges = blockSize;
        this.getHighSpeedVideoFpsRangesFor = new byte[blockSize];
        this.getHighResolutionOutputSizeshNQ4ISI = new byte[blockSize];
        this.getHighSpeedVideoSizes = new byte[blockSize];
    }
}
