package org.bouncycastle.cert.jcajce;

/* loaded from: classes17.dex */
public class JcaX509CRLHolder extends org.bouncycastle.cert.X509CRLHolder {
    public JcaX509CRLHolder(java.security.cert.X509CRL x509crl) throws java.security.cert.CRLException {
        super(org.bouncycastle.asn1.x509.CertificateList.getInstance(x509crl.getEncoded()));
    }
}
