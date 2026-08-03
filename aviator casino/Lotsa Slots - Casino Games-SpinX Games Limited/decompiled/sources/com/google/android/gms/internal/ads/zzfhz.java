package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzfhz implements com.google.android.gms.internal.ads.zzimu {
    private final com.google.android.gms.internal.ads.zzind zza;
    private final com.google.android.gms.internal.ads.zzind zzb;
    private final com.google.android.gms.internal.ads.zzind zzc;

    private zzfhz(com.google.android.gms.internal.ads.zzind zzindVar, com.google.android.gms.internal.ads.zzind zzindVar2, com.google.android.gms.internal.ads.zzind zzindVar3) {
        this.zza = zzindVar;
        this.zzb = zzindVar2;
        this.zzc = zzindVar3;
    }

    public static com.google.android.gms.internal.ads.zzfhz zzc(com.google.android.gms.internal.ads.zzind zzindVar, com.google.android.gms.internal.ads.zzind zzindVar2, com.google.android.gms.internal.ads.zzind zzindVar3) {
        return new com.google.android.gms.internal.ads.zzfhz(zzindVar, zzindVar2, zzindVar3);
    }

    @Override // com.google.android.gms.internal.ads.zzinj, com.google.android.gms.internal.ads.zzini
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final com.google.android.gms.internal.ads.zzfhw zzb() {
        com.google.android.gms.internal.ads.zzfhw zzfhmVar;
        android.content.Context context = (android.content.Context) this.zza.zzb();
        com.google.android.gms.internal.ads.zzfmj zzfmjVar = (com.google.android.gms.internal.ads.zzfmj) this.zzb.zzb();
        com.google.android.gms.internal.ads.zzfnb zzfnbVar = (com.google.android.gms.internal.ads.zzfnb) this.zzc.zzb();
        com.google.android.gms.internal.ads.zzcey zzi = ((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzhm)).booleanValue() ? com.google.android.gms.ads.internal.zzt.zzh().zzo().zzi() : com.google.android.gms.ads.internal.zzt.zzh().zzo().zzj();
        boolean z = false;
        if (zzi != null && zzi.zzi()) {
            z = true;
        }
        if (((java.lang.Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzho)).intValue() > 0) {
            if (!((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzhl)).booleanValue() || z) {
                com.google.android.gms.internal.ads.zzfna zza = zzfnbVar.zza(com.google.android.gms.internal.ads.zzfmr.Rewarded, context, zzfmjVar, new com.google.android.gms.internal.ads.zzfgz(new com.google.android.gms.internal.ads.zzfgy()));
                com.google.android.gms.internal.ads.zzfhn zzfhnVar = new com.google.android.gms.internal.ads.zzfhn(new com.google.android.gms.internal.ads.zzfhm());
                com.google.android.gms.internal.ads.zzfmn zzfmnVar = zza.zza;
                com.google.android.gms.internal.ads.zzhcg zzhcgVar = com.google.android.gms.internal.ads.zzcfr.zza;
                zzfhmVar = new com.google.android.gms.internal.ads.zzfhd(zzfhnVar, new com.google.android.gms.internal.ads.zzfhj(zzfmnVar, zzhcgVar), zza.zzb, zzfmnVar.zze().zzf, zzhcgVar);
                return zzfhmVar;
            }
        }
        zzfhmVar = new com.google.android.gms.internal.ads.zzfhm();
        return zzfhmVar;
    }
}
