package com.google.common.hash;

/* loaded from: classes9.dex */
abstract class AbstractStreamingHasher extends com.google.common.hash.AbstractHasher {
    private final java.nio.ByteBuffer buffer;
    private final int bufferSize;
    private final int chunkSize;

    protected abstract com.google.common.hash.HashCode makeHash();

    protected abstract void process(java.nio.ByteBuffer byteBuffer);

    protected AbstractStreamingHasher(int i) {
        this(i, i);
    }

    protected AbstractStreamingHasher(int i, int i2) {
        com.google.common.base.Preconditions.checkArgument(i2 % i == 0);
        this.buffer = java.nio.ByteBuffer.allocate(i2 + 7).order(java.nio.ByteOrder.LITTLE_ENDIAN);
        this.bufferSize = i2;
        this.chunkSize = i;
    }

    protected void processRemaining(java.nio.ByteBuffer byteBuffer) {
        com.google.common.hash.Java8Compatibility.position(byteBuffer, byteBuffer.limit());
        com.google.common.hash.Java8Compatibility.limit(byteBuffer, this.chunkSize + 7);
        while (true) {
            int position = byteBuffer.position();
            int i = this.chunkSize;
            if (position < i) {
                byteBuffer.putLong(0L);
            } else {
                com.google.common.hash.Java8Compatibility.limit(byteBuffer, i);
                com.google.common.hash.Java8Compatibility.flip(byteBuffer);
                process(byteBuffer);
                return;
            }
        }
    }

    @Override // com.google.common.hash.AbstractHasher, com.google.common.hash.Hasher, com.google.common.hash.PrimitiveSink
    public final com.google.common.hash.Hasher putBytes(byte[] bArr, int i, int i2) {
        return putBytesInternal(java.nio.ByteBuffer.wrap(bArr, i, i2).order(java.nio.ByteOrder.LITTLE_ENDIAN));
    }

    @Override // com.google.common.hash.AbstractHasher, com.google.common.hash.Hasher, com.google.common.hash.PrimitiveSink
    public final com.google.common.hash.Hasher putBytes(java.nio.ByteBuffer byteBuffer) {
        java.nio.ByteOrder order = byteBuffer.order();
        try {
            byteBuffer.order(java.nio.ByteOrder.LITTLE_ENDIAN);
            return putBytesInternal(byteBuffer);
        } finally {
            byteBuffer.order(order);
        }
    }

    private com.google.common.hash.Hasher putBytesInternal(java.nio.ByteBuffer byteBuffer) {
        if (byteBuffer.remaining() <= this.buffer.remaining()) {
            this.buffer.put(byteBuffer);
            munchIfFull();
            return this;
        }
        int i = this.bufferSize;
        int position = this.buffer.position();
        for (int i2 = 0; i2 < i - position; i2++) {
            this.buffer.put(byteBuffer.get());
        }
        munch();
        while (byteBuffer.remaining() >= this.chunkSize) {
            process(byteBuffer);
        }
        this.buffer.put(byteBuffer);
        return this;
    }

    @Override // com.google.common.hash.Hasher, com.google.common.hash.PrimitiveSink
    public final com.google.common.hash.Hasher putByte(byte b) {
        this.buffer.put(b);
        munchIfFull();
        return this;
    }

    @Override // com.google.common.hash.AbstractHasher, com.google.common.hash.Hasher, com.google.common.hash.PrimitiveSink
    public final com.google.common.hash.Hasher putShort(short s) {
        this.buffer.putShort(s);
        munchIfFull();
        return this;
    }

    @Override // com.google.common.hash.AbstractHasher, com.google.common.hash.Hasher, com.google.common.hash.PrimitiveSink
    public final com.google.common.hash.Hasher putChar(char c) {
        this.buffer.putChar(c);
        munchIfFull();
        return this;
    }

    @Override // com.google.common.hash.AbstractHasher, com.google.common.hash.Hasher, com.google.common.hash.PrimitiveSink
    public final com.google.common.hash.Hasher putInt(int i) {
        this.buffer.putInt(i);
        munchIfFull();
        return this;
    }

    @Override // com.google.common.hash.AbstractHasher, com.google.common.hash.Hasher, com.google.common.hash.PrimitiveSink
    public final com.google.common.hash.Hasher putLong(long j) {
        this.buffer.putLong(j);
        munchIfFull();
        return this;
    }

    @Override // com.google.common.hash.Hasher
    public final com.google.common.hash.HashCode hash() {
        munch();
        com.google.common.hash.Java8Compatibility.flip(this.buffer);
        if (this.buffer.remaining() > 0) {
            processRemaining(this.buffer);
            java.nio.ByteBuffer byteBuffer = this.buffer;
            com.google.common.hash.Java8Compatibility.position(byteBuffer, byteBuffer.limit());
        }
        return makeHash();
    }

    private void munchIfFull() {
        if (this.buffer.remaining() < 8) {
            munch();
        }
    }

    private void munch() {
        com.google.common.hash.Java8Compatibility.flip(this.buffer);
        while (this.buffer.remaining() >= this.chunkSize) {
            process(this.buffer);
        }
        this.buffer.compact();
    }
}
