package n4;

import d1.C0953f;
import e6.C1054c;
import java.util.AbstractMap;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import p6.AbstractC1539a;

/* renamed from: n4.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1468b implements Iterable {

    /* renamed from: b, reason: collision with root package name */
    public static final C1468b f15391b = new C1468b(new q4.c(null));

    /* renamed from: a, reason: collision with root package name */
    public final q4.c f15392a;

    public C1468b(q4.c cVar) {
        this.f15392a = cVar;
    }

    public static C1468b A(AbstractMap abstractMap) {
        q4.c cVar = q4.c.f15854d;
        for (Map.Entry entry : abstractMap.entrySet()) {
            cVar = cVar.E((C1473g) entry.getKey(), new q4.c((v4.r) entry.getValue()));
        }
        return new C1468b(cVar);
    }

    public static C1468b B(Map map) {
        q4.c cVar = q4.c.f15854d;
        for (Map.Entry entry : map.entrySet()) {
            cVar = cVar.E(new C1473g((String) entry.getKey()), new q4.c(AbstractC1539a.a(entry.getValue(), v4.j.f17184e)));
        }
        return new C1468b(cVar);
    }

    public static v4.r y(C1473g c1473g, q4.c cVar, v4.r rVar) {
        v4.c cVar2;
        Object obj = cVar.f15855a;
        if (obj != null) {
            return rVar.q(c1473g, (v4.r) obj);
        }
        Iterator it = cVar.f15856b.iterator();
        v4.r rVar2 = null;
        while (true) {
            boolean hasNext = it.hasNext();
            cVar2 = v4.c.f17171d;
            if (!hasNext) {
                break;
            }
            Map.Entry entry = (Map.Entry) it.next();
            q4.c cVar3 = (q4.c) entry.getValue();
            v4.c cVar4 = (v4.c) entry.getKey();
            if (cVar4.equals(cVar2)) {
                q4.k.b("Priority writes must always be leaf nodes", cVar3.f15855a != null);
                rVar2 = (v4.r) cVar3.f15855a;
            } else {
                rVar = y(c1473g.t(cVar4), cVar3, rVar);
            }
        }
        return (rVar.g(c1473g).isEmpty() || rVar2 == null) ? rVar : rVar.q(c1473g.t(cVar2), rVar2);
    }

    public final v4.r C(C1473g c1473g) {
        C1054c c1054c = q4.g.f15861t;
        q4.c cVar = this.f15392a;
        C1473g m7 = cVar.m(c1473g, c1054c);
        if (m7 != null) {
            return ((v4.r) cVar.y(m7)).g(C1473g.D(m7, c1473g));
        }
        return null;
    }

    public final HashMap D() {
        HashMap hashMap = new HashMap();
        C0953f c0953f = new C0953f(hashMap);
        q4.c cVar = this.f15392a;
        cVar.getClass();
        cVar.t(C1473g.f15415d, c0953f, null);
        return hashMap;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != C1468b.class) {
            return false;
        }
        return ((C1468b) obj).D().equals(D());
    }

    public final int hashCode() {
        return D().hashCode();
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return this.f15392a.iterator();
    }

    public final C1468b l(C1473g c1473g, v4.r rVar) {
        if (c1473g.isEmpty()) {
            return new C1468b(new q4.c(rVar));
        }
        C1054c c1054c = q4.g.f15861t;
        q4.c cVar = this.f15392a;
        C1473g m7 = cVar.m(c1473g, c1054c);
        if (m7 == null) {
            return new C1468b(cVar.E(c1473g, new q4.c(rVar)));
        }
        C1473g D7 = C1473g.D(m7, c1473g);
        v4.r rVar2 = (v4.r) cVar.y(m7);
        v4.c A7 = D7.A();
        return (A7 != null && A7.equals(v4.c.f17171d) && rVar2.g(D7.C()).isEmpty()) ? this : new C1468b(cVar.D(m7, rVar2.q(D7, rVar)));
    }

    public final C1468b m(C1473g c1473g, C1468b c1468b) {
        q4.c cVar = c1468b.f15392a;
        u1.c cVar2 = new u1.c(c1473g, 22);
        cVar.getClass();
        return (C1468b) cVar.t(C1473g.f15415d, cVar2, this);
    }

    public final v4.r t(v4.r rVar) {
        return y(C1473g.f15415d, this.f15392a, rVar);
    }

    public final String toString() {
        return "CompoundWrite{" + D().toString() + "}";
    }

    public final C1468b z(C1473g c1473g) {
        if (c1473g.isEmpty()) {
            return this;
        }
        v4.r C3 = C(c1473g);
        return C3 != null ? new C1468b(new q4.c(C3)) : new C1468b(this.f15392a.F(c1473g));
    }
}
