package F;

/* loaded from: classes.dex */
public final class r extends m1.AbstractC0935f implements s1.p {

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f510e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ F.k0 f511f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(F.k0 k0Var, k1.d dVar) {
        super(2, dVar);
        this.f511f = k0Var;
    }

    @Override // m1.AbstractC0931b
    public final k1.d b(java.lang.Object obj, k1.d dVar) {
        F.r rVar = new F.r(this.f511f, dVar);
        rVar.f510e = obj;
        return rVar;
    }

    @Override // m1.AbstractC0931b
    public final java.lang.Object g(java.lang.Object obj) {
        a.AbstractC0059a.A(obj);
        F.k0 k0Var = (F.k0) this.f510e;
        return java.lang.Boolean.valueOf((k0Var instanceof F.C0004d) && k0Var.f482a <= this.f511f.f482a);
    }

    @Override // s1.p
    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((F.r) b((F.k0) obj, (k1.d) obj2)).g(h1.C0177i.f3302a);
    }
}
