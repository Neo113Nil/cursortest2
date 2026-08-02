package org.bouncycastle.oer.its;

/* loaded from: classes17.dex */
public class RegionAndSubregions extends org.bouncycastle.asn1.ASN1Object implements org.bouncycastle.oer.its.RegionInterface {
    private final org.bouncycastle.oer.its.Region getHighResolutionOutputSizeshNQ4ISI;
    private final java.util.List<org.bouncycastle.oer.its.Uint16> getHighSpeedVideoFpsRanges;

    public static class Builder {
        private java.util.List<org.bouncycastle.oer.its.Uint16> getHighSpeedVideoFpsRanges;
        private org.bouncycastle.oer.its.Region getHighSpeedVideoSizes;

        public org.bouncycastle.oer.its.RegionAndSubregions.Builder setSubRegions(java.util.List<org.bouncycastle.oer.its.Uint16> list) {
            this.getHighSpeedVideoFpsRanges = list;
            return this;
        }

        public org.bouncycastle.oer.its.RegionAndSubregions.Builder setSubRegion(org.bouncycastle.oer.its.Uint16... uint16Arr) {
            this.getHighSpeedVideoFpsRanges.addAll(java.util.Arrays.asList(uint16Arr));
            return this;
        }

        public org.bouncycastle.oer.its.RegionAndSubregions.Builder setRegion(org.bouncycastle.oer.its.Region region) {
            this.getHighSpeedVideoSizes = region;
            return this;
        }

        public org.bouncycastle.oer.its.RegionAndSubregions createRegionAndSubregions() {
            return new org.bouncycastle.oer.its.RegionAndSubregions(this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRanges);
        }
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public org.bouncycastle.asn1.ASN1Primitive toASN1Primitive() {
        return org.bouncycastle.oer.its.Utils.getHighSpeedVideoSizes(this.getHighResolutionOutputSizeshNQ4ISI, org.bouncycastle.oer.its.Utils.getHighSpeedVideoSizes(this.getHighSpeedVideoFpsRanges));
    }

    public static org.bouncycastle.oer.its.RegionAndSubregions getInstance(java.lang.Object obj) {
        if (obj instanceof org.bouncycastle.oer.its.RegionAndSubregions) {
            return (org.bouncycastle.oer.its.RegionAndSubregions) obj;
        }
        org.bouncycastle.asn1.ASN1Sequence aSN1Sequence = org.bouncycastle.asn1.ASN1Sequence.getInstance(0);
        org.bouncycastle.oer.its.RegionAndSubregions.Builder builder = new org.bouncycastle.oer.its.RegionAndSubregions.Builder();
        builder.setRegion(org.bouncycastle.oer.its.Region.getInstance((java.lang.Object) aSN1Sequence.getObjectAt(0)));
        java.util.Iterator<org.bouncycastle.asn1.ASN1Encodable> it = org.bouncycastle.asn1.ASN1Sequence.getInstance(aSN1Sequence.getObjectAt(1)).iterator();
        while (it.hasNext()) {
            builder.setSubRegion(org.bouncycastle.oer.its.Uint16.getInstance(it.next()));
        }
        return builder.createRegionAndSubregions();
    }

    public RegionAndSubregions(org.bouncycastle.oer.its.Region region, java.util.List<org.bouncycastle.oer.its.Uint16> list) {
        this.getHighResolutionOutputSizeshNQ4ISI = region;
        this.getHighSpeedVideoFpsRanges = java.util.Collections.unmodifiableList(list);
    }
}
