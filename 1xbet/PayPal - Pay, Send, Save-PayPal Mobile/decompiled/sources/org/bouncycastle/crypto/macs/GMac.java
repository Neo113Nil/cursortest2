package org.bouncycastle.crypto.macs;

/* loaded from: classes17.dex */
public class GMac implements org.bouncycastle.crypto.Mac {
    private final org.bouncycastle.crypto.modes.GCMBlockCipher getHighSpeedVideoFpsRangesFor;
    private final int getHighSpeedVideoSizes;

    @Override // org.bouncycastle.crypto.Mac
    public void update(byte[] bArr, int i, int i2) throws org.bouncycastle.crypto.DataLengthException, java.lang.IllegalStateException {
        this.getHighSpeedVideoFpsRangesFor.processAADBytes(bArr, i, i2);
    }

    @Override // org.bouncycastle.crypto.Mac
    public void update(byte b) throws java.lang.IllegalStateException {
        this.getHighSpeedVideoFpsRangesFor.processAADByte(b);
    }

    @Override // org.bouncycastle.crypto.Mac
    public void reset() {
        this.getHighSpeedVideoFpsRangesFor.reset();
    }

    @Override // org.bouncycastle.crypto.Mac
    public void init(org.bouncycastle.crypto.CipherParameters cipherParameters) throws java.lang.IllegalArgumentException {
        if (!(cipherParameters instanceof org.bouncycastle.crypto.params.ParametersWithIV)) {
            throw new java.lang.IllegalArgumentException("GMAC requires ParametersWithIV");
        }
        org.bouncycastle.crypto.params.ParametersWithIV parametersWithIV = (org.bouncycastle.crypto.params.ParametersWithIV) cipherParameters;
        byte[] iv = parametersWithIV.getIV();
        this.getHighSpeedVideoFpsRangesFor.init(true, new org.bouncycastle.crypto.params.AEADParameters((org.bouncycastle.crypto.params.KeyParameter) parametersWithIV.getParameters(), this.getHighSpeedVideoSizes, iv));
    }

    @Override // org.bouncycastle.crypto.Mac
    public int getMacSize() {
        return this.getHighSpeedVideoSizes / 8;
    }

    @Override // org.bouncycastle.crypto.Mac
    public java.lang.String getAlgorithmName() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(this.getHighSpeedVideoFpsRangesFor.getUnderlyingCipher().getAlgorithmName());
        sb.append("-GMAC");
        return sb.toString();
    }

    @Override // org.bouncycastle.crypto.Mac
    public int doFinal(byte[] bArr, int i) throws org.bouncycastle.crypto.DataLengthException, java.lang.IllegalStateException {
        try {
            return this.getHighSpeedVideoFpsRangesFor.doFinal(bArr, i);
        } catch (org.bouncycastle.crypto.InvalidCipherTextException e) {
            throw new java.lang.IllegalStateException(e.toString());
        }
    }

    public GMac(org.bouncycastle.crypto.modes.GCMBlockCipher gCMBlockCipher, int i) {
        this.getHighSpeedVideoFpsRangesFor = gCMBlockCipher;
        this.getHighSpeedVideoSizes = i;
    }

    public GMac(org.bouncycastle.crypto.modes.GCMBlockCipher gCMBlockCipher) {
        this.getHighSpeedVideoFpsRangesFor = gCMBlockCipher;
        this.getHighSpeedVideoSizes = 128;
    }
}
