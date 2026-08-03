package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzehd {
    private final com.google.android.gms.internal.ads.zzhcg zza;
    private final com.google.android.gms.internal.ads.zzegi zzb;
    private final com.google.android.gms.internal.ads.zzimo zzc;

    public zzehd(com.google.android.gms.internal.ads.zzhcg zzhcgVar, com.google.android.gms.internal.ads.zzegi zzegiVar, com.google.android.gms.internal.ads.zzimo zzimoVar) {
        this.zza = zzhcgVar;
        this.zzb = zzegiVar;
        this.zzc = zzimoVar;
    }

    private final com.google.common.util.concurrent.ListenableFuture zzg(final com.google.android.gms.internal.ads.zzcbd zzcbdVar, com.google.android.gms.internal.ads.zzegt zzegtVar, final com.google.android.gms.internal.ads.zzegt zzegtVar2, final com.google.android.gms.internal.ads.zzhbe zzhbeVar) {
        com.google.common.util.concurrent.ListenableFuture zzh;
        java.lang.String str = zzcbdVar.zzd;
        com.google.android.gms.ads.internal.zzt.zzc();
        if (com.google.android.gms.ads.internal.util.zzs.zzF(str)) {
            zzh = com.google.android.gms.internal.ads.zzhbw.zzc(new com.google.android.gms.internal.ads.zzegr(1));
        } else {
            zzh = com.google.android.gms.internal.ads.zzhbw.zzh(zzegtVar.zza(zzcbdVar), java.util.concurrent.ExecutionException.class, com.google.android.gms.internal.ads.zzehc.zza, this.zza);
        }
        com.google.android.gms.internal.ads.zzhcg zzhcgVar = this.zza;
        return (com.google.android.gms.internal.ads.zzhbo) com.google.android.gms.internal.ads.zzhbw.zzh((com.google.android.gms.internal.ads.zzhbo) com.google.android.gms.internal.ads.zzhbw.zzj((com.google.android.gms.internal.ads.zzhbo) com.google.android.gms.internal.ads.zzhbw.zzj(com.google.android.gms.internal.ads.zzhbo.zzw(zzh), com.google.android.gms.internal.ads.zzegv.zza, zzhcgVar), zzhbeVar, zzhcgVar), com.google.android.gms.internal.ads.zzegr.class, new com.google.android.gms.internal.ads.zzhbe() { // from class: com.google.android.gms.internal.ads.zzegw
            @Override // com.google.android.gms.internal.ads.zzhbe
            public final /* synthetic */ com.google.common.util.concurrent.ListenableFuture zza(java.lang.Object obj) {
                return com.google.android.gms.internal.ads.zzehd.this.zzc(zzegtVar2, zzcbdVar, zzhbeVar, (com.google.android.gms.internal.ads.zzegr) obj);
            }
        }, zzhcgVar);
    }

    public final com.google.common.util.concurrent.ListenableFuture zza(final com.google.android.gms.internal.ads.zzcbd zzcbdVar) {
        com.google.android.gms.internal.ads.zzhbe zzhbeVar = new com.google.android.gms.internal.ads.zzhbe() { // from class: com.google.android.gms.internal.ads.zzegx
            @Override // com.google.android.gms.internal.ads.zzhbe
            public final /* synthetic */ com.google.common.util.concurrent.ListenableFuture zza(java.lang.Object obj) {
                java.lang.String str = new java.lang.String(com.google.android.gms.internal.ads.zzgzm.zza((java.io.InputStream) obj), java.nio.charset.StandardCharsets.UTF_8);
                com.google.android.gms.internal.ads.zzcbd zzcbdVar2 = com.google.android.gms.internal.ads.zzcbd.this;
                zzcbdVar2.zzj = str;
                return com.google.android.gms.internal.ads.zzhbw.zza(zzcbdVar2);
            }
        };
        final com.google.android.gms.internal.ads.zzegi zzegiVar = this.zzb;
        java.util.Objects.requireNonNull(zzegiVar);
        return zzg(zzcbdVar, new com.google.android.gms.internal.ads.zzegt() { // from class: com.google.android.gms.internal.ads.zzegu
            @Override // com.google.android.gms.internal.ads.zzegt
            public final /* synthetic */ com.google.common.util.concurrent.ListenableFuture zza(com.google.android.gms.internal.ads.zzcbd zzcbdVar2) {
                return com.google.android.gms.internal.ads.zzegi.this.zza(zzcbdVar2);
            }
        }, new com.google.android.gms.internal.ads.zzegt() { // from class: com.google.android.gms.internal.ads.zzegy
            @Override // com.google.android.gms.internal.ads.zzegt
            public final /* synthetic */ com.google.common.util.concurrent.ListenableFuture zza(com.google.android.gms.internal.ads.zzcbd zzcbdVar2) {
                return com.google.android.gms.internal.ads.zzehd.this.zzd(zzcbdVar2);
            }
        }, zzhbeVar);
    }

    public final com.google.common.util.concurrent.ListenableFuture zzb(com.google.android.gms.internal.ads.zzcbd zzcbdVar) {
        return zzg(zzcbdVar, new com.google.android.gms.internal.ads.zzegt() { // from class: com.google.android.gms.internal.ads.zzeha
            @Override // com.google.android.gms.internal.ads.zzegt
            public final /* synthetic */ com.google.common.util.concurrent.ListenableFuture zza(com.google.android.gms.internal.ads.zzcbd zzcbdVar2) {
                return com.google.android.gms.internal.ads.zzehd.this.zze(zzcbdVar2);
            }
        }, new com.google.android.gms.internal.ads.zzegt() { // from class: com.google.android.gms.internal.ads.zzehb
            @Override // com.google.android.gms.internal.ads.zzegt
            public final /* synthetic */ com.google.common.util.concurrent.ListenableFuture zza(com.google.android.gms.internal.ads.zzcbd zzcbdVar2) {
                return com.google.android.gms.internal.ads.zzehd.this.zzf(zzcbdVar2);
            }
        }, com.google.android.gms.internal.ads.zzegz.zza);
    }

    final /* synthetic */ com.google.common.util.concurrent.ListenableFuture zzc(com.google.android.gms.internal.ads.zzegt zzegtVar, com.google.android.gms.internal.ads.zzcbd zzcbdVar, com.google.android.gms.internal.ads.zzhbe zzhbeVar, com.google.android.gms.internal.ads.zzegr zzegrVar) {
        return com.google.android.gms.internal.ads.zzhbw.zzj(zzegtVar.zza(zzcbdVar), zzhbeVar, this.zza);
    }

    final /* synthetic */ com.google.common.util.concurrent.ListenableFuture zzd(com.google.android.gms.internal.ads.zzcbd zzcbdVar) {
        return ((com.google.android.gms.internal.ads.zzeii) this.zzc.zzb()).zzc(zzcbdVar, android.os.Binder.getCallingUid());
    }

    final /* synthetic */ com.google.common.util.concurrent.ListenableFuture zze(com.google.android.gms.internal.ads.zzcbd zzcbdVar) {
        return this.zzb.zzd(zzcbdVar.zzh);
    }

    final /* synthetic */ com.google.common.util.concurrent.ListenableFuture zzf(com.google.android.gms.internal.ads.zzcbd zzcbdVar) {
        return ((com.google.android.gms.internal.ads.zzeii) this.zzc.zzb()).zzd(zzcbdVar.zzh);
    }
}
