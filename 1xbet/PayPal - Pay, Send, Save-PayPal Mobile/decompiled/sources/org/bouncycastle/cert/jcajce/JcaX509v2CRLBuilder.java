package org.bouncycastle.cert.jcajce;

/* loaded from: classes17.dex */
public class JcaX509v2CRLBuilder extends org.bouncycastle.cert.X509v2CRLBuilder {
    public JcaX509v2CRLBuilder(javax.security.auth.x500.X500Principal x500Principal, java.util.Date date) {
        super(org.bouncycastle.asn1.x500.X500Name.getInstance(x500Principal.getEncoded()), date);
    }

    public JcaX509v2CRLBuilder(java.security.cert.X509Certificate x509Certificate, java.util.Date date) {
        this(x509Certificate.getSubjectX500Principal(), date);
    }

    public JcaX509v2CRLBuilder(java.security.cert.X509CRL x509crl) throws java.security.cert.CRLException {
        super(new org.bouncycastle.cert.jcajce.JcaX509CRLHolder(x509crl));
    }
}
