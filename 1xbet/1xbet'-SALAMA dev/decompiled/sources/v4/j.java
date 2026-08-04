package v4;

import java.util.Collections;
import java.util.Iterator;
import p098n4.C0934g;

/* JADX INFO: loaded from: classes2.dex */
public final class j extends f {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final j f17190e = new j();

    @Override // v4.f
    public final boolean equals(Object obj) {
        if (obj instanceof j) {
            return true;
        }
        if (obj instanceof r) {
            r rVar = (r) obj;
            if (rVar.isEmpty() && equals(rVar.e())) {
                return true;
            }
        }
        return false;
    }

    @Override // v4.f, v4.r
    public final Object getValue() {
        return null;
    }

    @Override // v4.f
    public final int hashCode() {
        return 0;
    }

    @Override // v4.f, v4.r
    public final boolean i(c cVar) {
        return false;
    }

    @Override // v4.f, v4.r
    public final boolean isEmpty() {
        return true;
    }

    @Override // v4.f, java.lang.Iterable
    public final Iterator iterator() {
        return Collections.emptyList().iterator();
    }

    @Override // v4.f, v4.r
    public final String j(int i7) {
        return "";
    }

    @Override // v4.f, v4.r
    public final int k() {
        return 0;
    }

    @Override // v4.f, java.lang.Comparable
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public final int compareTo(r rVar) {
        return rVar.isEmpty() ? 0 : -1;
    }

    @Override // v4.f, v4.r
    public final c n(c cVar) {
        return null;
    }

    @Override // v4.f, v4.r
    public final r q(C0934g c0934g, r rVar) {
        return c0934g.isEmpty() ? rVar : s(c0934g.B(), q(c0934g.E(), rVar));
    }

    @Override // v4.f, v4.r
    public final r s(c cVar, r rVar) {
        if (rVar.isEmpty()) {
            return this;
        }
        c cVar2 = c.f17177d;
        if (cVar.equals(cVar2)) {
            return this;
        }
        p075k4.c bVar = new p075k4.b(f.f17183d);
        boolean zEquals = cVar.equals(cVar2);
        j jVar = f17190e;
        if (zEquals) {
            return bVar.isEmpty() ? jVar : new f(bVar, rVar);
        }
        if (bVar.l(cVar)) {
            bVar = bVar.F(cVar);
        }
        if (!rVar.isEmpty()) {
            bVar = bVar.D(cVar, rVar);
        }
        return bVar.isEmpty() ? jVar : new f(bVar, jVar);
    }

    @Override // v4.f
    public final String toString() {
        return "<Empty Node>";
    }

    @Override // v4.f, v4.r
    public final Object u(boolean z4) {
        return null;
    }

    @Override // v4.f, v4.r
    public final Iterator w() {
        return Collections.emptyList().iterator();
    }

    @Override // v4.f, v4.r
    public final String x() {
        return "";
    }

    @Override // v4.f, v4.r
    public final r e() {
        return this;
    }

    @Override // v4.f, v4.r
    public final r g(C0934g c0934g) {
        return this;
    }

    @Override // v4.f, v4.r
    public final r o(c cVar) {
        return this;
    }

    @Override // v4.f, v4.r
    public final r v(r rVar) {
        return this;
    }
}
