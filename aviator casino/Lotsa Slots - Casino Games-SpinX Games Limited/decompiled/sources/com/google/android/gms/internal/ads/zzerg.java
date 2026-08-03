package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzerg implements com.google.android.gms.internal.ads.zzels {
    private final com.google.android.gms.internal.ads.zzbjl zza;
    private final com.google.android.gms.internal.ads.zzhcg zzb;
    private final com.google.android.gms.internal.ads.zzfpk zzc;
    private final com.google.android.gms.internal.ads.zzerp zzd;

    public zzerg(com.google.android.gms.internal.ads.zzfpk zzfpkVar, com.google.android.gms.internal.ads.zzhcg zzhcgVar, com.google.android.gms.internal.ads.zzbjl zzbjlVar, com.google.android.gms.internal.ads.zzerp zzerpVar) {
        this.zzc = zzfpkVar;
        this.zzb = zzhcgVar;
        this.zza = zzbjlVar;
        this.zzd = zzerpVar;
    }

    @Override // com.google.android.gms.internal.ads.zzels
    public final boolean zza(com.google.android.gms.internal.ads.zzfkq zzfkqVar, com.google.android.gms.internal.ads.zzfkf zzfkfVar) {
        com.google.android.gms.internal.ads.zzfkk zzfkkVar;
        return (this.zza == null || (zzfkkVar = zzfkfVar.zzs) == null || zzfkkVar.zza == null) ? false : true;
    }

    @Override // com.google.android.gms.internal.ads.zzels
    public final com.google.common.util.concurrent.ListenableFuture zzb(com.google.android.gms.internal.ads.zzfkq zzfkqVar, com.google.android.gms.internal.ads.zzfkf zzfkfVar) {
        com.google.android.gms.internal.ads.zzcfw zzcfwVar = new com.google.android.gms.internal.ads.zzcfw();
        com.google.android.gms.internal.ads.zzerl zzerlVar = new com.google.android.gms.internal.ads.zzerl();
        zzerlVar.zzd(new com.google.android.gms.internal.ads.zzere(this, zzcfwVar, zzfkqVar, zzfkfVar, zzerlVar));
        com.google.android.gms.internal.ads.zzfkk zzfkkVar = zzfkfVar.zzs;
        final com.google.android.gms.internal.ads.zzbjg zzbjgVar = new com.google.android.gms.internal.ads.zzbjg(zzerlVar, zzfkkVar.zzb, zzfkkVar.zza);
        com.google.android.gms.internal.ads.zzfpe zzfpeVar = com.google.android.gms.internal.ads.zzfpe.CUSTOM_RENDER_SYN;
        com.google.android.gms.internal.ads.zzfpk zzfpkVar = this.zzc;
        java.util.Objects.requireNonNull(zzfpkVar);
        return com.google.android.gms.internal.ads.zzfov.zzd(new com.google.android.gms.internal.ads.zzfoq() { // from class: com.google.android.gms.internal.ads.zzerf
            @Override // com.google.android.gms.internal.ads.zzfoq
            public final /* synthetic */ void zza() {
                com.google.android.gms.internal.ads.zzerg.this.zzc(zzbjgVar);
            }
        }, this.zzb, zzfpeVar, zzfpkVar).zzj(com.google.android.gms.internal.ads.zzfpe.CUSTOM_RENDER_ACK).zze(zzcfwVar).zzi();
    }

    final /* synthetic */ void zzc(com.google.android.gms.internal.ads.zzbjg zzbjgVar) {
        this.zza.zze(zzbjgVar);
    }

    final /* synthetic */ com.google.android.gms.internal.ads.zzerp zzd() {
        return this.zzd;
    }
}
