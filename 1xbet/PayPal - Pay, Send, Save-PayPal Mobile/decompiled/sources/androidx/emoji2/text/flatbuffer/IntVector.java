package androidx.emoji2.text.flatbuffer;

/* loaded from: classes7.dex */
public final class IntVector extends androidx.emoji2.text.flatbuffer.BaseVector {
    public final androidx.emoji2.text.flatbuffer.IntVector __assign(int i, java.nio.ByteBuffer byteBuffer) {
        __reset(i, 4, byteBuffer);
        return this;
    }

    public final int get(int i) {
        return this.bb.getInt(__element(i));
    }

    public final long getAsUnsigned(int i) {
        return get(i) & 4294967295L;
    }
}
