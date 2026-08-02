package org.bouncycastle.cms.bc;

/* loaded from: classes17.dex */
public abstract class BcKeyTransRecipientInfoGenerator extends org.bouncycastle.cms.KeyTransRecipientInfoGenerator {
    public BcKeyTransRecipientInfoGenerator(byte[] bArr, org.bouncycastle.operator.bc.BcAsymmetricKeyWrapper bcAsymmetricKeyWrapper) {
        super(bArr, bcAsymmetricKeyWrapper);
    }

    public BcKeyTransRecipientInfoGenerator(org.bouncycastle.cert.X509CertificateHolder x509CertificateHolder, org.bouncycastle.operator.bc.BcAsymmetricKeyWrapper bcAsymmetricKeyWrapper) {
        super(new org.bouncycastle.asn1.cms.IssuerAndSerialNumber(x509CertificateHolder.toASN1Structure()), bcAsymmetricKeyWrapper);
    }
}
