package com.ironsource;

/* renamed from: com.ironsource.w6, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3343w6 implements com.ironsource.A6 {

    /* renamed from: a, reason: collision with root package name */
    private final com.ironsource.C3325v6 f6802a;

    public C3343w6(com.ironsource.C3325v6 strategy) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(strategy, "strategy");
        this.f6802a = strategy;
    }

    @Override // com.ironsource.A6
    public void a(android.app.Activity activity) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activity, "activity");
        this.f6802a.a("show called before load success");
    }

    @Override // com.ironsource.A6
    public void b(com.ironsource.C3218p6 adUnit, com.unity3d.mediation.LevelPlayAdInfo adInfo) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adUnit, "adUnit");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        this.f6802a.a("load success before load called");
    }

    @Override // com.ironsource.A6
    public void c(com.ironsource.C3218p6 adUnit, com.unity3d.mediation.LevelPlayAdInfo adInfo) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adUnit, "adUnit");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        this.f6802a.a("load success with better ad before load called");
    }

    @Override // com.ironsource.A6
    public void loadAd() {
        com.ironsource.C3218p6 a2 = this.f6802a.b().a(true, this.f6802a.c());
        this.f6802a.a(new com.ironsource.C3379y6(this.f6802a, a2, true));
        a2.a(this.f6802a);
    }

    @Override // com.ironsource.A6
    public void a(com.ironsource.C3218p6 adUnit) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adUnit, "adUnit");
        this.f6802a.a("ad expired before load called");
    }

    @Override // com.ironsource.A6
    public void b(com.ironsource.C3218p6 adUnit, com.ironsource.mediationsdk.logger.IronSourceError ironSourceError) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adUnit, "adUnit");
        this.f6802a.a("load failed before load called");
    }

    @Override // com.ironsource.A6
    public void a(com.ironsource.C3218p6 adUnit, com.unity3d.mediation.LevelPlayAdInfo adInfo) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adUnit, "adUnit");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        this.f6802a.a("ad display success before load called");
    }

    @Override // com.ironsource.A6
    public void a(com.ironsource.C3218p6 adUnit, com.ironsource.mediationsdk.logger.IronSourceError ironSourceError) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adUnit, "adUnit");
        this.f6802a.a("ad display failed before load called");
    }
}
