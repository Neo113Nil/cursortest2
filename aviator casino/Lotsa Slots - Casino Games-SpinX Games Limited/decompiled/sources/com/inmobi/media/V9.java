package com.inmobi.media;

/* loaded from: classes5.dex */
public final class V9 implements com.inmobi.media.InterfaceC2846w4 {
    @Override // com.inmobi.media.InterfaceC2846w4
    public final void a(com.inmobi.media.core.config.models.Config config) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(config, "config");
        if (config instanceof com.inmobi.media.core.config.models.CrashConfig) {
            com.inmobi.media.Sa sa = com.inmobi.media.W9.d;
            com.inmobi.media.core.config.models.CrashConfig crashConfig = (com.inmobi.media.core.config.models.CrashConfig) config;
            sa.getClass();
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(crashConfig, "crashConfig");
            sa.f4953a = crashConfig;
            com.inmobi.media.Y9 y9 = sa.c;
            y9.getClass();
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(crashConfig, "config");
            y9.f5062a.f4999a = crashConfig.getCrashConfig().getSamplingPercent();
            y9.b.f4999a = crashConfig.getCatchConfig().getSamplingPercent();
            y9.c.f4999a = crashConfig.getAnr().getWatchdog().getSamplingPercent();
            y9.d.f4999a = crashConfig.getAnr().getAppExitReason().getSamplingPercent();
            com.inmobi.media.C2662p6 c2662p6 = sa.b;
            if (c2662p6 != null) {
                com.inmobi.media.C2426g6 eventConfig = crashConfig.getEventConfig();
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(eventConfig, "eventConfig");
                c2662p6.i = eventConfig;
            }
            com.inmobi.media.C2898y5 c2898y5 = com.inmobi.media.W9.c;
            if (c2898y5 != null) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(crashConfig, "crashConfig");
                c2898y5.f5563a = crashConfig;
            }
        }
    }
}
