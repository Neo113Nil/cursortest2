package com.google.ads.mediation.inmobi;

/* loaded from: classes3.dex */
public class InMobiUnifiedNativeAdMapper extends com.google.android.gms.ads.mediation.UnifiedNativeAdMapper {
    private final com.google.ads.mediation.inmobi.renderers.InMobiNativeAd inMobiNativeAd;
    private final com.google.ads.mediation.inmobi.InMobiNativeWrapper inMobiNativeWrapper;
    private final boolean isOnlyURL;
    private final com.google.android.gms.ads.mediation.MediationAdLoadCallback<com.google.android.gms.ads.mediation.UnifiedNativeAdMapper, com.google.android.gms.ads.mediation.MediationNativeAdCallback> mediationAdLoadCallback;

    public InMobiUnifiedNativeAdMapper(com.google.ads.mediation.inmobi.InMobiNativeWrapper inMobiNativeWrapper, java.lang.Boolean bool, com.google.android.gms.ads.mediation.MediationAdLoadCallback<com.google.android.gms.ads.mediation.UnifiedNativeAdMapper, com.google.android.gms.ads.mediation.MediationNativeAdCallback> mediationAdLoadCallback, com.google.ads.mediation.inmobi.renderers.InMobiNativeAd inMobiNativeAd) {
        this.inMobiNativeWrapper = inMobiNativeWrapper;
        this.isOnlyURL = bool.booleanValue();
        this.mediationAdLoadCallback = mediationAdLoadCallback;
        this.inMobiNativeAd = inMobiNativeAd;
        setOverrideImpressionRecording(true);
    }

    public void mapUnifiedNativeAd(android.content.Context context) {
        if (this.inMobiNativeWrapper.getAdTitle() != null) {
            setHeadline(this.inMobiNativeWrapper.getAdTitle());
        }
        if (this.inMobiNativeWrapper.getAdDescription() != null) {
            setBody(this.inMobiNativeWrapper.getAdDescription());
        }
        if (this.inMobiNativeWrapper.getAdCtaText() != null) {
            setCallToAction(this.inMobiNativeWrapper.getAdCtaText());
        }
        if (this.inMobiNativeWrapper.getAdvertiserName() != null) {
            setAdvertiser(this.inMobiNativeWrapper.getAdvertiserName());
        }
        setStarRating(java.lang.Double.valueOf(this.inMobiNativeWrapper.getAdRating()));
        com.inmobi.media.ads.nativeAd.MediaView mediaView = this.inMobiNativeWrapper.getMediaView();
        if (mediaView != null) {
            setMediaView(mediaView);
        }
        setHasVideoContent(this.inMobiNativeWrapper.isVideo().booleanValue());
        if (this.inMobiNativeWrapper.getAdIconUrl() != null) {
            try {
                java.net.URL url = new java.net.URL(this.inMobiNativeWrapper.getAdIconUrl());
                final android.net.Uri parse = android.net.Uri.parse(url.toURI().toString());
                java.util.HashMap hashMap = new java.util.HashMap();
                if (!this.isOnlyURL) {
                    hashMap.put("icon_key", url);
                } else {
                    setIcon(new com.google.ads.mediation.inmobi.InMobiNativeMappedImage(null, parse, 1.0d));
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    arrayList.add(new com.google.ads.mediation.inmobi.InMobiNativeMappedImage(new android.graphics.drawable.ColorDrawable(0), null, 1.0d));
                    setImages(arrayList);
                }
                if (!this.isOnlyURL) {
                    new com.google.ads.mediation.inmobi.ImageDownloaderAsyncTask(new com.google.ads.mediation.inmobi.ImageDownloaderAsyncTask.DrawableDownloadListener() { // from class: com.google.ads.mediation.inmobi.InMobiUnifiedNativeAdMapper.1
                        @Override // com.google.ads.mediation.inmobi.ImageDownloaderAsyncTask.DrawableDownloadListener
                        public void onDownloadSuccess(java.util.HashMap<java.lang.String, android.graphics.drawable.Drawable> hashMap2) {
                            android.graphics.drawable.Drawable drawable = hashMap2.get("icon_key");
                            com.google.ads.mediation.inmobi.InMobiUnifiedNativeAdMapper.this.setIcon(new com.google.ads.mediation.inmobi.InMobiNativeMappedImage(drawable, parse, 1.0d));
                            java.util.ArrayList arrayList2 = new java.util.ArrayList();
                            arrayList2.add(new com.google.ads.mediation.inmobi.InMobiNativeMappedImage(new android.graphics.drawable.ColorDrawable(0), null, 1.0d));
                            com.google.ads.mediation.inmobi.InMobiUnifiedNativeAdMapper.this.setImages(arrayList2);
                            if (drawable != null && com.google.ads.mediation.inmobi.InMobiUnifiedNativeAdMapper.this.mediationAdLoadCallback != null) {
                                com.google.ads.mediation.inmobi.InMobiUnifiedNativeAdMapper.this.inMobiNativeAd.mediationNativeAdCallback = (com.google.android.gms.ads.mediation.MediationNativeAdCallback) com.google.ads.mediation.inmobi.InMobiUnifiedNativeAdMapper.this.mediationAdLoadCallback.onSuccess(com.google.ads.mediation.inmobi.InMobiUnifiedNativeAdMapper.this);
                            } else {
                                com.google.android.gms.ads.AdError createAdapterError = com.google.ads.mediation.inmobi.InMobiConstants.createAdapterError(109, "InMobi SDK failed to download native ad image assets.");
                                android.util.Log.w(com.google.ads.mediation.inmobi.InMobiMediationAdapter.TAG, createAdapterError.toString());
                                com.google.ads.mediation.inmobi.InMobiUnifiedNativeAdMapper.this.mediationAdLoadCallback.onFailure(createAdapterError);
                            }
                        }

                        @Override // com.google.ads.mediation.inmobi.ImageDownloaderAsyncTask.DrawableDownloadListener
                        public void onDownloadFailure() {
                            com.google.android.gms.ads.AdError createAdapterError = com.google.ads.mediation.inmobi.InMobiConstants.createAdapterError(109, "InMobi SDK failed to download native ad image assets.");
                            android.util.Log.w(com.google.ads.mediation.inmobi.InMobiMediationAdapter.TAG, createAdapterError.toString());
                            com.google.ads.mediation.inmobi.InMobiUnifiedNativeAdMapper.this.mediationAdLoadCallback.onFailure(createAdapterError);
                        }
                    }).execute(hashMap);
                    return;
                }
                com.google.android.gms.ads.mediation.MediationAdLoadCallback<com.google.android.gms.ads.mediation.UnifiedNativeAdMapper, com.google.android.gms.ads.mediation.MediationNativeAdCallback> mediationAdLoadCallback = this.mediationAdLoadCallback;
                if (mediationAdLoadCallback != null) {
                    this.inMobiNativeAd.mediationNativeAdCallback = mediationAdLoadCallback.onSuccess(this);
                }
            } catch (java.net.MalformedURLException | java.net.URISyntaxException e) {
                com.google.android.gms.ads.AdError createAdapterError = com.google.ads.mediation.inmobi.InMobiConstants.createAdapterError(108, e.getLocalizedMessage());
                android.util.Log.w(com.google.ads.mediation.inmobi.InMobiMediationAdapter.TAG, createAdapterError.toString());
                this.mediationAdLoadCallback.onFailure(createAdapterError);
            }
        }
    }

    @Override // com.google.android.gms.ads.mediation.UnifiedNativeAdMapper
    public void untrackView(android.view.View view) {
        this.inMobiNativeWrapper.unTrackViews();
    }

    @Override // com.google.android.gms.ads.mediation.UnifiedNativeAdMapper
    public void trackViews(android.view.View view, java.util.Map<java.lang.String, android.view.View> map, java.util.Map<java.lang.String, android.view.View> map2) {
        setOverrideClickHandling(true);
        android.view.View view2 = map.get("3001");
        android.view.View view3 = map.get("3004");
        android.view.View view4 = map.get("3003");
        android.view.View view5 = map.get("3002");
        android.view.View view6 = map.get("3005");
        android.view.View view7 = map.get("3009");
        com.inmobi.media.ads.nativeAd.InMobiNativeViewData.Builder builder = new com.inmobi.media.ads.nativeAd.InMobiNativeViewData.Builder((android.view.ViewGroup) view);
        if (view2 != null) {
            builder.setTitleView(view2);
        }
        if (view3 != null) {
            builder.setDescriptionView(view3);
        }
        if (view4 instanceof android.widget.ImageView) {
            builder.setIconView((android.widget.ImageView) view4);
        }
        if (view5 != null) {
            builder.setCTAView(view5);
        }
        if (view6 != null) {
            builder.setAdvertiserView(view6);
        }
        if (view7 != null) {
            builder.setRatingView(view7);
        }
        this.inMobiNativeWrapper.registerForTracking(builder.build());
    }
}
