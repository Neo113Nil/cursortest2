package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzcyx {
    private final com.google.android.gms.internal.ads.zzefs zza;
    private final com.google.android.gms.internal.ads.zzfky zzb;
    private final com.google.android.gms.internal.ads.zzfpk zzc;
    private final com.google.android.gms.internal.ads.zzcrr zzd;
    private final com.google.android.gms.internal.ads.zzepk zze;
    private final com.google.android.gms.internal.ads.zzdig zzf;
    private com.google.android.gms.internal.ads.zzfkq zzg;
    private final com.google.android.gms.internal.ads.zzehd zzh;
    private final com.google.android.gms.internal.ads.zzdbw zzi;
    private final java.util.concurrent.Executor zzj;
    private final com.google.android.gms.internal.ads.zzego zzk;
    private final com.google.android.gms.internal.ads.zzelx zzl;

    zzcyx(com.google.android.gms.internal.ads.zzefs zzefsVar, com.google.android.gms.internal.ads.zzfky zzfkyVar, com.google.android.gms.internal.ads.zzfpk zzfpkVar, com.google.android.gms.internal.ads.zzcrr zzcrrVar, com.google.android.gms.internal.ads.zzepk zzepkVar, com.google.android.gms.internal.ads.zzdig zzdigVar, com.google.android.gms.internal.ads.zzfkq zzfkqVar, com.google.android.gms.internal.ads.zzehd zzehdVar, com.google.android.gms.internal.ads.zzdbw zzdbwVar, java.util.concurrent.Executor executor, com.google.android.gms.internal.ads.zzego zzegoVar, com.google.android.gms.internal.ads.zzelx zzelxVar) {
        this.zza = zzefsVar;
        this.zzb = zzfkyVar;
        this.zzc = zzfpkVar;
        this.zzd = zzcrrVar;
        this.zze = zzepkVar;
        this.zzf = zzdigVar;
        this.zzg = zzfkqVar;
        this.zzh = zzehdVar;
        this.zzi = zzdbwVar;
        this.zzj = executor;
        this.zzk = zzegoVar;
        this.zzl = zzelxVar;
    }

    public final com.google.common.util.concurrent.ListenableFuture zza(com.google.common.util.concurrent.ListenableFuture listenableFuture) {
        if (this.zzg != null) {
            com.google.android.gms.internal.ads.zzfpk zzfpkVar = this.zzc;
            com.google.android.gms.internal.ads.zzfpe zzfpeVar = com.google.android.gms.internal.ads.zzfpe.SERVER_TRANSACTION;
            java.util.Objects.requireNonNull(zzfpkVar);
            return com.google.android.gms.internal.ads.zzfov.zza(com.google.android.gms.internal.ads.zzhbw.zza(this.zzg), zzfpeVar, zzfpkVar).zzi();
        }
        com.google.android.gms.ads.internal.zzt.zzj().zzb();
        com.google.android.gms.internal.ads.zzfpb zza = this.zzc.zza(com.google.android.gms.internal.ads.zzfpe.SERVER_TRANSACTION, listenableFuture);
        final com.google.android.gms.internal.ads.zzego zzegoVar = this.zzk;
        java.util.Objects.requireNonNull(zzegoVar);
        return zza.zzc(new com.google.android.gms.internal.ads.zzhbe() { // from class: com.google.android.gms.internal.ads.zzcyw
            @Override // com.google.android.gms.internal.ads.zzhbe
            public final /* synthetic */ com.google.common.util.concurrent.ListenableFuture zza(java.lang.Object obj) {
                return com.google.android.gms.internal.ads.zzego.this.zza((com.google.android.gms.internal.ads.zzcbd) obj);
            }
        }).zzi();
    }

    public final com.google.common.util.concurrent.ListenableFuture zzb() {
        com.google.android.gms.internal.ads.zzfky zzfkyVar = this.zzb;
        if (!zzfkyVar.zzv) {
            com.google.android.gms.ads.internal.client.zzm zzmVar = zzfkyVar.zzd;
            if (zzmVar.zzx != null || zzmVar.zzs != null) {
                com.google.android.gms.internal.ads.zzfpk zzfpkVar = this.zzc;
                com.google.android.gms.internal.ads.zzfpe zzfpeVar = com.google.android.gms.internal.ads.zzfpe.PRELOADED_LOADER;
                java.util.Objects.requireNonNull(zzfpkVar);
                return com.google.android.gms.internal.ads.zzfov.zza(this.zza.zza(), zzfpeVar, zzfpkVar).zzi();
            }
        }
        return zza(this.zzi.zzb());
    }

    public final com.google.common.util.concurrent.ListenableFuture zzc(com.google.common.util.concurrent.ListenableFuture listenableFuture) {
        com.google.android.gms.internal.ads.zzfpb zzc = this.zzc.zza(com.google.android.gms.internal.ads.zzfpe.RENDERER, listenableFuture).zzb(new com.google.android.gms.internal.ads.zzfok() { // from class: com.google.android.gms.internal.ads.zzcyv
            @Override // com.google.android.gms.internal.ads.zzfok
            public final /* synthetic */ java.lang.Object zza(java.lang.Object obj) {
                com.google.android.gms.internal.ads.zzfkq zzfkqVar = (com.google.android.gms.internal.ads.zzfkq) obj;
                com.google.android.gms.internal.ads.zzcyx.this.zzi(zzfkqVar);
                return zzfkqVar;
            }
        }).zzc(this.zze);
        if (!((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzgC)).booleanValue()) {
            zzc = zzc.zzh(((java.lang.Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzgD)).intValue(), java.util.concurrent.TimeUnit.SECONDS);
        }
        return zzc.zzi();
    }

    public final com.google.android.gms.internal.ads.zzdig zzd() {
        return this.zzf;
    }

    public final com.google.common.util.concurrent.ListenableFuture zze(final com.google.android.gms.internal.ads.zzfmu zzfmuVar) {
        com.google.android.gms.internal.ads.zzfor zzi = this.zzc.zza(com.google.android.gms.internal.ads.zzfpe.GET_CACHE_KEY, this.zzi.zzb()).zzc(new com.google.android.gms.internal.ads.zzhbe() { // from class: com.google.android.gms.internal.ads.zzcyu
            @Override // com.google.android.gms.internal.ads.zzhbe
            public final /* synthetic */ com.google.common.util.concurrent.ListenableFuture zza(java.lang.Object obj) {
                return com.google.android.gms.internal.ads.zzcyx.this.zzj(zzfmuVar, (com.google.android.gms.internal.ads.zzcbd) obj);
            }
        }).zzi();
        com.google.android.gms.internal.ads.zzhbw.zzr(zzi, new com.google.android.gms.internal.ads.zzcys(this), this.zzj);
        return zzi;
    }

    public final com.google.common.util.concurrent.ListenableFuture zzf(com.google.android.gms.internal.ads.zzcbd zzcbdVar) {
        com.google.android.gms.internal.ads.zzfor zzi = this.zzc.zza(com.google.android.gms.internal.ads.zzfpe.NOTIFY_CACHE_HIT, this.zzh.zzb(zzcbdVar)).zzi();
        com.google.android.gms.internal.ads.zzhbw.zzr(zzi, new com.google.android.gms.internal.ads.zzcyt(this), this.zzj);
        return zzi;
    }

    public final com.google.android.gms.ads.internal.client.zze zzg(java.lang.Throwable th) {
        return com.google.android.gms.internal.ads.zzfma.zzb(th, this.zzl);
    }

    public final void zzh(com.google.android.gms.internal.ads.zzfkq zzfkqVar) {
        this.zzg = zzfkqVar;
    }

    final /* synthetic */ com.google.android.gms.internal.ads.zzfkq zzi(com.google.android.gms.internal.ads.zzfkq zzfkqVar) {
        this.zzd.zza(zzfkqVar);
        return zzfkqVar;
    }

    final /* synthetic */ com.google.common.util.concurrent.ListenableFuture zzj(com.google.android.gms.internal.ads.zzfmu zzfmuVar, com.google.android.gms.internal.ads.zzcbd zzcbdVar) {
        zzcbdVar.zzi = zzfmuVar;
        return this.zzh.zza(zzcbdVar);
    }

    final /* synthetic */ com.google.android.gms.internal.ads.zzdig zzk() {
        return this.zzf;
    }
}
