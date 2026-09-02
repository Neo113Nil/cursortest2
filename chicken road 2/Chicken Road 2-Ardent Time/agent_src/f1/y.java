package f1;

/* loaded from: classes.dex */
public final class y extends m1.AbstractC0931b {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f2901d;

    /* renamed from: e, reason: collision with root package name */
    public int f2902e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ f1.C0127n f2903f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(f1.C0127n c0127n, k1.d dVar) {
        super(dVar);
        this.f2903f = c0127n;
    }

    @Override // m1.AbstractC0931b
    public final java.lang.Object g(java.lang.Object obj) {
        this.f2901d = obj;
        this.f2902e |= Integer.MIN_VALUE;
        return this.f2903f.a(null, this);
    }
}
