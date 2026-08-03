package com.inmobi.media;

/* renamed from: com.inmobi.media.mk, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2596mk implements com.inmobi.media.InterfaceC2846w4 {
    @Override // com.inmobi.media.InterfaceC2846w4
    public final void a(com.inmobi.media.core.config.models.Config config) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(config, "config");
        if (config instanceof com.inmobi.media.core.config.models.TelemetryConfig) {
            com.inmobi.media.C2624nk c2624nk = com.inmobi.media.C2624nk.f5360a;
            com.inmobi.media.core.config.models.TelemetryConfig b = com.inmobi.media.C2624nk.b();
            com.inmobi.media.C2624nk.h = new com.inmobi.media.Ak(new com.inmobi.media.C2677pk(b.getEnabled(), b.getAssetReporting().isImageEnabled(), b.getAssetReporting().isGifEnabled(), b.getAssetReporting().isVideoEnabled(), b.getDisableAllGeneralEvents(), b.getPriorityEventsList(), b.getSamplingFactor()), kotlin.collections.CollectionsKt.toList(com.inmobi.media.C2624nk.d));
            com.inmobi.media.C2862wk c2862wk = com.inmobi.media.C2624nk.j;
            if (c2862wk != null) {
                com.inmobi.media.core.config.models.TelemetryConfig telemetryConfig = com.inmobi.media.C2624nk.b();
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(telemetryConfig, "telemetryConfig");
                c2862wk.f5533a = telemetryConfig;
            }
        }
    }
}
