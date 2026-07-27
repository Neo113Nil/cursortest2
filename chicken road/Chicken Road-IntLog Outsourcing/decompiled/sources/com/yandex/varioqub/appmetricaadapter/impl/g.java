package com.yandex.varioqub.appmetricaadapter.impl;

import com.yandex.metrica.IIdentifierCallback;
import com.yandex.varioqub.analyticadapter.AdapterIdentifiersCallback;
import java.util.Map;

/* loaded from: classes.dex */
public final class g implements IIdentifierCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AdapterIdentifiersCallback f5365a;

    public g(AdapterIdentifiersCallback adapterIdentifiersCallback) {
        this.f5365a = adapterIdentifiersCallback;
    }

    public final void onReceive(Map map) {
        AdapterIdentifiersCallback adapterIdentifiersCallback = this.f5365a;
        String str = (String) map.get("yandex_mobile_metrica_device_id");
        if (str == null) {
            str = "";
        }
        adapterIdentifiersCallback.onSuccess(str);
    }

    public final void onRequestError(IIdentifierCallback.Reason reason) {
        this.f5365a.onError(reason.toString());
    }
}
