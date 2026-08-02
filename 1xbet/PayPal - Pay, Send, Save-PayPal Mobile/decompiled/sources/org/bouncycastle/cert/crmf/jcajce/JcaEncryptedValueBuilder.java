package org.bouncycastle.cert.crmf.jcajce;

/* loaded from: classes17.dex */
public class JcaEncryptedValueBuilder extends org.bouncycastle.cert.crmf.EncryptedValueBuilder {
    public org.bouncycastle.asn1.crmf.EncryptedValue build(java.security.cert.X509Certificate x509Certificate) throws java.security.cert.CertificateEncodingException, org.bouncycastle.cert.crmf.CRMFException {
        return build(new org.bouncycastle.cert.jcajce.JcaX509CertificateHolder(x509Certificate));
    }

    public org.bouncycastle.asn1.crmf.EncryptedValue build(java.security.PrivateKey privateKey) throws java.security.cert.CertificateEncodingException, org.bouncycastle.cert.crmf.CRMFException {
        return build(org.bouncycastle.asn1.pkcs.PrivateKeyInfo.getInstance(privateKey.getEncoded()));
    }

    public JcaEncryptedValueBuilder(org.bouncycastle.operator.KeyWrapper keyWrapper, org.bouncycastle.operator.OutputEncryptor outputEncryptor) {
        super(keyWrapper, outputEncryptor);
    }
}
