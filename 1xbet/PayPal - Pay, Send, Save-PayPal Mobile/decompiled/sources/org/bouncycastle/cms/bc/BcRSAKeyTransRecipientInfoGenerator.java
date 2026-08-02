package org.bouncycastle.cms.bc;

/* loaded from: classes17.dex */
public class BcRSAKeyTransRecipientInfoGenerator extends org.bouncycastle.cms.bc.BcKeyTransRecipientInfoGenerator {
    public BcRSAKeyTransRecipientInfoGenerator(byte[] bArr, org.bouncycastle.asn1.x509.AlgorithmIdentifier algorithmIdentifier, org.bouncycastle.crypto.params.AsymmetricKeyParameter asymmetricKeyParameter) {
        super(bArr, new org.bouncycastle.operator.bc.BcRSAAsymmetricKeyWrapper(algorithmIdentifier, asymmetricKeyParameter));
    }

    public BcRSAKeyTransRecipientInfoGenerator(org.bouncycastle.cert.X509CertificateHolder x509CertificateHolder) throws java.io.IOException {
        super(x509CertificateHolder, new org.bouncycastle.operator.bc.BcRSAAsymmetricKeyWrapper(x509CertificateHolder.getSubjectPublicKeyInfo().getAlgorithm(), x509CertificateHolder.getSubjectPublicKeyInfo()));
    }
}
