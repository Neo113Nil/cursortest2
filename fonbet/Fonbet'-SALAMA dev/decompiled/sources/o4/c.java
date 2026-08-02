package o4;

import g0.AbstractC1125g;
import n4.C1468b;
import n4.C1473g;
import v4.r;

/* loaded from: classes2.dex */
public final class c extends AbstractC1125g {

    /* renamed from: d, reason: collision with root package name */
    public final C1468b f15604d;

    public c(d dVar, C1473g c1473g, C1468b c1468b) {
        super(2, dVar, c1473g);
        this.f15604d = c1468b;
    }

    @Override // g0.AbstractC1125g
    public final AbstractC1125g a(v4.c cVar) {
        C1473g c1473g = (C1473g) this.f13021c;
        boolean isEmpty = c1473g.isEmpty();
        C1468b c1468b = this.f15604d;
        d dVar = (d) this.f13020b;
        if (!isEmpty) {
            if (c1473g.B().equals(cVar)) {
                return new c(dVar, c1473g.E(), c1468b);
            }
            return null;
        }
        C1468b z4 = c1468b.z(new C1473g(cVar));
        q4.c cVar2 = z4.f15392a;
        if (cVar2.isEmpty()) {
            return null;
        }
        Object obj = cVar2.f15855a;
        return ((r) obj) != null ? new e(dVar, C1473g.f15415d, (r) obj) : new c(dVar, C1473g.f15415d, z4);
    }

    public final String toString() {
        return "Merge { path=" + ((C1473g) this.f13021c) + ", source=" + ((d) this.f13020b) + ", children=" + this.f15604d + " }";
    }
}
