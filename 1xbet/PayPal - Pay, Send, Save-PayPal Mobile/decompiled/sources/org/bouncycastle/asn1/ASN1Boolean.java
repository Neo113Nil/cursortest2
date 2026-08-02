package org.bouncycastle.asn1;

/* loaded from: classes17.dex */
public class ASN1Boolean extends org.bouncycastle.asn1.ASN1Primitive {
    private final byte getHighSpeedVideoFpsRangesFor;
    static final org.bouncycastle.asn1.ASN1UniversalType getHighSpeedVideoFpsRanges = new org.bouncycastle.asn1.ASN1UniversalType(org.bouncycastle.asn1.ASN1Boolean.class) { // from class: org.bouncycastle.asn1.ASN1Boolean.1
        @Override // org.bouncycastle.asn1.ASN1UniversalType
        final org.bouncycastle.asn1.ASN1Primitive getHighResolutionOutputSizeshNQ4ISI(org.bouncycastle.asn1.DEROctetString dEROctetString) {
            return org.bouncycastle.asn1.ASN1Boolean.getHighSpeedVideoFpsRanges(dEROctetString.getOctets());
        }
    };
    public static final org.bouncycastle.asn1.ASN1Boolean FALSE = new org.bouncycastle.asn1.ASN1Boolean((byte) 0);
    public static final org.bouncycastle.asn1.ASN1Boolean TRUE = new org.bouncycastle.asn1.ASN1Boolean((byte) -1);

    @Override // org.bouncycastle.asn1.ASN1Primitive
    final boolean getHighResolutionOutputSizeshNQ4ISI() {
        return false;
    }

    public static org.bouncycastle.asn1.ASN1Boolean getInstance(java.lang.Object obj) {
        if (obj == null || (obj instanceof org.bouncycastle.asn1.ASN1Boolean)) {
            return (org.bouncycastle.asn1.ASN1Boolean) obj;
        }
        if (!(obj instanceof byte[])) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("illegal object in getInstance: ");
            sb.append(obj.getClass().getName());
            throw new java.lang.IllegalArgumentException(sb.toString());
        }
        try {
            return (org.bouncycastle.asn1.ASN1Boolean) getHighSpeedVideoFpsRanges.Camera2StreamConfigurationMap(org.bouncycastle.asn1.ASN1Primitive.fromByteArray((byte[]) obj));
        } catch (java.io.IOException e) {
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder("failed to construct boolean from byte[]: ");
            sb2.append(e.getMessage());
            throw new java.lang.IllegalArgumentException(sb2.toString());
        }
    }

    public static org.bouncycastle.asn1.ASN1Boolean getInstance(org.bouncycastle.asn1.ASN1TaggedObject aSN1TaggedObject, boolean z) {
        org.bouncycastle.asn1.ASN1UniversalType aSN1UniversalType = getHighSpeedVideoFpsRanges;
        if (128 == aSN1TaggedObject.getTagClass()) {
            return (org.bouncycastle.asn1.ASN1Boolean) aSN1UniversalType.Camera2StreamConfigurationMap(aSN1TaggedObject.getHighSpeedVideoFpsRangesFor(z, aSN1UniversalType));
        }
        throw new java.lang.IllegalStateException("this method only valid for CONTEXT_SPECIFIC tags");
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    final void getHighSpeedVideoSizes(org.bouncycastle.asn1.ASN1OutputStream aSN1OutputStream, boolean z) throws java.io.IOException {
        byte b = this.getHighSpeedVideoFpsRangesFor;
        if (z) {
            aSN1OutputStream.getHighSpeedVideoFpsRanges.write(1);
        }
        aSN1OutputStream.getHighSpeedVideoFpsRanges(1);
        aSN1OutputStream.getHighSpeedVideoFpsRanges.write(b);
    }

    public java.lang.String toString() {
        return isTrue() ? "TRUE" : "FALSE";
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    final org.bouncycastle.asn1.ASN1Primitive getHighSpeedVideoFpsRangesFor() {
        return isTrue() ? TRUE : FALSE;
    }

    public boolean isTrue() {
        return this.getHighSpeedVideoFpsRangesFor != 0;
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive, org.bouncycastle.asn1.ASN1Object
    public int hashCode() {
        return isTrue() ? 1 : 0;
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    final int getHighSpeedVideoSizes(boolean z) {
        return org.bouncycastle.asn1.ASN1OutputStream.getHighSpeedVideoFpsRanges(z, 1);
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    final boolean Camera2StreamConfigurationMap(org.bouncycastle.asn1.ASN1Primitive aSN1Primitive) {
        return (aSN1Primitive instanceof org.bouncycastle.asn1.ASN1Boolean) && isTrue() == ((org.bouncycastle.asn1.ASN1Boolean) aSN1Primitive).isTrue();
    }

    public static org.bouncycastle.asn1.ASN1Boolean getInstance(boolean z) {
        return z ? TRUE : FALSE;
    }

    public static org.bouncycastle.asn1.ASN1Boolean getInstance(int i) {
        return i != 0 ? TRUE : FALSE;
    }

    static org.bouncycastle.asn1.ASN1Boolean getHighSpeedVideoFpsRanges(byte[] bArr) {
        if (bArr.length != 1) {
            throw new java.lang.IllegalArgumentException("BOOLEAN value should have 1 byte in it");
        }
        byte b = bArr[0];
        return b != -1 ? b != 0 ? new org.bouncycastle.asn1.ASN1Boolean(b) : FALSE : TRUE;
    }

    private ASN1Boolean(byte b) {
        this.getHighSpeedVideoFpsRangesFor = b;
    }
}
