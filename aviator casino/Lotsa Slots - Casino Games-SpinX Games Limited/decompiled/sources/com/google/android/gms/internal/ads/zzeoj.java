package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzeoj implements com.google.android.gms.internal.ads.zzely {
    private final android.content.Context zza;
    private final com.google.android.gms.internal.ads.zzdoc zzb;
    private com.google.android.gms.internal.ads.zzbvr zzc;
    private final com.google.android.gms.ads.internal.util.client.VersionInfoParcel zzd;

    public zzeoj(android.content.Context context, com.google.android.gms.internal.ads.zzdoc zzdocVar, com.google.android.gms.ads.internal.util.client.VersionInfoParcel versionInfoParcel) {
        this.zza = context;
        this.zzb = zzdocVar;
        this.zzd = versionInfoParcel;
    }

    @Override // com.google.android.gms.internal.ads.zzely
    public final void zza(com.google.android.gms.internal.ads.zzfkq zzfkqVar, com.google.android.gms.internal.ads.zzfkf zzfkfVar, com.google.android.gms.internal.ads.zzelv zzelvVar) throws com.google.android.gms.internal.ads.zzflf {
        try {
            com.google.android.gms.internal.ads.zzbxb zzbxbVar = (com.google.android.gms.internal.ads.zzbxb) zzelvVar.zzb;
            zzbxbVar.zzo(zzfkfVar.zzZ);
            if (this.zzd.clientJarVersion < ((java.lang.Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzcs)).intValue()) {
                zzbxbVar.zzn(zzfkfVar.zzU, zzfkfVar.zzv.toString(), zzfkqVar.zza.zza.zzd, com.google.android.gms.dynamic.ObjectWrapper.wrap(this.zza), new com.google.android.gms.internal.ads.zzeoi(this, zzelvVar, null), (com.google.android.gms.internal.ads.zzbvi) zzelvVar.zzc);
                return;
            }
            java.lang.String str = zzfkfVar.zzU;
            java.lang.String jSONObject = zzfkfVar.zzv.toString();
            com.google.android.gms.internal.ads.zzfky zzfkyVar = zzfkqVar.zza.zza;
            zzbxbVar.zzr(str, jSONObject, zzfkyVar.zzd, com.google.android.gms.dynamic.ObjectWrapper.wrap(this.zza), new com.google.android.gms.internal.ads.zzeoi(this, zzelvVar, null), (com.google.android.gms.internal.ads.zzbvi) zzelvVar.zzc, zzfkyVar.zzj);
        } catch (android.os.RemoteException e) {
            throw new com.google.android.gms.internal.ads.zzflf(e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzely
    public final /* bridge */ /* synthetic */ java.lang.Object zzb(com.google.android.gms.internal.ads.zzfkq zzfkqVar, com.google.android.gms.internal.ads.zzfkf zzfkfVar, com.google.android.gms.internal.ads.zzelv zzelvVar) throws com.google.android.gms.internal.ads.zzflf, com.google.android.gms.internal.ads.zzeph {
        java.util.ArrayList arrayList = zzfkqVar.zza.zza.zzh;
        if (!arrayList.contains(java.lang.Integer.toString(6))) {
            throw new com.google.android.gms.internal.ads.zzeph(2, "Unified must be used for RTB.");
        }
        com.google.android.gms.internal.ads.zzdpt zzaf = com.google.android.gms.internal.ads.zzdpt.zzaf(this.zzc);
        if (!arrayList.contains(java.lang.Integer.toString(zzaf.zzx()))) {
            throw new com.google.android.gms.internal.ads.zzeph(1, "No corresponding native ad listener");
        }
        com.google.android.gms.internal.ads.zzdpv zze = this.zzb.zze(new com.google.android.gms.internal.ads.zzcyj(zzfkqVar, zzfkfVar, zzelvVar.zza), new com.google.android.gms.internal.ads.zzdqe(zzaf), new com.google.android.gms.internal.ads.zzdrx(null, null, this.zzc));
        ((com.google.android.gms.internal.ads.zzenh) zzelvVar.zzc).zzc(zze.zzg());
        return zze.zzh();
    }

    final /* synthetic */ void zzc(com.google.android.gms.internal.ads.zzbvr zzbvrVar) {
        this.zzc = zzbvrVar;
    }
}
