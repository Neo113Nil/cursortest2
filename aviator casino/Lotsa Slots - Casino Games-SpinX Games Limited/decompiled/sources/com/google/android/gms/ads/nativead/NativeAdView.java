package com.google.android.gms.ads.nativead;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.2.0 */
/* loaded from: classes3.dex */
public final class NativeAdView extends android.widget.FrameLayout {

    @org.checkerframework.checker.initialization.qual.NotOnlyInitialized
    private final android.widget.FrameLayout zza;

    @org.checkerframework.checker.initialization.qual.NotOnlyInitialized
    private final com.google.android.gms.internal.ads.zzbmi zzb;

    public NativeAdView(android.content.Context context) {
        super(context);
        this.zza = zze(context);
        this.zzb = zzf();
    }

    private final void zzd(java.lang.String str, android.view.View view) {
        com.google.android.gms.internal.ads.zzbmi zzbmiVar = this.zzb;
        if (zzbmiVar == null) {
            return;
        }
        try {
            zzbmiVar.zzb(str, com.google.android.gms.dynamic.ObjectWrapper.wrap(view));
        } catch (android.os.RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzg("Unable to call setAssetView on delegate", e);
        }
    }

    private final android.widget.FrameLayout zze(android.content.Context context) {
        android.widget.FrameLayout frameLayout = new android.widget.FrameLayout(context);
        frameLayout.setLayoutParams(new android.widget.FrameLayout.LayoutParams(-1, -1));
        addView(frameLayout);
        return frameLayout;
    }

    @org.checkerframework.checker.nullness.qual.RequiresNonNull({"overlayFrame"})
    private final com.google.android.gms.internal.ads.zzbmi zzf() {
        if (isInEditMode()) {
            return null;
        }
        android.widget.FrameLayout frameLayout = this.zza;
        return com.google.android.gms.ads.internal.client.zzay.zzb().zze(frameLayout.getContext(), this, frameLayout);
    }

    @Override // android.view.ViewGroup
    public final void addView(android.view.View view, int i, android.view.ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i, layoutParams);
        super.bringChildToFront(this.zza);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void bringChildToFront(android.view.View view) {
        super.bringChildToFront(view);
        android.widget.FrameLayout frameLayout = this.zza;
        if (frameLayout != view) {
            super.bringChildToFront(frameLayout);
        }
    }

    public void destroy() {
        com.google.android.gms.internal.ads.zzbmi zzbmiVar = this.zzb;
        if (zzbmiVar == null) {
            return;
        }
        try {
            zzbmiVar.zze();
        } catch (android.os.RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzg("Unable to destroy native ad view", e);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(android.view.MotionEvent motionEvent) {
        com.google.android.gms.internal.ads.zzbmi zzbmiVar = this.zzb;
        if (zzbmiVar != null) {
            if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzmY)).booleanValue()) {
                try {
                    zzbmiVar.zzdD(com.google.android.gms.dynamic.ObjectWrapper.wrap(motionEvent));
                } catch (android.os.RemoteException e) {
                    com.google.android.gms.ads.internal.util.client.zzo.zzg("Unable to call handleTouchEvent on delegate", e);
                }
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public com.google.android.gms.ads.nativead.AdChoicesView getAdChoicesView() {
        android.view.View zza = zza("3011");
        if (zza instanceof com.google.android.gms.ads.nativead.AdChoicesView) {
            return (com.google.android.gms.ads.nativead.AdChoicesView) zza;
        }
        return null;
    }

    public final android.view.View getAdvertiserView() {
        return zza("3005");
    }

    public final android.view.View getBodyView() {
        return zza("3004");
    }

    public final android.view.View getCallToActionView() {
        return zza("3002");
    }

    public final android.view.View getHeadlineView() {
        return zza("3001");
    }

    public final android.view.View getIconView() {
        return zza("3003");
    }

    public final android.view.View getImageView() {
        return zza("3008");
    }

    public final com.google.android.gms.ads.nativead.MediaView getMediaView() {
        android.view.View zza = zza("3010");
        if (zza instanceof com.google.android.gms.ads.nativead.MediaView) {
            return (com.google.android.gms.ads.nativead.MediaView) zza;
        }
        if (zza == null) {
            return null;
        }
        com.google.android.gms.ads.internal.util.client.zzo.zzd("View is not an instance of MediaView");
        return null;
    }

    public final android.view.View getPriceView() {
        return zza("3007");
    }

    public final android.view.View getStarRatingView() {
        return zza("3009");
    }

    public final android.view.View getStoreView() {
        return zza("3006");
    }

    @Override // android.view.View
    public final void onVisibilityChanged(android.view.View view, int i) {
        super.onVisibilityChanged(view, i);
        com.google.android.gms.internal.ads.zzbmi zzbmiVar = this.zzb;
        if (zzbmiVar == null) {
            return;
        }
        try {
            zzbmiVar.zzf(com.google.android.gms.dynamic.ObjectWrapper.wrap(view), i);
        } catch (android.os.RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzg("Unable to call onVisibilityChanged on delegate", e);
        }
    }

    @Override // android.view.ViewGroup
    public final void removeAllViews() {
        super.removeAllViews();
        super.addView(this.zza);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void removeView(android.view.View view) {
        if (this.zza == view) {
            return;
        }
        super.removeView(view);
    }

    public void setAdChoicesView(com.google.android.gms.ads.nativead.AdChoicesView adChoicesView) {
        zzd("3011", adChoicesView);
    }

    public final void setAdvertiserView(android.view.View view) {
        zzd("3005", view);
    }

    public final void setBodyView(android.view.View view) {
        zzd("3004", view);
    }

    public final void setCallToActionView(android.view.View view) {
        zzd("3002", view);
    }

    public final void setClickConfirmingView(android.view.View view) {
        com.google.android.gms.internal.ads.zzbmi zzbmiVar = this.zzb;
        if (zzbmiVar == null) {
            return;
        }
        try {
            zzbmiVar.zzdB(com.google.android.gms.dynamic.ObjectWrapper.wrap(view));
        } catch (android.os.RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzg("Unable to call setClickConfirmingView on delegate", e);
        }
    }

    public final void setHeadlineView(android.view.View view) {
        zzd("3001", view);
    }

    public final void setIconView(android.view.View view) {
        zzd("3003", view);
    }

    public final void setImageView(android.view.View view) {
        zzd("3008", view);
    }

    public final void setMediaView(com.google.android.gms.ads.nativead.MediaView mediaView) {
        zzd("3010", mediaView);
        if (mediaView == null) {
            return;
        }
        mediaView.zza(new com.google.android.gms.internal.ads.zzblq() { // from class: com.google.android.gms.ads.nativead.zzb
            @Override // com.google.android.gms.internal.ads.zzblq
            public final /* synthetic */ void zza(com.google.android.gms.ads.MediaContent mediaContent) {
                com.google.android.gms.ads.nativead.NativeAdView.this.zzb(mediaContent);
            }
        });
        mediaView.zzb(new com.google.android.gms.internal.ads.zzbls() { // from class: com.google.android.gms.ads.nativead.zza
            @Override // com.google.android.gms.internal.ads.zzbls
            public final /* synthetic */ void zza(android.widget.ImageView.ScaleType scaleType) {
                com.google.android.gms.ads.nativead.NativeAdView.this.zzc(scaleType);
            }
        });
    }

    public void setNativeAd(com.google.android.gms.ads.nativead.NativeAd nativeAd) {
        com.google.android.gms.internal.ads.zzbmi zzbmiVar = this.zzb;
        if (zzbmiVar == null) {
            return;
        }
        try {
            zzbmiVar.zzd((com.google.android.gms.dynamic.IObjectWrapper) nativeAd.zza());
        } catch (android.os.RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzg("Unable to call setNativeAd on delegate", e);
        }
    }

    public final void setPriceView(android.view.View view) {
        zzd("3007", view);
    }

    public final void setStarRatingView(android.view.View view) {
        zzd("3009", view);
    }

    public final void setStoreView(android.view.View view) {
        zzd("3006", view);
    }

    protected final android.view.View zza(java.lang.String str) {
        com.google.android.gms.internal.ads.zzbmi zzbmiVar = this.zzb;
        if (zzbmiVar != null) {
            try {
                com.google.android.gms.dynamic.IObjectWrapper zzc = zzbmiVar.zzc(str);
                if (zzc != null) {
                    return (android.view.View) com.google.android.gms.dynamic.ObjectWrapper.unwrap(zzc);
                }
            } catch (android.os.RemoteException e) {
                com.google.android.gms.ads.internal.util.client.zzo.zzg("Unable to call getAssetView on delegate", e);
            }
        }
        return null;
    }

    final /* synthetic */ void zzb(com.google.android.gms.ads.MediaContent mediaContent) {
        com.google.android.gms.internal.ads.zzbmi zzbmiVar = this.zzb;
        if (zzbmiVar == null) {
            return;
        }
        try {
            if (mediaContent instanceof com.google.android.gms.ads.internal.client.zzfb) {
                zzbmiVar.zzdE(((com.google.android.gms.ads.internal.client.zzfb) mediaContent).zzc());
            } else if (mediaContent == null) {
                zzbmiVar.zzdE(null);
            } else {
                com.google.android.gms.ads.internal.util.client.zzo.zzd("Use MediaContent provided by NativeAd.getMediaContent");
            }
        } catch (android.os.RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzg("Unable to call setMediaContent on delegate", e);
        }
    }

    final /* synthetic */ void zzc(android.widget.ImageView.ScaleType scaleType) {
        com.google.android.gms.internal.ads.zzbmi zzbmiVar = this.zzb;
        if (zzbmiVar == null || scaleType == null) {
            return;
        }
        try {
            zzbmiVar.zzdC(com.google.android.gms.dynamic.ObjectWrapper.wrap(scaleType));
        } catch (android.os.RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzg("Unable to call setMediaViewImageScaleType on delegate", e);
        }
    }

    public NativeAdView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.zza = zze(context);
        this.zzb = zzf();
    }

    public NativeAdView(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.zza = zze(context);
        this.zzb = zzf();
    }

    public NativeAdView(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.zza = zze(context);
        this.zzb = zzf();
    }
}
