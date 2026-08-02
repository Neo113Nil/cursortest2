package org.bouncycastle.asn1;

/* loaded from: classes17.dex */
public abstract class ASN1External extends org.bouncycastle.asn1.ASN1Primitive {
    static final org.bouncycastle.asn1.ASN1UniversalType getHighSpeedVideoFpsRanges = new org.bouncycastle.asn1.ASN1UniversalType(org.bouncycastle.asn1.ASN1External.class) { // from class: org.bouncycastle.asn1.ASN1External.1
        @Override // org.bouncycastle.asn1.ASN1UniversalType
        final org.bouncycastle.asn1.ASN1Primitive getHighResolutionOutputSizeshNQ4ISI(org.bouncycastle.asn1.ASN1Sequence aSN1Sequence) {
            return aSN1Sequence.getInputFormats();
        }
    };
    org.bouncycastle.asn1.ASN1ObjectIdentifier Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    org.bouncycastle.asn1.ASN1Primitive getHighSpeedVideoFpsRangesFor;
    org.bouncycastle.asn1.ASN1Primitive getHighSpeedVideoSizes;
    org.bouncycastle.asn1.ASN1Integer getOutputMinFrameDuration;

    @Override // org.bouncycastle.asn1.ASN1Primitive
    final boolean getHighResolutionOutputSizeshNQ4ISI() {
        return true;
    }

    abstract org.bouncycastle.asn1.ASN1Sequence getHighSpeedVideoSizes();

    ASN1External(org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier, org.bouncycastle.asn1.ASN1Integer aSN1Integer, org.bouncycastle.asn1.ASN1Primitive aSN1Primitive, int i, org.bouncycastle.asn1.ASN1Primitive aSN1Primitive2) {
        org.bouncycastle.asn1.ASN1UniversalType aSN1UniversalType;
        this.Camera2StreamConfigurationMap = aSN1ObjectIdentifier;
        this.getOutputMinFrameDuration = aSN1Integer;
        this.getHighSpeedVideoFpsRangesFor = aSN1Primitive;
        if (i < 0 || i > 2) {
            throw new java.lang.IllegalArgumentException("invalid encoding value: ".concat(java.lang.String.valueOf(i)));
        }
        this.getHighResolutionOutputSizeshNQ4ISI = i;
        if (i != 1) {
            aSN1UniversalType = i == 2 ? org.bouncycastle.asn1.ASN1BitString.getHighSpeedVideoFpsRangesFor : aSN1UniversalType;
            this.getHighSpeedVideoSizes = aSN1Primitive2;
        }
        aSN1UniversalType = org.bouncycastle.asn1.ASN1OctetString.Camera2StreamConfigurationMap;
        aSN1Primitive2 = aSN1UniversalType.Camera2StreamConfigurationMap(aSN1Primitive2);
        this.getHighSpeedVideoSizes = aSN1Primitive2;
    }

    ASN1External(org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier, org.bouncycastle.asn1.ASN1Integer aSN1Integer, org.bouncycastle.asn1.ASN1Primitive aSN1Primitive, org.bouncycastle.asn1.DERTaggedObject dERTaggedObject) {
        this.Camera2StreamConfigurationMap = aSN1ObjectIdentifier;
        this.getOutputMinFrameDuration = aSN1Integer;
        this.getHighSpeedVideoFpsRangesFor = aSN1Primitive;
        int tagNo = dERTaggedObject.getTagNo();
        if (tagNo < 0 || tagNo > 2) {
            throw new java.lang.IllegalArgumentException("invalid encoding value: ".concat(java.lang.String.valueOf(tagNo)));
        }
        this.getHighResolutionOutputSizeshNQ4ISI = tagNo;
        this.getHighSpeedVideoSizes = getHighResolutionOutputSizeshNQ4ISI(dERTaggedObject);
    }

    ASN1External(org.bouncycastle.asn1.ASN1Sequence aSN1Sequence) {
        if (aSN1Sequence.size() <= 0) {
            throw new java.lang.IllegalArgumentException("too few objects in input sequence");
        }
        int i = 0;
        org.bouncycastle.asn1.ASN1Primitive aSN1Primitive = aSN1Sequence.getObjectAt(0).toASN1Primitive();
        if (aSN1Primitive instanceof org.bouncycastle.asn1.ASN1ObjectIdentifier) {
            this.Camera2StreamConfigurationMap = (org.bouncycastle.asn1.ASN1ObjectIdentifier) aSN1Primitive;
            if (aSN1Sequence.size() <= 1) {
                throw new java.lang.IllegalArgumentException("too few objects in input sequence");
            }
            aSN1Primitive = aSN1Sequence.getObjectAt(1).toASN1Primitive();
            i = 1;
        }
        if (aSN1Primitive instanceof org.bouncycastle.asn1.ASN1Integer) {
            this.getOutputMinFrameDuration = (org.bouncycastle.asn1.ASN1Integer) aSN1Primitive;
            i++;
            if (aSN1Sequence.size() <= i) {
                throw new java.lang.IllegalArgumentException("too few objects in input sequence");
            }
            aSN1Primitive = aSN1Sequence.getObjectAt(i).toASN1Primitive();
        }
        if (!(aSN1Primitive instanceof org.bouncycastle.asn1.ASN1TaggedObject)) {
            this.getHighSpeedVideoFpsRangesFor = aSN1Primitive;
            i++;
            if (aSN1Sequence.size() <= i) {
                throw new java.lang.IllegalArgumentException("too few objects in input sequence");
            }
            aSN1Primitive = aSN1Sequence.getObjectAt(i).toASN1Primitive();
        }
        if (aSN1Sequence.size() != i + 1) {
            throw new java.lang.IllegalArgumentException("input sequence too large");
        }
        if (!(aSN1Primitive instanceof org.bouncycastle.asn1.ASN1TaggedObject)) {
            throw new java.lang.IllegalArgumentException("No tagged object found in sequence. Structure doesn't seem to be of type External");
        }
        org.bouncycastle.asn1.ASN1TaggedObject aSN1TaggedObject = (org.bouncycastle.asn1.ASN1TaggedObject) aSN1Primitive;
        int tagNo = aSN1TaggedObject.getTagNo();
        if (tagNo < 0 || tagNo > 2) {
            throw new java.lang.IllegalArgumentException("invalid encoding value: ".concat(java.lang.String.valueOf(tagNo)));
        }
        this.getHighResolutionOutputSizeshNQ4ISI = tagNo;
        this.getHighSpeedVideoSizes = getHighResolutionOutputSizeshNQ4ISI(aSN1TaggedObject);
    }

    public static org.bouncycastle.asn1.ASN1External getInstance(java.lang.Object obj) {
        if (obj == null || (obj instanceof org.bouncycastle.asn1.ASN1External)) {
            return (org.bouncycastle.asn1.ASN1External) obj;
        }
        if (obj instanceof org.bouncycastle.asn1.ASN1Encodable) {
            org.bouncycastle.asn1.ASN1Primitive aSN1Primitive = ((org.bouncycastle.asn1.ASN1Encodable) obj).toASN1Primitive();
            if (aSN1Primitive instanceof org.bouncycastle.asn1.ASN1External) {
                return (org.bouncycastle.asn1.ASN1External) aSN1Primitive;
            }
        } else if (obj instanceof byte[]) {
            try {
                return (org.bouncycastle.asn1.ASN1External) getHighSpeedVideoFpsRanges.Camera2StreamConfigurationMap(org.bouncycastle.asn1.ASN1Primitive.fromByteArray((byte[]) obj));
            } catch (java.io.IOException e) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("failed to construct external from byte[]: ");
                sb.append(e.getMessage());
                throw new java.lang.IllegalArgumentException(sb.toString());
            }
        }
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder("illegal object in getInstance: ");
        sb2.append(obj.getClass().getName());
        throw new java.lang.IllegalArgumentException(sb2.toString());
    }

    public static org.bouncycastle.asn1.ASN1External getInstance(org.bouncycastle.asn1.ASN1TaggedObject aSN1TaggedObject, boolean z) {
        org.bouncycastle.asn1.ASN1UniversalType aSN1UniversalType = getHighSpeedVideoFpsRanges;
        if (128 == aSN1TaggedObject.getTagClass()) {
            return (org.bouncycastle.asn1.ASN1External) aSN1UniversalType.Camera2StreamConfigurationMap(aSN1TaggedObject.getHighSpeedVideoFpsRangesFor(z, aSN1UniversalType));
        }
        throw new java.lang.IllegalStateException("this method only valid for CONTEXT_SPECIFIC tags");
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    final void getHighSpeedVideoSizes(org.bouncycastle.asn1.ASN1OutputStream aSN1OutputStream, boolean z) throws java.io.IOException {
        if (z) {
            aSN1OutputStream.getHighSpeedVideoFpsRanges.write(40);
        }
        getHighSpeedVideoSizes().getHighSpeedVideoSizes(aSN1OutputStream, false);
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    org.bouncycastle.asn1.ASN1Primitive Camera2StreamConfigurationMap() {
        return new org.bouncycastle.asn1.DLExternal(this.Camera2StreamConfigurationMap, this.getOutputMinFrameDuration, this.getHighSpeedVideoFpsRangesFor, this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoSizes);
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    org.bouncycastle.asn1.ASN1Primitive getHighSpeedVideoFpsRangesFor() {
        return new org.bouncycastle.asn1.DERExternal(this.Camera2StreamConfigurationMap, this.getOutputMinFrameDuration, this.getHighSpeedVideoFpsRangesFor, this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoSizes);
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive, org.bouncycastle.asn1.ASN1Object
    public int hashCode() {
        return (((org.bouncycastle.util.Objects.hashCode(this.Camera2StreamConfigurationMap) ^ org.bouncycastle.util.Objects.hashCode(this.getOutputMinFrameDuration)) ^ org.bouncycastle.util.Objects.hashCode(this.getHighSpeedVideoFpsRangesFor)) ^ this.getHighResolutionOutputSizeshNQ4ISI) ^ this.getHighSpeedVideoSizes.hashCode();
    }

    public org.bouncycastle.asn1.ASN1Integer getIndirectReference() {
        return this.getOutputMinFrameDuration;
    }

    public org.bouncycastle.asn1.ASN1Primitive getExternalContent() {
        return this.getHighSpeedVideoSizes;
    }

    public int getEncoding() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public org.bouncycastle.asn1.ASN1ObjectIdentifier getDirectReference() {
        return this.Camera2StreamConfigurationMap;
    }

    public org.bouncycastle.asn1.ASN1Primitive getDataValueDescriptor() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    final int getHighSpeedVideoSizes(boolean z) throws java.io.IOException {
        return getHighSpeedVideoSizes().getHighSpeedVideoSizes(z);
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    final boolean Camera2StreamConfigurationMap(org.bouncycastle.asn1.ASN1Primitive aSN1Primitive) {
        if (this == aSN1Primitive) {
            return true;
        }
        if (!(aSN1Primitive instanceof org.bouncycastle.asn1.ASN1External)) {
            return false;
        }
        org.bouncycastle.asn1.ASN1External aSN1External = (org.bouncycastle.asn1.ASN1External) aSN1Primitive;
        return org.bouncycastle.util.Objects.areEqual(this.Camera2StreamConfigurationMap, aSN1External.Camera2StreamConfigurationMap) && org.bouncycastle.util.Objects.areEqual(this.getOutputMinFrameDuration, aSN1External.getOutputMinFrameDuration) && org.bouncycastle.util.Objects.areEqual(this.getHighSpeedVideoFpsRangesFor, aSN1External.getHighSpeedVideoFpsRangesFor) && this.getHighResolutionOutputSizeshNQ4ISI == aSN1External.getHighResolutionOutputSizeshNQ4ISI && this.getHighSpeedVideoSizes.equals(aSN1External.getHighSpeedVideoSizes);
    }

    private static org.bouncycastle.asn1.ASN1Primitive getHighResolutionOutputSizeshNQ4ISI(org.bouncycastle.asn1.ASN1TaggedObject aSN1TaggedObject) {
        int tagClass = aSN1TaggedObject.getTagClass();
        int tagNo = aSN1TaggedObject.getTagNo();
        if (128 != tagClass) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("invalid tag: ");
            sb.append(org.bouncycastle.asn1.ASN1Util.getTagText(tagClass, tagNo));
            throw new java.lang.IllegalArgumentException(sb.toString());
        }
        if (tagNo == 0) {
            return aSN1TaggedObject.getExplicitBaseObject().toASN1Primitive();
        }
        if (tagNo == 1) {
            return org.bouncycastle.asn1.ASN1OctetString.getInstance(aSN1TaggedObject, false);
        }
        if (tagNo == 2) {
            return org.bouncycastle.asn1.ASN1BitString.getInstance(aSN1TaggedObject, false);
        }
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder("invalid tag: ");
        sb2.append(org.bouncycastle.asn1.ASN1Util.getTagText(tagClass, tagNo));
        throw new java.lang.IllegalArgumentException(sb2.toString());
    }
}
