package com.google.android.gms.internal.ads;

import E2.o;
import I2.J;
import java.util.Map;

/* loaded from: classes.dex */
final class zzbmn implements zzbiz {
    final /* synthetic */ long zza;
    final /* synthetic */ zzbnb zzb;
    final /* synthetic */ zzblx zzc;
    final /* synthetic */ zzbnc zzd;

    public zzbmn(zzbnc zzbncVar, long j, zzbnb zzbnbVar, zzblx zzblxVar) {
        this.zza = j;
        this.zzb = zzbnbVar;
        this.zzc = zzblxVar;
        this.zzd = zzbncVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbiz
    public final void zza(Object obj, Map map) {
        Object obj2;
        o.f1952C.j.getClass();
        J.k("onGmsg /jsLoaded. JsLoaded latency is " + (System.currentTimeMillis() - this.zza) + " ms.");
        J.k("loadJavascriptEngine > /jsLoaded handler: Trying to acquire lock");
        obj2 = this.zzd.zza;
        synchronized (obj2) {
            J.k("loadJavascriptEngine > /jsLoaded handler: Lock acquired");
            if (this.zzb.zze() != -1 && this.zzb.zze() != 1) {
                this.zzd.zzi = 0;
                zzblx zzblxVar = this.zzc;
                zzblxVar.zzq("/log", zzbiy.zzg);
                zzblxVar.zzq("/result", zzbiy.zzo);
                this.zzb.zzi(this.zzc);
                this.zzd.zzh = this.zzb;
                J.k("Successfully loaded JS Engine.");
                J.k("loadJavascriptEngine > /jsLoaded handler: Lock released");
                return;
            }
            J.k("loadJavascriptEngine > /jsLoaded handler: Lock released, the promise is already settled");
        }
    }
}
