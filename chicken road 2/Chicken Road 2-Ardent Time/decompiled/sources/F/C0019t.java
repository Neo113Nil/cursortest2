package F;

/* renamed from: F.t, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0019t extends m1.AbstractC0931b {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f515d;

    /* renamed from: e, reason: collision with root package name */
    public int f516e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ F.C0020u f517f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0019t(F.C0020u c0020u, k1.d dVar) {
        super(dVar);
        this.f517f = c0020u;
    }

    @Override // m1.AbstractC0931b
    public final java.lang.Object g(java.lang.Object obj) {
        this.f515d = obj;
        this.f516e |= Integer.MIN_VALUE;
        return this.f517f.a(null, this);
    }
}
