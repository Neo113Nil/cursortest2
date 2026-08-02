package org.bouncycastle.asn1.cmc;

/* loaded from: classes17.dex */
public class OtherMsg extends org.bouncycastle.asn1.ASN1Object {
    private final org.bouncycastle.asn1.ASN1Encodable getHighSpeedVideoFpsRanges;
    private final org.bouncycastle.asn1.cmc.BodyPartID getHighSpeedVideoFpsRangesFor;
    private final org.bouncycastle.asn1.ASN1ObjectIdentifier getHighSpeedVideoSizes;

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public org.bouncycastle.asn1.ASN1Primitive toASN1Primitive() {
        org.bouncycastle.asn1.ASN1EncodableVector aSN1EncodableVector = new org.bouncycastle.asn1.ASN1EncodableVector(3);
        aSN1EncodableVector.add(this.getHighSpeedVideoFpsRangesFor);
        aSN1EncodableVector.add(this.getHighSpeedVideoSizes);
        aSN1EncodableVector.add(this.getHighSpeedVideoFpsRanges);
        return new org.bouncycastle.asn1.DERSequence(aSN1EncodableVector);
    }

    public org.bouncycastle.asn1.ASN1Encodable getOtherMsgValue() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public org.bouncycastle.asn1.ASN1ObjectIdentifier getOtherMsgType() {
        return this.getHighSpeedVideoSizes;
    }

    public org.bouncycastle.asn1.cmc.BodyPartID getBodyPartID() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public static org.bouncycastle.asn1.cmc.OtherMsg getInstance(org.bouncycastle.asn1.ASN1TaggedObject aSN1TaggedObject, boolean z) {
        return getInstance(org.bouncycastle.asn1.ASN1Sequence.getInstance(aSN1TaggedObject, z));
    }

    public static org.bouncycastle.asn1.cmc.OtherMsg getInstance(java.lang.Object obj) {
        if (obj instanceof org.bouncycastle.asn1.cmc.OtherMsg) {
            return (org.bouncycastle.asn1.cmc.OtherMsg) obj;
        }
        if (obj != null) {
            return new org.bouncycastle.asn1.cmc.OtherMsg(org.bouncycastle.asn1.ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    public OtherMsg(org.bouncycastle.asn1.cmc.BodyPartID bodyPartID, org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier, org.bouncycastle.asn1.ASN1Encodable aSN1Encodable) {
        this.getHighSpeedVideoFpsRangesFor = bodyPartID;
        this.getHighSpeedVideoSizes = aSN1ObjectIdentifier;
        this.getHighSpeedVideoFpsRanges = aSN1Encodable;
    }

    private OtherMsg(org.bouncycastle.asn1.ASN1Sequence aSN1Sequence) {
        if (aSN1Sequence.size() != 3) {
            throw new java.lang.IllegalArgumentException("incorrect sequence size");
        }
        this.getHighSpeedVideoFpsRangesFor = org.bouncycastle.asn1.cmc.BodyPartID.getInstance(aSN1Sequence.getObjectAt(0));
        this.getHighSpeedVideoSizes = org.bouncycastle.asn1.ASN1ObjectIdentifier.getInstance(aSN1Sequence.getObjectAt(1));
        this.getHighSpeedVideoFpsRanges = aSN1Sequence.getObjectAt(2);
    }
}
