package org.bouncycastle.asn1.eac;

/* loaded from: classes17.dex */
public class ECDSAPublicKey extends org.bouncycastle.asn1.eac.PublicKeyDataObject {
    private java.math.BigInteger Camera2StreamConfigurationMap;
    private java.math.BigInteger getHighResolutionOutputSizeshNQ4ISI;
    private byte[] getHighSpeedVideoFpsRanges;
    private int getHighSpeedVideoFpsRangesFor;
    private java.math.BigInteger getHighSpeedVideoSizes;
    private org.bouncycastle.asn1.ASN1ObjectIdentifier getInputFormats;
    private byte[] getInputSizeshNQ4ISI;
    private java.math.BigInteger getOutputFormats;
    private java.math.BigInteger getOutputMinFrameDuration;

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public org.bouncycastle.asn1.ASN1Primitive toASN1Primitive() {
        return new org.bouncycastle.asn1.DERSequence(getASN1EncodableVector(this.getInputFormats, !hasParameters()));
    }

    public boolean hasParameters() {
        return this.getOutputFormats != null;
    }

    @Override // org.bouncycastle.asn1.eac.PublicKeyDataObject
    public org.bouncycastle.asn1.ASN1ObjectIdentifier getUsage() {
        return this.getInputFormats;
    }

    public java.math.BigInteger getSecondCoefB() {
        if ((this.getHighSpeedVideoFpsRangesFor & 4) != 0) {
            return this.getOutputMinFrameDuration;
        }
        return null;
    }

    public byte[] getPublicPointY() {
        if ((this.getHighSpeedVideoFpsRangesFor & 32) != 0) {
            return org.bouncycastle.util.Arrays.clone(this.getInputSizeshNQ4ISI);
        }
        return null;
    }

    public java.math.BigInteger getPrimeModulusP() {
        if ((this.getHighSpeedVideoFpsRangesFor & 1) != 0) {
            return this.getOutputFormats;
        }
        return null;
    }

    public java.math.BigInteger getOrderOfBasePointR() {
        if ((this.getHighSpeedVideoFpsRangesFor & 16) != 0) {
            return this.getHighResolutionOutputSizeshNQ4ISI;
        }
        return null;
    }

    public java.math.BigInteger getFirstCoefA() {
        if ((this.getHighSpeedVideoFpsRangesFor & 2) != 0) {
            return this.getHighSpeedVideoSizes;
        }
        return null;
    }

    public java.math.BigInteger getCofactorF() {
        if ((this.getHighSpeedVideoFpsRangesFor & 64) != 0) {
            return this.Camera2StreamConfigurationMap;
        }
        return null;
    }

    public byte[] getBasePointG() {
        if ((this.getHighSpeedVideoFpsRangesFor & 8) != 0) {
            return org.bouncycastle.util.Arrays.clone(this.getHighSpeedVideoFpsRanges);
        }
        return null;
    }

    public org.bouncycastle.asn1.ASN1EncodableVector getASN1EncodableVector(org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier, boolean z) {
        org.bouncycastle.asn1.ASN1EncodableVector aSN1EncodableVector = new org.bouncycastle.asn1.ASN1EncodableVector(8);
        aSN1EncodableVector.add(aSN1ObjectIdentifier);
        if (!z) {
            aSN1EncodableVector.add(new org.bouncycastle.asn1.eac.UnsignedInteger(1, getPrimeModulusP()));
            aSN1EncodableVector.add(new org.bouncycastle.asn1.eac.UnsignedInteger(2, getFirstCoefA()));
            aSN1EncodableVector.add(new org.bouncycastle.asn1.eac.UnsignedInteger(3, getSecondCoefB()));
            aSN1EncodableVector.add(new org.bouncycastle.asn1.DERTaggedObject(false, 4, (org.bouncycastle.asn1.ASN1Encodable) new org.bouncycastle.asn1.DEROctetString(getBasePointG())));
            aSN1EncodableVector.add(new org.bouncycastle.asn1.eac.UnsignedInteger(5, getOrderOfBasePointR()));
        }
        aSN1EncodableVector.add(new org.bouncycastle.asn1.DERTaggedObject(false, 6, (org.bouncycastle.asn1.ASN1Encodable) new org.bouncycastle.asn1.DEROctetString(getPublicPointY())));
        if (!z) {
            aSN1EncodableVector.add(new org.bouncycastle.asn1.eac.UnsignedInteger(7, getCofactorF()));
        }
        return aSN1EncodableVector;
    }

    private void Camera2StreamConfigurationMap(java.math.BigInteger bigInteger) throws java.lang.IllegalArgumentException {
        int i = this.getHighSpeedVideoFpsRangesFor;
        if ((i & 4) != 0) {
            throw new java.lang.IllegalArgumentException("Second Coef B already set");
        }
        this.getHighSpeedVideoFpsRangesFor = i | 4;
        this.getOutputMinFrameDuration = bigInteger;
    }

    private void getHighSpeedVideoSizes(org.bouncycastle.asn1.ASN1OctetString aSN1OctetString) throws java.lang.IllegalArgumentException {
        int i = this.getHighSpeedVideoFpsRangesFor;
        if ((i & 32) != 0) {
            throw new java.lang.IllegalArgumentException("Public Point Y already set");
        }
        this.getHighSpeedVideoFpsRangesFor = i | 32;
        this.getInputSizeshNQ4ISI = aSN1OctetString.getOctets();
    }

    private void getHighSpeedVideoSizes(java.math.BigInteger bigInteger) {
        int i = this.getHighSpeedVideoFpsRangesFor;
        if ((i & 1) != 0) {
            throw new java.lang.IllegalArgumentException("Prime Modulus P already set");
        }
        this.getHighSpeedVideoFpsRangesFor = i | 1;
        this.getOutputFormats = bigInteger;
    }

    private void getHighSpeedVideoFpsRanges(java.math.BigInteger bigInteger) throws java.lang.IllegalArgumentException {
        int i = this.getHighSpeedVideoFpsRangesFor;
        if ((i & 16) != 0) {
            throw new java.lang.IllegalArgumentException("Order of base point R already set");
        }
        this.getHighSpeedVideoFpsRangesFor = i | 16;
        this.getHighResolutionOutputSizeshNQ4ISI = bigInteger;
    }

    private void getHighSpeedVideoFpsRangesFor(java.math.BigInteger bigInteger) throws java.lang.IllegalArgumentException {
        int i = this.getHighSpeedVideoFpsRangesFor;
        if ((i & 2) != 0) {
            throw new java.lang.IllegalArgumentException("First Coef A already set");
        }
        this.getHighSpeedVideoFpsRangesFor = i | 2;
        this.getHighSpeedVideoSizes = bigInteger;
    }

    private void getHighResolutionOutputSizeshNQ4ISI(java.math.BigInteger bigInteger) throws java.lang.IllegalArgumentException {
        int i = this.getHighSpeedVideoFpsRangesFor;
        if ((i & 64) != 0) {
            throw new java.lang.IllegalArgumentException("Cofactor F already set");
        }
        this.getHighSpeedVideoFpsRangesFor = i | 64;
        this.Camera2StreamConfigurationMap = bigInteger;
    }

    private void getHighSpeedVideoFpsRangesFor(org.bouncycastle.asn1.ASN1OctetString aSN1OctetString) throws java.lang.IllegalArgumentException {
        int i = this.getHighSpeedVideoFpsRangesFor;
        if ((i & 8) != 0) {
            throw new java.lang.IllegalArgumentException("Base Point G already set");
        }
        this.getHighSpeedVideoFpsRangesFor = i | 8;
        this.getHighSpeedVideoFpsRanges = aSN1OctetString.getOctets();
    }

    ECDSAPublicKey(org.bouncycastle.asn1.ASN1Sequence aSN1Sequence) throws java.lang.IllegalArgumentException {
        java.util.Enumeration objects = aSN1Sequence.getObjects();
        this.getInputFormats = org.bouncycastle.asn1.ASN1ObjectIdentifier.getInstance(objects.nextElement());
        this.getHighSpeedVideoFpsRangesFor = 0;
        while (objects.hasMoreElements()) {
            java.lang.Object nextElement = objects.nextElement();
            if (!(nextElement instanceof org.bouncycastle.asn1.ASN1TaggedObject)) {
                throw new java.lang.IllegalArgumentException("Unknown Object Identifier!");
            }
            org.bouncycastle.asn1.ASN1TaggedObject aSN1TaggedObject = (org.bouncycastle.asn1.ASN1TaggedObject) nextElement;
            switch (aSN1TaggedObject.getTagNo()) {
                case 1:
                    getHighSpeedVideoSizes(org.bouncycastle.asn1.eac.UnsignedInteger.getInstance(aSN1TaggedObject).getValue());
                    break;
                case 2:
                    getHighSpeedVideoFpsRangesFor(org.bouncycastle.asn1.eac.UnsignedInteger.getInstance(aSN1TaggedObject).getValue());
                    break;
                case 3:
                    Camera2StreamConfigurationMap(org.bouncycastle.asn1.eac.UnsignedInteger.getInstance(aSN1TaggedObject).getValue());
                    break;
                case 4:
                    getHighSpeedVideoFpsRangesFor(org.bouncycastle.asn1.ASN1OctetString.getInstance(aSN1TaggedObject, false));
                    break;
                case 5:
                    getHighSpeedVideoFpsRanges(org.bouncycastle.asn1.eac.UnsignedInteger.getInstance(aSN1TaggedObject).getValue());
                    break;
                case 6:
                    getHighSpeedVideoSizes(org.bouncycastle.asn1.ASN1OctetString.getInstance(aSN1TaggedObject, false));
                    break;
                case 7:
                    getHighResolutionOutputSizeshNQ4ISI(org.bouncycastle.asn1.eac.UnsignedInteger.getInstance(aSN1TaggedObject).getValue());
                    break;
                default:
                    this.getHighSpeedVideoFpsRangesFor = 0;
                    throw new java.lang.IllegalArgumentException("Unknown Object Identifier!");
            }
        }
        int i = this.getHighSpeedVideoFpsRangesFor;
        if (i != 32 && i != 127) {
            throw new java.lang.IllegalArgumentException("All options must be either present or absent!");
        }
    }

    public ECDSAPublicKey(org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier, byte[] bArr) throws java.lang.IllegalArgumentException {
        this.getInputFormats = aSN1ObjectIdentifier;
        getHighSpeedVideoSizes(new org.bouncycastle.asn1.DEROctetString(bArr));
    }

    public ECDSAPublicKey(org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier, java.math.BigInteger bigInteger, java.math.BigInteger bigInteger2, java.math.BigInteger bigInteger3, byte[] bArr, java.math.BigInteger bigInteger4, byte[] bArr2, int i) {
        this.getInputFormats = aSN1ObjectIdentifier;
        getHighSpeedVideoSizes(bigInteger);
        getHighSpeedVideoFpsRangesFor(bigInteger2);
        Camera2StreamConfigurationMap(bigInteger3);
        getHighSpeedVideoFpsRangesFor(new org.bouncycastle.asn1.DEROctetString(bArr));
        getHighSpeedVideoFpsRanges(bigInteger4);
        getHighSpeedVideoSizes(new org.bouncycastle.asn1.DEROctetString(bArr2));
        getHighResolutionOutputSizeshNQ4ISI(java.math.BigInteger.valueOf(i));
    }
}
