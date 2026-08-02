package com.google.crypto.tink.shaded.protobuf;

@com.google.crypto.tink.shaded.protobuf.CheckReturnValue
/* loaded from: classes4.dex */
final class CodedInputStreamReader implements com.google.crypto.tink.shaded.protobuf.Reader {
    private static final int FIXED32_MULTIPLE_MASK = 3;
    private static final int FIXED64_MULTIPLE_MASK = 7;
    private static final int NEXT_TAG_UNSET = 0;
    private int endGroupTag;
    private final com.google.crypto.tink.shaded.protobuf.CodedInputStream input;
    private int nextTag = 0;
    private int tag;

    public static com.google.crypto.tink.shaded.protobuf.CodedInputStreamReader forCodedInput(com.google.crypto.tink.shaded.protobuf.CodedInputStream codedInputStream) {
        if (codedInputStream.wrapper != null) {
            return codedInputStream.wrapper;
        }
        return new com.google.crypto.tink.shaded.protobuf.CodedInputStreamReader(codedInputStream);
    }

    private CodedInputStreamReader(com.google.crypto.tink.shaded.protobuf.CodedInputStream codedInputStream) {
        com.google.crypto.tink.shaded.protobuf.CodedInputStream codedInputStream2 = (com.google.crypto.tink.shaded.protobuf.CodedInputStream) com.google.crypto.tink.shaded.protobuf.Internal.checkNotNull(codedInputStream, "input");
        this.input = codedInputStream2;
        codedInputStream2.wrapper = this;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Reader
    public final boolean shouldDiscardUnknownFields() {
        return this.input.shouldDiscardUnknownFields();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Reader
    public final int getFieldNumber() throws java.io.IOException {
        int i = this.nextTag;
        if (i != 0) {
            this.tag = i;
            this.nextTag = 0;
        } else {
            this.tag = this.input.readTag();
        }
        int i2 = this.tag;
        if (i2 == 0 || i2 == this.endGroupTag) {
            return Integer.MAX_VALUE;
        }
        return com.google.crypto.tink.shaded.protobuf.WireFormat.getTagFieldNumber(i2);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Reader
    public final int getTag() {
        return this.tag;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Reader
    public final boolean skipField() throws java.io.IOException {
        int i;
        if (this.input.isAtEnd() || (i = this.tag) == this.endGroupTag) {
            return false;
        }
        return this.input.skipField(i);
    }

    private void requireWireType(int i) throws java.io.IOException {
        if (com.google.crypto.tink.shaded.protobuf.WireFormat.getTagWireType(this.tag) != i) {
            throw com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.invalidWireType();
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Reader
    public final double readDouble() throws java.io.IOException {
        requireWireType(1);
        return this.input.readDouble();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Reader
    public final float readFloat() throws java.io.IOException {
        requireWireType(5);
        return this.input.readFloat();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Reader
    public final long readUInt64() throws java.io.IOException {
        requireWireType(0);
        return this.input.readUInt64();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Reader
    public final long readInt64() throws java.io.IOException {
        requireWireType(0);
        return this.input.readInt64();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Reader
    public final int readInt32() throws java.io.IOException {
        requireWireType(0);
        return this.input.readInt32();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Reader
    public final long readFixed64() throws java.io.IOException {
        requireWireType(1);
        return this.input.readFixed64();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Reader
    public final int readFixed32() throws java.io.IOException {
        requireWireType(5);
        return this.input.readFixed32();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Reader
    public final boolean readBool() throws java.io.IOException {
        requireWireType(0);
        return this.input.readBool();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Reader
    public final java.lang.String readString() throws java.io.IOException {
        requireWireType(2);
        return this.input.readString();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Reader
    public final java.lang.String readStringRequireUtf8() throws java.io.IOException {
        requireWireType(2);
        return this.input.readStringRequireUtf8();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Reader
    public final <T> T readMessage(java.lang.Class<T> cls, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
        requireWireType(2);
        return (T) readMessage(com.google.crypto.tink.shaded.protobuf.Protobuf.getInstance().schemaFor((java.lang.Class) cls), extensionRegistryLite);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Reader
    public final <T> T readMessageBySchemaWithCheck(com.google.crypto.tink.shaded.protobuf.Schema<T> schema, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
        requireWireType(2);
        return (T) readMessage(schema, extensionRegistryLite);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Reader
    @java.lang.Deprecated
    public final <T> T readGroup(java.lang.Class<T> cls, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
        requireWireType(3);
        return (T) readGroup(com.google.crypto.tink.shaded.protobuf.Protobuf.getInstance().schemaFor((java.lang.Class) cls), extensionRegistryLite);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Reader
    @java.lang.Deprecated
    public final <T> T readGroupBySchemaWithCheck(com.google.crypto.tink.shaded.protobuf.Schema<T> schema, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
        requireWireType(3);
        return (T) readGroup(schema, extensionRegistryLite);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Reader
    public final <T> void mergeMessageField(T t, com.google.crypto.tink.shaded.protobuf.Schema<T> schema, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
        requireWireType(2);
        mergeMessageFieldInternal(t, schema, extensionRegistryLite);
    }

    private <T> void mergeMessageFieldInternal(T t, com.google.crypto.tink.shaded.protobuf.Schema<T> schema, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
        int readUInt32 = this.input.readUInt32();
        if (this.input.recursionDepth >= this.input.recursionLimit) {
            throw com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.recursionLimitExceeded();
        }
        int pushLimit = this.input.pushLimit(readUInt32);
        this.input.recursionDepth++;
        schema.mergeFrom(t, this, extensionRegistryLite);
        this.input.checkLastTagWas(0);
        com.google.crypto.tink.shaded.protobuf.CodedInputStream codedInputStream = this.input;
        codedInputStream.recursionDepth--;
        this.input.popLimit(pushLimit);
    }

    private <T> T readMessage(com.google.crypto.tink.shaded.protobuf.Schema<T> schema, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
        T newInstance = schema.newInstance();
        mergeMessageFieldInternal(newInstance, schema, extensionRegistryLite);
        schema.makeImmutable(newInstance);
        return newInstance;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Reader
    public final <T> void mergeGroupField(T t, com.google.crypto.tink.shaded.protobuf.Schema<T> schema, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
        requireWireType(3);
        mergeGroupFieldInternal(t, schema, extensionRegistryLite);
    }

    private <T> void mergeGroupFieldInternal(T t, com.google.crypto.tink.shaded.protobuf.Schema<T> schema, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
        int i = this.endGroupTag;
        this.endGroupTag = com.google.crypto.tink.shaded.protobuf.WireFormat.makeTag(com.google.crypto.tink.shaded.protobuf.WireFormat.getTagFieldNumber(this.tag), 4);
        try {
            schema.mergeFrom(t, this, extensionRegistryLite);
            if (this.tag == this.endGroupTag) {
            } else {
                throw com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.parseFailure();
            }
        } finally {
            this.endGroupTag = i;
        }
    }

    private <T> T readGroup(com.google.crypto.tink.shaded.protobuf.Schema<T> schema, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
        T newInstance = schema.newInstance();
        mergeGroupFieldInternal(newInstance, schema, extensionRegistryLite);
        schema.makeImmutable(newInstance);
        return newInstance;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Reader
    public final com.google.crypto.tink.shaded.protobuf.ByteString readBytes() throws java.io.IOException {
        requireWireType(2);
        return this.input.readBytes();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Reader
    public final int readUInt32() throws java.io.IOException {
        requireWireType(0);
        return this.input.readUInt32();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Reader
    public final int readEnum() throws java.io.IOException {
        requireWireType(0);
        return this.input.readEnum();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Reader
    public final int readSFixed32() throws java.io.IOException {
        requireWireType(5);
        return this.input.readSFixed32();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Reader
    public final long readSFixed64() throws java.io.IOException {
        requireWireType(1);
        return this.input.readSFixed64();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Reader
    public final int readSInt32() throws java.io.IOException {
        requireWireType(0);
        return this.input.readSInt32();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Reader
    public final long readSInt64() throws java.io.IOException {
        requireWireType(0);
        return this.input.readSInt64();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Reader
    public final void readDoubleList(java.util.List<java.lang.Double> list) throws java.io.IOException {
        int readTag;
        int readTag2;
        if (list instanceof com.google.crypto.tink.shaded.protobuf.DoubleArrayList) {
            com.google.crypto.tink.shaded.protobuf.DoubleArrayList doubleArrayList = (com.google.crypto.tink.shaded.protobuf.DoubleArrayList) list;
            int tagWireType = com.google.crypto.tink.shaded.protobuf.WireFormat.getTagWireType(this.tag);
            if (tagWireType == 1) {
                do {
                    doubleArrayList.addDouble(this.input.readDouble());
                    if (this.input.isAtEnd()) {
                        return;
                    } else {
                        readTag2 = this.input.readTag();
                    }
                } while (readTag2 == this.tag);
                this.nextTag = readTag2;
                return;
            }
            if (tagWireType == 2) {
                int readUInt32 = this.input.readUInt32();
                verifyPackedFixed64Length(readUInt32);
                int totalBytesRead = this.input.getTotalBytesRead();
                do {
                    doubleArrayList.addDouble(this.input.readDouble());
                } while (this.input.getTotalBytesRead() < totalBytesRead + readUInt32);
                return;
            }
            throw com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.invalidWireType();
        }
        int tagWireType2 = com.google.crypto.tink.shaded.protobuf.WireFormat.getTagWireType(this.tag);
        if (tagWireType2 == 1) {
            do {
                list.add(java.lang.Double.valueOf(this.input.readDouble()));
                if (this.input.isAtEnd()) {
                    return;
                } else {
                    readTag = this.input.readTag();
                }
            } while (readTag == this.tag);
            this.nextTag = readTag;
            return;
        }
        if (tagWireType2 == 2) {
            int readUInt322 = this.input.readUInt32();
            verifyPackedFixed64Length(readUInt322);
            int totalBytesRead2 = this.input.getTotalBytesRead();
            do {
                list.add(java.lang.Double.valueOf(this.input.readDouble()));
            } while (this.input.getTotalBytesRead() < totalBytesRead2 + readUInt322);
            return;
        }
        throw com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.invalidWireType();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Reader
    public final void readFloatList(java.util.List<java.lang.Float> list) throws java.io.IOException {
        int readTag;
        int readTag2;
        if (list instanceof com.google.crypto.tink.shaded.protobuf.FloatArrayList) {
            com.google.crypto.tink.shaded.protobuf.FloatArrayList floatArrayList = (com.google.crypto.tink.shaded.protobuf.FloatArrayList) list;
            int tagWireType = com.google.crypto.tink.shaded.protobuf.WireFormat.getTagWireType(this.tag);
            if (tagWireType == 2) {
                int readUInt32 = this.input.readUInt32();
                verifyPackedFixed32Length(readUInt32);
                int totalBytesRead = this.input.getTotalBytesRead();
                do {
                    floatArrayList.addFloat(this.input.readFloat());
                } while (this.input.getTotalBytesRead() < totalBytesRead + readUInt32);
                return;
            }
            if (tagWireType == 5) {
                do {
                    floatArrayList.addFloat(this.input.readFloat());
                    if (this.input.isAtEnd()) {
                        return;
                    } else {
                        readTag2 = this.input.readTag();
                    }
                } while (readTag2 == this.tag);
                this.nextTag = readTag2;
                return;
            }
            throw com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.invalidWireType();
        }
        int tagWireType2 = com.google.crypto.tink.shaded.protobuf.WireFormat.getTagWireType(this.tag);
        if (tagWireType2 == 2) {
            int readUInt322 = this.input.readUInt32();
            verifyPackedFixed32Length(readUInt322);
            int totalBytesRead2 = this.input.getTotalBytesRead();
            do {
                list.add(java.lang.Float.valueOf(this.input.readFloat()));
            } while (this.input.getTotalBytesRead() < totalBytesRead2 + readUInt322);
            return;
        }
        if (tagWireType2 == 5) {
            do {
                list.add(java.lang.Float.valueOf(this.input.readFloat()));
                if (this.input.isAtEnd()) {
                    return;
                } else {
                    readTag = this.input.readTag();
                }
            } while (readTag == this.tag);
            this.nextTag = readTag;
            return;
        }
        throw com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.invalidWireType();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Reader
    public final void readUInt64List(java.util.List<java.lang.Long> list) throws java.io.IOException {
        int readTag;
        int readTag2;
        if (list instanceof com.google.crypto.tink.shaded.protobuf.LongArrayList) {
            com.google.crypto.tink.shaded.protobuf.LongArrayList longArrayList = (com.google.crypto.tink.shaded.protobuf.LongArrayList) list;
            int tagWireType = com.google.crypto.tink.shaded.protobuf.WireFormat.getTagWireType(this.tag);
            if (tagWireType == 0) {
                do {
                    longArrayList.addLong(this.input.readUInt64());
                    if (this.input.isAtEnd()) {
                        return;
                    } else {
                        readTag2 = this.input.readTag();
                    }
                } while (readTag2 == this.tag);
                this.nextTag = readTag2;
                return;
            }
            if (tagWireType == 2) {
                int totalBytesRead = this.input.getTotalBytesRead() + this.input.readUInt32();
                do {
                    longArrayList.addLong(this.input.readUInt64());
                } while (this.input.getTotalBytesRead() < totalBytesRead);
                requirePosition(totalBytesRead);
                return;
            }
            throw com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.invalidWireType();
        }
        int tagWireType2 = com.google.crypto.tink.shaded.protobuf.WireFormat.getTagWireType(this.tag);
        if (tagWireType2 == 0) {
            do {
                list.add(java.lang.Long.valueOf(this.input.readUInt64()));
                if (this.input.isAtEnd()) {
                    return;
                } else {
                    readTag = this.input.readTag();
                }
            } while (readTag == this.tag);
            this.nextTag = readTag;
            return;
        }
        if (tagWireType2 == 2) {
            int totalBytesRead2 = this.input.getTotalBytesRead() + this.input.readUInt32();
            do {
                list.add(java.lang.Long.valueOf(this.input.readUInt64()));
            } while (this.input.getTotalBytesRead() < totalBytesRead2);
            requirePosition(totalBytesRead2);
            return;
        }
        throw com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.invalidWireType();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Reader
    public final void readInt64List(java.util.List<java.lang.Long> list) throws java.io.IOException {
        int readTag;
        int readTag2;
        if (list instanceof com.google.crypto.tink.shaded.protobuf.LongArrayList) {
            com.google.crypto.tink.shaded.protobuf.LongArrayList longArrayList = (com.google.crypto.tink.shaded.protobuf.LongArrayList) list;
            int tagWireType = com.google.crypto.tink.shaded.protobuf.WireFormat.getTagWireType(this.tag);
            if (tagWireType == 0) {
                do {
                    longArrayList.addLong(this.input.readInt64());
                    if (this.input.isAtEnd()) {
                        return;
                    } else {
                        readTag2 = this.input.readTag();
                    }
                } while (readTag2 == this.tag);
                this.nextTag = readTag2;
                return;
            }
            if (tagWireType == 2) {
                int totalBytesRead = this.input.getTotalBytesRead() + this.input.readUInt32();
                do {
                    longArrayList.addLong(this.input.readInt64());
                } while (this.input.getTotalBytesRead() < totalBytesRead);
                requirePosition(totalBytesRead);
                return;
            }
            throw com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.invalidWireType();
        }
        int tagWireType2 = com.google.crypto.tink.shaded.protobuf.WireFormat.getTagWireType(this.tag);
        if (tagWireType2 == 0) {
            do {
                list.add(java.lang.Long.valueOf(this.input.readInt64()));
                if (this.input.isAtEnd()) {
                    return;
                } else {
                    readTag = this.input.readTag();
                }
            } while (readTag == this.tag);
            this.nextTag = readTag;
            return;
        }
        if (tagWireType2 == 2) {
            int totalBytesRead2 = this.input.getTotalBytesRead() + this.input.readUInt32();
            do {
                list.add(java.lang.Long.valueOf(this.input.readInt64()));
            } while (this.input.getTotalBytesRead() < totalBytesRead2);
            requirePosition(totalBytesRead2);
            return;
        }
        throw com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.invalidWireType();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Reader
    public final void readInt32List(java.util.List<java.lang.Integer> list) throws java.io.IOException {
        int readTag;
        int readTag2;
        if (list instanceof com.google.crypto.tink.shaded.protobuf.IntArrayList) {
            com.google.crypto.tink.shaded.protobuf.IntArrayList intArrayList = (com.google.crypto.tink.shaded.protobuf.IntArrayList) list;
            int tagWireType = com.google.crypto.tink.shaded.protobuf.WireFormat.getTagWireType(this.tag);
            if (tagWireType == 0) {
                do {
                    intArrayList.addInt(this.input.readInt32());
                    if (this.input.isAtEnd()) {
                        return;
                    } else {
                        readTag2 = this.input.readTag();
                    }
                } while (readTag2 == this.tag);
                this.nextTag = readTag2;
                return;
            }
            if (tagWireType == 2) {
                int totalBytesRead = this.input.getTotalBytesRead() + this.input.readUInt32();
                do {
                    intArrayList.addInt(this.input.readInt32());
                } while (this.input.getTotalBytesRead() < totalBytesRead);
                requirePosition(totalBytesRead);
                return;
            }
            throw com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.invalidWireType();
        }
        int tagWireType2 = com.google.crypto.tink.shaded.protobuf.WireFormat.getTagWireType(this.tag);
        if (tagWireType2 == 0) {
            do {
                list.add(java.lang.Integer.valueOf(this.input.readInt32()));
                if (this.input.isAtEnd()) {
                    return;
                } else {
                    readTag = this.input.readTag();
                }
            } while (readTag == this.tag);
            this.nextTag = readTag;
            return;
        }
        if (tagWireType2 == 2) {
            int totalBytesRead2 = this.input.getTotalBytesRead() + this.input.readUInt32();
            do {
                list.add(java.lang.Integer.valueOf(this.input.readInt32()));
            } while (this.input.getTotalBytesRead() < totalBytesRead2);
            requirePosition(totalBytesRead2);
            return;
        }
        throw com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.invalidWireType();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Reader
    public final void readFixed64List(java.util.List<java.lang.Long> list) throws java.io.IOException {
        int readTag;
        int readTag2;
        if (list instanceof com.google.crypto.tink.shaded.protobuf.LongArrayList) {
            com.google.crypto.tink.shaded.protobuf.LongArrayList longArrayList = (com.google.crypto.tink.shaded.protobuf.LongArrayList) list;
            int tagWireType = com.google.crypto.tink.shaded.protobuf.WireFormat.getTagWireType(this.tag);
            if (tagWireType == 1) {
                do {
                    longArrayList.addLong(this.input.readFixed64());
                    if (this.input.isAtEnd()) {
                        return;
                    } else {
                        readTag2 = this.input.readTag();
                    }
                } while (readTag2 == this.tag);
                this.nextTag = readTag2;
                return;
            }
            if (tagWireType == 2) {
                int readUInt32 = this.input.readUInt32();
                verifyPackedFixed64Length(readUInt32);
                int totalBytesRead = this.input.getTotalBytesRead();
                do {
                    longArrayList.addLong(this.input.readFixed64());
                } while (this.input.getTotalBytesRead() < totalBytesRead + readUInt32);
                return;
            }
            throw com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.invalidWireType();
        }
        int tagWireType2 = com.google.crypto.tink.shaded.protobuf.WireFormat.getTagWireType(this.tag);
        if (tagWireType2 == 1) {
            do {
                list.add(java.lang.Long.valueOf(this.input.readFixed64()));
                if (this.input.isAtEnd()) {
                    return;
                } else {
                    readTag = this.input.readTag();
                }
            } while (readTag == this.tag);
            this.nextTag = readTag;
            return;
        }
        if (tagWireType2 == 2) {
            int readUInt322 = this.input.readUInt32();
            verifyPackedFixed64Length(readUInt322);
            int totalBytesRead2 = this.input.getTotalBytesRead();
            do {
                list.add(java.lang.Long.valueOf(this.input.readFixed64()));
            } while (this.input.getTotalBytesRead() < totalBytesRead2 + readUInt322);
            return;
        }
        throw com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.invalidWireType();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Reader
    public final void readFixed32List(java.util.List<java.lang.Integer> list) throws java.io.IOException {
        int readTag;
        int readTag2;
        if (list instanceof com.google.crypto.tink.shaded.protobuf.IntArrayList) {
            com.google.crypto.tink.shaded.protobuf.IntArrayList intArrayList = (com.google.crypto.tink.shaded.protobuf.IntArrayList) list;
            int tagWireType = com.google.crypto.tink.shaded.protobuf.WireFormat.getTagWireType(this.tag);
            if (tagWireType == 2) {
                int readUInt32 = this.input.readUInt32();
                verifyPackedFixed32Length(readUInt32);
                int totalBytesRead = this.input.getTotalBytesRead();
                do {
                    intArrayList.addInt(this.input.readFixed32());
                } while (this.input.getTotalBytesRead() < totalBytesRead + readUInt32);
                return;
            }
            if (tagWireType == 5) {
                do {
                    intArrayList.addInt(this.input.readFixed32());
                    if (this.input.isAtEnd()) {
                        return;
                    } else {
                        readTag2 = this.input.readTag();
                    }
                } while (readTag2 == this.tag);
                this.nextTag = readTag2;
                return;
            }
            throw com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.invalidWireType();
        }
        int tagWireType2 = com.google.crypto.tink.shaded.protobuf.WireFormat.getTagWireType(this.tag);
        if (tagWireType2 == 2) {
            int readUInt322 = this.input.readUInt32();
            verifyPackedFixed32Length(readUInt322);
            int totalBytesRead2 = this.input.getTotalBytesRead();
            do {
                list.add(java.lang.Integer.valueOf(this.input.readFixed32()));
            } while (this.input.getTotalBytesRead() < totalBytesRead2 + readUInt322);
            return;
        }
        if (tagWireType2 == 5) {
            do {
                list.add(java.lang.Integer.valueOf(this.input.readFixed32()));
                if (this.input.isAtEnd()) {
                    return;
                } else {
                    readTag = this.input.readTag();
                }
            } while (readTag == this.tag);
            this.nextTag = readTag;
            return;
        }
        throw com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.invalidWireType();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Reader
    public final void readBoolList(java.util.List<java.lang.Boolean> list) throws java.io.IOException {
        int readTag;
        int readTag2;
        if (list instanceof com.google.crypto.tink.shaded.protobuf.BooleanArrayList) {
            com.google.crypto.tink.shaded.protobuf.BooleanArrayList booleanArrayList = (com.google.crypto.tink.shaded.protobuf.BooleanArrayList) list;
            int tagWireType = com.google.crypto.tink.shaded.protobuf.WireFormat.getTagWireType(this.tag);
            if (tagWireType == 0) {
                do {
                    booleanArrayList.addBoolean(this.input.readBool());
                    if (this.input.isAtEnd()) {
                        return;
                    } else {
                        readTag2 = this.input.readTag();
                    }
                } while (readTag2 == this.tag);
                this.nextTag = readTag2;
                return;
            }
            if (tagWireType == 2) {
                int totalBytesRead = this.input.getTotalBytesRead() + this.input.readUInt32();
                do {
                    booleanArrayList.addBoolean(this.input.readBool());
                } while (this.input.getTotalBytesRead() < totalBytesRead);
                requirePosition(totalBytesRead);
                return;
            }
            throw com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.invalidWireType();
        }
        int tagWireType2 = com.google.crypto.tink.shaded.protobuf.WireFormat.getTagWireType(this.tag);
        if (tagWireType2 == 0) {
            do {
                list.add(java.lang.Boolean.valueOf(this.input.readBool()));
                if (this.input.isAtEnd()) {
                    return;
                } else {
                    readTag = this.input.readTag();
                }
            } while (readTag == this.tag);
            this.nextTag = readTag;
            return;
        }
        if (tagWireType2 == 2) {
            int totalBytesRead2 = this.input.getTotalBytesRead() + this.input.readUInt32();
            do {
                list.add(java.lang.Boolean.valueOf(this.input.readBool()));
            } while (this.input.getTotalBytesRead() < totalBytesRead2);
            requirePosition(totalBytesRead2);
            return;
        }
        throw com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.invalidWireType();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Reader
    public final void readStringList(java.util.List<java.lang.String> list) throws java.io.IOException {
        readStringListInternal(list, false);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Reader
    public final void readStringListRequireUtf8(java.util.List<java.lang.String> list) throws java.io.IOException {
        readStringListInternal(list, true);
    }

    public final void readStringListInternal(java.util.List<java.lang.String> list, boolean z) throws java.io.IOException {
        int readTag;
        int readTag2;
        if (com.google.crypto.tink.shaded.protobuf.WireFormat.getTagWireType(this.tag) != 2) {
            throw com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.invalidWireType();
        }
        if ((list instanceof com.google.crypto.tink.shaded.protobuf.LazyStringList) && !z) {
            com.google.crypto.tink.shaded.protobuf.LazyStringList lazyStringList = (com.google.crypto.tink.shaded.protobuf.LazyStringList) list;
            do {
                lazyStringList.add(readBytes());
                if (this.input.isAtEnd()) {
                    return;
                } else {
                    readTag2 = this.input.readTag();
                }
            } while (readTag2 == this.tag);
            this.nextTag = readTag2;
            return;
        }
        do {
            list.add(z ? readStringRequireUtf8() : readString());
            if (this.input.isAtEnd()) {
                return;
            } else {
                readTag = this.input.readTag();
            }
        } while (readTag == this.tag);
        this.nextTag = readTag;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Reader
    public final <T> void readMessageList(java.util.List<T> list, java.lang.Class<T> cls, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
        readMessageList(list, com.google.crypto.tink.shaded.protobuf.Protobuf.getInstance().schemaFor((java.lang.Class) cls), extensionRegistryLite);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.crypto.tink.shaded.protobuf.Reader
    public final <T> void readMessageList(java.util.List<T> list, com.google.crypto.tink.shaded.protobuf.Schema<T> schema, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
        int readTag;
        if (com.google.crypto.tink.shaded.protobuf.WireFormat.getTagWireType(this.tag) != 2) {
            throw com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.invalidWireType();
        }
        int i = this.tag;
        do {
            list.add(readMessage(schema, extensionRegistryLite));
            if (this.input.isAtEnd() || this.nextTag != 0) {
                return;
            } else {
                readTag = this.input.readTag();
            }
        } while (readTag == i);
        this.nextTag = readTag;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Reader
    @java.lang.Deprecated
    public final <T> void readGroupList(java.util.List<T> list, java.lang.Class<T> cls, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
        readGroupList(list, com.google.crypto.tink.shaded.protobuf.Protobuf.getInstance().schemaFor((java.lang.Class) cls), extensionRegistryLite);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.crypto.tink.shaded.protobuf.Reader
    @java.lang.Deprecated
    public final <T> void readGroupList(java.util.List<T> list, com.google.crypto.tink.shaded.protobuf.Schema<T> schema, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
        int readTag;
        if (com.google.crypto.tink.shaded.protobuf.WireFormat.getTagWireType(this.tag) != 3) {
            throw com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.invalidWireType();
        }
        int i = this.tag;
        do {
            list.add(readGroup(schema, extensionRegistryLite));
            if (this.input.isAtEnd() || this.nextTag != 0) {
                return;
            } else {
                readTag = this.input.readTag();
            }
        } while (readTag == i);
        this.nextTag = readTag;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Reader
    public final void readBytesList(java.util.List<com.google.crypto.tink.shaded.protobuf.ByteString> list) throws java.io.IOException {
        int readTag;
        if (com.google.crypto.tink.shaded.protobuf.WireFormat.getTagWireType(this.tag) != 2) {
            throw com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.invalidWireType();
        }
        do {
            list.add(readBytes());
            if (this.input.isAtEnd()) {
                return;
            } else {
                readTag = this.input.readTag();
            }
        } while (readTag == this.tag);
        this.nextTag = readTag;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Reader
    public final void readUInt32List(java.util.List<java.lang.Integer> list) throws java.io.IOException {
        int readTag;
        int readTag2;
        if (list instanceof com.google.crypto.tink.shaded.protobuf.IntArrayList) {
            com.google.crypto.tink.shaded.protobuf.IntArrayList intArrayList = (com.google.crypto.tink.shaded.protobuf.IntArrayList) list;
            int tagWireType = com.google.crypto.tink.shaded.protobuf.WireFormat.getTagWireType(this.tag);
            if (tagWireType == 0) {
                do {
                    intArrayList.addInt(this.input.readUInt32());
                    if (this.input.isAtEnd()) {
                        return;
                    } else {
                        readTag2 = this.input.readTag();
                    }
                } while (readTag2 == this.tag);
                this.nextTag = readTag2;
                return;
            }
            if (tagWireType == 2) {
                int totalBytesRead = this.input.getTotalBytesRead() + this.input.readUInt32();
                do {
                    intArrayList.addInt(this.input.readUInt32());
                } while (this.input.getTotalBytesRead() < totalBytesRead);
                requirePosition(totalBytesRead);
                return;
            }
            throw com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.invalidWireType();
        }
        int tagWireType2 = com.google.crypto.tink.shaded.protobuf.WireFormat.getTagWireType(this.tag);
        if (tagWireType2 == 0) {
            do {
                list.add(java.lang.Integer.valueOf(this.input.readUInt32()));
                if (this.input.isAtEnd()) {
                    return;
                } else {
                    readTag = this.input.readTag();
                }
            } while (readTag == this.tag);
            this.nextTag = readTag;
            return;
        }
        if (tagWireType2 == 2) {
            int totalBytesRead2 = this.input.getTotalBytesRead() + this.input.readUInt32();
            do {
                list.add(java.lang.Integer.valueOf(this.input.readUInt32()));
            } while (this.input.getTotalBytesRead() < totalBytesRead2);
            requirePosition(totalBytesRead2);
            return;
        }
        throw com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.invalidWireType();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Reader
    public final void readEnumList(java.util.List<java.lang.Integer> list) throws java.io.IOException {
        int readTag;
        int readTag2;
        if (list instanceof com.google.crypto.tink.shaded.protobuf.IntArrayList) {
            com.google.crypto.tink.shaded.protobuf.IntArrayList intArrayList = (com.google.crypto.tink.shaded.protobuf.IntArrayList) list;
            int tagWireType = com.google.crypto.tink.shaded.protobuf.WireFormat.getTagWireType(this.tag);
            if (tagWireType == 0) {
                do {
                    intArrayList.addInt(this.input.readEnum());
                    if (this.input.isAtEnd()) {
                        return;
                    } else {
                        readTag2 = this.input.readTag();
                    }
                } while (readTag2 == this.tag);
                this.nextTag = readTag2;
                return;
            }
            if (tagWireType == 2) {
                int totalBytesRead = this.input.getTotalBytesRead() + this.input.readUInt32();
                do {
                    intArrayList.addInt(this.input.readEnum());
                } while (this.input.getTotalBytesRead() < totalBytesRead);
                requirePosition(totalBytesRead);
                return;
            }
            throw com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.invalidWireType();
        }
        int tagWireType2 = com.google.crypto.tink.shaded.protobuf.WireFormat.getTagWireType(this.tag);
        if (tagWireType2 == 0) {
            do {
                list.add(java.lang.Integer.valueOf(this.input.readEnum()));
                if (this.input.isAtEnd()) {
                    return;
                } else {
                    readTag = this.input.readTag();
                }
            } while (readTag == this.tag);
            this.nextTag = readTag;
            return;
        }
        if (tagWireType2 == 2) {
            int totalBytesRead2 = this.input.getTotalBytesRead() + this.input.readUInt32();
            do {
                list.add(java.lang.Integer.valueOf(this.input.readEnum()));
            } while (this.input.getTotalBytesRead() < totalBytesRead2);
            requirePosition(totalBytesRead2);
            return;
        }
        throw com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.invalidWireType();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Reader
    public final void readSFixed32List(java.util.List<java.lang.Integer> list) throws java.io.IOException {
        int readTag;
        int readTag2;
        if (list instanceof com.google.crypto.tink.shaded.protobuf.IntArrayList) {
            com.google.crypto.tink.shaded.protobuf.IntArrayList intArrayList = (com.google.crypto.tink.shaded.protobuf.IntArrayList) list;
            int tagWireType = com.google.crypto.tink.shaded.protobuf.WireFormat.getTagWireType(this.tag);
            if (tagWireType == 2) {
                int readUInt32 = this.input.readUInt32();
                verifyPackedFixed32Length(readUInt32);
                int totalBytesRead = this.input.getTotalBytesRead();
                do {
                    intArrayList.addInt(this.input.readSFixed32());
                } while (this.input.getTotalBytesRead() < totalBytesRead + readUInt32);
                return;
            }
            if (tagWireType == 5) {
                do {
                    intArrayList.addInt(this.input.readSFixed32());
                    if (this.input.isAtEnd()) {
                        return;
                    } else {
                        readTag2 = this.input.readTag();
                    }
                } while (readTag2 == this.tag);
                this.nextTag = readTag2;
                return;
            }
            throw com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.invalidWireType();
        }
        int tagWireType2 = com.google.crypto.tink.shaded.protobuf.WireFormat.getTagWireType(this.tag);
        if (tagWireType2 == 2) {
            int readUInt322 = this.input.readUInt32();
            verifyPackedFixed32Length(readUInt322);
            int totalBytesRead2 = this.input.getTotalBytesRead();
            do {
                list.add(java.lang.Integer.valueOf(this.input.readSFixed32()));
            } while (this.input.getTotalBytesRead() < totalBytesRead2 + readUInt322);
            return;
        }
        if (tagWireType2 == 5) {
            do {
                list.add(java.lang.Integer.valueOf(this.input.readSFixed32()));
                if (this.input.isAtEnd()) {
                    return;
                } else {
                    readTag = this.input.readTag();
                }
            } while (readTag == this.tag);
            this.nextTag = readTag;
            return;
        }
        throw com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.invalidWireType();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Reader
    public final void readSFixed64List(java.util.List<java.lang.Long> list) throws java.io.IOException {
        int readTag;
        int readTag2;
        if (list instanceof com.google.crypto.tink.shaded.protobuf.LongArrayList) {
            com.google.crypto.tink.shaded.protobuf.LongArrayList longArrayList = (com.google.crypto.tink.shaded.protobuf.LongArrayList) list;
            int tagWireType = com.google.crypto.tink.shaded.protobuf.WireFormat.getTagWireType(this.tag);
            if (tagWireType == 1) {
                do {
                    longArrayList.addLong(this.input.readSFixed64());
                    if (this.input.isAtEnd()) {
                        return;
                    } else {
                        readTag2 = this.input.readTag();
                    }
                } while (readTag2 == this.tag);
                this.nextTag = readTag2;
                return;
            }
            if (tagWireType == 2) {
                int readUInt32 = this.input.readUInt32();
                verifyPackedFixed64Length(readUInt32);
                int totalBytesRead = this.input.getTotalBytesRead();
                do {
                    longArrayList.addLong(this.input.readSFixed64());
                } while (this.input.getTotalBytesRead() < totalBytesRead + readUInt32);
                return;
            }
            throw com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.invalidWireType();
        }
        int tagWireType2 = com.google.crypto.tink.shaded.protobuf.WireFormat.getTagWireType(this.tag);
        if (tagWireType2 == 1) {
            do {
                list.add(java.lang.Long.valueOf(this.input.readSFixed64()));
                if (this.input.isAtEnd()) {
                    return;
                } else {
                    readTag = this.input.readTag();
                }
            } while (readTag == this.tag);
            this.nextTag = readTag;
            return;
        }
        if (tagWireType2 == 2) {
            int readUInt322 = this.input.readUInt32();
            verifyPackedFixed64Length(readUInt322);
            int totalBytesRead2 = this.input.getTotalBytesRead();
            do {
                list.add(java.lang.Long.valueOf(this.input.readSFixed64()));
            } while (this.input.getTotalBytesRead() < totalBytesRead2 + readUInt322);
            return;
        }
        throw com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.invalidWireType();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Reader
    public final void readSInt32List(java.util.List<java.lang.Integer> list) throws java.io.IOException {
        int readTag;
        int readTag2;
        if (list instanceof com.google.crypto.tink.shaded.protobuf.IntArrayList) {
            com.google.crypto.tink.shaded.protobuf.IntArrayList intArrayList = (com.google.crypto.tink.shaded.protobuf.IntArrayList) list;
            int tagWireType = com.google.crypto.tink.shaded.protobuf.WireFormat.getTagWireType(this.tag);
            if (tagWireType == 0) {
                do {
                    intArrayList.addInt(this.input.readSInt32());
                    if (this.input.isAtEnd()) {
                        return;
                    } else {
                        readTag2 = this.input.readTag();
                    }
                } while (readTag2 == this.tag);
                this.nextTag = readTag2;
                return;
            }
            if (tagWireType == 2) {
                int totalBytesRead = this.input.getTotalBytesRead() + this.input.readUInt32();
                do {
                    intArrayList.addInt(this.input.readSInt32());
                } while (this.input.getTotalBytesRead() < totalBytesRead);
                requirePosition(totalBytesRead);
                return;
            }
            throw com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.invalidWireType();
        }
        int tagWireType2 = com.google.crypto.tink.shaded.protobuf.WireFormat.getTagWireType(this.tag);
        if (tagWireType2 == 0) {
            do {
                list.add(java.lang.Integer.valueOf(this.input.readSInt32()));
                if (this.input.isAtEnd()) {
                    return;
                } else {
                    readTag = this.input.readTag();
                }
            } while (readTag == this.tag);
            this.nextTag = readTag;
            return;
        }
        if (tagWireType2 == 2) {
            int totalBytesRead2 = this.input.getTotalBytesRead() + this.input.readUInt32();
            do {
                list.add(java.lang.Integer.valueOf(this.input.readSInt32()));
            } while (this.input.getTotalBytesRead() < totalBytesRead2);
            requirePosition(totalBytesRead2);
            return;
        }
        throw com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.invalidWireType();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Reader
    public final void readSInt64List(java.util.List<java.lang.Long> list) throws java.io.IOException {
        int readTag;
        int readTag2;
        if (list instanceof com.google.crypto.tink.shaded.protobuf.LongArrayList) {
            com.google.crypto.tink.shaded.protobuf.LongArrayList longArrayList = (com.google.crypto.tink.shaded.protobuf.LongArrayList) list;
            int tagWireType = com.google.crypto.tink.shaded.protobuf.WireFormat.getTagWireType(this.tag);
            if (tagWireType == 0) {
                do {
                    longArrayList.addLong(this.input.readSInt64());
                    if (this.input.isAtEnd()) {
                        return;
                    } else {
                        readTag2 = this.input.readTag();
                    }
                } while (readTag2 == this.tag);
                this.nextTag = readTag2;
                return;
            }
            if (tagWireType == 2) {
                int totalBytesRead = this.input.getTotalBytesRead() + this.input.readUInt32();
                do {
                    longArrayList.addLong(this.input.readSInt64());
                } while (this.input.getTotalBytesRead() < totalBytesRead);
                requirePosition(totalBytesRead);
                return;
            }
            throw com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.invalidWireType();
        }
        int tagWireType2 = com.google.crypto.tink.shaded.protobuf.WireFormat.getTagWireType(this.tag);
        if (tagWireType2 == 0) {
            do {
                list.add(java.lang.Long.valueOf(this.input.readSInt64()));
                if (this.input.isAtEnd()) {
                    return;
                } else {
                    readTag = this.input.readTag();
                }
            } while (readTag == this.tag);
            this.nextTag = readTag;
            return;
        }
        if (tagWireType2 == 2) {
            int totalBytesRead2 = this.input.getTotalBytesRead() + this.input.readUInt32();
            do {
                list.add(java.lang.Long.valueOf(this.input.readSInt64()));
            } while (this.input.getTotalBytesRead() < totalBytesRead2);
            requirePosition(totalBytesRead2);
            return;
        }
        throw com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.invalidWireType();
    }

    private void verifyPackedFixed64Length(int i) throws java.io.IOException {
        if ((i & 7) != 0) {
            throw com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.parseFailure();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x005b, code lost:
    
        r8.put(r2, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0063, code lost:
    
        return;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.crypto.tink.shaded.protobuf.Reader
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final <K, V> void readMap(java.util.Map<K, V> map, com.google.crypto.tink.shaded.protobuf.MapEntryLite.Metadata<K, V> metadata, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
        requireWireType(2);
        int pushLimit = this.input.pushLimit(this.input.readUInt32());
        java.lang.Object obj = metadata.defaultKey;
        java.lang.Object obj2 = metadata.defaultValue;
        while (true) {
            try {
                int fieldNumber = getFieldNumber();
                if (fieldNumber == Integer.MAX_VALUE || this.input.isAtEnd()) {
                    break;
                }
                if (fieldNumber == 1) {
                    obj = readField(metadata.keyType, null, null);
                } else if (fieldNumber == 2) {
                    obj2 = readField(metadata.valueType, metadata.defaultValue.getClass(), extensionRegistryLite);
                } else {
                    try {
                        if (!skipField()) {
                            throw new com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException("Unable to parse map entry.");
                        }
                    } catch (com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException unused) {
                        if (!skipField()) {
                            throw new com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException("Unable to parse map entry.");
                        }
                    }
                }
            } finally {
                this.input.popLimit(pushLimit);
            }
        }
    }

    /* renamed from: com.google.crypto.tink.shaded.protobuf.CodedInputStreamReader$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$google$protobuf$WireFormat$FieldType;

        static {
            int[] iArr = new int[com.google.crypto.tink.shaded.protobuf.WireFormat.FieldType.values().length];
            $SwitchMap$com$google$protobuf$WireFormat$FieldType = iArr;
            try {
                iArr[com.google.crypto.tink.shaded.protobuf.WireFormat.FieldType.BOOL.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[com.google.crypto.tink.shaded.protobuf.WireFormat.FieldType.BYTES.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[com.google.crypto.tink.shaded.protobuf.WireFormat.FieldType.DOUBLE.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[com.google.crypto.tink.shaded.protobuf.WireFormat.FieldType.ENUM.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[com.google.crypto.tink.shaded.protobuf.WireFormat.FieldType.FIXED32.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[com.google.crypto.tink.shaded.protobuf.WireFormat.FieldType.FIXED64.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[com.google.crypto.tink.shaded.protobuf.WireFormat.FieldType.FLOAT.ordinal()] = 7;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[com.google.crypto.tink.shaded.protobuf.WireFormat.FieldType.INT32.ordinal()] = 8;
            } catch (java.lang.NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[com.google.crypto.tink.shaded.protobuf.WireFormat.FieldType.INT64.ordinal()] = 9;
            } catch (java.lang.NoSuchFieldError unused9) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[com.google.crypto.tink.shaded.protobuf.WireFormat.FieldType.MESSAGE.ordinal()] = 10;
            } catch (java.lang.NoSuchFieldError unused10) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[com.google.crypto.tink.shaded.protobuf.WireFormat.FieldType.SFIXED32.ordinal()] = 11;
            } catch (java.lang.NoSuchFieldError unused11) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[com.google.crypto.tink.shaded.protobuf.WireFormat.FieldType.SFIXED64.ordinal()] = 12;
            } catch (java.lang.NoSuchFieldError unused12) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[com.google.crypto.tink.shaded.protobuf.WireFormat.FieldType.SINT32.ordinal()] = 13;
            } catch (java.lang.NoSuchFieldError unused13) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[com.google.crypto.tink.shaded.protobuf.WireFormat.FieldType.SINT64.ordinal()] = 14;
            } catch (java.lang.NoSuchFieldError unused14) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[com.google.crypto.tink.shaded.protobuf.WireFormat.FieldType.STRING.ordinal()] = 15;
            } catch (java.lang.NoSuchFieldError unused15) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[com.google.crypto.tink.shaded.protobuf.WireFormat.FieldType.UINT32.ordinal()] = 16;
            } catch (java.lang.NoSuchFieldError unused16) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[com.google.crypto.tink.shaded.protobuf.WireFormat.FieldType.UINT64.ordinal()] = 17;
            } catch (java.lang.NoSuchFieldError unused17) {
            }
        }
    }

    private java.lang.Object readField(com.google.crypto.tink.shaded.protobuf.WireFormat.FieldType fieldType, java.lang.Class<?> cls, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
        switch (com.google.crypto.tink.shaded.protobuf.CodedInputStreamReader.AnonymousClass1.$SwitchMap$com$google$protobuf$WireFormat$FieldType[fieldType.ordinal()]) {
            case 1:
                return java.lang.Boolean.valueOf(readBool());
            case 2:
                return readBytes();
            case 3:
                return java.lang.Double.valueOf(readDouble());
            case 4:
                return java.lang.Integer.valueOf(readEnum());
            case 5:
                return java.lang.Integer.valueOf(readFixed32());
            case 6:
                return java.lang.Long.valueOf(readFixed64());
            case 7:
                return java.lang.Float.valueOf(readFloat());
            case 8:
                return java.lang.Integer.valueOf(readInt32());
            case 9:
                return java.lang.Long.valueOf(readInt64());
            case 10:
                return readMessage(cls, extensionRegistryLite);
            case 11:
                return java.lang.Integer.valueOf(readSFixed32());
            case 12:
                return java.lang.Long.valueOf(readSFixed64());
            case 13:
                return java.lang.Integer.valueOf(readSInt32());
            case 14:
                return java.lang.Long.valueOf(readSInt64());
            case 15:
                return readStringRequireUtf8();
            case 16:
                return java.lang.Integer.valueOf(readUInt32());
            case 17:
                return java.lang.Long.valueOf(readUInt64());
            default:
                throw new java.lang.IllegalArgumentException("unsupported field type.");
        }
    }

    private void verifyPackedFixed32Length(int i) throws java.io.IOException {
        if ((i & 3) != 0) {
            throw com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.parseFailure();
        }
    }

    private void requirePosition(int i) throws java.io.IOException {
        if (this.input.getTotalBytesRead() != i) {
            throw com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.truncatedMessage();
        }
    }
}
