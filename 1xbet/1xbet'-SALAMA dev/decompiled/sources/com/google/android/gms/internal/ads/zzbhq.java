package com.google.android.gms.internal.ads;

import I2.J;
import J2.j;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class zzbhq implements zzbiz {
    private final zzbhr zza;

    public zzbhq(zzbhr zzbhrVar) {
        this.zza = zzbhrVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbiz
    public final void zza(Object obj, Map map) {
        String str = (String) map.get("name");
        if (str != null) {
            this.zza.zzb(str, (String) map.get("info"));
        } else {
            int i7 = J.f3546b;
            j.g("App event with no name parameter.");
        }
    }
}
