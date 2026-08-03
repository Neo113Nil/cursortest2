package f1;

/* loaded from: classes.dex */
public final class H extends m1.AbstractC0935f implements s1.p {

    /* renamed from: e, reason: collision with root package name */
    public int f2807e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f2808f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ f1.J f2809g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ long f2810h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public H(java.lang.String str, f1.J j2, long j3, k1.d dVar) {
        super(2, dVar);
        this.f2808f = str;
        this.f2809g = j2;
        this.f2810h = j3;
    }

    @Override // m1.AbstractC0931b
    public final k1.d b(java.lang.Object obj, k1.d dVar) {
        return new f1.H(this.f2808f, this.f2809g, this.f2810h, dVar);
    }

    @Override // m1.AbstractC0931b
    public final java.lang.Object g(java.lang.Object obj) {
        l1.EnumC0927a enumC0927a = l1.EnumC0927a.f8017a;
        int i2 = this.f2807e;
        if (i2 == 0) {
            a.AbstractC0059a.A(obj);
            I.d dVar = new I.d(this.f2808f);
            android.content.Context context = this.f2809g.f2815a;
            if (context == null) {
                kotlin.jvm.internal.i.i("context");
                throw null;
            }
            C.j a2 = f1.K.a(context);
            f1.G g2 = new f1.G(dVar, this.f2810h, null);
            this.f2807e = 1;
            if (a2.e(new I.h(g2, null), this) == enumC0927a) {
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
        return ((f1.H) b((z1.InterfaceC1067u) obj, (k1.d) obj2)).g(h1.C0177i.f3302a);
    }
}
