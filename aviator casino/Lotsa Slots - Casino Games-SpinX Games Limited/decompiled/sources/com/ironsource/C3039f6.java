package com.ironsource;

/* renamed from: com.ironsource.f6, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3039f6 implements com.ironsource.InterfaceC3200o6 {

    /* renamed from: a, reason: collision with root package name */
    private final com.ironsource.Xa f6253a;
    private final com.ironsource.C3039f6.a b;
    private final com.unity3d.mediation.LevelPlayAdInfo c;

    /* renamed from: com.ironsource.f6$a */
    public enum a {
        Created,
        Closed,
        Expired,
        ShowFailed,
        LoadFailed
    }

    public C3039f6(com.ironsource.Xa adInternal, com.ironsource.C3039f6.a status) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adInternal, "adInternal");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(status, "status");
        this.f6253a = adInternal;
        this.b = status;
        java.lang.String uuid = adInternal.e().toString();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(uuid, "adInternal.adId.toString()");
        this.c = new com.unity3d.mediation.LevelPlayAdInfo(uuid, adInternal.h(), adInternal.d().toString(), null, null, null, null, 120, null);
    }

    private final boolean d() {
        if (this.f6253a.h().length() == 0) {
            com.ironsource.Xa xa = this.f6253a;
            java.lang.String uuid = this.f6253a.e().toString();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(uuid, "adInternal.adId.toString()");
            com.ironsource.Xa.a(xa, new com.unity3d.mediation.LevelPlayAdError(uuid, this.f6253a.h(), com.unity3d.mediation.LevelPlayAdError.ERROR_CODE_NO_AD_UNIT_ID_SPECIFIED, "Ad unit ID should be specified"), 0L, 2, null);
            return false;
        }
        if (!this.f6253a.f().g()) {
            com.ironsource.Xa xa2 = this.f6253a;
            java.lang.String uuid2 = this.f6253a.e().toString();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(uuid2, "adInternal.adId.toString()");
            com.ironsource.Xa.a(xa2, new com.unity3d.mediation.LevelPlayAdError(uuid2, this.f6253a.h(), com.unity3d.mediation.LevelPlayAdError.ERROR_CODE_LOAD_BEFORE_INIT_SUCCESS_CALLBACK, "Load must be called after init success callback"), 0L, 2, null);
            return false;
        }
        com.ironsource.Ua a2 = this.f6253a.l().f().a();
        if (a2 != null && a2.a(this.f6253a.h(), this.f6253a.d())) {
            return true;
        }
        com.ironsource.Xa xa3 = this.f6253a;
        java.lang.String uuid3 = this.f6253a.e().toString();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(uuid3, "adInternal.adId.toString()");
        com.ironsource.Xa.a(xa3, new com.unity3d.mediation.LevelPlayAdError(uuid3, this.f6253a.h(), com.unity3d.mediation.LevelPlayAdError.ERROR_CODE_INVALID_AD_UNIT_ID, "Invalid ad unit id"), 0L, 2, null);
        return false;
    }

    @Override // com.ironsource.InterfaceC3200o6
    public void a(android.app.Activity activity, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activity, "activity");
        java.lang.String str2 = this.b == com.ironsource.C3039f6.a.Expired ? "Show called on expired ad" : "Show called before load success";
        java.lang.String uuid = this.f6253a.e().toString();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(uuid, "adInternal.adId.toString()");
        this.f6253a.a(new com.unity3d.mediation.LevelPlayAdError(uuid, this.f6253a.h(), com.unity3d.mediation.LevelPlayAdError.ERROR_CODE_SHOW_BEFORE_LOAD_SUCCESS_CALLBACK, str2), this.c);
    }

    @Override // com.ironsource.InterfaceC3200o6
    public com.unity3d.mediation.LevelPlayAdInfo b() {
        return this.c;
    }

    @Override // com.ironsource.InterfaceC3200o6
    public com.ironsource.InterfaceC3122k0 c() {
        return new com.ironsource.InterfaceC3122k0.a(this.b == com.ironsource.C3039f6.a.Expired ? "ad is invalid due to loading time" : "load ad was not called");
    }

    @Override // com.ironsource.InterfaceC3200o6
    public void loadAd() {
        if (d()) {
            this.f6253a.o();
        }
    }

    @Override // com.ironsource.InterfaceC3200o6
    public void onAdClicked() {
        this.f6253a.b("onAdClicked on " + this.b + " state");
    }

    @Override // com.ironsource.InterfaceC3200o6
    public void onAdClosed() {
        this.f6253a.b("onAdClosed on " + this.b + " state");
    }

    @Override // com.ironsource.InterfaceC3200o6
    public void onAdDisplayed(com.unity3d.mediation.LevelPlayAdInfo adInfo) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        this.f6253a.b("onAdDisplayed on " + this.b + " state");
    }

    @Override // com.ironsource.InterfaceC3200o6
    public void onAdInfoChanged(com.unity3d.mediation.LevelPlayAdInfo adInfo) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        this.f6253a.b("onAdInfoChanged on " + this.b + " state");
    }

    @Override // com.ironsource.InterfaceC3200o6
    public void onAdLoadFailed(com.unity3d.mediation.LevelPlayAdError error) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(error, "error");
        this.f6253a.b("onAdLoadFailed on " + this.b + " state with error: " + error.getErrorMessage());
    }

    @Override // com.ironsource.InterfaceC3200o6
    public void onAdLoaded(com.unity3d.mediation.LevelPlayAdInfo adInfo) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        this.f6253a.b("onAdLoaded on " + this.b + " state");
    }

    @Override // com.ironsource.InterfaceC3200o6
    public void a(com.unity3d.mediation.LevelPlayAdError error) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(error, "error");
        this.f6253a.b("onAdDisplayFailed on " + this.b + " state with error: " + error.getErrorMessage());
    }

    @Override // com.ironsource.InterfaceC3200o6
    public void a() {
        this.f6253a.b("onAdExpired on " + this.b + " state");
    }

    public /* synthetic */ C3039f6(com.ironsource.Xa xa, com.ironsource.C3039f6.a aVar, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(xa, (i & 2) != 0 ? com.ironsource.C3039f6.a.Created : aVar);
    }
}
