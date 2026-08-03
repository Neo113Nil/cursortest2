package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzemk implements com.google.android.gms.internal.ads.zzely {
    private final android.content.Context zza;
    private final com.google.android.gms.internal.ads.zzcuz zzb;

    zzemk(android.content.Context context, com.google.android.gms.internal.ads.zzcuz zzcuzVar) {
        this.zza = context;
        this.zzb = zzcuzVar;
    }

    @Override // com.google.android.gms.internal.ads.zzely
    public final void zza(com.google.android.gms.internal.ads.zzfkq zzfkqVar, com.google.android.gms.internal.ads.zzfkf zzfkfVar, com.google.android.gms.internal.ads.zzelv zzelvVar) throws com.google.android.gms.internal.ads.zzflf {
        try {
            com.google.android.gms.internal.ads.zzbxb zzbxbVar = (com.google.android.gms.internal.ads.zzbxb) zzelvVar.zzb;
            zzbxbVar.zzo(zzfkfVar.zzZ);
            zzbxbVar.zzs(zzfkfVar.zzU, zzfkfVar.zzv.toString(), zzfkqVar.zza.zza.zzd, com.google.android.gms.dynamic.ObjectWrapper.wrap(this.zza), new com.google.android.gms.internal.ads.zzemj(zzelvVar, null), (com.google.android.gms.internal.ads.zzbvi) zzelvVar.zzc);
        } catch (android.os.RemoteException e) {
            com.google.android.gms.ads.internal.util.zze.zzb("Remote exception loading an app open RTB ad", e);
            throw new com.google.android.gms.internal.ads.zzflf(e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzely
    public final /* bridge */ /* synthetic */ java.lang.Object zzb(com.google.android.gms.internal.ads.zzfkq zzfkqVar, com.google.android.gms.internal.ads.zzfkf zzfkfVar, com.google.android.gms.internal.ads.zzelv zzelvVar) throws com.google.android.gms.internal.ads.zzflf, com.google.android.gms.internal.ads.zzeph {
        com.google.android.gms.internal.ads.zzenq zzenqVar = new com.google.android.gms.internal.ads.zzenq(zzfkfVar, (com.google.android.gms.internal.ads.zzbxb) zzelvVar.zzb, com.google.android.gms.ads.AdFormat.APP_OPEN_AD);
        com.google.android.gms.internal.ads.zzcuw zzf = this.zzb.zzf(new com.google.android.gms.internal.ads.zzcyj(zzfkqVar, zzfkfVar, zzelvVar.zza), new com.google.android.gms.internal.ads.zzdmd(zzenqVar, null), new com.google.android.gms.internal.ads.zzcux(zzfkfVar.zzaa));
        zzenqVar.zzc(zzf.zzd());
        ((com.google.android.gms.internal.ads.zzenh) zzelvVar.zzc).zzc(zzf.zzg());
        return zzf.zzh();
    }
}
