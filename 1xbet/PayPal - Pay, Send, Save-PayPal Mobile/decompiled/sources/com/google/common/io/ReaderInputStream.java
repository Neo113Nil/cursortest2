package com.google.common.io;

/* loaded from: classes9.dex */
final class ReaderInputStream extends java.io.InputStream {
    private java.nio.ByteBuffer byteBuffer;
    private java.nio.CharBuffer charBuffer;
    private boolean doneFlushing;
    private boolean draining;
    private final java.nio.charset.CharsetEncoder encoder;
    private boolean endOfInput;
    private final java.io.Reader reader;
    private final byte[] singleByte;

    ReaderInputStream(java.io.Reader reader, java.nio.charset.Charset charset, int i) {
        this(reader, charset.newEncoder().onMalformedInput(java.nio.charset.CodingErrorAction.REPLACE).onUnmappableCharacter(java.nio.charset.CodingErrorAction.REPLACE), i);
    }

    ReaderInputStream(java.io.Reader reader, java.nio.charset.CharsetEncoder charsetEncoder, int i) {
        this.singleByte = new byte[1];
        this.reader = (java.io.Reader) com.google.common.base.Preconditions.checkNotNull(reader);
        this.encoder = (java.nio.charset.CharsetEncoder) com.google.common.base.Preconditions.checkNotNull(charsetEncoder);
        com.google.common.base.Preconditions.checkArgument(i > 0, "bufferSize must be positive: %s", i);
        charsetEncoder.reset();
        java.nio.CharBuffer allocate = java.nio.CharBuffer.allocate(i);
        this.charBuffer = allocate;
        com.google.common.io.Java8Compatibility.flip(allocate);
        this.byteBuffer = java.nio.ByteBuffer.allocate(i);
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws java.io.IOException {
        this.reader.close();
    }

    @Override // java.io.InputStream
    public final int read() throws java.io.IOException {
        if (read(this.singleByte) == 1) {
            return java.lang.Byte.toUnsignedInt(this.singleByte[0]);
        }
        return -1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0028, code lost:
    
        if (r2 <= 0) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x002a, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x002b, code lost:
    
        return -1;
     */
    @Override // java.io.InputStream
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int read(byte[] bArr, int i, int i2) throws java.io.IOException {
        java.nio.charset.CoderResult encode;
        com.google.common.base.Preconditions.checkPositionIndexes(i, i + i2, bArr.length);
        if (i2 == 0) {
            return 0;
        }
        boolean z = this.endOfInput;
        int i3 = 0;
        while (true) {
            if (this.draining) {
                i3 += drain(bArr, i + i3, i2 - i3);
                if (i3 == i2 || this.doneFlushing) {
                    break;
                }
                this.draining = false;
                com.google.common.io.Java8Compatibility.clear(this.byteBuffer);
            }
            while (true) {
                if (this.doneFlushing) {
                    encode = java.nio.charset.CoderResult.UNDERFLOW;
                } else if (z) {
                    encode = this.encoder.flush(this.byteBuffer);
                } else {
                    encode = this.encoder.encode(this.charBuffer, this.byteBuffer, this.endOfInput);
                }
                if (encode.isOverflow()) {
                    startDraining(true);
                    break;
                }
                if (encode.isUnderflow()) {
                    if (z) {
                        this.doneFlushing = true;
                        startDraining(false);
                        break;
                    }
                    if (this.endOfInput) {
                        z = true;
                    } else {
                        readMoreChars();
                    }
                } else if (encode.isError()) {
                    encode.throwException();
                    return 0;
                }
            }
        }
    }

    private static java.nio.CharBuffer grow(java.nio.CharBuffer charBuffer) {
        java.nio.CharBuffer wrap = java.nio.CharBuffer.wrap(java.util.Arrays.copyOf(charBuffer.array(), charBuffer.capacity() * 2));
        com.google.common.io.Java8Compatibility.position(wrap, charBuffer.position());
        com.google.common.io.Java8Compatibility.limit(wrap, charBuffer.limit());
        return wrap;
    }

    private void readMoreChars() throws java.io.IOException {
        if (availableCapacity(this.charBuffer) == 0) {
            if (this.charBuffer.position() > 0) {
                com.google.common.io.Java8Compatibility.flip(this.charBuffer.compact());
            } else {
                this.charBuffer = grow(this.charBuffer);
            }
        }
        int limit = this.charBuffer.limit();
        int read = this.reader.read(this.charBuffer.array(), limit, availableCapacity(this.charBuffer));
        if (read == -1) {
            this.endOfInput = true;
        } else {
            com.google.common.io.Java8Compatibility.limit(this.charBuffer, limit + read);
        }
    }

    private static int availableCapacity(java.nio.Buffer buffer) {
        return buffer.capacity() - buffer.limit();
    }

    private void startDraining(boolean z) {
        com.google.common.io.Java8Compatibility.flip(this.byteBuffer);
        if (z && this.byteBuffer.remaining() == 0) {
            this.byteBuffer = java.nio.ByteBuffer.allocate(this.byteBuffer.capacity() * 2);
        } else {
            this.draining = true;
        }
    }

    private int drain(byte[] bArr, int i, int i2) {
        int min = java.lang.Math.min(i2, this.byteBuffer.remaining());
        this.byteBuffer.get(bArr, i, min);
        return min;
    }
}
