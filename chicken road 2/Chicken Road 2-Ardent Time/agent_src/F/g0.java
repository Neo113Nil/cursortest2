package F;

/* loaded from: classes.dex */
public final class g0 extends m1.AbstractC0931b {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f451d;

    /* renamed from: e, reason: collision with root package name */
    public H1.d f452e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f453f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ F.j0 f454g;

    /* renamed from: h, reason: collision with root package name */
    public int f455h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(F.j0 j0Var, m1.AbstractC0931b abstractC0931b) {
        super(abstractC0931b);
        this.f454g = j0Var;
    }

    @Override // m1.AbstractC0931b
    public final java.lang.Object g(java.lang.Object obj) {
        this.f453f = obj;
        this.f455h |= Integer.MIN_VALUE;
        return this.f454g.b(null, this);
    }
}
