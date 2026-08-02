package org.bouncycastle.asn1.x509;

/* loaded from: classes17.dex */
public class AttributeCertificateInfo extends org.bouncycastle.asn1.ASN1Object {
    private org.bouncycastle.asn1.x509.AttCertValidityPeriod Camera2StreamConfigurationMap;
    private org.bouncycastle.asn1.ASN1Sequence getHighResolutionOutputSizeshNQ4ISI;
    private org.bouncycastle.asn1.x509.Holder getHighSpeedVideoFpsRanges;
    private org.bouncycastle.asn1.x509.AttCertIssuer getHighSpeedVideoFpsRangesFor;
    private org.bouncycastle.asn1.x509.Extensions getHighSpeedVideoSizes;
    private org.bouncycastle.asn1.ASN1Integer getInputFormats;
    private org.bouncycastle.asn1.x509.AlgorithmIdentifier getInputSizeshNQ4ISI;
    private org.bouncycastle.asn1.ASN1Integer getOutputFormats;
    private org.bouncycastle.asn1.ASN1BitString getOutputMinFrameDuration;

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public org.bouncycastle.asn1.ASN1Primitive toASN1Primitive() {
        org.bouncycastle.asn1.ASN1EncodableVector aSN1EncodableVector = new org.bouncycastle.asn1.ASN1EncodableVector(9);
        if (!this.getOutputFormats.hasValue(0)) {
            aSN1EncodableVector.add(this.getOutputFormats);
        }
        aSN1EncodableVector.add(this.getHighSpeedVideoFpsRanges);
        aSN1EncodableVector.add(this.getHighSpeedVideoFpsRangesFor);
        aSN1EncodableVector.add(this.getInputSizeshNQ4ISI);
        aSN1EncodableVector.add(this.getInputFormats);
        aSN1EncodableVector.add(this.Camera2StreamConfigurationMap);
        aSN1EncodableVector.add(this.getHighResolutionOutputSizeshNQ4ISI);
        org.bouncycastle.asn1.ASN1BitString aSN1BitString = this.getOutputMinFrameDuration;
        if (aSN1BitString != null) {
            aSN1EncodableVector.add(aSN1BitString);
        }
        org.bouncycastle.asn1.x509.Extensions extensions = this.getHighSpeedVideoSizes;
        if (extensions != null) {
            aSN1EncodableVector.add(extensions);
        }
        return new org.bouncycastle.asn1.DERSequence(aSN1EncodableVector);
    }

    public org.bouncycastle.asn1.ASN1Integer getVersion() {
        return this.getOutputFormats;
    }

    public org.bouncycastle.asn1.x509.AlgorithmIdentifier getSignature() {
        return this.getInputSizeshNQ4ISI;
    }

    public org.bouncycastle.asn1.ASN1Integer getSerialNumber() {
        return this.getInputFormats;
    }

    public org.bouncycastle.asn1.ASN1BitString getIssuerUniqueID() {
        return this.getOutputMinFrameDuration;
    }

    public org.bouncycastle.asn1.x509.AttCertIssuer getIssuer() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public org.bouncycastle.asn1.x509.Holder getHolder() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public org.bouncycastle.asn1.x509.Extensions getExtensions() {
        return this.getHighSpeedVideoSizes;
    }

    public org.bouncycastle.asn1.ASN1Sequence getAttributes() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public org.bouncycastle.asn1.x509.AttCertValidityPeriod getAttrCertValidityPeriod() {
        return this.Camera2StreamConfigurationMap;
    }

    public static org.bouncycastle.asn1.x509.AttributeCertificateInfo getInstance(org.bouncycastle.asn1.ASN1TaggedObject aSN1TaggedObject, boolean z) {
        return getInstance(org.bouncycastle.asn1.ASN1Sequence.getInstance(aSN1TaggedObject, z));
    }

    public static org.bouncycastle.asn1.x509.AttributeCertificateInfo getInstance(java.lang.Object obj) {
        if (obj instanceof org.bouncycastle.asn1.x509.AttributeCertificateInfo) {
            return (org.bouncycastle.asn1.x509.AttributeCertificateInfo) obj;
        }
        if (obj != null) {
            return new org.bouncycastle.asn1.x509.AttributeCertificateInfo(org.bouncycastle.asn1.ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    private AttributeCertificateInfo(org.bouncycastle.asn1.ASN1Sequence aSN1Sequence) {
        if (aSN1Sequence.size() < 6 || aSN1Sequence.size() > 9) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Bad sequence size: ");
            sb.append(aSN1Sequence.size());
            throw new java.lang.IllegalArgumentException(sb.toString());
        }
        int i = 0;
        if (aSN1Sequence.getObjectAt(0) instanceof org.bouncycastle.asn1.ASN1Integer) {
            this.getOutputFormats = org.bouncycastle.asn1.ASN1Integer.getInstance(aSN1Sequence.getObjectAt(0));
            i = 1;
        } else {
            this.getOutputFormats = new org.bouncycastle.asn1.ASN1Integer(0L);
        }
        this.getHighSpeedVideoFpsRanges = org.bouncycastle.asn1.x509.Holder.getInstance(aSN1Sequence.getObjectAt(i));
        this.getHighSpeedVideoFpsRangesFor = org.bouncycastle.asn1.x509.AttCertIssuer.getInstance(aSN1Sequence.getObjectAt(i + 1));
        this.getInputSizeshNQ4ISI = org.bouncycastle.asn1.x509.AlgorithmIdentifier.getInstance(aSN1Sequence.getObjectAt(i + 2));
        this.getInputFormats = org.bouncycastle.asn1.ASN1Integer.getInstance(aSN1Sequence.getObjectAt(i + 3));
        this.Camera2StreamConfigurationMap = org.bouncycastle.asn1.x509.AttCertValidityPeriod.getInstance(aSN1Sequence.getObjectAt(i + 4));
        this.getHighResolutionOutputSizeshNQ4ISI = org.bouncycastle.asn1.ASN1Sequence.getInstance(aSN1Sequence.getObjectAt(i + 5));
        for (int i2 = i + 6; i2 < aSN1Sequence.size(); i2++) {
            org.bouncycastle.asn1.ASN1Encodable objectAt = aSN1Sequence.getObjectAt(i2);
            if (objectAt instanceof org.bouncycastle.asn1.ASN1BitString) {
                this.getOutputMinFrameDuration = org.bouncycastle.asn1.ASN1BitString.getInstance(aSN1Sequence.getObjectAt(i2));
            } else if ((objectAt instanceof org.bouncycastle.asn1.ASN1Sequence) || (objectAt instanceof org.bouncycastle.asn1.x509.Extensions)) {
                this.getHighSpeedVideoSizes = org.bouncycastle.asn1.x509.Extensions.getInstance(aSN1Sequence.getObjectAt(i2));
            }
        }
    }
}
