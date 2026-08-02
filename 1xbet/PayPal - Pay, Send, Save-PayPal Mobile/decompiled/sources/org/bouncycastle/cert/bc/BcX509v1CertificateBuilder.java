package org.bouncycastle.cert.bc;

/* loaded from: classes17.dex */
public class BcX509v1CertificateBuilder extends org.bouncycastle.cert.X509v1CertificateBuilder {
    public BcX509v1CertificateBuilder(org.bouncycastle.asn1.x500.X500Name x500Name, java.math.BigInteger bigInteger, java.util.Date date, java.util.Date date2, org.bouncycastle.asn1.x500.X500Name x500Name2, org.bouncycastle.crypto.params.AsymmetricKeyParameter asymmetricKeyParameter) throws java.io.IOException {
        super(x500Name, bigInteger, date, date2, x500Name2, org.bouncycastle.crypto.util.SubjectPublicKeyInfoFactory.createSubjectPublicKeyInfo(asymmetricKeyParameter));
    }
}
