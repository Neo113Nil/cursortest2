package com.inmobi.media;

/* renamed from: com.inmobi.media.rg, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC2724rg {

    /* renamed from: a, reason: collision with root package name */
    public static final com.inmobi.media.Ui f5429a;

    static {
        com.inmobi.media.C2580m4 c2580m4 = com.inmobi.media.AbstractC2318c4.f5134a;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(com.inmobi.media.core.config.models.TelemetryConfig.class, "clazz");
        f5429a = new com.inmobi.media.Ui(1 - ((com.inmobi.media.core.config.models.TelemetryConfig) com.inmobi.media.AbstractC2318c4.f5134a.a(com.inmobi.media.core.config.models.TelemetryConfig.class)).getPingSamplingFactor());
    }

    public static void a(java.lang.String eventType, java.util.Map keyValueMap) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(eventType, "eventType");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(keyValueMap, "keyValueMap");
        if (kotlin.jvm.internal.Intrinsics.areEqual(eventType, "PingDBMaxLimitReached")) {
            com.inmobi.media.C2624nk c2624nk = com.inmobi.media.C2624nk.f5360a;
            com.inmobi.media.C2624nk.b(eventType, keyValueMap, com.inmobi.media.EnumC2728rk.f5431a);
            return;
        }
        if (f5429a.a()) {
            double d = 1;
            com.inmobi.media.C2580m4 c2580m4 = com.inmobi.media.AbstractC2318c4.f5134a;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(com.inmobi.media.core.config.models.TelemetryConfig.class, "clazz");
            com.inmobi.media.C2580m4 c2580m42 = com.inmobi.media.AbstractC2318c4.f5134a;
            double pingSamplingFactor = d - ((com.inmobi.media.core.config.models.TelemetryConfig) c2580m42.a(com.inmobi.media.core.config.models.TelemetryConfig.class)).getPingSamplingFactor();
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(com.inmobi.media.core.config.models.TelemetryConfig.class, "clazz");
            keyValueMap.put("samplingRate", java.lang.Integer.valueOf((int) ((d - ((com.inmobi.media.core.config.models.TelemetryConfig) c2580m42.a(com.inmobi.media.core.config.models.TelemetryConfig.class)).getSamplingFactor()) * pingSamplingFactor * 100)));
            com.inmobi.media.C2624nk c2624nk2 = com.inmobi.media.C2624nk.f5360a;
            com.inmobi.media.C2624nk.b(eventType, keyValueMap, com.inmobi.media.EnumC2728rk.f5431a);
        }
    }
}
