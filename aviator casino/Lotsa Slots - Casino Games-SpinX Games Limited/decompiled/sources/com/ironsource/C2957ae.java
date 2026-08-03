package com.ironsource;

/* renamed from: com.ironsource.ae, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2957ae implements com.ironsource.V<com.unity3d.ironsourceads.rewarded.RewardedAd> {

    /* renamed from: a, reason: collision with root package name */
    private final com.ironsource.InterfaceC2995cg f6141a;
    private final com.unity3d.ironsourceads.rewarded.RewardedAdLoaderListener b;

    public C2957ae(com.ironsource.InterfaceC2995cg threadManager, com.unity3d.ironsourceads.rewarded.RewardedAdLoaderListener publisherListener) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(threadManager, "threadManager");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(publisherListener, "publisherListener");
        this.f6141a = threadManager;
        this.b = publisherListener;
    }

    @Override // com.ironsource.V
    public void b(final com.ironsource.mediationsdk.logger.IronSourceError error) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(error, "error");
        com.ironsource.mediationsdk.logger.IronLog.CALLBACK.info("RewardedAdLoaderListener.onRewardedAdLoadFailed error: " + error);
        this.f6141a.a(new java.lang.Runnable() { // from class: com.ironsource.ae$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                com.ironsource.C2957ae.a(com.ironsource.C2957ae.this, error);
            }
        });
    }

    @Override // com.ironsource.V
    public void a(final com.unity3d.ironsourceads.rewarded.RewardedAd adObject) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adObject, "adObject");
        this.f6141a.a(new java.lang.Runnable() { // from class: com.ironsource.ae$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                com.ironsource.C2957ae.a(com.unity3d.ironsourceads.rewarded.RewardedAd.this, this);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(com.unity3d.ironsourceads.rewarded.RewardedAd adObject, com.ironsource.C2957ae this$0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adObject, "$adObject");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        com.ironsource.mediationsdk.logger.IronLog.CALLBACK.info("RewardedAdLoaderListener.onRewardedAdLoaded adInfo: " + adObject.getAdInfo());
        this$0.b.onRewardedAdLoaded(adObject);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(com.ironsource.C2957ae this$0, com.ironsource.mediationsdk.logger.IronSourceError error) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(error, "$error");
        this$0.b.onRewardedAdLoadFailed(error);
    }
}
