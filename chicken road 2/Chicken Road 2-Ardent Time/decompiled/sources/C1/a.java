package C1;

/* loaded from: classes.dex */
public final class a extends m1.AbstractC0931b {

    /* renamed from: d, reason: collision with root package name */
    public D1.n f111d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f112e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ C.j f113f;

    /* renamed from: g, reason: collision with root package name */
    public int f114g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(C.j jVar, k1.d dVar) {
        super(dVar);
        this.f113f = jVar;
    }

    @Override // m1.AbstractC0931b
    public final java.lang.Object g(java.lang.Object obj) {
        this.f112e = obj;
        this.f114g |= Integer.MIN_VALUE;
        return this.f113f.o(null, this);
    }
}
