package org.bouncycastle.oer.its;

/* loaded from: classes17.dex */
public class GeographicRegion extends org.bouncycastle.asn1.ASN1Object implements org.bouncycastle.asn1.ASN1Choice {
    public static final int circularRegion = 0;
    public static final int extension = 4;
    public static final int identifiedRegion = 3;
    public static final int polygonalRegion = 2;
    public static final int rectangularRegion = 1;
    private int getHighResolutionOutputSizeshNQ4ISI;
    private org.bouncycastle.asn1.ASN1Encodable getHighSpeedVideoSizes;

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public org.bouncycastle.asn1.ASN1Primitive toASN1Primitive() {
        return new org.bouncycastle.asn1.DERTaggedObject(this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoSizes);
    }

    public org.bouncycastle.asn1.ASN1Encodable getRegion() {
        return this.getHighSpeedVideoSizes;
    }

    public int getChoice() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public static org.bouncycastle.oer.its.GeographicRegion getInstance(java.lang.Object obj) {
        if (obj instanceof org.bouncycastle.oer.its.GeographicRegion) {
            return (org.bouncycastle.oer.its.GeographicRegion) obj;
        }
        org.bouncycastle.asn1.ASN1TaggedObject aSN1TaggedObject = org.bouncycastle.asn1.ASN1TaggedObject.getInstance(obj);
        int tagNo = aSN1TaggedObject.getTagNo();
        if (tagNo == 0) {
            return new org.bouncycastle.oer.its.GeographicRegion(tagNo, org.bouncycastle.oer.its.CircularRegion.getInstance(aSN1TaggedObject.getObject()));
        }
        if (tagNo == 1) {
            return new org.bouncycastle.oer.its.GeographicRegion(tagNo, org.bouncycastle.oer.its.SequenceOfRectangularRegion.getInstance(aSN1TaggedObject.getObject()));
        }
        if (tagNo == 2) {
            return new org.bouncycastle.oer.its.GeographicRegion(tagNo, org.bouncycastle.oer.its.PolygonalRegion.getInstance(aSN1TaggedObject.getObject()));
        }
        if (tagNo == 3) {
            return new org.bouncycastle.oer.its.GeographicRegion(tagNo, org.bouncycastle.oer.its.SequenceOfIdentifiedRegion.getInstance(aSN1TaggedObject.getObject()));
        }
        if (tagNo == 4) {
            return new org.bouncycastle.oer.its.GeographicRegion(tagNo, org.bouncycastle.asn1.DEROctetString.getInstance(aSN1TaggedObject.getObject()));
        }
        throw new java.lang.IllegalStateException("unknown region choice ".concat(java.lang.String.valueOf(tagNo)));
    }

    public GeographicRegion(int i, org.bouncycastle.asn1.ASN1Encodable aSN1Encodable) {
        this.getHighResolutionOutputSizeshNQ4ISI = i;
        this.getHighSpeedVideoSizes = aSN1Encodable;
    }
}
