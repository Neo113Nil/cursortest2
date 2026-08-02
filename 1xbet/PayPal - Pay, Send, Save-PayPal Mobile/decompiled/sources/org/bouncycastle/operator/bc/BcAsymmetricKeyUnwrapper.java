package org.bouncycastle.operator.bc;

/* loaded from: classes17.dex */
public abstract class BcAsymmetricKeyUnwrapper extends org.bouncycastle.operator.AsymmetricKeyUnwrapper {
    private org.bouncycastle.crypto.params.AsymmetricKeyParameter getHighSpeedVideoFpsRanges;

    protected abstract org.bouncycastle.crypto.AsymmetricBlockCipher createAsymmetricUnwrapper(org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier);

    @Override // org.bouncycastle.operator.KeyUnwrapper
    public org.bouncycastle.operator.GenericKey generateUnwrappedKey(org.bouncycastle.asn1.x509.AlgorithmIdentifier algorithmIdentifier, byte[] bArr) throws org.bouncycastle.operator.OperatorException {
        org.bouncycastle.crypto.AsymmetricBlockCipher createAsymmetricUnwrapper = createAsymmetricUnwrapper(getAlgorithmIdentifier().getAlgorithm());
        createAsymmetricUnwrapper.init(false, this.getHighSpeedVideoFpsRanges);
        try {
            byte[] processBlock = createAsymmetricUnwrapper.processBlock(bArr, 0, bArr.length);
            return algorithmIdentifier.getAlgorithm().equals((org.bouncycastle.asn1.ASN1Primitive) org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.des_EDE3_CBC) ? new org.bouncycastle.operator.GenericKey(algorithmIdentifier, processBlock) : new org.bouncycastle.operator.GenericKey(algorithmIdentifier, processBlock);
        } catch (org.bouncycastle.crypto.InvalidCipherTextException e) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("unable to recover secret key: ");
            sb.append(e.getMessage());
            throw new org.bouncycastle.operator.OperatorException(sb.toString(), e);
        }
    }

    public BcAsymmetricKeyUnwrapper(org.bouncycastle.asn1.x509.AlgorithmIdentifier algorithmIdentifier, org.bouncycastle.crypto.params.AsymmetricKeyParameter asymmetricKeyParameter) {
        super(algorithmIdentifier);
        this.getHighSpeedVideoFpsRanges = asymmetricKeyParameter;
    }
}
