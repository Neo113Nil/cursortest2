package org.bouncycastle.asn1.tsp;

/* loaded from: classes17.dex */
public class TimeStampResp extends org.bouncycastle.asn1.ASN1Object {
    org.bouncycastle.asn1.cmp.PKIStatusInfo Camera2StreamConfigurationMap;
    org.bouncycastle.asn1.cms.ContentInfo getHighSpeedVideoSizes;

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public org.bouncycastle.asn1.ASN1Primitive toASN1Primitive() {
        org.bouncycastle.asn1.ASN1EncodableVector aSN1EncodableVector = new org.bouncycastle.asn1.ASN1EncodableVector(2);
        aSN1EncodableVector.add(this.Camera2StreamConfigurationMap);
        org.bouncycastle.asn1.cms.ContentInfo contentInfo = this.getHighSpeedVideoSizes;
        if (contentInfo != null) {
            aSN1EncodableVector.add(contentInfo);
        }
        return new org.bouncycastle.asn1.DERSequence(aSN1EncodableVector);
    }

    public org.bouncycastle.asn1.cms.ContentInfo getTimeStampToken() {
        return this.getHighSpeedVideoSizes;
    }

    public org.bouncycastle.asn1.cmp.PKIStatusInfo getStatus() {
        return this.Camera2StreamConfigurationMap;
    }

    public static org.bouncycastle.asn1.tsp.TimeStampResp getInstance(java.lang.Object obj) {
        if (obj instanceof org.bouncycastle.asn1.tsp.TimeStampResp) {
            return (org.bouncycastle.asn1.tsp.TimeStampResp) obj;
        }
        if (obj != null) {
            return new org.bouncycastle.asn1.tsp.TimeStampResp(org.bouncycastle.asn1.ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    public TimeStampResp(org.bouncycastle.asn1.cmp.PKIStatusInfo pKIStatusInfo, org.bouncycastle.asn1.cms.ContentInfo contentInfo) {
        this.Camera2StreamConfigurationMap = pKIStatusInfo;
        this.getHighSpeedVideoSizes = contentInfo;
    }

    private TimeStampResp(org.bouncycastle.asn1.ASN1Sequence aSN1Sequence) {
        java.util.Enumeration objects = aSN1Sequence.getObjects();
        this.Camera2StreamConfigurationMap = org.bouncycastle.asn1.cmp.PKIStatusInfo.getInstance(objects.nextElement());
        if (objects.hasMoreElements()) {
            this.getHighSpeedVideoSizes = org.bouncycastle.asn1.cms.ContentInfo.getInstance(objects.nextElement());
        }
    }
}
