package com.google.android.gms.internal.ads;

import E2.o;
import F2.C0254t;
import I2.J;
import java.util.ArrayList;
import java.util.Objects;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes.dex */
final class zzbmq implements Runnable {
    final /* synthetic */ zzbnb zza;
    final /* synthetic */ zzblx zzb;
    final /* synthetic */ ArrayList zzc;
    final /* synthetic */ long zzd;
    final /* synthetic */ zzbnc zze;

    public zzbmq(zzbnc zzbncVar, zzbnb zzbnbVar, zzblx zzblxVar, ArrayList arrayList, long j) {
        this.zza = zzbnbVar;
        this.zzb = zzblxVar;
        this.zzc = arrayList;
        this.zzd = j;
        this.zze = zzbncVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        J.k("loadJavascriptEngine > ADMOB_UI_HANDLER.postDelayed: Trying to acquire lock");
        synchronized (this.zze.zza) {
            try {
                J.k("loadJavascriptEngine > ADMOB_UI_HANDLER.postDelayed: Lock acquired");
                if (this.zza.zze() != -1 && this.zza.zze() != 1) {
                    zzbbp zzbbpVar = zzbby.zzhI;
                    C0254t c0254t = C0254t.f2723d;
                    if (((Boolean) c0254t.f2726c.zzb(zzbbpVar)).booleanValue()) {
                        this.zza.zzh(new TimeoutException("Unable to fully load JS engine."), "SdkJavascriptFactory.loadJavascriptEngine.Runnable");
                    } else {
                        this.zza.zzg();
                    }
                    zzgbn zzgbnVar = zzbza.zzf;
                    final zzblx zzblxVar = this.zzb;
                    Objects.requireNonNull(zzblxVar);
                    zzgbnVar.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzbmp
                        @Override // java.lang.Runnable
                        public final void run() {
                            zzblxVar.zzc();
                        }
                    });
                    String strValueOf = String.valueOf(c0254t.f2726c.zzb(zzbby.zzc));
                    int iZze = this.zza.zze();
                    int i7 = this.zze.zzi;
                    String strConcat = this.zzc.isEmpty() ? ". Still waiting for the engine to be loaded" : ". While waiting for the /jsLoaded gmsg, observed the loadNewJavascriptEngine latency is ".concat(String.valueOf(this.zzc.get(0)));
                    o.f1952C.j.getClass();
                    J.k("Could not finish the full JS engine loading in " + strValueOf + " ms. JS engine session reference status(fullLoadTimeout) is " + iZze + ". Update status(fullLoadTimeout) is " + i7 + strConcat + " ms. Total latency(fullLoadTimeout) is " + (System.currentTimeMillis() - this.zzd) + " ms at timeout. Rejecting.");
                    J.k("loadJavascriptEngine > ADMOB_UI_HANDLER.postDelayed: Lock released");
                    return;
                }
                J.k("loadJavascriptEngine > ADMOB_UI_HANDLER.postDelayed: Lock released, the promise is already settled");
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
