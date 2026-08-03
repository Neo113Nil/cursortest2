package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzbhj implements com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks {
    public static final /* synthetic */ int zzd = 0;
    final /* synthetic */ com.google.android.gms.internal.ads.zzbhb zza;
    final /* synthetic */ com.google.android.gms.internal.ads.zzcfw zzb;
    final /* synthetic */ com.google.android.gms.internal.ads.zzbhl zzc;

    zzbhj(com.google.android.gms.internal.ads.zzbhl zzbhlVar, com.google.android.gms.internal.ads.zzbhb zzbhbVar, com.google.android.gms.internal.ads.zzcfw zzcfwVar) {
        this.zza = zzbhbVar;
        this.zzb = zzcfwVar;
        java.util.Objects.requireNonNull(zzbhlVar);
        this.zzc = zzbhlVar;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnectionSuspended(int i) {
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnected(android.os.Bundle bundle) {
        com.google.android.gms.internal.ads.zzbhl zzbhlVar = this.zzc;
        synchronized (zzbhlVar.zzf()) {
            if (zzbhlVar.zzd()) {
                return;
            }
            zzbhlVar.zze(true);
            final com.google.android.gms.internal.ads.zzbha zzc = zzbhlVar.zzc();
            if (zzc == null) {
                return;
            }
            com.google.android.gms.internal.ads.zzhcg zzhcgVar = com.google.android.gms.internal.ads.zzcfr.zza;
            final com.google.android.gms.internal.ads.zzbhb zzbhbVar = this.zza;
            final com.google.android.gms.internal.ads.zzcfw zzcfwVar = this.zzb;
            final com.google.common.util.concurrent.ListenableFuture zza = zzhcgVar.zza(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.zzbhi
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    com.google.android.gms.internal.ads.zzcfw zzcfwVar2 = zzcfwVar;
                    com.google.android.gms.internal.ads.zzbha zzbhaVar = zzc;
                    com.google.android.gms.internal.ads.zzbhj zzbhjVar = com.google.android.gms.internal.ads.zzbhj.this;
                    try {
                        com.google.android.gms.internal.ads.zzbhd zzq = zzbhaVar.zzq();
                        boolean zzp = zzbhaVar.zzp();
                        com.google.android.gms.internal.ads.zzbhb zzbhbVar2 = zzbhbVar;
                        com.google.android.gms.internal.ads.zzbgy zzf = zzp ? zzq.zzf(zzbhbVar2) : zzq.zze(zzbhbVar2);
                        if (!zzf.zza()) {
                            zzcfwVar2.zzd(new java.lang.RuntimeException("No entry contents."));
                            zzbhjVar.zzc.zzb();
                            return;
                        }
                        com.google.android.gms.internal.ads.zzbhg zzbhgVar = new com.google.android.gms.internal.ads.zzbhg(zzbhjVar, zzf.zzb(), 1);
                        int read = zzbhgVar.read();
                        if (read == -1) {
                            throw new java.io.IOException("Unable to read from cache.");
                        }
                        zzbhgVar.unread(read);
                        zzcfwVar2.zzc(com.google.android.gms.internal.ads.zzbhn.zza(zzbhgVar, zzf.zzd(), zzf.zzg(), zzf.zzf(), zzf.zze()));
                    } catch (android.os.RemoteException | java.io.IOException e) {
                        int i = com.google.android.gms.ads.internal.util.zze.zza;
                        com.google.android.gms.ads.internal.util.client.zzo.zzg("Unable to obtain a cache service instance.", e);
                        zzcfwVar2.zzd(e);
                        zzbhjVar.zzc.zzb();
                    }
                }
            });
            zzcfwVar.addListener(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.zzbhh
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    int i = com.google.android.gms.internal.ads.zzbhj.zzd;
                    if (com.google.android.gms.internal.ads.zzcfw.this.isCancelled()) {
                        zza.cancel(true);
                    }
                }
            }, com.google.android.gms.internal.ads.zzcfr.zzh);
        }
    }
}
