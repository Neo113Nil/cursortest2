package com.google.protobuf;

@com.google.protobuf.CheckReturnValue
/* loaded from: classes4.dex */
abstract class AllocatedBuffer {
    public abstract byte[] array();

    public abstract int arrayOffset();

    public abstract boolean hasArray();

    public abstract boolean hasNioBuffer();

    public abstract int limit();

    public abstract java.nio.ByteBuffer nioBuffer();

    public abstract int position();

    public abstract com.google.protobuf.AllocatedBuffer position(int position);

    public abstract int remaining();

    AllocatedBuffer() {
    }

    public static com.google.protobuf.AllocatedBuffer wrap(byte[] bytes) {
        return wrapNoCheck(bytes, 0, bytes.length);
    }

    public static com.google.protobuf.AllocatedBuffer wrap(final byte[] bytes, final int offset, final int length) {
        if (offset < 0 || length < 0 || offset + length > bytes.length) {
            throw new java.lang.IndexOutOfBoundsException(java.lang.String.format("bytes.length=%d, offset=%d, length=%d", java.lang.Integer.valueOf(bytes.length), java.lang.Integer.valueOf(offset), java.lang.Integer.valueOf(length)));
        }
        return wrapNoCheck(bytes, offset, length);
    }

    public static com.google.protobuf.AllocatedBuffer wrap(final java.nio.ByteBuffer buffer) {
        com.google.protobuf.Internal.checkNotNull(buffer, "buffer");
        return new com.google.protobuf.AllocatedBuffer() { // from class: com.google.protobuf.AllocatedBuffer.1
            @Override // com.google.protobuf.AllocatedBuffer
            public boolean hasNioBuffer() {
                return true;
            }

            @Override // com.google.protobuf.AllocatedBuffer
            public java.nio.ByteBuffer nioBuffer() {
                return buffer;
            }

            @Override // com.google.protobuf.AllocatedBuffer
            public boolean hasArray() {
                return buffer.hasArray();
            }

            @Override // com.google.protobuf.AllocatedBuffer
            public byte[] array() {
                return buffer.array();
            }

            @Override // com.google.protobuf.AllocatedBuffer
            public int arrayOffset() {
                return buffer.arrayOffset();
            }

            @Override // com.google.protobuf.AllocatedBuffer
            public int position() {
                return buffer.position();
            }

            @Override // com.google.protobuf.AllocatedBuffer
            public com.google.protobuf.AllocatedBuffer position(int position) {
                com.google.protobuf.Java8Compatibility.position(buffer, position);
                return this;
            }

            @Override // com.google.protobuf.AllocatedBuffer
            public int limit() {
                return buffer.limit();
            }

            @Override // com.google.protobuf.AllocatedBuffer
            public int remaining() {
                return buffer.remaining();
            }
        };
    }

    private static com.google.protobuf.AllocatedBuffer wrapNoCheck(final byte[] bytes, final int offset, final int length) {
        return new com.google.protobuf.AllocatedBuffer() { // from class: com.google.protobuf.AllocatedBuffer.2
            private int position;

            @Override // com.google.protobuf.AllocatedBuffer
            public boolean hasArray() {
                return true;
            }

            @Override // com.google.protobuf.AllocatedBuffer
            public boolean hasNioBuffer() {
                return false;
            }

            @Override // com.google.protobuf.AllocatedBuffer
            public java.nio.ByteBuffer nioBuffer() {
                throw new java.lang.UnsupportedOperationException();
            }

            @Override // com.google.protobuf.AllocatedBuffer
            public byte[] array() {
                return bytes;
            }

            @Override // com.google.protobuf.AllocatedBuffer
            public int arrayOffset() {
                return offset;
            }

            @Override // com.google.protobuf.AllocatedBuffer
            public int position() {
                return this.position;
            }

            @Override // com.google.protobuf.AllocatedBuffer
            public com.google.protobuf.AllocatedBuffer position(int position) {
                if (position < 0 || position > length) {
                    throw new java.lang.IllegalArgumentException("Invalid position: " + position);
                }
                this.position = position;
                return this;
            }

            @Override // com.google.protobuf.AllocatedBuffer
            public int limit() {
                return length;
            }

            @Override // com.google.protobuf.AllocatedBuffer
            public int remaining() {
                return length - this.position;
            }
        };
    }
}
