package I3;

import java.io.Serializable;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import u.AbstractC2462i;

/* renamed from: I3.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0183m extends F3.y {

    /* renamed from: c, reason: collision with root package name */
    public static final C0181k f2661c = new C0181k(1, F3.x.f1561k);

    /* renamed from: a, reason: collision with root package name */
    public final F3.m f2662a;

    /* renamed from: b, reason: collision with root package name */
    public final F3.x f2663b;

    public C0183m(F3.m mVar, F3.x xVar) {
        this.f2662a = mVar;
        this.f2663b = xVar;
    }

    @Override // F3.y
    public final Object a(N3.a aVar) {
        Object arrayList;
        Serializable arrayList2;
        int K = aVar.K();
        int b3 = AbstractC2462i.b(K);
        if (b3 == 0) {
            aVar.b();
            arrayList = new ArrayList();
        } else if (b3 != 2) {
            arrayList = null;
        } else {
            aVar.d();
            arrayList = new H3.p(true);
        }
        if (arrayList == null) {
            return c(aVar, K);
        }
        ArrayDeque arrayDeque = new ArrayDeque();
        while (true) {
            if (aVar.n()) {
                String E5 = arrayList instanceof Map ? aVar.E() : null;
                int K5 = aVar.K();
                int b5 = AbstractC2462i.b(K5);
                if (b5 == 0) {
                    aVar.b();
                    arrayList2 = new ArrayList();
                } else if (b5 != 2) {
                    arrayList2 = null;
                } else {
                    aVar.d();
                    arrayList2 = new H3.p(true);
                }
                boolean z3 = arrayList2 != null;
                if (arrayList2 == null) {
                    arrayList2 = c(aVar, K5);
                }
                if (arrayList instanceof List) {
                    ((List) arrayList).add(arrayList2);
                } else {
                    ((Map) arrayList).put(E5, arrayList2);
                }
                if (z3) {
                    arrayDeque.addLast(arrayList);
                    arrayList = arrayList2;
                }
            } else {
                if (arrayList instanceof List) {
                    aVar.i();
                } else {
                    aVar.k();
                }
                if (arrayDeque.isEmpty()) {
                    return arrayList;
                }
                arrayList = arrayDeque.removeLast();
            }
        }
    }

    @Override // F3.y
    public final void b(N3.b bVar, Object obj) {
        if (obj == null) {
            bVar.n();
            return;
        }
        Class<?> cls = obj.getClass();
        F3.m mVar = this.f2662a;
        mVar.getClass();
        F3.y b3 = mVar.b(new M3.a(cls));
        if (!(b3 instanceof C0183m)) {
            b3.b(bVar, obj);
        } else {
            bVar.f();
            bVar.k();
        }
    }

    public final Serializable c(N3.a aVar, int i) {
        int b3 = AbstractC2462i.b(i);
        if (b3 == 5) {
            return aVar.I();
        }
        if (b3 == 6) {
            return this.f2663b.a(aVar);
        }
        if (b3 == 7) {
            return Boolean.valueOf(aVar.s());
        }
        if (b3 != 8) {
            throw new IllegalStateException("Unexpected token: ".concat(L1.a.u(i)));
        }
        aVar.G();
        return null;
    }
}
