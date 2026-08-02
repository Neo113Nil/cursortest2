package org.bouncycastle.asn1;

/* loaded from: classes17.dex */
public abstract class ASN1Set extends org.bouncycastle.asn1.ASN1Primitive implements org.bouncycastle.util.Iterable<org.bouncycastle.asn1.ASN1Encodable> {
    static final org.bouncycastle.asn1.ASN1UniversalType getHighSpeedVideoFpsRangesFor = new org.bouncycastle.asn1.ASN1UniversalType(org.bouncycastle.asn1.ASN1Set.class) { // from class: org.bouncycastle.asn1.ASN1Set.1
        @Override // org.bouncycastle.asn1.ASN1UniversalType
        final org.bouncycastle.asn1.ASN1Primitive getHighResolutionOutputSizeshNQ4ISI(org.bouncycastle.asn1.ASN1Sequence aSN1Sequence) {
            return aSN1Sequence.getInputSizeshNQ4ISI();
        }
    };
    protected final org.bouncycastle.asn1.ASN1Encodable[] elements;
    protected final boolean isSorted;

    @Override // org.bouncycastle.asn1.ASN1Primitive
    final boolean getHighResolutionOutputSizeshNQ4ISI() {
        return true;
    }

    protected ASN1Set(org.bouncycastle.asn1.ASN1EncodableVector aSN1EncodableVector, boolean z) {
        org.bouncycastle.asn1.ASN1Encodable[] highSpeedVideoSizes;
        if (aSN1EncodableVector == null) {
            throw new java.lang.NullPointerException("'elementVector' cannot be null");
        }
        if (!z || aSN1EncodableVector.size() < 2) {
            highSpeedVideoSizes = aSN1EncodableVector.getHighSpeedVideoSizes();
        } else {
            int i = aSN1EncodableVector.Camera2StreamConfigurationMap;
            if (i == 0) {
                highSpeedVideoSizes = org.bouncycastle.asn1.ASN1EncodableVector.getHighSpeedVideoSizes;
            } else {
                org.bouncycastle.asn1.ASN1Encodable[] aSN1EncodableArr = new org.bouncycastle.asn1.ASN1Encodable[i];
                java.lang.System.arraycopy(aSN1EncodableVector.getHighSpeedVideoFpsRanges, 0, aSN1EncodableArr, 0, i);
                highSpeedVideoSizes = aSN1EncodableArr;
            }
            Camera2StreamConfigurationMap(highSpeedVideoSizes);
        }
        this.elements = highSpeedVideoSizes;
        this.isSorted = z || highSpeedVideoSizes.length < 2;
    }

    public static org.bouncycastle.asn1.ASN1Set getInstance(java.lang.Object obj) {
        if (obj == null || (obj instanceof org.bouncycastle.asn1.ASN1Set)) {
            return (org.bouncycastle.asn1.ASN1Set) obj;
        }
        if (obj instanceof org.bouncycastle.asn1.ASN1Encodable) {
            org.bouncycastle.asn1.ASN1Primitive aSN1Primitive = ((org.bouncycastle.asn1.ASN1Encodable) obj).toASN1Primitive();
            if (aSN1Primitive instanceof org.bouncycastle.asn1.ASN1Set) {
                return (org.bouncycastle.asn1.ASN1Set) aSN1Primitive;
            }
        } else if (obj instanceof byte[]) {
            try {
                return (org.bouncycastle.asn1.ASN1Set) getHighSpeedVideoFpsRangesFor.Camera2StreamConfigurationMap(org.bouncycastle.asn1.ASN1Primitive.fromByteArray((byte[]) obj));
            } catch (java.io.IOException e) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("failed to construct set from byte[]: ");
                sb.append(e.getMessage());
                throw new java.lang.IllegalArgumentException(sb.toString());
            }
        }
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder("unknown object in getInstance: ");
        sb2.append(obj.getClass().getName());
        throw new java.lang.IllegalArgumentException(sb2.toString());
    }

    public static org.bouncycastle.asn1.ASN1Set getInstance(org.bouncycastle.asn1.ASN1TaggedObject aSN1TaggedObject, boolean z) {
        org.bouncycastle.asn1.ASN1UniversalType aSN1UniversalType = getHighSpeedVideoFpsRangesFor;
        if (128 == aSN1TaggedObject.getTagClass()) {
            return (org.bouncycastle.asn1.ASN1Set) aSN1UniversalType.Camera2StreamConfigurationMap(aSN1TaggedObject.getHighSpeedVideoFpsRangesFor(z, aSN1UniversalType));
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
            stringBuffer.append(this.elements[i]);
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
        return new org.bouncycastle.asn1.DLSet(this.isSorted, this.elements);
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    org.bouncycastle.asn1.ASN1Primitive getHighSpeedVideoFpsRangesFor() {
        org.bouncycastle.asn1.ASN1Encodable[] aSN1EncodableArr;
        if (this.isSorted) {
            aSN1EncodableArr = this.elements;
        } else {
            aSN1EncodableArr = (org.bouncycastle.asn1.ASN1Encodable[]) this.elements.clone();
            Camera2StreamConfigurationMap(aSN1EncodableArr);
        }
        return new org.bouncycastle.asn1.DERSet(aSN1EncodableArr, (byte) 0);
    }

    public org.bouncycastle.asn1.ASN1Encodable[] toArray() {
        return org.bouncycastle.asn1.ASN1EncodableVector.getHighSpeedVideoFpsRangesFor(this.elements);
    }

    public int size() {
        return this.elements.length;
    }

    public org.bouncycastle.asn1.ASN1SetParser parser() {
        final int size = size();
        return new org.bouncycastle.asn1.ASN1SetParser() { // from class: org.bouncycastle.asn1.ASN1Set.3
            private int getHighResolutionOutputSizeshNQ4ISI = 0;

            @Override // org.bouncycastle.asn1.ASN1Encodable
            public org.bouncycastle.asn1.ASN1Primitive toASN1Primitive() {
                return org.bouncycastle.asn1.ASN1Set.this;
            }

            @Override // org.bouncycastle.asn1.ASN1SetParser
            public org.bouncycastle.asn1.ASN1Encodable readObject() throws java.io.IOException {
                if (size == this.getHighResolutionOutputSizeshNQ4ISI) {
                    return null;
                }
                org.bouncycastle.asn1.ASN1Encodable[] aSN1EncodableArr = org.bouncycastle.asn1.ASN1Set.this.elements;
                int i = this.getHighResolutionOutputSizeshNQ4ISI;
                this.getHighResolutionOutputSizeshNQ4ISI = i + 1;
                org.bouncycastle.asn1.ASN1Encodable aSN1Encodable = aSN1EncodableArr[i];
                return aSN1Encodable instanceof org.bouncycastle.asn1.ASN1Sequence ? ((org.bouncycastle.asn1.ASN1Sequence) aSN1Encodable).parser() : aSN1Encodable instanceof org.bouncycastle.asn1.ASN1Set ? ((org.bouncycastle.asn1.ASN1Set) aSN1Encodable).parser() : aSN1Encodable;
            }

            @Override // org.bouncycastle.asn1.InMemoryRepresentable
            public org.bouncycastle.asn1.ASN1Primitive getLoadedObject() {
                return org.bouncycastle.asn1.ASN1Set.this;
            }
        };
    }

    @Override // org.bouncycastle.util.Iterable, java.lang.Iterable
    public java.util.Iterator<org.bouncycastle.asn1.ASN1Encodable> iterator() {
        return new org.bouncycastle.util.Arrays.Iterator(toArray());
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive, org.bouncycastle.asn1.ASN1Object
    public int hashCode() {
        int length = this.elements.length;
        int i = length + 1;
        while (true) {
            length--;
            if (length < 0) {
                return i;
            }
            i += this.elements[length].toASN1Primitive().hashCode();
        }
    }

    public java.util.Enumeration getObjects() {
        return new java.util.Enumeration() { // from class: org.bouncycastle.asn1.ASN1Set.2
            private int Camera2StreamConfigurationMap = 0;

            @Override // java.util.Enumeration
            public java.lang.Object nextElement() {
                if (this.Camera2StreamConfigurationMap >= org.bouncycastle.asn1.ASN1Set.this.elements.length) {
                    throw new java.util.NoSuchElementException();
                }
                org.bouncycastle.asn1.ASN1Encodable[] aSN1EncodableArr = org.bouncycastle.asn1.ASN1Set.this.elements;
                int i = this.Camera2StreamConfigurationMap;
                this.Camera2StreamConfigurationMap = i + 1;
                return aSN1EncodableArr[i];
            }

            @Override // java.util.Enumeration
            public boolean hasMoreElements() {
                return this.Camera2StreamConfigurationMap < org.bouncycastle.asn1.ASN1Set.this.elements.length;
            }
        };
    }

    public org.bouncycastle.asn1.ASN1Encodable getObjectAt(int i) {
        return this.elements[i];
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    final boolean Camera2StreamConfigurationMap(org.bouncycastle.asn1.ASN1Primitive aSN1Primitive) {
        if (!(aSN1Primitive instanceof org.bouncycastle.asn1.ASN1Set)) {
            return false;
        }
        org.bouncycastle.asn1.ASN1Set aSN1Set = (org.bouncycastle.asn1.ASN1Set) aSN1Primitive;
        int size = size();
        if (aSN1Set.size() != size) {
            return false;
        }
        org.bouncycastle.asn1.DERSet dERSet = (org.bouncycastle.asn1.DERSet) getHighSpeedVideoFpsRangesFor();
        org.bouncycastle.asn1.DERSet dERSet2 = (org.bouncycastle.asn1.DERSet) aSN1Set.getHighSpeedVideoFpsRangesFor();
        for (int i = 0; i < size; i++) {
            org.bouncycastle.asn1.ASN1Primitive aSN1Primitive2 = dERSet.elements[i].toASN1Primitive();
            org.bouncycastle.asn1.ASN1Primitive aSN1Primitive3 = dERSet2.elements[i].toASN1Primitive();
            if (aSN1Primitive2 != aSN1Primitive3 && !aSN1Primitive2.Camera2StreamConfigurationMap(aSN1Primitive3)) {
                return false;
            }
        }
        return true;
    }

    private static void Camera2StreamConfigurationMap(org.bouncycastle.asn1.ASN1Encodable[] aSN1EncodableArr) {
        int i;
        int length = aSN1EncodableArr.length;
        if (length < 2) {
            return;
        }
        org.bouncycastle.asn1.ASN1Encodable aSN1Encodable = aSN1EncodableArr[0];
        org.bouncycastle.asn1.ASN1Encodable aSN1Encodable2 = aSN1EncodableArr[1];
        byte[] highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI(aSN1Encodable);
        byte[] highResolutionOutputSizeshNQ4ISI2 = getHighResolutionOutputSizeshNQ4ISI(aSN1Encodable2);
        if (getHighSpeedVideoFpsRangesFor(highResolutionOutputSizeshNQ4ISI2, highResolutionOutputSizeshNQ4ISI)) {
            aSN1Encodable2 = aSN1Encodable;
            aSN1Encodable = aSN1Encodable2;
        } else {
            highResolutionOutputSizeshNQ4ISI2 = highResolutionOutputSizeshNQ4ISI;
            highResolutionOutputSizeshNQ4ISI = highResolutionOutputSizeshNQ4ISI2;
        }
        for (int i2 = 2; i2 < length; i2++) {
            org.bouncycastle.asn1.ASN1Encodable aSN1Encodable3 = aSN1EncodableArr[i2];
            byte[] highResolutionOutputSizeshNQ4ISI3 = getHighResolutionOutputSizeshNQ4ISI(aSN1Encodable3);
            if (getHighSpeedVideoFpsRangesFor(highResolutionOutputSizeshNQ4ISI, highResolutionOutputSizeshNQ4ISI3)) {
                aSN1EncodableArr[i2 - 2] = aSN1Encodable;
                aSN1Encodable = aSN1Encodable2;
                highResolutionOutputSizeshNQ4ISI2 = highResolutionOutputSizeshNQ4ISI;
                aSN1Encodable2 = aSN1Encodable3;
                highResolutionOutputSizeshNQ4ISI = highResolutionOutputSizeshNQ4ISI3;
            } else if (getHighSpeedVideoFpsRangesFor(highResolutionOutputSizeshNQ4ISI2, highResolutionOutputSizeshNQ4ISI3)) {
                aSN1EncodableArr[i2 - 2] = aSN1Encodable;
                aSN1Encodable = aSN1Encodable3;
                highResolutionOutputSizeshNQ4ISI2 = highResolutionOutputSizeshNQ4ISI3;
            } else {
                int i3 = i2 - 1;
                while (true) {
                    i = i3 - 1;
                    if (i <= 0) {
                        break;
                    }
                    org.bouncycastle.asn1.ASN1Encodable aSN1Encodable4 = aSN1EncodableArr[i3 - 2];
                    if (getHighSpeedVideoFpsRangesFor(getHighResolutionOutputSizeshNQ4ISI(aSN1Encodable4), highResolutionOutputSizeshNQ4ISI3)) {
                        break;
                    }
                    aSN1EncodableArr[i] = aSN1Encodable4;
                    i3 = i;
                }
                aSN1EncodableArr[i] = aSN1Encodable3;
            }
        }
        aSN1EncodableArr[length - 2] = aSN1Encodable;
        aSN1EncodableArr[length - 1] = aSN1Encodable2;
    }

    private static boolean getHighSpeedVideoFpsRangesFor(byte[] bArr, byte[] bArr2) {
        int i = bArr[0] & (-33);
        int i2 = bArr2[0] & (-33);
        if (i != i2) {
            return i < i2;
        }
        int min = java.lang.Math.min(bArr.length, bArr2.length) - 1;
        for (int i3 = 1; i3 < min; i3++) {
            byte b = bArr[i3];
            byte b2 = bArr2[i3];
            if (b != b2) {
                return (b & 255) < (b2 & 255);
            }
        }
        return (bArr[min] & 255) <= (bArr2[min] & 255);
    }

    private static byte[] getHighResolutionOutputSizeshNQ4ISI(org.bouncycastle.asn1.ASN1Encodable aSN1Encodable) {
        try {
            return aSN1Encodable.toASN1Primitive().getEncoded(org.bouncycastle.asn1.ASN1Encoding.DER);
        } catch (java.io.IOException unused) {
            throw new java.lang.IllegalArgumentException("cannot encode object added to SET");
        }
    }

    protected ASN1Set(org.bouncycastle.asn1.ASN1Encodable[] aSN1EncodableArr, boolean z) {
        if (org.bouncycastle.util.Arrays.isNullOrContainsNull(aSN1EncodableArr)) {
            throw new java.lang.NullPointerException("'elements' cannot be null, or contain null");
        }
        org.bouncycastle.asn1.ASN1Encodable[] highSpeedVideoFpsRangesFor = org.bouncycastle.asn1.ASN1EncodableVector.getHighSpeedVideoFpsRangesFor(aSN1EncodableArr);
        if (z && highSpeedVideoFpsRangesFor.length >= 2) {
            Camera2StreamConfigurationMap(highSpeedVideoFpsRangesFor);
        }
        this.elements = highSpeedVideoFpsRangesFor;
        this.isSorted = z || highSpeedVideoFpsRangesFor.length < 2;
    }

    ASN1Set(boolean z, org.bouncycastle.asn1.ASN1Encodable[] aSN1EncodableArr) {
        this.elements = aSN1EncodableArr;
        this.isSorted = z || aSN1EncodableArr.length < 2;
    }

    protected ASN1Set(org.bouncycastle.asn1.ASN1Encodable aSN1Encodable) {
        if (aSN1Encodable == null) {
            throw new java.lang.NullPointerException("'element' cannot be null");
        }
        this.elements = new org.bouncycastle.asn1.ASN1Encodable[]{aSN1Encodable};
        this.isSorted = true;
    }

    protected ASN1Set() {
        this.elements = org.bouncycastle.asn1.ASN1EncodableVector.getHighSpeedVideoSizes;
        this.isSorted = true;
    }
}
