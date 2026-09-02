package F;

/* loaded from: classes.dex */
public final class C extends m1.AbstractC0931b {

    /* renamed from: d, reason: collision with root package name */
    public F.P f320d;

    /* renamed from: e, reason: collision with root package name */
    public F.k0 f321e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f322f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f323g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ F.P f324h;

    /* renamed from: i, reason: collision with root package name */
    public int f325i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C(F.P p2, k1.d dVar) {
        super(dVar);
        this.f324h = p2;
    }

    @Override // m1.AbstractC0931b
    public final java.lang.Object g(java.lang.Object obj) {
        this.f323g = obj;
        this.f325i |= Integer.MIN_VALUE;
        return F.P.d(this.f324h, false, this);
    }
}
