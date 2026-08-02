package org.bouncycastle.asn1;

/* loaded from: classes17.dex */
public abstract class ASN1OctetString extends org.bouncycastle.asn1.ASN1Primitive implements org.bouncycastle.asn1.ASN1OctetStringParser {
    static final org.bouncycastle.asn1.ASN1UniversalType Camera2StreamConfigurationMap = new org.bouncycastle.asn1.ASN1UniversalType(org.bouncycastle.asn1.ASN1OctetString.class) { // from class: org.bouncycastle.asn1.ASN1OctetString.1
        @Override // org.bouncycastle.asn1.ASN1UniversalType
        final org.bouncycastle.asn1.ASN1Primitive getHighResolutionOutputSizeshNQ4ISI(org.bouncycastle.asn1.DEROctetString dEROctetString) {
            return dEROctetString;
        }

        @Override // org.bouncycastle.asn1.ASN1UniversalType
        final org.bouncycastle.asn1.ASN1Primitive getHighResolutionOutputSizeshNQ4ISI(org.bouncycastle.asn1.ASN1Sequence aSN1Sequence) {
            return aSN1Sequence.getOutputFormats();
        }
    };
    static final byte[] getHighSpeedVideoSizes = new byte[0];
    byte[] getHighSpeedVideoFpsRangesFor;

    public org.bouncycastle.asn1.ASN1OctetStringParser parser() {
        return this;
    }

    public static org.bouncycastle.asn1.ASN1OctetString getInstance(java.lang.Object obj) {
        if (obj == null || (obj instanceof org.bouncycastle.asn1.ASN1OctetString)) {
            return (org.bouncycastle.asn1.ASN1OctetString) obj;
        }
        if (obj instanceof org.bouncycastle.asn1.ASN1Encodable) {
            org.bouncycastle.asn1.ASN1Primitive aSN1Primitive = ((org.bouncycastle.asn1.ASN1Encodable) obj).toASN1Primitive();
            if (aSN1Primitive instanceof org.bouncycastle.asn1.ASN1OctetString) {
                return (org.bouncycastle.asn1.ASN1OctetString) aSN1Primitive;
            }
        } else if (obj instanceof byte[]) {
            try {
                return (org.bouncycastle.asn1.ASN1OctetString) Camera2StreamConfigurationMap.Camera2StreamConfigurationMap(org.bouncycastle.asn1.ASN1Primitive.fromByteArray((byte[]) obj));
            } catch (java.io.IOException e) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("failed to construct OCTET STRING from byte[]: ");
                sb.append(e.getMessage());
                throw new java.lang.IllegalArgumentException(sb.toString());
            }
        }
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder("illegal object in getInstance: ");
        sb2.append(obj.getClass().getName());
        throw new java.lang.IllegalArgumentException(sb2.toString());
    }

    public static org.bouncycastle.asn1.ASN1OctetString getInstance(org.bouncycastle.asn1.ASN1TaggedObject aSN1TaggedObject, boolean z) {
        org.bouncycastle.asn1.ASN1UniversalType aSN1UniversalType = Camera2StreamConfigurationMap;
        if (128 == aSN1TaggedObject.getTagClass()) {
            return (org.bouncycastle.asn1.ASN1OctetString) aSN1UniversalType.Camera2StreamConfigurationMap(aSN1TaggedObject.getHighSpeedVideoFpsRangesFor(z, aSN1UniversalType));
        }
        throw new java.lang.IllegalStateException("this method only valid for CONTEXT_SPECIFIC tags");
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("#");
        sb.append(org.bouncycastle.util.Strings.fromByteArray(org.bouncycastle.util.encoders.Hex.encode(this.getHighSpeedVideoFpsRangesFor)));
        return sb.toString();
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    org.bouncycastle.asn1.ASN1Primitive Camera2StreamConfigurationMap() {
        return new org.bouncycastle.asn1.DEROctetString(this.getHighSpeedVideoFpsRangesFor);
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    org.bouncycastle.asn1.ASN1Primitive getHighSpeedVideoFpsRangesFor() {
        return new org.bouncycastle.asn1.DEROctetString(this.getHighSpeedVideoFpsRangesFor);
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive, org.bouncycastle.asn1.ASN1Object
    public int hashCode() {
        return org.bouncycastle.util.Arrays.hashCode(getOctets());
    }

    public byte[] getOctets() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    @Override // org.bouncycastle.asn1.ASN1OctetStringParser
    public java.io.InputStream getOctetStream() {
        return new java.io.ByteArrayInputStream(this.getHighSpeedVideoFpsRangesFor);
    }

    @Override // org.bouncycastle.asn1.InMemoryRepresentable
    public org.bouncycastle.asn1.ASN1Primitive getLoadedObject() {
        return toASN1Primitive();
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    final boolean Camera2StreamConfigurationMap(org.bouncycastle.asn1.ASN1Primitive aSN1Primitive) {
        if (aSN1Primitive instanceof org.bouncycastle.asn1.ASN1OctetString) {
            return org.bouncycastle.util.Arrays.areEqual(this.getHighSpeedVideoFpsRangesFor, ((org.bouncycastle.asn1.ASN1OctetString) aSN1Primitive).getHighSpeedVideoFpsRangesFor);
        }
        return false;
    }

    static org.bouncycastle.asn1.ASN1OctetString Camera2StreamConfigurationMap(byte[] bArr) {
        return new org.bouncycastle.asn1.DEROctetString(bArr);
    }

    public ASN1OctetString(byte[] bArr) {
        if (bArr == null) {
            throw new java.lang.NullPointerException("'string' cannot be null");
        }
        this.getHighSpeedVideoFpsRangesFor = bArr;
    }
}
