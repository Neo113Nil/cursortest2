package org.bouncycastle.cert.bc;

/* loaded from: classes17.dex */
public class BcX509v3CertificateBuilder extends org.bouncycastle.cert.X509v3CertificateBuilder {
    public BcX509v3CertificateBuilder(org.bouncycastle.cert.X509CertificateHolder x509CertificateHolder, java.math.BigInteger bigInteger, java.util.Date date, java.util.Date date2, org.bouncycastle.asn1.x500.X500Name x500Name, org.bouncycastle.crypto.params.AsymmetricKeyParameter asymmetricKeyParameter) throws java.io.IOException {
        super(x509CertificateHolder.getSubject(), bigInteger, date, date2, x500Name, org.bouncycastle.crypto.util.SubjectPublicKeyInfoFactory.createSubjectPublicKeyInfo(asymmetricKeyParameter));
    }

    public BcX509v3CertificateBuilder(org.bouncycastle.asn1.x500.X500Name x500Name, java.math.BigInteger bigInteger, java.util.Date date, java.util.Date date2, org.bouncycastle.asn1.x500.X500Name x500Name2, org.bouncycastle.crypto.params.AsymmetricKeyParameter asymmetricKeyParameter) throws java.io.IOException {
        super(x500Name, bigInteger, date, date2, x500Name2, org.bouncycastle.crypto.util.SubjectPublicKeyInfoFactory.createSubjectPublicKeyInfo(asymmetricKeyParameter));
    }
}
