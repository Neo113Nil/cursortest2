package org.bouncycastle.cert.jcajce;

/* loaded from: classes17.dex */
public class JcaAttributeCertificateIssuer extends org.bouncycastle.cert.AttributeCertificateIssuer {
    public JcaAttributeCertificateIssuer(javax.security.auth.x500.X500Principal x500Principal) {
        super(org.bouncycastle.asn1.x500.X500Name.getInstance(x500Principal.getEncoded()));
    }

    public JcaAttributeCertificateIssuer(java.security.cert.X509Certificate x509Certificate) {
        this(x509Certificate.getIssuerX500Principal());
    }
}
