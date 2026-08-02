package org.bouncycastle.asn1;

/* loaded from: classes17.dex */
public abstract class ASN1PrintableString extends org.bouncycastle.asn1.ASN1Primitive implements org.bouncycastle.asn1.ASN1String {
    static final org.bouncycastle.asn1.ASN1UniversalType getHighResolutionOutputSizeshNQ4ISI = new org.bouncycastle.asn1.ASN1UniversalType(org.bouncycastle.asn1.ASN1PrintableString.class) { // from class: org.bouncycastle.asn1.ASN1PrintableString.1
        @Override // org.bouncycastle.asn1.ASN1UniversalType
        final org.bouncycastle.asn1.ASN1Primitive getHighResolutionOutputSizeshNQ4ISI(org.bouncycastle.asn1.DEROctetString dEROctetString) {
            return org.bouncycastle.asn1.ASN1PrintableString.Camera2StreamConfigurationMap(dEROctetString.getOctets());
        }
    };
    final byte[] getHighSpeedVideoFpsRangesFor;

    @Override // org.bouncycastle.asn1.ASN1Primitive
    final boolean getHighResolutionOutputSizeshNQ4ISI() {
        return false;
    }

    public static org.bouncycastle.asn1.ASN1PrintableString getInstance(java.lang.Object obj) {
        if (obj == null || (obj instanceof org.bouncycastle.asn1.ASN1PrintableString)) {
            return (org.bouncycastle.asn1.ASN1PrintableString) obj;
        }
        if (obj instanceof org.bouncycastle.asn1.ASN1Encodable) {
            org.bouncycastle.asn1.ASN1Primitive aSN1Primitive = ((org.bouncycastle.asn1.ASN1Encodable) obj).toASN1Primitive();
            if (aSN1Primitive instanceof org.bouncycastle.asn1.ASN1PrintableString) {
                return (org.bouncycastle.asn1.ASN1PrintableString) aSN1Primitive;
            }
        }
        if (!(obj instanceof byte[])) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("illegal object in getInstance: ");
            sb.append(obj.getClass().getName());
            throw new java.lang.IllegalArgumentException(sb.toString());
        }
        try {
            return (org.bouncycastle.asn1.ASN1PrintableString) getHighResolutionOutputSizeshNQ4ISI.Camera2StreamConfigurationMap(org.bouncycastle.asn1.ASN1Primitive.fromByteArray((byte[]) obj));
        } catch (java.lang.Exception e) {
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder("encoding error in getInstance: ");
            sb2.append(e.toString());
            throw new java.lang.IllegalArgumentException(sb2.toString());
        }
    }

    public static org.bouncycastle.asn1.ASN1PrintableString getInstance(org.bouncycastle.asn1.ASN1TaggedObject aSN1TaggedObject, boolean z) {
        org.bouncycastle.asn1.ASN1UniversalType aSN1UniversalType = getHighResolutionOutputSizeshNQ4ISI;
        if (128 == aSN1TaggedObject.getTagClass()) {
            return (org.bouncycastle.asn1.ASN1PrintableString) aSN1UniversalType.Camera2StreamConfigurationMap(aSN1TaggedObject.getHighSpeedVideoFpsRangesFor(z, aSN1UniversalType));
        }
        throw new java.lang.IllegalStateException("this method only valid for CONTEXT_SPECIFIC tags");
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
        return org.bouncycastle.util.Strings.fromByteArray(this.getHighSpeedVideoFpsRangesFor);
    }

    public final byte[] getOctets() {
        return org.bouncycastle.util.Arrays.clone(this.getHighSpeedVideoFpsRangesFor);
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    final int getHighSpeedVideoSizes(boolean z) {
        return org.bouncycastle.asn1.ASN1OutputStream.getHighSpeedVideoFpsRanges(z, this.getHighSpeedVideoFpsRangesFor.length);
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    final void getHighSpeedVideoSizes(org.bouncycastle.asn1.ASN1OutputStream aSN1OutputStream, boolean z) throws java.io.IOException {
        aSN1OutputStream.getHighResolutionOutputSizeshNQ4ISI(z, 19, this.getHighSpeedVideoFpsRangesFor);
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    final boolean Camera2StreamConfigurationMap(org.bouncycastle.asn1.ASN1Primitive aSN1Primitive) {
        if (aSN1Primitive instanceof org.bouncycastle.asn1.ASN1PrintableString) {
            return org.bouncycastle.util.Arrays.areEqual(this.getHighSpeedVideoFpsRangesFor, ((org.bouncycastle.asn1.ASN1PrintableString) aSN1Primitive).getHighSpeedVideoFpsRangesFor);
        }
        return false;
    }

    public static boolean isPrintableString(java.lang.String str) {
        for (int length = str.length() - 1; length >= 0; length--) {
            char charAt = str.charAt(length);
            if (charAt > 127) {
                return false;
            }
            if (('a' > charAt || charAt > 'z') && (('A' > charAt || charAt > 'Z') && (('0' > charAt || charAt > '9') && charAt != ' ' && charAt != ':' && charAt != '=' && charAt != '?'))) {
                switch (charAt) {
                    case '\'':
                    case '(':
                    case ')':
                        continue;
                    default:
                        switch (charAt) {
                            case '+':
                            case ',':
                            case '-':
                            case '.':
                            case '/':
                                break;
                            default:
                                return false;
                        }
                }
            }
        }
        return true;
    }

    static org.bouncycastle.asn1.ASN1PrintableString Camera2StreamConfigurationMap(byte[] bArr) {
        return new org.bouncycastle.asn1.DERPrintableString(bArr, false);
    }

    ASN1PrintableString(byte[] bArr, boolean z) {
        this.getHighSpeedVideoFpsRangesFor = z ? org.bouncycastle.util.Arrays.clone(bArr) : bArr;
    }

    ASN1PrintableString(java.lang.String str, boolean z) {
        if (z && !isPrintableString(str)) {
            throw new java.lang.IllegalArgumentException("string contains illegal characters");
        }
        this.getHighSpeedVideoFpsRangesFor = org.bouncycastle.util.Strings.toByteArray(str);
    }
}
