package C1;

/* loaded from: classes.dex */
public final class k extends m1.AbstractC0931b {

    /* renamed from: d, reason: collision with root package name */
    public C1.l f143d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f144e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f145f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ C1.l f146g;

    /* renamed from: h, reason: collision with root package name */
    public int f147h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(C1.l lVar, k1.d dVar) {
        super(dVar);
        this.f146g = lVar;
    }

    @Override // m1.AbstractC0931b
    public final java.lang.Object g(java.lang.Object obj) {
        this.f145f = obj;
        this.f147h |= Integer.MIN_VALUE;
        return this.f146g.a(null, this);
    }
}
