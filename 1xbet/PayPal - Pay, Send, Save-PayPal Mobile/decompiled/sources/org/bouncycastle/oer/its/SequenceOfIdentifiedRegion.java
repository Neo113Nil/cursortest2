package org.bouncycastle.oer.its;

/* loaded from: classes17.dex */
public class SequenceOfIdentifiedRegion extends org.bouncycastle.asn1.ASN1Object {
    private final java.util.List<org.bouncycastle.oer.its.IdentifiedRegion> getHighSpeedVideoFpsRanges;

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public org.bouncycastle.asn1.ASN1Primitive toASN1Primitive() {
        return new org.bouncycastle.asn1.DERSequence((org.bouncycastle.asn1.ASN1Encodable[]) this.getHighSpeedVideoFpsRanges.toArray(new org.bouncycastle.asn1.ASN1Encodable[0]));
    }

    public java.util.List<org.bouncycastle.oer.its.IdentifiedRegion> getIdentifiedRegions() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public static org.bouncycastle.oer.its.SequenceOfIdentifiedRegion getInstance(java.lang.Object obj) {
        return obj instanceof org.bouncycastle.oer.its.SequenceOfIdentifiedRegion ? (org.bouncycastle.oer.its.SequenceOfIdentifiedRegion) obj : new org.bouncycastle.oer.its.SequenceOfIdentifiedRegion(org.bouncycastle.oer.its.Utils.getHighSpeedVideoFpsRangesFor(org.bouncycastle.oer.its.IdentifiedRegion.class, org.bouncycastle.asn1.ASN1Sequence.getInstance(obj)));
    }

    public SequenceOfIdentifiedRegion(java.util.List<org.bouncycastle.oer.its.IdentifiedRegion> list) {
        this.getHighSpeedVideoFpsRanges = java.util.Collections.unmodifiableList(list);
    }
}
