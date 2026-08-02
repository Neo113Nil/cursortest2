package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.wo, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1754wo {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f16161a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f16162b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f16163c = new HashMap();

    /* renamed from: d, reason: collision with root package name */
    public final HashMap f16164d = new HashMap();

    /* renamed from: e, reason: collision with root package name */
    public final HashMap f16165e = new HashMap();
    public final Qw f;

    /* renamed from: g, reason: collision with root package name */
    public JSONObject f16166g;

    public C1754wo(Qw qw) {
        this.f = qw;
    }

    public static final Bundle k(JSONObject jSONObject) {
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

    public final synchronized HashMap a(String str, String str2) {
        HashMap hashMap;
        try {
            Cv b3 = b(str, str2);
            Cv e3 = e(str2);
            hashMap = new HashMap();
            Iterator it = ((C1896zv) b3.entrySet()).iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                String str3 = (String) entry.getKey();
                if (e3.containsKey(str3)) {
                    C1889zo c1889zo = (C1889zo) e3.get(str3);
                    List list = (List) entry.getValue();
                    hashMap.put(str3, new C1889zo(str3, c1889zo.f16768b, c1889zo.f16769c, c1889zo.f16770d, (list == null || list.isEmpty()) ? new Bundle() : (Bundle) list.get(0)));
                }
            }
            Lv g5 = e3.entrySet().g();
            while (g5.hasNext()) {
                Map.Entry entry2 = (Map.Entry) g5.next();
                String str4 = (String) entry2.getKey();
                if (!hashMap.containsKey(str4) && ((C1889zo) entry2.getValue()).f16770d) {
                    hashMap.put(str4, (C1889zo) entry2.getValue());
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return hashMap;
    }

    public final synchronized Cv b(String str, String str2) {
        Map map;
        try {
            if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2) && !TextUtils.isEmpty(P2.o.f4767B.f4774g.d().t().f7598e) && (map = (Map) this.f16163c.get(str)) != null) {
                List<C1799xo> list = (List) map.get(str2);
                if (list == null) {
                    String m5 = AbstractC1668us.m(this.f16166g, str2, str);
                    if (((Boolean) Q2.r.f5053d.f5056c.a(F7.xa)).booleanValue()) {
                        m5 = m5.toLowerCase(Locale.ROOT);
                    }
                    list = (List) map.get(m5);
                }
                if (list != null) {
                    HashMap hashMap = new HashMap();
                    for (C1799xo c1799xo : list) {
                        String str3 = c1799xo.f16329a;
                        if (!hashMap.containsKey(str3)) {
                            hashMap.put(str3, new ArrayList());
                        }
                        ((List) hashMap.get(str3)).add(c1799xo.f16330b);
                    }
                    return Cv.a(hashMap);
                }
            }
            return Cv.f8103q;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized Cv c() {
        if (TextUtils.isEmpty(P2.o.f4767B.f4774g.d().t().f7598e)) {
            return Cv.f8103q;
        }
        return Cv.a(this.f16162b);
    }

    public final synchronized void d(String str) {
        if (!TextUtils.isEmpty(str) && !this.f16161a.containsKey(str)) {
            this.f16161a.put(str, new C1799xo(str, new Bundle()));
        }
    }

    public final synchronized Cv e(String str) {
        HashMap hashMap;
        try {
            if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(P2.o.f4767B.f4774g.d().t().f7598e)) {
                A7 a7 = F7.e3;
                Q2.r rVar = Q2.r.f5053d;
                boolean matches = Pattern.matches((String) rVar.f5056c.a(a7), str);
                boolean matches2 = Pattern.matches((String) rVar.f5056c.a(F7.f8826f3), str);
                if (matches) {
                    hashMap = new HashMap(this.f16165e);
                } else if (matches2) {
                    hashMap = new HashMap(this.f16164d);
                }
                return Cv.a(hashMap);
            }
            return Cv.f8103q;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized ArrayList f(JSONObject jSONObject) {
        ArrayList arrayList;
        try {
            arrayList = new ArrayList();
            if (jSONObject != null) {
                Bundle k5 = k(jSONObject.optJSONObject("data"));
                JSONArray optJSONArray = jSONObject.optJSONArray("rtb_adapters");
                if (optJSONArray != null) {
                    ArrayList arrayList2 = new ArrayList();
                    for (int i = 0; i < optJSONArray.length(); i++) {
                        String optString = optJSONArray.optString(i, "");
                        if (!TextUtils.isEmpty(optString)) {
                            arrayList2.add(optString);
                        }
                    }
                    int size = arrayList2.size();
                    for (int i5 = 0; i5 < size; i5++) {
                        String str = (String) arrayList2.get(i5);
                        d(str);
                        if (((C1799xo) this.f16161a.get(str)) != null) {
                            arrayList.add(new C1799xo(str, k5));
                        }
                    }
                }
            }
        } finally {
        }
        return arrayList;
    }

    public final synchronized void g() {
        JSONObject jSONObject;
        try {
            if (!((Boolean) AbstractC1326n8.f14585b.s()).booleanValue()) {
                if (((Boolean) Q2.r.f5053d.f5056c.a(F7.f8717L1)).booleanValue() && (jSONObject = P2.o.f4767B.f4774g.d().t().f7599g) != null) {
                    JSONArray jSONArray = jSONObject.getJSONArray("adapter_settings");
                    for (int i = 0; i < jSONArray.length(); i++) {
                        JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                        String optString = jSONObject2.optString("adapter_class_name");
                        JSONArray optJSONArray = jSONObject2.optJSONArray("permission_set");
                        if (!TextUtils.isEmpty(optString) && optJSONArray != null) {
                            for (int i5 = 0; i5 < optJSONArray.length(); i5++) {
                                JSONObject jSONObject3 = optJSONArray.getJSONObject(i5);
                                boolean optBoolean = jSONObject3.optBoolean("enable_rendering", false);
                                boolean optBoolean2 = jSONObject3.optBoolean("collect_secure_signals", false);
                                boolean optBoolean3 = jSONObject3.optBoolean("collect_secure_signals_on_full_app", false);
                                String optString2 = jSONObject3.optString("platform");
                                C1889zo c1889zo = new C1889zo(optString, optBoolean2, optBoolean, optBoolean3, new Bundle());
                                if (optString2.equals("ADMOB")) {
                                    this.f16164d.put(optString, c1889zo);
                                } else if (optString2.equals("AD_MANAGER")) {
                                    this.f16165e.put(optString, c1889zo);
                                }
                            }
                        }
                    }
                }
            }
        } catch (JSONException e3) {
            T2.G.n("Malformed config loading JSON.", e3);
        } finally {
        }
    }

    public final synchronized void h(String str, String str2, ArrayList arrayList) {
        try {
            if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
                return;
            }
            Map map = (Map) this.f16163c.get(str);
            if (map == null) {
                map = new HashMap();
            }
            this.f16163c.put(str, map);
            List list = (List) map.get(str2);
            if (list == null) {
                list = new ArrayList();
            }
            list.addAll(arrayList);
            map.put(str2, list);
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void i() {
        JSONArray optJSONArray;
        try {
            JSONObject jSONObject = P2.o.f4767B.f4774g.d().t().f7599g;
            if (jSONObject != null) {
                try {
                    JSONArray optJSONArray2 = jSONObject.optJSONArray("ad_unit_id_settings");
                    this.f16166g = jSONObject.optJSONObject("ad_unit_patterns");
                    if (optJSONArray2 != null) {
                        for (int i = 0; i < optJSONArray2.length(); i++) {
                            JSONObject jSONObject2 = optJSONArray2.getJSONObject(i);
                            String lowerCase = ((Boolean) Q2.r.f5053d.f5056c.a(F7.xa)).booleanValue() ? jSONObject2.optString("ad_unit_id", "").toLowerCase(Locale.ROOT) : jSONObject2.optString("ad_unit_id", "");
                            String optString = jSONObject2.optString("format", "");
                            ArrayList arrayList = new ArrayList();
                            JSONObject optJSONObject = jSONObject2.optJSONObject("mediation_config");
                            if (optJSONObject != null && (optJSONArray = optJSONObject.optJSONArray("ad_networks")) != null) {
                                for (int i5 = 0; i5 < optJSONArray.length(); i5++) {
                                    arrayList.addAll(f(optJSONArray.getJSONObject(i5)));
                                }
                            }
                            h(optString, lowerCase, arrayList);
                        }
                    }
                } catch (JSONException e3) {
                    T2.G.n("Malformed config loading JSON.", e3);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void j() {
        JSONObject jSONObject;
        if (!((Boolean) AbstractC1326n8.f14588e.s()).booleanValue()) {
            if (((Boolean) Q2.r.f5053d.f5056c.a(F7.f8711K1)).booleanValue() && (jSONObject = P2.o.f4767B.f4774g.d().t().f7599g) != null) {
                try {
                    JSONArray jSONArray = jSONObject.getJSONArray("signal_adapters");
                    for (int i = 0; i < jSONArray.length(); i++) {
                        JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                        Bundle k5 = k(jSONObject2.optJSONObject("data"));
                        String optString = jSONObject2.optString("adapter_class_name");
                        boolean optBoolean = jSONObject2.optBoolean("render", false);
                        boolean optBoolean2 = jSONObject2.optBoolean("collect_signals", false);
                        if (!TextUtils.isEmpty(optString)) {
                            this.f16162b.put(optString, new C1889zo(optString, optBoolean2, optBoolean, true, k5));
                        }
                    }
                } catch (JSONException e3) {
                    T2.G.n("Malformed config loading JSON.", e3);
                }
            }
        }
    }
}
