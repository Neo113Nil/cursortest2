package org.bouncycastle.crypto.modes;

/* loaded from: classes17.dex */
public class CFBBlockCipher extends org.bouncycastle.crypto.StreamBlockCipher {
    private int Camera2StreamConfigurationMap;
    private byte[] getHighResolutionOutputSizeshNQ4ISI;
    private int getHighSpeedVideoFpsRanges;
    private byte[] getHighSpeedVideoFpsRangesFor;
    private byte[] getHighSpeedVideoSizes;
    private org.bouncycastle.crypto.BlockCipher getHighSpeedVideoSizesFor;
    private boolean getInputFormats;
    private byte[] getInputSizeshNQ4ISI;

    @Override // org.bouncycastle.crypto.StreamBlockCipher
    public byte calculateByte(byte b) throws org.bouncycastle.crypto.DataLengthException, java.lang.IllegalStateException {
        if (this.getInputFormats) {
            if (this.Camera2StreamConfigurationMap == 0) {
                this.getHighSpeedVideoSizesFor.processBlock(this.getHighSpeedVideoSizes, 0, this.getHighResolutionOutputSizeshNQ4ISI, 0);
            }
            byte[] bArr = this.getHighResolutionOutputSizeshNQ4ISI;
            int i = this.Camera2StreamConfigurationMap;
            byte b2 = (byte) (b ^ bArr[i]);
            byte[] bArr2 = this.getInputSizeshNQ4ISI;
            int i2 = i + 1;
            this.Camera2StreamConfigurationMap = i2;
            bArr2[i] = b2;
            int i3 = this.getHighSpeedVideoFpsRanges;
            if (i2 == i3) {
                this.Camera2StreamConfigurationMap = 0;
                byte[] bArr3 = this.getHighSpeedVideoSizes;
                java.lang.System.arraycopy(bArr3, i3, bArr3, 0, bArr3.length - i3);
                byte[] bArr4 = this.getInputSizeshNQ4ISI;
                byte[] bArr5 = this.getHighSpeedVideoSizes;
                int length = bArr5.length;
                int i4 = this.getHighSpeedVideoFpsRanges;
                java.lang.System.arraycopy(bArr4, 0, bArr5, length - i4, i4);
            }
            return b2;
        }
        if (this.Camera2StreamConfigurationMap == 0) {
            this.getHighSpeedVideoSizesFor.processBlock(this.getHighSpeedVideoSizes, 0, this.getHighResolutionOutputSizeshNQ4ISI, 0);
        }
        byte[] bArr6 = this.getInputSizeshNQ4ISI;
        int i5 = this.Camera2StreamConfigurationMap;
        bArr6[i5] = b;
        byte[] bArr7 = this.getHighResolutionOutputSizeshNQ4ISI;
        int i6 = i5 + 1;
        this.Camera2StreamConfigurationMap = i6;
        byte b3 = (byte) (b ^ bArr7[i5]);
        int i7 = this.getHighSpeedVideoFpsRanges;
        if (i6 == i7) {
            this.Camera2StreamConfigurationMap = 0;
            byte[] bArr8 = this.getHighSpeedVideoSizes;
            java.lang.System.arraycopy(bArr8, i7, bArr8, 0, bArr8.length - i7);
            byte[] bArr9 = this.getInputSizeshNQ4ISI;
            byte[] bArr10 = this.getHighSpeedVideoSizes;
            int length2 = bArr10.length;
            int i8 = this.getHighSpeedVideoFpsRanges;
            java.lang.System.arraycopy(bArr9, 0, bArr10, length2 - i8, i8);
        }
        return b3;
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public void reset() {
        byte[] bArr = this.getHighSpeedVideoFpsRangesFor;
        java.lang.System.arraycopy(bArr, 0, this.getHighSpeedVideoSizes, 0, bArr.length);
        org.bouncycastle.util.Arrays.fill(this.getInputSizeshNQ4ISI, (byte) 0);
        this.Camera2StreamConfigurationMap = 0;
        this.getHighSpeedVideoSizesFor.reset();
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public int processBlock(byte[] bArr, int i, byte[] bArr2, int i2) throws org.bouncycastle.crypto.DataLengthException, java.lang.IllegalStateException {
        processBytes(bArr, i, this.getHighSpeedVideoFpsRanges, bArr2, i2);
        return this.getHighSpeedVideoFpsRanges;
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public void init(boolean z, org.bouncycastle.crypto.CipherParameters cipherParameters) throws java.lang.IllegalArgumentException {
        org.bouncycastle.crypto.BlockCipher blockCipher;
        this.getInputFormats = z;
        if (cipherParameters instanceof org.bouncycastle.crypto.params.ParametersWithIV) {
            org.bouncycastle.crypto.params.ParametersWithIV parametersWithIV = (org.bouncycastle.crypto.params.ParametersWithIV) cipherParameters;
            byte[] iv = parametersWithIV.getIV();
            int length = iv.length;
            byte[] bArr = this.getHighSpeedVideoFpsRangesFor;
            if (length < bArr.length) {
                java.lang.System.arraycopy(iv, 0, bArr, bArr.length - iv.length, iv.length);
                int i = 0;
                while (true) {
                    byte[] bArr2 = this.getHighSpeedVideoFpsRangesFor;
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
            blockCipher = this.getHighSpeedVideoSizesFor;
            cipherParameters = parametersWithIV.getParameters();
        } else {
            reset();
            if (cipherParameters == null) {
                return;
            } else {
                blockCipher = this.getHighSpeedVideoSizesFor;
            }
        }
        blockCipher.init(true, cipherParameters);
    }

    public byte[] getCurrentIV() {
        return org.bouncycastle.util.Arrays.clone(this.getHighSpeedVideoSizes);
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public int getBlockSize() {
        return this.getHighSpeedVideoFpsRanges;
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public java.lang.String getAlgorithmName() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(this.getHighSpeedVideoSizesFor.getAlgorithmName());
        sb.append("/CFB");
        sb.append(this.getHighSpeedVideoFpsRanges * 8);
        return sb.toString();
    }

    public int encryptBlock(byte[] bArr, int i, byte[] bArr2, int i2) throws org.bouncycastle.crypto.DataLengthException, java.lang.IllegalStateException {
        processBytes(bArr, i, this.getHighSpeedVideoFpsRanges, bArr2, i2);
        return this.getHighSpeedVideoFpsRanges;
    }

    public int decryptBlock(byte[] bArr, int i, byte[] bArr2, int i2) throws org.bouncycastle.crypto.DataLengthException, java.lang.IllegalStateException {
        processBytes(bArr, i, this.getHighSpeedVideoFpsRanges, bArr2, i2);
        return this.getHighSpeedVideoFpsRanges;
    }

    public CFBBlockCipher(org.bouncycastle.crypto.BlockCipher blockCipher, int i) {
        super(blockCipher);
        this.getHighSpeedVideoSizesFor = null;
        if (i > blockCipher.getBlockSize() * 8 || i < 8 || i % 8 != 0) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("CFB");
            sb.append(i);
            sb.append(" not supported");
            throw new java.lang.IllegalArgumentException(sb.toString());
        }
        this.getHighSpeedVideoSizesFor = blockCipher;
        this.getHighSpeedVideoFpsRanges = i / 8;
        this.getHighSpeedVideoFpsRangesFor = new byte[blockCipher.getBlockSize()];
        this.getHighSpeedVideoSizes = new byte[blockCipher.getBlockSize()];
        this.getHighResolutionOutputSizeshNQ4ISI = new byte[blockCipher.getBlockSize()];
        this.getInputSizeshNQ4ISI = new byte[this.getHighSpeedVideoFpsRanges];
    }
}
