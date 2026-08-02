package org.bouncycastle.oer.its;

/* loaded from: classes17.dex */
public class CircularRegion extends org.bouncycastle.asn1.ASN1Object implements org.bouncycastle.oer.its.RegionInterface {
    private final org.bouncycastle.oer.its.Uint16 getHighSpeedVideoFpsRangesFor;
    private final org.bouncycastle.oer.its.TwoDLocation getHighSpeedVideoSizes;

    public static class Builder {
        private org.bouncycastle.oer.its.TwoDLocation Camera2StreamConfigurationMap;
        private org.bouncycastle.oer.its.Uint16 getHighResolutionOutputSizeshNQ4ISI;

        public org.bouncycastle.oer.its.CircularRegion.Builder setRadius(org.bouncycastle.oer.its.Uint16 uint16) {
            this.getHighResolutionOutputSizeshNQ4ISI = uint16;
            return this;
        }

        public org.bouncycastle.oer.its.CircularRegion.Builder setCenter(org.bouncycastle.oer.its.TwoDLocation twoDLocation) {
            this.Camera2StreamConfigurationMap = twoDLocation;
            return this;
        }

        public org.bouncycastle.oer.its.CircularRegion createCircularRegion() {
            return new org.bouncycastle.oer.its.CircularRegion(this.Camera2StreamConfigurationMap, this.getHighResolutionOutputSizeshNQ4ISI);
        }
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public org.bouncycastle.asn1.ASN1Primitive toASN1Primitive() {
        return org.bouncycastle.oer.its.Utils.getHighSpeedVideoSizes(this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRangesFor);
    }

    public org.bouncycastle.oer.its.Uint16 getRadius() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public org.bouncycastle.oer.its.TwoDLocation getCenter() {
        return this.getHighSpeedVideoSizes;
    }

    public static org.bouncycastle.oer.its.CircularRegion getInstance(java.lang.Object obj) {
        if (obj instanceof org.bouncycastle.oer.its.CircularRegion) {
            return (org.bouncycastle.oer.its.CircularRegion) obj;
        }
        org.bouncycastle.asn1.ASN1Sequence aSN1Sequence = org.bouncycastle.asn1.ASN1Sequence.getInstance(obj);
        return new org.bouncycastle.oer.its.CircularRegion(org.bouncycastle.oer.its.TwoDLocation.getInstance(aSN1Sequence.getObjectAt(0)), org.bouncycastle.oer.its.Uint16.getInstance(aSN1Sequence.getObjectAt(1)));
    }

    public CircularRegion(org.bouncycastle.oer.its.TwoDLocation twoDLocation, org.bouncycastle.oer.its.Uint16 uint16) {
        this.getHighSpeedVideoSizes = twoDLocation;
        this.getHighSpeedVideoFpsRangesFor = uint16;
    }
}
