package androidx.compose.runtime;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\u001a\u001c\u0010\u0002\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u0080\f¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u001c\u0010\u0002\u001a\u00020\u0004*\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u0000H\u0080\f¢\u0006\u0004\b\u0002\u0010\u0005\u001a\u001c\u0010\u0006\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u0080\f¢\u0006\u0004\b\u0006\u0010\u0003\u001a\u001c\u0010\u0006\u001a\u00020\u0004*\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u0000H\u0080\f¢\u0006\u0004\b\u0006\u0010\u0005"}, d2 = {"", "other", "ror", "(II)I", "", "(JI)J", "rol"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class BitwiseOperatorsKt {
    public static final int ror(int i, int i2) {
        return java.lang.Integer.rotateRight(i, i2);
    }

    public static final long ror(long j, int i) {
        return java.lang.Long.rotateRight(j, i);
    }

    public static final int rol(int i, int i2) {
        return java.lang.Integer.rotateLeft(i, i2);
    }

    public static final long rol(long j, int i) {
        return java.lang.Long.rotateLeft(j, i);
    }
}
