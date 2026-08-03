package com.ironsource;

/* loaded from: classes5.dex */
public final class G6 implements com.ironsource.H6 {

    /* renamed from: a, reason: collision with root package name */
    private final com.ironsource.B6 f5722a;
    private final com.ironsource.C3218p6 b;

    public G6(com.ironsource.B6 strategy, com.ironsource.C3218p6 adUnit) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(strategy, "strategy");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adUnit, "adUnit");
        this.f5722a = strategy;
        this.b = adUnit;
    }

    @Override // com.ironsource.H6
    public void a(android.app.Activity activity) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activity, "activity");
        this.f5722a.d().c(new com.ironsource.mediationsdk.logger.IronSourceError(com.unity3d.mediation.LevelPlayAdError.ERROR_CODE_SHOW_BEFORE_LOAD_SUCCESS_CALLBACK, "Show called before load success"));
    }

    @Override // com.ironsource.H6
    public void b(com.unity3d.mediation.LevelPlayAdInfo adInfo) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        this.f5722a.a("load success with better ad while loading");
    }

    @Override // com.ironsource.H6
    public void c(com.unity3d.mediation.LevelPlayAdInfo adInfo) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        com.ironsource.B6 b6 = this.f5722a;
        b6.a(new com.ironsource.F6(b6, this.b));
        this.f5722a.d().b(adInfo);
    }

    @Override // com.ironsource.H6
    public void loadAd() {
        this.f5722a.d().a(new com.ironsource.mediationsdk.logger.IronSourceError(com.unity3d.mediation.LevelPlayAdError.ERROR_CODE_LOAD_FAILED_ALREADY_CALLED, "Load called before load success"));
    }

    @Override // com.ironsource.H6
    public void c(com.ironsource.mediationsdk.logger.IronSourceError ironSourceError) {
        this.f5722a.a("show failed while loading");
    }

    @Override // com.ironsource.H6
    public void a(com.ironsource.mediationsdk.logger.IronSourceError ironSourceError) {
        com.ironsource.B6 b6 = this.f5722a;
        b6.a(new com.ironsource.C6(b6, this.b, false, 4, null));
        this.f5722a.d().a(ironSourceError);
    }

    @Override // com.ironsource.H6
    public void a() {
        this.f5722a.a("ad expired while loading");
    }

    @Override // com.ironsource.H6
    public void a(com.unity3d.mediation.LevelPlayAdInfo adInfo) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        this.f5722a.a("show success while loading");
    }
}
