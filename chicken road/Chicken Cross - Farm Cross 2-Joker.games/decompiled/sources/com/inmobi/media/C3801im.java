package com.inmobi.media;

import com.inmobi.media.core.config.models.Config;
import com.inmobi.media.core.config.models.TelemetryConfig;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.inmobi.media.im, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C3801im implements T4 {
    @Override // com.inmobi.media.T4
    public final void a(Config config) {
        Intrinsics.checkNotNullParameter(config, "config");
        if (config instanceof TelemetryConfig) {
            C3829jm c3829jm = C3829jm.f7187a;
            TelemetryConfig b = C3829jm.b();
            C3829jm.h = new C4196wm(new C3888lm(b.getEnabled(), b.getAssetReporting().isImageEnabled(), b.getAssetReporting().isGifEnabled(), b.getAssetReporting().isVideoEnabled(), b.getDisableAllGeneralEvents(), b.getPriorityEventsList(), b.getSamplingFactor()), CollectionsKt.toList(C3829jm.d));
            C4085sm c4085sm = C3829jm.j;
            if (c4085sm != null) {
                TelemetryConfig telemetryConfig = C3829jm.b();
                Intrinsics.checkNotNullParameter(telemetryConfig, "telemetryConfig");
                c4085sm.f7380a = telemetryConfig;
            }
        }
    }
}
