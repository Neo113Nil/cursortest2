package F;

/* loaded from: classes.dex */
public final class Z extends m1.AbstractC0931b {

    /* renamed from: d, reason: collision with root package name */
    public java.io.FileOutputStream f422d;

    /* renamed from: e, reason: collision with root package name */
    public java.io.FileOutputStream f423e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f424f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ F.a0 f425g;

    /* renamed from: h, reason: collision with root package name */
    public int f426h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Z(F.a0 a0Var, m1.AbstractC0931b abstractC0931b) {
        super(abstractC0931b);
        this.f425g = a0Var;
    }

    @Override // m1.AbstractC0931b
    public final java.lang.Object g(java.lang.Object obj) {
        this.f424f = obj;
        this.f426h |= Integer.MIN_VALUE;
        return this.f425g.b(null, this);
    }
}
