package org.bouncycastle.asn1.cmc;

/* loaded from: classes17.dex */
public class TaggedAttribute extends org.bouncycastle.asn1.ASN1Object {
    private final org.bouncycastle.asn1.ASN1Set Camera2StreamConfigurationMap;
    private final org.bouncycastle.asn1.ASN1ObjectIdentifier getHighSpeedVideoFpsRangesFor;
    private final org.bouncycastle.asn1.cmc.BodyPartID getHighSpeedVideoSizes;

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public org.bouncycastle.asn1.ASN1Primitive toASN1Primitive() {
        return new org.bouncycastle.asn1.DERSequence(new org.bouncycastle.asn1.ASN1Encodable[]{this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRangesFor, this.Camera2StreamConfigurationMap});
    }

    public org.bouncycastle.asn1.cmc.BodyPartID getBodyPartID() {
        return this.getHighSpeedVideoSizes;
    }

    public org.bouncycastle.asn1.ASN1Set getAttrValues() {
        return this.Camera2StreamConfigurationMap;
    }

    public org.bouncycastle.asn1.ASN1ObjectIdentifier getAttrType() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public static org.bouncycastle.asn1.cmc.TaggedAttribute getInstance(java.lang.Object obj) {
        if (obj instanceof org.bouncycastle.asn1.cmc.TaggedAttribute) {
            return (org.bouncycastle.asn1.cmc.TaggedAttribute) obj;
        }
        if (obj != null) {
            return new org.bouncycastle.asn1.cmc.TaggedAttribute(org.bouncycastle.asn1.ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    public TaggedAttribute(org.bouncycastle.asn1.cmc.BodyPartID bodyPartID, org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier, org.bouncycastle.asn1.ASN1Set aSN1Set) {
        this.getHighSpeedVideoSizes = bodyPartID;
        this.getHighSpeedVideoFpsRangesFor = aSN1ObjectIdentifier;
        this.Camera2StreamConfigurationMap = aSN1Set;
    }

    private TaggedAttribute(org.bouncycastle.asn1.ASN1Sequence aSN1Sequence) {
        if (aSN1Sequence.size() != 3) {
            throw new java.lang.IllegalArgumentException("incorrect sequence size");
        }
        this.getHighSpeedVideoSizes = org.bouncycastle.asn1.cmc.BodyPartID.getInstance(aSN1Sequence.getObjectAt(0));
        this.getHighSpeedVideoFpsRangesFor = org.bouncycastle.asn1.ASN1ObjectIdentifier.getInstance(aSN1Sequence.getObjectAt(1));
        this.Camera2StreamConfigurationMap = org.bouncycastle.asn1.ASN1Set.getInstance(aSN1Sequence.getObjectAt(2));
    }
}
