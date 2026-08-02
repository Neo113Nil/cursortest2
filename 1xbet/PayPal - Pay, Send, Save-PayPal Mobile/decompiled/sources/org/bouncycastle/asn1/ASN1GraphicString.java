package org.bouncycastle.asn1;

/* loaded from: classes17.dex */
public abstract class ASN1GraphicString extends org.bouncycastle.asn1.ASN1Primitive implements org.bouncycastle.asn1.ASN1String {
    static final org.bouncycastle.asn1.ASN1UniversalType getHighResolutionOutputSizeshNQ4ISI = new org.bouncycastle.asn1.ASN1UniversalType(org.bouncycastle.asn1.ASN1GraphicString.class) { // from class: org.bouncycastle.asn1.ASN1GraphicString.1
        @Override // org.bouncycastle.asn1.ASN1UniversalType
        final org.bouncycastle.asn1.ASN1Primitive getHighResolutionOutputSizeshNQ4ISI(org.bouncycastle.asn1.DEROctetString dEROctetString) {
            return org.bouncycastle.asn1.ASN1GraphicString.getHighResolutionOutputSizeshNQ4ISI(dEROctetString.getOctets());
        }
    };
    final byte[] Camera2StreamConfigurationMap;

    @Override // org.bouncycastle.asn1.ASN1Primitive
    final boolean getHighResolutionOutputSizeshNQ4ISI() {
        return false;
    }

    public static org.bouncycastle.asn1.ASN1GraphicString getInstance(java.lang.Object obj) {
        if (obj == null || (obj instanceof org.bouncycastle.asn1.ASN1GraphicString)) {
            return (org.bouncycastle.asn1.ASN1GraphicString) obj;
        }
        if (obj instanceof org.bouncycastle.asn1.ASN1Encodable) {
            org.bouncycastle.asn1.ASN1Primitive aSN1Primitive = ((org.bouncycastle.asn1.ASN1Encodable) obj).toASN1Primitive();
            if (aSN1Primitive instanceof org.bouncycastle.asn1.ASN1GraphicString) {
                return (org.bouncycastle.asn1.ASN1GraphicString) aSN1Primitive;
            }
        }
        if (!(obj instanceof byte[])) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("illegal object in getInstance: ");
            sb.append(obj.getClass().getName());
            throw new java.lang.IllegalArgumentException(sb.toString());
        }
        try {
            return (org.bouncycastle.asn1.ASN1GraphicString) getHighResolutionOutputSizeshNQ4ISI.Camera2StreamConfigurationMap(org.bouncycastle.asn1.ASN1Primitive.fromByteArray((byte[]) obj));
        } catch (java.lang.Exception e) {
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder("encoding error in getInstance: ");
            sb2.append(e.toString());
            throw new java.lang.IllegalArgumentException(sb2.toString());
        }
    }

    public static org.bouncycastle.asn1.ASN1GraphicString getInstance(org.bouncycastle.asn1.ASN1TaggedObject aSN1TaggedObject, boolean z) {
        org.bouncycastle.asn1.ASN1UniversalType aSN1UniversalType = getHighResolutionOutputSizeshNQ4ISI;
        if (128 == aSN1TaggedObject.getTagClass()) {
            return (org.bouncycastle.asn1.ASN1GraphicString) aSN1UniversalType.Camera2StreamConfigurationMap(aSN1TaggedObject.getHighSpeedVideoFpsRangesFor(z, aSN1UniversalType));
        }
        throw new java.lang.IllegalStateException("this method only valid for CONTEXT_SPECIFIC tags");
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    final void getHighSpeedVideoSizes(org.bouncycastle.asn1.ASN1OutputStream aSN1OutputStream, boolean z) throws java.io.IOException {
        byte[] bArr = this.Camera2StreamConfigurationMap;
        if (z) {
            aSN1OutputStream.getHighSpeedVideoFpsRanges.write(25);
        }
        aSN1OutputStream.getHighSpeedVideoFpsRanges(bArr.length);
        aSN1OutputStream.getHighSpeedVideoFpsRanges.write(bArr, 0, bArr.length);
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive, org.bouncycastle.asn1.ASN1Object
    public final int hashCode() {
        return org.bouncycastle.util.Arrays.hashCode(this.Camera2StreamConfigurationMap);
    }

    @Override // org.bouncycastle.asn1.ASN1String
    public final java.lang.String getString() {
        return org.bouncycastle.util.Strings.fromByteArray(this.Camera2StreamConfigurationMap);
    }

    public final byte[] getOctets() {
        return org.bouncycastle.util.Arrays.clone(this.Camera2StreamConfigurationMap);
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    final int getHighSpeedVideoSizes(boolean z) {
        return org.bouncycastle.asn1.ASN1OutputStream.getHighSpeedVideoFpsRanges(z, this.Camera2StreamConfigurationMap.length);
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    final boolean Camera2StreamConfigurationMap(org.bouncycastle.asn1.ASN1Primitive aSN1Primitive) {
        if (aSN1Primitive instanceof org.bouncycastle.asn1.ASN1GraphicString) {
            return org.bouncycastle.util.Arrays.areEqual(this.Camera2StreamConfigurationMap, ((org.bouncycastle.asn1.ASN1GraphicString) aSN1Primitive).Camera2StreamConfigurationMap);
        }
        return false;
    }

    static org.bouncycastle.asn1.ASN1GraphicString getHighResolutionOutputSizeshNQ4ISI(byte[] bArr) {
        return new org.bouncycastle.asn1.DERGraphicString(bArr, false);
    }

    ASN1GraphicString(byte[] bArr, boolean z) {
        if (bArr == null) {
            throw new java.lang.NullPointerException("'contents' cannot be null");
        }
        this.Camera2StreamConfigurationMap = z ? org.bouncycastle.util.Arrays.clone(bArr) : bArr;
    }
}
