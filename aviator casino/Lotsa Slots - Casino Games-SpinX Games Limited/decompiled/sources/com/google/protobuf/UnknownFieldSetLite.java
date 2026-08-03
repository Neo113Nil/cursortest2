package com.google.protobuf;

/* loaded from: classes4.dex */
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

    static com.google.protobuf.UnknownFieldSetLite mutableCopyOf(com.google.protobuf.UnknownFieldSetLite first, com.google.protobuf.UnknownFieldSetLite second) {
        int i = first.count + second.count;
        int[] copyOf = java.util.Arrays.copyOf(first.tags, i);
        java.lang.System.arraycopy(second.tags, 0, copyOf, first.count, second.count);
        java.lang.Object[] copyOf2 = java.util.Arrays.copyOf(first.objects, i);
        java.lang.System.arraycopy(second.objects, 0, copyOf2, first.count, second.count);
        return new com.google.protobuf.UnknownFieldSetLite(i, copyOf, copyOf2, true);
    }

    private UnknownFieldSetLite() {
        this(0, new int[8], new java.lang.Object[8], true);
    }

    private UnknownFieldSetLite(int count, int[] tags, java.lang.Object[] objects, boolean isMutable) {
        this.memoizedSerializedSize = -1;
        this.count = count;
        this.tags = tags;
        this.objects = objects;
        this.isMutable = isMutable;
    }

    public void makeImmutable() {
        if (this.isMutable) {
            this.isMutable = false;
        }
    }

    void checkMutable() {
        if (!this.isMutable) {
            throw new java.lang.UnsupportedOperationException();
        }
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
        for (int i = 0; i < this.count; i++) {
            int i2 = this.tags[i];
            int tagFieldNumber = com.google.protobuf.WireFormat.getTagFieldNumber(i2);
            int tagWireType = com.google.protobuf.WireFormat.getTagWireType(i2);
            if (tagWireType == 0) {
                output.writeUInt64(tagFieldNumber, ((java.lang.Long) this.objects[i]).longValue());
            } else if (tagWireType == 1) {
                output.writeFixed64(tagFieldNumber, ((java.lang.Long) this.objects[i]).longValue());
            } else if (tagWireType == 2) {
                output.writeBytes(tagFieldNumber, (com.google.protobuf.ByteString) this.objects[i]);
            } else if (tagWireType == 3) {
                output.writeTag(tagFieldNumber, 3);
                ((com.google.protobuf.UnknownFieldSetLite) this.objects[i]).writeTo(output);
                output.writeTag(tagFieldNumber, 4);
            } else if (tagWireType == 5) {
                output.writeFixed32(tagFieldNumber, ((java.lang.Integer) this.objects[i]).intValue());
            } else {
                throw com.google.protobuf.InvalidProtocolBufferException.invalidWireType();
            }
        }
    }

    public void writeAsMessageSetTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
        for (int i = 0; i < this.count; i++) {
            output.writeRawMessageSetExtension(com.google.protobuf.WireFormat.getTagFieldNumber(this.tags[i]), (com.google.protobuf.ByteString) this.objects[i]);
        }
    }

    void writeAsMessageSetTo(com.google.protobuf.Writer writer) throws java.io.IOException {
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

    public void writeTo(com.google.protobuf.Writer writer) throws java.io.IOException {
        if (this.count == 0) {
            return;
        }
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

    private static void writeField(int tag, java.lang.Object object, com.google.protobuf.Writer writer) throws java.io.IOException {
        int tagFieldNumber = com.google.protobuf.WireFormat.getTagFieldNumber(tag);
        int tagWireType = com.google.protobuf.WireFormat.getTagWireType(tag);
        if (tagWireType == 0) {
            writer.writeInt64(tagFieldNumber, ((java.lang.Long) object).longValue());
            return;
        }
        if (tagWireType == 1) {
            writer.writeFixed64(tagFieldNumber, ((java.lang.Long) object).longValue());
            return;
        }
        if (tagWireType == 2) {
            writer.writeBytes(tagFieldNumber, (com.google.protobuf.ByteString) object);
            return;
        }
        if (tagWireType != 3) {
            if (tagWireType == 5) {
                writer.writeFixed32(tagFieldNumber, ((java.lang.Integer) object).intValue());
                return;
            }
            throw new java.lang.RuntimeException(com.google.protobuf.InvalidProtocolBufferException.invalidWireType());
        }
        if (writer.fieldOrder() == com.google.protobuf.Writer.FieldOrder.ASCENDING) {
            writer.writeStartGroup(tagFieldNumber);
            ((com.google.protobuf.UnknownFieldSetLite) object).writeTo(writer);
            writer.writeEndGroup(tagFieldNumber);
        } else {
            writer.writeEndGroup(tagFieldNumber);
            ((com.google.protobuf.UnknownFieldSetLite) object).writeTo(writer);
            writer.writeStartGroup(tagFieldNumber);
        }
    }

    public int getSerializedSizeAsMessageSet() {
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

    public int getSerializedSize() {
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

    private static boolean tagsEquals(int[] tags1, int[] tags2, int count) {
        for (int i = 0; i < count; i++) {
            if (tags1[i] != tags2[i]) {
                return false;
            }
        }
        return true;
    }

    private static boolean objectsEquals(java.lang.Object[] objects1, java.lang.Object[] objects2, int count) {
        for (int i = 0; i < count; i++) {
            if (!objects1[i].equals(objects2[i])) {
                return false;
            }
        }
        return true;
    }

    public boolean equals(java.lang.Object obj) {
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

    private static int hashCode(int[] tags, int count) {
        int i = 17;
        for (int i2 = 0; i2 < count; i2++) {
            i = (i * 31) + tags[i2];
        }
        return i;
    }

    private static int hashCode(java.lang.Object[] objects, int count) {
        int i = 17;
        for (int i2 = 0; i2 < count; i2++) {
            i = (i * 31) + objects[i2].hashCode();
        }
        return i;
    }

    public int hashCode() {
        int i = this.count;
        return ((((com.ironsource.mediationsdk.logger.IronSourceError.ERROR_NON_EXISTENT_INSTANCE + i) * 31) + hashCode(this.tags, i)) * 31) + hashCode(this.objects, this.count);
    }

    final void printWithIndent(java.lang.StringBuilder buffer, int indent) {
        for (int i = 0; i < this.count; i++) {
            com.google.protobuf.MessageLiteToString.printField(buffer, indent, java.lang.String.valueOf(com.google.protobuf.WireFormat.getTagFieldNumber(this.tags[i])), this.objects[i]);
        }
    }

    void storeField(int tag, java.lang.Object value) {
        checkMutable();
        ensureCapacity(this.count + 1);
        int[] iArr = this.tags;
        int i = this.count;
        iArr[i] = tag;
        this.objects[i] = value;
        this.count = i + 1;
    }

    private void ensureCapacity(int minCapacity) {
        int[] iArr = this.tags;
        if (minCapacity > iArr.length) {
            int i = this.count;
            int i2 = i + (i / 2);
            if (i2 >= minCapacity) {
                minCapacity = i2;
            }
            if (minCapacity < 8) {
                minCapacity = 8;
            }
            this.tags = java.util.Arrays.copyOf(iArr, minCapacity);
            this.objects = java.util.Arrays.copyOf(this.objects, minCapacity);
        }
    }

    boolean mergeFieldFrom(final int tag, final com.google.protobuf.CodedInputStream input) throws java.io.IOException {
        checkMutable();
        int tagFieldNumber = com.google.protobuf.WireFormat.getTagFieldNumber(tag);
        int tagWireType = com.google.protobuf.WireFormat.getTagWireType(tag);
        if (tagWireType == 0) {
            storeField(tag, java.lang.Long.valueOf(input.readInt64()));
            return true;
        }
        if (tagWireType == 1) {
            storeField(tag, java.lang.Long.valueOf(input.readFixed64()));
            return true;
        }
        if (tagWireType == 2) {
            storeField(tag, input.readBytes());
            return true;
        }
        if (tagWireType == 3) {
            com.google.protobuf.UnknownFieldSetLite unknownFieldSetLite = new com.google.protobuf.UnknownFieldSetLite();
            unknownFieldSetLite.mergeFrom(input);
            input.checkLastTagWas(com.google.protobuf.WireFormat.makeTag(tagFieldNumber, 4));
            storeField(tag, unknownFieldSetLite);
            return true;
        }
        if (tagWireType == 4) {
            return false;
        }
        if (tagWireType == 5) {
            storeField(tag, java.lang.Integer.valueOf(input.readFixed32()));
            return true;
        }
        throw com.google.protobuf.InvalidProtocolBufferException.invalidWireType();
    }

    com.google.protobuf.UnknownFieldSetLite mergeVarintField(int fieldNumber, int value) {
        checkMutable();
        if (fieldNumber == 0) {
            throw new java.lang.IllegalArgumentException("Zero is not a valid field number.");
        }
        storeField(com.google.protobuf.WireFormat.makeTag(fieldNumber, 0), java.lang.Long.valueOf(value));
        return this;
    }

    com.google.protobuf.UnknownFieldSetLite mergeLengthDelimitedField(final int fieldNumber, final com.google.protobuf.ByteString value) {
        checkMutable();
        if (fieldNumber == 0) {
            throw new java.lang.IllegalArgumentException("Zero is not a valid field number.");
        }
        storeField(com.google.protobuf.WireFormat.makeTag(fieldNumber, 2), value);
        return this;
    }

    private com.google.protobuf.UnknownFieldSetLite mergeFrom(final com.google.protobuf.CodedInputStream input) throws java.io.IOException {
        int readTag;
        do {
            readTag = input.readTag();
            if (readTag == 0) {
                break;
            }
        } while (mergeFieldFrom(readTag, input));
        return this;
    }

    com.google.protobuf.UnknownFieldSetLite mergeFrom(com.google.protobuf.UnknownFieldSetLite other) {
        if (other.equals(getDefaultInstance())) {
            return this;
        }
        checkMutable();
        int i = this.count + other.count;
        ensureCapacity(i);
        java.lang.System.arraycopy(other.tags, 0, this.tags, this.count, other.count);
        java.lang.System.arraycopy(other.objects, 0, this.objects, this.count, other.count);
        this.count = i;
        return this;
    }
}
