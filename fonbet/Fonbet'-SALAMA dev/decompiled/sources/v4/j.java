package v4;

import java.util.Collections;
import java.util.Iterator;
import k4.AbstractC1341c;
import k4.C1340b;
import n4.C1473g;

/* loaded from: classes2.dex */
public final class j extends f {

    /* renamed from: e, reason: collision with root package name */
    public static final j f17184e = new j();

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
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public final int compareTo(r rVar) {
        return rVar.isEmpty() ? 0 : -1;
    }

    @Override // v4.f, v4.r
    public final c n(c cVar) {
        return null;
    }

    @Override // v4.f, v4.r
    public final r q(C1473g c1473g, r rVar) {
        return c1473g.isEmpty() ? rVar : s(c1473g.B(), q(c1473g.E(), rVar));
    }

    @Override // v4.f, v4.r
    public final r s(c cVar, r rVar) {
        if (rVar.isEmpty()) {
            return this;
        }
        c cVar2 = c.f17171d;
        if (cVar.equals(cVar2)) {
            return this;
        }
        AbstractC1341c c1340b = new C1340b(f.f17177d);
        boolean equals = cVar.equals(cVar2);
        j jVar = f17184e;
        if (equals) {
            return c1340b.isEmpty() ? jVar : new f(c1340b, rVar);
        }
        if (c1340b.l(cVar)) {
            c1340b = c1340b.F(cVar);
        }
        if (!rVar.isEmpty()) {
            c1340b = c1340b.D(cVar, rVar);
        }
        return c1340b.isEmpty() ? jVar : new f(c1340b, jVar);
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
    public final r g(C1473g c1473g) {
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
