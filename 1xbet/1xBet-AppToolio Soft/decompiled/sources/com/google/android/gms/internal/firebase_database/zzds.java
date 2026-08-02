package com.google.android.gms.internal.firebase_database;

import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
final class zzds implements Runnable {
    private final /* synthetic */ zzbz zzkd;
    private final /* synthetic */ zzdo zzke;

    zzds(zzdo zzdoVar, zzbz zzbzVar) {
        this.zzke = zzdoVar;
        this.zzkd = zzbzVar;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // java.lang.Runnable
    public final void run() {
        Map map;
        Map map2;
        Map map3;
        map = this.zzke.zzkc;
        synchronized (map) {
            map2 = this.zzke.zzkc;
            if (map2.containsKey(this.zzkd)) {
                map3 = this.zzke.zzkc;
                Iterator it = ((Map) map3.get(this.zzkd)).values().iterator();
                while (it.hasNext()) {
                    ((zzck) it.next()).resume();
                }
            }
        }
    }
}
