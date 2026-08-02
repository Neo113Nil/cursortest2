package org.bouncycastle.asn1.eac;

/* loaded from: classes17.dex */
public class RSAPublicKey extends org.bouncycastle.asn1.eac.PublicKeyDataObject {
    private static int getHighSpeedVideoFpsRanges = 1;
    private static int getHighSpeedVideoSizes = 2;
    private java.math.BigInteger Camera2StreamConfigurationMap;
    private org.bouncycastle.asn1.ASN1ObjectIdentifier getHighResolutionOutputSizeshNQ4ISI;
    private java.math.BigInteger getHighSpeedVideoFpsRangesFor;
    private int getInputFormats;

    RSAPublicKey(org.bouncycastle.asn1.ASN1Sequence aSN1Sequence) {
        this.getInputFormats = 0;
        java.util.Enumeration objects = aSN1Sequence.getObjects();
        this.getHighResolutionOutputSizeshNQ4ISI = org.bouncycastle.asn1.ASN1ObjectIdentifier.getInstance(objects.nextElement());
        while (objects.hasMoreElements()) {
            org.bouncycastle.asn1.eac.UnsignedInteger unsignedInteger = org.bouncycastle.asn1.eac.UnsignedInteger.getInstance(objects.nextElement());
            int tagNo = unsignedInteger.getTagNo();
            if (tagNo == 1) {
                int i = this.getInputFormats;
                int i2 = getHighSpeedVideoFpsRanges;
                if ((i & i2) != 0) {
                    throw new java.lang.IllegalArgumentException("Modulus already set");
                }
                this.getInputFormats = i | i2;
                this.Camera2StreamConfigurationMap = unsignedInteger.getValue();
            } else {
                if (tagNo != 2) {
                    java.lang.StringBuilder sb = new java.lang.StringBuilder("Unknown DERTaggedObject :");
                    sb.append(unsignedInteger.getTagNo());
                    sb.append("-> not an Iso7816RSAPublicKeyStructure");
                    throw new java.lang.IllegalArgumentException(sb.toString());
                }
                int i3 = this.getInputFormats;
                int i4 = getHighSpeedVideoSizes;
                if ((i3 & i4) != 0) {
                    throw new java.lang.IllegalArgumentException("Exponent already set");
                }
                this.getInputFormats = i3 | i4;
                this.getHighSpeedVideoFpsRangesFor = unsignedInteger.getValue();
            }
        }
        if (this.getInputFormats != 3) {
            throw new java.lang.IllegalArgumentException("missing argument -> not an Iso7816RSAPublicKeyStructure");
        }
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public org.bouncycastle.asn1.ASN1Primitive toASN1Primitive() {
        org.bouncycastle.asn1.ASN1EncodableVector aSN1EncodableVector = new org.bouncycastle.asn1.ASN1EncodableVector(3);
        aSN1EncodableVector.add(this.getHighResolutionOutputSizeshNQ4ISI);
        aSN1EncodableVector.add(new org.bouncycastle.asn1.eac.UnsignedInteger(1, getModulus()));
        aSN1EncodableVector.add(new org.bouncycastle.asn1.eac.UnsignedInteger(2, getPublicExponent()));
        return new org.bouncycastle.asn1.DERSequence(aSN1EncodableVector);
    }

    @Override // org.bouncycastle.asn1.eac.PublicKeyDataObject
    public org.bouncycastle.asn1.ASN1ObjectIdentifier getUsage() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public java.math.BigInteger getPublicExponent() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public java.math.BigInteger getModulus() {
        return this.Camera2StreamConfigurationMap;
    }

    public RSAPublicKey(org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier, java.math.BigInteger bigInteger, java.math.BigInteger bigInteger2) {
        this.getInputFormats = 0;
        this.getHighResolutionOutputSizeshNQ4ISI = aSN1ObjectIdentifier;
        this.Camera2StreamConfigurationMap = bigInteger;
        this.getHighSpeedVideoFpsRangesFor = bigInteger2;
    }
}
