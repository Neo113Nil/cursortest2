package f1;

/* loaded from: classes.dex */
public final class C extends m1.AbstractC0935f implements s1.p {

    /* renamed from: e, reason: collision with root package name */
    public int f2789e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ f1.J f2790f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f2791g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f2792h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C(f1.J j2, java.lang.String str, java.lang.String str2, k1.d dVar) {
        super(2, dVar);
        this.f2790f = j2;
        this.f2791g = str;
        this.f2792h = str2;
    }

    @Override // m1.AbstractC0931b
    public final k1.d b(java.lang.Object obj, k1.d dVar) {
        return new f1.C(this.f2790f, this.f2791g, this.f2792h, dVar);
    }

    @Override // m1.AbstractC0931b
    public final java.lang.Object g(java.lang.Object obj) {
        l1.EnumC0927a enumC0927a = l1.EnumC0927a.f8017a;
        int i2 = this.f2789e;
        if (i2 == 0) {
            a.AbstractC0059a.A(obj);
            this.f2789e = 1;
            if (f1.J.i(this.f2790f, this.f2791g, this.f2792h, this) == enumC0927a) {
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
        return ((f1.C) b((z1.InterfaceC1067u) obj, (k1.d) obj2)).g(h1.C0177i.f3302a);
    }
}
