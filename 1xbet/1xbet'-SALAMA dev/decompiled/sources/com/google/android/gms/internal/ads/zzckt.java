package com.google.android.gms.internal.ads;

import E2.o;
import I2.L;
import I2.M;
import android.content.Context;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class zzckt implements zzckd {
    private final Context zza;
    private final L zzb = o.f1952C.f1961g.zzi();

    public zzckt(Context context) {
        this.zza = context;
    }

    @Override // com.google.android.gms.internal.ads.zzckd
    public final void zza(Map map) {
        String str;
        if (map.isEmpty() || (str = (String) map.get("gad_idless")) == null) {
            return;
        }
        L l7 = this.zzb;
        boolean z4 = Boolean.parseBoolean(str);
        ((M) l7).c(z4);
        if (z4) {
            Q0.a.m0(this.zza);
        }
    }
}
