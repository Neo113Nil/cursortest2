package C1;

/* loaded from: classes.dex */
public final class h extends m1.AbstractC0931b {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f130d;

    /* renamed from: e, reason: collision with root package name */
    public int f131e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ C1.i f132f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.Object f133g;

    /* renamed from: h, reason: collision with root package name */
    public C1.e f134h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(C1.i iVar, k1.d dVar) {
        super(dVar);
        this.f132f = iVar;
    }

    @Override // m1.AbstractC0931b
    public final java.lang.Object g(java.lang.Object obj) {
        this.f130d = obj;
        this.f131e |= Integer.MIN_VALUE;
        return this.f132f.o(null, this);
    }
}
