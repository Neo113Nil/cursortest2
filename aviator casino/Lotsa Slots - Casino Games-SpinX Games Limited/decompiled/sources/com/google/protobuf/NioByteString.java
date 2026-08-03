package com.google.protobuf;

/* loaded from: classes4.dex */
final class NioByteString extends com.google.protobuf.ByteString.LeafByteString {
    private final java.nio.ByteBuffer buffer;

    NioByteString(java.nio.ByteBuffer buffer) {
        com.google.protobuf.Internal.checkNotNull(buffer, "buffer");
        this.buffer = buffer.slice().order(java.nio.ByteOrder.nativeOrder());
    }

    private java.lang.Object writeReplace() {
        return com.google.protobuf.ByteString.copyFrom(this.buffer.slice());
    }

    private void readObject(java.io.ObjectInputStream in) throws java.io.IOException {
        throw new java.io.InvalidObjectException("NioByteString instances are not to be serialized directly");
    }

    @Override // com.google.protobuf.ByteString
    public byte byteAt(int index) {
        try {
            return this.buffer.get(index);
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            throw e;
        } catch (java.lang.IndexOutOfBoundsException e2) {
            throw new java.lang.ArrayIndexOutOfBoundsException(e2.getMessage());
        }
    }

    @Override // com.google.protobuf.ByteString
    public byte internalByteAt(int index) {
        return byteAt(index);
    }

    @Override // com.google.protobuf.ByteString
    public int size() {
        return this.buffer.remaining();
    }

    @Override // com.google.protobuf.ByteString
    public com.google.protobuf.ByteString substring(int beginIndex, int endIndex) {
        try {
            return new com.google.protobuf.NioByteString(slice(beginIndex, endIndex));
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            throw e;
        } catch (java.lang.IndexOutOfBoundsException e2) {
            throw new java.lang.ArrayIndexOutOfBoundsException(e2.getMessage());
        }
    }

    @Override // com.google.protobuf.ByteString
    protected void copyToInternal(byte[] target, int sourceOffset, int targetOffset, int numberToCopy) {
        java.nio.ByteBuffer slice = this.buffer.slice();
        com.google.protobuf.Java8Compatibility.position(slice, sourceOffset);
        slice.get(target, targetOffset, numberToCopy);
    }

    @Override // com.google.protobuf.ByteString
    public void copyTo(java.nio.ByteBuffer target) {
        target.put(this.buffer.slice());
    }

    @Override // com.google.protobuf.ByteString
    public void writeTo(java.io.OutputStream out) throws java.io.IOException {
        out.write(toByteArray());
    }

    @Override // com.google.protobuf.ByteString.LeafByteString
    boolean equalsRange(com.google.protobuf.ByteString other, int offset, int length) {
        return substring(0, length).equals(other.substring(offset, length + offset));
    }

    @Override // com.google.protobuf.ByteString
    void writeToInternal(java.io.OutputStream out, int sourceOffset, int numberToWrite) throws java.io.IOException {
        if (this.buffer.hasArray()) {
            out.write(this.buffer.array(), this.buffer.arrayOffset() + this.buffer.position() + sourceOffset, numberToWrite);
        } else {
            com.google.protobuf.ByteBufferWriter.write(slice(sourceOffset, numberToWrite + sourceOffset), out);
        }
    }

    @Override // com.google.protobuf.ByteString
    void writeTo(com.google.protobuf.ByteOutput output) throws java.io.IOException {
        output.writeLazy(this.buffer.slice());
    }

    @Override // com.google.protobuf.ByteString
    public java.nio.ByteBuffer asReadOnlyByteBuffer() {
        return this.buffer.asReadOnlyBuffer();
    }

    @Override // com.google.protobuf.ByteString
    public java.util.List<java.nio.ByteBuffer> asReadOnlyByteBufferList() {
        return java.util.Collections.singletonList(asReadOnlyByteBuffer());
    }

    @Override // com.google.protobuf.ByteString
    protected java.lang.String toStringInternal(java.nio.charset.Charset charset) {
        byte[] byteArray;
        int length;
        int i;
        if (this.buffer.hasArray()) {
            byteArray = this.buffer.array();
            i = this.buffer.arrayOffset() + this.buffer.position();
            length = this.buffer.remaining();
        } else {
            byteArray = toByteArray();
            length = byteArray.length;
            i = 0;
        }
        return new java.lang.String(byteArray, i, length, charset);
    }

    @Override // com.google.protobuf.ByteString
    public boolean isValidUtf8() {
        return com.google.protobuf.Utf8.isValidUtf8(this.buffer);
    }

    @Override // com.google.protobuf.ByteString
    protected int partialIsValidUtf8(int state, int offset, int length) {
        return com.google.protobuf.Utf8.partialIsValidUtf8(state, this.buffer, offset, length + offset);
    }

    @Override // com.google.protobuf.ByteString
    public boolean equals(java.lang.Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof com.google.protobuf.ByteString)) {
            return false;
        }
        com.google.protobuf.ByteString byteString = (com.google.protobuf.ByteString) other;
        if (size() != byteString.size()) {
            return false;
        }
        if (size() == 0) {
            return true;
        }
        if (other instanceof com.google.protobuf.NioByteString) {
            return this.buffer.equals(((com.google.protobuf.NioByteString) other).buffer);
        }
        if (other instanceof com.google.protobuf.RopeByteString) {
            return other.equals(this);
        }
        return this.buffer.equals(byteString.asReadOnlyByteBuffer());
    }

    @Override // com.google.protobuf.ByteString
    protected int partialHash(int h, int offset, int length) {
        for (int i = offset; i < offset + length; i++) {
            h = (h * 31) + this.buffer.get(i);
        }
        return h;
    }

    @Override // com.google.protobuf.ByteString
    public java.io.InputStream newInput() {
        return new java.io.InputStream() { // from class: com.google.protobuf.NioByteString.1
            private final java.nio.ByteBuffer buf;

            @Override // java.io.InputStream
            public boolean markSupported() {
                return true;
            }

            {
                this.buf = com.google.protobuf.NioByteString.this.buffer.slice();
            }

            @Override // java.io.InputStream
            public void mark(int readlimit) {
                com.google.protobuf.Java8Compatibility.mark(this.buf);
            }

            @Override // java.io.InputStream
            public void reset() throws java.io.IOException {
                try {
                    com.google.protobuf.Java8Compatibility.reset(this.buf);
                } catch (java.nio.InvalidMarkException e) {
                    throw new java.io.IOException(e);
                }
            }

            @Override // java.io.InputStream
            public int available() throws java.io.IOException {
                return this.buf.remaining();
            }

            @Override // java.io.InputStream
            public int read() throws java.io.IOException {
                if (this.buf.hasRemaining()) {
                    return this.buf.get() & 255;
                }
                return -1;
            }

            @Override // java.io.InputStream
            public int read(byte[] bytes, int off, int len) throws java.io.IOException {
                if (!this.buf.hasRemaining()) {
                    return -1;
                }
                int min = java.lang.Math.min(len, this.buf.remaining());
                this.buf.get(bytes, off, min);
                return min;
            }
        };
    }

    @Override // com.google.protobuf.ByteString
    public com.google.protobuf.CodedInputStream newCodedInput() {
        return com.google.protobuf.CodedInputStream.newInstance(this.buffer, true);
    }

    private java.nio.ByteBuffer slice(int beginIndex, int endIndex) {
        if (beginIndex < this.buffer.position() || endIndex > this.buffer.limit() || beginIndex > endIndex) {
            throw new java.lang.IllegalArgumentException(java.lang.String.format("Invalid indices [%d, %d]", java.lang.Integer.valueOf(beginIndex), java.lang.Integer.valueOf(endIndex)));
        }
        java.nio.ByteBuffer slice = this.buffer.slice();
        com.google.protobuf.Java8Compatibility.position(slice, beginIndex - this.buffer.position());
        com.google.protobuf.Java8Compatibility.limit(slice, endIndex - this.buffer.position());
        return slice;
    }
}
