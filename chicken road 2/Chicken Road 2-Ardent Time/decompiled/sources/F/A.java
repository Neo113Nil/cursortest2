package F;

/* loaded from: classes.dex */
public final class A extends m1.AbstractC0935f implements s1.p {

    /* renamed from: e, reason: collision with root package name */
    public int f313e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ F.P f314f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public A(F.P p2, k1.d dVar) {
        super(2, dVar);
        this.f314f = p2;
    }

    @Override // m1.AbstractC0931b
    public final k1.d b(java.lang.Object obj, k1.d dVar) {
        return new F.A(this.f314f, dVar);
    }

    @Override // m1.AbstractC0931b
    public final java.lang.Object g(java.lang.Object obj) {
        l1.EnumC0927a enumC0927a = l1.EnumC0927a.f8017a;
        int i2 = this.f313e;
        h1.C0177i c0177i = h1.C0177i.f3302a;
        F.P p2 = this.f314f;
        if (i2 == 0) {
            a.AbstractC0059a.A(obj);
            this.f313e = 1;
            java.lang.Object T2 = ((z1.C1059l) p2.f386i.f499b).T(this);
            if (T2 != enumC0927a) {
                T2 = c0177i;
            }
            if (T2 == enumC0927a) {
                return enumC0927a;
            }
        } else {
            if (i2 != 1) {
                if (i2 == 2) {
                    a.AbstractC0059a.A(obj);
                }
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            a.AbstractC0059a.A(obj);
        }
        C1.d dVar = p2.g().f473c;
        C1.d a2 = dVar instanceof D1.j ? D1.l.a((D1.j) dVar, null, 0, 2, 1) : new D1.h(dVar, k1.j.f7951a, 0, 2);
        C1.o oVar = new C1.o(1, p2);
        this.f313e = 2;
        return a2.o(oVar, this) == enumC0927a ? enumC0927a : c0177i;
    }

    @Override // s1.p
    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((F.A) b((z1.InterfaceC1067u) obj, (k1.d) obj2)).g(h1.C0177i.f3302a);
    }
}
