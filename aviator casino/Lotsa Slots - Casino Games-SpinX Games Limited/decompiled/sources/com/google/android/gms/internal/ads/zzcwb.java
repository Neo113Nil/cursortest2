package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzcwb implements com.google.android.gms.internal.ads.zzimu {
    private final com.google.android.gms.internal.ads.zzcvs zza;
    private final com.google.android.gms.internal.ads.zzind zzb;
    private final com.google.android.gms.internal.ads.zzind zzc;
    private final com.google.android.gms.internal.ads.zzind zzd;
    private final com.google.android.gms.internal.ads.zzind zze;

    private zzcwb(com.google.android.gms.internal.ads.zzcvs zzcvsVar, com.google.android.gms.internal.ads.zzind zzindVar, com.google.android.gms.internal.ads.zzind zzindVar2, com.google.android.gms.internal.ads.zzind zzindVar3, com.google.android.gms.internal.ads.zzind zzindVar4) {
        this.zza = zzcvsVar;
        this.zzb = zzindVar;
        this.zzc = zzindVar2;
        this.zzd = zzindVar3;
        this.zze = zzindVar4;
    }

    public static com.google.android.gms.internal.ads.zzcwb zza(com.google.android.gms.internal.ads.zzcvs zzcvsVar, com.google.android.gms.internal.ads.zzind zzindVar, com.google.android.gms.internal.ads.zzind zzindVar2, com.google.android.gms.internal.ads.zzind zzindVar3, com.google.android.gms.internal.ads.zzind zzindVar4) {
        return new com.google.android.gms.internal.ads.zzcwb(zzcvsVar, zzindVar, zzindVar2, zzindVar3, zzindVar4);
    }

    public static com.google.android.gms.internal.ads.zzdkq zzc(com.google.android.gms.internal.ads.zzcvs zzcvsVar, final android.content.Context context, final com.google.android.gms.ads.internal.util.client.VersionInfoParcel versionInfoParcel, final com.google.android.gms.internal.ads.zzfkf zzfkfVar, final com.google.android.gms.internal.ads.zzfky zzfkyVar) {
        return new com.google.android.gms.internal.ads.zzdkq(new com.google.android.gms.internal.ads.zzdef() { // from class: com.google.android.gms.internal.ads.zzcvr
            @Override // com.google.android.gms.internal.ads.zzdef
            public final /* synthetic */ void zzg() {
                com.google.android.gms.internal.ads.zzfky zzfkyVar2 = zzfkyVar;
                org.json.JSONObject jSONObject = zzfkfVar.zzC;
                com.google.android.gms.ads.internal.zzt.zzo().zzg(context, versionInfoParcel.afmaVersion, jSONObject.toString(), zzfkyVar2.zzg);
            }
        }, com.google.android.gms.internal.ads.zzcfr.zzh);
    }

    @Override // com.google.android.gms.internal.ads.zzinj, com.google.android.gms.internal.ads.zzini
    public final /* bridge */ /* synthetic */ java.lang.Object zzb() {
        return zzc(this.zza, (android.content.Context) this.zzb.zzb(), ((com.google.android.gms.internal.ads.zzcoi) this.zzc).zza(), ((com.google.android.gms.internal.ads.zzcyk) this.zzd).zza(), ((com.google.android.gms.internal.ads.zzdci) this.zze).zza());
    }
}
