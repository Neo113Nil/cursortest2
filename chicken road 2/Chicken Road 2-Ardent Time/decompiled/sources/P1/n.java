package P1;

/* loaded from: classes.dex */
public final class n extends L1.a {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ P1.r f1498e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f1499f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ V1.g f1500g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f1501h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(java.lang.String str, P1.r rVar, int i2, V1.g gVar, int i3, boolean z2) {
        super(str, true);
        this.f1498e = rVar;
        this.f1499f = i2;
        this.f1500g = gVar;
        this.f1501h = i3;
    }

    @Override // L1.a
    public final long a() {
        try {
            P1.D d2 = this.f1498e.f1522k;
            V1.g gVar = this.f1500g;
            int i2 = this.f1501h;
            d2.getClass();
            gVar.o(i2);
            this.f1498e.f1533w.m(this.f1499f, P1.EnumC0054b.CANCEL);
            synchronized (this.f1498e) {
                this.f1498e.f1535y.remove(java.lang.Integer.valueOf(this.f1499f));
            }
            return -1L;
        } catch (java.io.IOException unused) {
            return -1L;
        }
    }
}
