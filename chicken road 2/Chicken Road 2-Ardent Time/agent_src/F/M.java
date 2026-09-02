package F;

/* loaded from: classes.dex */
public final class M extends m1.AbstractC0935f implements s1.p {

    /* renamed from: e, reason: collision with root package name */
    public int f364e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f365f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ F.P f366g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public M(F.P p2, k1.d dVar) {
        super(2, dVar);
        this.f366g = p2;
    }

    @Override // m1.AbstractC0931b
    public final k1.d b(java.lang.Object obj, k1.d dVar) {
        F.M m2 = new F.M(this.f366g, dVar);
        m2.f365f = obj;
        return m2;
    }

    @Override // m1.AbstractC0931b
    public final java.lang.Object g(java.lang.Object obj) {
        l1.EnumC0927a enumC0927a = l1.EnumC0927a.f8017a;
        int i2 = this.f364e;
        if (i2 == 0) {
            a.AbstractC0059a.A(obj);
            F.c0 c0Var = (F.c0) this.f365f;
            this.f364e = 1;
            if (F.P.b(this.f366g, c0Var, this) == enumC0927a) {
                return enumC0927a;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            a.AbstractC0059a.A(obj);
        }
        return h1.C0177i.f3302a;
    }

    @Override // s1.p
    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((F.M) b((F.c0) obj, (k1.d) obj2)).g(h1.C0177i.f3302a);
    }
}
