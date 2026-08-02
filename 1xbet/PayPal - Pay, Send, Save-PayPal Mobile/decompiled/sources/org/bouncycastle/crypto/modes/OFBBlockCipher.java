package org.bouncycastle.crypto.modes;

/* loaded from: classes17.dex */
public class OFBBlockCipher extends org.bouncycastle.crypto.StreamBlockCipher {
    private int Camera2StreamConfigurationMap;
    private byte[] getHighResolutionOutputSizeshNQ4ISI;
    private byte[] getHighSpeedVideoFpsRanges;
    private final org.bouncycastle.crypto.BlockCipher getHighSpeedVideoFpsRangesFor;
    private final int getHighSpeedVideoSizes;
    private byte[] getHighSpeedVideoSizesFor;

    @Override // org.bouncycastle.crypto.BlockCipher
    public void reset() {
        byte[] bArr = this.getHighSpeedVideoFpsRanges;
        java.lang.System.arraycopy(bArr, 0, this.getHighSpeedVideoSizesFor, 0, bArr.length);
        this.Camera2StreamConfigurationMap = 0;
        this.getHighSpeedVideoFpsRangesFor.reset();
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public int processBlock(byte[] bArr, int i, byte[] bArr2, int i2) throws org.bouncycastle.crypto.DataLengthException, java.lang.IllegalStateException {
        processBytes(bArr, i, this.getHighSpeedVideoSizes, bArr2, i2);
        return this.getHighSpeedVideoSizes;
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public void init(boolean z, org.bouncycastle.crypto.CipherParameters cipherParameters) throws java.lang.IllegalArgumentException {
        org.bouncycastle.crypto.BlockCipher blockCipher;
        if (cipherParameters instanceof org.bouncycastle.crypto.params.ParametersWithIV) {
            org.bouncycastle.crypto.params.ParametersWithIV parametersWithIV = (org.bouncycastle.crypto.params.ParametersWithIV) cipherParameters;
            byte[] iv = parametersWithIV.getIV();
            int length = iv.length;
            byte[] bArr = this.getHighSpeedVideoFpsRanges;
            if (length < bArr.length) {
                java.lang.System.arraycopy(iv, 0, bArr, bArr.length - iv.length, iv.length);
                int i = 0;
                while (true) {
                    byte[] bArr2 = this.getHighSpeedVideoFpsRanges;
                    if (i >= bArr2.length - iv.length) {
                        break;
                    }
                    bArr2[i] = 0;
                    i++;
                }
            } else {
                java.lang.System.arraycopy(iv, 0, bArr, 0, bArr.length);
            }
            reset();
            if (parametersWithIV.getParameters() == null) {
                return;
            }
            blockCipher = this.getHighSpeedVideoFpsRangesFor;
            cipherParameters = parametersWithIV.getParameters();
        } else {
            reset();
            if (cipherParameters == null) {
                return;
            } else {
                blockCipher = this.getHighSpeedVideoFpsRangesFor;
            }
        }
        blockCipher.init(true, cipherParameters);
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public int getBlockSize() {
        return this.getHighSpeedVideoSizes;
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public java.lang.String getAlgorithmName() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(this.getHighSpeedVideoFpsRangesFor.getAlgorithmName());
        sb.append("/OFB");
        sb.append(this.getHighSpeedVideoSizes * 8);
        return sb.toString();
    }

    @Override // org.bouncycastle.crypto.StreamBlockCipher
    public byte calculateByte(byte b) throws org.bouncycastle.crypto.DataLengthException, java.lang.IllegalStateException {
        if (this.Camera2StreamConfigurationMap == 0) {
            this.getHighSpeedVideoFpsRangesFor.processBlock(this.getHighSpeedVideoSizesFor, 0, this.getHighResolutionOutputSizeshNQ4ISI, 0);
        }
        byte[] bArr = this.getHighResolutionOutputSizeshNQ4ISI;
        int i = this.Camera2StreamConfigurationMap;
        int i2 = i + 1;
        this.Camera2StreamConfigurationMap = i2;
        byte b2 = (byte) (b ^ bArr[i]);
        int i3 = this.getHighSpeedVideoSizes;
        if (i2 == i3) {
            this.Camera2StreamConfigurationMap = 0;
            byte[] bArr2 = this.getHighSpeedVideoSizesFor;
            java.lang.System.arraycopy(bArr2, i3, bArr2, 0, bArr2.length - i3);
            byte[] bArr3 = this.getHighResolutionOutputSizeshNQ4ISI;
            byte[] bArr4 = this.getHighSpeedVideoSizesFor;
            int length = bArr4.length;
            int i4 = this.getHighSpeedVideoSizes;
            java.lang.System.arraycopy(bArr3, 0, bArr4, length - i4, i4);
        }
        return b2;
    }

    public OFBBlockCipher(org.bouncycastle.crypto.BlockCipher blockCipher, int i) {
        super(blockCipher);
        if (i > blockCipher.getBlockSize() * 8 || i < 8 || i % 8 != 0) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("0FB");
            sb.append(i);
            sb.append(" not supported");
            throw new java.lang.IllegalArgumentException(sb.toString());
        }
        this.getHighSpeedVideoFpsRangesFor = blockCipher;
        this.getHighSpeedVideoSizes = i / 8;
        this.getHighSpeedVideoFpsRanges = new byte[blockCipher.getBlockSize()];
        this.getHighSpeedVideoSizesFor = new byte[blockCipher.getBlockSize()];
        this.getHighResolutionOutputSizeshNQ4ISI = new byte[blockCipher.getBlockSize()];
    }
}
