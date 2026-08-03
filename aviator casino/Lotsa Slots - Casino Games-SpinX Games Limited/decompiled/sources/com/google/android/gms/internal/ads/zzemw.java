package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzemw implements com.google.android.gms.internal.ads.zzely {
    private final android.content.Context zza;
    private final com.google.android.gms.internal.ads.zzcwq zzb;
    private final java.util.concurrent.Executor zzc;

    public zzemw(android.content.Context context, com.google.android.gms.internal.ads.zzcwq zzcwqVar, java.util.concurrent.Executor executor) {
        this.zza = context;
        this.zzb = zzcwqVar;
        this.zzc = executor;
    }

    @Override // com.google.android.gms.internal.ads.zzely
    public final void zza(com.google.android.gms.internal.ads.zzfkq zzfkqVar, com.google.android.gms.internal.ads.zzfkf zzfkfVar, com.google.android.gms.internal.ads.zzelv zzelvVar) throws com.google.android.gms.internal.ads.zzflf {
        com.google.android.gms.ads.internal.client.zzr zzrVar;
        com.google.android.gms.internal.ads.zzfky zzfkyVar = zzfkqVar.zza.zza;
        com.google.android.gms.ads.internal.client.zzr zzrVar2 = zzfkyVar.zzf;
        if (zzrVar2.zzn) {
            zzrVar = new com.google.android.gms.ads.internal.client.zzr(this.zza, com.google.android.gms.ads.zzc.zzb(zzrVar2.zze, zzrVar2.zzb));
        } else {
            zzrVar = (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zziZ)).booleanValue() && zzfkfVar.zzag) ? new com.google.android.gms.ads.internal.client.zzr(this.zza, com.google.android.gms.ads.zzc.zzc(zzrVar2.zze, zzrVar2.zzb)) : com.google.android.gms.internal.ads.zzfle.zza(this.zza, zzfkfVar.zzu);
        }
        com.google.android.gms.ads.internal.client.zzr zzrVar3 = zzrVar;
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zziZ)).booleanValue() && zzfkfVar.zzag) {
            ((com.google.android.gms.internal.ads.zzflw) zzelvVar.zzb).zzb(this.zza, zzrVar3, zzfkyVar.zzd, zzfkfVar.zzv.toString(), com.google.android.gms.ads.internal.util.zzbp.zzm(zzfkfVar.zzs), (com.google.android.gms.internal.ads.zzbvi) zzelvVar.zzc);
        } else {
            ((com.google.android.gms.internal.ads.zzflw) zzelvVar.zzb).zzg(this.zza, zzrVar3, zzfkyVar.zzd, zzfkfVar.zzv.toString(), com.google.android.gms.ads.internal.util.zzbp.zzm(zzfkfVar.zzs), (com.google.android.gms.internal.ads.zzbvi) zzelvVar.zzc);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.zzely
    public final /* bridge */ /* synthetic */ java.lang.Object zzb(com.google.android.gms.internal.ads.zzfkq zzfkqVar, final com.google.android.gms.internal.ads.zzfkf zzfkfVar, com.google.android.gms.internal.ads.zzelv zzelvVar) throws com.google.android.gms.internal.ads.zzflf, com.google.android.gms.internal.ads.zzeph {
        final android.view.View zza;
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zziZ)).booleanValue() && zzfkfVar.zzag) {
            com.google.android.gms.internal.ads.zzbvl zzc = ((com.google.android.gms.internal.ads.zzflw) zzelvVar.zzb).zzc();
            if (zzc == null) {
                int i = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzf("getInterscrollerAd should not be null after loadInterscrollerAd loaded ad.");
                throw new com.google.android.gms.internal.ads.zzflf(new java.lang.Exception("getInterscrollerAd should not be null after loadInterscrollerAd loaded ad."));
            }
            try {
                zza = (android.view.View) com.google.android.gms.dynamic.ObjectWrapper.unwrap(zzc.zze());
                boolean zzf = zzc.zzf();
                if (zza == null) {
                    throw new com.google.android.gms.internal.ads.zzflf(new java.lang.Exception("BannerAdapterWrapper interscrollerView should not be null"));
                }
                if (zzf) {
                    try {
                        zza = (android.view.View) com.google.android.gms.internal.ads.zzhbw.zzj(com.google.android.gms.internal.ads.zzhbw.zza(null), new com.google.android.gms.internal.ads.zzhbe() { // from class: com.google.android.gms.internal.ads.zzemu
                            @Override // com.google.android.gms.internal.ads.zzhbe
                            public final /* synthetic */ com.google.common.util.concurrent.ListenableFuture zza(java.lang.Object obj) {
                                return com.google.android.gms.internal.ads.zzemw.this.zzc(zza, zzfkfVar, obj);
                            }
                        }, com.google.android.gms.internal.ads.zzcfr.zzf).get();
                    } catch (java.lang.InterruptedException | java.util.concurrent.ExecutionException e) {
                        throw new com.google.android.gms.internal.ads.zzflf(e);
                    }
                }
            } catch (android.os.RemoteException e2) {
                throw new com.google.android.gms.internal.ads.zzflf(e2);
            }
        } else {
            zza = ((com.google.android.gms.internal.ads.zzflw) zzelvVar.zzb).zza();
        }
        com.google.android.gms.internal.ads.zzcwq zzcwqVar = this.zzb;
        com.google.android.gms.internal.ads.zzcyj zzcyjVar = new com.google.android.gms.internal.ads.zzcyj(zzfkqVar, zzfkfVar, zzelvVar.zza);
        final com.google.android.gms.internal.ads.zzflw zzflwVar = (com.google.android.gms.internal.ads.zzflw) zzelvVar.zzb;
        java.util.Objects.requireNonNull(zzflwVar);
        com.google.android.gms.internal.ads.zzcvm zzf2 = zzcwqVar.zzf(zzcyjVar, new com.google.android.gms.internal.ads.zzcvs(zza, null, new com.google.android.gms.internal.ads.zzcxr() { // from class: com.google.android.gms.internal.ads.zzemv
            @Override // com.google.android.gms.internal.ads.zzcxr
            public final /* synthetic */ com.google.android.gms.ads.internal.client.zzea zza() {
                return com.google.android.gms.internal.ads.zzflw.this.zzt();
            }
        }, (com.google.android.gms.internal.ads.zzfkg) zzfkfVar.zzu.get(0)));
        zzf2.zzk().zza(zza);
        zzf2.zza().zzq(new com.google.android.gms.internal.ads.zzcsz(zzflwVar), this.zzc);
        ((com.google.android.gms.internal.ads.zzenh) zzelvVar.zzc).zzc(zzf2.zzf());
        return zzf2.zzi();
    }

    final /* synthetic */ com.google.common.util.concurrent.ListenableFuture zzc(android.view.View view, com.google.android.gms.internal.ads.zzfkf zzfkfVar, java.lang.Object obj) {
        return com.google.android.gms.internal.ads.zzhbw.zza(com.google.android.gms.internal.ads.zzcxf.zza(this.zza, view, zzfkfVar));
    }
}
