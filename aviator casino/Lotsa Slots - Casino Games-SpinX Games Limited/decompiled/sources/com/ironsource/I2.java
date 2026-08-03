package com.ironsource;

/* loaded from: classes5.dex */
public final class I2 implements com.ironsource.H2 {

    /* renamed from: a, reason: collision with root package name */
    private final com.ironsource.InterfaceC3266s1 f5751a;
    private final java.util.concurrent.Executor b;

    public I2(com.ironsource.InterfaceC3266s1 analytics, java.util.concurrent.Executor callbackExecutor) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(analytics, "analytics");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(callbackExecutor, "callbackExecutor");
        this.f5751a = analytics;
        this.b = callbackExecutor;
    }

    @Override // com.ironsource.H2
    public com.unity3d.ironsourceads.banner.BannerAdView a(com.ironsource.J9 adInstance, com.ironsource.C3041f8 adContainer, com.ironsource.Y1 auctionDataReporter) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adInstance, "adInstance");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adContainer, "adContainer");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(auctionDataReporter, "auctionDataReporter");
        return new com.unity3d.ironsourceads.banner.BannerAdView(new com.ironsource.P2(adInstance, adContainer, auctionDataReporter, this.f5751a, null, null, null, null, null, 496, null));
    }
}
