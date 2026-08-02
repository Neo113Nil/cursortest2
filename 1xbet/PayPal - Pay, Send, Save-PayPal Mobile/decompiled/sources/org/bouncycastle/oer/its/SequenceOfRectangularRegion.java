package org.bouncycastle.oer.its;

/* loaded from: classes17.dex */
public class SequenceOfRectangularRegion extends org.bouncycastle.asn1.ASN1Object {
    private final java.util.List<org.bouncycastle.oer.its.RectangularRegion> getHighResolutionOutputSizeshNQ4ISI;

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public org.bouncycastle.asn1.ASN1Primitive toASN1Primitive() {
        return org.bouncycastle.oer.its.Utils.getHighSpeedVideoSizes(this.getHighResolutionOutputSizeshNQ4ISI);
    }

    public java.util.List<org.bouncycastle.oer.its.RectangularRegion> getRectangularRegions() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public static org.bouncycastle.oer.its.SequenceOfRectangularRegion getInstance(java.lang.Object obj) {
        return obj instanceof org.bouncycastle.oer.its.SequenceOfRectangularRegion ? (org.bouncycastle.oer.its.SequenceOfRectangularRegion) obj : new org.bouncycastle.oer.its.SequenceOfRectangularRegion(org.bouncycastle.oer.its.Utils.getHighSpeedVideoFpsRangesFor(org.bouncycastle.oer.its.RectangularRegion.class, org.bouncycastle.asn1.ASN1Sequence.getInstance(obj)));
    }

    public SequenceOfRectangularRegion(java.util.List<org.bouncycastle.oer.its.RectangularRegion> list) {
        this.getHighResolutionOutputSizeshNQ4ISI = java.util.Collections.unmodifiableList(list);
    }
}
