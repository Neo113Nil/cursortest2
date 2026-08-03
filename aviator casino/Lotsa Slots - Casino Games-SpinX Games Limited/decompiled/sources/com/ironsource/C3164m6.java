package com.ironsource;

/* renamed from: com.ironsource.m6, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3164m6 implements com.ironsource.InterfaceC3200o6 {

    /* renamed from: a, reason: collision with root package name */
    private final com.ironsource.Xa f6386a;
    private final com.unity3d.mediation.LevelPlayAdInfo b;

    public C3164m6(com.ironsource.Xa adInternal, com.unity3d.mediation.LevelPlayAdInfo adInfo) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adInternal, "adInternal");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        this.f6386a = adInternal;
        this.b = adInfo;
    }

    @Override // com.ironsource.InterfaceC3200o6
    public void a(android.app.Activity activity, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activity, "activity");
        java.lang.String uuid = this.f6386a.e().toString();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(uuid, "adInternal.adId.toString()");
        this.f6386a.a(new com.unity3d.mediation.LevelPlayAdError(uuid, this.f6386a.h(), com.unity3d.mediation.LevelPlayAdError.ERROR_CODE_SHOW_WHILE_SHOW, "Ad is already showing"), this.b);
    }

    @Override // com.ironsource.InterfaceC3200o6
    public com.unity3d.mediation.LevelPlayAdInfo b() {
        return this.b;
    }

    @Override // com.ironsource.InterfaceC3200o6
    public com.ironsource.InterfaceC3122k0 c() {
        return new com.ironsource.InterfaceC3122k0.a("ad is showing");
    }

    @Override // com.ironsource.InterfaceC3200o6
    public void loadAd() {
        java.lang.String uuid = this.f6386a.e().toString();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(uuid, "adInternal.adId.toString()");
        com.ironsource.Xa.a(this.f6386a, new com.unity3d.mediation.LevelPlayAdError(uuid, this.f6386a.h(), com.unity3d.mediation.LevelPlayAdError.ERROR_CODE_LOAD_WHILE_SHOW, "Load is called while ad is showing"), 0L, 2, null);
    }

    @Override // com.ironsource.InterfaceC3200o6
    public void onAdClicked() {
        this.f6386a.b("onAdClicked on showing state");
    }

    @Override // com.ironsource.InterfaceC3200o6
    public void onAdClosed() {
        this.f6386a.b("onAdClosed on showing state");
    }

    @Override // com.ironsource.InterfaceC3200o6
    public void onAdDisplayed(com.unity3d.mediation.LevelPlayAdInfo adInfo) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        com.ironsource.C3212p0 f = this.f6386a.f();
        final com.unity3d.mediation.LevelPlayAdInfo levelPlayAdInfo = new com.unity3d.mediation.LevelPlayAdInfo(adInfo, this.b.getPlacementName());
        com.ironsource.mediationsdk.logger.IronLog.INTERNAL.verbose(com.ironsource.C3212p0.a(f, "onAdDisplayed adInfo: " + levelPlayAdInfo, (java.lang.String) null, 2, (java.lang.Object) null));
        f.e().h().e();
        com.ironsource.Xa xa = this.f6386a;
        xa.a(new com.ironsource.C3182n6(xa, levelPlayAdInfo));
        f.e(new java.lang.Runnable() { // from class: com.ironsource.m6$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                com.ironsource.C3164m6.a(com.ironsource.C3164m6.this, levelPlayAdInfo);
            }
        });
    }

    @Override // com.ironsource.InterfaceC3200o6
    public void onAdInfoChanged(com.unity3d.mediation.LevelPlayAdInfo adInfo) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        this.f6386a.b("onAdInfoChanged on showing state");
    }

    @Override // com.ironsource.InterfaceC3200o6
    public void onAdLoadFailed(com.unity3d.mediation.LevelPlayAdError error) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(error, "error");
        this.f6386a.b("onAdLoadFailed on showing state with error: " + error.getErrorMessage());
    }

    @Override // com.ironsource.InterfaceC3200o6
    public void onAdLoaded(com.unity3d.mediation.LevelPlayAdInfo adInfo) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        this.f6386a.b("onAdLoaded on showing state");
    }

    @Override // com.ironsource.InterfaceC3200o6
    public void a(com.unity3d.mediation.LevelPlayAdError error) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(error, "error");
        this.f6386a.a(a(error, this.b));
        this.f6386a.a(error, this.b);
    }

    private final com.ironsource.InterfaceC3200o6 a(com.unity3d.mediation.LevelPlayAdError levelPlayAdError, com.unity3d.mediation.LevelPlayAdInfo levelPlayAdInfo) {
        if (com.ironsource.C2948a5.f6134a.a(com.ironsource.Yf.f6105a.a(levelPlayAdError))) {
            com.ironsource.Xa xa = this.f6386a;
            return new com.ironsource.C3128k6(xa, levelPlayAdInfo, xa.j());
        }
        return new com.ironsource.C3039f6(this.f6386a, com.ironsource.C3039f6.a.ShowFailed);
    }

    @Override // com.ironsource.InterfaceC3200o6
    public void a() {
        this.f6386a.b("onAdExpired on showing state");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(com.ironsource.C3164m6 this$0, com.unity3d.mediation.LevelPlayAdInfo adInfoWithPlacement) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adInfoWithPlacement, "$adInfoWithPlacement");
        com.ironsource.Ya k = this$0.f6386a.k();
        if (k != null) {
            k.onAdDisplayed(adInfoWithPlacement);
        }
    }
}
