package io.appmetrica.analytics.flutter.impl;

import io.appmetrica.analytics.StartupParamsCallback;
import io.appmetrica.analytics.flutter.impl.AppMetricaImpl;
import io.appmetrica.analytics.flutter.pigeon.Pigeon;
import java.util.Map;

/* loaded from: classes.dex */
public final /* synthetic */ class a implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5514a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Pigeon.Result f5515b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f5516c;

    public /* synthetic */ a(Pigeon.Result result, Object obj, int i3) {
        this.f5514a = i3;
        this.f5515b = result;
        this.f5516c = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f5514a) {
            case 0:
                AppMetricaImpl.AnonymousClass1.lambda$onDeeplinkLoaded$0(this.f5515b, (String) this.f5516c);
                break;
            case 1:
                AppMetricaImpl.AnonymousClass2.lambda$onParametersLoaded$0(this.f5515b, (Map) this.f5516c);
                break;
            default:
                AppMetricaImpl.AnonymousClass3.lambda$onReceive$0(this.f5515b, (StartupParamsCallback.Result) this.f5516c);
                break;
        }
    }
}
