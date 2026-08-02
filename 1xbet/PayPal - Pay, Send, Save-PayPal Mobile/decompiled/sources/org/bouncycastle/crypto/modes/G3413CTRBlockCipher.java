package org.bouncycastle.crypto.modes;

/* loaded from: classes17.dex */
public class G3413CTRBlockCipher extends org.bouncycastle.crypto.StreamBlockCipher {
    private final int Camera2StreamConfigurationMap;
    private byte[] getHighResolutionOutputSizeshNQ4ISI;
    private byte[] getHighSpeedVideoFpsRanges;
    private int getHighSpeedVideoFpsRangesFor;
    private byte[] getHighSpeedVideoSizes;
    private final org.bouncycastle.crypto.BlockCipher getHighSpeedVideoSizesFor;
    private final int getInputFormats;
    private boolean getOutputMinFrameDuration;

    @Override // org.bouncycastle.crypto.StreamBlockCipher
    public byte calculateByte(byte b) {
        if (this.getHighSpeedVideoFpsRangesFor == 0) {
            byte[] bArr = this.getHighResolutionOutputSizeshNQ4ISI;
            byte[] bArr2 = new byte[bArr.length];
            this.getHighSpeedVideoSizesFor.processBlock(bArr, 0, bArr2, 0);
            this.getHighSpeedVideoFpsRanges = org.bouncycastle.crypto.modes.GOST3413CipherUtil.getHighSpeedVideoFpsRanges(bArr2, this.getInputFormats);
        }
        byte[] bArr3 = this.getHighSpeedVideoFpsRanges;
        int i = this.getHighSpeedVideoFpsRangesFor;
        byte b2 = (byte) (b ^ bArr3[i]);
        int i2 = i + 1;
        this.getHighSpeedVideoFpsRangesFor = i2;
        if (i2 == this.getInputFormats) {
            this.getHighSpeedVideoFpsRangesFor = 0;
            byte[] bArr4 = this.getHighResolutionOutputSizeshNQ4ISI;
            int length = bArr4.length - 1;
            bArr4[length] = (byte) (bArr4[length] + 1);
        }
        return b2;
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public void init(boolean z, org.bouncycastle.crypto.CipherParameters cipherParameters) throws java.lang.IllegalArgumentException {
        org.bouncycastle.crypto.BlockCipher blockCipher;
        if (!(cipherParameters instanceof org.bouncycastle.crypto.params.ParametersWithIV)) {
            int i = this.Camera2StreamConfigurationMap;
            this.getHighSpeedVideoSizes = new byte[i / 2];
            this.getHighResolutionOutputSizeshNQ4ISI = new byte[i];
            this.getHighSpeedVideoFpsRanges = new byte[this.getInputFormats];
            if (cipherParameters != null) {
                blockCipher = this.getHighSpeedVideoSizesFor;
                blockCipher.init(true, cipherParameters);
            }
            this.getOutputMinFrameDuration = true;
        }
        org.bouncycastle.crypto.params.ParametersWithIV parametersWithIV = (org.bouncycastle.crypto.params.ParametersWithIV) cipherParameters;
        int i2 = this.Camera2StreamConfigurationMap;
        this.getHighSpeedVideoSizes = new byte[i2 / 2];
        this.getHighResolutionOutputSizeshNQ4ISI = new byte[i2];
        this.getHighSpeedVideoFpsRanges = new byte[this.getInputFormats];
        byte[] clone = org.bouncycastle.util.Arrays.clone(parametersWithIV.getIV());
        this.getHighSpeedVideoSizes = clone;
        if (clone.length != this.Camera2StreamConfigurationMap / 2) {
            throw new java.lang.IllegalArgumentException("Parameter IV length must be == blockSize/2");
        }
        java.lang.System.arraycopy(clone, 0, this.getHighResolutionOutputSizeshNQ4ISI, 0, clone.length);
        for (int length = this.getHighSpeedVideoSizes.length; length < this.Camera2StreamConfigurationMap; length++) {
            this.getHighResolutionOutputSizeshNQ4ISI[length] = 0;
        }
        if (parametersWithIV.getParameters() != null) {
            blockCipher = this.getHighSpeedVideoSizesFor;
            cipherParameters = parametersWithIV.getParameters();
            blockCipher.init(true, cipherParameters);
        }
        this.getOutputMinFrameDuration = true;
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public void reset() {
        if (this.getOutputMinFrameDuration) {
            byte[] bArr = this.getHighSpeedVideoSizes;
            java.lang.System.arraycopy(bArr, 0, this.getHighResolutionOutputSizeshNQ4ISI, 0, bArr.length);
            for (int length = this.getHighSpeedVideoSizes.length; length < this.Camera2StreamConfigurationMap; length++) {
                this.getHighResolutionOutputSizeshNQ4ISI[length] = 0;
            }
            this.getHighSpeedVideoFpsRangesFor = 0;
            this.getHighSpeedVideoSizesFor.reset();
        }
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public int processBlock(byte[] bArr, int i, byte[] bArr2, int i2) throws org.bouncycastle.crypto.DataLengthException, java.lang.IllegalStateException {
        processBytes(bArr, i, this.getInputFormats, bArr2, i2);
        return this.getInputFormats;
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public int getBlockSize() {
        return this.getInputFormats;
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public java.lang.String getAlgorithmName() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(this.getHighSpeedVideoSizesFor.getAlgorithmName());
        sb.append("/GCTR");
        return sb.toString();
    }

    public G3413CTRBlockCipher(org.bouncycastle.crypto.BlockCipher blockCipher, int i) {
        super(blockCipher);
        this.getHighSpeedVideoFpsRangesFor = 0;
        if (i < 0 || i > blockCipher.getBlockSize() * 8) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Parameter bitBlockSize must be in range 0 < bitBlockSize <= ");
            sb.append(blockCipher.getBlockSize() * 8);
            throw new java.lang.IllegalArgumentException(sb.toString());
        }
        this.getHighSpeedVideoSizesFor = blockCipher;
        int blockSize = blockCipher.getBlockSize();
        this.Camera2StreamConfigurationMap = blockSize;
        this.getInputFormats = i / 8;
        this.getHighResolutionOutputSizeshNQ4ISI = new byte[blockSize];
    }

    public G3413CTRBlockCipher(org.bouncycastle.crypto.BlockCipher blockCipher) {
        this(blockCipher, blockCipher.getBlockSize() * 8);
    }
}
