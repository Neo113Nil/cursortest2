package org.bouncycastle.crypto.macs;

/* loaded from: classes17.dex */
public class DSTU7624Mac implements org.bouncycastle.crypto.Mac {
    private byte[] Camera2StreamConfigurationMap;
    private int getHighResolutionOutputSizeshNQ4ISI;
    private byte[] getHighSpeedVideoFpsRanges;
    private int getHighSpeedVideoFpsRangesFor;
    private byte[] getHighSpeedVideoSizes;
    private org.bouncycastle.crypto.engines.DSTU7624Engine getHighSpeedVideoSizesFor;
    private byte[] getInputFormats;
    private boolean getInputSizeshNQ4ISI = false;
    private int getOutputFormats;

    @Override // org.bouncycastle.crypto.Mac
    public void update(byte[] bArr, int i, int i2) {
        if (i2 < 0) {
            throw new java.lang.IllegalArgumentException("can't have a negative input length!");
        }
        int blockSize = this.getHighSpeedVideoSizesFor.getBlockSize();
        int i3 = this.getHighResolutionOutputSizeshNQ4ISI;
        int i4 = blockSize - i3;
        if (i2 > i4) {
            java.lang.System.arraycopy(bArr, i, this.getHighSpeedVideoSizes, i3, i4);
            Camera2StreamConfigurationMap(this.getHighSpeedVideoSizes, 0);
            this.getHighResolutionOutputSizeshNQ4ISI = 0;
            i2 -= i4;
            i += i4;
            while (i2 > blockSize) {
                Camera2StreamConfigurationMap(bArr, i);
                i2 -= blockSize;
                i += blockSize;
            }
        }
        java.lang.System.arraycopy(bArr, i, this.getHighSpeedVideoSizes, this.getHighResolutionOutputSizeshNQ4ISI, i2);
        this.getHighResolutionOutputSizeshNQ4ISI += i2;
    }

    @Override // org.bouncycastle.crypto.Mac
    public void update(byte b) {
        int i = this.getHighResolutionOutputSizeshNQ4ISI;
        byte[] bArr = this.getHighSpeedVideoSizes;
        if (i == bArr.length) {
            Camera2StreamConfigurationMap(bArr, 0);
            this.getHighResolutionOutputSizeshNQ4ISI = 0;
        }
        byte[] bArr2 = this.getHighSpeedVideoSizes;
        int i2 = this.getHighResolutionOutputSizeshNQ4ISI;
        this.getHighResolutionOutputSizeshNQ4ISI = i2 + 1;
        bArr2[i2] = b;
    }

    @Override // org.bouncycastle.crypto.Mac
    public void reset() {
        org.bouncycastle.util.Arrays.fill(this.getHighSpeedVideoFpsRanges, (byte) 0);
        org.bouncycastle.util.Arrays.fill(this.Camera2StreamConfigurationMap, (byte) 0);
        org.bouncycastle.util.Arrays.fill(this.getInputFormats, (byte) 0);
        org.bouncycastle.util.Arrays.fill(this.getHighSpeedVideoSizes, (byte) 0);
        this.getHighSpeedVideoSizesFor.reset();
        if (this.getInputSizeshNQ4ISI) {
            org.bouncycastle.crypto.engines.DSTU7624Engine dSTU7624Engine = this.getHighSpeedVideoSizesFor;
            byte[] bArr = this.getInputFormats;
            dSTU7624Engine.processBlock(bArr, 0, bArr, 0);
        }
        this.getHighResolutionOutputSizeshNQ4ISI = 0;
    }

    @Override // org.bouncycastle.crypto.Mac
    public void init(org.bouncycastle.crypto.CipherParameters cipherParameters) throws java.lang.IllegalArgumentException {
        if (!(cipherParameters instanceof org.bouncycastle.crypto.params.KeyParameter)) {
            throw new java.lang.IllegalArgumentException("Invalid parameter passed to DSTU7624Mac");
        }
        this.getHighSpeedVideoSizesFor.init(true, cipherParameters);
        this.getInputSizeshNQ4ISI = true;
        reset();
    }

    @Override // org.bouncycastle.crypto.Mac
    public int getMacSize() {
        return this.getOutputFormats;
    }

    @Override // org.bouncycastle.crypto.Mac
    public java.lang.String getAlgorithmName() {
        return "DSTU7624Mac";
    }

    @Override // org.bouncycastle.crypto.Mac
    public int doFinal(byte[] bArr, int i) throws org.bouncycastle.crypto.DataLengthException, java.lang.IllegalStateException {
        int i2 = this.getHighResolutionOutputSizeshNQ4ISI;
        byte[] bArr2 = this.getHighSpeedVideoSizes;
        if (i2 % bArr2.length != 0) {
            throw new org.bouncycastle.crypto.DataLengthException("input must be a multiple of blocksize");
        }
        getHighSpeedVideoFpsRanges(this.getHighSpeedVideoFpsRanges, bArr2, 0, this.Camera2StreamConfigurationMap);
        getHighSpeedVideoFpsRanges(this.Camera2StreamConfigurationMap, this.getInputFormats, 0, this.getHighSpeedVideoFpsRanges);
        org.bouncycastle.crypto.engines.DSTU7624Engine dSTU7624Engine = this.getHighSpeedVideoSizesFor;
        byte[] bArr3 = this.getHighSpeedVideoFpsRanges;
        dSTU7624Engine.processBlock(bArr3, 0, bArr3, 0);
        int i3 = this.getOutputFormats;
        if (i3 + i > bArr.length) {
            throw new org.bouncycastle.crypto.OutputLengthException("output buffer too short");
        }
        java.lang.System.arraycopy(this.getHighSpeedVideoFpsRanges, 0, bArr, i, i3);
        reset();
        return this.getOutputFormats;
    }

    private void getHighSpeedVideoFpsRanges(byte[] bArr, byte[] bArr2, int i, byte[] bArr3) {
        int length = bArr.length;
        int i2 = this.getHighSpeedVideoFpsRangesFor;
        if (length < i2 || bArr2.length - i < i2 || bArr3.length < i2) {
            throw new java.lang.IllegalArgumentException("some of input buffers too short");
        }
        for (int i3 = 0; i3 < this.getHighSpeedVideoFpsRangesFor; i3++) {
            bArr3[i3] = (byte) (bArr[i3] ^ bArr2[i3 + i]);
        }
    }

    private void Camera2StreamConfigurationMap(byte[] bArr, int i) {
        getHighSpeedVideoFpsRanges(this.getHighSpeedVideoFpsRanges, bArr, i, this.Camera2StreamConfigurationMap);
        this.getHighSpeedVideoSizesFor.processBlock(this.Camera2StreamConfigurationMap, 0, this.getHighSpeedVideoFpsRanges, 0);
    }

    public DSTU7624Mac(int i, int i2) {
        this.getHighSpeedVideoSizesFor = new org.bouncycastle.crypto.engines.DSTU7624Engine(i);
        int i3 = i / 8;
        this.getHighSpeedVideoFpsRangesFor = i3;
        this.getOutputFormats = i2 / 8;
        this.getHighSpeedVideoFpsRanges = new byte[i3];
        this.getInputFormats = new byte[i3];
        this.Camera2StreamConfigurationMap = new byte[i3];
        this.getHighSpeedVideoSizes = new byte[i3];
    }
}
