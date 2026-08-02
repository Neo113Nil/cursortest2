package org.bouncycastle.cert.ocsp;

/* loaded from: classes17.dex */
public class CertificateID {
    public static final org.bouncycastle.asn1.x509.AlgorithmIdentifier HASH_SHA1 = new org.bouncycastle.asn1.x509.AlgorithmIdentifier(org.bouncycastle.asn1.oiw.OIWObjectIdentifiers.idSHA1, org.bouncycastle.asn1.DERNull.INSTANCE);
    private final org.bouncycastle.asn1.ocsp.CertID getHighSpeedVideoFpsRanges;

    public org.bouncycastle.asn1.ocsp.CertID toASN1Primitive() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public boolean matchesIssuer(org.bouncycastle.cert.X509CertificateHolder x509CertificateHolder, org.bouncycastle.operator.DigestCalculatorProvider digestCalculatorProvider) throws org.bouncycastle.cert.ocsp.OCSPException {
        try {
            return getHighSpeedVideoFpsRanges(digestCalculatorProvider.get(this.getHighSpeedVideoFpsRanges.getHashAlgorithm()), x509CertificateHolder, this.getHighSpeedVideoFpsRanges.getSerialNumber()).equals(this.getHighSpeedVideoFpsRanges);
        } catch (org.bouncycastle.operator.OperatorCreationException e) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("unable to create digest calculator: ");
            sb.append(e.getMessage());
            throw new org.bouncycastle.cert.ocsp.OCSPException(sb.toString(), e);
        }
    }

    public int hashCode() {
        return this.getHighSpeedVideoFpsRanges.toASN1Primitive().hashCode();
    }

    public java.math.BigInteger getSerialNumber() {
        return this.getHighSpeedVideoFpsRanges.getSerialNumber().getValue();
    }

    public byte[] getIssuerNameHash() {
        return this.getHighSpeedVideoFpsRanges.getIssuerNameHash().getOctets();
    }

    public byte[] getIssuerKeyHash() {
        return this.getHighSpeedVideoFpsRanges.getIssuerKeyHash().getOctets();
    }

    public org.bouncycastle.asn1.ASN1ObjectIdentifier getHashAlgOID() {
        return this.getHighSpeedVideoFpsRanges.getHashAlgorithm().getAlgorithm();
    }

    public boolean equals(java.lang.Object obj) {
        if (obj instanceof org.bouncycastle.cert.ocsp.CertificateID) {
            return this.getHighSpeedVideoFpsRanges.toASN1Primitive().equals(((org.bouncycastle.cert.ocsp.CertificateID) obj).getHighSpeedVideoFpsRanges.toASN1Primitive());
        }
        return false;
    }

    public static org.bouncycastle.cert.ocsp.CertificateID deriveCertificateID(org.bouncycastle.cert.ocsp.CertificateID certificateID, java.math.BigInteger bigInteger) {
        return new org.bouncycastle.cert.ocsp.CertificateID(new org.bouncycastle.asn1.ocsp.CertID(certificateID.getHighSpeedVideoFpsRanges.getHashAlgorithm(), certificateID.getHighSpeedVideoFpsRanges.getIssuerNameHash(), certificateID.getHighSpeedVideoFpsRanges.getIssuerKeyHash(), new org.bouncycastle.asn1.ASN1Integer(bigInteger)));
    }

    private static org.bouncycastle.asn1.ocsp.CertID getHighSpeedVideoFpsRanges(org.bouncycastle.operator.DigestCalculator digestCalculator, org.bouncycastle.cert.X509CertificateHolder x509CertificateHolder, org.bouncycastle.asn1.ASN1Integer aSN1Integer) throws org.bouncycastle.cert.ocsp.OCSPException {
        try {
            java.io.OutputStream outputStream = digestCalculator.getOutputStream();
            outputStream.write(x509CertificateHolder.toASN1Structure().getSubject().getEncoded(org.bouncycastle.asn1.ASN1Encoding.DER));
            outputStream.close();
            org.bouncycastle.asn1.DEROctetString dEROctetString = new org.bouncycastle.asn1.DEROctetString(digestCalculator.getDigest());
            org.bouncycastle.asn1.x509.SubjectPublicKeyInfo subjectPublicKeyInfo = x509CertificateHolder.getSubjectPublicKeyInfo();
            java.io.OutputStream outputStream2 = digestCalculator.getOutputStream();
            outputStream2.write(subjectPublicKeyInfo.getPublicKeyData().getBytes());
            outputStream2.close();
            return new org.bouncycastle.asn1.ocsp.CertID(digestCalculator.getAlgorithmIdentifier(), dEROctetString, new org.bouncycastle.asn1.DEROctetString(digestCalculator.getDigest()), aSN1Integer);
        } catch (java.lang.Exception e) {
            throw new org.bouncycastle.cert.ocsp.OCSPException("problem creating ID: ".concat(java.lang.String.valueOf(e)), e);
        }
    }

    public CertificateID(org.bouncycastle.operator.DigestCalculator digestCalculator, org.bouncycastle.cert.X509CertificateHolder x509CertificateHolder, java.math.BigInteger bigInteger) throws org.bouncycastle.cert.ocsp.OCSPException {
        this.getHighSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges(digestCalculator, x509CertificateHolder, new org.bouncycastle.asn1.ASN1Integer(bigInteger));
    }

    public CertificateID(org.bouncycastle.asn1.ocsp.CertID certID) {
        if (certID == null) {
            throw new java.lang.IllegalArgumentException("'id' cannot be null");
        }
        this.getHighSpeedVideoFpsRanges = certID;
    }
}
