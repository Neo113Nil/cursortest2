package com.google.common.hash;

@com.google.errorprone.annotations.Immutable
/* loaded from: classes9.dex */
abstract class AbstractNonStreamingHashFunction extends com.google.common.hash.AbstractHashFunction {
    @Override // com.google.common.hash.AbstractHashFunction, com.google.common.hash.HashFunction
    public abstract com.google.common.hash.HashCode hashBytes(byte[] bArr, int i, int i2);

    AbstractNonStreamingHashFunction() {
    }

    @Override // com.google.common.hash.HashFunction
    public com.google.common.hash.Hasher newHasher() {
        return newHasher(32);
    }

    @Override // com.google.common.hash.AbstractHashFunction, com.google.common.hash.HashFunction
    public com.google.common.hash.Hasher newHasher(int i) {
        com.google.common.base.Preconditions.checkArgument(i >= 0);
        return new com.google.common.hash.AbstractNonStreamingHashFunction.BufferingHasher(i);
    }

    @Override // com.google.common.hash.AbstractHashFunction, com.google.common.hash.HashFunction
    public com.google.common.hash.HashCode hashInt(int i) {
        return hashBytes(java.nio.ByteBuffer.allocate(4).order(java.nio.ByteOrder.LITTLE_ENDIAN).putInt(i).array());
    }

    @Override // com.google.common.hash.AbstractHashFunction, com.google.common.hash.HashFunction
    public com.google.common.hash.HashCode hashLong(long j) {
        return hashBytes(java.nio.ByteBuffer.allocate(8).order(java.nio.ByteOrder.LITTLE_ENDIAN).putLong(j).array());
    }

    @Override // com.google.common.hash.AbstractHashFunction, com.google.common.hash.HashFunction
    public com.google.common.hash.HashCode hashUnencodedChars(java.lang.CharSequence charSequence) {
        int length = charSequence.length();
        java.nio.ByteBuffer order = java.nio.ByteBuffer.allocate(length * 2).order(java.nio.ByteOrder.LITTLE_ENDIAN);
        for (int i = 0; i < length; i++) {
            order.putChar(charSequence.charAt(i));
        }
        return hashBytes(order.array());
    }

    @Override // com.google.common.hash.AbstractHashFunction, com.google.common.hash.HashFunction
    public com.google.common.hash.HashCode hashString(java.lang.CharSequence charSequence, java.nio.charset.Charset charset) {
        return hashBytes(charSequence.toString().getBytes(charset));
    }

    @Override // com.google.common.hash.AbstractHashFunction, com.google.common.hash.HashFunction
    public com.google.common.hash.HashCode hashBytes(java.nio.ByteBuffer byteBuffer) {
        return newHasher(byteBuffer.remaining()).putBytes(byteBuffer).hash();
    }

    final class BufferingHasher extends com.google.common.hash.AbstractHasher {
        final com.google.common.hash.AbstractNonStreamingHashFunction.ExposedByteArrayOutputStream stream;

        BufferingHasher(int i) {
            this.stream = new com.google.common.hash.AbstractNonStreamingHashFunction.ExposedByteArrayOutputStream(i);
        }

        @Override // com.google.common.hash.Hasher, com.google.common.hash.PrimitiveSink
        public final com.google.common.hash.Hasher putByte(byte b) {
            this.stream.write(b);
            return this;
        }

        @Override // com.google.common.hash.AbstractHasher, com.google.common.hash.Hasher, com.google.common.hash.PrimitiveSink
        public final com.google.common.hash.Hasher putBytes(byte[] bArr, int i, int i2) {
            this.stream.write(bArr, i, i2);
            return this;
        }

        @Override // com.google.common.hash.AbstractHasher, com.google.common.hash.Hasher, com.google.common.hash.PrimitiveSink
        public final com.google.common.hash.Hasher putBytes(java.nio.ByteBuffer byteBuffer) {
            this.stream.write(byteBuffer);
            return this;
        }

        @Override // com.google.common.hash.Hasher
        public final com.google.common.hash.HashCode hash() {
            return com.google.common.hash.AbstractNonStreamingHashFunction.this.hashBytes(this.stream.byteArray(), 0, this.stream.length());
        }
    }

    static final class ExposedByteArrayOutputStream extends java.io.ByteArrayOutputStream {
        ExposedByteArrayOutputStream(int i) {
            super(i);
        }

        final void write(java.nio.ByteBuffer byteBuffer) {
            int remaining = byteBuffer.remaining();
            if (this.count + remaining > this.buf.length) {
                this.buf = java.util.Arrays.copyOf(this.buf, this.count + remaining);
            }
            byteBuffer.get(this.buf, this.count, remaining);
            this.count += remaining;
        }

        final byte[] byteArray() {
            return this.buf;
        }

        final int length() {
            return this.count;
        }
    }
}
