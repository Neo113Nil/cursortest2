package kotlinx.datetime.internal;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\u001a\u001f\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u001f\u0010\u0003\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00052\u0006\u0010\u0002\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\u0003\u0010\u0006\u001a\u001f\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00052\u0006\u0010\u0002\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\u0007\u0010\u0006\u001a\u001f\u0010\u0007\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0007\u0010\u0004"}, d2 = {"", "a", util.h.xy.cb.b.f1091, "safeMultiply", "(JJ)J", "", "(II)I", "safeAdd"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class MathJvmKt {
    public static final long safeMultiply(long j, long j2) {
        return java.lang.Math.multiplyExact(j, j2);
    }

    public static final int safeMultiply(int i, int i2) {
        return java.lang.Math.multiplyExact(i, i2);
    }

    public static final int safeAdd(int i, int i2) {
        return java.lang.Math.addExact(i, i2);
    }

    public static final long safeAdd(long j, long j2) {
        return java.lang.Math.addExact(j, j2);
    }
}
