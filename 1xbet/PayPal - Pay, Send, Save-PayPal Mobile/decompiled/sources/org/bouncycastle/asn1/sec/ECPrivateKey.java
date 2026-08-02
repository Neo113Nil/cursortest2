package org.bouncycastle.asn1.sec;

/* loaded from: classes17.dex */
public class ECPrivateKey extends org.bouncycastle.asn1.ASN1Object {
    private org.bouncycastle.asn1.ASN1Sequence getHighSpeedVideoFpsRangesFor;

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public org.bouncycastle.asn1.ASN1Primitive toASN1Primitive() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public org.bouncycastle.asn1.ASN1BitString getPublicKey() {
        return (org.bouncycastle.asn1.ASN1BitString) getHighResolutionOutputSizeshNQ4ISI(1, 3);
    }

    public org.bouncycastle.asn1.ASN1Object getParametersObject() {
        return getHighResolutionOutputSizeshNQ4ISI(0, -1);
    }

    public org.bouncycastle.asn1.ASN1Primitive getParameters() {
        return getParametersObject().toASN1Primitive();
    }

    public java.math.BigInteger getKey() {
        return new java.math.BigInteger(1, ((org.bouncycastle.asn1.ASN1OctetString) this.getHighSpeedVideoFpsRangesFor.getObjectAt(1)).getOctets());
    }

    private org.bouncycastle.asn1.ASN1Object getHighResolutionOutputSizeshNQ4ISI(int i, int i2) {
        java.util.Enumeration objects = this.getHighSpeedVideoFpsRangesFor.getObjects();
        while (objects.hasMoreElements()) {
            org.bouncycastle.asn1.ASN1Encodable aSN1Encodable = (org.bouncycastle.asn1.ASN1Encodable) objects.nextElement();
            if (aSN1Encodable instanceof org.bouncycastle.asn1.ASN1TaggedObject) {
                org.bouncycastle.asn1.ASN1TaggedObject aSN1TaggedObject = (org.bouncycastle.asn1.ASN1TaggedObject) aSN1Encodable;
                if (aSN1TaggedObject.hasContextTag(i)) {
                    return i2 < 0 ? aSN1TaggedObject.getExplicitBaseObject().toASN1Primitive() : aSN1TaggedObject.getBaseUniversal(true, i2);
                }
            }
        }
        return null;
    }

    public static org.bouncycastle.asn1.sec.ECPrivateKey getInstance(java.lang.Object obj) {
        if (obj instanceof org.bouncycastle.asn1.sec.ECPrivateKey) {
            return (org.bouncycastle.asn1.sec.ECPrivateKey) obj;
        }
        if (obj != null) {
            return new org.bouncycastle.asn1.sec.ECPrivateKey(org.bouncycastle.asn1.ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    private ECPrivateKey(org.bouncycastle.asn1.ASN1Sequence aSN1Sequence) {
        this.getHighSpeedVideoFpsRangesFor = aSN1Sequence;
    }

    public ECPrivateKey(java.math.BigInteger bigInteger, org.bouncycastle.asn1.ASN1Encodable aSN1Encodable) {
        this(bigInteger, (org.bouncycastle.asn1.ASN1BitString) null, aSN1Encodable);
    }

    public ECPrivateKey(java.math.BigInteger bigInteger, org.bouncycastle.asn1.ASN1BitString aSN1BitString, org.bouncycastle.asn1.ASN1Encodable aSN1Encodable) {
        this(bigInteger.bitLength(), bigInteger, aSN1BitString, aSN1Encodable);
    }

    public ECPrivateKey(java.math.BigInteger bigInteger) {
        this(bigInteger.bitLength(), bigInteger);
    }

    public ECPrivateKey(int i, java.math.BigInteger bigInteger, org.bouncycastle.asn1.ASN1Encodable aSN1Encodable) {
        this(i, bigInteger, null, aSN1Encodable);
    }

    public ECPrivateKey(int i, java.math.BigInteger bigInteger, org.bouncycastle.asn1.ASN1BitString aSN1BitString, org.bouncycastle.asn1.ASN1Encodable aSN1Encodable) {
        byte[] asUnsignedByteArray = org.bouncycastle.util.BigIntegers.asUnsignedByteArray((i + 7) / 8, bigInteger);
        org.bouncycastle.asn1.ASN1EncodableVector aSN1EncodableVector = new org.bouncycastle.asn1.ASN1EncodableVector(4);
        aSN1EncodableVector.add(new org.bouncycastle.asn1.ASN1Integer(1L));
        aSN1EncodableVector.add(new org.bouncycastle.asn1.DEROctetString(asUnsignedByteArray));
        if (aSN1Encodable != null) {
            aSN1EncodableVector.add(new org.bouncycastle.asn1.DERTaggedObject(true, 0, aSN1Encodable));
        }
        if (aSN1BitString != null) {
            aSN1EncodableVector.add(new org.bouncycastle.asn1.DERTaggedObject(true, 1, (org.bouncycastle.asn1.ASN1Encodable) aSN1BitString));
        }
        this.getHighSpeedVideoFpsRangesFor = new org.bouncycastle.asn1.DERSequence(aSN1EncodableVector);
    }

    public ECPrivateKey(int i, java.math.BigInteger bigInteger) {
        byte[] asUnsignedByteArray = org.bouncycastle.util.BigIntegers.asUnsignedByteArray((i + 7) / 8, bigInteger);
        org.bouncycastle.asn1.ASN1EncodableVector aSN1EncodableVector = new org.bouncycastle.asn1.ASN1EncodableVector(2);
        aSN1EncodableVector.add(new org.bouncycastle.asn1.ASN1Integer(1L));
        aSN1EncodableVector.add(new org.bouncycastle.asn1.DEROctetString(asUnsignedByteArray));
        this.getHighSpeedVideoFpsRangesFor = new org.bouncycastle.asn1.DERSequence(aSN1EncodableVector);
    }
}
