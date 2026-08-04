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

/* JADX INFO: loaded from: classes.dex */
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
        L lZzi = o.f1952C.f1961g.zzi();
        ((M) lZzi).f3553c.add(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdoj
            @Override // java.lang.Runnable
            public final void run() {
                zzdol zzdolVar = this.zza;
                zzdolVar.zzc.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdok
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzdolVar.zzh();
                    }
                });
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized void zzh() {
        JSONObject jSONObjectZzf;
        Map map;
        try {
            this.zzd = true;
            zzbyk zzbykVarN = ((M) o.f1952C.f1961g.zzi()).n();
            if (zzbykVarN != null && (jSONObjectZzf = zzbykVarN.zzf()) != null) {
                this.zzb = ((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zzek)).booleanValue() ? jSONObjectZzf.optJSONObject("common_settings") : null;
                this.zze = jSONObjectZzf.optJSONObject("ad_unit_patterns");
                JSONArray jSONArrayOptJSONArray = jSONObjectZzf.optJSONArray("ad_unit_id_settings");
                if (jSONArrayOptJSONArray != null) {
                    for (int i7 = 0; i7 < jSONArrayOptJSONArray.length(); i7++) {
                        JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i7);
                        if (jSONObjectOptJSONObject != null) {
                            String strOptString = jSONObjectOptJSONObject.optString("ad_unit_id");
                            String strOptString2 = jSONObjectOptJSONObject.optString("format");
                            JSONObject jSONObjectOptJSONObject2 = jSONObjectOptJSONObject.optJSONObject("request_signals");
                            if (strOptString != null && jSONObjectOptJSONObject2 != null && strOptString2 != null) {
                                if (this.zza.containsKey(strOptString2)) {
                                    map = (Map) this.zza.get(strOptString2);
                                } else {
                                    ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
                                    this.zza.put(strOptString2, concurrentHashMap);
                                    map = concurrentHashMap;
                                }
                                map.put(strOptString, jSONObjectOptJSONObject2);
                            }
                        }
                    }
                }
            }
        } catch (Throwable th) {
            throw th;
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
        String strZza = zzdon.zza(this.zze, str, str2);
        if (strZza != null) {
            return (JSONObject) map.get(strZza);
        }
        return null;
    }

    public final void zzf() {
        zzg();
        this.zzc.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdoi
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzh();
            }
        });
    }
}
