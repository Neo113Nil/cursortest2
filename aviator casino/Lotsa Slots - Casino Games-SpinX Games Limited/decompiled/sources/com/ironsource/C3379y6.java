package com.ironsource;

/* renamed from: com.ironsource.y6, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3379y6 implements com.ironsource.A6 {

    /* renamed from: a, reason: collision with root package name */
    private final com.ironsource.C3325v6 f6849a;
    private final com.ironsource.C3218p6 b;
    private boolean c;

    public C3379y6(com.ironsource.C3325v6 strategy, com.ironsource.C3218p6 currentAdUnit, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(strategy, "strategy");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currentAdUnit, "currentAdUnit");
        this.f6849a = strategy;
        this.b = currentAdUnit;
        this.c = z;
    }

    @Override // com.ironsource.A6
    public void a(android.app.Activity activity) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activity, "activity");
        this.f6849a.a("show called while loading");
    }

    @Override // com.ironsource.A6
    public void b(com.ironsource.C3218p6 adUnit, com.unity3d.mediation.LevelPlayAdInfo adInfo) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adUnit, "adUnit");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        if (!this.c) {
            this.f6849a.a(new com.ironsource.C3361x6(this.f6849a, this.b, null, false));
            return;
        }
        com.ironsource.C3218p6 a2 = this.f6849a.b().a(false, this.f6849a.c());
        this.f6849a.a(new com.ironsource.C3361x6(this.f6849a, this.b, a2, true));
        this.f6849a.d().b(adInfo);
        a2.a(this.f6849a);
    }

    @Override // com.ironsource.A6
    public void c(com.ironsource.C3218p6 adUnit, com.unity3d.mediation.LevelPlayAdInfo adInfo) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adUnit, "adUnit");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        this.f6849a.a("ad info changed while loading");
    }

    @Override // com.ironsource.A6
    public void loadAd() {
        if (this.c) {
            this.f6849a.a("load called while loading");
        }
        this.c = true;
    }

    @Override // com.ironsource.A6
    public void a(com.ironsource.C3218p6 adUnit, com.unity3d.mediation.LevelPlayAdInfo adInfo) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adUnit, "adUnit");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        this.f6849a.a("show success while loading");
    }

    @Override // com.ironsource.A6
    public void a(com.ironsource.C3218p6 adUnit, com.ironsource.mediationsdk.logger.IronSourceError ironSourceError) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adUnit, "adUnit");
        this.f6849a.a("show failed while loading");
    }

    @Override // com.ironsource.A6
    public void a(com.ironsource.C3218p6 adUnit) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adUnit, "adUnit");
        this.f6849a.a("ad expired while loading");
    }

    @Override // com.ironsource.A6
    public void b(com.ironsource.C3218p6 adUnit, com.ironsource.mediationsdk.logger.IronSourceError ironSourceError) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adUnit, "adUnit");
        this.f6849a.a(new com.ironsource.C3343w6(this.f6849a));
        if (this.c) {
            this.f6849a.d().a(ironSourceError);
        }
    }
}
