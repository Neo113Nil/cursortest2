package org.bouncycastle.asn1;

/* loaded from: classes17.dex */
public abstract class ASN1Sequence extends org.bouncycastle.asn1.ASN1Primitive implements org.bouncycastle.util.Iterable<org.bouncycastle.asn1.ASN1Encodable> {
    static final org.bouncycastle.asn1.ASN1UniversalType getHighSpeedVideoFpsRangesFor = new org.bouncycastle.asn1.ASN1UniversalType(org.bouncycastle.asn1.ASN1Sequence.class) { // from class: org.bouncycastle.asn1.ASN1Sequence.1
        @Override // org.bouncycastle.asn1.ASN1UniversalType
        final org.bouncycastle.asn1.ASN1Primitive getHighResolutionOutputSizeshNQ4ISI(org.bouncycastle.asn1.ASN1Sequence aSN1Sequence) {
            return aSN1Sequence;
        }
    };
    org.bouncycastle.asn1.ASN1Encodable[] Camera2StreamConfigurationMap;

    @Override // org.bouncycastle.asn1.ASN1Primitive
    final boolean getHighResolutionOutputSizeshNQ4ISI() {
        return true;
    }

    abstract org.bouncycastle.asn1.ASN1BitString getHighSpeedVideoSizesFor();

    abstract org.bouncycastle.asn1.ASN1External getInputFormats();

    abstract org.bouncycastle.asn1.ASN1Set getInputSizeshNQ4ISI();

    abstract org.bouncycastle.asn1.ASN1OctetString getOutputFormats();

    public static org.bouncycastle.asn1.ASN1Sequence getInstance(java.lang.Object obj) {
        if (obj == null || (obj instanceof org.bouncycastle.asn1.ASN1Sequence)) {
            return (org.bouncycastle.asn1.ASN1Sequence) obj;
        }
        if (obj instanceof org.bouncycastle.asn1.ASN1Encodable) {
            org.bouncycastle.asn1.ASN1Primitive aSN1Primitive = ((org.bouncycastle.asn1.ASN1Encodable) obj).toASN1Primitive();
            if (aSN1Primitive instanceof org.bouncycastle.asn1.ASN1Sequence) {
                return (org.bouncycastle.asn1.ASN1Sequence) aSN1Primitive;
            }
        } else if (obj instanceof byte[]) {
            try {
                return (org.bouncycastle.asn1.ASN1Sequence) getHighSpeedVideoFpsRangesFor.Camera2StreamConfigurationMap(org.bouncycastle.asn1.ASN1Primitive.fromByteArray((byte[]) obj));
            } catch (java.io.IOException e) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("failed to construct sequence from byte[]: ");
                sb.append(e.getMessage());
                throw new java.lang.IllegalArgumentException(sb.toString());
            }
        }
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder("unknown object in getInstance: ");
        sb2.append(obj.getClass().getName());
        throw new java.lang.IllegalArgumentException(sb2.toString());
    }

    public static org.bouncycastle.asn1.ASN1Sequence getInstance(org.bouncycastle.asn1.ASN1TaggedObject aSN1TaggedObject, boolean z) {
        org.bouncycastle.asn1.ASN1UniversalType aSN1UniversalType = getHighSpeedVideoFpsRangesFor;
        if (128 == aSN1TaggedObject.getTagClass()) {
            return (org.bouncycastle.asn1.ASN1Sequence) aSN1UniversalType.Camera2StreamConfigurationMap(aSN1TaggedObject.getHighSpeedVideoFpsRangesFor(z, aSN1UniversalType));
        }
        throw new java.lang.IllegalStateException("this method only valid for CONTEXT_SPECIFIC tags");
    }

    public java.lang.String toString() {
        int size = size();
        if (size == 0) {
            return okhttp3.internal.url._UrlKt.PATH_SEGMENT_ENCODE_SET_URI;
        }
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("[");
        int i = 0;
        while (true) {
            stringBuffer.append(this.Camera2StreamConfigurationMap[i]);
            i++;
            if (i >= size) {
                stringBuffer.append(kotlinx.serialization.json.internal.AbstractJsonLexerKt.END_LIST);
                return stringBuffer.toString();
            }
            stringBuffer.append(", ");
        }
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    org.bouncycastle.asn1.ASN1Primitive Camera2StreamConfigurationMap() {
        return new org.bouncycastle.asn1.DLSequence(this.Camera2StreamConfigurationMap, (byte) 0);
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    org.bouncycastle.asn1.ASN1Primitive getHighSpeedVideoFpsRangesFor() {
        return new org.bouncycastle.asn1.DERSequence(this.Camera2StreamConfigurationMap, (byte) 0);
    }

    org.bouncycastle.asn1.ASN1Encodable[] getOutputMinFrameDuration() {
        return this.Camera2StreamConfigurationMap;
    }

    public org.bouncycastle.asn1.ASN1Encodable[] toArray() {
        return org.bouncycastle.asn1.ASN1EncodableVector.getHighSpeedVideoFpsRangesFor(this.Camera2StreamConfigurationMap);
    }

    public int size() {
        return this.Camera2StreamConfigurationMap.length;
    }

    public org.bouncycastle.asn1.ASN1SequenceParser parser() {
        final int size = size();
        return new org.bouncycastle.asn1.ASN1SequenceParser() { // from class: org.bouncycastle.asn1.ASN1Sequence.3
            private int getHighSpeedVideoFpsRangesFor = 0;

            @Override // org.bouncycastle.asn1.ASN1Encodable
            public org.bouncycastle.asn1.ASN1Primitive toASN1Primitive() {
                return org.bouncycastle.asn1.ASN1Sequence.this;
            }

            @Override // org.bouncycastle.asn1.ASN1SequenceParser
            public org.bouncycastle.asn1.ASN1Encodable readObject() throws java.io.IOException {
                if (size == this.getHighSpeedVideoFpsRangesFor) {
                    return null;
                }
                org.bouncycastle.asn1.ASN1Encodable[] aSN1EncodableArr = org.bouncycastle.asn1.ASN1Sequence.this.Camera2StreamConfigurationMap;
                int i = this.getHighSpeedVideoFpsRangesFor;
                this.getHighSpeedVideoFpsRangesFor = i + 1;
                org.bouncycastle.asn1.ASN1Encodable aSN1Encodable = aSN1EncodableArr[i];
                return aSN1Encodable instanceof org.bouncycastle.asn1.ASN1Sequence ? ((org.bouncycastle.asn1.ASN1Sequence) aSN1Encodable).parser() : aSN1Encodable instanceof org.bouncycastle.asn1.ASN1Set ? ((org.bouncycastle.asn1.ASN1Set) aSN1Encodable).parser() : aSN1Encodable;
            }

            @Override // org.bouncycastle.asn1.InMemoryRepresentable
            public org.bouncycastle.asn1.ASN1Primitive getLoadedObject() {
                return org.bouncycastle.asn1.ASN1Sequence.this;
            }
        };
    }

    @Override // org.bouncycastle.util.Iterable, java.lang.Iterable
    public java.util.Iterator<org.bouncycastle.asn1.ASN1Encodable> iterator() {
        return new org.bouncycastle.util.Arrays.Iterator(this.Camera2StreamConfigurationMap);
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive, org.bouncycastle.asn1.ASN1Object
    public int hashCode() {
        int length = this.Camera2StreamConfigurationMap.length;
        int i = length + 1;
        while (true) {
            length--;
            if (length < 0) {
                return i;
            }
            i = (i * 257) ^ this.Camera2StreamConfigurationMap[length].toASN1Primitive().hashCode();
        }
    }

    public java.util.Enumeration getObjects() {
        return new java.util.Enumeration() { // from class: org.bouncycastle.asn1.ASN1Sequence.2
            private int getHighSpeedVideoSizes = 0;

            @Override // java.util.Enumeration
            public java.lang.Object nextElement() {
                if (this.getHighSpeedVideoSizes >= org.bouncycastle.asn1.ASN1Sequence.this.Camera2StreamConfigurationMap.length) {
                    throw new java.util.NoSuchElementException();
                }
                org.bouncycastle.asn1.ASN1Encodable[] aSN1EncodableArr = org.bouncycastle.asn1.ASN1Sequence.this.Camera2StreamConfigurationMap;
                int i = this.getHighSpeedVideoSizes;
                this.getHighSpeedVideoSizes = i + 1;
                return aSN1EncodableArr[i];
            }

            @Override // java.util.Enumeration
            public boolean hasMoreElements() {
                return this.getHighSpeedVideoSizes < org.bouncycastle.asn1.ASN1Sequence.this.Camera2StreamConfigurationMap.length;
            }
        };
    }

    public org.bouncycastle.asn1.ASN1Encodable getObjectAt(int i) {
        return this.Camera2StreamConfigurationMap[i];
    }

    final org.bouncycastle.asn1.ASN1OctetString[] getHighSpeedVideoSizes() {
        int size = size();
        org.bouncycastle.asn1.ASN1OctetString[] aSN1OctetStringArr = new org.bouncycastle.asn1.ASN1OctetString[size];
        for (int i = 0; i < size; i++) {
            aSN1OctetStringArr[i] = org.bouncycastle.asn1.ASN1OctetString.getInstance(this.Camera2StreamConfigurationMap[i]);
        }
        return aSN1OctetStringArr;
    }

    final org.bouncycastle.asn1.ASN1BitString[] getHighSpeedVideoFpsRanges() {
        int size = size();
        org.bouncycastle.asn1.ASN1BitString[] aSN1BitStringArr = new org.bouncycastle.asn1.ASN1BitString[size];
        for (int i = 0; i < size; i++) {
            aSN1BitStringArr[i] = org.bouncycastle.asn1.ASN1BitString.getInstance(this.Camera2StreamConfigurationMap[i]);
        }
        return aSN1BitStringArr;
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    final boolean Camera2StreamConfigurationMap(org.bouncycastle.asn1.ASN1Primitive aSN1Primitive) {
        if (!(aSN1Primitive instanceof org.bouncycastle.asn1.ASN1Sequence)) {
            return false;
        }
        org.bouncycastle.asn1.ASN1Sequence aSN1Sequence = (org.bouncycastle.asn1.ASN1Sequence) aSN1Primitive;
        int size = size();
        if (aSN1Sequence.size() != size) {
            return false;
        }
        for (int i = 0; i < size; i++) {
            org.bouncycastle.asn1.ASN1Primitive aSN1Primitive2 = this.Camera2StreamConfigurationMap[i].toASN1Primitive();
            org.bouncycastle.asn1.ASN1Primitive aSN1Primitive3 = aSN1Sequence.Camera2StreamConfigurationMap[i].toASN1Primitive();
            if (aSN1Primitive2 != aSN1Primitive3 && !aSN1Primitive2.Camera2StreamConfigurationMap(aSN1Primitive3)) {
                return false;
            }
        }
        return true;
    }

    ASN1Sequence(org.bouncycastle.asn1.ASN1Encodable[] aSN1EncodableArr, boolean z) {
        this.Camera2StreamConfigurationMap = aSN1EncodableArr;
    }

    protected ASN1Sequence(org.bouncycastle.asn1.ASN1Encodable[] aSN1EncodableArr) {
        if (org.bouncycastle.util.Arrays.isNullOrContainsNull(aSN1EncodableArr)) {
            throw new java.lang.NullPointerException("'elements' cannot be null, or contain null");
        }
        this.Camera2StreamConfigurationMap = org.bouncycastle.asn1.ASN1EncodableVector.getHighSpeedVideoFpsRangesFor(aSN1EncodableArr);
    }

    protected ASN1Sequence(org.bouncycastle.asn1.ASN1EncodableVector aSN1EncodableVector) {
        if (aSN1EncodableVector == null) {
            throw new java.lang.NullPointerException("'elementVector' cannot be null");
        }
        this.Camera2StreamConfigurationMap = aSN1EncodableVector.getHighSpeedVideoSizes();
    }

    protected ASN1Sequence(org.bouncycastle.asn1.ASN1Encodable aSN1Encodable) {
        if (aSN1Encodable == null) {
            throw new java.lang.NullPointerException("'element' cannot be null");
        }
        this.Camera2StreamConfigurationMap = new org.bouncycastle.asn1.ASN1Encodable[]{aSN1Encodable};
    }

    protected ASN1Sequence() {
        this.Camera2StreamConfigurationMap = org.bouncycastle.asn1.ASN1EncodableVector.getHighSpeedVideoSizes;
    }
}
