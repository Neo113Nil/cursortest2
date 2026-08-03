package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzenv implements com.google.android.gms.internal.ads.zzely {
    private final android.content.Context zza;
    private final com.google.android.gms.internal.ads.zzdng zzb;

    public zzenv(android.content.Context context, com.google.android.gms.internal.ads.zzdng zzdngVar) {
        this.zza = context;
        this.zzb = zzdngVar;
    }

    @Override // com.google.android.gms.internal.ads.zzely
    public final void zza(com.google.android.gms.internal.ads.zzfkq zzfkqVar, com.google.android.gms.internal.ads.zzfkf zzfkfVar, com.google.android.gms.internal.ads.zzelv zzelvVar) throws com.google.android.gms.internal.ads.zzflf {
        try {
            com.google.android.gms.internal.ads.zzbxb zzbxbVar = (com.google.android.gms.internal.ads.zzbxb) zzelvVar.zzb;
            zzbxbVar.zzo(zzfkfVar.zzZ);
            zzbxbVar.zzj(zzfkfVar.zzU, zzfkfVar.zzv.toString(), zzfkqVar.zza.zza.zzd, com.google.android.gms.dynamic.ObjectWrapper.wrap(this.zza), new com.google.android.gms.internal.ads.zzenu(this, zzelvVar, null), (com.google.android.gms.internal.ads.zzbvi) zzelvVar.zzc);
        } catch (android.os.RemoteException e) {
            com.google.android.gms.ads.internal.util.zze.zzb("Remote exception loading a interstitial RTB ad", e);
            throw new com.google.android.gms.internal.ads.zzflf(e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzely
    public final /* bridge */ /* synthetic */ java.lang.Object zzb(com.google.android.gms.internal.ads.zzfkq zzfkqVar, com.google.android.gms.internal.ads.zzfkf zzfkfVar, com.google.android.gms.internal.ads.zzelv zzelvVar) throws com.google.android.gms.internal.ads.zzflf, com.google.android.gms.internal.ads.zzeph {
        com.google.android.gms.internal.ads.zzenq zzenqVar = new com.google.android.gms.internal.ads.zzenq(zzfkfVar, (com.google.android.gms.internal.ads.zzbxb) zzelvVar.zzb, com.google.android.gms.ads.AdFormat.INTERSTITIAL);
        com.google.android.gms.internal.ads.zzdma zzd = this.zzb.zzd(new com.google.android.gms.internal.ads.zzcyj(zzfkqVar, zzfkfVar, zzelvVar.zza), new com.google.android.gms.internal.ads.zzdmd(zzenqVar, null));
        zzenqVar.zzc(zzd.zzd());
        ((com.google.android.gms.internal.ads.zzenh) zzelvVar.zzc).zzc(zzd.zzg());
        return zzd.zzh();
    }
}
