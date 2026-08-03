package com.unity3d.ironsourceads.interstitial;

/* loaded from: classes5.dex */
public final class InterstitialAdLoader {
    public static final com.unity3d.ironsourceads.interstitial.InterstitialAdLoader INSTANCE = new com.unity3d.ironsourceads.interstitial.InterstitialAdLoader();

    /* renamed from: a, reason: collision with root package name */
    private static final java.util.concurrent.Executor f8025a = com.ironsource.Q7.f5934a.d();

    private InterstitialAdLoader() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(com.ironsource.Ab loadTask) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(loadTask, "$loadTask");
        loadTask.start();
    }

    @kotlin.jvm.JvmStatic
    public static final void loadAd(com.unity3d.ironsourceads.interstitial.InterstitialAdRequest adRequest, com.unity3d.ironsourceads.interstitial.InterstitialAdLoaderListener listener) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adRequest, "adRequest");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(listener, "listener");
        com.ironsource.mediationsdk.logger.IronLog.API.info("instanceId: " + adRequest.getInstanceId());
        INSTANCE.internalLoadAd$mediationsdk_release(f8025a, new com.ironsource.A9(adRequest, listener, com.ironsource.C3099ic.e.a(com.ironsource.mediationsdk.IronSource.a.INTERSTITIAL), null, 8, null));
    }

    public final void internalLoadAd$mediationsdk_release(java.util.concurrent.Executor executor, com.ironsource.Db loadTaskProvider) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(executor, "executor");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(loadTaskProvider, "loadTaskProvider");
        final com.ironsource.Ab a2 = loadTaskProvider.a();
        executor.execute(new java.lang.Runnable() { // from class: com.unity3d.ironsourceads.interstitial.InterstitialAdLoader$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                com.unity3d.ironsourceads.interstitial.InterstitialAdLoader.a(com.ironsource.Ab.this);
            }
        });
    }
}
