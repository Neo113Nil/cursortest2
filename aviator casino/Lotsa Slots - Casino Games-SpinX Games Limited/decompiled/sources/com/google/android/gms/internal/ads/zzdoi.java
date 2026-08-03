package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzdoi implements com.google.android.gms.internal.ads.zzimu {
    private final com.google.android.gms.internal.ads.zzind zza;
    private final com.google.android.gms.internal.ads.zzind zzb;
    private final com.google.android.gms.internal.ads.zzind zzc;
    private final com.google.android.gms.internal.ads.zzind zzd;
    private final com.google.android.gms.internal.ads.zzind zze;
    private final com.google.android.gms.internal.ads.zzind zzf;

    private zzdoi(com.google.android.gms.internal.ads.zzind zzindVar, com.google.android.gms.internal.ads.zzind zzindVar2, com.google.android.gms.internal.ads.zzind zzindVar3, com.google.android.gms.internal.ads.zzind zzindVar4, com.google.android.gms.internal.ads.zzind zzindVar5, com.google.android.gms.internal.ads.zzind zzindVar6) {
        this.zza = zzindVar;
        this.zzb = zzindVar2;
        this.zzc = zzindVar3;
        this.zzd = zzindVar4;
        this.zze = zzindVar5;
        this.zzf = zzindVar6;
    }

    public static com.google.android.gms.internal.ads.zzdoi zza(com.google.android.gms.internal.ads.zzind zzindVar, com.google.android.gms.internal.ads.zzind zzindVar2, com.google.android.gms.internal.ads.zzind zzindVar3, com.google.android.gms.internal.ads.zzind zzindVar4, com.google.android.gms.internal.ads.zzind zzindVar5, com.google.android.gms.internal.ads.zzind zzindVar6) {
        return new com.google.android.gms.internal.ads.zzdoi(zzindVar, zzindVar2, zzindVar3, zzindVar4, zzindVar5, zzindVar6);
    }

    @Override // com.google.android.gms.internal.ads.zzinj, com.google.android.gms.internal.ads.zzini
    public final /* bridge */ /* synthetic */ java.lang.Object zzb() {
        com.google.android.gms.internal.ads.zzcnj zzcnjVar = (com.google.android.gms.internal.ads.zzcnj) this.zza.zzb();
        com.google.android.gms.internal.ads.zzdca zza = ((com.google.android.gms.internal.ads.zzdcj) this.zzb).zza();
        com.google.android.gms.internal.ads.zzdir zza2 = ((com.google.android.gms.internal.ads.zzdjm) this.zzc).zza();
        com.google.android.gms.internal.ads.zzdnx zza3 = ((com.google.android.gms.internal.ads.zzdnz) this.zzd).zza();
        com.google.android.gms.internal.ads.zzdfs zzb = ((com.google.android.gms.internal.ads.zzcvk) this.zze).zzb();
        com.google.android.gms.internal.ads.zzepd zzepdVar = (com.google.android.gms.internal.ads.zzepd) this.zzf.zzb();
        com.google.android.gms.internal.ads.zzcwp zzi = zzcnjVar.zzi();
        zzi.zzl(zza.zze());
        zzi.zzm(zza2);
        zzi.zzd(zza3);
        zzi.zzk(new com.google.android.gms.internal.ads.zzeri(null));
        zzi.zzg(new com.google.android.gms.internal.ads.zzcxl(zzb, null));
        zzi.zze(new com.google.android.gms.internal.ads.zzcvi(null));
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzez)).booleanValue()) {
            zzi.zzf(com.google.android.gms.internal.ads.zzepm.zza(zzepdVar));
        }
        com.google.android.gms.internal.ads.zzcxw zzd = zzi.zza().zzd();
        com.google.android.gms.internal.ads.zzinc.zzb(zzd);
        return zzd;
    }
}
