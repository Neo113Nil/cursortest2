package D1;

/* loaded from: classes.dex */
public final class t extends m1.AbstractC0935f implements s1.p {

    /* renamed from: e, reason: collision with root package name */
    public int f253e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f254f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ C1.e f255g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(C1.e eVar, k1.d dVar) {
        super(2, dVar);
        this.f255g = eVar;
    }

    @Override // m1.AbstractC0931b
    public final k1.d b(java.lang.Object obj, k1.d dVar) {
        D1.t tVar = new D1.t(this.f255g, dVar);
        tVar.f254f = obj;
        return tVar;
    }

    @Override // m1.AbstractC0931b
    public final java.lang.Object g(java.lang.Object obj) {
        l1.EnumC0927a enumC0927a = l1.EnumC0927a.f8017a;
        int i2 = this.f253e;
        if (i2 == 0) {
            a.AbstractC0059a.A(obj);
            java.lang.Object obj2 = this.f254f;
            this.f253e = 1;
            if (this.f255g.a(obj2, this) == enumC0927a) {
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
        return ((D1.t) b(obj, (k1.d) obj2)).g(h1.C0177i.f3302a);
    }
}
