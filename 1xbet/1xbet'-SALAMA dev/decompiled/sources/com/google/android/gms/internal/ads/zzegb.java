package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class zzegb implements zzebt {
    private final Map zza = new HashMap();
    private final zzdog zzb;

    public zzegb(zzdog zzdogVar) {
        this.zzb = zzdogVar;
    }

    @Override // com.google.android.gms.internal.ads.zzebt
    public final zzebu zza(String str, JSONObject jSONObject) {
        zzebu zzebuVar;
        synchronized (this) {
            try {
                zzebuVar = (zzebu) this.zza.get(str);
                if (zzebuVar == null) {
                    zzebuVar = new zzebu(this.zzb.zzc(str, jSONObject), new zzedj(), str);
                    this.zza.put(str, zzebuVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzebuVar;
    }
}
