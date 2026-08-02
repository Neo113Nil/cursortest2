package org.bouncycastle.asn1;

/* loaded from: classes17.dex */
public abstract class ASN1Null extends org.bouncycastle.asn1.ASN1Primitive {
    static final org.bouncycastle.asn1.ASN1UniversalType getHighSpeedVideoFpsRanges = new org.bouncycastle.asn1.ASN1UniversalType(org.bouncycastle.asn1.ASN1Null.class) { // from class: org.bouncycastle.asn1.ASN1Null.1
        @Override // org.bouncycastle.asn1.ASN1UniversalType
        final org.bouncycastle.asn1.ASN1Primitive getHighResolutionOutputSizeshNQ4ISI(org.bouncycastle.asn1.DEROctetString dEROctetString) {
            return org.bouncycastle.asn1.ASN1Null.getHighSpeedVideoSizes(dEROctetString.getOctets());
        }
    };

    @Override // org.bouncycastle.asn1.ASN1Primitive, org.bouncycastle.asn1.ASN1Object
    public int hashCode() {
        return -1;
    }

    public static org.bouncycastle.asn1.ASN1Null getInstance(java.lang.Object obj) {
        if (obj instanceof org.bouncycastle.asn1.ASN1Null) {
            return (org.bouncycastle.asn1.ASN1Null) obj;
        }
        if (obj == null) {
            return null;
        }
        try {
            return (org.bouncycastle.asn1.ASN1Null) getHighSpeedVideoFpsRanges.Camera2StreamConfigurationMap(org.bouncycastle.asn1.ASN1Primitive.fromByteArray((byte[]) obj));
        } catch (java.io.IOException e) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("failed to construct NULL from byte[]: ");
            sb.append(e.getMessage());
            throw new java.lang.IllegalArgumentException(sb.toString());
        }
    }

    public static org.bouncycastle.asn1.ASN1Null getInstance(org.bouncycastle.asn1.ASN1TaggedObject aSN1TaggedObject, boolean z) {
        org.bouncycastle.asn1.ASN1UniversalType aSN1UniversalType = getHighSpeedVideoFpsRanges;
        if (128 == aSN1TaggedObject.getTagClass()) {
            return (org.bouncycastle.asn1.ASN1Null) aSN1UniversalType.Camera2StreamConfigurationMap(aSN1TaggedObject.getHighSpeedVideoFpsRangesFor(z, aSN1UniversalType));
        }
        throw new java.lang.IllegalStateException("this method only valid for CONTEXT_SPECIFIC tags");
    }

    public java.lang.String toString() {
        return "NULL";
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    final boolean Camera2StreamConfigurationMap(org.bouncycastle.asn1.ASN1Primitive aSN1Primitive) {
        return aSN1Primitive instanceof org.bouncycastle.asn1.ASN1Null;
    }

    static org.bouncycastle.asn1.ASN1Null getHighSpeedVideoSizes(byte[] bArr) {
        if (bArr.length == 0) {
            return org.bouncycastle.asn1.DERNull.INSTANCE;
        }
        throw new java.lang.IllegalStateException("malformed NULL encoding encountered");
    }

    ASN1Null() {
    }
}
