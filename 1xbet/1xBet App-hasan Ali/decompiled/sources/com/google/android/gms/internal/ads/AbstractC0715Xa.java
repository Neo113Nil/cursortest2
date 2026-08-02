package com.google.android.gms.internal.ads;

import android.util.Pair;

/* renamed from: com.google.android.gms.internal.ads.Xa, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0715Xa {

    /* renamed from: a, reason: collision with root package name */
    public static final C1291ma f12197a = new C1291ma();

    static {
        Integer.toString(0, 36);
        Integer.toString(1, 36);
        Integer.toString(2, 36);
    }

    public abstract int a(Object obj);

    public abstract int b();

    public abstract int c();

    public abstract C1785xa d(int i, C1785xa c1785xa, boolean z3);

    public abstract C0603Ha e(int i, C0603Ha c0603Ha, long j5);

    public final boolean equals(Object obj) {
        int h3;
        if (this != obj) {
            if (obj instanceof AbstractC0715Xa) {
                AbstractC0715Xa abstractC0715Xa = (AbstractC0715Xa) obj;
                if (abstractC0715Xa.c() == c() && abstractC0715Xa.b() == b()) {
                    C0603Ha c0603Ha = new C0603Ha();
                    C1785xa c1785xa = new C1785xa();
                    C0603Ha c0603Ha2 = new C0603Ha();
                    C1785xa c1785xa2 = new C1785xa();
                    int i = 0;
                    while (true) {
                        if (i >= c()) {
                            int i5 = 0;
                            while (true) {
                                if (i5 >= b()) {
                                    int g5 = g(true);
                                    if (g5 == abstractC0715Xa.g(true) && (h3 = h(true)) == abstractC0715Xa.h(true)) {
                                        while (g5 != h3) {
                                            int j5 = j(g5, 0, true);
                                            if (j5 == abstractC0715Xa.j(g5, 0, true)) {
                                                g5 = j5;
                                            }
                                        }
                                    }
                                } else {
                                    if (!d(i5, c1785xa, true).equals(abstractC0715Xa.d(i5, c1785xa2, true))) {
                                        break;
                                    }
                                    i5++;
                                }
                            }
                        } else {
                            if (!e(i, c0603Ha, 0L).equals(abstractC0715Xa.e(i, c0603Ha2, 0L))) {
                                break;
                            }
                            i++;
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public abstract Object f(int i);

    public int g(boolean z3) {
        return o() ? -1 : 0;
    }

    public int h(boolean z3) {
        if (o()) {
            return -1;
        }
        return c() - 1;
    }

    public final int hashCode() {
        int i;
        C0603Ha c0603Ha = new C0603Ha();
        C1785xa c1785xa = new C1785xa();
        int c5 = c() + 217;
        int i5 = 0;
        while (true) {
            i = c5 * 31;
            if (i5 >= c()) {
                break;
            }
            c5 = i + e(i5, c0603Ha, 0L).hashCode();
            i5++;
        }
        int b3 = b() + i;
        for (int i6 = 0; i6 < b(); i6++) {
            b3 = (b3 * 31) + d(i6, c1785xa, true).hashCode();
        }
        int g5 = g(true);
        while (g5 != -1) {
            b3 = (b3 * 31) + g5;
            g5 = j(g5, 0, true);
        }
        return b3;
    }

    public final int i(int i, C1785xa c1785xa, C0603Ha c0603Ha, int i5, boolean z3) {
        int i6 = d(i, c1785xa, false).f16290c;
        if (e(i6, c0603Ha, 0L).f9406l != i) {
            return i + 1;
        }
        int j5 = j(i6, i5, z3);
        if (j5 == -1) {
            return -1;
        }
        return e(j5, c0603Ha, 0L).f9405k;
    }

    public int j(int i, int i5, boolean z3) {
        if (i5 == 0) {
            if (i == h(z3)) {
                return -1;
            }
            return i + 1;
        }
        if (i5 == 1) {
            return i;
        }
        if (i5 == 2) {
            return i == h(z3) ? g(z3) : i + 1;
        }
        throw new IllegalStateException();
    }

    public int k(int i) {
        if (i == g(false)) {
            return -1;
        }
        return i - 1;
    }

    public final Pair l(C0603Ha c0603Ha, C1785xa c1785xa, int i, long j5) {
        Pair m5 = m(c0603Ha, c1785xa, i, j5, 0L);
        m5.getClass();
        return m5;
    }

    public final Pair m(C0603Ha c0603Ha, C1785xa c1785xa, int i, long j5, long j6) {
        AbstractC1668us.n(i, c());
        e(i, c0603Ha, j6);
        if (j5 == -9223372036854775807L) {
            c0603Ha.getClass();
            j5 = 0;
        }
        int i5 = c0603Ha.f9405k;
        d(i5, c1785xa, false);
        while (i5 < c0603Ha.f9406l) {
            c1785xa.getClass();
            if (j5 == 0) {
                break;
            }
            int i6 = i5 + 1;
            d(i6, c1785xa, false).getClass();
            if (j5 < 0) {
                break;
            }
            i5 = i6;
        }
        d(i5, c1785xa, true);
        c1785xa.getClass();
        long j7 = c1785xa.f16291d;
        if (j7 != -9223372036854775807L) {
            j5 = Math.min(j5, j7 - 1);
        }
        long max = Math.max(0L, j5);
        Object obj = c1785xa.f16289b;
        obj.getClass();
        return Pair.create(obj, Long.valueOf(max));
    }

    public C1785xa n(Object obj, C1785xa c1785xa) {
        return d(a(obj), c1785xa, true);
    }

    public final boolean o() {
        return c() == 0;
    }
}
