package f1;

/* loaded from: classes.dex */
public final class s extends m1.AbstractC0931b {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f2874d;

    /* renamed from: e, reason: collision with root package name */
    public int f2875e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ f1.C0127n f2876f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(f1.C0127n c0127n, k1.d dVar) {
        super(dVar);
        this.f2876f = c0127n;
    }

    @Override // m1.AbstractC0931b
    public final java.lang.Object g(java.lang.Object obj) {
        this.f2874d = obj;
        this.f2875e |= Integer.MIN_VALUE;
        return this.f2876f.a(null, this);
    }
}
