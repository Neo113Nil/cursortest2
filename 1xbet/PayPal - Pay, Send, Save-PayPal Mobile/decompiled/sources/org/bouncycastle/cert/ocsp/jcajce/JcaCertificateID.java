package org.bouncycastle.cert.ocsp.jcajce;

/* loaded from: classes17.dex */
public class JcaCertificateID extends org.bouncycastle.cert.ocsp.CertificateID {
    public JcaCertificateID(org.bouncycastle.operator.DigestCalculator digestCalculator, java.security.cert.X509Certificate x509Certificate, java.math.BigInteger bigInteger) throws org.bouncycastle.cert.ocsp.OCSPException, java.security.cert.CertificateEncodingException {
        super(digestCalculator, new org.bouncycastle.cert.jcajce.JcaX509CertificateHolder(x509Certificate), bigInteger);
    }
}
