package org.bouncycastle.pqc.jcajce.provider.newhope;

/* loaded from: classes17.dex */
public class KeyAgreementSpi extends org.bouncycastle.jcajce.provider.asymmetric.util.BaseAgreementSpi {
    private org.bouncycastle.pqc.crypto.newhope.NHAgreement Camera2StreamConfigurationMap;
    private org.bouncycastle.pqc.crypto.newhope.NHExchangePairGenerator getHighSpeedVideoFpsRanges;
    private org.bouncycastle.pqc.jcajce.provider.newhope.BCNHPublicKey getHighSpeedVideoFpsRangesFor;
    private byte[] getHighSpeedVideoSizes;

    @Override // javax.crypto.KeyAgreementSpi
    protected java.security.Key engineDoPhase(java.security.Key key, boolean z) throws java.security.InvalidKeyException, java.lang.IllegalStateException {
        if (!z) {
            throw new java.lang.IllegalStateException("NewHope can only be between two parties.");
        }
        org.bouncycastle.pqc.jcajce.provider.newhope.BCNHPublicKey bCNHPublicKey = (org.bouncycastle.pqc.jcajce.provider.newhope.BCNHPublicKey) key;
        this.getHighSpeedVideoFpsRangesFor = bCNHPublicKey;
        org.bouncycastle.pqc.crypto.newhope.NHExchangePairGenerator nHExchangePairGenerator = this.getHighSpeedVideoFpsRanges;
        if (nHExchangePairGenerator == null) {
            this.getHighSpeedVideoSizes = this.Camera2StreamConfigurationMap.calculateAgreement(bCNHPublicKey.Camera2StreamConfigurationMap);
            return null;
        }
        org.bouncycastle.pqc.crypto.ExchangePair generateExchange = nHExchangePairGenerator.generateExchange(bCNHPublicKey.Camera2StreamConfigurationMap);
        this.getHighSpeedVideoSizes = generateExchange.getSharedValue();
        return new org.bouncycastle.pqc.jcajce.provider.newhope.BCNHPublicKey((org.bouncycastle.pqc.crypto.newhope.NHPublicKeyParameters) generateExchange.getPublicKey());
    }

    @Override // javax.crypto.KeyAgreementSpi
    protected void engineInit(java.security.Key key, java.security.SecureRandom secureRandom) throws java.security.InvalidKeyException {
        if (key == null) {
            this.getHighSpeedVideoFpsRanges = new org.bouncycastle.pqc.crypto.newhope.NHExchangePairGenerator(secureRandom);
            return;
        }
        org.bouncycastle.pqc.crypto.newhope.NHAgreement nHAgreement = new org.bouncycastle.pqc.crypto.newhope.NHAgreement();
        this.Camera2StreamConfigurationMap = nHAgreement;
        nHAgreement.init(((org.bouncycastle.pqc.jcajce.provider.newhope.BCNHPrivateKey) key).getHighSpeedVideoFpsRanges);
    }

    @Override // javax.crypto.KeyAgreementSpi
    protected void engineInit(java.security.Key key, java.security.spec.AlgorithmParameterSpec algorithmParameterSpec, java.security.SecureRandom secureRandom) throws java.security.InvalidKeyException, java.security.InvalidAlgorithmParameterException {
        throw new java.security.InvalidAlgorithmParameterException("NewHope does not require parameters");
    }

    @Override // org.bouncycastle.jcajce.provider.asymmetric.util.BaseAgreementSpi, javax.crypto.KeyAgreementSpi
    public byte[] engineGenerateSecret() throws java.lang.IllegalStateException {
        byte[] clone = org.bouncycastle.util.Arrays.clone(this.getHighSpeedVideoSizes);
        org.bouncycastle.util.Arrays.fill(this.getHighSpeedVideoSizes, (byte) 0);
        return clone;
    }

    @Override // org.bouncycastle.jcajce.provider.asymmetric.util.BaseAgreementSpi, javax.crypto.KeyAgreementSpi
    public int engineGenerateSecret(byte[] bArr, int i) throws java.lang.IllegalStateException, javax.crypto.ShortBufferException {
        byte[] bArr2 = this.getHighSpeedVideoSizes;
        java.lang.System.arraycopy(bArr2, 0, bArr, i, bArr2.length);
        org.bouncycastle.util.Arrays.fill(this.getHighSpeedVideoSizes, (byte) 0);
        return this.getHighSpeedVideoSizes.length;
    }

    @Override // org.bouncycastle.jcajce.provider.asymmetric.util.BaseAgreementSpi
    public byte[] calcSecret() {
        return engineGenerateSecret();
    }

    public KeyAgreementSpi() {
        super("NH", null);
    }
}
