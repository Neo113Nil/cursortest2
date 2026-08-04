package p106o4;

import p046g0.g;
import p098n4.C0934g;
import p120q4.k;
import v4.c;

/* JADX INFO: loaded from: classes2.dex */
public final class b extends g {
    public b(d dVar, C0934g c0934g) {
        super(4, dVar, c0934g);
        k.b("Can't have a listen complete from a user source", !(dVar.f15613a == 1));
    }

    @Override // p046g0.g
    public final g a(c cVar) {
        C0934g c0934g = (C0934g) this.f13027c;
        boolean zIsEmpty = c0934g.isEmpty();
        d dVar = (d) this.f13026b;
        return zIsEmpty ? new b(dVar, C0934g.f15421d) : new b(dVar, c0934g.E());
    }

    public final String toString() {
        return "ListenComplete { path=" + ((C0934g) this.f13027c) + ", source=" + ((d) this.f13026b) + " }";
    }
}
