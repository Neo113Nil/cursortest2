package p106o4;

import p046g0.g;
import p098n4.C0934g;
import p120q4.c;
import p120q4.k;

/* JADX INFO: loaded from: classes2.dex */
public final class a extends g {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f15608d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final c f15609e;

    public a(C0934g c0934g, c cVar, boolean z4) {
        super(3, d.f15611d, c0934g);
        this.f15609e = cVar;
        this.f15608d = z4;
    }

    @Override // p046g0.g
    public final g a(v4.c cVar) {
        C0934g c0934g = (C0934g) this.f13027c;
        boolean zIsEmpty = c0934g.isEmpty();
        boolean z4 = this.f15608d;
        c cVar2 = this.f15609e;
        if (!zIsEmpty) {
            k.b("operationForChild called for unrelated child.", c0934g.B().equals(cVar));
            return new a(c0934g.E(), cVar2, z4);
        }
        if (cVar2.f15861a != null) {
            k.b("affectedTree should not have overlapping affected paths.", cVar2.f15862b.isEmpty());
            return this;
        }
        return new a(C0934g.f15421d, cVar2.F(new C0934g(cVar)), z4);
    }

    public final String toString() {
        return "AckUserWrite { path=" + ((C0934g) this.f13027c) + ", revert=" + this.f15608d + ", affectedTree=" + this.f15609e + " }";
    }
}
