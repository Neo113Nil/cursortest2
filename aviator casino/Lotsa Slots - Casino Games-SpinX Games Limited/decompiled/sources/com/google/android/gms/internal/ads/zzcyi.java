package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzcyi {
    private final java.util.concurrent.Executor zza;
    private final java.util.concurrent.ScheduledExecutorService zzb;
    private final com.google.common.util.concurrent.ListenableFuture zzc;
    private volatile boolean zzd = true;

    public zzcyi(java.util.concurrent.Executor executor, java.util.concurrent.ScheduledExecutorService scheduledExecutorService, com.google.common.util.concurrent.ListenableFuture listenableFuture) {
        this.zza = executor;
        this.zzb = scheduledExecutorService;
        this.zzc = listenableFuture;
    }

    public final void zza(com.google.android.gms.internal.ads.zzhbt zzhbtVar) {
        com.google.android.gms.internal.ads.zzhbw.zzr(this.zzc, new com.google.android.gms.internal.ads.zzcyc(this, zzhbtVar), this.zza);
    }

    public final boolean zzb() {
        return this.zzd;
    }

    final /* synthetic */ com.google.common.util.concurrent.ListenableFuture zzc(com.google.android.gms.internal.ads.zzhbt zzhbtVar, com.google.common.util.concurrent.ListenableFuture listenableFuture, com.google.android.gms.internal.ads.zzcxt zzcxtVar) {
        if (zzcxtVar != null) {
            zzhbtVar.zzb(zzcxtVar);
        }
        return com.google.android.gms.internal.ads.zzhbw.zzi(listenableFuture, ((java.lang.Long) com.google.android.gms.internal.ads.zzble.zza.zze()).longValue(), java.util.concurrent.TimeUnit.MILLISECONDS, this.zzb);
    }

    final /* synthetic */ void zzd() {
        this.zzd = false;
    }

    final /* synthetic */ void zze(java.util.List list, final com.google.android.gms.internal.ads.zzhbt zzhbtVar) {
        if (list == null || list.isEmpty()) {
            this.zza.execute(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.zzcyh
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    com.google.android.gms.internal.ads.zzhbt.this.zza(new com.google.android.gms.internal.ads.zzeed(3));
                }
            });
            return;
        }
        com.google.common.util.concurrent.ListenableFuture zza = com.google.android.gms.internal.ads.zzhbw.zza(null);
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            final com.google.common.util.concurrent.ListenableFuture listenableFuture = (com.google.common.util.concurrent.ListenableFuture) it.next();
            com.google.android.gms.internal.ads.zzhbe zzhbeVar = new com.google.android.gms.internal.ads.zzhbe() { // from class: com.google.android.gms.internal.ads.zzcye
                @Override // com.google.android.gms.internal.ads.zzhbe
                public final /* synthetic */ com.google.common.util.concurrent.ListenableFuture zza(java.lang.Object obj) {
                    com.google.android.gms.internal.ads.zzhbt.this.zza((java.lang.Throwable) obj);
                    return com.google.android.gms.internal.ads.zzhbw.zza(null);
                }
            };
            java.util.concurrent.Executor executor = this.zza;
            zza = com.google.android.gms.internal.ads.zzhbw.zzj(com.google.android.gms.internal.ads.zzhbw.zzh(zza, java.lang.Throwable.class, zzhbeVar, executor), new com.google.android.gms.internal.ads.zzhbe() { // from class: com.google.android.gms.internal.ads.zzcyf
                @Override // com.google.android.gms.internal.ads.zzhbe
                public final /* synthetic */ com.google.common.util.concurrent.ListenableFuture zza(java.lang.Object obj) {
                    return com.google.android.gms.internal.ads.zzcyi.this.zzc(zzhbtVar, listenableFuture, (com.google.android.gms.internal.ads.zzcxt) obj);
                }
            }, executor);
        }
        com.google.android.gms.internal.ads.zzhbw.zzr(zza, new com.google.android.gms.internal.ads.zzcyd(this, zzhbtVar), this.zza);
    }

    final /* synthetic */ void zzf() {
        com.google.android.gms.internal.ads.zzcfr.zzf.execute(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.zzcyg
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                com.google.android.gms.internal.ads.zzcyi.this.zzd();
            }
        });
    }
}
