package org.bouncycastle.asn1.sec;

/* loaded from: classes17.dex */
public class ECPrivateKeyStructure extends org.bouncycastle.asn1.ASN1Object {
    private org.bouncycastle.asn1.ASN1Sequence getHighSpeedVideoFpsRangesFor;

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public org.bouncycastle.asn1.ASN1Primitive toASN1Primitive() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public org.bouncycastle.asn1.ASN1BitString getPublicKey() {
        return (org.bouncycastle.asn1.ASN1BitString) getHighSpeedVideoFpsRanges(1);
    }

    public org.bouncycastle.asn1.ASN1Primitive getParameters() {
        return getHighSpeedVideoFpsRanges(0);
    }

    public java.math.BigInteger getKey() {
        return new java.math.BigInteger(1, ((org.bouncycastle.asn1.ASN1OctetString) this.getHighSpeedVideoFpsRangesFor.getObjectAt(1)).getOctets());
    }

    private org.bouncycastle.asn1.ASN1Primitive getHighSpeedVideoFpsRanges(int i) {
        java.util.Enumeration objects = this.getHighSpeedVideoFpsRangesFor.getObjects();
        while (objects.hasMoreElements()) {
            org.bouncycastle.asn1.ASN1Encodable aSN1Encodable = (org.bouncycastle.asn1.ASN1Encodable) objects.nextElement();
            if (aSN1Encodable instanceof org.bouncycastle.asn1.ASN1TaggedObject) {
                org.bouncycastle.asn1.ASN1TaggedObject aSN1TaggedObject = (org.bouncycastle.asn1.ASN1TaggedObject) aSN1Encodable;
                if (aSN1TaggedObject.getTagNo() == i) {
                    return aSN1TaggedObject.getObject().toASN1Primitive();
                }
            }
        }
        return null;
    }

    public ECPrivateKeyStructure(org.bouncycastle.asn1.ASN1Sequence aSN1Sequence) {
        this.getHighSpeedVideoFpsRangesFor = aSN1Sequence;
    }

    public ECPrivateKeyStructure(java.math.BigInteger bigInteger, org.bouncycastle.asn1.ASN1Encodable aSN1Encodable) {
        this(bigInteger, null, aSN1Encodable);
    }

    public ECPrivateKeyStructure(java.math.BigInteger bigInteger, org.bouncycastle.asn1.ASN1BitString aSN1BitString, org.bouncycastle.asn1.ASN1Encodable aSN1Encodable) {
        byte[] asUnsignedByteArray = org.bouncycastle.util.BigIntegers.asUnsignedByteArray(bigInteger);
        org.bouncycastle.asn1.ASN1EncodableVector aSN1EncodableVector = new org.bouncycastle.asn1.ASN1EncodableVector(4);
        aSN1EncodableVector.add(new org.bouncycastle.asn1.ASN1Integer(1L));
        aSN1EncodableVector.add(new org.bouncycastle.asn1.DEROctetString(asUnsignedByteArray));
        if (aSN1Encodable != null) {
            aSN1EncodableVector.add(new org.bouncycastle.asn1.DERTaggedObject(true, 0, aSN1Encodable));
        }
        if (aSN1BitString != null) {
            aSN1EncodableVector.add(new org.bouncycastle.asn1.DERTaggedObject(true, 1, (org.bouncycastle.asn1.ASN1Encodable) aSN1BitString));
            aSN1EncodableVector.add(new org.bouncycastle.asn1.DERTaggedObject(true, 1, (org.bouncycastle.asn1.ASN1Encodable) aSN1BitString));
        }
        this.getHighSpeedVideoFpsRangesFor = new org.bouncycastle.asn1.DERSequence(aSN1EncodableVector);
    }

    public ECPrivateKeyStructure(java.math.BigInteger bigInteger) {
        byte[] asUnsignedByteArray = org.bouncycastle.util.BigIntegers.asUnsignedByteArray(bigInteger);
        org.bouncycastle.asn1.ASN1EncodableVector aSN1EncodableVector = new org.bouncycastle.asn1.ASN1EncodableVector(2);
        aSN1EncodableVector.add(new org.bouncycastle.asn1.ASN1Integer(1L));
        aSN1EncodableVector.add(new org.bouncycastle.asn1.DEROctetString(asUnsignedByteArray));
        this.getHighSpeedVideoFpsRangesFor = new org.bouncycastle.asn1.DERSequence(aSN1EncodableVector);
    }
}
