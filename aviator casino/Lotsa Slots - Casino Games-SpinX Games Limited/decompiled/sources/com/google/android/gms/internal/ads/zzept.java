package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzept implements com.google.android.gms.internal.ads.zzely {
    private final android.content.Context zza;
    private final com.google.android.gms.internal.ads.zzdvr zzb;

    public zzept(android.content.Context context, com.google.android.gms.internal.ads.zzdvr zzdvrVar) {
        this.zza = context;
        this.zzb = zzdvrVar;
    }

    @Override // com.google.android.gms.internal.ads.zzely
    public final void zza(com.google.android.gms.internal.ads.zzfkq zzfkqVar, com.google.android.gms.internal.ads.zzfkf zzfkfVar, com.google.android.gms.internal.ads.zzelv zzelvVar) throws com.google.android.gms.internal.ads.zzflf {
        try {
            com.google.android.gms.internal.ads.zzbxb zzbxbVar = (com.google.android.gms.internal.ads.zzbxb) zzelvVar.zzb;
            zzbxbVar.zzo(zzfkfVar.zzZ);
            com.google.android.gms.internal.ads.zzfky zzfkyVar = zzfkqVar.zza.zza;
            if (zzfkyVar.zzp.zza == 3) {
                zzbxbVar.zzp(zzfkfVar.zzU, zzfkfVar.zzv.toString(), zzfkyVar.zzd, com.google.android.gms.dynamic.ObjectWrapper.wrap(this.zza), new com.google.android.gms.internal.ads.zzeps(this, zzelvVar, null), (com.google.android.gms.internal.ads.zzbvi) zzelvVar.zzc);
            } else {
                zzbxbVar.zzl(zzfkfVar.zzU, zzfkfVar.zzv.toString(), zzfkyVar.zzd, com.google.android.gms.dynamic.ObjectWrapper.wrap(this.zza), new com.google.android.gms.internal.ads.zzeps(this, zzelvVar, null), (com.google.android.gms.internal.ads.zzbvi) zzelvVar.zzc);
            }
        } catch (android.os.RemoteException e) {
            com.google.android.gms.ads.internal.util.zze.zzb("Remote exception loading a rewarded RTB ad", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzely
    public final /* bridge */ /* synthetic */ java.lang.Object zzb(com.google.android.gms.internal.ads.zzfkq zzfkqVar, com.google.android.gms.internal.ads.zzfkf zzfkfVar, com.google.android.gms.internal.ads.zzelv zzelvVar) throws com.google.android.gms.internal.ads.zzflf, com.google.android.gms.internal.ads.zzeph {
        com.google.android.gms.internal.ads.zzenq zzenqVar = new com.google.android.gms.internal.ads.zzenq(zzfkfVar, (com.google.android.gms.internal.ads.zzbxb) zzelvVar.zzb, com.google.android.gms.ads.AdFormat.REWARDED);
        com.google.android.gms.internal.ads.zzdvn zzf = this.zzb.zzf(new com.google.android.gms.internal.ads.zzcyj(zzfkqVar, zzfkfVar, zzelvVar.zza), new com.google.android.gms.internal.ads.zzdvo(zzenqVar));
        zzenqVar.zzc(zzf.zzd());
        ((com.google.android.gms.internal.ads.zzenh) zzelvVar.zzc).zzc(zzf.zzn());
        return zzf.zzh();
    }
}
