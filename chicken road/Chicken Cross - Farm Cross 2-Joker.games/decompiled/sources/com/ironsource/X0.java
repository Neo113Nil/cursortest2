package com.ironsource;

import com.ironsource.V0;
import com.unity3d.mediation.LevelPlay;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class X0 {
    public final V0 a(String adUnitId, LevelPlay.AdFormat adFormat, F8 sdkConfigService) {
        Intrinsics.checkNotNullParameter(adUnitId, "adUnitId");
        Intrinsics.checkNotNullParameter(adFormat, "adFormat");
        Intrinsics.checkNotNullParameter(sdkConfigService, "sdkConfigService");
        if (adUnitId.length() == 0) {
            return new V0.a(W0.f7981a);
        }
        if (!sdkConfigService.c()) {
            return new V0.a(W0.b);
        }
        Sa a2 = sdkConfigService.a();
        return (a2 == null || !a2.a(adUnitId, adFormat)) ? new V0.a(W0.c) : V0.b.f7956a;
    }
}
