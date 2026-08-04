package p106o4;

import p046g0.g;
import p098n4.C0929b;
import p098n4.C0934g;
import v4.r;

/* JADX INFO: loaded from: classes2.dex */
public final class c extends g {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C0929b f15610d;

    public c(d dVar, C0934g c0934g, C0929b c0929b) {
        super(2, dVar, c0934g);
        this.f15610d = c0929b;
    }

    @Override // p046g0.g
    public final g a(v4.c cVar) {
        C0934g c0934g = (C0934g) this.f13027c;
        boolean zIsEmpty = c0934g.isEmpty();
        C0929b c0929b = this.f15610d;
        d dVar = (d) this.f13026b;
        if (!zIsEmpty) {
            if (c0934g.B().equals(cVar)) {
                return new c(dVar, c0934g.E(), c0929b);
            }
            return null;
        }
        C0929b c0929bZ = c0929b.z(new C0934g(cVar));
        p120q4.c cVar2 = c0929bZ.f15398a;
        if (cVar2.isEmpty()) {
            return null;
        }
        Object obj = cVar2.f15861a;
        return ((r) obj) != null ? new e(dVar, C0934g.f15421d, (r) obj) : new c(dVar, C0934g.f15421d, c0929bZ);
    }

    public final String toString() {
        return "Merge { path=" + ((C0934g) this.f13027c) + ", source=" + ((d) this.f13026b) + ", children=" + this.f15610d + " }";
    }
}
