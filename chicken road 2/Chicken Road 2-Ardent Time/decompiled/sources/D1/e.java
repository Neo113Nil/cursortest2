package D1;

/* loaded from: classes.dex */
public final class e extends m1.AbstractC0935f implements s1.p {

    /* renamed from: e, reason: collision with root package name */
    public int f227e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f228f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ D1.f f229g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(D1.f fVar, k1.d dVar) {
        super(2, dVar);
        this.f229g = fVar;
    }

    @Override // m1.AbstractC0931b
    public final k1.d b(java.lang.Object obj, k1.d dVar) {
        D1.e eVar = new D1.e(this.f229g, dVar);
        eVar.f228f = obj;
        return eVar;
    }

    @Override // m1.AbstractC0931b
    public final java.lang.Object g(java.lang.Object obj) {
        l1.EnumC0927a enumC0927a = l1.EnumC0927a.f8017a;
        int i2 = this.f227e;
        if (i2 == 0) {
            a.AbstractC0059a.A(obj);
            B1.r rVar = (B1.r) this.f228f;
            this.f227e = 1;
            if (this.f229g.a(rVar, this) == enumC0927a) {
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
        return ((D1.e) b((B1.r) obj, (k1.d) obj2)).g(h1.C0177i.f3302a);
    }
}
