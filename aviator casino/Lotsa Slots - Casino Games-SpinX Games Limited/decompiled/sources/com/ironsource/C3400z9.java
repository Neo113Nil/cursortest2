package com.ironsource;

/* renamed from: com.ironsource.z9, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3400z9 implements com.ironsource.V<com.unity3d.ironsourceads.interstitial.InterstitialAd> {

    /* renamed from: a, reason: collision with root package name */
    private final com.ironsource.InterfaceC2995cg f6860a;
    private final com.unity3d.ironsourceads.interstitial.InterstitialAdLoaderListener b;

    public C3400z9(com.ironsource.InterfaceC2995cg threadManager, com.unity3d.ironsourceads.interstitial.InterstitialAdLoaderListener publisherListener) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(threadManager, "threadManager");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(publisherListener, "publisherListener");
        this.f6860a = threadManager;
        this.b = publisherListener;
    }

    @Override // com.ironsource.V
    public void b(final com.ironsource.mediationsdk.logger.IronSourceError error) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(error, "error");
        this.f6860a.a(new java.lang.Runnable() { // from class: com.ironsource.z9$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                com.ironsource.C3400z9.a(com.ironsource.mediationsdk.logger.IronSourceError.this, this);
            }
        });
    }

    @Override // com.ironsource.V
    public void a(final com.unity3d.ironsourceads.interstitial.InterstitialAd adObject) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adObject, "adObject");
        this.f6860a.a(new java.lang.Runnable() { // from class: com.ironsource.z9$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                com.ironsource.C3400z9.a(com.unity3d.ironsourceads.interstitial.InterstitialAd.this, this);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(com.unity3d.ironsourceads.interstitial.InterstitialAd adObject, com.ironsource.C3400z9 this$0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adObject, "$adObject");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        com.ironsource.mediationsdk.logger.IronLog.CALLBACK.info("InterstitialAdLoaderListener.onInterstitialAdLoaded adInfo: " + adObject.getAdInfo());
        this$0.b.onInterstitialAdLoaded(adObject);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(com.ironsource.mediationsdk.logger.IronSourceError error, com.ironsource.C3400z9 this$0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(error, "$error");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        com.ironsource.mediationsdk.logger.IronLog.CALLBACK.info("InterstitialAdLoaderListener.onInterstitialAdLoadFailed error: " + error);
        this$0.b.onInterstitialAdLoadFailed(error);
    }
}
