package org.bouncycastle.operator.bc;

/* loaded from: classes17.dex */
public class BcRSAAsymmetricKeyWrapper extends org.bouncycastle.operator.bc.BcAsymmetricKeyWrapper {
    @Override // org.bouncycastle.operator.bc.BcAsymmetricKeyWrapper
    protected org.bouncycastle.crypto.AsymmetricBlockCipher createAsymmetricWrapper(org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        return new org.bouncycastle.crypto.encodings.PKCS1Encoding(new org.bouncycastle.crypto.engines.RSABlindedEngine());
    }

    public BcRSAAsymmetricKeyWrapper(org.bouncycastle.asn1.x509.AlgorithmIdentifier algorithmIdentifier, org.bouncycastle.crypto.params.AsymmetricKeyParameter asymmetricKeyParameter) {
        super(algorithmIdentifier, asymmetricKeyParameter);
    }

    public BcRSAAsymmetricKeyWrapper(org.bouncycastle.asn1.x509.AlgorithmIdentifier algorithmIdentifier, org.bouncycastle.asn1.x509.SubjectPublicKeyInfo subjectPublicKeyInfo) throws java.io.IOException {
        super(algorithmIdentifier, org.bouncycastle.crypto.util.PublicKeyFactory.createKey(subjectPublicKeyInfo));
    }
}
