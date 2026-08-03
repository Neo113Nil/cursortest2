package com.ironsource;

/* renamed from: com.ironsource.l6, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3146l6 implements com.ironsource.InterfaceC3200o6 {

    /* renamed from: a, reason: collision with root package name */
    private final com.ironsource.Xa f6367a;
    private final com.ironsource.InterfaceC3216p4 b;
    private final long c;
    private final com.unity3d.mediation.LevelPlayAdInfo d;

    public C3146l6(com.ironsource.Xa adInternal, com.ironsource.InterfaceC3216p4 currentTimeProvider) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adInternal, "adInternal");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currentTimeProvider, "currentTimeProvider");
        this.f6367a = adInternal;
        this.b = currentTimeProvider;
        this.c = currentTimeProvider.a();
        java.lang.String uuid = adInternal.e().toString();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(uuid, "adInternal.adId.toString()");
        this.d = new com.unity3d.mediation.LevelPlayAdInfo(uuid, adInternal.h(), adInternal.d().toString(), null, null, null, null, 120, null);
    }

    @Override // com.ironsource.InterfaceC3200o6
    public void a(android.app.Activity activity, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activity, "activity");
        java.lang.String uuid = this.f6367a.e().toString();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(uuid, "adInternal.adId.toString()");
        this.f6367a.a(new com.unity3d.mediation.LevelPlayAdError(uuid, this.f6367a.h(), com.unity3d.mediation.LevelPlayAdError.ERROR_CODE_SHOW_BEFORE_LOAD_SUCCESS_CALLBACK, "Show is called while loading ad"), this.d);
    }

    @Override // com.ironsource.InterfaceC3200o6
    public com.unity3d.mediation.LevelPlayAdInfo b() {
        return this.d;
    }

    @Override // com.ironsource.InterfaceC3200o6
    public com.ironsource.InterfaceC3122k0 c() {
        return new com.ironsource.InterfaceC3122k0.a("Ad is loading");
    }

    @Override // com.ironsource.InterfaceC3200o6
    public void loadAd() {
        java.lang.String uuid = this.f6367a.e().toString();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(uuid, "adInternal.adId.toString()");
        this.f6367a.a(new com.unity3d.mediation.LevelPlayAdError(uuid, this.f6367a.h(), com.unity3d.mediation.LevelPlayAdError.ERROR_CODE_LOAD_FAILED_ALREADY_CALLED, "Load is already called"), this.b.a() - this.c);
    }

    @Override // com.ironsource.InterfaceC3200o6
    public void onAdClicked() {
        this.f6367a.b("onAdClicked on loading state");
    }

    @Override // com.ironsource.InterfaceC3200o6
    public void onAdClosed() {
        this.f6367a.b("onAdClosed on loading state");
    }

    @Override // com.ironsource.InterfaceC3200o6
    public void onAdDisplayed(com.unity3d.mediation.LevelPlayAdInfo adInfo) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        this.f6367a.b("onAdDisplayed on loading state");
    }

    @Override // com.ironsource.InterfaceC3200o6
    public void onAdInfoChanged(com.unity3d.mediation.LevelPlayAdInfo adInfo) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        this.f6367a.b("onAdInfoChanged on loading state");
    }

    @Override // com.ironsource.InterfaceC3200o6
    public void onAdLoadFailed(com.unity3d.mediation.LevelPlayAdError error) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(error, "error");
        this.f6367a.a(error, this.b.a() - this.c);
        this.f6367a.a(com.ironsource.C3039f6.a.LoadFailed);
    }

    @Override // com.ironsource.InterfaceC3200o6
    public void onAdLoaded(com.unity3d.mediation.LevelPlayAdInfo adInfo) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        com.ironsource.Xa xa = this.f6367a;
        xa.a(new com.ironsource.C3128k6(xa, adInfo, this.b));
        this.f6367a.a(adInfo);
    }

    @Override // com.ironsource.InterfaceC3200o6
    public void a() {
        this.f6367a.b("onAdExpired on loading state");
    }

    @Override // com.ironsource.InterfaceC3200o6
    public void a(com.unity3d.mediation.LevelPlayAdError error) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(error, "error");
        this.f6367a.b("onAdDisplayFailed on loading state with error: " + error.getErrorMessage());
    }
}
