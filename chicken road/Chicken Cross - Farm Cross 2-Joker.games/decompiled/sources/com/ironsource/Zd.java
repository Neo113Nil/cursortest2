package com.ironsource;

import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.ironsourceads.rewarded.RewardedAd;
import com.unity3d.ironsourceads.rewarded.RewardedAdLoaderListener;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class Zd implements V<RewardedAd> {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC4414fg f8050a;
    private final RewardedAdLoaderListener b;

    public Zd(InterfaceC4414fg threadManager, RewardedAdLoaderListener publisherListener) {
        Intrinsics.checkNotNullParameter(threadManager, "threadManager");
        Intrinsics.checkNotNullParameter(publisherListener, "publisherListener");
        this.f8050a = threadManager;
        this.b = publisherListener;
    }

    @Override // com.ironsource.V
    public void a(final RewardedAd adObject) {
        Intrinsics.checkNotNullParameter(adObject, "adObject");
        this.f8050a.a(new Runnable() { // from class: com.ironsource.Zd$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                Zd.a(RewardedAd.this, this);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(RewardedAd adObject, Zd this$0) {
        Intrinsics.checkNotNullParameter(adObject, "$adObject");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        IronLog.CALLBACK.info("RewardedAdLoaderListener.onRewardedAdLoaded adInfo: " + adObject.getAdInfo());
        this$0.b.onRewardedAdLoaded(adObject);
    }

    @Override // com.ironsource.V
    public void a(final IronSourceError error) {
        Intrinsics.checkNotNullParameter(error, "error");
        IronLog.CALLBACK.info("RewardedAdLoaderListener.onRewardedAdLoadFailed error: " + error);
        this.f8050a.a(new Runnable() { // from class: com.ironsource.Zd$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                Zd.a(Zd.this, error);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(Zd this$0, IronSourceError error) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(error, "$error");
        this$0.b.onRewardedAdLoadFailed(error);
    }
}
