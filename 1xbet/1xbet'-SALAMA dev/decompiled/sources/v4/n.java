package v4;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import p098n4.C0934g;

/* JADX INFO: loaded from: classes2.dex */
public abstract class n implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r f17196a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f17197b;

    public n(r rVar) {
        this.f17196a = rVar;
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
        p120q4.k.b("Node is not leaf node!", rVar.r());
        if ((this instanceof o) && (rVar instanceof i)) {
            return Double.valueOf(((o) this).f17198c).compareTo(((i) rVar).f17189c);
        }
        if ((this instanceof i) && (rVar instanceof o)) {
            return Double.valueOf(((o) rVar).f17198c).compareTo(((i) this).f17189c) * (-1);
        }
        n nVar = (n) rVar;
        int iM = m();
        int iM2 = nVar.m();
        return p136t.e.b(iM, iM2) ? l(nVar) : p136t.e.a(iM, iM2);
    }

    @Override // v4.r
    public final r e() {
        return this.f17196a;
    }

    @Override // v4.r
    public final r g(C0934g c0934g) {
        if (c0934g.isEmpty()) {
            return this;
        }
        return c0934g.B().equals(c.f17177d) ? this.f17196a : j.f17190e;
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
        return cVar.equals(c.f17177d) ? this.f17196a : j.f17190e;
    }

    @Override // v4.r
    public final r q(C0934g c0934g, r rVar) {
        c cVarB = c0934g.B();
        if (cVarB == null) {
            return rVar;
        }
        boolean zIsEmpty = rVar.isEmpty();
        c cVar = c.f17177d;
        if (zIsEmpty && !cVarB.equals(cVar)) {
            return this;
        }
        boolean zEquals = c0934g.B().equals(cVar);
        boolean z4 = true;
        if (zEquals && c0934g.size() != 1) {
            z4 = false;
        }
        p120q4.k.c(z4);
        return s(cVarB, j.f17190e.q(c0934g.E(), rVar));
    }

    @Override // v4.r
    public final boolean r() {
        return true;
    }

    @Override // v4.r
    public final r s(c cVar, r rVar) {
        if (cVar.equals(c.f17177d)) {
            return v(rVar);
        }
        return rVar.isEmpty() ? this : j.f17190e.s(cVar, rVar).v(this.f17196a);
    }

    public final String t(int i7) {
        int iE = p136t.e.e(i7);
        if (iE != 0 && iE != 1) {
            throw new IllegalArgumentException("Unknown hash version: ".concat(p031e1.k.s(i7)));
        }
        r rVar = this.f17196a;
        if (rVar.isEmpty()) {
            return "";
        }
        return "priority:" + rVar.j(i7) + ":";
    }

    public final String toString() {
        String string = u(true).toString();
        if (string.length() <= 100) {
            return string;
        }
        return string.substring(0, 100) + "...";
    }

    @Override // v4.r
    public final Object u(boolean z4) {
        if (z4) {
            r rVar = this.f17196a;
            if (!rVar.isEmpty()) {
                HashMap map = new HashMap();
                map.put(".value", getValue());
                map.put(".priority", rVar.getValue());
                return map;
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
        if (this.f17197b == null) {
            this.f17197b = p120q4.k.e(j(1));
        }
        return this.f17197b;
    }
}
