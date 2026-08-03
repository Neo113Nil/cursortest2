package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzeog implements com.google.android.gms.internal.ads.zzely {
    private final android.content.Context zza;
    private final com.google.android.gms.internal.ads.zzdoc zzb;
    private final java.util.concurrent.Executor zzc;

    public zzeog(android.content.Context context, com.google.android.gms.internal.ads.zzdoc zzdocVar, java.util.concurrent.Executor executor) {
        this.zza = context;
        this.zzb = zzdocVar;
        this.zzc = executor;
    }

    private static final boolean zzc(com.google.android.gms.internal.ads.zzfkq zzfkqVar, int i) {
        return zzfkqVar.zza.zza.zzh.contains(java.lang.Integer.toString(i));
    }

    @Override // com.google.android.gms.internal.ads.zzely
    public final void zza(com.google.android.gms.internal.ads.zzfkq zzfkqVar, com.google.android.gms.internal.ads.zzfkf zzfkfVar, com.google.android.gms.internal.ads.zzelv zzelvVar) throws com.google.android.gms.internal.ads.zzflf {
        com.google.android.gms.internal.ads.zzflw zzflwVar = (com.google.android.gms.internal.ads.zzflw) zzelvVar.zzb;
        com.google.android.gms.internal.ads.zzfky zzfkyVar = zzfkqVar.zza.zza;
        java.lang.String jSONObject = zzfkfVar.zzv.toString();
        java.lang.String zzm = com.google.android.gms.ads.internal.util.zzbp.zzm(zzfkfVar.zzs);
        zzflwVar.zzo(this.zza, zzfkyVar.zzd, jSONObject, zzm, (com.google.android.gms.internal.ads.zzbvi) zzelvVar.zzc, zzfkyVar.zzj, zzfkyVar.zzh);
    }

    @Override // com.google.android.gms.internal.ads.zzely
    public final /* bridge */ /* synthetic */ java.lang.Object zzb(com.google.android.gms.internal.ads.zzfkq zzfkqVar, com.google.android.gms.internal.ads.zzfkf zzfkfVar, com.google.android.gms.internal.ads.zzelv zzelvVar) throws com.google.android.gms.internal.ads.zzflf, com.google.android.gms.internal.ads.zzeph {
        com.google.android.gms.internal.ads.zzdpt zzag;
        com.google.android.gms.internal.ads.zzflw zzflwVar = (com.google.android.gms.internal.ads.zzflw) zzelvVar.zzb;
        com.google.android.gms.internal.ads.zzbvn zzD = zzflwVar.zzD();
        com.google.android.gms.internal.ads.zzbvo zzE = zzflwVar.zzE();
        com.google.android.gms.internal.ads.zzbvr zzu = zzflwVar.zzu();
        if (zzu != null && zzc(zzfkqVar, 6)) {
            zzag = com.google.android.gms.internal.ads.zzdpt.zzaf(zzu);
        } else if (zzD != null && zzc(zzfkqVar, 6)) {
            zzag = com.google.android.gms.internal.ads.zzdpt.zzai(zzD);
        } else if (zzD != null && zzc(zzfkqVar, 2)) {
            zzag = com.google.android.gms.internal.ads.zzdpt.zzah(zzD);
        } else if (zzE != null && zzc(zzfkqVar, 6)) {
            zzag = com.google.android.gms.internal.ads.zzdpt.zzaj(zzE);
        } else {
            if (zzE == null || !zzc(zzfkqVar, 1)) {
                throw new com.google.android.gms.internal.ads.zzeph(1, "No native ad mappers");
            }
            zzag = com.google.android.gms.internal.ads.zzdpt.zzag(zzE);
        }
        if (zzag != null) {
            com.google.android.gms.internal.ads.zzfky zzfkyVar = zzfkqVar.zza.zza;
            if (zzfkyVar.zzh.contains(java.lang.Integer.toString(zzag.zzx()))) {
                com.google.android.gms.internal.ads.zzdpv zze = this.zzb.zze(new com.google.android.gms.internal.ads.zzcyj(zzfkqVar, zzfkfVar, zzelvVar.zza), new com.google.android.gms.internal.ads.zzdqe(zzag), new com.google.android.gms.internal.ads.zzdrx(zzE, zzD, zzu));
                ((com.google.android.gms.internal.ads.zzenh) zzelvVar.zzc).zzc(zze.zzf());
                zze.zza().zzq(new com.google.android.gms.internal.ads.zzcsz(zzflwVar), this.zzc);
                return zze.zzh();
            }
        }
        throw new com.google.android.gms.internal.ads.zzeph(1, "No corresponding native ad listener");
    }
}
