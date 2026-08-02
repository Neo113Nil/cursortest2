package com.google.android.gms.internal.ads;

import I2.J;
import J2.j;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
final class zzayo implements Runnable {
    final /* synthetic */ zzayp zza;

    public zzayo(zzayp zzaypVar) {
        this.zza = zzaypVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        boolean z4;
        boolean z7;
        List list;
        obj = this.zza.zzc;
        synchronized (obj) {
            zzayp zzaypVar = this.zza;
            z4 = zzaypVar.zzd;
            if (z4) {
                z7 = zzaypVar.zze;
                if (z7) {
                    zzaypVar.zzd = false;
                    int i7 = J.f3546b;
                    j.b("App went background");
                    list = this.zza.zzf;
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        try {
                            ((zzayq) it.next()).zza(false);
                        } catch (Exception e7) {
                            j.e("", e7);
                        }
                    }
                }
            }
            int i8 = J.f3546b;
            j.b("App is still foreground");
        }
    }
}
