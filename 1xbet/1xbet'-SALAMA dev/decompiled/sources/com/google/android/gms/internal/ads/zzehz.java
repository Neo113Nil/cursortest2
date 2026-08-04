package com.google.android.gms.internal.ads;

import E2.o;
import F2.C0254t;
import I2.J;
import I2.L;
import I2.M;
import android.os.Bundle;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class zzehz {
    private final Map zza = new HashMap();
    private final Map zzb = new HashMap();
    private final Map zzc = new HashMap();
    private final Map zzd = new HashMap();
    private final Map zze = new HashMap();
    private final Executor zzf;
    private JSONObject zzg;

    public zzehz(Executor executor) {
        this.zzf = executor;
    }

    private final synchronized zzfwk zzh(String str) {
        HashMap map;
        try {
            if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(((M) o.f1952C.f1961g.zzi()).n().zzc())) {
                zzbbp zzbbpVar = zzbby.zzds;
                C0254t c0254t = C0254t.f2723d;
                boolean zMatches = Pattern.matches((String) c0254t.f2726c.zzb(zzbbpVar), str);
                boolean zMatches2 = Pattern.matches((String) c0254t.f2726c.zzb(zzbby.zzdt), str);
                if (zMatches) {
                    map = new HashMap(this.zze);
                } else if (zMatches2) {
                    map = new HashMap(this.zzd);
                }
                return zzfwk.zzc(map);
            }
            return zzfwk.zzd();
        } catch (Throwable th) {
            throw th;
        }
    }

    private final synchronized List zzi(JSONObject jSONObject, String str) {
        ArrayList arrayList;
        try {
            arrayList = new ArrayList();
            if (jSONObject != null) {
                Bundle bundleZzo = zzo(jSONObject.optJSONObject("data"));
                JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("rtb_adapters");
                if (jSONArrayOptJSONArray != null) {
                    ArrayList arrayList2 = new ArrayList();
                    for (int i7 = 0; i7 < jSONArrayOptJSONArray.length(); i7++) {
                        String strOptString = jSONArrayOptJSONArray.optString(i7, "");
                        if (!TextUtils.isEmpty(strOptString)) {
                            arrayList2.add(strOptString);
                        }
                    }
                    int size = arrayList2.size();
                    for (int i8 = 0; i8 < size; i8++) {
                        String str2 = (String) arrayList2.get(i8);
                        zzg(str2);
                        if (((zzeib) this.zza.get(str2)) != null) {
                            arrayList.add(new zzeib(str2, str, bundleZzo));
                        }
                    }
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized void zzj() {
        this.zzb.clear();
        this.zza.clear();
        this.zze.clear();
        this.zzd.clear();
        zzm();
        zzn();
        zzk();
    }

    private final synchronized void zzk() {
        JSONObject jSONObjectZzf;
        try {
            if (!((Boolean) zzbee.zzb.zze()).booleanValue()) {
                if (((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zzbX)).booleanValue() && (jSONObjectZzf = ((M) o.f1952C.f1961g.zzi()).n().zzf()) != null) {
                    try {
                        JSONArray jSONArray = jSONObjectZzf.getJSONArray("adapter_settings");
                        for (int i7 = 0; i7 < jSONArray.length(); i7++) {
                            JSONObject jSONObject = jSONArray.getJSONObject(i7);
                            String strOptString = jSONObject.optString("adapter_class_name");
                            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("permission_set");
                            if (!TextUtils.isEmpty(strOptString) && jSONArrayOptJSONArray != null) {
                                for (int i8 = 0; i8 < jSONArrayOptJSONArray.length(); i8++) {
                                    JSONObject jSONObject2 = jSONArrayOptJSONArray.getJSONObject(i8);
                                    boolean zOptBoolean = jSONObject2.optBoolean("enable_rendering", false);
                                    boolean zOptBoolean2 = jSONObject2.optBoolean("collect_secure_signals", false);
                                    boolean zOptBoolean3 = jSONObject2.optBoolean("collect_secure_signals_on_full_app", false);
                                    String strOptString2 = jSONObject2.optString("platform");
                                    zzeid zzeidVar = new zzeid(strOptString, zOptBoolean2, zOptBoolean, zOptBoolean3, new Bundle());
                                    if (strOptString2.equals("ADMOB")) {
                                        this.zzd.put(strOptString, zzeidVar);
                                    } else if (strOptString2.equals("AD_MANAGER")) {
                                        this.zze.put(strOptString, zzeidVar);
                                    }
                                }
                            }
                        }
                    } catch (JSONException e7) {
                        J.l("Malformed config loading JSON.", e7);
                    }
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    private final synchronized void zzl(String str, String str2, List list) {
        try {
            if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
                return;
            }
            Map map = (Map) this.zzc.get(str);
            if (map == null) {
                map = new HashMap();
            }
            this.zzc.put(str, map);
            List arrayList = (List) map.get(str2);
            if (arrayList == null) {
                arrayList = new ArrayList();
            }
            arrayList.addAll(list);
            map.put(str2, arrayList);
        } catch (Throwable th) {
            throw th;
        }
    }

    private final synchronized void zzm() {
        JSONArray jSONArrayOptJSONArray;
        try {
            JSONObject jSONObjectZzf = ((M) o.f1952C.f1961g.zzi()).n().zzf();
            if (jSONObjectZzf != null) {
                try {
                    JSONArray jSONArrayOptJSONArray2 = jSONObjectZzf.optJSONArray("ad_unit_id_settings");
                    this.zzg = jSONObjectZzf.optJSONObject("ad_unit_patterns");
                    if (jSONArrayOptJSONArray2 != null) {
                        for (int i7 = 0; i7 < jSONArrayOptJSONArray2.length(); i7++) {
                            JSONObject jSONObject = jSONArrayOptJSONArray2.getJSONObject(i7);
                            String lowerCase = ((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zzkT)).booleanValue() ? jSONObject.optString("ad_unit_id", "").toLowerCase(Locale.ROOT) : jSONObject.optString("ad_unit_id", "");
                            String strOptString = jSONObject.optString("format", "");
                            ArrayList arrayList = new ArrayList();
                            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("mediation_config");
                            if (jSONObjectOptJSONObject != null && (jSONArrayOptJSONArray = jSONObjectOptJSONObject.optJSONArray("ad_networks")) != null) {
                                for (int i8 = 0; i8 < jSONArrayOptJSONArray.length(); i8++) {
                                    arrayList.addAll(zzi(jSONArrayOptJSONArray.getJSONObject(i8), strOptString));
                                }
                            }
                            zzl(strOptString, lowerCase, arrayList);
                        }
                    }
                } catch (JSONException e7) {
                    J.l("Malformed config loading JSON.", e7);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    private final synchronized void zzn() {
        JSONObject jSONObjectZzf;
        if (!((Boolean) zzbee.zze.zze()).booleanValue()) {
            if (((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zzbW)).booleanValue() && (jSONObjectZzf = ((M) o.f1952C.f1961g.zzi()).n().zzf()) != null) {
                try {
                    JSONArray jSONArray = jSONObjectZzf.getJSONArray("signal_adapters");
                    for (int i7 = 0; i7 < jSONArray.length(); i7++) {
                        JSONObject jSONObject = jSONArray.getJSONObject(i7);
                        Bundle bundleZzo = zzo(jSONObject.optJSONObject("data"));
                        String strOptString = jSONObject.optString("adapter_class_name");
                        boolean zOptBoolean = jSONObject.optBoolean("render", false);
                        boolean zOptBoolean2 = jSONObject.optBoolean("collect_signals", false);
                        if (!TextUtils.isEmpty(strOptString)) {
                            this.zzb.put(strOptString, new zzeid(strOptString, zOptBoolean2, zOptBoolean, true, bundleZzo));
                        }
                    }
                } catch (JSONException e7) {
                    J.l("Malformed config loading JSON.", e7);
                }
            }
        }
    }

    private static final Bundle zzo(JSONObject jSONObject) {
        Bundle bundle = new Bundle();
        if (jSONObject != null) {
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                bundle.putString(next, jSONObject.optString(next, ""));
            }
        }
        return bundle;
    }

    public final synchronized Map zza(String str, String str2) {
        HashMap map;
        try {
            Map mapZzb = zzb(str, str2);
            zzfwk zzfwkVarZzh = zzh(str2);
            map = new HashMap();
            for (Map.Entry entry : ((zzfwk) mapZzb).entrySet()) {
                String str3 = (String) entry.getKey();
                if (zzfwkVarZzh.containsKey(str3)) {
                    zzeid zzeidVar = (zzeid) zzfwkVarZzh.get(str3);
                    List list = (List) entry.getValue();
                    map.put(str3, new zzeid(str3, zzeidVar.zzb, zzeidVar.zzc, zzeidVar.zzd, (list == null || list.isEmpty()) ? new Bundle() : (Bundle) list.get(0)));
                }
            }
            zzfyn zzfynVarZze = zzfwkVarZzh.entrySet().iterator();
            while (zzfynVarZze.hasNext()) {
                Map.Entry entry2 = (Map.Entry) zzfynVarZze.next();
                String str4 = (String) entry2.getKey();
                if (!map.containsKey(str4) && ((zzeid) entry2.getValue()).zzd) {
                    map.put(str4, (zzeid) entry2.getValue());
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return map;
    }

    public final synchronized Map zzb(String str, String str2) {
        Map map;
        try {
            if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2) && !TextUtils.isEmpty(((M) o.f1952C.f1961g.zzi()).n().zzc()) && (map = (Map) this.zzc.get(str)) != null) {
                List<zzeib> list = (List) map.get(str2);
                if (list == null) {
                    String strZza = zzdon.zza(this.zzg, str2, str);
                    if (((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zzkT)).booleanValue()) {
                        strZza = strZza.toLowerCase(Locale.ROOT);
                    }
                    list = (List) map.get(strZza);
                }
                if (list != null) {
                    HashMap map2 = new HashMap();
                    for (zzeib zzeibVar : list) {
                        String str3 = zzeibVar.zza;
                        if (!map2.containsKey(str3)) {
                            map2.put(str3, new ArrayList());
                        }
                        ((List) map2.get(str3)).add(zzeibVar.zzb);
                    }
                    return zzfwk.zzc(map2);
                }
            }
            return zzfwk.zzd();
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized Map zzc() {
        if (TextUtils.isEmpty(((M) o.f1952C.f1961g.zzi()).n().zzc())) {
            return zzfwk.zzd();
        }
        return zzfwk.zzc(this.zzb);
    }

    public final void zzf() {
        L lZzi = o.f1952C.f1961g.zzi();
        ((M) lZzi).f3553c.add(new Runnable() { // from class: com.google.android.gms.internal.ads.zzehy
            @Override // java.lang.Runnable
            public final void run() {
                zzehz zzehzVar = this.zza;
                zzehzVar.zzf.execute(new zzehx(zzehzVar));
            }
        });
        this.zzf.execute(new zzehx(this));
    }

    public final synchronized void zzg(String str) {
        if (!TextUtils.isEmpty(str) && !this.zza.containsKey(str)) {
            this.zza.put(str, new zzeib(str, "", new Bundle()));
        }
    }
}
