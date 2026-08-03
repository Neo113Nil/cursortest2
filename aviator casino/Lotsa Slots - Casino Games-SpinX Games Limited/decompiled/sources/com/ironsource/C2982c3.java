package com.ironsource;

/* renamed from: com.ironsource.c3, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2982c3 implements com.ironsource.V<com.unity3d.ironsourceads.banner.BannerAdView> {

    /* renamed from: a, reason: collision with root package name */
    private final com.ironsource.InterfaceC2995cg f6168a;
    private final com.unity3d.ironsourceads.banner.BannerAdLoaderListener b;

    public C2982c3(com.ironsource.InterfaceC2995cg threadManager, com.unity3d.ironsourceads.banner.BannerAdLoaderListener publisherListener) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(threadManager, "threadManager");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(publisherListener, "publisherListener");
        this.f6168a = threadManager;
        this.b = publisherListener;
    }

    @Override // com.ironsource.V
    public void b(final com.ironsource.mediationsdk.logger.IronSourceError error) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(error, "error");
        this.f6168a.a(new java.lang.Runnable() { // from class: com.ironsource.c3$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                com.ironsource.C2982c3.a(com.ironsource.mediationsdk.logger.IronSourceError.this, this);
            }
        });
    }

    @Override // com.ironsource.V
    public void a(final com.unity3d.ironsourceads.banner.BannerAdView adObject) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adObject, "adObject");
        this.f6168a.a(new java.lang.Runnable() { // from class: com.ironsource.c3$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                com.ironsource.C2982c3.a(com.unity3d.ironsourceads.banner.BannerAdView.this, this);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(com.unity3d.ironsourceads.banner.BannerAdView adObject, com.ironsource.C2982c3 this$0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adObject, "$adObject");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        com.ironsource.mediationsdk.logger.IronLog.CALLBACK.info("BannerAdLoaderListener.onBannerAdLoaded adInfo: " + adObject.getAdInfo());
        this$0.b.onBannerAdLoaded(adObject);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(com.ironsource.mediationsdk.logger.IronSourceError error, com.ironsource.C2982c3 this$0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(error, "$error");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        com.ironsource.mediationsdk.logger.IronLog.CALLBACK.info("BannerAdLoaderListener.onBannerAdLoadFailed error: " + error);
        this$0.b.onBannerAdLoadFailed(error);
    }
}
