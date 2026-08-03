package com.yandex.varioqub.appmetricaadapter.impl;

/* loaded from: classes.dex */
public final class a implements io.appmetrica.analytics.StartupParamsCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.yandex.varioqub.analyticadapter.AdapterIdentifiersCallback f2629a;

    public a(com.yandex.varioqub.analyticadapter.AdapterIdentifiersCallback adapterIdentifiersCallback) {
        this.f2629a = adapterIdentifiersCallback;
    }

    @Override // io.appmetrica.analytics.StartupParamsCallback
    public final void onReceive(io.appmetrica.analytics.StartupParamsCallback.Result result) {
        java.lang.String str;
        if (result == null || (str = result.deviceId) == null) {
            str = "";
        }
        this.f2629a.onSuccess(str);
    }

    @Override // io.appmetrica.analytics.StartupParamsCallback
    public final void onRequestError(io.appmetrica.analytics.StartupParamsCallback.Reason reason, io.appmetrica.analytics.StartupParamsCallback.Result result) {
        this.f2629a.onError(reason.value);
    }
}
