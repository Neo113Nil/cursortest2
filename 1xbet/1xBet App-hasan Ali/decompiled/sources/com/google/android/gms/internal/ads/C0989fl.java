package com.google.android.gms.internal.ads;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.fl, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0989fl {

    /* renamed from: b, reason: collision with root package name */
    public JSONObject f13491b;

    /* renamed from: c, reason: collision with root package name */
    public final Qw f13492c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f13493d;

    /* renamed from: e, reason: collision with root package name */
    public JSONObject f13494e;

    /* renamed from: a, reason: collision with root package name */
    public final ConcurrentHashMap f13490a = new ConcurrentHashMap();
    public final AtomicBoolean f = new AtomicBoolean(false);

    public C0989fl(Qw qw) {
        this.f13492c = qw;
    }

    public final synchronized void a() {
        JSONObject jSONObject;
        Map map;
        try {
            this.f13493d = true;
            C0552Ad t5 = P2.o.f4767B.f4774g.d().t();
            if (t5 != null && (jSONObject = t5.f7599g) != null) {
                this.f13491b = ((Boolean) Q2.r.f5053d.f5056c.a(F7.f8780W3)).booleanValue() ? jSONObject.optJSONObject("common_settings") : null;
                this.f13494e = jSONObject.optJSONObject("ad_unit_patterns");
                JSONArray optJSONArray = jSONObject.optJSONArray("ad_unit_id_settings");
                if (optJSONArray != null) {
                    for (int i = 0; i < optJSONArray.length(); i++) {
                        JSONObject optJSONObject = optJSONArray.optJSONObject(i);
                        if (optJSONObject != null) {
                            String optString = optJSONObject.optString("ad_unit_id");
                            String optString2 = optJSONObject.optString("format");
                            JSONObject optJSONObject2 = optJSONObject.optJSONObject("request_signals");
                            if (optString != null && optJSONObject2 != null && optString2 != null) {
                                if (this.f13490a.containsKey(optString2)) {
                                    map = (Map) this.f13490a.get(optString2);
                                } else {
                                    ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
                                    this.f13490a.put(optString2, concurrentHashMap);
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
}
