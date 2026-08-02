package o4;

import g0.AbstractC1125g;
import n4.C1473g;
import q4.k;

/* renamed from: o4.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1509a extends AbstractC1125g {

    /* renamed from: d, reason: collision with root package name */
    public final boolean f15602d;

    /* renamed from: e, reason: collision with root package name */
    public final q4.c f15603e;

    public C1509a(C1473g c1473g, q4.c cVar, boolean z4) {
        super(3, d.f15605d, c1473g);
        this.f15603e = cVar;
        this.f15602d = z4;
    }

    @Override // g0.AbstractC1125g
    public final AbstractC1125g a(v4.c cVar) {
        C1473g c1473g = (C1473g) this.f13021c;
        boolean isEmpty = c1473g.isEmpty();
        boolean z4 = this.f15602d;
        q4.c cVar2 = this.f15603e;
        if (!isEmpty) {
            k.b("operationForChild called for unrelated child.", c1473g.B().equals(cVar));
            return new C1509a(c1473g.E(), cVar2, z4);
        }
        if (cVar2.f15855a != null) {
            k.b("affectedTree should not have overlapping affected paths.", cVar2.f15856b.isEmpty());
            return this;
        }
        return new C1509a(C1473g.f15415d, cVar2.F(new C1473g(cVar)), z4);
    }

    public final String toString() {
        return "AckUserWrite { path=" + ((C1473g) this.f13021c) + ", revert=" + this.f15602d + ", affectedTree=" + this.f15603e + " }";
    }
}
