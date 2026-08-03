package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzegi extends com.google.android.gms.internal.ads.zzegc {
    private java.lang.String zzg;
    private int zzh = 1;

    zzegi(android.content.Context context) {
        this.zzf = new com.google.android.gms.internal.ads.zzcaf(context, com.google.android.gms.ads.internal.zzt.zzs().zza(), this, this);
    }

    @Override // com.google.android.gms.internal.ads.zzegc, com.google.android.gms.common.internal.BaseGmsClient.BaseOnConnectionFailedListener
    public final void onConnectionFailed(com.google.android.gms.common.ConnectionResult connectionResult) {
        int i = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzd("Cannot connect to remote service, fallback to local instance.");
        this.zza.zzd(new com.google.android.gms.internal.ads.zzegr(1));
    }

    public final com.google.common.util.concurrent.ListenableFuture zza(com.google.android.gms.internal.ads.zzcbd zzcbdVar) {
        synchronized (this.zzb) {
            int i = this.zzh;
            if (i != 1 && i != 2) {
                return com.google.android.gms.internal.ads.zzhbw.zzc(new com.google.android.gms.internal.ads.zzegr(2));
            }
            if (this.zzc) {
                return this.zza;
            }
            this.zzh = 2;
            this.zzc = true;
            this.zze = zzcbdVar;
            this.zzf.checkAvailabilityAndConnect();
            com.google.android.gms.internal.ads.zzcfw zzcfwVar = this.zza;
            zzcfwVar.addListener(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.zzegh
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    com.google.android.gms.internal.ads.zzegi.this.zzb();
                }
            }, com.google.android.gms.internal.ads.zzcfr.zzh);
            return zzcfwVar;
        }
    }

    public final com.google.common.util.concurrent.ListenableFuture zzd(java.lang.String str) {
        synchronized (this.zzb) {
            int i = this.zzh;
            if (i != 1 && i != 3) {
                return com.google.android.gms.internal.ads.zzhbw.zzc(new com.google.android.gms.internal.ads.zzegr(2));
            }
            if (this.zzc) {
                return this.zza;
            }
            this.zzh = 3;
            this.zzc = true;
            this.zzg = str;
            this.zzf.checkAvailabilityAndConnect();
            com.google.android.gms.internal.ads.zzcfw zzcfwVar = this.zza;
            zzcfwVar.addListener(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.zzegg
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    com.google.android.gms.internal.ads.zzegi.this.zzb();
                }
            }, com.google.android.gms.internal.ads.zzcfr.zzh);
            return zzcfwVar;
        }
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnected(android.os.Bundle bundle) {
        synchronized (this.zzb) {
            if (!this.zzd) {
                this.zzd = true;
                try {
                    int i = this.zzh;
                    if (i == 2) {
                        this.zzf.zzp().zzg(this.zze, ((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzov)).booleanValue() ? new com.google.android.gms.internal.ads.zzegb(this.zza, this.zze) : new com.google.android.gms.internal.ads.zzega(this));
                    } else if (i == 3) {
                        this.zzf.zzp().zzh(this.zzg, ((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzov)).booleanValue() ? new com.google.android.gms.internal.ads.zzegb(this.zza, this.zze) : new com.google.android.gms.internal.ads.zzega(this));
                    } else {
                        this.zza.zzd(new com.google.android.gms.internal.ads.zzegr(1));
                    }
                } catch (android.os.RemoteException | java.lang.IllegalArgumentException unused) {
                    this.zza.zzd(new com.google.android.gms.internal.ads.zzegr(1));
                } catch (java.lang.Throwable th) {
                    com.google.android.gms.ads.internal.zzt.zzh().zzg(th, "RemoteUrlAndCacheKeyClientTask.onConnected");
                    this.zza.zzd(new com.google.android.gms.internal.ads.zzegr(1));
                }
            }
        }
    }
}
