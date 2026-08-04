package com.google.android.gms.internal.ads;

import E2.o;
import I2.J;
import J2.j;
import android.content.Context;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class zzbjf implements zzbiz {
    private final Context zza;
    private final Map zzb;

    public zzbjf(Context context, Map map) {
        this.zza = context;
        this.zzb = map;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0051  */
    @Override // com.google.android.gms.internal.ads.zzbiz
    public final void zza(Object obj, Map map) {
        byte b7;
        o oVar = o.f1952C;
        if (oVar.f1978y.zzp(this.zza)) {
            String str = (String) map.get("eventName");
            String str2 = (String) map.get("eventId");
            int iHashCode = str.hashCode();
            if (iHashCode != 94399) {
                if (iHashCode != 94401) {
                    if (iHashCode == 94407 && str.equals("_ai")) {
                        b7 = 1;
                    } else {
                        b7 = -1;
                    }
                } else if (str.equals("_ac")) {
                    b7 = 0;
                } else {
                    b7 = -1;
                }
            } else if (str.equals("_aa")) {
                b7 = 2;
            } else {
                b7 = -1;
            }
            if (b7 == 0) {
                oVar.f1978y.zzj(this.zza, str2, (Map) this.zzb.get("_ac"));
            } else if (b7 == 1) {
                oVar.f1978y.zzk(this.zza, str2, (Map) this.zzb.get("_ai"));
            } else if (b7 != 2) {
                int i7 = J.f3546b;
                j.d("logScionEvent gmsg contained unsupported eventName");
            } else {
                oVar.f1978y.zzh(this.zza, str2);
            }
        }
    }
}
