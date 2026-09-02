package F;

/* loaded from: classes.dex */
public final class W extends m1.AbstractC0931b {

    /* renamed from: d, reason: collision with root package name */
    public F.Y f404d;

    /* renamed from: e, reason: collision with root package name */
    public F.S f405e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f406f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f407g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ F.Y f408h;

    /* renamed from: i, reason: collision with root package name */
    public int f409i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public W(F.Y y2, m1.AbstractC0931b abstractC0931b) {
        super(abstractC0931b);
        this.f408h = y2;
    }

    @Override // m1.AbstractC0931b
    public final java.lang.Object g(java.lang.Object obj) {
        this.f407g = obj;
        this.f409i |= Integer.MIN_VALUE;
        return this.f408h.a(null, this);
    }
}
