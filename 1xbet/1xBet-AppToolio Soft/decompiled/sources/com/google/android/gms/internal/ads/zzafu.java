package com.google.android.gms.internal.ads;

import java.util.Map;

/* loaded from: classes.dex */
final class zzafu implements com.google.android.gms.ads.internal.gmsg.zzv<Object> {
    private final /* synthetic */ zzaft zzchv;

    zzafu(zzaft zzaftVar) {
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
            str = this.zzchv.zzchp;
            if (str.equals(map.get("request_id"))) {
                zzafz zzafzVar = new zzafz(1, map);
                String type = zzafzVar.getType();
                String valueOf = String.valueOf(zzafzVar.zzoh());
                StringBuilder sb = new StringBuilder(String.valueOf(type).length() + 24 + String.valueOf(valueOf).length());
                sb.append("Invalid ");
                sb.append(type);
                sb.append(" request error: ");
                sb.append(valueOf);
                zzakb.zzdk(sb.toString());
                zzaojVar2 = this.zzchv.zzchr;
                zzaojVar2.set(zzafzVar);
            }
        }
    }
}
