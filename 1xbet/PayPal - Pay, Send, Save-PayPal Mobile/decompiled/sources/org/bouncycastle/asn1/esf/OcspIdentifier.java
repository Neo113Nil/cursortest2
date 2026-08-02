package org.bouncycastle.asn1.esf;

/* loaded from: classes17.dex */
public class OcspIdentifier extends org.bouncycastle.asn1.ASN1Object {
    private org.bouncycastle.asn1.ocsp.ResponderID getHighResolutionOutputSizeshNQ4ISI;
    private org.bouncycastle.asn1.ASN1GeneralizedTime getHighSpeedVideoFpsRangesFor;

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public org.bouncycastle.asn1.ASN1Primitive toASN1Primitive() {
        org.bouncycastle.asn1.ASN1EncodableVector aSN1EncodableVector = new org.bouncycastle.asn1.ASN1EncodableVector(2);
        aSN1EncodableVector.add(this.getHighResolutionOutputSizeshNQ4ISI);
        aSN1EncodableVector.add(this.getHighSpeedVideoFpsRangesFor);
        return new org.bouncycastle.asn1.DERSequence(aSN1EncodableVector);
    }

    public org.bouncycastle.asn1.ASN1GeneralizedTime getProducedAt() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public org.bouncycastle.asn1.ocsp.ResponderID getOcspResponderID() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public static org.bouncycastle.asn1.esf.OcspIdentifier getInstance(java.lang.Object obj) {
        if (obj instanceof org.bouncycastle.asn1.esf.OcspIdentifier) {
            return (org.bouncycastle.asn1.esf.OcspIdentifier) obj;
        }
        if (obj != null) {
            return new org.bouncycastle.asn1.esf.OcspIdentifier(org.bouncycastle.asn1.ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    public OcspIdentifier(org.bouncycastle.asn1.ocsp.ResponderID responderID, org.bouncycastle.asn1.ASN1GeneralizedTime aSN1GeneralizedTime) {
        this.getHighResolutionOutputSizeshNQ4ISI = responderID;
        this.getHighSpeedVideoFpsRangesFor = aSN1GeneralizedTime;
    }

    private OcspIdentifier(org.bouncycastle.asn1.ASN1Sequence aSN1Sequence) {
        if (aSN1Sequence.size() == 2) {
            this.getHighResolutionOutputSizeshNQ4ISI = org.bouncycastle.asn1.ocsp.ResponderID.getInstance(aSN1Sequence.getObjectAt(0));
            this.getHighSpeedVideoFpsRangesFor = (org.bouncycastle.asn1.ASN1GeneralizedTime) aSN1Sequence.getObjectAt(1);
        } else {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Bad sequence size: ");
            sb.append(aSN1Sequence.size());
            throw new java.lang.IllegalArgumentException(sb.toString());
        }
    }
}
