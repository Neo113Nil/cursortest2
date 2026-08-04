package com.google.android.gms.internal.ads;

import E2.o;
import H2.q;
import H2.r;
import android.content.Context;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
final class zzbig implements zzbiz {
    @Override // com.google.android.gms.internal.ads.zzbiz
    public final void zza(Object obj, Map map) {
        zzceb zzcebVar = (zzceb) obj;
        r rVar = o.f1952C.f1971r;
        Context context = zzcebVar.getContext();
        synchronized (rVar) {
            rVar.f3294e = zzcebVar;
            if (!rVar.i(context)) {
                rVar.g("Unable to bind", "on_play_store_bind");
                return;
            }
            HashMap map2 = new HashMap();
            map2.put("action", "fetch_completed");
            zzbza.zzf.execute(new q(rVar, "on_play_store_bind", map2, 0));
        }
    }
}
