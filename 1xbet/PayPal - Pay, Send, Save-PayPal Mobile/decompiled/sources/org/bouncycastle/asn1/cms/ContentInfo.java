package org.bouncycastle.asn1.cms;

/* loaded from: classes17.dex */
public class ContentInfo extends org.bouncycastle.asn1.ASN1Object implements org.bouncycastle.asn1.cms.CMSObjectIdentifiers {
    private org.bouncycastle.asn1.ASN1ObjectIdentifier getHighSpeedVideoFpsRanges;
    private org.bouncycastle.asn1.ASN1Encodable getHighSpeedVideoSizes;

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public org.bouncycastle.asn1.ASN1Primitive toASN1Primitive() {
        org.bouncycastle.asn1.ASN1EncodableVector aSN1EncodableVector = new org.bouncycastle.asn1.ASN1EncodableVector(2);
        aSN1EncodableVector.add(this.getHighSpeedVideoFpsRanges);
        org.bouncycastle.asn1.ASN1Encodable aSN1Encodable = this.getHighSpeedVideoSizes;
        if (aSN1Encodable != null) {
            aSN1EncodableVector.add(new org.bouncycastle.asn1.BERTaggedObject(0, aSN1Encodable));
        }
        return new org.bouncycastle.asn1.BERSequence(aSN1EncodableVector);
    }

    public org.bouncycastle.asn1.ASN1ObjectIdentifier getContentType() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public org.bouncycastle.asn1.ASN1Encodable getContent() {
        return this.getHighSpeedVideoSizes;
    }

    public static org.bouncycastle.asn1.cms.ContentInfo getInstance(org.bouncycastle.asn1.ASN1TaggedObject aSN1TaggedObject, boolean z) {
        return getInstance(org.bouncycastle.asn1.ASN1Sequence.getInstance(aSN1TaggedObject, z));
    }

    public static org.bouncycastle.asn1.cms.ContentInfo getInstance(java.lang.Object obj) {
        if (obj instanceof org.bouncycastle.asn1.cms.ContentInfo) {
            return (org.bouncycastle.asn1.cms.ContentInfo) obj;
        }
        if (obj != null) {
            return new org.bouncycastle.asn1.cms.ContentInfo(org.bouncycastle.asn1.ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    private ContentInfo(org.bouncycastle.asn1.ASN1Sequence aSN1Sequence) {
        if (aSN1Sequence.size() <= 0 || aSN1Sequence.size() > 2) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Bad sequence size: ");
            sb.append(aSN1Sequence.size());
            throw new java.lang.IllegalArgumentException(sb.toString());
        }
        this.getHighSpeedVideoFpsRanges = (org.bouncycastle.asn1.ASN1ObjectIdentifier) aSN1Sequence.getObjectAt(0);
        if (aSN1Sequence.size() > 1) {
            org.bouncycastle.asn1.ASN1TaggedObject aSN1TaggedObject = (org.bouncycastle.asn1.ASN1TaggedObject) aSN1Sequence.getObjectAt(1);
            if (!aSN1TaggedObject.isExplicit() || aSN1TaggedObject.getTagNo() != 0) {
                throw new java.lang.IllegalArgumentException("Bad tag for 'content'");
            }
            this.getHighSpeedVideoSizes = aSN1TaggedObject.getObject();
        }
    }

    public ContentInfo(org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier, org.bouncycastle.asn1.ASN1Encodable aSN1Encodable) {
        this.getHighSpeedVideoFpsRanges = aSN1ObjectIdentifier;
        this.getHighSpeedVideoSizes = aSN1Encodable;
    }
}
