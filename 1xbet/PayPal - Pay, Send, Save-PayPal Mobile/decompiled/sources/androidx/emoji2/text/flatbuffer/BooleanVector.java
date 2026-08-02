package androidx.emoji2.text.flatbuffer;

/* loaded from: classes7.dex */
public final class BooleanVector extends androidx.emoji2.text.flatbuffer.BaseVector {
    public final androidx.emoji2.text.flatbuffer.BooleanVector __assign(int i, java.nio.ByteBuffer byteBuffer) {
        __reset(i, 1, byteBuffer);
        return this;
    }

    public final boolean get(int i) {
        return this.bb.get(__element(i)) != 0;
    }
}
