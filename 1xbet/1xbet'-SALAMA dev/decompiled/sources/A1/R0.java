package A1;

import android.util.Pair;

/* JADX INFO: loaded from: classes.dex */
public abstract class R0 implements InterfaceC0027k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
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

    public final int d(int i7, P0 p5, Q0 q1, int i8, boolean z4) {
        int i9 = f(i7, p5, false).f188c;
        if (m(i9, q1, 0L).f209G != i7) {
            return i7 + 1;
        }
        int iE = e(i9, i8, z4);
        if (iE == -1) {
            return -1;
        }
        return m(iE, q1, 0L).f208F;
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
        R0 r7 = (R0) obj;
        if (r7.o() != o() || r7.h() != h()) {
            return false;
        }
        Q0 q1 = new Q0();
        P0 p5 = new P0();
        Q0 q7 = new Q0();
        P0 p7 = new P0();
        for (int i7 = 0; i7 < o(); i7++) {
            if (!m(i7, q1, 0L).equals(r7.m(i7, q7, 0L))) {
                return false;
            }
        }
        for (int i8 = 0; i8 < h(); i8++) {
            if (!f(i8, p5, true).equals(r7.f(i8, p7, true))) {
                return false;
            }
        }
        return true;
    }

    public abstract P0 f(int i7, P0 p5, boolean z4);

    public P0 g(Object obj, P0 p5) {
        return f(b(obj), p5, true);
    }

    public abstract int h();

    public final int hashCode() {
        Q0 q1 = new Q0();
        P0 p5 = new P0();
        int iO = o() + 217;
        for (int i7 = 0; i7 < o(); i7++) {
            iO = (iO * 31) + m(i7, q1, 0L).hashCode();
        }
        int iH = h() + (iO * 31);
        for (int i8 = 0; i8 < h(); i8++) {
            iH = (iH * 31) + f(i8, p5, true).hashCode();
        }
        return iH;
    }

    public final Pair i(Q0 q1, P0 p5, int i7, long j) {
        Pair pairJ = j(q1, p5, i7, j, 0L);
        pairJ.getClass();
        return pairJ;
    }

    public final Pair j(Q0 q1, P0 p5, int i7, long j, long j3) {
        p151v2.a.g(i7, o());
        m(i7, q1, j3);
        if (j == -9223372036854775807L) {
            j = q1.f206D;
            if (j == -9223372036854775807L) {
                return null;
            }
        }
        int i8 = q1.f208F;
        f(i8, p5, false);
        while (i8 < q1.f209G && p5.f190e != j) {
            int i9 = i8 + 1;
            if (f(i9, p5, false).f190e > j) {
                break;
            }
            i8 = i9;
        }
        f(i8, p5, true);
        long jMin = j - p5.f190e;
        long j7 = p5.f189d;
        if (j7 != -9223372036854775807L) {
            jMin = Math.min(jMin, j7 - 1);
        }
        long jMax = Math.max(0L, jMin);
        Object obj = p5.f187b;
        obj.getClass();
        return Pair.create(obj, Long.valueOf(jMax));
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

    public abstract Q0 m(int i7, Q0 q1, long j);

    public final void n(int i7, Q0 q1) {
        m(i7, q1, 0L);
    }

    public abstract int o();

    public final boolean p() {
        return o() == 0;
    }
}
