package com.ironsource;

/* renamed from: com.ironsource.k6, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3128k6 implements com.ironsource.InterfaceC3200o6 {

    /* renamed from: a, reason: collision with root package name */
    private final com.ironsource.Xa f6337a;
    private com.unity3d.mediation.LevelPlayAdInfo b;
    private final com.ironsource.InterfaceC3216p4 c;
    private final long d;

    public C3128k6(com.ironsource.Xa adInternal, com.unity3d.mediation.LevelPlayAdInfo adInfo, com.ironsource.InterfaceC3216p4 currentTimeProvider) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adInternal, "adInternal");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currentTimeProvider, "currentTimeProvider");
        this.f6337a = adInternal;
        this.b = adInfo;
        this.c = currentTimeProvider;
        this.d = currentTimeProvider.a();
    }

    private final long d() {
        return this.c.a() - this.d;
    }

    @Override // com.ironsource.InterfaceC3200o6
    public void a(android.app.Activity activity, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activity, "activity");
        com.ironsource.C3064gd a2 = this.f6337a.f().a(this.f6337a.d(), str);
        com.unity3d.mediation.LevelPlayAdInfo levelPlayAdInfo = new com.unity3d.mediation.LevelPlayAdInfo(this.b, str);
        this.b = levelPlayAdInfo;
        com.ironsource.Xa xa = this.f6337a;
        xa.a(new com.ironsource.C3164m6(xa, levelPlayAdInfo));
        this.f6337a.c().a(activity, a2);
    }

    @Override // com.ironsource.InterfaceC3200o6
    public com.unity3d.mediation.LevelPlayAdInfo b() {
        return this.b;
    }

    @Override // com.ironsource.InterfaceC3200o6
    public com.ironsource.InterfaceC3122k0 c() {
        com.ironsource.G3 a2 = this.f6337a.l().g().a(this.f6337a.h());
        return a2.d() ? com.ironsource.InterfaceC3122k0.a.c.a(a2.e()) : com.ironsource.InterfaceC3122k0.b.f6332a;
    }

    @Override // com.ironsource.InterfaceC3200o6
    public void loadAd() {
        this.f6337a.f().e().h().a(java.lang.Long.valueOf(d()));
        this.f6337a.a(this.b);
    }

    @Override // com.ironsource.InterfaceC3200o6
    public void onAdClicked() {
        this.f6337a.b("onAdClicked on loaded state");
    }

    @Override // com.ironsource.InterfaceC3200o6
    public void onAdClosed() {
        this.f6337a.b("onAdClosed on loaded state");
    }

    @Override // com.ironsource.InterfaceC3200o6
    public void onAdDisplayed(com.unity3d.mediation.LevelPlayAdInfo adInfo) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        this.f6337a.b("onAdDisplayed on loaded state");
    }

    @Override // com.ironsource.InterfaceC3200o6
    public void onAdInfoChanged(final com.unity3d.mediation.LevelPlayAdInfo adInfo) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        com.ironsource.C3212p0 f = this.f6337a.f();
        com.ironsource.mediationsdk.logger.IronLog.INTERNAL.verbose(com.ironsource.C3212p0.a(f, "onAdInfoChanged adInfo: " + adInfo, (java.lang.String) null, 2, (java.lang.Object) null));
        f.e().h().a(this.b, adInfo);
        this.b = adInfo;
        f.e(new java.lang.Runnable() { // from class: com.ironsource.k6$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                com.ironsource.C3128k6.a(com.ironsource.C3128k6.this, adInfo);
            }
        });
    }

    @Override // com.ironsource.InterfaceC3200o6
    public void onAdLoadFailed(com.unity3d.mediation.LevelPlayAdError error) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(error, "error");
        this.f6337a.b("onAdLoadFailed on loaded state with error: " + error.getErrorMessage());
    }

    @Override // com.ironsource.InterfaceC3200o6
    public void onAdLoaded(com.unity3d.mediation.LevelPlayAdInfo adInfo) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        this.f6337a.b("onAdLoaded on loaded state");
    }

    @Override // com.ironsource.InterfaceC3200o6
    public void a() {
        com.ironsource.mediationsdk.logger.IronLog.INTERNAL.verbose(com.ironsource.C3212p0.a(this.f6337a.f(), "onAdExpired", (java.lang.String) null, 2, (java.lang.Object) null));
        this.f6337a.a(com.ironsource.C3039f6.a.Expired);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(com.ironsource.C3128k6 this$0, com.unity3d.mediation.LevelPlayAdInfo adInfo) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adInfo, "$adInfo");
        com.ironsource.Ya k = this$0.f6337a.k();
        if (k != null) {
            k.onAdInfoChanged(adInfo);
        }
    }

    @Override // com.ironsource.InterfaceC3200o6
    public void a(com.unity3d.mediation.LevelPlayAdError error) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(error, "error");
        this.f6337a.b("onAdDisplayFailed on loaded state with error: " + error.getErrorMessage());
    }
}
