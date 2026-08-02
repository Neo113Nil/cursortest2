package org.bouncycastle.cms.jcajce;

/* loaded from: classes17.dex */
public class JceKeyTransRecipientInfoGenerator extends org.bouncycastle.cms.KeyTransRecipientInfoGenerator {
    public org.bouncycastle.cms.jcajce.JceKeyTransRecipientInfoGenerator setProvider(java.security.Provider provider) {
        ((org.bouncycastle.operator.jcajce.JceAsymmetricKeyWrapper) this.wrapper).setProvider(provider);
        return this;
    }

    public org.bouncycastle.cms.jcajce.JceKeyTransRecipientInfoGenerator setProvider(java.lang.String str) {
        ((org.bouncycastle.operator.jcajce.JceAsymmetricKeyWrapper) this.wrapper).setProvider(str);
        return this;
    }

    public org.bouncycastle.cms.jcajce.JceKeyTransRecipientInfoGenerator setAlgorithmMapping(org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier, java.lang.String str) {
        ((org.bouncycastle.operator.jcajce.JceAsymmetricKeyWrapper) this.wrapper).setAlgorithmMapping(aSN1ObjectIdentifier, str);
        return this;
    }

    public JceKeyTransRecipientInfoGenerator(byte[] bArr, org.bouncycastle.operator.AsymmetricKeyWrapper asymmetricKeyWrapper) {
        super(bArr, asymmetricKeyWrapper);
    }

    public JceKeyTransRecipientInfoGenerator(byte[] bArr, org.bouncycastle.asn1.x509.AlgorithmIdentifier algorithmIdentifier, java.security.PublicKey publicKey) {
        super(bArr, new org.bouncycastle.operator.jcajce.JceAsymmetricKeyWrapper(algorithmIdentifier, publicKey));
    }

    public JceKeyTransRecipientInfoGenerator(byte[] bArr, java.security.PublicKey publicKey) {
        super(bArr, new org.bouncycastle.operator.jcajce.JceAsymmetricKeyWrapper(publicKey));
    }

    public JceKeyTransRecipientInfoGenerator(java.security.cert.X509Certificate x509Certificate, org.bouncycastle.operator.AsymmetricKeyWrapper asymmetricKeyWrapper) throws java.security.cert.CertificateEncodingException {
        super(new org.bouncycastle.asn1.cms.IssuerAndSerialNumber(new org.bouncycastle.cert.jcajce.JcaX509CertificateHolder(x509Certificate).toASN1Structure()), asymmetricKeyWrapper);
    }

    public JceKeyTransRecipientInfoGenerator(java.security.cert.X509Certificate x509Certificate, org.bouncycastle.asn1.x509.AlgorithmIdentifier algorithmIdentifier) throws java.security.cert.CertificateEncodingException {
        super(new org.bouncycastle.asn1.cms.IssuerAndSerialNumber(new org.bouncycastle.cert.jcajce.JcaX509CertificateHolder(x509Certificate).toASN1Structure()), new org.bouncycastle.operator.jcajce.JceAsymmetricKeyWrapper(algorithmIdentifier, x509Certificate.getPublicKey()));
    }

    public JceKeyTransRecipientInfoGenerator(java.security.cert.X509Certificate x509Certificate) throws java.security.cert.CertificateEncodingException {
        super(new org.bouncycastle.asn1.cms.IssuerAndSerialNumber(new org.bouncycastle.cert.jcajce.JcaX509CertificateHolder(x509Certificate).toASN1Structure()), new org.bouncycastle.operator.jcajce.JceAsymmetricKeyWrapper(x509Certificate));
    }
}
