package org.bouncycastle.asn1.x509;

/* loaded from: classes17.dex */
public class V2AttributeCertificateInfoGenerator {
    private org.bouncycastle.asn1.x509.Extensions Camera2StreamConfigurationMap;
    private org.bouncycastle.asn1.x509.AttCertIssuer getHighResolutionOutputSizeshNQ4ISI;
    private org.bouncycastle.asn1.x509.Holder getHighSpeedVideoFpsRanges;
    private org.bouncycastle.asn1.ASN1GeneralizedTime getHighSpeedVideoFpsRangesFor;
    private org.bouncycastle.asn1.x509.AlgorithmIdentifier getHighSpeedVideoSizesFor;
    private org.bouncycastle.asn1.ASN1Integer getInputFormats;
    private org.bouncycastle.asn1.ASN1GeneralizedTime getInputSizeshNQ4ISI;
    private org.bouncycastle.asn1.DERBitString getOutputFormats;
    private org.bouncycastle.asn1.ASN1Integer getOutputMinFrameDuration = new org.bouncycastle.asn1.ASN1Integer(1);
    private org.bouncycastle.asn1.ASN1EncodableVector getHighSpeedVideoSizes = new org.bouncycastle.asn1.ASN1EncodableVector();

    public void setStartDate(org.bouncycastle.asn1.ASN1GeneralizedTime aSN1GeneralizedTime) {
        this.getInputSizeshNQ4ISI = aSN1GeneralizedTime;
    }

    public void setSignature(org.bouncycastle.asn1.x509.AlgorithmIdentifier algorithmIdentifier) {
        this.getHighSpeedVideoSizesFor = algorithmIdentifier;
    }

    public void setSerialNumber(org.bouncycastle.asn1.ASN1Integer aSN1Integer) {
        this.getInputFormats = aSN1Integer;
    }

    public void setIssuerUniqueID(org.bouncycastle.asn1.DERBitString dERBitString) {
        this.getOutputFormats = dERBitString;
    }

    public void setIssuer(org.bouncycastle.asn1.x509.AttCertIssuer attCertIssuer) {
        this.getHighResolutionOutputSizeshNQ4ISI = attCertIssuer;
    }

    public void setHolder(org.bouncycastle.asn1.x509.Holder holder) {
        this.getHighSpeedVideoFpsRanges = holder;
    }

    public void setExtensions(org.bouncycastle.asn1.x509.X509Extensions x509Extensions) {
        this.Camera2StreamConfigurationMap = org.bouncycastle.asn1.x509.Extensions.getInstance(x509Extensions.toASN1Primitive());
    }

    public void setExtensions(org.bouncycastle.asn1.x509.Extensions extensions) {
        this.Camera2StreamConfigurationMap = extensions;
    }

    public void setEndDate(org.bouncycastle.asn1.ASN1GeneralizedTime aSN1GeneralizedTime) {
        this.getHighSpeedVideoFpsRangesFor = aSN1GeneralizedTime;
    }

    public org.bouncycastle.asn1.x509.AttributeCertificateInfo generateAttributeCertificateInfo() {
        if (this.getInputFormats == null || this.getHighSpeedVideoSizesFor == null || this.getHighResolutionOutputSizeshNQ4ISI == null || this.getInputSizeshNQ4ISI == null || this.getHighSpeedVideoFpsRangesFor == null || this.getHighSpeedVideoFpsRanges == null || this.getHighSpeedVideoSizes == null) {
            throw new java.lang.IllegalStateException("not all mandatory fields set in V2 AttributeCertificateInfo generator");
        }
        org.bouncycastle.asn1.ASN1EncodableVector aSN1EncodableVector = new org.bouncycastle.asn1.ASN1EncodableVector(9);
        aSN1EncodableVector.add(this.getOutputMinFrameDuration);
        aSN1EncodableVector.add(this.getHighSpeedVideoFpsRanges);
        aSN1EncodableVector.add(this.getHighResolutionOutputSizeshNQ4ISI);
        aSN1EncodableVector.add(this.getHighSpeedVideoSizesFor);
        aSN1EncodableVector.add(this.getInputFormats);
        aSN1EncodableVector.add(new org.bouncycastle.asn1.x509.AttCertValidityPeriod(this.getInputSizeshNQ4ISI, this.getHighSpeedVideoFpsRangesFor));
        aSN1EncodableVector.add(new org.bouncycastle.asn1.DERSequence(this.getHighSpeedVideoSizes));
        org.bouncycastle.asn1.DERBitString dERBitString = this.getOutputFormats;
        if (dERBitString != null) {
            aSN1EncodableVector.add(dERBitString);
        }
        org.bouncycastle.asn1.x509.Extensions extensions = this.Camera2StreamConfigurationMap;
        if (extensions != null) {
            aSN1EncodableVector.add(extensions);
        }
        return org.bouncycastle.asn1.x509.AttributeCertificateInfo.getInstance(new org.bouncycastle.asn1.DERSequence(aSN1EncodableVector));
    }

    public void addAttribute(org.bouncycastle.asn1.x509.Attribute attribute) {
        this.getHighSpeedVideoSizes.add(attribute);
    }

    public void addAttribute(java.lang.String str, org.bouncycastle.asn1.ASN1Encodable aSN1Encodable) {
        this.getHighSpeedVideoSizes.add(new org.bouncycastle.asn1.x509.Attribute(new org.bouncycastle.asn1.ASN1ObjectIdentifier(str), new org.bouncycastle.asn1.DERSet(aSN1Encodable)));
    }
}
