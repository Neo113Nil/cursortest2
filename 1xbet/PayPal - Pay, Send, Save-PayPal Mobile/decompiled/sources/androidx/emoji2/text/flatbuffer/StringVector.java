package androidx.emoji2.text.flatbuffer;

/* loaded from: classes7.dex */
public final class StringVector extends androidx.emoji2.text.flatbuffer.BaseVector {
    private androidx.emoji2.text.flatbuffer.Utf8 getHighSpeedVideoSizes = androidx.emoji2.text.flatbuffer.Utf8.getDefault();

    public final androidx.emoji2.text.flatbuffer.StringVector __assign(int i, int i2, java.nio.ByteBuffer byteBuffer) {
        __reset(i, i2, byteBuffer);
        return this;
    }

    public final java.lang.String get(int i) {
        return androidx.emoji2.text.flatbuffer.Table.__string(__element(i), this.bb, this.getHighSpeedVideoSizes);
    }
}
