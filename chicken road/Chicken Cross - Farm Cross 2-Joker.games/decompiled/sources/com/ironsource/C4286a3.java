package com.ironsource;

import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.ironsourceads.banner.BannerAdLoaderListener;
import com.unity3d.ironsourceads.banner.BannerAdView;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.ironsource.a3, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C4286a3 implements V<BannerAdView> {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC4414fg f8059a;
    private final BannerAdLoaderListener b;

    public C4286a3(InterfaceC4414fg threadManager, BannerAdLoaderListener publisherListener) {
        Intrinsics.checkNotNullParameter(threadManager, "threadManager");
        Intrinsics.checkNotNullParameter(publisherListener, "publisherListener");
        this.f8059a = threadManager;
        this.b = publisherListener;
    }

    @Override // com.ironsource.V
    public void a(final BannerAdView adObject) {
        Intrinsics.checkNotNullParameter(adObject, "adObject");
        this.f8059a.a(new Runnable() { // from class: com.ironsource.a3$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                C4286a3.a(BannerAdView.this, this);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(BannerAdView adObject, C4286a3 this$0) {
        Intrinsics.checkNotNullParameter(adObject, "$adObject");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        IronLog.CALLBACK.info("BannerAdLoaderListener.onBannerAdLoaded adInfo: " + adObject.getAdInfo());
        this$0.b.onBannerAdLoaded(adObject);
    }

    @Override // com.ironsource.V
    public void a(final IronSourceError error) {
        Intrinsics.checkNotNullParameter(error, "error");
        this.f8059a.a(new Runnable() { // from class: com.ironsource.a3$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                C4286a3.a(IronSourceError.this, this);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(IronSourceError error, C4286a3 this$0) {
        Intrinsics.checkNotNullParameter(error, "$error");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        IronLog.CALLBACK.info("BannerAdLoaderListener.onBannerAdLoadFailed error: " + error);
        this$0.b.onBannerAdLoadFailed(error);
    }
}
