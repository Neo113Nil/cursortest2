package com.ironsource;

/* loaded from: classes5.dex */
public final class Z0 {
    public final com.ironsource.X0 a(java.lang.String adUnitId, com.unity3d.mediation.LevelPlay.AdFormat adFormat, com.ironsource.H8 sdkConfigService) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adUnitId, "adUnitId");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adFormat, "adFormat");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sdkConfigService, "sdkConfigService");
        if (adUnitId.length() == 0) {
            return new com.ironsource.X0.a(com.ironsource.Y0.f6085a);
        }
        if (!sdkConfigService.c()) {
            return new com.ironsource.X0.a(com.ironsource.Y0.b);
        }
        com.ironsource.Ua a2 = sdkConfigService.a();
        return (a2 == null || !a2.a(adUnitId, adFormat)) ? new com.ironsource.X0.a(com.ironsource.Y0.c) : com.ironsource.X0.b.f6054a;
    }
}
