package org.bouncycastle.asn1.cmp;

/* loaded from: classes17.dex */
public class CertStatus extends org.bouncycastle.asn1.ASN1Object {
    private org.bouncycastle.asn1.ASN1Integer Camera2StreamConfigurationMap;
    private org.bouncycastle.asn1.ASN1OctetString getHighSpeedVideoFpsRangesFor;
    private org.bouncycastle.asn1.cmp.PKIStatusInfo getHighSpeedVideoSizes;

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public org.bouncycastle.asn1.ASN1Primitive toASN1Primitive() {
        org.bouncycastle.asn1.ASN1EncodableVector aSN1EncodableVector = new org.bouncycastle.asn1.ASN1EncodableVector(3);
        aSN1EncodableVector.add(this.getHighSpeedVideoFpsRangesFor);
        aSN1EncodableVector.add(this.Camera2StreamConfigurationMap);
        org.bouncycastle.asn1.cmp.PKIStatusInfo pKIStatusInfo = this.getHighSpeedVideoSizes;
        if (pKIStatusInfo != null) {
            aSN1EncodableVector.add(pKIStatusInfo);
        }
        return new org.bouncycastle.asn1.DERSequence(aSN1EncodableVector);
    }

    public org.bouncycastle.asn1.cmp.PKIStatusInfo getStatusInfo() {
        return this.getHighSpeedVideoSizes;
    }

    public org.bouncycastle.asn1.ASN1Integer getCertReqId() {
        return this.Camera2StreamConfigurationMap;
    }

    public org.bouncycastle.asn1.ASN1OctetString getCertHash() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public static org.bouncycastle.asn1.cmp.CertStatus getInstance(java.lang.Object obj) {
        if (obj instanceof org.bouncycastle.asn1.cmp.CertStatus) {
            return (org.bouncycastle.asn1.cmp.CertStatus) obj;
        }
        if (obj != null) {
            return new org.bouncycastle.asn1.cmp.CertStatus(org.bouncycastle.asn1.ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    public CertStatus(byte[] bArr, java.math.BigInteger bigInteger, org.bouncycastle.asn1.cmp.PKIStatusInfo pKIStatusInfo) {
        this.getHighSpeedVideoFpsRangesFor = new org.bouncycastle.asn1.DEROctetString(bArr);
        this.Camera2StreamConfigurationMap = new org.bouncycastle.asn1.ASN1Integer(bigInteger);
        this.getHighSpeedVideoSizes = pKIStatusInfo;
    }

    public CertStatus(byte[] bArr, java.math.BigInteger bigInteger) {
        this.getHighSpeedVideoFpsRangesFor = new org.bouncycastle.asn1.DEROctetString(bArr);
        this.Camera2StreamConfigurationMap = new org.bouncycastle.asn1.ASN1Integer(bigInteger);
    }

    private CertStatus(org.bouncycastle.asn1.ASN1Sequence aSN1Sequence) {
        this.getHighSpeedVideoFpsRangesFor = org.bouncycastle.asn1.ASN1OctetString.getInstance(aSN1Sequence.getObjectAt(0));
        this.Camera2StreamConfigurationMap = org.bouncycastle.asn1.ASN1Integer.getInstance(aSN1Sequence.getObjectAt(1));
        if (aSN1Sequence.size() > 2) {
            this.getHighSpeedVideoSizes = org.bouncycastle.asn1.cmp.PKIStatusInfo.getInstance(aSN1Sequence.getObjectAt(2));
        }
    }
}
