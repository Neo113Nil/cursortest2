package F;

/* renamed from: F.w, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0022w extends m1.AbstractC0931b {

    /* renamed from: d, reason: collision with root package name */
    public F.P f524d;

    /* renamed from: e, reason: collision with root package name */
    public H1.d f525e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f526f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ F.P f527g;

    /* renamed from: h, reason: collision with root package name */
    public int f528h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0022w(F.P p2, m1.AbstractC0931b abstractC0931b) {
        super(abstractC0931b);
        this.f527g = p2;
    }

    @Override // m1.AbstractC0931b
    public final java.lang.Object g(java.lang.Object obj) {
        this.f526f = obj;
        this.f528h |= Integer.MIN_VALUE;
        return F.P.a(this.f527g, this);
    }
}
