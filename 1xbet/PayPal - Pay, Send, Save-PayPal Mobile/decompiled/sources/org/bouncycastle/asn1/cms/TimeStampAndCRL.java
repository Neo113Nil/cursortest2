package org.bouncycastle.asn1.cms;

/* loaded from: classes17.dex */
public class TimeStampAndCRL extends org.bouncycastle.asn1.ASN1Object {
    private org.bouncycastle.asn1.x509.CertificateList Camera2StreamConfigurationMap;
    private org.bouncycastle.asn1.cms.ContentInfo getHighSpeedVideoFpsRanges;

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public org.bouncycastle.asn1.ASN1Primitive toASN1Primitive() {
        org.bouncycastle.asn1.ASN1EncodableVector aSN1EncodableVector = new org.bouncycastle.asn1.ASN1EncodableVector(2);
        aSN1EncodableVector.add(this.getHighSpeedVideoFpsRanges);
        org.bouncycastle.asn1.x509.CertificateList certificateList = this.Camera2StreamConfigurationMap;
        if (certificateList != null) {
            aSN1EncodableVector.add(certificateList);
        }
        return new org.bouncycastle.asn1.DERSequence(aSN1EncodableVector);
    }

    public org.bouncycastle.asn1.cms.ContentInfo getTimeStampToken() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public org.bouncycastle.asn1.x509.CertificateList getCertificateList() {
        return this.Camera2StreamConfigurationMap;
    }

    public org.bouncycastle.asn1.x509.CertificateList getCRL() {
        return this.Camera2StreamConfigurationMap;
    }

    public static org.bouncycastle.asn1.cms.TimeStampAndCRL getInstance(java.lang.Object obj) {
        if (obj instanceof org.bouncycastle.asn1.cms.TimeStampAndCRL) {
            return (org.bouncycastle.asn1.cms.TimeStampAndCRL) obj;
        }
        if (obj != null) {
            return new org.bouncycastle.asn1.cms.TimeStampAndCRL(org.bouncycastle.asn1.ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    public TimeStampAndCRL(org.bouncycastle.asn1.cms.ContentInfo contentInfo) {
        this.getHighSpeedVideoFpsRanges = contentInfo;
    }

    private TimeStampAndCRL(org.bouncycastle.asn1.ASN1Sequence aSN1Sequence) {
        this.getHighSpeedVideoFpsRanges = org.bouncycastle.asn1.cms.ContentInfo.getInstance(aSN1Sequence.getObjectAt(0));
        if (aSN1Sequence.size() == 2) {
            this.Camera2StreamConfigurationMap = org.bouncycastle.asn1.x509.CertificateList.getInstance(aSN1Sequence.getObjectAt(1));
        }
    }
}
