package P1;

/* loaded from: classes.dex */
public final class l extends L1.a {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ P1.r f1493e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f1494f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f1495g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(java.lang.String str, P1.r rVar, int i2, int i3) {
        super(str, true);
        this.f1493e = rVar;
        this.f1494f = i2;
        this.f1495g = i3;
    }

    @Override // L1.a
    public final long a() {
        int i2 = this.f1494f;
        int i3 = this.f1495g;
        P1.r rVar = this.f1493e;
        rVar.getClass();
        try {
            rVar.f1533w.l(i2, i3, true);
            return -1L;
        } catch (java.io.IOException e2) {
            rVar.b(e2);
            return -1L;
        }
    }
}
