package q4;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import k4.AbstractC1341c;
import k4.C1340b;
import k4.C1349k;
import k4.C1352n;
import n4.C1473g;
import w1.C1722m0;
import w1.C1761y0;

/* loaded from: classes2.dex */
public final class c implements Iterable {

    /* renamed from: c, reason: collision with root package name */
    public static final C1340b f15853c;

    /* renamed from: d, reason: collision with root package name */
    public static final c f15854d;

    /* renamed from: a, reason: collision with root package name */
    public final Object f15855a;

    /* renamed from: b, reason: collision with root package name */
    public final AbstractC1341c f15856b;

    static {
        C1340b c1340b = new C1340b(C1352n.f14789a);
        f15853c = c1340b;
        f15854d = new c(null, c1340b);
    }

    public c(Object obj, AbstractC1341c abstractC1341c) {
        this.f15855a = obj;
        this.f15856b = abstractC1341c;
    }

    public final Object A(C1473g c1473g) {
        Object obj = this.f15855a;
        if (obj == null) {
            obj = null;
        }
        c1473g.getClass();
        C1349k c1349k = new C1349k(c1473g);
        c cVar = this;
        while (c1349k.hasNext()) {
            cVar = (c) cVar.f15856b.m((v4.c) c1349k.next());
            if (cVar == null) {
                break;
            }
            Object obj2 = cVar.f15855a;
            if (obj2 != null) {
                obj = obj2;
            }
        }
        return obj;
    }

    public final c B(C1473g c1473g) {
        boolean isEmpty = c1473g.isEmpty();
        c cVar = f15854d;
        AbstractC1341c abstractC1341c = this.f15856b;
        if (isEmpty) {
            return abstractC1341c.isEmpty() ? cVar : new c(null, abstractC1341c);
        }
        v4.c B7 = c1473g.B();
        c cVar2 = (c) abstractC1341c.m(B7);
        if (cVar2 == null) {
            return this;
        }
        c B8 = cVar2.B(c1473g.E());
        AbstractC1341c F7 = B8.isEmpty() ? abstractC1341c.F(B7) : abstractC1341c.D(B7, B8);
        Object obj = this.f15855a;
        return (obj == null && F7.isEmpty()) ? cVar : new c(obj, F7);
    }

    public final Object C(C1473g c1473g, g gVar) {
        Object obj = this.f15855a;
        if (obj != null && gVar.p(obj)) {
            return obj;
        }
        c1473g.getClass();
        C1349k c1349k = new C1349k(c1473g);
        c cVar = this;
        while (c1349k.hasNext()) {
            cVar = (c) cVar.f15856b.m((v4.c) c1349k.next());
            if (cVar == null) {
                return null;
            }
            Object obj2 = cVar.f15855a;
            if (obj2 != null && gVar.p(obj2)) {
                return obj2;
            }
        }
        return null;
    }

    public final c D(C1473g c1473g, Object obj) {
        boolean isEmpty = c1473g.isEmpty();
        AbstractC1341c abstractC1341c = this.f15856b;
        if (isEmpty) {
            return new c(obj, abstractC1341c);
        }
        v4.c B7 = c1473g.B();
        c cVar = (c) abstractC1341c.m(B7);
        if (cVar == null) {
            cVar = f15854d;
        }
        return new c(this.f15855a, abstractC1341c.D(B7, cVar.D(c1473g.E(), obj)));
    }

    public final c E(C1473g c1473g, c cVar) {
        if (c1473g.isEmpty()) {
            return cVar;
        }
        v4.c B7 = c1473g.B();
        AbstractC1341c abstractC1341c = this.f15856b;
        c cVar2 = (c) abstractC1341c.m(B7);
        if (cVar2 == null) {
            cVar2 = f15854d;
        }
        c E7 = cVar2.E(c1473g.E(), cVar);
        return new c(this.f15855a, E7.isEmpty() ? abstractC1341c.F(B7) : abstractC1341c.D(B7, E7));
    }

    public final c F(C1473g c1473g) {
        if (c1473g.isEmpty()) {
            return this;
        }
        c cVar = (c) this.f15856b.m(c1473g.B());
        return cVar != null ? cVar.F(c1473g.E()) : f15854d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || c.class != obj.getClass()) {
            return false;
        }
        c cVar = (c) obj;
        AbstractC1341c abstractC1341c = cVar.f15856b;
        AbstractC1341c abstractC1341c2 = this.f15856b;
        if (abstractC1341c2 == null ? abstractC1341c != null : !abstractC1341c2.equals(abstractC1341c)) {
            return false;
        }
        Object obj2 = cVar.f15855a;
        Object obj3 = this.f15855a;
        return obj3 == null ? obj2 == null : obj3.equals(obj2);
    }

    public final int hashCode() {
        Object obj = this.f15855a;
        int hashCode = (obj != null ? obj.hashCode() : 0) * 31;
        AbstractC1341c abstractC1341c = this.f15856b;
        return hashCode + (abstractC1341c != null ? abstractC1341c.hashCode() : 0);
    }

    public final boolean isEmpty() {
        return this.f15855a == null && this.f15856b.isEmpty();
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        ArrayList arrayList = new ArrayList();
        t(C1473g.f15415d, new C1761y0(arrayList, 20), null);
        return arrayList.iterator();
    }

    public final boolean l() {
        C1722m0 c1722m0 = p4.b.f15694b;
        Object obj = this.f15855a;
        if (obj != null && ((Boolean) obj).booleanValue()) {
            return true;
        }
        Iterator it = this.f15856b.iterator();
        while (it.hasNext()) {
            if (((c) ((Map.Entry) it.next()).getValue()).l()) {
                return true;
            }
        }
        return false;
    }

    public final C1473g m(C1473g c1473g, g gVar) {
        C1473g m7;
        Object obj = this.f15855a;
        if (obj != null && gVar.p(obj)) {
            return C1473g.f15415d;
        }
        if (c1473g.isEmpty()) {
            return null;
        }
        v4.c B7 = c1473g.B();
        c cVar = (c) this.f15856b.m(B7);
        if (cVar == null || (m7 = cVar.m(c1473g.E(), gVar)) == null) {
            return null;
        }
        return new C1473g(B7).m(m7);
    }

    public final Object t(C1473g c1473g, b bVar, Object obj) {
        for (Map.Entry entry : this.f15856b) {
            obj = ((c) entry.getValue()).t(c1473g.t((v4.c) entry.getKey()), bVar, obj);
        }
        Object obj2 = this.f15855a;
        return obj2 != null ? bVar.a(c1473g, obj2, obj) : obj;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ImmutableTree { value=");
        sb.append(this.f15855a);
        sb.append(", children={");
        for (Map.Entry entry : this.f15856b) {
            sb.append(((v4.c) entry.getKey()).f17173a);
            sb.append("=");
            sb.append(entry.getValue());
        }
        sb.append("} }");
        return sb.toString();
    }

    public final Object y(C1473g c1473g) {
        if (c1473g.isEmpty()) {
            return this.f15855a;
        }
        c cVar = (c) this.f15856b.m(c1473g.B());
        if (cVar != null) {
            return cVar.y(c1473g.E());
        }
        return null;
    }

    public final c z(v4.c cVar) {
        c cVar2 = (c) this.f15856b.m(cVar);
        return cVar2 != null ? cVar2 : f15854d;
    }

    public c(Comparable comparable) {
        this(comparable, f15853c);
    }
}
