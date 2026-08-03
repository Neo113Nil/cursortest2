package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzesd extends com.google.android.gms.ads.internal.client.zzbp {
    final com.google.android.gms.internal.ads.zzfkx zza;
    final com.google.android.gms.internal.ads.zzdqc zzb;
    private final android.content.Context zzc;
    private final com.google.android.gms.internal.ads.zzcnj zzd;
    private com.google.android.gms.ads.internal.client.zzbh zze;

    public zzesd(com.google.android.gms.internal.ads.zzcnj zzcnjVar, android.content.Context context, java.lang.String str) {
        com.google.android.gms.internal.ads.zzfkx zzfkxVar = new com.google.android.gms.internal.ads.zzfkx();
        this.zza = zzfkxVar;
        this.zzb = new com.google.android.gms.internal.ads.zzdqc();
        this.zzd = zzcnjVar;
        zzfkxVar.zzg(str);
        this.zzc = context;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbq
    public final com.google.android.gms.ads.internal.client.zzbn zze() {
        com.google.android.gms.internal.ads.zzdqd zzg = this.zzb.zzg();
        java.util.ArrayList zzh = zzg.zzh();
        com.google.android.gms.internal.ads.zzfkx zzfkxVar = this.zza;
        zzfkxVar.zzm(zzh);
        zzfkxVar.zzn(zzg.zzi());
        if (zzfkxVar.zzf() == null) {
            zzfkxVar.zzc(com.google.android.gms.ads.internal.client.zzr.zzb());
        }
        return new com.google.android.gms.internal.ads.zzese(this.zzc, this.zzd, zzfkxVar, zzg, this.zze);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbq
    public final void zzf(com.google.android.gms.ads.internal.client.zzbh zzbhVar) {
        this.zze = zzbhVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbq
    public final void zzg(com.google.android.gms.internal.ads.zzbmz zzbmzVar) {
        this.zzb.zzb(zzbmzVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbq
    public final void zzh(com.google.android.gms.internal.ads.zzbnc zzbncVar) {
        this.zzb.zza(zzbncVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbq
    public final void zzi(java.lang.String str, com.google.android.gms.internal.ads.zzbni zzbniVar, com.google.android.gms.internal.ads.zzbnf zzbnfVar) {
        this.zzb.zzf(str, zzbniVar, zzbnfVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbq
    public final void zzj(com.google.android.gms.internal.ads.zzblt zzbltVar) {
        this.zza.zzo(zzbltVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbq
    public final void zzk(com.google.android.gms.internal.ads.zzbnm zzbnmVar, com.google.android.gms.ads.internal.client.zzr zzrVar) {
        this.zzb.zzd(zzbnmVar);
        this.zza.zzc(zzrVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbq
    public final void zzl(com.google.android.gms.ads.formats.PublisherAdViewOptions publisherAdViewOptions) {
        this.zza.zzr(publisherAdViewOptions);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbq
    public final void zzm(com.google.android.gms.internal.ads.zzbnp zzbnpVar) {
        this.zzb.zzc(zzbnpVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbq
    public final void zzn(com.google.android.gms.internal.ads.zzbsb zzbsbVar) {
        this.zza.zzq(zzbsbVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbq
    public final void zzo(com.google.android.gms.internal.ads.zzbsk zzbskVar) {
        this.zzb.zze(zzbskVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbq
    public final void zzp(com.google.android.gms.ads.formats.AdManagerAdViewOptions adManagerAdViewOptions) {
        this.zza.zzs(adManagerAdViewOptions);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbq
    public final void zzq(com.google.android.gms.ads.internal.client.zzcp zzcpVar) {
        this.zza.zzab(zzcpVar);
    }
}
