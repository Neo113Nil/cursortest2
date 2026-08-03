package com.inmobi.media;

/* renamed from: com.inmobi.media.wk, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2862wk {

    /* renamed from: a, reason: collision with root package name */
    public com.inmobi.media.core.config.models.TelemetryConfig f5533a;

    public C2862wk(com.inmobi.media.core.config.models.TelemetryConfig telemetryConfig) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(telemetryConfig, "telemetryConfig");
        this.f5533a = telemetryConfig;
        ((com.inmobi.media.Fc) com.inmobi.media.Xi.e.getValue()).a(new int[]{androidx.compose.material.TextFieldImplKt.AnimationDuration, com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor.MODULE_VERSION}, new kotlin.jvm.functions.Function1() { // from class: com.inmobi.media.wk$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.inmobi.media.C2862wk.a(com.inmobi.media.C2862wk.this, (com.inmobi.media.J2) obj);
            }
        });
    }

    public static final kotlin.Unit a(com.inmobi.media.C2862wk c2862wk, com.inmobi.media.J2 it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        switch (it.f4774a) {
            case androidx.compose.material.TextFieldImplKt.AnimationDuration /* 150 */:
                java.util.Map map = it.c;
                java.lang.Object obj = map != null ? map.get("data") : null;
                c2862wk.a("CrashEventOccurred", obj instanceof com.inmobi.media.X4 ? (com.inmobi.media.X4) obj : null);
                break;
            case 151:
                java.util.Map map2 = it.c;
                java.lang.Object obj2 = map2 != null ? map2.get("data") : null;
                com.inmobi.media.C2654oo c2654oo = obj2 instanceof com.inmobi.media.C2654oo ? (com.inmobi.media.C2654oo) obj2 : null;
                c2862wk.getClass();
                if (c2654oo != null && com.inmobi.media.AbstractC2939zl.a(c2654oo)) {
                    com.inmobi.media.B5.f4614a.getClass();
                    if (!com.inmobi.media.B5.t()) {
                        c2862wk.a("MainThreadBlockedEvent", c2654oo);
                        break;
                    }
                }
                break;
            case com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor.MODULE_VERSION /* 152 */:
                java.util.Map map3 = it.c;
                java.lang.Object obj3 = map3 != null ? map3.get("data") : null;
                c2862wk.a(obj3 instanceof com.inmobi.media.C2919z1 ? (com.inmobi.media.C2919z1) obj3 : null);
                break;
        }
        return kotlin.Unit.INSTANCE;
    }

    public final void a(com.inmobi.media.C2919z1 c2919z1) {
        if (android.os.Build.VERSION.SDK_INT < 30 || c2919z1 == null || c2919z1.g != 6) {
            return;
        }
        a("ANREvent", c2919z1);
    }

    public final void a(java.lang.String str, com.inmobi.media.X9 x9) {
        if (this.f5533a.getPriorityEventsList().contains(str) && x9 != null && com.inmobi.media.AbstractC2939zl.a(x9)) {
            com.inmobi.media.C2624nk.b(str, new java.util.LinkedHashMap(), com.inmobi.media.EnumC2728rk.f5431a);
        }
    }
}
