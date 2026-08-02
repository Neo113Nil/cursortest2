package org.bouncycastle.asn1;

/* loaded from: classes17.dex */
public class ASN1Integer extends org.bouncycastle.asn1.ASN1Primitive {
    static final org.bouncycastle.asn1.ASN1UniversalType getHighSpeedVideoSizes = new org.bouncycastle.asn1.ASN1UniversalType(org.bouncycastle.asn1.ASN1Integer.class) { // from class: org.bouncycastle.asn1.ASN1Integer.1
        @Override // org.bouncycastle.asn1.ASN1UniversalType
        final org.bouncycastle.asn1.ASN1Primitive getHighResolutionOutputSizeshNQ4ISI(org.bouncycastle.asn1.DEROctetString dEROctetString) {
            return org.bouncycastle.asn1.ASN1Integer.getHighResolutionOutputSizeshNQ4ISI(dEROctetString.getOctets());
        }
    };
    private final byte[] Camera2StreamConfigurationMap;
    private final int getHighSpeedVideoFpsRangesFor;

    @Override // org.bouncycastle.asn1.ASN1Primitive
    final boolean getHighResolutionOutputSizeshNQ4ISI() {
        return false;
    }

    public static org.bouncycastle.asn1.ASN1Integer getInstance(java.lang.Object obj) {
        if (obj == null || (obj instanceof org.bouncycastle.asn1.ASN1Integer)) {
            return (org.bouncycastle.asn1.ASN1Integer) obj;
        }
        if (!(obj instanceof byte[])) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("illegal object in getInstance: ");
            sb.append(obj.getClass().getName());
            throw new java.lang.IllegalArgumentException(sb.toString());
        }
        try {
            return (org.bouncycastle.asn1.ASN1Integer) getHighSpeedVideoSizes.Camera2StreamConfigurationMap(org.bouncycastle.asn1.ASN1Primitive.fromByteArray((byte[]) obj));
        } catch (java.lang.Exception e) {
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder("encoding error in getInstance: ");
            sb2.append(e.toString());
            throw new java.lang.IllegalArgumentException(sb2.toString());
        }
    }

    public static org.bouncycastle.asn1.ASN1Integer getInstance(org.bouncycastle.asn1.ASN1TaggedObject aSN1TaggedObject, boolean z) {
        org.bouncycastle.asn1.ASN1UniversalType aSN1UniversalType = getHighSpeedVideoSizes;
        if (128 == aSN1TaggedObject.getTagClass()) {
            return (org.bouncycastle.asn1.ASN1Integer) aSN1UniversalType.Camera2StreamConfigurationMap(aSN1TaggedObject.getHighSpeedVideoFpsRangesFor(z, aSN1UniversalType));
        }
        throw new java.lang.IllegalStateException("this method only valid for CONTEXT_SPECIFIC tags");
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    final void getHighSpeedVideoSizes(org.bouncycastle.asn1.ASN1OutputStream aSN1OutputStream, boolean z) throws java.io.IOException {
        byte[] bArr = this.Camera2StreamConfigurationMap;
        if (z) {
            aSN1OutputStream.getHighSpeedVideoFpsRanges.write(2);
        }
        aSN1OutputStream.getHighSpeedVideoFpsRanges(bArr.length);
        aSN1OutputStream.getHighSpeedVideoFpsRanges.write(bArr, 0, bArr.length);
    }

    public java.lang.String toString() {
        return getValue().toString();
    }

    public long longValueExact() {
        byte[] bArr = this.Camera2StreamConfigurationMap;
        int length = bArr.length;
        int i = this.getHighSpeedVideoFpsRangesFor;
        if (length - i <= 8) {
            return getHighSpeedVideoFpsRanges(bArr, i);
        }
        throw new java.lang.ArithmeticException("ASN.1 Integer out of long range");
    }

    public int intValueExact() {
        byte[] bArr = this.Camera2StreamConfigurationMap;
        int length = bArr.length;
        int i = this.getHighSpeedVideoFpsRangesFor;
        if (length - i <= 4) {
            return Camera2StreamConfigurationMap(bArr, i, -1);
        }
        throw new java.lang.ArithmeticException("ASN.1 Integer out of int range");
    }

    public int intPositiveValueExact() {
        byte[] bArr = this.Camera2StreamConfigurationMap;
        int length = bArr.length;
        int i = this.getHighSpeedVideoFpsRangesFor;
        int i2 = length - i;
        if (i2 > 4 || (i2 == 4 && (bArr[i] & 128) != 0)) {
            throw new java.lang.ArithmeticException("ASN.1 Integer out of positive int range");
        }
        return Camera2StreamConfigurationMap(bArr, i, 255);
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive, org.bouncycastle.asn1.ASN1Object
    public int hashCode() {
        return org.bouncycastle.util.Arrays.hashCode(this.Camera2StreamConfigurationMap);
    }

    public boolean hasValue(java.math.BigInteger bigInteger) {
        return bigInteger != null && Camera2StreamConfigurationMap(this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRangesFor, -1) == bigInteger.intValue() && getValue().equals(bigInteger);
    }

    public boolean hasValue(long j) {
        byte[] bArr = this.Camera2StreamConfigurationMap;
        int length = bArr.length;
        int i = this.getHighSpeedVideoFpsRangesFor;
        return length - i <= 8 && getHighSpeedVideoFpsRanges(bArr, i) == j;
    }

    public boolean hasValue(int i) {
        byte[] bArr = this.Camera2StreamConfigurationMap;
        int length = bArr.length;
        int i2 = this.getHighSpeedVideoFpsRangesFor;
        return length - i2 <= 4 && Camera2StreamConfigurationMap(bArr, i2, -1) == i;
    }

    public java.math.BigInteger getValue() {
        return new java.math.BigInteger(this.Camera2StreamConfigurationMap);
    }

    public java.math.BigInteger getPositiveValue() {
        return new java.math.BigInteger(1, this.Camera2StreamConfigurationMap);
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    final int getHighSpeedVideoSizes(boolean z) {
        return org.bouncycastle.asn1.ASN1OutputStream.getHighSpeedVideoFpsRanges(z, this.Camera2StreamConfigurationMap.length);
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    final boolean Camera2StreamConfigurationMap(org.bouncycastle.asn1.ASN1Primitive aSN1Primitive) {
        if (aSN1Primitive instanceof org.bouncycastle.asn1.ASN1Integer) {
            return org.bouncycastle.util.Arrays.areEqual(this.Camera2StreamConfigurationMap, ((org.bouncycastle.asn1.ASN1Integer) aSN1Primitive).Camera2StreamConfigurationMap);
        }
        return false;
    }

    static int getHighSpeedVideoFpsRanges(byte[] bArr) {
        int length = bArr.length;
        int i = 0;
        while (i < length - 1) {
            int i2 = i + 1;
            if (bArr[i] != (bArr[i2] >> 7)) {
                break;
            }
            i = i2;
        }
        return i;
    }

    private static long getHighSpeedVideoFpsRanges(byte[] bArr, int i) {
        int length = bArr.length;
        int max = java.lang.Math.max(i, length - 8);
        long j = bArr[max];
        while (true) {
            max++;
            if (max >= length) {
                return j;
            }
            j = (j << 8) | (bArr[max] & 255);
        }
    }

    static boolean getHighSpeedVideoFpsRangesFor(byte[] bArr) {
        int length = bArr.length;
        if (length != 0) {
            return (length == 1 || bArr[0] != (bArr[1] >> 7) || org.bouncycastle.util.Properties.isOverrideSet("org.bouncycastle.asn1.allow_unsafe_integer")) ? false : true;
        }
        return true;
    }

    static int Camera2StreamConfigurationMap(byte[] bArr, int i, int i2) {
        int length = bArr.length;
        int max = java.lang.Math.max(i, length - 4);
        int i3 = i2 & bArr[max];
        while (true) {
            max++;
            if (max >= length) {
                return i3;
            }
            i3 = (i3 << 8) | (bArr[max] & 255);
        }
    }

    static org.bouncycastle.asn1.ASN1Integer getHighResolutionOutputSizeshNQ4ISI(byte[] bArr) {
        return new org.bouncycastle.asn1.ASN1Integer(bArr, false);
    }

    private ASN1Integer(byte[] bArr, boolean z) {
        if (getHighSpeedVideoFpsRangesFor(bArr)) {
            throw new java.lang.IllegalArgumentException("malformed integer");
        }
        this.Camera2StreamConfigurationMap = z ? org.bouncycastle.util.Arrays.clone(bArr) : bArr;
        this.getHighSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRanges(bArr);
    }

    public ASN1Integer(byte[] bArr) {
        this(bArr, true);
    }

    public ASN1Integer(java.math.BigInteger bigInteger) {
        this.Camera2StreamConfigurationMap = bigInteger.toByteArray();
        this.getHighSpeedVideoFpsRangesFor = 0;
    }

    public ASN1Integer(long j) {
        this.Camera2StreamConfigurationMap = java.math.BigInteger.valueOf(j).toByteArray();
        this.getHighSpeedVideoFpsRangesFor = 0;
    }
}
