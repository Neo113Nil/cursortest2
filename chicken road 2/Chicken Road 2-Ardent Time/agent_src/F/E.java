package F;

/* loaded from: classes.dex */
public final class E extends m1.AbstractC0935f implements s1.p {

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Throwable f329e;

    /* renamed from: f, reason: collision with root package name */
    public int f330f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ boolean f331g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ F.P f332h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f333i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public E(F.P p2, int i2, k1.d dVar) {
        super(2, dVar);
        this.f332h = p2;
        this.f333i = i2;
    }

    @Override // m1.AbstractC0931b
    public final k1.d b(java.lang.Object obj, k1.d dVar) {
        F.E e2 = new F.E(this.f332h, this.f333i, dVar);
        e2.f331g = ((java.lang.Boolean) obj).booleanValue();
        return e2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v15 */
    @Override // m1.AbstractC0931b
    public final java.lang.Object g(java.lang.Object obj) {
        java.lang.Throwable th;
        int i2;
        boolean z2;
        F.k0 k0Var;
        boolean z3;
        l1.EnumC0927a enumC0927a = l1.EnumC0927a.f8017a;
        boolean z4 = this.f330f;
        F.P p2 = this.f332h;
        try {
        } catch (java.lang.Throwable th2) {
            if (z4 != 0) {
                F.j0 g2 = p2.g();
                this.f329e = th2;
                this.f331g = z4;
                this.f330f = 2;
                java.lang.Integer a2 = g2.a();
                if (a2 == enumC0927a) {
                    return enumC0927a;
                }
                z2 = z4;
                th = th2;
                obj = a2;
            } else {
                boolean z5 = z4;
                th = th2;
                i2 = this.f333i;
                z2 = z5;
            }
        }
        if (z4 == 0) {
            a.AbstractC0059a.A(obj);
            boolean z6 = this.f331g;
            this.f331g = z6;
            this.f330f = 1;
            obj = F.P.f(p2, z6, this);
            z4 = z6;
            if (obj == enumC0927a) {
                return enumC0927a;
            }
        } else {
            if (z4 != 1) {
                if (z4 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                z2 = this.f331g;
                th = this.f329e;
                a.AbstractC0059a.A(obj);
                i2 = ((java.lang.Number) obj).intValue();
                F.d0 d0Var = new F.d0(th, i2);
                z3 = z2;
                k0Var = d0Var;
                return new h1.C0172d(k0Var, java.lang.Boolean.valueOf(z3));
            }
            boolean z7 = this.f331g;
            a.AbstractC0059a.A(obj);
            z4 = z7;
        }
        k0Var = (F.k0) obj;
        z3 = z4;
        return new h1.C0172d(k0Var, java.lang.Boolean.valueOf(z3));
    }

    @Override // s1.p
    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        java.lang.Boolean bool = (java.lang.Boolean) obj;
        bool.booleanValue();
        return ((F.E) b(bool, (k1.d) obj2)).g(h1.C0177i.f3302a);
    }
}
