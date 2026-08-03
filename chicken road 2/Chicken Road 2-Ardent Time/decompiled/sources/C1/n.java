package C1;

/* loaded from: classes.dex */
public final class n extends m1.AbstractC0931b {

    /* renamed from: d, reason: collision with root package name */
    public f1.C0127n f156d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f157e;

    /* renamed from: f, reason: collision with root package name */
    public int f158f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ f1.C0127n f159g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.Object f160h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(f1.C0127n c0127n, k1.d dVar) {
        super(dVar);
        this.f159g = c0127n;
    }

    @Override // m1.AbstractC0931b
    public final java.lang.Object g(java.lang.Object obj) {
        this.f157e = obj;
        this.f158f |= Integer.MIN_VALUE;
        return this.f159g.a(null, this);
    }
}
