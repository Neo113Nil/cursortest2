package com.ironsource;

/* loaded from: classes5.dex */
public final class E6 implements com.ironsource.H6 {

    /* renamed from: a, reason: collision with root package name */
    private final com.ironsource.B6 f5681a;
    private final com.ironsource.C3218p6 b;
    private final com.ironsource.C3218p6 c;

    public E6(com.ironsource.B6 strategy, com.ironsource.C3218p6 currentAdUnit, com.ironsource.C3218p6 progressiveAdUnit) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(strategy, "strategy");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currentAdUnit, "currentAdUnit");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(progressiveAdUnit, "progressiveAdUnit");
        this.f5681a = strategy;
        this.b = currentAdUnit;
        this.c = progressiveAdUnit;
    }

    @Override // com.ironsource.H6
    public void a(android.app.Activity activity) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activity, "activity");
        this.f5681a.d().c(new com.ironsource.mediationsdk.logger.IronSourceError(com.unity3d.mediation.LevelPlayAdError.ERROR_CODE_SHOW_WHILE_LOAD, "Show called while progressive loading another ad"));
    }

    @Override // com.ironsource.H6
    public void b(com.unity3d.mediation.LevelPlayAdInfo adInfo) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        this.f5681a.a("load success with better ad before progressive load success");
    }

    @Override // com.ironsource.H6
    public void c(com.unity3d.mediation.LevelPlayAdInfo adInfo) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        com.ironsource.B6 b6 = this.f5681a;
        b6.a(new com.ironsource.D6(b6, this.b, this.c, adInfo));
    }

    @Override // com.ironsource.H6
    public void loadAd() {
        com.ironsource.B6 b6 = this.f5681a;
        b6.a(new com.ironsource.G6(b6, this.c));
    }

    @Override // com.ironsource.H6
    public void a(com.ironsource.mediationsdk.logger.IronSourceError ironSourceError) {
        com.ironsource.B6 b6 = this.f5681a;
        b6.a(new com.ironsource.C6(b6, this.b, false, 4, null));
    }

    @Override // com.ironsource.H6
    public void a() {
        this.f5681a.a("ad expired before progressive load success");
    }

    @Override // com.ironsource.H6
    public void a(com.unity3d.mediation.LevelPlayAdInfo adInfo) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        this.f5681a.a("show success before progressive load success");
    }

    @Override // com.ironsource.H6
    public void c(com.ironsource.mediationsdk.logger.IronSourceError ironSourceError) {
        this.f5681a.a("show failed before progressive load success");
    }
}
