package org.bouncycastle.asn1.cms;

/* loaded from: classes17.dex */
public class SCVPReqRes extends org.bouncycastle.asn1.ASN1Object {
    private final org.bouncycastle.asn1.cms.ContentInfo getHighResolutionOutputSizeshNQ4ISI;
    private final org.bouncycastle.asn1.cms.ContentInfo getHighSpeedVideoSizes;

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public org.bouncycastle.asn1.ASN1Primitive toASN1Primitive() {
        org.bouncycastle.asn1.ASN1EncodableVector aSN1EncodableVector = new org.bouncycastle.asn1.ASN1EncodableVector(2);
        org.bouncycastle.asn1.cms.ContentInfo contentInfo = this.getHighSpeedVideoSizes;
        if (contentInfo != null) {
            aSN1EncodableVector.add(new org.bouncycastle.asn1.DERTaggedObject(true, 0, (org.bouncycastle.asn1.ASN1Encodable) contentInfo));
        }
        aSN1EncodableVector.add(this.getHighResolutionOutputSizeshNQ4ISI);
        return new org.bouncycastle.asn1.DERSequence(aSN1EncodableVector);
    }

    public org.bouncycastle.asn1.cms.ContentInfo getResponse() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public org.bouncycastle.asn1.cms.ContentInfo getRequest() {
        return this.getHighSpeedVideoSizes;
    }

    public static org.bouncycastle.asn1.cms.SCVPReqRes getInstance(java.lang.Object obj) {
        if (obj instanceof org.bouncycastle.asn1.cms.SCVPReqRes) {
            return (org.bouncycastle.asn1.cms.SCVPReqRes) obj;
        }
        if (obj != null) {
            return new org.bouncycastle.asn1.cms.SCVPReqRes(org.bouncycastle.asn1.ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    public SCVPReqRes(org.bouncycastle.asn1.cms.ContentInfo contentInfo, org.bouncycastle.asn1.cms.ContentInfo contentInfo2) {
        this.getHighSpeedVideoSizes = contentInfo;
        this.getHighResolutionOutputSizeshNQ4ISI = contentInfo2;
    }

    public SCVPReqRes(org.bouncycastle.asn1.cms.ContentInfo contentInfo) {
        this.getHighSpeedVideoSizes = null;
        this.getHighResolutionOutputSizeshNQ4ISI = contentInfo;
    }

    private SCVPReqRes(org.bouncycastle.asn1.ASN1Sequence aSN1Sequence) {
        org.bouncycastle.asn1.ASN1Encodable objectAt;
        if (aSN1Sequence.getObjectAt(0) instanceof org.bouncycastle.asn1.ASN1TaggedObject) {
            this.getHighSpeedVideoSizes = org.bouncycastle.asn1.cms.ContentInfo.getInstance(org.bouncycastle.asn1.ASN1TaggedObject.getInstance(aSN1Sequence.getObjectAt(0)), true);
            objectAt = aSN1Sequence.getObjectAt(1);
        } else {
            this.getHighSpeedVideoSizes = null;
            objectAt = aSN1Sequence.getObjectAt(0);
        }
        this.getHighResolutionOutputSizeshNQ4ISI = org.bouncycastle.asn1.cms.ContentInfo.getInstance(objectAt);
    }
}
