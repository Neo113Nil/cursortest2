package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzcpy implements com.google.android.gms.internal.ads.zzfjz {
    final com.google.android.gms.internal.ads.zzind zza;
    final com.google.android.gms.internal.ads.zzind zzb;
    final com.google.android.gms.internal.ads.zzind zzc;
    final com.google.android.gms.internal.ads.zzind zzd;
    final com.google.android.gms.internal.ads.zzind zze;
    final com.google.android.gms.internal.ads.zzind zzf;
    final com.google.android.gms.internal.ads.zzind zzg;
    final com.google.android.gms.internal.ads.zzind zzh;
    private final com.google.android.gms.internal.ads.zzcox zzi;

    zzcpy(com.google.android.gms.internal.ads.zzcox zzcoxVar, android.content.Context context, java.lang.String str) {
        this.zzi = zzcoxVar;
        com.google.android.gms.internal.ads.zzimu zza = com.google.android.gms.internal.ads.zzimv.zza(context);
        this.zza = zza;
        com.google.android.gms.internal.ads.zzind zzindVar = zzcoxVar.zzby;
        com.google.android.gms.internal.ads.zzfhz zzc = com.google.android.gms.internal.ads.zzfhz.zzc(zza, zzindVar, zzcoxVar.zzbz);
        this.zzb = zzc;
        com.google.android.gms.internal.ads.zzind zza2 = com.google.android.gms.internal.ads.zzimt.zza(com.google.android.gms.internal.ads.zzfjk.zza(zzindVar));
        this.zzc = zza2;
        com.google.android.gms.internal.ads.zzind zza3 = com.google.android.gms.internal.ads.zzimt.zza(com.google.android.gms.internal.ads.zzfkw.zza());
        this.zzd = zza3;
        com.google.android.gms.internal.ads.zzind zza4 = com.google.android.gms.internal.ads.zzimt.zza(com.google.android.gms.internal.ads.zzfjt.zza(zza, zzcoxVar.zza, zzcoxVar.zzaf, zzc, zza2, com.google.android.gms.internal.ads.zzfla.zza(), zza3));
        this.zze = zza4;
        this.zzf = com.google.android.gms.internal.ads.zzimt.zza(com.google.android.gms.internal.ads.zzfkd.zza(zza4, zza2, zza3));
        com.google.android.gms.internal.ads.zzimu zzc2 = com.google.android.gms.internal.ads.zzimv.zzc(str);
        this.zzg = zzc2;
        this.zzh = com.google.android.gms.internal.ads.zzimt.zza(com.google.android.gms.internal.ads.zzfjx.zza(zzc2, zza4, zza, zza2, zza3, zzcoxVar.zzi, zzcoxVar.zzai, zzcoxVar.zzp));
    }

    @Override // com.google.android.gms.internal.ads.zzfjz
    public final com.google.android.gms.internal.ads.zzfkc zza() {
        return (com.google.android.gms.internal.ads.zzfkc) this.zzf.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzfjz
    public final com.google.android.gms.internal.ads.zzfjw zzb() {
        return (com.google.android.gms.internal.ads.zzfjw) this.zzh.zzb();
    }
}
