package com.inmobi.media;

/* loaded from: classes5.dex */
public abstract class W9 {

    /* renamed from: a, reason: collision with root package name */
    public static final kotlin.Lazy f5027a = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0() { // from class: com.inmobi.media.W9$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return com.inmobi.media.W9.b();
        }
    });
    public static final com.inmobi.media.V9 b;
    public static final com.inmobi.media.C2898y5 c;
    public static final com.inmobi.media.Sa d;

    static {
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        b = new com.inmobi.media.V9();
        d = new com.inmobi.media.Sa(a());
        android.content.Context context = com.inmobi.media.Xi.f5051a;
        if (context != null) {
            c = new com.inmobi.media.C2898y5(context, a(), (com.inmobi.media.Fc) com.inmobi.media.Xi.e.getValue());
        }
        if (a().getCrashConfig().getReportSessionInfo()) {
            com.inmobi.media.Z4 type = com.inmobi.media.Z4.d;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(type, "type");
            com.inmobi.media.La a2 = com.inmobi.media.Z9.a();
            if (a2 != null) {
                a2.a(type.f5115a, currentTimeMillis, true);
            }
            com.inmobi.media.La a3 = com.inmobi.media.Z9.a();
            if (a3 != null) {
                java.util.concurrent.ConcurrentHashMap concurrentHashMap = com.inmobi.media.La.b;
                a3.a("s-cnt", 0, false);
            }
        }
        if (com.inmobi.media.AbstractC2672pf.f5392a.getCrashConfig().getReportOOMInfo()) {
            for (com.inmobi.media.AbstractC2292b5 type2 : kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.inmobi.media.AbstractC2292b5[]{com.inmobi.media.C2266a5.d, com.inmobi.media.Y4.d})) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(type2, "type");
                com.inmobi.media.La a4 = com.inmobi.media.Z9.a();
                if (a4 != null) {
                    a4.a(type2.f5115a, currentTimeMillis, true);
                }
            }
        }
    }

    public static com.inmobi.media.core.config.models.CrashConfig a() {
        com.inmobi.media.C2580m4 c2580m4 = com.inmobi.media.AbstractC2318c4.f5134a;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(com.inmobi.media.core.config.models.CrashConfig.class, "clazz");
        return (com.inmobi.media.core.config.models.CrashConfig) com.inmobi.media.AbstractC2318c4.f5134a.a(com.inmobi.media.core.config.models.CrashConfig.class);
    }

    public static final com.inmobi.media.U9 b() {
        return new com.inmobi.media.U9(com.inmobi.media.AbstractC2639o9.b());
    }

    public static void c() {
        com.inmobi.media.La a2;
        if (a().getCrashConfig().getReportSessionInfo() && (a2 = com.inmobi.media.Z9.a()) != null) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter("s-cnt", com.ironsource.X3.i.W);
            a2.a("s-cnt", a2.f4815a.getInt("s-cnt", 0) + 1, false);
        }
        com.inmobi.media.C2898y5 c2898y5 = c;
        if (c2898y5 != null) {
            java.util.Iterator it = c2898y5.c.iterator();
            while (it.hasNext()) {
                ((com.inmobi.media.AbstractC2873x5) it.next()).a();
            }
        }
        com.inmobi.media.Sa sa = d;
        sa.getClass();
        com.inmobi.media.AbstractC2939zl.a(new com.inmobi.media.Pa(sa, null));
        ((com.inmobi.media.Fc) com.inmobi.media.Xi.e.getValue()).a(new int[]{2, 1, com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor.MODULE_VERSION, androidx.compose.material.TextFieldImplKt.AnimationDuration, 151}, sa.d);
        com.inmobi.media.C2580m4 c2580m4 = com.inmobi.media.AbstractC2318c4.f5134a;
        com.inmobi.media.AbstractC2318c4.a("crashReporting", b);
    }

    public static void a(com.inmobi.media.M2 incident) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(incident, "event");
        com.inmobi.media.Sa sa = d;
        sa.getClass();
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(incident, "incident");
        if (sa.f4953a.getCatchConfig().getEnabled() && sa.c.b.a()) {
            com.inmobi.media.AbstractC2939zl.a(new com.inmobi.media.Oa(sa, incident, null));
        }
    }

    public static void a(org.json.JSONObject payload, boolean z, long j) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(payload, "payload");
        if (a().getCrashConfig().getReportSessionInfo() && z) {
            com.inmobi.media.Z4 crashType = com.inmobi.media.Z4.d;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(crashType, "crashType");
            com.inmobi.media.La a2 = com.inmobi.media.Z9.a();
            long j2 = 0;
            if (a2 != null) {
                java.lang.String key = crashType.f5115a;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "key");
                long j3 = a2.f4815a.getLong(key, 0L);
                java.lang.String str = crashType.b;
                if (j3 == 0) {
                    a2.a(str, j, true);
                } else {
                    a2.a(str, j - j3, true);
                }
            }
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(crashType, "crashType");
            com.inmobi.media.La a3 = com.inmobi.media.Z9.a();
            if (a3 != null) {
                java.lang.String key2 = crashType.b;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key2, "key");
                j2 = a3.f4815a.getLong(key2, 0L);
            }
            payload.put("crashFreeSessionLength", j2);
            com.inmobi.media.La a4 = com.inmobi.media.Z9.a();
            int i = 0;
            if (a4 != null) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter("s-cnt", com.ironsource.X3.i.W);
                i = a4.f4815a.getInt("s-cnt", 0);
            }
            payload.put("crashFreeSessionCount", i);
        }
    }
}
