package com.ironsource;

import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.ironsourceads.interstitial.InterstitialAd;
import com.unity3d.ironsourceads.interstitial.InterstitialAdLoaderListener;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.ironsource.z9, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C4765z9 implements V<InterstitialAd> {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC4414fg f8794a;
    private final InterstitialAdLoaderListener b;

    public C4765z9(InterfaceC4414fg threadManager, InterstitialAdLoaderListener publisherListener) {
        Intrinsics.checkNotNullParameter(threadManager, "threadManager");
        Intrinsics.checkNotNullParameter(publisherListener, "publisherListener");
        this.f8794a = threadManager;
        this.b = publisherListener;
    }

    @Override // com.ironsource.V
    public void a(final InterstitialAd adObject) {
        Intrinsics.checkNotNullParameter(adObject, "adObject");
        this.f8794a.a(new Runnable() { // from class: com.ironsource.z9$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                C4765z9.a(InterstitialAd.this, this);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(InterstitialAd adObject, C4765z9 this$0) {
        Intrinsics.checkNotNullParameter(adObject, "$adObject");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        IronLog.CALLBACK.info("InterstitialAdLoaderListener.onInterstitialAdLoaded adInfo: " + adObject.getAdInfo());
        this$0.b.onInterstitialAdLoaded(adObject);
    }

    @Override // com.ironsource.V
    public void a(final IronSourceError error) {
        Intrinsics.checkNotNullParameter(error, "error");
        this.f8794a.a(new Runnable() { // from class: com.ironsource.z9$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                C4765z9.a(IronSourceError.this, this);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(IronSourceError error, C4765z9 this$0) {
        Intrinsics.checkNotNullParameter(error, "$error");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        IronLog.CALLBACK.info("InterstitialAdLoaderListener.onInterstitialAdLoadFailed error: " + error);
        this$0.b.onInterstitialAdLoadFailed(error);
    }
}
