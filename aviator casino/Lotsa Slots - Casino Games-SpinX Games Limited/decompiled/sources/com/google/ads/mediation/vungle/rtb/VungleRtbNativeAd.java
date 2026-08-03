package com.google.ads.mediation.vungle.rtb;

/* loaded from: classes3.dex */
public class VungleRtbNativeAd extends com.google.android.gms.ads.mediation.UnifiedNativeAdMapper implements com.vungle.ads.NativeAdListener {
    private final com.google.android.gms.ads.mediation.MediationAdLoadCallback<com.google.android.gms.ads.mediation.UnifiedNativeAdMapper, com.google.android.gms.ads.mediation.MediationNativeAdCallback> adLoadCallback;
    private java.lang.String adMarkup;
    private com.vungle.ads.internal.ui.view.MediaView mediaView;
    private com.vungle.ads.NativeAd nativeAd;
    private com.google.android.gms.ads.mediation.MediationNativeAdCallback nativeAdCallback;
    private final com.google.ads.mediation.vungle.VungleFactory vungleFactory;

    @Override // com.vungle.ads.BaseAdListener
    public void onAdEnd(com.vungle.ads.BaseAd baseAd) {
    }

    @Override // com.vungle.ads.BaseAdListener
    public void onAdStart(com.vungle.ads.BaseAd baseAd) {
    }

    public VungleRtbNativeAd(com.google.android.gms.ads.mediation.MediationAdLoadCallback<com.google.android.gms.ads.mediation.UnifiedNativeAdMapper, com.google.android.gms.ads.mediation.MediationNativeAdCallback> mediationAdLoadCallback, com.google.ads.mediation.vungle.VungleFactory vungleFactory) {
        this.adLoadCallback = mediationAdLoadCallback;
        this.vungleFactory = vungleFactory;
    }

    public void render(com.google.android.gms.ads.mediation.MediationNativeAdConfiguration mediationNativeAdConfiguration) {
        android.os.Bundle serverParameters = mediationNativeAdConfiguration.getServerParameters();
        com.google.android.gms.ads.nativead.NativeAdOptions nativeAdOptions = mediationNativeAdConfiguration.getNativeAdOptions();
        final com.google.android.gms.ads.VideoOptions videoOptions = nativeAdOptions.getVideoOptions();
        final android.content.Context context = mediationNativeAdConfiguration.getContext();
        java.lang.String string = serverParameters.getString(com.google.ads.mediation.vungle.VungleConstants.KEY_APP_ID);
        if (android.text.TextUtils.isEmpty(string)) {
            com.google.android.gms.ads.AdError adError = new com.google.android.gms.ads.AdError(101, "Failed to load bidding native ad from Liftoff Monetize. Missing or invalid app ID configured for this ad source instance in the AdMob or Ad Manager UI.", com.google.ads.mediation.vungle.VungleMediationAdapter.ERROR_DOMAIN);
            android.util.Log.d(com.google.ads.mediation.vungle.VungleMediationAdapter.TAG, adError.toString());
            this.adLoadCallback.onFailure(adError);
            return;
        }
        final java.lang.String string2 = serverParameters.getString(com.google.ads.mediation.vungle.VungleConstants.KEY_PLACEMENT_ID);
        if (android.text.TextUtils.isEmpty(string2)) {
            com.google.android.gms.ads.AdError adError2 = new com.google.android.gms.ads.AdError(101, "Failed to load bidding native ad from Liftoff Monetize. Missing or Invalid placement ID configured for this ad source instance in the AdMob or Ad Manager UI.", com.google.ads.mediation.vungle.VungleMediationAdapter.ERROR_DOMAIN);
            android.util.Log.d(com.google.ads.mediation.vungle.VungleMediationAdapter.TAG, adError2.toString());
            this.adLoadCallback.onFailure(adError2);
        } else {
            this.adMarkup = mediationNativeAdConfiguration.getBidResponse();
            int adChoicesPlacement = nativeAdOptions.getAdChoicesPlacement();
            final int i = adChoicesPlacement != 0 ? adChoicesPlacement != 2 ? adChoicesPlacement != 3 ? 1 : 2 : 3 : 0;
            final java.lang.String watermark = mediationNativeAdConfiguration.getWatermark();
            com.google.ads.mediation.vungle.VungleInitializer.getInstance().initialize(string, context, new com.google.ads.mediation.vungle.VungleInitializer.VungleInitializationListener() { // from class: com.google.ads.mediation.vungle.rtb.VungleRtbNativeAd.1
                @Override // com.google.ads.mediation.vungle.VungleInitializer.VungleInitializationListener
                public void onInitializeSuccess() {
                    com.google.ads.mediation.vungle.rtb.VungleRtbNativeAd vungleRtbNativeAd = com.google.ads.mediation.vungle.rtb.VungleRtbNativeAd.this;
                    vungleRtbNativeAd.nativeAd = vungleRtbNativeAd.vungleFactory.createNativeAd(context, string2);
                    com.google.ads.mediation.vungle.rtb.VungleRtbNativeAd.this.nativeAd.setAdOptionsPosition(i);
                    com.google.ads.mediation.vungle.rtb.VungleRtbNativeAd.this.nativeAd.setAdListener(com.google.ads.mediation.vungle.rtb.VungleRtbNativeAd.this);
                    com.google.ads.mediation.vungle.rtb.VungleRtbNativeAd.this.nativeAd.setAdapterAdFormat("VungleRtbNativeAd");
                    if (videoOptions != null) {
                        com.google.ads.mediation.vungle.rtb.VungleRtbNativeAd.this.nativeAd.getVideoOptions().setStartMuted(java.lang.Boolean.valueOf(videoOptions.getStartMuted()));
                    }
                    com.google.ads.mediation.vungle.rtb.VungleRtbNativeAd.this.mediaView = new com.vungle.ads.internal.ui.view.MediaView(context);
                    if (!android.text.TextUtils.isEmpty(watermark)) {
                        com.google.ads.mediation.vungle.rtb.VungleRtbNativeAd.this.nativeAd.getAdConfig().setWatermark(watermark);
                    }
                    com.google.ads.mediation.vungle.rtb.VungleRtbNativeAd.this.nativeAd.load(com.google.ads.mediation.vungle.rtb.VungleRtbNativeAd.this.adMarkup);
                }

                @Override // com.google.ads.mediation.vungle.VungleInitializer.VungleInitializationListener
                public void onInitializeError(com.google.android.gms.ads.AdError adError3) {
                    android.util.Log.d(com.google.ads.mediation.vungle.VungleMediationAdapter.TAG, adError3.toString());
                    com.google.ads.mediation.vungle.rtb.VungleRtbNativeAd.this.adLoadCallback.onFailure(adError3);
                }
            });
        }
    }

    @Override // com.vungle.ads.BaseAdListener
    public void onAdLoaded(com.vungle.ads.BaseAd baseAd) {
        mapNativeAd();
        this.nativeAdCallback = this.adLoadCallback.onSuccess(this);
    }

    @Override // com.vungle.ads.BaseAdListener
    public void onAdFailedToLoad(com.vungle.ads.BaseAd baseAd, com.vungle.ads.VungleError vungleError) {
        this.adLoadCallback.onFailure(com.google.ads.mediation.vungle.VungleMediationAdapter.getAdError(vungleError));
    }

    @Override // com.vungle.ads.BaseAdListener
    public void onAdFailedToPlay(com.vungle.ads.BaseAd baseAd, com.vungle.ads.VungleError vungleError) {
        android.util.Log.w(com.google.ads.mediation.vungle.VungleMediationAdapter.TAG, com.google.ads.mediation.vungle.VungleMediationAdapter.getAdError(vungleError).toString());
    }

    @Override // com.vungle.ads.BaseAdListener
    public void onAdClicked(com.vungle.ads.BaseAd baseAd) {
        com.google.android.gms.ads.mediation.MediationNativeAdCallback mediationNativeAdCallback = this.nativeAdCallback;
        if (mediationNativeAdCallback != null) {
            mediationNativeAdCallback.reportAdClicked();
            this.nativeAdCallback.onAdOpened();
        }
    }

    @Override // com.vungle.ads.BaseAdListener
    public void onAdLeftApplication(com.vungle.ads.BaseAd baseAd) {
        com.google.android.gms.ads.mediation.MediationNativeAdCallback mediationNativeAdCallback = this.nativeAdCallback;
        if (mediationNativeAdCallback != null) {
            mediationNativeAdCallback.onAdLeftApplication();
        }
    }

    @Override // com.vungle.ads.BaseAdListener
    public void onAdImpression(com.vungle.ads.BaseAd baseAd) {
        com.google.android.gms.ads.mediation.MediationNativeAdCallback mediationNativeAdCallback = this.nativeAdCallback;
        if (mediationNativeAdCallback != null) {
            mediationNativeAdCallback.reportAdImpression();
        }
    }

    @Override // com.google.android.gms.ads.mediation.UnifiedNativeAdMapper
    public void trackViews(android.view.View view, java.util.Map<java.lang.String, android.view.View> map, java.util.Map<java.lang.String, android.view.View> map2) {
        super.trackViews(view, map, map2);
        android.util.Log.d(com.google.ads.mediation.vungle.VungleMediationAdapter.TAG, "trackViews()");
        if (view instanceof android.view.ViewGroup) {
            android.view.ViewGroup viewGroup = (android.view.ViewGroup) view;
            if (this.nativeAd == null) {
                return;
            }
            android.view.View childAt = viewGroup.getChildAt(viewGroup.getChildCount() - 1);
            if (!(childAt instanceof android.widget.FrameLayout)) {
                android.util.Log.d(com.google.ads.mediation.vungle.VungleMediationAdapter.TAG, "Vungle requires a FrameLayout to render the native ad.");
                return;
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            android.widget.ImageView imageView = null;
            android.view.KeyEvent.Callback callback = null;
            for (java.util.Map.Entry<java.lang.String, android.view.View> entry : map.entrySet()) {
                arrayList.add(entry.getValue());
                if (entry.getKey().equals("3003")) {
                    callback = (android.view.View) entry.getValue();
                } else if (entry.getKey().equals("3010")) {
                    arrayList.add(this.mediaView);
                }
            }
            if (callback instanceof android.widget.ImageView) {
                imageView = (android.widget.ImageView) callback;
            } else {
                android.util.Log.d(com.google.ads.mediation.vungle.VungleMediationAdapter.TAG, "The view to display a Vungle native icon image is not a type of ImageView, so it can't be registered for click events.");
            }
            this.nativeAd.registerViewForInteraction((android.widget.FrameLayout) childAt, this.mediaView, imageView, arrayList);
        }
    }

    @Override // com.google.android.gms.ads.mediation.UnifiedNativeAdMapper
    public void untrackView(android.view.View view) {
        super.untrackView(view);
        android.util.Log.d(com.google.ads.mediation.vungle.VungleMediationAdapter.TAG, "untrackView()");
        com.vungle.ads.NativeAd nativeAd = this.nativeAd;
        if (nativeAd == null) {
            return;
        }
        nativeAd.unregisterView();
    }

    private void mapNativeAd() {
        setHeadline(this.nativeAd.getAdTitle());
        setBody(this.nativeAd.getAdBodyText());
        setCallToAction(this.nativeAd.getAdCallToActionText());
        java.lang.Double adStarRating = this.nativeAd.getAdStarRating();
        if (adStarRating != null) {
            setStarRating(adStarRating);
        }
        setAdvertiser(this.nativeAd.getAdSponsoredText());
        setHasVideoContent(this.nativeAd.hasVideoContent());
        setMediaView(this.mediaView);
        this.mediaView.setNativeVideoListener(new com.vungle.ads.nativead.NativeVideoListener() { // from class: com.google.ads.mediation.vungle.rtb.VungleRtbNativeAd.2
            @Override // com.vungle.ads.nativead.NativeVideoListener
            public void onVideoPlay() {
                com.google.ads.mediation.vungle.rtb.VungleRtbNativeAd.this.nativeAdCallback.onVideoPlay();
            }

            @Override // com.vungle.ads.nativead.NativeVideoListener
            public void onVideoPause() {
                com.google.ads.mediation.vungle.rtb.VungleRtbNativeAd.this.nativeAdCallback.onVideoPause();
            }

            @Override // com.vungle.ads.nativead.NativeVideoListener
            public void onVideoEnd() {
                com.google.ads.mediation.vungle.rtb.VungleRtbNativeAd.this.nativeAdCallback.onVideoComplete();
            }

            @Override // com.vungle.ads.nativead.NativeVideoListener
            public void onVideoMute() {
                com.google.ads.mediation.vungle.rtb.VungleRtbNativeAd.this.nativeAdCallback.onVideoMute();
            }

            @Override // com.vungle.ads.nativead.NativeVideoListener
            public void onVideoUnmute() {
                com.google.ads.mediation.vungle.rtb.VungleRtbNativeAd.this.nativeAdCallback.onVideoUnmute();
            }
        });
        java.lang.String appIcon = this.nativeAd.getAppIcon();
        if (!android.text.TextUtils.isEmpty(appIcon) && appIcon.startsWith(com.vungle.ads.internal.model.AdPayload.FILE_SCHEME)) {
            setIcon(new com.google.ads.mediation.vungle.rtb.VungleRtbNativeAd.VungleNativeMappedImage(android.net.Uri.parse(appIcon)));
        }
        setMediaContentAspectRatio(this.nativeAd.getMediaAspectRatio());
        if (com.google.ads.mediation.vungle.VungleMediationAdapter.runtimeGmaSdkListensToAdapterReportedImpressions()) {
            setOverrideImpressionRecording(true);
        }
        setOverrideClickHandling(true);
    }

    private static class VungleNativeMappedImage extends com.google.android.gms.ads.formats.NativeAd.Image {
        private android.net.Uri imageUri;

        @Override // com.google.android.gms.ads.formats.NativeAd.Image
        public android.graphics.drawable.Drawable getDrawable() {
            return null;
        }

        @Override // com.google.android.gms.ads.formats.NativeAd.Image
        public double getScale() {
            return 1.0d;
        }

        public VungleNativeMappedImage(android.net.Uri uri) {
            this.imageUri = uri;
        }

        @Override // com.google.android.gms.ads.formats.NativeAd.Image
        public android.net.Uri getUri() {
            return this.imageUri;
        }
    }
}
