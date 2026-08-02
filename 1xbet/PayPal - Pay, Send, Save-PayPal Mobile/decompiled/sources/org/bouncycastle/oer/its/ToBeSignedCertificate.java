package org.bouncycastle.oer.its;

/* loaded from: classes17.dex */
public class ToBeSignedCertificate extends org.bouncycastle.asn1.ASN1Object {
    private final org.bouncycastle.asn1.ASN1Null Camera2StreamConfigurationMap;
    private final org.bouncycastle.oer.its.SequenceOfPsidSsp getHighResolutionOutputSizeshNQ4ISI;
    private final org.bouncycastle.oer.its.SubjectAssurance getHighSpeedVideoFpsRanges;
    private final org.bouncycastle.oer.its.SequenceOfPsidGroupPermissions getHighSpeedVideoFpsRangesFor;
    private final org.bouncycastle.oer.its.SequenceOfPsidGroupPermissions getHighSpeedVideoSizes;
    private final org.bouncycastle.oer.its.GeographicRegion getHighSpeedVideoSizesFor;
    private final org.bouncycastle.oer.its.CrlSeries getInputFormats;
    private final org.bouncycastle.oer.its.CertificateId getInputSizeshNQ4ISI;
    private final org.bouncycastle.oer.its.PublicEncryptionKey getOutputFormats;
    private final org.bouncycastle.oer.its.HashedId getOutputMinFrameDuration;
    private final org.bouncycastle.oer.its.ValidityPeriod getOutputSizes;
    private final org.bouncycastle.oer.its.VerificationKeyIndicator getOutputSizeshNQ4ISI;

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public org.bouncycastle.asn1.ASN1Primitive toASN1Primitive() {
        return org.bouncycastle.oer.its.Utils.getHighSpeedVideoSizes(this.getInputSizeshNQ4ISI, this.getOutputMinFrameDuration, this.getInputFormats, this.getOutputSizes, org.bouncycastle.oer.OEROptional.getInstance(this.getHighSpeedVideoSizesFor), org.bouncycastle.oer.OEROptional.getInstance(this.getHighSpeedVideoFpsRanges), org.bouncycastle.oer.OEROptional.getInstance(this.getHighResolutionOutputSizeshNQ4ISI), org.bouncycastle.oer.OEROptional.getInstance(this.getHighSpeedVideoFpsRangesFor), org.bouncycastle.oer.OEROptional.getInstance(this.getHighSpeedVideoSizes), org.bouncycastle.oer.OEROptional.getInstance(this.Camera2StreamConfigurationMap), org.bouncycastle.oer.OEROptional.getInstance(this.getOutputFormats), this.getOutputSizeshNQ4ISI);
    }

    public org.bouncycastle.oer.its.VerificationKeyIndicator getVerificationKeyIndicator() {
        return this.getOutputSizeshNQ4ISI;
    }

    public org.bouncycastle.oer.its.ValidityPeriod getValidityPeriod() {
        return this.getOutputSizes;
    }

    public org.bouncycastle.oer.its.GeographicRegion getGeographicRegion() {
        return this.getHighSpeedVideoSizesFor;
    }

    public org.bouncycastle.oer.its.PublicEncryptionKey getEncryptionKey() {
        return this.getOutputFormats;
    }

    public org.bouncycastle.oer.its.CrlSeries getCrlSeries() {
        return this.getInputFormats;
    }

    public org.bouncycastle.oer.its.HashedId getCracaId() {
        return this.getOutputMinFrameDuration;
    }

    public org.bouncycastle.oer.its.CertificateId getCertificateId() {
        return this.getInputSizeshNQ4ISI;
    }

    public org.bouncycastle.oer.its.SequenceOfPsidGroupPermissions getCertRequestPermissions() {
        return this.getHighSpeedVideoSizes;
    }

    public org.bouncycastle.oer.its.SequenceOfPsidGroupPermissions getCertIssuePermissions() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public static class Builder {
        private org.bouncycastle.oer.its.SequenceOfPsidGroupPermissions Camera2StreamConfigurationMap;
        private org.bouncycastle.asn1.ASN1Null getHighResolutionOutputSizeshNQ4ISI;
        private org.bouncycastle.oer.its.SequenceOfPsidSsp getHighSpeedVideoFpsRanges;
        private org.bouncycastle.oer.its.SubjectAssurance getHighSpeedVideoFpsRangesFor;
        private org.bouncycastle.oer.its.SequenceOfPsidGroupPermissions getHighSpeedVideoSizes;
        private org.bouncycastle.oer.its.HashedId getHighSpeedVideoSizesFor;
        private org.bouncycastle.oer.its.GeographicRegion getInputFormats;
        private org.bouncycastle.oer.its.CertificateId getInputSizeshNQ4ISI;
        private org.bouncycastle.oer.its.CrlSeries getOutputFormats;
        private org.bouncycastle.oer.its.PublicEncryptionKey getOutputMinFrameDuration;
        private org.bouncycastle.oer.its.VerificationKeyIndicator getOutputMinFrameDurationlomOqCM;
        private org.bouncycastle.oer.its.ValidityPeriod getOutputStallDuration;

        public org.bouncycastle.oer.its.ToBeSignedCertificate.Builder setVerificationKeyIndicator(org.bouncycastle.oer.its.VerificationKeyIndicator verificationKeyIndicator) {
            this.getOutputMinFrameDurationlomOqCM = verificationKeyIndicator;
            return this;
        }

        public org.bouncycastle.oer.its.ToBeSignedCertificate.Builder setValidityPeriod(org.bouncycastle.oer.its.ValidityPeriod validityPeriod) {
            this.getOutputStallDuration = validityPeriod;
            return this;
        }

        public org.bouncycastle.oer.its.ToBeSignedCertificate.Builder setGeographicRegion(org.bouncycastle.oer.its.GeographicRegion geographicRegion) {
            this.getInputFormats = geographicRegion;
            return this;
        }

        public org.bouncycastle.oer.its.ToBeSignedCertificate.Builder setEncryptionKey(org.bouncycastle.oer.its.PublicEncryptionKey publicEncryptionKey) {
            this.getOutputMinFrameDuration = publicEncryptionKey;
            return this;
        }

        public org.bouncycastle.oer.its.ToBeSignedCertificate.Builder setCrlSeries(org.bouncycastle.oer.its.CrlSeries crlSeries) {
            this.getOutputFormats = crlSeries;
            return this;
        }

        public org.bouncycastle.oer.its.ToBeSignedCertificate.Builder setCracaId(org.bouncycastle.oer.its.HashedId hashedId) {
            this.getHighSpeedVideoSizesFor = hashedId;
            return this;
        }

        public org.bouncycastle.oer.its.ToBeSignedCertificate.Builder setCertificateId(org.bouncycastle.oer.its.CertificateId certificateId) {
            this.getInputSizeshNQ4ISI = certificateId;
            return this;
        }

        public org.bouncycastle.oer.its.ToBeSignedCertificate.Builder setCertRequestPermissions(org.bouncycastle.oer.its.SequenceOfPsidGroupPermissions sequenceOfPsidGroupPermissions) {
            this.Camera2StreamConfigurationMap = sequenceOfPsidGroupPermissions;
            return this;
        }

        public org.bouncycastle.oer.its.ToBeSignedCertificate.Builder setCertIssuePermissions(org.bouncycastle.oer.its.SequenceOfPsidGroupPermissions sequenceOfPsidGroupPermissions) {
            this.getHighSpeedVideoSizes = sequenceOfPsidGroupPermissions;
            return this;
        }

        public org.bouncycastle.oer.its.ToBeSignedCertificate.Builder setCanRequestRollover(org.bouncycastle.asn1.ASN1Null aSN1Null) {
            this.getHighResolutionOutputSizeshNQ4ISI = aSN1Null;
            return this;
        }

        public org.bouncycastle.oer.its.ToBeSignedCertificate.Builder setAssuranceLevel(org.bouncycastle.oer.its.SubjectAssurance subjectAssurance) {
            this.getHighSpeedVideoFpsRangesFor = subjectAssurance;
            return this;
        }

        public org.bouncycastle.oer.its.ToBeSignedCertificate.Builder setAppPermissions(org.bouncycastle.oer.its.SequenceOfPsidSsp sequenceOfPsidSsp) {
            this.getHighSpeedVideoFpsRanges = sequenceOfPsidSsp;
            return this;
        }

        public org.bouncycastle.oer.its.ToBeSignedCertificate createToBeSignedCertificate() {
            return new org.bouncycastle.oer.its.ToBeSignedCertificate(this.getInputSizeshNQ4ISI, this.getHighSpeedVideoSizesFor, this.getOutputFormats, this.getOutputStallDuration, this.getInputFormats, this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoSizes, this.Camera2StreamConfigurationMap, this.getHighResolutionOutputSizeshNQ4ISI, this.getOutputMinFrameDuration, this.getOutputMinFrameDurationlomOqCM);
        }

        public Builder(org.bouncycastle.oer.its.ToBeSignedCertificate toBeSignedCertificate) {
            this.getInputSizeshNQ4ISI = toBeSignedCertificate.getInputSizeshNQ4ISI;
            this.getHighSpeedVideoSizesFor = toBeSignedCertificate.getOutputMinFrameDuration;
            this.getOutputFormats = toBeSignedCertificate.getInputFormats;
            this.getOutputStallDuration = toBeSignedCertificate.getOutputSizes;
            this.getInputFormats = toBeSignedCertificate.getHighSpeedVideoSizesFor;
            this.getHighSpeedVideoFpsRangesFor = toBeSignedCertificate.getHighSpeedVideoFpsRanges;
            this.getHighSpeedVideoFpsRanges = toBeSignedCertificate.getHighResolutionOutputSizeshNQ4ISI;
            this.getHighSpeedVideoSizes = toBeSignedCertificate.getHighSpeedVideoFpsRangesFor;
            this.Camera2StreamConfigurationMap = toBeSignedCertificate.getHighSpeedVideoSizes;
            this.getHighResolutionOutputSizeshNQ4ISI = toBeSignedCertificate.Camera2StreamConfigurationMap;
            this.getOutputMinFrameDuration = toBeSignedCertificate.getOutputFormats;
            this.getOutputMinFrameDurationlomOqCM = toBeSignedCertificate.getOutputSizeshNQ4ISI;
        }

        public Builder(org.bouncycastle.oer.its.ToBeSignedCertificate.Builder builder) {
            this.getInputSizeshNQ4ISI = builder.getInputSizeshNQ4ISI;
            this.getHighSpeedVideoSizesFor = builder.getHighSpeedVideoSizesFor;
            this.getOutputFormats = builder.getOutputFormats;
            this.getOutputStallDuration = builder.getOutputStallDuration;
            this.getInputFormats = builder.getInputFormats;
            this.getHighSpeedVideoFpsRangesFor = builder.getHighSpeedVideoFpsRangesFor;
            this.getHighSpeedVideoFpsRanges = builder.getHighSpeedVideoFpsRanges;
            this.getHighSpeedVideoSizes = builder.getHighSpeedVideoSizes;
            this.Camera2StreamConfigurationMap = builder.Camera2StreamConfigurationMap;
            this.getHighResolutionOutputSizeshNQ4ISI = builder.getHighResolutionOutputSizeshNQ4ISI;
            this.getOutputMinFrameDuration = builder.getOutputMinFrameDuration;
            this.getOutputMinFrameDurationlomOqCM = builder.getOutputMinFrameDurationlomOqCM;
        }

        public Builder() {
        }
    }

    public org.bouncycastle.asn1.ASN1Null getCanRequestRollover() {
        return this.Camera2StreamConfigurationMap;
    }

    public org.bouncycastle.oer.its.SubjectAssurance getAssuranceLevel() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public org.bouncycastle.oer.its.SequenceOfPsidSsp getAppPermissions() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public static org.bouncycastle.oer.its.ToBeSignedCertificate getInstance(java.lang.Object obj) {
        if (obj == null || (obj instanceof org.bouncycastle.oer.its.ToBeSignedCertificate)) {
            return (org.bouncycastle.oer.its.ToBeSignedCertificate) obj;
        }
        java.util.Iterator<org.bouncycastle.asn1.ASN1Encodable> it = org.bouncycastle.asn1.ASN1Sequence.getInstance(obj).iterator();
        return new org.bouncycastle.oer.its.ToBeSignedCertificate.Builder().setCertificateId(org.bouncycastle.oer.its.CertificateId.getInstance(it.next())).setCracaId(org.bouncycastle.oer.its.HashedId.getInstance(it.next())).setCrlSeries(org.bouncycastle.oer.its.CrlSeries.getInstance((java.lang.Object) it.next())).setValidityPeriod(org.bouncycastle.oer.its.ValidityPeriod.getInstance(it.next())).setGeographicRegion((org.bouncycastle.oer.its.GeographicRegion) org.bouncycastle.oer.OEROptional.getValue(org.bouncycastle.oer.its.GeographicRegion.class, it.next())).setAssuranceLevel((org.bouncycastle.oer.its.SubjectAssurance) org.bouncycastle.oer.OEROptional.getValue(org.bouncycastle.oer.its.SubjectAssurance.class, it.next())).setAppPermissions((org.bouncycastle.oer.its.SequenceOfPsidSsp) org.bouncycastle.oer.OEROptional.getValue(org.bouncycastle.oer.its.SequenceOfPsidSsp.class, it.next())).setCertIssuePermissions((org.bouncycastle.oer.its.SequenceOfPsidGroupPermissions) org.bouncycastle.oer.OEROptional.getValue(org.bouncycastle.oer.its.SequenceOfPsidGroupPermissions.class, it.next())).setCertRequestPermissions((org.bouncycastle.oer.its.SequenceOfPsidGroupPermissions) org.bouncycastle.oer.OEROptional.getValue(org.bouncycastle.oer.its.SequenceOfPsidGroupPermissions.class, it.next())).setCanRequestRollover((org.bouncycastle.asn1.ASN1Null) org.bouncycastle.oer.OEROptional.getValue(org.bouncycastle.asn1.ASN1Null.class, it.next())).setEncryptionKey((org.bouncycastle.oer.its.PublicEncryptionKey) org.bouncycastle.oer.OEROptional.getValue(org.bouncycastle.oer.its.PublicEncryptionKey.class, it.next())).setVerificationKeyIndicator(org.bouncycastle.oer.its.VerificationKeyIndicator.getInstance(it.next())).createToBeSignedCertificate();
    }

    public ToBeSignedCertificate(org.bouncycastle.oer.its.CertificateId certificateId, org.bouncycastle.oer.its.HashedId hashedId, org.bouncycastle.oer.its.CrlSeries crlSeries, org.bouncycastle.oer.its.ValidityPeriod validityPeriod, org.bouncycastle.oer.its.GeographicRegion geographicRegion, org.bouncycastle.oer.its.SubjectAssurance subjectAssurance, org.bouncycastle.oer.its.SequenceOfPsidSsp sequenceOfPsidSsp, org.bouncycastle.oer.its.SequenceOfPsidGroupPermissions sequenceOfPsidGroupPermissions, org.bouncycastle.oer.its.SequenceOfPsidGroupPermissions sequenceOfPsidGroupPermissions2, org.bouncycastle.asn1.ASN1Null aSN1Null, org.bouncycastle.oer.its.PublicEncryptionKey publicEncryptionKey, org.bouncycastle.oer.its.VerificationKeyIndicator verificationKeyIndicator) {
        this.getInputSizeshNQ4ISI = certificateId;
        this.getOutputMinFrameDuration = hashedId;
        this.getInputFormats = crlSeries;
        this.getOutputSizes = validityPeriod;
        this.getHighSpeedVideoSizesFor = geographicRegion;
        this.getHighSpeedVideoFpsRanges = subjectAssurance;
        this.getHighResolutionOutputSizeshNQ4ISI = sequenceOfPsidSsp;
        this.getHighSpeedVideoFpsRangesFor = sequenceOfPsidGroupPermissions;
        this.getHighSpeedVideoSizes = sequenceOfPsidGroupPermissions2;
        this.Camera2StreamConfigurationMap = aSN1Null;
        this.getOutputFormats = publicEncryptionKey;
        this.getOutputSizeshNQ4ISI = verificationKeyIndicator;
    }
}
