package org.bouncycastle.crypto.engines;

/* loaded from: classes17.dex */
public class Zuc256CoreEngine extends org.bouncycastle.crypto.engines.Zuc128CoreEngine {
    private byte[] getHighSpeedVideoSizes;
    private static final byte[] getHighResolutionOutputSizeshNQ4ISI = {34, 47, 36, 42, 109, 64, 64, 64, 64, 64, 64, 64, 64, 82, 16, 48};
    private static final byte[] Camera2StreamConfigurationMap = {34, 47, 37, 42, 109, 64, 64, 64, 64, 64, 64, 64, 64, 82, 16, 48};
    private static final byte[] getHighSpeedVideoFpsRanges = {35, 47, 36, 42, 109, 64, 64, 64, 64, 64, 64, 64, 64, 82, 16, 48};
    private static final byte[] getHighSpeedVideoFpsRangesFor = {35, 47, 37, 42, 109, 64, 64, 64, 64, 64, 64, 64, 64, 82, 16, 48};

    private static int Camera2StreamConfigurationMap(byte b, byte b2, byte b3, byte b4) {
        return ((b & 255) << 23) | ((b2 & 255) << 16) | ((b3 & 255) << 8) | (b4 & 255);
    }

    @Override // org.bouncycastle.crypto.engines.Zuc128CoreEngine
    protected int getMaxIterations() {
        return 625;
    }

    @Override // org.bouncycastle.crypto.engines.Zuc128CoreEngine
    protected void setKeyAndIV(int[] iArr, byte[] bArr, byte[] bArr2) {
        if (bArr == null || bArr.length != 32) {
            throw new java.lang.IllegalArgumentException("A key of 32 bytes is needed");
        }
        if (bArr2 == null || bArr2.length != 25) {
            throw new java.lang.IllegalArgumentException("An IV of 25 bytes is needed");
        }
        iArr[0] = Camera2StreamConfigurationMap(bArr[0], this.getHighSpeedVideoSizes[0], bArr[21], bArr[16]);
        iArr[1] = Camera2StreamConfigurationMap(bArr[1], this.getHighSpeedVideoSizes[1], bArr[22], bArr[17]);
        iArr[2] = Camera2StreamConfigurationMap(bArr[2], this.getHighSpeedVideoSizes[2], bArr[23], bArr[18]);
        iArr[3] = Camera2StreamConfigurationMap(bArr[3], this.getHighSpeedVideoSizes[3], bArr[24], bArr[19]);
        iArr[4] = Camera2StreamConfigurationMap(bArr[4], this.getHighSpeedVideoSizes[4], bArr[25], bArr[20]);
        iArr[5] = Camera2StreamConfigurationMap(bArr2[0], (byte) (this.getHighSpeedVideoSizes[5] | (bArr2[17] & 63)), bArr[5], bArr[26]);
        iArr[6] = Camera2StreamConfigurationMap(bArr2[1], (byte) (this.getHighSpeedVideoSizes[6] | (bArr2[18] & 63)), bArr[6], bArr[27]);
        iArr[7] = Camera2StreamConfigurationMap(bArr2[10], (byte) (this.getHighSpeedVideoSizes[7] | (bArr2[19] & 63)), bArr[7], bArr2[2]);
        iArr[8] = Camera2StreamConfigurationMap(bArr[8], (byte) (this.getHighSpeedVideoSizes[8] | (bArr2[20] & 63)), bArr2[3], bArr2[11]);
        iArr[9] = Camera2StreamConfigurationMap(bArr[9], (byte) ((bArr2[21] & 63) | this.getHighSpeedVideoSizes[9]), bArr2[12], bArr2[4]);
        iArr[10] = Camera2StreamConfigurationMap(bArr2[5], (byte) (this.getHighSpeedVideoSizes[10] | (bArr2[22] & 63)), bArr[10], bArr[28]);
        iArr[11] = Camera2StreamConfigurationMap(bArr[11], (byte) (this.getHighSpeedVideoSizes[11] | (bArr2[23] & 63)), bArr2[6], bArr2[13]);
        iArr[12] = Camera2StreamConfigurationMap(bArr[12], (byte) (this.getHighSpeedVideoSizes[12] | (bArr2[24] & 63)), bArr2[7], bArr2[14]);
        iArr[13] = Camera2StreamConfigurationMap(bArr[13], this.getHighSpeedVideoSizes[13], bArr2[15], bArr2[8]);
        iArr[14] = Camera2StreamConfigurationMap(bArr[14], (byte) (this.getHighSpeedVideoSizes[14] | ((bArr[31] >>> 4) & 15)), bArr2[16], bArr2[9]);
        iArr[15] = Camera2StreamConfigurationMap(bArr[15], (byte) (this.getHighSpeedVideoSizes[15] | (bArr[31] & com.google.common.base.Ascii.SI)), bArr[30], bArr[29]);
    }

    @Override // org.bouncycastle.crypto.engines.Zuc128CoreEngine, org.bouncycastle.util.Memoable
    public void reset(org.bouncycastle.util.Memoable memoable) {
        super.reset(memoable);
        this.getHighSpeedVideoSizes = ((org.bouncycastle.crypto.engines.Zuc256CoreEngine) memoable).getHighSpeedVideoSizes;
    }

    @Override // org.bouncycastle.crypto.engines.Zuc128CoreEngine, org.bouncycastle.crypto.StreamCipher
    public java.lang.String getAlgorithmName() {
        return "Zuc-256";
    }

    @Override // org.bouncycastle.crypto.engines.Zuc128CoreEngine, org.bouncycastle.util.Memoable
    public org.bouncycastle.util.Memoable copy() {
        return new org.bouncycastle.crypto.engines.Zuc256CoreEngine(this);
    }

    protected Zuc256CoreEngine(org.bouncycastle.crypto.engines.Zuc256CoreEngine zuc256CoreEngine) {
        super(zuc256CoreEngine);
    }

    public Zuc256CoreEngine(int i) {
        if (i == 32) {
            this.getHighSpeedVideoSizes = Camera2StreamConfigurationMap;
        } else if (i == 64) {
            this.getHighSpeedVideoSizes = getHighSpeedVideoFpsRanges;
        } else {
            if (i != 128) {
                throw new java.lang.IllegalArgumentException("Unsupported length: ".concat(java.lang.String.valueOf(i)));
            }
            this.getHighSpeedVideoSizes = getHighSpeedVideoFpsRangesFor;
        }
    }

    protected Zuc256CoreEngine() {
        this.getHighSpeedVideoSizes = getHighResolutionOutputSizeshNQ4ISI;
    }
}
