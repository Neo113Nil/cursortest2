package F;

/* loaded from: classes.dex */
public final class e0 extends m1.AbstractC0931b {

    /* renamed from: d, reason: collision with root package name */
    public F.C0014n f438d;

    /* renamed from: e, reason: collision with root package name */
    public H1.a f439e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f440f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ F.C0014n f441g;

    /* renamed from: h, reason: collision with root package name */
    public int f442h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(F.C0014n c0014n, m1.AbstractC0931b abstractC0931b) {
        super(abstractC0931b);
        this.f441g = c0014n;
    }

    @Override // m1.AbstractC0931b
    public final java.lang.Object g(java.lang.Object obj) {
        this.f440f = obj;
        this.f442h |= Integer.MIN_VALUE;
        return this.f441g.f(this);
    }
}
