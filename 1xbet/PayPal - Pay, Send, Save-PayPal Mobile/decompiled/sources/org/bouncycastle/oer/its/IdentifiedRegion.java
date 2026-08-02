package org.bouncycastle.oer.its;

/* loaded from: classes17.dex */
public class IdentifiedRegion extends org.bouncycastle.asn1.ASN1Object implements org.bouncycastle.asn1.ASN1Choice, org.bouncycastle.oer.its.RegionInterface {
    public static final int countAndSubregions = 2;
    public static final int countryAndRegions = 1;
    public static final int countryOnly = 0;
    public static final int extension = 3;
    private org.bouncycastle.asn1.ASN1Encodable Camera2StreamConfigurationMap;
    private int getHighSpeedVideoFpsRanges;

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public org.bouncycastle.asn1.ASN1Primitive toASN1Primitive() {
        return new org.bouncycastle.asn1.DERTaggedObject(this.getHighSpeedVideoFpsRanges, (org.bouncycastle.asn1.ASN1Object) this.Camera2StreamConfigurationMap).toASN1Primitive();
    }

    public static org.bouncycastle.oer.its.IdentifiedRegion getInstance(java.lang.Object obj) {
        if (obj instanceof org.bouncycastle.oer.its.IdentifiedRegion) {
            return (org.bouncycastle.oer.its.IdentifiedRegion) obj;
        }
        org.bouncycastle.asn1.ASN1TaggedObject aSN1TaggedObject = org.bouncycastle.asn1.ASN1TaggedObject.getInstance(obj);
        int tagNo = aSN1TaggedObject.getTagNo();
        org.bouncycastle.asn1.ASN1Primitive object = aSN1TaggedObject.getObject();
        if (tagNo == 0) {
            return new org.bouncycastle.oer.its.IdentifiedRegion(tagNo, org.bouncycastle.oer.its.CountryOnly.getInstance((java.lang.Object) object));
        }
        if (tagNo == 1) {
            return new org.bouncycastle.oer.its.IdentifiedRegion(tagNo, org.bouncycastle.oer.its.CountryAndRegions.getInstance(object));
        }
        if (tagNo == 2) {
            return new org.bouncycastle.oer.its.IdentifiedRegion(tagNo, org.bouncycastle.oer.its.RegionAndSubregions.getInstance(object));
        }
        if (tagNo == 3) {
            return new org.bouncycastle.oer.its.IdentifiedRegion(tagNo, org.bouncycastle.asn1.DEROctetString.getInstance(object));
        }
        throw new java.lang.IllegalArgumentException("unknown choice ".concat(java.lang.String.valueOf(tagNo)));
    }

    public IdentifiedRegion(int i, org.bouncycastle.asn1.ASN1Encodable aSN1Encodable) {
        this.getHighSpeedVideoFpsRanges = i;
        this.Camera2StreamConfigurationMap = aSN1Encodable;
    }
}
