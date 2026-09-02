package F;

/* loaded from: classes.dex */
public final class F extends m1.AbstractC0931b {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f334d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f335e;

    /* renamed from: f, reason: collision with root package name */
    public java.io.Serializable f336f;

    /* renamed from: g, reason: collision with root package name */
    public kotlin.jvm.internal.p f337g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f338h;

    /* renamed from: i, reason: collision with root package name */
    public int f339i;

    /* renamed from: j, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f340j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ F.P f341k;

    /* renamed from: l, reason: collision with root package name */
    public int f342l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public F(F.P p2, m1.AbstractC0931b abstractC0931b) {
        super(abstractC0931b);
        this.f341k = p2;
    }

    @Override // m1.AbstractC0931b
    public final java.lang.Object g(java.lang.Object obj) {
        this.f340j = obj;
        this.f342l |= Integer.MIN_VALUE;
        return F.P.f(this.f341k, false, this);
    }
}
