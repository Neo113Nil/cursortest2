package com.ironsource;

/* renamed from: com.ironsource.z6, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3397z6 implements com.ironsource.A6, com.ironsource.InterfaceC3271s6 {

    /* renamed from: a, reason: collision with root package name */
    private final com.ironsource.C3325v6 f6858a;
    private final com.ironsource.C3218p6 b;
    private com.ironsource.C3218p6 c;

    public C3397z6(com.ironsource.C3325v6 strategy, com.ironsource.C3218p6 currentAdUnit, com.ironsource.C3218p6 c3218p6) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(strategy, "strategy");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currentAdUnit, "currentAdUnit");
        this.f6858a = strategy;
        this.b = currentAdUnit;
        this.c = c3218p6;
        currentAdUnit.a(this);
    }

    @Override // com.ironsource.A6
    public void a(android.app.Activity activity) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activity, "activity");
        this.f6858a.a("show called while showing");
    }

    @Override // com.ironsource.A6
    public void b(com.ironsource.C3218p6 adUnit, com.unity3d.mediation.LevelPlayAdInfo adInfo) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adUnit, "adUnit");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        if (adUnit == this.b) {
            this.f6858a.a("load success while current ad is showing");
        }
    }

    @Override // com.ironsource.A6
    public void c(com.ironsource.C3218p6 adUnit, com.unity3d.mediation.LevelPlayAdInfo adInfo) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adUnit, "adUnit");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        if (adUnit == this.b) {
            this.f6858a.a("ad info changed while current ad is showing");
        }
    }

    @Override // com.ironsource.K0
    public void e() {
        this.f6858a.c().e();
    }

    @Override // com.ironsource.A6
    public void loadAd() {
        this.f6858a.a("load called while showing");
    }

    @Override // com.ironsource.InterfaceC3271s6
    public void onClosed() {
        this.f6858a.a(a(this, null, 1, null));
        this.f6858a.c().onClosed();
    }

    @Override // com.ironsource.A6
    public void a(com.ironsource.C3218p6 adUnit, com.unity3d.mediation.LevelPlayAdInfo adInfo) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adUnit, "adUnit");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        if (kotlin.jvm.internal.Intrinsics.areEqual(adUnit, this.b)) {
            this.f6858a.d().a(adInfo);
        } else {
            this.f6858a.a("progressive show success while showing current ad");
        }
    }

    @Override // com.ironsource.A6
    public void b(com.ironsource.C3218p6 adUnit, com.ironsource.mediationsdk.logger.IronSourceError ironSourceError) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adUnit, "adUnit");
        if (adUnit == this.c) {
            this.c = null;
        } else {
            this.f6858a.a("load failed while current ad is showing");
        }
    }

    @Override // com.ironsource.A6
    public void a(com.ironsource.C3218p6 adUnit, com.ironsource.mediationsdk.logger.IronSourceError ironSourceError) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adUnit, "adUnit");
        if (!kotlin.jvm.internal.Intrinsics.areEqual(adUnit, this.b)) {
            this.f6858a.a("progressive show failed while showing current ad");
            return;
        }
        this.f6858a.a(a(ironSourceError));
        this.f6858a.d().c(ironSourceError);
    }

    @Override // com.ironsource.A6
    public void a(com.ironsource.C3218p6 adUnit) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adUnit, "adUnit");
        if (adUnit == this.c) {
            this.c = null;
        } else {
            this.f6858a.a("ad expired while current ad is showing");
        }
    }

    @Override // com.ironsource.InterfaceC3271s6
    public void a(com.unity3d.mediation.rewarded.LevelPlayReward reward) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reward, "reward");
        this.f6858a.c().a(reward);
    }

    static /* synthetic */ com.ironsource.A6 a(com.ironsource.C3397z6 c3397z6, com.ironsource.mediationsdk.logger.IronSourceError ironSourceError, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            ironSourceError = null;
        }
        return c3397z6.a(ironSourceError);
    }

    private final com.ironsource.A6 a(com.ironsource.mediationsdk.logger.IronSourceError ironSourceError) {
        if (com.ironsource.C2948a5.f6134a.a(ironSourceError)) {
            return new com.ironsource.C3361x6(this.f6858a, this.b, this.c, true);
        }
        com.ironsource.C3218p6 c3218p6 = this.c;
        if (c3218p6 == null) {
            return new com.ironsource.C3343w6(this.f6858a);
        }
        if (c3218p6.e() != null) {
            return new com.ironsource.C3361x6(this.f6858a, c3218p6, null, false, 8, null);
        }
        return new com.ironsource.C3379y6(this.f6858a, c3218p6, false);
    }
}
