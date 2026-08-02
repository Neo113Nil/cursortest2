package com.google.android.gms.internal.ads;

import E2.o;
import I2.J;
import J2.j;
import android.content.Context;
import java.util.Map;

/* loaded from: classes.dex */
public final class zzbjf implements zzbiz {
    private final Context zza;
    private final Map zzb;

    public zzbjf(Context context, Map map) {
        this.zza = context;
        this.zzb = map;
    }

    @Override // com.google.android.gms.internal.ads.zzbiz
    public final void zza(Object obj, Map map) {
        char c3;
        o oVar = o.f1952C;
        if (oVar.f1978y.zzp(this.zza)) {
            String str = (String) map.get("eventName");
            String str2 = (String) map.get("eventId");
            int hashCode = str.hashCode();
            if (hashCode == 94399) {
                if (str.equals("_aa")) {
                    c3 = 2;
                }
                c3 = 65535;
            } else if (hashCode != 94401) {
                if (hashCode == 94407 && str.equals("_ai")) {
                    c3 = 1;
                }
                c3 = 65535;
            } else {
                if (str.equals("_ac")) {
                    c3 = 0;
                }
                c3 = 65535;
            }
            if (c3 == 0) {
                oVar.f1978y.zzj(this.zza, str2, (Map) this.zzb.get("_ac"));
            } else if (c3 == 1) {
                oVar.f1978y.zzk(this.zza, str2, (Map) this.zzb.get("_ai"));
            } else if (c3 != 2) {
                int i7 = J.f3546b;
                j.d("logScionEvent gmsg contained unsupported eventName");
            } else {
                oVar.f1978y.zzh(this.zza, str2);
            }
        }
    }
}
