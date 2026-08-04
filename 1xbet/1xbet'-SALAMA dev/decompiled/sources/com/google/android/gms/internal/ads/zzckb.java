package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class zzckb {
    private final Map zza;
    private final Map zzb;

    public zzckb(Map map, Map map2) {
        this.zza = map;
        this.zzb = map2;
    }

    public final void zza(zzfar zzfarVar) {
        for (zzfap zzfapVar : zzfarVar.zzb.zzc) {
            if (this.zza.containsKey(zzfapVar.zza) && zzfapVar.zzb != null) {
                ((zzcke) this.zza.get(zzfapVar.zza)).zza(zzfapVar.zzb);
            } else if (this.zzb.containsKey(zzfapVar.zza) && zzfapVar.zzb != null) {
                zzckd zzckdVar = (zzckd) this.zzb.get(zzfapVar.zza);
                JSONObject jSONObject = zzfapVar.zzb;
                HashMap map = new HashMap();
                Iterator<String> itKeys = jSONObject.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    String strOptString = jSONObject.optString(next);
                    if (strOptString != null) {
                        map.put(next, strOptString);
                    }
                }
                zzckdVar.zza(map);
            }
        }
    }
}
