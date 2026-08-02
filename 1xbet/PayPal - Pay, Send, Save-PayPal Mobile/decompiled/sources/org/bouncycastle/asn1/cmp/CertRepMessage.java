package org.bouncycastle.asn1.cmp;

/* loaded from: classes17.dex */
public class CertRepMessage extends org.bouncycastle.asn1.ASN1Object {
    private org.bouncycastle.asn1.ASN1Sequence Camera2StreamConfigurationMap;
    private org.bouncycastle.asn1.ASN1Sequence getHighSpeedVideoFpsRanges;

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public org.bouncycastle.asn1.ASN1Primitive toASN1Primitive() {
        org.bouncycastle.asn1.ASN1EncodableVector aSN1EncodableVector = new org.bouncycastle.asn1.ASN1EncodableVector(2);
        org.bouncycastle.asn1.ASN1Sequence aSN1Sequence = this.getHighSpeedVideoFpsRanges;
        if (aSN1Sequence != null) {
            aSN1EncodableVector.add(new org.bouncycastle.asn1.DERTaggedObject(true, 1, (org.bouncycastle.asn1.ASN1Encodable) aSN1Sequence));
        }
        aSN1EncodableVector.add(this.Camera2StreamConfigurationMap);
        return new org.bouncycastle.asn1.DERSequence(aSN1EncodableVector);
    }

    public org.bouncycastle.asn1.cmp.CertResponse[] getResponse() {
        int size = this.Camera2StreamConfigurationMap.size();
        org.bouncycastle.asn1.cmp.CertResponse[] certResponseArr = new org.bouncycastle.asn1.cmp.CertResponse[size];
        for (int i = 0; i != size; i++) {
            certResponseArr[i] = org.bouncycastle.asn1.cmp.CertResponse.getInstance(this.Camera2StreamConfigurationMap.getObjectAt(i));
        }
        return certResponseArr;
    }

    public org.bouncycastle.asn1.cmp.CMPCertificate[] getCaPubs() {
        org.bouncycastle.asn1.ASN1Sequence aSN1Sequence = this.getHighSpeedVideoFpsRanges;
        if (aSN1Sequence == null) {
            return null;
        }
        int size = aSN1Sequence.size();
        org.bouncycastle.asn1.cmp.CMPCertificate[] cMPCertificateArr = new org.bouncycastle.asn1.cmp.CMPCertificate[size];
        for (int i = 0; i != size; i++) {
            cMPCertificateArr[i] = org.bouncycastle.asn1.cmp.CMPCertificate.getInstance(this.getHighSpeedVideoFpsRanges.getObjectAt(i));
        }
        return cMPCertificateArr;
    }

    public static org.bouncycastle.asn1.cmp.CertRepMessage getInstance(java.lang.Object obj) {
        if (obj instanceof org.bouncycastle.asn1.cmp.CertRepMessage) {
            return (org.bouncycastle.asn1.cmp.CertRepMessage) obj;
        }
        if (obj != null) {
            return new org.bouncycastle.asn1.cmp.CertRepMessage(org.bouncycastle.asn1.ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    public CertRepMessage(org.bouncycastle.asn1.cmp.CMPCertificate[] cMPCertificateArr, org.bouncycastle.asn1.cmp.CertResponse[] certResponseArr) {
        if (certResponseArr == null) {
            throw new java.lang.IllegalArgumentException("'response' cannot be null");
        }
        if (cMPCertificateArr != null) {
            this.getHighSpeedVideoFpsRanges = new org.bouncycastle.asn1.DERSequence(cMPCertificateArr);
        }
        this.Camera2StreamConfigurationMap = new org.bouncycastle.asn1.DERSequence(certResponseArr);
    }

    private CertRepMessage(org.bouncycastle.asn1.ASN1Sequence aSN1Sequence) {
        int i = 0;
        if (aSN1Sequence.size() > 1) {
            this.getHighSpeedVideoFpsRanges = org.bouncycastle.asn1.ASN1Sequence.getInstance((org.bouncycastle.asn1.ASN1TaggedObject) aSN1Sequence.getObjectAt(0), true);
            i = 1;
        }
        this.Camera2StreamConfigurationMap = org.bouncycastle.asn1.ASN1Sequence.getInstance(aSN1Sequence.getObjectAt(i));
    }
}
