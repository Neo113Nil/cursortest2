package com.ironsource;

/* loaded from: classes5.dex */
public final class F6 implements com.ironsource.H6 {

    /* renamed from: a, reason: collision with root package name */
    private final com.ironsource.B6 f5698a;
    private final com.ironsource.C3218p6 b;

    public F6(com.ironsource.B6 strategy, com.ironsource.C3218p6 adUnit) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(strategy, "strategy");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adUnit, "adUnit");
        this.f5698a = strategy;
        this.b = adUnit;
    }

    @Override // com.ironsource.H6
    public void a(android.app.Activity activity) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activity, "activity");
        this.b.a(activity, this.f5698a);
    }

    @Override // com.ironsource.H6
    public void b(com.unity3d.mediation.LevelPlayAdInfo adInfo) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        this.f5698a.d().onAdInfoChanged(adInfo);
    }

    @Override // com.ironsource.H6
    public void c(com.unity3d.mediation.LevelPlayAdInfo adInfo) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        this.f5698a.a("Ad unit is already loaded");
    }

    @Override // com.ironsource.H6
    public void loadAd() {
        com.ironsource.B6 b6 = this.f5698a;
        b6.a(new com.ironsource.C6(b6, null, false, 4, null));
        this.f5698a.loadAd();
    }

    @Override // com.ironsource.H6
    public void a(com.ironsource.mediationsdk.logger.IronSourceError ironSourceError) {
        this.f5698a.a("load failed after ad unit is already loaded");
    }

    @Override // com.ironsource.H6
    public void c(com.ironsource.mediationsdk.logger.IronSourceError ironSourceError) {
        if (!com.ironsource.C2948a5.f6134a.a(ironSourceError)) {
            com.ironsource.B6 b6 = this.f5698a;
            b6.a(new com.ironsource.C6(b6, null, false, 4, null));
        }
        this.f5698a.d().c(ironSourceError);
    }

    @Override // com.ironsource.H6
    public void a() {
        com.ironsource.B6 b6 = this.f5698a;
        b6.a(new com.ironsource.C6(b6, null, true));
        this.f5698a.d().a();
    }

    @Override // com.ironsource.H6
    public void a(com.unity3d.mediation.LevelPlayAdInfo adInfo) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        this.f5698a.d().a(adInfo);
        com.ironsource.C3218p6 a2 = this.f5698a.b().a(false, this.f5698a.c());
        com.ironsource.B6 b6 = this.f5698a;
        b6.a(new com.ironsource.E6(b6, this.b, a2));
        a2.a(this.f5698a);
    }
}
