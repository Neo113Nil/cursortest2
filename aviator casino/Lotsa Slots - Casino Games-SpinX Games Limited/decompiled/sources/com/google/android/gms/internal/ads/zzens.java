package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzens implements com.google.android.gms.internal.ads.zzely {
    private final android.content.Context zza;
    private final com.google.android.gms.internal.ads.zzdng zzb;
    private final com.google.android.gms.ads.internal.util.client.VersionInfoParcel zzc;
    private final java.util.concurrent.Executor zzd;

    public zzens(android.content.Context context, com.google.android.gms.ads.internal.util.client.VersionInfoParcel versionInfoParcel, com.google.android.gms.internal.ads.zzdng zzdngVar, java.util.concurrent.Executor executor) {
        this.zza = context;
        this.zzc = versionInfoParcel;
        this.zzb = zzdngVar;
        this.zzd = executor;
    }

    @Override // com.google.android.gms.internal.ads.zzely
    public final void zza(com.google.android.gms.internal.ads.zzfkq zzfkqVar, com.google.android.gms.internal.ads.zzfkf zzfkfVar, com.google.android.gms.internal.ads.zzelv zzelvVar) throws com.google.android.gms.internal.ads.zzflf {
        com.google.android.gms.internal.ads.zzflw zzflwVar = (com.google.android.gms.internal.ads.zzflw) zzelvVar.zzb;
        com.google.android.gms.internal.ads.zzfky zzfkyVar = zzfkqVar.zza.zza;
        java.lang.String jSONObject = zzfkfVar.zzv.toString();
        java.lang.String zzm = com.google.android.gms.ads.internal.util.zzbp.zzm(zzfkfVar.zzs);
        zzflwVar.zzh(this.zza, zzfkyVar.zzd, jSONObject, zzm, (com.google.android.gms.internal.ads.zzbvi) zzelvVar.zzc);
    }

    @Override // com.google.android.gms.internal.ads.zzely
    public final /* bridge */ /* synthetic */ java.lang.Object zzb(com.google.android.gms.internal.ads.zzfkq zzfkqVar, com.google.android.gms.internal.ads.zzfkf zzfkfVar, com.google.android.gms.internal.ads.zzelv zzelvVar) throws com.google.android.gms.internal.ads.zzflf, com.google.android.gms.internal.ads.zzeph {
        com.google.android.gms.internal.ads.zzdma zzd = this.zzb.zzd(new com.google.android.gms.internal.ads.zzcyj(zzfkqVar, zzfkfVar, zzelvVar.zza), new com.google.android.gms.internal.ads.zzdmd(new com.google.android.gms.internal.ads.zzenr(this, zzelvVar, zzfkfVar), null));
        zzd.zza().zzq(new com.google.android.gms.internal.ads.zzcsz((com.google.android.gms.internal.ads.zzflw) zzelvVar.zzb), this.zzd);
        ((com.google.android.gms.internal.ads.zzenh) zzelvVar.zzc).zzc(zzd.zzf());
        return zzd.zzh();
    }

    final /* synthetic */ com.google.android.gms.ads.internal.util.client.VersionInfoParcel zzc() {
        return this.zzc;
    }
}
