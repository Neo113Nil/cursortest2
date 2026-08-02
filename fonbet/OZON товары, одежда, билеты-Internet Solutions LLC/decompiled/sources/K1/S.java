package K1;

import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class S {
    public static final long a(int i11, int i12) {
        if (i11 < 0) {
            throw new IllegalArgumentException(("start cannot be negative. [start: " + i11 + ", end: " + i12 + ']').toString());
        }
        if (i12 >= 0) {
            long j11 = (i12 & 4294967295L) | (i11 << 32);
            int i13 = Q.f15010c;
            return j11;
        }
        throw new IllegalArgumentException(("end cannot be negative. [start: " + i11 + ", end: " + i12 + ']').toString());
    }

    public static final long b(int i11, long j11) {
        int i12 = Q.f15010c;
        int i13 = (int) (j11 >> 32);
        int e11 = kotlin.ranges.h.e(i13, 0, i11);
        int i14 = (int) (4294967295L & j11);
        int e12 = kotlin.ranges.h.e(i14, 0, i11);
        return (e11 == i13 && e12 == i14) ? j11 : a(e11, e12);
    }

    @NotNull
    public static final String c(long j11, @NotNull CharSequence charSequence) {
        return charSequence.subSequence(Q.h(j11), Q.g(j11)).toString();
    }
}
