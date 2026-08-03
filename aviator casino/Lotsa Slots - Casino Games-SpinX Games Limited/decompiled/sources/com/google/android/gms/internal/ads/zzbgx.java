package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzbgx {
    private java.util.concurrent.ScheduledFuture zza = null;
    private final java.lang.Runnable zzb = new com.google.android.gms.internal.ads.zzbgt(this);
    private final java.lang.Object zzc = new java.lang.Object();
    private com.google.android.gms.internal.ads.zzbha zzd;
    private android.content.Context zze;
    private com.google.android.gms.internal.ads.zzbhd zzf;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzl, reason: merged with bridge method [inline-methods] */
    public final void zzf() {
        synchronized (this.zzc) {
            if (this.zze != null && this.zzd == null) {
                com.google.android.gms.internal.ads.zzbha zze = zze(new com.google.android.gms.internal.ads.zzbgv(this), new com.google.android.gms.internal.ads.zzbgw(this));
                this.zzd = zze;
                zze.checkAvailabilityAndConnect();
            }
        }
    }

    public final void zza(android.content.Context context) {
        if (context == null) {
            return;
        }
        synchronized (this.zzc) {
            if (this.zze != null) {
                return;
            }
            this.zze = context.getApplicationContext();
            if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzfg)).booleanValue()) {
                zzf();
            } else {
                if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzff)).booleanValue()) {
                    com.google.android.gms.ads.internal.zzt.zzg().zzb(new com.google.android.gms.internal.ads.zzbgu(this));
                }
            }
        }
    }

    public final void zzb() {
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzfh)).booleanValue()) {
            synchronized (this.zzc) {
                zzf();
                java.util.concurrent.ScheduledFuture scheduledFuture = this.zza;
                if (scheduledFuture != null) {
                    scheduledFuture.cancel(false);
                }
                this.zza = com.google.android.gms.internal.ads.zzcfr.zzd.schedule(this.zzb, ((java.lang.Long) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzfi)).longValue(), java.util.concurrent.TimeUnit.MILLISECONDS);
            }
        }
    }

    public final com.google.android.gms.internal.ads.zzbgy zzc(com.google.android.gms.internal.ads.zzbhb zzbhbVar) {
        synchronized (this.zzc) {
            if (this.zzf == null) {
                return new com.google.android.gms.internal.ads.zzbgy();
            }
            try {
                if (this.zzd.zzp()) {
                    return this.zzf.zzf(zzbhbVar);
                }
                return this.zzf.zze(zzbhbVar);
            } catch (android.os.RemoteException e) {
                int i = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzg("Unable to call into cache service.", e);
                return new com.google.android.gms.internal.ads.zzbgy();
            }
        }
    }

    public final long zzd(com.google.android.gms.internal.ads.zzbhb zzbhbVar) {
        synchronized (this.zzc) {
            if (this.zzf == null) {
                return -2L;
            }
            if (this.zzd.zzp()) {
                try {
                    return this.zzf.zzg(zzbhbVar);
                } catch (android.os.RemoteException e) {
                    int i = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzg("Unable to call into cache service.", e);
                }
            }
            return -2L;
        }
    }

    protected final synchronized com.google.android.gms.internal.ads.zzbha zze(com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks baseConnectionCallbacks, com.google.android.gms.common.internal.BaseGmsClient.BaseOnConnectionFailedListener baseOnConnectionFailedListener) {
        return new com.google.android.gms.internal.ads.zzbha(this.zze, com.google.android.gms.ads.internal.zzt.zzs().zza(), baseConnectionCallbacks, baseOnConnectionFailedListener);
    }

    final /* synthetic */ void zzg() {
        synchronized (this.zzc) {
            com.google.android.gms.internal.ads.zzbha zzbhaVar = this.zzd;
            if (zzbhaVar == null) {
                return;
            }
            if (zzbhaVar.isConnected() || this.zzd.isConnecting()) {
                this.zzd.disconnect();
            }
            this.zzd = null;
            this.zzf = null;
            android.os.Binder.flushPendingCommands();
        }
    }

    final /* synthetic */ java.lang.Object zzh() {
        return this.zzc;
    }

    final /* synthetic */ com.google.android.gms.internal.ads.zzbha zzi() {
        return this.zzd;
    }

    final /* synthetic */ void zzj(com.google.android.gms.internal.ads.zzbha zzbhaVar) {
        this.zzd = null;
    }

    final /* synthetic */ void zzk(com.google.android.gms.internal.ads.zzbhd zzbhdVar) {
        this.zzf = zzbhdVar;
    }
}
