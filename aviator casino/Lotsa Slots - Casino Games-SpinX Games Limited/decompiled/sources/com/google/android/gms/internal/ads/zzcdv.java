package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzcdv extends com.google.android.gms.internal.ads.zzcea {
    final com.google.android.gms.internal.ads.zzind zza;
    final com.google.android.gms.internal.ads.zzind zzb;
    final com.google.android.gms.internal.ads.zzind zzc;
    final com.google.android.gms.internal.ads.zzind zzd;
    final com.google.android.gms.internal.ads.zzind zze;
    final com.google.android.gms.internal.ads.zzind zzf;
    final com.google.android.gms.internal.ads.zzind zzg;
    final com.google.android.gms.internal.ads.zzind zzh;
    private final com.google.android.gms.common.util.Clock zzj;

    zzcdv(android.content.Context context, com.google.android.gms.common.util.Clock clock, com.google.android.gms.ads.internal.util.zzg zzgVar, com.google.android.gms.internal.ads.zzcdz zzcdzVar) {
        this.zzj = clock;
        com.google.android.gms.internal.ads.zzimu zza = com.google.android.gms.internal.ads.zzimv.zza(context);
        this.zza = zza;
        com.google.android.gms.internal.ads.zzimu zza2 = com.google.android.gms.internal.ads.zzimv.zza(zzgVar);
        this.zzb = zza2;
        this.zzc = com.google.android.gms.internal.ads.zzimt.zza(com.google.android.gms.internal.ads.zzcdp.zza(zza, zza2));
        com.google.android.gms.internal.ads.zzimu zza3 = com.google.android.gms.internal.ads.zzimv.zza(clock);
        this.zzd = zza3;
        com.google.android.gms.internal.ads.zzimu zza4 = com.google.android.gms.internal.ads.zzimv.zza(zzcdzVar);
        this.zze = zza4;
        com.google.android.gms.internal.ads.zzind zza5 = com.google.android.gms.internal.ads.zzimt.zza(com.google.android.gms.internal.ads.zzcdr.zza(zza3, zza2, zza4));
        this.zzf = zza5;
        com.google.android.gms.internal.ads.zzcdt zzc = com.google.android.gms.internal.ads.zzcdt.zzc(zza3, zza5);
        this.zzg = zzc;
        this.zzh = com.google.android.gms.internal.ads.zzimt.zza(com.google.android.gms.internal.ads.zzceg.zza(zza, zzc));
    }

    @Override // com.google.android.gms.internal.ads.zzcea
    final com.google.android.gms.internal.ads.zzcds zza() {
        return new com.google.android.gms.internal.ads.zzcds(this.zzj, (com.google.android.gms.internal.ads.zzcdq) this.zzf.zzb());
    }
}
