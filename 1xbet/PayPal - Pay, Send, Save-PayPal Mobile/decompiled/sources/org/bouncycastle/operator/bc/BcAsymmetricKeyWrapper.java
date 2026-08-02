package org.bouncycastle.operator.bc;

/* loaded from: classes17.dex */
public abstract class BcAsymmetricKeyWrapper extends org.bouncycastle.operator.AsymmetricKeyWrapper {
    private java.security.SecureRandom Camera2StreamConfigurationMap;
    private org.bouncycastle.crypto.params.AsymmetricKeyParameter getHighSpeedVideoFpsRangesFor;

    protected abstract org.bouncycastle.crypto.AsymmetricBlockCipher createAsymmetricWrapper(org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier);

    public org.bouncycastle.operator.bc.BcAsymmetricKeyWrapper setSecureRandom(java.security.SecureRandom secureRandom) {
        this.Camera2StreamConfigurationMap = secureRandom;
        return this;
    }

    @Override // org.bouncycastle.operator.KeyWrapper
    public byte[] generateWrappedKey(org.bouncycastle.operator.GenericKey genericKey) throws org.bouncycastle.operator.OperatorException {
        org.bouncycastle.crypto.AsymmetricBlockCipher createAsymmetricWrapper = createAsymmetricWrapper(getAlgorithmIdentifier().getAlgorithm());
        org.bouncycastle.crypto.CipherParameters cipherParameters = this.getHighSpeedVideoFpsRangesFor;
        java.security.SecureRandom secureRandom = this.Camera2StreamConfigurationMap;
        if (secureRandom != null) {
            cipherParameters = new org.bouncycastle.crypto.params.ParametersWithRandom(cipherParameters, secureRandom);
        }
        try {
            byte[] highSpeedVideoSizes = org.bouncycastle.operator.bc.OperatorUtils.getHighSpeedVideoSizes(genericKey);
            createAsymmetricWrapper.init(true, cipherParameters);
            return createAsymmetricWrapper.processBlock(highSpeedVideoSizes, 0, highSpeedVideoSizes.length);
        } catch (org.bouncycastle.crypto.InvalidCipherTextException e) {
            throw new org.bouncycastle.operator.OperatorException("unable to encrypt contents key", e);
        }
    }

    public BcAsymmetricKeyWrapper(org.bouncycastle.asn1.x509.AlgorithmIdentifier algorithmIdentifier, org.bouncycastle.crypto.params.AsymmetricKeyParameter asymmetricKeyParameter) {
        super(algorithmIdentifier);
        this.getHighSpeedVideoFpsRangesFor = asymmetricKeyParameter;
    }
}
