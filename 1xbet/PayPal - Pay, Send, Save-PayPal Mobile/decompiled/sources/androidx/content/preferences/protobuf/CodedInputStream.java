package androidx.content.preferences.protobuf;

/* loaded from: classes3.dex */
public abstract class CodedInputStream {
    private static volatile int getHighResolutionOutputSizeshNQ4ISI = 100;
    int Camera2StreamConfigurationMap;
    int getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    androidx.content.preferences.protobuf.CodedInputStreamReader getHighSpeedVideoSizes;
    private boolean getInputFormats;

    public static int decodeZigZag32(int i) {
        return (i >>> 1) ^ (-(i & 1));
    }

    public static long decodeZigZag64(long j) {
        return (j >>> 1) ^ (-(1 & j));
    }

    public abstract void checkLastTagWas(int i) throws androidx.content.preferences.protobuf.InvalidProtocolBufferException;

    public abstract void enableAliasing(boolean z);

    public abstract int getBytesUntilLimit();

    abstract long getHighSpeedVideoFpsRangesFor() throws java.io.IOException;

    public abstract int getLastTag();

    public abstract int getTotalBytesRead();

    public abstract boolean isAtEnd() throws java.io.IOException;

    public abstract void popLimit(int i);

    public abstract int pushLimit(int i) throws androidx.content.preferences.protobuf.InvalidProtocolBufferException;

    public abstract boolean readBool() throws java.io.IOException;

    public abstract byte[] readByteArray() throws java.io.IOException;

    public abstract java.nio.ByteBuffer readByteBuffer() throws java.io.IOException;

    public abstract androidx.content.preferences.protobuf.ByteString readBytes() throws java.io.IOException;

    public abstract double readDouble() throws java.io.IOException;

    public abstract int readEnum() throws java.io.IOException;

    public abstract int readFixed32() throws java.io.IOException;

    public abstract long readFixed64() throws java.io.IOException;

    public abstract float readFloat() throws java.io.IOException;

    public abstract <T extends androidx.content.preferences.protobuf.MessageLite> T readGroup(int i, androidx.content.preferences.protobuf.Parser<T> parser, androidx.content.preferences.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException;

    public abstract void readGroup(int i, androidx.datastore.preferences.protobuf.MessageLite.Builder builder, androidx.content.preferences.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException;

    public abstract int readInt32() throws java.io.IOException;

    public abstract long readInt64() throws java.io.IOException;

    public abstract <T extends androidx.content.preferences.protobuf.MessageLite> T readMessage(androidx.content.preferences.protobuf.Parser<T> parser, androidx.content.preferences.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException;

    public abstract void readMessage(androidx.datastore.preferences.protobuf.MessageLite.Builder builder, androidx.content.preferences.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException;

    public abstract byte readRawByte() throws java.io.IOException;

    public abstract byte[] readRawBytes(int i) throws java.io.IOException;

    public abstract int readRawLittleEndian32() throws java.io.IOException;

    public abstract long readRawLittleEndian64() throws java.io.IOException;

    public abstract int readRawVarint32() throws java.io.IOException;

    public abstract long readRawVarint64() throws java.io.IOException;

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
    public abstract void readUnknownGroup(int i, androidx.datastore.preferences.protobuf.MessageLite.Builder builder) throws java.io.IOException;

    public abstract void resetSizeCounter();

    public abstract boolean skipField(int i) throws java.io.IOException;

    @java.lang.Deprecated
    public abstract boolean skipField(int i, androidx.content.preferences.protobuf.CodedOutputStream codedOutputStream) throws java.io.IOException;

    public abstract void skipRawBytes(int i) throws java.io.IOException;

    /* synthetic */ CodedInputStream(byte b) {
        this();
    }

    public static androidx.content.preferences.protobuf.CodedInputStream newInstance(java.io.InputStream inputStream) {
        return newInstance(inputStream, 4096);
    }

    public static androidx.content.preferences.protobuf.CodedInputStream newInstance(java.io.InputStream inputStream, int i) {
        if (i <= 0) {
            throw new java.lang.IllegalArgumentException("bufferSize must be > 0");
        }
        if (inputStream == null) {
            return newInstance(androidx.content.preferences.protobuf.Internal.EMPTY_BYTE_ARRAY);
        }
        return new androidx.datastore.preferences.protobuf.CodedInputStream.StreamDecoder(inputStream, i, (byte) 0);
    }

    public static androidx.content.preferences.protobuf.CodedInputStream newInstance(java.lang.Iterable<java.nio.ByteBuffer> iterable) {
        if (!androidx.datastore.preferences.protobuf.CodedInputStream.UnsafeDirectNioDecoder.getHighResolutionOutputSizeshNQ4ISI()) {
            return newInstance(new androidx.content.preferences.protobuf.IterableByteBufferInputStream(iterable));
        }
        return getHighSpeedVideoFpsRanges(iterable, false);
    }

    static androidx.content.preferences.protobuf.CodedInputStream getHighSpeedVideoFpsRanges(java.lang.Iterable<java.nio.ByteBuffer> iterable, boolean z) {
        byte b = 0;
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
            return new androidx.datastore.preferences.protobuf.CodedInputStream.IterableDirectByteBufferDecoder(iterable, i2, z, b);
        }
        return newInstance(new androidx.content.preferences.protobuf.IterableByteBufferInputStream(iterable));
    }

    public static androidx.content.preferences.protobuf.CodedInputStream newInstance(byte[] bArr) {
        return newInstance(bArr, 0, bArr.length);
    }

    public static androidx.content.preferences.protobuf.CodedInputStream newInstance(byte[] bArr, int i, int i2) {
        return Camera2StreamConfigurationMap(bArr, i, i2, false);
    }

    static androidx.content.preferences.protobuf.CodedInputStream Camera2StreamConfigurationMap(byte[] bArr, int i, int i2, boolean z) {
        androidx.datastore.preferences.protobuf.CodedInputStream.ArrayDecoder arrayDecoder = new androidx.datastore.preferences.protobuf.CodedInputStream.ArrayDecoder(bArr, i, i2, z, (byte) 0);
        try {
            arrayDecoder.pushLimit(i2);
            return arrayDecoder;
        } catch (androidx.content.preferences.protobuf.InvalidProtocolBufferException e) {
            throw new java.lang.IllegalArgumentException(e);
        }
    }

    public static androidx.content.preferences.protobuf.CodedInputStream newInstance(java.nio.ByteBuffer byteBuffer) {
        return getHighSpeedVideoFpsRanges(byteBuffer, false);
    }

    static androidx.content.preferences.protobuf.CodedInputStream getHighSpeedVideoFpsRanges(java.nio.ByteBuffer byteBuffer, boolean z) {
        if (byteBuffer.hasArray()) {
            return Camera2StreamConfigurationMap(byteBuffer.array(), byteBuffer.arrayOffset() + byteBuffer.position(), byteBuffer.remaining(), z);
        }
        byte b = 0;
        if (byteBuffer.isDirect() && androidx.datastore.preferences.protobuf.CodedInputStream.UnsafeDirectNioDecoder.getHighResolutionOutputSizeshNQ4ISI()) {
            return new androidx.datastore.preferences.protobuf.CodedInputStream.UnsafeDirectNioDecoder(byteBuffer, z, b);
        }
        int remaining = byteBuffer.remaining();
        byte[] bArr = new byte[remaining];
        byteBuffer.duplicate().get(bArr);
        return Camera2StreamConfigurationMap(bArr, 0, remaining, true);
    }

    public void checkRecursionLimit() throws androidx.content.preferences.protobuf.InvalidProtocolBufferException {
        if (this.Camera2StreamConfigurationMap >= this.getHighSpeedVideoFpsRangesFor) {
            throw androidx.content.preferences.protobuf.InvalidProtocolBufferException.getOutputFormats();
        }
    }

    private CodedInputStream() {
        this.getHighSpeedVideoFpsRangesFor = getHighResolutionOutputSizeshNQ4ISI;
        this.getHighSpeedVideoFpsRanges = Integer.MAX_VALUE;
        this.getInputFormats = false;
    }

    public void skipMessage() throws java.io.IOException {
        int readTag;
        do {
            readTag = readTag();
            if (readTag == 0) {
                return;
            }
            checkRecursionLimit();
            this.Camera2StreamConfigurationMap++;
            this.Camera2StreamConfigurationMap--;
        } while (skipField(readTag));
    }

    public void skipMessage(androidx.content.preferences.protobuf.CodedOutputStream codedOutputStream) throws java.io.IOException {
        int readTag;
        do {
            readTag = readTag();
            if (readTag == 0) {
                return;
            }
            checkRecursionLimit();
            this.Camera2StreamConfigurationMap++;
            this.Camera2StreamConfigurationMap--;
        } while (skipField(readTag, codedOutputStream));
    }

    public final int setRecursionLimit(int i) {
        if (i < 0) {
            throw new java.lang.IllegalArgumentException("Recursion limit cannot be negative: ".concat(java.lang.String.valueOf(i)));
        }
        int i2 = this.getHighSpeedVideoFpsRangesFor;
        this.getHighSpeedVideoFpsRangesFor = i;
        return i2;
    }

    public final int setSizeLimit(int i) {
        if (i < 0) {
            throw new java.lang.IllegalArgumentException("Size limit cannot be negative: ".concat(java.lang.String.valueOf(i)));
        }
        int i2 = this.getHighSpeedVideoFpsRanges;
        this.getHighSpeedVideoFpsRanges = i;
        return i2;
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
                throw androidx.content.preferences.protobuf.InvalidProtocolBufferException.getInputSizeshNQ4ISI();
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
                throw androidx.content.preferences.protobuf.InvalidProtocolBufferException.getInputSizeshNQ4ISI();
            }
            if ((read2 & 128) == 0) {
                return i2;
            }
            i3 += 7;
        }
        throw androidx.content.preferences.protobuf.InvalidProtocolBufferException.Camera2StreamConfigurationMap();
    }

    static final class ArrayDecoder extends androidx.content.preferences.protobuf.CodedInputStream {
        private final byte[] getHighResolutionOutputSizeshNQ4ISI;
        private boolean getHighSpeedVideoSizesFor;
        private int getInputFormats;
        private int getInputSizeshNQ4ISI;
        private final boolean getOutputFormats;
        private int getOutputMinFrameDuration;
        private int getOutputSizes;
        private int getOutputSizeshNQ4ISI;
        private int getOutputStallDurationlomOqCM;

        /* synthetic */ ArrayDecoder(byte[] bArr, int i, int i2, boolean z, byte b) {
            this(bArr, i, i2, z);
        }

        private ArrayDecoder(byte[] bArr, int i, int i2, boolean z) {
            super((byte) 0);
            this.getInputFormats = Integer.MAX_VALUE;
            this.getHighResolutionOutputSizeshNQ4ISI = bArr;
            this.getOutputSizeshNQ4ISI = i2 + i;
            this.getOutputStallDurationlomOqCM = i;
            this.getOutputSizes = i;
            this.getOutputFormats = z;
        }

        @Override // androidx.content.preferences.protobuf.CodedInputStream
        public final int readTag() throws java.io.IOException {
            if (isAtEnd()) {
                this.getInputSizeshNQ4ISI = 0;
                return 0;
            }
            int readRawVarint32 = readRawVarint32();
            this.getInputSizeshNQ4ISI = readRawVarint32;
            if (androidx.content.preferences.protobuf.WireFormat.getTagFieldNumber(readRawVarint32) == 0) {
                throw androidx.content.preferences.protobuf.InvalidProtocolBufferException.getHighSpeedVideoFpsRanges();
            }
            return this.getInputSizeshNQ4ISI;
        }

        @Override // androidx.content.preferences.protobuf.CodedInputStream
        public final void checkLastTagWas(int i) throws androidx.content.preferences.protobuf.InvalidProtocolBufferException {
            if (this.getInputSizeshNQ4ISI != i) {
                throw androidx.content.preferences.protobuf.InvalidProtocolBufferException.getHighSpeedVideoFpsRangesFor();
            }
        }

        @Override // androidx.content.preferences.protobuf.CodedInputStream
        public final int getLastTag() {
            return this.getInputSizeshNQ4ISI;
        }

        @Override // androidx.content.preferences.protobuf.CodedInputStream
        public final boolean skipField(int i) throws java.io.IOException {
            int tagWireType = androidx.content.preferences.protobuf.WireFormat.getTagWireType(i);
            int i2 = 0;
            if (tagWireType == 0) {
                if (this.getOutputSizeshNQ4ISI - this.getOutputStallDurationlomOqCM >= 10) {
                    while (i2 < 10) {
                        byte[] bArr = this.getHighResolutionOutputSizeshNQ4ISI;
                        int i3 = this.getOutputStallDurationlomOqCM;
                        this.getOutputStallDurationlomOqCM = i3 + 1;
                        if (bArr[i3] < 0) {
                            i2++;
                        }
                    }
                    throw androidx.content.preferences.protobuf.InvalidProtocolBufferException.Camera2StreamConfigurationMap();
                }
                while (i2 < 10) {
                    if (readRawByte() < 0) {
                        i2++;
                    }
                }
                throw androidx.content.preferences.protobuf.InvalidProtocolBufferException.Camera2StreamConfigurationMap();
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
                checkLastTagWas(androidx.content.preferences.protobuf.WireFormat.Camera2StreamConfigurationMap(androidx.content.preferences.protobuf.WireFormat.getTagFieldNumber(i), 4));
                return true;
            }
            if (tagWireType == 4) {
                return false;
            }
            if (tagWireType == 5) {
                skipRawBytes(4);
                return true;
            }
            throw androidx.content.preferences.protobuf.InvalidProtocolBufferException.getHighResolutionOutputSizeshNQ4ISI();
        }

        @Override // androidx.content.preferences.protobuf.CodedInputStream
        public final boolean skipField(int i, androidx.content.preferences.protobuf.CodedOutputStream codedOutputStream) throws java.io.IOException {
            int tagWireType = androidx.content.preferences.protobuf.WireFormat.getTagWireType(i);
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
                androidx.content.preferences.protobuf.ByteString readBytes = readBytes();
                codedOutputStream.writeUInt32NoTag(i);
                codedOutputStream.writeBytesNoTag(readBytes);
                return true;
            }
            if (tagWireType == 3) {
                codedOutputStream.writeUInt32NoTag(i);
                skipMessage(codedOutputStream);
                int Camera2StreamConfigurationMap = androidx.content.preferences.protobuf.WireFormat.Camera2StreamConfigurationMap(androidx.content.preferences.protobuf.WireFormat.getTagFieldNumber(i), 4);
                checkLastTagWas(Camera2StreamConfigurationMap);
                codedOutputStream.writeUInt32NoTag(Camera2StreamConfigurationMap);
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
            throw androidx.content.preferences.protobuf.InvalidProtocolBufferException.getHighResolutionOutputSizeshNQ4ISI();
        }

        @Override // androidx.content.preferences.protobuf.CodedInputStream
        public final double readDouble() throws java.io.IOException {
            return java.lang.Double.longBitsToDouble(readRawLittleEndian64());
        }

        @Override // androidx.content.preferences.protobuf.CodedInputStream
        public final float readFloat() throws java.io.IOException {
            return java.lang.Float.intBitsToFloat(readRawLittleEndian32());
        }

        @Override // androidx.content.preferences.protobuf.CodedInputStream
        public final long readUInt64() throws java.io.IOException {
            return readRawVarint64();
        }

        @Override // androidx.content.preferences.protobuf.CodedInputStream
        public final long readInt64() throws java.io.IOException {
            return readRawVarint64();
        }

        @Override // androidx.content.preferences.protobuf.CodedInputStream
        public final int readInt32() throws java.io.IOException {
            return readRawVarint32();
        }

        @Override // androidx.content.preferences.protobuf.CodedInputStream
        public final long readFixed64() throws java.io.IOException {
            return readRawLittleEndian64();
        }

        @Override // androidx.content.preferences.protobuf.CodedInputStream
        public final int readFixed32() throws java.io.IOException {
            return readRawLittleEndian32();
        }

        @Override // androidx.content.preferences.protobuf.CodedInputStream
        public final boolean readBool() throws java.io.IOException {
            return readRawVarint64() != 0;
        }

        @Override // androidx.content.preferences.protobuf.CodedInputStream
        public final java.lang.String readString() throws java.io.IOException {
            int readRawVarint32 = readRawVarint32();
            if (readRawVarint32 > 0) {
                int i = this.getOutputSizeshNQ4ISI;
                int i2 = this.getOutputStallDurationlomOqCM;
                if (readRawVarint32 <= i - i2) {
                    java.lang.String str = new java.lang.String(this.getHighResolutionOutputSizeshNQ4ISI, i2, readRawVarint32, androidx.content.preferences.protobuf.Internal.getHighSpeedVideoSizes);
                    this.getOutputStallDurationlomOqCM += readRawVarint32;
                    return str;
                }
            }
            if (readRawVarint32 == 0) {
                return "";
            }
            if (readRawVarint32 < 0) {
                throw androidx.content.preferences.protobuf.InvalidProtocolBufferException.getInputFormats();
            }
            throw androidx.content.preferences.protobuf.InvalidProtocolBufferException.getInputSizeshNQ4ISI();
        }

        @Override // androidx.content.preferences.protobuf.CodedInputStream
        public final java.lang.String readStringRequireUtf8() throws java.io.IOException {
            int readRawVarint32 = readRawVarint32();
            if (readRawVarint32 > 0) {
                int i = this.getOutputSizeshNQ4ISI;
                int i2 = this.getOutputStallDurationlomOqCM;
                if (readRawVarint32 <= i - i2) {
                    java.lang.String highSpeedVideoFpsRanges = androidx.content.preferences.protobuf.Utf8.getHighSpeedVideoFpsRanges(this.getHighResolutionOutputSizeshNQ4ISI, i2, readRawVarint32);
                    this.getOutputStallDurationlomOqCM += readRawVarint32;
                    return highSpeedVideoFpsRanges;
                }
            }
            if (readRawVarint32 == 0) {
                return "";
            }
            if (readRawVarint32 <= 0) {
                throw androidx.content.preferences.protobuf.InvalidProtocolBufferException.getInputFormats();
            }
            throw androidx.content.preferences.protobuf.InvalidProtocolBufferException.getInputSizeshNQ4ISI();
        }

        @Override // androidx.content.preferences.protobuf.CodedInputStream
        public final void readGroup(int i, androidx.datastore.preferences.protobuf.MessageLite.Builder builder, androidx.content.preferences.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
            checkRecursionLimit();
            this.Camera2StreamConfigurationMap++;
            builder.mergeFrom(this, extensionRegistryLite);
            checkLastTagWas(androidx.content.preferences.protobuf.WireFormat.Camera2StreamConfigurationMap(i, 4));
            this.Camera2StreamConfigurationMap--;
        }

        @Override // androidx.content.preferences.protobuf.CodedInputStream
        public final <T extends androidx.content.preferences.protobuf.MessageLite> T readGroup(int i, androidx.content.preferences.protobuf.Parser<T> parser, androidx.content.preferences.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
            checkRecursionLimit();
            this.Camera2StreamConfigurationMap++;
            T parsePartialFrom = parser.parsePartialFrom(this, extensionRegistryLite);
            checkLastTagWas(androidx.content.preferences.protobuf.WireFormat.Camera2StreamConfigurationMap(i, 4));
            this.Camera2StreamConfigurationMap--;
            return parsePartialFrom;
        }

        @Override // androidx.content.preferences.protobuf.CodedInputStream
        @java.lang.Deprecated
        public final void readUnknownGroup(int i, androidx.datastore.preferences.protobuf.MessageLite.Builder builder) throws java.io.IOException {
            readGroup(i, builder, androidx.content.preferences.protobuf.ExtensionRegistryLite.getEmptyRegistry());
        }

        @Override // androidx.content.preferences.protobuf.CodedInputStream
        public final void readMessage(androidx.datastore.preferences.protobuf.MessageLite.Builder builder, androidx.content.preferences.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
            int readRawVarint32 = readRawVarint32();
            checkRecursionLimit();
            int pushLimit = pushLimit(readRawVarint32);
            this.Camera2StreamConfigurationMap++;
            builder.mergeFrom(this, extensionRegistryLite);
            checkLastTagWas(0);
            this.Camera2StreamConfigurationMap--;
            if (getBytesUntilLimit() != 0) {
                throw androidx.content.preferences.protobuf.InvalidProtocolBufferException.getInputSizeshNQ4ISI();
            }
            popLimit(pushLimit);
        }

        @Override // androidx.content.preferences.protobuf.CodedInputStream
        public final <T extends androidx.content.preferences.protobuf.MessageLite> T readMessage(androidx.content.preferences.protobuf.Parser<T> parser, androidx.content.preferences.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
            int readRawVarint32 = readRawVarint32();
            checkRecursionLimit();
            int pushLimit = pushLimit(readRawVarint32);
            this.Camera2StreamConfigurationMap++;
            T parsePartialFrom = parser.parsePartialFrom(this, extensionRegistryLite);
            checkLastTagWas(0);
            this.Camera2StreamConfigurationMap--;
            if (getBytesUntilLimit() != 0) {
                throw androidx.content.preferences.protobuf.InvalidProtocolBufferException.getInputSizeshNQ4ISI();
            }
            popLimit(pushLimit);
            return parsePartialFrom;
        }

        @Override // androidx.content.preferences.protobuf.CodedInputStream
        public final androidx.content.preferences.protobuf.ByteString readBytes() throws java.io.IOException {
            androidx.content.preferences.protobuf.ByteString copyFrom;
            int readRawVarint32 = readRawVarint32();
            if (readRawVarint32 > 0) {
                int i = this.getOutputSizeshNQ4ISI;
                int i2 = this.getOutputStallDurationlomOqCM;
                if (readRawVarint32 <= i - i2) {
                    if (this.getOutputFormats && this.getHighSpeedVideoSizesFor) {
                        copyFrom = androidx.content.preferences.protobuf.ByteString.getHighResolutionOutputSizeshNQ4ISI(this.getHighResolutionOutputSizeshNQ4ISI, i2, readRawVarint32);
                    } else {
                        copyFrom = androidx.content.preferences.protobuf.ByteString.copyFrom(this.getHighResolutionOutputSizeshNQ4ISI, i2, readRawVarint32);
                    }
                    this.getOutputStallDurationlomOqCM += readRawVarint32;
                    return copyFrom;
                }
            }
            if (readRawVarint32 == 0) {
                return androidx.content.preferences.protobuf.ByteString.EMPTY;
            }
            return androidx.content.preferences.protobuf.ByteString.getHighSpeedVideoSizes(readRawBytes(readRawVarint32));
        }

        @Override // androidx.content.preferences.protobuf.CodedInputStream
        public final byte[] readByteArray() throws java.io.IOException {
            return readRawBytes(readRawVarint32());
        }

        @Override // androidx.content.preferences.protobuf.CodedInputStream
        public final java.nio.ByteBuffer readByteBuffer() throws java.io.IOException {
            java.nio.ByteBuffer wrap;
            int readRawVarint32 = readRawVarint32();
            if (readRawVarint32 > 0) {
                int i = this.getOutputSizeshNQ4ISI;
                int i2 = this.getOutputStallDurationlomOqCM;
                if (readRawVarint32 <= i - i2) {
                    if (!this.getOutputFormats && this.getHighSpeedVideoSizesFor) {
                        wrap = java.nio.ByteBuffer.wrap(this.getHighResolutionOutputSizeshNQ4ISI, i2, readRawVarint32).slice();
                    } else {
                        wrap = java.nio.ByteBuffer.wrap(java.util.Arrays.copyOfRange(this.getHighResolutionOutputSizeshNQ4ISI, i2, i2 + readRawVarint32));
                    }
                    this.getOutputStallDurationlomOqCM += readRawVarint32;
                    return wrap;
                }
            }
            if (readRawVarint32 == 0) {
                return androidx.content.preferences.protobuf.Internal.EMPTY_BYTE_BUFFER;
            }
            if (readRawVarint32 < 0) {
                throw androidx.content.preferences.protobuf.InvalidProtocolBufferException.getInputFormats();
            }
            throw androidx.content.preferences.protobuf.InvalidProtocolBufferException.getInputSizeshNQ4ISI();
        }

        @Override // androidx.content.preferences.protobuf.CodedInputStream
        public final int readUInt32() throws java.io.IOException {
            return readRawVarint32();
        }

        @Override // androidx.content.preferences.protobuf.CodedInputStream
        public final int readEnum() throws java.io.IOException {
            return readRawVarint32();
        }

        @Override // androidx.content.preferences.protobuf.CodedInputStream
        public final int readSFixed32() throws java.io.IOException {
            return readRawLittleEndian32();
        }

        @Override // androidx.content.preferences.protobuf.CodedInputStream
        public final long readSFixed64() throws java.io.IOException {
            return readRawLittleEndian64();
        }

        @Override // androidx.content.preferences.protobuf.CodedInputStream
        public final int readSInt32() throws java.io.IOException {
            return decodeZigZag32(readRawVarint32());
        }

        @Override // androidx.content.preferences.protobuf.CodedInputStream
        public final long readSInt64() throws java.io.IOException {
            return decodeZigZag64(readRawVarint64());
        }

        @Override // androidx.content.preferences.protobuf.CodedInputStream
        public final int readRawVarint32() throws java.io.IOException {
            int i;
            int i2 = this.getOutputStallDurationlomOqCM;
            int i3 = this.getOutputSizeshNQ4ISI;
            if (i3 != i2) {
                byte[] bArr = this.getHighResolutionOutputSizeshNQ4ISI;
                int i4 = i2 + 1;
                byte b = bArr[i2];
                if (b >= 0) {
                    this.getOutputStallDurationlomOqCM = i4;
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
                    this.getOutputStallDurationlomOqCM = i5;
                    return i;
                }
            }
            return (int) getHighSpeedVideoFpsRangesFor();
        }

        @Override // androidx.content.preferences.protobuf.CodedInputStream
        public final long readRawVarint64() throws java.io.IOException {
            long j;
            long j2;
            long j3;
            int i = this.getOutputStallDurationlomOqCM;
            int i2 = this.getOutputSizeshNQ4ISI;
            if (i2 != i) {
                byte[] bArr = this.getHighResolutionOutputSizeshNQ4ISI;
                int i3 = i + 1;
                byte b = bArr[i];
                if (b >= 0) {
                    this.getOutputStallDurationlomOqCM = i3;
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
                    this.getOutputStallDurationlomOqCM = i4;
                    return j;
                }
            }
            return getHighSpeedVideoFpsRangesFor();
        }

        @Override // androidx.content.preferences.protobuf.CodedInputStream
        final long getHighSpeedVideoFpsRangesFor() throws java.io.IOException {
            long j = 0;
            for (int i = 0; i < 64; i += 7) {
                j |= (r3 & Byte.MAX_VALUE) << i;
                if ((readRawByte() & 128) == 0) {
                    return j;
                }
            }
            throw androidx.content.preferences.protobuf.InvalidProtocolBufferException.Camera2StreamConfigurationMap();
        }

        @Override // androidx.content.preferences.protobuf.CodedInputStream
        public final int readRawLittleEndian32() throws java.io.IOException {
            int i = this.getOutputStallDurationlomOqCM;
            if (this.getOutputSizeshNQ4ISI - i < 4) {
                throw androidx.content.preferences.protobuf.InvalidProtocolBufferException.getInputSizeshNQ4ISI();
            }
            byte[] bArr = this.getHighResolutionOutputSizeshNQ4ISI;
            this.getOutputStallDurationlomOqCM = i + 4;
            return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
        }

        @Override // androidx.content.preferences.protobuf.CodedInputStream
        public final long readRawLittleEndian64() throws java.io.IOException {
            int i = this.getOutputStallDurationlomOqCM;
            if (this.getOutputSizeshNQ4ISI - i < 8) {
                throw androidx.content.preferences.protobuf.InvalidProtocolBufferException.getInputSizeshNQ4ISI();
            }
            byte[] bArr = this.getHighResolutionOutputSizeshNQ4ISI;
            this.getOutputStallDurationlomOqCM = i + 8;
            return ((bArr[i + 7] & 255) << 56) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24) | ((bArr[i + 4] & 255) << 32) | ((bArr[i + 5] & 255) << 40) | ((bArr[i + 6] & 255) << 48);
        }

        @Override // androidx.content.preferences.protobuf.CodedInputStream
        public final void enableAliasing(boolean z) {
            this.getHighSpeedVideoSizesFor = z;
        }

        @Override // androidx.content.preferences.protobuf.CodedInputStream
        public final void resetSizeCounter() {
            this.getOutputSizes = this.getOutputStallDurationlomOqCM;
        }

        @Override // androidx.content.preferences.protobuf.CodedInputStream
        public final int pushLimit(int i) throws androidx.content.preferences.protobuf.InvalidProtocolBufferException {
            if (i < 0) {
                throw androidx.content.preferences.protobuf.InvalidProtocolBufferException.getInputFormats();
            }
            int totalBytesRead = i + getTotalBytesRead();
            if (totalBytesRead < 0) {
                throw androidx.content.preferences.protobuf.InvalidProtocolBufferException.getOutputMinFrameDuration();
            }
            int i2 = this.getInputFormats;
            if (totalBytesRead > i2) {
                throw androidx.content.preferences.protobuf.InvalidProtocolBufferException.getInputSizeshNQ4ISI();
            }
            this.getInputFormats = totalBytesRead;
            getHighSpeedVideoSizes();
            return i2;
        }

        private void getHighSpeedVideoSizes() {
            int i = this.getOutputSizeshNQ4ISI + this.getOutputMinFrameDuration;
            this.getOutputSizeshNQ4ISI = i;
            int i2 = i - this.getOutputSizes;
            int i3 = this.getInputFormats;
            if (i2 > i3) {
                int i4 = i2 - i3;
                this.getOutputMinFrameDuration = i4;
                this.getOutputSizeshNQ4ISI = i - i4;
                return;
            }
            this.getOutputMinFrameDuration = 0;
        }

        @Override // androidx.content.preferences.protobuf.CodedInputStream
        public final void popLimit(int i) {
            this.getInputFormats = i;
            getHighSpeedVideoSizes();
        }

        @Override // androidx.content.preferences.protobuf.CodedInputStream
        public final int getBytesUntilLimit() {
            int i = this.getInputFormats;
            if (i == Integer.MAX_VALUE) {
                return -1;
            }
            return i - getTotalBytesRead();
        }

        @Override // androidx.content.preferences.protobuf.CodedInputStream
        public final boolean isAtEnd() throws java.io.IOException {
            return this.getOutputStallDurationlomOqCM == this.getOutputSizeshNQ4ISI;
        }

        @Override // androidx.content.preferences.protobuf.CodedInputStream
        public final int getTotalBytesRead() {
            return this.getOutputStallDurationlomOqCM - this.getOutputSizes;
        }

        @Override // androidx.content.preferences.protobuf.CodedInputStream
        public final byte readRawByte() throws java.io.IOException {
            int i = this.getOutputStallDurationlomOqCM;
            if (i == this.getOutputSizeshNQ4ISI) {
                throw androidx.content.preferences.protobuf.InvalidProtocolBufferException.getInputSizeshNQ4ISI();
            }
            byte[] bArr = this.getHighResolutionOutputSizeshNQ4ISI;
            this.getOutputStallDurationlomOqCM = i + 1;
            return bArr[i];
        }

        @Override // androidx.content.preferences.protobuf.CodedInputStream
        public final byte[] readRawBytes(int i) throws java.io.IOException {
            if (i > 0) {
                int i2 = this.getOutputSizeshNQ4ISI;
                int i3 = this.getOutputStallDurationlomOqCM;
                if (i <= i2 - i3) {
                    int i4 = i + i3;
                    this.getOutputStallDurationlomOqCM = i4;
                    return java.util.Arrays.copyOfRange(this.getHighResolutionOutputSizeshNQ4ISI, i3, i4);
                }
            }
            if (i > 0) {
                throw androidx.content.preferences.protobuf.InvalidProtocolBufferException.getInputSizeshNQ4ISI();
            }
            if (i == 0) {
                return androidx.content.preferences.protobuf.Internal.EMPTY_BYTE_ARRAY;
            }
            throw androidx.content.preferences.protobuf.InvalidProtocolBufferException.getInputFormats();
        }

        @Override // androidx.content.preferences.protobuf.CodedInputStream
        public final void skipRawBytes(int i) throws java.io.IOException {
            if (i >= 0) {
                int i2 = this.getOutputSizeshNQ4ISI;
                int i3 = this.getOutputStallDurationlomOqCM;
                if (i <= i2 - i3) {
                    this.getOutputStallDurationlomOqCM = i3 + i;
                    return;
                }
            }
            if (i < 0) {
                throw androidx.content.preferences.protobuf.InvalidProtocolBufferException.getInputFormats();
            }
            throw androidx.content.preferences.protobuf.InvalidProtocolBufferException.getInputSizeshNQ4ISI();
        }
    }

    /* loaded from: classes7.dex */
    static final class UnsafeDirectNioDecoder extends androidx.content.preferences.protobuf.CodedInputStream {
        private final long getHighResolutionOutputSizeshNQ4ISI;
        private int getHighSpeedVideoSizesFor;
        private final boolean getInputFormats;
        private int getInputSizeshNQ4ISI;
        private boolean getOutputFormats;
        private final java.nio.ByteBuffer getOutputMinFrameDuration;
        private long getOutputSizes;
        private long getOutputSizeshNQ4ISI;
        private long getOutputStallDuration;
        private int getOutputStallDurationlomOqCM;

        /* synthetic */ UnsafeDirectNioDecoder(java.nio.ByteBuffer byteBuffer, boolean z, byte b) {
            this(byteBuffer, z);
        }

        static boolean getHighResolutionOutputSizeshNQ4ISI() {
            return androidx.content.preferences.protobuf.UnsafeUtil.getHighSpeedVideoSizes();
        }

        private UnsafeDirectNioDecoder(java.nio.ByteBuffer byteBuffer, boolean z) {
            super((byte) 0);
            this.getHighSpeedVideoSizesFor = Integer.MAX_VALUE;
            this.getOutputMinFrameDuration = byteBuffer;
            long highSpeedVideoSizes = androidx.content.preferences.protobuf.UnsafeUtil.getHighSpeedVideoSizes(byteBuffer);
            this.getHighResolutionOutputSizeshNQ4ISI = highSpeedVideoSizes;
            this.getOutputSizes = byteBuffer.limit() + highSpeedVideoSizes;
            long position = highSpeedVideoSizes + byteBuffer.position();
            this.getOutputSizeshNQ4ISI = position;
            this.getOutputStallDuration = position;
            this.getInputFormats = z;
        }

        @Override // androidx.content.preferences.protobuf.CodedInputStream
        public final int readTag() throws java.io.IOException {
            if (isAtEnd()) {
                this.getOutputStallDurationlomOqCM = 0;
                return 0;
            }
            int readRawVarint32 = readRawVarint32();
            this.getOutputStallDurationlomOqCM = readRawVarint32;
            if (androidx.content.preferences.protobuf.WireFormat.getTagFieldNumber(readRawVarint32) == 0) {
                throw androidx.content.preferences.protobuf.InvalidProtocolBufferException.getHighSpeedVideoFpsRanges();
            }
            return this.getOutputStallDurationlomOqCM;
        }

        @Override // androidx.content.preferences.protobuf.CodedInputStream
        public final void checkLastTagWas(int i) throws androidx.content.preferences.protobuf.InvalidProtocolBufferException {
            if (this.getOutputStallDurationlomOqCM != i) {
                throw androidx.content.preferences.protobuf.InvalidProtocolBufferException.getHighSpeedVideoFpsRangesFor();
            }
        }

        @Override // androidx.content.preferences.protobuf.CodedInputStream
        public final int getLastTag() {
            return this.getOutputStallDurationlomOqCM;
        }

        @Override // androidx.content.preferences.protobuf.CodedInputStream
        public final boolean skipField(int i) throws java.io.IOException {
            int tagWireType = androidx.content.preferences.protobuf.WireFormat.getTagWireType(i);
            int i2 = 0;
            if (tagWireType == 0) {
                if (((int) (this.getOutputSizes - this.getOutputSizeshNQ4ISI)) >= 10) {
                    while (i2 < 10) {
                        long j = this.getOutputSizeshNQ4ISI;
                        this.getOutputSizeshNQ4ISI = 1 + j;
                        if (androidx.content.preferences.protobuf.UnsafeUtil.getHighSpeedVideoFpsRangesFor(j) < 0) {
                            i2++;
                        }
                    }
                    throw androidx.content.preferences.protobuf.InvalidProtocolBufferException.Camera2StreamConfigurationMap();
                }
                while (i2 < 10) {
                    if (readRawByte() < 0) {
                        i2++;
                    }
                }
                throw androidx.content.preferences.protobuf.InvalidProtocolBufferException.Camera2StreamConfigurationMap();
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
                checkLastTagWas(androidx.content.preferences.protobuf.WireFormat.Camera2StreamConfigurationMap(androidx.content.preferences.protobuf.WireFormat.getTagFieldNumber(i), 4));
                return true;
            }
            if (tagWireType == 4) {
                return false;
            }
            if (tagWireType == 5) {
                skipRawBytes(4);
                return true;
            }
            throw androidx.content.preferences.protobuf.InvalidProtocolBufferException.getHighResolutionOutputSizeshNQ4ISI();
        }

        @Override // androidx.content.preferences.protobuf.CodedInputStream
        public final boolean skipField(int i, androidx.content.preferences.protobuf.CodedOutputStream codedOutputStream) throws java.io.IOException {
            int tagWireType = androidx.content.preferences.protobuf.WireFormat.getTagWireType(i);
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
                androidx.content.preferences.protobuf.ByteString readBytes = readBytes();
                codedOutputStream.writeUInt32NoTag(i);
                codedOutputStream.writeBytesNoTag(readBytes);
                return true;
            }
            if (tagWireType == 3) {
                codedOutputStream.writeUInt32NoTag(i);
                skipMessage(codedOutputStream);
                int Camera2StreamConfigurationMap = androidx.content.preferences.protobuf.WireFormat.Camera2StreamConfigurationMap(androidx.content.preferences.protobuf.WireFormat.getTagFieldNumber(i), 4);
                checkLastTagWas(Camera2StreamConfigurationMap);
                codedOutputStream.writeUInt32NoTag(Camera2StreamConfigurationMap);
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
            throw androidx.content.preferences.protobuf.InvalidProtocolBufferException.getHighResolutionOutputSizeshNQ4ISI();
        }

        @Override // androidx.content.preferences.protobuf.CodedInputStream
        public final double readDouble() throws java.io.IOException {
            return java.lang.Double.longBitsToDouble(readRawLittleEndian64());
        }

        @Override // androidx.content.preferences.protobuf.CodedInputStream
        public final float readFloat() throws java.io.IOException {
            return java.lang.Float.intBitsToFloat(readRawLittleEndian32());
        }

        @Override // androidx.content.preferences.protobuf.CodedInputStream
        public final long readUInt64() throws java.io.IOException {
            return readRawVarint64();
        }

        @Override // androidx.content.preferences.protobuf.CodedInputStream
        public final long readInt64() throws java.io.IOException {
            return readRawVarint64();
        }

        @Override // androidx.content.preferences.protobuf.CodedInputStream
        public final int readInt32() throws java.io.IOException {
            return readRawVarint32();
        }

        @Override // androidx.content.preferences.protobuf.CodedInputStream
        public final long readFixed64() throws java.io.IOException {
            return readRawLittleEndian64();
        }

        @Override // androidx.content.preferences.protobuf.CodedInputStream
        public final int readFixed32() throws java.io.IOException {
            return readRawLittleEndian32();
        }

        @Override // androidx.content.preferences.protobuf.CodedInputStream
        public final boolean readBool() throws java.io.IOException {
            return readRawVarint64() != 0;
        }

        @Override // androidx.content.preferences.protobuf.CodedInputStream
        public final java.lang.String readString() throws java.io.IOException {
            int readRawVarint32 = readRawVarint32();
            if (readRawVarint32 > 0) {
                long j = this.getOutputSizes;
                long j2 = this.getOutputSizeshNQ4ISI;
                if (readRawVarint32 <= ((int) (j - j2))) {
                    byte[] bArr = new byte[readRawVarint32];
                    long j3 = readRawVarint32;
                    androidx.content.preferences.protobuf.UnsafeUtil.getHighSpeedVideoFpsRanges(j2, bArr, 0L, j3);
                    java.lang.String str = new java.lang.String(bArr, androidx.content.preferences.protobuf.Internal.getHighSpeedVideoSizes);
                    this.getOutputSizeshNQ4ISI += j3;
                    return str;
                }
            }
            if (readRawVarint32 == 0) {
                return "";
            }
            if (readRawVarint32 < 0) {
                throw androidx.content.preferences.protobuf.InvalidProtocolBufferException.getInputFormats();
            }
            throw androidx.content.preferences.protobuf.InvalidProtocolBufferException.getInputSizeshNQ4ISI();
        }

        @Override // androidx.content.preferences.protobuf.CodedInputStream
        public final java.lang.String readStringRequireUtf8() throws java.io.IOException {
            int readRawVarint32 = readRawVarint32();
            if (readRawVarint32 > 0) {
                long j = this.getOutputSizes;
                long j2 = this.getOutputSizeshNQ4ISI;
                if (readRawVarint32 <= ((int) (j - j2))) {
                    java.lang.String highSpeedVideoFpsRanges = androidx.content.preferences.protobuf.Utf8.getHighSpeedVideoFpsRanges(this.getOutputMinFrameDuration, (int) (j2 - this.getHighResolutionOutputSizeshNQ4ISI), readRawVarint32);
                    this.getOutputSizeshNQ4ISI += readRawVarint32;
                    return highSpeedVideoFpsRanges;
                }
            }
            if (readRawVarint32 == 0) {
                return "";
            }
            if (readRawVarint32 <= 0) {
                throw androidx.content.preferences.protobuf.InvalidProtocolBufferException.getInputFormats();
            }
            throw androidx.content.preferences.protobuf.InvalidProtocolBufferException.getInputSizeshNQ4ISI();
        }

        @Override // androidx.content.preferences.protobuf.CodedInputStream
        public final void readGroup(int i, androidx.datastore.preferences.protobuf.MessageLite.Builder builder, androidx.content.preferences.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
            checkRecursionLimit();
            this.Camera2StreamConfigurationMap++;
            builder.mergeFrom(this, extensionRegistryLite);
            checkLastTagWas(androidx.content.preferences.protobuf.WireFormat.Camera2StreamConfigurationMap(i, 4));
            this.Camera2StreamConfigurationMap--;
        }

        @Override // androidx.content.preferences.protobuf.CodedInputStream
        public final <T extends androidx.content.preferences.protobuf.MessageLite> T readGroup(int i, androidx.content.preferences.protobuf.Parser<T> parser, androidx.content.preferences.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
            checkRecursionLimit();
            this.Camera2StreamConfigurationMap++;
            T parsePartialFrom = parser.parsePartialFrom(this, extensionRegistryLite);
            checkLastTagWas(androidx.content.preferences.protobuf.WireFormat.Camera2StreamConfigurationMap(i, 4));
            this.Camera2StreamConfigurationMap--;
            return parsePartialFrom;
        }

        @Override // androidx.content.preferences.protobuf.CodedInputStream
        @java.lang.Deprecated
        public final void readUnknownGroup(int i, androidx.datastore.preferences.protobuf.MessageLite.Builder builder) throws java.io.IOException {
            readGroup(i, builder, androidx.content.preferences.protobuf.ExtensionRegistryLite.getEmptyRegistry());
        }

        @Override // androidx.content.preferences.protobuf.CodedInputStream
        public final void readMessage(androidx.datastore.preferences.protobuf.MessageLite.Builder builder, androidx.content.preferences.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
            int readRawVarint32 = readRawVarint32();
            checkRecursionLimit();
            int pushLimit = pushLimit(readRawVarint32);
            this.Camera2StreamConfigurationMap++;
            builder.mergeFrom(this, extensionRegistryLite);
            checkLastTagWas(0);
            this.Camera2StreamConfigurationMap--;
            if (getBytesUntilLimit() != 0) {
                throw androidx.content.preferences.protobuf.InvalidProtocolBufferException.getInputSizeshNQ4ISI();
            }
            popLimit(pushLimit);
        }

        @Override // androidx.content.preferences.protobuf.CodedInputStream
        public final <T extends androidx.content.preferences.protobuf.MessageLite> T readMessage(androidx.content.preferences.protobuf.Parser<T> parser, androidx.content.preferences.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
            int readRawVarint32 = readRawVarint32();
            checkRecursionLimit();
            int pushLimit = pushLimit(readRawVarint32);
            this.Camera2StreamConfigurationMap++;
            T parsePartialFrom = parser.parsePartialFrom(this, extensionRegistryLite);
            checkLastTagWas(0);
            this.Camera2StreamConfigurationMap--;
            if (getBytesUntilLimit() != 0) {
                throw androidx.content.preferences.protobuf.InvalidProtocolBufferException.getInputSizeshNQ4ISI();
            }
            popLimit(pushLimit);
            return parsePartialFrom;
        }

        @Override // androidx.content.preferences.protobuf.CodedInputStream
        public final androidx.content.preferences.protobuf.ByteString readBytes() throws java.io.IOException {
            int readRawVarint32 = readRawVarint32();
            if (readRawVarint32 > 0) {
                long j = this.getOutputSizes;
                long j2 = this.getOutputSizeshNQ4ISI;
                if (readRawVarint32 <= ((int) (j - j2))) {
                    if (this.getInputFormats && this.getOutputFormats) {
                        long j3 = readRawVarint32;
                        java.nio.ByteBuffer highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges(j2, j2 + j3);
                        this.getOutputSizeshNQ4ISI += j3;
                        return androidx.content.preferences.protobuf.ByteString.getHighSpeedVideoFpsRanges(highSpeedVideoFpsRanges);
                    }
                    byte[] bArr = new byte[readRawVarint32];
                    long j4 = readRawVarint32;
                    androidx.content.preferences.protobuf.UnsafeUtil.getHighSpeedVideoFpsRanges(j2, bArr, 0L, j4);
                    this.getOutputSizeshNQ4ISI += j4;
                    return androidx.content.preferences.protobuf.ByteString.getHighSpeedVideoSizes(bArr);
                }
            }
            if (readRawVarint32 == 0) {
                return androidx.content.preferences.protobuf.ByteString.EMPTY;
            }
            if (readRawVarint32 < 0) {
                throw androidx.content.preferences.protobuf.InvalidProtocolBufferException.getInputFormats();
            }
            throw androidx.content.preferences.protobuf.InvalidProtocolBufferException.getInputSizeshNQ4ISI();
        }

        @Override // androidx.content.preferences.protobuf.CodedInputStream
        public final byte[] readByteArray() throws java.io.IOException {
            return readRawBytes(readRawVarint32());
        }

        @Override // androidx.content.preferences.protobuf.CodedInputStream
        public final java.nio.ByteBuffer readByteBuffer() throws java.io.IOException {
            int readRawVarint32 = readRawVarint32();
            if (readRawVarint32 > 0) {
                long j = this.getOutputSizes;
                long j2 = this.getOutputSizeshNQ4ISI;
                if (readRawVarint32 <= ((int) (j - j2))) {
                    if (!this.getInputFormats && this.getOutputFormats) {
                        long j3 = readRawVarint32;
                        java.nio.ByteBuffer highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges(j2, j2 + j3);
                        this.getOutputSizeshNQ4ISI += j3;
                        return highSpeedVideoFpsRanges;
                    }
                    byte[] bArr = new byte[readRawVarint32];
                    long j4 = readRawVarint32;
                    androidx.content.preferences.protobuf.UnsafeUtil.getHighSpeedVideoFpsRanges(j2, bArr, 0L, j4);
                    this.getOutputSizeshNQ4ISI += j4;
                    return java.nio.ByteBuffer.wrap(bArr);
                }
            }
            if (readRawVarint32 == 0) {
                return androidx.content.preferences.protobuf.Internal.EMPTY_BYTE_BUFFER;
            }
            if (readRawVarint32 < 0) {
                throw androidx.content.preferences.protobuf.InvalidProtocolBufferException.getInputFormats();
            }
            throw androidx.content.preferences.protobuf.InvalidProtocolBufferException.getInputSizeshNQ4ISI();
        }

        @Override // androidx.content.preferences.protobuf.CodedInputStream
        public final int readUInt32() throws java.io.IOException {
            return readRawVarint32();
        }

        @Override // androidx.content.preferences.protobuf.CodedInputStream
        public final int readEnum() throws java.io.IOException {
            return readRawVarint32();
        }

        @Override // androidx.content.preferences.protobuf.CodedInputStream
        public final int readSFixed32() throws java.io.IOException {
            return readRawLittleEndian32();
        }

        @Override // androidx.content.preferences.protobuf.CodedInputStream
        public final long readSFixed64() throws java.io.IOException {
            return readRawLittleEndian64();
        }

        @Override // androidx.content.preferences.protobuf.CodedInputStream
        public final int readSInt32() throws java.io.IOException {
            return decodeZigZag32(readRawVarint32());
        }

        @Override // androidx.content.preferences.protobuf.CodedInputStream
        public final long readSInt64() throws java.io.IOException {
            return decodeZigZag64(readRawVarint64());
        }

        /* JADX WARN: Code restructure failed: missing block: B:33:0x0087, code lost:
        
            if (androidx.content.preferences.protobuf.UnsafeUtil.getHighSpeedVideoFpsRangesFor(r3) < 0) goto L37;
         */
        @Override // androidx.content.preferences.protobuf.CodedInputStream
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final int readRawVarint32() throws java.io.IOException {
            int i;
            long j = this.getOutputSizeshNQ4ISI;
            if (this.getOutputSizes != j) {
                long j2 = 1 + j;
                byte highSpeedVideoFpsRangesFor = androidx.content.preferences.protobuf.UnsafeUtil.getHighSpeedVideoFpsRangesFor(j);
                if (highSpeedVideoFpsRangesFor >= 0) {
                    this.getOutputSizeshNQ4ISI = j2;
                    return highSpeedVideoFpsRangesFor;
                }
                if (this.getOutputSizes - j2 >= 9) {
                    long j3 = 2 + j;
                    int highSpeedVideoFpsRangesFor2 = (androidx.content.preferences.protobuf.UnsafeUtil.getHighSpeedVideoFpsRangesFor(j2) << 7) ^ highSpeedVideoFpsRangesFor;
                    if (highSpeedVideoFpsRangesFor2 < 0) {
                        i = highSpeedVideoFpsRangesFor2 ^ androidx.work.WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT;
                    } else {
                        long j4 = 3 + j;
                        int highSpeedVideoFpsRangesFor3 = highSpeedVideoFpsRangesFor2 ^ (androidx.content.preferences.protobuf.UnsafeUtil.getHighSpeedVideoFpsRangesFor(j3) << 14);
                        if (highSpeedVideoFpsRangesFor3 >= 0) {
                            i = highSpeedVideoFpsRangesFor3 ^ 16256;
                        } else {
                            j3 = 4 + j;
                            int highSpeedVideoFpsRangesFor4 = highSpeedVideoFpsRangesFor3 ^ (androidx.content.preferences.protobuf.UnsafeUtil.getHighSpeedVideoFpsRangesFor(j4) << com.google.common.base.Ascii.NAK);
                            if (highSpeedVideoFpsRangesFor4 < 0) {
                                i = (-2080896) ^ highSpeedVideoFpsRangesFor4;
                            } else {
                                j4 = 5 + j;
                                byte highSpeedVideoFpsRangesFor5 = androidx.content.preferences.protobuf.UnsafeUtil.getHighSpeedVideoFpsRangesFor(j3);
                                int i2 = (highSpeedVideoFpsRangesFor4 ^ (highSpeedVideoFpsRangesFor5 << com.google.common.base.Ascii.FS)) ^ 266354560;
                                if (highSpeedVideoFpsRangesFor5 < 0) {
                                    j3 = 6 + j;
                                    if (androidx.content.preferences.protobuf.UnsafeUtil.getHighSpeedVideoFpsRangesFor(j4) < 0) {
                                        j4 = 7 + j;
                                        if (androidx.content.preferences.protobuf.UnsafeUtil.getHighSpeedVideoFpsRangesFor(j3) < 0) {
                                            j3 = 8 + j;
                                            if (androidx.content.preferences.protobuf.UnsafeUtil.getHighSpeedVideoFpsRangesFor(j4) < 0) {
                                                j4 = j + 9;
                                                if (androidx.content.preferences.protobuf.UnsafeUtil.getHighSpeedVideoFpsRangesFor(j3) < 0) {
                                                    j3 = 10 + j;
                                                }
                                            }
                                        }
                                    }
                                    i = i2;
                                }
                                i = i2;
                            }
                        }
                        j3 = j4;
                    }
                    this.getOutputSizeshNQ4ISI = j3;
                    return i;
                }
            }
            return (int) getHighSpeedVideoFpsRangesFor();
        }

        @Override // androidx.content.preferences.protobuf.CodedInputStream
        public final long readRawVarint64() throws java.io.IOException {
            long j;
            long j2;
            long j3;
            long j4;
            int i;
            long j5 = this.getOutputSizeshNQ4ISI;
            if (this.getOutputSizes != j5) {
                long j6 = 1 + j5;
                byte highSpeedVideoFpsRangesFor = androidx.content.preferences.protobuf.UnsafeUtil.getHighSpeedVideoFpsRangesFor(j5);
                if (highSpeedVideoFpsRangesFor >= 0) {
                    this.getOutputSizeshNQ4ISI = j6;
                    return highSpeedVideoFpsRangesFor;
                }
                if (this.getOutputSizes - j6 >= 9) {
                    long j7 = 2 + j5;
                    int highSpeedVideoFpsRangesFor2 = (androidx.content.preferences.protobuf.UnsafeUtil.getHighSpeedVideoFpsRangesFor(j6) << 7) ^ highSpeedVideoFpsRangesFor;
                    if (highSpeedVideoFpsRangesFor2 >= 0) {
                        j = 3 + j5;
                        int highSpeedVideoFpsRangesFor3 = highSpeedVideoFpsRangesFor2 ^ (androidx.content.preferences.protobuf.UnsafeUtil.getHighSpeedVideoFpsRangesFor(j7) << 14);
                        if (highSpeedVideoFpsRangesFor3 >= 0) {
                            j2 = highSpeedVideoFpsRangesFor3 ^ 16256;
                        } else {
                            j7 = 4 + j5;
                            int highSpeedVideoFpsRangesFor4 = highSpeedVideoFpsRangesFor3 ^ (androidx.content.preferences.protobuf.UnsafeUtil.getHighSpeedVideoFpsRangesFor(j) << com.google.common.base.Ascii.NAK);
                            if (highSpeedVideoFpsRangesFor4 < 0) {
                                i = (-2080896) ^ highSpeedVideoFpsRangesFor4;
                            } else {
                                long j8 = 5 + j5;
                                long highSpeedVideoFpsRangesFor5 = highSpeedVideoFpsRangesFor4 ^ (androidx.content.preferences.protobuf.UnsafeUtil.getHighSpeedVideoFpsRangesFor(j7) << 28);
                                if (highSpeedVideoFpsRangesFor5 >= 0) {
                                    j4 = 266354560;
                                } else {
                                    long j9 = 6 + j5;
                                    long highSpeedVideoFpsRangesFor6 = highSpeedVideoFpsRangesFor5 ^ (androidx.content.preferences.protobuf.UnsafeUtil.getHighSpeedVideoFpsRangesFor(j8) << 35);
                                    if (highSpeedVideoFpsRangesFor6 < 0) {
                                        j3 = -34093383808L;
                                    } else {
                                        j8 = 7 + j5;
                                        highSpeedVideoFpsRangesFor5 = highSpeedVideoFpsRangesFor6 ^ (androidx.content.preferences.protobuf.UnsafeUtil.getHighSpeedVideoFpsRangesFor(j9) << 42);
                                        if (highSpeedVideoFpsRangesFor5 >= 0) {
                                            j4 = 4363953127296L;
                                        } else {
                                            j9 = 8 + j5;
                                            highSpeedVideoFpsRangesFor6 = highSpeedVideoFpsRangesFor5 ^ (androidx.content.preferences.protobuf.UnsafeUtil.getHighSpeedVideoFpsRangesFor(j8) << 49);
                                            if (highSpeedVideoFpsRangesFor6 < 0) {
                                                j3 = -558586000294016L;
                                            } else {
                                                long j10 = j5 + 9;
                                                long highSpeedVideoFpsRangesFor7 = (highSpeedVideoFpsRangesFor6 ^ (androidx.content.preferences.protobuf.UnsafeUtil.getHighSpeedVideoFpsRangesFor(j9) << 56)) ^ 71499008037633920L;
                                                if (highSpeedVideoFpsRangesFor7 >= 0) {
                                                    j2 = highSpeedVideoFpsRangesFor7;
                                                    j = j10;
                                                } else if (androidx.content.preferences.protobuf.UnsafeUtil.getHighSpeedVideoFpsRangesFor(j10) >= 0) {
                                                    long j11 = j5 + 10;
                                                    j2 = highSpeedVideoFpsRangesFor7;
                                                    j = j11;
                                                }
                                            }
                                        }
                                    }
                                    j2 = j3 ^ highSpeedVideoFpsRangesFor6;
                                    j = j9;
                                }
                                j2 = j4 ^ highSpeedVideoFpsRangesFor5;
                                j = j8;
                            }
                        }
                        this.getOutputSizeshNQ4ISI = j;
                        return j2;
                    }
                    i = highSpeedVideoFpsRangesFor2 ^ androidx.work.WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT;
                    j2 = i;
                    j = j7;
                    this.getOutputSizeshNQ4ISI = j;
                    return j2;
                }
            }
            return getHighSpeedVideoFpsRangesFor();
        }

        @Override // androidx.content.preferences.protobuf.CodedInputStream
        final long getHighSpeedVideoFpsRangesFor() throws java.io.IOException {
            long j = 0;
            for (int i = 0; i < 64; i += 7) {
                j |= (r3 & Byte.MAX_VALUE) << i;
                if ((readRawByte() & 128) == 0) {
                    return j;
                }
            }
            throw androidx.content.preferences.protobuf.InvalidProtocolBufferException.Camera2StreamConfigurationMap();
        }

        @Override // androidx.content.preferences.protobuf.CodedInputStream
        public final int readRawLittleEndian32() throws java.io.IOException {
            long j = this.getOutputSizeshNQ4ISI;
            if (this.getOutputSizes - j < 4) {
                throw androidx.content.preferences.protobuf.InvalidProtocolBufferException.getInputSizeshNQ4ISI();
            }
            this.getOutputSizeshNQ4ISI = 4 + j;
            return ((androidx.content.preferences.protobuf.UnsafeUtil.getHighSpeedVideoFpsRangesFor(j + 3) & 255) << 24) | (androidx.content.preferences.protobuf.UnsafeUtil.getHighSpeedVideoFpsRangesFor(j) & 255) | ((androidx.content.preferences.protobuf.UnsafeUtil.getHighSpeedVideoFpsRangesFor(1 + j) & 255) << 8) | ((androidx.content.preferences.protobuf.UnsafeUtil.getHighSpeedVideoFpsRangesFor(2 + j) & 255) << 16);
        }

        @Override // androidx.content.preferences.protobuf.CodedInputStream
        public final long readRawLittleEndian64() throws java.io.IOException {
            long j = this.getOutputSizeshNQ4ISI;
            if (this.getOutputSizes - j < 8) {
                throw androidx.content.preferences.protobuf.InvalidProtocolBufferException.getInputSizeshNQ4ISI();
            }
            this.getOutputSizeshNQ4ISI = 8 + j;
            return ((androidx.content.preferences.protobuf.UnsafeUtil.getHighSpeedVideoFpsRangesFor(j + 7) & 255) << 56) | (androidx.content.preferences.protobuf.UnsafeUtil.getHighSpeedVideoFpsRangesFor(j) & 255) | ((androidx.content.preferences.protobuf.UnsafeUtil.getHighSpeedVideoFpsRangesFor(1 + j) & 255) << 8) | ((androidx.content.preferences.protobuf.UnsafeUtil.getHighSpeedVideoFpsRangesFor(2 + j) & 255) << 16) | ((androidx.content.preferences.protobuf.UnsafeUtil.getHighSpeedVideoFpsRangesFor(3 + j) & 255) << 24) | ((androidx.content.preferences.protobuf.UnsafeUtil.getHighSpeedVideoFpsRangesFor(4 + j) & 255) << 32) | ((androidx.content.preferences.protobuf.UnsafeUtil.getHighSpeedVideoFpsRangesFor(5 + j) & 255) << 40) | ((androidx.content.preferences.protobuf.UnsafeUtil.getHighSpeedVideoFpsRangesFor(6 + j) & 255) << 48);
        }

        @Override // androidx.content.preferences.protobuf.CodedInputStream
        public final void enableAliasing(boolean z) {
            this.getOutputFormats = z;
        }

        @Override // androidx.content.preferences.protobuf.CodedInputStream
        public final void resetSizeCounter() {
            this.getOutputStallDuration = this.getOutputSizeshNQ4ISI;
        }

        @Override // androidx.content.preferences.protobuf.CodedInputStream
        public final int pushLimit(int i) throws androidx.content.preferences.protobuf.InvalidProtocolBufferException {
            if (i < 0) {
                throw androidx.content.preferences.protobuf.InvalidProtocolBufferException.getInputFormats();
            }
            int totalBytesRead = i + getTotalBytesRead();
            int i2 = this.getHighSpeedVideoSizesFor;
            if (totalBytesRead > i2) {
                throw androidx.content.preferences.protobuf.InvalidProtocolBufferException.getInputSizeshNQ4ISI();
            }
            this.getHighSpeedVideoSizesFor = totalBytesRead;
            Camera2StreamConfigurationMap();
            return i2;
        }

        @Override // androidx.content.preferences.protobuf.CodedInputStream
        public final void popLimit(int i) {
            this.getHighSpeedVideoSizesFor = i;
            Camera2StreamConfigurationMap();
        }

        @Override // androidx.content.preferences.protobuf.CodedInputStream
        public final int getBytesUntilLimit() {
            int i = this.getHighSpeedVideoSizesFor;
            if (i == Integer.MAX_VALUE) {
                return -1;
            }
            return i - getTotalBytesRead();
        }

        @Override // androidx.content.preferences.protobuf.CodedInputStream
        public final boolean isAtEnd() throws java.io.IOException {
            return this.getOutputSizeshNQ4ISI == this.getOutputSizes;
        }

        @Override // androidx.content.preferences.protobuf.CodedInputStream
        public final int getTotalBytesRead() {
            return (int) (this.getOutputSizeshNQ4ISI - this.getOutputStallDuration);
        }

        @Override // androidx.content.preferences.protobuf.CodedInputStream
        public final byte readRawByte() throws java.io.IOException {
            long j = this.getOutputSizeshNQ4ISI;
            if (j == this.getOutputSizes) {
                throw androidx.content.preferences.protobuf.InvalidProtocolBufferException.getInputSizeshNQ4ISI();
            }
            this.getOutputSizeshNQ4ISI = 1 + j;
            return androidx.content.preferences.protobuf.UnsafeUtil.getHighSpeedVideoFpsRangesFor(j);
        }

        private void Camera2StreamConfigurationMap() {
            long j = this.getOutputSizes + this.getInputSizeshNQ4ISI;
            this.getOutputSizes = j;
            int i = (int) (j - this.getOutputStallDuration);
            int i2 = this.getHighSpeedVideoSizesFor;
            if (i > i2) {
                int i3 = i - i2;
                this.getInputSizeshNQ4ISI = i3;
                this.getOutputSizes = j - i3;
                return;
            }
            this.getInputSizeshNQ4ISI = 0;
        }

        private java.nio.ByteBuffer getHighSpeedVideoFpsRanges(long j, long j2) throws java.io.IOException {
            int position = this.getOutputMinFrameDuration.position();
            int limit = this.getOutputMinFrameDuration.limit();
            java.nio.ByteBuffer byteBuffer = this.getOutputMinFrameDuration;
            try {
                try {
                    byteBuffer.position((int) (j - this.getHighResolutionOutputSizeshNQ4ISI));
                    byteBuffer.limit((int) (j2 - this.getHighResolutionOutputSizeshNQ4ISI));
                    return this.getOutputMinFrameDuration.slice();
                } catch (java.lang.IllegalArgumentException e) {
                    androidx.content.preferences.protobuf.InvalidProtocolBufferException inputSizeshNQ4ISI = androidx.content.preferences.protobuf.InvalidProtocolBufferException.getInputSizeshNQ4ISI();
                    inputSizeshNQ4ISI.initCause(e);
                    throw inputSizeshNQ4ISI;
                }
            } finally {
                byteBuffer.position(position);
                byteBuffer.limit(limit);
            }
        }

        @Override // androidx.content.preferences.protobuf.CodedInputStream
        public final byte[] readRawBytes(int i) throws java.io.IOException {
            if (i >= 0) {
                long j = this.getOutputSizes;
                long j2 = this.getOutputSizeshNQ4ISI;
                if (i <= ((int) (j - j2))) {
                    byte[] bArr = new byte[i];
                    long j3 = i;
                    getHighSpeedVideoFpsRanges(j2, j2 + j3).get(bArr);
                    this.getOutputSizeshNQ4ISI += j3;
                    return bArr;
                }
            }
            if (i > 0) {
                throw androidx.content.preferences.protobuf.InvalidProtocolBufferException.getInputSizeshNQ4ISI();
            }
            if (i == 0) {
                return androidx.content.preferences.protobuf.Internal.EMPTY_BYTE_ARRAY;
            }
            throw androidx.content.preferences.protobuf.InvalidProtocolBufferException.getInputFormats();
        }

        @Override // androidx.content.preferences.protobuf.CodedInputStream
        public final void skipRawBytes(int i) throws java.io.IOException {
            if (i >= 0) {
                long j = this.getOutputSizes;
                long j2 = this.getOutputSizeshNQ4ISI;
                if (i <= ((int) (j - j2))) {
                    this.getOutputSizeshNQ4ISI = j2 + i;
                    return;
                }
            }
            if (i < 0) {
                throw androidx.content.preferences.protobuf.InvalidProtocolBufferException.getInputFormats();
            }
            throw androidx.content.preferences.protobuf.InvalidProtocolBufferException.getInputSizeshNQ4ISI();
        }
    }

    static final class StreamDecoder extends androidx.content.preferences.protobuf.CodedInputStream {
        private final byte[] getHighResolutionOutputSizeshNQ4ISI;
        private int getHighSpeedVideoSizesFor;
        private int getInputFormats;
        private final java.io.InputStream getInputSizeshNQ4ISI;
        private int getOutputFormats;
        private int getOutputMinFrameDuration;
        private androidx.datastore.preferences.protobuf.CodedInputStream.StreamDecoder.RefillCallback getOutputSizeshNQ4ISI;
        private int getOutputStallDuration;
        private int getOutputStallDurationlomOqCM;

        interface RefillCallback {
            void getHighSpeedVideoSizes();
        }

        @Override // androidx.content.preferences.protobuf.CodedInputStream
        public final void enableAliasing(boolean z) {
        }

        /* synthetic */ StreamDecoder(java.io.InputStream inputStream, int i, byte b) {
            this(inputStream, i);
        }

        private StreamDecoder(java.io.InputStream inputStream, int i) {
            super((byte) 0);
            this.getInputFormats = Integer.MAX_VALUE;
            this.getOutputSizeshNQ4ISI = null;
            androidx.content.preferences.protobuf.Internal.getHighSpeedVideoSizes(inputStream, "input");
            this.getInputSizeshNQ4ISI = inputStream;
            this.getHighResolutionOutputSizeshNQ4ISI = new byte[i];
            this.getOutputMinFrameDuration = 0;
            this.getOutputStallDuration = 0;
            this.getOutputStallDurationlomOqCM = 0;
        }

        private static int getHighSpeedVideoFpsRanges(java.io.InputStream inputStream, byte[] bArr, int i, int i2) throws java.io.IOException {
            try {
                return inputStream.read(bArr, i, i2);
            } catch (androidx.content.preferences.protobuf.InvalidProtocolBufferException e) {
                e.getHighSpeedVideoFpsRangesFor = true;
                throw e;
            }
        }

        private static long getHighSpeedVideoFpsRanges(java.io.InputStream inputStream, long j) throws java.io.IOException {
            try {
                return inputStream.skip(j);
            } catch (androidx.content.preferences.protobuf.InvalidProtocolBufferException e) {
                e.getHighSpeedVideoFpsRangesFor = true;
                throw e;
            }
        }

        private static int getHighSpeedVideoSizes(java.io.InputStream inputStream) throws java.io.IOException {
            try {
                return inputStream.available();
            } catch (androidx.content.preferences.protobuf.InvalidProtocolBufferException e) {
                e.getHighSpeedVideoFpsRangesFor = true;
                throw e;
            }
        }

        @Override // androidx.content.preferences.protobuf.CodedInputStream
        public final int readTag() throws java.io.IOException {
            if (isAtEnd()) {
                this.getHighSpeedVideoSizesFor = 0;
                return 0;
            }
            int readRawVarint32 = readRawVarint32();
            this.getHighSpeedVideoSizesFor = readRawVarint32;
            if (androidx.content.preferences.protobuf.WireFormat.getTagFieldNumber(readRawVarint32) == 0) {
                throw androidx.content.preferences.protobuf.InvalidProtocolBufferException.getHighSpeedVideoFpsRanges();
            }
            return this.getHighSpeedVideoSizesFor;
        }

        @Override // androidx.content.preferences.protobuf.CodedInputStream
        public final void checkLastTagWas(int i) throws androidx.content.preferences.protobuf.InvalidProtocolBufferException {
            if (this.getHighSpeedVideoSizesFor != i) {
                throw androidx.content.preferences.protobuf.InvalidProtocolBufferException.getHighSpeedVideoFpsRangesFor();
            }
        }

        @Override // androidx.content.preferences.protobuf.CodedInputStream
        public final int getLastTag() {
            return this.getHighSpeedVideoSizesFor;
        }

        @Override // androidx.content.preferences.protobuf.CodedInputStream
        public final boolean skipField(int i) throws java.io.IOException {
            int tagWireType = androidx.content.preferences.protobuf.WireFormat.getTagWireType(i);
            int i2 = 0;
            if (tagWireType == 0) {
                if (this.getOutputMinFrameDuration - this.getOutputStallDuration >= 10) {
                    while (i2 < 10) {
                        byte[] bArr = this.getHighResolutionOutputSizeshNQ4ISI;
                        int i3 = this.getOutputStallDuration;
                        this.getOutputStallDuration = i3 + 1;
                        if (bArr[i3] < 0) {
                            i2++;
                        }
                    }
                    throw androidx.content.preferences.protobuf.InvalidProtocolBufferException.Camera2StreamConfigurationMap();
                }
                while (i2 < 10) {
                    if (readRawByte() < 0) {
                        i2++;
                    }
                }
                throw androidx.content.preferences.protobuf.InvalidProtocolBufferException.Camera2StreamConfigurationMap();
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
                checkLastTagWas(androidx.content.preferences.protobuf.WireFormat.Camera2StreamConfigurationMap(androidx.content.preferences.protobuf.WireFormat.getTagFieldNumber(i), 4));
                return true;
            }
            if (tagWireType == 4) {
                return false;
            }
            if (tagWireType == 5) {
                skipRawBytes(4);
                return true;
            }
            throw androidx.content.preferences.protobuf.InvalidProtocolBufferException.getHighResolutionOutputSizeshNQ4ISI();
        }

        @Override // androidx.content.preferences.protobuf.CodedInputStream
        public final boolean skipField(int i, androidx.content.preferences.protobuf.CodedOutputStream codedOutputStream) throws java.io.IOException {
            int tagWireType = androidx.content.preferences.protobuf.WireFormat.getTagWireType(i);
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
                androidx.content.preferences.protobuf.ByteString readBytes = readBytes();
                codedOutputStream.writeUInt32NoTag(i);
                codedOutputStream.writeBytesNoTag(readBytes);
                return true;
            }
            if (tagWireType == 3) {
                codedOutputStream.writeUInt32NoTag(i);
                skipMessage(codedOutputStream);
                int Camera2StreamConfigurationMap = androidx.content.preferences.protobuf.WireFormat.Camera2StreamConfigurationMap(androidx.content.preferences.protobuf.WireFormat.getTagFieldNumber(i), 4);
                checkLastTagWas(Camera2StreamConfigurationMap);
                codedOutputStream.writeUInt32NoTag(Camera2StreamConfigurationMap);
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
            throw androidx.content.preferences.protobuf.InvalidProtocolBufferException.getHighResolutionOutputSizeshNQ4ISI();
        }

        /* loaded from: classes7.dex */
        class SkippedDataSink implements androidx.datastore.preferences.protobuf.CodedInputStream.StreamDecoder.RefillCallback {
            private int Camera2StreamConfigurationMap;
            private java.io.ByteArrayOutputStream getHighResolutionOutputSizeshNQ4ISI;
            final /* synthetic */ androidx.datastore.preferences.protobuf.CodedInputStream.StreamDecoder getHighSpeedVideoSizes;

            @Override // androidx.datastore.preferences.protobuf.CodedInputStream.StreamDecoder.RefillCallback
            public final void getHighSpeedVideoSizes() {
                if (this.getHighResolutionOutputSizeshNQ4ISI == null) {
                    this.getHighResolutionOutputSizeshNQ4ISI = new java.io.ByteArrayOutputStream();
                }
                this.getHighResolutionOutputSizeshNQ4ISI.write(this.getHighSpeedVideoSizes.getHighResolutionOutputSizeshNQ4ISI, this.Camera2StreamConfigurationMap, this.getHighSpeedVideoSizes.getOutputStallDuration - this.Camera2StreamConfigurationMap);
                this.Camera2StreamConfigurationMap = 0;
            }
        }

        @Override // androidx.content.preferences.protobuf.CodedInputStream
        public final double readDouble() throws java.io.IOException {
            return java.lang.Double.longBitsToDouble(readRawLittleEndian64());
        }

        @Override // androidx.content.preferences.protobuf.CodedInputStream
        public final float readFloat() throws java.io.IOException {
            return java.lang.Float.intBitsToFloat(readRawLittleEndian32());
        }

        @Override // androidx.content.preferences.protobuf.CodedInputStream
        public final long readUInt64() throws java.io.IOException {
            return readRawVarint64();
        }

        @Override // androidx.content.preferences.protobuf.CodedInputStream
        public final long readInt64() throws java.io.IOException {
            return readRawVarint64();
        }

        @Override // androidx.content.preferences.protobuf.CodedInputStream
        public final int readInt32() throws java.io.IOException {
            return readRawVarint32();
        }

        @Override // androidx.content.preferences.protobuf.CodedInputStream
        public final long readFixed64() throws java.io.IOException {
            return readRawLittleEndian64();
        }

        @Override // androidx.content.preferences.protobuf.CodedInputStream
        public final int readFixed32() throws java.io.IOException {
            return readRawLittleEndian32();
        }

        @Override // androidx.content.preferences.protobuf.CodedInputStream
        public final boolean readBool() throws java.io.IOException {
            return readRawVarint64() != 0;
        }

        @Override // androidx.content.preferences.protobuf.CodedInputStream
        public final java.lang.String readString() throws java.io.IOException {
            int readRawVarint32 = readRawVarint32();
            if (readRawVarint32 > 0) {
                int i = this.getOutputMinFrameDuration;
                int i2 = this.getOutputStallDuration;
                if (readRawVarint32 <= i - i2) {
                    java.lang.String str = new java.lang.String(this.getHighResolutionOutputSizeshNQ4ISI, i2, readRawVarint32, androidx.content.preferences.protobuf.Internal.getHighSpeedVideoSizes);
                    this.getOutputStallDuration += readRawVarint32;
                    return str;
                }
            }
            if (readRawVarint32 == 0) {
                return "";
            }
            if (readRawVarint32 < 0) {
                throw androidx.content.preferences.protobuf.InvalidProtocolBufferException.getInputFormats();
            }
            if (readRawVarint32 <= this.getOutputMinFrameDuration) {
                getHighResolutionOutputSizeshNQ4ISI(readRawVarint32);
                java.lang.String str2 = new java.lang.String(this.getHighResolutionOutputSizeshNQ4ISI, this.getOutputStallDuration, readRawVarint32, androidx.content.preferences.protobuf.Internal.getHighSpeedVideoSizes);
                this.getOutputStallDuration += readRawVarint32;
                return str2;
            }
            return new java.lang.String(getHighSpeedVideoSizes(readRawVarint32, false), androidx.content.preferences.protobuf.Internal.getHighSpeedVideoSizes);
        }

        @Override // androidx.content.preferences.protobuf.CodedInputStream
        public final java.lang.String readStringRequireUtf8() throws java.io.IOException {
            byte[] highSpeedVideoSizes;
            int readRawVarint32 = readRawVarint32();
            int i = this.getOutputStallDuration;
            int i2 = this.getOutputMinFrameDuration;
            if (readRawVarint32 <= i2 - i && readRawVarint32 > 0) {
                highSpeedVideoSizes = this.getHighResolutionOutputSizeshNQ4ISI;
                this.getOutputStallDuration = i + readRawVarint32;
            } else {
                if (readRawVarint32 == 0) {
                    return "";
                }
                if (readRawVarint32 < 0) {
                    throw androidx.content.preferences.protobuf.InvalidProtocolBufferException.getInputFormats();
                }
                i = 0;
                if (readRawVarint32 <= i2) {
                    getHighResolutionOutputSizeshNQ4ISI(readRawVarint32);
                    highSpeedVideoSizes = this.getHighResolutionOutputSizeshNQ4ISI;
                    this.getOutputStallDuration = readRawVarint32;
                } else {
                    highSpeedVideoSizes = getHighSpeedVideoSizes(readRawVarint32, false);
                }
            }
            return androidx.content.preferences.protobuf.Utf8.getHighSpeedVideoFpsRanges(highSpeedVideoSizes, i, readRawVarint32);
        }

        @Override // androidx.content.preferences.protobuf.CodedInputStream
        public final void readGroup(int i, androidx.datastore.preferences.protobuf.MessageLite.Builder builder, androidx.content.preferences.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
            checkRecursionLimit();
            this.Camera2StreamConfigurationMap++;
            builder.mergeFrom(this, extensionRegistryLite);
            checkLastTagWas(androidx.content.preferences.protobuf.WireFormat.Camera2StreamConfigurationMap(i, 4));
            this.Camera2StreamConfigurationMap--;
        }

        @Override // androidx.content.preferences.protobuf.CodedInputStream
        public final <T extends androidx.content.preferences.protobuf.MessageLite> T readGroup(int i, androidx.content.preferences.protobuf.Parser<T> parser, androidx.content.preferences.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
            checkRecursionLimit();
            this.Camera2StreamConfigurationMap++;
            T parsePartialFrom = parser.parsePartialFrom(this, extensionRegistryLite);
            checkLastTagWas(androidx.content.preferences.protobuf.WireFormat.Camera2StreamConfigurationMap(i, 4));
            this.Camera2StreamConfigurationMap--;
            return parsePartialFrom;
        }

        @Override // androidx.content.preferences.protobuf.CodedInputStream
        @java.lang.Deprecated
        public final void readUnknownGroup(int i, androidx.datastore.preferences.protobuf.MessageLite.Builder builder) throws java.io.IOException {
            readGroup(i, builder, androidx.content.preferences.protobuf.ExtensionRegistryLite.getEmptyRegistry());
        }

        @Override // androidx.content.preferences.protobuf.CodedInputStream
        public final void readMessage(androidx.datastore.preferences.protobuf.MessageLite.Builder builder, androidx.content.preferences.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
            int readRawVarint32 = readRawVarint32();
            checkRecursionLimit();
            int pushLimit = pushLimit(readRawVarint32);
            this.Camera2StreamConfigurationMap++;
            builder.mergeFrom(this, extensionRegistryLite);
            checkLastTagWas(0);
            this.Camera2StreamConfigurationMap--;
            if (getBytesUntilLimit() != 0) {
                throw androidx.content.preferences.protobuf.InvalidProtocolBufferException.getInputSizeshNQ4ISI();
            }
            popLimit(pushLimit);
        }

        @Override // androidx.content.preferences.protobuf.CodedInputStream
        public final <T extends androidx.content.preferences.protobuf.MessageLite> T readMessage(androidx.content.preferences.protobuf.Parser<T> parser, androidx.content.preferences.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
            int readRawVarint32 = readRawVarint32();
            checkRecursionLimit();
            int pushLimit = pushLimit(readRawVarint32);
            this.Camera2StreamConfigurationMap++;
            T parsePartialFrom = parser.parsePartialFrom(this, extensionRegistryLite);
            checkLastTagWas(0);
            this.Camera2StreamConfigurationMap--;
            if (getBytesUntilLimit() != 0) {
                throw androidx.content.preferences.protobuf.InvalidProtocolBufferException.getInputSizeshNQ4ISI();
            }
            popLimit(pushLimit);
            return parsePartialFrom;
        }

        @Override // androidx.content.preferences.protobuf.CodedInputStream
        public final androidx.content.preferences.protobuf.ByteString readBytes() throws java.io.IOException {
            int readRawVarint32 = readRawVarint32();
            int i = this.getOutputMinFrameDuration;
            int i2 = this.getOutputStallDuration;
            if (readRawVarint32 <= i - i2 && readRawVarint32 > 0) {
                androidx.content.preferences.protobuf.ByteString copyFrom = androidx.content.preferences.protobuf.ByteString.copyFrom(this.getHighResolutionOutputSizeshNQ4ISI, i2, readRawVarint32);
                this.getOutputStallDuration += readRawVarint32;
                return copyFrom;
            }
            if (readRawVarint32 == 0) {
                return androidx.content.preferences.protobuf.ByteString.EMPTY;
            }
            if (readRawVarint32 < 0) {
                throw androidx.content.preferences.protobuf.InvalidProtocolBufferException.getInputFormats();
            }
            byte[] Camera2StreamConfigurationMap = Camera2StreamConfigurationMap(readRawVarint32);
            if (Camera2StreamConfigurationMap != null) {
                return androidx.content.preferences.protobuf.ByteString.copyFrom(Camera2StreamConfigurationMap);
            }
            int i3 = this.getOutputStallDuration;
            int i4 = this.getOutputMinFrameDuration;
            int i5 = i4 - i3;
            this.getOutputStallDurationlomOqCM += i4;
            this.getOutputStallDuration = 0;
            this.getOutputMinFrameDuration = 0;
            java.util.List<byte[]> highSpeedVideoSizes = getHighSpeedVideoSizes(readRawVarint32 - i5);
            byte[] bArr = new byte[readRawVarint32];
            java.lang.System.arraycopy(this.getHighResolutionOutputSizeshNQ4ISI, i3, bArr, 0, i5);
            for (byte[] bArr2 : highSpeedVideoSizes) {
                java.lang.System.arraycopy(bArr2, 0, bArr, i5, bArr2.length);
                i5 += bArr2.length;
            }
            return androidx.content.preferences.protobuf.ByteString.getHighSpeedVideoSizes(bArr);
        }

        @Override // androidx.content.preferences.protobuf.CodedInputStream
        public final byte[] readByteArray() throws java.io.IOException {
            int readRawVarint32 = readRawVarint32();
            int i = this.getOutputMinFrameDuration;
            int i2 = this.getOutputStallDuration;
            if (readRawVarint32 > i - i2 || readRawVarint32 <= 0) {
                if (readRawVarint32 < 0) {
                    throw androidx.content.preferences.protobuf.InvalidProtocolBufferException.getInputFormats();
                }
                return getHighSpeedVideoSizes(readRawVarint32, false);
            }
            byte[] copyOfRange = java.util.Arrays.copyOfRange(this.getHighResolutionOutputSizeshNQ4ISI, i2, i2 + readRawVarint32);
            this.getOutputStallDuration += readRawVarint32;
            return copyOfRange;
        }

        @Override // androidx.content.preferences.protobuf.CodedInputStream
        public final java.nio.ByteBuffer readByteBuffer() throws java.io.IOException {
            int readRawVarint32 = readRawVarint32();
            int i = this.getOutputMinFrameDuration;
            int i2 = this.getOutputStallDuration;
            if (readRawVarint32 <= i - i2 && readRawVarint32 > 0) {
                java.nio.ByteBuffer wrap = java.nio.ByteBuffer.wrap(java.util.Arrays.copyOfRange(this.getHighResolutionOutputSizeshNQ4ISI, i2, i2 + readRawVarint32));
                this.getOutputStallDuration += readRawVarint32;
                return wrap;
            }
            if (readRawVarint32 == 0) {
                return androidx.content.preferences.protobuf.Internal.EMPTY_BYTE_BUFFER;
            }
            if (readRawVarint32 < 0) {
                throw androidx.content.preferences.protobuf.InvalidProtocolBufferException.getInputFormats();
            }
            return java.nio.ByteBuffer.wrap(getHighSpeedVideoSizes(readRawVarint32, true));
        }

        @Override // androidx.content.preferences.protobuf.CodedInputStream
        public final int readUInt32() throws java.io.IOException {
            return readRawVarint32();
        }

        @Override // androidx.content.preferences.protobuf.CodedInputStream
        public final int readEnum() throws java.io.IOException {
            return readRawVarint32();
        }

        @Override // androidx.content.preferences.protobuf.CodedInputStream
        public final int readSFixed32() throws java.io.IOException {
            return readRawLittleEndian32();
        }

        @Override // androidx.content.preferences.protobuf.CodedInputStream
        public final long readSFixed64() throws java.io.IOException {
            return readRawLittleEndian64();
        }

        @Override // androidx.content.preferences.protobuf.CodedInputStream
        public final int readSInt32() throws java.io.IOException {
            return decodeZigZag32(readRawVarint32());
        }

        @Override // androidx.content.preferences.protobuf.CodedInputStream
        public final long readSInt64() throws java.io.IOException {
            return decodeZigZag64(readRawVarint64());
        }

        @Override // androidx.content.preferences.protobuf.CodedInputStream
        public final int readRawVarint32() throws java.io.IOException {
            int i;
            int i2 = this.getOutputStallDuration;
            int i3 = this.getOutputMinFrameDuration;
            if (i3 != i2) {
                byte[] bArr = this.getHighResolutionOutputSizeshNQ4ISI;
                int i4 = i2 + 1;
                byte b = bArr[i2];
                if (b >= 0) {
                    this.getOutputStallDuration = i4;
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
                    this.getOutputStallDuration = i5;
                    return i;
                }
            }
            return (int) getHighSpeedVideoFpsRangesFor();
        }

        @Override // androidx.content.preferences.protobuf.CodedInputStream
        public final long readRawVarint64() throws java.io.IOException {
            long j;
            long j2;
            long j3;
            int i = this.getOutputStallDuration;
            int i2 = this.getOutputMinFrameDuration;
            if (i2 != i) {
                byte[] bArr = this.getHighResolutionOutputSizeshNQ4ISI;
                int i3 = i + 1;
                byte b = bArr[i];
                if (b >= 0) {
                    this.getOutputStallDuration = i3;
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
                    this.getOutputStallDuration = i4;
                    return j;
                }
            }
            return getHighSpeedVideoFpsRangesFor();
        }

        @Override // androidx.content.preferences.protobuf.CodedInputStream
        final long getHighSpeedVideoFpsRangesFor() throws java.io.IOException {
            long j = 0;
            for (int i = 0; i < 64; i += 7) {
                j |= (r3 & Byte.MAX_VALUE) << i;
                if ((readRawByte() & 128) == 0) {
                    return j;
                }
            }
            throw androidx.content.preferences.protobuf.InvalidProtocolBufferException.Camera2StreamConfigurationMap();
        }

        @Override // androidx.content.preferences.protobuf.CodedInputStream
        public final int readRawLittleEndian32() throws java.io.IOException {
            int i = this.getOutputStallDuration;
            if (this.getOutputMinFrameDuration - i < 4) {
                getHighResolutionOutputSizeshNQ4ISI(4);
                i = this.getOutputStallDuration;
            }
            byte[] bArr = this.getHighResolutionOutputSizeshNQ4ISI;
            this.getOutputStallDuration = i + 4;
            return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
        }

        @Override // androidx.content.preferences.protobuf.CodedInputStream
        public final long readRawLittleEndian64() throws java.io.IOException {
            int i = this.getOutputStallDuration;
            if (this.getOutputMinFrameDuration - i < 8) {
                getHighResolutionOutputSizeshNQ4ISI(8);
                i = this.getOutputStallDuration;
            }
            byte[] bArr = this.getHighResolutionOutputSizeshNQ4ISI;
            this.getOutputStallDuration = i + 8;
            return ((bArr[i + 7] & 255) << 56) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24) | ((bArr[i + 4] & 255) << 32) | ((bArr[i + 5] & 255) << 40) | ((bArr[i + 6] & 255) << 48);
        }

        @Override // androidx.content.preferences.protobuf.CodedInputStream
        public final void resetSizeCounter() {
            this.getOutputStallDurationlomOqCM = -this.getOutputStallDuration;
        }

        @Override // androidx.content.preferences.protobuf.CodedInputStream
        public final int pushLimit(int i) throws androidx.content.preferences.protobuf.InvalidProtocolBufferException {
            if (i < 0) {
                throw androidx.content.preferences.protobuf.InvalidProtocolBufferException.getInputFormats();
            }
            int i2 = i + this.getOutputStallDurationlomOqCM + this.getOutputStallDuration;
            if (i2 < 0) {
                throw androidx.content.preferences.protobuf.InvalidProtocolBufferException.getOutputMinFrameDuration();
            }
            int i3 = this.getInputFormats;
            if (i2 > i3) {
                throw androidx.content.preferences.protobuf.InvalidProtocolBufferException.getInputSizeshNQ4ISI();
            }
            this.getInputFormats = i2;
            Camera2StreamConfigurationMap();
            return i3;
        }

        private void Camera2StreamConfigurationMap() {
            int i = this.getOutputMinFrameDuration + this.getOutputFormats;
            this.getOutputMinFrameDuration = i;
            int i2 = this.getOutputStallDurationlomOqCM + i;
            int i3 = this.getInputFormats;
            if (i2 > i3) {
                int i4 = i2 - i3;
                this.getOutputFormats = i4;
                this.getOutputMinFrameDuration = i - i4;
                return;
            }
            this.getOutputFormats = 0;
        }

        @Override // androidx.content.preferences.protobuf.CodedInputStream
        public final void popLimit(int i) {
            this.getInputFormats = i;
            Camera2StreamConfigurationMap();
        }

        @Override // androidx.content.preferences.protobuf.CodedInputStream
        public final int getBytesUntilLimit() {
            int i = this.getInputFormats;
            if (i == Integer.MAX_VALUE) {
                return -1;
            }
            return i - (this.getOutputStallDurationlomOqCM + this.getOutputStallDuration);
        }

        @Override // androidx.content.preferences.protobuf.CodedInputStream
        public final boolean isAtEnd() throws java.io.IOException {
            return this.getOutputStallDuration == this.getOutputMinFrameDuration && !getHighSpeedVideoFpsRangesFor(1);
        }

        @Override // androidx.content.preferences.protobuf.CodedInputStream
        public final int getTotalBytesRead() {
            return this.getOutputStallDurationlomOqCM + this.getOutputStallDuration;
        }

        private void getHighResolutionOutputSizeshNQ4ISI(int i) throws java.io.IOException {
            if (getHighSpeedVideoFpsRangesFor(i)) {
                return;
            }
            if (i > (this.getHighSpeedVideoFpsRanges - this.getOutputStallDurationlomOqCM) - this.getOutputStallDuration) {
                throw androidx.content.preferences.protobuf.InvalidProtocolBufferException.getHighSpeedVideoSizesFor();
            }
            throw androidx.content.preferences.protobuf.InvalidProtocolBufferException.getInputSizeshNQ4ISI();
        }

        private boolean getHighSpeedVideoFpsRangesFor(int i) throws java.io.IOException {
            while (this.getOutputStallDuration + i > this.getOutputMinFrameDuration) {
                int i2 = this.getHighSpeedVideoFpsRanges;
                int i3 = this.getOutputStallDurationlomOqCM;
                int i4 = this.getOutputStallDuration;
                if (i > (i2 - i3) - i4 || i3 + i4 + i > this.getInputFormats) {
                    return false;
                }
                androidx.datastore.preferences.protobuf.CodedInputStream.StreamDecoder.RefillCallback refillCallback = this.getOutputSizeshNQ4ISI;
                if (refillCallback != null) {
                    refillCallback.getHighSpeedVideoSizes();
                }
                int i5 = this.getOutputStallDuration;
                if (i5 > 0) {
                    int i6 = this.getOutputMinFrameDuration;
                    if (i6 > i5) {
                        byte[] bArr = this.getHighResolutionOutputSizeshNQ4ISI;
                        java.lang.System.arraycopy(bArr, i5, bArr, 0, i6 - i5);
                    }
                    this.getOutputStallDurationlomOqCM += i5;
                    this.getOutputMinFrameDuration -= i5;
                    this.getOutputStallDuration = 0;
                }
                java.io.InputStream inputStream = this.getInputSizeshNQ4ISI;
                byte[] bArr2 = this.getHighResolutionOutputSizeshNQ4ISI;
                int i7 = this.getOutputMinFrameDuration;
                int highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges(inputStream, bArr2, i7, java.lang.Math.min(bArr2.length - i7, (this.getHighSpeedVideoFpsRanges - this.getOutputStallDurationlomOqCM) - this.getOutputMinFrameDuration));
                if (highSpeedVideoFpsRanges == 0 || highSpeedVideoFpsRanges < -1 || highSpeedVideoFpsRanges > this.getHighResolutionOutputSizeshNQ4ISI.length) {
                    java.lang.StringBuilder sb = new java.lang.StringBuilder();
                    sb.append(this.getInputSizeshNQ4ISI.getClass());
                    sb.append("#read(byte[]) returned invalid result: ");
                    sb.append(highSpeedVideoFpsRanges);
                    sb.append("\nThe InputStream implementation is buggy.");
                    throw new java.lang.IllegalStateException(sb.toString());
                }
                if (highSpeedVideoFpsRanges <= 0) {
                    return false;
                }
                this.getOutputMinFrameDuration += highSpeedVideoFpsRanges;
                Camera2StreamConfigurationMap();
                if (this.getOutputMinFrameDuration >= i) {
                    return true;
                }
            }
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder("refillBuffer() called when ");
            sb2.append(i);
            sb2.append(" bytes were already available in buffer");
            throw new java.lang.IllegalStateException(sb2.toString());
        }

        @Override // androidx.content.preferences.protobuf.CodedInputStream
        public final byte readRawByte() throws java.io.IOException {
            if (this.getOutputStallDuration == this.getOutputMinFrameDuration) {
                getHighResolutionOutputSizeshNQ4ISI(1);
            }
            byte[] bArr = this.getHighResolutionOutputSizeshNQ4ISI;
            int i = this.getOutputStallDuration;
            this.getOutputStallDuration = i + 1;
            return bArr[i];
        }

        @Override // androidx.content.preferences.protobuf.CodedInputStream
        public final byte[] readRawBytes(int i) throws java.io.IOException {
            int i2 = this.getOutputStallDuration;
            if (i <= this.getOutputMinFrameDuration - i2 && i > 0) {
                int i3 = i + i2;
                this.getOutputStallDuration = i3;
                return java.util.Arrays.copyOfRange(this.getHighResolutionOutputSizeshNQ4ISI, i2, i3);
            }
            return getHighSpeedVideoSizes(i, false);
        }

        private byte[] getHighSpeedVideoSizes(int i, boolean z) throws java.io.IOException {
            byte[] Camera2StreamConfigurationMap = Camera2StreamConfigurationMap(i);
            if (Camera2StreamConfigurationMap != null) {
                return z ? (byte[]) Camera2StreamConfigurationMap.clone() : Camera2StreamConfigurationMap;
            }
            int i2 = this.getOutputStallDuration;
            int i3 = this.getOutputMinFrameDuration;
            int i4 = i3 - i2;
            this.getOutputStallDurationlomOqCM += i3;
            this.getOutputStallDuration = 0;
            this.getOutputMinFrameDuration = 0;
            java.util.List<byte[]> highSpeedVideoSizes = getHighSpeedVideoSizes(i - i4);
            byte[] bArr = new byte[i];
            java.lang.System.arraycopy(this.getHighResolutionOutputSizeshNQ4ISI, i2, bArr, 0, i4);
            for (byte[] bArr2 : highSpeedVideoSizes) {
                java.lang.System.arraycopy(bArr2, 0, bArr, i4, bArr2.length);
                i4 += bArr2.length;
            }
            return bArr;
        }

        private byte[] Camera2StreamConfigurationMap(int i) throws java.io.IOException {
            if (i == 0) {
                return androidx.content.preferences.protobuf.Internal.EMPTY_BYTE_ARRAY;
            }
            if (i < 0) {
                throw androidx.content.preferences.protobuf.InvalidProtocolBufferException.getInputFormats();
            }
            int i2 = this.getOutputStallDurationlomOqCM + this.getOutputStallDuration + i;
            if (i2 - this.getHighSpeedVideoFpsRanges > 0) {
                throw androidx.content.preferences.protobuf.InvalidProtocolBufferException.getHighSpeedVideoSizesFor();
            }
            int i3 = this.getInputFormats;
            if (i2 > i3) {
                skipRawBytes((i3 - this.getOutputStallDurationlomOqCM) - this.getOutputStallDuration);
                throw androidx.content.preferences.protobuf.InvalidProtocolBufferException.getInputSizeshNQ4ISI();
            }
            int i4 = this.getOutputMinFrameDuration - this.getOutputStallDuration;
            int i5 = i - i4;
            if (i5 >= 4096 && i5 > getHighSpeedVideoSizes(this.getInputSizeshNQ4ISI)) {
                return null;
            }
            byte[] bArr = new byte[i];
            java.lang.System.arraycopy(this.getHighResolutionOutputSizeshNQ4ISI, this.getOutputStallDuration, bArr, 0, i4);
            this.getOutputStallDurationlomOqCM += this.getOutputMinFrameDuration;
            this.getOutputStallDuration = 0;
            this.getOutputMinFrameDuration = 0;
            while (i4 < i) {
                int highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges(this.getInputSizeshNQ4ISI, bArr, i4, i - i4);
                if (highSpeedVideoFpsRanges == -1) {
                    throw androidx.content.preferences.protobuf.InvalidProtocolBufferException.getInputSizeshNQ4ISI();
                }
                this.getOutputStallDurationlomOqCM += highSpeedVideoFpsRanges;
                i4 += highSpeedVideoFpsRanges;
            }
            return bArr;
        }

        private java.util.List<byte[]> getHighSpeedVideoSizes(int i) throws java.io.IOException {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            while (i > 0) {
                int min = java.lang.Math.min(i, 4096);
                byte[] bArr = new byte[min];
                int i2 = 0;
                while (i2 < min) {
                    int read = this.getInputSizeshNQ4ISI.read(bArr, i2, min - i2);
                    if (read == -1) {
                        throw androidx.content.preferences.protobuf.InvalidProtocolBufferException.getInputSizeshNQ4ISI();
                    }
                    this.getOutputStallDurationlomOqCM += read;
                    i2 += read;
                }
                i -= min;
                arrayList.add(bArr);
            }
            return arrayList;
        }

        @Override // androidx.content.preferences.protobuf.CodedInputStream
        public final void skipRawBytes(int i) throws java.io.IOException {
            int i2 = this.getOutputMinFrameDuration;
            int i3 = this.getOutputStallDuration;
            if (i <= i2 - i3 && i >= 0) {
                this.getOutputStallDuration = i3 + i;
                return;
            }
            if (i < 0) {
                throw androidx.content.preferences.protobuf.InvalidProtocolBufferException.getInputFormats();
            }
            int i4 = this.getOutputStallDurationlomOqCM;
            int i5 = this.getInputFormats;
            int i6 = i4 + i3;
            if (i6 + i > i5) {
                skipRawBytes((i5 - i4) - i3);
                throw androidx.content.preferences.protobuf.InvalidProtocolBufferException.getInputSizeshNQ4ISI();
            }
            int i7 = 0;
            if (this.getOutputSizeshNQ4ISI == null) {
                this.getOutputStallDurationlomOqCM = i6;
                this.getOutputMinFrameDuration = 0;
                this.getOutputStallDuration = 0;
                i7 = i2 - i3;
                while (i7 < i) {
                    try {
                        long j = i - i7;
                        long highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges(this.getInputSizeshNQ4ISI, j);
                        if (highSpeedVideoFpsRanges >= 0 && highSpeedVideoFpsRanges <= j) {
                            if (highSpeedVideoFpsRanges == 0) {
                                break;
                            } else {
                                i7 += (int) highSpeedVideoFpsRanges;
                            }
                        } else {
                            java.lang.StringBuilder sb = new java.lang.StringBuilder();
                            sb.append(this.getInputSizeshNQ4ISI.getClass());
                            sb.append("#skip returned invalid result: ");
                            sb.append(highSpeedVideoFpsRanges);
                            sb.append("\nThe InputStream implementation is buggy.");
                            throw new java.lang.IllegalStateException(sb.toString());
                        }
                    } finally {
                        this.getOutputStallDurationlomOqCM += i7;
                        Camera2StreamConfigurationMap();
                    }
                }
            }
            if (i7 >= i) {
                return;
            }
            int i8 = this.getOutputMinFrameDuration;
            int i9 = i8 - this.getOutputStallDuration;
            this.getOutputStallDuration = i8;
            getHighResolutionOutputSizeshNQ4ISI(1);
            while (true) {
                int i10 = i - i9;
                int i11 = this.getOutputMinFrameDuration;
                if (i10 > i11) {
                    i9 += i11;
                    this.getOutputStallDuration = i11;
                    getHighResolutionOutputSizeshNQ4ISI(1);
                } else {
                    this.getOutputStallDuration = i10;
                    return;
                }
            }
        }
    }

    /* loaded from: classes7.dex */
    static final class IterableDirectByteBufferDecoder extends androidx.content.preferences.protobuf.CodedInputStream {
        private int getHighResolutionOutputSizeshNQ4ISI;
        private long getHighSpeedVideoSizesFor;
        private long getInputFormats;
        private long getInputSizeshNQ4ISI;
        private long getOutputFormats;
        private java.nio.ByteBuffer getOutputMinFrameDuration;
        private final java.util.Iterator<java.nio.ByteBuffer> getOutputMinFrameDurationlomOqCM;
        private int getOutputSizes;
        private final boolean getOutputSizeshNQ4ISI;
        private boolean getOutputStallDuration;
        private final java.lang.Iterable<java.nio.ByteBuffer> getOutputStallDurationlomOqCM;
        private int getValidOutputFormatsForInputhNQ4ISI;
        private int isOutputSupportedFor;
        private int isOutputSupportedForhNQ4ISI;
        private int toString;

        /* synthetic */ IterableDirectByteBufferDecoder(java.lang.Iterable iterable, int i, boolean z, byte b) {
            this(iterable, i, z);
        }

        private IterableDirectByteBufferDecoder(java.lang.Iterable<java.nio.ByteBuffer> iterable, int i, boolean z) {
            super((byte) 0);
            this.getOutputSizes = Integer.MAX_VALUE;
            this.getValidOutputFormatsForInputhNQ4ISI = i;
            this.getOutputStallDurationlomOqCM = iterable;
            this.getOutputMinFrameDurationlomOqCM = iterable.iterator();
            this.getOutputSizeshNQ4ISI = z;
            this.toString = 0;
            this.isOutputSupportedFor = 0;
            if (i == 0) {
                this.getOutputMinFrameDuration = androidx.content.preferences.protobuf.Internal.EMPTY_BYTE_BUFFER;
                this.getInputFormats = 0L;
                this.getOutputFormats = 0L;
                this.getInputSizeshNQ4ISI = 0L;
                this.getHighSpeedVideoSizesFor = 0L;
                return;
            }
            getHighSpeedVideoFpsRanges();
        }

        private void getHighSpeedVideoFpsRanges() {
            java.nio.ByteBuffer next = this.getOutputMinFrameDurationlomOqCM.next();
            this.getOutputMinFrameDuration = next;
            this.toString += (int) (this.getInputFormats - this.getOutputFormats);
            long position = next.position();
            this.getInputFormats = position;
            this.getOutputFormats = position;
            this.getInputSizeshNQ4ISI = this.getOutputMinFrameDuration.limit();
            long highSpeedVideoSizes = androidx.content.preferences.protobuf.UnsafeUtil.getHighSpeedVideoSizes(this.getOutputMinFrameDuration);
            this.getHighSpeedVideoSizesFor = highSpeedVideoSizes;
            this.getInputFormats += highSpeedVideoSizes;
            this.getOutputFormats += highSpeedVideoSizes;
            this.getInputSizeshNQ4ISI += highSpeedVideoSizes;
        }

        @Override // androidx.content.preferences.protobuf.CodedInputStream
        public final int readTag() throws java.io.IOException {
            if (isAtEnd()) {
                this.isOutputSupportedForhNQ4ISI = 0;
                return 0;
            }
            int readRawVarint32 = readRawVarint32();
            this.isOutputSupportedForhNQ4ISI = readRawVarint32;
            if (androidx.content.preferences.protobuf.WireFormat.getTagFieldNumber(readRawVarint32) == 0) {
                throw androidx.content.preferences.protobuf.InvalidProtocolBufferException.getHighSpeedVideoFpsRanges();
            }
            return this.isOutputSupportedForhNQ4ISI;
        }

        @Override // androidx.content.preferences.protobuf.CodedInputStream
        public final void checkLastTagWas(int i) throws androidx.content.preferences.protobuf.InvalidProtocolBufferException {
            if (this.isOutputSupportedForhNQ4ISI != i) {
                throw androidx.content.preferences.protobuf.InvalidProtocolBufferException.getHighSpeedVideoFpsRangesFor();
            }
        }

        @Override // androidx.content.preferences.protobuf.CodedInputStream
        public final int getLastTag() {
            return this.isOutputSupportedForhNQ4ISI;
        }

        @Override // androidx.content.preferences.protobuf.CodedInputStream
        public final boolean skipField(int i) throws java.io.IOException {
            int tagWireType = androidx.content.preferences.protobuf.WireFormat.getTagWireType(i);
            if (tagWireType == 0) {
                for (int i2 = 0; i2 < 10; i2++) {
                    if (readRawByte() >= 0) {
                        return true;
                    }
                }
                throw androidx.content.preferences.protobuf.InvalidProtocolBufferException.Camera2StreamConfigurationMap();
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
                checkLastTagWas(androidx.content.preferences.protobuf.WireFormat.Camera2StreamConfigurationMap(androidx.content.preferences.protobuf.WireFormat.getTagFieldNumber(i), 4));
                return true;
            }
            if (tagWireType == 4) {
                return false;
            }
            if (tagWireType == 5) {
                skipRawBytes(4);
                return true;
            }
            throw androidx.content.preferences.protobuf.InvalidProtocolBufferException.getHighResolutionOutputSizeshNQ4ISI();
        }

        @Override // androidx.content.preferences.protobuf.CodedInputStream
        public final boolean skipField(int i, androidx.content.preferences.protobuf.CodedOutputStream codedOutputStream) throws java.io.IOException {
            int tagWireType = androidx.content.preferences.protobuf.WireFormat.getTagWireType(i);
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
                androidx.content.preferences.protobuf.ByteString readBytes = readBytes();
                codedOutputStream.writeUInt32NoTag(i);
                codedOutputStream.writeBytesNoTag(readBytes);
                return true;
            }
            if (tagWireType == 3) {
                codedOutputStream.writeUInt32NoTag(i);
                skipMessage(codedOutputStream);
                int Camera2StreamConfigurationMap = androidx.content.preferences.protobuf.WireFormat.Camera2StreamConfigurationMap(androidx.content.preferences.protobuf.WireFormat.getTagFieldNumber(i), 4);
                checkLastTagWas(Camera2StreamConfigurationMap);
                codedOutputStream.writeUInt32NoTag(Camera2StreamConfigurationMap);
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
            throw androidx.content.preferences.protobuf.InvalidProtocolBufferException.getHighResolutionOutputSizeshNQ4ISI();
        }

        @Override // androidx.content.preferences.protobuf.CodedInputStream
        public final double readDouble() throws java.io.IOException {
            return java.lang.Double.longBitsToDouble(readRawLittleEndian64());
        }

        @Override // androidx.content.preferences.protobuf.CodedInputStream
        public final float readFloat() throws java.io.IOException {
            return java.lang.Float.intBitsToFloat(readRawLittleEndian32());
        }

        @Override // androidx.content.preferences.protobuf.CodedInputStream
        public final long readUInt64() throws java.io.IOException {
            return readRawVarint64();
        }

        @Override // androidx.content.preferences.protobuf.CodedInputStream
        public final long readInt64() throws java.io.IOException {
            return readRawVarint64();
        }

        @Override // androidx.content.preferences.protobuf.CodedInputStream
        public final int readInt32() throws java.io.IOException {
            return readRawVarint32();
        }

        @Override // androidx.content.preferences.protobuf.CodedInputStream
        public final long readFixed64() throws java.io.IOException {
            return readRawLittleEndian64();
        }

        @Override // androidx.content.preferences.protobuf.CodedInputStream
        public final int readFixed32() throws java.io.IOException {
            return readRawLittleEndian32();
        }

        @Override // androidx.content.preferences.protobuf.CodedInputStream
        public final boolean readBool() throws java.io.IOException {
            return readRawVarint64() != 0;
        }

        @Override // androidx.content.preferences.protobuf.CodedInputStream
        public final java.lang.String readString() throws java.io.IOException {
            int readRawVarint32 = readRawVarint32();
            if (readRawVarint32 > 0) {
                long j = readRawVarint32;
                long j2 = this.getInputSizeshNQ4ISI;
                long j3 = this.getInputFormats;
                if (j <= j2 - j3) {
                    byte[] bArr = new byte[readRawVarint32];
                    androidx.content.preferences.protobuf.UnsafeUtil.getHighSpeedVideoFpsRanges(j3, bArr, 0L, j);
                    java.lang.String str = new java.lang.String(bArr, androidx.content.preferences.protobuf.Internal.getHighSpeedVideoSizes);
                    this.getInputFormats += j;
                    return str;
                }
            }
            if (readRawVarint32 > 0 && readRawVarint32 <= ((int) (((this.getValidOutputFormatsForInputhNQ4ISI - this.toString) - this.getInputFormats) + this.getOutputFormats))) {
                byte[] bArr2 = new byte[readRawVarint32];
                Camera2StreamConfigurationMap(bArr2, readRawVarint32);
                return new java.lang.String(bArr2, androidx.content.preferences.protobuf.Internal.getHighSpeedVideoSizes);
            }
            if (readRawVarint32 == 0) {
                return "";
            }
            if (readRawVarint32 < 0) {
                throw androidx.content.preferences.protobuf.InvalidProtocolBufferException.getInputFormats();
            }
            throw androidx.content.preferences.protobuf.InvalidProtocolBufferException.getInputSizeshNQ4ISI();
        }

        @Override // androidx.content.preferences.protobuf.CodedInputStream
        public final java.lang.String readStringRequireUtf8() throws java.io.IOException {
            int readRawVarint32 = readRawVarint32();
            if (readRawVarint32 > 0) {
                long j = readRawVarint32;
                long j2 = this.getInputSizeshNQ4ISI;
                long j3 = this.getInputFormats;
                if (j <= j2 - j3) {
                    java.lang.String highSpeedVideoFpsRanges = androidx.content.preferences.protobuf.Utf8.getHighSpeedVideoFpsRanges(this.getOutputMinFrameDuration, (int) (j3 - this.getOutputFormats), readRawVarint32);
                    this.getInputFormats += j;
                    return highSpeedVideoFpsRanges;
                }
            }
            if (readRawVarint32 >= 0 && readRawVarint32 <= ((int) (((this.getValidOutputFormatsForInputhNQ4ISI - this.toString) - this.getInputFormats) + this.getOutputFormats))) {
                byte[] bArr = new byte[readRawVarint32];
                Camera2StreamConfigurationMap(bArr, readRawVarint32);
                return androidx.content.preferences.protobuf.Utf8.getHighSpeedVideoFpsRanges(bArr, 0, readRawVarint32);
            }
            if (readRawVarint32 == 0) {
                return "";
            }
            if (readRawVarint32 <= 0) {
                throw androidx.content.preferences.protobuf.InvalidProtocolBufferException.getInputFormats();
            }
            throw androidx.content.preferences.protobuf.InvalidProtocolBufferException.getInputSizeshNQ4ISI();
        }

        @Override // androidx.content.preferences.protobuf.CodedInputStream
        public final void readGroup(int i, androidx.datastore.preferences.protobuf.MessageLite.Builder builder, androidx.content.preferences.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
            checkRecursionLimit();
            this.Camera2StreamConfigurationMap++;
            builder.mergeFrom(this, extensionRegistryLite);
            checkLastTagWas(androidx.content.preferences.protobuf.WireFormat.Camera2StreamConfigurationMap(i, 4));
            this.Camera2StreamConfigurationMap--;
        }

        @Override // androidx.content.preferences.protobuf.CodedInputStream
        public final <T extends androidx.content.preferences.protobuf.MessageLite> T readGroup(int i, androidx.content.preferences.protobuf.Parser<T> parser, androidx.content.preferences.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
            checkRecursionLimit();
            this.Camera2StreamConfigurationMap++;
            T parsePartialFrom = parser.parsePartialFrom(this, extensionRegistryLite);
            checkLastTagWas(androidx.content.preferences.protobuf.WireFormat.Camera2StreamConfigurationMap(i, 4));
            this.Camera2StreamConfigurationMap--;
            return parsePartialFrom;
        }

        @Override // androidx.content.preferences.protobuf.CodedInputStream
        @java.lang.Deprecated
        public final void readUnknownGroup(int i, androidx.datastore.preferences.protobuf.MessageLite.Builder builder) throws java.io.IOException {
            readGroup(i, builder, androidx.content.preferences.protobuf.ExtensionRegistryLite.getEmptyRegistry());
        }

        @Override // androidx.content.preferences.protobuf.CodedInputStream
        public final void readMessage(androidx.datastore.preferences.protobuf.MessageLite.Builder builder, androidx.content.preferences.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
            int readRawVarint32 = readRawVarint32();
            checkRecursionLimit();
            int pushLimit = pushLimit(readRawVarint32);
            this.Camera2StreamConfigurationMap++;
            builder.mergeFrom(this, extensionRegistryLite);
            checkLastTagWas(0);
            this.Camera2StreamConfigurationMap--;
            if (getBytesUntilLimit() != 0) {
                throw androidx.content.preferences.protobuf.InvalidProtocolBufferException.getInputSizeshNQ4ISI();
            }
            popLimit(pushLimit);
        }

        @Override // androidx.content.preferences.protobuf.CodedInputStream
        public final <T extends androidx.content.preferences.protobuf.MessageLite> T readMessage(androidx.content.preferences.protobuf.Parser<T> parser, androidx.content.preferences.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
            int readRawVarint32 = readRawVarint32();
            checkRecursionLimit();
            int pushLimit = pushLimit(readRawVarint32);
            this.Camera2StreamConfigurationMap++;
            T parsePartialFrom = parser.parsePartialFrom(this, extensionRegistryLite);
            checkLastTagWas(0);
            this.Camera2StreamConfigurationMap--;
            if (getBytesUntilLimit() != 0) {
                throw androidx.content.preferences.protobuf.InvalidProtocolBufferException.getInputSizeshNQ4ISI();
            }
            popLimit(pushLimit);
            return parsePartialFrom;
        }

        @Override // androidx.content.preferences.protobuf.CodedInputStream
        public final androidx.content.preferences.protobuf.ByteString readBytes() throws java.io.IOException {
            int readRawVarint32 = readRawVarint32();
            if (readRawVarint32 > 0) {
                long j = readRawVarint32;
                long j2 = this.getInputSizeshNQ4ISI;
                long j3 = this.getInputFormats;
                if (j <= j2 - j3) {
                    if (this.getOutputSizeshNQ4ISI && this.getOutputStallDuration) {
                        int i = (int) (j3 - this.getHighSpeedVideoSizesFor);
                        androidx.content.preferences.protobuf.ByteString highSpeedVideoFpsRanges = androidx.content.preferences.protobuf.ByteString.getHighSpeedVideoFpsRanges(getHighSpeedVideoFpsRangesFor(i, readRawVarint32 + i));
                        this.getInputFormats += j;
                        return highSpeedVideoFpsRanges;
                    }
                    byte[] bArr = new byte[readRawVarint32];
                    androidx.content.preferences.protobuf.UnsafeUtil.getHighSpeedVideoFpsRanges(j3, bArr, 0L, j);
                    this.getInputFormats += j;
                    return androidx.content.preferences.protobuf.ByteString.getHighSpeedVideoSizes(bArr);
                }
            }
            if (readRawVarint32 <= 0 || readRawVarint32 > ((int) (((this.getValidOutputFormatsForInputhNQ4ISI - this.toString) - this.getInputFormats) + this.getOutputFormats))) {
                if (readRawVarint32 == 0) {
                    return androidx.content.preferences.protobuf.ByteString.EMPTY;
                }
                if (readRawVarint32 < 0) {
                    throw androidx.content.preferences.protobuf.InvalidProtocolBufferException.getInputFormats();
                }
                throw androidx.content.preferences.protobuf.InvalidProtocolBufferException.getInputSizeshNQ4ISI();
            }
            if (this.getOutputSizeshNQ4ISI && this.getOutputStallDuration) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                while (readRawVarint32 > 0) {
                    if (this.getInputSizeshNQ4ISI - this.getInputFormats == 0) {
                        if (!this.getOutputMinFrameDurationlomOqCM.hasNext()) {
                            throw androidx.content.preferences.protobuf.InvalidProtocolBufferException.getInputSizeshNQ4ISI();
                        }
                        getHighSpeedVideoFpsRanges();
                    }
                    int min = java.lang.Math.min(readRawVarint32, (int) (this.getInputSizeshNQ4ISI - this.getInputFormats));
                    int i2 = (int) (this.getInputFormats - this.getHighSpeedVideoSizesFor);
                    arrayList.add(androidx.content.preferences.protobuf.ByteString.getHighSpeedVideoFpsRanges(getHighSpeedVideoFpsRangesFor(i2, i2 + min)));
                    readRawVarint32 -= min;
                    this.getInputFormats += min;
                }
                return androidx.content.preferences.protobuf.ByteString.copyFrom(arrayList);
            }
            byte[] bArr2 = new byte[readRawVarint32];
            Camera2StreamConfigurationMap(bArr2, readRawVarint32);
            return androidx.content.preferences.protobuf.ByteString.getHighSpeedVideoSizes(bArr2);
        }

        @Override // androidx.content.preferences.protobuf.CodedInputStream
        public final byte[] readByteArray() throws java.io.IOException {
            return readRawBytes(readRawVarint32());
        }

        @Override // androidx.content.preferences.protobuf.CodedInputStream
        public final java.nio.ByteBuffer readByteBuffer() throws java.io.IOException {
            int readRawVarint32 = readRawVarint32();
            if (readRawVarint32 > 0) {
                long j = readRawVarint32;
                long j2 = this.getInputSizeshNQ4ISI;
                long j3 = this.getInputFormats;
                if (j <= j2 - j3) {
                    if (!this.getOutputSizeshNQ4ISI && this.getOutputStallDuration) {
                        long j4 = j3 + j;
                        this.getInputFormats = j4;
                        long j5 = j4 - this.getHighSpeedVideoSizesFor;
                        return getHighSpeedVideoFpsRangesFor((int) (j5 - j), (int) j5);
                    }
                    byte[] bArr = new byte[readRawVarint32];
                    androidx.content.preferences.protobuf.UnsafeUtil.getHighSpeedVideoFpsRanges(j3, bArr, 0L, j);
                    this.getInputFormats += j;
                    return java.nio.ByteBuffer.wrap(bArr);
                }
            }
            if (readRawVarint32 > 0 && readRawVarint32 <= ((int) (((this.getValidOutputFormatsForInputhNQ4ISI - this.toString) - this.getInputFormats) + this.getOutputFormats))) {
                byte[] bArr2 = new byte[readRawVarint32];
                Camera2StreamConfigurationMap(bArr2, readRawVarint32);
                return java.nio.ByteBuffer.wrap(bArr2);
            }
            if (readRawVarint32 == 0) {
                return androidx.content.preferences.protobuf.Internal.EMPTY_BYTE_BUFFER;
            }
            if (readRawVarint32 < 0) {
                throw androidx.content.preferences.protobuf.InvalidProtocolBufferException.getInputFormats();
            }
            throw androidx.content.preferences.protobuf.InvalidProtocolBufferException.getInputSizeshNQ4ISI();
        }

        @Override // androidx.content.preferences.protobuf.CodedInputStream
        public final int readUInt32() throws java.io.IOException {
            return readRawVarint32();
        }

        @Override // androidx.content.preferences.protobuf.CodedInputStream
        public final int readEnum() throws java.io.IOException {
            return readRawVarint32();
        }

        @Override // androidx.content.preferences.protobuf.CodedInputStream
        public final int readSFixed32() throws java.io.IOException {
            return readRawLittleEndian32();
        }

        @Override // androidx.content.preferences.protobuf.CodedInputStream
        public final long readSFixed64() throws java.io.IOException {
            return readRawLittleEndian64();
        }

        @Override // androidx.content.preferences.protobuf.CodedInputStream
        public final int readSInt32() throws java.io.IOException {
            return decodeZigZag32(readRawVarint32());
        }

        @Override // androidx.content.preferences.protobuf.CodedInputStream
        public final long readSInt64() throws java.io.IOException {
            return decodeZigZag64(readRawVarint64());
        }

        @Override // androidx.content.preferences.protobuf.CodedInputStream
        public final int readRawVarint32() throws java.io.IOException {
            int i;
            long j = this.getInputFormats;
            if (this.getInputSizeshNQ4ISI != j) {
                byte highSpeedVideoFpsRangesFor = androidx.content.preferences.protobuf.UnsafeUtil.getHighSpeedVideoFpsRangesFor(j);
                if (highSpeedVideoFpsRangesFor >= 0) {
                    this.getInputFormats++;
                    return highSpeedVideoFpsRangesFor;
                }
                if (this.getInputSizeshNQ4ISI - this.getInputFormats >= 10) {
                    long j2 = 2 + j;
                    int highSpeedVideoFpsRangesFor2 = highSpeedVideoFpsRangesFor ^ (androidx.content.preferences.protobuf.UnsafeUtil.getHighSpeedVideoFpsRangesFor(1 + j) << 7);
                    if (highSpeedVideoFpsRangesFor2 < 0) {
                        i = highSpeedVideoFpsRangesFor2 ^ androidx.work.WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT;
                    } else {
                        long j3 = 3 + j;
                        int highSpeedVideoFpsRangesFor3 = highSpeedVideoFpsRangesFor2 ^ (androidx.content.preferences.protobuf.UnsafeUtil.getHighSpeedVideoFpsRangesFor(j2) << 14);
                        if (highSpeedVideoFpsRangesFor3 >= 0) {
                            i = highSpeedVideoFpsRangesFor3 ^ 16256;
                        } else {
                            j2 = 4 + j;
                            int highSpeedVideoFpsRangesFor4 = highSpeedVideoFpsRangesFor3 ^ (androidx.content.preferences.protobuf.UnsafeUtil.getHighSpeedVideoFpsRangesFor(j3) << com.google.common.base.Ascii.NAK);
                            if (highSpeedVideoFpsRangesFor4 < 0) {
                                i = (-2080896) ^ highSpeedVideoFpsRangesFor4;
                            } else {
                                j3 = 5 + j;
                                byte highSpeedVideoFpsRangesFor5 = androidx.content.preferences.protobuf.UnsafeUtil.getHighSpeedVideoFpsRangesFor(j2);
                                int i2 = (highSpeedVideoFpsRangesFor4 ^ (highSpeedVideoFpsRangesFor5 << com.google.common.base.Ascii.FS)) ^ 266354560;
                                if (highSpeedVideoFpsRangesFor5 < 0) {
                                    j2 = 6 + j;
                                    if (androidx.content.preferences.protobuf.UnsafeUtil.getHighSpeedVideoFpsRangesFor(j3) < 0) {
                                        j3 = 7 + j;
                                        if (androidx.content.preferences.protobuf.UnsafeUtil.getHighSpeedVideoFpsRangesFor(j2) < 0) {
                                            j2 = 8 + j;
                                            if (androidx.content.preferences.protobuf.UnsafeUtil.getHighSpeedVideoFpsRangesFor(j3) < 0) {
                                                j3 = 9 + j;
                                                if (androidx.content.preferences.protobuf.UnsafeUtil.getHighSpeedVideoFpsRangesFor(j2) < 0) {
                                                    if (androidx.content.preferences.protobuf.UnsafeUtil.getHighSpeedVideoFpsRangesFor(j3) >= 0) {
                                                        j2 = j + 10;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    i = i2;
                                }
                                i = i2;
                            }
                        }
                        j2 = j3;
                    }
                    this.getInputFormats = j2;
                    return i;
                }
            }
            return (int) getHighSpeedVideoFpsRangesFor();
        }

        @Override // androidx.content.preferences.protobuf.CodedInputStream
        public final long readRawVarint64() throws java.io.IOException {
            long j;
            long j2;
            int i;
            long j3 = this.getInputFormats;
            if (this.getInputSizeshNQ4ISI != j3) {
                byte highSpeedVideoFpsRangesFor = androidx.content.preferences.protobuf.UnsafeUtil.getHighSpeedVideoFpsRangesFor(j3);
                if (highSpeedVideoFpsRangesFor >= 0) {
                    this.getInputFormats++;
                    return highSpeedVideoFpsRangesFor;
                }
                if (this.getInputSizeshNQ4ISI - this.getInputFormats >= 10) {
                    long j4 = 2 + j3;
                    int highSpeedVideoFpsRangesFor2 = highSpeedVideoFpsRangesFor ^ (androidx.content.preferences.protobuf.UnsafeUtil.getHighSpeedVideoFpsRangesFor(1 + j3) << 7);
                    if (highSpeedVideoFpsRangesFor2 >= 0) {
                        long j5 = 3 + j3;
                        int highSpeedVideoFpsRangesFor3 = highSpeedVideoFpsRangesFor2 ^ (androidx.content.preferences.protobuf.UnsafeUtil.getHighSpeedVideoFpsRangesFor(j4) << 14);
                        if (highSpeedVideoFpsRangesFor3 >= 0) {
                            j = highSpeedVideoFpsRangesFor3 ^ 16256;
                            j4 = j5;
                        } else {
                            j4 = 4 + j3;
                            int highSpeedVideoFpsRangesFor4 = highSpeedVideoFpsRangesFor3 ^ (androidx.content.preferences.protobuf.UnsafeUtil.getHighSpeedVideoFpsRangesFor(j5) << com.google.common.base.Ascii.NAK);
                            if (highSpeedVideoFpsRangesFor4 < 0) {
                                i = (-2080896) ^ highSpeedVideoFpsRangesFor4;
                            } else {
                                long j6 = 5 + j3;
                                long highSpeedVideoFpsRangesFor5 = highSpeedVideoFpsRangesFor4 ^ (androidx.content.preferences.protobuf.UnsafeUtil.getHighSpeedVideoFpsRangesFor(j4) << 28);
                                if (highSpeedVideoFpsRangesFor5 >= 0) {
                                    j2 = 266354560;
                                } else {
                                    long j7 = 6 + j3;
                                    highSpeedVideoFpsRangesFor5 ^= androidx.content.preferences.protobuf.UnsafeUtil.getHighSpeedVideoFpsRangesFor(j6) << 35;
                                    if (highSpeedVideoFpsRangesFor5 < 0) {
                                        j2 = -34093383808L;
                                    } else {
                                        j6 = 7 + j3;
                                        highSpeedVideoFpsRangesFor5 ^= androidx.content.preferences.protobuf.UnsafeUtil.getHighSpeedVideoFpsRangesFor(j7) << 42;
                                        if (highSpeedVideoFpsRangesFor5 >= 0) {
                                            j2 = 4363953127296L;
                                        } else {
                                            j7 = 8 + j3;
                                            highSpeedVideoFpsRangesFor5 ^= androidx.content.preferences.protobuf.UnsafeUtil.getHighSpeedVideoFpsRangesFor(j6) << 49;
                                            if (highSpeedVideoFpsRangesFor5 < 0) {
                                                j2 = -558586000294016L;
                                            } else {
                                                long j8 = 9 + j3;
                                                long highSpeedVideoFpsRangesFor6 = (highSpeedVideoFpsRangesFor5 ^ (androidx.content.preferences.protobuf.UnsafeUtil.getHighSpeedVideoFpsRangesFor(j7) << 56)) ^ 71499008037633920L;
                                                if (highSpeedVideoFpsRangesFor6 >= 0) {
                                                    j = highSpeedVideoFpsRangesFor6;
                                                    j4 = j8;
                                                } else if (androidx.content.preferences.protobuf.UnsafeUtil.getHighSpeedVideoFpsRangesFor(j8) >= 0) {
                                                    j4 = j3 + 10;
                                                    j = highSpeedVideoFpsRangesFor6;
                                                }
                                            }
                                        }
                                    }
                                    j4 = j7;
                                    j = j2 ^ highSpeedVideoFpsRangesFor5;
                                }
                                j4 = j6;
                                j = j2 ^ highSpeedVideoFpsRangesFor5;
                            }
                        }
                        this.getInputFormats = j4;
                        return j;
                    }
                    i = highSpeedVideoFpsRangesFor2 ^ androidx.work.WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT;
                    j = i;
                    this.getInputFormats = j4;
                    return j;
                }
            }
            return getHighSpeedVideoFpsRangesFor();
        }

        @Override // androidx.content.preferences.protobuf.CodedInputStream
        final long getHighSpeedVideoFpsRangesFor() throws java.io.IOException {
            long j = 0;
            for (int i = 0; i < 64; i += 7) {
                j |= (r3 & Byte.MAX_VALUE) << i;
                if ((readRawByte() & 128) == 0) {
                    return j;
                }
            }
            throw androidx.content.preferences.protobuf.InvalidProtocolBufferException.Camera2StreamConfigurationMap();
        }

        @Override // androidx.content.preferences.protobuf.CodedInputStream
        public final void enableAliasing(boolean z) {
            this.getOutputStallDuration = z;
        }

        @Override // androidx.content.preferences.protobuf.CodedInputStream
        public final void resetSizeCounter() {
            this.isOutputSupportedFor = (int) ((this.toString + this.getInputFormats) - this.getOutputFormats);
        }

        @Override // androidx.content.preferences.protobuf.CodedInputStream
        public final int pushLimit(int i) throws androidx.content.preferences.protobuf.InvalidProtocolBufferException {
            if (i < 0) {
                throw androidx.content.preferences.protobuf.InvalidProtocolBufferException.getInputFormats();
            }
            int totalBytesRead = i + getTotalBytesRead();
            int i2 = this.getOutputSizes;
            if (totalBytesRead > i2) {
                throw androidx.content.preferences.protobuf.InvalidProtocolBufferException.getInputSizeshNQ4ISI();
            }
            this.getOutputSizes = totalBytesRead;
            Camera2StreamConfigurationMap();
            return i2;
        }

        private void Camera2StreamConfigurationMap() {
            int i = this.getValidOutputFormatsForInputhNQ4ISI + this.getHighResolutionOutputSizeshNQ4ISI;
            this.getValidOutputFormatsForInputhNQ4ISI = i;
            int i2 = i - this.isOutputSupportedFor;
            int i3 = this.getOutputSizes;
            if (i2 > i3) {
                int i4 = i2 - i3;
                this.getHighResolutionOutputSizeshNQ4ISI = i4;
                this.getValidOutputFormatsForInputhNQ4ISI = i - i4;
                return;
            }
            this.getHighResolutionOutputSizeshNQ4ISI = 0;
        }

        @Override // androidx.content.preferences.protobuf.CodedInputStream
        public final void popLimit(int i) {
            this.getOutputSizes = i;
            Camera2StreamConfigurationMap();
        }

        @Override // androidx.content.preferences.protobuf.CodedInputStream
        public final int getBytesUntilLimit() {
            int i = this.getOutputSizes;
            if (i == Integer.MAX_VALUE) {
                return -1;
            }
            return i - getTotalBytesRead();
        }

        @Override // androidx.content.preferences.protobuf.CodedInputStream
        public final boolean isAtEnd() throws java.io.IOException {
            return (((long) this.toString) + this.getInputFormats) - this.getOutputFormats == ((long) this.getValidOutputFormatsForInputhNQ4ISI);
        }

        @Override // androidx.content.preferences.protobuf.CodedInputStream
        public final int getTotalBytesRead() {
            return (int) (((this.toString - this.isOutputSupportedFor) + this.getInputFormats) - this.getOutputFormats);
        }

        @Override // androidx.content.preferences.protobuf.CodedInputStream
        public final void skipRawBytes(int i) throws java.io.IOException {
            if (i < 0 || i > ((this.getValidOutputFormatsForInputhNQ4ISI - this.toString) - this.getInputFormats) + this.getOutputFormats) {
                if (i < 0) {
                    throw androidx.content.preferences.protobuf.InvalidProtocolBufferException.getInputFormats();
                }
                throw androidx.content.preferences.protobuf.InvalidProtocolBufferException.getInputSizeshNQ4ISI();
            }
            while (i > 0) {
                if (this.getInputSizeshNQ4ISI - this.getInputFormats == 0) {
                    if (!this.getOutputMinFrameDurationlomOqCM.hasNext()) {
                        throw androidx.content.preferences.protobuf.InvalidProtocolBufferException.getInputSizeshNQ4ISI();
                    }
                    getHighSpeedVideoFpsRanges();
                }
                int min = java.lang.Math.min(i, (int) (this.getInputSizeshNQ4ISI - this.getInputFormats));
                i -= min;
                this.getInputFormats += min;
            }
        }

        private java.nio.ByteBuffer getHighSpeedVideoFpsRangesFor(int i, int i2) throws java.io.IOException {
            int position = this.getOutputMinFrameDuration.position();
            int limit = this.getOutputMinFrameDuration.limit();
            java.nio.ByteBuffer byteBuffer = this.getOutputMinFrameDuration;
            try {
                try {
                    byteBuffer.position(i);
                    byteBuffer.limit(i2);
                    return this.getOutputMinFrameDuration.slice();
                } catch (java.lang.IllegalArgumentException unused) {
                    throw androidx.content.preferences.protobuf.InvalidProtocolBufferException.getInputSizeshNQ4ISI();
                }
            } finally {
                byteBuffer.position(position);
                byteBuffer.limit(limit);
            }
        }

        private void Camera2StreamConfigurationMap(byte[] bArr, int i) throws java.io.IOException {
            if (i < 0 || i > ((int) (((this.getValidOutputFormatsForInputhNQ4ISI - this.toString) - this.getInputFormats) + this.getOutputFormats))) {
                if (i > 0) {
                    throw androidx.content.preferences.protobuf.InvalidProtocolBufferException.getInputSizeshNQ4ISI();
                }
                if (i != 0) {
                    throw androidx.content.preferences.protobuf.InvalidProtocolBufferException.getInputFormats();
                }
                return;
            }
            int i2 = i;
            while (i2 > 0) {
                if (this.getInputSizeshNQ4ISI - this.getInputFormats == 0) {
                    if (!this.getOutputMinFrameDurationlomOqCM.hasNext()) {
                        throw androidx.content.preferences.protobuf.InvalidProtocolBufferException.getInputSizeshNQ4ISI();
                    }
                    getHighSpeedVideoFpsRanges();
                }
                int min = java.lang.Math.min(i2, (int) (this.getInputSizeshNQ4ISI - this.getInputFormats));
                long j = min;
                androidx.content.preferences.protobuf.UnsafeUtil.getHighSpeedVideoFpsRanges(this.getInputFormats, bArr, i - i2, j);
                i2 -= min;
                this.getInputFormats += j;
            }
        }

        @Override // androidx.content.preferences.protobuf.CodedInputStream
        public final byte readRawByte() throws java.io.IOException {
            if (this.getInputSizeshNQ4ISI - this.getInputFormats == 0) {
                if (!this.getOutputMinFrameDurationlomOqCM.hasNext()) {
                    throw androidx.content.preferences.protobuf.InvalidProtocolBufferException.getInputSizeshNQ4ISI();
                }
                getHighSpeedVideoFpsRanges();
            }
            long j = this.getInputFormats;
            this.getInputFormats = 1 + j;
            return androidx.content.preferences.protobuf.UnsafeUtil.getHighSpeedVideoFpsRangesFor(j);
        }

        @Override // androidx.content.preferences.protobuf.CodedInputStream
        public final byte[] readRawBytes(int i) throws java.io.IOException {
            if (i >= 0) {
                long j = i;
                long j2 = this.getInputSizeshNQ4ISI;
                long j3 = this.getInputFormats;
                if (j <= j2 - j3) {
                    byte[] bArr = new byte[i];
                    androidx.content.preferences.protobuf.UnsafeUtil.getHighSpeedVideoFpsRanges(j3, bArr, 0L, j);
                    this.getInputFormats += j;
                    return bArr;
                }
            }
            if (i >= 0 && i <= ((int) (((this.getValidOutputFormatsForInputhNQ4ISI - this.toString) - this.getInputFormats) + this.getOutputFormats))) {
                byte[] bArr2 = new byte[i];
                Camera2StreamConfigurationMap(bArr2, i);
                return bArr2;
            }
            if (i > 0) {
                throw androidx.content.preferences.protobuf.InvalidProtocolBufferException.getInputSizeshNQ4ISI();
            }
            if (i == 0) {
                return androidx.content.preferences.protobuf.Internal.EMPTY_BYTE_ARRAY;
            }
            throw androidx.content.preferences.protobuf.InvalidProtocolBufferException.getInputFormats();
        }

        @Override // androidx.content.preferences.protobuf.CodedInputStream
        public final int readRawLittleEndian32() throws java.io.IOException {
            long j = this.getInputSizeshNQ4ISI;
            long j2 = this.getInputFormats;
            if (j - j2 >= 4) {
                this.getInputFormats = 4 + j2;
                return (androidx.content.preferences.protobuf.UnsafeUtil.getHighSpeedVideoFpsRangesFor(j2) & 255) | ((androidx.content.preferences.protobuf.UnsafeUtil.getHighSpeedVideoFpsRangesFor(1 + j2) & 255) << 8) | ((androidx.content.preferences.protobuf.UnsafeUtil.getHighSpeedVideoFpsRangesFor(2 + j2) & 255) << 16) | ((androidx.content.preferences.protobuf.UnsafeUtil.getHighSpeedVideoFpsRangesFor(j2 + 3) & 255) << 24);
            }
            return (readRawByte() & 255) | ((readRawByte() & 255) << 8) | ((readRawByte() & 255) << 16) | ((readRawByte() & 255) << 24);
        }

        @Override // androidx.content.preferences.protobuf.CodedInputStream
        public final long readRawLittleEndian64() throws java.io.IOException {
            long j;
            long readRawByte;
            byte readRawByte2;
            long j2 = this.getInputSizeshNQ4ISI;
            long j3 = this.getInputFormats;
            if (j2 - j3 >= 8) {
                this.getInputFormats = 8 + j3;
                readRawByte = ((androidx.content.preferences.protobuf.UnsafeUtil.getHighSpeedVideoFpsRangesFor(j3 + 5) & 255) << 40) | (androidx.content.preferences.protobuf.UnsafeUtil.getHighSpeedVideoFpsRangesFor(j3) & 255) | ((androidx.content.preferences.protobuf.UnsafeUtil.getHighSpeedVideoFpsRangesFor(1 + j3) & 255) << 8) | ((androidx.content.preferences.protobuf.UnsafeUtil.getHighSpeedVideoFpsRangesFor(j3 + 2) & 255) << 16) | ((androidx.content.preferences.protobuf.UnsafeUtil.getHighSpeedVideoFpsRangesFor(j3 + 3) & 255) << 24) | ((androidx.content.preferences.protobuf.UnsafeUtil.getHighSpeedVideoFpsRangesFor(j3 + 4) & 255) << 32) | ((androidx.content.preferences.protobuf.UnsafeUtil.getHighSpeedVideoFpsRangesFor(j3 + 6) & 255) << 48);
                readRawByte2 = androidx.content.preferences.protobuf.UnsafeUtil.getHighSpeedVideoFpsRangesFor(j3 + 7);
                j = 255;
            } else {
                j = 255;
                readRawByte = (readRawByte() & 255) | ((readRawByte() & 255) << 8) | ((readRawByte() & 255) << 16) | ((readRawByte() & 255) << 24) | ((readRawByte() & 255) << 32) | ((readRawByte() & 255) << 40) | ((readRawByte() & 255) << 48);
                readRawByte2 = readRawByte();
            }
            return readRawByte | ((readRawByte2 & j) << 56);
        }
    }
}
