package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzbgf extends com.google.android.gms.ads.appopen.AppOpenAd {
    com.google.android.gms.ads.FullScreenContentCallback zza;
    private final com.google.android.gms.internal.ads.zzbgj zzb;
    private final java.util.concurrent.atomic.AtomicReference zzc;
    private final com.google.android.gms.internal.ads.zzbgg zzd;
    private com.google.android.gms.ads.OnPaidEventListener zze;
    private final java.util.concurrent.atomic.AtomicLong zzf;

    public zzbgf(com.google.android.gms.internal.ads.zzbgj zzbgjVar) {
        this.zzd = new com.google.android.gms.internal.ads.zzbgg();
        this.zzf = new java.util.concurrent.atomic.AtomicLong();
        this.zzb = zzbgjVar;
        this.zzc = new java.util.concurrent.atomic.AtomicReference();
    }

    @Override // com.google.android.gms.ads.appopen.AppOpenAd
    public final java.lang.String getAdUnitId() {
        java.lang.String str;
        java.lang.String str2;
        java.util.concurrent.atomic.AtomicReference atomicReference = this.zzc;
        if (atomicReference.get() != null) {
            return (java.lang.String) atomicReference.get();
        }
        synchronized (this) {
            try {
                str = this.zzb.zzj();
            } catch (android.os.RemoteException e) {
                com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e);
                str = null;
            }
            if (str == null) {
                this.zzc.set("");
            } else {
                this.zzc.set(str);
            }
            str2 = (java.lang.String) this.zzc.get();
        }
        return str2;
    }

    @Override // com.google.android.gms.ads.appopen.AppOpenAd
    public final com.google.android.gms.ads.FullScreenContentCallback getFullScreenContentCallback() {
        return this.zza;
    }

    @Override // com.google.android.gms.ads.appopen.AppOpenAd
    public final com.google.android.gms.ads.OnPaidEventListener getOnPaidEventListener() {
        return this.zze;
    }

    @Override // com.google.android.gms.ads.appopen.AppOpenAd
    public final long getPlacementId() {
        long j;
        java.util.concurrent.atomic.AtomicLong atomicLong = this.zzf;
        if (atomicLong.get() != 0) {
            return atomicLong.get();
        }
        synchronized (this) {
            try {
                try {
                    long zzk = this.zzb.zzk();
                    java.util.concurrent.atomic.AtomicLong atomicLong2 = this.zzf;
                    atomicLong2.set(zzk);
                    j = atomicLong2.get();
                } catch (android.os.RemoteException e) {
                    com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e);
                    return 0L;
                }
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
        return j;
    }

    @Override // com.google.android.gms.ads.appopen.AppOpenAd
    public final com.google.android.gms.ads.ResponseInfo getResponseInfo() {
        com.google.android.gms.ads.internal.client.zzdx zzdxVar;
        try {
            zzdxVar = this.zzb.zzg();
        } catch (android.os.RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e);
            zzdxVar = null;
        }
        return com.google.android.gms.ads.ResponseInfo.zzc(zzdxVar);
    }

    @Override // com.google.android.gms.ads.appopen.AppOpenAd
    public final void setFullScreenContentCallback(com.google.android.gms.ads.FullScreenContentCallback fullScreenContentCallback) {
        this.zza = fullScreenContentCallback;
        this.zzd.zzb(fullScreenContentCallback);
    }

    @Override // com.google.android.gms.ads.appopen.AppOpenAd
    public final void setImmersiveMode(boolean z) {
        try {
            this.zzb.zzh(z);
        } catch (android.os.RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.ads.appopen.AppOpenAd
    public final void setOnPaidEventListener(com.google.android.gms.ads.OnPaidEventListener onPaidEventListener) {
        this.zze = onPaidEventListener;
        try {
            this.zzb.zzi(new com.google.android.gms.ads.internal.client.zzfo(onPaidEventListener));
        } catch (android.os.RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.ads.appopen.AppOpenAd
    public final void setPlacementId(long j) {
        try {
            this.zzb.zzl(j);
            this.zzf.set(j);
        } catch (android.os.RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.ads.appopen.AppOpenAd
    public final void show(android.app.Activity activity) {
        try {
            this.zzb.zzf(com.google.android.gms.dynamic.ObjectWrapper.wrap(activity), this.zzd);
        } catch (android.os.RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e);
        }
    }

    public zzbgf(com.google.android.gms.internal.ads.zzbgj zzbgjVar, java.lang.String str) {
        this.zzd = new com.google.android.gms.internal.ads.zzbgg();
        this.zzf = new java.util.concurrent.atomic.AtomicLong();
        this.zzb = zzbgjVar;
        this.zzc = new java.util.concurrent.atomic.AtomicReference(str);
    }
}
