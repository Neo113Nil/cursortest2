package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
public final class zzeqv implements zzems {
    private final Map zza = new HashMap();
    private final zzdya zzb;

    public zzeqv(zzdya zzdyaVar) {
        this.zzb = zzdyaVar;
    }

    @Override // com.google.android.gms.internal.ads.zzems
    public final zzemt zza(String str, JSONObject jSONObject) throws zzfmd {
        zzemt zzemtVar;
        synchronized (this) {
            Map map = this.zza;
            zzemtVar = (zzemt) map.get(str);
            if (zzemtVar == null) {
                zzemtVar = new zzemt(this.zzb.zza(str, jSONObject), new zzeog(), str);
                map.put(str, zzemtVar);
            }
        }
        return zzemtVar;
    }
}
