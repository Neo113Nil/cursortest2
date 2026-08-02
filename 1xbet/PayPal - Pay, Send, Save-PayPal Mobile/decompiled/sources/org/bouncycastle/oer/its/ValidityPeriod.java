package org.bouncycastle.oer.its;

/* loaded from: classes17.dex */
public class ValidityPeriod extends org.bouncycastle.asn1.ASN1Object {
    private final org.bouncycastle.asn1.ASN1Integer getHighResolutionOutputSizeshNQ4ISI;
    private final org.bouncycastle.oer.its.Duration getHighSpeedVideoFpsRanges;

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public org.bouncycastle.asn1.ASN1Primitive toASN1Primitive() {
        return new org.bouncycastle.asn1.DERSequence(new org.bouncycastle.asn1.ASN1Encodable[]{this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRanges});
    }

    public static class Builder {
        private org.bouncycastle.asn1.ASN1Integer Camera2StreamConfigurationMap;
        private org.bouncycastle.oer.its.Duration getHighSpeedVideoFpsRanges;

        public org.bouncycastle.oer.its.ValidityPeriod.Builder setTime32(org.bouncycastle.asn1.ASN1Integer aSN1Integer) {
            this.Camera2StreamConfigurationMap = aSN1Integer;
            return this;
        }

        public org.bouncycastle.oer.its.ValidityPeriod.Builder setDuration(org.bouncycastle.oer.its.Duration duration) {
            this.getHighSpeedVideoFpsRanges = duration;
            return this;
        }

        public org.bouncycastle.oer.its.ValidityPeriod createValidityPeriod() {
            return new org.bouncycastle.oer.its.ValidityPeriod(this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRanges);
        }
    }

    public org.bouncycastle.asn1.ASN1Integer getTime32() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public org.bouncycastle.oer.its.Duration getDuration() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public static org.bouncycastle.oer.its.ValidityPeriod getInstance(java.lang.Object obj) {
        if (obj instanceof org.bouncycastle.oer.its.ValidityPeriod) {
            return (org.bouncycastle.oer.its.ValidityPeriod) obj;
        }
        org.bouncycastle.asn1.ASN1Sequence aSN1Sequence = org.bouncycastle.asn1.ASN1Sequence.getInstance(obj);
        return new org.bouncycastle.oer.its.ValidityPeriod.Builder().setTime32(org.bouncycastle.asn1.ASN1Integer.getInstance(aSN1Sequence.getObjectAt(0))).setDuration(org.bouncycastle.oer.its.Duration.getInstance(aSN1Sequence.getObjectAt(1))).createValidityPeriod();
    }

    public static org.bouncycastle.oer.its.ValidityPeriod.Builder builder() {
        return new org.bouncycastle.oer.its.ValidityPeriod.Builder();
    }

    public ValidityPeriod(org.bouncycastle.asn1.ASN1Integer aSN1Integer, org.bouncycastle.oer.its.Duration duration) {
        this.getHighResolutionOutputSizeshNQ4ISI = aSN1Integer;
        this.getHighSpeedVideoFpsRanges = duration;
    }
}
