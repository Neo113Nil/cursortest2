package org.bouncycastle.cert;

/* loaded from: classes17.dex */
public class X509v1CertificateBuilder {
    private org.bouncycastle.asn1.x509.V1TBSCertificateGenerator Camera2StreamConfigurationMap;

    public org.bouncycastle.cert.X509CertificateHolder build(org.bouncycastle.operator.ContentSigner contentSigner) {
        this.Camera2StreamConfigurationMap.setSignature(contentSigner.getAlgorithmIdentifier());
        return org.bouncycastle.cert.CertUtils.getHighResolutionOutputSizeshNQ4ISI(contentSigner, this.Camera2StreamConfigurationMap.generateTBSCertificate());
    }

    public X509v1CertificateBuilder(org.bouncycastle.asn1.x500.X500Name x500Name, java.math.BigInteger bigInteger, org.bouncycastle.asn1.x509.Time time, org.bouncycastle.asn1.x509.Time time2, org.bouncycastle.asn1.x500.X500Name x500Name2, org.bouncycastle.asn1.x509.SubjectPublicKeyInfo subjectPublicKeyInfo) {
        if (x500Name == null) {
            throw new java.lang.IllegalArgumentException("issuer must not be null");
        }
        if (subjectPublicKeyInfo == null) {
            throw new java.lang.IllegalArgumentException("publicKeyInfo must not be null");
        }
        org.bouncycastle.asn1.x509.V1TBSCertificateGenerator v1TBSCertificateGenerator = new org.bouncycastle.asn1.x509.V1TBSCertificateGenerator();
        this.Camera2StreamConfigurationMap = v1TBSCertificateGenerator;
        v1TBSCertificateGenerator.setSerialNumber(new org.bouncycastle.asn1.ASN1Integer(bigInteger));
        this.Camera2StreamConfigurationMap.setIssuer(x500Name);
        this.Camera2StreamConfigurationMap.setStartDate(time);
        this.Camera2StreamConfigurationMap.setEndDate(time2);
        this.Camera2StreamConfigurationMap.setSubject(x500Name2);
        this.Camera2StreamConfigurationMap.setSubjectPublicKeyInfo(subjectPublicKeyInfo);
    }

    public X509v1CertificateBuilder(org.bouncycastle.asn1.x500.X500Name x500Name, java.math.BigInteger bigInteger, java.util.Date date, java.util.Date date2, org.bouncycastle.asn1.x500.X500Name x500Name2, org.bouncycastle.asn1.x509.SubjectPublicKeyInfo subjectPublicKeyInfo) {
        this(x500Name, bigInteger, new org.bouncycastle.asn1.x509.Time(date), new org.bouncycastle.asn1.x509.Time(date2), x500Name2, subjectPublicKeyInfo);
    }

    public X509v1CertificateBuilder(org.bouncycastle.asn1.x500.X500Name x500Name, java.math.BigInteger bigInteger, java.util.Date date, java.util.Date date2, java.util.Locale locale, org.bouncycastle.asn1.x500.X500Name x500Name2, org.bouncycastle.asn1.x509.SubjectPublicKeyInfo subjectPublicKeyInfo) {
        this(x500Name, bigInteger, new org.bouncycastle.asn1.x509.Time(date, locale), new org.bouncycastle.asn1.x509.Time(date2, locale), x500Name2, subjectPublicKeyInfo);
    }
}
