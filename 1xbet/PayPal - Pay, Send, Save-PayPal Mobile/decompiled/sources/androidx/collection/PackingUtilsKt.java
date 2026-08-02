package androidx.collection;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\u001a \u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\u0080\b¢\u0006\u0004\b\u0004\u0010\u0005\u001a \u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00062\u0006\u0010\u0002\u001a\u00020\u0006H\u0080\b¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"", "val1", "val2", "", "packFloats", "(FF)J", "", "packInts", "(II)J"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class PackingUtilsKt {
    public static final long packInts(int i, int i2) {
        return (i2 & 4294967295L) | (i << 32);
    }

    public static final long packFloats(float f, float f2) {
        return (java.lang.Float.floatToRawIntBits(f2) & 4294967295L) | (java.lang.Float.floatToRawIntBits(f) << 32);
    }
}
