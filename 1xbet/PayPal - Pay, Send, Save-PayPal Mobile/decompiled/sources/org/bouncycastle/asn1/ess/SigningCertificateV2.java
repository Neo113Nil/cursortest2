package org.bouncycastle.asn1.ess;

/* loaded from: classes17.dex */
public class SigningCertificateV2 extends org.bouncycastle.asn1.ASN1Object {
    org.bouncycastle.asn1.ASN1Sequence getHighSpeedVideoFpsRangesFor;
    org.bouncycastle.asn1.ASN1Sequence getHighSpeedVideoSizes;

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public org.bouncycastle.asn1.ASN1Primitive toASN1Primitive() {
        org.bouncycastle.asn1.ASN1EncodableVector aSN1EncodableVector = new org.bouncycastle.asn1.ASN1EncodableVector(2);
        aSN1EncodableVector.add(this.getHighSpeedVideoSizes);
        org.bouncycastle.asn1.ASN1Sequence aSN1Sequence = this.getHighSpeedVideoFpsRangesFor;
        if (aSN1Sequence != null) {
            aSN1EncodableVector.add(aSN1Sequence);
        }
        return new org.bouncycastle.asn1.DERSequence(aSN1EncodableVector);
    }

    public org.bouncycastle.asn1.x509.PolicyInformation[] getPolicies() {
        org.bouncycastle.asn1.ASN1Sequence aSN1Sequence = this.getHighSpeedVideoFpsRangesFor;
        if (aSN1Sequence == null) {
            return null;
        }
        org.bouncycastle.asn1.x509.PolicyInformation[] policyInformationArr = new org.bouncycastle.asn1.x509.PolicyInformation[aSN1Sequence.size()];
        for (int i = 0; i != this.getHighSpeedVideoFpsRangesFor.size(); i++) {
            policyInformationArr[i] = org.bouncycastle.asn1.x509.PolicyInformation.getInstance(this.getHighSpeedVideoFpsRangesFor.getObjectAt(i));
        }
        return policyInformationArr;
    }

    public org.bouncycastle.asn1.ess.ESSCertIDv2[] getCerts() {
        org.bouncycastle.asn1.ess.ESSCertIDv2[] eSSCertIDv2Arr = new org.bouncycastle.asn1.ess.ESSCertIDv2[this.getHighSpeedVideoSizes.size()];
        for (int i = 0; i != this.getHighSpeedVideoSizes.size(); i++) {
            eSSCertIDv2Arr[i] = org.bouncycastle.asn1.ess.ESSCertIDv2.getInstance(this.getHighSpeedVideoSizes.getObjectAt(i));
        }
        return eSSCertIDv2Arr;
    }

    public static org.bouncycastle.asn1.ess.SigningCertificateV2 getInstance(java.lang.Object obj) {
        if (obj == null || (obj instanceof org.bouncycastle.asn1.ess.SigningCertificateV2)) {
            return (org.bouncycastle.asn1.ess.SigningCertificateV2) obj;
        }
        if (obj instanceof org.bouncycastle.asn1.ASN1Sequence) {
            return new org.bouncycastle.asn1.ess.SigningCertificateV2((org.bouncycastle.asn1.ASN1Sequence) obj);
        }
        return null;
    }

    public SigningCertificateV2(org.bouncycastle.asn1.ess.ESSCertIDv2[] eSSCertIDv2Arr, org.bouncycastle.asn1.x509.PolicyInformation[] policyInformationArr) {
        this.getHighSpeedVideoSizes = new org.bouncycastle.asn1.DERSequence(eSSCertIDv2Arr);
        if (policyInformationArr != null) {
            this.getHighSpeedVideoFpsRangesFor = new org.bouncycastle.asn1.DERSequence(policyInformationArr);
        }
    }

    public SigningCertificateV2(org.bouncycastle.asn1.ess.ESSCertIDv2[] eSSCertIDv2Arr) {
        this.getHighSpeedVideoSizes = new org.bouncycastle.asn1.DERSequence(eSSCertIDv2Arr);
    }

    public SigningCertificateV2(org.bouncycastle.asn1.ess.ESSCertIDv2 eSSCertIDv2) {
        this.getHighSpeedVideoSizes = new org.bouncycastle.asn1.DERSequence(eSSCertIDv2);
    }

    private SigningCertificateV2(org.bouncycastle.asn1.ASN1Sequence aSN1Sequence) {
        if (aSN1Sequence.size() <= 0 || aSN1Sequence.size() > 2) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Bad sequence size: ");
            sb.append(aSN1Sequence.size());
            throw new java.lang.IllegalArgumentException(sb.toString());
        }
        this.getHighSpeedVideoSizes = org.bouncycastle.asn1.ASN1Sequence.getInstance(aSN1Sequence.getObjectAt(0));
        if (aSN1Sequence.size() > 1) {
            this.getHighSpeedVideoFpsRangesFor = org.bouncycastle.asn1.ASN1Sequence.getInstance(aSN1Sequence.getObjectAt(1));
        }
    }
}
