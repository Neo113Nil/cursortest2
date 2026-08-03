package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzcrr {
    private final java.util.Map zza;
    private final java.util.Map zzb;

    zzcrr(java.util.Map map, java.util.Map map2) {
        this.zza = map;
        this.zzb = map2;
    }

    public final void zza(com.google.android.gms.internal.ads.zzfkq zzfkqVar) throws java.lang.Exception {
        org.json.JSONObject jSONObject;
        org.json.JSONObject jSONObject2;
        for (com.google.android.gms.internal.ads.zzfko zzfkoVar : zzfkqVar.zzb.zzc) {
            java.util.Map map = this.zza;
            java.lang.String str = zzfkoVar.zza;
            if (!map.containsKey(str) || (jSONObject2 = zzfkoVar.zzb) == null) {
                java.util.Map map2 = this.zzb;
                if (map2.containsKey(str) && (jSONObject = zzfkoVar.zzb) != null) {
                    com.google.android.gms.internal.ads.zzcrt zzcrtVar = (com.google.android.gms.internal.ads.zzcrt) map2.get(str);
                    java.util.HashMap hashMap = new java.util.HashMap();
                    java.util.Iterator<java.lang.String> keys = jSONObject.keys();
                    while (keys.hasNext()) {
                        java.lang.String next = keys.next();
                        java.lang.String optString = jSONObject.optString(next);
                        if (optString != null) {
                            hashMap.put(next, optString);
                        }
                    }
                    zzcrtVar.zza(hashMap);
                }
            } else {
                ((com.google.android.gms.internal.ads.zzcru) map.get(str)).zza(jSONObject2);
            }
        }
    }
}
