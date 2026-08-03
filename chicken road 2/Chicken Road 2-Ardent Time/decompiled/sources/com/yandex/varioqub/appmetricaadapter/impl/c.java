package com.yandex.varioqub.appmetricaadapter.impl;

/* loaded from: classes.dex */
public final class c implements com.yandex.varioqub.appmetricaadapter.impl.d {
    @Override // com.yandex.varioqub.appmetricaadapter.impl.d
    public final void a(android.content.Context context, com.yandex.varioqub.analyticadapter.AdapterIdentifiersCallback adapterIdentifiersCallback) {
        io.appmetrica.analytics.AppMetrica.requestStartupParams(context, new com.yandex.varioqub.appmetricaadapter.impl.a(adapterIdentifiersCallback), u0.AbstractC0995a.q(io.appmetrica.analytics.StartupParamsCallback.APPMETRICA_DEVICE_ID));
    }

    @Override // com.yandex.varioqub.appmetricaadapter.impl.d
    public final void b(java.util.LinkedHashMap linkedHashMap) {
        io.appmetrica.analytics.AppMetrica.reportEvent("com.yandex.varioqub.activate_config", linkedHashMap);
    }

    @Override // com.yandex.varioqub.appmetricaadapter.impl.d
    public final void c(android.content.Context context, com.yandex.varioqub.analyticadapter.AdapterIdentifiersCallback adapterIdentifiersCallback) {
        io.appmetrica.analytics.AppMetrica.requestStartupParams(context, new com.yandex.varioqub.appmetricaadapter.impl.b(adapterIdentifiersCallback), u0.AbstractC0995a.q(io.appmetrica.analytics.StartupParamsCallback.APPMETRICA_UUID));
    }

    @Override // com.yandex.varioqub.appmetricaadapter.impl.d
    public final void a(byte[] bArr) {
        io.appmetrica.analytics.ModulesFacade.setSessionExtra("varioqub", bArr);
    }
}
