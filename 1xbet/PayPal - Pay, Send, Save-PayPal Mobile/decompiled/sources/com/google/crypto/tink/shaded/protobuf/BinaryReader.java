package com.google.crypto.tink.shaded.protobuf;

@com.google.crypto.tink.shaded.protobuf.CheckReturnValue
/* loaded from: classes9.dex */
abstract class BinaryReader implements com.google.crypto.tink.shaded.protobuf.Reader {
    private static final int FIXED32_MULTIPLE_MASK = 3;
    private static final int FIXED64_MULTIPLE_MASK = 7;

    public abstract int getTotalBytesRead();

    @Override // com.google.crypto.tink.shaded.protobuf.Reader
    public boolean shouldDiscardUnknownFields() {
        return false;
    }

    /* synthetic */ BinaryReader(com.google.crypto.tink.shaded.protobuf.BinaryReader.AnonymousClass1 anonymousClass1) {
        this();
    }

    public static com.google.crypto.tink.shaded.protobuf.BinaryReader newInstance(java.nio.ByteBuffer byteBuffer, boolean z) {
        if (byteBuffer.hasArray()) {
            return new com.google.crypto.tink.shaded.protobuf.BinaryReader.SafeHeapReader(byteBuffer, z);
        }
        throw new java.lang.IllegalArgumentException("Direct buffers not yet supported");
    }

    private BinaryReader() {
    }

    static final class SafeHeapReader extends com.google.crypto.tink.shaded.protobuf.BinaryReader {
        private final byte[] buffer;
        private final boolean bufferIsImmutable;
        private int endGroupTag;
        private final int initialPos;
        private int limit;
        private int pos;
        private int tag;

        public SafeHeapReader(java.nio.ByteBuffer byteBuffer, boolean z) {
            super(null);
            this.bufferIsImmutable = z;
            this.buffer = byteBuffer.array();
            int arrayOffset = byteBuffer.arrayOffset() + byteBuffer.position();
            this.pos = arrayOffset;
            this.initialPos = arrayOffset;
            this.limit = byteBuffer.arrayOffset() + byteBuffer.limit();
        }

        private boolean isAtEnd() {
            return this.pos == this.limit;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.BinaryReader
        public final int getTotalBytesRead() {
            return this.pos - this.initialPos;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Reader
        public final int getFieldNumber() throws java.io.IOException {
            if (isAtEnd()) {
                return Integer.MAX_VALUE;
            }
            int readVarint32 = readVarint32();
            this.tag = readVarint32;
            if (readVarint32 == this.endGroupTag) {
                return Integer.MAX_VALUE;
            }
            return com.google.crypto.tink.shaded.protobuf.WireFormat.getTagFieldNumber(readVarint32);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Reader
        public final int getTag() {
            return this.tag;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Reader
        public final boolean skipField() throws java.io.IOException {
            int i;
            if (isAtEnd() || (i = this.tag) == this.endGroupTag) {
                return false;
            }
            int tagWireType = com.google.crypto.tink.shaded.protobuf.WireFormat.getTagWireType(i);
            if (tagWireType == 0) {
                skipVarint();
                return true;
            }
            if (tagWireType == 1) {
                skipBytes(8);
                return true;
            }
            if (tagWireType == 2) {
                skipBytes(readVarint32());
                return true;
            }
            if (tagWireType == 3) {
                skipGroup();
                return true;
            }
            if (tagWireType == 5) {
                skipBytes(4);
                return true;
            }
            throw com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.invalidWireType();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Reader
        public final double readDouble() throws java.io.IOException {
            requireWireType(1);
            return java.lang.Double.longBitsToDouble(readLittleEndian64());
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Reader
        public final float readFloat() throws java.io.IOException {
            requireWireType(5);
            return java.lang.Float.intBitsToFloat(readLittleEndian32());
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Reader
        public final long readUInt64() throws java.io.IOException {
            requireWireType(0);
            return readVarint64();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Reader
        public final long readInt64() throws java.io.IOException {
            requireWireType(0);
            return readVarint64();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Reader
        public final int readInt32() throws java.io.IOException {
            requireWireType(0);
            return readVarint32();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Reader
        public final long readFixed64() throws java.io.IOException {
            requireWireType(1);
            return readLittleEndian64();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Reader
        public final int readFixed32() throws java.io.IOException {
            requireWireType(5);
            return readLittleEndian32();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Reader
        public final boolean readBool() throws java.io.IOException {
            requireWireType(0);
            return readVarint32() != 0;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Reader
        public final java.lang.String readString() throws java.io.IOException {
            return readStringInternal(false);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Reader
        public final java.lang.String readStringRequireUtf8() throws java.io.IOException {
            return readStringInternal(true);
        }

        public final java.lang.String readStringInternal(boolean z) throws java.io.IOException {
            requireWireType(2);
            int readVarint32 = readVarint32();
            if (readVarint32 == 0) {
                return "";
            }
            requireBytes(readVarint32);
            if (z) {
                byte[] bArr = this.buffer;
                int i = this.pos;
                if (!com.google.crypto.tink.shaded.protobuf.Utf8.isValidUtf8(bArr, i, i + readVarint32)) {
                    throw com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.invalidUtf8();
                }
            }
            java.lang.String str = new java.lang.String(this.buffer, this.pos, readVarint32, com.google.crypto.tink.shaded.protobuf.Internal.UTF_8);
            this.pos += readVarint32;
            return str;
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

        private <T> T readMessage(com.google.crypto.tink.shaded.protobuf.Schema<T> schema, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
            T newInstance = schema.newInstance();
            mergeMessageField(newInstance, schema, extensionRegistryLite);
            schema.makeImmutable(newInstance);
            return newInstance;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Reader
        public final <T> void mergeMessageField(T t, com.google.crypto.tink.shaded.protobuf.Schema<T> schema, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
            int readVarint32 = readVarint32();
            requireBytes(readVarint32);
            int i = this.limit;
            int i2 = this.pos + readVarint32;
            this.limit = i2;
            try {
                schema.mergeFrom(t, this, extensionRegistryLite);
                if (this.pos == i2) {
                } else {
                    throw com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.parseFailure();
                }
            } finally {
                this.limit = i;
            }
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

        private <T> T readGroup(com.google.crypto.tink.shaded.protobuf.Schema<T> schema, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
            T newInstance = schema.newInstance();
            mergeGroupField(newInstance, schema, extensionRegistryLite);
            schema.makeImmutable(newInstance);
            return newInstance;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Reader
        public final <T> void mergeGroupField(T t, com.google.crypto.tink.shaded.protobuf.Schema<T> schema, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
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

        @Override // com.google.crypto.tink.shaded.protobuf.Reader
        public final com.google.crypto.tink.shaded.protobuf.ByteString readBytes() throws java.io.IOException {
            com.google.crypto.tink.shaded.protobuf.ByteString copyFrom;
            requireWireType(2);
            int readVarint32 = readVarint32();
            if (readVarint32 == 0) {
                return com.google.crypto.tink.shaded.protobuf.ByteString.EMPTY;
            }
            requireBytes(readVarint32);
            if (this.bufferIsImmutable) {
                copyFrom = com.google.crypto.tink.shaded.protobuf.ByteString.wrap(this.buffer, this.pos, readVarint32);
            } else {
                copyFrom = com.google.crypto.tink.shaded.protobuf.ByteString.copyFrom(this.buffer, this.pos, readVarint32);
            }
            this.pos += readVarint32;
            return copyFrom;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Reader
        public final int readUInt32() throws java.io.IOException {
            requireWireType(0);
            return readVarint32();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Reader
        public final int readEnum() throws java.io.IOException {
            requireWireType(0);
            return readVarint32();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Reader
        public final int readSFixed32() throws java.io.IOException {
            requireWireType(5);
            return readLittleEndian32();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Reader
        public final long readSFixed64() throws java.io.IOException {
            requireWireType(1);
            return readLittleEndian64();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Reader
        public final int readSInt32() throws java.io.IOException {
            requireWireType(0);
            return com.google.crypto.tink.shaded.protobuf.CodedInputStream.decodeZigZag32(readVarint32());
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Reader
        public final long readSInt64() throws java.io.IOException {
            requireWireType(0);
            return com.google.crypto.tink.shaded.protobuf.CodedInputStream.decodeZigZag64(readVarint64());
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Reader
        public final void readDoubleList(java.util.List<java.lang.Double> list) throws java.io.IOException {
            int i;
            int i2;
            if (list instanceof com.google.crypto.tink.shaded.protobuf.DoubleArrayList) {
                com.google.crypto.tink.shaded.protobuf.DoubleArrayList doubleArrayList = (com.google.crypto.tink.shaded.protobuf.DoubleArrayList) list;
                int tagWireType = com.google.crypto.tink.shaded.protobuf.WireFormat.getTagWireType(this.tag);
                if (tagWireType == 1) {
                    do {
                        doubleArrayList.addDouble(readDouble());
                        if (isAtEnd()) {
                            return;
                        } else {
                            i2 = this.pos;
                        }
                    } while (readVarint32() == this.tag);
                    this.pos = i2;
                    return;
                }
                if (tagWireType == 2) {
                    int readVarint32 = readVarint32();
                    verifyPackedFixed64Length(readVarint32);
                    int i3 = this.pos;
                    while (this.pos < i3 + readVarint32) {
                        doubleArrayList.addDouble(java.lang.Double.longBitsToDouble(readLittleEndian64_NoCheck()));
                    }
                    return;
                }
                throw com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.invalidWireType();
            }
            int tagWireType2 = com.google.crypto.tink.shaded.protobuf.WireFormat.getTagWireType(this.tag);
            if (tagWireType2 == 1) {
                do {
                    list.add(java.lang.Double.valueOf(readDouble()));
                    if (isAtEnd()) {
                        return;
                    } else {
                        i = this.pos;
                    }
                } while (readVarint32() == this.tag);
                this.pos = i;
                return;
            }
            if (tagWireType2 == 2) {
                int readVarint322 = readVarint32();
                verifyPackedFixed64Length(readVarint322);
                int i4 = this.pos;
                while (this.pos < i4 + readVarint322) {
                    list.add(java.lang.Double.valueOf(java.lang.Double.longBitsToDouble(readLittleEndian64_NoCheck())));
                }
                return;
            }
            throw com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.invalidWireType();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Reader
        public final void readFloatList(java.util.List<java.lang.Float> list) throws java.io.IOException {
            int i;
            int i2;
            if (list instanceof com.google.crypto.tink.shaded.protobuf.FloatArrayList) {
                com.google.crypto.tink.shaded.protobuf.FloatArrayList floatArrayList = (com.google.crypto.tink.shaded.protobuf.FloatArrayList) list;
                int tagWireType = com.google.crypto.tink.shaded.protobuf.WireFormat.getTagWireType(this.tag);
                if (tagWireType == 2) {
                    int readVarint32 = readVarint32();
                    verifyPackedFixed32Length(readVarint32);
                    int i3 = this.pos;
                    while (this.pos < i3 + readVarint32) {
                        floatArrayList.addFloat(java.lang.Float.intBitsToFloat(readLittleEndian32_NoCheck()));
                    }
                    return;
                }
                if (tagWireType == 5) {
                    do {
                        floatArrayList.addFloat(readFloat());
                        if (isAtEnd()) {
                            return;
                        } else {
                            i2 = this.pos;
                        }
                    } while (readVarint32() == this.tag);
                    this.pos = i2;
                    return;
                }
                throw com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.invalidWireType();
            }
            int tagWireType2 = com.google.crypto.tink.shaded.protobuf.WireFormat.getTagWireType(this.tag);
            if (tagWireType2 == 2) {
                int readVarint322 = readVarint32();
                verifyPackedFixed32Length(readVarint322);
                int i4 = this.pos;
                while (this.pos < i4 + readVarint322) {
                    list.add(java.lang.Float.valueOf(java.lang.Float.intBitsToFloat(readLittleEndian32_NoCheck())));
                }
                return;
            }
            if (tagWireType2 == 5) {
                do {
                    list.add(java.lang.Float.valueOf(readFloat()));
                    if (isAtEnd()) {
                        return;
                    } else {
                        i = this.pos;
                    }
                } while (readVarint32() == this.tag);
                this.pos = i;
                return;
            }
            throw com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.invalidWireType();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Reader
        public final void readUInt64List(java.util.List<java.lang.Long> list) throws java.io.IOException {
            int i;
            int i2;
            if (list instanceof com.google.crypto.tink.shaded.protobuf.LongArrayList) {
                com.google.crypto.tink.shaded.protobuf.LongArrayList longArrayList = (com.google.crypto.tink.shaded.protobuf.LongArrayList) list;
                int tagWireType = com.google.crypto.tink.shaded.protobuf.WireFormat.getTagWireType(this.tag);
                if (tagWireType == 0) {
                    do {
                        longArrayList.addLong(readUInt64());
                        if (isAtEnd()) {
                            return;
                        } else {
                            i2 = this.pos;
                        }
                    } while (readVarint32() == this.tag);
                    this.pos = i2;
                    return;
                }
                if (tagWireType == 2) {
                    int readVarint32 = this.pos + readVarint32();
                    while (this.pos < readVarint32) {
                        longArrayList.addLong(readVarint64());
                    }
                    requirePosition(readVarint32);
                    return;
                }
                throw com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.invalidWireType();
            }
            int tagWireType2 = com.google.crypto.tink.shaded.protobuf.WireFormat.getTagWireType(this.tag);
            if (tagWireType2 == 0) {
                do {
                    list.add(java.lang.Long.valueOf(readUInt64()));
                    if (isAtEnd()) {
                        return;
                    } else {
                        i = this.pos;
                    }
                } while (readVarint32() == this.tag);
                this.pos = i;
                return;
            }
            if (tagWireType2 == 2) {
                int readVarint322 = this.pos + readVarint32();
                while (this.pos < readVarint322) {
                    list.add(java.lang.Long.valueOf(readVarint64()));
                }
                requirePosition(readVarint322);
                return;
            }
            throw com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.invalidWireType();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Reader
        public final void readInt64List(java.util.List<java.lang.Long> list) throws java.io.IOException {
            int i;
            int i2;
            if (list instanceof com.google.crypto.tink.shaded.protobuf.LongArrayList) {
                com.google.crypto.tink.shaded.protobuf.LongArrayList longArrayList = (com.google.crypto.tink.shaded.protobuf.LongArrayList) list;
                int tagWireType = com.google.crypto.tink.shaded.protobuf.WireFormat.getTagWireType(this.tag);
                if (tagWireType == 0) {
                    do {
                        longArrayList.addLong(readInt64());
                        if (isAtEnd()) {
                            return;
                        } else {
                            i2 = this.pos;
                        }
                    } while (readVarint32() == this.tag);
                    this.pos = i2;
                    return;
                }
                if (tagWireType == 2) {
                    int readVarint32 = this.pos + readVarint32();
                    while (this.pos < readVarint32) {
                        longArrayList.addLong(readVarint64());
                    }
                    requirePosition(readVarint32);
                    return;
                }
                throw com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.invalidWireType();
            }
            int tagWireType2 = com.google.crypto.tink.shaded.protobuf.WireFormat.getTagWireType(this.tag);
            if (tagWireType2 == 0) {
                do {
                    list.add(java.lang.Long.valueOf(readInt64()));
                    if (isAtEnd()) {
                        return;
                    } else {
                        i = this.pos;
                    }
                } while (readVarint32() == this.tag);
                this.pos = i;
                return;
            }
            if (tagWireType2 == 2) {
                int readVarint322 = this.pos + readVarint32();
                while (this.pos < readVarint322) {
                    list.add(java.lang.Long.valueOf(readVarint64()));
                }
                requirePosition(readVarint322);
                return;
            }
            throw com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.invalidWireType();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Reader
        public final void readInt32List(java.util.List<java.lang.Integer> list) throws java.io.IOException {
            int i;
            int i2;
            if (list instanceof com.google.crypto.tink.shaded.protobuf.IntArrayList) {
                com.google.crypto.tink.shaded.protobuf.IntArrayList intArrayList = (com.google.crypto.tink.shaded.protobuf.IntArrayList) list;
                int tagWireType = com.google.crypto.tink.shaded.protobuf.WireFormat.getTagWireType(this.tag);
                if (tagWireType == 0) {
                    do {
                        intArrayList.addInt(readInt32());
                        if (isAtEnd()) {
                            return;
                        } else {
                            i2 = this.pos;
                        }
                    } while (readVarint32() == this.tag);
                    this.pos = i2;
                    return;
                }
                if (tagWireType == 2) {
                    int readVarint32 = this.pos + readVarint32();
                    while (this.pos < readVarint32) {
                        intArrayList.addInt(readVarint32());
                    }
                    requirePosition(readVarint32);
                    return;
                }
                throw com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.invalidWireType();
            }
            int tagWireType2 = com.google.crypto.tink.shaded.protobuf.WireFormat.getTagWireType(this.tag);
            if (tagWireType2 == 0) {
                do {
                    list.add(java.lang.Integer.valueOf(readInt32()));
                    if (isAtEnd()) {
                        return;
                    } else {
                        i = this.pos;
                    }
                } while (readVarint32() == this.tag);
                this.pos = i;
                return;
            }
            if (tagWireType2 == 2) {
                int readVarint322 = this.pos + readVarint32();
                while (this.pos < readVarint322) {
                    list.add(java.lang.Integer.valueOf(readVarint32()));
                }
                requirePosition(readVarint322);
                return;
            }
            throw com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.invalidWireType();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Reader
        public final void readFixed64List(java.util.List<java.lang.Long> list) throws java.io.IOException {
            int i;
            int i2;
            if (list instanceof com.google.crypto.tink.shaded.protobuf.LongArrayList) {
                com.google.crypto.tink.shaded.protobuf.LongArrayList longArrayList = (com.google.crypto.tink.shaded.protobuf.LongArrayList) list;
                int tagWireType = com.google.crypto.tink.shaded.protobuf.WireFormat.getTagWireType(this.tag);
                if (tagWireType == 1) {
                    do {
                        longArrayList.addLong(readFixed64());
                        if (isAtEnd()) {
                            return;
                        } else {
                            i2 = this.pos;
                        }
                    } while (readVarint32() == this.tag);
                    this.pos = i2;
                    return;
                }
                if (tagWireType == 2) {
                    int readVarint32 = readVarint32();
                    verifyPackedFixed64Length(readVarint32);
                    int i3 = this.pos;
                    while (this.pos < i3 + readVarint32) {
                        longArrayList.addLong(readLittleEndian64_NoCheck());
                    }
                    return;
                }
                throw com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.invalidWireType();
            }
            int tagWireType2 = com.google.crypto.tink.shaded.protobuf.WireFormat.getTagWireType(this.tag);
            if (tagWireType2 == 1) {
                do {
                    list.add(java.lang.Long.valueOf(readFixed64()));
                    if (isAtEnd()) {
                        return;
                    } else {
                        i = this.pos;
                    }
                } while (readVarint32() == this.tag);
                this.pos = i;
                return;
            }
            if (tagWireType2 == 2) {
                int readVarint322 = readVarint32();
                verifyPackedFixed64Length(readVarint322);
                int i4 = this.pos;
                while (this.pos < i4 + readVarint322) {
                    list.add(java.lang.Long.valueOf(readLittleEndian64_NoCheck()));
                }
                return;
            }
            throw com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.invalidWireType();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Reader
        public final void readFixed32List(java.util.List<java.lang.Integer> list) throws java.io.IOException {
            int i;
            int i2;
            if (list instanceof com.google.crypto.tink.shaded.protobuf.IntArrayList) {
                com.google.crypto.tink.shaded.protobuf.IntArrayList intArrayList = (com.google.crypto.tink.shaded.protobuf.IntArrayList) list;
                int tagWireType = com.google.crypto.tink.shaded.protobuf.WireFormat.getTagWireType(this.tag);
                if (tagWireType == 2) {
                    int readVarint32 = readVarint32();
                    verifyPackedFixed32Length(readVarint32);
                    int i3 = this.pos;
                    while (this.pos < i3 + readVarint32) {
                        intArrayList.addInt(readLittleEndian32_NoCheck());
                    }
                    return;
                }
                if (tagWireType == 5) {
                    do {
                        intArrayList.addInt(readFixed32());
                        if (isAtEnd()) {
                            return;
                        } else {
                            i2 = this.pos;
                        }
                    } while (readVarint32() == this.tag);
                    this.pos = i2;
                    return;
                }
                throw com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.invalidWireType();
            }
            int tagWireType2 = com.google.crypto.tink.shaded.protobuf.WireFormat.getTagWireType(this.tag);
            if (tagWireType2 == 2) {
                int readVarint322 = readVarint32();
                verifyPackedFixed32Length(readVarint322);
                int i4 = this.pos;
                while (this.pos < i4 + readVarint322) {
                    list.add(java.lang.Integer.valueOf(readLittleEndian32_NoCheck()));
                }
                return;
            }
            if (tagWireType2 == 5) {
                do {
                    list.add(java.lang.Integer.valueOf(readFixed32()));
                    if (isAtEnd()) {
                        return;
                    } else {
                        i = this.pos;
                    }
                } while (readVarint32() == this.tag);
                this.pos = i;
                return;
            }
            throw com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.invalidWireType();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Reader
        public final void readBoolList(java.util.List<java.lang.Boolean> list) throws java.io.IOException {
            int i;
            int i2;
            if (list instanceof com.google.crypto.tink.shaded.protobuf.BooleanArrayList) {
                com.google.crypto.tink.shaded.protobuf.BooleanArrayList booleanArrayList = (com.google.crypto.tink.shaded.protobuf.BooleanArrayList) list;
                int tagWireType = com.google.crypto.tink.shaded.protobuf.WireFormat.getTagWireType(this.tag);
                if (tagWireType != 0) {
                    if (tagWireType == 2) {
                        int readVarint32 = this.pos + readVarint32();
                        while (this.pos < readVarint32) {
                            booleanArrayList.addBoolean(readVarint32() != 0);
                        }
                        requirePosition(readVarint32);
                        return;
                    }
                    throw com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.invalidWireType();
                }
                do {
                    booleanArrayList.addBoolean(readBool());
                    if (isAtEnd()) {
                        return;
                    } else {
                        i2 = this.pos;
                    }
                } while (readVarint32() == this.tag);
                this.pos = i2;
                return;
            }
            int tagWireType2 = com.google.crypto.tink.shaded.protobuf.WireFormat.getTagWireType(this.tag);
            if (tagWireType2 != 0) {
                if (tagWireType2 == 2) {
                    int readVarint322 = this.pos + readVarint32();
                    while (this.pos < readVarint322) {
                        list.add(java.lang.Boolean.valueOf(readVarint32() != 0));
                    }
                    requirePosition(readVarint322);
                    return;
                }
                throw com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.invalidWireType();
            }
            do {
                list.add(java.lang.Boolean.valueOf(readBool()));
                if (isAtEnd()) {
                    return;
                } else {
                    i = this.pos;
                }
            } while (readVarint32() == this.tag);
            this.pos = i;
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
            int i;
            int i2;
            if (com.google.crypto.tink.shaded.protobuf.WireFormat.getTagWireType(this.tag) != 2) {
                throw com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.invalidWireType();
            }
            if ((list instanceof com.google.crypto.tink.shaded.protobuf.LazyStringList) && !z) {
                com.google.crypto.tink.shaded.protobuf.LazyStringList lazyStringList = (com.google.crypto.tink.shaded.protobuf.LazyStringList) list;
                do {
                    lazyStringList.add(readBytes());
                    if (isAtEnd()) {
                        return;
                    } else {
                        i2 = this.pos;
                    }
                } while (readVarint32() == this.tag);
                this.pos = i2;
                return;
            }
            do {
                list.add(readStringInternal(z));
                if (isAtEnd()) {
                    return;
                } else {
                    i = this.pos;
                }
            } while (readVarint32() == this.tag);
            this.pos = i;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Reader
        public final <T> void readMessageList(java.util.List<T> list, java.lang.Class<T> cls, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
            readMessageList(list, com.google.crypto.tink.shaded.protobuf.Protobuf.getInstance().schemaFor((java.lang.Class) cls), extensionRegistryLite);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.crypto.tink.shaded.protobuf.Reader
        public final <T> void readMessageList(java.util.List<T> list, com.google.crypto.tink.shaded.protobuf.Schema<T> schema, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
            int i;
            if (com.google.crypto.tink.shaded.protobuf.WireFormat.getTagWireType(this.tag) != 2) {
                throw com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.invalidWireType();
            }
            int i2 = this.tag;
            do {
                list.add(readMessage(schema, extensionRegistryLite));
                if (isAtEnd()) {
                    return;
                } else {
                    i = this.pos;
                }
            } while (readVarint32() == i2);
            this.pos = i;
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
            int i;
            if (com.google.crypto.tink.shaded.protobuf.WireFormat.getTagWireType(this.tag) != 3) {
                throw com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.invalidWireType();
            }
            int i2 = this.tag;
            do {
                list.add(readGroup(schema, extensionRegistryLite));
                if (isAtEnd()) {
                    return;
                } else {
                    i = this.pos;
                }
            } while (readVarint32() == i2);
            this.pos = i;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Reader
        public final void readBytesList(java.util.List<com.google.crypto.tink.shaded.protobuf.ByteString> list) throws java.io.IOException {
            int i;
            if (com.google.crypto.tink.shaded.protobuf.WireFormat.getTagWireType(this.tag) != 2) {
                throw com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.invalidWireType();
            }
            do {
                list.add(readBytes());
                if (isAtEnd()) {
                    return;
                } else {
                    i = this.pos;
                }
            } while (readVarint32() == this.tag);
            this.pos = i;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Reader
        public final void readUInt32List(java.util.List<java.lang.Integer> list) throws java.io.IOException {
            int i;
            int i2;
            if (list instanceof com.google.crypto.tink.shaded.protobuf.IntArrayList) {
                com.google.crypto.tink.shaded.protobuf.IntArrayList intArrayList = (com.google.crypto.tink.shaded.protobuf.IntArrayList) list;
                int tagWireType = com.google.crypto.tink.shaded.protobuf.WireFormat.getTagWireType(this.tag);
                if (tagWireType != 0) {
                    if (tagWireType == 2) {
                        int readVarint32 = readVarint32();
                        int i3 = this.pos;
                        while (this.pos < i3 + readVarint32) {
                            intArrayList.addInt(readVarint32());
                        }
                        return;
                    }
                    throw com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.invalidWireType();
                }
                do {
                    intArrayList.addInt(readUInt32());
                    if (isAtEnd()) {
                        return;
                    } else {
                        i2 = this.pos;
                    }
                } while (readVarint32() == this.tag);
                this.pos = i2;
                return;
            }
            int tagWireType2 = com.google.crypto.tink.shaded.protobuf.WireFormat.getTagWireType(this.tag);
            if (tagWireType2 != 0) {
                if (tagWireType2 == 2) {
                    int readVarint322 = readVarint32();
                    int i4 = this.pos;
                    while (this.pos < i4 + readVarint322) {
                        list.add(java.lang.Integer.valueOf(readVarint32()));
                    }
                    return;
                }
                throw com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.invalidWireType();
            }
            do {
                list.add(java.lang.Integer.valueOf(readUInt32()));
                if (isAtEnd()) {
                    return;
                } else {
                    i = this.pos;
                }
            } while (readVarint32() == this.tag);
            this.pos = i;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Reader
        public final void readEnumList(java.util.List<java.lang.Integer> list) throws java.io.IOException {
            int i;
            int i2;
            if (list instanceof com.google.crypto.tink.shaded.protobuf.IntArrayList) {
                com.google.crypto.tink.shaded.protobuf.IntArrayList intArrayList = (com.google.crypto.tink.shaded.protobuf.IntArrayList) list;
                int tagWireType = com.google.crypto.tink.shaded.protobuf.WireFormat.getTagWireType(this.tag);
                if (tagWireType != 0) {
                    if (tagWireType == 2) {
                        int readVarint32 = readVarint32();
                        int i3 = this.pos;
                        while (this.pos < i3 + readVarint32) {
                            intArrayList.addInt(readVarint32());
                        }
                        return;
                    }
                    throw com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.invalidWireType();
                }
                do {
                    intArrayList.addInt(readEnum());
                    if (isAtEnd()) {
                        return;
                    } else {
                        i2 = this.pos;
                    }
                } while (readVarint32() == this.tag);
                this.pos = i2;
                return;
            }
            int tagWireType2 = com.google.crypto.tink.shaded.protobuf.WireFormat.getTagWireType(this.tag);
            if (tagWireType2 != 0) {
                if (tagWireType2 == 2) {
                    int readVarint322 = readVarint32();
                    int i4 = this.pos;
                    while (this.pos < i4 + readVarint322) {
                        list.add(java.lang.Integer.valueOf(readVarint32()));
                    }
                    return;
                }
                throw com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.invalidWireType();
            }
            do {
                list.add(java.lang.Integer.valueOf(readEnum()));
                if (isAtEnd()) {
                    return;
                } else {
                    i = this.pos;
                }
            } while (readVarint32() == this.tag);
            this.pos = i;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Reader
        public final void readSFixed32List(java.util.List<java.lang.Integer> list) throws java.io.IOException {
            int i;
            int i2;
            if (list instanceof com.google.crypto.tink.shaded.protobuf.IntArrayList) {
                com.google.crypto.tink.shaded.protobuf.IntArrayList intArrayList = (com.google.crypto.tink.shaded.protobuf.IntArrayList) list;
                int tagWireType = com.google.crypto.tink.shaded.protobuf.WireFormat.getTagWireType(this.tag);
                if (tagWireType == 2) {
                    int readVarint32 = readVarint32();
                    verifyPackedFixed32Length(readVarint32);
                    int i3 = this.pos;
                    while (this.pos < i3 + readVarint32) {
                        intArrayList.addInt(readLittleEndian32_NoCheck());
                    }
                    return;
                }
                if (tagWireType == 5) {
                    do {
                        intArrayList.addInt(readSFixed32());
                        if (isAtEnd()) {
                            return;
                        } else {
                            i2 = this.pos;
                        }
                    } while (readVarint32() == this.tag);
                    this.pos = i2;
                    return;
                }
                throw com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.invalidWireType();
            }
            int tagWireType2 = com.google.crypto.tink.shaded.protobuf.WireFormat.getTagWireType(this.tag);
            if (tagWireType2 == 2) {
                int readVarint322 = readVarint32();
                verifyPackedFixed32Length(readVarint322);
                int i4 = this.pos;
                while (this.pos < i4 + readVarint322) {
                    list.add(java.lang.Integer.valueOf(readLittleEndian32_NoCheck()));
                }
                return;
            }
            if (tagWireType2 == 5) {
                do {
                    list.add(java.lang.Integer.valueOf(readSFixed32()));
                    if (isAtEnd()) {
                        return;
                    } else {
                        i = this.pos;
                    }
                } while (readVarint32() == this.tag);
                this.pos = i;
                return;
            }
            throw com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.invalidWireType();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Reader
        public final void readSFixed64List(java.util.List<java.lang.Long> list) throws java.io.IOException {
            int i;
            int i2;
            if (list instanceof com.google.crypto.tink.shaded.protobuf.LongArrayList) {
                com.google.crypto.tink.shaded.protobuf.LongArrayList longArrayList = (com.google.crypto.tink.shaded.protobuf.LongArrayList) list;
                int tagWireType = com.google.crypto.tink.shaded.protobuf.WireFormat.getTagWireType(this.tag);
                if (tagWireType == 1) {
                    do {
                        longArrayList.addLong(readSFixed64());
                        if (isAtEnd()) {
                            return;
                        } else {
                            i2 = this.pos;
                        }
                    } while (readVarint32() == this.tag);
                    this.pos = i2;
                    return;
                }
                if (tagWireType == 2) {
                    int readVarint32 = readVarint32();
                    verifyPackedFixed64Length(readVarint32);
                    int i3 = this.pos;
                    while (this.pos < i3 + readVarint32) {
                        longArrayList.addLong(readLittleEndian64_NoCheck());
                    }
                    return;
                }
                throw com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.invalidWireType();
            }
            int tagWireType2 = com.google.crypto.tink.shaded.protobuf.WireFormat.getTagWireType(this.tag);
            if (tagWireType2 == 1) {
                do {
                    list.add(java.lang.Long.valueOf(readSFixed64()));
                    if (isAtEnd()) {
                        return;
                    } else {
                        i = this.pos;
                    }
                } while (readVarint32() == this.tag);
                this.pos = i;
                return;
            }
            if (tagWireType2 == 2) {
                int readVarint322 = readVarint32();
                verifyPackedFixed64Length(readVarint322);
                int i4 = this.pos;
                while (this.pos < i4 + readVarint322) {
                    list.add(java.lang.Long.valueOf(readLittleEndian64_NoCheck()));
                }
                return;
            }
            throw com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.invalidWireType();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Reader
        public final void readSInt32List(java.util.List<java.lang.Integer> list) throws java.io.IOException {
            int i;
            int i2;
            if (list instanceof com.google.crypto.tink.shaded.protobuf.IntArrayList) {
                com.google.crypto.tink.shaded.protobuf.IntArrayList intArrayList = (com.google.crypto.tink.shaded.protobuf.IntArrayList) list;
                int tagWireType = com.google.crypto.tink.shaded.protobuf.WireFormat.getTagWireType(this.tag);
                if (tagWireType != 0) {
                    if (tagWireType == 2) {
                        int readVarint32 = readVarint32();
                        int i3 = this.pos;
                        while (this.pos < i3 + readVarint32) {
                            intArrayList.addInt(com.google.crypto.tink.shaded.protobuf.CodedInputStream.decodeZigZag32(readVarint32()));
                        }
                        return;
                    }
                    throw com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.invalidWireType();
                }
                do {
                    intArrayList.addInt(readSInt32());
                    if (isAtEnd()) {
                        return;
                    } else {
                        i2 = this.pos;
                    }
                } while (readVarint32() == this.tag);
                this.pos = i2;
                return;
            }
            int tagWireType2 = com.google.crypto.tink.shaded.protobuf.WireFormat.getTagWireType(this.tag);
            if (tagWireType2 != 0) {
                if (tagWireType2 == 2) {
                    int readVarint322 = readVarint32();
                    int i4 = this.pos;
                    while (this.pos < i4 + readVarint322) {
                        list.add(java.lang.Integer.valueOf(com.google.crypto.tink.shaded.protobuf.CodedInputStream.decodeZigZag32(readVarint32())));
                    }
                    return;
                }
                throw com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.invalidWireType();
            }
            do {
                list.add(java.lang.Integer.valueOf(readSInt32()));
                if (isAtEnd()) {
                    return;
                } else {
                    i = this.pos;
                }
            } while (readVarint32() == this.tag);
            this.pos = i;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Reader
        public final void readSInt64List(java.util.List<java.lang.Long> list) throws java.io.IOException {
            int i;
            int i2;
            if (list instanceof com.google.crypto.tink.shaded.protobuf.LongArrayList) {
                com.google.crypto.tink.shaded.protobuf.LongArrayList longArrayList = (com.google.crypto.tink.shaded.protobuf.LongArrayList) list;
                int tagWireType = com.google.crypto.tink.shaded.protobuf.WireFormat.getTagWireType(this.tag);
                if (tagWireType != 0) {
                    if (tagWireType == 2) {
                        int readVarint32 = readVarint32();
                        int i3 = this.pos;
                        while (this.pos < i3 + readVarint32) {
                            longArrayList.addLong(com.google.crypto.tink.shaded.protobuf.CodedInputStream.decodeZigZag64(readVarint64()));
                        }
                        return;
                    }
                    throw com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.invalidWireType();
                }
                do {
                    longArrayList.addLong(readSInt64());
                    if (isAtEnd()) {
                        return;
                    } else {
                        i2 = this.pos;
                    }
                } while (readVarint32() == this.tag);
                this.pos = i2;
                return;
            }
            int tagWireType2 = com.google.crypto.tink.shaded.protobuf.WireFormat.getTagWireType(this.tag);
            if (tagWireType2 != 0) {
                if (tagWireType2 == 2) {
                    int readVarint322 = readVarint32();
                    int i4 = this.pos;
                    while (this.pos < i4 + readVarint322) {
                        list.add(java.lang.Long.valueOf(com.google.crypto.tink.shaded.protobuf.CodedInputStream.decodeZigZag64(readVarint64())));
                    }
                    return;
                }
                throw com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.invalidWireType();
            }
            do {
                list.add(java.lang.Long.valueOf(readSInt64()));
                if (isAtEnd()) {
                    return;
                } else {
                    i = this.pos;
                }
            } while (readVarint32() == this.tag);
            this.pos = i;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.crypto.tink.shaded.protobuf.Reader
        public final <K, V> void readMap(java.util.Map<K, V> map, com.google.crypto.tink.shaded.protobuf.MapEntryLite.Metadata<K, V> metadata, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
            requireWireType(2);
            int readVarint32 = readVarint32();
            requireBytes(readVarint32);
            int i = this.limit;
            this.limit = this.pos + readVarint32;
            try {
                java.lang.Object obj = metadata.defaultKey;
                java.lang.Object obj2 = metadata.defaultValue;
                while (true) {
                    int fieldNumber = getFieldNumber();
                    if (fieldNumber == Integer.MAX_VALUE) {
                        map.put(obj, obj2);
                        return;
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
                }
            } finally {
                this.limit = i;
            }
        }

        private java.lang.Object readField(com.google.crypto.tink.shaded.protobuf.WireFormat.FieldType fieldType, java.lang.Class<?> cls, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
            switch (com.google.crypto.tink.shaded.protobuf.BinaryReader.AnonymousClass1.$SwitchMap$com$google$protobuf$WireFormat$FieldType[fieldType.ordinal()]) {
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
                    throw new java.lang.RuntimeException("unsupported field type.");
            }
        }

        private int readVarint32() throws java.io.IOException {
            int i;
            int i2 = this.pos;
            int i3 = this.limit;
            if (i3 == i2) {
                throw com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.truncatedMessage();
            }
            byte[] bArr = this.buffer;
            int i4 = i2 + 1;
            byte b = bArr[i2];
            if (b >= 0) {
                this.pos = i4;
                return b;
            }
            if (i3 - i4 < 9) {
                return (int) readVarint64SlowPath();
            }
            int i5 = i2 + 2;
            int i6 = (bArr[i4] << 7) ^ b;
            if (i6 < 0) {
                i = i6 ^ androidx.work.WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT;
            } else {
                int i7 = i2 + 3;
                int i8 = (bArr[i5] << 14) ^ i6;
                if (i8 >= 0) {
                    i = i8 ^ 16256;
                } else {
                    int i9 = i2 + 4;
                    int i10 = i8 ^ (bArr[i7] << com.google.common.base.Ascii.NAK);
                    if (i10 < 0) {
                        i = (-2080896) ^ i10;
                    } else {
                        i7 = i2 + 5;
                        byte b2 = bArr[i9];
                        int i11 = (i10 ^ (b2 << com.google.common.base.Ascii.FS)) ^ 266354560;
                        if (b2 < 0) {
                            i9 = i2 + 6;
                            if (bArr[i7] < 0) {
                                i7 = i2 + 7;
                                if (bArr[i9] < 0) {
                                    i9 = i2 + 8;
                                    if (bArr[i7] < 0) {
                                        i7 = i2 + 9;
                                        if (bArr[i9] < 0) {
                                            if (bArr[i7] < 0) {
                                                throw com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.malformedVarint();
                                            }
                                            i5 = i2 + 10;
                                            i = i11;
                                        }
                                    }
                                }
                            }
                            i = i11;
                        }
                        i = i11;
                    }
                    i5 = i9;
                }
                i5 = i7;
            }
            this.pos = i5;
            return i;
        }

        public final long readVarint64() throws java.io.IOException {
            long j;
            long j2;
            long j3;
            int i = this.pos;
            int i2 = this.limit;
            if (i2 == i) {
                throw com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.truncatedMessage();
            }
            byte[] bArr = this.buffer;
            int i3 = i + 1;
            byte b = bArr[i];
            if (b >= 0) {
                this.pos = i3;
                return b;
            }
            if (i2 - i3 < 9) {
                return readVarint64SlowPath();
            }
            int i4 = i + 2;
            int i5 = (bArr[i3] << 7) ^ b;
            if (i5 < 0) {
                j = i5 ^ androidx.work.WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT;
            } else {
                int i6 = i + 3;
                int i7 = (bArr[i4] << 14) ^ i5;
                if (i7 >= 0) {
                    j = i7 ^ 16256;
                    i4 = i6;
                } else {
                    int i8 = i + 4;
                    int i9 = i7 ^ (bArr[i6] << com.google.common.base.Ascii.NAK);
                    if (i9 < 0) {
                        long j4 = (-2080896) ^ i9;
                        i4 = i8;
                        j = j4;
                    } else {
                        long j5 = i9;
                        i4 = i + 5;
                        long j6 = j5 ^ (bArr[i8] << 28);
                        if (j6 >= 0) {
                            j3 = 266354560;
                        } else {
                            int i10 = i + 6;
                            long j7 = j6 ^ (bArr[i4] << 35);
                            if (j7 < 0) {
                                j2 = -34093383808L;
                            } else {
                                i4 = i + 7;
                                j6 = j7 ^ (bArr[i10] << 42);
                                if (j6 >= 0) {
                                    j3 = 4363953127296L;
                                } else {
                                    i10 = i + 8;
                                    j7 = j6 ^ (bArr[i4] << 49);
                                    if (j7 < 0) {
                                        j2 = -558586000294016L;
                                    } else {
                                        i4 = i + 9;
                                        long j8 = (j7 ^ (bArr[i10] << 56)) ^ 71499008037633920L;
                                        if (j8 < 0) {
                                            if (bArr[i4] < 0) {
                                                throw com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.malformedVarint();
                                            }
                                            i4 = i + 10;
                                        }
                                        j = j8;
                                    }
                                }
                            }
                            j = j7 ^ j2;
                            i4 = i10;
                        }
                        j = j6 ^ j3;
                    }
                }
            }
            this.pos = i4;
            return j;
        }

        private long readVarint64SlowPath() throws java.io.IOException {
            long j = 0;
            for (int i = 0; i < 64; i += 7) {
                j |= (r3 & Byte.MAX_VALUE) << i;
                if ((readByte() & 128) == 0) {
                    return j;
                }
            }
            throw com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.malformedVarint();
        }

        private byte readByte() throws java.io.IOException {
            int i = this.pos;
            if (i == this.limit) {
                throw com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.truncatedMessage();
            }
            byte[] bArr = this.buffer;
            this.pos = i + 1;
            return bArr[i];
        }

        private int readLittleEndian32() throws java.io.IOException {
            requireBytes(4);
            return readLittleEndian32_NoCheck();
        }

        private long readLittleEndian64() throws java.io.IOException {
            requireBytes(8);
            return readLittleEndian64_NoCheck();
        }

        private int readLittleEndian32_NoCheck() {
            int i = this.pos;
            byte[] bArr = this.buffer;
            this.pos = i + 4;
            return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
        }

        private long readLittleEndian64_NoCheck() {
            int i = this.pos;
            byte[] bArr = this.buffer;
            this.pos = i + 8;
            return ((bArr[i + 7] & 255) << 56) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24) | ((bArr[i + 4] & 255) << 32) | ((bArr[i + 5] & 255) << 40) | ((bArr[i + 6] & 255) << 48);
        }

        private void skipVarint() throws java.io.IOException {
            int i = this.limit;
            int i2 = this.pos;
            if (i - i2 >= 10) {
                byte[] bArr = this.buffer;
                int i3 = 0;
                while (i3 < 10) {
                    int i4 = i2 + 1;
                    if (bArr[i2] >= 0) {
                        this.pos = i4;
                        return;
                    } else {
                        i3++;
                        i2 = i4;
                    }
                }
            }
            skipVarintSlowPath();
        }

        private void skipVarintSlowPath() throws java.io.IOException {
            for (int i = 0; i < 10; i++) {
                if (readByte() >= 0) {
                    return;
                }
            }
            throw com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.malformedVarint();
        }

        private void skipBytes(int i) throws java.io.IOException {
            requireBytes(i);
            this.pos += i;
        }

        private void skipGroup() throws java.io.IOException {
            int i = this.endGroupTag;
            this.endGroupTag = com.google.crypto.tink.shaded.protobuf.WireFormat.makeTag(com.google.crypto.tink.shaded.protobuf.WireFormat.getTagFieldNumber(this.tag), 4);
            while (getFieldNumber() != Integer.MAX_VALUE && skipField()) {
            }
            if (this.tag != this.endGroupTag) {
                throw com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.parseFailure();
            }
            this.endGroupTag = i;
        }

        private void requireBytes(int i) throws java.io.IOException {
            if (i < 0 || i > this.limit - this.pos) {
                throw com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.truncatedMessage();
            }
        }

        private void requireWireType(int i) throws java.io.IOException {
            if (com.google.crypto.tink.shaded.protobuf.WireFormat.getTagWireType(this.tag) != i) {
                throw com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.invalidWireType();
            }
        }

        private void verifyPackedFixed64Length(int i) throws java.io.IOException {
            requireBytes(i);
            if ((i & 7) != 0) {
                throw com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.parseFailure();
            }
        }

        private void verifyPackedFixed32Length(int i) throws java.io.IOException {
            requireBytes(i);
            if ((i & 3) != 0) {
                throw com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.parseFailure();
            }
        }

        private void requirePosition(int i) throws java.io.IOException {
            if (this.pos != i) {
                throw com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.truncatedMessage();
            }
        }
    }

    /* renamed from: com.google.crypto.tink.shaded.protobuf.BinaryReader$1, reason: invalid class name */
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
}
