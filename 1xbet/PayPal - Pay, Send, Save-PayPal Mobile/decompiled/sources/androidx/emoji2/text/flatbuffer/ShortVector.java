package androidx.emoji2.text.flatbuffer;

/* loaded from: classes7.dex */
public final class ShortVector extends androidx.emoji2.text.flatbuffer.BaseVector {
    public final androidx.emoji2.text.flatbuffer.ShortVector __assign(int i, java.nio.ByteBuffer byteBuffer) {
        __reset(i, 2, byteBuffer);
        return this;
    }

    public final short get(int i) {
        return this.bb.getShort(__element(i));
    }

    public final int getAsUnsigned(int i) {
        return get(i) & kotlin.UShort.MAX_VALUE;
    }
}
