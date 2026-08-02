package org.bouncycastle.operator.bc;

/* loaded from: classes17.dex */
public class BcRSAAsymmetricKeyUnwrapper extends org.bouncycastle.operator.bc.BcAsymmetricKeyUnwrapper {
    @Override // org.bouncycastle.operator.bc.BcAsymmetricKeyUnwrapper
    protected org.bouncycastle.crypto.AsymmetricBlockCipher createAsymmetricUnwrapper(org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        return new org.bouncycastle.crypto.encodings.PKCS1Encoding(new org.bouncycastle.crypto.engines.RSABlindedEngine());
    }

    public BcRSAAsymmetricKeyUnwrapper(org.bouncycastle.asn1.x509.AlgorithmIdentifier algorithmIdentifier, org.bouncycastle.crypto.params.AsymmetricKeyParameter asymmetricKeyParameter) {
        super(algorithmIdentifier, asymmetricKeyParameter);
    }
}
