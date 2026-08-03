package com.yandex.varioqub.appmetricaadapter.impl;

/* loaded from: classes.dex */
public final class b implements io.appmetrica.analytics.StartupParamsCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.yandex.varioqub.analyticadapter.AdapterIdentifiersCallback f2630a;

    public b(com.yandex.varioqub.analyticadapter.AdapterIdentifiersCallback adapterIdentifiersCallback) {
        this.f2630a = adapterIdentifiersCallback;
    }

    @Override // io.appmetrica.analytics.StartupParamsCallback
    public final void onReceive(io.appmetrica.analytics.StartupParamsCallback.Result result) {
        java.lang.String str;
        if (result == null || (str = result.uuid) == null) {
            str = "";
        }
        this.f2630a.onSuccess(str);
    }

    @Override // io.appmetrica.analytics.StartupParamsCallback
    public final void onRequestError(io.appmetrica.analytics.StartupParamsCallback.Reason reason, io.appmetrica.analytics.StartupParamsCallback.Result result) {
        this.f2630a.onError(reason.value);
    }
}
