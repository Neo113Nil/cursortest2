package io.appmetrica.analytics.flutter.impl;

/* loaded from: classes.dex */
public final /* synthetic */ class b implements java.lang.Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3835a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ io.appmetrica.analytics.flutter.pigeon.Pigeon.Result f3836b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f3837c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f3838d;

    public /* synthetic */ b(io.appmetrica.analytics.flutter.pigeon.Pigeon.Result result, java.lang.Object obj, java.lang.Object obj2, int i2) {
        this.f3835a = i2;
        this.f3836b = result;
        this.f3838d = obj;
        this.f3837c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f3835a) {
            case 0:
                io.appmetrica.analytics.flutter.impl.AppMetricaImpl.AnonymousClass1.lambda$onError$1(this.f3836b, (io.appmetrica.analytics.DeferredDeeplinkListener.Error) this.f3838d, (java.lang.String) this.f3837c);
                break;
            case 1:
                io.appmetrica.analytics.flutter.impl.AppMetricaImpl.AnonymousClass2.lambda$onError$1(this.f3836b, (io.appmetrica.analytics.DeferredDeeplinkParametersListener.Error) this.f3838d, (java.lang.String) this.f3837c);
                break;
            default:
                io.appmetrica.analytics.flutter.impl.AppMetricaImpl.AnonymousClass3.lambda$onRequestError$1(this.f3836b, (io.appmetrica.analytics.StartupParamsCallback.Result) this.f3838d, (io.appmetrica.analytics.StartupParamsCallback.Reason) this.f3837c);
                break;
        }
    }
}
