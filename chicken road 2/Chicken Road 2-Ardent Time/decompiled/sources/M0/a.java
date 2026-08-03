package M0;

/* loaded from: classes.dex */
public final /* synthetic */ class a implements io.appmetrica.analytics.coreapi.internal.backport.FunctionWithThrowable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1017a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ io.appmetrica.analytics.location.impl.r f1018b;

    public /* synthetic */ a(io.appmetrica.analytics.location.impl.r rVar, int i2) {
        this.f1017a = i2;
        this.f1018b = rVar;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.backport.FunctionWithThrowable
    public final java.lang.Object apply(java.lang.Object obj) {
        switch (this.f1017a) {
            case 0:
                return io.appmetrica.analytics.location.impl.r.b(this.f1018b, (android.location.LocationManager) obj);
            default:
                return io.appmetrica.analytics.location.impl.r.a(this.f1018b, (android.location.LocationManager) obj);
        }
    }
}
