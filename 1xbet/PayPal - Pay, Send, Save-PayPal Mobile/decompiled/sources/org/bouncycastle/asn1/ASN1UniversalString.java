package org.bouncycastle.asn1;

/* loaded from: classes17.dex */
public abstract class ASN1UniversalString extends org.bouncycastle.asn1.ASN1Primitive implements org.bouncycastle.asn1.ASN1String {
    final byte[] getHighSpeedVideoFpsRanges;
    static final org.bouncycastle.asn1.ASN1UniversalType getHighSpeedVideoSizes = new org.bouncycastle.asn1.ASN1UniversalType(org.bouncycastle.asn1.ASN1UniversalString.class) { // from class: org.bouncycastle.asn1.ASN1UniversalString.1
        @Override // org.bouncycastle.asn1.ASN1UniversalType
        final org.bouncycastle.asn1.ASN1Primitive getHighResolutionOutputSizeshNQ4ISI(org.bouncycastle.asn1.DEROctetString dEROctetString) {
            return org.bouncycastle.asn1.ASN1UniversalString.getHighSpeedVideoSizes(dEROctetString.getOctets());
        }
    };
    private static final char[] getHighResolutionOutputSizeshNQ4ISI = {com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    @Override // org.bouncycastle.asn1.ASN1Primitive
    final boolean getHighResolutionOutputSizeshNQ4ISI() {
        return false;
    }

    public static org.bouncycastle.asn1.ASN1UniversalString getInstance(java.lang.Object obj) {
        if (obj == null || (obj instanceof org.bouncycastle.asn1.ASN1UniversalString)) {
            return (org.bouncycastle.asn1.ASN1UniversalString) obj;
        }
        if (obj instanceof org.bouncycastle.asn1.ASN1Encodable) {
            org.bouncycastle.asn1.ASN1Primitive aSN1Primitive = ((org.bouncycastle.asn1.ASN1Encodable) obj).toASN1Primitive();
            if (aSN1Primitive instanceof org.bouncycastle.asn1.ASN1UniversalString) {
                return (org.bouncycastle.asn1.ASN1UniversalString) aSN1Primitive;
            }
        }
        if (!(obj instanceof byte[])) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("illegal object in getInstance: ");
            sb.append(obj.getClass().getName());
            throw new java.lang.IllegalArgumentException(sb.toString());
        }
        try {
            return (org.bouncycastle.asn1.ASN1UniversalString) getHighSpeedVideoSizes.Camera2StreamConfigurationMap(org.bouncycastle.asn1.ASN1Primitive.fromByteArray((byte[]) obj));
        } catch (java.lang.Exception e) {
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder("encoding error getInstance: ");
            sb2.append(e.toString());
            throw new java.lang.IllegalArgumentException(sb2.toString());
        }
    }

    public static org.bouncycastle.asn1.ASN1UniversalString getInstance(org.bouncycastle.asn1.ASN1TaggedObject aSN1TaggedObject, boolean z) {
        org.bouncycastle.asn1.ASN1UniversalType aSN1UniversalType = getHighSpeedVideoSizes;
        if (128 == aSN1TaggedObject.getTagClass()) {
            return (org.bouncycastle.asn1.ASN1UniversalString) aSN1UniversalType.Camera2StreamConfigurationMap(aSN1TaggedObject.getHighSpeedVideoFpsRangesFor(z, aSN1UniversalType));
        }
        throw new java.lang.IllegalStateException("this method only valid for CONTEXT_SPECIFIC tags");
    }

    @Override // org.bouncycastle.asn1.ASN1String
    public final java.lang.String getString() {
        int i;
        int length = this.getHighSpeedVideoFpsRanges.length;
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer(((org.bouncycastle.asn1.ASN1OutputStream.getHighSpeedVideoFpsRangesFor(length) + length) * 2) + 3);
        stringBuffer.append("#1C");
        if (length >= 128) {
            byte[] bArr = new byte[5];
            int i2 = length;
            int i3 = 5;
            while (true) {
                i = i3 - 1;
                bArr[i] = (byte) i2;
                i2 >>>= 8;
                if (i2 == 0) {
                    break;
                }
                i3 = i;
            }
            int i4 = i3 - 2;
            bArr[i4] = (byte) (128 | (5 - i));
            while (true) {
                int i5 = i4 + 1;
                byte b = bArr[i4];
                char[] cArr = getHighResolutionOutputSizeshNQ4ISI;
                stringBuffer.append(cArr[(b >>> 4) & 15]);
                stringBuffer.append(cArr[b & com.google.common.base.Ascii.SI]);
                if (i5 >= 5) {
                    break;
                }
                i4 = i5;
            }
        } else {
            char[] cArr2 = getHighResolutionOutputSizeshNQ4ISI;
            stringBuffer.append(cArr2[(length >>> 4) & 15]);
            stringBuffer.append(cArr2[length & 15]);
        }
        for (int i6 = 0; i6 < length; i6++) {
            byte b2 = this.getHighSpeedVideoFpsRanges[i6];
            char[] cArr3 = getHighResolutionOutputSizeshNQ4ISI;
            stringBuffer.append(cArr3[(b2 >>> 4) & 15]);
            stringBuffer.append(cArr3[b2 & com.google.common.base.Ascii.SI]);
        }
        return stringBuffer.toString();
    }

    public java.lang.String toString() {
        return getString();
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive, org.bouncycastle.asn1.ASN1Object
    public final int hashCode() {
        return org.bouncycastle.util.Arrays.hashCode(this.getHighSpeedVideoFpsRanges);
    }

    public final byte[] getOctets() {
        return org.bouncycastle.util.Arrays.clone(this.getHighSpeedVideoFpsRanges);
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    final int getHighSpeedVideoSizes(boolean z) {
        return org.bouncycastle.asn1.ASN1OutputStream.getHighSpeedVideoFpsRanges(z, this.getHighSpeedVideoFpsRanges.length);
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    final void getHighSpeedVideoSizes(org.bouncycastle.asn1.ASN1OutputStream aSN1OutputStream, boolean z) throws java.io.IOException {
        aSN1OutputStream.getHighResolutionOutputSizeshNQ4ISI(z, 28, this.getHighSpeedVideoFpsRanges);
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    final boolean Camera2StreamConfigurationMap(org.bouncycastle.asn1.ASN1Primitive aSN1Primitive) {
        if (aSN1Primitive instanceof org.bouncycastle.asn1.ASN1UniversalString) {
            return org.bouncycastle.util.Arrays.areEqual(this.getHighSpeedVideoFpsRanges, ((org.bouncycastle.asn1.ASN1UniversalString) aSN1Primitive).getHighSpeedVideoFpsRanges);
        }
        return false;
    }

    static org.bouncycastle.asn1.ASN1UniversalString getHighSpeedVideoSizes(byte[] bArr) {
        return new org.bouncycastle.asn1.DERUniversalString(bArr, false);
    }

    ASN1UniversalString(byte[] bArr, boolean z) {
        this.getHighSpeedVideoFpsRanges = z ? org.bouncycastle.util.Arrays.clone(bArr) : bArr;
    }
}
