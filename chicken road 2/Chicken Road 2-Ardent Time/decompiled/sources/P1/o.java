package P1;

/* loaded from: classes.dex */
public final class o extends L1.a {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f1502e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ P1.r f1503f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f1504g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o(java.lang.String str, P1.r rVar, int i2, java.lang.Object obj, int i3) {
        super(str, true);
        this.f1502e = i3;
        this.f1503f = rVar;
        this.f1504g = i2;
    }

    @Override // L1.a
    public final long a() {
        switch (this.f1502e) {
            case 0:
                this.f1503f.f1522k.getClass();
                try {
                    this.f1503f.f1533w.m(this.f1504g, P1.EnumC0054b.CANCEL);
                    synchronized (this.f1503f) {
                        this.f1503f.f1535y.remove(java.lang.Integer.valueOf(this.f1504g));
                    }
                    return -1L;
                } catch (java.io.IOException unused) {
                    return -1L;
                }
            case 1:
                this.f1503f.f1522k.getClass();
                try {
                    this.f1503f.f1533w.m(this.f1504g, P1.EnumC0054b.CANCEL);
                    synchronized (this.f1503f) {
                        this.f1503f.f1535y.remove(java.lang.Integer.valueOf(this.f1504g));
                    }
                    return -1L;
                } catch (java.io.IOException unused2) {
                    return -1L;
                }
            default:
                this.f1503f.f1522k.getClass();
                synchronized (this.f1503f) {
                    this.f1503f.f1535y.remove(java.lang.Integer.valueOf(this.f1504g));
                }
                return -1L;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(java.lang.String str, P1.r rVar, int i2, java.util.List list, boolean z2) {
        super(str, true);
        this.f1502e = 0;
        this.f1503f = rVar;
        this.f1504g = i2;
    }
}
