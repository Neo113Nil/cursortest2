package org.bouncycastle.pkcs.jcajce;

/* loaded from: classes17.dex */
public class JcaPKCS12SafeBagBuilder extends org.bouncycastle.pkcs.PKCS12SafeBagBuilder {
    private static org.bouncycastle.asn1.x509.Certificate getHighSpeedVideoSizes(java.security.cert.X509Certificate x509Certificate) throws java.io.IOException {
        try {
            return org.bouncycastle.asn1.x509.Certificate.getInstance(x509Certificate.getEncoded());
        } catch (java.security.cert.CertificateEncodingException e) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("cannot encode certificate: ");
            sb.append(e.getMessage());
            throw new org.bouncycastle.pkcs.PKCSIOException(sb.toString(), e);
        }
    }

    public JcaPKCS12SafeBagBuilder(java.security.cert.X509Certificate x509Certificate) throws java.io.IOException {
        super(getHighSpeedVideoSizes(x509Certificate));
    }

    public JcaPKCS12SafeBagBuilder(java.security.PrivateKey privateKey, org.bouncycastle.operator.OutputEncryptor outputEncryptor) {
        super(org.bouncycastle.asn1.pkcs.PrivateKeyInfo.getInstance(privateKey.getEncoded()), outputEncryptor);
    }

    public JcaPKCS12SafeBagBuilder(java.security.PrivateKey privateKey) {
        super(org.bouncycastle.asn1.pkcs.PrivateKeyInfo.getInstance(privateKey.getEncoded()));
    }
}
