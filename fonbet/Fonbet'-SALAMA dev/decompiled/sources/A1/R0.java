package A1;

import android.util.Pair;
import v2.AbstractC1664a;

/* loaded from: classes.dex */
public abstract class R0 implements InterfaceC0027k {

    /* renamed from: a, reason: collision with root package name */
    public static final O0 f220a = new O0();

    public int a(boolean z4) {
        return p() ? -1 : 0;
    }

    public abstract int b(Object obj);

    public int c(boolean z4) {
        if (p()) {
            return -1;
        }
        return o() - 1;
    }

    public final int d(int i7, P0 p02, Q0 q02, int i8, boolean z4) {
        int i9 = f(i7, p02, false).f188c;
        if (m(i9, q02, 0L).f209G != i7) {
            return i7 + 1;
        }
        int e7 = e(i9, i8, z4);
        if (e7 == -1) {
            return -1;
        }
        return m(e7, q02, 0L).f208F;
    }

    public int e(int i7, int i8, boolean z4) {
        if (i8 == 0) {
            if (i7 == c(z4)) {
                return -1;
            }
            return i7 + 1;
        }
        if (i8 == 1) {
            return i7;
        }
        if (i8 == 2) {
            return i7 == c(z4) ? a(z4) : i7 + 1;
        }
        throw new IllegalStateException();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof R0)) {
            return false;
        }
        R0 r02 = (R0) obj;
        if (r02.o() != o() || r02.h() != h()) {
            return false;
        }
        Q0 q02 = new Q0();
        P0 p02 = new P0();
        Q0 q03 = new Q0();
        P0 p03 = new P0();
        for (int i7 = 0; i7 < o(); i7++) {
            if (!m(i7, q02, 0L).equals(r02.m(i7, q03, 0L))) {
                return false;
            }
        }
        for (int i8 = 0; i8 < h(); i8++) {
            if (!f(i8, p02, true).equals(r02.f(i8, p03, true))) {
                return false;
            }
        }
        return true;
    }

    public abstract P0 f(int i7, P0 p02, boolean z4);

    public P0 g(Object obj, P0 p02) {
        return f(b(obj), p02, true);
    }

    public abstract int h();

    public final int hashCode() {
        Q0 q02 = new Q0();
        P0 p02 = new P0();
        int o7 = o() + 217;
        for (int i7 = 0; i7 < o(); i7++) {
            o7 = (o7 * 31) + m(i7, q02, 0L).hashCode();
        }
        int h6 = h() + (o7 * 31);
        for (int i8 = 0; i8 < h(); i8++) {
            h6 = (h6 * 31) + f(i8, p02, true).hashCode();
        }
        return h6;
    }

    public final Pair i(Q0 q02, P0 p02, int i7, long j) {
        Pair j3 = j(q02, p02, i7, j, 0L);
        j3.getClass();
        return j3;
    }

    public final Pair j(Q0 q02, P0 p02, int i7, long j, long j3) {
        AbstractC1664a.g(i7, o());
        m(i7, q02, j3);
        if (j == -9223372036854775807L) {
            j = q02.f206D;
            if (j == -9223372036854775807L) {
                return null;
            }
        }
        int i8 = q02.f208F;
        f(i8, p02, false);
        while (i8 < q02.f209G && p02.f190e != j) {
            int i9 = i8 + 1;
            if (f(i9, p02, false).f190e > j) {
                break;
            }
            i8 = i9;
        }
        f(i8, p02, true);
        long j7 = j - p02.f190e;
        long j8 = p02.f189d;
        if (j8 != -9223372036854775807L) {
            j7 = Math.min(j7, j8 - 1);
        }
        long max = Math.max(0L, j7);
        Object obj = p02.f187b;
        obj.getClass();
        return Pair.create(obj, Long.valueOf(max));
    }

    public int k(int i7, int i8, boolean z4) {
        if (i8 == 0) {
            if (i7 == a(z4)) {
                return -1;
            }
            return i7 - 1;
        }
        if (i8 == 1) {
            return i7;
        }
        if (i8 == 2) {
            return i7 == a(z4) ? c(z4) : i7 - 1;
        }
        throw new IllegalStateException();
    }

    public abstract Object l(int i7);

    public abstract Q0 m(int i7, Q0 q02, long j);

    public final void n(int i7, Q0 q02) {
        m(i7, q02, 0L);
    }

    public abstract int o();

    public final boolean p() {
        return o() == 0;
    }
}
