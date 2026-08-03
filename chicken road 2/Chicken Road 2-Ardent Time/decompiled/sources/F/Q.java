package F;

/* loaded from: classes.dex */
public final class Q extends m1.AbstractC0931b {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f390d;

    /* renamed from: e, reason: collision with root package name */
    public java.io.FileInputStream f391e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f392f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ F.S f393g;

    /* renamed from: h, reason: collision with root package name */
    public int f394h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Q(F.S s2, m1.AbstractC0931b abstractC0931b) {
        super(abstractC0931b);
        this.f393g = s2;
    }

    @Override // m1.AbstractC0931b
    public final java.lang.Object g(java.lang.Object obj) {
        this.f392f = obj;
        this.f394h |= Integer.MIN_VALUE;
        return F.S.a(this.f393g, this);
    }
}
