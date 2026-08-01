package com.inmobi.media;

import com.inmobi.media.core.config.models.Config;
import com.inmobi.media.core.config.models.CrashConfig;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class Aa implements T4 {
    @Override // com.inmobi.media.T4
    public final void a(Config config) {
        Intrinsics.checkNotNullParameter(config, "config");
        if (config instanceof CrashConfig) {
            Kb kb = Ba.d;
            CrashConfig crashConfig = (CrashConfig) config;
            kb.getClass();
            Intrinsics.checkNotNullParameter(crashConfig, "crashConfig");
            kb.f6669a = crashConfig;
            Da da = kb.c;
            da.getClass();
            Intrinsics.checkNotNullParameter(crashConfig, "config");
            da.f6509a.f7185a = crashConfig.getCrashConfig().getSamplingPercent();
            da.b.f7185a = crashConfig.getCatchConfig().getSamplingPercent();
            da.c.f7185a = crashConfig.getAnr().getWatchdog().getSamplingPercent();
            da.d.f7185a = crashConfig.getAnr().getAppExitReason().getSamplingPercent();
            M6 m6 = kb.b;
            if (m6 != null) {
                D6 eventConfig = crashConfig.getEventConfig();
                Intrinsics.checkNotNullParameter(eventConfig, "eventConfig");
                m6.i = eventConfig;
            }
            V5 v5 = Ba.c;
            if (v5 != null) {
                Intrinsics.checkNotNullParameter(crashConfig, "crashConfig");
                v5.f6907a = crashConfig;
            }
        }
    }
}
