package com.google.common.io;

@com.google.common.io.ElementTypesAreNonnullByDefault
/* loaded from: classes3.dex */
public final class ByteStreams {
    private static final int BUFFER_SIZE = 8192;
    private static final int MAX_ARRAY_LEN = 2147483639;
    private static final java.io.OutputStream NULL_OUTPUT_STREAM = new java.io.OutputStream() { // from class: com.google.common.io.ByteStreams.1
        @Override // java.io.OutputStream
        public void write(int b) {
        }

        @Override // java.io.OutputStream
        public void write(byte[] b) {
            com.google.common.base.Preconditions.checkNotNull(b);
        }

        @Override // java.io.OutputStream
        public void write(byte[] b, int off, int len) {
            com.google.common.base.Preconditions.checkNotNull(b);
            com.google.common.base.Preconditions.checkPositionIndexes(off, len + off, b.length);
        }

        public java.lang.String toString() {
            return "ByteStreams.nullOutputStream()";
        }
    };
    private static final int TO_BYTE_ARRAY_DEQUE_SIZE = 20;
    private static final int ZERO_COPY_CHUNK_SIZE = 524288;

    static byte[] createBuffer() {
        return new byte[8192];
    }

    private ByteStreams() {
    }

    public static long copy(java.io.InputStream from, java.io.OutputStream to) throws java.io.IOException {
        com.google.common.base.Preconditions.checkNotNull(from);
        com.google.common.base.Preconditions.checkNotNull(to);
        byte[] createBuffer = createBuffer();
        long j = 0;
        while (true) {
            int read = from.read(createBuffer);
            if (read == -1) {
                return j;
            }
            to.write(createBuffer, 0, read);
            j += read;
        }
    }

    public static long copy(java.nio.channels.ReadableByteChannel from, java.nio.channels.WritableByteChannel to) throws java.io.IOException {
        com.google.common.base.Preconditions.checkNotNull(from);
        com.google.common.base.Preconditions.checkNotNull(to);
        long j = 0;
        if (from instanceof java.nio.channels.FileChannel) {
            java.nio.channels.FileChannel fileChannel = (java.nio.channels.FileChannel) from;
            long position = fileChannel.position();
            long j2 = position;
            while (true) {
                long transferTo = fileChannel.transferTo(j2, android.support.v4.media.session.PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE_ENABLED, to);
                j2 += transferTo;
                fileChannel.position(j2);
                if (transferTo <= 0 && j2 >= fileChannel.size()) {
                    return j2 - position;
                }
            }
        } else {
            java.nio.ByteBuffer wrap = java.nio.ByteBuffer.wrap(createBuffer());
            while (from.read(wrap) != -1) {
                com.google.common.io.Java8Compatibility.flip(wrap);
                while (wrap.hasRemaining()) {
                    j += to.write(wrap);
                }
                com.google.common.io.Java8Compatibility.clear(wrap);
            }
            return j;
        }
    }

    private static byte[] toByteArrayInternal(java.io.InputStream in, java.util.Queue<byte[]> bufs, int totalLen) throws java.io.IOException {
        int min = java.lang.Math.min(8192, java.lang.Math.max(128, java.lang.Integer.highestOneBit(totalLen) * 2));
        while (totalLen < MAX_ARRAY_LEN) {
            int min2 = java.lang.Math.min(min, MAX_ARRAY_LEN - totalLen);
            byte[] bArr = new byte[min2];
            bufs.add(bArr);
            int i = 0;
            while (i < min2) {
                int read = in.read(bArr, i, min2 - i);
                if (read == -1) {
                    return combineBuffers(bufs, totalLen);
                }
                i += read;
                totalLen += read;
            }
            min = com.google.common.math.IntMath.saturatedMultiply(min, min < 4096 ? 4 : 2);
        }
        if (in.read() == -1) {
            return combineBuffers(bufs, MAX_ARRAY_LEN);
        }
        throw new java.lang.OutOfMemoryError("input is too large to fit in a byte array");
    }

    private static byte[] combineBuffers(java.util.Queue<byte[]> bufs, int totalLen) {
        if (bufs.isEmpty()) {
            return new byte[0];
        }
        byte[] remove = bufs.remove();
        if (remove.length == totalLen) {
            return remove;
        }
        int length = totalLen - remove.length;
        byte[] copyOf = java.util.Arrays.copyOf(remove, totalLen);
        while (length > 0) {
            byte[] remove2 = bufs.remove();
            int min = java.lang.Math.min(length, remove2.length);
            java.lang.System.arraycopy(remove2, 0, copyOf, totalLen - length, min);
            length -= min;
        }
        return copyOf;
    }

    public static byte[] toByteArray(java.io.InputStream in) throws java.io.IOException {
        com.google.common.base.Preconditions.checkNotNull(in);
        return toByteArrayInternal(in, new java.util.ArrayDeque(20), 0);
    }

    static byte[] toByteArray(java.io.InputStream in, long expectedSize) throws java.io.IOException {
        com.google.common.base.Preconditions.checkArgument(expectedSize >= 0, "expectedSize (%s) must be non-negative", expectedSize);
        if (expectedSize > 2147483639) {
            throw new java.lang.OutOfMemoryError(expectedSize + " bytes is too large to fit in a byte array");
        }
        int i = (int) expectedSize;
        byte[] bArr = new byte[i];
        int i2 = i;
        while (i2 > 0) {
            int i3 = i - i2;
            int read = in.read(bArr, i3, i2);
            if (read == -1) {
                return java.util.Arrays.copyOf(bArr, i3);
            }
            i2 -= read;
        }
        int read2 = in.read();
        if (read2 == -1) {
            return bArr;
        }
        java.util.ArrayDeque arrayDeque = new java.util.ArrayDeque(22);
        arrayDeque.add(bArr);
        arrayDeque.add(new byte[]{(byte) read2});
        return toByteArrayInternal(in, arrayDeque, i + 1);
    }

    public static long exhaust(java.io.InputStream in) throws java.io.IOException {
        byte[] createBuffer = createBuffer();
        long j = 0;
        while (true) {
            long read = in.read(createBuffer);
            if (read == -1) {
                return j;
            }
            j += read;
        }
    }

    public static com.google.common.io.ByteArrayDataInput newDataInput(byte[] bytes) {
        return newDataInput(new java.io.ByteArrayInputStream(bytes));
    }

    public static com.google.common.io.ByteArrayDataInput newDataInput(byte[] bytes, int start) {
        com.google.common.base.Preconditions.checkPositionIndex(start, bytes.length);
        return newDataInput(new java.io.ByteArrayInputStream(bytes, start, bytes.length - start));
    }

    public static com.google.common.io.ByteArrayDataInput newDataInput(java.io.ByteArrayInputStream byteArrayInputStream) {
        return new com.google.common.io.ByteStreams.ByteArrayDataInputStream((java.io.ByteArrayInputStream) com.google.common.base.Preconditions.checkNotNull(byteArrayInputStream));
    }

    private static class ByteArrayDataInputStream implements com.google.common.io.ByteArrayDataInput {
        final java.io.DataInput input;

        ByteArrayDataInputStream(java.io.ByteArrayInputStream byteArrayInputStream) {
            this.input = new java.io.DataInputStream(byteArrayInputStream);
        }

        @Override // com.google.common.io.ByteArrayDataInput, java.io.DataInput
        public void readFully(byte[] b) {
            try {
                this.input.readFully(b);
            } catch (java.io.IOException e) {
                throw new java.lang.IllegalStateException(e);
            }
        }

        @Override // com.google.common.io.ByteArrayDataInput, java.io.DataInput
        public void readFully(byte[] b, int off, int len) {
            try {
                this.input.readFully(b, off, len);
            } catch (java.io.IOException e) {
                throw new java.lang.IllegalStateException(e);
            }
        }

        @Override // com.google.common.io.ByteArrayDataInput, java.io.DataInput
        public int skipBytes(int n) {
            try {
                return this.input.skipBytes(n);
            } catch (java.io.IOException e) {
                throw new java.lang.IllegalStateException(e);
            }
        }

        @Override // com.google.common.io.ByteArrayDataInput, java.io.DataInput
        public boolean readBoolean() {
            try {
                return this.input.readBoolean();
            } catch (java.io.IOException e) {
                throw new java.lang.IllegalStateException(e);
            }
        }

        @Override // com.google.common.io.ByteArrayDataInput, java.io.DataInput
        public byte readByte() {
            try {
                return this.input.readByte();
            } catch (java.io.EOFException e) {
                throw new java.lang.IllegalStateException(e);
            } catch (java.io.IOException e2) {
                throw new java.lang.AssertionError(e2);
            }
        }

        @Override // com.google.common.io.ByteArrayDataInput, java.io.DataInput
        public int readUnsignedByte() {
            try {
                return this.input.readUnsignedByte();
            } catch (java.io.IOException e) {
                throw new java.lang.IllegalStateException(e);
            }
        }

        @Override // com.google.common.io.ByteArrayDataInput, java.io.DataInput
        public short readShort() {
            try {
                return this.input.readShort();
            } catch (java.io.IOException e) {
                throw new java.lang.IllegalStateException(e);
            }
        }

        @Override // com.google.common.io.ByteArrayDataInput, java.io.DataInput
        public int readUnsignedShort() {
            try {
                return this.input.readUnsignedShort();
            } catch (java.io.IOException e) {
                throw new java.lang.IllegalStateException(e);
            }
        }

        @Override // com.google.common.io.ByteArrayDataInput, java.io.DataInput
        public char readChar() {
            try {
                return this.input.readChar();
            } catch (java.io.IOException e) {
                throw new java.lang.IllegalStateException(e);
            }
        }

        @Override // com.google.common.io.ByteArrayDataInput, java.io.DataInput
        public int readInt() {
            try {
                return this.input.readInt();
            } catch (java.io.IOException e) {
                throw new java.lang.IllegalStateException(e);
            }
        }

        @Override // com.google.common.io.ByteArrayDataInput, java.io.DataInput
        public long readLong() {
            try {
                return this.input.readLong();
            } catch (java.io.IOException e) {
                throw new java.lang.IllegalStateException(e);
            }
        }

        @Override // com.google.common.io.ByteArrayDataInput, java.io.DataInput
        public float readFloat() {
            try {
                return this.input.readFloat();
            } catch (java.io.IOException e) {
                throw new java.lang.IllegalStateException(e);
            }
        }

        @Override // com.google.common.io.ByteArrayDataInput, java.io.DataInput
        public double readDouble() {
            try {
                return this.input.readDouble();
            } catch (java.io.IOException e) {
                throw new java.lang.IllegalStateException(e);
            }
        }

        @Override // com.google.common.io.ByteArrayDataInput, java.io.DataInput
        @javax.annotation.CheckForNull
        public java.lang.String readLine() {
            try {
                return this.input.readLine();
            } catch (java.io.IOException e) {
                throw new java.lang.IllegalStateException(e);
            }
        }

        @Override // com.google.common.io.ByteArrayDataInput, java.io.DataInput
        public java.lang.String readUTF() {
            try {
                return this.input.readUTF();
            } catch (java.io.IOException e) {
                throw new java.lang.IllegalStateException(e);
            }
        }
    }

    public static com.google.common.io.ByteArrayDataOutput newDataOutput() {
        return newDataOutput(new java.io.ByteArrayOutputStream());
    }

    public static com.google.common.io.ByteArrayDataOutput newDataOutput(int size) {
        if (size < 0) {
            throw new java.lang.IllegalArgumentException(java.lang.String.format("Invalid size: %s", java.lang.Integer.valueOf(size)));
        }
        return newDataOutput(new java.io.ByteArrayOutputStream(size));
    }

    public static com.google.common.io.ByteArrayDataOutput newDataOutput(java.io.ByteArrayOutputStream byteArrayOutputStream) {
        return new com.google.common.io.ByteStreams.ByteArrayDataOutputStream((java.io.ByteArrayOutputStream) com.google.common.base.Preconditions.checkNotNull(byteArrayOutputStream));
    }

    private static class ByteArrayDataOutputStream implements com.google.common.io.ByteArrayDataOutput {
        final java.io.ByteArrayOutputStream byteArrayOutputStream;
        final java.io.DataOutput output;

        ByteArrayDataOutputStream(java.io.ByteArrayOutputStream byteArrayOutputStream) {
            this.byteArrayOutputStream = byteArrayOutputStream;
            this.output = new java.io.DataOutputStream(byteArrayOutputStream);
        }

        @Override // com.google.common.io.ByteArrayDataOutput, java.io.DataOutput
        public void write(int b) {
            try {
                this.output.write(b);
            } catch (java.io.IOException e) {
                throw new java.lang.AssertionError(e);
            }
        }

        @Override // com.google.common.io.ByteArrayDataOutput, java.io.DataOutput
        public void write(byte[] b) {
            try {
                this.output.write(b);
            } catch (java.io.IOException e) {
                throw new java.lang.AssertionError(e);
            }
        }

        @Override // com.google.common.io.ByteArrayDataOutput, java.io.DataOutput
        public void write(byte[] b, int off, int len) {
            try {
                this.output.write(b, off, len);
            } catch (java.io.IOException e) {
                throw new java.lang.AssertionError(e);
            }
        }

        @Override // com.google.common.io.ByteArrayDataOutput, java.io.DataOutput
        public void writeBoolean(boolean v) {
            try {
                this.output.writeBoolean(v);
            } catch (java.io.IOException e) {
                throw new java.lang.AssertionError(e);
            }
        }

        @Override // com.google.common.io.ByteArrayDataOutput, java.io.DataOutput
        public void writeByte(int v) {
            try {
                this.output.writeByte(v);
            } catch (java.io.IOException e) {
                throw new java.lang.AssertionError(e);
            }
        }

        @Override // com.google.common.io.ByteArrayDataOutput, java.io.DataOutput
        public void writeBytes(java.lang.String s) {
            try {
                this.output.writeBytes(s);
            } catch (java.io.IOException e) {
                throw new java.lang.AssertionError(e);
            }
        }

        @Override // com.google.common.io.ByteArrayDataOutput, java.io.DataOutput
        public void writeChar(int v) {
            try {
                this.output.writeChar(v);
            } catch (java.io.IOException e) {
                throw new java.lang.AssertionError(e);
            }
        }

        @Override // com.google.common.io.ByteArrayDataOutput, java.io.DataOutput
        public void writeChars(java.lang.String s) {
            try {
                this.output.writeChars(s);
            } catch (java.io.IOException e) {
                throw new java.lang.AssertionError(e);
            }
        }

        @Override // com.google.common.io.ByteArrayDataOutput, java.io.DataOutput
        public void writeDouble(double v) {
            try {
                this.output.writeDouble(v);
            } catch (java.io.IOException e) {
                throw new java.lang.AssertionError(e);
            }
        }

        @Override // com.google.common.io.ByteArrayDataOutput, java.io.DataOutput
        public void writeFloat(float v) {
            try {
                this.output.writeFloat(v);
            } catch (java.io.IOException e) {
                throw new java.lang.AssertionError(e);
            }
        }

        @Override // com.google.common.io.ByteArrayDataOutput, java.io.DataOutput
        public void writeInt(int v) {
            try {
                this.output.writeInt(v);
            } catch (java.io.IOException e) {
                throw new java.lang.AssertionError(e);
            }
        }

        @Override // com.google.common.io.ByteArrayDataOutput, java.io.DataOutput
        public void writeLong(long v) {
            try {
                this.output.writeLong(v);
            } catch (java.io.IOException e) {
                throw new java.lang.AssertionError(e);
            }
        }

        @Override // com.google.common.io.ByteArrayDataOutput, java.io.DataOutput
        public void writeShort(int v) {
            try {
                this.output.writeShort(v);
            } catch (java.io.IOException e) {
                throw new java.lang.AssertionError(e);
            }
        }

        @Override // com.google.common.io.ByteArrayDataOutput, java.io.DataOutput
        public void writeUTF(java.lang.String s) {
            try {
                this.output.writeUTF(s);
            } catch (java.io.IOException e) {
                throw new java.lang.AssertionError(e);
            }
        }

        @Override // com.google.common.io.ByteArrayDataOutput
        public byte[] toByteArray() {
            return this.byteArrayOutputStream.toByteArray();
        }
    }

    public static java.io.OutputStream nullOutputStream() {
        return NULL_OUTPUT_STREAM;
    }

    public static java.io.InputStream limit(java.io.InputStream in, long limit) {
        return new com.google.common.io.ByteStreams.LimitedInputStream(in, limit);
    }

    private static final class LimitedInputStream extends java.io.FilterInputStream {
        private long left;
        private long mark;

        LimitedInputStream(java.io.InputStream in, long limit) {
            super(in);
            this.mark = -1L;
            com.google.common.base.Preconditions.checkNotNull(in);
            com.google.common.base.Preconditions.checkArgument(limit >= 0, "limit must be non-negative");
            this.left = limit;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public int available() throws java.io.IOException {
            return (int) java.lang.Math.min(this.in.available(), this.left);
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public synchronized void mark(int readLimit) {
            this.in.mark(readLimit);
            this.mark = this.left;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public int read() throws java.io.IOException {
            if (this.left == 0) {
                return -1;
            }
            int read = this.in.read();
            if (read != -1) {
                this.left--;
            }
            return read;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public int read(byte[] b, int off, int len) throws java.io.IOException {
            long j = this.left;
            if (j == 0) {
                return -1;
            }
            int read = this.in.read(b, off, (int) java.lang.Math.min(len, j));
            if (read != -1) {
                this.left -= read;
            }
            return read;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public synchronized void reset() throws java.io.IOException {
            if (!this.in.markSupported()) {
                throw new java.io.IOException("Mark not supported");
            }
            if (this.mark == -1) {
                throw new java.io.IOException("Mark not set");
            }
            this.in.reset();
            this.left = this.mark;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public long skip(long n) throws java.io.IOException {
            long skip = this.in.skip(java.lang.Math.min(n, this.left));
            this.left -= skip;
            return skip;
        }
    }

    public static void readFully(java.io.InputStream in, byte[] b) throws java.io.IOException {
        readFully(in, b, 0, b.length);
    }

    public static void readFully(java.io.InputStream in, byte[] b, int off, int len) throws java.io.IOException {
        int read = read(in, b, off, len);
        if (read == len) {
            return;
        }
        throw new java.io.EOFException("reached end of stream after reading " + read + " bytes; " + len + " bytes expected");
    }

    public static void skipFully(java.io.InputStream in, long n) throws java.io.IOException {
        long skipUpTo = skipUpTo(in, n);
        if (skipUpTo >= n) {
            return;
        }
        throw new java.io.EOFException("reached end of stream after skipping " + skipUpTo + " bytes; " + n + " bytes expected");
    }

    static long skipUpTo(java.io.InputStream in, long n) throws java.io.IOException {
        byte[] bArr = null;
        long j = 0;
        while (j < n) {
            long j2 = n - j;
            long skipSafely = skipSafely(in, j2);
            if (skipSafely == 0) {
                int min = (int) java.lang.Math.min(j2, android.support.v4.media.session.PlaybackStateCompat.ACTION_PLAY_FROM_URI);
                if (bArr == null) {
                    bArr = new byte[min];
                }
                skipSafely = in.read(bArr, 0, min);
                if (skipSafely == -1) {
                    break;
                }
            }
            j += skipSafely;
        }
        return j;
    }

    private static long skipSafely(java.io.InputStream in, long n) throws java.io.IOException {
        int available = in.available();
        if (available == 0) {
            return 0L;
        }
        return in.skip(java.lang.Math.min(available, n));
    }

    @com.google.common.io.ParametricNullness
    public static <T> T readBytes(java.io.InputStream input, com.google.common.io.ByteProcessor<T> processor) throws java.io.IOException {
        int read;
        com.google.common.base.Preconditions.checkNotNull(input);
        com.google.common.base.Preconditions.checkNotNull(processor);
        byte[] createBuffer = createBuffer();
        do {
            read = input.read(createBuffer);
            if (read == -1) {
                break;
            }
        } while (processor.processBytes(createBuffer, 0, read));
        return processor.getResult();
    }

    public static int read(java.io.InputStream in, byte[] b, int off, int len) throws java.io.IOException {
        com.google.common.base.Preconditions.checkNotNull(in);
        com.google.common.base.Preconditions.checkNotNull(b);
        int i = 0;
        if (len < 0) {
            throw new java.lang.IndexOutOfBoundsException(java.lang.String.format("len (%s) cannot be negative", java.lang.Integer.valueOf(len)));
        }
        com.google.common.base.Preconditions.checkPositionIndexes(off, off + len, b.length);
        while (i < len) {
            int read = in.read(b, off + i, len - i);
            if (read == -1) {
                break;
            }
            i += read;
        }
        return i;
    }
}
