package org.bouncycastle.asn1.x509;

/* loaded from: classes17.dex */
public class V3TBSCertificateGenerator {
    org.bouncycastle.asn1.x509.Time Camera2StreamConfigurationMap;
    org.bouncycastle.asn1.ASN1Integer getHighResolutionOutputSizeshNQ4ISI;
    org.bouncycastle.asn1.x509.AlgorithmIdentifier getHighSpeedVideoFpsRanges;
    org.bouncycastle.asn1.x500.X500Name getHighSpeedVideoFpsRangesFor;
    org.bouncycastle.asn1.x509.Extensions getHighSpeedVideoSizes;
    org.bouncycastle.asn1.x500.X500Name getHighSpeedVideoSizesFor;
    org.bouncycastle.asn1.DERTaggedObject getInputFormats = new org.bouncycastle.asn1.DERTaggedObject(true, 0, (org.bouncycastle.asn1.ASN1Encodable) new org.bouncycastle.asn1.ASN1Integer(2));
    private boolean getInputSizeshNQ4ISI;
    org.bouncycastle.asn1.x509.Time getOutputFormats;
    org.bouncycastle.asn1.x509.SubjectPublicKeyInfo getOutputMinFrameDuration;
    private org.bouncycastle.asn1.DERBitString getOutputSizeshNQ4ISI;
    private org.bouncycastle.asn1.DERBitString getOutputStallDurationlomOqCM;

    public void setSubjectUniqueID(org.bouncycastle.asn1.DERBitString dERBitString) {
        this.getOutputStallDurationlomOqCM = dERBitString;
    }

    public void setSubjectPublicKeyInfo(org.bouncycastle.asn1.x509.SubjectPublicKeyInfo subjectPublicKeyInfo) {
        this.getOutputMinFrameDuration = subjectPublicKeyInfo;
    }

    public void setSubject(org.bouncycastle.asn1.x509.X509Name x509Name) {
        this.getHighSpeedVideoSizesFor = org.bouncycastle.asn1.x500.X500Name.getInstance(x509Name.toASN1Primitive());
    }

    public void setSubject(org.bouncycastle.asn1.x500.X500Name x500Name) {
        this.getHighSpeedVideoSizesFor = x500Name;
    }

    public void setStartDate(org.bouncycastle.asn1.x509.Time time) {
        this.getOutputFormats = time;
    }

    public void setStartDate(org.bouncycastle.asn1.ASN1UTCTime aSN1UTCTime) {
        this.getOutputFormats = new org.bouncycastle.asn1.x509.Time(aSN1UTCTime);
    }

    public void setSignature(org.bouncycastle.asn1.x509.AlgorithmIdentifier algorithmIdentifier) {
        this.getHighSpeedVideoFpsRanges = algorithmIdentifier;
    }

    public void setSerialNumber(org.bouncycastle.asn1.ASN1Integer aSN1Integer) {
        this.getHighResolutionOutputSizeshNQ4ISI = aSN1Integer;
    }

    public void setIssuerUniqueID(org.bouncycastle.asn1.DERBitString dERBitString) {
        this.getOutputSizeshNQ4ISI = dERBitString;
    }

    public void setIssuer(org.bouncycastle.asn1.x509.X509Name x509Name) {
        this.getHighSpeedVideoFpsRangesFor = org.bouncycastle.asn1.x500.X500Name.getInstance(x509Name);
    }

    public void setIssuer(org.bouncycastle.asn1.x500.X500Name x500Name) {
        this.getHighSpeedVideoFpsRangesFor = x500Name;
    }

    public void setExtensions(org.bouncycastle.asn1.x509.X509Extensions x509Extensions) {
        setExtensions(org.bouncycastle.asn1.x509.Extensions.getInstance(x509Extensions));
    }

    public void setExtensions(org.bouncycastle.asn1.x509.Extensions extensions) {
        org.bouncycastle.asn1.x509.Extension extension;
        this.getHighSpeedVideoSizes = extensions;
        if (extensions == null || (extension = extensions.getExtension(org.bouncycastle.asn1.x509.Extension.subjectAlternativeName)) == null || !extension.isCritical()) {
            return;
        }
        this.getInputSizeshNQ4ISI = true;
    }

    public void setEndDate(org.bouncycastle.asn1.x509.Time time) {
        this.Camera2StreamConfigurationMap = time;
    }

    public void setEndDate(org.bouncycastle.asn1.ASN1UTCTime aSN1UTCTime) {
        this.Camera2StreamConfigurationMap = new org.bouncycastle.asn1.x509.Time(aSN1UTCTime);
    }

    public org.bouncycastle.asn1.x509.TBSCertificate generateTBSCertificate() {
        if (this.getHighResolutionOutputSizeshNQ4ISI == null || this.getHighSpeedVideoFpsRanges == null || this.getHighSpeedVideoFpsRangesFor == null || this.getOutputFormats == null || this.Camera2StreamConfigurationMap == null || ((this.getHighSpeedVideoSizesFor == null && !this.getInputSizeshNQ4ISI) || this.getOutputMinFrameDuration == null)) {
            throw new java.lang.IllegalStateException("not all mandatory fields set in V3 TBScertificate generator");
        }
        org.bouncycastle.asn1.ASN1EncodableVector aSN1EncodableVector = new org.bouncycastle.asn1.ASN1EncodableVector(10);
        aSN1EncodableVector.add(this.getInputFormats);
        aSN1EncodableVector.add(this.getHighResolutionOutputSizeshNQ4ISI);
        aSN1EncodableVector.add(this.getHighSpeedVideoFpsRanges);
        aSN1EncodableVector.add(this.getHighSpeedVideoFpsRangesFor);
        org.bouncycastle.asn1.ASN1EncodableVector aSN1EncodableVector2 = new org.bouncycastle.asn1.ASN1EncodableVector(2);
        aSN1EncodableVector2.add(this.getOutputFormats);
        aSN1EncodableVector2.add(this.Camera2StreamConfigurationMap);
        aSN1EncodableVector.add(new org.bouncycastle.asn1.DERSequence(aSN1EncodableVector2));
        org.bouncycastle.asn1.ASN1Encodable aSN1Encodable = this.getHighSpeedVideoSizesFor;
        if (aSN1Encodable == null) {
            aSN1Encodable = new org.bouncycastle.asn1.DERSequence();
        }
        aSN1EncodableVector.add(aSN1Encodable);
        aSN1EncodableVector.add(this.getOutputMinFrameDuration);
        org.bouncycastle.asn1.DERBitString dERBitString = this.getOutputSizeshNQ4ISI;
        if (dERBitString != null) {
            aSN1EncodableVector.add(new org.bouncycastle.asn1.DERTaggedObject(false, 1, (org.bouncycastle.asn1.ASN1Encodable) dERBitString));
        }
        org.bouncycastle.asn1.DERBitString dERBitString2 = this.getOutputStallDurationlomOqCM;
        if (dERBitString2 != null) {
            aSN1EncodableVector.add(new org.bouncycastle.asn1.DERTaggedObject(false, 2, (org.bouncycastle.asn1.ASN1Encodable) dERBitString2));
        }
        org.bouncycastle.asn1.x509.Extensions extensions = this.getHighSpeedVideoSizes;
        if (extensions != null) {
            aSN1EncodableVector.add(new org.bouncycastle.asn1.DERTaggedObject(true, 3, (org.bouncycastle.asn1.ASN1Encodable) extensions));
        }
        return org.bouncycastle.asn1.x509.TBSCertificate.getInstance(new org.bouncycastle.asn1.DERSequence(aSN1EncodableVector));
    }
}
