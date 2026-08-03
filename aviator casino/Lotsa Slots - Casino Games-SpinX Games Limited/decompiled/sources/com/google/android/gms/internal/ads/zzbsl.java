package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzbsl extends com.google.android.gms.ads.admanager.AdManagerInterstitialAd {
    private final android.content.Context zza;
    private final com.google.android.gms.ads.internal.client.zzq zzb;
    private final com.google.android.gms.ads.internal.client.zzbu zzc;
    private final java.util.concurrent.atomic.AtomicReference zzd;
    private final com.google.android.gms.internal.ads.zzbuy zze;
    private final long zzf;
    private com.google.android.gms.ads.admanager.AppEventListener zzg;
    private com.google.android.gms.ads.FullScreenContentCallback zzh;
    private com.google.android.gms.ads.OnPaidEventListener zzi;
    private final java.util.concurrent.atomic.AtomicLong zzj;

    public zzbsl(android.content.Context context, com.google.android.gms.ads.internal.client.zzbu zzbuVar) {
        this.zze = new com.google.android.gms.internal.ads.zzbuy();
        this.zzf = java.lang.System.currentTimeMillis();
        this.zzj = new java.util.concurrent.atomic.AtomicLong();
        this.zza = context;
        this.zzd = new java.util.concurrent.atomic.AtomicReference();
        this.zzb = com.google.android.gms.ads.internal.client.zzq.zza;
        this.zzc = zzbuVar;
    }

    @Override // com.google.android.gms.ads.interstitial.InterstitialAd
    public final java.lang.String getAdUnitId() {
        java.lang.String str;
        java.lang.String str2;
        java.util.concurrent.atomic.AtomicReference atomicReference = this.zzd;
        if (atomicReference.get() != null) {
            return (java.lang.String) atomicReference.get();
        }
        synchronized (this) {
            try {
                str = this.zzc.zzu();
            } catch (android.os.RemoteException e) {
                com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e);
                str = null;
            }
            if (str == null) {
                this.zzd.set("");
            } else {
                this.zzd.set(str);
            }
            str2 = (java.lang.String) this.zzd.get();
        }
        return str2;
    }

    @Override // com.google.android.gms.ads.admanager.AdManagerInterstitialAd
    public final com.google.android.gms.ads.admanager.AppEventListener getAppEventListener() {
        return this.zzg;
    }

    @Override // com.google.android.gms.ads.interstitial.InterstitialAd
    public final com.google.android.gms.ads.FullScreenContentCallback getFullScreenContentCallback() {
        return this.zzh;
    }

    @Override // com.google.android.gms.ads.interstitial.InterstitialAd
    public final com.google.android.gms.ads.OnPaidEventListener getOnPaidEventListener() {
        return this.zzi;
    }

    @Override // com.google.android.gms.ads.interstitial.InterstitialAd
    public final long getPlacementId() {
        java.util.concurrent.atomic.AtomicLong atomicLong = this.zzj;
        if (atomicLong.get() != 0) {
            return atomicLong.get();
        }
        synchronized (this) {
            try {
                try {
                    com.google.android.gms.ads.internal.client.zzbu zzbuVar = this.zzc;
                    if (zzbuVar != null) {
                        long zzU = zzbuVar.zzU();
                        java.util.concurrent.atomic.AtomicLong atomicLong2 = this.zzj;
                        atomicLong2.set(zzU);
                        return atomicLong2.get();
                    }
                } catch (android.os.RemoteException e) {
                    com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e);
                }
                return 0L;
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.ads.interstitial.InterstitialAd
    public final com.google.android.gms.ads.ResponseInfo getResponseInfo() {
        com.google.android.gms.ads.internal.client.zzdx zzdxVar = null;
        try {
            com.google.android.gms.ads.internal.client.zzbu zzbuVar = this.zzc;
            if (zzbuVar != null) {
                zzdxVar = zzbuVar.zzt();
            }
        } catch (android.os.RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e);
        }
        return com.google.android.gms.ads.ResponseInfo.zzc(zzdxVar);
    }

    @Override // com.google.android.gms.ads.admanager.AdManagerInterstitialAd
    public final void setAppEventListener(com.google.android.gms.ads.admanager.AppEventListener appEventListener) {
        try {
            this.zzg = appEventListener;
            com.google.android.gms.ads.internal.client.zzbu zzbuVar = this.zzc;
            if (zzbuVar != null) {
                zzbuVar.zzi(appEventListener != null ? new com.google.android.gms.internal.ads.zzbff(appEventListener) : null);
            }
        } catch (android.os.RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.ads.interstitial.InterstitialAd
    public final void setFullScreenContentCallback(com.google.android.gms.ads.FullScreenContentCallback fullScreenContentCallback) {
        try {
            this.zzh = fullScreenContentCallback;
            com.google.android.gms.ads.internal.client.zzbu zzbuVar = this.zzc;
            if (zzbuVar != null) {
                zzbuVar.zzS(new com.google.android.gms.ads.internal.client.zzbb(fullScreenContentCallback));
            }
        } catch (android.os.RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.ads.interstitial.InterstitialAd
    public final void setImmersiveMode(boolean z) {
        try {
            com.google.android.gms.ads.internal.client.zzbu zzbuVar = this.zzc;
            if (zzbuVar != null) {
                zzbuVar.zzK(z);
            }
        } catch (android.os.RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.ads.interstitial.InterstitialAd
    public final void setOnPaidEventListener(com.google.android.gms.ads.OnPaidEventListener onPaidEventListener) {
        try {
            this.zzi = onPaidEventListener;
            com.google.android.gms.ads.internal.client.zzbu zzbuVar = this.zzc;
            if (zzbuVar != null) {
                zzbuVar.zzP(new com.google.android.gms.ads.internal.client.zzfo(onPaidEventListener));
            }
        } catch (android.os.RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.ads.interstitial.InterstitialAd
    public final void setPlacementId(long j) {
        try {
            com.google.android.gms.ads.internal.client.zzbu zzbuVar = this.zzc;
            if (zzbuVar != null) {
                zzbuVar.zzT(j);
                this.zzj.set(j);
            }
        } catch (android.os.RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.ads.interstitial.InterstitialAd
    public final void show(android.app.Activity activity) {
        if (activity == null) {
            com.google.android.gms.ads.internal.util.client.zzo.zzi("The activity for show is null, will proceed with show using the context provided when loading the ad.");
        }
        try {
            com.google.android.gms.ads.internal.client.zzbu zzbuVar = this.zzc;
            if (zzbuVar != null) {
                zzbuVar.zzR(com.google.android.gms.dynamic.ObjectWrapper.wrap(activity));
            }
        } catch (android.os.RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e);
        }
    }

    public final void zza(com.google.android.gms.ads.internal.client.zzeh zzehVar, com.google.android.gms.ads.AdLoadCallback adLoadCallback) {
        try {
            com.google.android.gms.ads.internal.client.zzbu zzbuVar = this.zzc;
            if (zzbuVar != null) {
                zzehVar.zzp(this.zzf);
                zzbuVar.zzQ(this.zzb.zza(this.zza, zzehVar), new com.google.android.gms.ads.internal.client.zzh(adLoadCallback, this));
            }
        } catch (android.os.RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e);
            adLoadCallback.onAdFailedToLoad(new com.google.android.gms.ads.LoadAdError(0, "Internal Error.", com.google.android.gms.ads.MobileAds.ERROR_DOMAIN, null, null));
        }
    }

    public zzbsl(android.content.Context context, java.lang.String str) {
        com.google.android.gms.internal.ads.zzbuy zzbuyVar = new com.google.android.gms.internal.ads.zzbuy();
        this.zze = zzbuyVar;
        this.zzf = java.lang.System.currentTimeMillis();
        this.zzj = new java.util.concurrent.atomic.AtomicLong();
        this.zza = context;
        this.zzd = new java.util.concurrent.atomic.AtomicReference(str);
        this.zzb = com.google.android.gms.ads.internal.client.zzq.zza;
        this.zzc = com.google.android.gms.ads.internal.client.zzay.zzb().zzb(context, new com.google.android.gms.ads.internal.client.zzr(), str, zzbuyVar);
    }

    public zzbsl(android.content.Context context, java.lang.String str, com.google.android.gms.ads.internal.client.zzbu zzbuVar) {
        com.google.android.gms.ads.internal.client.zzq zzqVar = com.google.android.gms.ads.internal.client.zzq.zza;
        this.zze = new com.google.android.gms.internal.ads.zzbuy();
        this.zzf = java.lang.System.currentTimeMillis();
        this.zzj = new java.util.concurrent.atomic.AtomicLong();
        this.zza = context;
        this.zzd = new java.util.concurrent.atomic.AtomicReference(str);
        this.zzb = zzqVar;
        this.zzc = zzbuVar;
    }
}
