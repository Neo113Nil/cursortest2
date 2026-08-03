package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzcpn implements com.google.android.gms.internal.ads.zzebd {
    final com.google.android.gms.internal.ads.zzind zza;
    final com.google.android.gms.internal.ads.zzind zzb;
    final com.google.android.gms.internal.ads.zzind zzc;
    final com.google.android.gms.internal.ads.zzind zzd;
    private final android.content.Context zze;
    private final com.google.android.gms.internal.ads.zzbqq zzf;
    private final com.google.android.gms.internal.ads.zzcox zzg;
    private final com.google.android.gms.internal.ads.zzcpn zzh = this;

    zzcpn(com.google.android.gms.internal.ads.zzcox zzcoxVar, android.content.Context context, com.google.android.gms.internal.ads.zzbqq zzbqqVar) {
        this.zzg = zzcoxVar;
        this.zze = context;
        this.zzf = zzbqqVar;
        com.google.android.gms.internal.ads.zzimu zza = com.google.android.gms.internal.ads.zzimv.zza(this);
        this.zza = zza;
        com.google.android.gms.internal.ads.zzimu zza2 = com.google.android.gms.internal.ads.zzimv.zza(zzbqqVar);
        this.zzb = zza2;
        com.google.android.gms.internal.ads.zzeaz zzc = com.google.android.gms.internal.ads.zzeaz.zzc(zza2);
        this.zzc = zzc;
        this.zzd = com.google.android.gms.internal.ads.zzimt.zza(com.google.android.gms.internal.ads.zzebb.zza(zza, zzc));
    }

    final com.google.android.gms.internal.ads.zzeay zza() {
        return com.google.android.gms.internal.ads.zzeaz.zzd(this.zzf);
    }

    @Override // com.google.android.gms.internal.ads.zzebd
    public final com.google.android.gms.internal.ads.zzeba zzb() {
        return (com.google.android.gms.internal.ads.zzeba) this.zzd.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzebd
    public final com.google.android.gms.internal.ads.zzeav zzc() {
        return new com.google.android.gms.internal.ads.zzcpk(this.zzg, this.zzh, null);
    }

    final /* synthetic */ android.content.Context zzd() {
        return this.zze;
    }
}
