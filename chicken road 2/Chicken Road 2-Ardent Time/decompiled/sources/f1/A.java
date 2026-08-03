package f1;

/* loaded from: classes.dex */
public final class A extends m1.AbstractC0935f implements s1.p {

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f2782e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ I.d f2783f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f2784g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public A(I.d dVar, boolean z2, k1.d dVar2) {
        super(2, dVar2);
        this.f2783f = dVar;
        this.f2784g = z2;
    }

    @Override // m1.AbstractC0931b
    public final k1.d b(java.lang.Object obj, k1.d dVar) {
        f1.A a2 = new f1.A(this.f2783f, this.f2784g, dVar);
        a2.f2782e = obj;
        return a2;
    }

    @Override // m1.AbstractC0931b
    public final java.lang.Object g(java.lang.Object obj) {
        a.AbstractC0059a.A(obj);
        ((I.b) this.f2782e).d(this.f2783f, java.lang.Boolean.valueOf(this.f2784g));
        return h1.C0177i.f3302a;
    }

    @Override // s1.p
    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        f1.A a2 = (f1.A) b((I.b) obj, (k1.d) obj2);
        h1.C0177i c0177i = h1.C0177i.f3302a;
        a2.g(c0177i);
        return c0177i;
    }
}
