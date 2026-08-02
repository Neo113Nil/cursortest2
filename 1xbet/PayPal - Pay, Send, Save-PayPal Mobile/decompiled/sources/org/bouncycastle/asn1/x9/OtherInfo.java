package org.bouncycastle.asn1.x9;

/* loaded from: classes17.dex */
public class OtherInfo extends org.bouncycastle.asn1.ASN1Object {
    private org.bouncycastle.asn1.x9.KeySpecificInfo getHighSpeedVideoFpsRanges;
    private org.bouncycastle.asn1.ASN1OctetString getHighSpeedVideoFpsRangesFor;
    private org.bouncycastle.asn1.ASN1OctetString getHighSpeedVideoSizes;

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public org.bouncycastle.asn1.ASN1Primitive toASN1Primitive() {
        org.bouncycastle.asn1.ASN1EncodableVector aSN1EncodableVector = new org.bouncycastle.asn1.ASN1EncodableVector(3);
        aSN1EncodableVector.add(this.getHighSpeedVideoFpsRanges);
        org.bouncycastle.asn1.ASN1OctetString aSN1OctetString = this.getHighSpeedVideoSizes;
        if (aSN1OctetString != null) {
            aSN1EncodableVector.add(new org.bouncycastle.asn1.DERTaggedObject(0, aSN1OctetString));
        }
        aSN1EncodableVector.add(new org.bouncycastle.asn1.DERTaggedObject(2, this.getHighSpeedVideoFpsRangesFor));
        return new org.bouncycastle.asn1.DERSequence(aSN1EncodableVector);
    }

    public org.bouncycastle.asn1.ASN1OctetString getSuppPubInfo() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public org.bouncycastle.asn1.ASN1OctetString getPartyAInfo() {
        return this.getHighSpeedVideoSizes;
    }

    public org.bouncycastle.asn1.x9.KeySpecificInfo getKeyInfo() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public static org.bouncycastle.asn1.x9.OtherInfo getInstance(java.lang.Object obj) {
        if (obj instanceof org.bouncycastle.asn1.x9.OtherInfo) {
            return (org.bouncycastle.asn1.x9.OtherInfo) obj;
        }
        if (obj != null) {
            return new org.bouncycastle.asn1.x9.OtherInfo(org.bouncycastle.asn1.ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    public OtherInfo(org.bouncycastle.asn1.x9.KeySpecificInfo keySpecificInfo, org.bouncycastle.asn1.ASN1OctetString aSN1OctetString, org.bouncycastle.asn1.ASN1OctetString aSN1OctetString2) {
        this.getHighSpeedVideoFpsRanges = keySpecificInfo;
        this.getHighSpeedVideoSizes = aSN1OctetString;
        this.getHighSpeedVideoFpsRangesFor = aSN1OctetString2;
    }

    private OtherInfo(org.bouncycastle.asn1.ASN1Sequence aSN1Sequence) {
        java.util.Enumeration objects = aSN1Sequence.getObjects();
        this.getHighSpeedVideoFpsRanges = org.bouncycastle.asn1.x9.KeySpecificInfo.getInstance(objects.nextElement());
        while (objects.hasMoreElements()) {
            org.bouncycastle.asn1.ASN1TaggedObject aSN1TaggedObject = (org.bouncycastle.asn1.ASN1TaggedObject) objects.nextElement();
            if (aSN1TaggedObject.getTagNo() == 0) {
                this.getHighSpeedVideoSizes = (org.bouncycastle.asn1.ASN1OctetString) aSN1TaggedObject.getObject();
            } else if (aSN1TaggedObject.getTagNo() == 2) {
                this.getHighSpeedVideoFpsRangesFor = (org.bouncycastle.asn1.ASN1OctetString) aSN1TaggedObject.getObject();
            }
        }
    }
}
