package org.bouncycastle.asn1.oiw;

/* loaded from: classes17.dex */
public class ElGamalParameter extends org.bouncycastle.asn1.ASN1Object {
    org.bouncycastle.asn1.ASN1Integer getHighSpeedVideoFpsRanges;
    org.bouncycastle.asn1.ASN1Integer getHighSpeedVideoFpsRangesFor;

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public org.bouncycastle.asn1.ASN1Primitive toASN1Primitive() {
        org.bouncycastle.asn1.ASN1EncodableVector aSN1EncodableVector = new org.bouncycastle.asn1.ASN1EncodableVector(2);
        aSN1EncodableVector.add(this.getHighSpeedVideoFpsRangesFor);
        aSN1EncodableVector.add(this.getHighSpeedVideoFpsRanges);
        return new org.bouncycastle.asn1.DERSequence(aSN1EncodableVector);
    }

    public java.math.BigInteger getP() {
        return this.getHighSpeedVideoFpsRangesFor.getPositiveValue();
    }

    public java.math.BigInteger getG() {
        return this.getHighSpeedVideoFpsRanges.getPositiveValue();
    }

    public static org.bouncycastle.asn1.oiw.ElGamalParameter getInstance(java.lang.Object obj) {
        if (obj instanceof org.bouncycastle.asn1.oiw.ElGamalParameter) {
            return (org.bouncycastle.asn1.oiw.ElGamalParameter) obj;
        }
        if (obj != null) {
            return new org.bouncycastle.asn1.oiw.ElGamalParameter(org.bouncycastle.asn1.ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    private ElGamalParameter(org.bouncycastle.asn1.ASN1Sequence aSN1Sequence) {
        java.util.Enumeration objects = aSN1Sequence.getObjects();
        this.getHighSpeedVideoFpsRangesFor = (org.bouncycastle.asn1.ASN1Integer) objects.nextElement();
        this.getHighSpeedVideoFpsRanges = (org.bouncycastle.asn1.ASN1Integer) objects.nextElement();
    }

    public ElGamalParameter(java.math.BigInteger bigInteger, java.math.BigInteger bigInteger2) {
        this.getHighSpeedVideoFpsRangesFor = new org.bouncycastle.asn1.ASN1Integer(bigInteger);
        this.getHighSpeedVideoFpsRanges = new org.bouncycastle.asn1.ASN1Integer(bigInteger2);
    }
}
