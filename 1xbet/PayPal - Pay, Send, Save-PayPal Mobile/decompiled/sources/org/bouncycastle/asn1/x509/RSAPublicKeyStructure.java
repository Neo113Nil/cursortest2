package org.bouncycastle.asn1.x509;

/* loaded from: classes17.dex */
public class RSAPublicKeyStructure extends org.bouncycastle.asn1.ASN1Object {
    private java.math.BigInteger Camera2StreamConfigurationMap;
    private java.math.BigInteger getHighSpeedVideoFpsRangesFor;

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public org.bouncycastle.asn1.ASN1Primitive toASN1Primitive() {
        org.bouncycastle.asn1.ASN1EncodableVector aSN1EncodableVector = new org.bouncycastle.asn1.ASN1EncodableVector(2);
        aSN1EncodableVector.add(new org.bouncycastle.asn1.ASN1Integer(getModulus()));
        aSN1EncodableVector.add(new org.bouncycastle.asn1.ASN1Integer(getPublicExponent()));
        return new org.bouncycastle.asn1.DERSequence(aSN1EncodableVector);
    }

    public java.math.BigInteger getPublicExponent() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public java.math.BigInteger getModulus() {
        return this.Camera2StreamConfigurationMap;
    }

    public static org.bouncycastle.asn1.x509.RSAPublicKeyStructure getInstance(org.bouncycastle.asn1.ASN1TaggedObject aSN1TaggedObject, boolean z) {
        return getInstance(org.bouncycastle.asn1.ASN1Sequence.getInstance(aSN1TaggedObject, z));
    }

    public static org.bouncycastle.asn1.x509.RSAPublicKeyStructure getInstance(java.lang.Object obj) {
        if (obj == null || (obj instanceof org.bouncycastle.asn1.x509.RSAPublicKeyStructure)) {
            return (org.bouncycastle.asn1.x509.RSAPublicKeyStructure) obj;
        }
        if (obj instanceof org.bouncycastle.asn1.ASN1Sequence) {
            return new org.bouncycastle.asn1.x509.RSAPublicKeyStructure((org.bouncycastle.asn1.ASN1Sequence) obj);
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Invalid RSAPublicKeyStructure: ");
        sb.append(obj.getClass().getName());
        throw new java.lang.IllegalArgumentException(sb.toString());
    }

    public RSAPublicKeyStructure(org.bouncycastle.asn1.ASN1Sequence aSN1Sequence) {
        if (aSN1Sequence.size() != 2) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Bad sequence size: ");
            sb.append(aSN1Sequence.size());
            throw new java.lang.IllegalArgumentException(sb.toString());
        }
        java.util.Enumeration objects = aSN1Sequence.getObjects();
        this.Camera2StreamConfigurationMap = org.bouncycastle.asn1.ASN1Integer.getInstance(objects.nextElement()).getPositiveValue();
        this.getHighSpeedVideoFpsRangesFor = org.bouncycastle.asn1.ASN1Integer.getInstance(objects.nextElement()).getPositiveValue();
    }

    public RSAPublicKeyStructure(java.math.BigInteger bigInteger, java.math.BigInteger bigInteger2) {
        this.Camera2StreamConfigurationMap = bigInteger;
        this.getHighSpeedVideoFpsRangesFor = bigInteger2;
    }
}
