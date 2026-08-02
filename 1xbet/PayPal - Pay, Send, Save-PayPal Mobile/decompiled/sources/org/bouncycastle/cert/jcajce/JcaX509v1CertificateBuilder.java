package org.bouncycastle.cert.jcajce;

/* loaded from: classes17.dex */
public class JcaX509v1CertificateBuilder extends org.bouncycastle.cert.X509v1CertificateBuilder {
    public JcaX509v1CertificateBuilder(org.bouncycastle.asn1.x500.X500Name x500Name, java.math.BigInteger bigInteger, java.util.Date date, java.util.Date date2, org.bouncycastle.asn1.x500.X500Name x500Name2, java.security.PublicKey publicKey) {
        super(x500Name, bigInteger, date, date2, x500Name2, org.bouncycastle.asn1.x509.SubjectPublicKeyInfo.getInstance(publicKey.getEncoded()));
    }

    public JcaX509v1CertificateBuilder(javax.security.auth.x500.X500Principal x500Principal, java.math.BigInteger bigInteger, java.util.Date date, java.util.Date date2, javax.security.auth.x500.X500Principal x500Principal2, java.security.PublicKey publicKey) {
        super(org.bouncycastle.asn1.x500.X500Name.getInstance(x500Principal.getEncoded()), bigInteger, date, date2, org.bouncycastle.asn1.x500.X500Name.getInstance(x500Principal2.getEncoded()), org.bouncycastle.asn1.x509.SubjectPublicKeyInfo.getInstance(publicKey.getEncoded()));
    }
}
