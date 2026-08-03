package com.inmobi.media;

/* loaded from: classes5.dex */
public abstract class Hc {

    /* renamed from: a, reason: collision with root package name */
    public static final java.util.concurrent.atomic.AtomicBoolean f4743a = new java.util.concurrent.atomic.AtomicBoolean(false);
    public static final com.inmobi.media.core.config.models.SignalsConfig b;
    public static final java.lang.String c;
    public static final kotlin.Lazy d;
    public static final kotlin.Lazy e;
    public static java.lang.Boolean f;
    public static final kotlin.jvm.functions.Function2 g;

    static {
        com.inmobi.media.C2580m4 c2580m4 = com.inmobi.media.AbstractC2318c4.f5134a;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(com.inmobi.media.core.config.models.SignalsConfig.class, "clazz");
        com.inmobi.media.core.config.models.SignalsConfig signalsConfig = (com.inmobi.media.core.config.models.SignalsConfig) com.inmobi.media.AbstractC2318c4.f5134a.a(com.inmobi.media.core.config.models.SignalsConfig.class);
        b = signalsConfig;
        java.lang.String topic = signalsConfig.getPublisher().getAuto().getTopic();
        if (topic.length() == 0) {
            topic = com.moloco.sdk.internal.ilrd.provider.a.k;
        }
        c = topic;
        d = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0() { // from class: com.inmobi.media.Hc$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return com.inmobi.media.Hc.d();
            }
        });
        e = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0() { // from class: com.inmobi.media.Hc$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return java.lang.Boolean.valueOf(com.inmobi.media.Hc.b());
            }
        });
        g = new kotlin.jvm.functions.Function2() { // from class: com.inmobi.media.Hc$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return com.inmobi.media.Hc.a((android.os.Bundle) obj, (java.lang.String) obj2);
            }
        };
    }

    public static final kotlin.Unit a(android.os.Bundle bundle, java.lang.String topic) {
        java.util.LinkedHashMap a2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(topic, "topic");
        if (bundle != null) {
            try {
                if (kotlin.jvm.internal.Intrinsics.areEqual(topic, c) && (a2 = a(bundle)) != null) {
                    com.inmobi.media.Xg.f5049a.getClass();
                    com.inmobi.media.Xg.a(a2);
                    java.util.Objects.toString(a2);
                }
            } catch (java.lang.Throwable unused) {
            }
        }
        return kotlin.Unit.INSTANCE;
    }

    public static final boolean b() {
        try {
            java.lang.Class<?> cls = java.lang.Class.forName("com.applovin.communicator.AppLovinCommunicator");
            if (kotlin.jvm.internal.Intrinsics.areEqual(cls.getMethod(com.unity3d.services.core.fid.Constants.GET_INSTANCE, new java.lang.Class[0]).getReturnType(), cls) && kotlin.jvm.internal.Intrinsics.areEqual(com.applovin.communicator.AppLovinCommunicatorSubscriber.class.getMethod("onMessageReceived", java.lang.Class.forName("com.applovin.communicator.AppLovinCommunicatorMessage")).getReturnType(), java.lang.Void.TYPE)) {
                return kotlin.jvm.internal.Intrinsics.areEqual(com.applovin.communicator.AppLovinCommunicatorEntity.class.getMethod("getCommunicatorId", new java.lang.Class[0]).getReturnType(), java.lang.String.class);
            }
            return false;
        } catch (java.lang.Error | java.lang.Exception unused) {
            return false;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0023, code lost:
    
        if (r2 == null) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean c() {
        java.lang.String str;
        java.lang.Boolean bool = f;
        if (bool != null) {
            return bool.booleanValue();
        }
        try {
            java.lang.Object obj = java.lang.Class.forName("com.applovin.sdk.AppLovinSdk").getField("VERSION").get(null);
            str = obj instanceof java.lang.String ? (java.lang.String) obj : null;
        } catch (java.lang.Throwable unused) {
        }
        str = com.ironsource.C2945a2.f;
        java.util.List<java.lang.String> incompatibleSdkVer = b.getPublisher().getAuto().getIncompatibleSdkVer();
        java.util.Objects.toString(incompatibleSdkVer);
        boolean z = kotlin.jvm.internal.Intrinsics.areEqual(str, com.ironsource.C2945a2.f) || incompatibleSdkVer.contains(str);
        f = java.lang.Boolean.valueOf(z);
        return z;
    }

    public static final com.inmobi.signals.adinfo.SignalCollector d() {
        return new com.inmobi.signals.adinfo.SignalCollector(kotlin.collections.CollectionsKt.listOf(c));
    }

    public static void a() {
        if (b.getPublisher().getAuto().getEnabled() && !c() && ((java.lang.Boolean) e.getValue()).booleanValue() && c.length() != 0 && f4743a.compareAndSet(false, true)) {
            ((com.inmobi.signals.adinfo.SignalCollector) d.getValue()).setupAppLovinCommunicator(g);
        }
    }

    public static java.util.LinkedHashMap a(android.os.Bundle data) {
        boolean z;
        java.lang.Object obj;
        java.lang.Object obj2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "data");
        if (!f4743a.get()) {
            return null;
        }
        com.inmobi.media.core.config.models.SignalsConfig signalsConfig = b;
        if (!signalsConfig.getPublisher().getAuto().getEnabled()) {
            return null;
        }
        java.util.Map<java.lang.String, com.inmobi.media.core.config.models.SignalsConfig.PublisherConfig.KeyData> allowedKeys = signalsConfig.getPublisher().getAuto().getAllowedKeys();
        if (allowedKeys.isEmpty()) {
            return null;
        }
        java.util.Objects.toString(allowedKeys.keySet());
        java.util.Set<java.lang.String> keySet = data.keySet();
        if (keySet.isEmpty()) {
            return null;
        }
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        kotlin.jvm.internal.Intrinsics.checkNotNull(keySet);
        if (keySet.contains(com.google.firebase.analytics.FirebaseAnalytics.Param.AD_FORMAT) && (obj2 = data.get(com.google.firebase.analytics.FirebaseAnalytics.Param.AD_FORMAT)) != null) {
            linkedHashMap.put("auto_type", obj2);
            z = true;
        } else {
            z = false;
        }
        java.lang.Boolean valueOf = java.lang.Boolean.valueOf(z);
        if (!z) {
            valueOf = null;
        }
        if (valueOf == null) {
            return null;
        }
        for (java.util.Map.Entry<java.lang.String, com.inmobi.media.core.config.models.SignalsConfig.PublisherConfig.KeyData> entry : allowedKeys.entrySet()) {
            java.lang.String key = entry.getKey();
            com.inmobi.media.core.config.models.SignalsConfig.PublisherConfig.KeyData value = entry.getValue();
            if (keySet.contains(key)) {
                java.lang.String name = value.getName();
                if (com.inmobi.media.J3.a(name) && (obj = data.get(key)) != null) {
                    linkedHashMap.put(name, obj);
                }
            }
        }
        if (linkedHashMap.isEmpty()) {
            return null;
        }
        return linkedHashMap;
    }
}
