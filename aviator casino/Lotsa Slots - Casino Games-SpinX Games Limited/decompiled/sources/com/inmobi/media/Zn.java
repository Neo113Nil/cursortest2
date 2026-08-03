package com.inmobi.media;

/* loaded from: classes5.dex */
public final class Zn {

    /* renamed from: a, reason: collision with root package name */
    public final int f5090a;
    public final int b;
    public final com.inmobi.media.D5 c;

    public Zn(com.inmobi.media.core.config.models.AdConfig.VideoPlayerViewabilityConfig viewableConfig) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(viewableConfig, "viewableConfig");
        this.f5090a = viewableConfig.getMinPercentageVisible();
        this.b = viewableConfig.getPollingInterval();
        this.c = com.inmobi.media.AbstractC2914yl.a(viewableConfig.getMinDimensions());
    }
}
