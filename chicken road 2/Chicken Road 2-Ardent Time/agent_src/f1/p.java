package f1;

/* loaded from: classes.dex */
public final class p extends m1.AbstractC0935f implements s1.p {

    /* renamed from: e, reason: collision with root package name */
    public kotlin.jvm.internal.p f2861e;

    /* renamed from: f, reason: collision with root package name */
    public int f2862f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f2863g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ f1.J f2864h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.p f2865i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(java.lang.String str, f1.J j2, kotlin.jvm.internal.p pVar, k1.d dVar) {
        super(2, dVar);
        this.f2863g = str;
        this.f2864h = j2;
        this.f2865i = pVar;
    }

    @Override // m1.AbstractC0931b
    public final k1.d b(java.lang.Object obj, k1.d dVar) {
        return new f1.p(this.f2863g, this.f2864h, this.f2865i, dVar);
    }

    @Override // m1.AbstractC0931b
    public final java.lang.Object g(java.lang.Object obj) {
        kotlin.jvm.internal.p pVar;
        l1.EnumC0927a enumC0927a = l1.EnumC0927a.f8017a;
        int i2 = this.f2862f;
        if (i2 == 0) {
            a.AbstractC0059a.A(obj);
            I.d dVar = new I.d(this.f2863g);
            android.content.Context context = this.f2864h.f2815a;
            if (context == null) {
                kotlin.jvm.internal.i.i("context");
                throw null;
            }
            f1.C0128o c0128o = new f1.C0128o(((F.InterfaceC0009i) f1.K.a(context).f88b).getData(), dVar, 0);
            kotlin.jvm.internal.p pVar2 = this.f2865i;
            this.f2861e = pVar2;
            this.f2862f = 1;
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
            pVar = this.f2861e;
            a.AbstractC0059a.A(obj);
        }
        pVar.f7960a = obj;
        return h1.C0177i.f3302a;
    }

    @Override // s1.p
    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((f1.p) b((z1.InterfaceC1067u) obj, (k1.d) obj2)).g(h1.C0177i.f3302a);
    }
}
