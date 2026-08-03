package androidx.datastore.preferences.protobuf;

/* loaded from: classes2.dex */
public abstract class CodedInputStream {
    private static final int DEFAULT_BUFFER_SIZE = 4096;
    private static final int DEFAULT_SIZE_LIMIT = Integer.MAX_VALUE;
    private static volatile int defaultRecursionLimit = 100;
    int recursionDepth;
    int recursionLimit;
    private boolean shouldDiscardUnknownFields;
    int sizeLimit;
    androidx.datastore.preferences.protobuf.CodedInputStreamReader wrapper;

    public static int decodeZigZag32(final int n) {
        return (-(n & 1)) ^ (n >>> 1);
    }

    public static long decodeZigZag64(final long n) {
        return (-(n & 1)) ^ (n >>> 1);
    }

    public abstract void checkLastTagWas(final int value) throws androidx.datastore.preferences.protobuf.InvalidProtocolBufferException;

    public abstract void enableAliasing(boolean enabled);

    public abstract int getBytesUntilLimit();

    public abstract int getLastTag();

    public abstract int getTotalBytesRead();

    public abstract boolean isAtEnd() throws java.io.IOException;

    public abstract void popLimit(final int oldLimit);

    public abstract int pushLimit(int byteLimit) throws androidx.datastore.preferences.protobuf.InvalidProtocolBufferException;

    public abstract boolean readBool() throws java.io.IOException;

    public abstract byte[] readByteArray() throws java.io.IOException;

    public abstract java.nio.ByteBuffer readByteBuffer() throws java.io.IOException;

    public abstract androidx.datastore.preferences.protobuf.ByteString readBytes() throws java.io.IOException;

    public abstract double readDouble() throws java.io.IOException;

    public abstract int readEnum() throws java.io.IOException;

    public abstract int readFixed32() throws java.io.IOException;

    public abstract long readFixed64() throws java.io.IOException;

    public abstract float readFloat() throws java.io.IOException;

    public abstract <T extends androidx.datastore.preferences.protobuf.MessageLite> T readGroup(final int fieldNumber, final androidx.datastore.preferences.protobuf.Parser<T> parser, final androidx.datastore.preferences.protobuf.ExtensionRegistryLite extensionRegistry) throws java.io.IOException;

    public abstract void readGroup(final int fieldNumber, final androidx.datastore.preferences.protobuf.MessageLite.Builder builder, final androidx.datastore.preferences.protobuf.ExtensionRegistryLite extensionRegistry) throws java.io.IOException;

    public abstract int readInt32() throws java.io.IOException;

    public abstract long readInt64() throws java.io.IOException;

    public abstract <T extends androidx.datastore.preferences.protobuf.MessageLite> T readMessage(final androidx.datastore.preferences.protobuf.Parser<T> parser, final androidx.datastore.preferences.protobuf.ExtensionRegistryLite extensionRegistry) throws java.io.IOException;

    public abstract void readMessage(final androidx.datastore.preferences.protobuf.MessageLite.Builder builder, final androidx.datastore.preferences.protobuf.ExtensionRegistryLite extensionRegistry) throws java.io.IOException;

    public abstract byte readRawByte() throws java.io.IOException;

    public abstract byte[] readRawBytes(final int size) throws java.io.IOException;

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
    public abstract void readUnknownGroup(final int fieldNumber, final androidx.datastore.preferences.protobuf.MessageLite.Builder builder) throws java.io.IOException;

    public abstract void resetSizeCounter();

    public abstract boolean skipField(final int tag) throws java.io.IOException;

    @java.lang.Deprecated
    public abstract boolean skipField(final int tag, final androidx.datastore.preferences.protobuf.CodedOutputStream output) throws java.io.IOException;

    public abstract void skipRawBytes(final int size) throws java.io.IOException;

    public static androidx.datastore.preferences.protobuf.CodedInputStream newInstance(final java.io.InputStream input) {
        return newInstance(input, 4096);
    }

    public static androidx.datastore.preferences.protobuf.CodedInputStream newInstance(final java.io.InputStream input, int bufferSize) {
        if (bufferSize <= 0) {
            throw new java.lang.IllegalArgumentException("bufferSize must be > 0");
        }
        if (input == null) {
            return newInstance(androidx.datastore.preferences.protobuf.Internal.EMPTY_BYTE_ARRAY);
        }
        return new androidx.datastore.preferences.protobuf.CodedInputStream.StreamDecoder(input, bufferSize);
    }

    public static androidx.datastore.preferences.protobuf.CodedInputStream newInstance(final java.lang.Iterable<java.nio.ByteBuffer> input) {
        if (!androidx.datastore.preferences.protobuf.CodedInputStream.UnsafeDirectNioDecoder.isSupported()) {
            return newInstance(new androidx.datastore.preferences.protobuf.IterableByteBufferInputStream(input));
        }
        return newInstance(input, false);
    }

    static androidx.datastore.preferences.protobuf.CodedInputStream newInstance(final java.lang.Iterable<java.nio.ByteBuffer> bufs, final boolean bufferIsImmutable) {
        int i = 0;
        int i2 = 0;
        for (java.nio.ByteBuffer byteBuffer : bufs) {
            i2 += byteBuffer.remaining();
            if (byteBuffer.hasArray()) {
                i |= 1;
            } else {
                i = byteBuffer.isDirect() ? i | 2 : i | 4;
            }
        }
        if (i == 2) {
            return new androidx.datastore.preferences.protobuf.CodedInputStream.IterableDirectByteBufferDecoder(bufs, i2, bufferIsImmutable);
        }
        return newInstance(new androidx.datastore.preferences.protobuf.IterableByteBufferInputStream(bufs));
    }

    public static androidx.datastore.preferences.protobuf.CodedInputStream newInstance(final byte[] buf) {
        return newInstance(buf, 0, buf.length);
    }

    public static androidx.datastore.preferences.protobuf.CodedInputStream newInstance(final byte[] buf, final int off, final int len) {
        return newInstance(buf, off, len, false);
    }

    static androidx.datastore.preferences.protobuf.CodedInputStream newInstance(final byte[] buf, final int off, final int len, final boolean bufferIsImmutable) {
        androidx.datastore.preferences.protobuf.CodedInputStream.ArrayDecoder arrayDecoder = new androidx.datastore.preferences.protobuf.CodedInputStream.ArrayDecoder(buf, off, len, bufferIsImmutable);
        try {
            arrayDecoder.pushLimit(len);
            return arrayDecoder;
        } catch (androidx.datastore.preferences.protobuf.InvalidProtocolBufferException e) {
            throw new java.lang.IllegalArgumentException(e);
        }
    }

    public static androidx.datastore.preferences.protobuf.CodedInputStream newInstance(java.nio.ByteBuffer buf) {
        return newInstance(buf, false);
    }

    static androidx.datastore.preferences.protobuf.CodedInputStream newInstance(java.nio.ByteBuffer buf, boolean bufferIsImmutable) {
        if (buf.hasArray()) {
            return newInstance(buf.array(), buf.arrayOffset() + buf.position(), buf.remaining(), bufferIsImmutable);
        }
        if (buf.isDirect() && androidx.datastore.preferences.protobuf.CodedInputStream.UnsafeDirectNioDecoder.isSupported()) {
            return new androidx.datastore.preferences.protobuf.CodedInputStream.UnsafeDirectNioDecoder(buf, bufferIsImmutable);
        }
        int remaining = buf.remaining();
        byte[] bArr = new byte[remaining];
        buf.duplicate().get(bArr);
        return newInstance(bArr, 0, remaining, true);
    }

    public void checkRecursionLimit() throws androidx.datastore.preferences.protobuf.InvalidProtocolBufferException {
        if (this.recursionDepth >= this.recursionLimit) {
            throw androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.recursionLimitExceeded();
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

    public void skipMessage(androidx.datastore.preferences.protobuf.CodedOutputStream output) throws java.io.IOException {
        int readTag;
        do {
            readTag = readTag();
            if (readTag == 0) {
                return;
            }
            checkRecursionLimit();
            this.recursionDepth++;
            this.recursionDepth--;
        } while (skipField(readTag, output));
    }

    public final int setRecursionLimit(final int limit) {
        if (limit < 0) {
            throw new java.lang.IllegalArgumentException("Recursion limit cannot be negative: " + limit);
        }
        int i = this.recursionLimit;
        this.recursionLimit = limit;
        return i;
    }

    public final int setSizeLimit(final int limit) {
        if (limit < 0) {
            throw new java.lang.IllegalArgumentException("Size limit cannot be negative: " + limit);
        }
        int i = this.sizeLimit;
        this.sizeLimit = limit;
        return i;
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

    public static int readRawVarint32(final int firstByte, final java.io.InputStream input) throws java.io.IOException {
        if ((firstByte & 128) == 0) {
            return firstByte;
        }
        int i = firstByte & 127;
        int i2 = 7;
        while (i2 < 32) {
            int read = input.read();
            if (read == -1) {
                throw androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.truncatedMessage();
            }
            i |= (read & 127) << i2;
            if ((read & 128) == 0) {
                return i;
            }
            i2 += 7;
        }
        while (i2 < 64) {
            int read2 = input.read();
            if (read2 == -1) {
                throw androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.truncatedMessage();
            }
            if ((read2 & 128) == 0) {
                return i;
            }
            i2 += 7;
        }
        throw androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.malformedVarint();
    }

    static int readRawVarint32(final java.io.InputStream input) throws java.io.IOException {
        int read = input.read();
        if (read == -1) {
            throw androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.truncatedMessage();
        }
        return readRawVarint32(read, input);
    }

    private static final class ArrayDecoder extends androidx.datastore.preferences.protobuf.CodedInputStream {
        private final byte[] buffer;
        private int bufferSizeAfterLimit;
        private int currentLimit;
        private boolean enableAliasing;
        private final boolean immutable;
        private int lastTag;
        private int limit;
        private int pos;
        private int startPos;

        private ArrayDecoder(final byte[] buffer, final int offset, final int len, boolean immutable) {
            super();
            this.currentLimit = Integer.MAX_VALUE;
            this.buffer = buffer;
            this.limit = len + offset;
            this.pos = offset;
            this.startPos = offset;
            this.immutable = immutable;
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public int readTag() throws java.io.IOException {
            if (isAtEnd()) {
                this.lastTag = 0;
                return 0;
            }
            int readRawVarint32 = readRawVarint32();
            this.lastTag = readRawVarint32;
            if (androidx.datastore.preferences.protobuf.WireFormat.getTagFieldNumber(readRawVarint32) == 0) {
                throw androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.invalidTag();
            }
            return this.lastTag;
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public void checkLastTagWas(final int value) throws androidx.datastore.preferences.protobuf.InvalidProtocolBufferException {
            if (this.lastTag != value) {
                throw androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.invalidEndTag();
            }
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public int getLastTag() {
            return this.lastTag;
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public boolean skipField(final int tag) throws java.io.IOException {
            int tagWireType = androidx.datastore.preferences.protobuf.WireFormat.getTagWireType(tag);
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
                checkLastTagWas(androidx.datastore.preferences.protobuf.WireFormat.makeTag(androidx.datastore.preferences.protobuf.WireFormat.getTagFieldNumber(tag), 4));
                return true;
            }
            if (tagWireType == 4) {
                return false;
            }
            if (tagWireType == 5) {
                skipRawBytes(4);
                return true;
            }
            throw androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.invalidWireType();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public boolean skipField(final int tag, final androidx.datastore.preferences.protobuf.CodedOutputStream output) throws java.io.IOException {
            int tagWireType = androidx.datastore.preferences.protobuf.WireFormat.getTagWireType(tag);
            if (tagWireType == 0) {
                long readInt64 = readInt64();
                output.writeUInt32NoTag(tag);
                output.writeUInt64NoTag(readInt64);
                return true;
            }
            if (tagWireType == 1) {
                long readRawLittleEndian64 = readRawLittleEndian64();
                output.writeUInt32NoTag(tag);
                output.writeFixed64NoTag(readRawLittleEndian64);
                return true;
            }
            if (tagWireType == 2) {
                androidx.datastore.preferences.protobuf.ByteString readBytes = readBytes();
                output.writeUInt32NoTag(tag);
                output.writeBytesNoTag(readBytes);
                return true;
            }
            if (tagWireType == 3) {
                output.writeUInt32NoTag(tag);
                skipMessage(output);
                int makeTag = androidx.datastore.preferences.protobuf.WireFormat.makeTag(androidx.datastore.preferences.protobuf.WireFormat.getTagFieldNumber(tag), 4);
                checkLastTagWas(makeTag);
                output.writeUInt32NoTag(makeTag);
                return true;
            }
            if (tagWireType == 4) {
                return false;
            }
            if (tagWireType == 5) {
                int readRawLittleEndian32 = readRawLittleEndian32();
                output.writeUInt32NoTag(tag);
                output.writeFixed32NoTag(readRawLittleEndian32);
                return true;
            }
            throw androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.invalidWireType();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public double readDouble() throws java.io.IOException {
            return java.lang.Double.longBitsToDouble(readRawLittleEndian64());
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public float readFloat() throws java.io.IOException {
            return java.lang.Float.intBitsToFloat(readRawLittleEndian32());
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public long readUInt64() throws java.io.IOException {
            return readRawVarint64();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public long readInt64() throws java.io.IOException {
            return readRawVarint64();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public int readInt32() throws java.io.IOException {
            return readRawVarint32();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public long readFixed64() throws java.io.IOException {
            return readRawLittleEndian64();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public int readFixed32() throws java.io.IOException {
            return readRawLittleEndian32();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public boolean readBool() throws java.io.IOException {
            return readRawVarint64() != 0;
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public java.lang.String readString() throws java.io.IOException {
            int readRawVarint32 = readRawVarint32();
            if (readRawVarint32 > 0) {
                int i = this.limit;
                int i2 = this.pos;
                if (readRawVarint32 <= i - i2) {
                    java.lang.String str = new java.lang.String(this.buffer, i2, readRawVarint32, androidx.datastore.preferences.protobuf.Internal.UTF_8);
                    this.pos += readRawVarint32;
                    return str;
                }
            }
            if (readRawVarint32 == 0) {
                return "";
            }
            if (readRawVarint32 < 0) {
                throw androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.negativeSize();
            }
            throw androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.truncatedMessage();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public java.lang.String readStringRequireUtf8() throws java.io.IOException {
            int readRawVarint32 = readRawVarint32();
            if (readRawVarint32 > 0) {
                int i = this.limit;
                int i2 = this.pos;
                if (readRawVarint32 <= i - i2) {
                    java.lang.String decodeUtf8 = androidx.datastore.preferences.protobuf.Utf8.decodeUtf8(this.buffer, i2, readRawVarint32);
                    this.pos += readRawVarint32;
                    return decodeUtf8;
                }
            }
            if (readRawVarint32 == 0) {
                return "";
            }
            if (readRawVarint32 <= 0) {
                throw androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.negativeSize();
            }
            throw androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.truncatedMessage();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public void readGroup(final int fieldNumber, final androidx.datastore.preferences.protobuf.MessageLite.Builder builder, final androidx.datastore.preferences.protobuf.ExtensionRegistryLite extensionRegistry) throws java.io.IOException {
            checkRecursionLimit();
            this.recursionDepth++;
            builder.mergeFrom(this, extensionRegistry);
            checkLastTagWas(androidx.datastore.preferences.protobuf.WireFormat.makeTag(fieldNumber, 4));
            this.recursionDepth--;
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public <T extends androidx.datastore.preferences.protobuf.MessageLite> T readGroup(final int fieldNumber, final androidx.datastore.preferences.protobuf.Parser<T> parser, final androidx.datastore.preferences.protobuf.ExtensionRegistryLite extensionRegistry) throws java.io.IOException {
            checkRecursionLimit();
            this.recursionDepth++;
            T parsePartialFrom = parser.parsePartialFrom(this, extensionRegistry);
            checkLastTagWas(androidx.datastore.preferences.protobuf.WireFormat.makeTag(fieldNumber, 4));
            this.recursionDepth--;
            return parsePartialFrom;
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        @java.lang.Deprecated
        public void readUnknownGroup(final int fieldNumber, final androidx.datastore.preferences.protobuf.MessageLite.Builder builder) throws java.io.IOException {
            readGroup(fieldNumber, builder, androidx.datastore.preferences.protobuf.ExtensionRegistryLite.getEmptyRegistry());
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public void readMessage(final androidx.datastore.preferences.protobuf.MessageLite.Builder builder, final androidx.datastore.preferences.protobuf.ExtensionRegistryLite extensionRegistry) throws java.io.IOException {
            int readRawVarint32 = readRawVarint32();
            checkRecursionLimit();
            int pushLimit = pushLimit(readRawVarint32);
            this.recursionDepth++;
            builder.mergeFrom(this, extensionRegistry);
            checkLastTagWas(0);
            this.recursionDepth--;
            if (getBytesUntilLimit() != 0) {
                throw androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.truncatedMessage();
            }
            popLimit(pushLimit);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public <T extends androidx.datastore.preferences.protobuf.MessageLite> T readMessage(final androidx.datastore.preferences.protobuf.Parser<T> parser, final androidx.datastore.preferences.protobuf.ExtensionRegistryLite extensionRegistry) throws java.io.IOException {
            int readRawVarint32 = readRawVarint32();
            checkRecursionLimit();
            int pushLimit = pushLimit(readRawVarint32);
            this.recursionDepth++;
            T parsePartialFrom = parser.parsePartialFrom(this, extensionRegistry);
            checkLastTagWas(0);
            this.recursionDepth--;
            if (getBytesUntilLimit() != 0) {
                throw androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.truncatedMessage();
            }
            popLimit(pushLimit);
            return parsePartialFrom;
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public androidx.datastore.preferences.protobuf.ByteString readBytes() throws java.io.IOException {
            androidx.datastore.preferences.protobuf.ByteString copyFrom;
            int readRawVarint32 = readRawVarint32();
            if (readRawVarint32 > 0) {
                int i = this.limit;
                int i2 = this.pos;
                if (readRawVarint32 <= i - i2) {
                    if (this.immutable && this.enableAliasing) {
                        copyFrom = androidx.datastore.preferences.protobuf.ByteString.wrap(this.buffer, i2, readRawVarint32);
                    } else {
                        copyFrom = androidx.datastore.preferences.protobuf.ByteString.copyFrom(this.buffer, i2, readRawVarint32);
                    }
                    this.pos += readRawVarint32;
                    return copyFrom;
                }
            }
            if (readRawVarint32 == 0) {
                return androidx.datastore.preferences.protobuf.ByteString.EMPTY;
            }
            return androidx.datastore.preferences.protobuf.ByteString.wrap(readRawBytes(readRawVarint32));
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public byte[] readByteArray() throws java.io.IOException {
            return readRawBytes(readRawVarint32());
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public java.nio.ByteBuffer readByteBuffer() throws java.io.IOException {
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
                return androidx.datastore.preferences.protobuf.Internal.EMPTY_BYTE_BUFFER;
            }
            if (readRawVarint32 < 0) {
                throw androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.negativeSize();
            }
            throw androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.truncatedMessage();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public int readUInt32() throws java.io.IOException {
            return readRawVarint32();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public int readEnum() throws java.io.IOException {
            return readRawVarint32();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public int readSFixed32() throws java.io.IOException {
            return readRawLittleEndian32();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public long readSFixed64() throws java.io.IOException {
            return readRawLittleEndian64();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public int readSInt32() throws java.io.IOException {
            return decodeZigZag32(readRawVarint32());
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public long readSInt64() throws java.io.IOException {
            return decodeZigZag64(readRawVarint64());
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public int readRawVarint32() throws java.io.IOException {
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
                        i = i6 ^ (-128);
                    } else {
                        int i7 = i2 + 3;
                        int i8 = (bArr[i5] << com.google.common.base.Ascii.SO) ^ i6;
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
                                                    int i12 = i2 + 10;
                                                    if (bArr[i7] >= 0) {
                                                        i5 = i12;
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
            throw androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.malformedVarint();
        }

        private void skipRawVarintSlowPath() throws java.io.IOException {
            for (int i = 0; i < 10; i++) {
                if (readRawByte() >= 0) {
                    return;
                }
            }
            throw androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.malformedVarint();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public long readRawVarint64() throws java.io.IOException {
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
                        j = i5 ^ (-128);
                    } else {
                        int i6 = i + 3;
                        int i7 = (bArr[i4] << com.google.common.base.Ascii.SO) ^ i5;
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
                                                    int i11 = i + 10;
                                                    if (bArr[i4] >= 0) {
                                                        i4 = i11;
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

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        long readRawVarint64SlowPath() throws java.io.IOException {
            long j = 0;
            for (int i = 0; i < 64; i += 7) {
                j |= (r3 & Byte.MAX_VALUE) << i;
                if ((readRawByte() & 128) == 0) {
                    return j;
                }
            }
            throw androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.malformedVarint();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public int readRawLittleEndian32() throws java.io.IOException {
            int i = this.pos;
            if (this.limit - i < 4) {
                throw androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.truncatedMessage();
            }
            byte[] bArr = this.buffer;
            this.pos = i + 4;
            return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public long readRawLittleEndian64() throws java.io.IOException {
            int i = this.pos;
            if (this.limit - i < 8) {
                throw androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.truncatedMessage();
            }
            byte[] bArr = this.buffer;
            this.pos = i + 8;
            return ((bArr[i + 7] & 255) << 56) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24) | ((bArr[i + 4] & 255) << 32) | ((bArr[i + 5] & 255) << 40) | ((bArr[i + 6] & 255) << 48);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public void enableAliasing(boolean enabled) {
            this.enableAliasing = enabled;
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public void resetSizeCounter() {
            this.startPos = this.pos;
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public int pushLimit(int byteLimit) throws androidx.datastore.preferences.protobuf.InvalidProtocolBufferException {
            if (byteLimit < 0) {
                throw androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.negativeSize();
            }
            int totalBytesRead = byteLimit + getTotalBytesRead();
            if (totalBytesRead < 0) {
                throw androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.parseFailure();
            }
            int i = this.currentLimit;
            if (totalBytesRead > i) {
                throw androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.truncatedMessage();
            }
            this.currentLimit = totalBytesRead;
            recomputeBufferSizeAfterLimit();
            return i;
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

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public void popLimit(final int oldLimit) {
            this.currentLimit = oldLimit;
            recomputeBufferSizeAfterLimit();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public int getBytesUntilLimit() {
            int i = this.currentLimit;
            if (i == Integer.MAX_VALUE) {
                return -1;
            }
            return i - getTotalBytesRead();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public boolean isAtEnd() throws java.io.IOException {
            return this.pos == this.limit;
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public int getTotalBytesRead() {
            return this.pos - this.startPos;
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public byte readRawByte() throws java.io.IOException {
            int i = this.pos;
            if (i == this.limit) {
                throw androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.truncatedMessage();
            }
            byte[] bArr = this.buffer;
            this.pos = i + 1;
            return bArr[i];
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public byte[] readRawBytes(final int length) throws java.io.IOException {
            if (length > 0) {
                int i = this.limit;
                int i2 = this.pos;
                if (length <= i - i2) {
                    int i3 = length + i2;
                    this.pos = i3;
                    return java.util.Arrays.copyOfRange(this.buffer, i2, i3);
                }
            }
            if (length > 0) {
                throw androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.truncatedMessage();
            }
            if (length == 0) {
                return androidx.datastore.preferences.protobuf.Internal.EMPTY_BYTE_ARRAY;
            }
            throw androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.negativeSize();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public void skipRawBytes(final int length) throws java.io.IOException {
            if (length >= 0) {
                int i = this.limit;
                int i2 = this.pos;
                if (length <= i - i2) {
                    this.pos = i2 + length;
                    return;
                }
            }
            if (length < 0) {
                throw androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.negativeSize();
            }
            throw androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.truncatedMessage();
        }
    }

    private static final class UnsafeDirectNioDecoder extends androidx.datastore.preferences.protobuf.CodedInputStream {
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
            return androidx.datastore.preferences.protobuf.UnsafeUtil.hasUnsafeByteBufferOperations();
        }

        private UnsafeDirectNioDecoder(java.nio.ByteBuffer buffer, boolean immutable) {
            super();
            this.currentLimit = Integer.MAX_VALUE;
            this.buffer = buffer;
            long addressOffset = androidx.datastore.preferences.protobuf.UnsafeUtil.addressOffset(buffer);
            this.address = addressOffset;
            this.limit = buffer.limit() + addressOffset;
            long position = addressOffset + buffer.position();
            this.pos = position;
            this.startPos = position;
            this.immutable = immutable;
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public int readTag() throws java.io.IOException {
            if (isAtEnd()) {
                this.lastTag = 0;
                return 0;
            }
            int readRawVarint32 = readRawVarint32();
            this.lastTag = readRawVarint32;
            if (androidx.datastore.preferences.protobuf.WireFormat.getTagFieldNumber(readRawVarint32) == 0) {
                throw androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.invalidTag();
            }
            return this.lastTag;
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public void checkLastTagWas(final int value) throws androidx.datastore.preferences.protobuf.InvalidProtocolBufferException {
            if (this.lastTag != value) {
                throw androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.invalidEndTag();
            }
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public int getLastTag() {
            return this.lastTag;
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public boolean skipField(final int tag) throws java.io.IOException {
            int tagWireType = androidx.datastore.preferences.protobuf.WireFormat.getTagWireType(tag);
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
                checkLastTagWas(androidx.datastore.preferences.protobuf.WireFormat.makeTag(androidx.datastore.preferences.protobuf.WireFormat.getTagFieldNumber(tag), 4));
                return true;
            }
            if (tagWireType == 4) {
                return false;
            }
            if (tagWireType == 5) {
                skipRawBytes(4);
                return true;
            }
            throw androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.invalidWireType();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public boolean skipField(final int tag, final androidx.datastore.preferences.protobuf.CodedOutputStream output) throws java.io.IOException {
            int tagWireType = androidx.datastore.preferences.protobuf.WireFormat.getTagWireType(tag);
            if (tagWireType == 0) {
                long readInt64 = readInt64();
                output.writeUInt32NoTag(tag);
                output.writeUInt64NoTag(readInt64);
                return true;
            }
            if (tagWireType == 1) {
                long readRawLittleEndian64 = readRawLittleEndian64();
                output.writeUInt32NoTag(tag);
                output.writeFixed64NoTag(readRawLittleEndian64);
                return true;
            }
            if (tagWireType == 2) {
                androidx.datastore.preferences.protobuf.ByteString readBytes = readBytes();
                output.writeUInt32NoTag(tag);
                output.writeBytesNoTag(readBytes);
                return true;
            }
            if (tagWireType == 3) {
                output.writeUInt32NoTag(tag);
                skipMessage(output);
                int makeTag = androidx.datastore.preferences.protobuf.WireFormat.makeTag(androidx.datastore.preferences.protobuf.WireFormat.getTagFieldNumber(tag), 4);
                checkLastTagWas(makeTag);
                output.writeUInt32NoTag(makeTag);
                return true;
            }
            if (tagWireType == 4) {
                return false;
            }
            if (tagWireType == 5) {
                int readRawLittleEndian32 = readRawLittleEndian32();
                output.writeUInt32NoTag(tag);
                output.writeFixed32NoTag(readRawLittleEndian32);
                return true;
            }
            throw androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.invalidWireType();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public double readDouble() throws java.io.IOException {
            return java.lang.Double.longBitsToDouble(readRawLittleEndian64());
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public float readFloat() throws java.io.IOException {
            return java.lang.Float.intBitsToFloat(readRawLittleEndian32());
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public long readUInt64() throws java.io.IOException {
            return readRawVarint64();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public long readInt64() throws java.io.IOException {
            return readRawVarint64();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public int readInt32() throws java.io.IOException {
            return readRawVarint32();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public long readFixed64() throws java.io.IOException {
            return readRawLittleEndian64();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public int readFixed32() throws java.io.IOException {
            return readRawLittleEndian32();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public boolean readBool() throws java.io.IOException {
            return readRawVarint64() != 0;
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public java.lang.String readString() throws java.io.IOException {
            int readRawVarint32 = readRawVarint32();
            if (readRawVarint32 <= 0 || readRawVarint32 > remaining()) {
                if (readRawVarint32 == 0) {
                    return "";
                }
                if (readRawVarint32 < 0) {
                    throw androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.negativeSize();
                }
                throw androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.truncatedMessage();
            }
            byte[] bArr = new byte[readRawVarint32];
            long j = readRawVarint32;
            androidx.datastore.preferences.protobuf.UnsafeUtil.copyMemory(this.pos, bArr, 0L, j);
            java.lang.String str = new java.lang.String(bArr, androidx.datastore.preferences.protobuf.Internal.UTF_8);
            this.pos += j;
            return str;
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public java.lang.String readStringRequireUtf8() throws java.io.IOException {
            int readRawVarint32 = readRawVarint32();
            if (readRawVarint32 > 0 && readRawVarint32 <= remaining()) {
                java.lang.String decodeUtf8 = androidx.datastore.preferences.protobuf.Utf8.decodeUtf8(this.buffer, bufferPos(this.pos), readRawVarint32);
                this.pos += readRawVarint32;
                return decodeUtf8;
            }
            if (readRawVarint32 == 0) {
                return "";
            }
            if (readRawVarint32 <= 0) {
                throw androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.negativeSize();
            }
            throw androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.truncatedMessage();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public void readGroup(final int fieldNumber, final androidx.datastore.preferences.protobuf.MessageLite.Builder builder, final androidx.datastore.preferences.protobuf.ExtensionRegistryLite extensionRegistry) throws java.io.IOException {
            checkRecursionLimit();
            this.recursionDepth++;
            builder.mergeFrom(this, extensionRegistry);
            checkLastTagWas(androidx.datastore.preferences.protobuf.WireFormat.makeTag(fieldNumber, 4));
            this.recursionDepth--;
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public <T extends androidx.datastore.preferences.protobuf.MessageLite> T readGroup(final int fieldNumber, final androidx.datastore.preferences.protobuf.Parser<T> parser, final androidx.datastore.preferences.protobuf.ExtensionRegistryLite extensionRegistry) throws java.io.IOException {
            checkRecursionLimit();
            this.recursionDepth++;
            T parsePartialFrom = parser.parsePartialFrom(this, extensionRegistry);
            checkLastTagWas(androidx.datastore.preferences.protobuf.WireFormat.makeTag(fieldNumber, 4));
            this.recursionDepth--;
            return parsePartialFrom;
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        @java.lang.Deprecated
        public void readUnknownGroup(final int fieldNumber, final androidx.datastore.preferences.protobuf.MessageLite.Builder builder) throws java.io.IOException {
            readGroup(fieldNumber, builder, androidx.datastore.preferences.protobuf.ExtensionRegistryLite.getEmptyRegistry());
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public void readMessage(final androidx.datastore.preferences.protobuf.MessageLite.Builder builder, final androidx.datastore.preferences.protobuf.ExtensionRegistryLite extensionRegistry) throws java.io.IOException {
            int readRawVarint32 = readRawVarint32();
            checkRecursionLimit();
            int pushLimit = pushLimit(readRawVarint32);
            this.recursionDepth++;
            builder.mergeFrom(this, extensionRegistry);
            checkLastTagWas(0);
            this.recursionDepth--;
            if (getBytesUntilLimit() != 0) {
                throw androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.truncatedMessage();
            }
            popLimit(pushLimit);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public <T extends androidx.datastore.preferences.protobuf.MessageLite> T readMessage(final androidx.datastore.preferences.protobuf.Parser<T> parser, final androidx.datastore.preferences.protobuf.ExtensionRegistryLite extensionRegistry) throws java.io.IOException {
            int readRawVarint32 = readRawVarint32();
            checkRecursionLimit();
            int pushLimit = pushLimit(readRawVarint32);
            this.recursionDepth++;
            T parsePartialFrom = parser.parsePartialFrom(this, extensionRegistry);
            checkLastTagWas(0);
            this.recursionDepth--;
            if (getBytesUntilLimit() != 0) {
                throw androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.truncatedMessage();
            }
            popLimit(pushLimit);
            return parsePartialFrom;
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public androidx.datastore.preferences.protobuf.ByteString readBytes() throws java.io.IOException {
            int readRawVarint32 = readRawVarint32();
            if (readRawVarint32 <= 0 || readRawVarint32 > remaining()) {
                if (readRawVarint32 == 0) {
                    return androidx.datastore.preferences.protobuf.ByteString.EMPTY;
                }
                if (readRawVarint32 < 0) {
                    throw androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.negativeSize();
                }
                throw androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.truncatedMessage();
            }
            if (this.immutable && this.enableAliasing) {
                long j = this.pos;
                long j2 = readRawVarint32;
                java.nio.ByteBuffer slice = slice(j, j + j2);
                this.pos += j2;
                return androidx.datastore.preferences.protobuf.ByteString.wrap(slice);
            }
            byte[] bArr = new byte[readRawVarint32];
            long j3 = readRawVarint32;
            androidx.datastore.preferences.protobuf.UnsafeUtil.copyMemory(this.pos, bArr, 0L, j3);
            this.pos += j3;
            return androidx.datastore.preferences.protobuf.ByteString.wrap(bArr);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public byte[] readByteArray() throws java.io.IOException {
            return readRawBytes(readRawVarint32());
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public java.nio.ByteBuffer readByteBuffer() throws java.io.IOException {
            int readRawVarint32 = readRawVarint32();
            if (readRawVarint32 <= 0 || readRawVarint32 > remaining()) {
                if (readRawVarint32 == 0) {
                    return androidx.datastore.preferences.protobuf.Internal.EMPTY_BYTE_BUFFER;
                }
                if (readRawVarint32 < 0) {
                    throw androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.negativeSize();
                }
                throw androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.truncatedMessage();
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
            androidx.datastore.preferences.protobuf.UnsafeUtil.copyMemory(this.pos, bArr, 0L, j3);
            this.pos += j3;
            return java.nio.ByteBuffer.wrap(bArr);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public int readUInt32() throws java.io.IOException {
            return readRawVarint32();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public int readEnum() throws java.io.IOException {
            return readRawVarint32();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public int readSFixed32() throws java.io.IOException {
            return readRawLittleEndian32();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public long readSFixed64() throws java.io.IOException {
            return readRawLittleEndian64();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public int readSInt32() throws java.io.IOException {
            return decodeZigZag32(readRawVarint32());
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public long readSInt64() throws java.io.IOException {
            return decodeZigZag64(readRawVarint64());
        }

        /* JADX WARN: Code restructure failed: missing block: B:33:0x008c, code lost:
        
            if (androidx.datastore.preferences.protobuf.UnsafeUtil.getByte(r3) < 0) goto L34;
         */
        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public int readRawVarint32() throws java.io.IOException {
            int i;
            long j = this.pos;
            if (this.limit != j) {
                long j2 = 1 + j;
                byte b = androidx.datastore.preferences.protobuf.UnsafeUtil.getByte(j);
                if (b >= 0) {
                    this.pos = j2;
                    return b;
                }
                if (this.limit - j2 >= 9) {
                    long j3 = 2 + j;
                    int i2 = (androidx.datastore.preferences.protobuf.UnsafeUtil.getByte(j2) << 7) ^ b;
                    if (i2 < 0) {
                        i = i2 ^ (-128);
                    } else {
                        long j4 = 3 + j;
                        int i3 = i2 ^ (androidx.datastore.preferences.protobuf.UnsafeUtil.getByte(j3) << com.google.common.base.Ascii.SO);
                        if (i3 >= 0) {
                            i = i3 ^ 16256;
                        } else {
                            j3 = 4 + j;
                            int i4 = i3 ^ (androidx.datastore.preferences.protobuf.UnsafeUtil.getByte(j4) << com.google.common.base.Ascii.NAK);
                            if (i4 < 0) {
                                i = (-2080896) ^ i4;
                            } else {
                                j4 = 5 + j;
                                byte b2 = androidx.datastore.preferences.protobuf.UnsafeUtil.getByte(j3);
                                int i5 = (i4 ^ (b2 << com.google.common.base.Ascii.FS)) ^ 266354560;
                                if (b2 < 0) {
                                    j3 = 6 + j;
                                    if (androidx.datastore.preferences.protobuf.UnsafeUtil.getByte(j4) < 0) {
                                        j4 = 7 + j;
                                        if (androidx.datastore.preferences.protobuf.UnsafeUtil.getByte(j3) < 0) {
                                            j3 = 8 + j;
                                            if (androidx.datastore.preferences.protobuf.UnsafeUtil.getByte(j4) < 0) {
                                                j4 = j + 9;
                                                if (androidx.datastore.preferences.protobuf.UnsafeUtil.getByte(j3) < 0) {
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
                if (androidx.datastore.preferences.protobuf.UnsafeUtil.getByte(j) >= 0) {
                    return;
                }
            }
            throw androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.malformedVarint();
        }

        private void skipRawVarintSlowPath() throws java.io.IOException {
            for (int i = 0; i < 10; i++) {
                if (readRawByte() >= 0) {
                    return;
                }
            }
            throw androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.malformedVarint();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public long readRawVarint64() throws java.io.IOException {
            long j;
            long j2;
            long j3;
            int i;
            long j4 = this.pos;
            if (this.limit != j4) {
                long j5 = 1 + j4;
                byte b = androidx.datastore.preferences.protobuf.UnsafeUtil.getByte(j4);
                if (b >= 0) {
                    this.pos = j5;
                    return b;
                }
                if (this.limit - j5 >= 9) {
                    long j6 = 2 + j4;
                    int i2 = (androidx.datastore.preferences.protobuf.UnsafeUtil.getByte(j5) << 7) ^ b;
                    if (i2 >= 0) {
                        long j7 = 3 + j4;
                        int i3 = i2 ^ (androidx.datastore.preferences.protobuf.UnsafeUtil.getByte(j6) << com.google.common.base.Ascii.SO);
                        if (i3 >= 0) {
                            j = i3 ^ 16256;
                            j6 = j7;
                        } else {
                            j6 = 4 + j4;
                            int i4 = i3 ^ (androidx.datastore.preferences.protobuf.UnsafeUtil.getByte(j7) << com.google.common.base.Ascii.NAK);
                            if (i4 < 0) {
                                i = (-2080896) ^ i4;
                            } else {
                                long j8 = 5 + j4;
                                long j9 = i4 ^ (androidx.datastore.preferences.protobuf.UnsafeUtil.getByte(j6) << 28);
                                if (j9 >= 0) {
                                    j3 = 266354560;
                                } else {
                                    long j10 = 6 + j4;
                                    long j11 = j9 ^ (androidx.datastore.preferences.protobuf.UnsafeUtil.getByte(j8) << 35);
                                    if (j11 < 0) {
                                        j2 = -34093383808L;
                                    } else {
                                        j8 = 7 + j4;
                                        j9 = j11 ^ (androidx.datastore.preferences.protobuf.UnsafeUtil.getByte(j10) << 42);
                                        if (j9 >= 0) {
                                            j3 = 4363953127296L;
                                        } else {
                                            j10 = 8 + j4;
                                            j11 = j9 ^ (androidx.datastore.preferences.protobuf.UnsafeUtil.getByte(j8) << 49);
                                            if (j11 < 0) {
                                                j2 = -558586000294016L;
                                            } else {
                                                long j12 = j4 + 9;
                                                long j13 = (j11 ^ (androidx.datastore.preferences.protobuf.UnsafeUtil.getByte(j10) << 56)) ^ 71499008037633920L;
                                                if (j13 < 0) {
                                                    long j14 = j4 + 10;
                                                    if (androidx.datastore.preferences.protobuf.UnsafeUtil.getByte(j12) >= 0) {
                                                        j6 = j14;
                                                        j = j13;
                                                    }
                                                } else {
                                                    j = j13;
                                                    j6 = j12;
                                                }
                                            }
                                        }
                                    }
                                    j = j2 ^ j11;
                                    j6 = j10;
                                }
                                j = j3 ^ j9;
                                j6 = j8;
                            }
                        }
                        this.pos = j6;
                        return j;
                    }
                    i = i2 ^ (-128);
                    j = i;
                    this.pos = j6;
                    return j;
                }
            }
            return readRawVarint64SlowPath();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        long readRawVarint64SlowPath() throws java.io.IOException {
            long j = 0;
            for (int i = 0; i < 64; i += 7) {
                j |= (r3 & Byte.MAX_VALUE) << i;
                if ((readRawByte() & 128) == 0) {
                    return j;
                }
            }
            throw androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.malformedVarint();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public int readRawLittleEndian32() throws java.io.IOException {
            long j = this.pos;
            if (this.limit - j < 4) {
                throw androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.truncatedMessage();
            }
            this.pos = 4 + j;
            return ((androidx.datastore.preferences.protobuf.UnsafeUtil.getByte(j + 3) & 255) << 24) | (androidx.datastore.preferences.protobuf.UnsafeUtil.getByte(j) & 255) | ((androidx.datastore.preferences.protobuf.UnsafeUtil.getByte(1 + j) & 255) << 8) | ((androidx.datastore.preferences.protobuf.UnsafeUtil.getByte(2 + j) & 255) << 16);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public long readRawLittleEndian64() throws java.io.IOException {
            long j = this.pos;
            if (this.limit - j < 8) {
                throw androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.truncatedMessage();
            }
            this.pos = 8 + j;
            return ((androidx.datastore.preferences.protobuf.UnsafeUtil.getByte(j + 7) & 255) << 56) | (androidx.datastore.preferences.protobuf.UnsafeUtil.getByte(j) & 255) | ((androidx.datastore.preferences.protobuf.UnsafeUtil.getByte(1 + j) & 255) << 8) | ((androidx.datastore.preferences.protobuf.UnsafeUtil.getByte(2 + j) & 255) << 16) | ((androidx.datastore.preferences.protobuf.UnsafeUtil.getByte(3 + j) & 255) << 24) | ((androidx.datastore.preferences.protobuf.UnsafeUtil.getByte(4 + j) & 255) << 32) | ((androidx.datastore.preferences.protobuf.UnsafeUtil.getByte(5 + j) & 255) << 40) | ((androidx.datastore.preferences.protobuf.UnsafeUtil.getByte(6 + j) & 255) << 48);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public void enableAliasing(boolean enabled) {
            this.enableAliasing = enabled;
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public void resetSizeCounter() {
            this.startPos = this.pos;
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public int pushLimit(int byteLimit) throws androidx.datastore.preferences.protobuf.InvalidProtocolBufferException {
            if (byteLimit < 0) {
                throw androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.negativeSize();
            }
            int totalBytesRead = byteLimit + getTotalBytesRead();
            int i = this.currentLimit;
            if (totalBytesRead > i) {
                throw androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.truncatedMessage();
            }
            this.currentLimit = totalBytesRead;
            recomputeBufferSizeAfterLimit();
            return i;
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public void popLimit(final int oldLimit) {
            this.currentLimit = oldLimit;
            recomputeBufferSizeAfterLimit();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public int getBytesUntilLimit() {
            int i = this.currentLimit;
            if (i == Integer.MAX_VALUE) {
                return -1;
            }
            return i - getTotalBytesRead();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public boolean isAtEnd() throws java.io.IOException {
            return this.pos == this.limit;
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public int getTotalBytesRead() {
            return (int) (this.pos - this.startPos);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public byte readRawByte() throws java.io.IOException {
            long j = this.pos;
            if (j == this.limit) {
                throw androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.truncatedMessage();
            }
            this.pos = 1 + j;
            return androidx.datastore.preferences.protobuf.UnsafeUtil.getByte(j);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public byte[] readRawBytes(final int length) throws java.io.IOException {
            if (length < 0 || length > remaining()) {
                if (length > 0) {
                    throw androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.truncatedMessage();
                }
                if (length == 0) {
                    return androidx.datastore.preferences.protobuf.Internal.EMPTY_BYTE_ARRAY;
                }
                throw androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.negativeSize();
            }
            byte[] bArr = new byte[length];
            long j = this.pos;
            long j2 = length;
            slice(j, j + j2).get(bArr);
            this.pos += j2;
            return bArr;
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public void skipRawBytes(final int length) throws java.io.IOException {
            if (length >= 0 && length <= remaining()) {
                this.pos += length;
            } else {
                if (length < 0) {
                    throw androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.negativeSize();
                }
                throw androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.truncatedMessage();
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

        private int bufferPos(long pos) {
            return (int) (pos - this.address);
        }

        private java.nio.ByteBuffer slice(long begin, long end) throws java.io.IOException {
            int position = this.buffer.position();
            int limit = this.buffer.limit();
            java.nio.ByteBuffer byteBuffer = this.buffer;
            try {
                try {
                    byteBuffer.position(bufferPos(begin));
                    byteBuffer.limit(bufferPos(end));
                    return this.buffer.slice();
                } catch (java.lang.IllegalArgumentException e) {
                    androidx.datastore.preferences.protobuf.InvalidProtocolBufferException truncatedMessage = androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.truncatedMessage();
                    truncatedMessage.initCause(e);
                    throw truncatedMessage;
                }
            } finally {
                byteBuffer.position(position);
                byteBuffer.limit(limit);
            }
        }
    }

    private static final class StreamDecoder extends androidx.datastore.preferences.protobuf.CodedInputStream {
        private final byte[] buffer;
        private int bufferSize;
        private int bufferSizeAfterLimit;
        private int currentLimit;
        private final java.io.InputStream input;
        private int lastTag;
        private int pos;
        private androidx.datastore.preferences.protobuf.CodedInputStream.StreamDecoder.RefillCallback refillCallback;
        private int totalBytesRetired;

        private interface RefillCallback {
            void onRefill();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public void enableAliasing(boolean enabled) {
        }

        private StreamDecoder(final java.io.InputStream input, int bufferSize) {
            super();
            this.currentLimit = Integer.MAX_VALUE;
            this.refillCallback = null;
            androidx.datastore.preferences.protobuf.Internal.checkNotNull(input, "input");
            this.input = input;
            this.buffer = new byte[bufferSize];
            this.bufferSize = 0;
            this.pos = 0;
            this.totalBytesRetired = 0;
        }

        private static int read(java.io.InputStream input, byte[] data, int offset, int length) throws java.io.IOException {
            try {
                return input.read(data, offset, length);
            } catch (androidx.datastore.preferences.protobuf.InvalidProtocolBufferException e) {
                e.setThrownFromInputStream();
                throw e;
            }
        }

        private static long skip(java.io.InputStream input, long length) throws java.io.IOException {
            try {
                return input.skip(length);
            } catch (androidx.datastore.preferences.protobuf.InvalidProtocolBufferException e) {
                e.setThrownFromInputStream();
                throw e;
            }
        }

        private static int available(java.io.InputStream input) throws java.io.IOException {
            try {
                return input.available();
            } catch (androidx.datastore.preferences.protobuf.InvalidProtocolBufferException e) {
                e.setThrownFromInputStream();
                throw e;
            }
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public int readTag() throws java.io.IOException {
            if (isAtEnd()) {
                this.lastTag = 0;
                return 0;
            }
            int readRawVarint32 = readRawVarint32();
            this.lastTag = readRawVarint32;
            if (androidx.datastore.preferences.protobuf.WireFormat.getTagFieldNumber(readRawVarint32) == 0) {
                throw androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.invalidTag();
            }
            return this.lastTag;
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public void checkLastTagWas(final int value) throws androidx.datastore.preferences.protobuf.InvalidProtocolBufferException {
            if (this.lastTag != value) {
                throw androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.invalidEndTag();
            }
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public int getLastTag() {
            return this.lastTag;
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public boolean skipField(final int tag) throws java.io.IOException {
            int tagWireType = androidx.datastore.preferences.protobuf.WireFormat.getTagWireType(tag);
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
                checkLastTagWas(androidx.datastore.preferences.protobuf.WireFormat.makeTag(androidx.datastore.preferences.protobuf.WireFormat.getTagFieldNumber(tag), 4));
                return true;
            }
            if (tagWireType == 4) {
                return false;
            }
            if (tagWireType == 5) {
                skipRawBytes(4);
                return true;
            }
            throw androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.invalidWireType();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public boolean skipField(final int tag, final androidx.datastore.preferences.protobuf.CodedOutputStream output) throws java.io.IOException {
            int tagWireType = androidx.datastore.preferences.protobuf.WireFormat.getTagWireType(tag);
            if (tagWireType == 0) {
                long readInt64 = readInt64();
                output.writeUInt32NoTag(tag);
                output.writeUInt64NoTag(readInt64);
                return true;
            }
            if (tagWireType == 1) {
                long readRawLittleEndian64 = readRawLittleEndian64();
                output.writeUInt32NoTag(tag);
                output.writeFixed64NoTag(readRawLittleEndian64);
                return true;
            }
            if (tagWireType == 2) {
                androidx.datastore.preferences.protobuf.ByteString readBytes = readBytes();
                output.writeUInt32NoTag(tag);
                output.writeBytesNoTag(readBytes);
                return true;
            }
            if (tagWireType == 3) {
                output.writeUInt32NoTag(tag);
                skipMessage(output);
                int makeTag = androidx.datastore.preferences.protobuf.WireFormat.makeTag(androidx.datastore.preferences.protobuf.WireFormat.getTagFieldNumber(tag), 4);
                checkLastTagWas(makeTag);
                output.writeUInt32NoTag(makeTag);
                return true;
            }
            if (tagWireType == 4) {
                return false;
            }
            if (tagWireType == 5) {
                int readRawLittleEndian32 = readRawLittleEndian32();
                output.writeUInt32NoTag(tag);
                output.writeFixed32NoTag(readRawLittleEndian32);
                return true;
            }
            throw androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.invalidWireType();
        }

        private class SkippedDataSink implements androidx.datastore.preferences.protobuf.CodedInputStream.StreamDecoder.RefillCallback {
            private java.io.ByteArrayOutputStream byteArrayStream;
            private int lastPos;

            private SkippedDataSink() {
                this.lastPos = androidx.datastore.preferences.protobuf.CodedInputStream.StreamDecoder.this.pos;
            }

            @Override // androidx.datastore.preferences.protobuf.CodedInputStream.StreamDecoder.RefillCallback
            public void onRefill() {
                if (this.byteArrayStream == null) {
                    this.byteArrayStream = new java.io.ByteArrayOutputStream();
                }
                this.byteArrayStream.write(androidx.datastore.preferences.protobuf.CodedInputStream.StreamDecoder.this.buffer, this.lastPos, androidx.datastore.preferences.protobuf.CodedInputStream.StreamDecoder.this.pos - this.lastPos);
                this.lastPos = 0;
            }

            java.nio.ByteBuffer getSkippedData() {
                java.io.ByteArrayOutputStream byteArrayOutputStream = this.byteArrayStream;
                if (byteArrayOutputStream == null) {
                    return java.nio.ByteBuffer.wrap(androidx.datastore.preferences.protobuf.CodedInputStream.StreamDecoder.this.buffer, this.lastPos, androidx.datastore.preferences.protobuf.CodedInputStream.StreamDecoder.this.pos - this.lastPos);
                }
                byteArrayOutputStream.write(androidx.datastore.preferences.protobuf.CodedInputStream.StreamDecoder.this.buffer, this.lastPos, androidx.datastore.preferences.protobuf.CodedInputStream.StreamDecoder.this.pos);
                return java.nio.ByteBuffer.wrap(this.byteArrayStream.toByteArray());
            }
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public double readDouble() throws java.io.IOException {
            return java.lang.Double.longBitsToDouble(readRawLittleEndian64());
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public float readFloat() throws java.io.IOException {
            return java.lang.Float.intBitsToFloat(readRawLittleEndian32());
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public long readUInt64() throws java.io.IOException {
            return readRawVarint64();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public long readInt64() throws java.io.IOException {
            return readRawVarint64();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public int readInt32() throws java.io.IOException {
            return readRawVarint32();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public long readFixed64() throws java.io.IOException {
            return readRawLittleEndian64();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public int readFixed32() throws java.io.IOException {
            return readRawLittleEndian32();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public boolean readBool() throws java.io.IOException {
            return readRawVarint64() != 0;
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public java.lang.String readString() throws java.io.IOException {
            int readRawVarint32 = readRawVarint32();
            if (readRawVarint32 > 0) {
                int i = this.bufferSize;
                int i2 = this.pos;
                if (readRawVarint32 <= i - i2) {
                    java.lang.String str = new java.lang.String(this.buffer, i2, readRawVarint32, androidx.datastore.preferences.protobuf.Internal.UTF_8);
                    this.pos += readRawVarint32;
                    return str;
                }
            }
            if (readRawVarint32 == 0) {
                return "";
            }
            if (readRawVarint32 < 0) {
                throw androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.negativeSize();
            }
            if (readRawVarint32 <= this.bufferSize) {
                refillBuffer(readRawVarint32);
                java.lang.String str2 = new java.lang.String(this.buffer, this.pos, readRawVarint32, androidx.datastore.preferences.protobuf.Internal.UTF_8);
                this.pos += readRawVarint32;
                return str2;
            }
            return new java.lang.String(readRawBytesSlowPath(readRawVarint32, false), androidx.datastore.preferences.protobuf.Internal.UTF_8);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public java.lang.String readStringRequireUtf8() throws java.io.IOException {
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
                    throw androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.negativeSize();
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
            return androidx.datastore.preferences.protobuf.Utf8.decodeUtf8(readRawBytesSlowPath, i, readRawVarint32);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public void readGroup(final int fieldNumber, final androidx.datastore.preferences.protobuf.MessageLite.Builder builder, final androidx.datastore.preferences.protobuf.ExtensionRegistryLite extensionRegistry) throws java.io.IOException {
            checkRecursionLimit();
            this.recursionDepth++;
            builder.mergeFrom(this, extensionRegistry);
            checkLastTagWas(androidx.datastore.preferences.protobuf.WireFormat.makeTag(fieldNumber, 4));
            this.recursionDepth--;
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public <T extends androidx.datastore.preferences.protobuf.MessageLite> T readGroup(final int fieldNumber, final androidx.datastore.preferences.protobuf.Parser<T> parser, final androidx.datastore.preferences.protobuf.ExtensionRegistryLite extensionRegistry) throws java.io.IOException {
            checkRecursionLimit();
            this.recursionDepth++;
            T parsePartialFrom = parser.parsePartialFrom(this, extensionRegistry);
            checkLastTagWas(androidx.datastore.preferences.protobuf.WireFormat.makeTag(fieldNumber, 4));
            this.recursionDepth--;
            return parsePartialFrom;
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        @java.lang.Deprecated
        public void readUnknownGroup(final int fieldNumber, final androidx.datastore.preferences.protobuf.MessageLite.Builder builder) throws java.io.IOException {
            readGroup(fieldNumber, builder, androidx.datastore.preferences.protobuf.ExtensionRegistryLite.getEmptyRegistry());
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public void readMessage(final androidx.datastore.preferences.protobuf.MessageLite.Builder builder, final androidx.datastore.preferences.protobuf.ExtensionRegistryLite extensionRegistry) throws java.io.IOException {
            int readRawVarint32 = readRawVarint32();
            checkRecursionLimit();
            int pushLimit = pushLimit(readRawVarint32);
            this.recursionDepth++;
            builder.mergeFrom(this, extensionRegistry);
            checkLastTagWas(0);
            this.recursionDepth--;
            if (getBytesUntilLimit() != 0) {
                throw androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.truncatedMessage();
            }
            popLimit(pushLimit);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public <T extends androidx.datastore.preferences.protobuf.MessageLite> T readMessage(final androidx.datastore.preferences.protobuf.Parser<T> parser, final androidx.datastore.preferences.protobuf.ExtensionRegistryLite extensionRegistry) throws java.io.IOException {
            int readRawVarint32 = readRawVarint32();
            checkRecursionLimit();
            int pushLimit = pushLimit(readRawVarint32);
            this.recursionDepth++;
            T parsePartialFrom = parser.parsePartialFrom(this, extensionRegistry);
            checkLastTagWas(0);
            this.recursionDepth--;
            if (getBytesUntilLimit() != 0) {
                throw androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.truncatedMessage();
            }
            popLimit(pushLimit);
            return parsePartialFrom;
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public androidx.datastore.preferences.protobuf.ByteString readBytes() throws java.io.IOException {
            int readRawVarint32 = readRawVarint32();
            int i = this.bufferSize;
            int i2 = this.pos;
            if (readRawVarint32 <= i - i2 && readRawVarint32 > 0) {
                androidx.datastore.preferences.protobuf.ByteString copyFrom = androidx.datastore.preferences.protobuf.ByteString.copyFrom(this.buffer, i2, readRawVarint32);
                this.pos += readRawVarint32;
                return copyFrom;
            }
            if (readRawVarint32 == 0) {
                return androidx.datastore.preferences.protobuf.ByteString.EMPTY;
            }
            if (readRawVarint32 < 0) {
                throw androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.negativeSize();
            }
            return readBytesSlowPath(readRawVarint32);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public byte[] readByteArray() throws java.io.IOException {
            int readRawVarint32 = readRawVarint32();
            int i = this.bufferSize;
            int i2 = this.pos;
            if (readRawVarint32 > i - i2 || readRawVarint32 <= 0) {
                if (readRawVarint32 < 0) {
                    throw androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.negativeSize();
                }
                return readRawBytesSlowPath(readRawVarint32, false);
            }
            byte[] copyOfRange = java.util.Arrays.copyOfRange(this.buffer, i2, i2 + readRawVarint32);
            this.pos += readRawVarint32;
            return copyOfRange;
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public java.nio.ByteBuffer readByteBuffer() throws java.io.IOException {
            int readRawVarint32 = readRawVarint32();
            int i = this.bufferSize;
            int i2 = this.pos;
            if (readRawVarint32 <= i - i2 && readRawVarint32 > 0) {
                java.nio.ByteBuffer wrap = java.nio.ByteBuffer.wrap(java.util.Arrays.copyOfRange(this.buffer, i2, i2 + readRawVarint32));
                this.pos += readRawVarint32;
                return wrap;
            }
            if (readRawVarint32 == 0) {
                return androidx.datastore.preferences.protobuf.Internal.EMPTY_BYTE_BUFFER;
            }
            if (readRawVarint32 < 0) {
                throw androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.negativeSize();
            }
            return java.nio.ByteBuffer.wrap(readRawBytesSlowPath(readRawVarint32, true));
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public int readUInt32() throws java.io.IOException {
            return readRawVarint32();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public int readEnum() throws java.io.IOException {
            return readRawVarint32();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public int readSFixed32() throws java.io.IOException {
            return readRawLittleEndian32();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public long readSFixed64() throws java.io.IOException {
            return readRawLittleEndian64();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public int readSInt32() throws java.io.IOException {
            return decodeZigZag32(readRawVarint32());
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public long readSInt64() throws java.io.IOException {
            return decodeZigZag64(readRawVarint64());
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public int readRawVarint32() throws java.io.IOException {
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
                        i = i6 ^ (-128);
                    } else {
                        int i7 = i2 + 3;
                        int i8 = (bArr[i5] << com.google.common.base.Ascii.SO) ^ i6;
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
                                                    int i12 = i2 + 10;
                                                    if (bArr[i7] >= 0) {
                                                        i5 = i12;
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
            throw androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.malformedVarint();
        }

        private void skipRawVarintSlowPath() throws java.io.IOException {
            for (int i = 0; i < 10; i++) {
                if (readRawByte() >= 0) {
                    return;
                }
            }
            throw androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.malformedVarint();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public long readRawVarint64() throws java.io.IOException {
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
                        j = i5 ^ (-128);
                    } else {
                        int i6 = i + 3;
                        int i7 = (bArr[i4] << com.google.common.base.Ascii.SO) ^ i5;
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
                                                    int i11 = i + 10;
                                                    if (bArr[i4] >= 0) {
                                                        i4 = i11;
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

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        long readRawVarint64SlowPath() throws java.io.IOException {
            long j = 0;
            for (int i = 0; i < 64; i += 7) {
                j |= (r3 & Byte.MAX_VALUE) << i;
                if ((readRawByte() & 128) == 0) {
                    return j;
                }
            }
            throw androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.malformedVarint();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public int readRawLittleEndian32() throws java.io.IOException {
            int i = this.pos;
            if (this.bufferSize - i < 4) {
                refillBuffer(4);
                i = this.pos;
            }
            byte[] bArr = this.buffer;
            this.pos = i + 4;
            return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public long readRawLittleEndian64() throws java.io.IOException {
            int i = this.pos;
            if (this.bufferSize - i < 8) {
                refillBuffer(8);
                i = this.pos;
            }
            byte[] bArr = this.buffer;
            this.pos = i + 8;
            return ((bArr[i + 7] & 255) << 56) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24) | ((bArr[i + 4] & 255) << 32) | ((bArr[i + 5] & 255) << 40) | ((bArr[i + 6] & 255) << 48);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public void resetSizeCounter() {
            this.totalBytesRetired = -this.pos;
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public int pushLimit(int byteLimit) throws androidx.datastore.preferences.protobuf.InvalidProtocolBufferException {
            if (byteLimit < 0) {
                throw androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.negativeSize();
            }
            int i = byteLimit + this.totalBytesRetired + this.pos;
            if (i < 0) {
                throw androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.parseFailure();
            }
            int i2 = this.currentLimit;
            if (i > i2) {
                throw androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.truncatedMessage();
            }
            this.currentLimit = i;
            recomputeBufferSizeAfterLimit();
            return i2;
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

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public void popLimit(final int oldLimit) {
            this.currentLimit = oldLimit;
            recomputeBufferSizeAfterLimit();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public int getBytesUntilLimit() {
            int i = this.currentLimit;
            if (i == Integer.MAX_VALUE) {
                return -1;
            }
            return i - (this.totalBytesRetired + this.pos);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public boolean isAtEnd() throws java.io.IOException {
            return this.pos == this.bufferSize && !tryRefillBuffer(1);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public int getTotalBytesRead() {
            return this.totalBytesRetired + this.pos;
        }

        private void refillBuffer(int n) throws java.io.IOException {
            if (tryRefillBuffer(n)) {
                return;
            }
            if (n > (this.sizeLimit - this.totalBytesRetired) - this.pos) {
                throw androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.sizeLimitExceeded();
            }
            throw androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.truncatedMessage();
        }

        private boolean tryRefillBuffer(int n) throws java.io.IOException {
            if (this.pos + n <= this.bufferSize) {
                throw new java.lang.IllegalStateException("refillBuffer() called when " + n + " bytes were already available in buffer");
            }
            int i = this.sizeLimit;
            int i2 = this.totalBytesRetired;
            int i3 = this.pos;
            if (n > (i - i2) - i3 || i2 + i3 + n > this.currentLimit) {
                return false;
            }
            androidx.datastore.preferences.protobuf.CodedInputStream.StreamDecoder.RefillCallback refillCallback = this.refillCallback;
            if (refillCallback != null) {
                refillCallback.onRefill();
            }
            int i4 = this.pos;
            if (i4 > 0) {
                int i5 = this.bufferSize;
                if (i5 > i4) {
                    byte[] bArr = this.buffer;
                    java.lang.System.arraycopy(bArr, i4, bArr, 0, i5 - i4);
                }
                this.totalBytesRetired += i4;
                this.bufferSize -= i4;
                this.pos = 0;
            }
            java.io.InputStream inputStream = this.input;
            byte[] bArr2 = this.buffer;
            int i6 = this.bufferSize;
            int read = read(inputStream, bArr2, i6, java.lang.Math.min(bArr2.length - i6, (this.sizeLimit - this.totalBytesRetired) - this.bufferSize));
            if (read == 0 || read < -1 || read > this.buffer.length) {
                throw new java.lang.IllegalStateException(this.input.getClass() + "#read(byte[]) returned invalid result: " + read + "\nThe InputStream implementation is buggy.");
            }
            if (read <= 0) {
                return false;
            }
            this.bufferSize += read;
            recomputeBufferSizeAfterLimit();
            if (this.bufferSize >= n) {
                return true;
            }
            return tryRefillBuffer(n);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public byte readRawByte() throws java.io.IOException {
            if (this.pos == this.bufferSize) {
                refillBuffer(1);
            }
            byte[] bArr = this.buffer;
            int i = this.pos;
            this.pos = i + 1;
            return bArr[i];
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public byte[] readRawBytes(final int size) throws java.io.IOException {
            int i = this.pos;
            if (size <= this.bufferSize - i && size > 0) {
                int i2 = size + i;
                this.pos = i2;
                return java.util.Arrays.copyOfRange(this.buffer, i, i2);
            }
            return readRawBytesSlowPath(size, false);
        }

        private byte[] readRawBytesSlowPath(final int size, boolean ensureNoLeakedReferences) throws java.io.IOException {
            byte[] readRawBytesSlowPathOneChunk = readRawBytesSlowPathOneChunk(size);
            if (readRawBytesSlowPathOneChunk != null) {
                return ensureNoLeakedReferences ? (byte[]) readRawBytesSlowPathOneChunk.clone() : readRawBytesSlowPathOneChunk;
            }
            int i = this.pos;
            int i2 = this.bufferSize;
            int i3 = i2 - i;
            this.totalBytesRetired += i2;
            this.pos = 0;
            this.bufferSize = 0;
            java.util.List<byte[]> readRawBytesSlowPathRemainingChunks = readRawBytesSlowPathRemainingChunks(size - i3);
            byte[] bArr = new byte[size];
            java.lang.System.arraycopy(this.buffer, i, bArr, 0, i3);
            for (byte[] bArr2 : readRawBytesSlowPathRemainingChunks) {
                java.lang.System.arraycopy(bArr2, 0, bArr, i3, bArr2.length);
                i3 += bArr2.length;
            }
            return bArr;
        }

        private byte[] readRawBytesSlowPathOneChunk(final int size) throws java.io.IOException {
            if (size == 0) {
                return androidx.datastore.preferences.protobuf.Internal.EMPTY_BYTE_ARRAY;
            }
            if (size < 0) {
                throw androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.negativeSize();
            }
            int i = this.totalBytesRetired + this.pos + size;
            if (i - this.sizeLimit > 0) {
                throw androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.sizeLimitExceeded();
            }
            int i2 = this.currentLimit;
            if (i > i2) {
                skipRawBytes((i2 - this.totalBytesRetired) - this.pos);
                throw androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.truncatedMessage();
            }
            int i3 = this.bufferSize - this.pos;
            int i4 = size - i3;
            if (i4 >= 4096 && i4 > available(this.input)) {
                return null;
            }
            byte[] bArr = new byte[size];
            java.lang.System.arraycopy(this.buffer, this.pos, bArr, 0, i3);
            this.totalBytesRetired += this.bufferSize;
            this.pos = 0;
            this.bufferSize = 0;
            while (i3 < size) {
                int read = read(this.input, bArr, i3, size - i3);
                if (read == -1) {
                    throw androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.truncatedMessage();
                }
                this.totalBytesRetired += read;
                i3 += read;
            }
            return bArr;
        }

        private java.util.List<byte[]> readRawBytesSlowPathRemainingChunks(int sizeLeft) throws java.io.IOException {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            while (sizeLeft > 0) {
                int min = java.lang.Math.min(sizeLeft, 4096);
                byte[] bArr = new byte[min];
                int i = 0;
                while (i < min) {
                    int read = this.input.read(bArr, i, min - i);
                    if (read == -1) {
                        throw androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.truncatedMessage();
                    }
                    this.totalBytesRetired += read;
                    i += read;
                }
                sizeLeft -= min;
                arrayList.add(bArr);
            }
            return arrayList;
        }

        private androidx.datastore.preferences.protobuf.ByteString readBytesSlowPath(final int size) throws java.io.IOException {
            byte[] readRawBytesSlowPathOneChunk = readRawBytesSlowPathOneChunk(size);
            if (readRawBytesSlowPathOneChunk != null) {
                return androidx.datastore.preferences.protobuf.ByteString.copyFrom(readRawBytesSlowPathOneChunk);
            }
            int i = this.pos;
            int i2 = this.bufferSize;
            int i3 = i2 - i;
            this.totalBytesRetired += i2;
            this.pos = 0;
            this.bufferSize = 0;
            java.util.List<byte[]> readRawBytesSlowPathRemainingChunks = readRawBytesSlowPathRemainingChunks(size - i3);
            byte[] bArr = new byte[size];
            java.lang.System.arraycopy(this.buffer, i, bArr, 0, i3);
            for (byte[] bArr2 : readRawBytesSlowPathRemainingChunks) {
                java.lang.System.arraycopy(bArr2, 0, bArr, i3, bArr2.length);
                i3 += bArr2.length;
            }
            return androidx.datastore.preferences.protobuf.ByteString.wrap(bArr);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public void skipRawBytes(final int size) throws java.io.IOException {
            int i = this.bufferSize;
            int i2 = this.pos;
            if (size <= i - i2 && size >= 0) {
                this.pos = i2 + size;
            } else {
                skipRawBytesSlowPath(size);
            }
        }

        private void skipRawBytesSlowPath(final int size) throws java.io.IOException {
            if (size < 0) {
                throw androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.negativeSize();
            }
            int i = this.totalBytesRetired;
            int i2 = this.pos;
            int i3 = i + i2 + size;
            int i4 = this.currentLimit;
            if (i3 > i4) {
                skipRawBytes((i4 - i) - i2);
                throw androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.truncatedMessage();
            }
            int i5 = 0;
            if (this.refillCallback == null) {
                this.totalBytesRetired = i + i2;
                int i6 = this.bufferSize - i2;
                this.bufferSize = 0;
                this.pos = 0;
                i5 = i6;
                while (i5 < size) {
                    try {
                        long j = size - i5;
                        long skip = skip(this.input, j);
                        if (skip < 0 || skip > j) {
                            throw new java.lang.IllegalStateException(this.input.getClass() + "#skip returned invalid result: " + skip + "\nThe InputStream implementation is buggy.");
                        }
                        if (skip == 0) {
                            break;
                        } else {
                            i5 += (int) skip;
                        }
                    } finally {
                        this.totalBytesRetired += i5;
                        recomputeBufferSizeAfterLimit();
                    }
                }
            }
            if (i5 >= size) {
                return;
            }
            int i7 = this.bufferSize;
            int i8 = i7 - this.pos;
            this.pos = i7;
            refillBuffer(1);
            while (true) {
                int i9 = size - i8;
                int i10 = this.bufferSize;
                if (i9 > i10) {
                    i8 += i10;
                    this.pos = i10;
                    refillBuffer(1);
                } else {
                    this.pos = i9;
                    return;
                }
            }
        }
    }

    private static final class IterableDirectByteBufferDecoder extends androidx.datastore.preferences.protobuf.CodedInputStream {
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

        private IterableDirectByteBufferDecoder(java.lang.Iterable<java.nio.ByteBuffer> inputBufs, int size, boolean immutableFlag) {
            super();
            this.currentLimit = Integer.MAX_VALUE;
            this.totalBufferSize = size;
            this.input = inputBufs;
            this.iterator = inputBufs.iterator();
            this.immutable = immutableFlag;
            this.totalBytesRead = 0;
            this.startOffset = 0;
            if (size == 0) {
                this.currentByteBuffer = androidx.datastore.preferences.protobuf.Internal.EMPTY_BYTE_BUFFER;
                this.currentByteBufferPos = 0L;
                this.currentByteBufferStartPos = 0L;
                this.currentByteBufferLimit = 0L;
                this.currentAddress = 0L;
                return;
            }
            tryGetNextByteBuffer();
        }

        private void getNextByteBuffer() throws androidx.datastore.preferences.protobuf.InvalidProtocolBufferException {
            if (!this.iterator.hasNext()) {
                throw androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.truncatedMessage();
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
            long addressOffset = androidx.datastore.preferences.protobuf.UnsafeUtil.addressOffset(this.currentByteBuffer);
            this.currentAddress = addressOffset;
            this.currentByteBufferPos += addressOffset;
            this.currentByteBufferStartPos += addressOffset;
            this.currentByteBufferLimit += addressOffset;
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public int readTag() throws java.io.IOException {
            if (isAtEnd()) {
                this.lastTag = 0;
                return 0;
            }
            int readRawVarint32 = readRawVarint32();
            this.lastTag = readRawVarint32;
            if (androidx.datastore.preferences.protobuf.WireFormat.getTagFieldNumber(readRawVarint32) == 0) {
                throw androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.invalidTag();
            }
            return this.lastTag;
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public void checkLastTagWas(final int value) throws androidx.datastore.preferences.protobuf.InvalidProtocolBufferException {
            if (this.lastTag != value) {
                throw androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.invalidEndTag();
            }
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public int getLastTag() {
            return this.lastTag;
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public boolean skipField(final int tag) throws java.io.IOException {
            int tagWireType = androidx.datastore.preferences.protobuf.WireFormat.getTagWireType(tag);
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
                checkLastTagWas(androidx.datastore.preferences.protobuf.WireFormat.makeTag(androidx.datastore.preferences.protobuf.WireFormat.getTagFieldNumber(tag), 4));
                return true;
            }
            if (tagWireType == 4) {
                return false;
            }
            if (tagWireType == 5) {
                skipRawBytes(4);
                return true;
            }
            throw androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.invalidWireType();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public boolean skipField(final int tag, final androidx.datastore.preferences.protobuf.CodedOutputStream output) throws java.io.IOException {
            int tagWireType = androidx.datastore.preferences.protobuf.WireFormat.getTagWireType(tag);
            if (tagWireType == 0) {
                long readInt64 = readInt64();
                output.writeUInt32NoTag(tag);
                output.writeUInt64NoTag(readInt64);
                return true;
            }
            if (tagWireType == 1) {
                long readRawLittleEndian64 = readRawLittleEndian64();
                output.writeUInt32NoTag(tag);
                output.writeFixed64NoTag(readRawLittleEndian64);
                return true;
            }
            if (tagWireType == 2) {
                androidx.datastore.preferences.protobuf.ByteString readBytes = readBytes();
                output.writeUInt32NoTag(tag);
                output.writeBytesNoTag(readBytes);
                return true;
            }
            if (tagWireType == 3) {
                output.writeUInt32NoTag(tag);
                skipMessage(output);
                int makeTag = androidx.datastore.preferences.protobuf.WireFormat.makeTag(androidx.datastore.preferences.protobuf.WireFormat.getTagFieldNumber(tag), 4);
                checkLastTagWas(makeTag);
                output.writeUInt32NoTag(makeTag);
                return true;
            }
            if (tagWireType == 4) {
                return false;
            }
            if (tagWireType == 5) {
                int readRawLittleEndian32 = readRawLittleEndian32();
                output.writeUInt32NoTag(tag);
                output.writeFixed32NoTag(readRawLittleEndian32);
                return true;
            }
            throw androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.invalidWireType();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public double readDouble() throws java.io.IOException {
            return java.lang.Double.longBitsToDouble(readRawLittleEndian64());
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public float readFloat() throws java.io.IOException {
            return java.lang.Float.intBitsToFloat(readRawLittleEndian32());
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public long readUInt64() throws java.io.IOException {
            return readRawVarint64();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public long readInt64() throws java.io.IOException {
            return readRawVarint64();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public int readInt32() throws java.io.IOException {
            return readRawVarint32();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public long readFixed64() throws java.io.IOException {
            return readRawLittleEndian64();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public int readFixed32() throws java.io.IOException {
            return readRawLittleEndian32();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public boolean readBool() throws java.io.IOException {
            return readRawVarint64() != 0;
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public java.lang.String readString() throws java.io.IOException {
            int readRawVarint32 = readRawVarint32();
            if (readRawVarint32 > 0) {
                long j = readRawVarint32;
                long j2 = this.currentByteBufferLimit;
                long j3 = this.currentByteBufferPos;
                if (j <= j2 - j3) {
                    byte[] bArr = new byte[readRawVarint32];
                    androidx.datastore.preferences.protobuf.UnsafeUtil.copyMemory(j3, bArr, 0L, j);
                    java.lang.String str = new java.lang.String(bArr, androidx.datastore.preferences.protobuf.Internal.UTF_8);
                    this.currentByteBufferPos += j;
                    return str;
                }
            }
            if (readRawVarint32 > 0 && readRawVarint32 <= remaining()) {
                byte[] bArr2 = new byte[readRawVarint32];
                readRawBytesTo(bArr2, 0, readRawVarint32);
                return new java.lang.String(bArr2, androidx.datastore.preferences.protobuf.Internal.UTF_8);
            }
            if (readRawVarint32 == 0) {
                return "";
            }
            if (readRawVarint32 < 0) {
                throw androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.negativeSize();
            }
            throw androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.truncatedMessage();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public java.lang.String readStringRequireUtf8() throws java.io.IOException {
            int readRawVarint32 = readRawVarint32();
            if (readRawVarint32 > 0) {
                long j = readRawVarint32;
                long j2 = this.currentByteBufferLimit;
                long j3 = this.currentByteBufferPos;
                if (j <= j2 - j3) {
                    java.lang.String decodeUtf8 = androidx.datastore.preferences.protobuf.Utf8.decodeUtf8(this.currentByteBuffer, (int) (j3 - this.currentByteBufferStartPos), readRawVarint32);
                    this.currentByteBufferPos += j;
                    return decodeUtf8;
                }
            }
            if (readRawVarint32 >= 0 && readRawVarint32 <= remaining()) {
                byte[] bArr = new byte[readRawVarint32];
                readRawBytesTo(bArr, 0, readRawVarint32);
                return androidx.datastore.preferences.protobuf.Utf8.decodeUtf8(bArr, 0, readRawVarint32);
            }
            if (readRawVarint32 == 0) {
                return "";
            }
            if (readRawVarint32 <= 0) {
                throw androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.negativeSize();
            }
            throw androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.truncatedMessage();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public void readGroup(final int fieldNumber, final androidx.datastore.preferences.protobuf.MessageLite.Builder builder, final androidx.datastore.preferences.protobuf.ExtensionRegistryLite extensionRegistry) throws java.io.IOException {
            checkRecursionLimit();
            this.recursionDepth++;
            builder.mergeFrom(this, extensionRegistry);
            checkLastTagWas(androidx.datastore.preferences.protobuf.WireFormat.makeTag(fieldNumber, 4));
            this.recursionDepth--;
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public <T extends androidx.datastore.preferences.protobuf.MessageLite> T readGroup(final int fieldNumber, final androidx.datastore.preferences.protobuf.Parser<T> parser, final androidx.datastore.preferences.protobuf.ExtensionRegistryLite extensionRegistry) throws java.io.IOException {
            checkRecursionLimit();
            this.recursionDepth++;
            T parsePartialFrom = parser.parsePartialFrom(this, extensionRegistry);
            checkLastTagWas(androidx.datastore.preferences.protobuf.WireFormat.makeTag(fieldNumber, 4));
            this.recursionDepth--;
            return parsePartialFrom;
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        @java.lang.Deprecated
        public void readUnknownGroup(final int fieldNumber, final androidx.datastore.preferences.protobuf.MessageLite.Builder builder) throws java.io.IOException {
            readGroup(fieldNumber, builder, androidx.datastore.preferences.protobuf.ExtensionRegistryLite.getEmptyRegistry());
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public void readMessage(final androidx.datastore.preferences.protobuf.MessageLite.Builder builder, final androidx.datastore.preferences.protobuf.ExtensionRegistryLite extensionRegistry) throws java.io.IOException {
            int readRawVarint32 = readRawVarint32();
            checkRecursionLimit();
            int pushLimit = pushLimit(readRawVarint32);
            this.recursionDepth++;
            builder.mergeFrom(this, extensionRegistry);
            checkLastTagWas(0);
            this.recursionDepth--;
            if (getBytesUntilLimit() != 0) {
                throw androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.truncatedMessage();
            }
            popLimit(pushLimit);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public <T extends androidx.datastore.preferences.protobuf.MessageLite> T readMessage(final androidx.datastore.preferences.protobuf.Parser<T> parser, final androidx.datastore.preferences.protobuf.ExtensionRegistryLite extensionRegistry) throws java.io.IOException {
            int readRawVarint32 = readRawVarint32();
            checkRecursionLimit();
            int pushLimit = pushLimit(readRawVarint32);
            this.recursionDepth++;
            T parsePartialFrom = parser.parsePartialFrom(this, extensionRegistry);
            checkLastTagWas(0);
            this.recursionDepth--;
            if (getBytesUntilLimit() != 0) {
                throw androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.truncatedMessage();
            }
            popLimit(pushLimit);
            return parsePartialFrom;
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public androidx.datastore.preferences.protobuf.ByteString readBytes() throws java.io.IOException {
            int readRawVarint32 = readRawVarint32();
            if (readRawVarint32 > 0) {
                long j = readRawVarint32;
                long j2 = this.currentByteBufferLimit;
                long j3 = this.currentByteBufferPos;
                if (j <= j2 - j3) {
                    if (this.immutable && this.enableAliasing) {
                        int i = (int) (j3 - this.currentAddress);
                        androidx.datastore.preferences.protobuf.ByteString wrap = androidx.datastore.preferences.protobuf.ByteString.wrap(slice(i, readRawVarint32 + i));
                        this.currentByteBufferPos += j;
                        return wrap;
                    }
                    byte[] bArr = new byte[readRawVarint32];
                    androidx.datastore.preferences.protobuf.UnsafeUtil.copyMemory(j3, bArr, 0L, j);
                    this.currentByteBufferPos += j;
                    return androidx.datastore.preferences.protobuf.ByteString.wrap(bArr);
                }
            }
            if (readRawVarint32 <= 0 || readRawVarint32 > remaining()) {
                if (readRawVarint32 == 0) {
                    return androidx.datastore.preferences.protobuf.ByteString.EMPTY;
                }
                if (readRawVarint32 < 0) {
                    throw androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.negativeSize();
                }
                throw androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.truncatedMessage();
            }
            if (this.immutable && this.enableAliasing) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                while (readRawVarint32 > 0) {
                    if (currentRemaining() == 0) {
                        getNextByteBuffer();
                    }
                    int min = java.lang.Math.min(readRawVarint32, (int) currentRemaining());
                    int i2 = (int) (this.currentByteBufferPos - this.currentAddress);
                    arrayList.add(androidx.datastore.preferences.protobuf.ByteString.wrap(slice(i2, i2 + min)));
                    readRawVarint32 -= min;
                    this.currentByteBufferPos += min;
                }
                return androidx.datastore.preferences.protobuf.ByteString.copyFrom(arrayList);
            }
            byte[] bArr2 = new byte[readRawVarint32];
            readRawBytesTo(bArr2, 0, readRawVarint32);
            return androidx.datastore.preferences.protobuf.ByteString.wrap(bArr2);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public byte[] readByteArray() throws java.io.IOException {
            return readRawBytes(readRawVarint32());
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public java.nio.ByteBuffer readByteBuffer() throws java.io.IOException {
            int readRawVarint32 = readRawVarint32();
            if (readRawVarint32 > 0) {
                long j = readRawVarint32;
                if (j <= currentRemaining()) {
                    if (!this.immutable && this.enableAliasing) {
                        long j2 = this.currentByteBufferPos + j;
                        this.currentByteBufferPos = j2;
                        long j3 = this.currentAddress;
                        return slice((int) ((j2 - j3) - j), (int) (j2 - j3));
                    }
                    byte[] bArr = new byte[readRawVarint32];
                    androidx.datastore.preferences.protobuf.UnsafeUtil.copyMemory(this.currentByteBufferPos, bArr, 0L, j);
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
                return androidx.datastore.preferences.protobuf.Internal.EMPTY_BYTE_BUFFER;
            }
            if (readRawVarint32 < 0) {
                throw androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.negativeSize();
            }
            throw androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.truncatedMessage();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public int readUInt32() throws java.io.IOException {
            return readRawVarint32();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public int readEnum() throws java.io.IOException {
            return readRawVarint32();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public int readSFixed32() throws java.io.IOException {
            return readRawLittleEndian32();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public long readSFixed64() throws java.io.IOException {
            return readRawLittleEndian64();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public int readSInt32() throws java.io.IOException {
            return decodeZigZag32(readRawVarint32());
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public long readSInt64() throws java.io.IOException {
            return decodeZigZag64(readRawVarint64());
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public int readRawVarint32() throws java.io.IOException {
            int i;
            long j = this.currentByteBufferPos;
            if (this.currentByteBufferLimit != j) {
                long j2 = j + 1;
                byte b = androidx.datastore.preferences.protobuf.UnsafeUtil.getByte(j);
                if (b >= 0) {
                    this.currentByteBufferPos++;
                    return b;
                }
                if (this.currentByteBufferLimit - this.currentByteBufferPos >= 10) {
                    long j3 = 2 + j;
                    int i2 = (androidx.datastore.preferences.protobuf.UnsafeUtil.getByte(j2) << 7) ^ b;
                    if (i2 < 0) {
                        i = i2 ^ (-128);
                    } else {
                        long j4 = 3 + j;
                        int i3 = (androidx.datastore.preferences.protobuf.UnsafeUtil.getByte(j3) << com.google.common.base.Ascii.SO) ^ i2;
                        if (i3 >= 0) {
                            i = i3 ^ 16256;
                        } else {
                            long j5 = 4 + j;
                            int i4 = i3 ^ (androidx.datastore.preferences.protobuf.UnsafeUtil.getByte(j4) << com.google.common.base.Ascii.NAK);
                            if (i4 < 0) {
                                i = (-2080896) ^ i4;
                            } else {
                                j4 = 5 + j;
                                byte b2 = androidx.datastore.preferences.protobuf.UnsafeUtil.getByte(j5);
                                int i5 = (i4 ^ (b2 << com.google.common.base.Ascii.FS)) ^ 266354560;
                                if (b2 < 0) {
                                    j5 = 6 + j;
                                    if (androidx.datastore.preferences.protobuf.UnsafeUtil.getByte(j4) < 0) {
                                        j4 = 7 + j;
                                        if (androidx.datastore.preferences.protobuf.UnsafeUtil.getByte(j5) < 0) {
                                            j5 = 8 + j;
                                            if (androidx.datastore.preferences.protobuf.UnsafeUtil.getByte(j4) < 0) {
                                                j4 = 9 + j;
                                                if (androidx.datastore.preferences.protobuf.UnsafeUtil.getByte(j5) < 0) {
                                                    long j6 = j + 10;
                                                    if (androidx.datastore.preferences.protobuf.UnsafeUtil.getByte(j4) >= 0) {
                                                        i = i5;
                                                        j3 = j6;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    i = i5;
                                }
                                i = i5;
                            }
                            j3 = j5;
                        }
                        j3 = j4;
                    }
                    this.currentByteBufferPos = j3;
                    return i;
                }
            }
            return (int) readRawVarint64SlowPath();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public long readRawVarint64() throws java.io.IOException {
            long j;
            long j2;
            long j3;
            long j4 = this.currentByteBufferPos;
            if (this.currentByteBufferLimit != j4) {
                long j5 = j4 + 1;
                byte b = androidx.datastore.preferences.protobuf.UnsafeUtil.getByte(j4);
                if (b >= 0) {
                    this.currentByteBufferPos++;
                    return b;
                }
                if (this.currentByteBufferLimit - this.currentByteBufferPos >= 10) {
                    long j6 = 2 + j4;
                    int i = (androidx.datastore.preferences.protobuf.UnsafeUtil.getByte(j5) << 7) ^ b;
                    if (i < 0) {
                        j = i ^ (-128);
                    } else {
                        long j7 = 3 + j4;
                        int i2 = (androidx.datastore.preferences.protobuf.UnsafeUtil.getByte(j6) << com.google.common.base.Ascii.SO) ^ i;
                        if (i2 >= 0) {
                            j = i2 ^ 16256;
                            j6 = j7;
                        } else {
                            long j8 = 4 + j4;
                            int i3 = i2 ^ (androidx.datastore.preferences.protobuf.UnsafeUtil.getByte(j7) << com.google.common.base.Ascii.NAK);
                            if (i3 < 0) {
                                j = (-2080896) ^ i3;
                                j6 = j8;
                            } else {
                                long j9 = 5 + j4;
                                long j10 = (androidx.datastore.preferences.protobuf.UnsafeUtil.getByte(j8) << 28) ^ i3;
                                if (j10 >= 0) {
                                    j3 = 266354560;
                                } else {
                                    long j11 = 6 + j4;
                                    long j12 = j10 ^ (androidx.datastore.preferences.protobuf.UnsafeUtil.getByte(j9) << 35);
                                    if (j12 < 0) {
                                        j2 = -34093383808L;
                                    } else {
                                        j9 = 7 + j4;
                                        j10 = j12 ^ (androidx.datastore.preferences.protobuf.UnsafeUtil.getByte(j11) << 42);
                                        if (j10 >= 0) {
                                            j3 = 4363953127296L;
                                        } else {
                                            j11 = 8 + j4;
                                            j12 = j10 ^ (androidx.datastore.preferences.protobuf.UnsafeUtil.getByte(j9) << 49);
                                            if (j12 < 0) {
                                                j2 = -558586000294016L;
                                            } else {
                                                j9 = 9 + j4;
                                                long j13 = (j12 ^ (androidx.datastore.preferences.protobuf.UnsafeUtil.getByte(j11) << 56)) ^ 71499008037633920L;
                                                if (j13 < 0) {
                                                    long j14 = j4 + 10;
                                                    if (androidx.datastore.preferences.protobuf.UnsafeUtil.getByte(j9) >= 0) {
                                                        j = j13;
                                                        j6 = j14;
                                                    }
                                                } else {
                                                    j = j13;
                                                    j6 = j9;
                                                }
                                            }
                                        }
                                    }
                                    j = j2 ^ j12;
                                    j6 = j11;
                                }
                                j = j3 ^ j10;
                                j6 = j9;
                            }
                        }
                    }
                    this.currentByteBufferPos = j6;
                    return j;
                }
            }
            return readRawVarint64SlowPath();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        long readRawVarint64SlowPath() throws java.io.IOException {
            long j = 0;
            for (int i = 0; i < 64; i += 7) {
                j |= (r3 & Byte.MAX_VALUE) << i;
                if ((readRawByte() & 128) == 0) {
                    return j;
                }
            }
            throw androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.malformedVarint();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public int readRawLittleEndian32() throws java.io.IOException {
            if (currentRemaining() >= 4) {
                long j = this.currentByteBufferPos;
                this.currentByteBufferPos = 4 + j;
                return ((androidx.datastore.preferences.protobuf.UnsafeUtil.getByte(j + 3) & 255) << 24) | (androidx.datastore.preferences.protobuf.UnsafeUtil.getByte(j) & 255) | ((androidx.datastore.preferences.protobuf.UnsafeUtil.getByte(1 + j) & 255) << 8) | ((androidx.datastore.preferences.protobuf.UnsafeUtil.getByte(2 + j) & 255) << 16);
            }
            return (readRawByte() & 255) | ((readRawByte() & 255) << 8) | ((readRawByte() & 255) << 16) | ((readRawByte() & 255) << 24);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public long readRawLittleEndian64() throws java.io.IOException {
            if (currentRemaining() >= 8) {
                this.currentByteBufferPos = 8 + this.currentByteBufferPos;
                return ((androidx.datastore.preferences.protobuf.UnsafeUtil.getByte(r0 + 7) & 255) << 56) | ((androidx.datastore.preferences.protobuf.UnsafeUtil.getByte(2 + r0) & 255) << 16) | (androidx.datastore.preferences.protobuf.UnsafeUtil.getByte(r0) & 255) | ((androidx.datastore.preferences.protobuf.UnsafeUtil.getByte(1 + r0) & 255) << 8) | ((androidx.datastore.preferences.protobuf.UnsafeUtil.getByte(3 + r0) & 255) << 24) | ((androidx.datastore.preferences.protobuf.UnsafeUtil.getByte(4 + r0) & 255) << 32) | ((androidx.datastore.preferences.protobuf.UnsafeUtil.getByte(5 + r0) & 255) << 40) | ((androidx.datastore.preferences.protobuf.UnsafeUtil.getByte(6 + r0) & 255) << 48);
            }
            return (readRawByte() & 255) | ((readRawByte() & 255) << 8) | ((readRawByte() & 255) << 16) | ((readRawByte() & 255) << 24) | ((readRawByte() & 255) << 32) | ((readRawByte() & 255) << 40) | ((readRawByte() & 255) << 48) | ((readRawByte() & 255) << 56);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public void enableAliasing(boolean enabled) {
            this.enableAliasing = enabled;
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public void resetSizeCounter() {
            this.startOffset = (int) ((this.totalBytesRead + this.currentByteBufferPos) - this.currentByteBufferStartPos);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public int pushLimit(int byteLimit) throws androidx.datastore.preferences.protobuf.InvalidProtocolBufferException {
            if (byteLimit < 0) {
                throw androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.negativeSize();
            }
            int totalBytesRead = byteLimit + getTotalBytesRead();
            int i = this.currentLimit;
            if (totalBytesRead > i) {
                throw androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.truncatedMessage();
            }
            this.currentLimit = totalBytesRead;
            recomputeBufferSizeAfterLimit();
            return i;
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

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public void popLimit(final int oldLimit) {
            this.currentLimit = oldLimit;
            recomputeBufferSizeAfterLimit();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public int getBytesUntilLimit() {
            int i = this.currentLimit;
            if (i == Integer.MAX_VALUE) {
                return -1;
            }
            return i - getTotalBytesRead();
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public boolean isAtEnd() throws java.io.IOException {
            return (((long) this.totalBytesRead) + this.currentByteBufferPos) - this.currentByteBufferStartPos == ((long) this.totalBufferSize);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public int getTotalBytesRead() {
            return (int) (((this.totalBytesRead - this.startOffset) + this.currentByteBufferPos) - this.currentByteBufferStartPos);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public byte readRawByte() throws java.io.IOException {
            if (currentRemaining() == 0) {
                getNextByteBuffer();
            }
            long j = this.currentByteBufferPos;
            this.currentByteBufferPos = 1 + j;
            return androidx.datastore.preferences.protobuf.UnsafeUtil.getByte(j);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public byte[] readRawBytes(final int length) throws java.io.IOException {
            if (length >= 0) {
                long j = length;
                if (j <= currentRemaining()) {
                    byte[] bArr = new byte[length];
                    androidx.datastore.preferences.protobuf.UnsafeUtil.copyMemory(this.currentByteBufferPos, bArr, 0L, j);
                    this.currentByteBufferPos += j;
                    return bArr;
                }
            }
            if (length >= 0 && length <= remaining()) {
                byte[] bArr2 = new byte[length];
                readRawBytesTo(bArr2, 0, length);
                return bArr2;
            }
            if (length > 0) {
                throw androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.truncatedMessage();
            }
            if (length == 0) {
                return androidx.datastore.preferences.protobuf.Internal.EMPTY_BYTE_ARRAY;
            }
            throw androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.negativeSize();
        }

        private void readRawBytesTo(byte[] bytes, int offset, final int length) throws java.io.IOException {
            if (length < 0 || length > remaining()) {
                if (length > 0) {
                    throw androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.truncatedMessage();
                }
                if (length != 0) {
                    throw androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.negativeSize();
                }
                return;
            }
            int i = length;
            while (i > 0) {
                if (currentRemaining() == 0) {
                    getNextByteBuffer();
                }
                int min = java.lang.Math.min(i, (int) currentRemaining());
                long j = min;
                androidx.datastore.preferences.protobuf.UnsafeUtil.copyMemory(this.currentByteBufferPos, bytes, (length - i) + offset, j);
                i -= min;
                this.currentByteBufferPos += j;
            }
        }

        @Override // androidx.datastore.preferences.protobuf.CodedInputStream
        public void skipRawBytes(final int length) throws java.io.IOException {
            if (length < 0 || length > ((this.totalBufferSize - this.totalBytesRead) - this.currentByteBufferPos) + this.currentByteBufferStartPos) {
                if (length < 0) {
                    throw androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.negativeSize();
                }
                throw androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.truncatedMessage();
            }
            while (length > 0) {
                if (currentRemaining() == 0) {
                    getNextByteBuffer();
                }
                int min = java.lang.Math.min(length, (int) currentRemaining());
                length -= min;
                this.currentByteBufferPos += min;
            }
        }

        private void skipRawVarint() throws java.io.IOException {
            for (int i = 0; i < 10; i++) {
                if (readRawByte() >= 0) {
                    return;
                }
            }
            throw androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.malformedVarint();
        }

        private int remaining() {
            return (int) (((this.totalBufferSize - this.totalBytesRead) - this.currentByteBufferPos) + this.currentByteBufferStartPos);
        }

        private long currentRemaining() {
            return this.currentByteBufferLimit - this.currentByteBufferPos;
        }

        private java.nio.ByteBuffer slice(int begin, int end) throws java.io.IOException {
            int position = this.currentByteBuffer.position();
            int limit = this.currentByteBuffer.limit();
            java.nio.ByteBuffer byteBuffer = this.currentByteBuffer;
            try {
                try {
                    byteBuffer.position(begin);
                    byteBuffer.limit(end);
                    return this.currentByteBuffer.slice();
                } catch (java.lang.IllegalArgumentException unused) {
                    throw androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.truncatedMessage();
                }
            } finally {
                byteBuffer.position(position);
                byteBuffer.limit(limit);
            }
        }
    }
}
