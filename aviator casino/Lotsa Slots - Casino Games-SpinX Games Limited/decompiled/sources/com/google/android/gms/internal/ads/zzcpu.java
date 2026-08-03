package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzcpu implements com.google.android.gms.internal.ads.zzehj {
    final com.google.android.gms.internal.ads.zzind zza;
    final com.google.android.gms.internal.ads.zzind zzb;
    private final com.google.android.gms.internal.ads.zzcox zzc;
    private final com.google.android.gms.internal.ads.zzcpu zzd = this;

    zzcpu(com.google.android.gms.internal.ads.zzcox zzcoxVar, android.content.Context context) {
        this.zzc = zzcoxVar;
        com.google.android.gms.internal.ads.zzeir zzc = com.google.android.gms.internal.ads.zzeir.zzc(zzcoxVar.zzaG);
        this.zza = zzc;
        this.zzb = com.google.android.gms.internal.ads.zzeij.zza(zzcoxVar.zzf, com.google.android.gms.internal.ads.zzfoa.zza(), com.google.android.gms.internal.ads.zzcor.zza, zzcoxVar.zzaF, zzc, zzcoxVar.zzaH, com.google.android.gms.internal.ads.zzcoo.zza, zzcoxVar.zzG);
    }

    @Override // com.google.android.gms.internal.ads.zzehj
    public final com.google.android.gms.internal.ads.zzehn zza() {
        com.google.android.gms.internal.ads.zzcox zzcoxVar = this.zzc;
        com.google.android.gms.internal.ads.zzind zzindVar = zzcoxVar.zzp;
        com.google.android.gms.internal.ads.zzcnl zzI = zzcoxVar.zzI();
        return com.google.android.gms.internal.ads.zzeho.zza(com.google.android.gms.internal.ads.zzcns.zzd(zzcoxVar.zzI()), com.google.android.gms.internal.ads.zzfog.zzc(), com.google.android.gms.internal.ads.zzfoa.zzc(), com.google.android.gms.internal.ads.zzimt.zzc(this.zzb), com.google.android.gms.internal.ads.zzcoi.zzd(zzI), this, (com.google.android.gms.internal.ads.zzdzl) zzindVar.zzb());
    }

    @Override // com.google.android.gms.internal.ads.zzehj
    public final com.google.android.gms.internal.ads.zzehp zzb() {
        return new com.google.android.gms.internal.ads.zzcpv(this.zzc, this.zzd, null);
    }
}
