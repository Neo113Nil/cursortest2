package com.unity3d.ironsourceads.interstitial;

import android.app.Activity;
import com.ironsource.C4693v9;
import com.ironsource.InterfaceC4711w9;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class InterstitialAd implements InterfaceC4711w9 {

    /* renamed from: a, reason: collision with root package name */
    private final C4693v9 f11666a;
    private InterstitialAdListener b;

    public InterstitialAd(C4693v9 interstitialAdInternal) {
        Intrinsics.checkNotNullParameter(interstitialAdInternal, "interstitialAdInternal");
        this.f11666a = interstitialAdInternal;
        interstitialAdInternal.a(this);
    }

    public final InterstitialAdInfo getAdInfo() {
        return this.f11666a.b();
    }

    public final InterstitialAdListener getListener() {
        return this.b;
    }

    public final boolean isReadyToShow() {
        IronLog.API.info();
        return this.f11666a.d();
    }

    @Override // com.ironsource.InterfaceC4711w9
    public void onAdInstanceDidBecomeVisible() {
        IronLog.CALLBACK.info("InterstitialAdListener onInterstitialAdShown adInfo: " + getAdInfo());
        InterstitialAdListener interstitialAdListener = this.b;
        if (interstitialAdListener != null) {
            interstitialAdListener.onInterstitialAdShown(this);
        }
    }

    @Override // com.ironsource.InterfaceC4711w9
    public void onAdInstanceDidClick() {
        IronLog.CALLBACK.info("InterstitialAdListener onInterstitialAdClicked adInfo: " + getAdInfo());
        InterstitialAdListener interstitialAdListener = this.b;
        if (interstitialAdListener != null) {
            interstitialAdListener.onInterstitialAdClicked(this);
        }
    }

    @Override // com.ironsource.InterfaceC4711w9
    public void onAdInstanceDidDismiss() {
        IronLog.CALLBACK.info("InterstitialAdListener onInterstitialAdDismissed adInfo: " + getAdInfo());
        InterstitialAdListener interstitialAdListener = this.b;
        if (interstitialAdListener != null) {
            interstitialAdListener.onInterstitialAdDismissed(this);
        }
    }

    @Override // com.ironsource.InterfaceC4711w9
    public void onAdInstanceDidFailedToShow(IronSourceError error) {
        Intrinsics.checkNotNullParameter(error, "error");
        IronLog.CALLBACK.info("InterstitialAdListener onInterstitialAdFailedToShow error : " + error + " adInfo: " + getAdInfo());
        InterstitialAdListener interstitialAdListener = this.b;
        if (interstitialAdListener != null) {
            interstitialAdListener.onInterstitialAdFailedToShow(this, error);
        }
    }

    @Override // com.ironsource.InterfaceC4711w9
    public void onAdInstanceDidReward(String str, int i) {
    }

    @Override // com.ironsource.InterfaceC4711w9
    public void onAdInstanceDidShow() {
        IronLog.CALLBACK.info("InterstitialAdListener onInterstitialAdShown adInfo: " + getAdInfo());
        InterstitialAdListener interstitialAdListener = this.b;
        if (interstitialAdListener != null) {
            interstitialAdListener.onInterstitialAdShown(this);
        }
    }

    public final void setListener(InterstitialAdListener interstitialAdListener) {
        this.b = interstitialAdListener;
    }

    public final void show(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        IronLog.API.info();
        this.f11666a.a(activity);
    }
}
