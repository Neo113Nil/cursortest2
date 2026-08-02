package org.bouncycastle.asn1.x509;

/* loaded from: classes17.dex */
public class V1TBSCertificateGenerator {
    org.bouncycastle.asn1.x509.Time Camera2StreamConfigurationMap;
    org.bouncycastle.asn1.ASN1Integer getHighResolutionOutputSizeshNQ4ISI;
    org.bouncycastle.asn1.x509.Time getHighSpeedVideoFpsRanges;
    org.bouncycastle.asn1.x500.X500Name getHighSpeedVideoFpsRangesFor;
    org.bouncycastle.asn1.x509.AlgorithmIdentifier getHighSpeedVideoSizes;
    org.bouncycastle.asn1.x509.SubjectPublicKeyInfo getHighSpeedVideoSizesFor;
    org.bouncycastle.asn1.DERTaggedObject getOutputFormats = new org.bouncycastle.asn1.DERTaggedObject(true, 0, (org.bouncycastle.asn1.ASN1Encodable) new org.bouncycastle.asn1.ASN1Integer(0));
    org.bouncycastle.asn1.x500.X500Name getOutputMinFrameDuration;

    public void setSubjectPublicKeyInfo(org.bouncycastle.asn1.x509.SubjectPublicKeyInfo subjectPublicKeyInfo) {
        this.getHighSpeedVideoSizesFor = subjectPublicKeyInfo;
    }

    public void setSubject(org.bouncycastle.asn1.x509.X509Name x509Name) {
        this.getOutputMinFrameDuration = org.bouncycastle.asn1.x500.X500Name.getInstance(x509Name.toASN1Primitive());
    }

    public void setSubject(org.bouncycastle.asn1.x500.X500Name x500Name) {
        this.getOutputMinFrameDuration = x500Name;
    }

    public void setStartDate(org.bouncycastle.asn1.x509.Time time) {
        this.getHighSpeedVideoFpsRanges = time;
    }

    public void setStartDate(org.bouncycastle.asn1.ASN1UTCTime aSN1UTCTime) {
        this.getHighSpeedVideoFpsRanges = new org.bouncycastle.asn1.x509.Time(aSN1UTCTime);
    }

    public void setSignature(org.bouncycastle.asn1.x509.AlgorithmIdentifier algorithmIdentifier) {
        this.getHighSpeedVideoSizes = algorithmIdentifier;
    }

    public void setSerialNumber(org.bouncycastle.asn1.ASN1Integer aSN1Integer) {
        this.getHighResolutionOutputSizeshNQ4ISI = aSN1Integer;
    }

    public void setIssuer(org.bouncycastle.asn1.x509.X509Name x509Name) {
        this.getHighSpeedVideoFpsRangesFor = org.bouncycastle.asn1.x500.X500Name.getInstance(x509Name.toASN1Primitive());
    }

    public void setIssuer(org.bouncycastle.asn1.x500.X500Name x500Name) {
        this.getHighSpeedVideoFpsRangesFor = x500Name;
    }

    public void setEndDate(org.bouncycastle.asn1.x509.Time time) {
        this.Camera2StreamConfigurationMap = time;
    }

    public void setEndDate(org.bouncycastle.asn1.ASN1UTCTime aSN1UTCTime) {
        this.Camera2StreamConfigurationMap = new org.bouncycastle.asn1.x509.Time(aSN1UTCTime);
    }

    public org.bouncycastle.asn1.x509.TBSCertificate generateTBSCertificate() {
        if (this.getHighResolutionOutputSizeshNQ4ISI == null || this.getHighSpeedVideoSizes == null || this.getHighSpeedVideoFpsRangesFor == null || this.getHighSpeedVideoFpsRanges == null || this.Camera2StreamConfigurationMap == null || this.getOutputMinFrameDuration == null || this.getHighSpeedVideoSizesFor == null) {
            throw new java.lang.IllegalStateException("not all mandatory fields set in V1 TBScertificate generator");
        }
        org.bouncycastle.asn1.ASN1EncodableVector aSN1EncodableVector = new org.bouncycastle.asn1.ASN1EncodableVector(6);
        aSN1EncodableVector.add(this.getHighResolutionOutputSizeshNQ4ISI);
        aSN1EncodableVector.add(this.getHighSpeedVideoSizes);
        aSN1EncodableVector.add(this.getHighSpeedVideoFpsRangesFor);
        org.bouncycastle.asn1.ASN1EncodableVector aSN1EncodableVector2 = new org.bouncycastle.asn1.ASN1EncodableVector(2);
        aSN1EncodableVector2.add(this.getHighSpeedVideoFpsRanges);
        aSN1EncodableVector2.add(this.Camera2StreamConfigurationMap);
        aSN1EncodableVector.add(new org.bouncycastle.asn1.DERSequence(aSN1EncodableVector2));
        aSN1EncodableVector.add(this.getOutputMinFrameDuration);
        aSN1EncodableVector.add(this.getHighSpeedVideoSizesFor);
        return org.bouncycastle.asn1.x509.TBSCertificate.getInstance(new org.bouncycastle.asn1.DERSequence(aSN1EncodableVector));
    }
}
