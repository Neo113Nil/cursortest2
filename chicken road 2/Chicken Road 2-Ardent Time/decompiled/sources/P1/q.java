package P1;

/* loaded from: classes.dex */
public final class q extends L1.a {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ P1.r f1508e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f1509f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f1510g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(java.lang.String str, P1.r rVar, int i2, long j2) {
        super(str, true);
        this.f1508e = rVar;
        this.f1509f = i2;
        this.f1510g = j2;
    }

    @Override // L1.a
    public final long a() {
        P1.r rVar = this.f1508e;
        try {
            rVar.f1533w.n(this.f1509f, this.f1510g);
            return -1L;
        } catch (java.io.IOException e2) {
            rVar.b(e2);
            return -1L;
        }
    }
}
