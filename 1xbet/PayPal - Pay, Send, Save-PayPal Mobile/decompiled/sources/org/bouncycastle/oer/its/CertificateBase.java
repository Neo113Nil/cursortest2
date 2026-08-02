package org.bouncycastle.oer.its;

/* loaded from: classes17.dex */
public class CertificateBase extends org.bouncycastle.asn1.ASN1Object {
    private final org.bouncycastle.oer.its.CertificateType Camera2StreamConfigurationMap;
    private final org.bouncycastle.oer.its.ToBeSignedCertificate getHighResolutionOutputSizeshNQ4ISI;
    private final org.bouncycastle.oer.its.IssuerIdentifier getHighSpeedVideoFpsRanges;
    private final org.bouncycastle.oer.its.Signature getHighSpeedVideoFpsRangesFor;
    private final org.bouncycastle.asn1.ASN1Integer getHighSpeedVideoSizes;

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public org.bouncycastle.asn1.ASN1Primitive toASN1Primitive() {
        return org.bouncycastle.oer.its.Utils.getHighSpeedVideoSizes(this.getHighSpeedVideoSizes, this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRanges, this.getHighResolutionOutputSizeshNQ4ISI, org.bouncycastle.oer.OEROptional.getInstance(this.getHighSpeedVideoFpsRangesFor));
    }

    public static class Builder {
        private org.bouncycastle.asn1.ASN1Integer Camera2StreamConfigurationMap;
        private org.bouncycastle.oer.its.CertificateType getHighResolutionOutputSizeshNQ4ISI;
        private org.bouncycastle.oer.its.IssuerIdentifier getHighSpeedVideoFpsRanges;
        private org.bouncycastle.oer.its.Signature getHighSpeedVideoFpsRangesFor;
        private org.bouncycastle.oer.its.ToBeSignedCertificate getHighSpeedVideoSizes;

        public org.bouncycastle.oer.its.CertificateBase.Builder setVersion(org.bouncycastle.asn1.ASN1Integer aSN1Integer) {
            this.Camera2StreamConfigurationMap = aSN1Integer;
            return this;
        }

        public org.bouncycastle.oer.its.CertificateBase.Builder setType(org.bouncycastle.oer.its.CertificateType certificateType) {
            this.getHighResolutionOutputSizeshNQ4ISI = certificateType;
            return this;
        }

        public org.bouncycastle.oer.its.CertificateBase.Builder setToBeSignedCertificate(org.bouncycastle.oer.its.ToBeSignedCertificate toBeSignedCertificate) {
            this.getHighSpeedVideoSizes = toBeSignedCertificate;
            return this;
        }

        public org.bouncycastle.oer.its.CertificateBase.Builder setSignature(org.bouncycastle.oer.its.Signature signature) {
            this.getHighSpeedVideoFpsRangesFor = signature;
            return this;
        }

        public org.bouncycastle.oer.its.CertificateBase.Builder setIssuer(org.bouncycastle.oer.its.IssuerIdentifier issuerIdentifier) {
            this.getHighSpeedVideoFpsRanges = issuerIdentifier;
            return this;
        }

        public org.bouncycastle.oer.its.CertificateBase createCertificateBase() {
            return new org.bouncycastle.oer.its.CertificateBase(this.Camera2StreamConfigurationMap, this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRangesFor);
        }
    }

    public org.bouncycastle.asn1.ASN1Integer getVersion() {
        return this.getHighSpeedVideoSizes;
    }

    public org.bouncycastle.oer.its.CertificateType getType() {
        return this.Camera2StreamConfigurationMap;
    }

    public org.bouncycastle.oer.its.ToBeSignedCertificate getToBeSignedCertificate() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public org.bouncycastle.oer.its.Signature getSignature() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public org.bouncycastle.oer.its.IssuerIdentifier getIssuer() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public static org.bouncycastle.oer.its.CertificateBase getInstance(java.lang.Object obj) {
        if (obj instanceof org.bouncycastle.oer.its.CertificateBase) {
            return (org.bouncycastle.oer.its.CertificateBase) obj;
        }
        org.bouncycastle.asn1.ASN1Sequence aSN1Sequence = org.bouncycastle.asn1.ASN1Sequence.getInstance(obj);
        org.bouncycastle.asn1.ASN1Integer aSN1Integer = org.bouncycastle.asn1.ASN1Integer.getInstance(aSN1Sequence.getObjectAt(0));
        org.bouncycastle.oer.its.CertificateType certificateType = org.bouncycastle.oer.its.CertificateType.getInstance((java.lang.Object) aSN1Sequence.getObjectAt(1));
        org.bouncycastle.oer.its.IssuerIdentifier issuerIdentifier = org.bouncycastle.oer.its.IssuerIdentifier.getInstance(aSN1Sequence.getObjectAt(2));
        org.bouncycastle.oer.its.ToBeSignedCertificate toBeSignedCertificate = org.bouncycastle.oer.its.ToBeSignedCertificate.getInstance(aSN1Sequence.getObjectAt(3));
        return new org.bouncycastle.oer.its.CertificateBase.Builder().setVersion(aSN1Integer).setType(certificateType).setIssuer(issuerIdentifier).setToBeSignedCertificate(toBeSignedCertificate).setSignature((org.bouncycastle.oer.its.Signature) org.bouncycastle.oer.OEROptional.getValue(org.bouncycastle.oer.its.Signature.class, aSN1Sequence.getObjectAt(4))).createCertificateBase();
    }

    public static org.bouncycastle.oer.its.CertificateBase.Builder builder() {
        return new org.bouncycastle.oer.its.CertificateBase.Builder();
    }

    public CertificateBase(org.bouncycastle.asn1.ASN1Integer aSN1Integer, org.bouncycastle.oer.its.CertificateType certificateType, org.bouncycastle.oer.its.IssuerIdentifier issuerIdentifier, org.bouncycastle.oer.its.ToBeSignedCertificate toBeSignedCertificate, org.bouncycastle.oer.its.Signature signature) {
        this.getHighSpeedVideoSizes = aSN1Integer;
        this.Camera2StreamConfigurationMap = certificateType;
        this.getHighSpeedVideoFpsRanges = issuerIdentifier;
        this.getHighResolutionOutputSizeshNQ4ISI = toBeSignedCertificate;
        this.getHighSpeedVideoFpsRangesFor = signature;
    }
}
