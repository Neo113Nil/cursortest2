package com.google.android.gms.internal.ads;

import I2.J;

/* JADX INFO: loaded from: classes.dex */
final class zzbmr implements zzbzj {
    final /* synthetic */ zzbnb zza;
    final /* synthetic */ zzffn zzb;
    final /* synthetic */ zzbnc zzc;

    public zzbmr(zzbnc zzbncVar, zzbnb zzbnbVar, zzffn zzffnVar) {
        this.zza = zzbnbVar;
        this.zzb = zzffnVar;
        this.zzc = zzbncVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbzj
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        J.k("loadNewJavascriptEngine (success): Trying to acquire lock");
        synchronized (this.zzc.zza) {
            try {
                J.k("loadNewJavascriptEngine (success): Lock acquired");
                this.zzc.zzi = 0;
                zzbnc zzbncVar = this.zzc;
                if (zzbncVar.zzh != null && this.zza != zzbncVar.zzh) {
                    J.k("New JS engine is loaded, marking previous one as destroyable.");
                    this.zzc.zzh.zzb();
                }
                this.zzc.zzh = this.zza;
                if (((Boolean) zzbdr.zzd.zze()).booleanValue()) {
                    zzbnc zzbncVar2 = this.zzc;
                    if (zzbncVar2.zze != null) {
                        zzfgb zzfgbVar = zzbncVar2.zze;
                        zzffn zzffnVar = this.zzb;
                        zzffnVar.zzg(true);
                        zzfgbVar.zzc(zzffnVar.zzm());
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        J.k("loadNewJavascriptEngine (success): Lock released");
    }
}
