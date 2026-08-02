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

/* loaded from: classes.dex */
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
        HashMap hashMap;
        try {
            if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(((M) o.f1952C.f1961g.zzi()).n().zzc())) {
                zzbbp zzbbpVar = zzbby.zzds;
                C0254t c0254t = C0254t.f2723d;
                boolean matches = Pattern.matches((String) c0254t.f2726c.zzb(zzbbpVar), str);
                boolean matches2 = Pattern.matches((String) c0254t.f2726c.zzb(zzbby.zzdt), str);
                if (matches) {
                    hashMap = new HashMap(this.zze);
                } else if (matches2) {
                    hashMap = new HashMap(this.zzd);
                }
                return zzfwk.zzc(hashMap);
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
                Bundle zzo = zzo(jSONObject.optJSONObject("data"));
                JSONArray optJSONArray = jSONObject.optJSONArray("rtb_adapters");
                if (optJSONArray != null) {
                    ArrayList arrayList2 = new ArrayList();
                    for (int i7 = 0; i7 < optJSONArray.length(); i7++) {
                        String optString = optJSONArray.optString(i7, "");
                        if (!TextUtils.isEmpty(optString)) {
                            arrayList2.add(optString);
                        }
                    }
                    int size = arrayList2.size();
                    for (int i8 = 0; i8 < size; i8++) {
                        String str2 = (String) arrayList2.get(i8);
                        zzg(str2);
                        if (((zzeib) this.zza.get(str2)) != null) {
                            arrayList.add(new zzeib(str2, str, zzo));
                        }
                    }
                }
            }
        } finally {
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
        JSONObject zzf;
        try {
            if (!((Boolean) zzbee.zzb.zze()).booleanValue()) {
                if (((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zzbX)).booleanValue() && (zzf = ((M) o.f1952C.f1961g.zzi()).n().zzf()) != null) {
                    JSONArray jSONArray = zzf.getJSONArray("adapter_settings");
                    for (int i7 = 0; i7 < jSONArray.length(); i7++) {
                        JSONObject jSONObject = jSONArray.getJSONObject(i7);
                        String optString = jSONObject.optString("adapter_class_name");
                        JSONArray optJSONArray = jSONObject.optJSONArray("permission_set");
                        if (!TextUtils.isEmpty(optString) && optJSONArray != null) {
                            for (int i8 = 0; i8 < optJSONArray.length(); i8++) {
                                JSONObject jSONObject2 = optJSONArray.getJSONObject(i8);
                                boolean optBoolean = jSONObject2.optBoolean("enable_rendering", false);
                                boolean optBoolean2 = jSONObject2.optBoolean("collect_secure_signals", false);
                                boolean optBoolean3 = jSONObject2.optBoolean("collect_secure_signals_on_full_app", false);
                                String optString2 = jSONObject2.optString("platform");
                                zzeid zzeidVar = new zzeid(optString, optBoolean2, optBoolean, optBoolean3, new Bundle());
                                if (optString2.equals("ADMOB")) {
                                    this.zzd.put(optString, zzeidVar);
                                } else if (optString2.equals("AD_MANAGER")) {
                                    this.zze.put(optString, zzeidVar);
                                }
                            }
                        }
                    }
                }
            }
        } catch (JSONException e7) {
            J.l("Malformed config loading JSON.", e7);
        } finally {
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
            List list2 = (List) map.get(str2);
            if (list2 == null) {
                list2 = new ArrayList();
            }
            list2.addAll(list);
            map.put(str2, list2);
        } catch (Throwable th) {
            throw th;
        }
    }

    private final synchronized void zzm() {
        JSONArray optJSONArray;
        try {
            JSONObject zzf = ((M) o.f1952C.f1961g.zzi()).n().zzf();
            if (zzf != null) {
                try {
                    JSONArray optJSONArray2 = zzf.optJSONArray("ad_unit_id_settings");
                    this.zzg = zzf.optJSONObject("ad_unit_patterns");
                    if (optJSONArray2 != null) {
                        for (int i7 = 0; i7 < optJSONArray2.length(); i7++) {
                            JSONObject jSONObject = optJSONArray2.getJSONObject(i7);
                            String lowerCase = ((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zzkT)).booleanValue() ? jSONObject.optString("ad_unit_id", "").toLowerCase(Locale.ROOT) : jSONObject.optString("ad_unit_id", "");
                            String optString = jSONObject.optString("format", "");
                            ArrayList arrayList = new ArrayList();
                            JSONObject optJSONObject = jSONObject.optJSONObject("mediation_config");
                            if (optJSONObject != null && (optJSONArray = optJSONObject.optJSONArray("ad_networks")) != null) {
                                for (int i8 = 0; i8 < optJSONArray.length(); i8++) {
                                    arrayList.addAll(zzi(optJSONArray.getJSONObject(i8), optString));
                                }
                            }
                            zzl(optString, lowerCase, arrayList);
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
        JSONObject zzf;
        if (!((Boolean) zzbee.zze.zze()).booleanValue()) {
            if (((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zzbW)).booleanValue() && (zzf = ((M) o.f1952C.f1961g.zzi()).n().zzf()) != null) {
                try {
                    JSONArray jSONArray = zzf.getJSONArray("signal_adapters");
                    for (int i7 = 0; i7 < jSONArray.length(); i7++) {
                        JSONObject jSONObject = jSONArray.getJSONObject(i7);
                        Bundle zzo = zzo(jSONObject.optJSONObject("data"));
                        String optString = jSONObject.optString("adapter_class_name");
                        boolean optBoolean = jSONObject.optBoolean("render", false);
                        boolean optBoolean2 = jSONObject.optBoolean("collect_signals", false);
                        if (!TextUtils.isEmpty(optString)) {
                            this.zzb.put(optString, new zzeid(optString, optBoolean2, optBoolean, true, zzo));
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
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                bundle.putString(next, jSONObject.optString(next, ""));
            }
        }
        return bundle;
    }

    public final synchronized Map zza(String str, String str2) {
        HashMap hashMap;
        try {
            Map zzb = zzb(str, str2);
            zzfwk zzh = zzh(str2);
            hashMap = new HashMap();
            for (Map.Entry entry : ((zzfwk) zzb).entrySet()) {
                String str3 = (String) entry.getKey();
                if (zzh.containsKey(str3)) {
                    zzeid zzeidVar = (zzeid) zzh.get(str3);
                    List list = (List) entry.getValue();
                    hashMap.put(str3, new zzeid(str3, zzeidVar.zzb, zzeidVar.zzc, zzeidVar.zzd, (list == null || list.isEmpty()) ? new Bundle() : (Bundle) list.get(0)));
                }
            }
            zzfyn it = zzh.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry2 = (Map.Entry) it.next();
                String str4 = (String) entry2.getKey();
                if (!hashMap.containsKey(str4) && ((zzeid) entry2.getValue()).zzd) {
                    hashMap.put(str4, (zzeid) entry2.getValue());
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return hashMap;
    }

    public final synchronized Map zzb(String str, String str2) {
        Map map;
        try {
            if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2) && !TextUtils.isEmpty(((M) o.f1952C.f1961g.zzi()).n().zzc()) && (map = (Map) this.zzc.get(str)) != null) {
                List<zzeib> list = (List) map.get(str2);
                if (list == null) {
                    String zza = zzdon.zza(this.zzg, str2, str);
                    if (((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zzkT)).booleanValue()) {
                        zza = zza.toLowerCase(Locale.ROOT);
                    }
                    list = (List) map.get(zza);
                }
                if (list != null) {
                    HashMap hashMap = new HashMap();
                    for (zzeib zzeibVar : list) {
                        String str3 = zzeibVar.zza;
                        if (!hashMap.containsKey(str3)) {
                            hashMap.put(str3, new ArrayList());
                        }
                        ((List) hashMap.get(str3)).add(zzeibVar.zzb);
                    }
                    return zzfwk.zzc(hashMap);
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
        L zzi = o.f1952C.f1961g.zzi();
        ((M) zzi).f3553c.add(new Runnable() { // from class: com.google.android.gms.internal.ads.zzehy
            @Override // java.lang.Runnable
            public final void run() {
                r0.zzf.execute(new zzehx(zzehz.this));
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
