package f1;

/* loaded from: classes.dex */
public final class D extends m1.AbstractC0935f implements s1.p {

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f2793e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ I.d f2794f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ double f2795g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public D(I.d dVar, double d2, k1.d dVar2) {
        super(2, dVar2);
        this.f2794f = dVar;
        this.f2795g = d2;
    }

    @Override // m1.AbstractC0931b
    public final k1.d b(java.lang.Object obj, k1.d dVar) {
        f1.D d2 = new f1.D(this.f2794f, this.f2795g, dVar);
        d2.f2793e = obj;
        return d2;
    }

    @Override // m1.AbstractC0931b
    public final java.lang.Object g(java.lang.Object obj) {
        a.AbstractC0059a.A(obj);
        ((I.b) this.f2793e).d(this.f2794f, new java.lang.Double(this.f2795g));
        return h1.C0177i.f3302a;
    }

    @Override // s1.p
    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        f1.D d2 = (f1.D) b((I.b) obj, (k1.d) obj2);
        h1.C0177i c0177i = h1.C0177i.f3302a;
        d2.g(c0177i);
        return c0177i;
    }
}
