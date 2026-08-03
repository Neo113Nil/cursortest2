package com.ironsource;

/* loaded from: classes5.dex */
public final class C6 implements com.ironsource.H6 {

    /* renamed from: a, reason: collision with root package name */
    private final com.ironsource.B6 f5651a;
    private final com.ironsource.C3218p6 b;
    private final boolean c;

    public C6(com.ironsource.B6 strategy, com.ironsource.C3218p6 c3218p6, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(strategy, "strategy");
        this.f5651a = strategy;
        this.b = c3218p6;
        this.c = z;
    }

    @Override // com.ironsource.H6
    public void a(android.app.Activity activity) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activity, "activity");
        this.f5651a.d().c(new com.ironsource.mediationsdk.logger.IronSourceError(com.unity3d.mediation.LevelPlayAdError.ERROR_CODE_SHOW_BEFORE_LOAD_SUCCESS_CALLBACK, this.c ? "Show called on expired ad" : "Show called before load success"));
    }

    @Override // com.ironsource.H6
    public void b(com.unity3d.mediation.LevelPlayAdInfo adInfo) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        this.f5651a.a(this.c ? "load with better ad on expired ad" : "load success with better ad before load success");
    }

    @Override // com.ironsource.H6
    public void c(com.unity3d.mediation.LevelPlayAdInfo adInfo) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        this.f5651a.a(this.c ? "load success on expired ad" : "load success before load called");
    }

    @Override // com.ironsource.H6
    public void loadAd() {
        com.ironsource.C3218p6 a2 = this.f5651a.b().a(true, this.f5651a.c());
        com.ironsource.B6 b6 = this.f5651a;
        b6.a(new com.ironsource.G6(b6, a2));
        a2.a(this.f5651a);
    }

    @Override // com.ironsource.H6
    public void c(com.ironsource.mediationsdk.logger.IronSourceError ironSourceError) {
        this.f5651a.a(this.c ? "show failed on expired ad" : "show failed before load called");
    }

    public /* synthetic */ C6(com.ironsource.B6 b6, com.ironsource.C3218p6 c3218p6, boolean z, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(b6, c3218p6, (i & 4) != 0 ? false : z);
    }

    @Override // com.ironsource.H6
    public void a(com.ironsource.mediationsdk.logger.IronSourceError ironSourceError) {
        this.f5651a.a(this.c ? "load failed on expired ad" : "load failed before load called");
    }

    @Override // com.ironsource.H6
    public void a() {
        this.f5651a.a(this.c ? "ad expired on expired ad" : "ad expired before load called");
    }

    @Override // com.ironsource.H6
    public void a(com.unity3d.mediation.LevelPlayAdInfo adInfo) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        this.f5651a.a(this.c ? "show success on expired ad" : "show success before load called");
    }
}
