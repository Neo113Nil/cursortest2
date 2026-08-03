package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzepq implements com.google.android.gms.internal.ads.zzely {
    private final android.content.Context zza;
    private final java.util.concurrent.Executor zzb;
    private final com.google.android.gms.internal.ads.zzdvr zzc;

    public zzepq(android.content.Context context, java.util.concurrent.Executor executor, com.google.android.gms.internal.ads.zzdvr zzdvrVar) {
        this.zza = context;
        this.zzb = executor;
        this.zzc = zzdvrVar;
    }

    @Override // com.google.android.gms.internal.ads.zzely
    public final void zza(com.google.android.gms.internal.ads.zzfkq zzfkqVar, com.google.android.gms.internal.ads.zzfkf zzfkfVar, com.google.android.gms.internal.ads.zzelv zzelvVar) throws com.google.android.gms.internal.ads.zzflf {
        try {
            com.google.android.gms.internal.ads.zzfky zzfkyVar = zzfkqVar.zza.zza;
            if (zzfkyVar.zzp.zza == 3) {
                ((com.google.android.gms.internal.ads.zzflw) zzelvVar.zzb).zzx(this.zza, zzfkyVar.zzd, zzfkfVar.zzv.toString(), (com.google.android.gms.internal.ads.zzbvi) zzelvVar.zzc);
            } else {
                ((com.google.android.gms.internal.ads.zzflw) zzelvVar.zzb).zzv(this.zza, zzfkyVar.zzd, zzfkfVar.zzv.toString(), (com.google.android.gms.internal.ads.zzbvi) zzelvVar.zzc);
            }
        } catch (java.lang.Exception e) {
            java.lang.String str = zzelvVar.zza;
            java.lang.String.valueOf(str);
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzj("Fail to load ad from adapter ".concat(java.lang.String.valueOf(str)), e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzely
    public final /* bridge */ /* synthetic */ java.lang.Object zzb(com.google.android.gms.internal.ads.zzfkq zzfkqVar, com.google.android.gms.internal.ads.zzfkf zzfkfVar, com.google.android.gms.internal.ads.zzelv zzelvVar) throws com.google.android.gms.internal.ads.zzflf, com.google.android.gms.internal.ads.zzeph {
        com.google.android.gms.internal.ads.zzdvn zzf = this.zzc.zzf(new com.google.android.gms.internal.ads.zzcyj(zzfkqVar, zzfkfVar, zzelvVar.zza), new com.google.android.gms.internal.ads.zzdvo(new com.google.android.gms.internal.ads.zzepp(this, zzelvVar, zzfkfVar)));
        zzf.zza().zzq(new com.google.android.gms.internal.ads.zzcsz((com.google.android.gms.internal.ads.zzflw) zzelvVar.zzb), this.zzb);
        ((com.google.android.gms.internal.ads.zzenh) zzelvVar.zzc).zzc(zzf.zzm());
        return zzf.zzh();
    }
}
