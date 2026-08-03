package com.google.android.gms.ads;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.2.0 */
/* loaded from: classes3.dex */
public class AdLoader {
    private final com.google.android.gms.ads.internal.client.zzq zza;
    private final android.content.Context zzb;
    private final com.google.android.gms.ads.internal.client.zzbn zzc;

    /* compiled from: com.google.android.gms:play-services-ads-api@@25.2.0 */
    public static class Builder {
        private final android.content.Context zza;
        private final com.google.android.gms.ads.internal.client.zzbq zzb;

        public Builder(android.content.Context context, java.lang.String str) {
            android.content.Context context2 = (android.content.Context) com.google.android.gms.common.internal.Preconditions.checkNotNull(context, "context cannot be null");
            com.google.android.gms.ads.internal.client.zzbq zzc = com.google.android.gms.ads.internal.client.zzay.zzb().zzc(context, str, new com.google.android.gms.internal.ads.zzbuy());
            this.zza = context2;
            this.zzb = zzc;
        }

        public com.google.android.gms.ads.AdLoader build() {
            try {
                return new com.google.android.gms.ads.AdLoader(this.zza, this.zzb.zze(), com.google.android.gms.ads.internal.client.zzq.zza);
            } catch (android.os.RemoteException e) {
                com.google.android.gms.ads.internal.util.client.zzo.zzg("Failed to build AdLoader.", e);
                return new com.google.android.gms.ads.AdLoader(this.zza, new com.google.android.gms.ads.internal.client.zzff().zzb(), com.google.android.gms.ads.internal.client.zzq.zza);
            }
        }

        public com.google.android.gms.ads.AdLoader.Builder forCustomFormatAd(java.lang.String str, com.google.android.gms.ads.nativead.NativeCustomFormatAd.OnCustomFormatAdLoadedListener onCustomFormatAdLoadedListener, com.google.android.gms.ads.nativead.NativeCustomFormatAd.OnCustomClickListener onCustomClickListener) {
            com.google.android.gms.internal.ads.zzbyo zzbyoVar = new com.google.android.gms.internal.ads.zzbyo(onCustomFormatAdLoadedListener, onCustomClickListener);
            try {
                this.zzb.zzi(str, zzbyoVar.zza(), zzbyoVar.zzb());
            } catch (android.os.RemoteException e) {
                com.google.android.gms.ads.internal.util.client.zzo.zzj("Failed to add custom format ad listener", e);
            }
            return this;
        }

        public com.google.android.gms.ads.AdLoader.Builder forNativeAd(com.google.android.gms.ads.nativead.NativeAd.OnNativeAdLoadedListener onNativeAdLoadedListener) {
            try {
                this.zzb.zzm(new com.google.android.gms.internal.ads.zzbyq(onNativeAdLoadedListener));
            } catch (android.os.RemoteException e) {
                com.google.android.gms.ads.internal.util.client.zzo.zzj("Failed to add google native ad listener", e);
            }
            return this;
        }

        public com.google.android.gms.ads.AdLoader.Builder withAdListener(com.google.android.gms.ads.AdListener adListener) {
            try {
                this.zzb.zzf(new com.google.android.gms.ads.internal.client.zzg(adListener));
            } catch (android.os.RemoteException e) {
                com.google.android.gms.ads.internal.util.client.zzo.zzj("Failed to set AdListener.", e);
            }
            return this;
        }

        public com.google.android.gms.ads.AdLoader.Builder withAdManagerAdViewOptions(com.google.android.gms.ads.formats.AdManagerAdViewOptions adManagerAdViewOptions) {
            try {
                this.zzb.zzp(adManagerAdViewOptions);
            } catch (android.os.RemoteException e) {
                com.google.android.gms.ads.internal.util.client.zzo.zzj("Failed to specify Ad Manager banner ad options", e);
            }
            return this;
        }

        public com.google.android.gms.ads.AdLoader.Builder withNativeAdOptions(com.google.android.gms.ads.nativead.NativeAdOptions nativeAdOptions) {
            try {
                this.zzb.zzj(new com.google.android.gms.internal.ads.zzblt(4, nativeAdOptions.shouldReturnUrlsForImageAssets(), -1, nativeAdOptions.shouldRequestMultipleImages(), nativeAdOptions.getAdChoicesPlacement(), nativeAdOptions.getVideoOptions() != null ? new com.google.android.gms.ads.internal.client.zzfw(nativeAdOptions.getVideoOptions()) : null, nativeAdOptions.zza(), nativeAdOptions.getMediaAspectRatio(), nativeAdOptions.zzb(), nativeAdOptions.zzc(), nativeAdOptions.zzd() - 1));
            } catch (android.os.RemoteException e) {
                com.google.android.gms.ads.internal.util.client.zzo.zzj("Failed to specify native ad options", e);
            }
            return this;
        }

        @java.lang.Deprecated
        public final com.google.android.gms.ads.AdLoader.Builder zza(com.google.android.gms.ads.formats.zzg zzgVar) {
            try {
                this.zzb.zzm(new com.google.android.gms.internal.ads.zzboe(zzgVar));
            } catch (android.os.RemoteException e) {
                com.google.android.gms.ads.internal.util.client.zzo.zzj("Failed to add google native ad listener", e);
            }
            return this;
        }

        @java.lang.Deprecated
        public final com.google.android.gms.ads.AdLoader.Builder zzb(java.lang.String str, com.google.android.gms.ads.formats.zze zzeVar, com.google.android.gms.ads.formats.zzd zzdVar) {
            com.google.android.gms.internal.ads.zzbob zzbobVar = new com.google.android.gms.internal.ads.zzbob(zzeVar, zzdVar);
            try {
                this.zzb.zzi(str, zzbobVar.zza(), zzbobVar.zzb());
            } catch (android.os.RemoteException e) {
                com.google.android.gms.ads.internal.util.client.zzo.zzj("Failed to add custom template ad listener", e);
            }
            return this;
        }

        @java.lang.Deprecated
        public final com.google.android.gms.ads.AdLoader.Builder zzc(com.google.android.gms.ads.formats.NativeAdOptions nativeAdOptions) {
            try {
                this.zzb.zzj(new com.google.android.gms.internal.ads.zzblt(nativeAdOptions));
            } catch (android.os.RemoteException e) {
                com.google.android.gms.ads.internal.util.client.zzo.zzj("Failed to specify native ad options", e);
            }
            return this;
        }

        public com.google.android.gms.ads.AdLoader.Builder forAdManagerAdView(com.google.android.gms.ads.formats.OnAdManagerAdViewLoadedListener onAdManagerAdViewLoadedListener, com.google.android.gms.ads.AdSize... adSizeArr) {
            if (adSizeArr == null || adSizeArr.length <= 0) {
                throw new java.lang.IllegalArgumentException("The supported ad sizes must contain at least one valid ad size.");
            }
            try {
                this.zzb.zzk(new com.google.android.gms.internal.ads.zzbod(onAdManagerAdViewLoadedListener), new com.google.android.gms.ads.internal.client.zzr(this.zza, adSizeArr));
            } catch (android.os.RemoteException e) {
                com.google.android.gms.ads.internal.util.client.zzo.zzj("Failed to add Google Ad Manager banner ad listener", e);
            }
            return this;
        }
    }

    AdLoader(android.content.Context context, com.google.android.gms.ads.internal.client.zzbn zzbnVar, com.google.android.gms.ads.internal.client.zzq zzqVar) {
        this.zzb = context;
        this.zzc = zzbnVar;
        this.zza = zzqVar;
    }

    private final void zzb(final com.google.android.gms.ads.internal.client.zzeh zzehVar) {
        android.content.Context context = this.zzb;
        com.google.android.gms.internal.ads.zzbiq.zza(context);
        if (((java.lang.Boolean) com.google.android.gms.internal.ads.zzbko.zzc.zze()).booleanValue()) {
            if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzmD)).booleanValue()) {
                com.google.android.gms.ads.internal.util.client.zzb.zzb.execute(new java.lang.Runnable() { // from class: com.google.android.gms.ads.zza
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        com.google.android.gms.ads.AdLoader.this.zza(zzehVar);
                    }
                });
                return;
            }
        }
        try {
            this.zzc.zze(this.zza.zza(context, zzehVar));
        } catch (android.os.RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzg("Failed to load ad.", e);
        }
    }

    public boolean isLoading() {
        try {
            return this.zzc.zzg();
        } catch (android.os.RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzj("Failed to check if ad is loading.", e);
            return false;
        }
    }

    public void loadAd(com.google.android.gms.ads.AdRequest adRequest) {
        zzb(adRequest.zza);
    }

    public void loadAds(com.google.android.gms.ads.AdRequest adRequest, int i) {
        try {
            this.zzc.zzi(this.zza.zza(this.zzb, adRequest.zza), i);
        } catch (android.os.RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzg("Failed to load ads.", e);
        }
    }

    final /* synthetic */ void zza(com.google.android.gms.ads.internal.client.zzeh zzehVar) {
        try {
            this.zzc.zze(this.zza.zza(this.zzb, zzehVar));
        } catch (android.os.RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzg("Failed to load ad.", e);
        }
    }

    public void loadAd(com.google.android.gms.ads.admanager.AdManagerAdRequest adManagerAdRequest) {
        zzb(adManagerAdRequest.zza);
    }
}
