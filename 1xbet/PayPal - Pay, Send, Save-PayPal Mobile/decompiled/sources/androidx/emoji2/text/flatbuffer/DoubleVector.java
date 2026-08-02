package androidx.emoji2.text.flatbuffer;

/* loaded from: classes7.dex */
public final class DoubleVector extends androidx.emoji2.text.flatbuffer.BaseVector {
    public final androidx.emoji2.text.flatbuffer.DoubleVector __assign(int i, java.nio.ByteBuffer byteBuffer) {
        __reset(i, 8, byteBuffer);
        return this;
    }

    public final double get(int i) {
        return this.bb.getDouble(__element(i));
    }
}
