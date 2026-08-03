package com.google.protobuf;

@com.google.protobuf.CheckReturnValue
/* loaded from: classes4.dex */
public abstract class ByteString implements java.lang.Iterable<java.lang.Byte>, java.io.Serializable {
    static final int CONCATENATE_BY_COPY_SIZE = 128;
    public static final com.google.protobuf.ByteString EMPTY = new com.google.protobuf.ByteString.LiteralByteString(com.google.protobuf.Internal.EMPTY_BYTE_ARRAY);
    static final int MAX_READ_FROM_CHUNK_SIZE = 8192;
    static final int MIN_READ_FROM_CHUNK_SIZE = 256;
    private static final int UNSIGNED_BYTE_MASK = 255;
    private static final java.util.Comparator<com.google.protobuf.ByteString> UNSIGNED_LEXICOGRAPHICAL_COMPARATOR;
    private static final com.google.protobuf.ByteString.ByteArrayCopier byteArrayCopier;
    private static final long serialVersionUID = 1;
    private int hash = 0;

    private interface ByteArrayCopier {
        byte[] copyFrom(byte[] bytes, int offset, int size);
    }

    public interface ByteIterator extends java.util.Iterator<java.lang.Byte> {
        byte nextByte();
    }

    private static int hexDigit(char c) {
        if (c >= '0' && c <= '9') {
            return c - '0';
        }
        if (c >= 'A' && c <= 'F') {
            return c - '7';
        }
        if (c < 'a' || c > 'f') {
            return -1;
        }
        return c - 'W';
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int toInt(byte value) {
        return value & 255;
    }

    public abstract java.nio.ByteBuffer asReadOnlyByteBuffer();

    public abstract java.util.List<java.nio.ByteBuffer> asReadOnlyByteBufferList();

    public abstract byte byteAt(int index);

    public abstract void copyTo(java.nio.ByteBuffer target);

    protected abstract void copyToInternal(byte[] target, int sourceOffset, int targetOffset, int numberToCopy);

    public abstract boolean equals(java.lang.Object o);

    protected abstract int getTreeDepth();

    abstract byte internalByteAt(int index);

    protected abstract boolean isBalanced();

    public abstract boolean isValidUtf8();

    public abstract com.google.protobuf.CodedInputStream newCodedInput();

    public abstract java.io.InputStream newInput();

    protected abstract int partialHash(int h, int offset, int length);

    protected abstract int partialIsValidUtf8(int state, int offset, int length);

    public abstract int size();

    public abstract com.google.protobuf.ByteString substring(int beginIndex, int endIndex);

    protected abstract java.lang.String toStringInternal(java.nio.charset.Charset charset);

    abstract void writeTo(com.google.protobuf.ByteOutput byteOutput) throws java.io.IOException;

    public abstract void writeTo(java.io.OutputStream out) throws java.io.IOException;

    abstract void writeToInternal(java.io.OutputStream out, int sourceOffset, int numberToWrite) throws java.io.IOException;

    abstract void writeToReverse(com.google.protobuf.ByteOutput byteOutput) throws java.io.IOException;

    static {
        byteArrayCopier = com.google.protobuf.Android.isOnAndroidDevice() ? new com.google.protobuf.ByteString.SystemByteArrayCopier() : new com.google.protobuf.ByteString.ArraysByteArrayCopier();
        UNSIGNED_LEXICOGRAPHICAL_COMPARATOR = new java.util.Comparator<com.google.protobuf.ByteString>() { // from class: com.google.protobuf.ByteString.2
            /* JADX WARN: Type inference failed for: r0v0, types: [com.google.protobuf.ByteString$ByteIterator] */
            /* JADX WARN: Type inference failed for: r1v0, types: [com.google.protobuf.ByteString$ByteIterator] */
            @Override // java.util.Comparator
            public int compare(com.google.protobuf.ByteString former, com.google.protobuf.ByteString latter) {
                ?? iterator2 = former.iterator2();
                ?? iterator22 = latter.iterator2();
                while (iterator2.hasNext() && iterator22.hasNext()) {
                    int compareTo = java.lang.Integer.valueOf(com.google.protobuf.ByteString.toInt(iterator2.nextByte())).compareTo(java.lang.Integer.valueOf(com.google.protobuf.ByteString.toInt(iterator22.nextByte())));
                    if (compareTo != 0) {
                        return compareTo;
                    }
                }
                return java.lang.Integer.valueOf(former.size()).compareTo(java.lang.Integer.valueOf(latter.size()));
            }
        };
    }

    private static final class SystemByteArrayCopier implements com.google.protobuf.ByteString.ByteArrayCopier {
        private SystemByteArrayCopier() {
        }

        @Override // com.google.protobuf.ByteString.ByteArrayCopier
        public byte[] copyFrom(byte[] bytes, int offset, int size) {
            byte[] bArr = new byte[size];
            java.lang.System.arraycopy(bytes, offset, bArr, 0, size);
            return bArr;
        }
    }

    private static final class ArraysByteArrayCopier implements com.google.protobuf.ByteString.ByteArrayCopier {
        private ArraysByteArrayCopier() {
        }

        @Override // com.google.protobuf.ByteString.ByteArrayCopier
        public byte[] copyFrom(byte[] bytes, int offset, int size) {
            return java.util.Arrays.copyOfRange(bytes, offset, size + offset);
        }
    }

    ByteString() {
    }

    @Override // java.lang.Iterable
    /* renamed from: iterator, reason: merged with bridge method [inline-methods] */
    public java.util.Iterator<java.lang.Byte> iterator2() {
        return new com.google.protobuf.ByteString.AbstractByteIterator() { // from class: com.google.protobuf.ByteString.1
            private final int limit;
            private int position = 0;

            {
                this.limit = com.google.protobuf.ByteString.this.size();
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.position < this.limit;
            }

            @Override // com.google.protobuf.ByteString.ByteIterator
            public byte nextByte() {
                int i = this.position;
                if (i >= this.limit) {
                    throw new java.util.NoSuchElementException();
                }
                this.position = i + 1;
                return com.google.protobuf.ByteString.this.internalByteAt(i);
            }
        };
    }

    static abstract class AbstractByteIterator implements com.google.protobuf.ByteString.ByteIterator {
        AbstractByteIterator() {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // java.util.Iterator
        public final java.lang.Byte next() {
            return java.lang.Byte.valueOf(nextByte());
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new java.lang.UnsupportedOperationException();
        }
    }

    public final boolean isEmpty() {
        return size() == 0;
    }

    public static final com.google.protobuf.ByteString empty() {
        return EMPTY;
    }

    private static int extractHexDigit(java.lang.String hexString, int index) {
        int hexDigit = hexDigit(hexString.charAt(index));
        if (hexDigit != -1) {
            return hexDigit;
        }
        throw new java.lang.NumberFormatException("Invalid hexString " + hexString + " must only contain [0-9a-fA-F] but contained " + hexString.charAt(index) + " at index " + index);
    }

    public static java.util.Comparator<com.google.protobuf.ByteString> unsignedLexicographicalComparator() {
        return UNSIGNED_LEXICOGRAPHICAL_COMPARATOR;
    }

    public final com.google.protobuf.ByteString substring(int beginIndex) {
        return substring(beginIndex, size());
    }

    public final boolean startsWith(com.google.protobuf.ByteString prefix) {
        return size() >= prefix.size() && substring(0, prefix.size()).equals(prefix);
    }

    public final boolean endsWith(com.google.protobuf.ByteString suffix) {
        return size() >= suffix.size() && substring(size() - suffix.size()).equals(suffix);
    }

    public static com.google.protobuf.ByteString fromHex(java.lang.String hexString) {
        if (hexString.length() % 2 != 0) {
            throw new java.lang.NumberFormatException("Invalid hexString " + hexString + " of length " + hexString.length() + " must be even.");
        }
        int length = hexString.length() / 2;
        byte[] bArr = new byte[length];
        for (int i = 0; i < length; i++) {
            int i2 = i * 2;
            bArr[i] = (byte) (extractHexDigit(hexString, i2 + 1) | (extractHexDigit(hexString, i2) << 4));
        }
        return new com.google.protobuf.ByteString.LiteralByteString(bArr);
    }

    public static com.google.protobuf.ByteString copyFrom(byte[] bytes, int offset, int size) {
        checkRange(offset, offset + size, bytes.length);
        return new com.google.protobuf.ByteString.LiteralByteString(byteArrayCopier.copyFrom(bytes, offset, size));
    }

    public static com.google.protobuf.ByteString copyFrom(byte[] bytes) {
        return copyFrom(bytes, 0, bytes.length);
    }

    static com.google.protobuf.ByteString wrap(java.nio.ByteBuffer buffer) {
        if (buffer.hasArray()) {
            return wrap(buffer.array(), buffer.arrayOffset() + buffer.position(), buffer.remaining());
        }
        return new com.google.protobuf.NioByteString(buffer);
    }

    static com.google.protobuf.ByteString wrap(byte[] bytes) {
        return new com.google.protobuf.ByteString.LiteralByteString(bytes);
    }

    static com.google.protobuf.ByteString wrap(byte[] bytes, int offset, int length) {
        return new com.google.protobuf.ByteString.BoundedByteString(bytes, offset, length);
    }

    public static com.google.protobuf.ByteString copyFrom(java.nio.ByteBuffer bytes, int size) {
        checkRange(0, size, bytes.remaining());
        byte[] bArr = new byte[size];
        bytes.get(bArr);
        return new com.google.protobuf.ByteString.LiteralByteString(bArr);
    }

    public static com.google.protobuf.ByteString copyFrom(java.nio.ByteBuffer bytes) {
        return copyFrom(bytes, bytes.remaining());
    }

    public static com.google.protobuf.ByteString copyFrom(java.lang.String text, java.lang.String charsetName) throws java.io.UnsupportedEncodingException {
        return new com.google.protobuf.ByteString.LiteralByteString(text.getBytes(charsetName));
    }

    public static com.google.protobuf.ByteString copyFrom(java.lang.String text, java.nio.charset.Charset charset) {
        return new com.google.protobuf.ByteString.LiteralByteString(text.getBytes(charset));
    }

    public static com.google.protobuf.ByteString copyFromUtf8(java.lang.String text) {
        return new com.google.protobuf.ByteString.LiteralByteString(text.getBytes(com.google.protobuf.Internal.UTF_8));
    }

    public static com.google.protobuf.ByteString readFrom(java.io.InputStream streamToDrain) throws java.io.IOException {
        return readFrom(streamToDrain, 256, 8192);
    }

    public static com.google.protobuf.ByteString readFrom(java.io.InputStream streamToDrain, int chunkSize) throws java.io.IOException {
        return readFrom(streamToDrain, chunkSize, chunkSize);
    }

    public static com.google.protobuf.ByteString readFrom(java.io.InputStream streamToDrain, int minChunkSize, int maxChunkSize) throws java.io.IOException {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        while (true) {
            com.google.protobuf.ByteString readChunk = readChunk(streamToDrain, minChunkSize);
            if (readChunk != null) {
                arrayList.add(readChunk);
                minChunkSize = java.lang.Math.min(minChunkSize * 2, maxChunkSize);
            } else {
                return copyFrom(arrayList);
            }
        }
    }

    private static com.google.protobuf.ByteString readChunk(java.io.InputStream in, final int chunkSize) throws java.io.IOException {
        byte[] bArr = new byte[chunkSize];
        int i = 0;
        while (i < chunkSize) {
            int read = in.read(bArr, i, chunkSize - i);
            if (read == -1) {
                break;
            }
            i += read;
        }
        if (i == 0) {
            return null;
        }
        return copyFrom(bArr, 0, i);
    }

    public final com.google.protobuf.ByteString concat(com.google.protobuf.ByteString other) {
        if (Integer.MAX_VALUE - size() < other.size()) {
            throw new java.lang.IllegalArgumentException("ByteString would be too long: " + size() + org.slf4j.Marker.ANY_NON_NULL_MARKER + other.size());
        }
        return com.google.protobuf.RopeByteString.concatenate(this, other);
    }

    public static com.google.protobuf.ByteString copyFrom(java.lang.Iterable<com.google.protobuf.ByteString> byteStrings) {
        int size;
        if (!(byteStrings instanceof java.util.Collection)) {
            java.util.Iterator<com.google.protobuf.ByteString> it = byteStrings.iterator();
            size = 0;
            while (it.hasNext()) {
                it.next();
                size++;
            }
        } else {
            size = ((java.util.Collection) byteStrings).size();
        }
        if (size == 0) {
            return EMPTY;
        }
        return balancedConcat(byteStrings.iterator(), size);
    }

    private static com.google.protobuf.ByteString balancedConcat(java.util.Iterator<com.google.protobuf.ByteString> iterator, int length) {
        if (length < 1) {
            throw new java.lang.IllegalArgumentException(java.lang.String.format("length (%s) must be >= 1", java.lang.Integer.valueOf(length)));
        }
        if (length == 1) {
            return iterator.next();
        }
        int i = length >>> 1;
        return balancedConcat(iterator, i).concat(balancedConcat(iterator, length - i));
    }

    public void copyTo(byte[] target, int offset) {
        copyTo(target, 0, offset, size());
    }

    @java.lang.Deprecated
    public final void copyTo(byte[] target, int sourceOffset, int targetOffset, int numberToCopy) {
        checkRange(sourceOffset, sourceOffset + numberToCopy, size());
        checkRange(targetOffset, targetOffset + numberToCopy, target.length);
        if (numberToCopy > 0) {
            copyToInternal(target, sourceOffset, targetOffset, numberToCopy);
        }
    }

    public final byte[] toByteArray() {
        int size = size();
        if (size == 0) {
            return com.google.protobuf.Internal.EMPTY_BYTE_ARRAY;
        }
        byte[] bArr = new byte[size];
        copyToInternal(bArr, 0, 0, size);
        return bArr;
    }

    final void writeTo(java.io.OutputStream out, int sourceOffset, int numberToWrite) throws java.io.IOException {
        checkRange(sourceOffset, sourceOffset + numberToWrite, size());
        if (numberToWrite > 0) {
            writeToInternal(out, sourceOffset, numberToWrite);
        }
    }

    public final java.lang.String toString(java.lang.String charsetName) throws java.io.UnsupportedEncodingException {
        try {
            return toString(java.nio.charset.Charset.forName(charsetName));
        } catch (java.nio.charset.UnsupportedCharsetException e) {
            java.io.UnsupportedEncodingException unsupportedEncodingException = new java.io.UnsupportedEncodingException(charsetName);
            unsupportedEncodingException.initCause(e);
            throw unsupportedEncodingException;
        }
    }

    public final java.lang.String toString(java.nio.charset.Charset charset) {
        return size() == 0 ? "" : toStringInternal(charset);
    }

    public final java.lang.String toStringUtf8() {
        return toString(com.google.protobuf.Internal.UTF_8);
    }

    static abstract class LeafByteString extends com.google.protobuf.ByteString {
        private static final long serialVersionUID = 1;

        abstract boolean equalsRange(com.google.protobuf.ByteString other, int offset, int length);

        @Override // com.google.protobuf.ByteString
        protected final int getTreeDepth() {
            return 0;
        }

        @Override // com.google.protobuf.ByteString
        protected final boolean isBalanced() {
            return true;
        }

        LeafByteString() {
        }

        @Override // com.google.protobuf.ByteString, java.lang.Iterable
        public /* bridge */ /* synthetic */ java.util.Iterator<java.lang.Byte> iterator() {
            return super.iterator2();
        }

        @Override // com.google.protobuf.ByteString
        void writeToReverse(com.google.protobuf.ByteOutput byteOutput) throws java.io.IOException {
            writeTo(byteOutput);
        }
    }

    public final int hashCode() {
        int i = this.hash;
        if (i == 0) {
            int size = size();
            i = partialHash(size, 0, size);
            if (i == 0) {
                i = 1;
            }
            this.hash = i;
        }
        return i;
    }

    public static com.google.protobuf.ByteString.Output newOutput(int initialCapacity) {
        return new com.google.protobuf.ByteString.Output(initialCapacity);
    }

    public static com.google.protobuf.ByteString.Output newOutput() {
        return new com.google.protobuf.ByteString.Output(128);
    }

    public static final class Output extends java.io.OutputStream {
        private static final byte[] EMPTY_BYTE_ARRAY = new byte[0];
        private byte[] buffer;
        private int bufferPos;
        private final java.util.ArrayList<com.google.protobuf.ByteString> flushedBuffers;
        private int flushedBuffersTotalBytes;
        private final int initialCapacity;

        Output(int initialCapacity) {
            if (initialCapacity < 0) {
                throw new java.lang.IllegalArgumentException("Buffer size < 0");
            }
            this.initialCapacity = initialCapacity;
            this.flushedBuffers = new java.util.ArrayList<>();
            this.buffer = new byte[initialCapacity];
        }

        @Override // java.io.OutputStream
        public synchronized void write(int b) {
            if (this.bufferPos == this.buffer.length) {
                flushFullBuffer(1);
            }
            byte[] bArr = this.buffer;
            int i = this.bufferPos;
            this.bufferPos = i + 1;
            bArr[i] = (byte) b;
        }

        @Override // java.io.OutputStream
        public synchronized void write(byte[] b, int offset, int length) {
            byte[] bArr = this.buffer;
            int length2 = bArr.length;
            int i = this.bufferPos;
            if (length <= length2 - i) {
                java.lang.System.arraycopy(b, offset, bArr, i, length);
                this.bufferPos += length;
            } else {
                int length3 = bArr.length - i;
                java.lang.System.arraycopy(b, offset, bArr, i, length3);
                int i2 = length - length3;
                flushFullBuffer(i2);
                java.lang.System.arraycopy(b, offset + length3, this.buffer, 0, i2);
                this.bufferPos = i2;
            }
        }

        public synchronized com.google.protobuf.ByteString toByteString() {
            flushLastBuffer();
            return com.google.protobuf.ByteString.copyFrom(this.flushedBuffers);
        }

        public void writeTo(java.io.OutputStream out) throws java.io.IOException {
            int i;
            com.google.protobuf.ByteString[] byteStringArr;
            byte[] bArr;
            int i2;
            synchronized (this) {
                byteStringArr = (com.google.protobuf.ByteString[]) this.flushedBuffers.toArray(new com.google.protobuf.ByteString[0]);
                bArr = this.buffer;
                i2 = this.bufferPos;
            }
            for (com.google.protobuf.ByteString byteString : byteStringArr) {
                byteString.writeTo(out);
            }
            out.write(java.util.Arrays.copyOf(bArr, i2));
        }

        public synchronized int size() {
            return this.flushedBuffersTotalBytes + this.bufferPos;
        }

        public synchronized void reset() {
            this.flushedBuffers.clear();
            this.flushedBuffersTotalBytes = 0;
            this.bufferPos = 0;
        }

        public java.lang.String toString() {
            return java.lang.String.format("<ByteString.Output@%s size=%d>", java.lang.Integer.toHexString(java.lang.System.identityHashCode(this)), java.lang.Integer.valueOf(size()));
        }

        private void flushFullBuffer(int minSize) {
            this.flushedBuffers.add(new com.google.protobuf.ByteString.LiteralByteString(this.buffer));
            int length = this.flushedBuffersTotalBytes + this.buffer.length;
            this.flushedBuffersTotalBytes = length;
            this.buffer = new byte[java.lang.Math.max(this.initialCapacity, java.lang.Math.max(minSize, length >>> 1))];
            this.bufferPos = 0;
        }

        private void flushLastBuffer() {
            int i = this.bufferPos;
            byte[] bArr = this.buffer;
            if (i >= bArr.length) {
                this.flushedBuffers.add(new com.google.protobuf.ByteString.LiteralByteString(this.buffer));
                this.buffer = EMPTY_BYTE_ARRAY;
            } else if (i > 0) {
                this.flushedBuffers.add(new com.google.protobuf.ByteString.LiteralByteString(java.util.Arrays.copyOf(bArr, i)));
            }
            this.flushedBuffersTotalBytes += this.bufferPos;
            this.bufferPos = 0;
        }
    }

    static com.google.protobuf.ByteString.CodedBuilder newCodedBuilder(int size) {
        return new com.google.protobuf.ByteString.CodedBuilder(size);
    }

    static final class CodedBuilder {
        private final byte[] buffer;
        private final com.google.protobuf.CodedOutputStream output;

        private CodedBuilder(int size) {
            byte[] bArr = new byte[size];
            this.buffer = bArr;
            this.output = com.google.protobuf.CodedOutputStream.newInstance(bArr);
        }

        public com.google.protobuf.ByteString build() {
            this.output.checkNoSpaceLeft();
            return new com.google.protobuf.ByteString.LiteralByteString(this.buffer);
        }

        public com.google.protobuf.CodedOutputStream getCodedOutput() {
            return this.output;
        }
    }

    protected final int peekCachedHashCode() {
        return this.hash;
    }

    static void checkIndex(int index, int size) {
        if (((size - (index + 1)) | index) < 0) {
            if (index < 0) {
                throw new java.lang.ArrayIndexOutOfBoundsException("Index < 0: " + index);
            }
            throw new java.lang.ArrayIndexOutOfBoundsException("Index > length: " + index + ", " + size);
        }
    }

    static int checkRange(int startIndex, int endIndex, int size) {
        int i = endIndex - startIndex;
        if ((startIndex | endIndex | i | (size - endIndex)) >= 0) {
            return i;
        }
        if (startIndex < 0) {
            throw new java.lang.IndexOutOfBoundsException("Beginning index: " + startIndex + " < 0");
        }
        if (endIndex < startIndex) {
            throw new java.lang.IndexOutOfBoundsException("Beginning index larger than ending index: " + startIndex + ", " + endIndex);
        }
        throw new java.lang.IndexOutOfBoundsException("End index: " + endIndex + " >= " + size);
    }

    public final java.lang.String toString() {
        return java.lang.String.format(java.util.Locale.ROOT, "<ByteString@%s size=%d contents=\"%s\">", java.lang.Integer.toHexString(java.lang.System.identityHashCode(this)), java.lang.Integer.valueOf(size()), truncateAndEscapeForDisplay());
    }

    private java.lang.String truncateAndEscapeForDisplay() {
        if (size() <= 50) {
            return com.google.protobuf.TextFormatEscaper.escapeBytes(this);
        }
        return com.google.protobuf.TextFormatEscaper.escapeBytes(substring(0, 47)) + "...";
    }

    private static class LiteralByteString extends com.google.protobuf.ByteString.LeafByteString {
        private static final long serialVersionUID = 1;
        protected final byte[] bytes;

        protected int getOffsetIntoBytes() {
            return 0;
        }

        LiteralByteString(byte[] bytes) {
            bytes.getClass();
            this.bytes = bytes;
        }

        @Override // com.google.protobuf.ByteString
        public byte byteAt(int index) {
            return this.bytes[index];
        }

        @Override // com.google.protobuf.ByteString
        byte internalByteAt(int index) {
            return this.bytes[index];
        }

        @Override // com.google.protobuf.ByteString
        public int size() {
            return this.bytes.length;
        }

        @Override // com.google.protobuf.ByteString
        public final com.google.protobuf.ByteString substring(int beginIndex, int endIndex) {
            int checkRange = checkRange(beginIndex, endIndex, size());
            if (checkRange == 0) {
                return com.google.protobuf.ByteString.EMPTY;
            }
            return new com.google.protobuf.ByteString.BoundedByteString(this.bytes, getOffsetIntoBytes() + beginIndex, checkRange);
        }

        @Override // com.google.protobuf.ByteString
        protected void copyToInternal(byte[] target, int sourceOffset, int targetOffset, int numberToCopy) {
            java.lang.System.arraycopy(this.bytes, sourceOffset, target, targetOffset, numberToCopy);
        }

        @Override // com.google.protobuf.ByteString
        public final void copyTo(java.nio.ByteBuffer target) {
            target.put(this.bytes, getOffsetIntoBytes(), size());
        }

        @Override // com.google.protobuf.ByteString
        public final java.nio.ByteBuffer asReadOnlyByteBuffer() {
            return java.nio.ByteBuffer.wrap(this.bytes, getOffsetIntoBytes(), size()).asReadOnlyBuffer();
        }

        @Override // com.google.protobuf.ByteString
        public final java.util.List<java.nio.ByteBuffer> asReadOnlyByteBufferList() {
            return java.util.Collections.singletonList(asReadOnlyByteBuffer());
        }

        @Override // com.google.protobuf.ByteString
        public final void writeTo(java.io.OutputStream outputStream) throws java.io.IOException {
            outputStream.write(toByteArray());
        }

        @Override // com.google.protobuf.ByteString
        final void writeToInternal(java.io.OutputStream outputStream, int sourceOffset, int numberToWrite) throws java.io.IOException {
            outputStream.write(this.bytes, getOffsetIntoBytes() + sourceOffset, numberToWrite);
        }

        @Override // com.google.protobuf.ByteString
        final void writeTo(com.google.protobuf.ByteOutput output) throws java.io.IOException {
            output.writeLazy(this.bytes, getOffsetIntoBytes(), size());
        }

        @Override // com.google.protobuf.ByteString
        protected final java.lang.String toStringInternal(java.nio.charset.Charset charset) {
            return new java.lang.String(this.bytes, getOffsetIntoBytes(), size(), charset);
        }

        @Override // com.google.protobuf.ByteString
        public final boolean isValidUtf8() {
            int offsetIntoBytes = getOffsetIntoBytes();
            return com.google.protobuf.Utf8.isValidUtf8(this.bytes, offsetIntoBytes, size() + offsetIntoBytes);
        }

        @Override // com.google.protobuf.ByteString
        protected final int partialIsValidUtf8(int state, int offset, int length) {
            int offsetIntoBytes = getOffsetIntoBytes() + offset;
            return com.google.protobuf.Utf8.partialIsValidUtf8(state, this.bytes, offsetIntoBytes, length + offsetIntoBytes);
        }

        @Override // com.google.protobuf.ByteString
        public final boolean equals(java.lang.Object other) {
            if (other == this) {
                return true;
            }
            if (!(other instanceof com.google.protobuf.ByteString) || size() != ((com.google.protobuf.ByteString) other).size()) {
                return false;
            }
            if (size() == 0) {
                return true;
            }
            if (other instanceof com.google.protobuf.ByteString.LiteralByteString) {
                com.google.protobuf.ByteString.LiteralByteString literalByteString = (com.google.protobuf.ByteString.LiteralByteString) other;
                int peekCachedHashCode = peekCachedHashCode();
                int peekCachedHashCode2 = literalByteString.peekCachedHashCode();
                if (peekCachedHashCode == 0 || peekCachedHashCode2 == 0 || peekCachedHashCode == peekCachedHashCode2) {
                    return equalsRange(literalByteString, 0, size());
                }
                return false;
            }
            return other.equals(this);
        }

        @Override // com.google.protobuf.ByteString.LeafByteString
        final boolean equalsRange(com.google.protobuf.ByteString other, int offset, int length) {
            if (length > other.size()) {
                throw new java.lang.IllegalArgumentException("Length too large: " + length + size());
            }
            int i = offset + length;
            if (i > other.size()) {
                throw new java.lang.IllegalArgumentException("Ran off end of other: " + offset + ", " + length + ", " + other.size());
            }
            if (other instanceof com.google.protobuf.ByteString.LiteralByteString) {
                com.google.protobuf.ByteString.LiteralByteString literalByteString = (com.google.protobuf.ByteString.LiteralByteString) other;
                byte[] bArr = this.bytes;
                byte[] bArr2 = literalByteString.bytes;
                int offsetIntoBytes = getOffsetIntoBytes() + length;
                int offsetIntoBytes2 = getOffsetIntoBytes();
                int offsetIntoBytes3 = literalByteString.getOffsetIntoBytes() + offset;
                while (offsetIntoBytes2 < offsetIntoBytes) {
                    if (bArr[offsetIntoBytes2] != bArr2[offsetIntoBytes3]) {
                        return false;
                    }
                    offsetIntoBytes2++;
                    offsetIntoBytes3++;
                }
                return true;
            }
            return other.substring(offset, i).equals(substring(0, length));
        }

        @Override // com.google.protobuf.ByteString
        protected final int partialHash(int h, int offset, int length) {
            return com.google.protobuf.Internal.partialHash(h, this.bytes, getOffsetIntoBytes() + offset, length);
        }

        @Override // com.google.protobuf.ByteString
        public final java.io.InputStream newInput() {
            return new java.io.ByteArrayInputStream(this.bytes, getOffsetIntoBytes(), size());
        }

        @Override // com.google.protobuf.ByteString
        public final com.google.protobuf.CodedInputStream newCodedInput() {
            return com.google.protobuf.CodedInputStream.newInstance(this.bytes, getOffsetIntoBytes(), size(), true);
        }
    }

    private static final class BoundedByteString extends com.google.protobuf.ByteString.LiteralByteString {
        private static final long serialVersionUID = 1;
        private final int bytesLength;
        private final int bytesOffset;

        BoundedByteString(byte[] bytes, int offset, int length) {
            super(bytes);
            checkRange(offset, offset + length, bytes.length);
            this.bytesOffset = offset;
            this.bytesLength = length;
        }

        @Override // com.google.protobuf.ByteString.LiteralByteString, com.google.protobuf.ByteString
        public byte byteAt(int index) {
            checkIndex(index, size());
            return this.bytes[this.bytesOffset + index];
        }

        @Override // com.google.protobuf.ByteString.LiteralByteString, com.google.protobuf.ByteString
        byte internalByteAt(int index) {
            return this.bytes[this.bytesOffset + index];
        }

        @Override // com.google.protobuf.ByteString.LiteralByteString, com.google.protobuf.ByteString
        public int size() {
            return this.bytesLength;
        }

        @Override // com.google.protobuf.ByteString.LiteralByteString
        protected int getOffsetIntoBytes() {
            return this.bytesOffset;
        }

        @Override // com.google.protobuf.ByteString.LiteralByteString, com.google.protobuf.ByteString
        protected void copyToInternal(byte[] target, int sourceOffset, int targetOffset, int numberToCopy) {
            java.lang.System.arraycopy(this.bytes, getOffsetIntoBytes() + sourceOffset, target, targetOffset, numberToCopy);
        }

        java.lang.Object writeReplace() {
            return com.google.protobuf.ByteString.wrap(toByteArray());
        }

        private void readObject(java.io.ObjectInputStream in) throws java.io.IOException {
            throw new java.io.InvalidObjectException("BoundedByteStream instances are not to be serialized directly");
        }
    }
}
