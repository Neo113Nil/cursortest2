package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzerb implements com.google.android.gms.internal.ads.zzels {
    private final android.content.Context zza;
    private final com.google.android.gms.internal.ads.zzcwq zzb;
    private final com.google.android.gms.internal.ads.zzbjl zzc;
    private final com.google.android.gms.internal.ads.zzhcg zzd;
    private final com.google.android.gms.internal.ads.zzfpk zze;

    public zzerb(android.content.Context context, com.google.android.gms.internal.ads.zzcwq zzcwqVar, com.google.android.gms.internal.ads.zzfpk zzfpkVar, com.google.android.gms.internal.ads.zzhcg zzhcgVar, com.google.android.gms.internal.ads.zzbjl zzbjlVar) {
        this.zza = context;
        this.zzb = zzcwqVar;
        this.zze = zzfpkVar;
        this.zzd = zzhcgVar;
        this.zzc = zzbjlVar;
    }

    @Override // com.google.android.gms.internal.ads.zzels
    public final boolean zza(com.google.android.gms.internal.ads.zzfkq zzfkqVar, com.google.android.gms.internal.ads.zzfkf zzfkfVar) {
        com.google.android.gms.internal.ads.zzfkk zzfkkVar;
        return (this.zzc == null || (zzfkkVar = zzfkfVar.zzs) == null || zzfkkVar.zza == null) ? false : true;
    }

    @Override // com.google.android.gms.internal.ads.zzels
    public final com.google.common.util.concurrent.ListenableFuture zzb(com.google.android.gms.internal.ads.zzfkq zzfkqVar, com.google.android.gms.internal.ads.zzfkf zzfkfVar) {
        com.google.android.gms.internal.ads.zzeqx zzeqxVar = new com.google.android.gms.internal.ads.zzeqx(this, new android.view.View(this.zza), null, com.google.android.gms.internal.ads.zzeqz.zza, (com.google.android.gms.internal.ads.zzfkg) zzfkfVar.zzu.get(0));
        com.google.android.gms.internal.ads.zzcvm zzf = this.zzb.zzf(new com.google.android.gms.internal.ads.zzcyj(zzfkqVar, zzfkfVar, null), zzeqxVar);
        com.google.android.gms.internal.ads.zzera zzl = zzf.zzl();
        com.google.android.gms.internal.ads.zzfkk zzfkkVar = zzfkfVar.zzs;
        final com.google.android.gms.internal.ads.zzbjg zzbjgVar = new com.google.android.gms.internal.ads.zzbjg(zzl, zzfkkVar.zzb, zzfkkVar.zza);
        com.google.android.gms.internal.ads.zzfpe zzfpeVar = com.google.android.gms.internal.ads.zzfpe.CUSTOM_RENDER_SYN;
        com.google.android.gms.internal.ads.zzfpk zzfpkVar = this.zze;
        java.util.Objects.requireNonNull(zzfpkVar);
        return com.google.android.gms.internal.ads.zzfov.zzd(new com.google.android.gms.internal.ads.zzfoq() { // from class: com.google.android.gms.internal.ads.zzeqy
            @Override // com.google.android.gms.internal.ads.zzfoq
            public final /* synthetic */ void zza() {
                com.google.android.gms.internal.ads.zzerb.this.zzc(zzbjgVar);
            }
        }, this.zzd, zzfpeVar, zzfpkVar).zzj(com.google.android.gms.internal.ads.zzfpe.CUSTOM_RENDER_ACK).zze(com.google.android.gms.internal.ads.zzhbw.zza(zzf.zzi())).zzi();
    }

    final /* synthetic */ void zzc(com.google.android.gms.internal.ads.zzbjg zzbjgVar) {
        this.zzc.zze(zzbjgVar);
    }
}
