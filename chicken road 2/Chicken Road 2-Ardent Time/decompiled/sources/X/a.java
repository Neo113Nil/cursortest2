package X;

/* loaded from: classes.dex */
public final class a extends m1.AbstractC0935f implements s1.p {

    /* renamed from: e, reason: collision with root package name */
    public int f1831e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ C1.d f1832f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ P0.q f1833g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(C1.d dVar, P0.q qVar, k1.d dVar2) {
        super(2, dVar2);
        this.f1832f = dVar;
        this.f1833g = qVar;
    }

    @Override // m1.AbstractC0931b
    public final k1.d b(java.lang.Object obj, k1.d dVar) {
        return new X.a(this.f1832f, this.f1833g, dVar);
    }

    @Override // m1.AbstractC0931b
    public final java.lang.Object g(java.lang.Object obj) {
        l1.EnumC0927a enumC0927a = l1.EnumC0927a.f8017a;
        int i2 = this.f1831e;
        if (i2 == 0) {
            a.AbstractC0059a.A(obj);
            C1.o oVar = new C1.o(2, this.f1833g);
            this.f1831e = 1;
            if (this.f1832f.o(oVar, this) == enumC0927a) {
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
        return ((X.a) b((z1.InterfaceC1067u) obj, (k1.d) obj2)).g(h1.C0177i.f3302a);
    }
}
