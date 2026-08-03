package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzemh implements com.google.android.gms.internal.ads.zzely {
    private final android.content.Context zza;
    private final com.google.android.gms.internal.ads.zzcuz zzb;
    private final java.util.concurrent.Executor zzc;

    zzemh(android.content.Context context, com.google.android.gms.internal.ads.zzcuz zzcuzVar, java.util.concurrent.Executor executor) {
        this.zza = context;
        this.zzb = zzcuzVar;
        this.zzc = executor;
    }

    @Override // com.google.android.gms.internal.ads.zzely
    public final void zza(com.google.android.gms.internal.ads.zzfkq zzfkqVar, com.google.android.gms.internal.ads.zzfkf zzfkfVar, com.google.android.gms.internal.ads.zzelv zzelvVar) throws com.google.android.gms.internal.ads.zzflf {
        com.google.android.gms.internal.ads.zzflw zzflwVar = (com.google.android.gms.internal.ads.zzflw) zzelvVar.zzb;
        com.google.android.gms.internal.ads.zzfky zzfkyVar = zzfkqVar.zza.zza;
        java.lang.String jSONObject = zzfkfVar.zzv.toString();
        zzflwVar.zzy(this.zza, zzfkyVar.zzd, jSONObject, (com.google.android.gms.internal.ads.zzbvi) zzelvVar.zzc);
    }

    @Override // com.google.android.gms.internal.ads.zzely
    public final /* bridge */ /* synthetic */ java.lang.Object zzb(com.google.android.gms.internal.ads.zzfkq zzfkqVar, com.google.android.gms.internal.ads.zzfkf zzfkfVar, com.google.android.gms.internal.ads.zzelv zzelvVar) throws com.google.android.gms.internal.ads.zzflf, com.google.android.gms.internal.ads.zzeph {
        com.google.android.gms.internal.ads.zzcuw zzf = this.zzb.zzf(new com.google.android.gms.internal.ads.zzcyj(zzfkqVar, zzfkfVar, zzelvVar.zza), new com.google.android.gms.internal.ads.zzdmd(new com.google.android.gms.internal.ads.zzemg(this, zzelvVar, zzfkfVar), null), new com.google.android.gms.internal.ads.zzcux(zzfkfVar.zzaa));
        zzf.zza().zzq(new com.google.android.gms.internal.ads.zzcsz((com.google.android.gms.internal.ads.zzflw) zzelvVar.zzb), this.zzc);
        ((com.google.android.gms.internal.ads.zzenh) zzelvVar.zzc).zzc(zzf.zzf());
        return zzf.zzh();
    }
}
