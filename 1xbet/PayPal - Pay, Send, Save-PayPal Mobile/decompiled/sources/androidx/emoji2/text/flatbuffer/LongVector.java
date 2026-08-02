package androidx.emoji2.text.flatbuffer;

/* loaded from: classes7.dex */
public final class LongVector extends androidx.emoji2.text.flatbuffer.BaseVector {
    public final androidx.emoji2.text.flatbuffer.LongVector __assign(int i, java.nio.ByteBuffer byteBuffer) {
        __reset(i, 8, byteBuffer);
        return this;
    }

    public final long get(int i) {
        return this.bb.getLong(__element(i));
    }
}
