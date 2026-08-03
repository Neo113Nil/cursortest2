package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzfgy implements com.google.android.gms.internal.ads.zzfhw {
    private com.google.android.gms.internal.ads.zzdbz zza;
    private final java.util.concurrent.Executor zzb = com.google.android.gms.internal.ads.zzhcn.zza();

    public final com.google.android.gms.internal.ads.zzdbz zza() {
        return this.zza;
    }

    public final com.google.common.util.concurrent.ListenableFuture zzb(com.google.android.gms.internal.ads.zzfhx zzfhxVar, com.google.android.gms.internal.ads.zzfhv zzfhvVar, com.google.android.gms.internal.ads.zzdbz zzdbzVar) {
        com.google.android.gms.internal.ads.zzdby zza = zzfhvVar.zza(zzfhxVar.zzb);
        zza.zzj(new com.google.android.gms.internal.ads.zzfia(true));
        com.google.android.gms.internal.ads.zzdbz zzdbzVar2 = (com.google.android.gms.internal.ads.zzdbz) zza.zzh();
        this.zza = zzdbzVar2;
        final com.google.android.gms.internal.ads.zzcyx zza2 = zzdbzVar2.zza();
        final com.google.android.gms.internal.ads.zzfmw zzfmwVar = new com.google.android.gms.internal.ads.zzfmw();
        com.google.android.gms.internal.ads.zzhbo zzw = com.google.android.gms.internal.ads.zzhbo.zzw(zza2.zzb());
        com.google.android.gms.internal.ads.zzhbe zzhbeVar = new com.google.android.gms.internal.ads.zzhbe(this) { // from class: com.google.android.gms.internal.ads.zzfgx
            @Override // com.google.android.gms.internal.ads.zzhbe
            public final /* synthetic */ com.google.common.util.concurrent.ListenableFuture zza(java.lang.Object obj) {
                com.google.android.gms.internal.ads.zzfkq zzfkqVar = (com.google.android.gms.internal.ads.zzfkq) obj;
                zzfmwVar.zzb = zzfkqVar;
                java.util.Iterator it = zzfkqVar.zzb.zza.iterator();
                boolean z = false;
                loop0: while (true) {
                    if (it.hasNext()) {
                        java.util.Iterator it2 = ((com.google.android.gms.internal.ads.zzfkf) it.next()).zza.iterator();
                        while (it2.hasNext()) {
                            if (!((java.lang.String) it2.next()).contains("FirstPartyRenderer")) {
                                break loop0;
                            }
                            z = true;
                        }
                    } else if (z) {
                        return zza2.zzc(com.google.android.gms.internal.ads.zzhbw.zza(zzfkqVar));
                    }
                }
                return com.google.android.gms.internal.ads.zzhbw.zza(null);
            }
        };
        java.util.concurrent.Executor executor = this.zzb;
        return (com.google.android.gms.internal.ads.zzhbo) com.google.android.gms.internal.ads.zzhbw.zzk((com.google.android.gms.internal.ads.zzhbo) com.google.android.gms.internal.ads.zzhbw.zzj(zzw, zzhbeVar, executor), new com.google.android.gms.internal.ads.zzgta() { // from class: com.google.android.gms.internal.ads.zzfgw
            @Override // com.google.android.gms.internal.ads.zzgta
            public final /* synthetic */ java.lang.Object apply(java.lang.Object obj) {
                com.google.android.gms.internal.ads.zzfmw zzfmwVar2 = com.google.android.gms.internal.ads.zzfmw.this;
                zzfmwVar2.zzc = (com.google.android.gms.internal.ads.zzcxt) obj;
                return zzfmwVar2;
            }
        }, executor);
    }

    @Override // com.google.android.gms.internal.ads.zzfhw
    public final /* bridge */ /* synthetic */ com.google.common.util.concurrent.ListenableFuture zzc(com.google.android.gms.internal.ads.zzfhx zzfhxVar, com.google.android.gms.internal.ads.zzfhv zzfhvVar, java.lang.Object obj) {
        return zzb(zzfhxVar, zzfhvVar, null);
    }

    @Override // com.google.android.gms.internal.ads.zzfhw
    public final /* synthetic */ java.lang.Object zzd() {
        return this.zza;
    }
}
