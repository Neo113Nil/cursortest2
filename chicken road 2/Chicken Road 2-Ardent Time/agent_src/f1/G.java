package f1;

/* loaded from: classes.dex */
public final class G extends m1.AbstractC0935f implements s1.p {

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f2804e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ I.d f2805f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f2806g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public G(I.d dVar, long j2, k1.d dVar2) {
        super(2, dVar2);
        this.f2805f = dVar;
        this.f2806g = j2;
    }

    @Override // m1.AbstractC0931b
    public final k1.d b(java.lang.Object obj, k1.d dVar) {
        f1.G g2 = new f1.G(this.f2805f, this.f2806g, dVar);
        g2.f2804e = obj;
        return g2;
    }

    @Override // m1.AbstractC0931b
    public final java.lang.Object g(java.lang.Object obj) {
        a.AbstractC0059a.A(obj);
        ((I.b) this.f2804e).d(this.f2805f, new java.lang.Long(this.f2806g));
        return h1.C0177i.f3302a;
    }

    @Override // s1.p
    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        f1.G g2 = (f1.G) b((I.b) obj, (k1.d) obj2);
        h1.C0177i c0177i = h1.C0177i.f3302a;
        g2.g(c0177i);
        return c0177i;
    }
}
