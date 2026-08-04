package p120q4;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import p075k4.b;
import p075k4.k;
import p075k4.n;
import p098n4.C0934g;
import p155w1.C1013m0;
import p155w1.C1052y0;

/* JADX INFO: loaded from: classes2.dex */
public final class c implements Iterable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final b f15859c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final c f15860d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f15861a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p075k4.c f15862b;

    static {
        b bVar = new b(n.f14795a);
        f15859c = bVar;
        f15860d = new c(null, bVar);
    }

    public c(Object obj, p075k4.c cVar) {
        this.f15861a = obj;
        this.f15862b = cVar;
    }

    public final Object A(C0934g c0934g) {
        Object obj = this.f15861a;
        if (obj == null) {
            obj = null;
        }
        c0934g.getClass();
        k kVar = new k(c0934g);
        c cVar = this;
        while (kVar.hasNext()) {
            cVar = (c) cVar.f15862b.m((v4.c) kVar.next());
            if (cVar == null) {
                break;
            }
            Object obj2 = cVar.f15861a;
            if (obj2 != null) {
                obj = obj2;
            }
        }
        return obj;
    }

    public final c B(C0934g c0934g) {
        boolean zIsEmpty = c0934g.isEmpty();
        c cVar = f15860d;
        p075k4.c cVar2 = this.f15862b;
        if (zIsEmpty) {
            return cVar2.isEmpty() ? cVar : new c(null, cVar2);
        }
        v4.c cVarB = c0934g.B();
        c cVar3 = (c) cVar2.m(cVarB);
        if (cVar3 == null) {
            return this;
        }
        c cVarB2 = cVar3.B(c0934g.E());
        p075k4.c cVarF = cVarB2.isEmpty() ? cVar2.F(cVarB) : cVar2.D(cVarB, cVarB2);
        Object obj = this.f15861a;
        return (obj == null && cVarF.isEmpty()) ? cVar : new c(obj, cVarF);
    }

    public final Object C(C0934g c0934g, g gVar) {
        Object obj = this.f15861a;
        if (obj != null && gVar.p(obj)) {
            return obj;
        }
        c0934g.getClass();
        k kVar = new k(c0934g);
        c cVar = this;
        while (kVar.hasNext()) {
            cVar = (c) cVar.f15862b.m((v4.c) kVar.next());
            if (cVar == null) {
                return null;
            }
            Object obj2 = cVar.f15861a;
            if (obj2 != null && gVar.p(obj2)) {
                return obj2;
            }
        }
        return null;
    }

    public final c D(C0934g c0934g, Object obj) {
        boolean zIsEmpty = c0934g.isEmpty();
        p075k4.c cVar = this.f15862b;
        if (zIsEmpty) {
            return new c(obj, cVar);
        }
        v4.c cVarB = c0934g.B();
        c cVar2 = (c) cVar.m(cVarB);
        if (cVar2 == null) {
            cVar2 = f15860d;
        }
        return new c(this.f15861a, cVar.D(cVarB, cVar2.D(c0934g.E(), obj)));
    }

    public final c E(C0934g c0934g, c cVar) {
        if (c0934g.isEmpty()) {
            return cVar;
        }
        v4.c cVarB = c0934g.B();
        p075k4.c cVar2 = this.f15862b;
        c cVar3 = (c) cVar2.m(cVarB);
        if (cVar3 == null) {
            cVar3 = f15860d;
        }
        c cVarE = cVar3.E(c0934g.E(), cVar);
        return new c(this.f15861a, cVarE.isEmpty() ? cVar2.F(cVarB) : cVar2.D(cVarB, cVarE));
    }

    public final c F(C0934g c0934g) {
        if (c0934g.isEmpty()) {
            return this;
        }
        c cVar = (c) this.f15862b.m(c0934g.B());
        return cVar != null ? cVar.F(c0934g.E()) : f15860d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || c.class != obj.getClass()) {
            return false;
        }
        c cVar = (c) obj;
        p075k4.c cVar2 = cVar.f15862b;
        p075k4.c cVar3 = this.f15862b;
        if (cVar3 == null ? cVar2 != null : !cVar3.equals(cVar2)) {
            return false;
        }
        Object obj2 = cVar.f15861a;
        Object obj3 = this.f15861a;
        return obj3 == null ? obj2 == null : obj3.equals(obj2);
    }

    public final int hashCode() {
        Object obj = this.f15861a;
        int iHashCode = (obj != null ? obj.hashCode() : 0) * 31;
        p075k4.c cVar = this.f15862b;
        return iHashCode + (cVar != null ? cVar.hashCode() : 0);
    }

    public final boolean isEmpty() {
        return this.f15861a == null && this.f15862b.isEmpty();
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        ArrayList arrayList = new ArrayList();
        t(C0934g.f15421d, new C1052y0(arrayList, 20), null);
        return arrayList.iterator();
    }

    public final boolean l() {
        C1013m0 c1013m0 = p114p4.b.f15700b;
        Object obj = this.f15861a;
        if (obj != null && ((Boolean) obj).booleanValue()) {
            return true;
        }
        Iterator it = this.f15862b.iterator();
        while (it.hasNext()) {
            if (((c) ((Map.Entry) it.next()).getValue()).l()) {
                return true;
            }
        }
        return false;
    }

    public final C0934g m(C0934g c0934g, g gVar) {
        C0934g c0934gM;
        Object obj = this.f15861a;
        if (obj != null && gVar.p(obj)) {
            return C0934g.f15421d;
        }
        if (c0934g.isEmpty()) {
            return null;
        }
        v4.c cVarB = c0934g.B();
        c cVar = (c) this.f15862b.m(cVarB);
        if (cVar == null || (c0934gM = cVar.m(c0934g.E(), gVar)) == null) {
            return null;
        }
        return new C0934g(cVarB).m(c0934gM);
    }

    public final Object t(C0934g c0934g, b bVar, Object obj) {
        for (Map.Entry entry : this.f15862b) {
            obj = ((c) entry.getValue()).t(c0934g.t((v4.c) entry.getKey()), bVar, obj);
        }
        Object obj2 = this.f15861a;
        return obj2 != null ? bVar.a(c0934g, obj2, obj) : obj;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ImmutableTree { value=");
        sb.append(this.f15861a);
        sb.append(", children={");
        for (Map.Entry entry : this.f15862b) {
            sb.append(((v4.c) entry.getKey()).f17179a);
            sb.append("=");
            sb.append(entry.getValue());
        }
        sb.append("} }");
        return sb.toString();
    }

    public final Object y(C0934g c0934g) {
        if (c0934g.isEmpty()) {
            return this.f15861a;
        }
        c cVar = (c) this.f15862b.m(c0934g.B());
        if (cVar != null) {
            return cVar.y(c0934g.E());
        }
        return null;
    }

    public final c z(v4.c cVar) {
        c cVar2 = (c) this.f15862b.m(cVar);
        return cVar2 != null ? cVar2 : f15860d;
    }

    public c(Comparable comparable) {
        this(comparable, f15859c);
    }
}
