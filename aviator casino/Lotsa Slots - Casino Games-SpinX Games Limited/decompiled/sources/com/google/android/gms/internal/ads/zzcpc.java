package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzcpc implements com.google.android.gms.internal.ads.zzffh {
    final com.google.android.gms.internal.ads.zzind zza;
    final com.google.android.gms.internal.ads.zzind zzb;
    final com.google.android.gms.internal.ads.zzind zzc;
    final com.google.android.gms.internal.ads.zzind zzd;
    final com.google.android.gms.internal.ads.zzind zze;
    final com.google.android.gms.internal.ads.zzind zzf;
    private final com.google.android.gms.internal.ads.zzcox zzg;

    zzcpc(com.google.android.gms.internal.ads.zzcox zzcoxVar, android.content.Context context, java.lang.String str) {
        this.zzg = zzcoxVar;
        com.google.android.gms.internal.ads.zzimu zza = com.google.android.gms.internal.ads.zzimv.zza(context);
        this.zza = zza;
        com.google.android.gms.internal.ads.zzimu zza2 = com.google.android.gms.internal.ads.zzimv.zza(str);
        this.zzb = zza2;
        com.google.android.gms.internal.ads.zzind zzindVar = zzcoxVar.zzby;
        com.google.android.gms.internal.ads.zzfhy zzc = com.google.android.gms.internal.ads.zzfhy.zzc(zza, zzindVar, zzcoxVar.zzbz);
        this.zzc = zzc;
        com.google.android.gms.internal.ads.zzind zza3 = com.google.android.gms.internal.ads.zzimt.zza(com.google.android.gms.internal.ads.zzfgf.zza(zzindVar));
        this.zzd = zza3;
        com.google.android.gms.internal.ads.zzind zzindVar2 = zzcoxVar.zza;
        com.google.android.gms.internal.ads.zzind zzindVar3 = zzcoxVar.zzaf;
        com.google.android.gms.internal.ads.zzfla zza4 = com.google.android.gms.internal.ads.zzfla.zza();
        com.google.android.gms.internal.ads.zzind zzindVar4 = zzcoxVar.zzi;
        com.google.android.gms.internal.ads.zzind zza5 = com.google.android.gms.internal.ads.zzimt.zza(com.google.android.gms.internal.ads.zzfgh.zza(zza, zzindVar2, zzindVar3, zzc, zza3, zza4, zzindVar4));
        this.zze = zza5;
        this.zzf = com.google.android.gms.internal.ads.zzimt.zza(com.google.android.gms.internal.ads.zzfgn.zza(zzindVar3, zza, zza2, zza5, zza3, zzindVar4, zzcoxVar.zzp));
    }

    @Override // com.google.android.gms.internal.ads.zzffh
    public final com.google.android.gms.internal.ads.zzfgm zza() {
        return (com.google.android.gms.internal.ads.zzfgm) this.zzf.zzb();
    }
}
