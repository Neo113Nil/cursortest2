package com.google.android.gms.internal.ads;

import I2.C;
import I2.J;
import J2.j;
import java.util.Map;

/* loaded from: classes.dex */
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
        Object obj2;
        int i7;
        J.k("loadJavascriptEngine > /requestReload handler: Trying to acquire lock");
        obj2 = this.zzc.zza;
        synchronized (obj2) {
            try {
                J.k("loadJavascriptEngine > /requestReload handler: Lock acquired");
                j.f("JS Engine is requesting an update");
                i7 = this.zzc.zzi;
                if (i7 == 0) {
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
