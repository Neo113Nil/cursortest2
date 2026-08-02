package org.bouncycastle.asn1;

/* loaded from: classes17.dex */
public abstract class ASN1BMPString extends org.bouncycastle.asn1.ASN1Primitive implements org.bouncycastle.asn1.ASN1String {
    static final org.bouncycastle.asn1.ASN1UniversalType getHighResolutionOutputSizeshNQ4ISI = new org.bouncycastle.asn1.ASN1UniversalType(org.bouncycastle.asn1.ASN1BMPString.class) { // from class: org.bouncycastle.asn1.ASN1BMPString.1
        @Override // org.bouncycastle.asn1.ASN1UniversalType
        final org.bouncycastle.asn1.ASN1Primitive getHighResolutionOutputSizeshNQ4ISI(org.bouncycastle.asn1.DEROctetString dEROctetString) {
            return org.bouncycastle.asn1.ASN1BMPString.getHighSpeedVideoSizes(dEROctetString.getOctets());
        }
    };
    final char[] getHighSpeedVideoFpsRangesFor;

    @Override // org.bouncycastle.asn1.ASN1Primitive
    final boolean getHighResolutionOutputSizeshNQ4ISI() {
        return false;
    }

    public static org.bouncycastle.asn1.ASN1BMPString getInstance(java.lang.Object obj) {
        if (obj == null || (obj instanceof org.bouncycastle.asn1.ASN1BMPString)) {
            return (org.bouncycastle.asn1.ASN1BMPString) obj;
        }
        if (obj instanceof org.bouncycastle.asn1.ASN1Encodable) {
            org.bouncycastle.asn1.ASN1Primitive aSN1Primitive = ((org.bouncycastle.asn1.ASN1Encodable) obj).toASN1Primitive();
            if (aSN1Primitive instanceof org.bouncycastle.asn1.ASN1BMPString) {
                return (org.bouncycastle.asn1.ASN1BMPString) aSN1Primitive;
            }
        }
        if (!(obj instanceof byte[])) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("illegal object in getInstance: ");
            sb.append(obj.getClass().getName());
            throw new java.lang.IllegalArgumentException(sb.toString());
        }
        try {
            return (org.bouncycastle.asn1.ASN1BMPString) getHighResolutionOutputSizeshNQ4ISI.Camera2StreamConfigurationMap(org.bouncycastle.asn1.ASN1Primitive.fromByteArray((byte[]) obj));
        } catch (java.lang.Exception e) {
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder("encoding error in getInstance: ");
            sb2.append(e.toString());
            throw new java.lang.IllegalArgumentException(sb2.toString());
        }
    }

    public static org.bouncycastle.asn1.ASN1BMPString getInstance(org.bouncycastle.asn1.ASN1TaggedObject aSN1TaggedObject, boolean z) {
        org.bouncycastle.asn1.ASN1UniversalType aSN1UniversalType = getHighResolutionOutputSizeshNQ4ISI;
        if (128 == aSN1TaggedObject.getTagClass()) {
            return (org.bouncycastle.asn1.ASN1BMPString) aSN1UniversalType.Camera2StreamConfigurationMap(aSN1TaggedObject.getHighSpeedVideoFpsRangesFor(z, aSN1UniversalType));
        }
        throw new java.lang.IllegalStateException("this method only valid for CONTEXT_SPECIFIC tags");
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    final void getHighSpeedVideoSizes(org.bouncycastle.asn1.ASN1OutputStream aSN1OutputStream, boolean z) throws java.io.IOException {
        int length = this.getHighSpeedVideoFpsRangesFor.length;
        if (z) {
            aSN1OutputStream.getHighSpeedVideoFpsRanges.write(30);
        }
        aSN1OutputStream.getHighSpeedVideoFpsRanges(length * 2);
        byte[] bArr = new byte[8];
        int i = 0;
        while (i < (length & (-4))) {
            char[] cArr = this.getHighSpeedVideoFpsRangesFor;
            char c = cArr[i];
            char c2 = cArr[i + 1];
            char c3 = cArr[i + 2];
            char c4 = cArr[i + 3];
            i += 4;
            bArr[0] = (byte) (c >> '\b');
            bArr[1] = (byte) c;
            bArr[2] = (byte) (c2 >> '\b');
            bArr[3] = (byte) c2;
            bArr[4] = (byte) (c3 >> '\b');
            bArr[5] = (byte) c3;
            bArr[6] = (byte) (c4 >> '\b');
            bArr[7] = (byte) c4;
            aSN1OutputStream.getHighSpeedVideoFpsRanges.write(bArr, 0, 8);
        }
        if (i >= length) {
            return;
        }
        int i2 = 0;
        while (true) {
            char c5 = this.getHighSpeedVideoFpsRangesFor[i];
            i++;
            bArr[i2] = (byte) (c5 >> '\b');
            int i3 = i2 + 2;
            bArr[i2 + 1] = (byte) c5;
            if (i >= length) {
                aSN1OutputStream.getHighSpeedVideoFpsRanges.write(bArr, 0, i3);
                return;
            }
            i2 = i3;
        }
    }

    public java.lang.String toString() {
        return getString();
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive, org.bouncycastle.asn1.ASN1Object
    public final int hashCode() {
        return org.bouncycastle.util.Arrays.hashCode(this.getHighSpeedVideoFpsRangesFor);
    }

    @Override // org.bouncycastle.asn1.ASN1String
    public final java.lang.String getString() {
        return new java.lang.String(this.getHighSpeedVideoFpsRangesFor);
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    final int getHighSpeedVideoSizes(boolean z) {
        return org.bouncycastle.asn1.ASN1OutputStream.getHighSpeedVideoFpsRanges(z, this.getHighSpeedVideoFpsRangesFor.length * 2);
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    final boolean Camera2StreamConfigurationMap(org.bouncycastle.asn1.ASN1Primitive aSN1Primitive) {
        if (aSN1Primitive instanceof org.bouncycastle.asn1.ASN1BMPString) {
            return org.bouncycastle.util.Arrays.areEqual(this.getHighSpeedVideoFpsRangesFor, ((org.bouncycastle.asn1.ASN1BMPString) aSN1Primitive).getHighSpeedVideoFpsRangesFor);
        }
        return false;
    }

    static org.bouncycastle.asn1.ASN1BMPString getHighResolutionOutputSizeshNQ4ISI(char[] cArr) {
        return new org.bouncycastle.asn1.DERBMPString(cArr);
    }

    static org.bouncycastle.asn1.ASN1BMPString getHighSpeedVideoSizes(byte[] bArr) {
        return new org.bouncycastle.asn1.DERBMPString(bArr);
    }

    ASN1BMPString(char[] cArr) {
        if (cArr == null) {
            throw new java.lang.NullPointerException("'string' cannot be null");
        }
        this.getHighSpeedVideoFpsRangesFor = cArr;
    }

    ASN1BMPString(byte[] bArr) {
        if (bArr == null) {
            throw new java.lang.NullPointerException("'string' cannot be null");
        }
        int length = bArr.length;
        if ((length & 1) != 0) {
            throw new java.lang.IllegalArgumentException("malformed BMPString encoding encountered");
        }
        int i = length / 2;
        char[] cArr = new char[i];
        for (int i2 = 0; i2 != i; i2++) {
            int i3 = i2 * 2;
            cArr[i2] = (char) ((bArr[i3 + 1] & 255) | (bArr[i3] << 8));
        }
        this.getHighSpeedVideoFpsRangesFor = cArr;
    }

    ASN1BMPString(java.lang.String str) {
        if (str == null) {
            throw new java.lang.NullPointerException("'string' cannot be null");
        }
        this.getHighSpeedVideoFpsRangesFor = str.toCharArray();
    }
}
