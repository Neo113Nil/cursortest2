package io.appmetrica.analytics.flutter.impl;

import io.appmetrica.analytics.DeferredDeeplinkListener;
import io.appmetrica.analytics.DeferredDeeplinkParametersListener;
import io.appmetrica.analytics.StartupParamsCallback;
import io.appmetrica.analytics.flutter.impl.AppMetricaImpl;
import io.appmetrica.analytics.flutter.pigeon.Pigeon;

/* loaded from: classes.dex */
public final /* synthetic */ class b implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5517a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Pigeon.Result f5518b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f5519c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f5520d;

    public /* synthetic */ b(Pigeon.Result result, Object obj, Object obj2, int i3) {
        this.f5517a = i3;
        this.f5518b = result;
        this.f5520d = obj;
        this.f5519c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f5517a) {
            case 0:
                AppMetricaImpl.AnonymousClass1.lambda$onError$1(this.f5518b, (DeferredDeeplinkListener.Error) this.f5520d, (String) this.f5519c);
                break;
            case 1:
                AppMetricaImpl.AnonymousClass2.lambda$onError$1(this.f5518b, (DeferredDeeplinkParametersListener.Error) this.f5520d, (String) this.f5519c);
                break;
            default:
                AppMetricaImpl.AnonymousClass3.lambda$onRequestError$1(this.f5518b, (StartupParamsCallback.Result) this.f5520d, (StartupParamsCallback.Reason) this.f5519c);
                break;
        }
    }
}
