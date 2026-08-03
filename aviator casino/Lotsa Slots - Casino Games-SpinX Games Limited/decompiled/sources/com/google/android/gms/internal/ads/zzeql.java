package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzeql implements com.google.android.gms.internal.ads.zzely {
    private final android.content.Context zza;
    private final java.util.concurrent.Executor zzb;
    private final com.google.android.gms.internal.ads.zzdvr zzc;

    public zzeql(android.content.Context context, java.util.concurrent.Executor executor, com.google.android.gms.internal.ads.zzdvr zzdvrVar) {
        this.zza = context;
        this.zzb = executor;
        this.zzc = zzdvrVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void zze(com.google.android.gms.internal.ads.zzfkq zzfkqVar, com.google.android.gms.internal.ads.zzfkf zzfkfVar, com.google.android.gms.internal.ads.zzelv zzelvVar) {
        try {
            ((com.google.android.gms.internal.ads.zzflw) zzelvVar.zzb).zzl(zzfkqVar.zza.zza.zzd, zzfkfVar.zzv.toString());
        } catch (java.lang.Exception e) {
            java.lang.String str = zzelvVar.zza;
            java.lang.String.valueOf(str);
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzj("Fail to load ad from adapter ".concat(java.lang.String.valueOf(str)), e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzely
    public final void zza(com.google.android.gms.internal.ads.zzfkq zzfkqVar, com.google.android.gms.internal.ads.zzfkf zzfkfVar, com.google.android.gms.internal.ads.zzelv zzelvVar) throws com.google.android.gms.internal.ads.zzflf {
        com.google.android.gms.internal.ads.zzflw zzflwVar = (com.google.android.gms.internal.ads.zzflw) zzelvVar.zzb;
        if (zzflwVar.zzn()) {
            zze(zzfkqVar, zzfkfVar, zzelvVar);
            return;
        }
        com.google.android.gms.internal.ads.zzeqi zzeqiVar = new com.google.android.gms.internal.ads.zzeqi(this, zzfkqVar, zzfkfVar, zzelvVar);
        com.google.android.gms.internal.ads.zzdeb zzdebVar = zzelvVar.zzc;
        ((com.google.android.gms.internal.ads.zzeni) zzdebVar).zzd(zzeqiVar);
        android.content.Context context = this.zza;
        com.google.android.gms.internal.ads.zzfky zzfkyVar = zzfkqVar.zza.zza;
        java.lang.String jSONObject = zzfkfVar.zzv.toString();
        zzflwVar.zzk(context, zzfkyVar.zzd, null, (com.google.android.gms.internal.ads.zzcca) zzdebVar, jSONObject);
    }

    @Override // com.google.android.gms.internal.ads.zzely
    public final /* bridge */ /* synthetic */ java.lang.Object zzb(com.google.android.gms.internal.ads.zzfkq zzfkqVar, com.google.android.gms.internal.ads.zzfkf zzfkfVar, com.google.android.gms.internal.ads.zzelv zzelvVar) throws com.google.android.gms.internal.ads.zzflf, com.google.android.gms.internal.ads.zzeph {
        com.google.android.gms.internal.ads.zzdvn zzf = this.zzc.zzf(new com.google.android.gms.internal.ads.zzcyj(zzfkqVar, zzfkfVar, zzelvVar.zza), new com.google.android.gms.internal.ads.zzdvo(new com.google.android.gms.internal.ads.zzeqj(this, zzelvVar, zzfkfVar)));
        zzf.zza().zzq(new com.google.android.gms.internal.ads.zzcsz((com.google.android.gms.internal.ads.zzflw) zzelvVar.zzb), this.zzb);
        com.google.android.gms.internal.ads.zzddy zzb = zzf.zzb();
        com.google.android.gms.internal.ads.zzdcp zzc = zzf.zzc();
        ((com.google.android.gms.internal.ads.zzeni) zzelvVar.zzc).zzc(new com.google.android.gms.internal.ads.zzeqk(this, zzf.zzi(), zzc, zzb, zzf.zzk()));
        return zzf.zzh();
    }

    final /* synthetic */ java.util.concurrent.Executor zzc() {
        return this.zzb;
    }
}
