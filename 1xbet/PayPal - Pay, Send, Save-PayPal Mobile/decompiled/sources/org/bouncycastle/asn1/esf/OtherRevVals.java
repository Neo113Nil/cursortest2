package org.bouncycastle.asn1.esf;

/* loaded from: classes17.dex */
public class OtherRevVals extends org.bouncycastle.asn1.ASN1Object {
    private org.bouncycastle.asn1.ASN1ObjectIdentifier getHighSpeedVideoFpsRangesFor;
    private org.bouncycastle.asn1.ASN1Encodable getHighSpeedVideoSizes;

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public org.bouncycastle.asn1.ASN1Primitive toASN1Primitive() {
        org.bouncycastle.asn1.ASN1EncodableVector aSN1EncodableVector = new org.bouncycastle.asn1.ASN1EncodableVector(2);
        aSN1EncodableVector.add(this.getHighSpeedVideoFpsRangesFor);
        aSN1EncodableVector.add(this.getHighSpeedVideoSizes);
        return new org.bouncycastle.asn1.DERSequence(aSN1EncodableVector);
    }

    public org.bouncycastle.asn1.ASN1Encodable getOtherRevVals() {
        return this.getHighSpeedVideoSizes;
    }

    public org.bouncycastle.asn1.ASN1ObjectIdentifier getOtherRevValType() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public static org.bouncycastle.asn1.esf.OtherRevVals getInstance(java.lang.Object obj) {
        if (obj instanceof org.bouncycastle.asn1.esf.OtherRevVals) {
            return (org.bouncycastle.asn1.esf.OtherRevVals) obj;
        }
        if (obj != null) {
            return new org.bouncycastle.asn1.esf.OtherRevVals(org.bouncycastle.asn1.ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    private OtherRevVals(org.bouncycastle.asn1.ASN1Sequence aSN1Sequence) {
        if (aSN1Sequence.size() != 2) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Bad sequence size: ");
            sb.append(aSN1Sequence.size());
            throw new java.lang.IllegalArgumentException(sb.toString());
        }
        this.getHighSpeedVideoFpsRangesFor = (org.bouncycastle.asn1.ASN1ObjectIdentifier) aSN1Sequence.getObjectAt(0);
        try {
            this.getHighSpeedVideoSizes = org.bouncycastle.asn1.ASN1Primitive.fromByteArray(aSN1Sequence.getObjectAt(1).toASN1Primitive().getEncoded(org.bouncycastle.asn1.ASN1Encoding.DER));
        } catch (java.io.IOException unused) {
            throw new java.lang.IllegalStateException();
        }
    }

    public OtherRevVals(org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier, org.bouncycastle.asn1.ASN1Encodable aSN1Encodable) {
        this.getHighSpeedVideoFpsRangesFor = aSN1ObjectIdentifier;
        this.getHighSpeedVideoSizes = aSN1Encodable;
    }
}
