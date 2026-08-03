package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzbte implements com.google.android.gms.internal.ads.zzcfy {
    final /* synthetic */ com.google.android.gms.internal.ads.zzbtt zza;
    final /* synthetic */ com.google.android.gms.internal.ads.zzfpw zzb;
    final /* synthetic */ com.google.android.gms.internal.ads.zzbtu zzc;

    zzbte(com.google.android.gms.internal.ads.zzbtu zzbtuVar, com.google.android.gms.internal.ads.zzbtt zzbttVar, com.google.android.gms.internal.ads.zzfpw zzfpwVar) {
        this.zza = zzbttVar;
        this.zzb = zzfpwVar;
        java.util.Objects.requireNonNull(zzbtuVar);
        this.zzc = zzbtuVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcfy
    public final void zza() {
        com.google.android.gms.ads.internal.util.zze.zza("loadNewJavascriptEngine (failure): Trying to acquire lock");
        com.google.android.gms.internal.ads.zzbtu zzbtuVar = this.zzc;
        synchronized (zzbtuVar.zzg()) {
            com.google.android.gms.ads.internal.util.zze.zza("loadNewJavascriptEngine (failure): Lock acquired");
            zzbtuVar.zzl(1);
            com.google.android.gms.ads.internal.util.zze.zza("Failed loading new engine. Marking new engine destroyable.");
            this.zza.zzc();
            if (((java.lang.Boolean) com.google.android.gms.internal.ads.zzbkj.zzd.zze()).booleanValue() && zzbtuVar.zzh() != null) {
                com.google.android.gms.internal.ads.zzfqj zzh = zzbtuVar.zzh();
                com.google.android.gms.internal.ads.zzfpw zzfpwVar = this.zzb;
                zzfpwVar.zzk("Failed loading new engine");
                zzfpwVar.zzd(false);
                zzh.zzb(zzfpwVar.zzm());
            }
        }
        com.google.android.gms.ads.internal.util.zze.zza("loadNewJavascriptEngine (failure): Lock released");
    }
}
