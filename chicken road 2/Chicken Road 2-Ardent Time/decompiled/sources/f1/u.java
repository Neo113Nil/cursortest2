package f1;

/* loaded from: classes.dex */
public final class u extends m1.AbstractC0935f implements s1.p {

    /* renamed from: e, reason: collision with root package name */
    public int f2882e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ f1.J f2883f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.util.List f2884g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(f1.J j2, java.util.List list, k1.d dVar) {
        super(2, dVar);
        this.f2883f = j2;
        this.f2884g = list;
    }

    @Override // m1.AbstractC0931b
    public final k1.d b(java.lang.Object obj, k1.d dVar) {
        return new f1.u(this.f2883f, this.f2884g, dVar);
    }

    @Override // m1.AbstractC0931b
    public final java.lang.Object g(java.lang.Object obj) {
        l1.EnumC0927a enumC0927a = l1.EnumC0927a.f8017a;
        int i2 = this.f2882e;
        if (i2 == 0) {
            a.AbstractC0059a.A(obj);
            this.f2882e = 1;
            obj = f1.J.n(this.f2883f, this.f2884g, this);
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
        return ((f1.u) b((z1.InterfaceC1067u) obj, (k1.d) obj2)).g(h1.C0177i.f3302a);
    }
}
