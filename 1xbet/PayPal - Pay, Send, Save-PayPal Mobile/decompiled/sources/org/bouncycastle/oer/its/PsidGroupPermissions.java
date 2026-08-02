package org.bouncycastle.oer.its;

/* loaded from: classes17.dex */
public class PsidGroupPermissions extends org.bouncycastle.asn1.ASN1Object {
    private final org.bouncycastle.oer.its.EndEntityType getHighResolutionOutputSizeshNQ4ISI;
    private final org.bouncycastle.asn1.ASN1Integer getHighSpeedVideoFpsRanges;
    private final org.bouncycastle.oer.its.SubjectPermissions getHighSpeedVideoFpsRangesFor;
    private final org.bouncycastle.asn1.ASN1Integer getHighSpeedVideoSizes;

    public static class Builder {
        private org.bouncycastle.asn1.ASN1Integer Camera2StreamConfigurationMap;
        private org.bouncycastle.asn1.ASN1Integer getHighSpeedVideoFpsRanges;
        private org.bouncycastle.oer.its.SubjectPermissions getHighSpeedVideoFpsRangesFor;
        private org.bouncycastle.oer.its.EndEntityType getHighSpeedVideoSizes;

        public org.bouncycastle.oer.its.PsidGroupPermissions.Builder setSubjectPermissions(org.bouncycastle.oer.its.SubjectPermissions subjectPermissions) {
            this.getHighSpeedVideoFpsRangesFor = subjectPermissions;
            return this;
        }

        public org.bouncycastle.oer.its.PsidGroupPermissions.Builder setMinChainLength(org.bouncycastle.asn1.ASN1Integer aSN1Integer) {
            this.Camera2StreamConfigurationMap = aSN1Integer;
            return this;
        }

        public org.bouncycastle.oer.its.PsidGroupPermissions.Builder setMinChainLength(java.math.BigInteger bigInteger) {
            this.Camera2StreamConfigurationMap = new org.bouncycastle.asn1.ASN1Integer(bigInteger);
            return this;
        }

        public org.bouncycastle.oer.its.PsidGroupPermissions.Builder setMinChainLength(long j) {
            this.Camera2StreamConfigurationMap = new org.bouncycastle.asn1.ASN1Integer(j);
            return this;
        }

        public org.bouncycastle.oer.its.PsidGroupPermissions.Builder setEeType(org.bouncycastle.oer.its.EndEntityType endEntityType) {
            this.getHighSpeedVideoSizes = endEntityType;
            return this;
        }

        public org.bouncycastle.oer.its.PsidGroupPermissions.Builder setChainLengthRange(org.bouncycastle.asn1.ASN1Integer aSN1Integer) {
            this.getHighSpeedVideoFpsRanges = aSN1Integer;
            return this;
        }

        public org.bouncycastle.oer.its.PsidGroupPermissions.Builder setChainLengthRange(java.math.BigInteger bigInteger) {
            this.getHighSpeedVideoFpsRanges = new org.bouncycastle.asn1.ASN1Integer(bigInteger);
            return this;
        }

        public org.bouncycastle.oer.its.PsidGroupPermissions.Builder setChainLengthRange(long j) {
            this.getHighSpeedVideoFpsRanges = new org.bouncycastle.asn1.ASN1Integer(j);
            return this;
        }

        public org.bouncycastle.oer.its.PsidGroupPermissions createPsidGroupPermissions() {
            return new org.bouncycastle.oer.its.PsidGroupPermissions(this.getHighSpeedVideoFpsRangesFor, this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoSizes);
        }
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public org.bouncycastle.asn1.ASN1Primitive toASN1Primitive() {
        return new org.bouncycastle.asn1.DERSequence(new org.bouncycastle.asn1.ASN1Encodable[]{this.getHighSpeedVideoFpsRangesFor, org.bouncycastle.oer.OEROptional.getInstance(this.getHighSpeedVideoFpsRanges), org.bouncycastle.oer.OEROptional.getInstance(this.getHighSpeedVideoSizes), org.bouncycastle.oer.OEROptional.getInstance(this.getHighResolutionOutputSizeshNQ4ISI)});
    }

    public org.bouncycastle.oer.its.SubjectPermissions getSubjectPermissions() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public org.bouncycastle.asn1.ASN1Integer getMinChainLength() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public org.bouncycastle.oer.its.EndEntityType getEeType() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public org.bouncycastle.asn1.ASN1Integer getChainLengthRange() {
        return this.getHighSpeedVideoSizes;
    }

    public static org.bouncycastle.oer.its.PsidGroupPermissions getInstance(java.lang.Object obj) {
        if (obj instanceof org.bouncycastle.oer.its.PsidGroupPermissions) {
            return (org.bouncycastle.oer.its.PsidGroupPermissions) obj;
        }
        if (obj != null) {
            return new org.bouncycastle.oer.its.PsidGroupPermissions(org.bouncycastle.asn1.ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    public static org.bouncycastle.oer.its.PsidGroupPermissions.Builder builder() {
        return new org.bouncycastle.oer.its.PsidGroupPermissions.Builder();
    }

    public PsidGroupPermissions(org.bouncycastle.oer.its.SubjectPermissions subjectPermissions, org.bouncycastle.asn1.ASN1Integer aSN1Integer, org.bouncycastle.asn1.ASN1Integer aSN1Integer2, org.bouncycastle.oer.its.EndEntityType endEntityType) {
        this.getHighSpeedVideoFpsRangesFor = subjectPermissions;
        this.getHighSpeedVideoFpsRanges = aSN1Integer;
        this.getHighSpeedVideoSizes = aSN1Integer2;
        this.getHighResolutionOutputSizeshNQ4ISI = endEntityType;
    }

    private PsidGroupPermissions(org.bouncycastle.asn1.ASN1Sequence aSN1Sequence) {
        this.getHighSpeedVideoFpsRangesFor = org.bouncycastle.oer.its.SubjectPermissions.getInstance(aSN1Sequence.getObjectAt(0));
        this.getHighSpeedVideoFpsRanges = (org.bouncycastle.asn1.ASN1Integer) org.bouncycastle.oer.OEROptional.getInstance(aSN1Sequence.getObjectAt(1)).getObject(org.bouncycastle.asn1.ASN1Integer.class);
        this.getHighSpeedVideoSizes = (org.bouncycastle.asn1.ASN1Integer) org.bouncycastle.oer.OEROptional.getInstance(aSN1Sequence.getObjectAt(2)).getObject(org.bouncycastle.asn1.ASN1Integer.class);
        this.getHighResolutionOutputSizeshNQ4ISI = (org.bouncycastle.oer.its.EndEntityType) org.bouncycastle.oer.OEROptional.getInstance(aSN1Sequence.getObjectAt(3)).getObject(org.bouncycastle.oer.its.EndEntityType.class);
    }
}
