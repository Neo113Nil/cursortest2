package com.inmobi.media;

import com.inmobi.media.core.config.models.AdConfig;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class Wp {

    /* renamed from: a, reason: collision with root package name */
    public final int f6939a;
    public final int b;
    public final C3560a6 c;

    public Wp(AdConfig.VideoPlayerViewabilityConfig viewableConfig) {
        Intrinsics.checkNotNullParameter(viewableConfig, "viewableConfig");
        this.f6939a = viewableConfig.getMinPercentageVisible();
        this.b = viewableConfig.getPollingInterval();
        this.c = AbstractC4114tn.a(viewableConfig.getMinDimensions());
    }
}
