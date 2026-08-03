package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.2.0 */
@javax.annotation.ParametersAreNonnullByDefault
/* loaded from: classes4.dex */
public final class zzccr extends com.google.android.gms.ads.rewarded.RewardedAd {
    private final java.util.concurrent.atomic.AtomicReference zza;
    private final com.google.android.gms.internal.ads.zzcci zzb;
    private final android.content.Context zzc;
    private final com.google.android.gms.internal.ads.zzcda zzd;
    private com.google.android.gms.ads.rewarded.OnAdMetadataChangedListener zze;
    private com.google.android.gms.ads.OnPaidEventListener zzf;
    private com.google.android.gms.ads.FullScreenContentCallback zzg;
    private final long zzh;
    private final java.util.concurrent.atomic.AtomicLong zzi;

    public zzccr(android.content.Context context, com.google.android.gms.internal.ads.zzcci zzcciVar) {
        this.zzh = java.lang.System.currentTimeMillis();
        this.zzi = new java.util.concurrent.atomic.AtomicLong();
        this.zzc = context.getApplicationContext();
        this.zza = new java.util.concurrent.atomic.AtomicReference();
        this.zzb = zzcciVar;
        this.zzd = new com.google.android.gms.internal.ads.zzcda();
    }

    @Override // com.google.android.gms.ads.rewarded.RewardedAd
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

    @Override // com.google.android.gms.ads.rewarded.RewardedAd
    public final java.lang.String getAdUnitId() {
        java.lang.String str;
        java.lang.String str2;
        java.util.concurrent.atomic.AtomicReference atomicReference = this.zza;
        if (atomicReference.get() != null) {
            return (java.lang.String) atomicReference.get();
        }
        synchronized (this) {
            try {
                str = this.zzb.zzn();
            } catch (android.os.RemoteException e) {
                com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e);
                str = null;
            }
            if (str == null) {
                this.zza.set("");
            } else {
                this.zza.set(str);
            }
            str2 = (java.lang.String) this.zza.get();
        }
        return str2;
    }

    @Override // com.google.android.gms.ads.rewarded.RewardedAd
    public final com.google.android.gms.ads.FullScreenContentCallback getFullScreenContentCallback() {
        return this.zzg;
    }

    @Override // com.google.android.gms.ads.rewarded.RewardedAd
    public final com.google.android.gms.ads.rewarded.OnAdMetadataChangedListener getOnAdMetadataChangedListener() {
        return this.zze;
    }

    @Override // com.google.android.gms.ads.rewarded.RewardedAd
    public final com.google.android.gms.ads.OnPaidEventListener getOnPaidEventListener() {
        return this.zzf;
    }

    @Override // com.google.android.gms.ads.rewarded.RewardedAd
    public final long getPlacementId() {
        long j;
        java.util.concurrent.atomic.AtomicLong atomicLong = this.zzi;
        long j2 = 0;
        if (atomicLong.get() != 0) {
            return atomicLong.get();
        }
        synchronized (this) {
            try {
                com.google.android.gms.internal.ads.zzcci zzcciVar = this.zzb;
                if (zzcciVar != null) {
                    j2 = zzcciVar.zzq();
                }
            } catch (android.os.RemoteException e) {
                com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e);
            }
            java.util.concurrent.atomic.AtomicLong atomicLong2 = this.zzi;
            atomicLong2.set(j2);
            j = atomicLong2.get();
        }
        return j;
    }

    @Override // com.google.android.gms.ads.rewarded.RewardedAd
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

    @Override // com.google.android.gms.ads.rewarded.RewardedAd
    public final com.google.android.gms.ads.rewarded.RewardItem getRewardItem() {
        try {
            com.google.android.gms.internal.ads.zzcci zzcciVar = this.zzb;
            com.google.android.gms.internal.ads.zzccf zzl = zzcciVar != null ? zzcciVar.zzl() : null;
            return zzl == null ? com.google.android.gms.ads.rewarded.RewardItem.DEFAULT_REWARD : new com.google.android.gms.internal.ads.zzccs(zzl);
        } catch (android.os.RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e);
            return com.google.android.gms.ads.rewarded.RewardItem.DEFAULT_REWARD;
        }
    }

    @Override // com.google.android.gms.ads.rewarded.RewardedAd
    public final void setFullScreenContentCallback(com.google.android.gms.ads.FullScreenContentCallback fullScreenContentCallback) {
        this.zzg = fullScreenContentCallback;
        this.zzd.zzb(fullScreenContentCallback);
    }

    @Override // com.google.android.gms.ads.rewarded.RewardedAd
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

    @Override // com.google.android.gms.ads.rewarded.RewardedAd
    public final void setOnAdMetadataChangedListener(com.google.android.gms.ads.rewarded.OnAdMetadataChangedListener onAdMetadataChangedListener) {
        try {
            this.zze = onAdMetadataChangedListener;
            com.google.android.gms.internal.ads.zzcci zzcciVar = this.zzb;
            if (zzcciVar != null) {
                zzcciVar.zzf(new com.google.android.gms.ads.internal.client.zzfn(onAdMetadataChangedListener));
            }
        } catch (android.os.RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.ads.rewarded.RewardedAd
    public final void setOnPaidEventListener(com.google.android.gms.ads.OnPaidEventListener onPaidEventListener) {
        try {
            this.zzf = onPaidEventListener;
            com.google.android.gms.internal.ads.zzcci zzcciVar = this.zzb;
            if (zzcciVar != null) {
                zzcciVar.zzo(new com.google.android.gms.ads.internal.client.zzfo(onPaidEventListener));
            }
        } catch (android.os.RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.ads.rewarded.RewardedAd
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

    @Override // com.google.android.gms.ads.rewarded.RewardedAd
    public final void setServerSideVerificationOptions(com.google.android.gms.ads.rewarded.ServerSideVerificationOptions serverSideVerificationOptions) {
        if (serverSideVerificationOptions != null) {
            try {
                com.google.android.gms.internal.ads.zzcci zzcciVar = this.zzb;
                if (zzcciVar != null) {
                    zzcciVar.zzh(new com.google.android.gms.internal.ads.zzccw(serverSideVerificationOptions));
                }
            } catch (android.os.RemoteException e) {
                com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e);
            }
        }
    }

    @Override // com.google.android.gms.ads.rewarded.RewardedAd
    public final void show(android.app.Activity activity, com.google.android.gms.ads.OnUserEarnedRewardListener onUserEarnedRewardListener) {
        com.google.android.gms.internal.ads.zzcda zzcdaVar = this.zzd;
        zzcdaVar.zzc(onUserEarnedRewardListener);
        if (activity == null) {
            com.google.android.gms.ads.internal.util.client.zzo.zzi("The activity for show is null, will proceed with show using the context provided when loading the ad.");
        }
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

    public final void zza(com.google.android.gms.ads.internal.client.zzeh zzehVar, com.google.android.gms.ads.rewarded.RewardedAdLoadCallback rewardedAdLoadCallback) {
        try {
            com.google.android.gms.internal.ads.zzcci zzcciVar = this.zzb;
            if (zzcciVar != null) {
                zzehVar.zzp(this.zzh);
                zzcciVar.zzc(com.google.android.gms.ads.internal.client.zzq.zza.zza(this.zzc, zzehVar), new com.google.android.gms.internal.ads.zzccv(rewardedAdLoadCallback, this));
            }
        } catch (android.os.RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e);
        }
    }

    public zzccr(android.content.Context context, java.lang.String str) {
        this(context, str, com.google.android.gms.ads.internal.client.zzay.zzb().zzf(context, str, new com.google.android.gms.internal.ads.zzbuy()));
    }

    public zzccr(android.content.Context context, java.lang.String str, com.google.android.gms.internal.ads.zzcci zzcciVar) {
        this.zzh = java.lang.System.currentTimeMillis();
        this.zzi = new java.util.concurrent.atomic.AtomicLong();
        this.zzc = context.getApplicationContext();
        this.zza = new java.util.concurrent.atomic.AtomicReference(str);
        this.zzb = zzcciVar;
        this.zzd = new com.google.android.gms.internal.ads.zzcda();
    }
}
