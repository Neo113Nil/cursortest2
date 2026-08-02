package org.bouncycastle.oer.its;

/* loaded from: classes17.dex */
public class CountryAndRegions extends org.bouncycastle.asn1.ASN1Object implements org.bouncycastle.oer.its.RegionInterface {
    private final java.util.List<org.bouncycastle.oer.its.Region> getHighSpeedVideoFpsRanges;
    private final org.bouncycastle.oer.its.CountryOnly getHighSpeedVideoSizes;

    public static class CountryAndRegionsBuilder {
        private java.util.List<org.bouncycastle.oer.its.Region> Camera2StreamConfigurationMap = new java.util.ArrayList();
        private org.bouncycastle.oer.its.CountryOnly getHighResolutionOutputSizeshNQ4ISI;

        public org.bouncycastle.oer.its.CountryAndRegions.CountryAndRegionsBuilder setRegionList(java.util.List<org.bouncycastle.oer.its.Region> list) {
            this.Camera2StreamConfigurationMap.addAll(list);
            return this;
        }

        public org.bouncycastle.oer.its.CountryAndRegions.CountryAndRegionsBuilder setCountryOnly(org.bouncycastle.oer.its.CountryOnly countryOnly) {
            this.getHighResolutionOutputSizeshNQ4ISI = countryOnly;
            return this;
        }

        public org.bouncycastle.oer.its.CountryAndRegions build() {
            return new org.bouncycastle.oer.its.CountryAndRegions(this.getHighResolutionOutputSizeshNQ4ISI, this.Camera2StreamConfigurationMap);
        }

        public org.bouncycastle.oer.its.CountryAndRegions.CountryAndRegionsBuilder addRegion(org.bouncycastle.oer.its.Region region) {
            this.Camera2StreamConfigurationMap.add(region);
            return this;
        }
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public org.bouncycastle.asn1.ASN1Primitive toASN1Primitive() {
        return org.bouncycastle.oer.its.Utils.getHighSpeedVideoSizes(this.getHighSpeedVideoSizes, org.bouncycastle.oer.its.Utils.getHighSpeedVideoSizes(this.getHighSpeedVideoFpsRanges));
    }

    public java.util.List<org.bouncycastle.oer.its.Region> getRegions() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public org.bouncycastle.oer.its.CountryOnly getCountryOnly() {
        return this.getHighSpeedVideoSizes;
    }

    public static org.bouncycastle.oer.its.CountryAndRegions getInstance(java.lang.Object obj) {
        if (obj instanceof org.bouncycastle.oer.its.CountryAndRegions) {
            return (org.bouncycastle.oer.its.CountryAndRegions) obj;
        }
        org.bouncycastle.asn1.ASN1Sequence aSN1Sequence = org.bouncycastle.asn1.ASN1Sequence.getInstance(obj);
        return new org.bouncycastle.oer.its.CountryAndRegions(org.bouncycastle.oer.its.CountryOnly.getInstance((java.lang.Object) aSN1Sequence.getObjectAt(0)), org.bouncycastle.oer.its.Utils.getHighSpeedVideoFpsRangesFor(org.bouncycastle.oer.its.Region.class, org.bouncycastle.asn1.ASN1Sequence.getInstance(aSN1Sequence.getObjectAt(1))));
    }

    public static org.bouncycastle.oer.its.CountryAndRegions.CountryAndRegionsBuilder builder() {
        return new org.bouncycastle.oer.its.CountryAndRegions.CountryAndRegionsBuilder();
    }

    public CountryAndRegions(org.bouncycastle.oer.its.CountryOnly countryOnly, java.util.List<org.bouncycastle.oer.its.Region> list) {
        this.getHighSpeedVideoSizes = countryOnly;
        this.getHighSpeedVideoFpsRanges = java.util.Collections.unmodifiableList(list);
    }
}
