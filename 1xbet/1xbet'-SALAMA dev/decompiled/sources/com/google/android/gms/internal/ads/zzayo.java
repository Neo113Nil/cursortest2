package com.google.android.gms.internal.ads;

import I2.J;
import J2.j;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
final class zzayo implements Runnable {
    final /* synthetic */ zzayp zza;

    public zzayo(zzayp zzaypVar) {
        this.zza = zzaypVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.zza.zzc) {
            zzayp zzaypVar = this.zza;
            if (zzaypVar.zzd && zzaypVar.zze) {
                zzaypVar.zzd = false;
                int i7 = J.f3546b;
                j.b("App went background");
                Iterator it = this.zza.zzf.iterator();
                while (it.hasNext()) {
                    try {
                        ((zzayq) it.next()).zza(false);
                    } catch (Exception e7) {
                        j.e("", e7);
                    }
                }
            } else {
                int i8 = J.f3546b;
                j.b("App is still foreground");
            }
        }
    }
}
