package com.ironsource;

/* renamed from: com.ironsource.t9, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3292t9 implements com.ironsource.InterfaceC3015e0<com.unity3d.ironsourceads.interstitial.InterstitialAd> {

    /* renamed from: a, reason: collision with root package name */
    private final com.ironsource.InterfaceC3266s1 f6734a;
    private final java.util.concurrent.Executor b;

    public C3292t9(com.ironsource.InterfaceC3266s1 analytics, java.util.concurrent.Executor callbackExecutor) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(analytics, "analytics");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(callbackExecutor, "callbackExecutor");
        this.f6734a = analytics;
        this.b = callbackExecutor;
    }

    @Override // com.ironsource.InterfaceC3015e0
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.unity3d.ironsourceads.interstitial.InterstitialAd a(com.ironsource.J9 adInstance, com.ironsource.Y1 auctionDataReporter) {
        java.util.concurrent.ConcurrentHashMap concurrentHashMap;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adInstance, "adInstance");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(auctionDataReporter, "auctionDataReporter");
        com.ironsource.C2997d0 c2997d0 = new com.ironsource.C2997d0(new com.ironsource.Ac());
        com.ironsource.InterfaceC3266s1 interfaceC3266s1 = this.f6734a;
        concurrentHashMap = com.ironsource.C3310u9.f6761a;
        return new com.unity3d.ironsourceads.interstitial.InterstitialAd(new com.ironsource.C3328v9(adInstance, c2997d0, auctionDataReporter, interfaceC3266s1, null, null, null, null, concurrentHashMap, 240, null));
    }
}
