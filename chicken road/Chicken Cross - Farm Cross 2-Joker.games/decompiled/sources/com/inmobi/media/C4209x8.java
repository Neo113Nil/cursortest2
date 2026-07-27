package com.inmobi.media;

import com.inmobi.media.core.config.models.AdConfig;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.inmobi.media.x8, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C4209x8 extends Ph {
    public final int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4209x8(AdConfig.ViewabilityConfig viewabilityConfig, byte b, Y9 y9) {
        super(viewabilityConfig, b, y9);
        Q7 visibilityChecker = T7.k;
        Intrinsics.checkNotNullParameter(visibilityChecker, "visibilityChecker");
        this.m = 1000;
    }

    @Override // com.inmobi.media.AbstractC3749gq
    public int c() {
        AdConfig.ViewabilityConfig viewabilityConfig = this.l;
        return viewabilityConfig != null ? viewabilityConfig.getWebVisibilityThrottleMillis() : this.m;
    }
}
