package f1;

/* loaded from: classes.dex */
public final class q extends m1.AbstractC0931b {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f2866d;

    /* renamed from: e, reason: collision with root package name */
    public int f2867e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ C1.l f2868f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(C1.l lVar, k1.d dVar) {
        super(dVar);
        this.f2868f = lVar;
    }

    @Override // m1.AbstractC0931b
    public final java.lang.Object g(java.lang.Object obj) {
        this.f2866d = obj;
        this.f2867e |= Integer.MIN_VALUE;
        return this.f2868f.a(null, this);
    }
}
