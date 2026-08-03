package F;

/* loaded from: classes.dex */
public final class J extends m1.AbstractC0935f implements s1.p {

    /* renamed from: e, reason: collision with root package name */
    public int f356e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ m1.AbstractC0935f f357f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ F.C0004d f358g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public J(s1.p pVar, F.C0004d c0004d, k1.d dVar) {
        super(2, dVar);
        this.f357f = (m1.AbstractC0935f) pVar;
        this.f358g = c0004d;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [m1.f, s1.p] */
    @Override // m1.AbstractC0931b
    public final k1.d b(java.lang.Object obj, k1.d dVar) {
        return new F.J(this.f357f, this.f358g, dVar);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [m1.f, s1.p] */
    @Override // m1.AbstractC0931b
    public final java.lang.Object g(java.lang.Object obj) {
        l1.EnumC0927a enumC0927a = l1.EnumC0927a.f8017a;
        int i2 = this.f356e;
        if (i2 == 0) {
            a.AbstractC0059a.A(obj);
            java.lang.Object obj2 = this.f358g.f432b;
            this.f356e = 1;
            obj = this.f357f.invoke(obj2, this);
            if (obj == enumC0927a) {
                return enumC0927a;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            a.AbstractC0059a.A(obj);
        }
        return obj;
    }

    @Override // s1.p
    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((F.J) b((z1.InterfaceC1067u) obj, (k1.d) obj2)).g(h1.C0177i.f3302a);
    }
}
