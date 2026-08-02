package org.bouncycastle.asn1.ess;

/* loaded from: classes17.dex */
public class SigningCertificate extends org.bouncycastle.asn1.ASN1Object {
    org.bouncycastle.asn1.ASN1Sequence Camera2StreamConfigurationMap;
    org.bouncycastle.asn1.ASN1Sequence getHighResolutionOutputSizeshNQ4ISI;

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public org.bouncycastle.asn1.ASN1Primitive toASN1Primitive() {
        org.bouncycastle.asn1.ASN1EncodableVector aSN1EncodableVector = new org.bouncycastle.asn1.ASN1EncodableVector(2);
        aSN1EncodableVector.add(this.getHighResolutionOutputSizeshNQ4ISI);
        org.bouncycastle.asn1.ASN1Sequence aSN1Sequence = this.Camera2StreamConfigurationMap;
        if (aSN1Sequence != null) {
            aSN1EncodableVector.add(aSN1Sequence);
        }
        return new org.bouncycastle.asn1.DERSequence(aSN1EncodableVector);
    }

    public org.bouncycastle.asn1.x509.PolicyInformation[] getPolicies() {
        org.bouncycastle.asn1.ASN1Sequence aSN1Sequence = this.Camera2StreamConfigurationMap;
        if (aSN1Sequence == null) {
            return null;
        }
        org.bouncycastle.asn1.x509.PolicyInformation[] policyInformationArr = new org.bouncycastle.asn1.x509.PolicyInformation[aSN1Sequence.size()];
        for (int i = 0; i != this.Camera2StreamConfigurationMap.size(); i++) {
            policyInformationArr[i] = org.bouncycastle.asn1.x509.PolicyInformation.getInstance(this.Camera2StreamConfigurationMap.getObjectAt(i));
        }
        return policyInformationArr;
    }

    public org.bouncycastle.asn1.ess.ESSCertID[] getCerts() {
        org.bouncycastle.asn1.ess.ESSCertID[] eSSCertIDArr = new org.bouncycastle.asn1.ess.ESSCertID[this.getHighResolutionOutputSizeshNQ4ISI.size()];
        for (int i = 0; i != this.getHighResolutionOutputSizeshNQ4ISI.size(); i++) {
            eSSCertIDArr[i] = org.bouncycastle.asn1.ess.ESSCertID.getInstance(this.getHighResolutionOutputSizeshNQ4ISI.getObjectAt(i));
        }
        return eSSCertIDArr;
    }

    public static org.bouncycastle.asn1.ess.SigningCertificate getInstance(java.lang.Object obj) {
        if (obj instanceof org.bouncycastle.asn1.ess.SigningCertificate) {
            return (org.bouncycastle.asn1.ess.SigningCertificate) obj;
        }
        if (obj != null) {
            return new org.bouncycastle.asn1.ess.SigningCertificate(org.bouncycastle.asn1.ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    public SigningCertificate(org.bouncycastle.asn1.ess.ESSCertID eSSCertID) {
        this.getHighResolutionOutputSizeshNQ4ISI = new org.bouncycastle.asn1.DERSequence(eSSCertID);
    }

    private SigningCertificate(org.bouncycastle.asn1.ASN1Sequence aSN1Sequence) {
        if (aSN1Sequence.size() <= 0 || aSN1Sequence.size() > 2) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Bad sequence size: ");
            sb.append(aSN1Sequence.size());
            throw new java.lang.IllegalArgumentException(sb.toString());
        }
        this.getHighResolutionOutputSizeshNQ4ISI = org.bouncycastle.asn1.ASN1Sequence.getInstance(aSN1Sequence.getObjectAt(0));
        if (aSN1Sequence.size() > 1) {
            this.Camera2StreamConfigurationMap = org.bouncycastle.asn1.ASN1Sequence.getInstance(aSN1Sequence.getObjectAt(1));
        }
    }
}
