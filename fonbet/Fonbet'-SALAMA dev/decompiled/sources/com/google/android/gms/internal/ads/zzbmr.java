package com.google.android.gms.internal.ads;

import I2.J;

/* loaded from: classes.dex */
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
        Object obj2;
        zzbnb zzbnbVar;
        zzfgb zzfgbVar;
        zzfgb zzfgbVar2;
        zzbnb zzbnbVar2;
        zzbnb zzbnbVar3;
        J.k("loadNewJavascriptEngine (success): Trying to acquire lock");
        obj2 = this.zzc.zza;
        synchronized (obj2) {
            try {
                J.k("loadNewJavascriptEngine (success): Lock acquired");
                this.zzc.zzi = 0;
                zzbnc zzbncVar = this.zzc;
                zzbnbVar = zzbncVar.zzh;
                if (zzbnbVar != null) {
                    zzbnb zzbnbVar4 = this.zza;
                    zzbnbVar2 = zzbncVar.zzh;
                    if (zzbnbVar4 != zzbnbVar2) {
                        J.k("New JS engine is loaded, marking previous one as destroyable.");
                        zzbnbVar3 = this.zzc.zzh;
                        zzbnbVar3.zzb();
                    }
                }
                this.zzc.zzh = this.zza;
                if (((Boolean) zzbdr.zzd.zze()).booleanValue()) {
                    zzbnc zzbncVar2 = this.zzc;
                    zzfgbVar = zzbncVar2.zze;
                    if (zzfgbVar != null) {
                        zzfgbVar2 = zzbncVar2.zze;
                        zzffn zzffnVar = this.zzb;
                        zzffnVar.zzg(true);
                        zzfgbVar2.zzc(zzffnVar.zzm());
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        J.k("loadNewJavascriptEngine (success): Lock released");
    }
}
