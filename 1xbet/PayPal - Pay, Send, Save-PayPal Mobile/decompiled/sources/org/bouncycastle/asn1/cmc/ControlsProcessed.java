package org.bouncycastle.asn1.cmc;

/* loaded from: classes17.dex */
public class ControlsProcessed extends org.bouncycastle.asn1.ASN1Object {
    private final org.bouncycastle.asn1.ASN1Sequence getHighSpeedVideoFpsRanges;

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public org.bouncycastle.asn1.ASN1Primitive toASN1Primitive() {
        return new org.bouncycastle.asn1.DERSequence(this.getHighSpeedVideoFpsRanges);
    }

    public org.bouncycastle.asn1.cmc.BodyPartReference[] getBodyList() {
        org.bouncycastle.asn1.cmc.BodyPartReference[] bodyPartReferenceArr = new org.bouncycastle.asn1.cmc.BodyPartReference[this.getHighSpeedVideoFpsRanges.size()];
        for (int i = 0; i != this.getHighSpeedVideoFpsRanges.size(); i++) {
            bodyPartReferenceArr[i] = org.bouncycastle.asn1.cmc.BodyPartReference.getInstance(this.getHighSpeedVideoFpsRanges.getObjectAt(i));
        }
        return bodyPartReferenceArr;
    }

    public static org.bouncycastle.asn1.cmc.ControlsProcessed getInstance(java.lang.Object obj) {
        if (obj instanceof org.bouncycastle.asn1.cmc.ControlsProcessed) {
            return (org.bouncycastle.asn1.cmc.ControlsProcessed) obj;
        }
        if (obj != null) {
            return new org.bouncycastle.asn1.cmc.ControlsProcessed(org.bouncycastle.asn1.ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    public ControlsProcessed(org.bouncycastle.asn1.cmc.BodyPartReference[] bodyPartReferenceArr) {
        this.getHighSpeedVideoFpsRanges = new org.bouncycastle.asn1.DERSequence(bodyPartReferenceArr);
    }

    public ControlsProcessed(org.bouncycastle.asn1.cmc.BodyPartReference bodyPartReference) {
        this.getHighSpeedVideoFpsRanges = new org.bouncycastle.asn1.DERSequence(bodyPartReference);
    }

    private ControlsProcessed(org.bouncycastle.asn1.ASN1Sequence aSN1Sequence) {
        if (aSN1Sequence.size() != 1) {
            throw new java.lang.IllegalArgumentException("incorrect sequence size");
        }
        this.getHighSpeedVideoFpsRanges = org.bouncycastle.asn1.ASN1Sequence.getInstance(aSN1Sequence.getObjectAt(0));
    }
}
