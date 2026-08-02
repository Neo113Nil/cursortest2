package org.bouncycastle.crypto.modes;

/* loaded from: classes17.dex */
public class G3413CFBBlockCipher extends org.bouncycastle.crypto.StreamBlockCipher {
    private byte[] Camera2StreamConfigurationMap;
    private int getHighResolutionOutputSizeshNQ4ISI;
    private int getHighSpeedVideoFpsRanges;
    private byte[] getHighSpeedVideoFpsRangesFor;
    private org.bouncycastle.crypto.BlockCipher getHighSpeedVideoSizes;
    private byte[] getHighSpeedVideoSizesFor;
    private byte[] getInputFormats;
    private boolean getInputSizeshNQ4ISI;
    private int getOutputFormats;
    private boolean getOutputMinFrameDuration;
    private final int getOutputStallDuration;

    @Override // org.bouncycastle.crypto.StreamBlockCipher
    public byte calculateByte(byte b) {
        if (this.getHighResolutionOutputSizeshNQ4ISI == 0) {
            byte[] highSpeedVideoFpsRanges = org.bouncycastle.crypto.modes.GOST3413CipherUtil.getHighSpeedVideoFpsRanges(this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoFpsRanges);
            byte[] bArr = new byte[highSpeedVideoFpsRanges.length];
            this.getHighSpeedVideoSizes.processBlock(highSpeedVideoFpsRanges, 0, bArr, 0);
            this.getInputFormats = org.bouncycastle.crypto.modes.GOST3413CipherUtil.getHighSpeedVideoFpsRanges(bArr, this.getOutputStallDuration);
        }
        byte[] bArr2 = this.getInputFormats;
        int i = this.getHighResolutionOutputSizeshNQ4ISI;
        byte b2 = (byte) (bArr2[i] ^ b);
        byte[] bArr3 = this.getHighSpeedVideoSizesFor;
        int i2 = i + 1;
        this.getHighResolutionOutputSizeshNQ4ISI = i2;
        if (this.getInputSizeshNQ4ISI) {
            b = b2;
        }
        bArr3[i] = b;
        if (i2 == getBlockSize()) {
            this.getHighResolutionOutputSizeshNQ4ISI = 0;
            byte[] bArr4 = this.getHighSpeedVideoSizesFor;
            byte[] highSpeedVideoFpsRangesFor = org.bouncycastle.crypto.modes.GOST3413CipherUtil.getHighSpeedVideoFpsRangesFor(this.getHighSpeedVideoFpsRangesFor, this.getOutputFormats - this.getOutputStallDuration);
            java.lang.System.arraycopy(highSpeedVideoFpsRangesFor, 0, this.getHighSpeedVideoFpsRangesFor, 0, highSpeedVideoFpsRangesFor.length);
            java.lang.System.arraycopy(bArr4, 0, this.getHighSpeedVideoFpsRangesFor, highSpeedVideoFpsRangesFor.length, this.getOutputFormats - highSpeedVideoFpsRangesFor.length);
        }
        return b2;
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public void init(boolean z, org.bouncycastle.crypto.CipherParameters cipherParameters) throws java.lang.IllegalArgumentException {
        org.bouncycastle.crypto.BlockCipher blockCipher;
        this.getInputSizeshNQ4ISI = z;
        if (!(cipherParameters instanceof org.bouncycastle.crypto.params.ParametersWithIV)) {
            int i = this.getHighSpeedVideoFpsRanges * 2;
            this.getOutputFormats = i;
            byte[] bArr = new byte[i];
            this.getHighSpeedVideoFpsRangesFor = bArr;
            byte[] bArr2 = new byte[i];
            this.Camera2StreamConfigurationMap = bArr2;
            java.lang.System.arraycopy(bArr2, 0, bArr, 0, bArr2.length);
            if (cipherParameters != null) {
                blockCipher = this.getHighSpeedVideoSizes;
                blockCipher.init(true, cipherParameters);
            }
            this.getOutputMinFrameDuration = true;
        }
        org.bouncycastle.crypto.params.ParametersWithIV parametersWithIV = (org.bouncycastle.crypto.params.ParametersWithIV) cipherParameters;
        byte[] iv = parametersWithIV.getIV();
        if (iv.length < this.getHighSpeedVideoFpsRanges) {
            throw new java.lang.IllegalArgumentException("Parameter m must blockSize <= m");
        }
        int length = iv.length;
        this.getOutputFormats = length;
        this.getHighSpeedVideoFpsRangesFor = new byte[length];
        this.Camera2StreamConfigurationMap = new byte[length];
        byte[] clone = org.bouncycastle.util.Arrays.clone(iv);
        this.Camera2StreamConfigurationMap = clone;
        java.lang.System.arraycopy(clone, 0, this.getHighSpeedVideoFpsRangesFor, 0, clone.length);
        if (parametersWithIV.getParameters() != null) {
            blockCipher = this.getHighSpeedVideoSizes;
            cipherParameters = parametersWithIV.getParameters();
            blockCipher.init(true, cipherParameters);
        }
        this.getOutputMinFrameDuration = true;
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public void reset() {
        this.getHighResolutionOutputSizeshNQ4ISI = 0;
        org.bouncycastle.util.Arrays.clear(this.getHighSpeedVideoSizesFor);
        org.bouncycastle.util.Arrays.clear(this.getInputFormats);
        if (this.getOutputMinFrameDuration) {
            byte[] bArr = this.Camera2StreamConfigurationMap;
            java.lang.System.arraycopy(bArr, 0, this.getHighSpeedVideoFpsRangesFor, 0, bArr.length);
            this.getHighSpeedVideoSizes.reset();
        }
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public int processBlock(byte[] bArr, int i, byte[] bArr2, int i2) throws org.bouncycastle.crypto.DataLengthException, java.lang.IllegalStateException {
        processBytes(bArr, i, getBlockSize(), bArr2, i2);
        return getBlockSize();
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public int getBlockSize() {
        return this.getOutputStallDuration;
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public java.lang.String getAlgorithmName() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(this.getHighSpeedVideoSizes.getAlgorithmName());
        sb.append("/CFB");
        sb.append(this.getHighSpeedVideoFpsRanges * 8);
        return sb.toString();
    }

    public G3413CFBBlockCipher(org.bouncycastle.crypto.BlockCipher blockCipher, int i) {
        super(blockCipher);
        this.getOutputMinFrameDuration = false;
        if (i < 0 || i > blockCipher.getBlockSize() * 8) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Parameter bitBlockSize must be in range 0 < bitBlockSize <= ");
            sb.append(blockCipher.getBlockSize() * 8);
            throw new java.lang.IllegalArgumentException(sb.toString());
        }
        this.getHighSpeedVideoFpsRanges = blockCipher.getBlockSize();
        this.getHighSpeedVideoSizes = blockCipher;
        this.getOutputStallDuration = i / 8;
        this.getHighSpeedVideoSizesFor = new byte[getBlockSize()];
    }

    public G3413CFBBlockCipher(org.bouncycastle.crypto.BlockCipher blockCipher) {
        this(blockCipher, blockCipher.getBlockSize() * 8);
    }
}
