package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzfhd implements com.google.android.gms.internal.ads.zzfhw {
    private final com.google.android.gms.internal.ads.zzfhw zza;
    private final com.google.android.gms.internal.ads.zzfhw zzb;
    private final com.google.android.gms.internal.ads.zzfnj zzc;
    private final java.lang.String zzd;
    private com.google.android.gms.internal.ads.zzdbz zze;
    private final java.util.concurrent.Executor zzf;

    public zzfhd(com.google.android.gms.internal.ads.zzfhw zzfhwVar, com.google.android.gms.internal.ads.zzfhw zzfhwVar2, com.google.android.gms.internal.ads.zzfnj zzfnjVar, java.lang.String str, java.util.concurrent.Executor executor) {
        this.zza = zzfhwVar;
        this.zzb = zzfhwVar2;
        this.zzc = zzfnjVar;
        this.zzd = str;
        this.zzf = executor;
    }

    private final com.google.common.util.concurrent.ListenableFuture zzg(com.google.android.gms.internal.ads.zzfmw zzfmwVar, com.google.android.gms.internal.ads.zzfhx zzfhxVar) {
        com.google.android.gms.internal.ads.zzdbz zzdbzVar = zzfmwVar.zza;
        this.zze = zzdbzVar;
        if (zzfmwVar.zzc != null) {
            if (zzdbzVar.zzc() != null) {
                zzfmwVar.zzc.zzp().zzv(zzfmwVar.zza.zzc());
            }
            return com.google.android.gms.internal.ads.zzhbw.zza(zzfmwVar.zzc);
        }
        zzdbzVar.zza().zzh(zzfmwVar.zzb);
        return ((com.google.android.gms.internal.ads.zzfhn) this.zza).zzb(zzfhxVar, null, zzfmwVar.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzfhw
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final synchronized com.google.android.gms.internal.ads.zzdbz zzd() {
        return this.zze;
    }

    public final synchronized com.google.common.util.concurrent.ListenableFuture zzb(final com.google.android.gms.internal.ads.zzfhx zzfhxVar, final com.google.android.gms.internal.ads.zzfhv zzfhvVar, com.google.android.gms.internal.ads.zzdbz zzdbzVar) {
        com.google.android.gms.internal.ads.zzdby zza = zzfhvVar.zza(zzfhxVar.zzb);
        zza.zzi(new com.google.android.gms.internal.ads.zzfhe(this.zzd));
        final com.google.android.gms.internal.ads.zzdbz zzdbzVar2 = (com.google.android.gms.internal.ads.zzdbz) zza.zzh();
        zzdbzVar2.zzb();
        zzdbzVar2.zzb();
        com.google.android.gms.ads.internal.client.zzm zzmVar = zzdbzVar2.zzb().zzd;
        if (zzmVar.zzs == null && zzmVar.zzx == null) {
            com.google.android.gms.internal.ads.zzfky zzb = zzdbzVar2.zzb();
            com.google.android.gms.ads.internal.client.zzm zzmVar2 = zzb.zzd;
            java.lang.String str = zzb.zzg;
            com.google.android.gms.ads.internal.client.zzx zzxVar = zzb.zzk;
            java.util.concurrent.Executor executor = this.zzf;
            final com.google.android.gms.internal.ads.zzfhc zzfhcVar = new com.google.android.gms.internal.ads.zzfhc(zzfhvVar, zzfhxVar, zzmVar2, str, executor, zzxVar, null);
            com.google.android.gms.internal.ads.zzdbz zzdbzVar3 = zzdbzVar2;
            return (com.google.android.gms.internal.ads.zzhbo) com.google.android.gms.internal.ads.zzhbw.zzj(com.google.android.gms.internal.ads.zzhbo.zzw(((com.google.android.gms.internal.ads.zzfhj) this.zzb).zza(zzfhxVar, zzfhvVar, zzdbzVar2)), new com.google.android.gms.internal.ads.zzhbe() { // from class: com.google.android.gms.internal.ads.zzfhb
                @Override // com.google.android.gms.internal.ads.zzhbe
                public final /* synthetic */ com.google.common.util.concurrent.ListenableFuture zza(java.lang.Object obj) {
                    return com.google.android.gms.internal.ads.zzfhd.this.zze(zzfhxVar, zzfhcVar, zzfhvVar, zzdbzVar2, (com.google.android.gms.internal.ads.zzfhi) obj);
                }
            }, executor);
        }
        this.zze = zzdbzVar2;
        com.google.android.gms.internal.ads.zzdbz zzdbzVar4 = zzdbzVar2;
        return ((com.google.android.gms.internal.ads.zzfhn) this.zza).zzb(zzfhxVar, zzfhvVar, zzdbzVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzfhw
    public final /* bridge */ /* synthetic */ com.google.common.util.concurrent.ListenableFuture zzc(com.google.android.gms.internal.ads.zzfhx zzfhxVar, com.google.android.gms.internal.ads.zzfhv zzfhvVar, java.lang.Object obj) {
        return zzb(zzfhxVar, zzfhvVar, null);
    }

    final /* synthetic */ com.google.common.util.concurrent.ListenableFuture zze(com.google.android.gms.internal.ads.zzfhx zzfhxVar, com.google.android.gms.internal.ads.zzfhc zzfhcVar, com.google.android.gms.internal.ads.zzfhv zzfhvVar, com.google.android.gms.internal.ads.zzdbz zzdbzVar, com.google.android.gms.internal.ads.zzfhi zzfhiVar) {
        if (zzfhiVar != null) {
            com.google.android.gms.internal.ads.zzfhc zzfhcVar2 = new com.google.android.gms.internal.ads.zzfhc(zzfhcVar.zza, zzfhcVar.zzb, zzfhcVar.zzc, zzfhcVar.zzd, zzfhcVar.zze, zzfhcVar.zzf, zzfhiVar.zza);
            com.google.android.gms.internal.ads.zzfmw zzfmwVar = zzfhiVar.zzc;
            if (zzfmwVar != null) {
                this.zze = null;
                this.zzc.zza(zzfhcVar2);
                return zzg(zzfmwVar, zzfhxVar);
            }
            com.google.android.gms.internal.ads.zzfnj zzfnjVar = this.zzc;
            com.google.common.util.concurrent.ListenableFuture zzb = zzfnjVar.zzb(zzfhcVar2);
            if (zzb != null) {
                this.zze = null;
                return com.google.android.gms.internal.ads.zzhbw.zzj(zzb, new com.google.android.gms.internal.ads.zzhbe() { // from class: com.google.android.gms.internal.ads.zzfha
                    @Override // com.google.android.gms.internal.ads.zzhbe
                    public final /* synthetic */ com.google.common.util.concurrent.ListenableFuture zza(java.lang.Object obj) {
                        return com.google.android.gms.internal.ads.zzfhd.this.zzf((com.google.android.gms.internal.ads.zzfnf) obj);
                    }
                }, this.zzf);
            }
            zzfnjVar.zza(zzfhcVar2);
            zzfhxVar = new com.google.android.gms.internal.ads.zzfhx(zzfhxVar.zzb, zzfhiVar.zzb);
        }
        com.google.common.util.concurrent.ListenableFuture zzb2 = ((com.google.android.gms.internal.ads.zzfhn) this.zza).zzb(zzfhxVar, zzfhvVar, zzdbzVar);
        this.zze = zzdbzVar;
        return zzb2;
    }

    final /* synthetic */ com.google.common.util.concurrent.ListenableFuture zzf(com.google.android.gms.internal.ads.zzfnf zzfnfVar) {
        com.google.android.gms.internal.ads.zzfmw zzfmwVar;
        com.google.android.gms.internal.ads.zzfnh zzfnhVar;
        if (zzfnfVar == null || (zzfmwVar = zzfnfVar.zza) == null || (zzfnhVar = zzfnfVar.zzb) == null) {
            throw new com.google.android.gms.internal.ads.zzeed(1, "Empty prefetch");
        }
        com.google.android.gms.internal.ads.zzbhv.zzb.zzc zzs = com.google.android.gms.internal.ads.zzbhv.zzb.zzs();
        com.google.android.gms.internal.ads.zzbhv.zzb.zza.C0071zza zzs2 = com.google.android.gms.internal.ads.zzbhv.zzb.zza.zzs();
        zzs2.zzc(com.google.android.gms.internal.ads.zzbhv.zzb.zzd.IN_MEMORY);
        zzs2.zzg(com.google.android.gms.internal.ads.zzbhv.zzb.zze.zzs());
        zzs.zzh(zzs2);
        zzfmwVar.zza.zza().zzd().zzl(zzs.zzbu());
        return zzg(zzfmwVar, ((com.google.android.gms.internal.ads.zzfhc) zzfnhVar).zzb);
    }
}
