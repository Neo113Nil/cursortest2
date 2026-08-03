package com.moloco.sdk.publisher;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\nH&¨\u0006\u000b"}, d2 = {"Lcom/moloco/sdk/publisher/MolocoAdapterBannerListener;", "Lcom/moloco/sdk/publisher/BannerAdShowListener;", com.ironsource.Vf.j, "", "ad", "Lcom/moloco/sdk/publisher/MolocoAd;", com.facebook.appevents.internal.ViewHierarchyConstants.VIEW_KEY, "Lcom/moloco/sdk/publisher/Banner;", com.ironsource.Vf.b, "error", "Lcom/moloco/sdk/publisher/MolocoAdError;", "moloco-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public interface MolocoAdapterBannerListener extends com.moloco.sdk.publisher.BannerAdShowListener {
    void onAdLoadFailed(com.moloco.sdk.publisher.MolocoAdError error);

    void onAdLoaded(com.moloco.sdk.publisher.MolocoAd ad, com.moloco.sdk.publisher.Banner view);
}
