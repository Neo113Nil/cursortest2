package I3;

import java.io.Serializable;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import u.AbstractC2462i;

/* loaded from: classes.dex */
public class O extends F3.y {
    public static F3.o c(N3.a aVar, int i) {
        int b3 = AbstractC2462i.b(i);
        if (b3 == 5) {
            return new F3.s(aVar.I());
        }
        if (b3 == 6) {
            return new F3.s(new H3.k(aVar.I()));
        }
        if (b3 == 7) {
            return new F3.s(Boolean.valueOf(aVar.s()));
        }
        if (b3 != 8) {
            throw new IllegalStateException("Unexpected token: ".concat(L1.a.u(i)));
        }
        aVar.G();
        return F3.q.f1558k;
    }

    public static void d(N3.b bVar, F3.o oVar) {
        if (oVar == null || (oVar instanceof F3.q)) {
            bVar.n();
            return;
        }
        boolean z3 = oVar instanceof F3.s;
        if (z3) {
            if (!z3) {
                throw new IllegalStateException("Not a JSON Primitive: " + oVar);
            }
            F3.s sVar = (F3.s) oVar;
            Serializable serializable = sVar.f1560k;
            if (serializable instanceof Number) {
                bVar.A(sVar.d());
                return;
            } else if (serializable instanceof Boolean) {
                bVar.F(serializable instanceof Boolean ? ((Boolean) serializable).booleanValue() : Boolean.parseBoolean(sVar.e()));
                return;
            } else {
                bVar.E(sVar.e());
                return;
            }
        }
        boolean z5 = oVar instanceof F3.n;
        if (z5) {
            bVar.d();
            if (!z5) {
                throw new IllegalStateException("Not a JSON Array: " + oVar);
            }
            ArrayList arrayList = ((F3.n) oVar).f1557k;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                d(bVar, (F3.o) obj);
            }
            bVar.i();
            return;
        }
        boolean z6 = oVar instanceof F3.r;
        if (!z6) {
            throw new IllegalArgumentException("Couldn't write " + oVar.getClass());
        }
        bVar.f();
        if (!z6) {
            throw new IllegalStateException("Not a JSON Object: " + oVar);
        }
        Iterator it = ((H3.n) ((F3.r) oVar).f1559k.entrySet()).iterator();
        while (((H3.m) it).hasNext()) {
            H3.o b3 = ((H3.m) it).b();
            bVar.l((String) b3.getKey());
            d(bVar, (F3.o) b3.getValue());
        }
        bVar.k();
    }

    @Override // F3.y
    public final Object a(N3.a aVar) {
        F3.o nVar;
        F3.o nVar2;
        int K = aVar.K();
        int b3 = AbstractC2462i.b(K);
        if (b3 == 0) {
            aVar.b();
            nVar = new F3.n();
        } else if (b3 != 2) {
            nVar = null;
        } else {
            aVar.d();
            nVar = new F3.r();
        }
        if (nVar == null) {
            return c(aVar, K);
        }
        ArrayDeque arrayDeque = new ArrayDeque();
        while (true) {
            if (aVar.n()) {
                String E5 = nVar instanceof F3.r ? aVar.E() : null;
                int K5 = aVar.K();
                int b5 = AbstractC2462i.b(K5);
                if (b5 == 0) {
                    aVar.b();
                    nVar2 = new F3.n();
                } else if (b5 != 2) {
                    nVar2 = null;
                } else {
                    aVar.d();
                    nVar2 = new F3.r();
                }
                boolean z3 = nVar2 != null;
                if (nVar2 == null) {
                    nVar2 = c(aVar, K5);
                }
                if (nVar instanceof F3.n) {
                    ((F3.n) nVar).f1557k.add(nVar2);
                } else {
                    ((F3.r) nVar).f1559k.put(E5, nVar2);
                }
                if (z3) {
                    arrayDeque.addLast(nVar);
                    nVar = nVar2;
                }
            } else {
                if (nVar instanceof F3.n) {
                    aVar.i();
                } else {
                    aVar.k();
                }
                if (arrayDeque.isEmpty()) {
                    return nVar;
                }
                nVar = (F3.o) arrayDeque.removeLast();
            }
        }
    }

    @Override // F3.y
    public final /* bridge */ /* synthetic */ void b(N3.b bVar, Object obj) {
        d(bVar, (F3.o) obj);
    }
}
