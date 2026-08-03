package com.inmobi.media;

/* loaded from: classes5.dex */
public final class B0 implements com.inmobi.media.InterfaceC2846w4 {
    @Override // com.inmobi.media.InterfaceC2846w4
    public final void a(com.inmobi.media.core.config.models.Config config) {
        com.inmobi.media.A0 a0;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(config, "config");
        if ((config instanceof com.inmobi.media.core.config.models.AdConfig) && (a0 = com.inmobi.media.E0.b) != null) {
            com.inmobi.media.core.config.models.AdConfig adConfig = (com.inmobi.media.core.config.models.AdConfig) config;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adConfig, "adConfig");
            if (a0.f4590a.get()) {
                if (adConfig.getAdQuality().getEnabled()) {
                    return;
                }
                a0.f4590a.set(false);
                kotlinx.coroutines.CoroutineScope coroutineScope = com.inmobi.media.E0.f;
                if (coroutineScope != null) {
                    kotlinx.coroutines.CoroutineScopeKt.cancel(coroutineScope, new java.util.concurrent.CancellationException("Shutdown"));
                }
                com.inmobi.media.E0.f = null;
                return;
            }
            if (!adConfig.getAdQuality().getEnabled() || a0.f4590a.get()) {
                return;
            }
            com.inmobi.media.C2580m4 c2580m4 = com.inmobi.media.AbstractC2318c4.f5134a;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(com.inmobi.media.core.config.models.AdConfig.class, "clazz");
            if (((com.inmobi.media.core.config.models.AdConfig) com.inmobi.media.AbstractC2318c4.f5134a.a(com.inmobi.media.core.config.models.AdConfig.class)).getAdQuality().getEnabled()) {
                a0.a();
            }
        }
    }
}
