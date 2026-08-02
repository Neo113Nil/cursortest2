package com.google.protobuf;

/* loaded from: classes9.dex */
public final class UnknownFieldSetLite {
    private static final com.google.protobuf.UnknownFieldSetLite DEFAULT_INSTANCE = new com.google.protobuf.UnknownFieldSetLite(0, new int[0], new java.lang.Object[0], false);
    private static final int MIN_CAPACITY = 8;
    private int count;
    private boolean isMutable;
    private int memoizedSerializedSize;
    private java.lang.Object[] objects;
    private int[] tags;

    public static com.google.protobuf.UnknownFieldSetLite getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    static com.google.protobuf.UnknownFieldSetLite newInstance() {
        return new com.google.protobuf.UnknownFieldSetLite();
    }

    static com.google.protobuf.UnknownFieldSetLite mutableCopyOf(com.google.protobuf.UnknownFieldSetLite unknownFieldSetLite, com.google.protobuf.UnknownFieldSetLite unknownFieldSetLite2) {
        int i = unknownFieldSetLite.count + unknownFieldSetLite2.count;
        int[] copyOf = java.util.Arrays.copyOf(unknownFieldSetLite.tags, i);
        java.lang.System.arraycopy(unknownFieldSetLite2.tags, 0, copyOf, unknownFieldSetLite.count, unknownFieldSetLite2.count);
        java.lang.Object[] copyOf2 = java.util.Arrays.copyOf(unknownFieldSetLite.objects, i);
        java.lang.System.arraycopy(unknownFieldSetLite2.objects, 0, copyOf2, unknownFieldSetLite.count, unknownFieldSetLite2.count);
        return new com.google.protobuf.UnknownFieldSetLite(i, copyOf, copyOf2, true);
    }

    private UnknownFieldSetLite() {
        this(0, new int[8], new java.lang.Object[8], true);
    }

    private UnknownFieldSetLite(int i, int[] iArr, java.lang.Object[] objArr, boolean z) {
        this.memoizedSerializedSize = -1;
        this.count = i;
        this.tags = iArr;
        this.objects = objArr;
        this.isMutable = z;
    }

    public final void makeImmutable() {
        if (this.isMutable) {
            this.isMutable = false;
        }
    }

    final void checkMutable() {
        if (!this.isMutable) {
            throw new java.lang.UnsupportedOperationException();
        }
    }

    public final void writeTo(com.google.protobuf.CodedOutputStream codedOutputStream) throws java.io.IOException {
        for (int i = 0; i < this.count; i++) {
            int i2 = this.tags[i];
            int tagFieldNumber = com.google.protobuf.WireFormat.getTagFieldNumber(i2);
            int tagWireType = com.google.protobuf.WireFormat.getTagWireType(i2);
            if (tagWireType == 0) {
                codedOutputStream.writeUInt64(tagFieldNumber, ((java.lang.Long) this.objects[i]).longValue());
            } else if (tagWireType == 1) {
                codedOutputStream.writeFixed64(tagFieldNumber, ((java.lang.Long) this.objects[i]).longValue());
            } else if (tagWireType == 2) {
                codedOutputStream.writeBytes(tagFieldNumber, (com.google.protobuf.ByteString) this.objects[i]);
            } else if (tagWireType == 3) {
                codedOutputStream.writeTag(tagFieldNumber, 3);
                ((com.google.protobuf.UnknownFieldSetLite) this.objects[i]).writeTo(codedOutputStream);
                codedOutputStream.writeTag(tagFieldNumber, 4);
            } else if (tagWireType == 5) {
                codedOutputStream.writeFixed32(tagFieldNumber, ((java.lang.Integer) this.objects[i]).intValue());
            } else {
                throw com.google.protobuf.InvalidProtocolBufferException.invalidWireType();
            }
        }
    }

    public final void writeAsMessageSetTo(com.google.protobuf.CodedOutputStream codedOutputStream) throws java.io.IOException {
        for (int i = 0; i < this.count; i++) {
            codedOutputStream.writeRawMessageSetExtension(com.google.protobuf.WireFormat.getTagFieldNumber(this.tags[i]), (com.google.protobuf.ByteString) this.objects[i]);
        }
    }

    final void writeAsMessageSetTo(com.google.protobuf.Writer writer) throws java.io.IOException {
        if (writer.fieldOrder() == com.google.protobuf.Writer.FieldOrder.DESCENDING) {
            for (int i = this.count - 1; i >= 0; i--) {
                writer.writeMessageSetItem(com.google.protobuf.WireFormat.getTagFieldNumber(this.tags[i]), this.objects[i]);
            }
            return;
        }
        for (int i2 = 0; i2 < this.count; i2++) {
            writer.writeMessageSetItem(com.google.protobuf.WireFormat.getTagFieldNumber(this.tags[i2]), this.objects[i2]);
        }
    }

    public final void writeTo(com.google.protobuf.Writer writer) throws java.io.IOException {
        if (this.count != 0) {
            if (writer.fieldOrder() == com.google.protobuf.Writer.FieldOrder.ASCENDING) {
                for (int i = 0; i < this.count; i++) {
                    writeField(this.tags[i], this.objects[i], writer);
                }
                return;
            }
            for (int i2 = this.count - 1; i2 >= 0; i2--) {
                writeField(this.tags[i2], this.objects[i2], writer);
            }
        }
    }

    private static void writeField(int i, java.lang.Object obj, com.google.protobuf.Writer writer) throws java.io.IOException {
        int tagFieldNumber = com.google.protobuf.WireFormat.getTagFieldNumber(i);
        int tagWireType = com.google.protobuf.WireFormat.getTagWireType(i);
        if (tagWireType == 0) {
            writer.writeInt64(tagFieldNumber, ((java.lang.Long) obj).longValue());
            return;
        }
        if (tagWireType == 1) {
            writer.writeFixed64(tagFieldNumber, ((java.lang.Long) obj).longValue());
            return;
        }
        if (tagWireType == 2) {
            writer.writeBytes(tagFieldNumber, (com.google.protobuf.ByteString) obj);
            return;
        }
        if (tagWireType != 3) {
            if (tagWireType == 5) {
                writer.writeFixed32(tagFieldNumber, ((java.lang.Integer) obj).intValue());
                return;
            }
            throw new java.lang.RuntimeException(com.google.protobuf.InvalidProtocolBufferException.invalidWireType());
        }
        if (writer.fieldOrder() == com.google.protobuf.Writer.FieldOrder.ASCENDING) {
            writer.writeStartGroup(tagFieldNumber);
            ((com.google.protobuf.UnknownFieldSetLite) obj).writeTo(writer);
            writer.writeEndGroup(tagFieldNumber);
        } else {
            writer.writeEndGroup(tagFieldNumber);
            ((com.google.protobuf.UnknownFieldSetLite) obj).writeTo(writer);
            writer.writeStartGroup(tagFieldNumber);
        }
    }

    public final int getSerializedSizeAsMessageSet() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.count; i3++) {
            i2 += com.google.protobuf.CodedOutputStream.computeRawMessageSetExtensionSize(com.google.protobuf.WireFormat.getTagFieldNumber(this.tags[i3]), (com.google.protobuf.ByteString) this.objects[i3]);
        }
        this.memoizedSerializedSize = i2;
        return i2;
    }

    public final int getSerializedSize() {
        int computeUInt64Size;
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.count; i3++) {
            int i4 = this.tags[i3];
            int tagFieldNumber = com.google.protobuf.WireFormat.getTagFieldNumber(i4);
            int tagWireType = com.google.protobuf.WireFormat.getTagWireType(i4);
            if (tagWireType == 0) {
                computeUInt64Size = com.google.protobuf.CodedOutputStream.computeUInt64Size(tagFieldNumber, ((java.lang.Long) this.objects[i3]).longValue());
            } else if (tagWireType == 1) {
                computeUInt64Size = com.google.protobuf.CodedOutputStream.computeFixed64Size(tagFieldNumber, ((java.lang.Long) this.objects[i3]).longValue());
            } else if (tagWireType == 2) {
                computeUInt64Size = com.google.protobuf.CodedOutputStream.computeBytesSize(tagFieldNumber, (com.google.protobuf.ByteString) this.objects[i3]);
            } else if (tagWireType == 3) {
                computeUInt64Size = (com.google.protobuf.CodedOutputStream.computeTagSize(tagFieldNumber) * 2) + ((com.google.protobuf.UnknownFieldSetLite) this.objects[i3]).getSerializedSize();
            } else if (tagWireType == 5) {
                computeUInt64Size = com.google.protobuf.CodedOutputStream.computeFixed32Size(tagFieldNumber, ((java.lang.Integer) this.objects[i3]).intValue());
            } else {
                throw new java.lang.IllegalStateException(com.google.protobuf.InvalidProtocolBufferException.invalidWireType());
            }
            i2 += computeUInt64Size;
        }
        this.memoizedSerializedSize = i2;
        return i2;
    }

    private static boolean tagsEquals(int[] iArr, int[] iArr2, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            if (iArr[i2] != iArr2[i2]) {
                return false;
            }
        }
        return true;
    }

    private static boolean objectsEquals(java.lang.Object[] objArr, java.lang.Object[] objArr2, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            if (!objArr[i2].equals(objArr2[i2])) {
                return false;
            }
        }
        return true;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof com.google.protobuf.UnknownFieldSetLite)) {
            return false;
        }
        com.google.protobuf.UnknownFieldSetLite unknownFieldSetLite = (com.google.protobuf.UnknownFieldSetLite) obj;
        int i = this.count;
        return i == unknownFieldSetLite.count && tagsEquals(this.tags, unknownFieldSetLite.tags, i) && objectsEquals(this.objects, unknownFieldSetLite.objects, this.count);
    }

    private static int hashCode(int[] iArr, int i) {
        int i2 = 17;
        for (int i3 = 0; i3 < i; i3++) {
            i2 = (i2 * 31) + iArr[i3];
        }
        return i2;
    }

    private static int hashCode(java.lang.Object[] objArr, int i) {
        int i2 = 17;
        for (int i3 = 0; i3 < i; i3++) {
            i2 = (i2 * 31) + objArr[i3].hashCode();
        }
        return i2;
    }

    public final int hashCode() {
        int i = this.count;
        return ((((i + 527) * 31) + hashCode(this.tags, i)) * 31) + hashCode(this.objects, this.count);
    }

    final void printWithIndent(java.lang.StringBuilder sb, int i) {
        for (int i2 = 0; i2 < this.count; i2++) {
            com.google.protobuf.MessageLiteToString.printField(sb, i, java.lang.String.valueOf(com.google.protobuf.WireFormat.getTagFieldNumber(this.tags[i2])), this.objects[i2]);
        }
    }

    final void storeField(int i, java.lang.Object obj) {
        checkMutable();
        ensureCapacity(this.count + 1);
        int[] iArr = this.tags;
        int i2 = this.count;
        iArr[i2] = i;
        this.objects[i2] = obj;
        this.count = i2 + 1;
    }

    private void ensureCapacity(int i) {
        int[] iArr = this.tags;
        if (i > iArr.length) {
            int i2 = this.count;
            int i3 = i2 + (i2 / 2);
            if (i3 >= i) {
                i = i3;
            }
            if (i < 8) {
                i = 8;
            }
            this.tags = java.util.Arrays.copyOf(iArr, i);
            this.objects = java.util.Arrays.copyOf(this.objects, i);
        }
    }

    final boolean mergeFieldFrom(int i, com.google.protobuf.CodedInputStream codedInputStream) throws java.io.IOException {
        checkMutable();
        int tagFieldNumber = com.google.protobuf.WireFormat.getTagFieldNumber(i);
        int tagWireType = com.google.protobuf.WireFormat.getTagWireType(i);
        if (tagWireType == 0) {
            storeField(i, java.lang.Long.valueOf(codedInputStream.readInt64()));
            return true;
        }
        if (tagWireType == 1) {
            storeField(i, java.lang.Long.valueOf(codedInputStream.readFixed64()));
            return true;
        }
        if (tagWireType == 2) {
            storeField(i, codedInputStream.readBytes());
            return true;
        }
        if (tagWireType == 3) {
            com.google.protobuf.UnknownFieldSetLite unknownFieldSetLite = new com.google.protobuf.UnknownFieldSetLite();
            unknownFieldSetLite.mergeFrom(codedInputStream);
            codedInputStream.checkLastTagWas(com.google.protobuf.WireFormat.makeTag(tagFieldNumber, 4));
            storeField(i, unknownFieldSetLite);
            return true;
        }
        if (tagWireType == 4) {
            return false;
        }
        if (tagWireType == 5) {
            storeField(i, java.lang.Integer.valueOf(codedInputStream.readFixed32()));
            return true;
        }
        throw com.google.protobuf.InvalidProtocolBufferException.invalidWireType();
    }

    final com.google.protobuf.UnknownFieldSetLite mergeVarintField(int i, int i2) {
        checkMutable();
        if (i == 0) {
            throw new java.lang.IllegalArgumentException("Zero is not a valid field number.");
        }
        storeField(com.google.protobuf.WireFormat.makeTag(i, 0), java.lang.Long.valueOf(i2));
        return this;
    }

    final com.google.protobuf.UnknownFieldSetLite mergeLengthDelimitedField(int i, com.google.protobuf.ByteString byteString) {
        checkMutable();
        if (i == 0) {
            throw new java.lang.IllegalArgumentException("Zero is not a valid field number.");
        }
        storeField(com.google.protobuf.WireFormat.makeTag(i, 2), byteString);
        return this;
    }

    private com.google.protobuf.UnknownFieldSetLite mergeFrom(com.google.protobuf.CodedInputStream codedInputStream) throws java.io.IOException {
        int readTag;
        do {
            readTag = codedInputStream.readTag();
            if (readTag == 0) {
                break;
            }
        } while (mergeFieldFrom(readTag, codedInputStream));
        return this;
    }

    final com.google.protobuf.UnknownFieldSetLite mergeFrom(com.google.protobuf.UnknownFieldSetLite unknownFieldSetLite) {
        if (unknownFieldSetLite.equals(getDefaultInstance())) {
            return this;
        }
        checkMutable();
        int i = this.count + unknownFieldSetLite.count;
        ensureCapacity(i);
        java.lang.System.arraycopy(unknownFieldSetLite.tags, 0, this.tags, this.count, unknownFieldSetLite.count);
        java.lang.System.arraycopy(unknownFieldSetLite.objects, 0, this.objects, this.count, unknownFieldSetLite.count);
        this.count = i;
        return this;
    }
}
