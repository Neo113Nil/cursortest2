package io.appmetrica.analytics.flutter.impl;

/* loaded from: classes.dex */
public final /* synthetic */ class a implements java.lang.Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3832a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ io.appmetrica.analytics.flutter.pigeon.Pigeon.Result f3833b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f3834c;

    public /* synthetic */ a(io.appmetrica.analytics.flutter.pigeon.Pigeon.Result result, java.lang.Object obj, int i2) {
        this.f3832a = i2;
        this.f3833b = result;
        this.f3834c = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f3832a) {
            case 0:
                io.appmetrica.analytics.flutter.impl.AppMetricaImpl.AnonymousClass1.lambda$onDeeplinkLoaded$0(this.f3833b, (java.lang.String) this.f3834c);
                break;
            case 1:
                io.appmetrica.analytics.flutter.impl.AppMetricaImpl.AnonymousClass2.lambda$onParametersLoaded$0(this.f3833b, (java.util.Map) this.f3834c);
                break;
            default:
                io.appmetrica.analytics.flutter.impl.AppMetricaImpl.AnonymousClass3.lambda$onReceive$0(this.f3833b, (io.appmetrica.analytics.StartupParamsCallback.Result) this.f3834c);
                break;
        }
    }
}
