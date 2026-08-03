package f1;

/* loaded from: classes.dex */
public final class z extends m1.AbstractC0931b {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f2904d;

    /* renamed from: e, reason: collision with root package name */
    public int f2905e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ F.C0020u f2906f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(F.C0020u c0020u, k1.d dVar) {
        super(dVar);
        this.f2906f = c0020u;
    }

    @Override // m1.AbstractC0931b
    public final java.lang.Object g(java.lang.Object obj) {
        this.f2904d = obj;
        this.f2905e |= Integer.MIN_VALUE;
        return this.f2906f.a(null, this);
    }
}
