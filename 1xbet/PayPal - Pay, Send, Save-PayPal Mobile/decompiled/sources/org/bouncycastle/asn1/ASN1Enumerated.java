package org.bouncycastle.asn1;

/* loaded from: classes17.dex */
public class ASN1Enumerated extends org.bouncycastle.asn1.ASN1Primitive {
    private final byte[] getHighSpeedVideoFpsRangesFor;
    private final int getHighSpeedVideoSizes;
    static final org.bouncycastle.asn1.ASN1UniversalType getHighResolutionOutputSizeshNQ4ISI = new org.bouncycastle.asn1.ASN1UniversalType(org.bouncycastle.asn1.ASN1Enumerated.class) { // from class: org.bouncycastle.asn1.ASN1Enumerated.1
        @Override // org.bouncycastle.asn1.ASN1UniversalType
        final org.bouncycastle.asn1.ASN1Primitive getHighResolutionOutputSizeshNQ4ISI(org.bouncycastle.asn1.DEROctetString dEROctetString) {
            return org.bouncycastle.asn1.ASN1Enumerated.getHighSpeedVideoFpsRanges(dEROctetString.getOctets(), false);
        }
    };
    private static final org.bouncycastle.asn1.ASN1Enumerated[] Camera2StreamConfigurationMap = new org.bouncycastle.asn1.ASN1Enumerated[12];

    @Override // org.bouncycastle.asn1.ASN1Primitive
    final boolean getHighResolutionOutputSizeshNQ4ISI() {
        return false;
    }

    public static org.bouncycastle.asn1.ASN1Enumerated getInstance(java.lang.Object obj) {
        if (obj == null || (obj instanceof org.bouncycastle.asn1.ASN1Enumerated)) {
            return (org.bouncycastle.asn1.ASN1Enumerated) obj;
        }
        if (!(obj instanceof byte[])) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("illegal object in getInstance: ");
            sb.append(obj.getClass().getName());
            throw new java.lang.IllegalArgumentException(sb.toString());
        }
        try {
            return (org.bouncycastle.asn1.ASN1Enumerated) getHighResolutionOutputSizeshNQ4ISI.Camera2StreamConfigurationMap(org.bouncycastle.asn1.ASN1Primitive.fromByteArray((byte[]) obj));
        } catch (java.lang.Exception e) {
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder("encoding error in getInstance: ");
            sb2.append(e.toString());
            throw new java.lang.IllegalArgumentException(sb2.toString());
        }
    }

    public static org.bouncycastle.asn1.ASN1Enumerated getInstance(org.bouncycastle.asn1.ASN1TaggedObject aSN1TaggedObject, boolean z) {
        org.bouncycastle.asn1.ASN1UniversalType aSN1UniversalType = getHighResolutionOutputSizeshNQ4ISI;
        if (128 == aSN1TaggedObject.getTagClass()) {
            return (org.bouncycastle.asn1.ASN1Enumerated) aSN1UniversalType.Camera2StreamConfigurationMap(aSN1TaggedObject.getHighSpeedVideoFpsRangesFor(z, aSN1UniversalType));
        }
        throw new java.lang.IllegalStateException("this method only valid for CONTEXT_SPECIFIC tags");
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    final void getHighSpeedVideoSizes(org.bouncycastle.asn1.ASN1OutputStream aSN1OutputStream, boolean z) throws java.io.IOException {
        byte[] bArr = this.getHighSpeedVideoFpsRangesFor;
        if (z) {
            aSN1OutputStream.getHighSpeedVideoFpsRanges.write(10);
        }
        aSN1OutputStream.getHighSpeedVideoFpsRanges(bArr.length);
        aSN1OutputStream.getHighSpeedVideoFpsRanges.write(bArr, 0, bArr.length);
    }

    public int intValueExact() {
        byte[] bArr = this.getHighSpeedVideoFpsRangesFor;
        int length = bArr.length;
        int i = this.getHighSpeedVideoSizes;
        if (length - i <= 4) {
            return org.bouncycastle.asn1.ASN1Integer.Camera2StreamConfigurationMap(bArr, i, -1);
        }
        throw new java.lang.ArithmeticException("ASN.1 Enumerated out of int range");
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive, org.bouncycastle.asn1.ASN1Object
    public int hashCode() {
        return org.bouncycastle.util.Arrays.hashCode(this.getHighSpeedVideoFpsRangesFor);
    }

    public boolean hasValue(java.math.BigInteger bigInteger) {
        return bigInteger != null && org.bouncycastle.asn1.ASN1Integer.Camera2StreamConfigurationMap(this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoSizes, -1) == bigInteger.intValue() && getValue().equals(bigInteger);
    }

    public boolean hasValue(int i) {
        byte[] bArr = this.getHighSpeedVideoFpsRangesFor;
        int length = bArr.length;
        int i2 = this.getHighSpeedVideoSizes;
        return length - i2 <= 4 && org.bouncycastle.asn1.ASN1Integer.Camera2StreamConfigurationMap(bArr, i2, -1) == i;
    }

    public java.math.BigInteger getValue() {
        return new java.math.BigInteger(this.getHighSpeedVideoFpsRangesFor);
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    final int getHighSpeedVideoSizes(boolean z) {
        return org.bouncycastle.asn1.ASN1OutputStream.getHighSpeedVideoFpsRanges(z, this.getHighSpeedVideoFpsRangesFor.length);
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    final boolean Camera2StreamConfigurationMap(org.bouncycastle.asn1.ASN1Primitive aSN1Primitive) {
        if (aSN1Primitive instanceof org.bouncycastle.asn1.ASN1Enumerated) {
            return org.bouncycastle.util.Arrays.areEqual(this.getHighSpeedVideoFpsRangesFor, ((org.bouncycastle.asn1.ASN1Enumerated) aSN1Primitive).getHighSpeedVideoFpsRangesFor);
        }
        return false;
    }

    static org.bouncycastle.asn1.ASN1Enumerated getHighSpeedVideoFpsRanges(byte[] bArr, boolean z) {
        if (bArr.length > 1) {
            return new org.bouncycastle.asn1.ASN1Enumerated(bArr, z);
        }
        if (bArr.length == 0) {
            throw new java.lang.IllegalArgumentException("ENUMERATED has zero length");
        }
        int i = bArr[0] & 255;
        org.bouncycastle.asn1.ASN1Enumerated[] aSN1EnumeratedArr = Camera2StreamConfigurationMap;
        if (i >= aSN1EnumeratedArr.length) {
            return new org.bouncycastle.asn1.ASN1Enumerated(bArr, z);
        }
        org.bouncycastle.asn1.ASN1Enumerated aSN1Enumerated = aSN1EnumeratedArr[i];
        if (aSN1Enumerated != null) {
            return aSN1Enumerated;
        }
        org.bouncycastle.asn1.ASN1Enumerated aSN1Enumerated2 = new org.bouncycastle.asn1.ASN1Enumerated(bArr, z);
        aSN1EnumeratedArr[i] = aSN1Enumerated2;
        return aSN1Enumerated2;
    }

    private ASN1Enumerated(byte[] bArr, boolean z) {
        if (org.bouncycastle.asn1.ASN1Integer.getHighSpeedVideoFpsRangesFor(bArr)) {
            throw new java.lang.IllegalArgumentException("malformed enumerated");
        }
        if ((bArr[0] & 128) != 0) {
            throw new java.lang.IllegalArgumentException("enumerated must be non-negative");
        }
        this.getHighSpeedVideoFpsRangesFor = z ? org.bouncycastle.util.Arrays.clone(bArr) : bArr;
        this.getHighSpeedVideoSizes = org.bouncycastle.asn1.ASN1Integer.getHighSpeedVideoFpsRanges(bArr);
    }

    public ASN1Enumerated(byte[] bArr) {
        this(bArr, true);
    }

    public ASN1Enumerated(java.math.BigInteger bigInteger) {
        if (bigInteger.signum() < 0) {
            throw new java.lang.IllegalArgumentException("enumerated must be non-negative");
        }
        this.getHighSpeedVideoFpsRangesFor = bigInteger.toByteArray();
        this.getHighSpeedVideoSizes = 0;
    }

    public ASN1Enumerated(int i) {
        if (i < 0) {
            throw new java.lang.IllegalArgumentException("enumerated must be non-negative");
        }
        this.getHighSpeedVideoFpsRangesFor = java.math.BigInteger.valueOf(i).toByteArray();
        this.getHighSpeedVideoSizes = 0;
    }
}
