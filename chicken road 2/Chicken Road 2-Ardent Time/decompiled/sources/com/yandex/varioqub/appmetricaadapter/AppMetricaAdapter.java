package com.yandex.varioqub.appmetricaadapter;

/* loaded from: classes.dex */
public final class AppMetricaAdapter implements com.yandex.varioqub.analyticadapter.VarioqubConfigAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f2624a;

    /* renamed from: b, reason: collision with root package name */
    public final com.yandex.varioqub.appmetricaadapter.impl.d f2625b;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f2626c;

    /* renamed from: d, reason: collision with root package name */
    public java.util.Set f2627d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f2628e;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(int i2) {
            this();
        }
    }

    static {
        new com.yandex.varioqub.appmetricaadapter.AppMetricaAdapter.Companion(0);
    }

    public AppMetricaAdapter(android.content.Context context) {
        java.lang.Class<?> cls;
        com.yandex.varioqub.appmetricaadapter.impl.d iVar;
        this.f2624a = context;
        java.lang.Class<?> cls2 = null;
        try {
            cls = java.lang.Class.forName("io.appmetrica.analytics.AppMetrica", false, com.yandex.varioqub.appmetricaadapter.impl.j.class.getClassLoader());
        } catch (java.lang.Throwable unused) {
            cls = null;
        }
        if (cls != null) {
            iVar = new com.yandex.varioqub.appmetricaadapter.impl.c();
        } else {
            try {
                cls2 = java.lang.Class.forName("com.yandex.metrica.YandexMetrica", false, com.yandex.varioqub.appmetricaadapter.impl.j.class.getClassLoader());
            } catch (java.lang.Throwable unused2) {
            }
            iVar = cls2 != null ? new com.yandex.varioqub.appmetricaadapter.impl.i() : new com.yandex.varioqub.appmetricaadapter.impl.f();
        }
        this.f2625b = iVar;
        this.f2626c = "";
        this.f2627d = i1.C0201t.f3327a;
        this.f2628e = "AppMetricaAdapter";
    }

    @Override // com.yandex.varioqub.analyticadapter.VarioqubConfigAdapter
    public final java.lang.String getAdapterName() {
        return this.f2628e;
    }

    @Override // com.yandex.varioqub.analyticadapter.VarioqubConfigReporter
    public final void reportConfigChanged(com.yandex.varioqub.analyticadapter.data.ConfigData configData) {
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        linkedHashMap.put("old_config", configData.getOldConfigVersion());
        linkedHashMap.put("new_config", configData.getNewConfigVersion());
        linkedHashMap.put("timestamp", java.lang.Long.valueOf(configData.getConfigLoadTimestamp()));
        this.f2625b.b(linkedHashMap);
    }

    @Override // com.yandex.varioqub.analyticadapter.VarioqubConfigClientIdentifiersProvider
    public final void requestDeviceId(com.yandex.varioqub.analyticadapter.AdapterIdentifiersCallback adapterIdentifiersCallback) {
        this.f2625b.a(this.f2624a, adapterIdentifiersCallback);
    }

    @Override // com.yandex.varioqub.analyticadapter.VarioqubConfigClientIdentifiersProvider
    public final void requestUserId(com.yandex.varioqub.analyticadapter.AdapterIdentifiersCallback adapterIdentifiersCallback) {
        this.f2625b.c(this.f2624a, adapterIdentifiersCallback);
    }

    @Override // com.yandex.varioqub.analyticadapter.VarioqubConfigReporter
    public final void setExperiments(java.lang.String str) {
        this.f2626c = str;
        java.util.Objects.toString(this.f2627d);
        com.yandex.varioqub.appmetricaadapter.impl.k kVar = new com.yandex.varioqub.appmetricaadapter.impl.k();
        kVar.f2633o = this.f2626c;
        kVar.f2634p = i1.AbstractC0190i.Y(this.f2627d);
        this.f2625b.a(com.yandex.varioqub.protobuf.nano.MessageNano.toByteArray(kVar));
    }

    @Override // com.yandex.varioqub.analyticadapter.VarioqubConfigReporter
    public final void setTriggeredTestIds(java.util.Set set) {
        java.util.Objects.toString(set);
        java.util.Set b02 = i1.AbstractC0190i.b0(set);
        this.f2627d = b02;
        java.util.Objects.toString(b02);
        com.yandex.varioqub.appmetricaadapter.impl.k kVar = new com.yandex.varioqub.appmetricaadapter.impl.k();
        kVar.f2633o = this.f2626c;
        kVar.f2634p = i1.AbstractC0190i.Y(this.f2627d);
        this.f2625b.a(com.yandex.varioqub.protobuf.nano.MessageNano.toByteArray(kVar));
    }
}
