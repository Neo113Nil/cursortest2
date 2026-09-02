package F;

/* loaded from: classes.dex */
public final class B extends m1.AbstractC0931b {

    /* renamed from: d, reason: collision with root package name */
    public F.P f315d;

    /* renamed from: e, reason: collision with root package name */
    public int f316e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f317f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ F.P f318g;

    /* renamed from: h, reason: collision with root package name */
    public int f319h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public B(F.P p2, m1.AbstractC0931b abstractC0931b) {
        super(abstractC0931b);
        this.f318g = p2;
    }

    @Override // m1.AbstractC0931b
    public final java.lang.Object g(java.lang.Object obj) {
        this.f317f = obj;
        this.f319h |= Integer.MIN_VALUE;
        return this.f318g.h(this);
    }
}
