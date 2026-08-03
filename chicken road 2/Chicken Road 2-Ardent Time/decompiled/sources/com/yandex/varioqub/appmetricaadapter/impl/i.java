package com.yandex.varioqub.appmetricaadapter.impl;

/* loaded from: classes.dex */
public final class i implements com.yandex.varioqub.appmetricaadapter.impl.d {
    @Override // com.yandex.varioqub.appmetricaadapter.impl.d
    public final void a(android.content.Context context, com.yandex.varioqub.analyticadapter.AdapterIdentifiersCallback adapterIdentifiersCallback) {
        com.yandex.metrica.p.a(context, new com.yandex.varioqub.appmetricaadapter.impl.g(adapterIdentifiersCallback), new java.lang.String[]{"yandex_mobile_metrica_device_id"});
    }

    @Override // com.yandex.varioqub.appmetricaadapter.impl.d
    public final void b(java.util.LinkedHashMap linkedHashMap) {
        com.yandex.metrica.YandexMetrica.reportEvent("com.yandex.varioqub.activate_config", linkedHashMap);
    }

    @Override // com.yandex.varioqub.appmetricaadapter.impl.d
    public final void c(android.content.Context context, com.yandex.varioqub.analyticadapter.AdapterIdentifiersCallback adapterIdentifiersCallback) {
        com.yandex.metrica.p.a(context, new com.yandex.varioqub.appmetricaadapter.impl.h(adapterIdentifiersCallback), new java.lang.String[]{"yandex_mobile_metrica_uuid"});
    }

    @Override // com.yandex.varioqub.appmetricaadapter.impl.d
    public final void a(byte[] bArr) {
        com.yandex.metrica.ModulesFacade.setSessionExtra("varioqub", bArr);
    }
}
