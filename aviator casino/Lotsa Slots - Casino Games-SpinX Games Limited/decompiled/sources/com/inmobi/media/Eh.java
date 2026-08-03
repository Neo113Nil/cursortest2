package com.inmobi.media;

/* loaded from: classes5.dex */
public final class Eh {

    /* renamed from: a, reason: collision with root package name */
    public final com.inmobi.media.C2370e4 f4687a;
    public final kotlin.Lazy b;

    public Eh(com.inmobi.media.C2370e4 configDao) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(configDao, "configDao");
        this.f4687a = configDao;
        this.b = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0() { // from class: com.inmobi.media.Eh$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return com.inmobi.media.Eh.a();
            }
        });
    }

    public static final com.inmobi.media.Kh a() {
        return new com.inmobi.media.Kh((com.inmobi.media.B9) com.inmobi.media.Pe.b.getValue());
    }

    public static final java.util.ArrayList a(com.inmobi.media.Eh eh) {
        com.inmobi.media.C2687q4 c2687q4;
        com.inmobi.media.C2687q4 c2687q42;
        com.inmobi.media.C2687q4 c2687q43;
        com.inmobi.media.C2687q4 c2687q44;
        com.inmobi.media.C2687q4 c2687q45;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        com.inmobi.media.C2580m4 c2580m4 = com.inmobi.media.AbstractC2318c4.f5134a;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(com.inmobi.media.core.config.models.RootConfig.class, "clazz");
        com.inmobi.media.C2580m4 c2580m42 = com.inmobi.media.AbstractC2318c4.f5134a;
        com.inmobi.media.core.config.models.RootConfig rootConfig = (com.inmobi.media.core.config.models.RootConfig) c2580m42.a(com.inmobi.media.core.config.models.RootConfig.class);
        if (a(rootConfig, com.inmobi.media.core.config.models.RootConfig.class)) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(com.inmobi.media.core.config.models.RootConfig.class, "clazz");
            com.inmobi.media.core.config.models.RootConfig rootConfig2 = (com.inmobi.media.core.config.models.RootConfig) c2580m42.a(com.inmobi.media.core.config.models.RootConfig.class);
            if (kotlin.jvm.internal.Intrinsics.areEqual(com.inmobi.media.core.config.models.RootConfig.class, com.inmobi.media.core.config.models.RootConfig.class)) {
                c2687q45 = new com.inmobi.media.C2687q4(rootConfig2.getUrlForType("root"), rootConfig2);
            } else {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(com.inmobi.media.core.config.models.RootConfig.class, "clazz");
                com.inmobi.media.core.config.models.Config a2 = c2580m42.a(com.inmobi.media.core.config.models.RootConfig.class);
                c2687q45 = new com.inmobi.media.C2687q4(rootConfig2.getUrlForType(a2.getType()), a2);
            }
            arrayList.add(c2687q45);
            return arrayList;
        }
        if (a(rootConfig, com.inmobi.media.core.config.models.AdConfig.class)) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(com.inmobi.media.core.config.models.RootConfig.class, "clazz");
            com.inmobi.media.core.config.models.RootConfig rootConfig3 = (com.inmobi.media.core.config.models.RootConfig) c2580m42.a(com.inmobi.media.core.config.models.RootConfig.class);
            if (kotlin.jvm.internal.Intrinsics.areEqual(com.inmobi.media.core.config.models.AdConfig.class, com.inmobi.media.core.config.models.RootConfig.class)) {
                c2687q44 = new com.inmobi.media.C2687q4(rootConfig3.getUrlForType("root"), rootConfig3);
            } else {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(com.inmobi.media.core.config.models.AdConfig.class, "clazz");
                com.inmobi.media.core.config.models.Config a3 = c2580m42.a(com.inmobi.media.core.config.models.AdConfig.class);
                c2687q44 = new com.inmobi.media.C2687q4(rootConfig3.getUrlForType(a3.getType()), a3);
            }
            arrayList.add(c2687q44);
        }
        if (a(rootConfig, com.inmobi.media.core.config.models.TelemetryConfig.class)) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(com.inmobi.media.core.config.models.RootConfig.class, "clazz");
            com.inmobi.media.core.config.models.RootConfig rootConfig4 = (com.inmobi.media.core.config.models.RootConfig) c2580m42.a(com.inmobi.media.core.config.models.RootConfig.class);
            if (kotlin.jvm.internal.Intrinsics.areEqual(com.inmobi.media.core.config.models.TelemetryConfig.class, com.inmobi.media.core.config.models.RootConfig.class)) {
                c2687q43 = new com.inmobi.media.C2687q4(rootConfig4.getUrlForType("root"), rootConfig4);
            } else {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(com.inmobi.media.core.config.models.TelemetryConfig.class, "clazz");
                com.inmobi.media.core.config.models.Config a4 = c2580m42.a(com.inmobi.media.core.config.models.TelemetryConfig.class);
                c2687q43 = new com.inmobi.media.C2687q4(rootConfig4.getUrlForType(a4.getType()), a4);
            }
            arrayList.add(c2687q43);
        }
        if (a(rootConfig, com.inmobi.media.core.config.models.SignalsConfig.class)) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(com.inmobi.media.core.config.models.RootConfig.class, "clazz");
            com.inmobi.media.core.config.models.RootConfig rootConfig5 = (com.inmobi.media.core.config.models.RootConfig) c2580m42.a(com.inmobi.media.core.config.models.RootConfig.class);
            if (kotlin.jvm.internal.Intrinsics.areEqual(com.inmobi.media.core.config.models.SignalsConfig.class, com.inmobi.media.core.config.models.RootConfig.class)) {
                c2687q42 = new com.inmobi.media.C2687q4(rootConfig5.getUrlForType("root"), rootConfig5);
            } else {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(com.inmobi.media.core.config.models.SignalsConfig.class, "clazz");
                com.inmobi.media.core.config.models.Config a5 = c2580m42.a(com.inmobi.media.core.config.models.SignalsConfig.class);
                c2687q42 = new com.inmobi.media.C2687q4(rootConfig5.getUrlForType(a5.getType()), a5);
            }
            arrayList.add(c2687q42);
        }
        if (a(rootConfig, com.inmobi.media.core.config.models.CrashConfig.class)) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(com.inmobi.media.core.config.models.RootConfig.class, "clazz");
            com.inmobi.media.core.config.models.RootConfig rootConfig6 = (com.inmobi.media.core.config.models.RootConfig) c2580m42.a(com.inmobi.media.core.config.models.RootConfig.class);
            if (kotlin.jvm.internal.Intrinsics.areEqual(com.inmobi.media.core.config.models.CrashConfig.class, com.inmobi.media.core.config.models.RootConfig.class)) {
                c2687q4 = new com.inmobi.media.C2687q4(rootConfig6.getUrlForType("root"), rootConfig6);
            } else {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(com.inmobi.media.core.config.models.CrashConfig.class, "clazz");
                com.inmobi.media.core.config.models.Config a6 = c2580m42.a(com.inmobi.media.core.config.models.CrashConfig.class);
                c2687q4 = new com.inmobi.media.C2687q4(rootConfig6.getUrlForType(a6.getType()), a6);
            }
            arrayList.add(c2687q4);
        }
        return arrayList;
    }

    public static boolean a(com.inmobi.media.core.config.models.RootConfig rootConfig, java.lang.Class clazz) {
        com.inmobi.media.C2580m4 c2580m4 = com.inmobi.media.AbstractC2318c4.f5134a;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(clazz, "clazz");
        com.inmobi.media.core.config.models.Config a2 = com.inmobi.media.AbstractC2318c4.f5134a.a(clazz);
        return a2 == null || java.lang.System.currentTimeMillis() - a2.getLastUpdateTimeStamp() > rootConfig.getExpiryInMillisForType(com.inmobi.media.AbstractC2872x4.a(clazz));
    }
}
