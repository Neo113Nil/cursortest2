package F0;

/* loaded from: classes.dex */
public final /* synthetic */ class c implements java.lang.Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f548a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f549b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f550c;

    public /* synthetic */ c(int i2, java.lang.Object obj, java.lang.Object obj2) {
        this.f548a = i2;
        this.f549b = obj;
        this.f550c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f548a) {
            case 0:
                com.yandex.varioqub.config.impl.B.a((com.yandex.varioqub.config.impl.B) this.f549b, (com.yandex.varioqub.config.OnFetchCompleteListener) this.f550c);
                break;
            case 1:
                io.appmetrica.analytics.billing.impl.j.a((io.appmetrica.analytics.billing.impl.j) this.f549b, (io.appmetrica.analytics.billinginterface.internal.ProductInfo) this.f550c);
                break;
            case 2:
                io.appmetrica.analytics.idsync.impl.n.a((io.appmetrica.analytics.idsync.impl.n) this.f549b, (io.appmetrica.analytics.idsync.internal.model.RequestConfig) this.f550c);
                break;
            case 3:
                ((androidx.profileinstaller.ProfileInstallerInitializer) this.f549b).getClass();
                (android.os.Build.VERSION.SDK_INT >= 28 ? N.i.a(android.os.Looper.getMainLooper()) : new android.os.Handler(android.os.Looper.getMainLooper())).postDelayed(new N.f((android.content.Context) this.f550c, 0), new java.util.Random().nextInt(java.lang.Math.max(io.appmetrica.analytics.AppMetricaDefaultValues.DEFAULT_MAX_REPORTS_IN_DATABASE_COUNT, 1)) + 5000);
                break;
            case 4:
                io.appmetrica.analytics.impl.Db.a((io.appmetrica.analytics.impl.Db) this.f549b, (io.appmetrica.analytics.impl.V) this.f550c);
                break;
            case 5:
                io.appmetrica.analytics.impl.L0.a((io.appmetrica.analytics.impl.L0) this.f549b, (io.appmetrica.analytics.plugins.PluginErrorDetails) this.f550c);
                break;
            case 6:
                io.appmetrica.analytics.impl.C0279cd.a((io.appmetrica.analytics.impl.C0279cd) this.f549b, (java.util.ArrayList) this.f550c);
                break;
            case 7:
                io.appmetrica.analytics.impl.C0411hg.a((io.appmetrica.analytics.impl.C0436ig) this.f549b, (io.appmetrica.analytics.impl.InterfaceC0695sg) this.f550c);
                break;
            case 8:
                io.appmetrica.analytics.impl.C0436ig.b((io.appmetrica.analytics.impl.InterfaceC0695sg) this.f549b, (java.lang.Throwable) this.f550c);
                break;
            default:
                ((P1.B) this.f549b).b((android.graphics.Typeface) this.f550c);
                break;
        }
    }
}
