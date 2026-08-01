package com.inmobi.media;

import com.inmobi.media.core.config.models.AdConfig;
import com.inmobi.media.core.config.models.Config;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;

/* loaded from: classes6.dex */
public final class D0 implements T4 {
    @Override // com.inmobi.media.T4
    public final void a(Config config) {
        C0 c0;
        Intrinsics.checkNotNullParameter(config, "config");
        if ((config instanceof AdConfig) && (c0 = G0.b) != null) {
            AdConfig adConfig = (AdConfig) config;
            Intrinsics.checkNotNullParameter(adConfig, "adConfig");
            if (c0.f6484a.get()) {
                if (adConfig.getAdQuality().getEnabled()) {
                    return;
                }
                c0.f6484a.set(false);
                CoroutineScope coroutineScope = G0.f;
                if (coroutineScope != null) {
                    CoroutineScopeKt.cancel(coroutineScope, new CancellationException("Shutdown"));
                }
                G0.f = null;
                return;
            }
            if (!adConfig.getAdQuality().getEnabled() || c0.f6484a.get()) {
                return;
            }
            J4 j4 = AbstractC4260z4.f7518a;
            Intrinsics.checkNotNullParameter(AdConfig.class, "clazz");
            if (((AdConfig) AbstractC4260z4.f7518a.a(AdConfig.class)).getAdQuality().getEnabled()) {
                c0.a();
            }
        }
    }
}
