package kotlin.reflect.jvm.internal.impl.protobuf;

/* loaded from: classes5.dex */
public final class CodedInputStream {
    private int Camera2StreamConfigurationMap;
    private final byte[] getHighResolutionOutputSizeshNQ4ISI;
    private int getHighSpeedVideoFpsRanges;
    private int getHighSpeedVideoFpsRangesFor;
    private final boolean getHighSpeedVideoSizes;
    private final java.io.InputStream getHighSpeedVideoSizesFor;
    private boolean getInputFormats;
    private int getInputSizeshNQ4ISI;
    private int getOutputFormats;
    private int getOutputMinFrameDuration;
    private int getOutputMinFrameDurationlomOqCM;
    private int getOutputSizes;
    private int getOutputStallDuration;
    private kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream.RefillCallback getOutputStallDurationlomOqCM;

    interface RefillCallback {
    }

    public static int decodeZigZag32(int i) {
        return (i >>> 1) ^ (-(i & 1));
    }

    public static long decodeZigZag64(long j) {
        return (j >>> 1) ^ (-(1 & j));
    }

    public static kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream newInstance(java.io.InputStream inputStream) {
        return new kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream(inputStream);
    }

    static kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream Camera2StreamConfigurationMap(kotlin.reflect.jvm.internal.impl.protobuf.LiteralByteString literalByteString) {
        kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream codedInputStream = new kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream(literalByteString);
        try {
            codedInputStream.pushLimit(literalByteString.size());
            return codedInputStream;
        } catch (kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException e) {
            throw new java.lang.IllegalArgumentException(e);
        }
    }

    public final void checkRecursionLimit() throws kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException {
        if (this.getOutputMinFrameDuration >= this.getOutputSizes) {
            throw kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException.getInputFormats();
        }
    }

    public final int readTag() throws java.io.IOException {
        if (isAtEnd()) {
            this.getOutputFormats = 0;
            return 0;
        }
        int readRawVarint32 = readRawVarint32();
        this.getOutputFormats = readRawVarint32;
        if (kotlin.reflect.jvm.internal.impl.protobuf.WireFormat.getTagFieldNumber(readRawVarint32) == 0) {
            throw kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException.getHighSpeedVideoFpsRanges();
        }
        return this.getOutputFormats;
    }

    public final void checkLastTagWas(int i) throws kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException {
        if (this.getOutputFormats != i) {
            throw kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException.getHighResolutionOutputSizeshNQ4ISI();
        }
    }

    public final boolean skipField(int i, kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream codedOutputStream) throws java.io.IOException {
        int highResolutionOutputSizeshNQ4ISI = kotlin.reflect.jvm.internal.impl.protobuf.WireFormat.getHighResolutionOutputSizeshNQ4ISI(i);
        if (highResolutionOutputSizeshNQ4ISI == 0) {
            long readInt64 = readInt64();
            codedOutputStream.writeRawVarint32(i);
            codedOutputStream.writeUInt64NoTag(readInt64);
            return true;
        }
        if (highResolutionOutputSizeshNQ4ISI == 1) {
            long readRawLittleEndian64 = readRawLittleEndian64();
            codedOutputStream.writeRawVarint32(i);
            codedOutputStream.writeFixed64NoTag(readRawLittleEndian64);
            return true;
        }
        if (highResolutionOutputSizeshNQ4ISI == 2) {
            kotlin.reflect.jvm.internal.impl.protobuf.ByteString readBytes = readBytes();
            codedOutputStream.writeRawVarint32(i);
            codedOutputStream.writeBytesNoTag(readBytes);
            return true;
        }
        if (highResolutionOutputSizeshNQ4ISI == 3) {
            codedOutputStream.writeRawVarint32(i);
            skipMessage(codedOutputStream);
            int highSpeedVideoFpsRangesFor = kotlin.reflect.jvm.internal.impl.protobuf.WireFormat.getHighSpeedVideoFpsRangesFor(kotlin.reflect.jvm.internal.impl.protobuf.WireFormat.getTagFieldNumber(i), 4);
            checkLastTagWas(highSpeedVideoFpsRangesFor);
            codedOutputStream.writeRawVarint32(highSpeedVideoFpsRangesFor);
            return true;
        }
        if (highResolutionOutputSizeshNQ4ISI == 4) {
            return false;
        }
        if (highResolutionOutputSizeshNQ4ISI == 5) {
            int readRawLittleEndian32 = readRawLittleEndian32();
            codedOutputStream.writeRawVarint32(i);
            codedOutputStream.writeFixed32NoTag(readRawLittleEndian32);
            return true;
        }
        throw kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException.Camera2StreamConfigurationMap();
    }

    public final void skipMessage(kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream codedOutputStream) throws java.io.IOException {
        int readTag;
        do {
            readTag = readTag();
            if (readTag == 0) {
                return;
            }
            checkRecursionLimit();
            this.getOutputMinFrameDuration++;
            this.getOutputMinFrameDuration--;
        } while (skipField(readTag, codedOutputStream));
    }

    public final double readDouble() throws java.io.IOException {
        return java.lang.Double.longBitsToDouble(readRawLittleEndian64());
    }

    public final float readFloat() throws java.io.IOException {
        return java.lang.Float.intBitsToFloat(readRawLittleEndian32());
    }

    public final long readUInt64() throws java.io.IOException {
        return readRawVarint64();
    }

    public final long readInt64() throws java.io.IOException {
        return readRawVarint64();
    }

    public final int readInt32() throws java.io.IOException {
        return readRawVarint32();
    }

    public final long readFixed64() throws java.io.IOException {
        return readRawLittleEndian64();
    }

    public final int readFixed32() throws java.io.IOException {
        return readRawLittleEndian32();
    }

    public final boolean readBool() throws java.io.IOException {
        return readRawVarint64() != 0;
    }

    public final java.lang.String readString() throws java.io.IOException {
        int readRawVarint32 = readRawVarint32();
        int i = this.Camera2StreamConfigurationMap;
        int i2 = this.getHighSpeedVideoFpsRangesFor;
        if (readRawVarint32 > i - i2 || readRawVarint32 <= 0) {
            if (readRawVarint32 == 0) {
                return "";
            }
            return new java.lang.String(getHighSpeedVideoFpsRanges(readRawVarint32), "UTF-8");
        }
        java.lang.String str = new java.lang.String(this.getHighResolutionOutputSizeshNQ4ISI, i2, readRawVarint32, "UTF-8");
        this.getHighSpeedVideoFpsRangesFor += readRawVarint32;
        return str;
    }

    public final java.lang.String readStringRequireUtf8() throws java.io.IOException {
        byte[] highSpeedVideoFpsRanges;
        int readRawVarint32 = readRawVarint32();
        int i = this.getHighSpeedVideoFpsRangesFor;
        if (readRawVarint32 <= this.Camera2StreamConfigurationMap - i && readRawVarint32 > 0) {
            highSpeedVideoFpsRanges = this.getHighResolutionOutputSizeshNQ4ISI;
            this.getHighSpeedVideoFpsRangesFor = i + readRawVarint32;
        } else {
            if (readRawVarint32 == 0) {
                return "";
            }
            highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges(readRawVarint32);
            i = 0;
        }
        if (!kotlin.reflect.jvm.internal.impl.protobuf.Utf8.getHighSpeedVideoFpsRanges(highSpeedVideoFpsRanges, i, i + readRawVarint32)) {
            throw kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException.getHighSpeedVideoFpsRangesFor();
        }
        return new java.lang.String(highSpeedVideoFpsRanges, i, readRawVarint32, "UTF-8");
    }

    public final void readGroup(int i, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder builder, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
        checkRecursionLimit();
        this.getOutputMinFrameDuration++;
        builder.mergeFrom(this, extensionRegistryLite);
        checkLastTagWas(kotlin.reflect.jvm.internal.impl.protobuf.WireFormat.getHighSpeedVideoFpsRangesFor(i, 4));
        this.getOutputMinFrameDuration--;
    }

    public final void readMessage(kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder builder, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
        int readRawVarint32 = readRawVarint32();
        checkRecursionLimit();
        int pushLimit = pushLimit(readRawVarint32);
        this.getOutputMinFrameDuration++;
        builder.mergeFrom(this, extensionRegistryLite);
        checkLastTagWas(0);
        this.getOutputMinFrameDuration--;
        popLimit(pushLimit);
    }

    public final <T extends kotlin.reflect.jvm.internal.impl.protobuf.MessageLite> T readMessage(kotlin.reflect.jvm.internal.impl.protobuf.Parser<T> parser, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
        int readRawVarint32 = readRawVarint32();
        checkRecursionLimit();
        int pushLimit = pushLimit(readRawVarint32);
        this.getOutputMinFrameDuration++;
        T parsePartialFrom = parser.parsePartialFrom(this, extensionRegistryLite);
        checkLastTagWas(0);
        this.getOutputMinFrameDuration--;
        popLimit(pushLimit);
        return parsePartialFrom;
    }

    public final kotlin.reflect.jvm.internal.impl.protobuf.ByteString readBytes() throws java.io.IOException {
        int readRawVarint32 = readRawVarint32();
        int i = this.Camera2StreamConfigurationMap;
        int i2 = this.getHighSpeedVideoFpsRangesFor;
        if (readRawVarint32 > i - i2 || readRawVarint32 <= 0) {
            if (readRawVarint32 == 0) {
                return kotlin.reflect.jvm.internal.impl.protobuf.ByteString.EMPTY;
            }
            return new kotlin.reflect.jvm.internal.impl.protobuf.LiteralByteString(getHighSpeedVideoFpsRanges(readRawVarint32));
        }
        kotlin.reflect.jvm.internal.impl.protobuf.ByteString boundedByteString = (this.getHighSpeedVideoSizes && this.getInputFormats) ? new kotlin.reflect.jvm.internal.impl.protobuf.BoundedByteString(this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRangesFor, readRawVarint32) : kotlin.reflect.jvm.internal.impl.protobuf.ByteString.copyFrom(this.getHighResolutionOutputSizeshNQ4ISI, i2, readRawVarint32);
        this.getHighSpeedVideoFpsRangesFor += readRawVarint32;
        return boundedByteString;
    }

    public final int readUInt32() throws java.io.IOException {
        return readRawVarint32();
    }

    public final int readEnum() throws java.io.IOException {
        return readRawVarint32();
    }

    public final int readSFixed32() throws java.io.IOException {
        return readRawLittleEndian32();
    }

    public final long readSFixed64() throws java.io.IOException {
        return readRawLittleEndian64();
    }

    public final int readSInt32() throws java.io.IOException {
        return decodeZigZag32(readRawVarint32());
    }

    public final long readSInt64() throws java.io.IOException {
        return decodeZigZag64(readRawVarint64());
    }

    public final int readRawVarint32() throws java.io.IOException {
        int i;
        int i2 = this.getHighSpeedVideoFpsRangesFor;
        int i3 = this.Camera2StreamConfigurationMap;
        if (i3 != i2) {
            byte[] bArr = this.getHighResolutionOutputSizeshNQ4ISI;
            int i4 = i2 + 1;
            byte b = bArr[i2];
            if (b >= 0) {
                this.getHighSpeedVideoFpsRangesFor = i4;
                return b;
            }
            if (i3 - i4 >= 9) {
                int i5 = i2 + 2;
                int i6 = (bArr[i4] << 7) ^ b;
                long j = i6;
                if (j < 0) {
                    i = (int) ((-128) ^ j);
                } else {
                    int i7 = i2 + 3;
                    int i8 = (bArr[i5] << 14) ^ i6;
                    long j2 = i8;
                    if (j2 >= 0) {
                        i = (int) (16256 ^ j2);
                    } else {
                        int i9 = i2 + 4;
                        long j3 = i8 ^ (bArr[i7] << com.google.common.base.Ascii.NAK);
                        if (j3 < 0) {
                            i = (int) ((-2080896) ^ j3);
                        } else {
                            i7 = i2 + 5;
                            int i10 = (int) ((r1 ^ (r3 << com.google.common.base.Ascii.FS)) ^ 266354560);
                            if (bArr[i9] < 0) {
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
                                                    i = i10;
                                                }
                                            }
                                        }
                                    }
                                }
                                i = i10;
                            }
                            i = i10;
                        }
                        i5 = i9;
                    }
                    i5 = i7;
                }
                this.getHighSpeedVideoFpsRangesFor = i5;
                return i;
            }
        }
        return (int) getHighSpeedVideoFpsRangesFor();
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
                throw kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException.getOutputMinFrameDuration();
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
                throw kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException.getOutputMinFrameDuration();
            }
            if ((read2 & 128) == 0) {
                return i2;
            }
            i3 += 7;
        }
        throw kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException.getHighSpeedVideoSizes();
    }

    public final long readRawVarint64() throws java.io.IOException {
        int i;
        long j;
        long j2;
        long j3;
        int i2 = this.getHighSpeedVideoFpsRangesFor;
        int i3 = this.Camera2StreamConfigurationMap;
        if (i3 != i2) {
            byte[] bArr = this.getHighResolutionOutputSizeshNQ4ISI;
            int i4 = i2 + 1;
            byte b = bArr[i2];
            if (b >= 0) {
                this.getHighSpeedVideoFpsRangesFor = i4;
                return b;
            }
            if (i3 - i4 >= 9) {
                int i5 = i2 + 2;
                long j4 = (bArr[i4] << 7) ^ b;
                if (j4 >= 0) {
                    i = i2 + 3;
                    long j5 = j4 ^ (bArr[i5] << 14);
                    if (j5 >= 0) {
                        j3 = 16256;
                    } else {
                        i5 = i2 + 4;
                        j4 = j5 ^ (bArr[i] << com.google.common.base.Ascii.NAK);
                        if (j4 < 0) {
                            j2 = -2080896;
                        } else {
                            i = i2 + 5;
                            j5 = j4 ^ (bArr[i5] << 28);
                            if (j5 >= 0) {
                                j3 = 266354560;
                            } else {
                                i5 = i2 + 6;
                                j4 = j5 ^ (bArr[i] << 35);
                                if (j4 < 0) {
                                    j2 = -34093383808L;
                                } else {
                                    i = i2 + 7;
                                    j5 = j4 ^ (bArr[i5] << 42);
                                    if (j5 >= 0) {
                                        j3 = 4363953127296L;
                                    } else {
                                        i5 = i2 + 8;
                                        j4 = j5 ^ (bArr[i] << 49);
                                        if (j4 >= 0) {
                                            i = i2 + 9;
                                            long j6 = (j4 ^ (bArr[i5] << 56)) ^ 71499008037633920L;
                                            if (j6 < 0) {
                                                int i6 = i2 + 10;
                                                if (bArr[i] >= 0) {
                                                    i = i6;
                                                }
                                            }
                                            j = j6;
                                            this.getHighSpeedVideoFpsRangesFor = i;
                                            return j;
                                        }
                                        j2 = -558586000294016L;
                                    }
                                }
                            }
                        }
                    }
                    j = j3 ^ j5;
                    this.getHighSpeedVideoFpsRangesFor = i;
                    return j;
                }
                j2 = -128;
                i = i5;
                j = j4 ^ j2;
                this.getHighSpeedVideoFpsRangesFor = i;
                return j;
            }
        }
        return getHighSpeedVideoFpsRangesFor();
    }

    private long getHighSpeedVideoFpsRangesFor() throws java.io.IOException {
        long j = 0;
        for (int i = 0; i < 64; i += 7) {
            j |= (r3 & Byte.MAX_VALUE) << i;
            if ((readRawByte() & 128) == 0) {
                return j;
            }
        }
        throw kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException.getHighSpeedVideoSizes();
    }

    public final int readRawLittleEndian32() throws java.io.IOException {
        int i = this.getHighSpeedVideoFpsRangesFor;
        if (this.Camera2StreamConfigurationMap - i < 4) {
            if (getHighSpeedVideoFpsRangesFor(4)) {
                i = this.getHighSpeedVideoFpsRangesFor;
            } else {
                throw kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException.getOutputMinFrameDuration();
            }
        }
        byte[] bArr = this.getHighResolutionOutputSizeshNQ4ISI;
        this.getHighSpeedVideoFpsRangesFor = i + 4;
        return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    public final long readRawLittleEndian64() throws java.io.IOException {
        int i = this.getHighSpeedVideoFpsRangesFor;
        if (this.Camera2StreamConfigurationMap - i < 8) {
            if (getHighSpeedVideoFpsRangesFor(8)) {
                i = this.getHighSpeedVideoFpsRangesFor;
            } else {
                throw kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException.getOutputMinFrameDuration();
            }
        }
        byte[] bArr = this.getHighResolutionOutputSizeshNQ4ISI;
        this.getHighSpeedVideoFpsRangesFor = i + 8;
        return ((bArr[i + 7] & 255) << 56) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24) | ((bArr[i + 4] & 255) << 32) | ((bArr[i + 5] & 255) << 40) | ((bArr[i + 6] & 255) << 48);
    }

    private CodedInputStream(java.io.InputStream inputStream) {
        this.getInputFormats = false;
        this.getInputSizeshNQ4ISI = Integer.MAX_VALUE;
        this.getOutputSizes = 64;
        this.getOutputMinFrameDurationlomOqCM = 67108864;
        this.getOutputStallDurationlomOqCM = null;
        this.getHighResolutionOutputSizeshNQ4ISI = new byte[4096];
        this.Camera2StreamConfigurationMap = 0;
        this.getHighSpeedVideoFpsRangesFor = 0;
        this.getOutputStallDuration = 0;
        this.getHighSpeedVideoSizesFor = inputStream;
        this.getHighSpeedVideoSizes = false;
    }

    private CodedInputStream(kotlin.reflect.jvm.internal.impl.protobuf.LiteralByteString literalByteString) {
        this.getInputFormats = false;
        this.getInputSizeshNQ4ISI = Integer.MAX_VALUE;
        this.getOutputSizes = 64;
        this.getOutputMinFrameDurationlomOqCM = 67108864;
        this.getOutputStallDurationlomOqCM = null;
        this.getHighResolutionOutputSizeshNQ4ISI = literalByteString.getHighSpeedVideoSizes;
        int Camera2StreamConfigurationMap = literalByteString.Camera2StreamConfigurationMap();
        this.getHighSpeedVideoFpsRangesFor = Camera2StreamConfigurationMap;
        this.Camera2StreamConfigurationMap = Camera2StreamConfigurationMap + literalByteString.size();
        this.getOutputStallDuration = -this.getHighSpeedVideoFpsRangesFor;
        this.getHighSpeedVideoSizesFor = null;
        this.getHighSpeedVideoSizes = true;
    }

    public final int pushLimit(int i) throws kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException {
        if (i < 0) {
            throw kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException.getOutputFormats();
        }
        int i2 = i + this.getOutputStallDuration + this.getHighSpeedVideoFpsRangesFor;
        int i3 = this.getInputSizeshNQ4ISI;
        if (i2 > i3) {
            throw kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException.getOutputMinFrameDuration();
        }
        this.getInputSizeshNQ4ISI = i2;
        getHighResolutionOutputSizeshNQ4ISI();
        return i3;
    }

    private void getHighResolutionOutputSizeshNQ4ISI() {
        int i = this.Camera2StreamConfigurationMap + this.getHighSpeedVideoFpsRanges;
        this.Camera2StreamConfigurationMap = i;
        int i2 = this.getOutputStallDuration + i;
        int i3 = this.getInputSizeshNQ4ISI;
        if (i2 > i3) {
            int i4 = i2 - i3;
            this.getHighSpeedVideoFpsRanges = i4;
            this.Camera2StreamConfigurationMap = i - i4;
            return;
        }
        this.getHighSpeedVideoFpsRanges = 0;
    }

    public final void popLimit(int i) {
        this.getInputSizeshNQ4ISI = i;
        getHighResolutionOutputSizeshNQ4ISI();
    }

    public final int getBytesUntilLimit() {
        int i = this.getInputSizeshNQ4ISI;
        if (i == Integer.MAX_VALUE) {
            return -1;
        }
        return i - (this.getOutputStallDuration + this.getHighSpeedVideoFpsRangesFor);
    }

    public final boolean isAtEnd() throws java.io.IOException {
        return this.getHighSpeedVideoFpsRangesFor == this.Camera2StreamConfigurationMap && !getHighSpeedVideoFpsRangesFor(1);
    }

    private boolean getHighSpeedVideoFpsRangesFor(int i) throws java.io.IOException {
        do {
            int i2 = this.getHighSpeedVideoFpsRangesFor;
            int i3 = i2 + i;
            int i4 = this.Camera2StreamConfigurationMap;
            if (i3 <= i4) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("refillBuffer() called when ");
                sb.append(i);
                sb.append(" bytes were already available in buffer");
                throw new java.lang.IllegalStateException(sb.toString());
            }
            if (this.getOutputStallDuration + i2 + i <= this.getInputSizeshNQ4ISI && this.getHighSpeedVideoSizesFor != null) {
                if (i2 > 0) {
                    if (i4 > i2) {
                        byte[] bArr = this.getHighResolutionOutputSizeshNQ4ISI;
                        java.lang.System.arraycopy(bArr, i2, bArr, 0, i4 - i2);
                    }
                    this.getOutputStallDuration += i2;
                    this.Camera2StreamConfigurationMap -= i2;
                    this.getHighSpeedVideoFpsRangesFor = 0;
                }
                java.io.InputStream inputStream = this.getHighSpeedVideoSizesFor;
                byte[] bArr2 = this.getHighResolutionOutputSizeshNQ4ISI;
                int i5 = this.Camera2StreamConfigurationMap;
                int read = inputStream.read(bArr2, i5, bArr2.length - i5);
                if (read == 0 || read < -1 || read > this.getHighResolutionOutputSizeshNQ4ISI.length) {
                    java.lang.StringBuilder sb2 = new java.lang.StringBuilder("InputStream#read(byte[]) returned invalid result: ");
                    sb2.append(read);
                    sb2.append("\nThe InputStream implementation is buggy.");
                    throw new java.lang.IllegalStateException(sb2.toString());
                }
                if (read > 0) {
                    this.Camera2StreamConfigurationMap += read;
                    if ((this.getOutputStallDuration + i) - this.getOutputMinFrameDurationlomOqCM > 0) {
                        throw kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException.getInputSizeshNQ4ISI();
                    }
                    getHighResolutionOutputSizeshNQ4ISI();
                }
            }
            return false;
        } while (this.Camera2StreamConfigurationMap < i);
        return true;
    }

    public final byte readRawByte() throws java.io.IOException {
        if (this.getHighSpeedVideoFpsRangesFor != this.Camera2StreamConfigurationMap || getHighSpeedVideoFpsRangesFor(1)) {
            byte[] bArr = this.getHighResolutionOutputSizeshNQ4ISI;
            int i = this.getHighSpeedVideoFpsRangesFor;
            this.getHighSpeedVideoFpsRangesFor = i + 1;
            return bArr[i];
        }
        throw kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException.getOutputMinFrameDuration();
    }

    private byte[] getHighSpeedVideoFpsRanges(int i) throws java.io.IOException {
        if (i <= 0) {
            if (i == 0) {
                return kotlin.reflect.jvm.internal.impl.protobuf.Internal.EMPTY_BYTE_ARRAY;
            }
            throw kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException.getOutputFormats();
        }
        int i2 = this.getOutputStallDuration;
        int i3 = this.getHighSpeedVideoFpsRangesFor;
        int i4 = this.getInputSizeshNQ4ISI;
        if (i2 + i3 + i > i4) {
            skipRawBytes((i4 - i2) - i3);
            throw kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException.getOutputMinFrameDuration();
        }
        if (i < 4096) {
            byte[] bArr = new byte[i];
            int i5 = this.Camera2StreamConfigurationMap - i3;
            java.lang.System.arraycopy(this.getHighResolutionOutputSizeshNQ4ISI, i3, bArr, 0, i5);
            int i6 = this.Camera2StreamConfigurationMap;
            this.getHighSpeedVideoFpsRangesFor = i6;
            int i7 = i - i5;
            if (i6 - i6 >= i7 || getHighSpeedVideoFpsRangesFor(i7)) {
                java.lang.System.arraycopy(this.getHighResolutionOutputSizeshNQ4ISI, 0, bArr, i5, i7);
                this.getHighSpeedVideoFpsRangesFor = i7;
                return bArr;
            }
            throw kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException.getOutputMinFrameDuration();
        }
        int i8 = this.Camera2StreamConfigurationMap;
        this.getOutputStallDuration = i2 + i8;
        this.getHighSpeedVideoFpsRangesFor = 0;
        this.Camera2StreamConfigurationMap = 0;
        int i9 = i8 - i3;
        int i10 = i - i9;
        java.util.ArrayList<byte[]> arrayList = new java.util.ArrayList();
        while (i10 > 0) {
            int min = java.lang.Math.min(i10, 4096);
            byte[] bArr2 = new byte[min];
            int i11 = 0;
            while (i11 < min) {
                java.io.InputStream inputStream = this.getHighSpeedVideoSizesFor;
                int read = inputStream == null ? -1 : inputStream.read(bArr2, i11, min - i11);
                if (read == -1) {
                    throw kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException.getOutputMinFrameDuration();
                }
                this.getOutputStallDuration += read;
                i11 += read;
            }
            i10 -= min;
            arrayList.add(bArr2);
        }
        byte[] bArr3 = new byte[i];
        java.lang.System.arraycopy(this.getHighResolutionOutputSizeshNQ4ISI, i3, bArr3, 0, i9);
        for (byte[] bArr4 : arrayList) {
            java.lang.System.arraycopy(bArr4, 0, bArr3, i9, bArr4.length);
            i9 += bArr4.length;
        }
        return bArr3;
    }

    public final void skipRawBytes(int i) throws java.io.IOException {
        int i2 = this.Camera2StreamConfigurationMap;
        int i3 = this.getHighSpeedVideoFpsRangesFor;
        if (i <= i2 - i3 && i >= 0) {
            this.getHighSpeedVideoFpsRangesFor = i3 + i;
            return;
        }
        if (i < 0) {
            throw kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException.getOutputFormats();
        }
        int i4 = this.getOutputStallDuration;
        int i5 = this.getInputSizeshNQ4ISI;
        if (i4 + i3 + i > i5) {
            skipRawBytes((i5 - i4) - i3);
            throw kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException.getOutputMinFrameDuration();
        }
        int i6 = i2 - i3;
        this.getHighSpeedVideoFpsRangesFor = i2;
        if (!getHighSpeedVideoFpsRangesFor(1)) {
            throw kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException.getOutputMinFrameDuration();
        }
        do {
            int i7 = i - i6;
            int i8 = this.Camera2StreamConfigurationMap;
            if (i7 > i8) {
                i6 += i8;
                this.getHighSpeedVideoFpsRangesFor = i8;
            } else {
                this.getHighSpeedVideoFpsRangesFor = i7;
                return;
            }
        } while (getHighSpeedVideoFpsRangesFor(1));
        throw kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException.getOutputMinFrameDuration();
    }
}
