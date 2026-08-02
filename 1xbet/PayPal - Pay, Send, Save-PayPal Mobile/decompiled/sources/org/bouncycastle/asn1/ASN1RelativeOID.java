package org.bouncycastle.asn1;

/* loaded from: classes17.dex */
public class ASN1RelativeOID extends org.bouncycastle.asn1.ASN1Primitive {
    static final org.bouncycastle.asn1.ASN1UniversalType getHighSpeedVideoSizes = new org.bouncycastle.asn1.ASN1UniversalType(org.bouncycastle.asn1.ASN1RelativeOID.class) { // from class: org.bouncycastle.asn1.ASN1RelativeOID.1
        @Override // org.bouncycastle.asn1.ASN1UniversalType
        final org.bouncycastle.asn1.ASN1Primitive getHighResolutionOutputSizeshNQ4ISI(org.bouncycastle.asn1.DEROctetString dEROctetString) {
            return org.bouncycastle.asn1.ASN1RelativeOID.getHighSpeedVideoFpsRangesFor(dEROctetString.getOctets(), false);
        }
    };
    private byte[] getHighResolutionOutputSizeshNQ4ISI;
    private final java.lang.String getHighSpeedVideoFpsRanges;

    @Override // org.bouncycastle.asn1.ASN1Primitive
    final boolean getHighResolutionOutputSizeshNQ4ISI() {
        return false;
    }

    public static org.bouncycastle.asn1.ASN1RelativeOID fromContents(byte[] bArr) {
        return new org.bouncycastle.asn1.ASN1RelativeOID(bArr, true);
    }

    private byte[] getHighSpeedVideoSizes() {
        byte[] bArr;
        synchronized (this) {
            if (this.getHighResolutionOutputSizeshNQ4ISI == null) {
                java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
                org.bouncycastle.asn1.OIDTokenizer oIDTokenizer = new org.bouncycastle.asn1.OIDTokenizer(this.getHighSpeedVideoFpsRanges);
                while (oIDTokenizer.hasMoreTokens()) {
                    java.lang.String nextToken = oIDTokenizer.nextToken();
                    if (nextToken.length() <= 18) {
                        getHighSpeedVideoFpsRanges(byteArrayOutputStream, java.lang.Long.parseLong(nextToken));
                    } else {
                        Camera2StreamConfigurationMap(byteArrayOutputStream, new java.math.BigInteger(nextToken));
                    }
                }
                this.getHighResolutionOutputSizeshNQ4ISI = byteArrayOutputStream.toByteArray();
            }
            bArr = this.getHighResolutionOutputSizeshNQ4ISI;
        }
        return bArr;
    }

    public static org.bouncycastle.asn1.ASN1RelativeOID getInstance(java.lang.Object obj) {
        if (obj == null || (obj instanceof org.bouncycastle.asn1.ASN1RelativeOID)) {
            return (org.bouncycastle.asn1.ASN1RelativeOID) obj;
        }
        if (obj instanceof org.bouncycastle.asn1.ASN1Encodable) {
            org.bouncycastle.asn1.ASN1Primitive aSN1Primitive = ((org.bouncycastle.asn1.ASN1Encodable) obj).toASN1Primitive();
            if (aSN1Primitive instanceof org.bouncycastle.asn1.ASN1RelativeOID) {
                return (org.bouncycastle.asn1.ASN1RelativeOID) aSN1Primitive;
            }
        } else if (obj instanceof byte[]) {
            try {
                return (org.bouncycastle.asn1.ASN1RelativeOID) getHighSpeedVideoSizes.Camera2StreamConfigurationMap(org.bouncycastle.asn1.ASN1Primitive.fromByteArray((byte[]) obj));
            } catch (java.io.IOException e) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("failed to construct relative OID from byte[]: ");
                sb.append(e.getMessage());
                throw new java.lang.IllegalArgumentException(sb.toString());
            }
        }
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder("illegal object in getInstance: ");
        sb2.append(obj.getClass().getName());
        throw new java.lang.IllegalArgumentException(sb2.toString());
    }

    public static org.bouncycastle.asn1.ASN1RelativeOID getInstance(org.bouncycastle.asn1.ASN1TaggedObject aSN1TaggedObject, boolean z) {
        org.bouncycastle.asn1.ASN1UniversalType aSN1UniversalType = getHighSpeedVideoSizes;
        if (128 == aSN1TaggedObject.getTagClass()) {
            return (org.bouncycastle.asn1.ASN1RelativeOID) aSN1UniversalType.Camera2StreamConfigurationMap(aSN1TaggedObject.getHighSpeedVideoFpsRangesFor(z, aSN1UniversalType));
        }
        throw new java.lang.IllegalStateException("this method only valid for CONTEXT_SPECIFIC tags");
    }

    public java.lang.String toString() {
        return getId();
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive, org.bouncycastle.asn1.ASN1Object
    public int hashCode() {
        return this.getHighSpeedVideoFpsRanges.hashCode();
    }

    public java.lang.String getId() {
        return this.getHighSpeedVideoFpsRanges;
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    final int getHighSpeedVideoSizes(boolean z) {
        return org.bouncycastle.asn1.ASN1OutputStream.getHighSpeedVideoFpsRanges(z, getHighSpeedVideoSizes().length);
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    final void getHighSpeedVideoSizes(org.bouncycastle.asn1.ASN1OutputStream aSN1OutputStream, boolean z) throws java.io.IOException {
        aSN1OutputStream.getHighResolutionOutputSizeshNQ4ISI(z, 13, getHighSpeedVideoSizes());
    }

    public org.bouncycastle.asn1.ASN1RelativeOID branch(java.lang.String str) {
        return new org.bouncycastle.asn1.ASN1RelativeOID(this, str);
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    final boolean Camera2StreamConfigurationMap(org.bouncycastle.asn1.ASN1Primitive aSN1Primitive) {
        if (this == aSN1Primitive) {
            return true;
        }
        if (aSN1Primitive instanceof org.bouncycastle.asn1.ASN1RelativeOID) {
            return this.getHighSpeedVideoFpsRanges.equals(((org.bouncycastle.asn1.ASN1RelativeOID) aSN1Primitive).getHighSpeedVideoFpsRanges);
        }
        return false;
    }

    static void Camera2StreamConfigurationMap(java.io.ByteArrayOutputStream byteArrayOutputStream, java.math.BigInteger bigInteger) {
        int bitLength = (bigInteger.bitLength() + 6) / 7;
        if (bitLength == 0) {
            byteArrayOutputStream.write(0);
            return;
        }
        byte[] bArr = new byte[bitLength];
        int i = bitLength - 1;
        for (int i2 = i; i2 >= 0; i2--) {
            bArr[i2] = (byte) (bigInteger.intValue() | 128);
            bigInteger = bigInteger.shiftRight(7);
        }
        bArr[i] = (byte) (bArr[i] & Byte.MAX_VALUE);
        byteArrayOutputStream.write(bArr, 0, bitLength);
    }

    static void getHighSpeedVideoFpsRanges(java.io.ByteArrayOutputStream byteArrayOutputStream, long j) {
        byte[] bArr = new byte[9];
        int i = 8;
        bArr[8] = (byte) (((int) j) & 127);
        while (j >= 128) {
            j >>= 7;
            i--;
            bArr[i] = (byte) (((int) j) | 128);
        }
        byteArrayOutputStream.write(bArr, i, 9 - i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x002c, code lost:
    
        return false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static boolean getHighSpeedVideoFpsRangesFor(java.lang.String str, int i) {
        int length = str.length();
        int i2 = 0;
        while (true) {
            int i3 = length - 1;
            if (i3 < i) {
                return i2 != 0 && (i2 <= 1 || str.charAt(length) != '0');
            }
            char charAt = str.charAt(i3);
            if (charAt == '.') {
                if (i2 == 0 || (i2 > 1 && str.charAt(length) == '0')) {
                    break;
                }
                i2 = 0;
            } else {
                if ('0' > charAt || charAt > '9') {
                    break;
                }
                i2++;
            }
            length = i3;
        }
        return false;
    }

    static org.bouncycastle.asn1.ASN1RelativeOID getHighSpeedVideoFpsRangesFor(byte[] bArr, boolean z) {
        return new org.bouncycastle.asn1.ASN1RelativeOID(bArr, false);
    }

    private ASN1RelativeOID(byte[] bArr, boolean z) {
        byte[] bArr2 = bArr;
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        boolean z2 = true;
        long j = 0;
        java.math.BigInteger bigInteger = null;
        for (int i = 0; i != bArr2.length; i++) {
            byte b = bArr2[i];
            if (j <= 72057594037927808L) {
                long j2 = j + (b & Byte.MAX_VALUE);
                if ((b & 128) == 0) {
                    if (z2) {
                        z2 = false;
                    } else {
                        stringBuffer.append(com.paypal.oslo.core.money.MoneyKt.DECIMALSEPARATOR);
                    }
                    stringBuffer.append(j2);
                    j = 0;
                } else {
                    j = j2 << 7;
                }
            } else {
                java.math.BigInteger or = (bigInteger == null ? java.math.BigInteger.valueOf(j) : bigInteger).or(java.math.BigInteger.valueOf(b & Byte.MAX_VALUE));
                if ((b & 128) == 0) {
                    if (z2) {
                        z2 = false;
                    } else {
                        stringBuffer.append(com.paypal.oslo.core.money.MoneyKt.DECIMALSEPARATOR);
                    }
                    stringBuffer.append(or);
                    bigInteger = null;
                    j = 0;
                } else {
                    bigInteger = or.shiftLeft(7);
                }
            }
        }
        this.getHighSpeedVideoFpsRanges = stringBuffer.toString();
        this.getHighResolutionOutputSizeshNQ4ISI = z ? org.bouncycastle.util.Arrays.clone(bArr) : bArr2;
    }

    private ASN1RelativeOID(org.bouncycastle.asn1.ASN1RelativeOID aSN1RelativeOID, java.lang.String str) {
        if (!getHighSpeedVideoFpsRangesFor(str, 0)) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("string ");
            sb.append(str);
            sb.append(" not a valid OID branch");
            throw new java.lang.IllegalArgumentException(sb.toString());
        }
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        sb2.append(aSN1RelativeOID.getId());
        sb2.append(".");
        sb2.append(str);
        this.getHighSpeedVideoFpsRanges = sb2.toString();
    }

    public ASN1RelativeOID(java.lang.String str) {
        if (str == null) {
            throw new java.lang.NullPointerException("'identifier' cannot be null");
        }
        if (getHighSpeedVideoFpsRangesFor(str, 0)) {
            this.getHighSpeedVideoFpsRanges = str;
            return;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("string ");
        sb.append(str);
        sb.append(" not a relative OID");
        throw new java.lang.IllegalArgumentException(sb.toString());
    }
}
