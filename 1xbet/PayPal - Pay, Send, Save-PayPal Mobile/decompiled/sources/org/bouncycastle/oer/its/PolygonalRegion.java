package org.bouncycastle.oer.its;

/* loaded from: classes17.dex */
public class PolygonalRegion extends org.bouncycastle.asn1.ASN1Object implements org.bouncycastle.oer.its.RegionInterface {
    private final java.util.List<org.bouncycastle.oer.its.TwoDLocation> getHighSpeedVideoFpsRanges;

    public static class Builder {
        private java.util.List<org.bouncycastle.oer.its.TwoDLocation> getHighSpeedVideoFpsRanges = new java.util.ArrayList();

        public org.bouncycastle.oer.its.PolygonalRegion.Builder setLocations(org.bouncycastle.oer.its.TwoDLocation... twoDLocationArr) {
            this.getHighSpeedVideoFpsRanges.addAll(java.util.Arrays.asList(twoDLocationArr));
            return this;
        }

        public org.bouncycastle.oer.its.PolygonalRegion.Builder setLocations(java.util.List<org.bouncycastle.oer.its.TwoDLocation> list) {
            this.getHighSpeedVideoFpsRanges = list;
            return this;
        }

        public org.bouncycastle.oer.its.PolygonalRegion createPolygonalRegion() {
            return new org.bouncycastle.oer.its.PolygonalRegion(this.getHighSpeedVideoFpsRanges);
        }
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public org.bouncycastle.asn1.ASN1Primitive toASN1Primitive() {
        return org.bouncycastle.oer.its.Utils.getHighSpeedVideoSizes(this.getHighSpeedVideoFpsRanges);
    }

    public java.util.List<org.bouncycastle.oer.its.TwoDLocation> getPoints() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public static org.bouncycastle.oer.its.PolygonalRegion getInstance(java.lang.Object obj) {
        if (obj instanceof org.bouncycastle.oer.its.PolygonalRegion) {
            return (org.bouncycastle.oer.its.PolygonalRegion) obj;
        }
        if (obj != null) {
            return new org.bouncycastle.oer.its.PolygonalRegion(org.bouncycastle.oer.its.Utils.getHighSpeedVideoFpsRangesFor(org.bouncycastle.oer.its.TwoDLocation.class, org.bouncycastle.asn1.ASN1Sequence.getInstance(obj)));
        }
        return null;
    }

    public PolygonalRegion(java.util.List<org.bouncycastle.oer.its.TwoDLocation> list) {
        this.getHighSpeedVideoFpsRanges = java.util.Collections.unmodifiableList(list);
    }
}
