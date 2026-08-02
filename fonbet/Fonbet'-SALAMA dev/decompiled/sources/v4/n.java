package v4;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import n4.C1473g;

/* loaded from: classes2.dex */
public abstract class n implements r {

    /* renamed from: a, reason: collision with root package name */
    public final r f17190a;

    /* renamed from: b, reason: collision with root package name */
    public String f17191b;

    public n(r rVar) {
        this.f17190a = rVar;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        r rVar = (r) obj;
        if (rVar.isEmpty()) {
            return 1;
        }
        if (rVar instanceof f) {
            return -1;
        }
        q4.k.b("Node is not leaf node!", rVar.r());
        if ((this instanceof o) && (rVar instanceof i)) {
            return Double.valueOf(((o) this).f17192c).compareTo(((i) rVar).f17183c);
        }
        if ((this instanceof i) && (rVar instanceof o)) {
            return Double.valueOf(((o) rVar).f17192c).compareTo(((i) this).f17183c) * (-1);
        }
        n nVar = (n) rVar;
        int m7 = m();
        int m8 = nVar.m();
        return t.e.b(m7, m8) ? l(nVar) : t.e.a(m7, m8);
    }

    @Override // v4.r
    public final r e() {
        return this.f17190a;
    }

    @Override // v4.r
    public final r g(C1473g c1473g) {
        return c1473g.isEmpty() ? this : c1473g.B().equals(c.f17171d) ? this.f17190a : j.f17184e;
    }

    @Override // v4.r
    public final boolean i(c cVar) {
        return false;
    }

    @Override // v4.r
    public final boolean isEmpty() {
        return false;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return Collections.emptyList().iterator();
    }

    @Override // v4.r
    public final int k() {
        return 0;
    }

    public abstract int l(n nVar);

    public abstract int m();

    @Override // v4.r
    public final c n(c cVar) {
        return null;
    }

    @Override // v4.r
    public final r o(c cVar) {
        return cVar.equals(c.f17171d) ? this.f17190a : j.f17184e;
    }

    @Override // v4.r
    public final r q(C1473g c1473g, r rVar) {
        c B7 = c1473g.B();
        if (B7 == null) {
            return rVar;
        }
        boolean isEmpty = rVar.isEmpty();
        c cVar = c.f17171d;
        if (isEmpty && !B7.equals(cVar)) {
            return this;
        }
        boolean equals = c1473g.B().equals(cVar);
        boolean z4 = true;
        if (equals && c1473g.size() != 1) {
            z4 = false;
        }
        q4.k.c(z4);
        return s(B7, j.f17184e.q(c1473g.E(), rVar));
    }

    @Override // v4.r
    public final boolean r() {
        return true;
    }

    @Override // v4.r
    public final r s(c cVar, r rVar) {
        return cVar.equals(c.f17171d) ? v(rVar) : rVar.isEmpty() ? this : j.f17184e.s(cVar, rVar).v(this.f17190a);
    }

    public final String t(int i7) {
        int e7 = t.e.e(i7);
        if (e7 != 0 && e7 != 1) {
            throw new IllegalArgumentException("Unknown hash version: ".concat(e1.k.s(i7)));
        }
        r rVar = this.f17190a;
        if (rVar.isEmpty()) {
            return "";
        }
        return "priority:" + rVar.j(i7) + ":";
    }

    public final String toString() {
        String obj = u(true).toString();
        if (obj.length() <= 100) {
            return obj;
        }
        return obj.substring(0, 100) + "...";
    }

    @Override // v4.r
    public final Object u(boolean z4) {
        if (z4) {
            r rVar = this.f17190a;
            if (!rVar.isEmpty()) {
                HashMap hashMap = new HashMap();
                hashMap.put(".value", getValue());
                hashMap.put(".priority", rVar.getValue());
                return hashMap;
            }
        }
        return getValue();
    }

    @Override // v4.r
    public final Iterator w() {
        return Collections.emptyList().iterator();
    }

    @Override // v4.r
    public final String x() {
        if (this.f17191b == null) {
            this.f17191b = q4.k.e(j(1));
        }
        return this.f17191b;
    }
}
