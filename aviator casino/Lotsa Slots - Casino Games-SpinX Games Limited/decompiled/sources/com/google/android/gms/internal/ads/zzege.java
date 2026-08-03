package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzege extends com.google.android.gms.internal.ads.zzegc {
    private final android.content.Context zzg;
    private final java.util.concurrent.Executor zzh;

    zzege(android.content.Context context, java.util.concurrent.Executor executor) {
        this.zzg = context;
        this.zzh = executor;
        this.zzf = new com.google.android.gms.internal.ads.zzcaf(context, com.google.android.gms.ads.internal.zzt.zzs().zza(), this, this);
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnected(android.os.Bundle bundle) {
        synchronized (this.zzb) {
            if (!this.zzd) {
                this.zzd = true;
                try {
                    this.zzf.zzp().zzf(this.zze, ((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzov)).booleanValue() ? new com.google.android.gms.internal.ads.zzegb(this.zza, this.zze) : new com.google.android.gms.internal.ads.zzega(this));
                } catch (android.os.RemoteException | java.lang.IllegalArgumentException unused) {
                    this.zza.zzd(new com.google.android.gms.internal.ads.zzegr(1));
                } catch (java.lang.Throwable th) {
                    com.google.android.gms.ads.internal.zzt.zzh().zzg(th, "RemoteSignalsClientTask.onConnected");
                    this.zza.zzd(new com.google.android.gms.internal.ads.zzegr(1));
                }
            }
        }
    }

    public final com.google.common.util.concurrent.ListenableFuture zza(com.google.android.gms.internal.ads.zzcbd zzcbdVar) {
        synchronized (this.zzb) {
            if (this.zzc) {
                return this.zza;
            }
            this.zzc = true;
            this.zze = zzcbdVar;
            this.zzf.checkAvailabilityAndConnect();
            com.google.android.gms.internal.ads.zzcfw zzcfwVar = this.zza;
            zzcfwVar.addListener(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.zzegd
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    com.google.android.gms.internal.ads.zzege.this.zzb();
                }
            }, com.google.android.gms.internal.ads.zzcfr.zzh);
            zzc(this.zzg, zzcfwVar, this.zzh);
            return zzcfwVar;
        }
    }
}
