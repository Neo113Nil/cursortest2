package F6;

import D6.C0130m;
import D6.E;
import D6.I0;
import F2.W0;
import I6.u;
import I6.v;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes2.dex */
public final class a implements I0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f2785a = d.f2814p;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public C0130m f2786b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ b f2787c;

    public a(b bVar) {
        this.f2787c = bVar;
    }

    @Override // D6.I0
    public final void a(u uVar, int i7) throws IllegalAccessException, InvocationTargetException {
        C0130m c0130m = this.f2786b;
        if (c0130m != null) {
            c0130m.a(uVar, i7);
        }
    }

    public final Object b(G6.i iVar) throws Throwable {
        C0130m c0130m;
        Boolean bool;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = b.f2795y;
        b bVar = this.f2787c;
        j jVar = (j) atomicReferenceFieldUpdater.get(bVar);
        while (true) {
            bVar.getClass();
            if (bVar.q(b.f2790c.get(bVar), true)) {
                this.f2785a = d.f2810l;
                Throwable thL = bVar.l();
                if (thL == null) {
                    return Boolean.FALSE;
                }
                int i7 = v.f3760a;
                throw thL;
            }
            long andIncrement = b.f2791d.getAndIncrement(bVar);
            long j = d.f2801b;
            long j3 = andIncrement / j;
            int i8 = (int) (andIncrement % j);
            if (jVar.f3759c != j3) {
                j jVarK = bVar.k(j3, jVar);
                if (jVarK == null) {
                    continue;
                } else {
                    jVar = jVarK;
                }
            }
            Object objZ = bVar.z(jVar, i8, andIncrement, null);
            W0 w7 = d.f2811m;
            if (objZ == w7) {
                throw new IllegalStateException("unreachable");
            }
            W0 w8 = d.f2813o;
            if (objZ == w8) {
                if (andIncrement < bVar.o()) {
                    jVar.a();
                }
            } else {
                if (objZ != d.f2812n) {
                    jVar.a();
                    this.f2785a = objZ;
                    return Boolean.TRUE;
                }
                b bVar2 = this.f2787c;
                C0130m c0130mJ = E.j(P6.b.v(iVar));
                try {
                    this.f2786b = c0130mJ;
                    c0130m = c0130mJ;
                    try {
                        Object objZ2 = bVar2.z(jVar, i8, andIncrement, this);
                        if (objZ2 != w7) {
                            I6.p pVar = null;
                            p065i6.i iVar2 = c0130m.f1858e;
                            Function1 function1 = bVar2.f2798b;
                            if (objZ2 == w8) {
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
                                        Throwable thL2 = bVar.l();
                                        if (thL2 != null) {
                                            c0130m2.resumeWith(p003a.a.h(thL2));
                                            break;
                                        }
                                        c0130m2.resumeWith(Boolean.FALSE);
                                        break;
                                    }
                                    long andIncrement2 = b.f2791d.getAndIncrement(bVar2);
                                    long j7 = d.f2801b;
                                    long j8 = andIncrement2 / j7;
                                    int i9 = (int) (andIncrement2 % j7);
                                    if (jVar2.f3759c != j8) {
                                        j jVarK2 = bVar2.k(j8, jVar2);
                                        if (jVarK2 != null) {
                                            jVar2 = jVarK2;
                                        }
                                    }
                                    Function1 function2 = function1;
                                    Object objZ3 = bVar2.z(jVar2, i9, andIncrement2, this);
                                    if (objZ3 == d.f2811m) {
                                        a(jVar2, i9);
                                        break;
                                    }
                                    if (objZ3 == d.f2813o) {
                                        if (andIncrement2 < bVar2.o()) {
                                            jVar2.a();
                                        }
                                        function1 = function2;
                                    } else {
                                        if (objZ3 == d.f2812n) {
                                            throw new IllegalStateException("unexpected");
                                        }
                                        jVar2.a();
                                        this.f2785a = objZ3;
                                        this.f2786b = null;
                                        bool = Boolean.TRUE;
                                        if (function2 != null) {
                                            pVar = new I6.p(function2, objZ3, iVar2);
                                        }
                                    }
                                }
                            } else {
                                jVar.a();
                                this.f2785a = objZ2;
                                this.f2786b = null;
                                bool = Boolean.TRUE;
                                if (function1 != null) {
                                    pVar = new I6.p(function1, objZ2, iVar2);
                                }
                            }
                            c0130m.d(bool, pVar);
                            break;
                        }
                        a(jVar, i8);
                        Object objR = c0130m.r();
                        j6.a aVar = j6.a.f14648a;
                        return objR;
                    } catch (Throwable th) {
                        th = th;
                        c0130m.z();
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    c0130m = c0130mJ;
                }
            }
        }
    }
}
