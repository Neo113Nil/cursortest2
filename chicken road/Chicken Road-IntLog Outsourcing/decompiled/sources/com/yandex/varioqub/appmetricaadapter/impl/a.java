package com.yandex.varioqub.appmetricaadapter.impl;

import com.yandex.varioqub.analyticadapter.AdapterIdentifiersCallback;
import io.appmetrica.analytics.StartupParamsCallback;

/* loaded from: classes.dex */
public final class a implements StartupParamsCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AdapterIdentifiersCallback f5362a;

    public a(AdapterIdentifiersCallback adapterIdentifiersCallback) {
        this.f5362a = adapterIdentifiersCallback;
    }

    @Override // io.appmetrica.analytics.StartupParamsCallback
    public final void onReceive(StartupParamsCallback.Result result) {
        String str;
        AdapterIdentifiersCallback adapterIdentifiersCallback = this.f5362a;
        if (result == null || (str = result.deviceId) == null) {
            str = "";
        }
        adapterIdentifiersCallback.onSuccess(str);
    }

    @Override // io.appmetrica.analytics.StartupParamsCallback
    public final void onRequestError(StartupParamsCallback.Reason reason, StartupParamsCallback.Result result) {
        this.f5362a.onError(reason.value);
    }
}
