package Z;

/* loaded from: classes.dex */
public final class i extends m1.AbstractC0935f implements s1.p {

    /* renamed from: e, reason: collision with root package name */
    public int f1857e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f1858f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Z.b f1859g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f1860h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(Z.b bVar, android.app.Activity activity, k1.d dVar) {
        super(2, dVar);
        this.f1859g = bVar;
        this.f1860h = activity;
    }

    @Override // m1.AbstractC0931b
    public final k1.d b(java.lang.Object obj, k1.d dVar) {
        Z.i iVar = new Z.i(this.f1859g, this.f1860h, dVar);
        iVar.f1858f = obj;
        return iVar;
    }

    @Override // m1.AbstractC0931b
    public final java.lang.Object g(java.lang.Object obj) {
        l1.EnumC0927a enumC0927a = l1.EnumC0927a.f8017a;
        int i2 = this.f1857e;
        if (i2 == 0) {
            a.AbstractC0059a.A(obj);
            B1.r rVar = (B1.r) this.f1858f;
            P0.q qVar = new P0.q(1, rVar);
            Z.b bVar = this.f1859g;
            ((a0.InterfaceC0060a) bVar.f1843b).b(this.f1860h, new N.c(), qVar);
            H.b bVar2 = new H.b(1, bVar, qVar);
            this.f1857e = 1;
            if (B1.j.b(rVar, bVar2, this) == enumC0927a) {
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
        return ((Z.i) b((B1.r) obj, (k1.d) obj2)).g(h1.C0177i.f3302a);
    }
}
