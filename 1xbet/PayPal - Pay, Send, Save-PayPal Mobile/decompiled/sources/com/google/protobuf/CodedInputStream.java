package com.google.protobuf;

/* loaded from: classes9.dex */
public abstract class CodedInputStream {
    private static final int DEFAULT_BUFFER_SIZE = 4096;
    private static final int DEFAULT_SIZE_LIMIT = Integer.MAX_VALUE;
    private static volatile int defaultRecursionLimit = 100;
    int recursionDepth;
    int recursionLimit;
    private boolean shouldDiscardUnknownFields;
    int sizeLimit;
    com.google.protobuf.CodedInputStreamReader wrapper;

    public static int decodeZigZag32(int i) {
        return (i >>> 1) ^ (-(i & 1));
    }

    public static long decodeZigZag64(long j) {
        return (j >>> 1) ^ (-(1 & j));
    }

    public abstract void checkLastTagWas(int i) throws com.google.protobuf.InvalidProtocolBufferException;

    public abstract void enableAliasing(boolean z);

    public abstract int getBytesUntilLimit();

    public abstract int getLastTag();

    public abstract int getTotalBytesRead();

    public abstract boolean isAtEnd() throws java.io.IOException;

    public abstract void popLimit(int i);

    public abstract int pushLimit(int i) throws com.google.protobuf.InvalidProtocolBufferException;

    public abstract boolean readBool() throws java.io.IOException;

    public abstract byte[] readByteArray() throws java.io.IOException;

    public abstract java.nio.ByteBuffer readByteBuffer() throws java.io.IOException;

    public abstract com.google.protobuf.ByteString readBytes() throws java.io.IOException;

    public abstract double readDouble() throws java.io.IOException;

    public abstract int readEnum() throws java.io.IOException;

    public abstract int readFixed32() throws java.io.IOException;

    public abstract long readFixed64() throws java.io.IOException;

    public abstract float readFloat() throws java.io.IOException;

    public abstract <T extends com.google.protobuf.MessageLite> T readGroup(int i, com.google.protobuf.Parser<T> parser, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException;

    public abstract void readGroup(int i, com.google.protobuf.MessageLite.Builder builder, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException;

    public abstract int readInt32() throws java.io.IOException;

    public abstract long readInt64() throws java.io.IOException;

    public abstract <T extends com.google.protobuf.MessageLite> T readMessage(com.google.protobuf.Parser<T> parser, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException;

    public abstract void readMessage(com.google.protobuf.MessageLite.Builder builder, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException;

    public abstract byte readRawByte() throws java.io.IOException;

    public abstract byte[] readRawBytes(int i) throws java.io.IOException;

    public abstract int readRawLittleEndian32() throws java.io.IOException;

    public abstract long readRawLittleEndian64() throws java.io.IOException;

    public abstract int readRawVarint32() throws java.io.IOException;

    public abstract long readRawVarint64() throws java.io.IOException;

    abstract long readRawVarint64SlowPath() throws java.io.IOException;

    public abstract int readSFixed32() throws java.io.IOException;

    public abstract long readSFixed64() throws java.io.IOException;

    public abstract int readSInt32() throws java.io.IOException;

    public abstract long readSInt64() throws java.io.IOException;

    public abstract java.lang.String readString() throws java.io.IOException;

    public abstract java.lang.String readStringRequireUtf8() throws java.io.IOException;

    public abstract int readTag() throws java.io.IOException;

    public abstract int readUInt32() throws java.io.IOException;

    public abstract long readUInt64() throws java.io.IOException;

    @java.lang.Deprecated
    public abstract void readUnknownGroup(int i, com.google.protobuf.MessageLite.Builder builder) throws java.io.IOException;

    public abstract void resetSizeCounter();

    public abstract boolean skipField(int i) throws java.io.IOException;

    @java.lang.Deprecated
    public abstract boolean skipField(int i, com.google.protobuf.CodedOutputStream codedOutputStream) throws java.io.IOException;

    public abstract void skipRawBytes(int i) throws java.io.IOException;

    public static com.google.protobuf.CodedInputStream newInstance(java.io.InputStream inputStream) {
        return newInstance(inputStream, 4096);
    }

    public static com.google.protobuf.CodedInputStream newInstance(java.io.InputStream inputStream, int i) {
        if (i <= 0) {
            throw new java.lang.IllegalArgumentException("bufferSize must be > 0");
        }
        if (inputStream == null) {
            return newInstance(com.google.protobuf.Internal.EMPTY_BYTE_ARRAY);
        }
        return new com.google.protobuf.CodedInputStream.StreamDecoder(inputStream, i);
    }

    public static com.google.protobuf.CodedInputStream newInstance(java.lang.Iterable<java.nio.ByteBuffer> iterable) {
        if (!com.google.protobuf.CodedInputStream.UnsafeDirectNioDecoder.isSupported()) {
            return newInstance(new com.google.protobuf.IterableByteBufferInputStream(iterable));
        }
        return newInstance(iterable, false);
    }

    static com.google.protobuf.CodedInputStream newInstance(java.lang.Iterable<java.nio.ByteBuffer> iterable, boolean z) {
        int i = 0;
        int i2 = 0;
        for (java.nio.ByteBuffer byteBuffer : iterable) {
            i2 += byteBuffer.remaining();
            if (byteBuffer.hasArray()) {
                i |= 1;
            } else {
                i = byteBuffer.isDirect() ? i | 2 : i | 4;
            }
        }
        if (i == 2) {
            return new com.google.protobuf.CodedInputStream.IterableDirectByteBufferDecoder(iterable, i2, z);
        }
        return newInstance(new com.google.protobuf.IterableByteBufferInputStream(iterable));
    }

    public static com.google.protobuf.CodedInputStream newInstance(byte[] bArr) {
        return newInstance(bArr, 0, bArr.length);
    }

    public static com.google.protobuf.CodedInputStream newInstance(byte[] bArr, int i, int i2) {
        return newInstance(bArr, i, i2, false);
    }

    static com.google.protobuf.CodedInputStream newInstance(byte[] bArr, int i, int i2, boolean z) {
        com.google.protobuf.CodedInputStream.ArrayDecoder arrayDecoder = new com.google.protobuf.CodedInputStream.ArrayDecoder(bArr, i, i2, z);
        try {
            arrayDecoder.pushLimit(i2);
            return arrayDecoder;
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
            throw new java.lang.IllegalArgumentException(e);
        }
    }

    public static com.google.protobuf.CodedInputStream newInstance(java.nio.ByteBuffer byteBuffer) {
        return newInstance(byteBuffer, false);
    }

    static com.google.protobuf.CodedInputStream newInstance(java.nio.ByteBuffer byteBuffer, boolean z) {
        if (byteBuffer.hasArray()) {
            return newInstance(byteBuffer.array(), byteBuffer.arrayOffset() + byteBuffer.position(), byteBuffer.remaining(), z);
        }
        if (byteBuffer.isDirect() && com.google.protobuf.CodedInputStream.UnsafeDirectNioDecoder.isSupported()) {
            return new com.google.protobuf.CodedInputStream.UnsafeDirectNioDecoder(byteBuffer, z);
        }
        int remaining = byteBuffer.remaining();
        byte[] bArr = new byte[remaining];
        byteBuffer.duplicate().get(bArr);
        return newInstance(bArr, 0, remaining, true);
    }

    public void checkRecursionLimit() throws com.google.protobuf.InvalidProtocolBufferException {
        if (this.recursionDepth >= this.recursionLimit) {
            throw com.google.protobuf.InvalidProtocolBufferException.recursionLimitExceeded();
        }
    }

    private CodedInputStream() {
        this.recursionLimit = defaultRecursionLimit;
        this.sizeLimit = Integer.MAX_VALUE;
        this.shouldDiscardUnknownFields = false;
    }

    public void skipMessage() throws java.io.IOException {
        int readTag;
        do {
            readTag = readTag();
            if (readTag == 0) {
                return;
            }
            checkRecursionLimit();
            this.recursionDepth++;
            this.recursionDepth--;
        } while (skipField(readTag));
    }

    public void skipMessage(com.google.protobuf.CodedOutputStream codedOutputStream) throws java.io.IOException {
        int readTag;
        do {
            readTag = readTag();
            if (readTag == 0) {
                return;
            }
            checkRecursionLimit();
            this.recursionDepth++;
            this.recursionDepth--;
        } while (skipField(readTag, codedOutputStream));
    }

    public final int setRecursionLimit(int i) {
        if (i < 0) {
            throw new java.lang.IllegalArgumentException("Recursion limit cannot be negative: ".concat(java.lang.String.valueOf(i)));
        }
        int i2 = this.recursionLimit;
        this.recursionLimit = i;
        return i2;
    }

    public final int setSizeLimit(int i) {
        if (i < 0) {
            throw new java.lang.IllegalArgumentException("Size limit cannot be negative: ".concat(java.lang.String.valueOf(i)));
        }
        int i2 = this.sizeLimit;
        this.sizeLimit = i;
        return i2;
    }

    final void discardUnknownFields() {
        this.shouldDiscardUnknownFields = true;
    }

    final void unsetDiscardUnknownFields() {
        this.shouldDiscardUnknownFields = false;
    }

    final boolean shouldDiscardUnknownFields() {
        return this.shouldDiscardUnknownFields;
    }

    public static int readRawVarint32(int i, java.io.InputStream inputStream) throws java.io.IOException {
        if ((i & 128) == 0) {
            return i;
        }
        int i2 = i & 127;
        int i3 = 7;
        while (i3 < 32) {
            int read = inputStream.read();
            if (read == -1) {
                throw com.google.protobuf.InvalidProtocolBufferException.truncatedMessage();
            }
            i2 |= (read & 127) << i3;
            if ((read & 128) == 0) {
                return i2;
            }
            i3 += 7;
        }
        while (i3 < 64) {
            int read2 = inputStream.read();
            if (read2 == -1) {
                throw com.google.protobuf.InvalidProtocolBufferException.truncatedMessage();
            }
            if ((read2 & 128) == 0) {
                return i2;
            }
            i3 += 7;
        }
        throw com.google.protobuf.InvalidProtocolBufferException.malformedVarint();
    }

    static int readRawVarint32(java.io.InputStream inputStream) throws java.io.IOException {
        int read = inputStream.read();
        if (read == -1) {
            throw com.google.protobuf.InvalidProtocolBufferException.truncatedMessage();
        }
        return readRawVarint32(read, inputStream);
    }

    static final class ArrayDecoder extends com.google.protobuf.CodedInputStream {
        private final byte[] buffer;
        private int bufferSizeAfterLimit;
        private int currentLimit;
        private boolean enableAliasing;
        private final boolean immutable;
        private int lastTag;
        private int limit;
        private int pos;
        private int startPos;

        private ArrayDecoder(byte[] bArr, int i, int i2, boolean z) {
            super();
            this.currentLimit = Integer.MAX_VALUE;
            this.buffer = bArr;
            this.limit = i2 + i;
            this.pos = i;
            this.startPos = i;
            this.immutable = z;
        }

        @Override // com.google.protobuf.CodedInputStream
        public final int readTag() throws java.io.IOException {
            if (isAtEnd()) {
                this.lastTag = 0;
                return 0;
            }
            int readRawVarint32 = readRawVarint32();
            this.lastTag = readRawVarint32;
            if (com.google.protobuf.WireFormat.getTagFieldNumber(readRawVarint32) == 0) {
                throw com.google.protobuf.InvalidProtocolBufferException.invalidTag();
            }
            return this.lastTag;
        }

        @Override // com.google.protobuf.CodedInputStream
        public final void checkLastTagWas(int i) throws com.google.protobuf.InvalidProtocolBufferException {
            if (this.lastTag != i) {
                throw com.google.protobuf.InvalidProtocolBufferException.invalidEndTag();
            }
        }

        @Override // com.google.protobuf.CodedInputStream
        public final int getLastTag() {
            return this.lastTag;
        }

        @Override // com.google.protobuf.CodedInputStream
        public final boolean skipField(int i) throws java.io.IOException {
            int tagWireType = com.google.protobuf.WireFormat.getTagWireType(i);
            if (tagWireType == 0) {
                skipRawVarint();
                return true;
            }
            if (tagWireType == 1) {
                skipRawBytes(8);
                return true;
            }
            if (tagWireType == 2) {
                skipRawBytes(readRawVarint32());
                return true;
            }
            if (tagWireType == 3) {
                skipMessage();
                checkLastTagWas(com.google.protobuf.WireFormat.makeTag(com.google.protobuf.WireFormat.getTagFieldNumber(i), 4));
                return true;
            }
            if (tagWireType == 4) {
                return false;
            }
            if (tagWireType == 5) {
                skipRawBytes(4);
                return true;
            }
            throw com.google.protobuf.InvalidProtocolBufferException.invalidWireType();
        }

        @Override // com.google.protobuf.CodedInputStream
        public final boolean skipField(int i, com.google.protobuf.CodedOutputStream codedOutputStream) throws java.io.IOException {
            int tagWireType = com.google.protobuf.WireFormat.getTagWireType(i);
            if (tagWireType == 0) {
                long readInt64 = readInt64();
                codedOutputStream.writeUInt32NoTag(i);
                codedOutputStream.writeUInt64NoTag(readInt64);
                return true;
            }
            if (tagWireType == 1) {
                long readRawLittleEndian64 = readRawLittleEndian64();
                codedOutputStream.writeUInt32NoTag(i);
                codedOutputStream.writeFixed64NoTag(readRawLittleEndian64);
                return true;
            }
            if (tagWireType == 2) {
                com.google.protobuf.ByteString readBytes = readBytes();
                codedOutputStream.writeUInt32NoTag(i);
                codedOutputStream.writeBytesNoTag(readBytes);
                return true;
            }
            if (tagWireType == 3) {
                codedOutputStream.writeUInt32NoTag(i);
                skipMessage(codedOutputStream);
                int makeTag = com.google.protobuf.WireFormat.makeTag(com.google.protobuf.WireFormat.getTagFieldNumber(i), 4);
                checkLastTagWas(makeTag);
                codedOutputStream.writeUInt32NoTag(makeTag);
                return true;
            }
            if (tagWireType == 4) {
                return false;
            }
            if (tagWireType == 5) {
                int readRawLittleEndian32 = readRawLittleEndian32();
                codedOutputStream.writeUInt32NoTag(i);
                codedOutputStream.writeFixed32NoTag(readRawLittleEndian32);
                return true;
            }
            throw com.google.protobuf.InvalidProtocolBufferException.invalidWireType();
        }

        @Override // com.google.protobuf.CodedInputStream
        public final double readDouble() throws java.io.IOException {
            return java.lang.Double.longBitsToDouble(readRawLittleEndian64());
        }

        @Override // com.google.protobuf.CodedInputStream
        public final float readFloat() throws java.io.IOException {
            return java.lang.Float.intBitsToFloat(readRawLittleEndian32());
        }

        @Override // com.google.protobuf.CodedInputStream
        public final long readUInt64() throws java.io.IOException {
            return readRawVarint64();
        }

        @Override // com.google.protobuf.CodedInputStream
        public final long readInt64() throws java.io.IOException {
            return readRawVarint64();
        }

        @Override // com.google.protobuf.CodedInputStream
        public final int readInt32() throws java.io.IOException {
            return readRawVarint32();
        }

        @Override // com.google.protobuf.CodedInputStream
        public final long readFixed64() throws java.io.IOException {
            return readRawLittleEndian64();
        }

        @Override // com.google.protobuf.CodedInputStream
        public final int readFixed32() throws java.io.IOException {
            return readRawLittleEndian32();
        }

        @Override // com.google.protobuf.CodedInputStream
        public final boolean readBool() throws java.io.IOException {
            return readRawVarint64() != 0;
        }

        @Override // com.google.protobuf.CodedInputStream
        public final java.lang.String readString() throws java.io.IOException {
            int readRawVarint32 = readRawVarint32();
            if (readRawVarint32 > 0) {
                int i = this.limit;
                int i2 = this.pos;
                if (readRawVarint32 <= i - i2) {
                    java.lang.String str = new java.lang.String(this.buffer, i2, readRawVarint32, com.google.protobuf.Internal.UTF_8);
                    this.pos += readRawVarint32;
                    return str;
                }
            }
            if (readRawVarint32 == 0) {
                return "";
            }
            if (readRawVarint32 < 0) {
                throw com.google.protobuf.InvalidProtocolBufferException.negativeSize();
            }
            throw com.google.protobuf.InvalidProtocolBufferException.truncatedMessage();
        }

        @Override // com.google.protobuf.CodedInputStream
        public final java.lang.String readStringRequireUtf8() throws java.io.IOException {
            int readRawVarint32 = readRawVarint32();
            if (readRawVarint32 > 0) {
                int i = this.limit;
                int i2 = this.pos;
                if (readRawVarint32 <= i - i2) {
                    java.lang.String decodeUtf8 = com.google.protobuf.Utf8.decodeUtf8(this.buffer, i2, readRawVarint32);
                    this.pos += readRawVarint32;
                    return decodeUtf8;
                }
            }
            if (readRawVarint32 == 0) {
                return "";
            }
            if (readRawVarint32 <= 0) {
                throw com.google.protobuf.InvalidProtocolBufferException.negativeSize();
            }
            throw com.google.protobuf.InvalidProtocolBufferException.truncatedMessage();
        }

        @Override // com.google.protobuf.CodedInputStream
        public final void readGroup(int i, com.google.protobuf.MessageLite.Builder builder, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
            checkRecursionLimit();
            this.recursionDepth++;
            builder.mergeFrom(this, extensionRegistryLite);
            checkLastTagWas(com.google.protobuf.WireFormat.makeTag(i, 4));
            this.recursionDepth--;
        }

        @Override // com.google.protobuf.CodedInputStream
        public final <T extends com.google.protobuf.MessageLite> T readGroup(int i, com.google.protobuf.Parser<T> parser, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
            checkRecursionLimit();
            this.recursionDepth++;
            T parsePartialFrom = parser.parsePartialFrom(this, extensionRegistryLite);
            checkLastTagWas(com.google.protobuf.WireFormat.makeTag(i, 4));
            this.recursionDepth--;
            return parsePartialFrom;
        }

        @Override // com.google.protobuf.CodedInputStream
        @java.lang.Deprecated
        public final void readUnknownGroup(int i, com.google.protobuf.MessageLite.Builder builder) throws java.io.IOException {
            readGroup(i, builder, com.google.protobuf.ExtensionRegistryLite.getEmptyRegistry());
        }

        @Override // com.google.protobuf.CodedInputStream
        public final void readMessage(com.google.protobuf.MessageLite.Builder builder, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
            int readRawVarint32 = readRawVarint32();
            checkRecursionLimit();
            int pushLimit = pushLimit(readRawVarint32);
            this.recursionDepth++;
            builder.mergeFrom(this, extensionRegistryLite);
            checkLastTagWas(0);
            this.recursionDepth--;
            if (getBytesUntilLimit() != 0) {
                throw com.google.protobuf.InvalidProtocolBufferException.truncatedMessage();
            }
            popLimit(pushLimit);
        }

        @Override // com.google.protobuf.CodedInputStream
        public final <T extends com.google.protobuf.MessageLite> T readMessage(com.google.protobuf.Parser<T> parser, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
            int readRawVarint32 = readRawVarint32();
            checkRecursionLimit();
            int pushLimit = pushLimit(readRawVarint32);
            this.recursionDepth++;
            T parsePartialFrom = parser.parsePartialFrom(this, extensionRegistryLite);
            checkLastTagWas(0);
            this.recursionDepth--;
            if (getBytesUntilLimit() != 0) {
                throw com.google.protobuf.InvalidProtocolBufferException.truncatedMessage();
            }
            popLimit(pushLimit);
            return parsePartialFrom;
        }

        @Override // com.google.protobuf.CodedInputStream
        public final com.google.protobuf.ByteString readBytes() throws java.io.IOException {
            com.google.protobuf.ByteString copyFrom;
            int readRawVarint32 = readRawVarint32();
            if (readRawVarint32 > 0) {
                int i = this.limit;
                int i2 = this.pos;
                if (readRawVarint32 <= i - i2) {
                    if (this.immutable && this.enableAliasing) {
                        copyFrom = com.google.protobuf.ByteString.wrap(this.buffer, i2, readRawVarint32);
                    } else {
                        copyFrom = com.google.protobuf.ByteString.copyFrom(this.buffer, i2, readRawVarint32);
                    }
                    this.pos += readRawVarint32;
                    return copyFrom;
                }
            }
            if (readRawVarint32 == 0) {
                return com.google.protobuf.ByteString.EMPTY;
            }
            return com.google.protobuf.ByteString.wrap(readRawBytes(readRawVarint32));
        }

        @Override // com.google.protobuf.CodedInputStream
        public final byte[] readByteArray() throws java.io.IOException {
            return readRawBytes(readRawVarint32());
        }

        @Override // com.google.protobuf.CodedInputStream
        public final java.nio.ByteBuffer readByteBuffer() throws java.io.IOException {
            java.nio.ByteBuffer wrap;
            int readRawVarint32 = readRawVarint32();
            if (readRawVarint32 > 0) {
                int i = this.limit;
                int i2 = this.pos;
                if (readRawVarint32 <= i - i2) {
                    if (!this.immutable && this.enableAliasing) {
                        wrap = java.nio.ByteBuffer.wrap(this.buffer, i2, readRawVarint32).slice();
                    } else {
                        wrap = java.nio.ByteBuffer.wrap(java.util.Arrays.copyOfRange(this.buffer, i2, i2 + readRawVarint32));
                    }
                    this.pos += readRawVarint32;
                    return wrap;
                }
            }
            if (readRawVarint32 == 0) {
                return com.google.protobuf.Internal.EMPTY_BYTE_BUFFER;
            }
            if (readRawVarint32 < 0) {
                throw com.google.protobuf.InvalidProtocolBufferException.negativeSize();
            }
            throw com.google.protobuf.InvalidProtocolBufferException.truncatedMessage();
        }

        @Override // com.google.protobuf.CodedInputStream
        public final int readUInt32() throws java.io.IOException {
            return readRawVarint32();
        }

        @Override // com.google.protobuf.CodedInputStream
        public final int readEnum() throws java.io.IOException {
            return readRawVarint32();
        }

        @Override // com.google.protobuf.CodedInputStream
        public final int readSFixed32() throws java.io.IOException {
            return readRawLittleEndian32();
        }

        @Override // com.google.protobuf.CodedInputStream
        public final long readSFixed64() throws java.io.IOException {
            return readRawLittleEndian64();
        }

        @Override // com.google.protobuf.CodedInputStream
        public final int readSInt32() throws java.io.IOException {
            return decodeZigZag32(readRawVarint32());
        }

        @Override // com.google.protobuf.CodedInputStream
        public final long readSInt64() throws java.io.IOException {
            return decodeZigZag64(readRawVarint64());
        }

        @Override // com.google.protobuf.CodedInputStream
        public final int readRawVarint32() throws java.io.IOException {
            int i;
            int i2 = this.pos;
            int i3 = this.limit;
            if (i3 != i2) {
                byte[] bArr = this.buffer;
                int i4 = i2 + 1;
                byte b = bArr[i2];
                if (b >= 0) {
                    this.pos = i4;
                    return b;
                }
                if (i3 - i4 >= 9) {
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
                                                    if (bArr[i7] >= 0) {
                                                        i5 = i2 + 10;
                                                        i = i11;
                                                    }
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
            }
            return (int) readRawVarint64SlowPath();
        }

        private void skipRawVarint() throws java.io.IOException {
            if (this.limit - this.pos >= 10) {
                skipRawVarintFastPath();
            } else {
                skipRawVarintSlowPath();
            }
        }

        private void skipRawVarintFastPath() throws java.io.IOException {
            for (int i = 0; i < 10; i++) {
                byte[] bArr = this.buffer;
                int i2 = this.pos;
                this.pos = i2 + 1;
                if (bArr[i2] >= 0) {
                    return;
                }
            }
            throw com.google.protobuf.InvalidProtocolBufferException.malformedVarint();
        }

        private void skipRawVarintSlowPath() throws java.io.IOException {
            for (int i = 0; i < 10; i++) {
                if (readRawByte() >= 0) {
                    return;
                }
            }
            throw com.google.protobuf.InvalidProtocolBufferException.malformedVarint();
        }

        @Override // com.google.protobuf.CodedInputStream
        public final long readRawVarint64() throws java.io.IOException {
            long j;
            long j2;
            long j3;
            int i = this.pos;
            int i2 = this.limit;
            if (i2 != i) {
                byte[] bArr = this.buffer;
                int i3 = i + 1;
                byte b = bArr[i];
                if (b >= 0) {
                    this.pos = i3;
                    return b;
                }
                if (i2 - i3 >= 9) {
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
                                                    if (bArr[i4] >= 0) {
                                                        i4 = i + 10;
                                                    }
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
            }
            return readRawVarint64SlowPath();
        }

        @Override // com.google.protobuf.CodedInputStream
        final long readRawVarint64SlowPath() throws java.io.IOException {
            long j = 0;
            for (int i = 0; i < 64; i += 7) {
                j |= (r3 & Byte.MAX_VALUE) << i;
                if ((readRawByte() & 128) == 0) {
                    return j;
                }
            }
            throw com.google.protobuf.InvalidProtocolBufferException.malformedVarint();
        }

        @Override // com.google.protobuf.CodedInputStream
        public final int readRawLittleEndian32() throws java.io.IOException {
            int i = this.pos;
            if (this.limit - i < 4) {
                throw com.google.protobuf.InvalidProtocolBufferException.truncatedMessage();
            }
            byte[] bArr = this.buffer;
            this.pos = i + 4;
            return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
        }

        @Override // com.google.protobuf.CodedInputStream
        public final long readRawLittleEndian64() throws java.io.IOException {
            int i = this.pos;
            if (this.limit - i < 8) {
                throw com.google.protobuf.InvalidProtocolBufferException.truncatedMessage();
            }
            byte[] bArr = this.buffer;
            this.pos = i + 8;
            return ((bArr[i + 7] & 255) << 56) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24) | ((bArr[i + 4] & 255) << 32) | ((bArr[i + 5] & 255) << 40) | ((bArr[i + 6] & 255) << 48);
        }

        @Override // com.google.protobuf.CodedInputStream
        public final void enableAliasing(boolean z) {
            this.enableAliasing = z;
        }

        @Override // com.google.protobuf.CodedInputStream
        public final void resetSizeCounter() {
            this.startPos = this.pos;
        }

        @Override // com.google.protobuf.CodedInputStream
        public final int pushLimit(int i) throws com.google.protobuf.InvalidProtocolBufferException {
            if (i < 0) {
                throw com.google.protobuf.InvalidProtocolBufferException.negativeSize();
            }
            int totalBytesRead = i + getTotalBytesRead();
            if (totalBytesRead < 0) {
                throw com.google.protobuf.InvalidProtocolBufferException.parseFailure();
            }
            int i2 = this.currentLimit;
            if (totalBytesRead > i2) {
                throw com.google.protobuf.InvalidProtocolBufferException.truncatedMessage();
            }
            this.currentLimit = totalBytesRead;
            recomputeBufferSizeAfterLimit();
            return i2;
        }

        private void recomputeBufferSizeAfterLimit() {
            int i = this.limit + this.bufferSizeAfterLimit;
            this.limit = i;
            int i2 = i - this.startPos;
            int i3 = this.currentLimit;
            if (i2 > i3) {
                int i4 = i2 - i3;
                this.bufferSizeAfterLimit = i4;
                this.limit = i - i4;
                return;
            }
            this.bufferSizeAfterLimit = 0;
        }

        @Override // com.google.protobuf.CodedInputStream
        public final void popLimit(int i) {
            this.currentLimit = i;
            recomputeBufferSizeAfterLimit();
        }

        @Override // com.google.protobuf.CodedInputStream
        public final int getBytesUntilLimit() {
            int i = this.currentLimit;
            if (i == Integer.MAX_VALUE) {
                return -1;
            }
            return i - getTotalBytesRead();
        }

        @Override // com.google.protobuf.CodedInputStream
        public final boolean isAtEnd() throws java.io.IOException {
            return this.pos == this.limit;
        }

        @Override // com.google.protobuf.CodedInputStream
        public final int getTotalBytesRead() {
            return this.pos - this.startPos;
        }

        @Override // com.google.protobuf.CodedInputStream
        public final byte readRawByte() throws java.io.IOException {
            int i = this.pos;
            if (i == this.limit) {
                throw com.google.protobuf.InvalidProtocolBufferException.truncatedMessage();
            }
            byte[] bArr = this.buffer;
            this.pos = i + 1;
            return bArr[i];
        }

        @Override // com.google.protobuf.CodedInputStream
        public final byte[] readRawBytes(int i) throws java.io.IOException {
            if (i > 0) {
                int i2 = this.limit;
                int i3 = this.pos;
                if (i <= i2 - i3) {
                    int i4 = i + i3;
                    this.pos = i4;
                    return java.util.Arrays.copyOfRange(this.buffer, i3, i4);
                }
            }
            if (i > 0) {
                throw com.google.protobuf.InvalidProtocolBufferException.truncatedMessage();
            }
            if (i == 0) {
                return com.google.protobuf.Internal.EMPTY_BYTE_ARRAY;
            }
            throw com.google.protobuf.InvalidProtocolBufferException.negativeSize();
        }

        @Override // com.google.protobuf.CodedInputStream
        public final void skipRawBytes(int i) throws java.io.IOException {
            if (i >= 0) {
                int i2 = this.limit;
                int i3 = this.pos;
                if (i <= i2 - i3) {
                    this.pos = i3 + i;
                    return;
                }
            }
            if (i < 0) {
                throw com.google.protobuf.InvalidProtocolBufferException.negativeSize();
            }
            throw com.google.protobuf.InvalidProtocolBufferException.truncatedMessage();
        }
    }

    static final class UnsafeDirectNioDecoder extends com.google.protobuf.CodedInputStream {
        private final long address;
        private final java.nio.ByteBuffer buffer;
        private int bufferSizeAfterLimit;
        private int currentLimit;
        private boolean enableAliasing;
        private final boolean immutable;
        private int lastTag;
        private long limit;
        private long pos;
        private long startPos;

        static boolean isSupported() {
            return com.google.protobuf.UnsafeUtil.hasUnsafeByteBufferOperations();
        }

        private UnsafeDirectNioDecoder(java.nio.ByteBuffer byteBuffer, boolean z) {
            super();
            this.currentLimit = Integer.MAX_VALUE;
            this.buffer = byteBuffer;
            long addressOffset = com.google.protobuf.UnsafeUtil.addressOffset(byteBuffer);
            this.address = addressOffset;
            this.limit = byteBuffer.limit() + addressOffset;
            long position = addressOffset + byteBuffer.position();
            this.pos = position;
            this.startPos = position;
            this.immutable = z;
        }

        @Override // com.google.protobuf.CodedInputStream
        public final int readTag() throws java.io.IOException {
            if (isAtEnd()) {
                this.lastTag = 0;
                return 0;
            }
            int readRawVarint32 = readRawVarint32();
            this.lastTag = readRawVarint32;
            if (com.google.protobuf.WireFormat.getTagFieldNumber(readRawVarint32) == 0) {
                throw com.google.protobuf.InvalidProtocolBufferException.invalidTag();
            }
            return this.lastTag;
        }

        @Override // com.google.protobuf.CodedInputStream
        public final void checkLastTagWas(int i) throws com.google.protobuf.InvalidProtocolBufferException {
            if (this.lastTag != i) {
                throw com.google.protobuf.InvalidProtocolBufferException.invalidEndTag();
            }
        }

        @Override // com.google.protobuf.CodedInputStream
        public final int getLastTag() {
            return this.lastTag;
        }

        @Override // com.google.protobuf.CodedInputStream
        public final boolean skipField(int i) throws java.io.IOException {
            int tagWireType = com.google.protobuf.WireFormat.getTagWireType(i);
            if (tagWireType == 0) {
                skipRawVarint();
                return true;
            }
            if (tagWireType == 1) {
                skipRawBytes(8);
                return true;
            }
            if (tagWireType == 2) {
                skipRawBytes(readRawVarint32());
                return true;
            }
            if (tagWireType == 3) {
                skipMessage();
                checkLastTagWas(com.google.protobuf.WireFormat.makeTag(com.google.protobuf.WireFormat.getTagFieldNumber(i), 4));
                return true;
            }
            if (tagWireType == 4) {
                return false;
            }
            if (tagWireType == 5) {
                skipRawBytes(4);
                return true;
            }
            throw com.google.protobuf.InvalidProtocolBufferException.invalidWireType();
        }

        @Override // com.google.protobuf.CodedInputStream
        public final boolean skipField(int i, com.google.protobuf.CodedOutputStream codedOutputStream) throws java.io.IOException {
            int tagWireType = com.google.protobuf.WireFormat.getTagWireType(i);
            if (tagWireType == 0) {
                long readInt64 = readInt64();
                codedOutputStream.writeUInt32NoTag(i);
                codedOutputStream.writeUInt64NoTag(readInt64);
                return true;
            }
            if (tagWireType == 1) {
                long readRawLittleEndian64 = readRawLittleEndian64();
                codedOutputStream.writeUInt32NoTag(i);
                codedOutputStream.writeFixed64NoTag(readRawLittleEndian64);
                return true;
            }
            if (tagWireType == 2) {
                com.google.protobuf.ByteString readBytes = readBytes();
                codedOutputStream.writeUInt32NoTag(i);
                codedOutputStream.writeBytesNoTag(readBytes);
                return true;
            }
            if (tagWireType == 3) {
                codedOutputStream.writeUInt32NoTag(i);
                skipMessage(codedOutputStream);
                int makeTag = com.google.protobuf.WireFormat.makeTag(com.google.protobuf.WireFormat.getTagFieldNumber(i), 4);
                checkLastTagWas(makeTag);
                codedOutputStream.writeUInt32NoTag(makeTag);
                return true;
            }
            if (tagWireType == 4) {
                return false;
            }
            if (tagWireType == 5) {
                int readRawLittleEndian32 = readRawLittleEndian32();
                codedOutputStream.writeUInt32NoTag(i);
                codedOutputStream.writeFixed32NoTag(readRawLittleEndian32);
                return true;
            }
            throw com.google.protobuf.InvalidProtocolBufferException.invalidWireType();
        }

        @Override // com.google.protobuf.CodedInputStream
        public final double readDouble() throws java.io.IOException {
            return java.lang.Double.longBitsToDouble(readRawLittleEndian64());
        }

        @Override // com.google.protobuf.CodedInputStream
        public final float readFloat() throws java.io.IOException {
            return java.lang.Float.intBitsToFloat(readRawLittleEndian32());
        }

        @Override // com.google.protobuf.CodedInputStream
        public final long readUInt64() throws java.io.IOException {
            return readRawVarint64();
        }

        @Override // com.google.protobuf.CodedInputStream
        public final long readInt64() throws java.io.IOException {
            return readRawVarint64();
        }

        @Override // com.google.protobuf.CodedInputStream
        public final int readInt32() throws java.io.IOException {
            return readRawVarint32();
        }

        @Override // com.google.protobuf.CodedInputStream
        public final long readFixed64() throws java.io.IOException {
            return readRawLittleEndian64();
        }

        @Override // com.google.protobuf.CodedInputStream
        public final int readFixed32() throws java.io.IOException {
            return readRawLittleEndian32();
        }

        @Override // com.google.protobuf.CodedInputStream
        public final boolean readBool() throws java.io.IOException {
            return readRawVarint64() != 0;
        }

        @Override // com.google.protobuf.CodedInputStream
        public final java.lang.String readString() throws java.io.IOException {
            int readRawVarint32 = readRawVarint32();
            if (readRawVarint32 <= 0 || readRawVarint32 > remaining()) {
                if (readRawVarint32 == 0) {
                    return "";
                }
                if (readRawVarint32 < 0) {
                    throw com.google.protobuf.InvalidProtocolBufferException.negativeSize();
                }
                throw com.google.protobuf.InvalidProtocolBufferException.truncatedMessage();
            }
            byte[] bArr = new byte[readRawVarint32];
            long j = readRawVarint32;
            com.google.protobuf.UnsafeUtil.copyMemory(this.pos, bArr, 0L, j);
            java.lang.String str = new java.lang.String(bArr, com.google.protobuf.Internal.UTF_8);
            this.pos += j;
            return str;
        }

        @Override // com.google.protobuf.CodedInputStream
        public final java.lang.String readStringRequireUtf8() throws java.io.IOException {
            int readRawVarint32 = readRawVarint32();
            if (readRawVarint32 > 0 && readRawVarint32 <= remaining()) {
                java.lang.String decodeUtf8 = com.google.protobuf.Utf8.decodeUtf8(this.buffer, bufferPos(this.pos), readRawVarint32);
                this.pos += readRawVarint32;
                return decodeUtf8;
            }
            if (readRawVarint32 == 0) {
                return "";
            }
            if (readRawVarint32 <= 0) {
                throw com.google.protobuf.InvalidProtocolBufferException.negativeSize();
            }
            throw com.google.protobuf.InvalidProtocolBufferException.truncatedMessage();
        }

        @Override // com.google.protobuf.CodedInputStream
        public final void readGroup(int i, com.google.protobuf.MessageLite.Builder builder, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
            checkRecursionLimit();
            this.recursionDepth++;
            builder.mergeFrom(this, extensionRegistryLite);
            checkLastTagWas(com.google.protobuf.WireFormat.makeTag(i, 4));
            this.recursionDepth--;
        }

        @Override // com.google.protobuf.CodedInputStream
        public final <T extends com.google.protobuf.MessageLite> T readGroup(int i, com.google.protobuf.Parser<T> parser, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
            checkRecursionLimit();
            this.recursionDepth++;
            T parsePartialFrom = parser.parsePartialFrom(this, extensionRegistryLite);
            checkLastTagWas(com.google.protobuf.WireFormat.makeTag(i, 4));
            this.recursionDepth--;
            return parsePartialFrom;
        }

        @Override // com.google.protobuf.CodedInputStream
        @java.lang.Deprecated
        public final void readUnknownGroup(int i, com.google.protobuf.MessageLite.Builder builder) throws java.io.IOException {
            readGroup(i, builder, com.google.protobuf.ExtensionRegistryLite.getEmptyRegistry());
        }

        @Override // com.google.protobuf.CodedInputStream
        public final void readMessage(com.google.protobuf.MessageLite.Builder builder, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
            int readRawVarint32 = readRawVarint32();
            checkRecursionLimit();
            int pushLimit = pushLimit(readRawVarint32);
            this.recursionDepth++;
            builder.mergeFrom(this, extensionRegistryLite);
            checkLastTagWas(0);
            this.recursionDepth--;
            if (getBytesUntilLimit() != 0) {
                throw com.google.protobuf.InvalidProtocolBufferException.truncatedMessage();
            }
            popLimit(pushLimit);
        }

        @Override // com.google.protobuf.CodedInputStream
        public final <T extends com.google.protobuf.MessageLite> T readMessage(com.google.protobuf.Parser<T> parser, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
            int readRawVarint32 = readRawVarint32();
            checkRecursionLimit();
            int pushLimit = pushLimit(readRawVarint32);
            this.recursionDepth++;
            T parsePartialFrom = parser.parsePartialFrom(this, extensionRegistryLite);
            checkLastTagWas(0);
            this.recursionDepth--;
            if (getBytesUntilLimit() != 0) {
                throw com.google.protobuf.InvalidProtocolBufferException.truncatedMessage();
            }
            popLimit(pushLimit);
            return parsePartialFrom;
        }

        @Override // com.google.protobuf.CodedInputStream
        public final com.google.protobuf.ByteString readBytes() throws java.io.IOException {
            int readRawVarint32 = readRawVarint32();
            if (readRawVarint32 <= 0 || readRawVarint32 > remaining()) {
                if (readRawVarint32 == 0) {
                    return com.google.protobuf.ByteString.EMPTY;
                }
                if (readRawVarint32 < 0) {
                    throw com.google.protobuf.InvalidProtocolBufferException.negativeSize();
                }
                throw com.google.protobuf.InvalidProtocolBufferException.truncatedMessage();
            }
            if (this.immutable && this.enableAliasing) {
                long j = this.pos;
                long j2 = readRawVarint32;
                java.nio.ByteBuffer slice = slice(j, j + j2);
                this.pos += j2;
                return com.google.protobuf.ByteString.wrap(slice);
            }
            byte[] bArr = new byte[readRawVarint32];
            long j3 = readRawVarint32;
            com.google.protobuf.UnsafeUtil.copyMemory(this.pos, bArr, 0L, j3);
            this.pos += j3;
            return com.google.protobuf.ByteString.wrap(bArr);
        }

        @Override // com.google.protobuf.CodedInputStream
        public final byte[] readByteArray() throws java.io.IOException {
            return readRawBytes(readRawVarint32());
        }

        @Override // com.google.protobuf.CodedInputStream
        public final java.nio.ByteBuffer readByteBuffer() throws java.io.IOException {
            int readRawVarint32 = readRawVarint32();
            if (readRawVarint32 <= 0 || readRawVarint32 > remaining()) {
                if (readRawVarint32 == 0) {
                    return com.google.protobuf.Internal.EMPTY_BYTE_BUFFER;
                }
                if (readRawVarint32 < 0) {
                    throw com.google.protobuf.InvalidProtocolBufferException.negativeSize();
                }
                throw com.google.protobuf.InvalidProtocolBufferException.truncatedMessage();
            }
            if (!this.immutable && this.enableAliasing) {
                long j = this.pos;
                long j2 = readRawVarint32;
                java.nio.ByteBuffer slice = slice(j, j + j2);
                this.pos += j2;
                return slice;
            }
            byte[] bArr = new byte[readRawVarint32];
            long j3 = readRawVarint32;
            com.google.protobuf.UnsafeUtil.copyMemory(this.pos, bArr, 0L, j3);
            this.pos += j3;
            return java.nio.ByteBuffer.wrap(bArr);
        }

        @Override // com.google.protobuf.CodedInputStream
        public final int readUInt32() throws java.io.IOException {
            return readRawVarint32();
        }

        @Override // com.google.protobuf.CodedInputStream
        public final int readEnum() throws java.io.IOException {
            return readRawVarint32();
        }

        @Override // com.google.protobuf.CodedInputStream
        public final int readSFixed32() throws java.io.IOException {
            return readRawLittleEndian32();
        }

        @Override // com.google.protobuf.CodedInputStream
        public final long readSFixed64() throws java.io.IOException {
            return readRawLittleEndian64();
        }

        @Override // com.google.protobuf.CodedInputStream
        public final int readSInt32() throws java.io.IOException {
            return decodeZigZag32(readRawVarint32());
        }

        @Override // com.google.protobuf.CodedInputStream
        public final long readSInt64() throws java.io.IOException {
            return decodeZigZag64(readRawVarint64());
        }

        /* JADX WARN: Code restructure failed: missing block: B:33:0x0087, code lost:
        
            if (com.google.protobuf.UnsafeUtil.getByte(r3) < 0) goto L37;
         */
        @Override // com.google.protobuf.CodedInputStream
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final int readRawVarint32() throws java.io.IOException {
            int i;
            long j = this.pos;
            if (this.limit != j) {
                long j2 = 1 + j;
                byte b = com.google.protobuf.UnsafeUtil.getByte(j);
                if (b >= 0) {
                    this.pos = j2;
                    return b;
                }
                if (this.limit - j2 >= 9) {
                    long j3 = 2 + j;
                    int i2 = (com.google.protobuf.UnsafeUtil.getByte(j2) << 7) ^ b;
                    if (i2 < 0) {
                        i = i2 ^ androidx.work.WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT;
                    } else {
                        long j4 = 3 + j;
                        int i3 = i2 ^ (com.google.protobuf.UnsafeUtil.getByte(j3) << 14);
                        if (i3 >= 0) {
                            i = i3 ^ 16256;
                        } else {
                            j3 = 4 + j;
                            int i4 = i3 ^ (com.google.protobuf.UnsafeUtil.getByte(j4) << com.google.common.base.Ascii.NAK);
                            if (i4 < 0) {
                                i = (-2080896) ^ i4;
                            } else {
                                j4 = 5 + j;
                                byte b2 = com.google.protobuf.UnsafeUtil.getByte(j3);
                                int i5 = (i4 ^ (b2 << com.google.common.base.Ascii.FS)) ^ 266354560;
                                if (b2 < 0) {
                                    j3 = 6 + j;
                                    if (com.google.protobuf.UnsafeUtil.getByte(j4) < 0) {
                                        j4 = 7 + j;
                                        if (com.google.protobuf.UnsafeUtil.getByte(j3) < 0) {
                                            j3 = 8 + j;
                                            if (com.google.protobuf.UnsafeUtil.getByte(j4) < 0) {
                                                j4 = j + 9;
                                                if (com.google.protobuf.UnsafeUtil.getByte(j3) < 0) {
                                                    j3 = 10 + j;
                                                }
                                            }
                                        }
                                    }
                                    i = i5;
                                }
                                i = i5;
                            }
                        }
                        j3 = j4;
                    }
                    this.pos = j3;
                    return i;
                }
            }
            return (int) readRawVarint64SlowPath();
        }

        private void skipRawVarint() throws java.io.IOException {
            if (remaining() >= 10) {
                skipRawVarintFastPath();
            } else {
                skipRawVarintSlowPath();
            }
        }

        private void skipRawVarintFastPath() throws java.io.IOException {
            for (int i = 0; i < 10; i++) {
                long j = this.pos;
                this.pos = 1 + j;
                if (com.google.protobuf.UnsafeUtil.getByte(j) >= 0) {
                    return;
                }
            }
            throw com.google.protobuf.InvalidProtocolBufferException.malformedVarint();
        }

        private void skipRawVarintSlowPath() throws java.io.IOException {
            for (int i = 0; i < 10; i++) {
                if (readRawByte() >= 0) {
                    return;
                }
            }
            throw com.google.protobuf.InvalidProtocolBufferException.malformedVarint();
        }

        @Override // com.google.protobuf.CodedInputStream
        public final long readRawVarint64() throws java.io.IOException {
            long j;
            long j2;
            long j3;
            long j4;
            int i;
            long j5 = this.pos;
            if (this.limit != j5) {
                long j6 = 1 + j5;
                byte b = com.google.protobuf.UnsafeUtil.getByte(j5);
                if (b >= 0) {
                    this.pos = j6;
                    return b;
                }
                if (this.limit - j6 >= 9) {
                    long j7 = 2 + j5;
                    int i2 = (com.google.protobuf.UnsafeUtil.getByte(j6) << 7) ^ b;
                    if (i2 >= 0) {
                        j = 3 + j5;
                        int i3 = i2 ^ (com.google.protobuf.UnsafeUtil.getByte(j7) << 14);
                        if (i3 >= 0) {
                            j2 = i3 ^ 16256;
                        } else {
                            j7 = 4 + j5;
                            int i4 = i3 ^ (com.google.protobuf.UnsafeUtil.getByte(j) << com.google.common.base.Ascii.NAK);
                            if (i4 < 0) {
                                i = (-2080896) ^ i4;
                            } else {
                                long j8 = 5 + j5;
                                long j9 = i4 ^ (com.google.protobuf.UnsafeUtil.getByte(j7) << 28);
                                if (j9 >= 0) {
                                    j4 = 266354560;
                                } else {
                                    long j10 = 6 + j5;
                                    long j11 = j9 ^ (com.google.protobuf.UnsafeUtil.getByte(j8) << 35);
                                    if (j11 < 0) {
                                        j3 = -34093383808L;
                                    } else {
                                        j8 = 7 + j5;
                                        j9 = j11 ^ (com.google.protobuf.UnsafeUtil.getByte(j10) << 42);
                                        if (j9 >= 0) {
                                            j4 = 4363953127296L;
                                        } else {
                                            j10 = 8 + j5;
                                            j11 = j9 ^ (com.google.protobuf.UnsafeUtil.getByte(j8) << 49);
                                            if (j11 < 0) {
                                                j3 = -558586000294016L;
                                            } else {
                                                long j12 = j5 + 9;
                                                long j13 = (j11 ^ (com.google.protobuf.UnsafeUtil.getByte(j10) << 56)) ^ 71499008037633920L;
                                                if (j13 >= 0) {
                                                    j2 = j13;
                                                    j = j12;
                                                } else if (com.google.protobuf.UnsafeUtil.getByte(j12) >= 0) {
                                                    long j14 = j5 + 10;
                                                    j2 = j13;
                                                    j = j14;
                                                }
                                            }
                                        }
                                    }
                                    j2 = j3 ^ j11;
                                    j = j10;
                                }
                                j2 = j4 ^ j9;
                                j = j8;
                            }
                        }
                        this.pos = j;
                        return j2;
                    }
                    i = i2 ^ androidx.work.WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT;
                    j2 = i;
                    j = j7;
                    this.pos = j;
                    return j2;
                }
            }
            return readRawVarint64SlowPath();
        }

        @Override // com.google.protobuf.CodedInputStream
        final long readRawVarint64SlowPath() throws java.io.IOException {
            long j = 0;
            for (int i = 0; i < 64; i += 7) {
                j |= (r3 & Byte.MAX_VALUE) << i;
                if ((readRawByte() & 128) == 0) {
                    return j;
                }
            }
            throw com.google.protobuf.InvalidProtocolBufferException.malformedVarint();
        }

        @Override // com.google.protobuf.CodedInputStream
        public final int readRawLittleEndian32() throws java.io.IOException {
            long j = this.pos;
            if (this.limit - j < 4) {
                throw com.google.protobuf.InvalidProtocolBufferException.truncatedMessage();
            }
            this.pos = 4 + j;
            return ((com.google.protobuf.UnsafeUtil.getByte(j + 3) & 255) << 24) | (com.google.protobuf.UnsafeUtil.getByte(j) & 255) | ((com.google.protobuf.UnsafeUtil.getByte(1 + j) & 255) << 8) | ((com.google.protobuf.UnsafeUtil.getByte(2 + j) & 255) << 16);
        }

        @Override // com.google.protobuf.CodedInputStream
        public final long readRawLittleEndian64() throws java.io.IOException {
            long j = this.pos;
            if (this.limit - j < 8) {
                throw com.google.protobuf.InvalidProtocolBufferException.truncatedMessage();
            }
            this.pos = 8 + j;
            return ((com.google.protobuf.UnsafeUtil.getByte(j + 7) & 255) << 56) | (com.google.protobuf.UnsafeUtil.getByte(j) & 255) | ((com.google.protobuf.UnsafeUtil.getByte(1 + j) & 255) << 8) | ((com.google.protobuf.UnsafeUtil.getByte(2 + j) & 255) << 16) | ((com.google.protobuf.UnsafeUtil.getByte(3 + j) & 255) << 24) | ((com.google.protobuf.UnsafeUtil.getByte(4 + j) & 255) << 32) | ((com.google.protobuf.UnsafeUtil.getByte(5 + j) & 255) << 40) | ((com.google.protobuf.UnsafeUtil.getByte(6 + j) & 255) << 48);
        }

        @Override // com.google.protobuf.CodedInputStream
        public final void enableAliasing(boolean z) {
            this.enableAliasing = z;
        }

        @Override // com.google.protobuf.CodedInputStream
        public final void resetSizeCounter() {
            this.startPos = this.pos;
        }

        @Override // com.google.protobuf.CodedInputStream
        public final int pushLimit(int i) throws com.google.protobuf.InvalidProtocolBufferException {
            if (i < 0) {
                throw com.google.protobuf.InvalidProtocolBufferException.negativeSize();
            }
            int totalBytesRead = i + getTotalBytesRead();
            int i2 = this.currentLimit;
            if (totalBytesRead > i2) {
                throw com.google.protobuf.InvalidProtocolBufferException.truncatedMessage();
            }
            this.currentLimit = totalBytesRead;
            recomputeBufferSizeAfterLimit();
            return i2;
        }

        @Override // com.google.protobuf.CodedInputStream
        public final void popLimit(int i) {
            this.currentLimit = i;
            recomputeBufferSizeAfterLimit();
        }

        @Override // com.google.protobuf.CodedInputStream
        public final int getBytesUntilLimit() {
            int i = this.currentLimit;
            if (i == Integer.MAX_VALUE) {
                return -1;
            }
            return i - getTotalBytesRead();
        }

        @Override // com.google.protobuf.CodedInputStream
        public final boolean isAtEnd() throws java.io.IOException {
            return this.pos == this.limit;
        }

        @Override // com.google.protobuf.CodedInputStream
        public final int getTotalBytesRead() {
            return (int) (this.pos - this.startPos);
        }

        @Override // com.google.protobuf.CodedInputStream
        public final byte readRawByte() throws java.io.IOException {
            long j = this.pos;
            if (j == this.limit) {
                throw com.google.protobuf.InvalidProtocolBufferException.truncatedMessage();
            }
            this.pos = 1 + j;
            return com.google.protobuf.UnsafeUtil.getByte(j);
        }

        @Override // com.google.protobuf.CodedInputStream
        public final byte[] readRawBytes(int i) throws java.io.IOException {
            if (i < 0 || i > remaining()) {
                if (i > 0) {
                    throw com.google.protobuf.InvalidProtocolBufferException.truncatedMessage();
                }
                if (i == 0) {
                    return com.google.protobuf.Internal.EMPTY_BYTE_ARRAY;
                }
                throw com.google.protobuf.InvalidProtocolBufferException.negativeSize();
            }
            byte[] bArr = new byte[i];
            long j = this.pos;
            long j2 = i;
            slice(j, j + j2).get(bArr);
            this.pos += j2;
            return bArr;
        }

        @Override // com.google.protobuf.CodedInputStream
        public final void skipRawBytes(int i) throws java.io.IOException {
            if (i >= 0 && i <= remaining()) {
                this.pos += i;
            } else {
                if (i < 0) {
                    throw com.google.protobuf.InvalidProtocolBufferException.negativeSize();
                }
                throw com.google.protobuf.InvalidProtocolBufferException.truncatedMessage();
            }
        }

        private void recomputeBufferSizeAfterLimit() {
            long j = this.limit + this.bufferSizeAfterLimit;
            this.limit = j;
            int i = (int) (j - this.startPos);
            int i2 = this.currentLimit;
            if (i > i2) {
                int i3 = i - i2;
                this.bufferSizeAfterLimit = i3;
                this.limit = j - i3;
                return;
            }
            this.bufferSizeAfterLimit = 0;
        }

        private int remaining() {
            return (int) (this.limit - this.pos);
        }

        private int bufferPos(long j) {
            return (int) (j - this.address);
        }

        private java.nio.ByteBuffer slice(long j, long j2) throws java.io.IOException {
            int position = this.buffer.position();
            int limit = this.buffer.limit();
            java.nio.ByteBuffer byteBuffer = this.buffer;
            try {
                try {
                    byteBuffer.position(bufferPos(j));
                    byteBuffer.limit(bufferPos(j2));
                    return this.buffer.slice();
                } catch (java.lang.IllegalArgumentException e) {
                    com.google.protobuf.InvalidProtocolBufferException truncatedMessage = com.google.protobuf.InvalidProtocolBufferException.truncatedMessage();
                    truncatedMessage.initCause(e);
                    throw truncatedMessage;
                }
            } finally {
                byteBuffer.position(position);
                byteBuffer.limit(limit);
            }
        }
    }

    static final class StreamDecoder extends com.google.protobuf.CodedInputStream {
        private final byte[] buffer;
        private int bufferSize;
        private int bufferSizeAfterLimit;
        private int currentLimit;
        private final java.io.InputStream input;
        private int lastTag;
        private int pos;
        private com.google.protobuf.CodedInputStream.StreamDecoder.RefillCallback refillCallback;
        private int totalBytesRetired;

        interface RefillCallback {
            void onRefill();
        }

        @Override // com.google.protobuf.CodedInputStream
        public final void enableAliasing(boolean z) {
        }

        private StreamDecoder(java.io.InputStream inputStream, int i) {
            super();
            this.currentLimit = Integer.MAX_VALUE;
            this.refillCallback = null;
            com.google.protobuf.Internal.checkNotNull(inputStream, "input");
            this.input = inputStream;
            this.buffer = new byte[i];
            this.bufferSize = 0;
            this.pos = 0;
            this.totalBytesRetired = 0;
        }

        private static int read(java.io.InputStream inputStream, byte[] bArr, int i, int i2) throws java.io.IOException {
            try {
                return inputStream.read(bArr, i, i2);
            } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                e.setThrownFromInputStream();
                throw e;
            }
        }

        private static long skip(java.io.InputStream inputStream, long j) throws java.io.IOException {
            try {
                return inputStream.skip(j);
            } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                e.setThrownFromInputStream();
                throw e;
            }
        }

        private static int available(java.io.InputStream inputStream) throws java.io.IOException {
            try {
                return inputStream.available();
            } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                e.setThrownFromInputStream();
                throw e;
            }
        }

        @Override // com.google.protobuf.CodedInputStream
        public final int readTag() throws java.io.IOException {
            if (isAtEnd()) {
                this.lastTag = 0;
                return 0;
            }
            int readRawVarint32 = readRawVarint32();
            this.lastTag = readRawVarint32;
            if (com.google.protobuf.WireFormat.getTagFieldNumber(readRawVarint32) == 0) {
                throw com.google.protobuf.InvalidProtocolBufferException.invalidTag();
            }
            return this.lastTag;
        }

        @Override // com.google.protobuf.CodedInputStream
        public final void checkLastTagWas(int i) throws com.google.protobuf.InvalidProtocolBufferException {
            if (this.lastTag != i) {
                throw com.google.protobuf.InvalidProtocolBufferException.invalidEndTag();
            }
        }

        @Override // com.google.protobuf.CodedInputStream
        public final int getLastTag() {
            return this.lastTag;
        }

        @Override // com.google.protobuf.CodedInputStream
        public final boolean skipField(int i) throws java.io.IOException {
            int tagWireType = com.google.protobuf.WireFormat.getTagWireType(i);
            if (tagWireType == 0) {
                skipRawVarint();
                return true;
            }
            if (tagWireType == 1) {
                skipRawBytes(8);
                return true;
            }
            if (tagWireType == 2) {
                skipRawBytes(readRawVarint32());
                return true;
            }
            if (tagWireType == 3) {
                skipMessage();
                checkLastTagWas(com.google.protobuf.WireFormat.makeTag(com.google.protobuf.WireFormat.getTagFieldNumber(i), 4));
                return true;
            }
            if (tagWireType == 4) {
                return false;
            }
            if (tagWireType == 5) {
                skipRawBytes(4);
                return true;
            }
            throw com.google.protobuf.InvalidProtocolBufferException.invalidWireType();
        }

        @Override // com.google.protobuf.CodedInputStream
        public final boolean skipField(int i, com.google.protobuf.CodedOutputStream codedOutputStream) throws java.io.IOException {
            int tagWireType = com.google.protobuf.WireFormat.getTagWireType(i);
            if (tagWireType == 0) {
                long readInt64 = readInt64();
                codedOutputStream.writeUInt32NoTag(i);
                codedOutputStream.writeUInt64NoTag(readInt64);
                return true;
            }
            if (tagWireType == 1) {
                long readRawLittleEndian64 = readRawLittleEndian64();
                codedOutputStream.writeUInt32NoTag(i);
                codedOutputStream.writeFixed64NoTag(readRawLittleEndian64);
                return true;
            }
            if (tagWireType == 2) {
                com.google.protobuf.ByteString readBytes = readBytes();
                codedOutputStream.writeUInt32NoTag(i);
                codedOutputStream.writeBytesNoTag(readBytes);
                return true;
            }
            if (tagWireType == 3) {
                codedOutputStream.writeUInt32NoTag(i);
                skipMessage(codedOutputStream);
                int makeTag = com.google.protobuf.WireFormat.makeTag(com.google.protobuf.WireFormat.getTagFieldNumber(i), 4);
                checkLastTagWas(makeTag);
                codedOutputStream.writeUInt32NoTag(makeTag);
                return true;
            }
            if (tagWireType == 4) {
                return false;
            }
            if (tagWireType == 5) {
                int readRawLittleEndian32 = readRawLittleEndian32();
                codedOutputStream.writeUInt32NoTag(i);
                codedOutputStream.writeFixed32NoTag(readRawLittleEndian32);
                return true;
            }
            throw com.google.protobuf.InvalidProtocolBufferException.invalidWireType();
        }

        class SkippedDataSink implements com.google.protobuf.CodedInputStream.StreamDecoder.RefillCallback {
            private java.io.ByteArrayOutputStream byteArrayStream;
            private int lastPos;

            private SkippedDataSink() {
                this.lastPos = com.google.protobuf.CodedInputStream.StreamDecoder.this.pos;
            }

            @Override // com.google.protobuf.CodedInputStream.StreamDecoder.RefillCallback
            public void onRefill() {
                if (this.byteArrayStream == null) {
                    this.byteArrayStream = new java.io.ByteArrayOutputStream();
                }
                this.byteArrayStream.write(com.google.protobuf.CodedInputStream.StreamDecoder.this.buffer, this.lastPos, com.google.protobuf.CodedInputStream.StreamDecoder.this.pos - this.lastPos);
                this.lastPos = 0;
            }

            java.nio.ByteBuffer getSkippedData() {
                java.io.ByteArrayOutputStream byteArrayOutputStream = this.byteArrayStream;
                if (byteArrayOutputStream == null) {
                    return java.nio.ByteBuffer.wrap(com.google.protobuf.CodedInputStream.StreamDecoder.this.buffer, this.lastPos, com.google.protobuf.CodedInputStream.StreamDecoder.this.pos - this.lastPos);
                }
                byteArrayOutputStream.write(com.google.protobuf.CodedInputStream.StreamDecoder.this.buffer, this.lastPos, com.google.protobuf.CodedInputStream.StreamDecoder.this.pos);
                return java.nio.ByteBuffer.wrap(this.byteArrayStream.toByteArray());
            }
        }

        @Override // com.google.protobuf.CodedInputStream
        public final double readDouble() throws java.io.IOException {
            return java.lang.Double.longBitsToDouble(readRawLittleEndian64());
        }

        @Override // com.google.protobuf.CodedInputStream
        public final float readFloat() throws java.io.IOException {
            return java.lang.Float.intBitsToFloat(readRawLittleEndian32());
        }

        @Override // com.google.protobuf.CodedInputStream
        public final long readUInt64() throws java.io.IOException {
            return readRawVarint64();
        }

        @Override // com.google.protobuf.CodedInputStream
        public final long readInt64() throws java.io.IOException {
            return readRawVarint64();
        }

        @Override // com.google.protobuf.CodedInputStream
        public final int readInt32() throws java.io.IOException {
            return readRawVarint32();
        }

        @Override // com.google.protobuf.CodedInputStream
        public final long readFixed64() throws java.io.IOException {
            return readRawLittleEndian64();
        }

        @Override // com.google.protobuf.CodedInputStream
        public final int readFixed32() throws java.io.IOException {
            return readRawLittleEndian32();
        }

        @Override // com.google.protobuf.CodedInputStream
        public final boolean readBool() throws java.io.IOException {
            return readRawVarint64() != 0;
        }

        @Override // com.google.protobuf.CodedInputStream
        public final java.lang.String readString() throws java.io.IOException {
            int readRawVarint32 = readRawVarint32();
            if (readRawVarint32 > 0) {
                int i = this.bufferSize;
                int i2 = this.pos;
                if (readRawVarint32 <= i - i2) {
                    java.lang.String str = new java.lang.String(this.buffer, i2, readRawVarint32, com.google.protobuf.Internal.UTF_8);
                    this.pos += readRawVarint32;
                    return str;
                }
            }
            if (readRawVarint32 == 0) {
                return "";
            }
            if (readRawVarint32 < 0) {
                throw com.google.protobuf.InvalidProtocolBufferException.negativeSize();
            }
            if (readRawVarint32 <= this.bufferSize) {
                refillBuffer(readRawVarint32);
                java.lang.String str2 = new java.lang.String(this.buffer, this.pos, readRawVarint32, com.google.protobuf.Internal.UTF_8);
                this.pos += readRawVarint32;
                return str2;
            }
            return new java.lang.String(readRawBytesSlowPath(readRawVarint32, false), com.google.protobuf.Internal.UTF_8);
        }

        @Override // com.google.protobuf.CodedInputStream
        public final java.lang.String readStringRequireUtf8() throws java.io.IOException {
            byte[] readRawBytesSlowPath;
            int readRawVarint32 = readRawVarint32();
            int i = this.pos;
            int i2 = this.bufferSize;
            if (readRawVarint32 <= i2 - i && readRawVarint32 > 0) {
                readRawBytesSlowPath = this.buffer;
                this.pos = i + readRawVarint32;
            } else {
                if (readRawVarint32 == 0) {
                    return "";
                }
                if (readRawVarint32 < 0) {
                    throw com.google.protobuf.InvalidProtocolBufferException.negativeSize();
                }
                i = 0;
                if (readRawVarint32 <= i2) {
                    refillBuffer(readRawVarint32);
                    readRawBytesSlowPath = this.buffer;
                    this.pos = readRawVarint32;
                } else {
                    readRawBytesSlowPath = readRawBytesSlowPath(readRawVarint32, false);
                }
            }
            return com.google.protobuf.Utf8.decodeUtf8(readRawBytesSlowPath, i, readRawVarint32);
        }

        @Override // com.google.protobuf.CodedInputStream
        public final void readGroup(int i, com.google.protobuf.MessageLite.Builder builder, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
            checkRecursionLimit();
            this.recursionDepth++;
            builder.mergeFrom(this, extensionRegistryLite);
            checkLastTagWas(com.google.protobuf.WireFormat.makeTag(i, 4));
            this.recursionDepth--;
        }

        @Override // com.google.protobuf.CodedInputStream
        public final <T extends com.google.protobuf.MessageLite> T readGroup(int i, com.google.protobuf.Parser<T> parser, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
            checkRecursionLimit();
            this.recursionDepth++;
            T parsePartialFrom = parser.parsePartialFrom(this, extensionRegistryLite);
            checkLastTagWas(com.google.protobuf.WireFormat.makeTag(i, 4));
            this.recursionDepth--;
            return parsePartialFrom;
        }

        @Override // com.google.protobuf.CodedInputStream
        @java.lang.Deprecated
        public final void readUnknownGroup(int i, com.google.protobuf.MessageLite.Builder builder) throws java.io.IOException {
            readGroup(i, builder, com.google.protobuf.ExtensionRegistryLite.getEmptyRegistry());
        }

        @Override // com.google.protobuf.CodedInputStream
        public final void readMessage(com.google.protobuf.MessageLite.Builder builder, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
            int readRawVarint32 = readRawVarint32();
            checkRecursionLimit();
            int pushLimit = pushLimit(readRawVarint32);
            this.recursionDepth++;
            builder.mergeFrom(this, extensionRegistryLite);
            checkLastTagWas(0);
            this.recursionDepth--;
            if (getBytesUntilLimit() != 0) {
                throw com.google.protobuf.InvalidProtocolBufferException.truncatedMessage();
            }
            popLimit(pushLimit);
        }

        @Override // com.google.protobuf.CodedInputStream
        public final <T extends com.google.protobuf.MessageLite> T readMessage(com.google.protobuf.Parser<T> parser, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
            int readRawVarint32 = readRawVarint32();
            checkRecursionLimit();
            int pushLimit = pushLimit(readRawVarint32);
            this.recursionDepth++;
            T parsePartialFrom = parser.parsePartialFrom(this, extensionRegistryLite);
            checkLastTagWas(0);
            this.recursionDepth--;
            if (getBytesUntilLimit() != 0) {
                throw com.google.protobuf.InvalidProtocolBufferException.truncatedMessage();
            }
            popLimit(pushLimit);
            return parsePartialFrom;
        }

        @Override // com.google.protobuf.CodedInputStream
        public final com.google.protobuf.ByteString readBytes() throws java.io.IOException {
            int readRawVarint32 = readRawVarint32();
            int i = this.bufferSize;
            int i2 = this.pos;
            if (readRawVarint32 <= i - i2 && readRawVarint32 > 0) {
                com.google.protobuf.ByteString copyFrom = com.google.protobuf.ByteString.copyFrom(this.buffer, i2, readRawVarint32);
                this.pos += readRawVarint32;
                return copyFrom;
            }
            if (readRawVarint32 == 0) {
                return com.google.protobuf.ByteString.EMPTY;
            }
            if (readRawVarint32 < 0) {
                throw com.google.protobuf.InvalidProtocolBufferException.negativeSize();
            }
            return readBytesSlowPath(readRawVarint32);
        }

        @Override // com.google.protobuf.CodedInputStream
        public final byte[] readByteArray() throws java.io.IOException {
            int readRawVarint32 = readRawVarint32();
            int i = this.bufferSize;
            int i2 = this.pos;
            if (readRawVarint32 > i - i2 || readRawVarint32 <= 0) {
                if (readRawVarint32 < 0) {
                    throw com.google.protobuf.InvalidProtocolBufferException.negativeSize();
                }
                return readRawBytesSlowPath(readRawVarint32, false);
            }
            byte[] copyOfRange = java.util.Arrays.copyOfRange(this.buffer, i2, i2 + readRawVarint32);
            this.pos += readRawVarint32;
            return copyOfRange;
        }

        @Override // com.google.protobuf.CodedInputStream
        public final java.nio.ByteBuffer readByteBuffer() throws java.io.IOException {
            int readRawVarint32 = readRawVarint32();
            int i = this.bufferSize;
            int i2 = this.pos;
            if (readRawVarint32 <= i - i2 && readRawVarint32 > 0) {
                java.nio.ByteBuffer wrap = java.nio.ByteBuffer.wrap(java.util.Arrays.copyOfRange(this.buffer, i2, i2 + readRawVarint32));
                this.pos += readRawVarint32;
                return wrap;
            }
            if (readRawVarint32 == 0) {
                return com.google.protobuf.Internal.EMPTY_BYTE_BUFFER;
            }
            if (readRawVarint32 < 0) {
                throw com.google.protobuf.InvalidProtocolBufferException.negativeSize();
            }
            return java.nio.ByteBuffer.wrap(readRawBytesSlowPath(readRawVarint32, true));
        }

        @Override // com.google.protobuf.CodedInputStream
        public final int readUInt32() throws java.io.IOException {
            return readRawVarint32();
        }

        @Override // com.google.protobuf.CodedInputStream
        public final int readEnum() throws java.io.IOException {
            return readRawVarint32();
        }

        @Override // com.google.protobuf.CodedInputStream
        public final int readSFixed32() throws java.io.IOException {
            return readRawLittleEndian32();
        }

        @Override // com.google.protobuf.CodedInputStream
        public final long readSFixed64() throws java.io.IOException {
            return readRawLittleEndian64();
        }

        @Override // com.google.protobuf.CodedInputStream
        public final int readSInt32() throws java.io.IOException {
            return decodeZigZag32(readRawVarint32());
        }

        @Override // com.google.protobuf.CodedInputStream
        public final long readSInt64() throws java.io.IOException {
            return decodeZigZag64(readRawVarint64());
        }

        @Override // com.google.protobuf.CodedInputStream
        public final int readRawVarint32() throws java.io.IOException {
            int i;
            int i2 = this.pos;
            int i3 = this.bufferSize;
            if (i3 != i2) {
                byte[] bArr = this.buffer;
                int i4 = i2 + 1;
                byte b = bArr[i2];
                if (b >= 0) {
                    this.pos = i4;
                    return b;
                }
                if (i3 - i4 >= 9) {
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
                                                    if (bArr[i7] >= 0) {
                                                        i5 = i2 + 10;
                                                        i = i11;
                                                    }
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
            }
            return (int) readRawVarint64SlowPath();
        }

        private void skipRawVarint() throws java.io.IOException {
            if (this.bufferSize - this.pos >= 10) {
                skipRawVarintFastPath();
            } else {
                skipRawVarintSlowPath();
            }
        }

        private void skipRawVarintFastPath() throws java.io.IOException {
            for (int i = 0; i < 10; i++) {
                byte[] bArr = this.buffer;
                int i2 = this.pos;
                this.pos = i2 + 1;
                if (bArr[i2] >= 0) {
                    return;
                }
            }
            throw com.google.protobuf.InvalidProtocolBufferException.malformedVarint();
        }

        private void skipRawVarintSlowPath() throws java.io.IOException {
            for (int i = 0; i < 10; i++) {
                if (readRawByte() >= 0) {
                    return;
                }
            }
            throw com.google.protobuf.InvalidProtocolBufferException.malformedVarint();
        }

        @Override // com.google.protobuf.CodedInputStream
        public final long readRawVarint64() throws java.io.IOException {
            long j;
            long j2;
            long j3;
            int i = this.pos;
            int i2 = this.bufferSize;
            if (i2 != i) {
                byte[] bArr = this.buffer;
                int i3 = i + 1;
                byte b = bArr[i];
                if (b >= 0) {
                    this.pos = i3;
                    return b;
                }
                if (i2 - i3 >= 9) {
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
                                                    if (bArr[i4] >= 0) {
                                                        i4 = i + 10;
                                                    }
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
            }
            return readRawVarint64SlowPath();
        }

        @Override // com.google.protobuf.CodedInputStream
        final long readRawVarint64SlowPath() throws java.io.IOException {
            long j = 0;
            for (int i = 0; i < 64; i += 7) {
                j |= (r3 & Byte.MAX_VALUE) << i;
                if ((readRawByte() & 128) == 0) {
                    return j;
                }
            }
            throw com.google.protobuf.InvalidProtocolBufferException.malformedVarint();
        }

        @Override // com.google.protobuf.CodedInputStream
        public final int readRawLittleEndian32() throws java.io.IOException {
            int i = this.pos;
            if (this.bufferSize - i < 4) {
                refillBuffer(4);
                i = this.pos;
            }
            byte[] bArr = this.buffer;
            this.pos = i + 4;
            return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
        }

        @Override // com.google.protobuf.CodedInputStream
        public final long readRawLittleEndian64() throws java.io.IOException {
            int i = this.pos;
            if (this.bufferSize - i < 8) {
                refillBuffer(8);
                i = this.pos;
            }
            byte[] bArr = this.buffer;
            this.pos = i + 8;
            return ((bArr[i + 7] & 255) << 56) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24) | ((bArr[i + 4] & 255) << 32) | ((bArr[i + 5] & 255) << 40) | ((bArr[i + 6] & 255) << 48);
        }

        @Override // com.google.protobuf.CodedInputStream
        public final void resetSizeCounter() {
            this.totalBytesRetired = -this.pos;
        }

        @Override // com.google.protobuf.CodedInputStream
        public final int pushLimit(int i) throws com.google.protobuf.InvalidProtocolBufferException {
            if (i < 0) {
                throw com.google.protobuf.InvalidProtocolBufferException.negativeSize();
            }
            int i2 = i + this.totalBytesRetired + this.pos;
            int i3 = this.currentLimit;
            if (i2 > i3) {
                throw com.google.protobuf.InvalidProtocolBufferException.truncatedMessage();
            }
            this.currentLimit = i2;
            recomputeBufferSizeAfterLimit();
            return i3;
        }

        private void recomputeBufferSizeAfterLimit() {
            int i = this.bufferSize + this.bufferSizeAfterLimit;
            this.bufferSize = i;
            int i2 = this.totalBytesRetired + i;
            int i3 = this.currentLimit;
            if (i2 > i3) {
                int i4 = i2 - i3;
                this.bufferSizeAfterLimit = i4;
                this.bufferSize = i - i4;
                return;
            }
            this.bufferSizeAfterLimit = 0;
        }

        @Override // com.google.protobuf.CodedInputStream
        public final void popLimit(int i) {
            this.currentLimit = i;
            recomputeBufferSizeAfterLimit();
        }

        @Override // com.google.protobuf.CodedInputStream
        public final int getBytesUntilLimit() {
            int i = this.currentLimit;
            if (i == Integer.MAX_VALUE) {
                return -1;
            }
            return i - (this.totalBytesRetired + this.pos);
        }

        @Override // com.google.protobuf.CodedInputStream
        public final boolean isAtEnd() throws java.io.IOException {
            return this.pos == this.bufferSize && !tryRefillBuffer(1);
        }

        @Override // com.google.protobuf.CodedInputStream
        public final int getTotalBytesRead() {
            return this.totalBytesRetired + this.pos;
        }

        private void refillBuffer(int i) throws java.io.IOException {
            if (tryRefillBuffer(i)) {
                return;
            }
            if (i > (this.sizeLimit - this.totalBytesRetired) - this.pos) {
                throw com.google.protobuf.InvalidProtocolBufferException.sizeLimitExceeded();
            }
            throw com.google.protobuf.InvalidProtocolBufferException.truncatedMessage();
        }

        private boolean tryRefillBuffer(int i) throws java.io.IOException {
            while (this.pos + i > this.bufferSize) {
                int i2 = this.sizeLimit;
                int i3 = this.totalBytesRetired;
                int i4 = this.pos;
                if (i > (i2 - i3) - i4 || i3 + i4 + i > this.currentLimit) {
                    return false;
                }
                com.google.protobuf.CodedInputStream.StreamDecoder.RefillCallback refillCallback = this.refillCallback;
                if (refillCallback != null) {
                    refillCallback.onRefill();
                }
                int i5 = this.pos;
                if (i5 > 0) {
                    int i6 = this.bufferSize;
                    if (i6 > i5) {
                        byte[] bArr = this.buffer;
                        java.lang.System.arraycopy(bArr, i5, bArr, 0, i6 - i5);
                    }
                    this.totalBytesRetired += i5;
                    this.bufferSize -= i5;
                    this.pos = 0;
                }
                java.io.InputStream inputStream = this.input;
                byte[] bArr2 = this.buffer;
                int i7 = this.bufferSize;
                int read = read(inputStream, bArr2, i7, java.lang.Math.min(bArr2.length - i7, (this.sizeLimit - this.totalBytesRetired) - this.bufferSize));
                if (read == 0 || read < -1 || read > this.buffer.length) {
                    java.lang.StringBuilder sb = new java.lang.StringBuilder();
                    sb.append(this.input.getClass());
                    sb.append("#read(byte[]) returned invalid result: ");
                    sb.append(read);
                    sb.append("\nThe InputStream implementation is buggy.");
                    throw new java.lang.IllegalStateException(sb.toString());
                }
                if (read <= 0) {
                    return false;
                }
                this.bufferSize += read;
                recomputeBufferSizeAfterLimit();
                if (this.bufferSize >= i) {
                    return true;
                }
            }
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder("refillBuffer() called when ");
            sb2.append(i);
            sb2.append(" bytes were already available in buffer");
            throw new java.lang.IllegalStateException(sb2.toString());
        }

        @Override // com.google.protobuf.CodedInputStream
        public final byte readRawByte() throws java.io.IOException {
            if (this.pos == this.bufferSize) {
                refillBuffer(1);
            }
            byte[] bArr = this.buffer;
            int i = this.pos;
            this.pos = i + 1;
            return bArr[i];
        }

        @Override // com.google.protobuf.CodedInputStream
        public final byte[] readRawBytes(int i) throws java.io.IOException {
            int i2 = this.pos;
            if (i <= this.bufferSize - i2 && i > 0) {
                int i3 = i + i2;
                this.pos = i3;
                return java.util.Arrays.copyOfRange(this.buffer, i2, i3);
            }
            return readRawBytesSlowPath(i, false);
        }

        private byte[] readRawBytesSlowPath(int i, boolean z) throws java.io.IOException {
            byte[] readRawBytesSlowPathOneChunk = readRawBytesSlowPathOneChunk(i);
            if (readRawBytesSlowPathOneChunk != null) {
                return z ? (byte[]) readRawBytesSlowPathOneChunk.clone() : readRawBytesSlowPathOneChunk;
            }
            int i2 = this.pos;
            int i3 = this.bufferSize;
            int i4 = i3 - i2;
            this.totalBytesRetired += i3;
            this.pos = 0;
            this.bufferSize = 0;
            java.util.List<byte[]> readRawBytesSlowPathRemainingChunks = readRawBytesSlowPathRemainingChunks(i - i4);
            byte[] bArr = new byte[i];
            java.lang.System.arraycopy(this.buffer, i2, bArr, 0, i4);
            for (byte[] bArr2 : readRawBytesSlowPathRemainingChunks) {
                java.lang.System.arraycopy(bArr2, 0, bArr, i4, bArr2.length);
                i4 += bArr2.length;
            }
            return bArr;
        }

        private byte[] readRawBytesSlowPathOneChunk(int i) throws java.io.IOException {
            if (i == 0) {
                return com.google.protobuf.Internal.EMPTY_BYTE_ARRAY;
            }
            if (i < 0) {
                throw com.google.protobuf.InvalidProtocolBufferException.negativeSize();
            }
            int i2 = this.totalBytesRetired + this.pos + i;
            if (i2 - this.sizeLimit > 0) {
                throw com.google.protobuf.InvalidProtocolBufferException.sizeLimitExceeded();
            }
            int i3 = this.currentLimit;
            if (i2 > i3) {
                skipRawBytes((i3 - this.totalBytesRetired) - this.pos);
                throw com.google.protobuf.InvalidProtocolBufferException.truncatedMessage();
            }
            int i4 = this.bufferSize - this.pos;
            int i5 = i - i4;
            if (i5 >= 4096 && i5 > available(this.input)) {
                return null;
            }
            byte[] bArr = new byte[i];
            java.lang.System.arraycopy(this.buffer, this.pos, bArr, 0, i4);
            this.totalBytesRetired += this.bufferSize;
            this.pos = 0;
            this.bufferSize = 0;
            while (i4 < i) {
                int read = read(this.input, bArr, i4, i - i4);
                if (read == -1) {
                    throw com.google.protobuf.InvalidProtocolBufferException.truncatedMessage();
                }
                this.totalBytesRetired += read;
                i4 += read;
            }
            return bArr;
        }

        private java.util.List<byte[]> readRawBytesSlowPathRemainingChunks(int i) throws java.io.IOException {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            while (i > 0) {
                int min = java.lang.Math.min(i, 4096);
                byte[] bArr = new byte[min];
                int i2 = 0;
                while (i2 < min) {
                    int read = this.input.read(bArr, i2, min - i2);
                    if (read == -1) {
                        throw com.google.protobuf.InvalidProtocolBufferException.truncatedMessage();
                    }
                    this.totalBytesRetired += read;
                    i2 += read;
                }
                i -= min;
                arrayList.add(bArr);
            }
            return arrayList;
        }

        private com.google.protobuf.ByteString readBytesSlowPath(int i) throws java.io.IOException {
            byte[] readRawBytesSlowPathOneChunk = readRawBytesSlowPathOneChunk(i);
            if (readRawBytesSlowPathOneChunk != null) {
                return com.google.protobuf.ByteString.copyFrom(readRawBytesSlowPathOneChunk);
            }
            int i2 = this.pos;
            int i3 = this.bufferSize;
            int i4 = i3 - i2;
            this.totalBytesRetired += i3;
            this.pos = 0;
            this.bufferSize = 0;
            java.util.List<byte[]> readRawBytesSlowPathRemainingChunks = readRawBytesSlowPathRemainingChunks(i - i4);
            byte[] bArr = new byte[i];
            java.lang.System.arraycopy(this.buffer, i2, bArr, 0, i4);
            for (byte[] bArr2 : readRawBytesSlowPathRemainingChunks) {
                java.lang.System.arraycopy(bArr2, 0, bArr, i4, bArr2.length);
                i4 += bArr2.length;
            }
            return com.google.protobuf.ByteString.wrap(bArr);
        }

        @Override // com.google.protobuf.CodedInputStream
        public final void skipRawBytes(int i) throws java.io.IOException {
            int i2 = this.bufferSize;
            int i3 = this.pos;
            if (i <= i2 - i3 && i >= 0) {
                this.pos = i3 + i;
            } else {
                skipRawBytesSlowPath(i);
            }
        }

        private void skipRawBytesSlowPath(int i) throws java.io.IOException {
            if (i < 0) {
                throw com.google.protobuf.InvalidProtocolBufferException.negativeSize();
            }
            int i2 = this.totalBytesRetired;
            int i3 = this.pos;
            int i4 = this.currentLimit;
            int i5 = i2 + i3;
            if (i5 + i > i4) {
                skipRawBytes((i4 - i2) - i3);
                throw com.google.protobuf.InvalidProtocolBufferException.truncatedMessage();
            }
            int i6 = 0;
            if (this.refillCallback == null) {
                this.totalBytesRetired = i5;
                int i7 = this.bufferSize;
                this.bufferSize = 0;
                this.pos = 0;
                i6 = i7 - i3;
                while (i6 < i) {
                    try {
                        long j = i - i6;
                        long skip = skip(this.input, j);
                        if (skip >= 0 && skip <= j) {
                            if (skip == 0) {
                                break;
                            } else {
                                i6 += (int) skip;
                            }
                        } else {
                            java.lang.StringBuilder sb = new java.lang.StringBuilder();
                            sb.append(this.input.getClass());
                            sb.append("#skip returned invalid result: ");
                            sb.append(skip);
                            sb.append("\nThe InputStream implementation is buggy.");
                            throw new java.lang.IllegalStateException(sb.toString());
                        }
                    } finally {
                        this.totalBytesRetired += i6;
                        recomputeBufferSizeAfterLimit();
                    }
                }
            }
            if (i6 >= i) {
                return;
            }
            int i8 = this.bufferSize;
            int i9 = i8 - this.pos;
            this.pos = i8;
            refillBuffer(1);
            while (true) {
                int i10 = i - i9;
                int i11 = this.bufferSize;
                if (i10 > i11) {
                    i9 += i11;
                    this.pos = i11;
                    refillBuffer(1);
                } else {
                    this.pos = i10;
                    return;
                }
            }
        }
    }

    static final class IterableDirectByteBufferDecoder extends com.google.protobuf.CodedInputStream {
        private int bufferSizeAfterCurrentLimit;
        private long currentAddress;
        private java.nio.ByteBuffer currentByteBuffer;
        private long currentByteBufferLimit;
        private long currentByteBufferPos;
        private long currentByteBufferStartPos;
        private int currentLimit;
        private boolean enableAliasing;
        private final boolean immutable;
        private final java.lang.Iterable<java.nio.ByteBuffer> input;
        private final java.util.Iterator<java.nio.ByteBuffer> iterator;
        private int lastTag;
        private int startOffset;
        private int totalBufferSize;
        private int totalBytesRead;

        private IterableDirectByteBufferDecoder(java.lang.Iterable<java.nio.ByteBuffer> iterable, int i, boolean z) {
            super();
            this.currentLimit = Integer.MAX_VALUE;
            this.totalBufferSize = i;
            this.input = iterable;
            this.iterator = iterable.iterator();
            this.immutable = z;
            this.totalBytesRead = 0;
            this.startOffset = 0;
            if (i == 0) {
                this.currentByteBuffer = com.google.protobuf.Internal.EMPTY_BYTE_BUFFER;
                this.currentByteBufferPos = 0L;
                this.currentByteBufferStartPos = 0L;
                this.currentByteBufferLimit = 0L;
                this.currentAddress = 0L;
                return;
            }
            tryGetNextByteBuffer();
        }

        private void getNextByteBuffer() throws com.google.protobuf.InvalidProtocolBufferException {
            if (!this.iterator.hasNext()) {
                throw com.google.protobuf.InvalidProtocolBufferException.truncatedMessage();
            }
            tryGetNextByteBuffer();
        }

        private void tryGetNextByteBuffer() {
            java.nio.ByteBuffer next = this.iterator.next();
            this.currentByteBuffer = next;
            this.totalBytesRead += (int) (this.currentByteBufferPos - this.currentByteBufferStartPos);
            long position = next.position();
            this.currentByteBufferPos = position;
            this.currentByteBufferStartPos = position;
            this.currentByteBufferLimit = this.currentByteBuffer.limit();
            long addressOffset = com.google.protobuf.UnsafeUtil.addressOffset(this.currentByteBuffer);
            this.currentAddress = addressOffset;
            this.currentByteBufferPos += addressOffset;
            this.currentByteBufferStartPos += addressOffset;
            this.currentByteBufferLimit += addressOffset;
        }

        @Override // com.google.protobuf.CodedInputStream
        public final int readTag() throws java.io.IOException {
            if (isAtEnd()) {
                this.lastTag = 0;
                return 0;
            }
            int readRawVarint32 = readRawVarint32();
            this.lastTag = readRawVarint32;
            if (com.google.protobuf.WireFormat.getTagFieldNumber(readRawVarint32) == 0) {
                throw com.google.protobuf.InvalidProtocolBufferException.invalidTag();
            }
            return this.lastTag;
        }

        @Override // com.google.protobuf.CodedInputStream
        public final void checkLastTagWas(int i) throws com.google.protobuf.InvalidProtocolBufferException {
            if (this.lastTag != i) {
                throw com.google.protobuf.InvalidProtocolBufferException.invalidEndTag();
            }
        }

        @Override // com.google.protobuf.CodedInputStream
        public final int getLastTag() {
            return this.lastTag;
        }

        @Override // com.google.protobuf.CodedInputStream
        public final boolean skipField(int i) throws java.io.IOException {
            int tagWireType = com.google.protobuf.WireFormat.getTagWireType(i);
            if (tagWireType == 0) {
                skipRawVarint();
                return true;
            }
            if (tagWireType == 1) {
                skipRawBytes(8);
                return true;
            }
            if (tagWireType == 2) {
                skipRawBytes(readRawVarint32());
                return true;
            }
            if (tagWireType == 3) {
                skipMessage();
                checkLastTagWas(com.google.protobuf.WireFormat.makeTag(com.google.protobuf.WireFormat.getTagFieldNumber(i), 4));
                return true;
            }
            if (tagWireType == 4) {
                return false;
            }
            if (tagWireType == 5) {
                skipRawBytes(4);
                return true;
            }
            throw com.google.protobuf.InvalidProtocolBufferException.invalidWireType();
        }

        @Override // com.google.protobuf.CodedInputStream
        public final boolean skipField(int i, com.google.protobuf.CodedOutputStream codedOutputStream) throws java.io.IOException {
            int tagWireType = com.google.protobuf.WireFormat.getTagWireType(i);
            if (tagWireType == 0) {
                long readInt64 = readInt64();
                codedOutputStream.writeUInt32NoTag(i);
                codedOutputStream.writeUInt64NoTag(readInt64);
                return true;
            }
            if (tagWireType == 1) {
                long readRawLittleEndian64 = readRawLittleEndian64();
                codedOutputStream.writeUInt32NoTag(i);
                codedOutputStream.writeFixed64NoTag(readRawLittleEndian64);
                return true;
            }
            if (tagWireType == 2) {
                com.google.protobuf.ByteString readBytes = readBytes();
                codedOutputStream.writeUInt32NoTag(i);
                codedOutputStream.writeBytesNoTag(readBytes);
                return true;
            }
            if (tagWireType == 3) {
                codedOutputStream.writeUInt32NoTag(i);
                skipMessage(codedOutputStream);
                int makeTag = com.google.protobuf.WireFormat.makeTag(com.google.protobuf.WireFormat.getTagFieldNumber(i), 4);
                checkLastTagWas(makeTag);
                codedOutputStream.writeUInt32NoTag(makeTag);
                return true;
            }
            if (tagWireType == 4) {
                return false;
            }
            if (tagWireType == 5) {
                int readRawLittleEndian32 = readRawLittleEndian32();
                codedOutputStream.writeUInt32NoTag(i);
                codedOutputStream.writeFixed32NoTag(readRawLittleEndian32);
                return true;
            }
            throw com.google.protobuf.InvalidProtocolBufferException.invalidWireType();
        }

        @Override // com.google.protobuf.CodedInputStream
        public final double readDouble() throws java.io.IOException {
            return java.lang.Double.longBitsToDouble(readRawLittleEndian64());
        }

        @Override // com.google.protobuf.CodedInputStream
        public final float readFloat() throws java.io.IOException {
            return java.lang.Float.intBitsToFloat(readRawLittleEndian32());
        }

        @Override // com.google.protobuf.CodedInputStream
        public final long readUInt64() throws java.io.IOException {
            return readRawVarint64();
        }

        @Override // com.google.protobuf.CodedInputStream
        public final long readInt64() throws java.io.IOException {
            return readRawVarint64();
        }

        @Override // com.google.protobuf.CodedInputStream
        public final int readInt32() throws java.io.IOException {
            return readRawVarint32();
        }

        @Override // com.google.protobuf.CodedInputStream
        public final long readFixed64() throws java.io.IOException {
            return readRawLittleEndian64();
        }

        @Override // com.google.protobuf.CodedInputStream
        public final int readFixed32() throws java.io.IOException {
            return readRawLittleEndian32();
        }

        @Override // com.google.protobuf.CodedInputStream
        public final boolean readBool() throws java.io.IOException {
            return readRawVarint64() != 0;
        }

        @Override // com.google.protobuf.CodedInputStream
        public final java.lang.String readString() throws java.io.IOException {
            int readRawVarint32 = readRawVarint32();
            if (readRawVarint32 > 0) {
                long j = readRawVarint32;
                long j2 = this.currentByteBufferLimit;
                long j3 = this.currentByteBufferPos;
                if (j <= j2 - j3) {
                    byte[] bArr = new byte[readRawVarint32];
                    com.google.protobuf.UnsafeUtil.copyMemory(j3, bArr, 0L, j);
                    java.lang.String str = new java.lang.String(bArr, com.google.protobuf.Internal.UTF_8);
                    this.currentByteBufferPos += j;
                    return str;
                }
            }
            if (readRawVarint32 > 0 && readRawVarint32 <= remaining()) {
                byte[] bArr2 = new byte[readRawVarint32];
                readRawBytesTo(bArr2, 0, readRawVarint32);
                return new java.lang.String(bArr2, com.google.protobuf.Internal.UTF_8);
            }
            if (readRawVarint32 == 0) {
                return "";
            }
            if (readRawVarint32 < 0) {
                throw com.google.protobuf.InvalidProtocolBufferException.negativeSize();
            }
            throw com.google.protobuf.InvalidProtocolBufferException.truncatedMessage();
        }

        @Override // com.google.protobuf.CodedInputStream
        public final java.lang.String readStringRequireUtf8() throws java.io.IOException {
            int readRawVarint32 = readRawVarint32();
            if (readRawVarint32 > 0) {
                long j = readRawVarint32;
                long j2 = this.currentByteBufferLimit;
                long j3 = this.currentByteBufferPos;
                if (j <= j2 - j3) {
                    java.lang.String decodeUtf8 = com.google.protobuf.Utf8.decodeUtf8(this.currentByteBuffer, (int) (j3 - this.currentByteBufferStartPos), readRawVarint32);
                    this.currentByteBufferPos += j;
                    return decodeUtf8;
                }
            }
            if (readRawVarint32 >= 0 && readRawVarint32 <= remaining()) {
                byte[] bArr = new byte[readRawVarint32];
                readRawBytesTo(bArr, 0, readRawVarint32);
                return com.google.protobuf.Utf8.decodeUtf8(bArr, 0, readRawVarint32);
            }
            if (readRawVarint32 == 0) {
                return "";
            }
            if (readRawVarint32 <= 0) {
                throw com.google.protobuf.InvalidProtocolBufferException.negativeSize();
            }
            throw com.google.protobuf.InvalidProtocolBufferException.truncatedMessage();
        }

        @Override // com.google.protobuf.CodedInputStream
        public final void readGroup(int i, com.google.protobuf.MessageLite.Builder builder, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
            checkRecursionLimit();
            this.recursionDepth++;
            builder.mergeFrom(this, extensionRegistryLite);
            checkLastTagWas(com.google.protobuf.WireFormat.makeTag(i, 4));
            this.recursionDepth--;
        }

        @Override // com.google.protobuf.CodedInputStream
        public final <T extends com.google.protobuf.MessageLite> T readGroup(int i, com.google.protobuf.Parser<T> parser, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
            checkRecursionLimit();
            this.recursionDepth++;
            T parsePartialFrom = parser.parsePartialFrom(this, extensionRegistryLite);
            checkLastTagWas(com.google.protobuf.WireFormat.makeTag(i, 4));
            this.recursionDepth--;
            return parsePartialFrom;
        }

        @Override // com.google.protobuf.CodedInputStream
        @java.lang.Deprecated
        public final void readUnknownGroup(int i, com.google.protobuf.MessageLite.Builder builder) throws java.io.IOException {
            readGroup(i, builder, com.google.protobuf.ExtensionRegistryLite.getEmptyRegistry());
        }

        @Override // com.google.protobuf.CodedInputStream
        public final void readMessage(com.google.protobuf.MessageLite.Builder builder, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
            int readRawVarint32 = readRawVarint32();
            checkRecursionLimit();
            int pushLimit = pushLimit(readRawVarint32);
            this.recursionDepth++;
            builder.mergeFrom(this, extensionRegistryLite);
            checkLastTagWas(0);
            this.recursionDepth--;
            if (getBytesUntilLimit() != 0) {
                throw com.google.protobuf.InvalidProtocolBufferException.truncatedMessage();
            }
            popLimit(pushLimit);
        }

        @Override // com.google.protobuf.CodedInputStream
        public final <T extends com.google.protobuf.MessageLite> T readMessage(com.google.protobuf.Parser<T> parser, com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
            int readRawVarint32 = readRawVarint32();
            checkRecursionLimit();
            int pushLimit = pushLimit(readRawVarint32);
            this.recursionDepth++;
            T parsePartialFrom = parser.parsePartialFrom(this, extensionRegistryLite);
            checkLastTagWas(0);
            this.recursionDepth--;
            if (getBytesUntilLimit() != 0) {
                throw com.google.protobuf.InvalidProtocolBufferException.truncatedMessage();
            }
            popLimit(pushLimit);
            return parsePartialFrom;
        }

        @Override // com.google.protobuf.CodedInputStream
        public final com.google.protobuf.ByteString readBytes() throws java.io.IOException {
            int readRawVarint32 = readRawVarint32();
            if (readRawVarint32 > 0) {
                long j = readRawVarint32;
                long j2 = this.currentByteBufferLimit;
                long j3 = this.currentByteBufferPos;
                if (j <= j2 - j3) {
                    if (this.immutable && this.enableAliasing) {
                        int i = (int) (j3 - this.currentAddress);
                        com.google.protobuf.ByteString wrap = com.google.protobuf.ByteString.wrap(slice(i, readRawVarint32 + i));
                        this.currentByteBufferPos += j;
                        return wrap;
                    }
                    byte[] bArr = new byte[readRawVarint32];
                    com.google.protobuf.UnsafeUtil.copyMemory(j3, bArr, 0L, j);
                    this.currentByteBufferPos += j;
                    return com.google.protobuf.ByteString.wrap(bArr);
                }
            }
            if (readRawVarint32 <= 0 || readRawVarint32 > remaining()) {
                if (readRawVarint32 == 0) {
                    return com.google.protobuf.ByteString.EMPTY;
                }
                if (readRawVarint32 < 0) {
                    throw com.google.protobuf.InvalidProtocolBufferException.negativeSize();
                }
                throw com.google.protobuf.InvalidProtocolBufferException.truncatedMessage();
            }
            if (this.immutable && this.enableAliasing) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                while (readRawVarint32 > 0) {
                    if (currentRemaining() == 0) {
                        getNextByteBuffer();
                    }
                    int min = java.lang.Math.min(readRawVarint32, (int) currentRemaining());
                    int i2 = (int) (this.currentByteBufferPos - this.currentAddress);
                    arrayList.add(com.google.protobuf.ByteString.wrap(slice(i2, i2 + min)));
                    readRawVarint32 -= min;
                    this.currentByteBufferPos += min;
                }
                return com.google.protobuf.ByteString.copyFrom(arrayList);
            }
            byte[] bArr2 = new byte[readRawVarint32];
            readRawBytesTo(bArr2, 0, readRawVarint32);
            return com.google.protobuf.ByteString.wrap(bArr2);
        }

        @Override // com.google.protobuf.CodedInputStream
        public final byte[] readByteArray() throws java.io.IOException {
            return readRawBytes(readRawVarint32());
        }

        @Override // com.google.protobuf.CodedInputStream
        public final java.nio.ByteBuffer readByteBuffer() throws java.io.IOException {
            int readRawVarint32 = readRawVarint32();
            if (readRawVarint32 > 0) {
                long j = readRawVarint32;
                if (j <= currentRemaining()) {
                    if (!this.immutable && this.enableAliasing) {
                        long j2 = this.currentByteBufferPos + j;
                        this.currentByteBufferPos = j2;
                        long j3 = j2 - this.currentAddress;
                        return slice((int) (j3 - j), (int) j3);
                    }
                    byte[] bArr = new byte[readRawVarint32];
                    com.google.protobuf.UnsafeUtil.copyMemory(this.currentByteBufferPos, bArr, 0L, j);
                    this.currentByteBufferPos += j;
                    return java.nio.ByteBuffer.wrap(bArr);
                }
            }
            if (readRawVarint32 > 0 && readRawVarint32 <= remaining()) {
                byte[] bArr2 = new byte[readRawVarint32];
                readRawBytesTo(bArr2, 0, readRawVarint32);
                return java.nio.ByteBuffer.wrap(bArr2);
            }
            if (readRawVarint32 == 0) {
                return com.google.protobuf.Internal.EMPTY_BYTE_BUFFER;
            }
            if (readRawVarint32 < 0) {
                throw com.google.protobuf.InvalidProtocolBufferException.negativeSize();
            }
            throw com.google.protobuf.InvalidProtocolBufferException.truncatedMessage();
        }

        @Override // com.google.protobuf.CodedInputStream
        public final int readUInt32() throws java.io.IOException {
            return readRawVarint32();
        }

        @Override // com.google.protobuf.CodedInputStream
        public final int readEnum() throws java.io.IOException {
            return readRawVarint32();
        }

        @Override // com.google.protobuf.CodedInputStream
        public final int readSFixed32() throws java.io.IOException {
            return readRawLittleEndian32();
        }

        @Override // com.google.protobuf.CodedInputStream
        public final long readSFixed64() throws java.io.IOException {
            return readRawLittleEndian64();
        }

        @Override // com.google.protobuf.CodedInputStream
        public final int readSInt32() throws java.io.IOException {
            return decodeZigZag32(readRawVarint32());
        }

        @Override // com.google.protobuf.CodedInputStream
        public final long readSInt64() throws java.io.IOException {
            return decodeZigZag64(readRawVarint64());
        }

        @Override // com.google.protobuf.CodedInputStream
        public final int readRawVarint32() throws java.io.IOException {
            int i;
            long j = this.currentByteBufferPos;
            if (this.currentByteBufferLimit != j) {
                byte b = com.google.protobuf.UnsafeUtil.getByte(j);
                if (b >= 0) {
                    this.currentByteBufferPos++;
                    return b;
                }
                if (this.currentByteBufferLimit - this.currentByteBufferPos >= 10) {
                    long j2 = 2 + j;
                    int i2 = b ^ (com.google.protobuf.UnsafeUtil.getByte(1 + j) << 7);
                    if (i2 < 0) {
                        i = i2 ^ androidx.work.WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT;
                    } else {
                        long j3 = 3 + j;
                        int i3 = i2 ^ (com.google.protobuf.UnsafeUtil.getByte(j2) << 14);
                        if (i3 >= 0) {
                            i = i3 ^ 16256;
                        } else {
                            j2 = 4 + j;
                            int i4 = i3 ^ (com.google.protobuf.UnsafeUtil.getByte(j3) << com.google.common.base.Ascii.NAK);
                            if (i4 < 0) {
                                i = (-2080896) ^ i4;
                            } else {
                                j3 = 5 + j;
                                byte b2 = com.google.protobuf.UnsafeUtil.getByte(j2);
                                int i5 = (i4 ^ (b2 << com.google.common.base.Ascii.FS)) ^ 266354560;
                                if (b2 < 0) {
                                    j2 = 6 + j;
                                    if (com.google.protobuf.UnsafeUtil.getByte(j3) < 0) {
                                        j3 = 7 + j;
                                        if (com.google.protobuf.UnsafeUtil.getByte(j2) < 0) {
                                            j2 = 8 + j;
                                            if (com.google.protobuf.UnsafeUtil.getByte(j3) < 0) {
                                                j3 = 9 + j;
                                                if (com.google.protobuf.UnsafeUtil.getByte(j2) < 0) {
                                                    if (com.google.protobuf.UnsafeUtil.getByte(j3) >= 0) {
                                                        j2 = j + 10;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    i = i5;
                                }
                                i = i5;
                            }
                        }
                        j2 = j3;
                    }
                    this.currentByteBufferPos = j2;
                    return i;
                }
            }
            return (int) readRawVarint64SlowPath();
        }

        @Override // com.google.protobuf.CodedInputStream
        public final long readRawVarint64() throws java.io.IOException {
            long j;
            long j2;
            int i;
            long j3 = this.currentByteBufferPos;
            if (this.currentByteBufferLimit != j3) {
                byte b = com.google.protobuf.UnsafeUtil.getByte(j3);
                if (b >= 0) {
                    this.currentByteBufferPos++;
                    return b;
                }
                if (this.currentByteBufferLimit - this.currentByteBufferPos >= 10) {
                    long j4 = 2 + j3;
                    int i2 = b ^ (com.google.protobuf.UnsafeUtil.getByte(1 + j3) << 7);
                    if (i2 >= 0) {
                        long j5 = 3 + j3;
                        int i3 = i2 ^ (com.google.protobuf.UnsafeUtil.getByte(j4) << 14);
                        if (i3 >= 0) {
                            j = i3 ^ 16256;
                            j4 = j5;
                        } else {
                            j4 = 4 + j3;
                            int i4 = i3 ^ (com.google.protobuf.UnsafeUtil.getByte(j5) << com.google.common.base.Ascii.NAK);
                            if (i4 < 0) {
                                i = (-2080896) ^ i4;
                            } else {
                                long j6 = 5 + j3;
                                long j7 = i4 ^ (com.google.protobuf.UnsafeUtil.getByte(j4) << 28);
                                if (j7 >= 0) {
                                    j2 = 266354560;
                                } else {
                                    long j8 = 6 + j3;
                                    j7 ^= com.google.protobuf.UnsafeUtil.getByte(j6) << 35;
                                    if (j7 < 0) {
                                        j2 = -34093383808L;
                                    } else {
                                        j6 = 7 + j3;
                                        j7 ^= com.google.protobuf.UnsafeUtil.getByte(j8) << 42;
                                        if (j7 >= 0) {
                                            j2 = 4363953127296L;
                                        } else {
                                            j8 = 8 + j3;
                                            j7 ^= com.google.protobuf.UnsafeUtil.getByte(j6) << 49;
                                            if (j7 < 0) {
                                                j2 = -558586000294016L;
                                            } else {
                                                long j9 = 9 + j3;
                                                long j10 = (j7 ^ (com.google.protobuf.UnsafeUtil.getByte(j8) << 56)) ^ 71499008037633920L;
                                                if (j10 >= 0) {
                                                    j = j10;
                                                    j4 = j9;
                                                } else if (com.google.protobuf.UnsafeUtil.getByte(j9) >= 0) {
                                                    j4 = j3 + 10;
                                                    j = j10;
                                                }
                                            }
                                        }
                                    }
                                    j4 = j8;
                                    j = j2 ^ j7;
                                }
                                j4 = j6;
                                j = j2 ^ j7;
                            }
                        }
                        this.currentByteBufferPos = j4;
                        return j;
                    }
                    i = i2 ^ androidx.work.WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT;
                    j = i;
                    this.currentByteBufferPos = j4;
                    return j;
                }
            }
            return readRawVarint64SlowPath();
        }

        @Override // com.google.protobuf.CodedInputStream
        final long readRawVarint64SlowPath() throws java.io.IOException {
            long j = 0;
            for (int i = 0; i < 64; i += 7) {
                j |= (r3 & Byte.MAX_VALUE) << i;
                if ((readRawByte() & 128) == 0) {
                    return j;
                }
            }
            throw com.google.protobuf.InvalidProtocolBufferException.malformedVarint();
        }

        @Override // com.google.protobuf.CodedInputStream
        public final int readRawLittleEndian32() throws java.io.IOException {
            int readRawByte;
            int readRawByte2;
            if (currentRemaining() >= 4) {
                long j = this.currentByteBufferPos;
                this.currentByteBufferPos = 4 + j;
                byte b = com.google.protobuf.UnsafeUtil.getByte(j);
                byte b2 = com.google.protobuf.UnsafeUtil.getByte(1 + j);
                byte b3 = com.google.protobuf.UnsafeUtil.getByte(2 + j);
                readRawByte = (com.google.protobuf.UnsafeUtil.getByte(j + 3) & 255) << 24;
                readRawByte2 = (b & 255) | ((b2 & 255) << 8) | ((b3 & 255) << 16);
            } else {
                readRawByte = (readRawByte() & 255) | ((readRawByte() & 255) << 8) | ((readRawByte() & 255) << 16);
                readRawByte2 = (readRawByte() & 255) << 24;
            }
            return readRawByte | readRawByte2;
        }

        @Override // com.google.protobuf.CodedInputStream
        public final long readRawLittleEndian64() throws java.io.IOException {
            long readRawByte;
            byte readRawByte2;
            if (currentRemaining() >= 8) {
                long j = this.currentByteBufferPos;
                this.currentByteBufferPos = 8 + j;
                long j2 = com.google.protobuf.UnsafeUtil.getByte(j);
                long j3 = com.google.protobuf.UnsafeUtil.getByte(1 + j);
                long j4 = (com.google.protobuf.UnsafeUtil.getByte(j + 4) & 255) << 32;
                long j5 = (com.google.protobuf.UnsafeUtil.getByte(j + 5) & 255) << 40;
                readRawByte = j5 | j4 | ((com.google.protobuf.UnsafeUtil.getByte(j + 2) & 255) << 16) | (j2 & 255) | ((j3 & 255) << 8) | ((com.google.protobuf.UnsafeUtil.getByte(j + 3) & 255) << 24) | ((com.google.protobuf.UnsafeUtil.getByte(6 + j) & 255) << 48);
                readRawByte2 = com.google.protobuf.UnsafeUtil.getByte(j + 7);
            } else {
                readRawByte = (readRawByte() & 255) | ((readRawByte() & 255) << 8) | ((readRawByte() & 255) << 16) | ((readRawByte() & 255) << 24) | ((readRawByte() & 255) << 32) | ((readRawByte() & 255) << 40) | ((readRawByte() & 255) << 48);
                readRawByte2 = readRawByte();
            }
            return readRawByte | ((readRawByte2 & 255) << 56);
        }

        @Override // com.google.protobuf.CodedInputStream
        public final void enableAliasing(boolean z) {
            this.enableAliasing = z;
        }

        @Override // com.google.protobuf.CodedInputStream
        public final void resetSizeCounter() {
            this.startOffset = (int) ((this.totalBytesRead + this.currentByteBufferPos) - this.currentByteBufferStartPos);
        }

        @Override // com.google.protobuf.CodedInputStream
        public final int pushLimit(int i) throws com.google.protobuf.InvalidProtocolBufferException {
            if (i < 0) {
                throw com.google.protobuf.InvalidProtocolBufferException.negativeSize();
            }
            int totalBytesRead = i + getTotalBytesRead();
            int i2 = this.currentLimit;
            if (totalBytesRead > i2) {
                throw com.google.protobuf.InvalidProtocolBufferException.truncatedMessage();
            }
            this.currentLimit = totalBytesRead;
            recomputeBufferSizeAfterLimit();
            return i2;
        }

        private void recomputeBufferSizeAfterLimit() {
            int i = this.totalBufferSize + this.bufferSizeAfterCurrentLimit;
            this.totalBufferSize = i;
            int i2 = i - this.startOffset;
            int i3 = this.currentLimit;
            if (i2 > i3) {
                int i4 = i2 - i3;
                this.bufferSizeAfterCurrentLimit = i4;
                this.totalBufferSize = i - i4;
                return;
            }
            this.bufferSizeAfterCurrentLimit = 0;
        }

        @Override // com.google.protobuf.CodedInputStream
        public final void popLimit(int i) {
            this.currentLimit = i;
            recomputeBufferSizeAfterLimit();
        }

        @Override // com.google.protobuf.CodedInputStream
        public final int getBytesUntilLimit() {
            int i = this.currentLimit;
            if (i == Integer.MAX_VALUE) {
                return -1;
            }
            return i - getTotalBytesRead();
        }

        @Override // com.google.protobuf.CodedInputStream
        public final boolean isAtEnd() throws java.io.IOException {
            return (((long) this.totalBytesRead) + this.currentByteBufferPos) - this.currentByteBufferStartPos == ((long) this.totalBufferSize);
        }

        @Override // com.google.protobuf.CodedInputStream
        public final int getTotalBytesRead() {
            return (int) (((this.totalBytesRead - this.startOffset) + this.currentByteBufferPos) - this.currentByteBufferStartPos);
        }

        @Override // com.google.protobuf.CodedInputStream
        public final byte readRawByte() throws java.io.IOException {
            if (currentRemaining() == 0) {
                getNextByteBuffer();
            }
            long j = this.currentByteBufferPos;
            this.currentByteBufferPos = 1 + j;
            return com.google.protobuf.UnsafeUtil.getByte(j);
        }

        @Override // com.google.protobuf.CodedInputStream
        public final byte[] readRawBytes(int i) throws java.io.IOException {
            if (i >= 0) {
                long j = i;
                if (j <= currentRemaining()) {
                    byte[] bArr = new byte[i];
                    com.google.protobuf.UnsafeUtil.copyMemory(this.currentByteBufferPos, bArr, 0L, j);
                    this.currentByteBufferPos += j;
                    return bArr;
                }
            }
            if (i >= 0 && i <= remaining()) {
                byte[] bArr2 = new byte[i];
                readRawBytesTo(bArr2, 0, i);
                return bArr2;
            }
            if (i > 0) {
                throw com.google.protobuf.InvalidProtocolBufferException.truncatedMessage();
            }
            if (i == 0) {
                return com.google.protobuf.Internal.EMPTY_BYTE_ARRAY;
            }
            throw com.google.protobuf.InvalidProtocolBufferException.negativeSize();
        }

        private void readRawBytesTo(byte[] bArr, int i, int i2) throws java.io.IOException {
            if (i2 < 0 || i2 > remaining()) {
                if (i2 > 0) {
                    throw com.google.protobuf.InvalidProtocolBufferException.truncatedMessage();
                }
                if (i2 != 0) {
                    throw com.google.protobuf.InvalidProtocolBufferException.negativeSize();
                }
                return;
            }
            int i3 = i2;
            while (i3 > 0) {
                if (currentRemaining() == 0) {
                    getNextByteBuffer();
                }
                int min = java.lang.Math.min(i3, (int) currentRemaining());
                long j = min;
                com.google.protobuf.UnsafeUtil.copyMemory(this.currentByteBufferPos, bArr, (i2 - i3) + i, j);
                i3 -= min;
                this.currentByteBufferPos += j;
            }
        }

        @Override // com.google.protobuf.CodedInputStream
        public final void skipRawBytes(int i) throws java.io.IOException {
            if (i < 0 || i > ((this.totalBufferSize - this.totalBytesRead) - this.currentByteBufferPos) + this.currentByteBufferStartPos) {
                if (i < 0) {
                    throw com.google.protobuf.InvalidProtocolBufferException.negativeSize();
                }
                throw com.google.protobuf.InvalidProtocolBufferException.truncatedMessage();
            }
            while (i > 0) {
                if (currentRemaining() == 0) {
                    getNextByteBuffer();
                }
                int min = java.lang.Math.min(i, (int) currentRemaining());
                i -= min;
                this.currentByteBufferPos += min;
            }
        }

        private void skipRawVarint() throws java.io.IOException {
            for (int i = 0; i < 10; i++) {
                if (readRawByte() >= 0) {
                    return;
                }
            }
            throw com.google.protobuf.InvalidProtocolBufferException.malformedVarint();
        }

        private int remaining() {
            return (int) (((this.totalBufferSize - this.totalBytesRead) - this.currentByteBufferPos) + this.currentByteBufferStartPos);
        }

        private long currentRemaining() {
            return this.currentByteBufferLimit - this.currentByteBufferPos;
        }

        private java.nio.ByteBuffer slice(int i, int i2) throws java.io.IOException {
            int position = this.currentByteBuffer.position();
            int limit = this.currentByteBuffer.limit();
            java.nio.ByteBuffer byteBuffer = this.currentByteBuffer;
            try {
                try {
                    byteBuffer.position(i);
                    byteBuffer.limit(i2);
                    return this.currentByteBuffer.slice();
                } catch (java.lang.IllegalArgumentException unused) {
                    throw com.google.protobuf.InvalidProtocolBufferException.truncatedMessage();
                }
            } finally {
                byteBuffer.position(position);
                byteBuffer.limit(limit);
            }
        }
    }
}
