package com.google.common.hash;

import com.google.common.base.Preconditions;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* loaded from: classes2.dex */
abstract class AbstractByteHasher extends AbstractHasher {
    private ByteBuffer scratch;

    protected abstract void update(byte b);

    AbstractByteHasher() {
    }

    protected void update(byte[] b) {
        update(b, 0, b.length);
    }

    protected void update(byte[] b, int off, int len) {
        for (int i = off; i < off + len; i++) {
            update(b[i]);
        }
    }

    protected void update(ByteBuffer b) {
        if (b.hasArray()) {
            update(b.array(), b.arrayOffset() + b.position(), b.remaining());
            Java8Compatibility.position(b, b.limit());
        } else {
            for (int remaining = b.remaining(); remaining > 0; remaining--) {
                update(b.get());
            }
        }
    }

    private Hasher update(ByteBuffer scratch, int bytes) {
        try {
            update(scratch.array(), 0, bytes);
            return this;
        } finally {
            Java8Compatibility.clear(scratch);
        }
    }

    @Override // com.google.common.hash.Hasher, com.google.common.hash.PrimitiveSink
    public Hasher putByte(byte b) {
        update(b);
        return this;
    }

    @Override // com.google.common.hash.AbstractHasher, com.google.common.hash.Hasher, com.google.common.hash.PrimitiveSink
    public Hasher putBytes(byte[] bytes) {
        Preconditions.checkNotNull(bytes);
        update(bytes);
        return this;
    }

    @Override // com.google.common.hash.AbstractHasher, com.google.common.hash.Hasher, com.google.common.hash.PrimitiveSink
    public Hasher putBytes(byte[] bytes, int off, int len) {
        Preconditions.checkPositionIndexes(off, off + len, bytes.length);
        update(bytes, off, len);
        return this;
    }

    @Override // com.google.common.hash.AbstractHasher, com.google.common.hash.Hasher, com.google.common.hash.PrimitiveSink
    public Hasher putBytes(ByteBuffer bytes) {
        update(bytes);
        return this;
    }

    @Override // com.google.common.hash.AbstractHasher, com.google.common.hash.Hasher, com.google.common.hash.PrimitiveSink
    public Hasher putShort(short s) {
        ByteBuffer scratch = scratch();
        scratch.putShort(s);
        return update(scratch, 2);
    }

    @Override // com.google.common.hash.AbstractHasher, com.google.common.hash.Hasher, com.google.common.hash.PrimitiveSink
    public Hasher putInt(int i) {
        ByteBuffer scratch = scratch();
        scratch.putInt(i);
        return update(scratch, 4);
    }

    @Override // com.google.common.hash.AbstractHasher, com.google.common.hash.Hasher, com.google.common.hash.PrimitiveSink
    public Hasher putLong(long l) {
        ByteBuffer scratch = scratch();
        scratch.putLong(l);
        return update(scratch, 8);
    }

    @Override // com.google.common.hash.AbstractHasher, com.google.common.hash.Hasher, com.google.common.hash.PrimitiveSink
    public Hasher putChar(char c) {
        ByteBuffer scratch = scratch();
        scratch.putChar(c);
        return update(scratch, 2);
    }

    private ByteBuffer scratch() {
        if (this.scratch == null) {
            this.scratch = ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN);
        }
        return this.scratch;
    }
}
