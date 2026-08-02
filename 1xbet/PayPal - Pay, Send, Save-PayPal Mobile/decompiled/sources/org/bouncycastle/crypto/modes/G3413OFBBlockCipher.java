package org.bouncycastle.crypto.modes;

/* loaded from: classes17.dex */
public class G3413OFBBlockCipher extends org.bouncycastle.crypto.StreamBlockCipher {
    private byte[] Camera2StreamConfigurationMap;
    private int getHighResolutionOutputSizeshNQ4ISI;
    private byte[] getHighSpeedVideoFpsRanges;
    private int getHighSpeedVideoFpsRangesFor;
    private byte[] getHighSpeedVideoSizes;
    private org.bouncycastle.crypto.BlockCipher getHighSpeedVideoSizesFor;
    private boolean getInputSizeshNQ4ISI;
    private int getOutputFormats;

    @Override // org.bouncycastle.crypto.StreamBlockCipher
    public byte calculateByte(byte b) {
        if (this.getHighSpeedVideoFpsRangesFor == 0) {
            this.getHighSpeedVideoSizesFor.processBlock(org.bouncycastle.crypto.modes.GOST3413CipherUtil.getHighSpeedVideoFpsRanges(this.getHighSpeedVideoFpsRanges, this.getHighResolutionOutputSizeshNQ4ISI), 0, this.Camera2StreamConfigurationMap, 0);
        }
        byte[] bArr = this.Camera2StreamConfigurationMap;
        int i = this.getHighSpeedVideoFpsRangesFor;
        byte b2 = (byte) (b ^ bArr[i]);
        int i2 = i + 1;
        this.getHighSpeedVideoFpsRangesFor = i2;
        if (i2 == getBlockSize()) {
            this.getHighSpeedVideoFpsRangesFor = 0;
            byte[] highSpeedVideoFpsRangesFor = org.bouncycastle.crypto.modes.GOST3413CipherUtil.getHighSpeedVideoFpsRangesFor(this.getHighSpeedVideoFpsRanges, this.getOutputFormats - this.getHighResolutionOutputSizeshNQ4ISI);
            java.lang.System.arraycopy(highSpeedVideoFpsRangesFor, 0, this.getHighSpeedVideoFpsRanges, 0, highSpeedVideoFpsRangesFor.length);
            java.lang.System.arraycopy(this.Camera2StreamConfigurationMap, 0, this.getHighSpeedVideoFpsRanges, highSpeedVideoFpsRangesFor.length, this.getOutputFormats - highSpeedVideoFpsRangesFor.length);
        }
        return b2;
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public void init(boolean z, org.bouncycastle.crypto.CipherParameters cipherParameters) throws java.lang.IllegalArgumentException {
        org.bouncycastle.crypto.BlockCipher blockCipher;
        if (!(cipherParameters instanceof org.bouncycastle.crypto.params.ParametersWithIV)) {
            int i = this.getHighResolutionOutputSizeshNQ4ISI * 2;
            this.getOutputFormats = i;
            byte[] bArr = new byte[i];
            this.getHighSpeedVideoFpsRanges = bArr;
            byte[] bArr2 = new byte[i];
            this.getHighSpeedVideoSizes = bArr2;
            java.lang.System.arraycopy(bArr2, 0, bArr, 0, bArr2.length);
            if (cipherParameters != null) {
                blockCipher = this.getHighSpeedVideoSizesFor;
                blockCipher.init(true, cipherParameters);
            }
            this.getInputSizeshNQ4ISI = true;
        }
        org.bouncycastle.crypto.params.ParametersWithIV parametersWithIV = (org.bouncycastle.crypto.params.ParametersWithIV) cipherParameters;
        byte[] iv = parametersWithIV.getIV();
        if (iv.length < this.getHighResolutionOutputSizeshNQ4ISI) {
            throw new java.lang.IllegalArgumentException("Parameter m must blockSize <= m");
        }
        int length = iv.length;
        this.getOutputFormats = length;
        this.getHighSpeedVideoFpsRanges = new byte[length];
        this.getHighSpeedVideoSizes = new byte[length];
        byte[] clone = org.bouncycastle.util.Arrays.clone(iv);
        this.getHighSpeedVideoSizes = clone;
        java.lang.System.arraycopy(clone, 0, this.getHighSpeedVideoFpsRanges, 0, clone.length);
        if (parametersWithIV.getParameters() != null) {
            blockCipher = this.getHighSpeedVideoSizesFor;
            cipherParameters = parametersWithIV.getParameters();
            blockCipher.init(true, cipherParameters);
        }
        this.getInputSizeshNQ4ISI = true;
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public void reset() {
        if (this.getInputSizeshNQ4ISI) {
            byte[] bArr = this.getHighSpeedVideoSizes;
            java.lang.System.arraycopy(bArr, 0, this.getHighSpeedVideoFpsRanges, 0, bArr.length);
            org.bouncycastle.util.Arrays.clear(this.Camera2StreamConfigurationMap);
            this.getHighSpeedVideoFpsRangesFor = 0;
            this.getHighSpeedVideoSizesFor.reset();
        }
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public int processBlock(byte[] bArr, int i, byte[] bArr2, int i2) throws org.bouncycastle.crypto.DataLengthException, java.lang.IllegalStateException {
        processBytes(bArr, i, this.getHighResolutionOutputSizeshNQ4ISI, bArr2, i2);
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public int getBlockSize() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public java.lang.String getAlgorithmName() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(this.getHighSpeedVideoSizesFor.getAlgorithmName());
        sb.append("/OFB");
        return sb.toString();
    }

    public G3413OFBBlockCipher(org.bouncycastle.crypto.BlockCipher blockCipher) {
        super(blockCipher);
        this.getInputSizeshNQ4ISI = false;
        int blockSize = blockCipher.getBlockSize();
        this.getHighResolutionOutputSizeshNQ4ISI = blockSize;
        this.getHighSpeedVideoSizesFor = blockCipher;
        this.Camera2StreamConfigurationMap = new byte[blockSize];
    }
}
