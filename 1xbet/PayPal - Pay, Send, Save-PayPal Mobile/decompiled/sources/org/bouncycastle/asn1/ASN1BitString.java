package org.bouncycastle.asn1;

/* loaded from: classes17.dex */
public abstract class ASN1BitString extends org.bouncycastle.asn1.ASN1Primitive implements org.bouncycastle.asn1.ASN1String, org.bouncycastle.asn1.ASN1BitStringParser {
    final byte[] getHighSpeedVideoSizes;
    static final org.bouncycastle.asn1.ASN1UniversalType getHighSpeedVideoFpsRangesFor = new org.bouncycastle.asn1.ASN1UniversalType(org.bouncycastle.asn1.ASN1BitString.class) { // from class: org.bouncycastle.asn1.ASN1BitString.1
        @Override // org.bouncycastle.asn1.ASN1UniversalType
        final org.bouncycastle.asn1.ASN1Primitive getHighResolutionOutputSizeshNQ4ISI(org.bouncycastle.asn1.DEROctetString dEROctetString) {
            return org.bouncycastle.asn1.ASN1BitString.getHighSpeedVideoFpsRanges(dEROctetString.getOctets());
        }

        @Override // org.bouncycastle.asn1.ASN1UniversalType
        final org.bouncycastle.asn1.ASN1Primitive getHighResolutionOutputSizeshNQ4ISI(org.bouncycastle.asn1.ASN1Sequence aSN1Sequence) {
            return aSN1Sequence.getHighSpeedVideoSizesFor();
        }
    };
    private static final char[] getHighSpeedVideoFpsRanges = {com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    protected static int getPadBits(int i) {
        int i2;
        int i3 = 3;
        while (true) {
            if (i3 < 0) {
                i2 = 0;
                break;
            }
            if (i3 != 0) {
                int i4 = i >> (i3 * 8);
                if (i4 != 0) {
                    i2 = i4 & 255;
                    break;
                }
                i3--;
            } else {
                if (i != 0) {
                    i2 = i & 255;
                    break;
                }
                i3--;
            }
        }
        if (i2 == 0) {
            return 0;
        }
        int i5 = 1;
        while (true) {
            i2 <<= 1;
            if ((i2 & 255) == 0) {
                return 8 - i5;
            }
            i5++;
        }
    }

    public org.bouncycastle.asn1.ASN1BitStringParser parser() {
        return this;
    }

    public static org.bouncycastle.asn1.ASN1BitString getInstance(java.lang.Object obj) {
        if (obj == null || (obj instanceof org.bouncycastle.asn1.ASN1BitString)) {
            return (org.bouncycastle.asn1.ASN1BitString) obj;
        }
        if (obj instanceof org.bouncycastle.asn1.ASN1Encodable) {
            org.bouncycastle.asn1.ASN1Primitive aSN1Primitive = ((org.bouncycastle.asn1.ASN1Encodable) obj).toASN1Primitive();
            if (aSN1Primitive instanceof org.bouncycastle.asn1.ASN1BitString) {
                return (org.bouncycastle.asn1.ASN1BitString) aSN1Primitive;
            }
        } else if (obj instanceof byte[]) {
            try {
                return (org.bouncycastle.asn1.ASN1BitString) getHighSpeedVideoFpsRangesFor.Camera2StreamConfigurationMap(org.bouncycastle.asn1.ASN1Primitive.fromByteArray((byte[]) obj));
            } catch (java.io.IOException e) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("failed to construct BIT STRING from byte[]: ");
                sb.append(e.getMessage());
                throw new java.lang.IllegalArgumentException(sb.toString());
            }
        }
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder("illegal object in getInstance: ");
        sb2.append(obj.getClass().getName());
        throw new java.lang.IllegalArgumentException(sb2.toString());
    }

    public static org.bouncycastle.asn1.ASN1BitString getInstance(org.bouncycastle.asn1.ASN1TaggedObject aSN1TaggedObject, boolean z) {
        org.bouncycastle.asn1.ASN1UniversalType aSN1UniversalType = getHighSpeedVideoFpsRangesFor;
        if (128 == aSN1TaggedObject.getTagClass()) {
            return (org.bouncycastle.asn1.ASN1BitString) aSN1UniversalType.Camera2StreamConfigurationMap(aSN1TaggedObject.getHighSpeedVideoFpsRangesFor(z, aSN1UniversalType));
        }
        throw new java.lang.IllegalStateException("this method only valid for CONTEXT_SPECIFIC tags");
    }

    public java.lang.String toString() {
        return getString();
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    org.bouncycastle.asn1.ASN1Primitive Camera2StreamConfigurationMap() {
        return new org.bouncycastle.asn1.DLBitString(this.getHighSpeedVideoSizes, (byte) 0);
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    org.bouncycastle.asn1.ASN1Primitive getHighSpeedVideoFpsRangesFor() {
        return new org.bouncycastle.asn1.DERBitString(this.getHighSpeedVideoSizes, false);
    }

    public int intValue() {
        int min = java.lang.Math.min(5, this.getHighSpeedVideoSizes.length - 1);
        int i = 0;
        for (int i2 = 1; i2 < min; i2++) {
            i |= (255 & this.getHighSpeedVideoSizes[i2]) << ((i2 - 1) * 8);
        }
        if (min <= 0 || min >= 5) {
            return i;
        }
        byte[] bArr = this.getHighSpeedVideoSizes;
        return ((((byte) (bArr[min] & (255 << (bArr[0] & 255)))) & 255) << ((min - 1) * 8)) | i;
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive, org.bouncycastle.asn1.ASN1Object
    public int hashCode() {
        byte[] bArr = this.getHighSpeedVideoSizes;
        if (bArr.length < 2) {
            return 1;
        }
        byte b = bArr[0];
        int length = bArr.length - 1;
        return (org.bouncycastle.util.Arrays.hashCode(bArr, 0, length) * 257) ^ ((byte) ((255 << (b & 255)) & bArr[length]));
    }

    @Override // org.bouncycastle.asn1.ASN1String
    public java.lang.String getString() {
        try {
            byte[] encoded = getEncoded();
            java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer((encoded.length * 2) + 1);
            stringBuffer.append('#');
            for (int i = 0; i != encoded.length; i++) {
                byte b = encoded[i];
                char[] cArr = getHighSpeedVideoFpsRanges;
                stringBuffer.append(cArr[(b >>> 4) & 15]);
                stringBuffer.append(cArr[b & com.google.common.base.Ascii.SI]);
            }
            return stringBuffer.toString();
        } catch (java.io.IOException e) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Internal error encoding BitString: ");
            sb.append(e.getMessage());
            throw new org.bouncycastle.asn1.ASN1ParsingException(sb.toString(), e);
        }
    }

    @Override // org.bouncycastle.asn1.ASN1BitStringParser
    public int getPadBits() {
        return this.getHighSpeedVideoSizes[0] & 255;
    }

    public byte[] getOctets() {
        byte[] bArr = this.getHighSpeedVideoSizes;
        if (bArr[0] == 0) {
            return org.bouncycastle.util.Arrays.copyOfRange(bArr, 1, bArr.length);
        }
        throw new java.lang.IllegalStateException("attempt to get non-octet aligned data from BIT STRING");
    }

    @Override // org.bouncycastle.asn1.ASN1BitStringParser
    public java.io.InputStream getOctetStream() throws java.io.IOException {
        int i = this.getHighSpeedVideoSizes[0] & 255;
        if (i == 0) {
            return getBitStream();
        }
        throw new java.io.IOException("expected octet-aligned bitstring, but found padBits: ".concat(java.lang.String.valueOf(i)));
    }

    @Override // org.bouncycastle.asn1.InMemoryRepresentable
    public org.bouncycastle.asn1.ASN1Primitive getLoadedObject() {
        return toASN1Primitive();
    }

    public byte[] getBytes() {
        byte[] bArr = this.getHighSpeedVideoSizes;
        if (bArr.length == 1) {
            return org.bouncycastle.asn1.ASN1OctetString.getHighSpeedVideoSizes;
        }
        byte b = bArr[0];
        byte[] copyOfRange = org.bouncycastle.util.Arrays.copyOfRange(bArr, 1, bArr.length);
        int length = copyOfRange.length - 1;
        copyOfRange[length] = (byte) (((byte) (255 << (b & 255))) & copyOfRange[length]);
        return copyOfRange;
    }

    @Override // org.bouncycastle.asn1.ASN1BitStringParser
    public java.io.InputStream getBitStream() throws java.io.IOException {
        byte[] bArr = this.getHighSpeedVideoSizes;
        return new java.io.ByteArrayInputStream(bArr, 1, bArr.length - 1);
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    final boolean Camera2StreamConfigurationMap(org.bouncycastle.asn1.ASN1Primitive aSN1Primitive) {
        if (!(aSN1Primitive instanceof org.bouncycastle.asn1.ASN1BitString)) {
            return false;
        }
        byte[] bArr = this.getHighSpeedVideoSizes;
        byte[] bArr2 = ((org.bouncycastle.asn1.ASN1BitString) aSN1Primitive).getHighSpeedVideoSizes;
        int length = bArr.length;
        if (bArr2.length != length) {
            return false;
        }
        if (length == 1) {
            return true;
        }
        int i = length - 1;
        for (int i2 = 0; i2 < i; i2++) {
            if (bArr[i2] != bArr2[i2]) {
                return false;
            }
        }
        int i3 = 255 << (bArr[0] & 255);
        return ((byte) (bArr[i] & i3)) == ((byte) (bArr2[i] & i3));
    }

    protected static byte[] getBytes(int i) {
        if (i == 0) {
            return new byte[0];
        }
        int i2 = 4;
        for (int i3 = 3; i3 > 0 && ((255 << (i3 * 8)) & i) == 0; i3--) {
            i2--;
        }
        byte[] bArr = new byte[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            bArr[i4] = (byte) ((i >> (i4 * 8)) & 255);
        }
        return bArr;
    }

    static org.bouncycastle.asn1.ASN1BitString getHighSpeedVideoFpsRanges(byte[] bArr) {
        int length = bArr.length;
        if (length <= 0) {
            throw new java.lang.IllegalArgumentException("truncated BIT STRING detected");
        }
        int i = bArr[0] & 255;
        if (i > 0) {
            if (i > 7 || length < 2) {
                throw new java.lang.IllegalArgumentException("invalid pad bits detected");
            }
            byte b = bArr[length - 1];
            if (b != ((byte) ((255 << i) & b))) {
                return new org.bouncycastle.asn1.DLBitString(bArr, (byte) 0);
            }
        }
        return new org.bouncycastle.asn1.DERBitString(bArr, false);
    }

    ASN1BitString(byte[] bArr, boolean z) {
        if (z) {
            if (bArr == null) {
                throw new java.lang.NullPointerException("'contents' cannot be null");
            }
            if (bArr.length <= 0) {
                throw new java.lang.IllegalArgumentException("'contents' cannot be empty");
            }
            int i = bArr[0] & 255;
            if (i > 0) {
                if (bArr.length < 2) {
                    throw new java.lang.IllegalArgumentException("zero length data with non-zero pad bits");
                }
                if (i > 7) {
                    throw new java.lang.IllegalArgumentException("pad bits cannot be greater than 7 or less than 0");
                }
            }
        }
        this.getHighSpeedVideoSizes = bArr;
    }

    ASN1BitString(byte[] bArr, int i) {
        if (bArr == null) {
            throw new java.lang.NullPointerException("'data' cannot be null");
        }
        if (bArr.length == 0 && i != 0) {
            throw new java.lang.IllegalArgumentException("zero length data with non-zero pad bits");
        }
        if (i > 7 || i < 0) {
            throw new java.lang.IllegalArgumentException("pad bits cannot be greater than 7 or less than 0");
        }
        this.getHighSpeedVideoSizes = org.bouncycastle.util.Arrays.prepend(bArr, (byte) i);
    }

    ASN1BitString(byte b, int i) {
        if (i > 7 || i < 0) {
            throw new java.lang.IllegalArgumentException("pad bits cannot be greater than 7 or less than 0");
        }
        this.getHighSpeedVideoSizes = new byte[]{(byte) i, b};
    }
}
