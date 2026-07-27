package com.inmobi.media;

import com.inmobi.media.core.config.models.AdConfig;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.inmobi.media.t4, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C4095t4 extends C4209x8 {
    public final int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4095t4(AdConfig.ViewabilityConfig viewabilityConfig, Y9 y9) {
        super(viewabilityConfig, (byte) 1, y9);
        Q7 visibilityChecker = T7.k;
        Intrinsics.checkNotNullParameter(visibilityChecker, "visibilityChecker");
        this.n = 500;
    }

    @Override // com.inmobi.media.C4209x8, com.inmobi.media.AbstractC3749gq
    public final int c() {
        AdConfig.ViewabilityConfig viewabilityConfig = this.l;
        return viewabilityConfig != null ? viewabilityConfig.getCompanionVisibilityThrottleMillis() : this.n;
    }
}
