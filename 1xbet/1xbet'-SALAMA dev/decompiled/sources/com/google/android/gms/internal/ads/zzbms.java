package com.google.android.gms.internal.ads;

import I2.J;

/* JADX INFO: loaded from: classes.dex */
final class zzbms implements zzbzh {
    final /* synthetic */ zzbnb zza;
    final /* synthetic */ zzffn zzb;
    final /* synthetic */ zzbnc zzc;

    public zzbms(zzbnc zzbncVar, zzbnb zzbnbVar, zzffn zzffnVar) {
        this.zza = zzbnbVar;
        this.zzb = zzffnVar;
        this.zzc = zzbncVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbzh
    public final void zza() {
        J.k("loadNewJavascriptEngine (failure): Trying to acquire lock");
        synchronized (this.zzc.zza) {
            try {
                J.k("loadNewJavascriptEngine (failure): Lock acquired");
                this.zzc.zzi = 1;
                J.k("Failed loading new engine. Marking new engine destroyable.");
                this.zza.zzb();
                if (((Boolean) zzbdr.zzd.zze()).booleanValue()) {
                    zzbnc zzbncVar = this.zzc;
                    if (zzbncVar.zze != null) {
                        zzfgb zzfgbVar = zzbncVar.zze;
                        zzffn zzffnVar = this.zzb;
                        zzffnVar.zzc("Failed loading new engine");
                        zzffnVar.zzg(false);
                        zzfgbVar.zzc(zzffnVar.zzm());
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        J.k("loadNewJavascriptEngine (failure): Lock released");
    }
}
