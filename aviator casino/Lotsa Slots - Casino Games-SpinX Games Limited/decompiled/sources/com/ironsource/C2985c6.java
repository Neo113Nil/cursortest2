package com.ironsource;

/* renamed from: com.ironsource.c6, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2985c6 extends com.ironsource.AbstractC3157m implements com.ironsource.InterfaceC3271s6, com.ironsource.InterfaceC3289t6 {
    private final com.ironsource.InterfaceC3021e6 b;
    private final com.ironsource.C3069h0 c;
    private final com.ironsource.InterfaceC3307u6 d;

    public /* synthetic */ C2985c6(com.ironsource.InterfaceC3021e6 interfaceC3021e6, com.ironsource.C3212p0 c3212p0, com.ironsource.C3069h0 c3069h0, com.ironsource.InterfaceC3307u6.b bVar, com.ironsource.InterfaceC3236q6 interfaceC3236q6, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(interfaceC3021e6, c3212p0, c3069h0, (i & 8) != 0 ? new com.ironsource.InterfaceC3307u6.b() : bVar, interfaceC3236q6);
    }

    public final void a(android.app.Activity activity, com.ironsource.C3064gd c3064gd) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activity, "activity");
        this.c.a(c3064gd);
        this.d.a(activity);
    }

    @Override // com.ironsource.InterfaceC3289t6
    public void b(com.unity3d.mediation.LevelPlayAdInfo adInfo) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        this.b.onAdLoaded(adInfo);
    }

    @Override // com.ironsource.InterfaceC3289t6
    public void c(com.ironsource.mediationsdk.logger.IronSourceError ironSourceError) {
        com.ironsource.InterfaceC3021e6 interfaceC3021e6 = this.b;
        java.lang.String uuid = this.c.b().toString();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(uuid, "adProperties.adId.toString()");
        interfaceC3021e6.a(new com.unity3d.mediation.LevelPlayAdError(ironSourceError, uuid, this.c.c()));
    }

    @Override // com.ironsource.K0
    public void e() {
        this.b.onAdClicked();
    }

    public final void m() {
        this.d.loadAd();
    }

    @Override // com.ironsource.InterfaceC3289t6
    public void onAdInfoChanged(com.unity3d.mediation.LevelPlayAdInfo adInfo) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        this.b.onAdInfoChanged(adInfo);
    }

    @Override // com.ironsource.InterfaceC3271s6
    public void onClosed() {
        this.b.onAdClosed();
    }

    public C2985c6(com.ironsource.InterfaceC3021e6 listener, com.ironsource.C3212p0 adTools, com.ironsource.C3069h0 adProperties, com.ironsource.InterfaceC3307u6.b adUnitStrategyFactory, com.ironsource.InterfaceC3236q6 fullscreenAdUnitFactory) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(listener, "listener");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adTools, "adTools");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adProperties, "adProperties");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adUnitStrategyFactory, "adUnitStrategyFactory");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fullscreenAdUnitFactory, "fullscreenAdUnitFactory");
        this.b = listener;
        this.c = adProperties;
        this.d = adUnitStrategyFactory.a(adTools, adTools.b(adProperties.e(), adProperties.c()), fullscreenAdUnitFactory, this, this);
    }

    @Override // com.ironsource.InterfaceC3289t6
    public void a(com.ironsource.mediationsdk.logger.IronSourceError ironSourceError) {
        com.ironsource.InterfaceC3021e6 interfaceC3021e6 = this.b;
        java.lang.String uuid = this.c.b().toString();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(uuid, "adProperties.adId.toString()");
        interfaceC3021e6.onAdLoadFailed(new com.unity3d.mediation.LevelPlayAdError(ironSourceError, uuid, this.c.c()));
    }

    @Override // com.ironsource.InterfaceC3289t6
    public void a(com.unity3d.mediation.LevelPlayAdInfo adInfo) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        this.b.onAdDisplayed(adInfo);
    }

    @Override // com.ironsource.InterfaceC3271s6
    public void a(com.unity3d.mediation.rewarded.LevelPlayReward reward) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reward, "reward");
        this.b.a(reward);
    }

    @Override // com.ironsource.InterfaceC3289t6
    public void a() {
        this.b.a();
    }
}
