package org.bouncycastle.cert.jcajce;

/* loaded from: classes17.dex */
public class JcaX509v3CertificateBuilder extends org.bouncycastle.cert.X509v3CertificateBuilder {
    public org.bouncycastle.cert.jcajce.JcaX509v3CertificateBuilder copyAndAddExtension(org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier, boolean z, java.security.cert.X509Certificate x509Certificate) throws java.security.cert.CertificateEncodingException {
        copyAndAddExtension(aSN1ObjectIdentifier, z, new org.bouncycastle.cert.jcajce.JcaX509CertificateHolder(x509Certificate));
        return this;
    }

    public JcaX509v3CertificateBuilder(org.bouncycastle.asn1.x500.X500Name x500Name, java.math.BigInteger bigInteger, org.bouncycastle.asn1.x509.Time time, org.bouncycastle.asn1.x509.Time time2, org.bouncycastle.asn1.x500.X500Name x500Name2, java.security.PublicKey publicKey) {
        super(x500Name, bigInteger, time, time2, x500Name2, org.bouncycastle.asn1.x509.SubjectPublicKeyInfo.getInstance(publicKey.getEncoded()));
    }

    public JcaX509v3CertificateBuilder(org.bouncycastle.asn1.x500.X500Name x500Name, java.math.BigInteger bigInteger, java.util.Date date, java.util.Date date2, org.bouncycastle.asn1.x500.X500Name x500Name2, java.security.PublicKey publicKey) {
        super(x500Name, bigInteger, date, date2, x500Name2, org.bouncycastle.asn1.x509.SubjectPublicKeyInfo.getInstance(publicKey.getEncoded()));
    }

    public JcaX509v3CertificateBuilder(javax.security.auth.x500.X500Principal x500Principal, java.math.BigInteger bigInteger, java.util.Date date, java.util.Date date2, javax.security.auth.x500.X500Principal x500Principal2, java.security.PublicKey publicKey) {
        super(org.bouncycastle.asn1.x500.X500Name.getInstance(x500Principal.getEncoded()), bigInteger, date, date2, org.bouncycastle.asn1.x500.X500Name.getInstance(x500Principal2.getEncoded()), org.bouncycastle.asn1.x509.SubjectPublicKeyInfo.getInstance(publicKey.getEncoded()));
    }

    public JcaX509v3CertificateBuilder(java.security.cert.X509Certificate x509Certificate, java.math.BigInteger bigInteger, java.util.Date date, java.util.Date date2, org.bouncycastle.asn1.x500.X500Name x500Name, java.security.PublicKey publicKey) {
        this(org.bouncycastle.asn1.x500.X500Name.getInstance(x509Certificate.getSubjectX500Principal().getEncoded()), bigInteger, date, date2, x500Name, publicKey);
    }

    public JcaX509v3CertificateBuilder(java.security.cert.X509Certificate x509Certificate, java.math.BigInteger bigInteger, java.util.Date date, java.util.Date date2, javax.security.auth.x500.X500Principal x500Principal, java.security.PublicKey publicKey) {
        this(x509Certificate.getSubjectX500Principal(), bigInteger, date, date2, x500Principal, publicKey);
    }

    public JcaX509v3CertificateBuilder(java.security.cert.X509Certificate x509Certificate) throws java.security.cert.CertificateEncodingException {
        super(new org.bouncycastle.cert.jcajce.JcaX509CertificateHolder(x509Certificate));
    }
}
