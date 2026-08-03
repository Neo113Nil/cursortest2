package P1;

/* loaded from: classes.dex */
public final class p extends L1.a {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ P1.r f1505e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f1506f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ P1.EnumC0054b f1507g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(java.lang.String str, P1.r rVar, int i2, P1.EnumC0054b enumC0054b) {
        super(str, true);
        this.f1505e = rVar;
        this.f1506f = i2;
        this.f1507g = enumC0054b;
    }

    @Override // L1.a
    public final long a() {
        P1.r rVar = this.f1505e;
        try {
            rVar.f1533w.m(this.f1506f, this.f1507g);
            return -1L;
        } catch (java.io.IOException e2) {
            rVar.b(e2);
            return -1L;
        }
    }
}
