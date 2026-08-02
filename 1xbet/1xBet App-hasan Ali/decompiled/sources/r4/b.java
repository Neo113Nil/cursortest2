package r4;

import c4.AbstractC0542c;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import p4.AbstractC2282w;
import p4.C2268h;
import p4.q0;
import r0.AbstractC2346c;

/* loaded from: classes.dex */
public final class b implements q0 {

    /* renamed from: k, reason: collision with root package name */
    public Object f19110k = e.f19137p;

    /* renamed from: l, reason: collision with root package name */
    public C2268h f19111l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ c f19112m;

    public b(c cVar) {
        this.f19112m = cVar;
    }

    public final Object a(AbstractC0542c abstractC0542c) {
        k kVar;
        Boolean bool;
        Object obj = this.f19110k;
        boolean z3 = true;
        if (obj == e.f19137p || obj == e.f19133l) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = c.f19118q;
            c cVar = this.f19112m;
            k kVar2 = (k) atomicReferenceFieldUpdater.get(cVar);
            while (true) {
                cVar.getClass();
                if (cVar.u(c.f19113l.get(cVar), true)) {
                    this.f19110k = e.f19133l;
                    Throwable n5 = cVar.n();
                    if (n5 != null) {
                        int i = u4.r.f20114a;
                        throw n5;
                    }
                    z3 = false;
                } else {
                    long andIncrement = c.f19114m.getAndIncrement(cVar);
                    long j5 = e.f19125b;
                    long j6 = andIncrement / j5;
                    int i5 = (int) (andIncrement % j5);
                    if (kVar2.f20113c != j6) {
                        kVar = cVar.m(j6, kVar2);
                        if (kVar == null) {
                            continue;
                        }
                    } else {
                        kVar = kVar2;
                    }
                    Object C5 = cVar.C(kVar, i5, andIncrement, null);
                    H3.g gVar = e.f19134m;
                    if (C5 == gVar) {
                        throw new IllegalStateException("unreachable");
                    }
                    H3.g gVar2 = e.f19136o;
                    if (C5 == gVar2) {
                        if (andIncrement < cVar.s()) {
                            kVar.a();
                        }
                        kVar2 = kVar;
                    } else {
                        if (C5 == e.f19135n) {
                            c cVar2 = this.f19112m;
                            C2268h k5 = AbstractC2282w.k(AbstractC2346c.v(abstractC0542c));
                            try {
                                this.f19111l = k5;
                                Object C6 = cVar2.C(kVar, i5, andIncrement, this);
                                if (C6 == gVar) {
                                    b(kVar, i5);
                                } else {
                                    if (C6 == gVar2) {
                                        if (andIncrement < cVar2.s()) {
                                            kVar.a();
                                        }
                                        k kVar3 = (k) c.f19118q.get(cVar2);
                                        while (true) {
                                            if (cVar2.u(c.f19113l.get(cVar2), true)) {
                                                C2268h c2268h = this.f19111l;
                                                kotlin.jvm.internal.l.c(c2268h);
                                                this.f19111l = null;
                                                this.f19110k = e.f19133l;
                                                Throwable n6 = cVar.n();
                                                if (n6 == null) {
                                                    c2268h.resumeWith(Boolean.FALSE);
                                                } else {
                                                    c2268h.resumeWith(G4.l.p(n6));
                                                }
                                            } else {
                                                long andIncrement2 = c.f19114m.getAndIncrement(cVar2);
                                                long j7 = e.f19125b;
                                                long j8 = andIncrement2 / j7;
                                                int i6 = (int) (andIncrement2 % j7);
                                                if (kVar3.f20113c != j8) {
                                                    k m5 = cVar2.m(j8, kVar3);
                                                    if (m5 != null) {
                                                        kVar3 = m5;
                                                    }
                                                }
                                                Object C7 = cVar2.C(kVar3, i6, andIncrement2, this);
                                                if (C7 == e.f19134m) {
                                                    b(kVar3, i6);
                                                    break;
                                                }
                                                if (C7 == e.f19136o) {
                                                    if (andIncrement2 < cVar2.s()) {
                                                        kVar3.a();
                                                    }
                                                } else {
                                                    if (C7 == e.f19135n) {
                                                        throw new IllegalStateException("unexpected");
                                                    }
                                                    kVar3.a();
                                                    this.f19110k = C7;
                                                    this.f19111l = null;
                                                    bool = Boolean.TRUE;
                                                }
                                            }
                                        }
                                    } else {
                                        kVar.a();
                                        this.f19110k = C6;
                                        this.f19111l = null;
                                        bool = Boolean.TRUE;
                                    }
                                    k5.j(bool, null);
                                }
                                return k5.q();
                            } catch (Throwable th) {
                                k5.z();
                                throw th;
                            }
                        }
                        kVar.a();
                        this.f19110k = C5;
                    }
                }
            }
        }
        return Boolean.valueOf(z3);
    }

    @Override // p4.q0
    public final void b(u4.q qVar, int i) {
        C2268h c2268h = this.f19111l;
        if (c2268h != null) {
            c2268h.b(qVar, i);
        }
    }

    public final Object c() {
        Object obj = this.f19110k;
        H3.g gVar = e.f19137p;
        if (obj == gVar) {
            throw new IllegalStateException("`hasNext()` has not been invoked");
        }
        this.f19110k = gVar;
        if (obj != e.f19133l) {
            return obj;
        }
        Throwable p5 = this.f19112m.p();
        int i = u4.r.f20114a;
        throw p5;
    }
}
