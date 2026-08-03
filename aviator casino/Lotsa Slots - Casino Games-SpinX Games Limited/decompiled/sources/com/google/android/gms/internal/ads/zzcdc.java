package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.2.0 */
@javax.annotation.ParametersAreNonnullByDefault
/* loaded from: classes4.dex */
public final class zzcdc extends com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAd {
    private final java.lang.String zza;
    private final com.google.android.gms.internal.ads.zzcci zzb;
    private final android.content.Context zzc;
    private com.google.android.gms.ads.FullScreenContentCallback zze;
    private com.google.android.gms.ads.rewarded.OnAdMetadataChangedListener zzf;
    private com.google.android.gms.ads.OnPaidEventListener zzg;
    private final long zzh = java.lang.System.currentTimeMillis();
    private final java.util.concurrent.atomic.AtomicLong zzi = new java.util.concurrent.atomic.AtomicLong();
    private final com.google.android.gms.internal.ads.zzcda zzd = new com.google.android.gms.internal.ads.zzcda();

    public zzcdc(android.content.Context context, java.lang.String str) {
        this.zza = str;
        this.zzc = context.getApplicationContext();
        this.zzb = com.google.android.gms.ads.internal.client.zzay.zzb().zzf(context, str, new com.google.android.gms.internal.ads.zzbuy());
    }

    @Override // com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAd
    public final android.os.Bundle getAdMetadata() {
        try {
            com.google.android.gms.internal.ads.zzcci zzcciVar = this.zzb;
            if (zzcciVar != null) {
                return zzcciVar.zzg();
            }
        } catch (android.os.RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e);
        }
        return new android.os.Bundle();
    }

    @Override // com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAd
    public final java.lang.String getAdUnitId() {
        return this.zza;
    }

    @Override // com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAd
    public final com.google.android.gms.ads.FullScreenContentCallback getFullScreenContentCallback() {
        return this.zze;
    }

    @Override // com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAd
    public final com.google.android.gms.ads.rewarded.OnAdMetadataChangedListener getOnAdMetadataChangedListener() {
        return this.zzf;
    }

    @Override // com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAd
    public final com.google.android.gms.ads.OnPaidEventListener getOnPaidEventListener() {
        return this.zzg;
    }

    @Override // com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAd
    public final long getPlacementId() {
        java.util.concurrent.atomic.AtomicLong atomicLong = this.zzi;
        if (atomicLong.get() != 0) {
            return atomicLong.get();
        }
        synchronized (this) {
            try {
                try {
                    com.google.android.gms.internal.ads.zzcci zzcciVar = this.zzb;
                    if (zzcciVar != null) {
                        long zzq = zzcciVar.zzq();
                        java.util.concurrent.atomic.AtomicLong atomicLong2 = this.zzi;
                        atomicLong2.set(zzq);
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

    @Override // com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAd
    public final com.google.android.gms.ads.ResponseInfo getResponseInfo() {
        com.google.android.gms.ads.internal.client.zzdx zzdxVar = null;
        try {
            com.google.android.gms.internal.ads.zzcci zzcciVar = this.zzb;
            if (zzcciVar != null) {
                zzdxVar = zzcciVar.zzm();
            }
        } catch (android.os.RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e);
        }
        return com.google.android.gms.ads.ResponseInfo.zzc(zzdxVar);
    }

    @Override // com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAd
    public final com.google.android.gms.ads.rewarded.RewardItem getRewardItem() {
        try {
            com.google.android.gms.internal.ads.zzcci zzcciVar = this.zzb;
            com.google.android.gms.internal.ads.zzccf zzl = zzcciVar != null ? zzcciVar.zzl() : null;
            if (zzl != null) {
                return new com.google.android.gms.internal.ads.zzccs(zzl);
            }
        } catch (android.os.RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e);
        }
        return com.google.android.gms.ads.rewarded.RewardItem.DEFAULT_REWARD;
    }

    @Override // com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAd
    public final void setFullScreenContentCallback(com.google.android.gms.ads.FullScreenContentCallback fullScreenContentCallback) {
        this.zze = fullScreenContentCallback;
        this.zzd.zzb(fullScreenContentCallback);
    }

    @Override // com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAd
    public final void setImmersiveMode(boolean z) {
        try {
            com.google.android.gms.internal.ads.zzcci zzcciVar = this.zzb;
            if (zzcciVar != null) {
                zzcciVar.zzp(z);
            }
        } catch (android.os.RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAd
    public final void setOnAdMetadataChangedListener(com.google.android.gms.ads.rewarded.OnAdMetadataChangedListener onAdMetadataChangedListener) {
        this.zzf = onAdMetadataChangedListener;
        try {
            com.google.android.gms.internal.ads.zzcci zzcciVar = this.zzb;
            if (zzcciVar != null) {
                zzcciVar.zzf(new com.google.android.gms.ads.internal.client.zzfn(onAdMetadataChangedListener));
            }
        } catch (android.os.RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAd
    public final void setOnPaidEventListener(com.google.android.gms.ads.OnPaidEventListener onPaidEventListener) {
        this.zzg = onPaidEventListener;
        try {
            com.google.android.gms.internal.ads.zzcci zzcciVar = this.zzb;
            if (zzcciVar != null) {
                zzcciVar.zzo(new com.google.android.gms.ads.internal.client.zzfo(onPaidEventListener));
            }
        } catch (android.os.RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAd
    public final void setPlacementId(long j) {
        try {
            com.google.android.gms.internal.ads.zzcci zzcciVar = this.zzb;
            if (zzcciVar != null) {
                zzcciVar.zzr(j);
                this.zzi.set(j);
            }
        } catch (android.os.RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAd
    public final void setServerSideVerificationOptions(com.google.android.gms.ads.rewarded.ServerSideVerificationOptions serverSideVerificationOptions) {
        try {
            com.google.android.gms.internal.ads.zzcci zzcciVar = this.zzb;
            if (zzcciVar != null) {
                zzcciVar.zzh(new com.google.android.gms.internal.ads.zzccw(serverSideVerificationOptions));
            }
        } catch (android.os.RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAd
    public final void show(android.app.Activity activity, com.google.android.gms.ads.OnUserEarnedRewardListener onUserEarnedRewardListener) {
        com.google.android.gms.internal.ads.zzcda zzcdaVar = this.zzd;
        zzcdaVar.zzc(onUserEarnedRewardListener);
        try {
            com.google.android.gms.internal.ads.zzcci zzcciVar = this.zzb;
            if (zzcciVar != null) {
                zzcciVar.zze(zzcdaVar);
                zzcciVar.zzb(com.google.android.gms.dynamic.ObjectWrapper.wrap(activity));
            }
        } catch (android.os.RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e);
        }
    }

    public final void zza(com.google.android.gms.ads.internal.client.zzeh zzehVar, com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAdLoadCallback rewardedInterstitialAdLoadCallback) {
        try {
            com.google.android.gms.internal.ads.zzcci zzcciVar = this.zzb;
            if (zzcciVar != null) {
                zzehVar.zzp(this.zzh);
                zzcciVar.zzd(com.google.android.gms.ads.internal.client.zzq.zza.zza(this.zzc, zzehVar), new com.google.android.gms.internal.ads.zzcdb(rewardedInterstitialAdLoadCallback, this));
            }
        } catch (android.os.RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e);
        }
    }
}
