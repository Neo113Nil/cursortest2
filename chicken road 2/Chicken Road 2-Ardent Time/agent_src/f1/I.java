package f1;

/* loaded from: classes.dex */
public final class I extends m1.AbstractC0935f implements s1.p {

    /* renamed from: e, reason: collision with root package name */
    public int f2811e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ f1.J f2812f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f2813g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f2814h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public I(f1.J j2, java.lang.String str, java.lang.String str2, k1.d dVar) {
        super(2, dVar);
        this.f2812f = j2;
        this.f2813g = str;
        this.f2814h = str2;
    }

    @Override // m1.AbstractC0931b
    public final k1.d b(java.lang.Object obj, k1.d dVar) {
        return new f1.I(this.f2812f, this.f2813g, this.f2814h, dVar);
    }

    @Override // m1.AbstractC0931b
    public final java.lang.Object g(java.lang.Object obj) {
        l1.EnumC0927a enumC0927a = l1.EnumC0927a.f8017a;
        int i2 = this.f2811e;
        if (i2 == 0) {
            a.AbstractC0059a.A(obj);
            this.f2811e = 1;
            if (f1.J.i(this.f2812f, this.f2813g, this.f2814h, this) == enumC0927a) {
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
        return ((f1.I) b((z1.InterfaceC1067u) obj, (k1.d) obj2)).g(h1.C0177i.f3302a);
    }
}
