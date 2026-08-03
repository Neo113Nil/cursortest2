package com.ironsource;

/* loaded from: classes5.dex */
public final class D6 implements com.ironsource.H6 {

    /* renamed from: a, reason: collision with root package name */
    private final com.ironsource.B6 f5669a;
    private final com.ironsource.C3218p6 b;
    private final com.ironsource.C3218p6 c;
    private com.unity3d.mediation.LevelPlayAdInfo d;

    public D6(com.ironsource.B6 strategy, com.ironsource.C3218p6 currentAdUnit, com.ironsource.C3218p6 progressiveAdUnit, com.unity3d.mediation.LevelPlayAdInfo adInfo) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(strategy, "strategy");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currentAdUnit, "currentAdUnit");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(progressiveAdUnit, "progressiveAdUnit");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        this.f5669a = strategy;
        this.b = currentAdUnit;
        this.c = progressiveAdUnit;
        this.d = adInfo;
    }

    @Override // com.ironsource.H6
    public void a(android.app.Activity activity) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activity, "activity");
        this.f5669a.d().c(new com.ironsource.mediationsdk.logger.IronSourceError(com.unity3d.mediation.LevelPlayAdError.ERROR_CODE_SHOW_BEFORE_LOAD_SUCCESS_CALLBACK, "Show called before load success"));
    }

    @Override // com.ironsource.H6
    public void b(com.unity3d.mediation.LevelPlayAdInfo adInfo) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        this.d = adInfo;
    }

    @Override // com.ironsource.H6
    public void c(com.unity3d.mediation.LevelPlayAdInfo adInfo) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        this.f5669a.a("load success on progressive ad unit is already loaded");
    }

    @Override // com.ironsource.H6
    public void loadAd() {
        this.f5669a.d().b(this.d);
        com.ironsource.B6 b6 = this.f5669a;
        b6.a(new com.ironsource.F6(b6, this.c));
    }

    @Override // com.ironsource.H6
    public void c(com.ironsource.mediationsdk.logger.IronSourceError ironSourceError) {
        this.f5669a.a("show failed on progressive ad unit that already loaded");
    }

    @Override // com.ironsource.H6
    public void a(com.ironsource.mediationsdk.logger.IronSourceError ironSourceError) {
        this.f5669a.a("load failed on progressive ad unit that already loaded");
    }

    @Override // com.ironsource.H6
    public void a() {
        com.ironsource.B6 b6 = this.f5669a;
        b6.a(new com.ironsource.C6(b6, this.b, true));
    }

    @Override // com.ironsource.H6
    public void a(com.unity3d.mediation.LevelPlayAdInfo adInfo) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        this.f5669a.a("show success on progressive ad unit that already loaded");
    }
}
