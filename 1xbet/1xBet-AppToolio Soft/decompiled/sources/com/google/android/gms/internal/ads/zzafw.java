package com.google.android.gms.internal.ads;

import java.util.Map;

/* loaded from: classes.dex */
final class zzafw implements com.google.android.gms.ads.internal.gmsg.zzv<Object> {
    private final /* synthetic */ zzaft zzchv;

    zzafw(zzaft zzaftVar) {
        this.zzchv = zzaftVar;
    }

    @Override // com.google.android.gms.ads.internal.gmsg.zzv
    public final void zza(Object obj, Map<String, String> map) {
        Object obj2;
        zzaoj zzaojVar;
        String str;
        zzaoj zzaojVar2;
        obj2 = this.zzchv.mLock;
        synchronized (obj2) {
            zzaojVar = this.zzchv.zzchr;
            if (zzaojVar.isDone()) {
                return;
            }
            zzafz zzafzVar = new zzafz(-2, map);
            str = this.zzchv.zzchp;
            if (str.equals(zzafzVar.zzol())) {
                zzaojVar2 = this.zzchv.zzchr;
                zzaojVar2.set(zzafzVar);
            }
        }
    }
}
