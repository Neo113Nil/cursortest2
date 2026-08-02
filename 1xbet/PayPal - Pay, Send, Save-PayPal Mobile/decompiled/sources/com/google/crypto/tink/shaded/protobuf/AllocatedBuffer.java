package com.google.crypto.tink.shaded.protobuf;

@com.google.crypto.tink.shaded.protobuf.CheckReturnValue
/* loaded from: classes9.dex */
abstract class AllocatedBuffer {
    public abstract byte[] array();

    public abstract int arrayOffset();

    public abstract boolean hasArray();

    public abstract boolean hasNioBuffer();

    public abstract int limit();

    public abstract java.nio.ByteBuffer nioBuffer();

    public abstract int position();

    public abstract com.google.crypto.tink.shaded.protobuf.AllocatedBuffer position(int i);

    public abstract int remaining();

    AllocatedBuffer() {
    }

    public static com.google.crypto.tink.shaded.protobuf.AllocatedBuffer wrap(byte[] bArr) {
        return wrapNoCheck(bArr, 0, bArr.length);
    }

    public static com.google.crypto.tink.shaded.protobuf.AllocatedBuffer wrap(byte[] bArr, int i, int i2) {
        if (i < 0 || i2 < 0 || i + i2 > bArr.length) {
            throw new java.lang.IndexOutOfBoundsException(java.lang.String.format("bytes.length=%d, offset=%d, length=%d", java.lang.Integer.valueOf(bArr.length), java.lang.Integer.valueOf(i), java.lang.Integer.valueOf(i2)));
        }
        return wrapNoCheck(bArr, i, i2);
    }

    public static com.google.crypto.tink.shaded.protobuf.AllocatedBuffer wrap(final java.nio.ByteBuffer byteBuffer) {
        com.google.crypto.tink.shaded.protobuf.Internal.checkNotNull(byteBuffer, "buffer");
        return new com.google.crypto.tink.shaded.protobuf.AllocatedBuffer() { // from class: com.google.crypto.tink.shaded.protobuf.AllocatedBuffer.1
            @Override // com.google.crypto.tink.shaded.protobuf.AllocatedBuffer
            public boolean hasNioBuffer() {
                return true;
            }

            @Override // com.google.crypto.tink.shaded.protobuf.AllocatedBuffer
            public java.nio.ByteBuffer nioBuffer() {
                return byteBuffer;
            }

            @Override // com.google.crypto.tink.shaded.protobuf.AllocatedBuffer
            public boolean hasArray() {
                return byteBuffer.hasArray();
            }

            @Override // com.google.crypto.tink.shaded.protobuf.AllocatedBuffer
            public byte[] array() {
                return byteBuffer.array();
            }

            @Override // com.google.crypto.tink.shaded.protobuf.AllocatedBuffer
            public int arrayOffset() {
                return byteBuffer.arrayOffset();
            }

            @Override // com.google.crypto.tink.shaded.protobuf.AllocatedBuffer
            public int position() {
                return byteBuffer.position();
            }

            @Override // com.google.crypto.tink.shaded.protobuf.AllocatedBuffer
            public com.google.crypto.tink.shaded.protobuf.AllocatedBuffer position(int i) {
                com.google.crypto.tink.shaded.protobuf.Java8Compatibility.position(byteBuffer, i);
                return this;
            }

            @Override // com.google.crypto.tink.shaded.protobuf.AllocatedBuffer
            public int limit() {
                return byteBuffer.limit();
            }

            @Override // com.google.crypto.tink.shaded.protobuf.AllocatedBuffer
            public int remaining() {
                return byteBuffer.remaining();
            }
        };
    }

    private static com.google.crypto.tink.shaded.protobuf.AllocatedBuffer wrapNoCheck(final byte[] bArr, final int i, final int i2) {
        return new com.google.crypto.tink.shaded.protobuf.AllocatedBuffer() { // from class: com.google.crypto.tink.shaded.protobuf.AllocatedBuffer.2
            private int position;

            @Override // com.google.crypto.tink.shaded.protobuf.AllocatedBuffer
            public boolean hasArray() {
                return true;
            }

            @Override // com.google.crypto.tink.shaded.protobuf.AllocatedBuffer
            public boolean hasNioBuffer() {
                return false;
            }

            @Override // com.google.crypto.tink.shaded.protobuf.AllocatedBuffer
            public java.nio.ByteBuffer nioBuffer() {
                throw new java.lang.UnsupportedOperationException();
            }

            @Override // com.google.crypto.tink.shaded.protobuf.AllocatedBuffer
            public byte[] array() {
                return bArr;
            }

            @Override // com.google.crypto.tink.shaded.protobuf.AllocatedBuffer
            public int arrayOffset() {
                return i;
            }

            @Override // com.google.crypto.tink.shaded.protobuf.AllocatedBuffer
            public int position() {
                return this.position;
            }

            @Override // com.google.crypto.tink.shaded.protobuf.AllocatedBuffer
            public com.google.crypto.tink.shaded.protobuf.AllocatedBuffer position(int i3) {
                if (i3 < 0 || i3 > i2) {
                    throw new java.lang.IllegalArgumentException("Invalid position: ".concat(java.lang.String.valueOf(i3)));
                }
                this.position = i3;
                return this;
            }

            @Override // com.google.crypto.tink.shaded.protobuf.AllocatedBuffer
            public int limit() {
                return i2;
            }

            @Override // com.google.crypto.tink.shaded.protobuf.AllocatedBuffer
            public int remaining() {
                return i2 - this.position;
            }
        };
    }
}
