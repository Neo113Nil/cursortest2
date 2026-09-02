package o0;

import a.AbstractC0018a;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import m0.AbstractC0062t;
import m0.C0048e;
import m0.d0;
import r0.w;

/* loaded from: classes.dex */
public final class a implements d0 {

    /* renamed from: b, reason: collision with root package name */
    public Object f1051b = e.f1080p;

    /* renamed from: c, reason: collision with root package name */
    public C0048e f1052c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ c f1053d;

    public a(c cVar) {
        this.f1053d = cVar;
    }

    @Override // m0.d0
    public final void a(k kVar, int i2) {
        C0048e c0048e = this.f1052c;
        if (c0048e != null) {
            c0048e.a(kVar, i2);
        }
    }

    public final Object b(p0.e eVar) {
        k kVar;
        Boolean bool;
        int i2;
        k kVar2;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = c.f1059h;
        c cVar = this.f1053d;
        k kVar3 = (k) atomicReferenceFieldUpdater.get(cVar);
        while (!cVar.o(c.f1054c.get(cVar), true)) {
            long andIncrement = c.f1055d.getAndIncrement(cVar);
            long j2 = e.f1066b;
            long j3 = andIncrement / j2;
            int i3 = (int) (andIncrement % j2);
            if (kVar3.f1197c != j3) {
                kVar = cVar.j(j3, kVar3);
                if (kVar == null) {
                    continue;
                }
            } else {
                kVar = kVar3;
            }
            Object w2 = cVar.w(kVar, i3, andIncrement, null);
            io.flutter.plugin.platform.i iVar = e.f1077m;
            if (w2 == iVar) {
                throw new IllegalStateException("unreachable");
            }
            io.flutter.plugin.platform.i iVar2 = e.f1079o;
            if (w2 != iVar2) {
                if (w2 != e.f1078n) {
                    kVar.a();
                    this.f1051b = w2;
                    return Boolean.TRUE;
                }
                C0048e b2 = AbstractC0062t.b(AbstractC0018a.n(eVar));
                try {
                    this.f1052c = b2;
                } catch (Throwable th) {
                    th = th;
                }
                try {
                    Object w3 = cVar.w(kVar, i3, andIncrement, this);
                    if (w3 == iVar) {
                        a(kVar, i3);
                    } else {
                        if (w3 == iVar2) {
                            if (andIncrement < cVar.m()) {
                                kVar.a();
                            }
                            k kVar4 = (k) c.f1059h.get(cVar);
                            while (true) {
                                if (cVar.o(c.f1054c.get(cVar), true)) {
                                    C0048e c0048e = this.f1052c;
                                    g0.h.b(c0048e);
                                    this.f1052c = null;
                                    this.f1051b = e.f1076l;
                                    Throwable k2 = cVar.k();
                                    if (k2 == null) {
                                        c0048e.k(Boolean.FALSE);
                                    } else {
                                        c0048e.k(AbstractC0018a.h(k2));
                                    }
                                } else {
                                    long andIncrement2 = c.f1055d.getAndIncrement(cVar);
                                    long j4 = e.f1066b;
                                    long j5 = andIncrement2 / j4;
                                    int i4 = (int) (andIncrement2 % j4);
                                    if (kVar4.f1197c != j5) {
                                        kVar2 = cVar.j(j5, kVar4);
                                        if (kVar2 == null) {
                                        }
                                    } else {
                                        kVar2 = kVar4;
                                    }
                                    Object w4 = cVar.w(kVar2, i4, andIncrement2, this);
                                    if (w4 == e.f1077m) {
                                        a(kVar2, i4);
                                        break;
                                    }
                                    if (w4 == e.f1079o) {
                                        if (andIncrement2 < cVar.m()) {
                                            kVar2.a();
                                        }
                                        kVar4 = kVar2;
                                    } else {
                                        if (w4 == e.f1078n) {
                                            throw new IllegalStateException("unexpected");
                                        }
                                        kVar2.a();
                                        this.f1051b = w4;
                                        this.f1052c = null;
                                        bool = Boolean.TRUE;
                                        i2 = b2.f956d;
                                    }
                                }
                            }
                        } else {
                            kVar.a();
                            this.f1051b = w3;
                            this.f1052c = null;
                            bool = Boolean.TRUE;
                            i2 = b2.f956d;
                        }
                        b2.v(bool, i2, null);
                    }
                    return b2.p();
                } catch (Throwable th2) {
                    th = th2;
                    b2.u();
                    throw th;
                }
            }
            if (andIncrement < cVar.m()) {
                kVar.a();
            }
            kVar3 = kVar;
        }
        this.f1051b = e.f1076l;
        Throwable k3 = cVar.k();
        if (k3 == null) {
            return Boolean.FALSE;
        }
        int i5 = w.f1198a;
        throw k3;
    }
}
