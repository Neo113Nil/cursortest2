package org.bouncycastle.asn1.pkcs;

/* loaded from: classes17.dex */
public class RSAPublicKey extends org.bouncycastle.asn1.ASN1Object {
    private java.math.BigInteger getHighSpeedVideoFpsRanges;
    private java.math.BigInteger getHighSpeedVideoSizes;

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public org.bouncycastle.asn1.ASN1Primitive toASN1Primitive() {
        org.bouncycastle.asn1.ASN1EncodableVector aSN1EncodableVector = new org.bouncycastle.asn1.ASN1EncodableVector(2);
        aSN1EncodableVector.add(new org.bouncycastle.asn1.ASN1Integer(getModulus()));
        aSN1EncodableVector.add(new org.bouncycastle.asn1.ASN1Integer(getPublicExponent()));
        return new org.bouncycastle.asn1.DERSequence(aSN1EncodableVector);
    }

    public java.math.BigInteger getPublicExponent() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public java.math.BigInteger getModulus() {
        return this.getHighSpeedVideoSizes;
    }

    public static org.bouncycastle.asn1.pkcs.RSAPublicKey getInstance(org.bouncycastle.asn1.ASN1TaggedObject aSN1TaggedObject, boolean z) {
        return getInstance(org.bouncycastle.asn1.ASN1Sequence.getInstance(aSN1TaggedObject, z));
    }

    public static org.bouncycastle.asn1.pkcs.RSAPublicKey getInstance(java.lang.Object obj) {
        if (obj instanceof org.bouncycastle.asn1.pkcs.RSAPublicKey) {
            return (org.bouncycastle.asn1.pkcs.RSAPublicKey) obj;
        }
        if (obj != null) {
            return new org.bouncycastle.asn1.pkcs.RSAPublicKey(org.bouncycastle.asn1.ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    private RSAPublicKey(org.bouncycastle.asn1.ASN1Sequence aSN1Sequence) {
        if (aSN1Sequence.size() != 2) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Bad sequence size: ");
            sb.append(aSN1Sequence.size());
            throw new java.lang.IllegalArgumentException(sb.toString());
        }
        java.util.Enumeration objects = aSN1Sequence.getObjects();
        this.getHighSpeedVideoSizes = org.bouncycastle.asn1.ASN1Integer.getInstance(objects.nextElement()).getPositiveValue();
        this.getHighSpeedVideoFpsRanges = org.bouncycastle.asn1.ASN1Integer.getInstance(objects.nextElement()).getPositiveValue();
    }

    public RSAPublicKey(java.math.BigInteger bigInteger, java.math.BigInteger bigInteger2) {
        this.getHighSpeedVideoSizes = bigInteger;
        this.getHighSpeedVideoFpsRanges = bigInteger2;
    }
}
