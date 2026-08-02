package org.bouncycastle.oer.its;

/* loaded from: classes17.dex */
public class SignedDataPayload extends org.bouncycastle.asn1.ASN1Object {
    private final org.bouncycastle.oer.its.Ieee1609Dot2Data Camera2StreamConfigurationMap;
    private final org.bouncycastle.oer.its.HashedData getHighSpeedVideoFpsRangesFor;

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public org.bouncycastle.asn1.ASN1Primitive toASN1Primitive() {
        return new org.bouncycastle.asn1.DERSequence(new org.bouncycastle.asn1.ASN1EncodableVector());
    }

    public static class Builder {
        private org.bouncycastle.oer.its.Ieee1609Dot2Data getHighResolutionOutputSizeshNQ4ISI;
        private org.bouncycastle.oer.its.HashedData getHighSpeedVideoSizes;

        public org.bouncycastle.oer.its.SignedDataPayload.Builder setExtDataHash(org.bouncycastle.oer.its.HashedData hashedData) {
            this.getHighSpeedVideoSizes = hashedData;
            return this;
        }

        public org.bouncycastle.oer.its.SignedDataPayload.Builder setData(org.bouncycastle.oer.its.Ieee1609Dot2Data ieee1609Dot2Data) {
            this.getHighResolutionOutputSizeshNQ4ISI = ieee1609Dot2Data;
            return this;
        }

        public org.bouncycastle.oer.its.SignedDataPayload build() {
            return new org.bouncycastle.oer.its.SignedDataPayload(this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoSizes);
        }
    }

    public org.bouncycastle.oer.its.HashedData getExtDataHash() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public org.bouncycastle.oer.its.Ieee1609Dot2Data getData() {
        return this.Camera2StreamConfigurationMap;
    }

    public static org.bouncycastle.oer.its.SignedDataPayload getInstance(java.lang.Object obj) {
        if (obj instanceof org.bouncycastle.oer.its.SignedDataPayload) {
            return (org.bouncycastle.oer.its.SignedDataPayload) obj;
        }
        org.bouncycastle.asn1.ASN1Sequence aSN1Sequence = org.bouncycastle.asn1.ASN1Sequence.getInstance(obj);
        return new org.bouncycastle.oer.its.SignedDataPayload(org.bouncycastle.oer.its.Ieee1609Dot2Data.getInstance(aSN1Sequence.getObjectAt(0)), org.bouncycastle.oer.its.HashedData.getInstance(aSN1Sequence.getObjectAt(1)));
    }

    public static org.bouncycastle.oer.its.SignedDataPayload.Builder builder() {
        return new org.bouncycastle.oer.its.SignedDataPayload.Builder();
    }

    public SignedDataPayload(org.bouncycastle.oer.its.Ieee1609Dot2Data ieee1609Dot2Data, org.bouncycastle.oer.its.HashedData hashedData) {
        this.Camera2StreamConfigurationMap = ieee1609Dot2Data;
        this.getHighSpeedVideoFpsRangesFor = hashedData;
    }
}
