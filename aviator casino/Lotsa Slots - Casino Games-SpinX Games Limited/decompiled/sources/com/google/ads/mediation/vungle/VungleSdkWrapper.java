package com.google.ads.mediation.vungle;

/* compiled from: VungleSdkWrapper.kt */
@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J(\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000eH\u0007R\u0012\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/google/ads/mediation/vungle/VungleSdkWrapper;", "", "<init>", "()V", "delegate", "Lcom/google/ads/mediation/vungle/SdkWrapper;", "logCustomSizeForBannerPlacement", "", "bannerAdView", "Lcom/vungle/ads/VungleBannerView;", "adapterAdFormat", "", "placementId", com.ironsource.X3.i.O, "Lcom/google/android/gms/ads/AdSize;", "liftoffmonetize_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class VungleSdkWrapper {
    public static final com.google.ads.mediation.vungle.VungleSdkWrapper INSTANCE = new com.google.ads.mediation.vungle.VungleSdkWrapper();
    public static com.google.ads.mediation.vungle.SdkWrapper delegate = new com.google.ads.mediation.vungle.SdkWrapper() { // from class: com.google.ads.mediation.vungle.VungleSdkWrapper$delegate$1
        @Override // com.google.ads.mediation.vungle.SdkWrapper
        public void getBiddingToken(android.content.Context context, com.vungle.ads.BidTokenCallback callback) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(callback, "callback");
            com.vungle.ads.VungleAds.INSTANCE.getBiddingToken(context, callback);
        }

        @Override // com.google.ads.mediation.vungle.SdkWrapper
        public java.lang.String getSdkVersion() {
            return com.vungle.ads.VungleAds.INSTANCE.getSdkVersion();
        }

        @Override // com.google.ads.mediation.vungle.SdkWrapper
        public void init(android.content.Context context, java.lang.String appId, com.vungle.ads.InitializationListener initializationListener) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appId, "appId");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(initializationListener, "initializationListener");
            com.vungle.ads.VungleAds.INSTANCE.init(context, appId, initializationListener);
        }

        @Override // com.google.ads.mediation.vungle.SdkWrapper
        public boolean isInitialized() {
            return com.vungle.ads.VungleAds.INSTANCE.isInitialized();
        }
    };

    private VungleSdkWrapper() {
    }

    @kotlin.jvm.JvmStatic
    public static final void logCustomSizeForBannerPlacement(com.vungle.ads.VungleBannerView bannerAdView, java.lang.String adapterAdFormat, java.lang.String placementId, com.google.android.gms.ads.AdSize adSize) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bannerAdView, "bannerAdView");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adapterAdFormat, "adapterAdFormat");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(placementId, "placementId");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adSize, "adSize");
        if (com.vungle.ads.VungleAds.INSTANCE.isInline(placementId)) {
            return;
        }
        if (adSize.getWidth() == com.google.android.gms.ads.AdSize.BANNER.getWidth() && adSize.getHeight() == com.google.android.gms.ads.AdSize.BANNER.getHeight()) {
            return;
        }
        if (adSize.getWidth() == com.google.android.gms.ads.AdSize.MEDIUM_RECTANGLE.getWidth() && adSize.getHeight() == com.google.android.gms.ads.AdSize.MEDIUM_RECTANGLE.getHeight()) {
            return;
        }
        if (adSize.getWidth() == com.google.android.gms.ads.AdSize.LEADERBOARD.getWidth() && adSize.getHeight() == com.google.android.gms.ads.AdSize.LEADERBOARD.getHeight()) {
            return;
        }
        bannerAdView.setAdapterAdFormat(adapterAdFormat);
        com.vungle.ads.VungleMediationLogger.logError(bannerAdView, "CustomBannerSizeMismatch:w-" + adSize.getWidth() + "|h-" + adSize.getHeight());
        android.util.Log.e(com.google.ads.mediation.vungle.VungleMediationAdapter.TAG, "Please use a Liftoff inline placement ID in order to use custom size banner: placementId=" + placementId + " adSize=" + adSize);
    }
}
