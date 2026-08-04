package com.google.android.gms.internal.ads;

import I2.C;
import I2.J;
import J2.j;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
final class zzbmo implements zzbiz {
    final /* synthetic */ zzblx zza;
    final /* synthetic */ C zzb;
    final /* synthetic */ zzbnc zzc;

    public zzbmo(zzbnc zzbncVar, zzauo zzauoVar, zzblx zzblxVar, C c3) {
        this.zza = zzblxVar;
        this.zzb = c3;
        this.zzc = zzbncVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbiz
    public final void zza(Object obj, Map map) {
        J.k("loadJavascriptEngine > /requestReload handler: Trying to acquire lock");
        synchronized (this.zzc.zza) {
            try {
                J.k("loadJavascriptEngine > /requestReload handler: Lock acquired");
                j.f("JS Engine is requesting an update");
                if (this.zzc.zzi == 0) {
                    j.f("Starting reload.");
                    this.zzc.zzi = 2;
                    this.zzc.zzd(null);
                }
                this.zza.zzr("/requestReload", (zzbiz) this.zzb.f3528a);
            } catch (Throwable th) {
                throw th;
            }
        }
        J.k("loadJavascriptEngine > /requestReload handler: Lock released");
    }
}
