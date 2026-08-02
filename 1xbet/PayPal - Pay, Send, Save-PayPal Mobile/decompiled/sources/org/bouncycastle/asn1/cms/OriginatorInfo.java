package org.bouncycastle.asn1.cms;

/* loaded from: classes17.dex */
public class OriginatorInfo extends org.bouncycastle.asn1.ASN1Object {
    private org.bouncycastle.asn1.ASN1Set getHighSpeedVideoFpsRanges;
    private org.bouncycastle.asn1.ASN1Set getHighSpeedVideoSizes;

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public org.bouncycastle.asn1.ASN1Primitive toASN1Primitive() {
        org.bouncycastle.asn1.ASN1EncodableVector aSN1EncodableVector = new org.bouncycastle.asn1.ASN1EncodableVector(2);
        org.bouncycastle.asn1.ASN1Set aSN1Set = this.getHighSpeedVideoFpsRanges;
        if (aSN1Set != null) {
            aSN1EncodableVector.add(new org.bouncycastle.asn1.DERTaggedObject(false, 0, (org.bouncycastle.asn1.ASN1Encodable) aSN1Set));
        }
        org.bouncycastle.asn1.ASN1Set aSN1Set2 = this.getHighSpeedVideoSizes;
        if (aSN1Set2 != null) {
            aSN1EncodableVector.add(new org.bouncycastle.asn1.DERTaggedObject(false, 1, (org.bouncycastle.asn1.ASN1Encodable) aSN1Set2));
        }
        return new org.bouncycastle.asn1.DERSequence(aSN1EncodableVector);
    }

    public org.bouncycastle.asn1.ASN1Set getCertificates() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public org.bouncycastle.asn1.ASN1Set getCRLs() {
        return this.getHighSpeedVideoSizes;
    }

    public static org.bouncycastle.asn1.cms.OriginatorInfo getInstance(org.bouncycastle.asn1.ASN1TaggedObject aSN1TaggedObject, boolean z) {
        return getInstance(org.bouncycastle.asn1.ASN1Sequence.getInstance(aSN1TaggedObject, z));
    }

    public static org.bouncycastle.asn1.cms.OriginatorInfo getInstance(java.lang.Object obj) {
        if (obj instanceof org.bouncycastle.asn1.cms.OriginatorInfo) {
            return (org.bouncycastle.asn1.cms.OriginatorInfo) obj;
        }
        if (obj != null) {
            return new org.bouncycastle.asn1.cms.OriginatorInfo(org.bouncycastle.asn1.ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    public OriginatorInfo(org.bouncycastle.asn1.ASN1Set aSN1Set, org.bouncycastle.asn1.ASN1Set aSN1Set2) {
        this.getHighSpeedVideoFpsRanges = aSN1Set;
        this.getHighSpeedVideoSizes = aSN1Set2;
    }

    private OriginatorInfo(org.bouncycastle.asn1.ASN1Sequence aSN1Sequence) {
        org.bouncycastle.asn1.ASN1TaggedObject aSN1TaggedObject;
        int size = aSN1Sequence.size();
        if (size != 0) {
            if (size == 1) {
                aSN1TaggedObject = (org.bouncycastle.asn1.ASN1TaggedObject) aSN1Sequence.getObjectAt(0);
                int tagNo = aSN1TaggedObject.getTagNo();
                if (tagNo == 0) {
                    this.getHighSpeedVideoFpsRanges = org.bouncycastle.asn1.ASN1Set.getInstance(aSN1TaggedObject, false);
                    return;
                } else if (tagNo != 1) {
                    java.lang.StringBuilder sb = new java.lang.StringBuilder("Bad tag in OriginatorInfo: ");
                    sb.append(aSN1TaggedObject.getTagNo());
                    throw new java.lang.IllegalArgumentException(sb.toString());
                }
            } else {
                if (size != 2) {
                    throw new java.lang.IllegalArgumentException("OriginatorInfo too big");
                }
                this.getHighSpeedVideoFpsRanges = org.bouncycastle.asn1.ASN1Set.getInstance((org.bouncycastle.asn1.ASN1TaggedObject) aSN1Sequence.getObjectAt(0), false);
                aSN1TaggedObject = (org.bouncycastle.asn1.ASN1TaggedObject) aSN1Sequence.getObjectAt(1);
            }
            this.getHighSpeedVideoSizes = org.bouncycastle.asn1.ASN1Set.getInstance(aSN1TaggedObject, false);
        }
    }
}
