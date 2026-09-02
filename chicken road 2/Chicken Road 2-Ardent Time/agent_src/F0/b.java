package F0;

/* loaded from: classes.dex */
public final /* synthetic */ class b implements java.lang.Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f544a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f545b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f546c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f547d;

    public /* synthetic */ b(io.appmetrica.analytics.impl.L0 l02, io.appmetrica.analytics.plugins.PluginErrorDetails pluginErrorDetails, java.lang.String str) {
        this.f544a = 2;
        this.f545b = l02;
        this.f547d = pluginErrorDetails;
        this.f546c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f544a) {
            case 0:
                com.yandex.varioqub.config.impl.B.a((com.yandex.varioqub.config.impl.B) this.f545b, (java.lang.String) this.f546c, (java.lang.String) this.f547d);
                break;
            case 1:
                io.appmetrica.analytics.idsync.impl.n.a((io.appmetrica.analytics.idsync.impl.D) this.f545b, (io.appmetrica.analytics.idsync.impl.n) this.f546c, (io.appmetrica.analytics.idsync.internal.model.RequestConfig) this.f547d);
                break;
            case 2:
                io.appmetrica.analytics.impl.L0.a((io.appmetrica.analytics.impl.L0) this.f545b, (io.appmetrica.analytics.plugins.PluginErrorDetails) this.f547d, (java.lang.String) this.f546c);
                break;
            case 3:
                io.appmetrica.analytics.impl.C0240b0.a((io.appmetrica.analytics.impl.C0240b0) this.f545b, (android.content.Context) this.f546c, (io.appmetrica.analytics.AppMetricaLibraryAdapterConfig) this.f547d);
                break;
            default:
                ((io.appmetrica.analytics.impl.C0706t1) this.f545b).b((android.content.Context) this.f546c, (io.appmetrica.analytics.AppMetricaConfig) this.f547d);
                break;
        }
    }

    public /* synthetic */ b(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, int i2) {
        this.f544a = i2;
        this.f545b = obj;
        this.f546c = obj2;
        this.f547d = obj3;
    }
}
