package p098n4;

import java.util.AbstractMap;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import p023d1.f;
import p115p6.a;
import p120q4.c;
import p120q4.g;
import p120q4.k;
import v4.j;
import v4.r;

/* JADX INFO: renamed from: n4.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C0929b implements Iterable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C0929b f15397b = new C0929b(new c(null));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f15398a;

    public C0929b(c cVar) {
        this.f15398a = cVar;
    }

    public static C0929b A(AbstractMap abstractMap) {
        c cVarE = c.f15860d;
        for (Map.Entry entry : abstractMap.entrySet()) {
            cVarE = cVarE.E((C0934g) entry.getKey(), new c((r) entry.getValue()));
        }
        return new C0929b(cVarE);
    }

    public static C0929b B(Map map) {
        c cVarE = c.f15860d;
        for (Map.Entry entry : map.entrySet()) {
            cVarE = cVarE.E(new C0934g((String) entry.getKey()), new c(a.a(entry.getValue(), j.f17190e)));
        }
        return new C0929b(cVarE);
    }

    public static r y(C0934g c0934g, c cVar, r rVar) {
        v4.c cVar2;
        Object obj = cVar.f15861a;
        if (obj != null) {
            return rVar.q(c0934g, (r) obj);
        }
        Iterator it = cVar.f15862b.iterator();
        r rVar2 = null;
        while (true) {
            boolean zHasNext = it.hasNext();
            cVar2 = v4.c.f17177d;
            if (!zHasNext) {
                break;
            }
            Map.Entry entry = (Map.Entry) it.next();
            c cVar3 = (c) entry.getValue();
            v4.c cVar4 = (v4.c) entry.getKey();
            if (cVar4.equals(cVar2)) {
                k.b("Priority writes must always be leaf nodes", cVar3.f15861a != null);
                rVar2 = (r) cVar3.f15861a;
            } else {
                rVar = y(c0934g.t(cVar4), cVar3, rVar);
            }
        }
        return (rVar.g(c0934g).isEmpty() || rVar2 == null) ? rVar : rVar.q(c0934g.t(cVar2), rVar2);
    }

    public final r C(C0934g c0934g) {
        p036e6.c cVar = g.f15867t;
        c cVar2 = this.f15398a;
        C0934g c0934gM = cVar2.m(c0934g, cVar);
        if (c0934gM != null) {
            return ((r) cVar2.y(c0934gM)).g(C0934g.D(c0934gM, c0934g));
        }
        return null;
    }

    public final HashMap D() {
        HashMap map = new HashMap();
        f fVar = new f(map);
        c cVar = this.f15398a;
        cVar.getClass();
        cVar.t(C0934g.f15421d, fVar, null);
        return map;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != C0929b.class) {
            return false;
        }
        return ((C0929b) obj).D().equals(D());
    }

    public final int hashCode() {
        return D().hashCode();
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return this.f15398a.iterator();
    }

    public final C0929b l(C0934g c0934g, r rVar) {
        if (c0934g.isEmpty()) {
            return new C0929b(new c(rVar));
        }
        p036e6.c cVar = g.f15867t;
        c cVar2 = this.f15398a;
        C0934g c0934gM = cVar2.m(c0934g, cVar);
        if (c0934gM == null) {
            return new C0929b(cVar2.E(c0934g, new c(rVar)));
        }
        C0934g c0934gD = C0934g.D(c0934gM, c0934g);
        r rVar2 = (r) cVar2.y(c0934gM);
        v4.c cVarA = c0934gD.A();
        return (cVarA != null && cVarA.equals(v4.c.f17177d) && rVar2.g(c0934gD.C()).isEmpty()) ? this : new C0929b(cVar2.D(c0934gM, rVar2.q(c0934gD, rVar)));
    }

    public final C0929b m(C0934g c0934g, C0929b c0929b) {
        c cVar = c0929b.f15398a;
        p145u1.c cVar2 = new p145u1.c(c0934g, 22);
        cVar.getClass();
        return (C0929b) cVar.t(C0934g.f15421d, cVar2, this);
    }

    public final r t(r rVar) {
        return y(C0934g.f15421d, this.f15398a, rVar);
    }

    public final String toString() {
        return "CompoundWrite{" + D().toString() + "}";
    }

    public final C0929b z(C0934g c0934g) {
        if (c0934g.isEmpty()) {
            return this;
        }
        r rVarC = C(c0934g);
        return rVarC != null ? new C0929b(new c(rVarC)) : new C0929b(this.f15398a.F(c0934g));
    }
}
