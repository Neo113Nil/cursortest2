package p106o4;

import p046g0.g;
import p098n4.C0934g;
import v4.c;
import v4.r;

/* JADX INFO: loaded from: classes2.dex */
public final class e extends g {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final r f15616d;

    public e(d dVar, C0934g c0934g, r rVar) {
        super(1, dVar, c0934g);
        this.f15616d = rVar;
    }

    @Override // p046g0.g
    public final g a(c cVar) {
        C0934g c0934g = (C0934g) this.f13027c;
        boolean zIsEmpty = c0934g.isEmpty();
        r rVar = this.f15616d;
        d dVar = (d) this.f13026b;
        return zIsEmpty ? new e(dVar, C0934g.f15421d, rVar.o(cVar)) : new e(dVar, c0934g.E(), rVar);
    }

    public final String toString() {
        return String.format("Overwrite { path=%s, source=%s, snapshot=%s }", (C0934g) this.f13027c, (d) this.f13026b, this.f15616d);
    }
}
