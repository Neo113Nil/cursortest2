package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzdxl implements com.google.android.gms.internal.ads.zzimu {
    private final com.google.android.gms.internal.ads.zzind zza;
    private final com.google.android.gms.internal.ads.zzind zzb;
    private final com.google.android.gms.internal.ads.zzind zzc;
    private final com.google.android.gms.internal.ads.zzind zzd;
    private final com.google.android.gms.internal.ads.zzind zze;

    private zzdxl(com.google.android.gms.internal.ads.zzind zzindVar, com.google.android.gms.internal.ads.zzind zzindVar2, com.google.android.gms.internal.ads.zzind zzindVar3, com.google.android.gms.internal.ads.zzind zzindVar4, com.google.android.gms.internal.ads.zzind zzindVar5) {
        this.zza = zzindVar;
        this.zzb = zzindVar2;
        this.zzc = zzindVar3;
        this.zzd = zzindVar4;
        this.zze = zzindVar5;
    }

    public static com.google.android.gms.internal.ads.zzdxl zza(com.google.android.gms.internal.ads.zzind zzindVar, com.google.android.gms.internal.ads.zzind zzindVar2, com.google.android.gms.internal.ads.zzind zzindVar3, com.google.android.gms.internal.ads.zzind zzindVar4, com.google.android.gms.internal.ads.zzind zzindVar5) {
        return new com.google.android.gms.internal.ads.zzdxl(zzindVar, zzindVar2, zzindVar3, zzindVar4, zzindVar5);
    }

    @Override // com.google.android.gms.internal.ads.zzinj, com.google.android.gms.internal.ads.zzini
    public final /* bridge */ /* synthetic */ java.lang.Object zzb() {
        android.content.Context zza = ((com.google.android.gms.internal.ads.zzcns) this.zza).zza();
        final java.lang.String zzb = ((com.google.android.gms.internal.ads.zzeey) this.zzb).zzb();
        com.google.android.gms.ads.internal.util.client.VersionInfoParcel zza2 = ((com.google.android.gms.internal.ads.zzcoi) this.zzc).zza();
        final com.google.android.gms.internal.ads.zzbhv.zza.EnumC0068zza enumC0068zza = (com.google.android.gms.internal.ads.zzbhv.zza.EnumC0068zza) this.zzd.zzb();
        final java.lang.String str = (java.lang.String) this.zze.zzb();
        com.google.android.gms.internal.ads.zzbhp zzbhpVar = new com.google.android.gms.internal.ads.zzbhp(new com.google.android.gms.internal.ads.zzbhu(zza));
        com.google.android.gms.internal.ads.zzbhv.zzar.zza zzs = com.google.android.gms.internal.ads.zzbhv.zzar.zzs();
        zzs.zzc(zza2.buddyApkVersion);
        zzs.zzg(zza2.clientJarVersion);
        zzs.zzk(true != zza2.isClientJar ? 2 : 0);
        final com.google.android.gms.internal.ads.zzbhv.zzar zzbu = zzs.zzbu();
        zzbhpVar.zzb(new com.google.android.gms.internal.ads.zzbho() { // from class: com.google.android.gms.internal.ads.zzdxk
            @Override // com.google.android.gms.internal.ads.zzbho
            public final /* synthetic */ void zza(com.google.android.gms.internal.ads.zzbhv.zzt.zza zzaVar) {
                com.google.android.gms.internal.ads.zzbhv.zza.zzb zzcc = zzaVar.zzY().zzcc();
                zzcc.zzc(com.google.android.gms.internal.ads.zzbhv.zza.EnumC0068zza.this);
                zzaVar.zzaa(zzcc);
                com.google.android.gms.internal.ads.zzbhv.zzm.zza zzcc2 = zzaVar.zzG().zzcc();
                zzcc2.zzd(zzb);
                zzcc2.zzs(zzbu);
                zzaVar.zzI(zzcc2);
                zzaVar.zzh(str);
            }
        });
        return zzbhpVar;
    }
}
