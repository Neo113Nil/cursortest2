package com.ironsource;

/* loaded from: classes5.dex */
public final class Tf {

    /* renamed from: a, reason: collision with root package name */
    public static final com.ironsource.Tf f5986a = new com.ironsource.Tf();

    private Tf() {
    }

    public final java.lang.String a(android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        return com.ironsource.E1.a(context, c(context));
    }

    public final java.lang.String b(android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        return com.ironsource.E1.b(context, c(context));
    }

    public final java.lang.String c(android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        return com.ironsource.E1.g(context);
    }

    public final java.util.concurrent.ConcurrentHashMap<java.lang.String, java.util.List<java.lang.String>> d() {
        java.util.concurrent.ConcurrentHashMap<java.lang.String, java.util.List<java.lang.String>> concurrentHashMap = new java.util.concurrent.ConcurrentHashMap<>();
        concurrentHashMap.putAll(com.ironsource.mediationsdk.c.b().d());
        concurrentHashMap.putAll(com.ironsource.C3150la.b().c());
        return concurrentHashMap;
    }

    public final void e() {
        com.ironsource.mediationsdk.p.h().H();
    }

    public final org.json.JSONObject a(boolean z) {
        org.json.JSONObject b = com.ironsource.mediationsdk.utils.IronSourceUtils.b(z);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(b, "getMediationAdditionalData(isDemandOnlyMode)");
        return b;
    }

    public final org.json.JSONObject b() {
        org.json.JSONObject b = com.ironsource.J6.a().b();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(b, "getProperties().toJSON()");
        return b;
    }

    public final org.json.JSONObject c() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            java.util.concurrent.ConcurrentHashMap<java.lang.String, com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBaseWrapper> networkAdaptersMap = com.ironsource.mediationsdk.c.b().e();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(networkAdaptersMap, "networkAdaptersMap");
            for (java.util.Map.Entry<java.lang.String, com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBaseWrapper> entry : networkAdaptersMap.entrySet()) {
                if (entry.getValue().getAdapterBaseInterface() != null) {
                    com.ironsource.Tf tf = f5986a;
                    java.lang.String key = entry.getKey();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(key, "entry.key");
                    java.lang.String a2 = tf.a(key);
                    com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBaseInterface adapterBaseInterface = entry.getValue().getAdapterBaseInterface();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(adapterBaseInterface, "entry.value.adapterBaseInterface");
                    java.lang.String adapterVersion = adapterBaseInterface.getAdapterVersion();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(adapterVersion, "adapterBaseInterface.adapterVersion");
                    jSONObject.putOpt(a2, tf.a(adapterVersion, adapterBaseInterface.getNetworkSDKVersion()));
                }
            }
        } catch (java.lang.Exception e) {
            com.ironsource.C3180n4.d().a(e);
        }
        return jSONObject;
    }

    public final void a(com.ironsource.InterfaceC3026eb interfaceC3026eb) {
        com.ironsource.C2987c8.a().b(interfaceC3026eb);
    }

    public final com.unity3d.mediation.LevelPlayAdSize b(java.lang.String str, int i, int i2) {
        if (str != null && str.length() != 0 && !kotlin.jvm.internal.Intrinsics.areEqual(str, com.ironsource.mediationsdk.j.f)) {
            if (kotlin.jvm.internal.Intrinsics.areEqual(str, com.ironsource.mediationsdk.j.c)) {
                return com.unity3d.mediation.LevelPlayAdSize.MEDIUM_RECTANGLE;
            }
            return com.unity3d.mediation.LevelPlayAdSize.Companion.createAdSize$mediationsdk_release(str);
        }
        return com.unity3d.mediation.LevelPlayAdSize.Companion.createCustomSize(i, i2);
    }

    public final void a(com.ironsource.InterfaceC3241qb interfaceC3241qb) {
        com.ironsource.Md.a().b(interfaceC3241qb);
    }

    public final void a(com.ironsource.Aa aa) {
        com.ironsource.C3357x2.a().b(aa);
    }

    public final int a() {
        return com.ironsource.Jb.u.d().a().c();
    }

    public final java.lang.String a(com.ironsource.C3064gd c3064gd) {
        java.lang.String c;
        return (c3064gd == null || (c = c3064gd.c()) == null) ? new java.lang.String() : c;
    }

    public final java.lang.String a(com.ironsource.mediationsdk.model.NetworkSettings networkSettings) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(networkSettings, "networkSettings");
        java.lang.String providerDefaultInstance = networkSettings.getProviderDefaultInstance();
        return providerDefaultInstance == null ? new java.lang.String() : providerDefaultInstance;
    }

    public final boolean a(com.ironsource.mediationsdk.model.NetworkSettings networkSettings, com.ironsource.mediationsdk.IronSource.a adUnit) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(networkSettings, "networkSettings");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adUnit, "adUnit");
        return networkSettings.isBidder(adUnit);
    }

    public final com.ironsource.mediationsdk.ISBannerSize a(java.lang.String str, int i, int i2) {
        return new com.ironsource.mediationsdk.ISBannerSize(str, i, i2);
    }

    public final com.ironsource.mediationsdk.o a(android.app.Activity activity, com.ironsource.mediationsdk.ISBannerSize size) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activity, "activity");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(size, "size");
        com.ironsource.mediationsdk.o b = com.ironsource.mediationsdk.p.h().b(activity, size);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(b, "getInstance().createBanner(activity, size)");
        return b;
    }

    public final void a(com.ironsource.EnumC3378y5 event, org.json.JSONObject data) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(event, "event");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "data");
        com.ironsource.C3065ge.i().a(new com.ironsource.C3360x5(event, data));
    }

    private final org.json.JSONObject a(java.lang.String str, java.lang.String str2) {
        return new org.json.JSONObject(kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(com.ironsource.Mf.b, str), kotlin.TuplesKt.to("sdkVersion", str2)));
    }

    public final void b(java.lang.String message) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "message");
        com.ironsource.mediationsdk.logger.IronLog.INTERNAL.error(message);
    }

    public final java.lang.String a(java.lang.String key) {
        java.lang.String str;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "key");
        try {
            if (!kotlin.text.StringsKt.contains$default((java.lang.CharSequence) key, (java.lang.CharSequence) "-", false, 2, (java.lang.Object) null)) {
                if (!kotlin.text.StringsKt.contains$default((java.lang.CharSequence) key, (java.lang.CharSequence) "_", false, 2, (java.lang.Object) null)) {
                    return key;
                }
                str = (java.lang.String) kotlin.collections.CollectionsKt.first(kotlin.text.StringsKt.split$default((java.lang.CharSequence) key, new java.lang.String[]{"_"}, false, 0, 6, (java.lang.Object) null));
            } else {
                java.lang.String str2 = (java.lang.String) kotlin.collections.CollectionsKt.last(kotlin.text.StringsKt.split$default((java.lang.CharSequence) key, new java.lang.String[]{"-"}, false, 0, 6, (java.lang.Object) null));
                if (!kotlin.text.StringsKt.contains$default((java.lang.CharSequence) str2, (java.lang.CharSequence) "_", false, 2, (java.lang.Object) null)) {
                    return str2;
                }
                str = (java.lang.String) kotlin.collections.CollectionsKt.first(kotlin.text.StringsKt.split$default((java.lang.CharSequence) str2, new java.lang.String[]{"_"}, false, 0, 6, (java.lang.Object) null));
            }
            return str;
        } catch (java.lang.Exception e) {
            com.ironsource.C3180n4.d().a(e);
            com.ironsource.mediationsdk.logger.IronLog.INTERNAL.error(e.getMessage());
            return key;
        }
    }
}
