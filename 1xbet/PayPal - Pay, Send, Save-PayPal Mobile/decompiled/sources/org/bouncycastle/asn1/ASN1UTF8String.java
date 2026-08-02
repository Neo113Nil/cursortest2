package org.bouncycastle.asn1;

/* loaded from: classes17.dex */
public abstract class ASN1UTF8String extends org.bouncycastle.asn1.ASN1Primitive implements org.bouncycastle.asn1.ASN1String {
    static final org.bouncycastle.asn1.ASN1UniversalType getHighResolutionOutputSizeshNQ4ISI = new org.bouncycastle.asn1.ASN1UniversalType(org.bouncycastle.asn1.ASN1UTF8String.class) { // from class: org.bouncycastle.asn1.ASN1UTF8String.1
        @Override // org.bouncycastle.asn1.ASN1UniversalType
        final org.bouncycastle.asn1.ASN1Primitive getHighResolutionOutputSizeshNQ4ISI(org.bouncycastle.asn1.DEROctetString dEROctetString) {
            return org.bouncycastle.asn1.ASN1UTF8String.getHighSpeedVideoSizes(dEROctetString.getOctets());
        }
    };
    final byte[] getHighSpeedVideoSizes;

    @Override // org.bouncycastle.asn1.ASN1Primitive
    final boolean getHighResolutionOutputSizeshNQ4ISI() {
        return false;
    }

    public static org.bouncycastle.asn1.ASN1UTF8String getInstance(java.lang.Object obj) {
        if (obj == null || (obj instanceof org.bouncycastle.asn1.ASN1UTF8String)) {
            return (org.bouncycastle.asn1.ASN1UTF8String) obj;
        }
        if (obj instanceof org.bouncycastle.asn1.ASN1Encodable) {
            org.bouncycastle.asn1.ASN1Primitive aSN1Primitive = ((org.bouncycastle.asn1.ASN1Encodable) obj).toASN1Primitive();
            if (aSN1Primitive instanceof org.bouncycastle.asn1.ASN1UTF8String) {
                return (org.bouncycastle.asn1.ASN1UTF8String) aSN1Primitive;
            }
        }
        if (!(obj instanceof byte[])) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("illegal object in getInstance: ");
            sb.append(obj.getClass().getName());
            throw new java.lang.IllegalArgumentException(sb.toString());
        }
        try {
            return (org.bouncycastle.asn1.ASN1UTF8String) getHighResolutionOutputSizeshNQ4ISI.Camera2StreamConfigurationMap(org.bouncycastle.asn1.ASN1Primitive.fromByteArray((byte[]) obj));
        } catch (java.lang.Exception e) {
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder("encoding error in getInstance: ");
            sb2.append(e.toString());
            throw new java.lang.IllegalArgumentException(sb2.toString());
        }
    }

    public static org.bouncycastle.asn1.ASN1UTF8String getInstance(org.bouncycastle.asn1.ASN1TaggedObject aSN1TaggedObject, boolean z) {
        org.bouncycastle.asn1.ASN1UniversalType aSN1UniversalType = getHighResolutionOutputSizeshNQ4ISI;
        if (128 == aSN1TaggedObject.getTagClass()) {
            return (org.bouncycastle.asn1.ASN1UTF8String) aSN1UniversalType.Camera2StreamConfigurationMap(aSN1TaggedObject.getHighSpeedVideoFpsRangesFor(z, aSN1UniversalType));
        }
        throw new java.lang.IllegalStateException("this method only valid for CONTEXT_SPECIFIC tags");
    }

    public java.lang.String toString() {
        return getString();
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive, org.bouncycastle.asn1.ASN1Object
    public final int hashCode() {
        return org.bouncycastle.util.Arrays.hashCode(this.getHighSpeedVideoSizes);
    }

    @Override // org.bouncycastle.asn1.ASN1String
    public final java.lang.String getString() {
        return org.bouncycastle.util.Strings.fromUTF8ByteArray(this.getHighSpeedVideoSizes);
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    final int getHighSpeedVideoSizes(boolean z) {
        return org.bouncycastle.asn1.ASN1OutputStream.getHighSpeedVideoFpsRanges(z, this.getHighSpeedVideoSizes.length);
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    final void getHighSpeedVideoSizes(org.bouncycastle.asn1.ASN1OutputStream aSN1OutputStream, boolean z) throws java.io.IOException {
        aSN1OutputStream.getHighResolutionOutputSizeshNQ4ISI(z, 12, this.getHighSpeedVideoSizes);
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    final boolean Camera2StreamConfigurationMap(org.bouncycastle.asn1.ASN1Primitive aSN1Primitive) {
        if (aSN1Primitive instanceof org.bouncycastle.asn1.ASN1UTF8String) {
            return org.bouncycastle.util.Arrays.areEqual(this.getHighSpeedVideoSizes, ((org.bouncycastle.asn1.ASN1UTF8String) aSN1Primitive).getHighSpeedVideoSizes);
        }
        return false;
    }

    static org.bouncycastle.asn1.ASN1UTF8String getHighSpeedVideoSizes(byte[] bArr) {
        return new org.bouncycastle.asn1.DERUTF8String(bArr, false);
    }

    ASN1UTF8String(byte[] bArr, boolean z) {
        this.getHighSpeedVideoSizes = z ? org.bouncycastle.util.Arrays.clone(bArr) : bArr;
    }

    ASN1UTF8String(java.lang.String str) {
        this(org.bouncycastle.util.Strings.toUTF8ByteArray(str), false);
    }
}
