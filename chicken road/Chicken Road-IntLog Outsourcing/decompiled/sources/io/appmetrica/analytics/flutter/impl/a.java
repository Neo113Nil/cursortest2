package io.appmetrica.analytics.flutter.impl;

import io.appmetrica.analytics.StartupParamsCallback;
import io.appmetrica.analytics.flutter.impl.AppMetricaImpl;
import io.appmetrica.analytics.flutter.pigeon.Pigeon;
import java.util.Map;

/* loaded from: classes.dex */
public final /* synthetic */ class a implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6335a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Pigeon.Result f6336b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f6337c;

    public /* synthetic */ a(Pigeon.Result result, Object obj, int i2) {
        this.f6335a = i2;
        this.f6336b = result;
        this.f6337c = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f6335a) {
            case 0:
                AppMetricaImpl.AnonymousClass1.lambda$onDeeplinkLoaded$0(this.f6336b, (String) this.f6337c);
                break;
            case 1:
                AppMetricaImpl.AnonymousClass2.lambda$onParametersLoaded$0(this.f6336b, (Map) this.f6337c);
                break;
            default:
                AppMetricaImpl.AnonymousClass3.lambda$onReceive$0(this.f6336b, (StartupParamsCallback.Result) this.f6337c);
                break;
        }
    }
}
