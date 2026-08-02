package androidx.content.preferences.protobuf;

/* loaded from: classes3.dex */
public final class UnknownFieldSetLite {
    private static final androidx.content.preferences.protobuf.UnknownFieldSetLite getHighSpeedVideoFpsRangesFor = new androidx.content.preferences.protobuf.UnknownFieldSetLite(0, new int[0], new java.lang.Object[0], false);
    int[] Camera2StreamConfigurationMap;
    java.lang.Object[] getHighResolutionOutputSizeshNQ4ISI;
    boolean getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoSizes;
    private int getHighSpeedVideoSizesFor;

    public static androidx.content.preferences.protobuf.UnknownFieldSetLite getDefaultInstance() {
        return getHighSpeedVideoFpsRangesFor;
    }

    static androidx.content.preferences.protobuf.UnknownFieldSetLite getHighSpeedVideoSizes() {
        return new androidx.content.preferences.protobuf.UnknownFieldSetLite();
    }

    static androidx.content.preferences.protobuf.UnknownFieldSetLite getHighSpeedVideoSizes(androidx.content.preferences.protobuf.UnknownFieldSetLite unknownFieldSetLite, androidx.content.preferences.protobuf.UnknownFieldSetLite unknownFieldSetLite2) {
        int i = unknownFieldSetLite.getHighSpeedVideoSizes + unknownFieldSetLite2.getHighSpeedVideoSizes;
        int[] copyOf = java.util.Arrays.copyOf(unknownFieldSetLite.Camera2StreamConfigurationMap, i);
        java.lang.System.arraycopy(unknownFieldSetLite2.Camera2StreamConfigurationMap, 0, copyOf, unknownFieldSetLite.getHighSpeedVideoSizes, unknownFieldSetLite2.getHighSpeedVideoSizes);
        java.lang.Object[] copyOf2 = java.util.Arrays.copyOf(unknownFieldSetLite.getHighResolutionOutputSizeshNQ4ISI, i);
        java.lang.System.arraycopy(unknownFieldSetLite2.getHighResolutionOutputSizeshNQ4ISI, 0, copyOf2, unknownFieldSetLite.getHighSpeedVideoSizes, unknownFieldSetLite2.getHighSpeedVideoSizes);
        return new androidx.content.preferences.protobuf.UnknownFieldSetLite(i, copyOf, copyOf2, true);
    }

    private UnknownFieldSetLite() {
        this(0, new int[8], new java.lang.Object[8], true);
    }

    private UnknownFieldSetLite(int i, int[] iArr, java.lang.Object[] objArr, boolean z) {
        this.getHighSpeedVideoSizesFor = -1;
        this.getHighSpeedVideoSizes = i;
        this.Camera2StreamConfigurationMap = iArr;
        this.getHighResolutionOutputSizeshNQ4ISI = objArr;
        this.getHighSpeedVideoFpsRanges = z;
    }

    public final void makeImmutable() {
        if (this.getHighSpeedVideoFpsRanges) {
            this.getHighSpeedVideoFpsRanges = false;
        }
    }

    public final void writeTo(androidx.content.preferences.protobuf.CodedOutputStream codedOutputStream) throws java.io.IOException {
        for (int i = 0; i < this.getHighSpeedVideoSizes; i++) {
            int i2 = this.Camera2StreamConfigurationMap[i];
            int tagFieldNumber = androidx.content.preferences.protobuf.WireFormat.getTagFieldNumber(i2);
            int tagWireType = androidx.content.preferences.protobuf.WireFormat.getTagWireType(i2);
            if (tagWireType == 0) {
                codedOutputStream.writeUInt64(tagFieldNumber, ((java.lang.Long) this.getHighResolutionOutputSizeshNQ4ISI[i]).longValue());
            } else if (tagWireType == 1) {
                codedOutputStream.writeFixed64(tagFieldNumber, ((java.lang.Long) this.getHighResolutionOutputSizeshNQ4ISI[i]).longValue());
            } else if (tagWireType == 2) {
                codedOutputStream.writeBytes(tagFieldNumber, (androidx.content.preferences.protobuf.ByteString) this.getHighResolutionOutputSizeshNQ4ISI[i]);
            } else if (tagWireType == 3) {
                codedOutputStream.writeTag(tagFieldNumber, 3);
                ((androidx.content.preferences.protobuf.UnknownFieldSetLite) this.getHighResolutionOutputSizeshNQ4ISI[i]).writeTo(codedOutputStream);
                codedOutputStream.writeTag(tagFieldNumber, 4);
            } else if (tagWireType == 5) {
                codedOutputStream.writeFixed32(tagFieldNumber, ((java.lang.Integer) this.getHighResolutionOutputSizeshNQ4ISI[i]).intValue());
            } else {
                throw androidx.content.preferences.protobuf.InvalidProtocolBufferException.getHighResolutionOutputSizeshNQ4ISI();
            }
        }
    }

    public final void writeAsMessageSetTo(androidx.content.preferences.protobuf.CodedOutputStream codedOutputStream) throws java.io.IOException {
        for (int i = 0; i < this.getHighSpeedVideoSizes; i++) {
            codedOutputStream.writeRawMessageSetExtension(androidx.content.preferences.protobuf.WireFormat.getTagFieldNumber(this.Camera2StreamConfigurationMap[i]), (androidx.content.preferences.protobuf.ByteString) this.getHighResolutionOutputSizeshNQ4ISI[i]);
        }
    }

    public final void writeTo(androidx.content.preferences.protobuf.Writer writer) throws java.io.IOException {
        if (this.getHighSpeedVideoSizes != 0) {
            if (writer.getHighResolutionOutputSizeshNQ4ISI() == androidx.datastore.preferences.protobuf.Writer.FieldOrder.ASCENDING) {
                for (int i = 0; i < this.getHighSpeedVideoSizes; i++) {
                    getHighSpeedVideoFpsRangesFor(this.Camera2StreamConfigurationMap[i], this.getHighResolutionOutputSizeshNQ4ISI[i], writer);
                }
                return;
            }
            for (int i2 = this.getHighSpeedVideoSizes - 1; i2 >= 0; i2--) {
                getHighSpeedVideoFpsRangesFor(this.Camera2StreamConfigurationMap[i2], this.getHighResolutionOutputSizeshNQ4ISI[i2], writer);
            }
        }
    }

    private static void getHighSpeedVideoFpsRangesFor(int i, java.lang.Object obj, androidx.content.preferences.protobuf.Writer writer) throws java.io.IOException {
        int tagFieldNumber = androidx.content.preferences.protobuf.WireFormat.getTagFieldNumber(i);
        int tagWireType = androidx.content.preferences.protobuf.WireFormat.getTagWireType(i);
        if (tagWireType == 0) {
            writer.getHighResolutionOutputSizeshNQ4ISI(tagFieldNumber, ((java.lang.Long) obj).longValue());
            return;
        }
        if (tagWireType == 1) {
            writer.Camera2StreamConfigurationMap(tagFieldNumber, ((java.lang.Long) obj).longValue());
            return;
        }
        if (tagWireType == 2) {
            writer.getHighSpeedVideoFpsRanges(tagFieldNumber, (androidx.content.preferences.protobuf.ByteString) obj);
            return;
        }
        if (tagWireType != 3) {
            if (tagWireType == 5) {
                writer.getHighSpeedVideoFpsRangesFor(tagFieldNumber, ((java.lang.Integer) obj).intValue());
                return;
            }
            throw new java.lang.RuntimeException(androidx.content.preferences.protobuf.InvalidProtocolBufferException.getHighResolutionOutputSizeshNQ4ISI());
        }
        if (writer.getHighResolutionOutputSizeshNQ4ISI() == androidx.datastore.preferences.protobuf.Writer.FieldOrder.ASCENDING) {
            writer.getInputFormats(tagFieldNumber);
            ((androidx.content.preferences.protobuf.UnknownFieldSetLite) obj).writeTo(writer);
            writer.getOutputMinFrameDuration(tagFieldNumber);
        } else {
            writer.getOutputMinFrameDuration(tagFieldNumber);
            ((androidx.content.preferences.protobuf.UnknownFieldSetLite) obj).writeTo(writer);
            writer.getInputFormats(tagFieldNumber);
        }
    }

    public final int getSerializedSizeAsMessageSet() {
        int i = this.getHighSpeedVideoSizesFor;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.getHighSpeedVideoSizes; i3++) {
            i2 += androidx.content.preferences.protobuf.CodedOutputStream.computeRawMessageSetExtensionSize(androidx.content.preferences.protobuf.WireFormat.getTagFieldNumber(this.Camera2StreamConfigurationMap[i3]), (androidx.content.preferences.protobuf.ByteString) this.getHighResolutionOutputSizeshNQ4ISI[i3]);
        }
        this.getHighSpeedVideoSizesFor = i2;
        return i2;
    }

    public final int getSerializedSize() {
        int computeUInt64Size;
        int i = this.getHighSpeedVideoSizesFor;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.getHighSpeedVideoSizes; i3++) {
            int i4 = this.Camera2StreamConfigurationMap[i3];
            int tagFieldNumber = androidx.content.preferences.protobuf.WireFormat.getTagFieldNumber(i4);
            int tagWireType = androidx.content.preferences.protobuf.WireFormat.getTagWireType(i4);
            if (tagWireType == 0) {
                computeUInt64Size = androidx.content.preferences.protobuf.CodedOutputStream.computeUInt64Size(tagFieldNumber, ((java.lang.Long) this.getHighResolutionOutputSizeshNQ4ISI[i3]).longValue());
            } else if (tagWireType == 1) {
                computeUInt64Size = androidx.content.preferences.protobuf.CodedOutputStream.computeFixed64Size(tagFieldNumber, ((java.lang.Long) this.getHighResolutionOutputSizeshNQ4ISI[i3]).longValue());
            } else if (tagWireType == 2) {
                computeUInt64Size = androidx.content.preferences.protobuf.CodedOutputStream.computeBytesSize(tagFieldNumber, (androidx.content.preferences.protobuf.ByteString) this.getHighResolutionOutputSizeshNQ4ISI[i3]);
            } else if (tagWireType == 3) {
                computeUInt64Size = (androidx.content.preferences.protobuf.CodedOutputStream.computeTagSize(tagFieldNumber) * 2) + ((androidx.content.preferences.protobuf.UnknownFieldSetLite) this.getHighResolutionOutputSizeshNQ4ISI[i3]).getSerializedSize();
            } else if (tagWireType == 5) {
                computeUInt64Size = androidx.content.preferences.protobuf.CodedOutputStream.computeFixed32Size(tagFieldNumber, ((java.lang.Integer) this.getHighResolutionOutputSizeshNQ4ISI[i3]).intValue());
            } else {
                throw new java.lang.IllegalStateException(androidx.content.preferences.protobuf.InvalidProtocolBufferException.getHighResolutionOutputSizeshNQ4ISI());
            }
            i2 += computeUInt64Size;
        }
        this.getHighSpeedVideoSizesFor = i2;
        return i2;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof androidx.content.preferences.protobuf.UnknownFieldSetLite)) {
            return false;
        }
        androidx.content.preferences.protobuf.UnknownFieldSetLite unknownFieldSetLite = (androidx.content.preferences.protobuf.UnknownFieldSetLite) obj;
        int i = this.getHighSpeedVideoSizes;
        if (i == unknownFieldSetLite.getHighSpeedVideoSizes) {
            int[] iArr = this.Camera2StreamConfigurationMap;
            int[] iArr2 = unknownFieldSetLite.Camera2StreamConfigurationMap;
            int i2 = 0;
            while (true) {
                if (i2 >= i) {
                    java.lang.Object[] objArr = this.getHighResolutionOutputSizeshNQ4ISI;
                    java.lang.Object[] objArr2 = unknownFieldSetLite.getHighResolutionOutputSizeshNQ4ISI;
                    int i3 = this.getHighSpeedVideoSizes;
                    for (int i4 = 0; i4 < i3; i4++) {
                        if (objArr[i4].equals(objArr2[i4])) {
                        }
                    }
                    return true;
                }
                if (iArr[i2] != iArr2[i2]) {
                    break;
                }
                i2++;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.getHighSpeedVideoSizes;
        int[] iArr = this.Camera2StreamConfigurationMap;
        int i2 = 17;
        int i3 = 17;
        for (int i4 = 0; i4 < i; i4++) {
            i3 = (i3 * 31) + iArr[i4];
        }
        int i5 = (((i + 527) * 31) + i3) * 31;
        java.lang.Object[] objArr = this.getHighResolutionOutputSizeshNQ4ISI;
        int i6 = this.getHighSpeedVideoSizes;
        for (int i7 = 0; i7 < i6; i7++) {
            i2 = (i2 * 31) + objArr[i7].hashCode();
        }
        return i5 + i2;
    }

    final void getHighResolutionOutputSizeshNQ4ISI(java.lang.StringBuilder sb, int i) {
        for (int i2 = 0; i2 < this.getHighSpeedVideoSizes; i2++) {
            androidx.content.preferences.protobuf.MessageLiteToString.getHighSpeedVideoFpsRangesFor(sb, i, java.lang.String.valueOf(androidx.content.preferences.protobuf.WireFormat.getTagFieldNumber(this.Camera2StreamConfigurationMap[i2])), this.getHighResolutionOutputSizeshNQ4ISI[i2]);
        }
    }

    final void getHighSpeedVideoFpsRanges(int i) {
        int[] iArr = this.Camera2StreamConfigurationMap;
        if (i > iArr.length) {
            int i2 = this.getHighSpeedVideoSizes;
            int i3 = i2 + (i2 / 2);
            if (i3 >= i) {
                i = i3;
            }
            if (i < 8) {
                i = 8;
            }
            this.Camera2StreamConfigurationMap = java.util.Arrays.copyOf(iArr, i);
            this.getHighResolutionOutputSizeshNQ4ISI = java.util.Arrays.copyOf(this.getHighResolutionOutputSizeshNQ4ISI, i);
        }
    }

    final boolean getHighSpeedVideoFpsRangesFor(int i, androidx.content.preferences.protobuf.CodedInputStream codedInputStream) throws java.io.IOException {
        int readTag;
        if (this.getHighSpeedVideoFpsRanges) {
            int tagFieldNumber = androidx.content.preferences.protobuf.WireFormat.getTagFieldNumber(i);
            int tagWireType = androidx.content.preferences.protobuf.WireFormat.getTagWireType(i);
            if (tagWireType == 0) {
                getHighSpeedVideoSizes(i, java.lang.Long.valueOf(codedInputStream.readInt64()));
                return true;
            }
            if (tagWireType == 1) {
                getHighSpeedVideoSizes(i, java.lang.Long.valueOf(codedInputStream.readFixed64()));
                return true;
            }
            if (tagWireType == 2) {
                getHighSpeedVideoSizes(i, codedInputStream.readBytes());
                return true;
            }
            if (tagWireType != 3) {
                if (tagWireType == 4) {
                    return false;
                }
                if (tagWireType == 5) {
                    getHighSpeedVideoSizes(i, java.lang.Integer.valueOf(codedInputStream.readFixed32()));
                    return true;
                }
                throw androidx.content.preferences.protobuf.InvalidProtocolBufferException.getHighResolutionOutputSizeshNQ4ISI();
            }
            androidx.content.preferences.protobuf.UnknownFieldSetLite unknownFieldSetLite = new androidx.content.preferences.protobuf.UnknownFieldSetLite();
            do {
                readTag = codedInputStream.readTag();
                if (readTag == 0) {
                    break;
                }
            } while (unknownFieldSetLite.getHighSpeedVideoFpsRangesFor(readTag, codedInputStream));
            codedInputStream.checkLastTagWas(androidx.content.preferences.protobuf.WireFormat.Camera2StreamConfigurationMap(tagFieldNumber, 4));
            getHighSpeedVideoSizes(i, unknownFieldSetLite);
            return true;
        }
        throw new java.lang.UnsupportedOperationException();
    }

    final void getHighSpeedVideoSizes(int i, java.lang.Object obj) {
        if (this.getHighSpeedVideoFpsRanges) {
            getHighSpeedVideoFpsRanges(this.getHighSpeedVideoSizes + 1);
            int[] iArr = this.Camera2StreamConfigurationMap;
            int i2 = this.getHighSpeedVideoSizes;
            iArr[i2] = i;
            this.getHighResolutionOutputSizeshNQ4ISI[i2] = obj;
            this.getHighSpeedVideoSizes = i2 + 1;
            return;
        }
        throw new java.lang.UnsupportedOperationException();
    }
}
