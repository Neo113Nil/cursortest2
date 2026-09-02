package d1;

import a.AbstractC0009a;
import b1.AbstractC0030s;
import b1.C0017e;
import b1.c0;
import g1.v;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public final class a implements c0 {

    /* renamed from: a, reason: collision with root package name */
    public Object f901a = e.f931p;

    /* renamed from: b, reason: collision with root package name */
    public C0017e f902b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ c f903c;

    public a(c cVar) {
        this.f903c = cVar;
    }

    @Override // b1.c0
    public final void a(k kVar, int i2) {
        C0017e c0017e = this.f902b;
        if (c0017e != null) {
            c0017e.a(kVar, i2);
        }
    }

    public final Object b(e1.e eVar) {
        C0017e c0017e;
        g1.p pVar;
        Boolean bool;
        int i2;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = c.f909h;
        c cVar = this.f903c;
        k kVar = (k) atomicReferenceFieldUpdater.get(cVar);
        while (true) {
            cVar.getClass();
            if (cVar.o(c.f904c.get(cVar), true)) {
                this.f901a = e.f927l;
                Throwable k2 = cVar.k();
                if (k2 == null) {
                    return Boolean.FALSE;
                }
                int i3 = v.f1180a;
                throw k2;
            }
            long andIncrement = c.f905d.getAndIncrement(cVar);
            long j2 = e.f917b;
            long j3 = andIncrement / j2;
            int i4 = (int) (andIncrement % j2);
            if (kVar.f1179c != j3) {
                k j4 = cVar.j(j3, kVar);
                if (j4 == null) {
                    continue;
                } else {
                    kVar = j4;
                }
            }
            Object w2 = cVar.w(kVar, i4, andIncrement, null);
            C0.a aVar = e.f928m;
            if (w2 == aVar) {
                throw new IllegalStateException("unreachable");
            }
            C0.a aVar2 = e.f930o;
            if (w2 != aVar2) {
                if (w2 != e.f929n) {
                    kVar.a();
                    this.f901a = w2;
                    return Boolean.TRUE;
                }
                c cVar2 = this.f903c;
                C0017e b2 = AbstractC0030s.b(AbstractC0009a.r(eVar));
                try {
                    this.f902b = b2;
                    c0017e = b2;
                } catch (Throwable th) {
                    th = th;
                    c0017e = b2;
                }
                try {
                    Object w3 = cVar2.w(kVar, i4, andIncrement, this);
                    if (w3 == aVar) {
                        a(kVar, i4);
                    } else {
                        M0.i iVar = c0017e.f659e;
                        U0.l lVar = cVar2.f914b;
                        if (w3 == aVar2) {
                            if (andIncrement < cVar2.m()) {
                                kVar.a();
                            }
                            k kVar2 = (k) c.f909h.get(cVar2);
                            while (true) {
                                if (cVar2.o(c.f904c.get(cVar2), true)) {
                                    C0017e c0017e2 = this.f902b;
                                    kotlin.jvm.internal.j.b(c0017e2);
                                    this.f902b = null;
                                    this.f901a = e.f927l;
                                    Throwable k3 = cVar.k();
                                    if (k3 == null) {
                                        c0017e2.f(Boolean.FALSE);
                                    } else {
                                        c0017e2.f(V.a.k(k3));
                                    }
                                } else {
                                    long andIncrement2 = c.f905d.getAndIncrement(cVar2);
                                    long j5 = e.f917b;
                                    long j6 = andIncrement2 / j5;
                                    int i5 = (int) (andIncrement2 % j5);
                                    if (kVar2.f1179c != j6) {
                                        k j7 = cVar2.j(j6, kVar2);
                                        if (j7 != null) {
                                            kVar2 = j7;
                                        }
                                    }
                                    U0.l lVar2 = lVar;
                                    Object w4 = cVar2.w(kVar2, i5, andIncrement2, this);
                                    if (w4 == e.f928m) {
                                        a(kVar2, i5);
                                        break;
                                    }
                                    if (w4 == e.f930o) {
                                        if (andIncrement2 < cVar2.m()) {
                                            kVar2.a();
                                        }
                                        lVar = lVar2;
                                    } else {
                                        if (w4 == e.f929n) {
                                            throw new IllegalStateException("unexpected");
                                        }
                                        kVar2.a();
                                        this.f901a = w4;
                                        this.f902b = null;
                                        pVar = lVar2 != null ? new g1.p(lVar2, w4, iVar) : null;
                                        bool = Boolean.TRUE;
                                        i2 = c0017e.f692c;
                                    }
                                }
                            }
                        } else {
                            kVar.a();
                            this.f901a = w3;
                            this.f902b = null;
                            pVar = lVar != null ? new g1.p(lVar, w3, iVar) : null;
                            bool = Boolean.TRUE;
                            i2 = c0017e.f692c;
                        }
                        c0017e.u(bool, i2, pVar);
                    }
                    return c0017e.o();
                } catch (Throwable th2) {
                    th = th2;
                    c0017e.t();
                    throw th;
                }
            }
            if (andIncrement < cVar.m()) {
                kVar.a();
            }
        }
    }
}
