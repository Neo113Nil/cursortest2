package org.bouncycastle.asn1.x509;

/* loaded from: classes17.dex */
public class AttCertValidityPeriod extends org.bouncycastle.asn1.ASN1Object {
    org.bouncycastle.asn1.ASN1GeneralizedTime getHighResolutionOutputSizeshNQ4ISI;
    org.bouncycastle.asn1.ASN1GeneralizedTime getHighSpeedVideoFpsRanges;

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public org.bouncycastle.asn1.ASN1Primitive toASN1Primitive() {
        org.bouncycastle.asn1.ASN1EncodableVector aSN1EncodableVector = new org.bouncycastle.asn1.ASN1EncodableVector(2);
        aSN1EncodableVector.add(this.getHighSpeedVideoFpsRanges);
        aSN1EncodableVector.add(this.getHighResolutionOutputSizeshNQ4ISI);
        return new org.bouncycastle.asn1.DERSequence(aSN1EncodableVector);
    }

    public org.bouncycastle.asn1.ASN1GeneralizedTime getNotBeforeTime() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public org.bouncycastle.asn1.ASN1GeneralizedTime getNotAfterTime() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public static org.bouncycastle.asn1.x509.AttCertValidityPeriod getInstance(java.lang.Object obj) {
        if (obj instanceof org.bouncycastle.asn1.x509.AttCertValidityPeriod) {
            return (org.bouncycastle.asn1.x509.AttCertValidityPeriod) obj;
        }
        if (obj != null) {
            return new org.bouncycastle.asn1.x509.AttCertValidityPeriod(org.bouncycastle.asn1.ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    private AttCertValidityPeriod(org.bouncycastle.asn1.ASN1Sequence aSN1Sequence) {
        if (aSN1Sequence.size() == 2) {
            this.getHighSpeedVideoFpsRanges = org.bouncycastle.asn1.ASN1GeneralizedTime.getInstance(aSN1Sequence.getObjectAt(0));
            this.getHighResolutionOutputSizeshNQ4ISI = org.bouncycastle.asn1.ASN1GeneralizedTime.getInstance(aSN1Sequence.getObjectAt(1));
        } else {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Bad sequence size: ");
            sb.append(aSN1Sequence.size());
            throw new java.lang.IllegalArgumentException(sb.toString());
        }
    }

    public AttCertValidityPeriod(org.bouncycastle.asn1.ASN1GeneralizedTime aSN1GeneralizedTime, org.bouncycastle.asn1.ASN1GeneralizedTime aSN1GeneralizedTime2) {
        this.getHighSpeedVideoFpsRanges = aSN1GeneralizedTime;
        this.getHighResolutionOutputSizeshNQ4ISI = aSN1GeneralizedTime2;
    }
}
