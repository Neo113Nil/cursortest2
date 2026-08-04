package F6;

import A1.W;
import D6.E;
import D6.I0;
import F2.W0;
import I6.u;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes2.dex */
public final class j extends u {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final b f2823e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final AtomicReferenceArray f2824f;

    public j(long j, j jVar, b bVar, int i7) {
        super(j, jVar, i7);
        this.f2823e = bVar;
        this.f2824f = new AtomicReferenceArray(d.f2801b * 2);
    }

    @Override // I6.u
    public final int f() {
        return d.f2801b;
    }

    @Override // I6.u
    public final void g(int i7, p065i6.i iVar) throws IllegalAccessException, InvocationTargetException {
        b bVar;
        W wA;
        W wA2;
        int i8 = d.f2801b;
        boolean z4 = i7 >= i8;
        if (z4) {
            i7 -= i8;
        }
        Object obj = this.f2824f.get(i7 * 2);
        while (true) {
            Object objK = k(i7);
            boolean z7 = objK instanceof I0;
            bVar = this.f2823e;
            if (z7 || (objK instanceof s)) {
                if (j(i7, objK, z4 ? d.j : d.f2809k)) {
                    m(i7, null);
                    l(i7, !z4);
                    if (z4) {
                        t6.h.b(bVar);
                        Function1 function1 = bVar.f2798b;
                        if (function1 == null || (wA = I6.a.a(function1, obj, null)) == null) {
                            return;
                        }
                        E.k(iVar, wA);
                        return;
                    }
                    return;
                }
            } else {
                if (objK == d.j || objK == d.f2809k) {
                    break;
                }
                if (objK != d.f2806g && objK != d.f2805f) {
                    if (objK == d.f2808i || objK == d.f2803d || objK == d.f2810l) {
                        return;
                    }
                    throw new IllegalStateException(("unexpected state: " + objK).toString());
                }
            }
        }
        m(i7, null);
        if (z4) {
            t6.h.b(bVar);
            Function1 function2 = bVar.f2798b;
            if (function2 == null || (wA2 = I6.a.a(function2, obj, null)) == null) {
                return;
            }
            E.k(iVar, wA2);
        }
    }

    public final boolean j(int i7, Object obj, Object obj2) {
        AtomicReferenceArray atomicReferenceArray = this.f2824f;
        int i8 = (i7 * 2) + 1;
        while (!atomicReferenceArray.compareAndSet(i8, obj, obj2)) {
            if (atomicReferenceArray.get(i8) != obj) {
                return false;
            }
        }
        return true;
    }

    public final Object k(int i7) {
        return this.f2824f.get((i7 * 2) + 1);
    }

    public final void l(int i7, boolean z4) {
        if (z4) {
            b bVar = this.f2823e;
            t6.h.b(bVar);
            bVar.B((this.f3759c * ((long) d.f2801b)) + ((long) i7));
        }
        h();
    }

    public final void m(int i7, Object obj) {
        this.f2824f.lazySet(i7 * 2, obj);
    }

    public final void n(int i7, W0 w7) {
        this.f2824f.set((i7 * 2) + 1, w7);
    }
}
