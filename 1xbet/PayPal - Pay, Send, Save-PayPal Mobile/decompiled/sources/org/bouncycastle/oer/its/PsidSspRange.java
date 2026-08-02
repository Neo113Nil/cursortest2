package org.bouncycastle.oer.its;

/* loaded from: classes17.dex */
public class PsidSspRange extends org.bouncycastle.asn1.ASN1Object {
    private final org.bouncycastle.asn1.ASN1Integer getHighResolutionOutputSizeshNQ4ISI;
    private final org.bouncycastle.oer.OEROptional getHighSpeedVideoFpsRangesFor;

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public org.bouncycastle.asn1.ASN1Primitive toASN1Primitive() {
        org.bouncycastle.asn1.ASN1EncodableVector aSN1EncodableVector = new org.bouncycastle.asn1.ASN1EncodableVector();
        aSN1EncodableVector.add(this.getHighResolutionOutputSizeshNQ4ISI);
        org.bouncycastle.oer.OEROptional oEROptional = this.getHighSpeedVideoFpsRangesFor;
        if (oEROptional != null) {
            aSN1EncodableVector.add(oEROptional);
        }
        return new org.bouncycastle.asn1.DERSequence(aSN1EncodableVector);
    }

    public static class Builder {
        private org.bouncycastle.asn1.ASN1Integer getHighSpeedVideoFpsRanges;
        private org.bouncycastle.oer.OEROptional getHighSpeedVideoFpsRangesFor = org.bouncycastle.oer.OEROptional.ABSENT;

        public org.bouncycastle.oer.its.PsidSspRange.Builder setSspRange(org.bouncycastle.oer.its.SspRange sspRange) {
            this.getHighSpeedVideoFpsRangesFor = org.bouncycastle.oer.OEROptional.getInstance(sspRange);
            return this;
        }

        public org.bouncycastle.oer.its.PsidSspRange.Builder setPsid(org.bouncycastle.asn1.ASN1Integer aSN1Integer) {
            this.getHighSpeedVideoFpsRanges = aSN1Integer;
            return this;
        }

        public org.bouncycastle.oer.its.PsidSspRange.Builder setPsid(long j) {
            this.getHighSpeedVideoFpsRanges = new org.bouncycastle.asn1.ASN1Integer(j);
            return this;
        }

        public org.bouncycastle.oer.its.PsidSspRange createPsidSspRange() {
            return new org.bouncycastle.oer.its.PsidSspRange(this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoFpsRangesFor);
        }
    }

    public org.bouncycastle.oer.OEROptional getSspRange() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public org.bouncycastle.asn1.ASN1Integer getPsid() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public static org.bouncycastle.oer.its.PsidSspRange getInstance(java.lang.Object obj) {
        if (obj == null) {
            return null;
        }
        if (obj instanceof org.bouncycastle.oer.its.PsidSspRange) {
            return (org.bouncycastle.oer.its.PsidSspRange) obj;
        }
        org.bouncycastle.asn1.ASN1Sequence aSN1Sequence = org.bouncycastle.asn1.ASN1Sequence.getInstance(obj);
        return new org.bouncycastle.oer.its.PsidSspRange(org.bouncycastle.asn1.ASN1Integer.getInstance(aSN1Sequence.getObjectAt(0)), org.bouncycastle.oer.OEROptional.getInstance(aSN1Sequence.getObjectAt(1)));
    }

    public static org.bouncycastle.oer.its.PsidSspRange.Builder builder() {
        return new org.bouncycastle.oer.its.PsidSspRange.Builder();
    }

    public PsidSspRange(org.bouncycastle.asn1.ASN1Integer aSN1Integer, org.bouncycastle.oer.its.SspRange sspRange) {
        this.getHighResolutionOutputSizeshNQ4ISI = aSN1Integer;
        this.getHighSpeedVideoFpsRangesFor = org.bouncycastle.oer.OEROptional.getInstance(sspRange);
    }

    public PsidSspRange(org.bouncycastle.asn1.ASN1Integer aSN1Integer, org.bouncycastle.oer.OEROptional oEROptional) {
        this.getHighResolutionOutputSizeshNQ4ISI = aSN1Integer;
        this.getHighSpeedVideoFpsRangesFor = oEROptional;
    }
}
