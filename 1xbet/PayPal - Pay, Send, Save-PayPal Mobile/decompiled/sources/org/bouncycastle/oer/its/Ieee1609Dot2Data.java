package org.bouncycastle.oer.its;

/* loaded from: classes17.dex */
public class Ieee1609Dot2Data extends org.bouncycastle.asn1.ASN1Object {
    private final org.bouncycastle.oer.its.Ieee1609Dot2Content Camera2StreamConfigurationMap;
    private final org.bouncycastle.oer.its.Uint8 getHighSpeedVideoFpsRanges;

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public org.bouncycastle.asn1.ASN1Primitive toASN1Primitive() {
        return org.bouncycastle.oer.its.Utils.getHighSpeedVideoSizes(this.getHighSpeedVideoFpsRanges, this.Camera2StreamConfigurationMap);
    }

    public static class Builder {
        private org.bouncycastle.oer.its.Uint8 Camera2StreamConfigurationMap;
        private org.bouncycastle.oer.its.Ieee1609Dot2Content getHighResolutionOutputSizeshNQ4ISI;

        public org.bouncycastle.oer.its.Ieee1609Dot2Data.Builder setProtocolVersion(org.bouncycastle.oer.its.Uint8 uint8) {
            this.Camera2StreamConfigurationMap = uint8;
            return this;
        }

        public org.bouncycastle.oer.its.Ieee1609Dot2Data.Builder setContent(org.bouncycastle.oer.its.Ieee1609Dot2Content ieee1609Dot2Content) {
            this.getHighResolutionOutputSizeshNQ4ISI = ieee1609Dot2Content;
            return this;
        }

        public org.bouncycastle.oer.its.Ieee1609Dot2Data build() {
            return new org.bouncycastle.oer.its.Ieee1609Dot2Data(this.Camera2StreamConfigurationMap, this.getHighResolutionOutputSizeshNQ4ISI);
        }
    }

    public org.bouncycastle.oer.its.Uint8 getProtocolVersion() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public org.bouncycastle.oer.its.Ieee1609Dot2Content getContent() {
        return this.Camera2StreamConfigurationMap;
    }

    public static org.bouncycastle.oer.its.Ieee1609Dot2Data getInstance(java.lang.Object obj) {
        if (obj instanceof org.bouncycastle.oer.its.Ieee1609Dot2Data) {
            return (org.bouncycastle.oer.its.Ieee1609Dot2Data) obj;
        }
        java.util.Iterator<org.bouncycastle.asn1.ASN1Encodable> it = org.bouncycastle.asn1.ASN1Sequence.getInstance(obj).iterator();
        return new org.bouncycastle.oer.its.Ieee1609Dot2Data(org.bouncycastle.oer.its.Uint8.getInstance(it.next()), org.bouncycastle.oer.its.Ieee1609Dot2Content.getInstance(it.next()));
    }

    public static org.bouncycastle.oer.its.Ieee1609Dot2Data.Builder builder() {
        return new org.bouncycastle.oer.its.Ieee1609Dot2Data.Builder();
    }

    public Ieee1609Dot2Data(org.bouncycastle.oer.its.Uint8 uint8, org.bouncycastle.oer.its.Ieee1609Dot2Content ieee1609Dot2Content) {
        this.getHighSpeedVideoFpsRanges = uint8;
        this.Camera2StreamConfigurationMap = ieee1609Dot2Content;
    }
}
