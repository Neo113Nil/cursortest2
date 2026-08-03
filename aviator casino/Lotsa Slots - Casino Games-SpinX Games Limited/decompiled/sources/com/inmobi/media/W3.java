package com.inmobi.media;

/* loaded from: classes5.dex */
public final class W3 extends com.inmobi.media.X7 {
    public final int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public W3(com.inmobi.media.core.config.models.AdConfig.ViewabilityConfig viewabilityConfig, com.inmobi.media.InterfaceC2772t9 interfaceC2772t9) {
        super(viewabilityConfig, (byte) 1, interfaceC2772t9);
        com.inmobi.media.C2715r7 visibilityChecker = com.inmobi.media.C2797u7.k;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(visibilityChecker, "visibilityChecker");
        this.n = 500;
    }

    @Override // com.inmobi.media.X7, com.inmobi.media.AbstractC2547ko
    public final int c() {
        com.inmobi.media.core.config.models.AdConfig.ViewabilityConfig viewabilityConfig = this.l;
        return viewabilityConfig != null ? viewabilityConfig.getCompanionVisibilityThrottleMillis() : this.n;
    }
}
