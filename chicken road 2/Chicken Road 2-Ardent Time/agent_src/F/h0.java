package F;

/* loaded from: classes.dex */
public final class h0 extends m1.AbstractC0931b {

    /* renamed from: d, reason: collision with root package name */
    public H1.d f462d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f463e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f464f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ F.j0 f465g;

    /* renamed from: h, reason: collision with root package name */
    public int f466h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(F.j0 j0Var, m1.AbstractC0931b abstractC0931b) {
        super(abstractC0931b);
        this.f465g = j0Var;
    }

    @Override // m1.AbstractC0931b
    public final java.lang.Object g(java.lang.Object obj) {
        this.f464f = obj;
        this.f466h |= Integer.MIN_VALUE;
        return this.f465g.c(null, this);
    }
}
