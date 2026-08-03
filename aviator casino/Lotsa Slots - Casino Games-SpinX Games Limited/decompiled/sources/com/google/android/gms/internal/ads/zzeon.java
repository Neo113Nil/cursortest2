package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzeon {
    private final java.util.concurrent.Executor zza;
    private final java.util.concurrent.ScheduledExecutorService zzb;
    private final com.google.android.gms.internal.ads.zzcxw zzc;
    private final com.google.android.gms.internal.ads.zzepd zzd;
    private final com.google.android.gms.internal.ads.zzfry zze;
    private final com.google.android.gms.internal.ads.zzhcp zzf = com.google.android.gms.internal.ads.zzhcp.zze();
    private final java.util.concurrent.atomic.AtomicBoolean zzg = new java.util.concurrent.atomic.AtomicBoolean();
    private com.google.android.gms.internal.ads.zzeoo zzh;
    private com.google.android.gms.internal.ads.zzfkq zzi;

    zzeon(java.util.concurrent.Executor executor, java.util.concurrent.ScheduledExecutorService scheduledExecutorService, com.google.android.gms.internal.ads.zzcxw zzcxwVar, com.google.android.gms.internal.ads.zzepd zzepdVar, com.google.android.gms.internal.ads.zzfry zzfryVar) {
        this.zza = executor;
        this.zzb = scheduledExecutorService;
        this.zzc = zzcxwVar;
        this.zzd = zzepdVar;
        this.zze = zzfryVar;
    }

    private final synchronized com.google.common.util.concurrent.ListenableFuture zzd(com.google.android.gms.internal.ads.zzfkf zzfkfVar) {
        java.util.Iterator it = zzfkfVar.zza.iterator();
        while (it.hasNext()) {
            com.google.android.gms.internal.ads.zzels zza = this.zzc.zza(zzfkfVar.zzb, (java.lang.String) it.next());
            if (zza != null && zza.zza(this.zzi, zzfkfVar)) {
                return com.google.android.gms.internal.ads.zzhbw.zzi(zza.zzb(this.zzi, zzfkfVar), zzfkfVar.zzR, java.util.concurrent.TimeUnit.MILLISECONDS, this.zzb);
            }
        }
        return com.google.android.gms.internal.ads.zzhbw.zzc(new com.google.android.gms.internal.ads.zzeed(3));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zze, reason: merged with bridge method [inline-methods] */
    public final void zzb(com.google.android.gms.internal.ads.zzfkf zzfkfVar) {
        com.google.common.util.concurrent.ListenableFuture zzd = zzd(zzfkfVar);
        this.zzd.zze(this.zzi, zzfkfVar, zzd, this.zze);
        com.google.android.gms.internal.ads.zzhbw.zzr(zzd, new com.google.android.gms.internal.ads.zzeom(this, zzfkfVar), this.zza);
    }

    public final synchronized com.google.common.util.concurrent.ListenableFuture zza(com.google.android.gms.internal.ads.zzfkq zzfkqVar) {
        if (!this.zzg.getAndSet(true)) {
            java.util.List list = zzfkqVar.zzb.zza;
            if (list.isEmpty()) {
                this.zzf.zzb(new com.google.android.gms.internal.ads.zzeph(3, com.google.android.gms.internal.ads.zzepk.zzb(zzfkqVar)));
            } else {
                this.zzi = zzfkqVar;
                com.google.android.gms.internal.ads.zzepd zzepdVar = this.zzd;
                this.zzh = new com.google.android.gms.internal.ads.zzeoo(zzfkqVar, zzepdVar, this.zzf);
                zzepdVar.zzc(list);
                com.google.android.gms.internal.ads.zzfkf zza = this.zzh.zza();
                while (zza != null) {
                    zzb(zza);
                    zza = this.zzh.zza();
                }
            }
        }
        return this.zzf;
    }

    final /* synthetic */ com.google.android.gms.internal.ads.zzeoo zzc() {
        return this.zzh;
    }
}
