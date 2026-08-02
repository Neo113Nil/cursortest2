package org.bouncycastle.oer.its;

/* loaded from: classes17.dex */
public class RectangularRegion extends org.bouncycastle.asn1.ASN1Object implements org.bouncycastle.oer.its.RegionInterface {
    private final org.bouncycastle.oer.its.TwoDLocation getHighResolutionOutputSizeshNQ4ISI;
    private final org.bouncycastle.oer.its.TwoDLocation getHighSpeedVideoSizes;

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public org.bouncycastle.asn1.ASN1Primitive toASN1Primitive() {
        return new org.bouncycastle.asn1.DERSequence(new org.bouncycastle.asn1.ASN1Encodable[]{this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoSizes});
    }

    public org.bouncycastle.oer.its.TwoDLocation getSouthEast() {
        return this.getHighSpeedVideoSizes;
    }

    public org.bouncycastle.oer.its.TwoDLocation getNorthWest() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public static org.bouncycastle.oer.its.RectangularRegion getInstance(java.lang.Object obj) {
        if (obj instanceof org.bouncycastle.oer.its.RectangularRegion) {
            return (org.bouncycastle.oer.its.RectangularRegion) obj;
        }
        org.bouncycastle.asn1.ASN1Sequence aSN1Sequence = org.bouncycastle.asn1.ASN1Sequence.getInstance(obj);
        return new org.bouncycastle.oer.its.RectangularRegion(org.bouncycastle.oer.its.TwoDLocation.getInstance(aSN1Sequence.getObjectAt(0)), org.bouncycastle.oer.its.TwoDLocation.getInstance(aSN1Sequence.getObjectAt(1)));
    }

    public RectangularRegion(org.bouncycastle.oer.its.TwoDLocation twoDLocation, org.bouncycastle.oer.its.TwoDLocation twoDLocation2) {
        this.getHighResolutionOutputSizeshNQ4ISI = twoDLocation;
        this.getHighSpeedVideoSizes = twoDLocation2;
    }
}
