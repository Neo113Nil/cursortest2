package org.bouncycastle.crypto.signers;

/* loaded from: classes17.dex */
public class StandardDSAEncoding implements org.bouncycastle.crypto.signers.DSAEncoding {
    public static final org.bouncycastle.crypto.signers.StandardDSAEncoding INSTANCE = new org.bouncycastle.crypto.signers.StandardDSAEncoding();

    protected void encodeValue(java.math.BigInteger bigInteger, org.bouncycastle.asn1.ASN1EncodableVector aSN1EncodableVector, java.math.BigInteger bigInteger2) {
        aSN1EncodableVector.add(new org.bouncycastle.asn1.ASN1Integer(checkValue(bigInteger, bigInteger2)));
    }

    @Override // org.bouncycastle.crypto.signers.DSAEncoding
    public byte[] encode(java.math.BigInteger bigInteger, java.math.BigInteger bigInteger2, java.math.BigInteger bigInteger3) throws java.io.IOException {
        org.bouncycastle.asn1.ASN1EncodableVector aSN1EncodableVector = new org.bouncycastle.asn1.ASN1EncodableVector();
        encodeValue(bigInteger, aSN1EncodableVector, bigInteger2);
        encodeValue(bigInteger, aSN1EncodableVector, bigInteger3);
        return new org.bouncycastle.asn1.DERSequence(aSN1EncodableVector).getEncoded(org.bouncycastle.asn1.ASN1Encoding.DER);
    }

    protected java.math.BigInteger decodeValue(java.math.BigInteger bigInteger, org.bouncycastle.asn1.ASN1Sequence aSN1Sequence, int i) {
        return checkValue(bigInteger, ((org.bouncycastle.asn1.ASN1Integer) aSN1Sequence.getObjectAt(i)).getValue());
    }

    @Override // org.bouncycastle.crypto.signers.DSAEncoding
    public java.math.BigInteger[] decode(java.math.BigInteger bigInteger, byte[] bArr) throws java.io.IOException {
        org.bouncycastle.asn1.ASN1Sequence aSN1Sequence = (org.bouncycastle.asn1.ASN1Sequence) org.bouncycastle.asn1.ASN1Primitive.fromByteArray(bArr);
        if (aSN1Sequence.size() == 2) {
            java.math.BigInteger decodeValue = decodeValue(bigInteger, aSN1Sequence, 0);
            java.math.BigInteger decodeValue2 = decodeValue(bigInteger, aSN1Sequence, 1);
            if (org.bouncycastle.util.Arrays.areEqual(encode(bigInteger, decodeValue, decodeValue2), bArr)) {
                return new java.math.BigInteger[]{decodeValue, decodeValue2};
            }
        }
        throw new java.lang.IllegalArgumentException("Malformed signature");
    }

    protected java.math.BigInteger checkValue(java.math.BigInteger bigInteger, java.math.BigInteger bigInteger2) {
        if (bigInteger2.signum() < 0 || (bigInteger != null && bigInteger2.compareTo(bigInteger) >= 0)) {
            throw new java.lang.IllegalArgumentException("Value out of range");
        }
        return bigInteger2;
    }
}
