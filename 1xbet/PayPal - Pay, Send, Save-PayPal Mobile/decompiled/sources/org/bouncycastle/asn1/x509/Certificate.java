package org.bouncycastle.asn1.x509;

/* loaded from: classes17.dex */
public class Certificate extends org.bouncycastle.asn1.ASN1Object {
    org.bouncycastle.asn1.ASN1Sequence Camera2StreamConfigurationMap;
    org.bouncycastle.asn1.x509.TBSCertificate getHighResolutionOutputSizeshNQ4ISI;
    org.bouncycastle.asn1.x509.AlgorithmIdentifier getHighSpeedVideoFpsRanges;
    org.bouncycastle.asn1.ASN1BitString getHighSpeedVideoSizes;

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public org.bouncycastle.asn1.ASN1Primitive toASN1Primitive() {
        return this.Camera2StreamConfigurationMap;
    }

    public int getVersionNumber() {
        return this.getHighResolutionOutputSizeshNQ4ISI.getVersionNumber();
    }

    public org.bouncycastle.asn1.ASN1Integer getVersion() {
        return this.getHighResolutionOutputSizeshNQ4ISI.getVersion();
    }

    public org.bouncycastle.asn1.x509.TBSCertificate getTBSCertificate() {
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
        return this.getHighSpeedVideoFpsRanges;
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

    public static org.bouncycastle.asn1.x509.Certificate getInstance(org.bouncycastle.asn1.ASN1TaggedObject aSN1TaggedObject, boolean z) {
        return getInstance(org.bouncycastle.asn1.ASN1Sequence.getInstance(aSN1TaggedObject, z));
    }

    public static org.bouncycastle.asn1.x509.Certificate getInstance(java.lang.Object obj) {
        if (obj instanceof org.bouncycastle.asn1.x509.Certificate) {
            return (org.bouncycastle.asn1.x509.Certificate) obj;
        }
        if (obj != null) {
            return new org.bouncycastle.asn1.x509.Certificate(org.bouncycastle.asn1.ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    private Certificate(org.bouncycastle.asn1.ASN1Sequence aSN1Sequence) {
        this.Camera2StreamConfigurationMap = aSN1Sequence;
        if (aSN1Sequence.size() != 3) {
            throw new java.lang.IllegalArgumentException("sequence wrong size for a certificate");
        }
        this.getHighResolutionOutputSizeshNQ4ISI = org.bouncycastle.asn1.x509.TBSCertificate.getInstance(aSN1Sequence.getObjectAt(0));
        this.getHighSpeedVideoFpsRanges = org.bouncycastle.asn1.x509.AlgorithmIdentifier.getInstance(aSN1Sequence.getObjectAt(1));
        this.getHighSpeedVideoSizes = org.bouncycastle.asn1.ASN1BitString.getInstance(aSN1Sequence.getObjectAt(2));
    }
}
