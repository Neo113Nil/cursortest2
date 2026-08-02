package B;

import A0.C0064w;
import android.os.Trace;
import java.util.List;
import r.C2317C;
import x0.g0;
import x0.i0;

/* loaded from: classes.dex */
public final class M implements z {

    /* renamed from: a, reason: collision with root package name */
    public final int f645a;

    /* renamed from: b, reason: collision with root package name */
    public final long f646b;

    /* renamed from: c, reason: collision with root package name */
    public final N f647c;

    /* renamed from: d, reason: collision with root package name */
    public g0 f648d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f649e;
    public boolean f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f650g;

    /* renamed from: h, reason: collision with root package name */
    public L f651h;
    public boolean i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ v3.e f652j;

    public M(v3.e eVar, int i, long j5, N n5) {
        this.f652j = eVar;
        this.f645a = i;
        this.f646b = j5;
        this.f647c = n5;
    }

    @Override // B.z
    public final void a() {
        this.i = true;
    }

    public final boolean b(C0072a c0072a) {
        L l5;
        if (c()) {
            Object b3 = ((A.k) ((q) this.f652j.f20432l).f699b.invoke()).b(this.f645a);
            boolean z3 = this.f648d != null;
            N n5 = this.f647c;
            if (!z3) {
                long c5 = (b3 == null || ((C2317C) n5.f655m).b(b3) < 0) ? n5.f653k : ((C2317C) n5.f655m).c(b3);
                long a5 = c0072a.a();
                if ((!this.i || a5 <= 0) && c5 >= a5) {
                    return true;
                }
                long nanoTime = System.nanoTime();
                Trace.beginSection("compose:lazy:prefetch:compose");
                try {
                    d();
                    Trace.endSection();
                    long nanoTime2 = System.nanoTime() - nanoTime;
                    if (b3 != null) {
                        C2317C c2317c = (C2317C) n5.f655m;
                        int b5 = c2317c.b(b3);
                        ((C2317C) n5.f655m).e(N.a(n5, nanoTime2, b5 >= 0 ? c2317c.f18908c[b5] : 0L), b3);
                    }
                    n5.f653k = N.a(n5, nanoTime2, n5.f653k);
                } finally {
                }
            }
            if (!this.i) {
                if (!this.f650g) {
                    if (c0072a.a() <= 0) {
                        return true;
                    }
                    Trace.beginSection("compose:lazy:prefetch:resolve-nested");
                    try {
                        g0 g0Var = this.f648d;
                        if (g0Var == null) {
                            throw new IllegalArgumentException("Should precompose before resolving nested prefetch states");
                        }
                        kotlin.jvm.internal.w wVar = new kotlin.jvm.internal.w();
                        g0Var.d(new C0064w(wVar, 1));
                        List list = (List) wVar.f17624k;
                        if (list != null) {
                            l5 = new L();
                            l5.f644e = this;
                            l5.f642c = list;
                            l5.f643d = new List[list.size()];
                            if (list.isEmpty()) {
                                throw new IllegalArgumentException("NestedPrefetchController shouldn't be created with no states");
                            }
                        } else {
                            l5 = null;
                        }
                        this.f651h = l5;
                        this.f650g = true;
                    } finally {
                    }
                }
                L l6 = this.f651h;
                if (l6 != null) {
                    List[] listArr = (List[]) l6.f643d;
                    int i = l6.f640a;
                    List list2 = (List) l6.f642c;
                    if (i < list2.size()) {
                        if (((M) l6.f644e).f) {
                            throw new IllegalStateException("Should not execute nested prefetch on canceled request");
                        }
                        Trace.beginSection("compose:lazy:prefetch:nested");
                        while (l6.f640a < list2.size()) {
                            try {
                                if (listArr[l6.f640a] == null) {
                                    if (c0072a.a() <= 0) {
                                        return true;
                                    }
                                    int i5 = l6.f640a;
                                    A a6 = (A) list2.get(i5);
                                    A.x xVar = a6.f606a;
                                    y yVar = new y(a6);
                                    xVar.c(yVar);
                                    listArr[i5] = yVar.f724a;
                                }
                                List list3 = listArr[l6.f640a];
                                kotlin.jvm.internal.l.c(list3);
                                while (l6.f641b < list3.size()) {
                                    if (((M) list3.get(l6.f641b)).b(c0072a)) {
                                        return true;
                                    }
                                    l6.f641b++;
                                }
                                l6.f641b = 0;
                                l6.f640a++;
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                    }
                }
            }
            if (!this.f649e) {
                long j5 = this.f646b;
                if (!W0.a.k(j5)) {
                    long c6 = (b3 == null || ((C2317C) n5.f656n).b(b3) < 0) ? n5.f654l : ((C2317C) n5.f656n).c(b3);
                    long a7 = c0072a.a();
                    if ((!this.i || a7 <= 0) && c6 >= a7) {
                        return true;
                    }
                    long nanoTime3 = System.nanoTime();
                    Trace.beginSection("compose:lazy:prefetch:measure");
                    try {
                        e(j5);
                        Trace.endSection();
                        long nanoTime4 = System.nanoTime() - nanoTime3;
                        if (b3 != null) {
                            C2317C c2317c2 = (C2317C) n5.f656n;
                            int b6 = c2317c2.b(b3);
                            ((C2317C) n5.f656n).e(N.a(n5, nanoTime4, b6 >= 0 ? c2317c2.f18908c[b6] : 0L), b3);
                        }
                        n5.f654l = N.a(n5, nanoTime4, n5.f654l);
                        return false;
                    } finally {
                    }
                }
            }
        }
        return false;
    }

    public final boolean c() {
        if (this.f) {
            return false;
        }
        int c5 = ((A.k) ((q) this.f652j.f20432l).f699b.invoke()).c();
        int i = this.f645a;
        return i >= 0 && i < c5;
    }

    @Override // B.z
    public final void cancel() {
        if (this.f) {
            return;
        }
        this.f = true;
        g0 g0Var = this.f648d;
        if (g0Var != null) {
            g0Var.a();
        }
        this.f648d = null;
    }

    public final void d() {
        if (!c()) {
            throw new IllegalArgumentException("Callers should check whether the request is still valid before calling performComposition()");
        }
        if (this.f648d != null) {
            throw new IllegalArgumentException("Request was already composed!");
        }
        v3.e eVar = this.f652j;
        A.k kVar = (A.k) ((q) eVar.f20432l).f699b.invoke();
        int i = this.f645a;
        Object d5 = kVar.d(i);
        this.f648d = ((i0) eVar.f20433m).a().d(((q) eVar.f20432l).a(i, d5, kVar.b(i)), d5);
    }

    public final void e(long j5) {
        if (this.f) {
            throw new IllegalArgumentException("Callers should check whether the request is still valid before calling performMeasure()");
        }
        if (this.f649e) {
            throw new IllegalArgumentException("Request was already measured!");
        }
        this.f649e = true;
        g0 g0Var = this.f648d;
        if (g0Var == null) {
            throw new IllegalArgumentException("performComposition() must be called before performMeasure()");
        }
        int b3 = g0Var.b();
        for (int i = 0; i < b3; i++) {
            g0Var.c(i, j5);
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("HandleAndRequestImpl { index = ");
        sb.append(this.f645a);
        sb.append(", constraints = ");
        sb.append((Object) W0.a.l(this.f646b));
        sb.append(", isComposed = ");
        sb.append(this.f648d != null);
        sb.append(", isMeasured = ");
        sb.append(this.f649e);
        sb.append(", isCanceled = ");
        sb.append(this.f);
        sb.append(" }");
        return sb.toString();
    }
}
