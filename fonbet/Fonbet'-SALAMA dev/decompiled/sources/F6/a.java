package F6;

import D6.C0130m;
import D6.E;
import D6.I0;
import F2.W0;
import I6.u;
import I6.v;
import a.AbstractC0603a;
import i6.InterfaceC1292i;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.functions.Function1;

/* loaded from: classes2.dex */
public final class a implements I0 {

    /* renamed from: a, reason: collision with root package name */
    public Object f2785a = d.f2814p;

    /* renamed from: b, reason: collision with root package name */
    public C0130m f2786b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ b f2787c;

    public a(b bVar) {
        this.f2787c = bVar;
    }

    @Override // D6.I0
    public final void a(u uVar, int i7) {
        C0130m c0130m = this.f2786b;
        if (c0130m != null) {
            c0130m.a(uVar, i7);
        }
    }

    public final Object b(G6.i iVar) {
        C0130m c0130m;
        Boolean bool;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = b.f2795y;
        b bVar = this.f2787c;
        j jVar = (j) atomicReferenceFieldUpdater.get(bVar);
        while (true) {
            bVar.getClass();
            if (bVar.q(b.f2790c.get(bVar), true)) {
                this.f2785a = d.f2810l;
                Throwable l7 = bVar.l();
                if (l7 == null) {
                    return Boolean.FALSE;
                }
                int i7 = v.f3760a;
                throw l7;
            }
            long andIncrement = b.f2791d.getAndIncrement(bVar);
            long j = d.f2801b;
            long j3 = andIncrement / j;
            int i8 = (int) (andIncrement % j);
            if (jVar.f3759c != j3) {
                j k7 = bVar.k(j3, jVar);
                if (k7 == null) {
                    continue;
                } else {
                    jVar = k7;
                }
            }
            Object z4 = bVar.z(jVar, i8, andIncrement, null);
            W0 w02 = d.f2811m;
            if (z4 == w02) {
                throw new IllegalStateException("unreachable");
            }
            W0 w03 = d.f2813o;
            if (z4 == w03) {
                if (andIncrement < bVar.o()) {
                    jVar.a();
                }
            } else {
                if (z4 != d.f2812n) {
                    jVar.a();
                    this.f2785a = z4;
                    return Boolean.TRUE;
                }
                b bVar2 = this.f2787c;
                C0130m j7 = E.j(P6.b.v(iVar));
                try {
                    this.f2786b = j7;
                    c0130m = j7;
                    try {
                        Object z7 = bVar2.z(jVar, i8, andIncrement, this);
                        if (z7 == w02) {
                            a(jVar, i8);
                        } else {
                            I6.p pVar = null;
                            InterfaceC1292i interfaceC1292i = c0130m.f1858e;
                            Function1 function1 = bVar2.f2798b;
                            if (z7 == w03) {
                                if (andIncrement < bVar2.o()) {
                                    jVar.a();
                                }
                                j jVar2 = (j) b.f2795y.get(bVar2);
                                while (true) {
                                    if (bVar2.q(b.f2790c.get(bVar2), true)) {
                                        C0130m c0130m2 = this.f2786b;
                                        t6.h.b(c0130m2);
                                        this.f2786b = null;
                                        this.f2785a = d.f2810l;
                                        Throwable l8 = bVar.l();
                                        if (l8 == null) {
                                            c0130m2.resumeWith(Boolean.FALSE);
                                        } else {
                                            c0130m2.resumeWith(AbstractC0603a.h(l8));
                                        }
                                    } else {
                                        long andIncrement2 = b.f2791d.getAndIncrement(bVar2);
                                        long j8 = d.f2801b;
                                        long j9 = andIncrement2 / j8;
                                        int i9 = (int) (andIncrement2 % j8);
                                        if (jVar2.f3759c != j9) {
                                            j k8 = bVar2.k(j9, jVar2);
                                            if (k8 != null) {
                                                jVar2 = k8;
                                            }
                                        }
                                        Function1 function12 = function1;
                                        Object z8 = bVar2.z(jVar2, i9, andIncrement2, this);
                                        if (z8 == d.f2811m) {
                                            a(jVar2, i9);
                                            break;
                                        }
                                        if (z8 == d.f2813o) {
                                            if (andIncrement2 < bVar2.o()) {
                                                jVar2.a();
                                            }
                                            function1 = function12;
                                        } else {
                                            if (z8 == d.f2812n) {
                                                throw new IllegalStateException("unexpected");
                                            }
                                            jVar2.a();
                                            this.f2785a = z8;
                                            this.f2786b = null;
                                            bool = Boolean.TRUE;
                                            if (function12 != null) {
                                                pVar = new I6.p(function12, z8, interfaceC1292i);
                                            }
                                        }
                                    }
                                }
                            } else {
                                jVar.a();
                                this.f2785a = z7;
                                this.f2786b = null;
                                bool = Boolean.TRUE;
                                if (function1 != null) {
                                    pVar = new I6.p(function1, z7, interfaceC1292i);
                                }
                            }
                            c0130m.d(bool, pVar);
                        }
                        Object r7 = c0130m.r();
                        j6.a aVar = j6.a.f14642a;
                        return r7;
                    } catch (Throwable th) {
                        th = th;
                        c0130m.z();
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    c0130m = j7;
                }
            }
        }
    }
}
