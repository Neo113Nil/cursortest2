package com.google.android.gms.internal.firebase_database;

import java.util.Map;

/* loaded from: classes.dex */
final class zzdr implements Runnable {
    private final /* synthetic */ zzbz zzkd;
    private final /* synthetic */ zzdo zzke;

    zzdr(zzdo zzdoVar, zzbz zzbzVar) {
        this.zzke = zzdoVar;
        this.zzkd = zzbzVar;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // java.lang.Runnable
    public final void run() {
        Map map;
        Map map2;
        Map map3;
        boolean z;
        map = this.zzke.zzkc;
        synchronized (map) {
            map2 = this.zzke.zzkc;
            if (map2.containsKey(this.zzkd)) {
                map3 = this.zzke.zzkc;
                loop0: while (true) {
                    for (zzck zzckVar : ((Map) map3.get(this.zzkd)).values()) {
                        zzckVar.interrupt();
                        z = z && !zzckVar.zzcd();
                    }
                }
                if (z) {
                    this.zzkd.stop();
                }
            }
        }
    }
}
