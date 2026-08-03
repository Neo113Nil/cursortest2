package com.unity3d.ironsourceads.rewarded;

/* loaded from: classes5.dex */
public final class RewardedAdLoader {
    public static final com.unity3d.ironsourceads.rewarded.RewardedAdLoader INSTANCE = new com.unity3d.ironsourceads.rewarded.RewardedAdLoader();

    /* renamed from: a, reason: collision with root package name */
    private static final java.util.concurrent.Executor f8030a = com.ironsource.Q7.f5934a.d();

    private RewardedAdLoader() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(com.ironsource.Ab loadTask) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(loadTask, "$loadTask");
        loadTask.start();
    }

    @kotlin.jvm.JvmStatic
    public static final void loadAd(com.unity3d.ironsourceads.rewarded.RewardedAdRequest adRequest, com.unity3d.ironsourceads.rewarded.RewardedAdLoaderListener listener) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adRequest, "adRequest");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(listener, "listener");
        com.ironsource.mediationsdk.logger.IronLog.API.info("instanceId: " + adRequest.getInstanceId());
        INSTANCE.internalLoadAd$mediationsdk_release(f8030a, new com.ironsource.C2975be(adRequest, listener, com.ironsource.C3099ic.e.a(com.ironsource.mediationsdk.IronSource.a.REWARDED_VIDEO), null, 8, null));
    }

    public final void internalLoadAd$mediationsdk_release(java.util.concurrent.Executor executor, com.ironsource.Db loadTaskProvider) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(executor, "executor");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(loadTaskProvider, "loadTaskProvider");
        final com.ironsource.Ab a2 = loadTaskProvider.a();
        executor.execute(new java.lang.Runnable() { // from class: com.unity3d.ironsourceads.rewarded.RewardedAdLoader$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                com.unity3d.ironsourceads.rewarded.RewardedAdLoader.a(com.ironsource.Ab.this);
            }
        });
    }
}
