package com.google.android.gms.internal.ads;

import E2.o;
import H2.q;
import H2.r;
import I2.J;
import R4.c;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
final class zzbii implements zzbiz {
    @Override // com.google.android.gms.internal.ads.zzbiz
    public final void zza(Object obj, Map map) {
        zzfqy zzfqyVar;
        r rVar = o.f1952C.f1971r;
        if (!rVar.f3293d || (zzfqyVar = (zzfqy) rVar.f3295f) == null) {
            J.k("LastMileDelivery not connected");
        } else {
            zzfqyVar.zzc(rVar.j(), (c) rVar.f3296g);
            zzbza.zzf.execute(new q(rVar, "onLMDOverlayExpand", new HashMap(), 0));
        }
    }
}
