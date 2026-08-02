package A0;

import h0.C1989c;

/* renamed from: A0.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0021e extends AbstractC0015c {

    /* renamed from: e, reason: collision with root package name */
    public static C0021e f489e;
    public static final V0.j f = V0.j.f5941l;

    /* renamed from: g, reason: collision with root package name */
    public static final V0.j f490g = V0.j.f5940k;

    /* renamed from: c, reason: collision with root package name */
    public K0.L f491c;

    /* renamed from: d, reason: collision with root package name */
    public H0.n f492d;

    @Override // A0.AbstractC0015c
    public final int[] a(int i) {
        int i5;
        if (e().length() <= 0 || i >= e().length()) {
            return null;
        }
        try {
            H0.n nVar = this.f492d;
            if (nVar == null) {
                kotlin.jvm.internal.l.k("node");
                throw null;
            }
            C1989c g5 = nVar.g();
            int round = Math.round(g5.f17196d - g5.f17194b);
            if (i <= 0) {
                i = 0;
            }
            K0.L l5 = this.f491c;
            if (l5 == null) {
                kotlin.jvm.internal.l.k("layoutResult");
                throw null;
            }
            int e3 = l5.e(i);
            K0.L l6 = this.f491c;
            if (l6 == null) {
                kotlin.jvm.internal.l.k("layoutResult");
                throw null;
            }
            float d5 = l6.f2793b.d(e3) + round;
            K0.L l7 = this.f491c;
            if (l7 == null) {
                kotlin.jvm.internal.l.k("layoutResult");
                throw null;
            }
            if (l7 == null) {
                kotlin.jvm.internal.l.k("layoutResult");
                throw null;
            }
            if (d5 < l7.f2793b.d(r0.f - 1)) {
                K0.L l8 = this.f491c;
                if (l8 == null) {
                    kotlin.jvm.internal.l.k("layoutResult");
                    throw null;
                }
                i5 = l8.f2793b.c(d5);
            } else {
                K0.L l9 = this.f491c;
                if (l9 == null) {
                    kotlin.jvm.internal.l.k("layoutResult");
                    throw null;
                }
                i5 = l9.f2793b.f;
            }
            return b(i, q(i5 - 1, f490g) + 1);
        } catch (IllegalStateException unused) {
            return null;
        }
    }

    @Override // A0.AbstractC0015c
    public final int[] k(int i) {
        int i5;
        if (e().length() <= 0 || i <= 0) {
            return null;
        }
        try {
            H0.n nVar = this.f492d;
            if (nVar == null) {
                kotlin.jvm.internal.l.k("node");
                throw null;
            }
            C1989c g5 = nVar.g();
            int round = Math.round(g5.f17196d - g5.f17194b);
            int length = e().length();
            if (length <= i) {
                i = length;
            }
            K0.L l5 = this.f491c;
            if (l5 == null) {
                kotlin.jvm.internal.l.k("layoutResult");
                throw null;
            }
            int e3 = l5.e(i);
            K0.L l6 = this.f491c;
            if (l6 == null) {
                kotlin.jvm.internal.l.k("layoutResult");
                throw null;
            }
            float d5 = l6.f2793b.d(e3) - round;
            if (d5 > 0.0f) {
                K0.L l7 = this.f491c;
                if (l7 == null) {
                    kotlin.jvm.internal.l.k("layoutResult");
                    throw null;
                }
                i5 = l7.f2793b.c(d5);
            } else {
                i5 = 0;
            }
            if (i == e().length() && i5 < e3) {
                i5++;
            }
            return b(q(i5, f), i);
        } catch (IllegalStateException unused) {
            return null;
        }
    }

    public final int q(int i, V0.j jVar) {
        K0.L l5 = this.f491c;
        if (l5 == null) {
            kotlin.jvm.internal.l.k("layoutResult");
            throw null;
        }
        int h3 = l5.h(i);
        K0.L l6 = this.f491c;
        if (l6 == null) {
            kotlin.jvm.internal.l.k("layoutResult");
            throw null;
        }
        if (jVar != l6.i(h3)) {
            K0.L l7 = this.f491c;
            if (l7 != null) {
                return l7.h(i);
            }
            kotlin.jvm.internal.l.k("layoutResult");
            throw null;
        }
        if (this.f491c != null) {
            return r6.d(i, false) - 1;
        }
        kotlin.jvm.internal.l.k("layoutResult");
        throw null;
    }
}
