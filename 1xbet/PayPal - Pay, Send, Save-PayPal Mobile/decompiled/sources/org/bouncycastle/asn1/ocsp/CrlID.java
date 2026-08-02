package org.bouncycastle.asn1.ocsp;

/* loaded from: classes17.dex */
public class CrlID extends org.bouncycastle.asn1.ASN1Object {
    private org.bouncycastle.asn1.ASN1Integer getHighResolutionOutputSizeshNQ4ISI;
    private org.bouncycastle.asn1.ASN1GeneralizedTime getHighSpeedVideoFpsRanges;
    private org.bouncycastle.asn1.ASN1IA5String getHighSpeedVideoFpsRangesFor;

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public org.bouncycastle.asn1.ASN1Primitive toASN1Primitive() {
        org.bouncycastle.asn1.ASN1EncodableVector aSN1EncodableVector = new org.bouncycastle.asn1.ASN1EncodableVector(3);
        org.bouncycastle.asn1.ASN1IA5String aSN1IA5String = this.getHighSpeedVideoFpsRangesFor;
        if (aSN1IA5String != null) {
            aSN1EncodableVector.add(new org.bouncycastle.asn1.DERTaggedObject(true, 0, (org.bouncycastle.asn1.ASN1Encodable) aSN1IA5String));
        }
        org.bouncycastle.asn1.ASN1Integer aSN1Integer = this.getHighResolutionOutputSizeshNQ4ISI;
        if (aSN1Integer != null) {
            aSN1EncodableVector.add(new org.bouncycastle.asn1.DERTaggedObject(true, 1, (org.bouncycastle.asn1.ASN1Encodable) aSN1Integer));
        }
        org.bouncycastle.asn1.ASN1GeneralizedTime aSN1GeneralizedTime = this.getHighSpeedVideoFpsRanges;
        if (aSN1GeneralizedTime != null) {
            aSN1EncodableVector.add(new org.bouncycastle.asn1.DERTaggedObject(true, 2, (org.bouncycastle.asn1.ASN1Encodable) aSN1GeneralizedTime));
        }
        return new org.bouncycastle.asn1.DERSequence(aSN1EncodableVector);
    }

    public org.bouncycastle.asn1.ASN1IA5String getCrlUrlIA5() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public org.bouncycastle.asn1.DERIA5String getCrlUrl() {
        org.bouncycastle.asn1.ASN1IA5String aSN1IA5String = this.getHighSpeedVideoFpsRangesFor;
        return (aSN1IA5String == null || (aSN1IA5String instanceof org.bouncycastle.asn1.DERIA5String)) ? (org.bouncycastle.asn1.DERIA5String) aSN1IA5String : new org.bouncycastle.asn1.DERIA5String(this.getHighSpeedVideoFpsRangesFor.getString(), false);
    }

    public org.bouncycastle.asn1.ASN1GeneralizedTime getCrlTime() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public org.bouncycastle.asn1.ASN1Integer getCrlNum() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public static org.bouncycastle.asn1.ocsp.CrlID getInstance(java.lang.Object obj) {
        if (obj instanceof org.bouncycastle.asn1.ocsp.CrlID) {
            return (org.bouncycastle.asn1.ocsp.CrlID) obj;
        }
        if (obj != null) {
            return new org.bouncycastle.asn1.ocsp.CrlID(org.bouncycastle.asn1.ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    private CrlID(org.bouncycastle.asn1.ASN1Sequence aSN1Sequence) {
        java.util.Enumeration objects = aSN1Sequence.getObjects();
        while (objects.hasMoreElements()) {
            org.bouncycastle.asn1.ASN1TaggedObject aSN1TaggedObject = (org.bouncycastle.asn1.ASN1TaggedObject) objects.nextElement();
            int tagNo = aSN1TaggedObject.getTagNo();
            if (tagNo == 0) {
                this.getHighSpeedVideoFpsRangesFor = org.bouncycastle.asn1.ASN1IA5String.getInstance(aSN1TaggedObject, true);
            } else if (tagNo == 1) {
                this.getHighResolutionOutputSizeshNQ4ISI = org.bouncycastle.asn1.ASN1Integer.getInstance(aSN1TaggedObject, true);
            } else {
                if (tagNo != 2) {
                    java.lang.StringBuilder sb = new java.lang.StringBuilder("unknown tag number: ");
                    sb.append(aSN1TaggedObject.getTagNo());
                    throw new java.lang.IllegalArgumentException(sb.toString());
                }
                this.getHighSpeedVideoFpsRanges = org.bouncycastle.asn1.ASN1GeneralizedTime.getInstance(aSN1TaggedObject, true);
            }
        }
    }
}
