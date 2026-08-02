package o4;

import g0.AbstractC1125g;
import n4.C1473g;
import v4.r;

/* loaded from: classes2.dex */
public final class e extends AbstractC1125g {

    /* renamed from: d, reason: collision with root package name */
    public final r f15610d;

    public e(d dVar, C1473g c1473g, r rVar) {
        super(1, dVar, c1473g);
        this.f15610d = rVar;
    }

    @Override // g0.AbstractC1125g
    public final AbstractC1125g a(v4.c cVar) {
        C1473g c1473g = (C1473g) this.f13021c;
        boolean isEmpty = c1473g.isEmpty();
        r rVar = this.f15610d;
        d dVar = (d) this.f13020b;
        return isEmpty ? new e(dVar, C1473g.f15415d, rVar.o(cVar)) : new e(dVar, c1473g.E(), rVar);
    }

    public final String toString() {
        return String.format("Overwrite { path=%s, source=%s, snapshot=%s }", (C1473g) this.f13021c, (d) this.f13020b, this.f15610d);
    }
}
