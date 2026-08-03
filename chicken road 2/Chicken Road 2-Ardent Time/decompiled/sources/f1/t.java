package f1;

/* loaded from: classes.dex */
public final class t extends m1.AbstractC0935f implements s1.p {

    /* renamed from: e, reason: collision with root package name */
    public kotlin.jvm.internal.p f2877e;

    /* renamed from: f, reason: collision with root package name */
    public int f2878f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f2879g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ f1.J f2880h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.p f2881i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(java.lang.String str, f1.J j2, kotlin.jvm.internal.p pVar, k1.d dVar) {
        super(2, dVar);
        this.f2879g = str;
        this.f2880h = j2;
        this.f2881i = pVar;
    }

    @Override // m1.AbstractC0931b
    public final k1.d b(java.lang.Object obj, k1.d dVar) {
        return new f1.t(this.f2879g, this.f2880h, this.f2881i, dVar);
    }

    @Override // m1.AbstractC0931b
    public final java.lang.Object g(java.lang.Object obj) {
        kotlin.jvm.internal.p pVar;
        l1.EnumC0927a enumC0927a = l1.EnumC0927a.f8017a;
        int i2 = this.f2878f;
        if (i2 == 0) {
            a.AbstractC0059a.A(obj);
            I.d dVar = new I.d(this.f2879g);
            android.content.Context context = this.f2880h.f2815a;
            if (context == null) {
                kotlin.jvm.internal.i.i("context");
                throw null;
            }
            f1.C0128o c0128o = new f1.C0128o(((F.InterfaceC0009i) f1.K.a(context).f88b).getData(), dVar, 1);
            kotlin.jvm.internal.p pVar2 = this.f2881i;
            this.f2877e = pVar2;
            this.f2878f = 1;
            java.lang.Object c2 = C1.s.c(c0128o, this);
            if (c2 == enumC0927a) {
                return enumC0927a;
            }
            pVar = pVar2;
            obj = c2;
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            pVar = this.f2877e;
            a.AbstractC0059a.A(obj);
        }
        pVar.f7960a = obj;
        return h1.C0177i.f3302a;
    }

    @Override // s1.p
    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((f1.t) b((z1.InterfaceC1067u) obj, (k1.d) obj2)).g(h1.C0177i.f3302a);
    }
}
