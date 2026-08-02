package com.google.common.io;

/* loaded from: classes9.dex */
public final class ByteStreams {
    private static final int BUFFER_SIZE = 8192;
    private static final int MAX_ARRAY_LEN = 2147483639;
    private static final java.io.OutputStream NULL_OUTPUT_STREAM = new java.io.OutputStream() { // from class: com.google.common.io.ByteStreams.1
        @Override // java.io.OutputStream
        public void write(int i) {
        }

        @Override // java.io.OutputStream
        public void write(byte[] bArr) {
            com.google.common.base.Preconditions.checkNotNull(bArr);
        }

        @Override // java.io.OutputStream
        public void write(byte[] bArr, int i, int i2) {
            com.google.common.base.Preconditions.checkNotNull(bArr);
            com.google.common.base.Preconditions.checkPositionIndexes(i, i2 + i, bArr.length);
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

    public static long copy(java.io.InputStream inputStream, java.io.OutputStream outputStream) throws java.io.IOException {
        com.google.common.base.Preconditions.checkNotNull(inputStream);
        com.google.common.base.Preconditions.checkNotNull(outputStream);
        byte[] createBuffer = createBuffer();
        long j = 0;
        while (true) {
            int read = inputStream.read(createBuffer);
            if (read == -1) {
                return j;
            }
            outputStream.write(createBuffer, 0, read);
            j += read;
        }
    }

    public static long copy(java.nio.channels.ReadableByteChannel readableByteChannel, java.nio.channels.WritableByteChannel writableByteChannel) throws java.io.IOException {
        com.google.common.base.Preconditions.checkNotNull(readableByteChannel);
        com.google.common.base.Preconditions.checkNotNull(writableByteChannel);
        long j = 0;
        if (readableByteChannel instanceof java.nio.channels.FileChannel) {
            java.nio.channels.FileChannel fileChannel = (java.nio.channels.FileChannel) readableByteChannel;
            long position = fileChannel.position();
            long j2 = position;
            while (true) {
                long transferTo = fileChannel.transferTo(j2, com.datadog.android.core.internal.persistence.file.FilePersistenceConfig.MAX_ITEM_SIZE, writableByteChannel);
                j2 += transferTo;
                fileChannel.position(j2);
                if (transferTo <= 0 && j2 >= fileChannel.size()) {
                    return j2 - position;
                }
            }
        } else {
            java.nio.ByteBuffer wrap = java.nio.ByteBuffer.wrap(createBuffer());
            while (readableByteChannel.read(wrap) != -1) {
                com.google.common.io.Java8Compatibility.flip(wrap);
                while (wrap.hasRemaining()) {
                    j += writableByteChannel.write(wrap);
                }
                com.google.common.io.Java8Compatibility.clear(wrap);
            }
            return j;
        }
    }

    private static byte[] toByteArrayInternal(java.io.InputStream inputStream, java.util.Queue<byte[]> queue, int i) throws java.io.IOException {
        int min = java.lang.Math.min(8192, java.lang.Math.max(128, java.lang.Integer.highestOneBit(i) * 2));
        while (i < MAX_ARRAY_LEN) {
            int min2 = java.lang.Math.min(min, MAX_ARRAY_LEN - i);
            byte[] bArr = new byte[min2];
            queue.add(bArr);
            int i2 = 0;
            while (i2 < min2) {
                int read = inputStream.read(bArr, i2, min2 - i2);
                if (read == -1) {
                    return combineBuffers(queue, i);
                }
                i2 += read;
                i += read;
            }
            min = com.google.common.math.IntMath.saturatedMultiply(min, min < 4096 ? 4 : 2);
        }
        if (inputStream.read() == -1) {
            return combineBuffers(queue, MAX_ARRAY_LEN);
        }
        throw new java.lang.OutOfMemoryError("input is too large to fit in a byte array");
    }

    private static byte[] combineBuffers(java.util.Queue<byte[]> queue, int i) {
        if (queue.isEmpty()) {
            return new byte[0];
        }
        byte[] remove = queue.remove();
        if (remove.length == i) {
            return remove;
        }
        int length = i - remove.length;
        byte[] copyOf = java.util.Arrays.copyOf(remove, i);
        while (length > 0) {
            byte[] remove2 = queue.remove();
            int min = java.lang.Math.min(length, remove2.length);
            java.lang.System.arraycopy(remove2, 0, copyOf, i - length, min);
            length -= min;
        }
        return copyOf;
    }

    public static byte[] toByteArray(java.io.InputStream inputStream) throws java.io.IOException {
        com.google.common.base.Preconditions.checkNotNull(inputStream);
        return toByteArrayInternal(inputStream, new java.util.ArrayDeque(20), 0);
    }

    static byte[] toByteArray(java.io.InputStream inputStream, long j) throws java.io.IOException {
        com.google.common.base.Preconditions.checkArgument(j >= 0, "expectedSize (%s) must be non-negative", j);
        if (j > 2147483639) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(j);
            sb.append(" bytes is too large to fit in a byte array");
            throw new java.lang.OutOfMemoryError(sb.toString());
        }
        int i = (int) j;
        byte[] bArr = new byte[i];
        int i2 = i;
        while (i2 > 0) {
            int i3 = i - i2;
            int read = inputStream.read(bArr, i3, i2);
            if (read == -1) {
                return java.util.Arrays.copyOf(bArr, i3);
            }
            i2 -= read;
        }
        int read2 = inputStream.read();
        if (read2 == -1) {
            return bArr;
        }
        java.util.ArrayDeque arrayDeque = new java.util.ArrayDeque(22);
        arrayDeque.add(bArr);
        arrayDeque.add(new byte[]{(byte) read2});
        return toByteArrayInternal(inputStream, arrayDeque, i + 1);
    }

    public static long exhaust(java.io.InputStream inputStream) throws java.io.IOException {
        byte[] createBuffer = createBuffer();
        long j = 0;
        while (true) {
            long read = inputStream.read(createBuffer);
            if (read == -1) {
                return j;
            }
            j += read;
        }
    }

    public static com.google.common.io.ByteArrayDataInput newDataInput(byte[] bArr) {
        return newDataInput(new java.io.ByteArrayInputStream(bArr));
    }

    public static com.google.common.io.ByteArrayDataInput newDataInput(byte[] bArr, int i) {
        com.google.common.base.Preconditions.checkPositionIndex(i, bArr.length);
        return newDataInput(new java.io.ByteArrayInputStream(bArr, i, bArr.length - i));
    }

    public static com.google.common.io.ByteArrayDataInput newDataInput(java.io.ByteArrayInputStream byteArrayInputStream) {
        return new com.google.common.io.ByteStreams.ByteArrayDataInputStream((java.io.ByteArrayInputStream) com.google.common.base.Preconditions.checkNotNull(byteArrayInputStream));
    }

    static final class ByteArrayDataInputStream implements com.google.common.io.ByteArrayDataInput {
        final java.io.DataInput input;

        ByteArrayDataInputStream(java.io.ByteArrayInputStream byteArrayInputStream) {
            this.input = new java.io.DataInputStream(byteArrayInputStream);
        }

        @Override // com.google.common.io.ByteArrayDataInput, java.io.DataInput
        public final void readFully(byte[] bArr) {
            try {
                this.input.readFully(bArr);
            } catch (java.io.IOException e) {
                throw new java.lang.IllegalStateException(e);
            }
        }

        @Override // com.google.common.io.ByteArrayDataInput, java.io.DataInput
        public final void readFully(byte[] bArr, int i, int i2) {
            try {
                this.input.readFully(bArr, i, i2);
            } catch (java.io.IOException e) {
                throw new java.lang.IllegalStateException(e);
            }
        }

        @Override // com.google.common.io.ByteArrayDataInput, java.io.DataInput
        public final int skipBytes(int i) {
            try {
                return this.input.skipBytes(i);
            } catch (java.io.IOException e) {
                throw new java.lang.IllegalStateException(e);
            }
        }

        @Override // com.google.common.io.ByteArrayDataInput, java.io.DataInput
        public final boolean readBoolean() {
            try {
                return this.input.readBoolean();
            } catch (java.io.IOException e) {
                throw new java.lang.IllegalStateException(e);
            }
        }

        @Override // com.google.common.io.ByteArrayDataInput, java.io.DataInput
        public final byte readByte() {
            try {
                return this.input.readByte();
            } catch (java.io.EOFException e) {
                throw new java.lang.IllegalStateException(e);
            } catch (java.io.IOException e2) {
                throw new java.lang.AssertionError(e2);
            }
        }

        @Override // com.google.common.io.ByteArrayDataInput, java.io.DataInput
        public final int readUnsignedByte() {
            try {
                return this.input.readUnsignedByte();
            } catch (java.io.IOException e) {
                throw new java.lang.IllegalStateException(e);
            }
        }

        @Override // com.google.common.io.ByteArrayDataInput, java.io.DataInput
        public final short readShort() {
            try {
                return this.input.readShort();
            } catch (java.io.IOException e) {
                throw new java.lang.IllegalStateException(e);
            }
        }

        @Override // com.google.common.io.ByteArrayDataInput, java.io.DataInput
        public final int readUnsignedShort() {
            try {
                return this.input.readUnsignedShort();
            } catch (java.io.IOException e) {
                throw new java.lang.IllegalStateException(e);
            }
        }

        @Override // com.google.common.io.ByteArrayDataInput, java.io.DataInput
        public final char readChar() {
            try {
                return this.input.readChar();
            } catch (java.io.IOException e) {
                throw new java.lang.IllegalStateException(e);
            }
        }

        @Override // com.google.common.io.ByteArrayDataInput, java.io.DataInput
        public final int readInt() {
            try {
                return this.input.readInt();
            } catch (java.io.IOException e) {
                throw new java.lang.IllegalStateException(e);
            }
        }

        @Override // com.google.common.io.ByteArrayDataInput, java.io.DataInput
        public final long readLong() {
            try {
                return this.input.readLong();
            } catch (java.io.IOException e) {
                throw new java.lang.IllegalStateException(e);
            }
        }

        @Override // com.google.common.io.ByteArrayDataInput, java.io.DataInput
        public final float readFloat() {
            try {
                return this.input.readFloat();
            } catch (java.io.IOException e) {
                throw new java.lang.IllegalStateException(e);
            }
        }

        @Override // com.google.common.io.ByteArrayDataInput, java.io.DataInput
        public final double readDouble() {
            try {
                return this.input.readDouble();
            } catch (java.io.IOException e) {
                throw new java.lang.IllegalStateException(e);
            }
        }

        @Override // com.google.common.io.ByteArrayDataInput, java.io.DataInput
        public final java.lang.String readLine() {
            try {
                return this.input.readLine();
            } catch (java.io.IOException e) {
                throw new java.lang.IllegalStateException(e);
            }
        }

        @Override // com.google.common.io.ByteArrayDataInput, java.io.DataInput
        public final java.lang.String readUTF() {
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

    public static com.google.common.io.ByteArrayDataOutput newDataOutput(int i) {
        if (i < 0) {
            throw new java.lang.IllegalArgumentException(java.lang.String.format("Invalid size: %s", java.lang.Integer.valueOf(i)));
        }
        return newDataOutput(new java.io.ByteArrayOutputStream(i));
    }

    public static com.google.common.io.ByteArrayDataOutput newDataOutput(java.io.ByteArrayOutputStream byteArrayOutputStream) {
        return new com.google.common.io.ByteStreams.ByteArrayDataOutputStream((java.io.ByteArrayOutputStream) com.google.common.base.Preconditions.checkNotNull(byteArrayOutputStream));
    }

    static final class ByteArrayDataOutputStream implements com.google.common.io.ByteArrayDataOutput {
        final java.io.ByteArrayOutputStream byteArrayOutputStream;
        final java.io.DataOutput output;

        ByteArrayDataOutputStream(java.io.ByteArrayOutputStream byteArrayOutputStream) {
            this.byteArrayOutputStream = byteArrayOutputStream;
            this.output = new java.io.DataOutputStream(byteArrayOutputStream);
        }

        @Override // com.google.common.io.ByteArrayDataOutput, java.io.DataOutput
        public final void write(int i) {
            try {
                this.output.write(i);
            } catch (java.io.IOException e) {
                throw new java.lang.AssertionError(e);
            }
        }

        @Override // com.google.common.io.ByteArrayDataOutput, java.io.DataOutput
        public final void write(byte[] bArr) {
            try {
                this.output.write(bArr);
            } catch (java.io.IOException e) {
                throw new java.lang.AssertionError(e);
            }
        }

        @Override // com.google.common.io.ByteArrayDataOutput, java.io.DataOutput
        public final void write(byte[] bArr, int i, int i2) {
            try {
                this.output.write(bArr, i, i2);
            } catch (java.io.IOException e) {
                throw new java.lang.AssertionError(e);
            }
        }

        @Override // com.google.common.io.ByteArrayDataOutput, java.io.DataOutput
        public final void writeBoolean(boolean z) {
            try {
                this.output.writeBoolean(z);
            } catch (java.io.IOException e) {
                throw new java.lang.AssertionError(e);
            }
        }

        @Override // com.google.common.io.ByteArrayDataOutput, java.io.DataOutput
        public final void writeByte(int i) {
            try {
                this.output.writeByte(i);
            } catch (java.io.IOException e) {
                throw new java.lang.AssertionError(e);
            }
        }

        @Override // com.google.common.io.ByteArrayDataOutput, java.io.DataOutput
        public final void writeBytes(java.lang.String str) {
            try {
                this.output.writeBytes(str);
            } catch (java.io.IOException e) {
                throw new java.lang.AssertionError(e);
            }
        }

        @Override // com.google.common.io.ByteArrayDataOutput, java.io.DataOutput
        public final void writeChar(int i) {
            try {
                this.output.writeChar(i);
            } catch (java.io.IOException e) {
                throw new java.lang.AssertionError(e);
            }
        }

        @Override // com.google.common.io.ByteArrayDataOutput, java.io.DataOutput
        public final void writeChars(java.lang.String str) {
            try {
                this.output.writeChars(str);
            } catch (java.io.IOException e) {
                throw new java.lang.AssertionError(e);
            }
        }

        @Override // com.google.common.io.ByteArrayDataOutput, java.io.DataOutput
        public final void writeDouble(double d) {
            try {
                this.output.writeDouble(d);
            } catch (java.io.IOException e) {
                throw new java.lang.AssertionError(e);
            }
        }

        @Override // com.google.common.io.ByteArrayDataOutput, java.io.DataOutput
        public final void writeFloat(float f) {
            try {
                this.output.writeFloat(f);
            } catch (java.io.IOException e) {
                throw new java.lang.AssertionError(e);
            }
        }

        @Override // com.google.common.io.ByteArrayDataOutput, java.io.DataOutput
        public final void writeInt(int i) {
            try {
                this.output.writeInt(i);
            } catch (java.io.IOException e) {
                throw new java.lang.AssertionError(e);
            }
        }

        @Override // com.google.common.io.ByteArrayDataOutput, java.io.DataOutput
        public final void writeLong(long j) {
            try {
                this.output.writeLong(j);
            } catch (java.io.IOException e) {
                throw new java.lang.AssertionError(e);
            }
        }

        @Override // com.google.common.io.ByteArrayDataOutput, java.io.DataOutput
        public final void writeShort(int i) {
            try {
                this.output.writeShort(i);
            } catch (java.io.IOException e) {
                throw new java.lang.AssertionError(e);
            }
        }

        @Override // com.google.common.io.ByteArrayDataOutput, java.io.DataOutput
        public final void writeUTF(java.lang.String str) {
            try {
                this.output.writeUTF(str);
            } catch (java.io.IOException e) {
                throw new java.lang.AssertionError(e);
            }
        }

        @Override // com.google.common.io.ByteArrayDataOutput
        public final byte[] toByteArray() {
            return this.byteArrayOutputStream.toByteArray();
        }
    }

    public static java.io.OutputStream nullOutputStream() {
        return NULL_OUTPUT_STREAM;
    }

    public static java.io.InputStream limit(java.io.InputStream inputStream, long j) {
        return new com.google.common.io.ByteStreams.LimitedInputStream(inputStream, j);
    }

    static final class LimitedInputStream extends java.io.FilterInputStream {
        private long left;
        private long mark;

        LimitedInputStream(java.io.InputStream inputStream, long j) {
            super(inputStream);
            this.mark = -1L;
            com.google.common.base.Preconditions.checkNotNull(inputStream);
            com.google.common.base.Preconditions.checkArgument(j >= 0, "limit must be non-negative");
            this.left = j;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public final int available() throws java.io.IOException {
            return (int) java.lang.Math.min(this.in.available(), this.left);
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public final void mark(int i) {
            synchronized (this) {
                this.in.mark(i);
                this.mark = this.left;
            }
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public final int read() throws java.io.IOException {
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
        public final int read(byte[] bArr, int i, int i2) throws java.io.IOException {
            long j = this.left;
            if (j == 0) {
                return -1;
            }
            int read = this.in.read(bArr, i, (int) java.lang.Math.min(i2, j));
            if (read != -1) {
                this.left -= read;
            }
            return read;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public final void reset() throws java.io.IOException {
            synchronized (this) {
                if (!this.in.markSupported()) {
                    throw new java.io.IOException("Mark not supported");
                }
                if (this.mark == -1) {
                    throw new java.io.IOException("Mark not set");
                }
                this.in.reset();
                this.left = this.mark;
            }
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public final long skip(long j) throws java.io.IOException {
            long skip = this.in.skip(java.lang.Math.min(j, this.left));
            this.left -= skip;
            return skip;
        }
    }

    public static void readFully(java.io.InputStream inputStream, byte[] bArr) throws java.io.IOException {
        readFully(inputStream, bArr, 0, bArr.length);
    }

    public static void readFully(java.io.InputStream inputStream, byte[] bArr, int i, int i2) throws java.io.IOException {
        int read = read(inputStream, bArr, i, i2);
        if (read == i2) {
            return;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("reached end of stream after reading ");
        sb.append(read);
        sb.append(" bytes; ");
        sb.append(i2);
        sb.append(" bytes expected");
        throw new java.io.EOFException(sb.toString());
    }

    public static void skipFully(java.io.InputStream inputStream, long j) throws java.io.IOException {
        long skipUpTo = skipUpTo(inputStream, j);
        if (skipUpTo >= j) {
            return;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("reached end of stream after skipping ");
        sb.append(skipUpTo);
        sb.append(" bytes; ");
        sb.append(j);
        sb.append(" bytes expected");
        throw new java.io.EOFException(sb.toString());
    }

    static long skipUpTo(java.io.InputStream inputStream, long j) throws java.io.IOException {
        byte[] bArr = null;
        long j2 = 0;
        while (j2 < j) {
            long j3 = j - j2;
            long skipSafely = skipSafely(inputStream, j3);
            if (skipSafely == 0) {
                int min = (int) java.lang.Math.min(j3, 8192L);
                if (bArr == null) {
                    bArr = new byte[min];
                }
                skipSafely = inputStream.read(bArr, 0, min);
                if (skipSafely == -1) {
                    break;
                }
            }
            j2 += skipSafely;
        }
        return j2;
    }

    private static long skipSafely(java.io.InputStream inputStream, long j) throws java.io.IOException {
        int available = inputStream.available();
        if (available == 0) {
            return 0L;
        }
        return inputStream.skip(java.lang.Math.min(available, j));
    }

    public static <T> T readBytes(java.io.InputStream inputStream, com.google.common.io.ByteProcessor<T> byteProcessor) throws java.io.IOException {
        int read;
        com.google.common.base.Preconditions.checkNotNull(inputStream);
        com.google.common.base.Preconditions.checkNotNull(byteProcessor);
        byte[] createBuffer = createBuffer();
        do {
            read = inputStream.read(createBuffer);
            if (read == -1) {
                break;
            }
        } while (byteProcessor.processBytes(createBuffer, 0, read));
        return byteProcessor.getResult();
    }

    public static int read(java.io.InputStream inputStream, byte[] bArr, int i, int i2) throws java.io.IOException {
        com.google.common.base.Preconditions.checkNotNull(inputStream);
        com.google.common.base.Preconditions.checkNotNull(bArr);
        if (i2 < 0) {
            throw new java.lang.IndexOutOfBoundsException(java.lang.String.format("len (%s) cannot be negative", java.lang.Integer.valueOf(i2)));
        }
        com.google.common.base.Preconditions.checkPositionIndexes(i, i + i2, bArr.length);
        int i3 = 0;
        while (i3 < i2) {
            int read = inputStream.read(bArr, i + i3, i2 - i3);
            if (read == -1) {
                break;
            }
            i3 += read;
        }
        return i3;
    }

    static boolean contentsEqual(java.io.InputStream inputStream, java.io.InputStream inputStream2) throws java.io.IOException {
        int read;
        byte[] createBuffer = createBuffer();
        byte[] createBuffer2 = createBuffer();
        do {
            read = read(inputStream, createBuffer, 0, 8192);
            if (read != read(inputStream2, createBuffer2, 0, 8192) || !arraysEqual(createBuffer, createBuffer2, read)) {
                return false;
            }
        } while (read == 8192);
        return true;
    }

    private static boolean arraysEqual(byte[] bArr, byte[] bArr2, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            if (bArr[i2] != bArr2[i2]) {
                return false;
            }
        }
        return true;
    }
}
