package org.bouncycastle.asn1.x509;

/* loaded from: classes17.dex */
public class PolicyQualifierInfo extends org.bouncycastle.asn1.ASN1Object {
    private org.bouncycastle.asn1.ASN1ObjectIdentifier Camera2StreamConfigurationMap;
    private org.bouncycastle.asn1.ASN1Encodable getHighSpeedVideoFpsRangesFor;

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public org.bouncycastle.asn1.ASN1Primitive toASN1Primitive() {
        org.bouncycastle.asn1.ASN1EncodableVector aSN1EncodableVector = new org.bouncycastle.asn1.ASN1EncodableVector(2);
        aSN1EncodableVector.add(this.Camera2StreamConfigurationMap);
        aSN1EncodableVector.add(this.getHighSpeedVideoFpsRangesFor);
        return new org.bouncycastle.asn1.DERSequence(aSN1EncodableVector);
    }

    public org.bouncycastle.asn1.ASN1Encodable getQualifier() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public org.bouncycastle.asn1.ASN1ObjectIdentifier getPolicyQualifierId() {
        return this.Camera2StreamConfigurationMap;
    }

    public static org.bouncycastle.asn1.x509.PolicyQualifierInfo getInstance(java.lang.Object obj) {
        if (obj instanceof org.bouncycastle.asn1.x509.PolicyQualifierInfo) {
            return (org.bouncycastle.asn1.x509.PolicyQualifierInfo) obj;
        }
        if (obj != null) {
            return new org.bouncycastle.asn1.x509.PolicyQualifierInfo(org.bouncycastle.asn1.ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    public PolicyQualifierInfo(org.bouncycastle.asn1.ASN1Sequence aSN1Sequence) {
        if (aSN1Sequence.size() == 2) {
            this.Camera2StreamConfigurationMap = org.bouncycastle.asn1.ASN1ObjectIdentifier.getInstance(aSN1Sequence.getObjectAt(0));
            this.getHighSpeedVideoFpsRangesFor = aSN1Sequence.getObjectAt(1);
        } else {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Bad sequence size: ");
            sb.append(aSN1Sequence.size());
            throw new java.lang.IllegalArgumentException(sb.toString());
        }
    }

    public PolicyQualifierInfo(org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier, org.bouncycastle.asn1.ASN1Encodable aSN1Encodable) {
        this.Camera2StreamConfigurationMap = aSN1ObjectIdentifier;
        this.getHighSpeedVideoFpsRangesFor = aSN1Encodable;
    }

    public PolicyQualifierInfo(java.lang.String str) {
        this.Camera2StreamConfigurationMap = org.bouncycastle.asn1.x509.PolicyQualifierId.id_qt_cps;
        this.getHighSpeedVideoFpsRangesFor = new org.bouncycastle.asn1.DERIA5String(str);
    }
}
