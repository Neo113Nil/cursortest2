package v;

/* loaded from: classes.dex */
public final class c implements java.util.concurrent.Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8362a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f8363b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f8364c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ I1.u f8365d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f8366e;

    public /* synthetic */ c(java.lang.String str, android.content.Context context, I1.u uVar, int i2, int i3) {
        this.f8362a = i3;
        this.f8363b = str;
        this.f8364c = context;
        this.f8365d = uVar;
        this.f8366e = i2;
    }

    @Override // java.util.concurrent.Callable
    public final java.lang.Object call() {
        switch (this.f8362a) {
            case 0:
                return v.f.a(this.f8363b, this.f8364c, this.f8365d, this.f8366e);
            default:
                try {
                    return v.f.a(this.f8363b, this.f8364c, this.f8365d, this.f8366e);
                } catch (java.lang.Throwable unused) {
                    return new v.e(-3);
                }
        }
    }
}
