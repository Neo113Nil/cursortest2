package F;

/* loaded from: classes.dex */
public final class D extends m1.AbstractC0935f implements s1.l {

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Throwable f326e;

    /* renamed from: f, reason: collision with root package name */
    public int f327f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ F.P f328g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public D(F.P p2, k1.d dVar) {
        super(1, dVar);
        this.f328g = p2;
    }

    @Override // m1.AbstractC0931b
    public final java.lang.Object g(java.lang.Object obj) {
        java.lang.Throwable th;
        F.k0 k0Var;
        l1.EnumC0927a enumC0927a = l1.EnumC0927a.f8017a;
        int i2 = this.f327f;
        F.P p2 = this.f328g;
        try {
        } catch (java.lang.Throwable th2) {
            F.j0 g2 = p2.g();
            this.f326e = th2;
            this.f327f = 2;
            java.lang.Integer a2 = g2.a();
            if (a2 == enumC0927a) {
                return enumC0927a;
            }
            th = th2;
            obj = a2;
        }
        if (i2 == 0) {
            a.AbstractC0059a.A(obj);
            this.f327f = 1;
            obj = F.P.f(p2, true, this);
            if (obj == enumC0927a) {
                return enumC0927a;
            }
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                th = this.f326e;
                a.AbstractC0059a.A(obj);
                k0Var = new F.d0(th, ((java.lang.Number) obj).intValue());
                return new h1.C0172d(k0Var, java.lang.Boolean.TRUE);
            }
            a.AbstractC0059a.A(obj);
        }
        k0Var = (F.k0) obj;
        return new h1.C0172d(k0Var, java.lang.Boolean.TRUE);
    }

    @Override // s1.l
    public final java.lang.Object invoke(java.lang.Object obj) {
        return new F.D(this.f328g, (k1.d) obj).g(h1.C0177i.f3302a);
    }
}
