package o4;

import g0.AbstractC1125g;
import n4.C1473g;
import q4.k;

/* renamed from: o4.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1510b extends AbstractC1125g {
    public C1510b(d dVar, C1473g c1473g) {
        super(4, dVar, c1473g);
        k.b("Can't have a listen complete from a user source", !(dVar.f15607a == 1));
    }

    @Override // g0.AbstractC1125g
    public final AbstractC1125g a(v4.c cVar) {
        C1473g c1473g = (C1473g) this.f13021c;
        boolean isEmpty = c1473g.isEmpty();
        d dVar = (d) this.f13020b;
        return isEmpty ? new C1510b(dVar, C1473g.f15415d) : new C1510b(dVar, c1473g.E());
    }

    public final String toString() {
        return "ListenComplete { path=" + ((C1473g) this.f13021c) + ", source=" + ((d) this.f13020b) + " }";
    }
}
