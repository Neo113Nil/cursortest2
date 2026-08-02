package org.bouncycastle.crypto.macs;

/* loaded from: classes17.dex */
public class KGMac implements org.bouncycastle.crypto.Mac {
    private final org.bouncycastle.crypto.modes.KGCMBlockCipher Camera2StreamConfigurationMap;
    private final int getHighSpeedVideoFpsRangesFor;

    @Override // org.bouncycastle.crypto.Mac
    public void update(byte[] bArr, int i, int i2) throws org.bouncycastle.crypto.DataLengthException, java.lang.IllegalStateException {
        this.Camera2StreamConfigurationMap.processAADBytes(bArr, i, i2);
    }

    @Override // org.bouncycastle.crypto.Mac
    public void update(byte b) throws java.lang.IllegalStateException {
        this.Camera2StreamConfigurationMap.processAADByte(b);
    }

    @Override // org.bouncycastle.crypto.Mac
    public void reset() {
        this.Camera2StreamConfigurationMap.reset();
    }

    @Override // org.bouncycastle.crypto.Mac
    public void init(org.bouncycastle.crypto.CipherParameters cipherParameters) throws java.lang.IllegalArgumentException {
        if (!(cipherParameters instanceof org.bouncycastle.crypto.params.ParametersWithIV)) {
            throw new java.lang.IllegalArgumentException("KGMAC requires ParametersWithIV");
        }
        org.bouncycastle.crypto.params.ParametersWithIV parametersWithIV = (org.bouncycastle.crypto.params.ParametersWithIV) cipherParameters;
        byte[] iv = parametersWithIV.getIV();
        this.Camera2StreamConfigurationMap.init(true, new org.bouncycastle.crypto.params.AEADParameters((org.bouncycastle.crypto.params.KeyParameter) parametersWithIV.getParameters(), this.getHighSpeedVideoFpsRangesFor, iv));
    }

    @Override // org.bouncycastle.crypto.Mac
    public int getMacSize() {
        return this.getHighSpeedVideoFpsRangesFor / 8;
    }

    @Override // org.bouncycastle.crypto.Mac
    public java.lang.String getAlgorithmName() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(this.Camera2StreamConfigurationMap.getUnderlyingCipher().getAlgorithmName());
        sb.append("-KGMAC");
        return sb.toString();
    }

    @Override // org.bouncycastle.crypto.Mac
    public int doFinal(byte[] bArr, int i) throws org.bouncycastle.crypto.DataLengthException, java.lang.IllegalStateException {
        try {
            return this.Camera2StreamConfigurationMap.doFinal(bArr, i);
        } catch (org.bouncycastle.crypto.InvalidCipherTextException e) {
            throw new java.lang.IllegalStateException(e.toString());
        }
    }

    public KGMac(org.bouncycastle.crypto.modes.KGCMBlockCipher kGCMBlockCipher, int i) {
        this.Camera2StreamConfigurationMap = kGCMBlockCipher;
        this.getHighSpeedVideoFpsRangesFor = i;
    }

    public KGMac(org.bouncycastle.crypto.modes.KGCMBlockCipher kGCMBlockCipher) {
        this.Camera2StreamConfigurationMap = kGCMBlockCipher;
        this.getHighSpeedVideoFpsRangesFor = kGCMBlockCipher.getUnderlyingCipher().getBlockSize() * 8;
    }
}
