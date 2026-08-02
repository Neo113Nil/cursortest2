package org.bouncycastle.asn1.x509;

/* loaded from: classes17.dex */
public class X509CertificateStructure extends org.bouncycastle.asn1.ASN1Object implements org.bouncycastle.asn1.x509.X509ObjectIdentifiers, org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers {
    org.bouncycastle.asn1.x509.AlgorithmIdentifier Camera2StreamConfigurationMap;
    org.bouncycastle.asn1.x509.TBSCertificateStructure getHighResolutionOutputSizeshNQ4ISI;
    org.bouncycastle.asn1.ASN1Sequence getHighSpeedVideoFpsRanges;
    org.bouncycastle.asn1.ASN1BitString getHighSpeedVideoSizes;

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public org.bouncycastle.asn1.ASN1Primitive toASN1Primitive() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public int getVersion() {
        return this.getHighResolutionOutputSizeshNQ4ISI.getVersion();
    }

    public org.bouncycastle.asn1.x509.TBSCertificateStructure getTBSCertificate() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public org.bouncycastle.asn1.x509.SubjectPublicKeyInfo getSubjectPublicKeyInfo() {
        return this.getHighResolutionOutputSizeshNQ4ISI.getSubjectPublicKeyInfo();
    }

    public org.bouncycastle.asn1.x500.X500Name getSubject() {
        return this.getHighResolutionOutputSizeshNQ4ISI.getSubject();
    }

    public org.bouncycastle.asn1.x509.Time getStartDate() {
        return this.getHighResolutionOutputSizeshNQ4ISI.getStartDate();
    }

    public org.bouncycastle.asn1.x509.AlgorithmIdentifier getSignatureAlgorithm() {
        return this.Camera2StreamConfigurationMap;
    }

    public org.bouncycastle.asn1.ASN1BitString getSignature() {
        return this.getHighSpeedVideoSizes;
    }

    public org.bouncycastle.asn1.ASN1Integer getSerialNumber() {
        return this.getHighResolutionOutputSizeshNQ4ISI.getSerialNumber();
    }

    public org.bouncycastle.asn1.x500.X500Name getIssuer() {
        return this.getHighResolutionOutputSizeshNQ4ISI.getIssuer();
    }

    public org.bouncycastle.asn1.x509.Time getEndDate() {
        return this.getHighResolutionOutputSizeshNQ4ISI.getEndDate();
    }

    public static org.bouncycastle.asn1.x509.X509CertificateStructure getInstance(org.bouncycastle.asn1.ASN1TaggedObject aSN1TaggedObject, boolean z) {
        return getInstance(org.bouncycastle.asn1.ASN1Sequence.getInstance(aSN1TaggedObject, z));
    }

    public static org.bouncycastle.asn1.x509.X509CertificateStructure getInstance(java.lang.Object obj) {
        if (obj instanceof org.bouncycastle.asn1.x509.X509CertificateStructure) {
            return (org.bouncycastle.asn1.x509.X509CertificateStructure) obj;
        }
        if (obj != null) {
            return new org.bouncycastle.asn1.x509.X509CertificateStructure(org.bouncycastle.asn1.ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    public X509CertificateStructure(org.bouncycastle.asn1.ASN1Sequence aSN1Sequence) {
        this.getHighSpeedVideoFpsRanges = aSN1Sequence;
        if (aSN1Sequence.size() != 3) {
            throw new java.lang.IllegalArgumentException("sequence wrong size for a certificate");
        }
        this.getHighResolutionOutputSizeshNQ4ISI = org.bouncycastle.asn1.x509.TBSCertificateStructure.getInstance(aSN1Sequence.getObjectAt(0));
        this.Camera2StreamConfigurationMap = org.bouncycastle.asn1.x509.AlgorithmIdentifier.getInstance(aSN1Sequence.getObjectAt(1));
        this.getHighSpeedVideoSizes = org.bouncycastle.asn1.DERBitString.getInstance((java.lang.Object) aSN1Sequence.getObjectAt(2));
    }
}
