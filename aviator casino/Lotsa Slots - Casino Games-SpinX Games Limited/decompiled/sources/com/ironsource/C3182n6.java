package com.ironsource;

/* renamed from: com.ironsource.n6, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3182n6 implements com.ironsource.InterfaceC3200o6 {

    /* renamed from: a, reason: collision with root package name */
    private final com.ironsource.Xa f6492a;
    private final com.unity3d.mediation.LevelPlayAdInfo b;

    public C3182n6(com.ironsource.Xa adInternal, com.unity3d.mediation.LevelPlayAdInfo adInfo) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adInternal, "adInternal");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        this.f6492a = adInternal;
        this.b = adInfo;
    }

    @Override // com.ironsource.InterfaceC3200o6
    public void a(android.app.Activity activity, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activity, "activity");
        java.lang.String uuid = this.f6492a.e().toString();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(uuid, "adInternal.adId.toString()");
        this.f6492a.a(new com.unity3d.mediation.LevelPlayAdError(uuid, this.f6492a.h(), com.unity3d.mediation.LevelPlayAdError.ERROR_CODE_SHOW_WHILE_SHOW, "Ad is already shown"), this.b);
    }

    @Override // com.ironsource.InterfaceC3200o6
    public com.unity3d.mediation.LevelPlayAdInfo b() {
        return this.b;
    }

    @Override // com.ironsource.InterfaceC3200o6
    public com.ironsource.InterfaceC3122k0 c() {
        return new com.ironsource.InterfaceC3122k0.a("ad is shown");
    }

    @Override // com.ironsource.InterfaceC3200o6
    public void loadAd() {
        java.lang.String uuid = this.f6492a.e().toString();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(uuid, "adInternal.adId.toString()");
        com.ironsource.Xa.a(this.f6492a, new com.unity3d.mediation.LevelPlayAdError(uuid, this.f6492a.h(), com.unity3d.mediation.LevelPlayAdError.ERROR_CODE_LOAD_WHILE_SHOW, "Load is called while ad is shown"), 0L, 2, null);
    }

    @Override // com.ironsource.InterfaceC3200o6
    public void onAdClicked() {
        com.ironsource.mediationsdk.logger.IronLog.INTERNAL.verbose(com.ironsource.C3212p0.a(this.f6492a.f(), "onAdClicked adInfo: " + this.b, (java.lang.String) null, 2, (java.lang.Object) null));
        this.f6492a.f().e(new java.lang.Runnable() { // from class: com.ironsource.n6$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                com.ironsource.C3182n6.a(com.ironsource.C3182n6.this);
            }
        });
    }

    @Override // com.ironsource.InterfaceC3200o6
    public void onAdClosed() {
        com.ironsource.mediationsdk.logger.IronLog.INTERNAL.verbose(com.ironsource.C3212p0.a(this.f6492a.f(), "onAdClosed adInfo: " + this.b, (java.lang.String) null, 2, (java.lang.Object) null));
        this.f6492a.f().d(new java.lang.Runnable() { // from class: com.ironsource.n6$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                com.ironsource.C3182n6.b(com.ironsource.C3182n6.this);
            }
        });
        this.f6492a.f().e(new java.lang.Runnable() { // from class: com.ironsource.n6$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                com.ironsource.C3182n6.c(com.ironsource.C3182n6.this);
            }
        });
    }

    @Override // com.ironsource.InterfaceC3200o6
    public void onAdDisplayed(com.unity3d.mediation.LevelPlayAdInfo adInfo) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        this.f6492a.b("onAdDisplayed on shown state");
    }

    @Override // com.ironsource.InterfaceC3200o6
    public void onAdInfoChanged(com.unity3d.mediation.LevelPlayAdInfo adInfo) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        this.f6492a.b("onAdInfoChanged on shown state");
    }

    @Override // com.ironsource.InterfaceC3200o6
    public void onAdLoadFailed(com.unity3d.mediation.LevelPlayAdError error) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(error, "error");
        this.f6492a.b("onAdLoadFailed on shown state with error: " + error.getErrorMessage());
    }

    @Override // com.ironsource.InterfaceC3200o6
    public void onAdLoaded(com.unity3d.mediation.LevelPlayAdInfo adInfo) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        this.f6492a.b("onAdLoaded on shown state");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(com.ironsource.C3182n6 this$0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.f6492a.a(com.ironsource.C3039f6.a.Closed);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(com.ironsource.C3182n6 this$0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        com.ironsource.Ya k = this$0.f6492a.k();
        if (k != null) {
            k.onAdClosed(this$0.b);
        }
    }

    @Override // com.ironsource.InterfaceC3200o6
    public void a() {
        this.f6492a.b("onAdExpired on shown state");
    }

    @Override // com.ironsource.InterfaceC3200o6
    public void a(com.unity3d.mediation.LevelPlayAdError error) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(error, "error");
        this.f6492a.b("onAdDisplayFailed on shown state with error: " + error.getErrorMessage());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(com.ironsource.C3182n6 this$0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        com.ironsource.Ya k = this$0.f6492a.k();
        if (k != null) {
            k.onAdClicked(this$0.b);
        }
    }
}
