package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes.dex */
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
                HashMap hashMap = new HashMap();
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    String optString = jSONObject.optString(next);
                    if (optString != null) {
                        hashMap.put(next, optString);
                    }
                }
                zzckdVar.zza(hashMap);
            }
        }
    }
}
