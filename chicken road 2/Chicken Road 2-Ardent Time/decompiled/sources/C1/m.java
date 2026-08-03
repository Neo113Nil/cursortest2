package C1;

/* loaded from: classes.dex */
public final class m extends m1.AbstractC0931b {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f152d;

    /* renamed from: e, reason: collision with root package name */
    public int f153e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ x0.e f154f;

    /* renamed from: g, reason: collision with root package name */
    public f1.C0127n f155g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(x0.e eVar, k1.d dVar) {
        super(dVar);
        this.f154f = eVar;
    }

    @Override // m1.AbstractC0931b
    public final java.lang.Object g(java.lang.Object obj) {
        this.f152d = obj;
        this.f153e |= Integer.MIN_VALUE;
        return this.f154f.o(null, this);
    }
}
