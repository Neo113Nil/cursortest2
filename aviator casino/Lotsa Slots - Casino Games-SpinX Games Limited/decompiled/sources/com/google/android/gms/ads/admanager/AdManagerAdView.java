package com.google.android.gms.ads.admanager;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.2.0 */
/* loaded from: classes3.dex */
public final class AdManagerAdView extends com.google.android.gms.ads.BaseAdView {
    public AdManagerAdView(android.content.Context context) {
        super(context, 0);
        com.google.android.gms.common.internal.Preconditions.checkNotNull(context, "Context cannot be null");
    }

    public com.google.android.gms.ads.AdSize[] getAdSizes() {
        return this.zza.zzd();
    }

    public com.google.android.gms.ads.admanager.AppEventListener getAppEventListener() {
        return this.zza.zzf();
    }

    public com.google.android.gms.ads.VideoController getVideoController() {
        return this.zza.zzy();
    }

    public com.google.android.gms.ads.VideoOptions getVideoOptions() {
        return this.zza.zzB();
    }

    public void loadAd(final com.google.android.gms.ads.admanager.AdManagerAdRequest adManagerAdRequest) {
        com.google.android.gms.common.internal.Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        com.google.android.gms.internal.ads.zzbiq.zza(getContext());
        if (((java.lang.Boolean) com.google.android.gms.internal.ads.zzbko.zzf.zze()).booleanValue()) {
            if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzmD)).booleanValue()) {
                com.google.android.gms.ads.internal.util.client.zzb.zzb.execute(new java.lang.Runnable() { // from class: com.google.android.gms.ads.admanager.zza
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        com.google.android.gms.ads.admanager.AdManagerAdView.this.zzb(adManagerAdRequest);
                    }
                });
                return;
            }
        }
        this.zza.zzg(adManagerAdRequest.zza());
    }

    public void recordManualImpression() {
        this.zza.zzi();
    }

    public void setAdSizes(com.google.android.gms.ads.AdSize... adSizeArr) {
        if (adSizeArr == null || adSizeArr.length <= 0) {
            throw new java.lang.IllegalArgumentException("The supported ad sizes must contain at least one valid ad size.");
        }
        this.zza.zzn(adSizeArr);
    }

    public void setAppEventListener(com.google.android.gms.ads.admanager.AppEventListener appEventListener) {
        this.zza.zzp(appEventListener);
    }

    public void setManualImpressionsEnabled(boolean z) {
        this.zza.zzq(z);
    }

    public void setVideoOptions(com.google.android.gms.ads.VideoOptions videoOptions) {
        this.zza.zzA(videoOptions);
    }

    public final boolean zza(com.google.android.gms.ads.internal.client.zzbu zzbuVar) {
        return this.zza.zzC(zzbuVar);
    }

    final /* synthetic */ void zzb(com.google.android.gms.ads.admanager.AdManagerAdRequest adManagerAdRequest) {
        try {
            this.zza.zzg(adManagerAdRequest.zza());
        } catch (java.lang.IllegalStateException e) {
            com.google.android.gms.internal.ads.zzbzy.zza(getContext()).zzh(e, "AdManagerAdView.loadAd");
        }
    }

    public AdManagerAdView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet, true);
        com.google.android.gms.common.internal.Preconditions.checkNotNull(context, "Context cannot be null");
    }

    public AdManagerAdView(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i, 0, true);
        com.google.android.gms.common.internal.Preconditions.checkNotNull(context, "Context cannot be null");
    }
}
