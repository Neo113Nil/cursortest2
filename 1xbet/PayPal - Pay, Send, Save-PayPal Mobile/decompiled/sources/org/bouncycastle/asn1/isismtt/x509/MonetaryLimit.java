package org.bouncycastle.asn1.isismtt.x509;

/* loaded from: classes17.dex */
public class MonetaryLimit extends org.bouncycastle.asn1.ASN1Object {
    org.bouncycastle.asn1.ASN1Integer getHighSpeedVideoFpsRanges;
    org.bouncycastle.asn1.ASN1Integer getHighSpeedVideoFpsRangesFor;
    org.bouncycastle.asn1.ASN1PrintableString getHighSpeedVideoSizes;

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public org.bouncycastle.asn1.ASN1Primitive toASN1Primitive() {
        org.bouncycastle.asn1.ASN1EncodableVector aSN1EncodableVector = new org.bouncycastle.asn1.ASN1EncodableVector(3);
        aSN1EncodableVector.add(this.getHighSpeedVideoSizes);
        aSN1EncodableVector.add(this.getHighSpeedVideoFpsRangesFor);
        aSN1EncodableVector.add(this.getHighSpeedVideoFpsRanges);
        return new org.bouncycastle.asn1.DERSequence(aSN1EncodableVector);
    }

    public java.math.BigInteger getExponent() {
        return this.getHighSpeedVideoFpsRanges.getValue();
    }

    public java.lang.String getCurrency() {
        return this.getHighSpeedVideoSizes.getString();
    }

    public java.math.BigInteger getAmount() {
        return this.getHighSpeedVideoFpsRangesFor.getValue();
    }

    public static org.bouncycastle.asn1.isismtt.x509.MonetaryLimit getInstance(java.lang.Object obj) {
        if (obj == null || (obj instanceof org.bouncycastle.asn1.isismtt.x509.MonetaryLimit)) {
            return (org.bouncycastle.asn1.isismtt.x509.MonetaryLimit) obj;
        }
        if (obj instanceof org.bouncycastle.asn1.ASN1Sequence) {
            return new org.bouncycastle.asn1.isismtt.x509.MonetaryLimit(org.bouncycastle.asn1.ASN1Sequence.getInstance(obj));
        }
        throw new java.lang.IllegalArgumentException("unknown object in getInstance");
    }

    private MonetaryLimit(org.bouncycastle.asn1.ASN1Sequence aSN1Sequence) {
        if (aSN1Sequence.size() != 3) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Bad sequence size: ");
            sb.append(aSN1Sequence.size());
            throw new java.lang.IllegalArgumentException(sb.toString());
        }
        java.util.Enumeration objects = aSN1Sequence.getObjects();
        this.getHighSpeedVideoSizes = org.bouncycastle.asn1.ASN1PrintableString.getInstance(objects.nextElement());
        this.getHighSpeedVideoFpsRangesFor = org.bouncycastle.asn1.ASN1Integer.getInstance(objects.nextElement());
        this.getHighSpeedVideoFpsRanges = org.bouncycastle.asn1.ASN1Integer.getInstance(objects.nextElement());
    }

    public MonetaryLimit(java.lang.String str, int i, int i2) {
        this.getHighSpeedVideoSizes = new org.bouncycastle.asn1.DERPrintableString(str, true);
        this.getHighSpeedVideoFpsRangesFor = new org.bouncycastle.asn1.ASN1Integer(i);
        this.getHighSpeedVideoFpsRanges = new org.bouncycastle.asn1.ASN1Integer(i2);
    }
}
