package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzcps implements com.google.android.gms.internal.ads.zzfil {
    final com.google.android.gms.internal.ads.zzind zza;
    final com.google.android.gms.internal.ads.zzind zzb;
    final com.google.android.gms.internal.ads.zzind zzc;
    final com.google.android.gms.internal.ads.zzind zzd;
    final com.google.android.gms.internal.ads.zzind zze;
    final com.google.android.gms.internal.ads.zzind zzf;
    final com.google.android.gms.internal.ads.zzind zzg;
    private final com.google.android.gms.internal.ads.zzcox zzh;

    zzcps(com.google.android.gms.internal.ads.zzcox zzcoxVar, android.content.Context context, java.lang.String str, com.google.android.gms.ads.internal.client.zzr zzrVar) {
        this.zzh = zzcoxVar;
        com.google.android.gms.internal.ads.zzimu zza = com.google.android.gms.internal.ads.zzimv.zza(context);
        this.zza = zza;
        com.google.android.gms.internal.ads.zzimu zza2 = com.google.android.gms.internal.ads.zzimv.zza(zzrVar);
        this.zzb = zza2;
        com.google.android.gms.internal.ads.zzimu zza3 = com.google.android.gms.internal.ads.zzimv.zza(str);
        this.zzc = zza3;
        com.google.android.gms.internal.ads.zzind zzindVar = zzcoxVar.zzp;
        com.google.android.gms.internal.ads.zzind zza4 = com.google.android.gms.internal.ads.zzimt.zza(com.google.android.gms.internal.ads.zzetd.zza(zzindVar));
        this.zzd = zza4;
        com.google.android.gms.internal.ads.zzind zza5 = com.google.android.gms.internal.ads.zzimt.zza(com.google.android.gms.internal.ads.zzfjk.zza(zzcoxVar.zzby));
        this.zze = zza5;
        com.google.android.gms.internal.ads.zzind zza6 = com.google.android.gms.internal.ads.zzimt.zza(com.google.android.gms.internal.ads.zzfij.zza(zza, zzcoxVar.zza, zzcoxVar.zzaf, zza4, zza5, com.google.android.gms.internal.ads.zzfla.zza()));
        this.zzf = zza6;
        this.zzg = com.google.android.gms.internal.ads.zzimt.zza(com.google.android.gms.internal.ads.zzetl.zza(zza, zza2, zza3, zza6, zza4, zza5, zzcoxVar.zzi, zzcoxVar.zzai, zzindVar));
    }

    @Override // com.google.android.gms.internal.ads.zzfil
    public final com.google.android.gms.internal.ads.zzetk zza() {
        return (com.google.android.gms.internal.ads.zzetk) this.zzg.zzb();
    }
}
