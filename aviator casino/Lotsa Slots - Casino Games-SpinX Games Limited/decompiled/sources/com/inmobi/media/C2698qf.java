package com.inmobi.media;

/* renamed from: com.inmobi.media.qf, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2698qf {

    /* renamed from: a, reason: collision with root package name */
    public final com.inmobi.media.B9 f5410a;

    public C2698qf(com.inmobi.media.core.config.models.AdConfig.PingsV2Config pingsConfig) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pingsConfig, "pingsConfig");
        okhttp3.Dispatcher dispatcher = new okhttp3.Dispatcher();
        dispatcher.setMaxRequests(pingsConfig.getMaxBatchSize().getHigh());
        kotlin.Unit unit = kotlin.Unit.INSTANCE;
        this.f5410a = com.inmobi.media.C2927z9.a(null, dispatcher, null, new com.inmobi.media.Gk(pingsConfig.getConnectTimeout(), pingsConfig.getReadTimeout(), pingsConfig.getCallTimeout()), 5);
    }
}
