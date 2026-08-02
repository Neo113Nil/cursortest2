package org.bouncycastle.asn1.crmf;

/* loaded from: classes17.dex */
public class CertTemplateBuilder {
    private org.bouncycastle.asn1.x500.X500Name Camera2StreamConfigurationMap;
    private org.bouncycastle.asn1.ASN1Integer getHighResolutionOutputSizeshNQ4ISI;
    private org.bouncycastle.asn1.x509.Extensions getHighSpeedVideoFpsRanges;
    private org.bouncycastle.asn1.x509.SubjectPublicKeyInfo getHighSpeedVideoFpsRangesFor;
    private org.bouncycastle.asn1.DERBitString getHighSpeedVideoSizes;
    private org.bouncycastle.asn1.DERBitString getHighSpeedVideoSizesFor;
    private org.bouncycastle.asn1.x500.X500Name getInputFormats;
    private org.bouncycastle.asn1.crmf.OptionalValidity getInputSizeshNQ4ISI;
    private org.bouncycastle.asn1.ASN1Integer getOutputFormats;
    private org.bouncycastle.asn1.x509.AlgorithmIdentifier getOutputMinFrameDuration;

    public org.bouncycastle.asn1.crmf.CertTemplate build() {
        org.bouncycastle.asn1.ASN1EncodableVector aSN1EncodableVector = new org.bouncycastle.asn1.ASN1EncodableVector(10);
        org.bouncycastle.asn1.ASN1Integer aSN1Integer = this.getOutputFormats;
        if (aSN1Integer != null) {
            aSN1EncodableVector.add(new org.bouncycastle.asn1.DERTaggedObject(false, 0, (org.bouncycastle.asn1.ASN1Encodable) aSN1Integer));
        }
        org.bouncycastle.asn1.ASN1Integer aSN1Integer2 = this.getHighResolutionOutputSizeshNQ4ISI;
        if (aSN1Integer2 != null) {
            aSN1EncodableVector.add(new org.bouncycastle.asn1.DERTaggedObject(false, 1, (org.bouncycastle.asn1.ASN1Encodable) aSN1Integer2));
        }
        org.bouncycastle.asn1.x509.AlgorithmIdentifier algorithmIdentifier = this.getOutputMinFrameDuration;
        if (algorithmIdentifier != null) {
            aSN1EncodableVector.add(new org.bouncycastle.asn1.DERTaggedObject(false, 2, (org.bouncycastle.asn1.ASN1Encodable) algorithmIdentifier));
        }
        org.bouncycastle.asn1.x500.X500Name x500Name = this.Camera2StreamConfigurationMap;
        if (x500Name != null) {
            aSN1EncodableVector.add(new org.bouncycastle.asn1.DERTaggedObject(true, 3, (org.bouncycastle.asn1.ASN1Encodable) x500Name));
        }
        org.bouncycastle.asn1.crmf.OptionalValidity optionalValidity = this.getInputSizeshNQ4ISI;
        if (optionalValidity != null) {
            aSN1EncodableVector.add(new org.bouncycastle.asn1.DERTaggedObject(false, 4, (org.bouncycastle.asn1.ASN1Encodable) optionalValidity));
        }
        org.bouncycastle.asn1.x500.X500Name x500Name2 = this.getInputFormats;
        if (x500Name2 != null) {
            aSN1EncodableVector.add(new org.bouncycastle.asn1.DERTaggedObject(true, 5, (org.bouncycastle.asn1.ASN1Encodable) x500Name2));
        }
        org.bouncycastle.asn1.x509.SubjectPublicKeyInfo subjectPublicKeyInfo = this.getHighSpeedVideoFpsRangesFor;
        if (subjectPublicKeyInfo != null) {
            aSN1EncodableVector.add(new org.bouncycastle.asn1.DERTaggedObject(false, 6, (org.bouncycastle.asn1.ASN1Encodable) subjectPublicKeyInfo));
        }
        org.bouncycastle.asn1.DERBitString dERBitString = this.getHighSpeedVideoSizes;
        if (dERBitString != null) {
            aSN1EncodableVector.add(new org.bouncycastle.asn1.DERTaggedObject(false, 7, (org.bouncycastle.asn1.ASN1Encodable) dERBitString));
        }
        org.bouncycastle.asn1.DERBitString dERBitString2 = this.getHighSpeedVideoSizesFor;
        if (dERBitString2 != null) {
            aSN1EncodableVector.add(new org.bouncycastle.asn1.DERTaggedObject(false, 8, (org.bouncycastle.asn1.ASN1Encodable) dERBitString2));
        }
        org.bouncycastle.asn1.x509.Extensions extensions = this.getHighSpeedVideoFpsRanges;
        if (extensions != null) {
            aSN1EncodableVector.add(new org.bouncycastle.asn1.DERTaggedObject(false, 9, (org.bouncycastle.asn1.ASN1Encodable) extensions));
        }
        return org.bouncycastle.asn1.crmf.CertTemplate.getInstance(new org.bouncycastle.asn1.DERSequence(aSN1EncodableVector));
    }

    public org.bouncycastle.asn1.crmf.CertTemplateBuilder setVersion(int i) {
        this.getOutputFormats = new org.bouncycastle.asn1.ASN1Integer(i);
        return this;
    }

    public org.bouncycastle.asn1.crmf.CertTemplateBuilder setValidity(org.bouncycastle.asn1.crmf.OptionalValidity optionalValidity) {
        this.getInputSizeshNQ4ISI = optionalValidity;
        return this;
    }

    public org.bouncycastle.asn1.crmf.CertTemplateBuilder setSubjectUID(org.bouncycastle.asn1.DERBitString dERBitString) {
        this.getHighSpeedVideoSizesFor = dERBitString;
        return this;
    }

    public org.bouncycastle.asn1.crmf.CertTemplateBuilder setSubject(org.bouncycastle.asn1.x500.X500Name x500Name) {
        this.getInputFormats = x500Name;
        return this;
    }

    public org.bouncycastle.asn1.crmf.CertTemplateBuilder setSigningAlg(org.bouncycastle.asn1.x509.AlgorithmIdentifier algorithmIdentifier) {
        this.getOutputMinFrameDuration = algorithmIdentifier;
        return this;
    }

    public org.bouncycastle.asn1.crmf.CertTemplateBuilder setSerialNumber(org.bouncycastle.asn1.ASN1Integer aSN1Integer) {
        this.getHighResolutionOutputSizeshNQ4ISI = aSN1Integer;
        return this;
    }

    public org.bouncycastle.asn1.crmf.CertTemplateBuilder setPublicKey(org.bouncycastle.asn1.x509.SubjectPublicKeyInfo subjectPublicKeyInfo) {
        this.getHighSpeedVideoFpsRangesFor = subjectPublicKeyInfo;
        return this;
    }

    public org.bouncycastle.asn1.crmf.CertTemplateBuilder setIssuerUID(org.bouncycastle.asn1.DERBitString dERBitString) {
        this.getHighSpeedVideoSizes = dERBitString;
        return this;
    }

    public org.bouncycastle.asn1.crmf.CertTemplateBuilder setIssuer(org.bouncycastle.asn1.x500.X500Name x500Name) {
        this.Camera2StreamConfigurationMap = x500Name;
        return this;
    }

    public org.bouncycastle.asn1.crmf.CertTemplateBuilder setExtensions(org.bouncycastle.asn1.x509.X509Extensions x509Extensions) {
        return setExtensions(org.bouncycastle.asn1.x509.Extensions.getInstance(x509Extensions));
    }

    public org.bouncycastle.asn1.crmf.CertTemplateBuilder setExtensions(org.bouncycastle.asn1.x509.Extensions extensions) {
        this.getHighSpeedVideoFpsRanges = extensions;
        return this;
    }
}
