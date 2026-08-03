package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzdmk implements com.google.android.gms.internal.ads.zzimu {
    private final com.google.android.gms.internal.ads.zzind zza;
    private final com.google.android.gms.internal.ads.zzind zzb;
    private final com.google.android.gms.internal.ads.zzind zzc;
    private final com.google.android.gms.internal.ads.zzind zzd;

    private zzdmk(com.google.android.gms.internal.ads.zzdmd zzdmdVar, com.google.android.gms.internal.ads.zzind zzindVar, com.google.android.gms.internal.ads.zzind zzindVar2, com.google.android.gms.internal.ads.zzind zzindVar3, com.google.android.gms.internal.ads.zzind zzindVar4) {
        this.zza = zzindVar;
        this.zzb = zzindVar2;
        this.zzc = zzindVar3;
        this.zzd = zzindVar4;
    }

    public static com.google.android.gms.internal.ads.zzdmk zza(com.google.android.gms.internal.ads.zzdmd zzdmdVar, com.google.android.gms.internal.ads.zzind zzindVar, com.google.android.gms.internal.ads.zzind zzindVar2, com.google.android.gms.internal.ads.zzind zzindVar3, com.google.android.gms.internal.ads.zzind zzindVar4) {
        return new com.google.android.gms.internal.ads.zzdmk(zzdmdVar, zzindVar, zzindVar2, zzindVar3, zzindVar4);
    }

    @Override // com.google.android.gms.internal.ads.zzinj, com.google.android.gms.internal.ads.zzini
    public final /* bridge */ /* synthetic */ java.lang.Object zzb() {
        final android.content.Context context = (android.content.Context) this.zza.zzb();
        final com.google.android.gms.ads.internal.util.client.VersionInfoParcel zza = ((com.google.android.gms.internal.ads.zzcoi) this.zzb).zza();
        final com.google.android.gms.internal.ads.zzfkf zza2 = ((com.google.android.gms.internal.ads.zzcyk) this.zzc).zza();
        final com.google.android.gms.internal.ads.zzfky zza3 = ((com.google.android.gms.internal.ads.zzdci) this.zzd).zza();
        return new com.google.android.gms.internal.ads.zzdkq(new com.google.android.gms.internal.ads.zzdef() { // from class: com.google.android.gms.internal.ads.zzdmc
            @Override // com.google.android.gms.internal.ads.zzdef
            public final /* synthetic */ void zzg() {
                com.google.android.gms.internal.ads.zzfky zzfkyVar = zza3;
                org.json.JSONObject jSONObject = zza2.zzC;
                com.google.android.gms.ads.internal.zzt.zzo().zzg(context, zza.afmaVersion, jSONObject.toString(), zzfkyVar.zzg);
            }
        }, com.google.android.gms.internal.ads.zzcfr.zzh);
    }
}
