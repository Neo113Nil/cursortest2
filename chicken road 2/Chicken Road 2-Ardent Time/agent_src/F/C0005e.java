package F;

/* renamed from: F.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0005e extends m1.AbstractC0935f implements s1.p {

    /* renamed from: e, reason: collision with root package name */
    public int f435e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f436f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.util.List f437g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0005e(java.util.List list, k1.d dVar) {
        super(2, dVar);
        this.f437g = list;
    }

    @Override // m1.AbstractC0931b
    public final k1.d b(java.lang.Object obj, k1.d dVar) {
        F.C0005e c0005e = new F.C0005e(this.f437g, dVar);
        c0005e.f436f = obj;
        return c0005e;
    }

    @Override // m1.AbstractC0931b
    public final java.lang.Object g(java.lang.Object obj) {
        l1.EnumC0927a enumC0927a = l1.EnumC0927a.f8017a;
        int i2 = this.f435e;
        if (i2 == 0) {
            a.AbstractC0059a.A(obj);
            F.C0012l c0012l = (F.C0012l) this.f436f;
            this.f435e = 1;
            if (a.AbstractC0059a.a(this.f437g, c0012l, this) == enumC0927a) {
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
        return ((F.C0005e) b((F.C0012l) obj, (k1.d) obj2)).g(h1.C0177i.f3302a);
    }
}
