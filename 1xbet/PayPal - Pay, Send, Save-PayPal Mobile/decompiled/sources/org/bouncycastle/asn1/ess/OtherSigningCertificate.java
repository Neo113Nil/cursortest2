package org.bouncycastle.asn1.ess;

/* loaded from: classes17.dex */
public class OtherSigningCertificate extends org.bouncycastle.asn1.ASN1Object {
    org.bouncycastle.asn1.ASN1Sequence Camera2StreamConfigurationMap;
    org.bouncycastle.asn1.ASN1Sequence getHighResolutionOutputSizeshNQ4ISI;

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public org.bouncycastle.asn1.ASN1Primitive toASN1Primitive() {
        org.bouncycastle.asn1.ASN1EncodableVector aSN1EncodableVector = new org.bouncycastle.asn1.ASN1EncodableVector(2);
        aSN1EncodableVector.add(this.Camera2StreamConfigurationMap);
        org.bouncycastle.asn1.ASN1Sequence aSN1Sequence = this.getHighResolutionOutputSizeshNQ4ISI;
        if (aSN1Sequence != null) {
            aSN1EncodableVector.add(aSN1Sequence);
        }
        return new org.bouncycastle.asn1.DERSequence(aSN1EncodableVector);
    }

    public org.bouncycastle.asn1.x509.PolicyInformation[] getPolicies() {
        org.bouncycastle.asn1.ASN1Sequence aSN1Sequence = this.getHighResolutionOutputSizeshNQ4ISI;
        if (aSN1Sequence == null) {
            return null;
        }
        org.bouncycastle.asn1.x509.PolicyInformation[] policyInformationArr = new org.bouncycastle.asn1.x509.PolicyInformation[aSN1Sequence.size()];
        for (int i = 0; i != this.getHighResolutionOutputSizeshNQ4ISI.size(); i++) {
            policyInformationArr[i] = org.bouncycastle.asn1.x509.PolicyInformation.getInstance(this.getHighResolutionOutputSizeshNQ4ISI.getObjectAt(i));
        }
        return policyInformationArr;
    }

    public org.bouncycastle.asn1.ess.OtherCertID[] getCerts() {
        org.bouncycastle.asn1.ess.OtherCertID[] otherCertIDArr = new org.bouncycastle.asn1.ess.OtherCertID[this.Camera2StreamConfigurationMap.size()];
        for (int i = 0; i != this.Camera2StreamConfigurationMap.size(); i++) {
            otherCertIDArr[i] = org.bouncycastle.asn1.ess.OtherCertID.getInstance(this.Camera2StreamConfigurationMap.getObjectAt(i));
        }
        return otherCertIDArr;
    }

    public static org.bouncycastle.asn1.ess.OtherSigningCertificate getInstance(java.lang.Object obj) {
        if (obj instanceof org.bouncycastle.asn1.ess.OtherSigningCertificate) {
            return (org.bouncycastle.asn1.ess.OtherSigningCertificate) obj;
        }
        if (obj != null) {
            return new org.bouncycastle.asn1.ess.OtherSigningCertificate(org.bouncycastle.asn1.ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    public OtherSigningCertificate(org.bouncycastle.asn1.ess.OtherCertID otherCertID) {
        this.Camera2StreamConfigurationMap = new org.bouncycastle.asn1.DERSequence(otherCertID);
    }

    private OtherSigningCertificate(org.bouncycastle.asn1.ASN1Sequence aSN1Sequence) {
        if (aSN1Sequence.size() <= 0 || aSN1Sequence.size() > 2) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Bad sequence size: ");
            sb.append(aSN1Sequence.size());
            throw new java.lang.IllegalArgumentException(sb.toString());
        }
        this.Camera2StreamConfigurationMap = org.bouncycastle.asn1.ASN1Sequence.getInstance(aSN1Sequence.getObjectAt(0));
        if (aSN1Sequence.size() > 1) {
            this.getHighResolutionOutputSizeshNQ4ISI = org.bouncycastle.asn1.ASN1Sequence.getInstance(aSN1Sequence.getObjectAt(1));
        }
    }
}
