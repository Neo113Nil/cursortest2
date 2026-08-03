package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzcph implements com.google.android.gms.internal.ads.zzfgv {
    final com.google.android.gms.internal.ads.zzind zza;
    final com.google.android.gms.internal.ads.zzind zzb;
    final com.google.android.gms.internal.ads.zzind zzc;
    final com.google.android.gms.internal.ads.zzind zzd;
    final com.google.android.gms.internal.ads.zzind zze;
    final com.google.android.gms.internal.ads.zzind zzf;
    private final android.content.Context zzg;
    private final com.google.android.gms.ads.internal.client.zzr zzh;
    private final java.lang.String zzi;
    private final com.google.android.gms.internal.ads.zzcox zzj;

    zzcph(com.google.android.gms.internal.ads.zzcox zzcoxVar, android.content.Context context, java.lang.String str, com.google.android.gms.ads.internal.client.zzr zzrVar) {
        this.zzj = zzcoxVar;
        this.zzg = context;
        this.zzh = zzrVar;
        this.zzi = str;
        com.google.android.gms.internal.ads.zzimu zza = com.google.android.gms.internal.ads.zzimv.zza(context);
        this.zza = zza;
        com.google.android.gms.internal.ads.zzimu zza2 = com.google.android.gms.internal.ads.zzimv.zza(zzrVar);
        this.zzb = zza2;
        com.google.android.gms.internal.ads.zzind zza3 = com.google.android.gms.internal.ads.zzimt.zza(com.google.android.gms.internal.ads.zzetd.zza(zzcoxVar.zzp));
        this.zzc = zza3;
        com.google.android.gms.internal.ads.zzind zza4 = com.google.android.gms.internal.ads.zzimt.zza(com.google.android.gms.internal.ads.zzeti.zza());
        this.zzd = zza4;
        com.google.android.gms.internal.ads.zzind zza5 = com.google.android.gms.internal.ads.zzimt.zza(com.google.android.gms.internal.ads.zzdhz.zza());
        this.zze = zza5;
        this.zzf = com.google.android.gms.internal.ads.zzimt.zza(com.google.android.gms.internal.ads.zzfgt.zza(zza, zzcoxVar.zza, zza2, zzcoxVar.zzaf, zza3, zza4, com.google.android.gms.internal.ads.zzfla.zza(), zza5));
    }

    @Override // com.google.android.gms.internal.ads.zzfgv
    public final com.google.android.gms.internal.ads.zzesg zza() {
        com.google.android.gms.internal.ads.zzfgs zzfgsVar = (com.google.android.gms.internal.ads.zzfgs) this.zzf.zzb();
        com.google.android.gms.internal.ads.zzetc zzetcVar = (com.google.android.gms.internal.ads.zzetc) this.zzc.zzb();
        com.google.android.gms.internal.ads.zzcox zzcoxVar = this.zzj;
        com.google.android.gms.internal.ads.zzind zzindVar = zzcoxVar.zzp;
        return new com.google.android.gms.internal.ads.zzesg(this.zzg, this.zzh, this.zzi, zzfgsVar, zzetcVar, com.google.android.gms.internal.ads.zzcoi.zzd(zzcoxVar.zzI()), (com.google.android.gms.internal.ads.zzdzl) zzindVar.zzb());
    }
}
