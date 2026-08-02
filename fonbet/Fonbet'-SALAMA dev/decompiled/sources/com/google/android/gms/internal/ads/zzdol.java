package com.google.android.gms.internal.ads;

import E2.o;
import F2.C0254t;
import I2.L;
import I2.M;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class zzdol {
    private JSONObject zzb;
    private final Executor zzc;
    private boolean zzd;
    private JSONObject zze;
    private final Map zza = new ConcurrentHashMap();
    private final AtomicBoolean zzf = new AtomicBoolean(false);

    public zzdol(Executor executor) {
        this.zzc = executor;
    }

    private final void zzg() {
        if (this.zzf.getAndSet(true)) {
            return;
        }
        L zzi = o.f1952C.f1961g.zzi();
        ((M) zzi).f3553c.add(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdoj
            @Override // java.lang.Runnable
            public final void run() {
                r0.zzc.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdok
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzdol.this.zzh();
                    }
                });
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized void zzh() {
        JSONObject zzf;
        Map map;
        try {
            this.zzd = true;
            zzbyk n2 = ((M) o.f1952C.f1961g.zzi()).n();
            if (n2 != null && (zzf = n2.zzf()) != null) {
                this.zzb = ((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zzek)).booleanValue() ? zzf.optJSONObject("common_settings") : null;
                this.zze = zzf.optJSONObject("ad_unit_patterns");
                JSONArray optJSONArray = zzf.optJSONArray("ad_unit_id_settings");
                if (optJSONArray != null) {
                    for (int i7 = 0; i7 < optJSONArray.length(); i7++) {
                        JSONObject optJSONObject = optJSONArray.optJSONObject(i7);
                        if (optJSONObject != null) {
                            String optString = optJSONObject.optString("ad_unit_id");
                            String optString2 = optJSONObject.optString("format");
                            JSONObject optJSONObject2 = optJSONObject.optJSONObject("request_signals");
                            if (optString != null && optJSONObject2 != null && optString2 != null) {
                                if (this.zza.containsKey(optString2)) {
                                    map = (Map) this.zza.get(optString2);
                                } else {
                                    ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
                                    this.zza.put(optString2, concurrentHashMap);
                                    map = concurrentHashMap;
                                }
                                map.put(optString, optJSONObject2);
                            }
                        }
                    }
                }
            }
        } finally {
        }
    }

    public final JSONObject zza() {
        if (((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zzek)).booleanValue()) {
            return this.zzb;
        }
        return null;
    }

    public final JSONObject zzb(String str, String str2) {
        zzbbp zzbbpVar = zzbby.zzei;
        C0254t c0254t = C0254t.f2723d;
        if (!((Boolean) c0254t.f2726c.zzb(zzbbpVar)).booleanValue() || str == null || str2 == null) {
            return null;
        }
        if (!this.zzd) {
            zzh();
            if (((Boolean) c0254t.f2726c.zzb(zzbby.zzej)).booleanValue()) {
                zzg();
            }
        }
        Map map = (Map) this.zza.get(str2);
        if (map == null) {
            return null;
        }
        JSONObject jSONObject = (JSONObject) map.get(str);
        if (jSONObject != null) {
            return jSONObject;
        }
        String zza = zzdon.zza(this.zze, str, str2);
        if (zza != null) {
            return (JSONObject) map.get(zza);
        }
        return null;
    }

    public final void zzf() {
        zzg();
        this.zzc.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdoi
            @Override // java.lang.Runnable
            public final void run() {
                zzdol.this.zzh();
            }
        });
    }
}
