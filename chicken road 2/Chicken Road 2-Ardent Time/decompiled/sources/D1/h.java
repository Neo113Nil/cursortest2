package D1;

/* loaded from: classes.dex */
public final class h extends D1.f {

    /* renamed from: d, reason: collision with root package name */
    public final C1.d f236d;

    public h(C1.d dVar, k1.i iVar, int i2, int i3) {
        super(iVar, i2, i3);
        this.f236d = dVar;
    }

    @Override // D1.f
    public final java.lang.Object a(B1.r rVar, k1.d dVar) {
        java.lang.Object o2 = this.f236d.o(new D1.r(rVar), dVar);
        l1.EnumC0927a enumC0927a = l1.EnumC0927a.f8017a;
        h1.C0177i c0177i = h1.C0177i.f3302a;
        if (o2 != enumC0927a) {
            o2 = c0177i;
        }
        return o2 == enumC0927a ? o2 : c0177i;
    }

    @Override // D1.f
    public final D1.f b(k1.i iVar, int i2, int i3) {
        return new D1.h(this.f236d, iVar, i2, i3);
    }

    @Override // D1.f, C1.d
    public final java.lang.Object o(C1.e eVar, k1.d dVar) {
        java.lang.Object o2;
        h1.C0177i c0177i = h1.C0177i.f3302a;
        int i2 = this.f231b;
        l1.EnumC0927a enumC0927a = l1.EnumC0927a.f8017a;
        if (i2 == -3) {
            k1.i context = dVar.getContext();
            java.lang.Boolean bool = java.lang.Boolean.FALSE;
            z1.C1063p c1063p = z1.C1063p.f8585g;
            k1.i iVar = this.f230a;
            k1.i g2 = !((java.lang.Boolean) iVar.k(bool, c1063p)).booleanValue() ? context.g(iVar) : z1.AbstractC1068v.a(context, iVar, false);
            if (kotlin.jvm.internal.i.a(g2, context)) {
                o2 = this.f236d.o(eVar, dVar);
                if (o2 != enumC0927a) {
                    o2 = c0177i;
                }
                if (o2 != enumC0927a) {
                    return c0177i;
                }
            } else {
                k1.e eVar2 = k1.e.f7950a;
                if (kotlin.jvm.internal.i.a(g2.m(eVar2), context.m(eVar2))) {
                    k1.i context2 = dVar.getContext();
                    if (!(eVar instanceof D1.r)) {
                        eVar = new C1.l(eVar, context2);
                    }
                    o2 = D1.l.b(g2, eVar, E1.AbstractC0000a.l(g2), new D1.g(this, null), dVar);
                    if (o2 != enumC0927a) {
                        o2 = c0177i;
                    }
                    if (o2 != enumC0927a) {
                        return c0177i;
                    }
                }
            }
            return o2;
        }
        o2 = super.o(eVar, dVar);
        if (o2 != enumC0927a) {
            return c0177i;
        }
        return o2;
    }

    @Override // D1.f
    public final java.lang.String toString() {
        return this.f236d + " -> " + super.toString();
    }
}
