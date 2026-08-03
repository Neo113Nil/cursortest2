package com.google.ads.mediation.vungle;

/* compiled from: VungleFactory.kt */
@kotlin.Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bJ\u001e\u0010\f\u001a\u00020\r2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\u000fJ\u001e\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\u000fJ\u0016\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tJ\u0006\u0010\u0014\u001a\u00020\u000f¨\u0006\u0015"}, d2 = {"Lcom/google/ads/mediation/vungle/VungleFactory;", "", "<init>", "()V", "createBannerAd", "Lcom/vungle/ads/VungleBannerView;", "context", "Landroid/content/Context;", "placementId", "", com.ironsource.X3.i.O, "Lcom/vungle/ads/VungleAdSize;", "createInterstitialAd", "Lcom/vungle/ads/InterstitialAd;", "adConfig", "Lcom/vungle/ads/AdConfig;", "createRewardedAd", "Lcom/vungle/ads/RewardedAd;", "createNativeAd", "Lcom/vungle/ads/NativeAd;", "createAdConfig", "liftoffmonetize_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class VungleFactory {
    public final com.vungle.ads.VungleBannerView createBannerAd(android.content.Context context, java.lang.String placementId, com.vungle.ads.VungleAdSize adSize) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(placementId, "placementId");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adSize, "adSize");
        return new com.vungle.ads.VungleBannerView(context, placementId, adSize);
    }

    public final com.vungle.ads.InterstitialAd createInterstitialAd(android.content.Context context, java.lang.String placementId, com.vungle.ads.AdConfig adConfig) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(placementId, "placementId");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adConfig, "adConfig");
        return new com.vungle.ads.InterstitialAd(context, placementId, adConfig);
    }

    public final com.vungle.ads.RewardedAd createRewardedAd(android.content.Context context, java.lang.String placementId, com.vungle.ads.AdConfig adConfig) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(placementId, "placementId");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adConfig, "adConfig");
        return new com.vungle.ads.RewardedAd(context, placementId, adConfig);
    }

    public final com.vungle.ads.NativeAd createNativeAd(android.content.Context context, java.lang.String placementId) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(placementId, "placementId");
        return new com.vungle.ads.NativeAd(context, placementId);
    }

    public final com.vungle.ads.AdConfig createAdConfig() {
        return new com.vungle.ads.AdConfig();
    }
}
