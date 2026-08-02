package org.bouncycastle.oer.its;

/* loaded from: classes17.dex */
public class TwoDLocation extends org.bouncycastle.asn1.ASN1Object {
    private final org.bouncycastle.oer.its.Latitude Camera2StreamConfigurationMap;
    private final org.bouncycastle.oer.its.Longitude getHighSpeedVideoFpsRanges;

    public static class Builder {
        private org.bouncycastle.oer.its.Longitude getHighSpeedVideoFpsRangesFor;
        private org.bouncycastle.oer.its.Latitude getHighSpeedVideoSizes;

        public org.bouncycastle.oer.its.TwoDLocation.Builder setLongitude(org.bouncycastle.oer.its.Longitude longitude) {
            this.getHighSpeedVideoFpsRangesFor = longitude;
            return this;
        }

        public org.bouncycastle.oer.its.TwoDLocation.Builder setLatitude(org.bouncycastle.oer.its.Latitude latitude) {
            this.getHighSpeedVideoSizes = latitude;
            return this;
        }

        public org.bouncycastle.oer.its.TwoDLocation createTwoDLocation() {
            return new org.bouncycastle.oer.its.TwoDLocation(this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRangesFor);
        }
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public org.bouncycastle.asn1.ASN1Primitive toASN1Primitive() {
        return new org.bouncycastle.asn1.DERSequence(new org.bouncycastle.asn1.ASN1Encodable[]{this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRanges});
    }

    public org.bouncycastle.oer.its.Longitude getLongitude() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public org.bouncycastle.oer.its.Latitude getLatitude() {
        return this.Camera2StreamConfigurationMap;
    }

    public static org.bouncycastle.oer.its.TwoDLocation getInstance(java.lang.Object obj) {
        if (obj instanceof org.bouncycastle.oer.its.TwoDLocation) {
            return (org.bouncycastle.oer.its.TwoDLocation) obj;
        }
        org.bouncycastle.asn1.ASN1Sequence aSN1Sequence = org.bouncycastle.asn1.ASN1Sequence.getInstance(obj);
        return new org.bouncycastle.oer.its.TwoDLocation(org.bouncycastle.oer.its.Latitude.getInstance((java.lang.Object) aSN1Sequence.getObjectAt(0)), org.bouncycastle.oer.its.Longitude.getInstance((java.lang.Object) aSN1Sequence.getObjectAt(1)));
    }

    public TwoDLocation(org.bouncycastle.oer.its.Latitude latitude, org.bouncycastle.oer.its.Longitude longitude) {
        this.Camera2StreamConfigurationMap = latitude;
        this.getHighSpeedVideoFpsRanges = longitude;
    }
}
