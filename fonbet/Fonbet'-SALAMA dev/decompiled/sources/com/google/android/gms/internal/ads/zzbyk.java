package com.google.android.gms.internal.ads;

import E2.o;
import F2.C0254t;
import I2.J;
import J2.j;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class zzbyk {
    private String zzd;
    private String zze;
    private long zzf;
    private JSONObject zzg;
    private boolean zzh;
    private boolean zzj;
    private final List zza = new ArrayList();
    private final List zzb = new ArrayList();
    private final Map zzc = new HashMap();
    private final List zzi = new ArrayList();

    public zzbyk(String str, long j) {
        JSONObject optJSONObject;
        JSONObject optJSONObject2;
        JSONArray optJSONArray;
        JSONObject optJSONObject3;
        this.zzd = "";
        this.zzh = false;
        this.zzj = false;
        this.zze = str;
        this.zzf = j;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            this.zzg = new JSONObject(str);
            if (((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zzlF)).booleanValue() && zzj()) {
                return;
            }
            if (this.zzg.optInt("status", -1) != 1) {
                this.zzh = false;
                int i7 = J.f3546b;
                j.g("App settings could not be fetched successfully.");
                return;
            }
            this.zzh = true;
            this.zzd = this.zzg.optString("app_id");
            JSONArray optJSONArray2 = this.zzg.optJSONArray("ad_unit_id_settings");
            if (optJSONArray2 != null) {
                for (int i8 = 0; i8 < optJSONArray2.length(); i8++) {
                    JSONObject jSONObject = optJSONArray2.getJSONObject(i8);
                    String optString = jSONObject.optString("format");
                    String optString2 = jSONObject.optString("ad_unit_id");
                    if (!TextUtils.isEmpty(optString) && !TextUtils.isEmpty(optString2)) {
                        if ("interstitial".equalsIgnoreCase(optString)) {
                            this.zzb.add(optString2);
                        } else if (("rewarded".equalsIgnoreCase(optString) || "rewarded_interstitial".equals(optString)) && (optJSONObject3 = jSONObject.optJSONObject("mediation_config")) != null) {
                            this.zzc.put(optString2, new zzboi(optJSONObject3));
                        }
                    }
                }
            }
            JSONArray optJSONArray3 = this.zzg.optJSONArray("persistable_banner_ad_unit_ids");
            if (optJSONArray3 != null) {
                for (int i9 = 0; i9 < optJSONArray3.length(); i9++) {
                    this.zza.add(optJSONArray3.optString(i9));
                }
            }
            if (((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zzgN)).booleanValue() && (optJSONObject2 = this.zzg.optJSONObject("common_settings")) != null && (optJSONArray = optJSONObject2.optJSONArray("loeid")) != null) {
                for (int i10 = 0; i10 < optJSONArray.length(); i10++) {
                    this.zzi.add(optJSONArray.get(i10).toString());
                }
            }
            if (!((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zzgj)).booleanValue() || (optJSONObject = this.zzg.optJSONObject("common_settings")) == null) {
                return;
            }
            this.zzj = optJSONObject.optBoolean("is_prefetching_enabled", false);
        } catch (JSONException e7) {
            int i11 = J.f3546b;
            j.h("Exception occurred while processing app setting json", e7);
            o.f1952C.f1961g.zzw(e7, "AppSettings.parseAppSettingsJson");
        }
    }

    public final long zza() {
        return this.zzf;
    }

    public final String zzb() {
        return this.zzd;
    }

    public final String zzc() {
        return this.zze;
    }

    public final List zzd() {
        return this.zzi;
    }

    public final Map zze() {
        return this.zzc;
    }

    public final JSONObject zzf() {
        return this.zzg;
    }

    public final void zzg(long j) {
        this.zzf = j;
    }

    public final boolean zzh() {
        return this.zzj;
    }

    public final boolean zzi() {
        return this.zzh;
    }

    public final boolean zzj() {
        if (!TextUtils.isEmpty(this.zze) && this.zzg != null) {
            zzbbp zzbbpVar = zzbby.zzlI;
            C0254t c0254t = C0254t.f2723d;
            long longValue = ((Long) c0254t.f2726c.zzb(zzbbpVar)).longValue();
            zzbbp zzbbpVar2 = zzbby.zzlH;
            zzbbw zzbbwVar = c0254t.f2726c;
            if (((Boolean) zzbbwVar.zzb(zzbbpVar2)).booleanValue() && !TextUtils.isEmpty(this.zze)) {
                longValue = this.zzg.optLong("cache_ttl_sec", ((Long) zzbbwVar.zzb(zzbbpVar)).longValue());
            }
            o.f1952C.j.getClass();
            long currentTimeMillis = System.currentTimeMillis();
            if (longValue >= 0) {
                long j = this.zzf;
                if (j > currentTimeMillis || TimeUnit.MILLISECONDS.toSeconds(currentTimeMillis - j) > longValue) {
                    this.zza.clear();
                    this.zzb.clear();
                    this.zzc.clear();
                    this.zzd = "";
                    this.zze = "";
                    this.zzg = null;
                    this.zzh = false;
                    this.zzi.clear();
                    this.zzj = false;
                    return true;
                }
            }
        }
        return false;
    }
}
