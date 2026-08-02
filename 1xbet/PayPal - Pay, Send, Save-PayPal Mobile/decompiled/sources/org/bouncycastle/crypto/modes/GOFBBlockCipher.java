package org.bouncycastle.crypto.modes;

/* loaded from: classes17.dex */
public class GOFBBlockCipher extends org.bouncycastle.crypto.StreamBlockCipher {
    int Camera2StreamConfigurationMap;
    private byte[] getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    boolean getHighSpeedVideoFpsRangesFor;
    private final int getHighSpeedVideoSizes;
    private int getInputFormats;
    private byte[] getInputSizeshNQ4ISI;
    private final org.bouncycastle.crypto.BlockCipher getOutputFormats;
    private byte[] getOutputMinFrameDuration;

    @Override // org.bouncycastle.crypto.BlockCipher
    public void reset() {
        this.getHighSpeedVideoFpsRangesFor = true;
        this.Camera2StreamConfigurationMap = 0;
        this.getHighSpeedVideoFpsRanges = 0;
        byte[] bArr = this.getHighResolutionOutputSizeshNQ4ISI;
        java.lang.System.arraycopy(bArr, 0, this.getInputSizeshNQ4ISI, 0, bArr.length);
        this.getInputFormats = 0;
        this.getOutputFormats.reset();
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public int processBlock(byte[] bArr, int i, byte[] bArr2, int i2) throws org.bouncycastle.crypto.DataLengthException, java.lang.IllegalStateException {
        processBytes(bArr, i, this.getHighSpeedVideoSizes, bArr2, i2);
        return this.getHighSpeedVideoSizes;
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public void init(boolean z, org.bouncycastle.crypto.CipherParameters cipherParameters) throws java.lang.IllegalArgumentException {
        org.bouncycastle.crypto.BlockCipher blockCipher;
        this.getHighSpeedVideoFpsRangesFor = true;
        this.Camera2StreamConfigurationMap = 0;
        this.getHighSpeedVideoFpsRanges = 0;
        if (cipherParameters instanceof org.bouncycastle.crypto.params.ParametersWithIV) {
            org.bouncycastle.crypto.params.ParametersWithIV parametersWithIV = (org.bouncycastle.crypto.params.ParametersWithIV) cipherParameters;
            byte[] iv = parametersWithIV.getIV();
            int length = iv.length;
            byte[] bArr = this.getHighResolutionOutputSizeshNQ4ISI;
            if (length < bArr.length) {
                java.lang.System.arraycopy(iv, 0, bArr, bArr.length - iv.length, iv.length);
                int i = 0;
                while (true) {
                    byte[] bArr2 = this.getHighResolutionOutputSizeshNQ4ISI;
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
            blockCipher = this.getOutputFormats;
            cipherParameters = parametersWithIV.getParameters();
        } else {
            reset();
            if (cipherParameters == null) {
                return;
            } else {
                blockCipher = this.getOutputFormats;
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
        sb.append(this.getOutputFormats.getAlgorithmName());
        sb.append("/GCTR");
        return sb.toString();
    }

    @Override // org.bouncycastle.crypto.StreamBlockCipher
    public byte calculateByte(byte b) {
        if (this.getInputFormats == 0) {
            if (this.getHighSpeedVideoFpsRangesFor) {
                this.getHighSpeedVideoFpsRangesFor = false;
                this.getOutputFormats.processBlock(this.getInputSizeshNQ4ISI, 0, this.getOutputMinFrameDuration, 0);
                this.Camera2StreamConfigurationMap = getHighSpeedVideoSizes(this.getOutputMinFrameDuration, 0);
                this.getHighSpeedVideoFpsRanges = getHighSpeedVideoSizes(this.getOutputMinFrameDuration, 4);
            }
            int i = this.Camera2StreamConfigurationMap + android.R.attr.cacheColorHint;
            this.Camera2StreamConfigurationMap = i;
            int i2 = this.getHighSpeedVideoFpsRanges;
            int i3 = i2 + android.R.attr.hand_minute;
            this.getHighSpeedVideoFpsRanges = i3;
            if (i3 < 16843012 && i3 > 0) {
                this.getHighSpeedVideoFpsRanges = i2 + android.R.attr.format;
            }
            getHighResolutionOutputSizeshNQ4ISI(i, this.getInputSizeshNQ4ISI, 0);
            getHighResolutionOutputSizeshNQ4ISI(this.getHighSpeedVideoFpsRanges, this.getInputSizeshNQ4ISI, 4);
            this.getOutputFormats.processBlock(this.getInputSizeshNQ4ISI, 0, this.getOutputMinFrameDuration, 0);
        }
        byte[] bArr = this.getOutputMinFrameDuration;
        int i4 = this.getInputFormats;
        int i5 = i4 + 1;
        this.getInputFormats = i5;
        byte b2 = (byte) (b ^ bArr[i4]);
        int i6 = this.getHighSpeedVideoSizes;
        if (i5 == i6) {
            this.getInputFormats = 0;
            byte[] bArr2 = this.getInputSizeshNQ4ISI;
            java.lang.System.arraycopy(bArr2, i6, bArr2, 0, bArr2.length - i6);
            byte[] bArr3 = this.getOutputMinFrameDuration;
            byte[] bArr4 = this.getInputSizeshNQ4ISI;
            int length = bArr4.length;
            int i7 = this.getHighSpeedVideoSizes;
            java.lang.System.arraycopy(bArr3, 0, bArr4, length - i7, i7);
        }
        return b2;
    }

    private static void getHighResolutionOutputSizeshNQ4ISI(int i, byte[] bArr, int i2) {
        bArr[i2 + 3] = (byte) (i >>> 24);
        bArr[i2 + 2] = (byte) (i >>> 16);
        bArr[i2 + 1] = (byte) (i >>> 8);
        bArr[i2] = (byte) i;
    }

    private static int getHighSpeedVideoSizes(byte[] bArr, int i) {
        return ((bArr[i + 3] << com.google.common.base.Ascii.CAN) & (-16777216)) + ((bArr[i + 2] << 16) & 16711680) + ((bArr[i + 1] << 8) & androidx.core.view.MotionEventCompat.ACTION_POINTER_INDEX_MASK) + (bArr[i] & 255);
    }

    public GOFBBlockCipher(org.bouncycastle.crypto.BlockCipher blockCipher) {
        super(blockCipher);
        this.getHighSpeedVideoFpsRangesFor = true;
        this.getOutputFormats = blockCipher;
        int blockSize = blockCipher.getBlockSize();
        this.getHighSpeedVideoSizes = blockSize;
        if (blockSize != 8) {
            throw new java.lang.IllegalArgumentException("GCTR only for 64 bit block ciphers");
        }
        this.getHighResolutionOutputSizeshNQ4ISI = new byte[blockCipher.getBlockSize()];
        this.getInputSizeshNQ4ISI = new byte[blockCipher.getBlockSize()];
        this.getOutputMinFrameDuration = new byte[blockCipher.getBlockSize()];
    }
}
