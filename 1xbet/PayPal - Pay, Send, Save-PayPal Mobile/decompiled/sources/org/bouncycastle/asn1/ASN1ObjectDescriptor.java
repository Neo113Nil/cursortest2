package org.bouncycastle.asn1;

/* loaded from: classes17.dex */
public final class ASN1ObjectDescriptor extends org.bouncycastle.asn1.ASN1Primitive {
    static final org.bouncycastle.asn1.ASN1UniversalType getHighSpeedVideoFpsRanges = new org.bouncycastle.asn1.ASN1UniversalType(org.bouncycastle.asn1.ASN1ObjectDescriptor.class) { // from class: org.bouncycastle.asn1.ASN1ObjectDescriptor.1
        @Override // org.bouncycastle.asn1.ASN1UniversalType
        final org.bouncycastle.asn1.ASN1Primitive getHighResolutionOutputSizeshNQ4ISI(org.bouncycastle.asn1.DEROctetString dEROctetString) {
            return new org.bouncycastle.asn1.ASN1ObjectDescriptor((org.bouncycastle.asn1.ASN1GraphicString) org.bouncycastle.asn1.ASN1GraphicString.getHighResolutionOutputSizeshNQ4ISI.getHighResolutionOutputSizeshNQ4ISI(dEROctetString));
        }

        @Override // org.bouncycastle.asn1.ASN1UniversalType
        final org.bouncycastle.asn1.ASN1Primitive getHighResolutionOutputSizeshNQ4ISI(org.bouncycastle.asn1.ASN1Sequence aSN1Sequence) {
            return new org.bouncycastle.asn1.ASN1ObjectDescriptor((org.bouncycastle.asn1.ASN1GraphicString) org.bouncycastle.asn1.ASN1GraphicString.getHighResolutionOutputSizeshNQ4ISI.getHighResolutionOutputSizeshNQ4ISI(aSN1Sequence));
        }
    };
    private final org.bouncycastle.asn1.ASN1GraphicString getHighResolutionOutputSizeshNQ4ISI;

    @Override // org.bouncycastle.asn1.ASN1Primitive
    final boolean getHighResolutionOutputSizeshNQ4ISI() {
        return false;
    }

    public static org.bouncycastle.asn1.ASN1ObjectDescriptor getInstance(java.lang.Object obj) {
        if (obj == null || (obj instanceof org.bouncycastle.asn1.ASN1ObjectDescriptor)) {
            return (org.bouncycastle.asn1.ASN1ObjectDescriptor) obj;
        }
        if (obj instanceof org.bouncycastle.asn1.ASN1Encodable) {
            org.bouncycastle.asn1.ASN1Primitive aSN1Primitive = ((org.bouncycastle.asn1.ASN1Encodable) obj).toASN1Primitive();
            if (aSN1Primitive instanceof org.bouncycastle.asn1.ASN1ObjectDescriptor) {
                return (org.bouncycastle.asn1.ASN1ObjectDescriptor) aSN1Primitive;
            }
        } else if (obj instanceof byte[]) {
            try {
                return (org.bouncycastle.asn1.ASN1ObjectDescriptor) getHighSpeedVideoFpsRanges.Camera2StreamConfigurationMap(org.bouncycastle.asn1.ASN1Primitive.fromByteArray((byte[]) obj));
            } catch (java.io.IOException e) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("failed to construct object descriptor from byte[]: ");
                sb.append(e.getMessage());
                throw new java.lang.IllegalArgumentException(sb.toString());
            }
        }
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder("illegal object in getInstance: ");
        sb2.append(obj.getClass().getName());
        throw new java.lang.IllegalArgumentException(sb2.toString());
    }

    public static org.bouncycastle.asn1.ASN1ObjectDescriptor getInstance(org.bouncycastle.asn1.ASN1TaggedObject aSN1TaggedObject, boolean z) {
        org.bouncycastle.asn1.ASN1UniversalType aSN1UniversalType = getHighSpeedVideoFpsRanges;
        if (128 == aSN1TaggedObject.getTagClass()) {
            return (org.bouncycastle.asn1.ASN1ObjectDescriptor) aSN1UniversalType.Camera2StreamConfigurationMap(aSN1TaggedObject.getHighSpeedVideoFpsRangesFor(z, aSN1UniversalType));
        }
        throw new java.lang.IllegalStateException("this method only valid for CONTEXT_SPECIFIC tags");
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    final void getHighSpeedVideoSizes(org.bouncycastle.asn1.ASN1OutputStream aSN1OutputStream, boolean z) throws java.io.IOException {
        if (z) {
            aSN1OutputStream.getHighSpeedVideoFpsRanges.write(7);
        }
        this.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoSizes(aSN1OutputStream, false);
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    final org.bouncycastle.asn1.ASN1Primitive Camera2StreamConfigurationMap() {
        org.bouncycastle.asn1.ASN1GraphicString aSN1GraphicString = (org.bouncycastle.asn1.ASN1GraphicString) this.getHighResolutionOutputSizeshNQ4ISI.Camera2StreamConfigurationMap();
        return aSN1GraphicString == this.getHighResolutionOutputSizeshNQ4ISI ? this : new org.bouncycastle.asn1.ASN1ObjectDescriptor(aSN1GraphicString);
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    final org.bouncycastle.asn1.ASN1Primitive getHighSpeedVideoFpsRangesFor() {
        org.bouncycastle.asn1.ASN1GraphicString aSN1GraphicString = (org.bouncycastle.asn1.ASN1GraphicString) this.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoFpsRangesFor();
        return aSN1GraphicString == this.getHighResolutionOutputSizeshNQ4ISI ? this : new org.bouncycastle.asn1.ASN1ObjectDescriptor(aSN1GraphicString);
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive, org.bouncycastle.asn1.ASN1Object
    public final int hashCode() {
        return ~this.getHighResolutionOutputSizeshNQ4ISI.hashCode();
    }

    public final org.bouncycastle.asn1.ASN1GraphicString getBaseGraphicString() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    final int getHighSpeedVideoSizes(boolean z) {
        return this.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoSizes(z);
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    final boolean Camera2StreamConfigurationMap(org.bouncycastle.asn1.ASN1Primitive aSN1Primitive) {
        if (aSN1Primitive instanceof org.bouncycastle.asn1.ASN1ObjectDescriptor) {
            return this.getHighResolutionOutputSizeshNQ4ISI.Camera2StreamConfigurationMap(((org.bouncycastle.asn1.ASN1ObjectDescriptor) aSN1Primitive).getHighResolutionOutputSizeshNQ4ISI);
        }
        return false;
    }

    static org.bouncycastle.asn1.ASN1ObjectDescriptor getHighSpeedVideoFpsRangesFor(byte[] bArr) {
        return new org.bouncycastle.asn1.ASN1ObjectDescriptor(org.bouncycastle.asn1.ASN1GraphicString.getHighResolutionOutputSizeshNQ4ISI(bArr));
    }

    public ASN1ObjectDescriptor(org.bouncycastle.asn1.ASN1GraphicString aSN1GraphicString) {
        if (aSN1GraphicString == null) {
            throw new java.lang.NullPointerException("'baseGraphicString' cannot be null");
        }
        this.getHighResolutionOutputSizeshNQ4ISI = aSN1GraphicString;
    }
}
