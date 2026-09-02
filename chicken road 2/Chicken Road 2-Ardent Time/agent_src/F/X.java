package F;

/* loaded from: classes.dex */
public final class X extends m1.AbstractC0931b {

    /* renamed from: d, reason: collision with root package name */
    public F.Y f410d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f411e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f412f;

    /* renamed from: g, reason: collision with root package name */
    public F.a0 f413g;

    /* renamed from: h, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f414h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ F.Y f415i;

    /* renamed from: j, reason: collision with root package name */
    public int f416j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public X(F.Y y2, m1.AbstractC0931b abstractC0931b) {
        super(abstractC0931b);
        this.f415i = y2;
    }

    @Override // m1.AbstractC0931b
    public final java.lang.Object g(java.lang.Object obj) {
        this.f414h = obj;
        this.f416j |= Integer.MIN_VALUE;
        return this.f415i.b(null, this);
    }
}
