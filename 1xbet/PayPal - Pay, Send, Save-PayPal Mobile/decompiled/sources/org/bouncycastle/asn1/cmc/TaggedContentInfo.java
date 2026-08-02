package org.bouncycastle.asn1.cmc;

/* loaded from: classes17.dex */
public class TaggedContentInfo extends org.bouncycastle.asn1.ASN1Object {
    private final org.bouncycastle.asn1.cms.ContentInfo getHighResolutionOutputSizeshNQ4ISI;
    private final org.bouncycastle.asn1.cmc.BodyPartID getHighSpeedVideoSizes;

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public org.bouncycastle.asn1.ASN1Primitive toASN1Primitive() {
        org.bouncycastle.asn1.ASN1EncodableVector aSN1EncodableVector = new org.bouncycastle.asn1.ASN1EncodableVector(2);
        aSN1EncodableVector.add(this.getHighSpeedVideoSizes);
        aSN1EncodableVector.add(this.getHighResolutionOutputSizeshNQ4ISI);
        return new org.bouncycastle.asn1.DERSequence(aSN1EncodableVector);
    }

    public org.bouncycastle.asn1.cms.ContentInfo getContentInfo() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public org.bouncycastle.asn1.cmc.BodyPartID getBodyPartID() {
        return this.getHighSpeedVideoSizes;
    }

    public static org.bouncycastle.asn1.cmc.TaggedContentInfo getInstance(org.bouncycastle.asn1.ASN1TaggedObject aSN1TaggedObject, boolean z) {
        return getInstance(org.bouncycastle.asn1.ASN1Sequence.getInstance(aSN1TaggedObject, z));
    }

    public static org.bouncycastle.asn1.cmc.TaggedContentInfo getInstance(java.lang.Object obj) {
        if (obj instanceof org.bouncycastle.asn1.cmc.TaggedContentInfo) {
            return (org.bouncycastle.asn1.cmc.TaggedContentInfo) obj;
        }
        if (obj != null) {
            return new org.bouncycastle.asn1.cmc.TaggedContentInfo(org.bouncycastle.asn1.ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    public TaggedContentInfo(org.bouncycastle.asn1.cmc.BodyPartID bodyPartID, org.bouncycastle.asn1.cms.ContentInfo contentInfo) {
        this.getHighSpeedVideoSizes = bodyPartID;
        this.getHighResolutionOutputSizeshNQ4ISI = contentInfo;
    }

    private TaggedContentInfo(org.bouncycastle.asn1.ASN1Sequence aSN1Sequence) {
        if (aSN1Sequence.size() != 2) {
            throw new java.lang.IllegalArgumentException("incorrect sequence size");
        }
        this.getHighSpeedVideoSizes = org.bouncycastle.asn1.cmc.BodyPartID.getInstance(aSN1Sequence.getObjectAt(0));
        this.getHighResolutionOutputSizeshNQ4ISI = org.bouncycastle.asn1.cms.ContentInfo.getInstance(aSN1Sequence.getObjectAt(1));
    }
}
