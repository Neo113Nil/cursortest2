package io.appmetrica.analytics.impl;

import android.util.Base64;
import io.appmetrica.analytics.coreutils.internal.parsing.JsonUtils;
import io.appmetrica.analytics.internal.CounterConfiguration;
import io.appmetrica.analytics.internal.CounterConfigurationReporterType;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: io.appmetrica.analytics.impl.qb, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0925qb {

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f9082a;

    /* renamed from: b, reason: collision with root package name */
    public final String f9083b;

    /* renamed from: c, reason: collision with root package name */
    public final int f9084c;

    /* renamed from: d, reason: collision with root package name */
    public final HashMap f9085d;

    /* renamed from: e, reason: collision with root package name */
    public final String f9086e;

    /* renamed from: f, reason: collision with root package name */
    public final Integer f9087f;

    /* renamed from: g, reason: collision with root package name */
    public final String f9088g;

    /* renamed from: h, reason: collision with root package name */
    public final String f9089h;

    /* renamed from: i, reason: collision with root package name */
    public final CounterConfigurationReporterType f9090i;

    /* renamed from: j, reason: collision with root package name */
    public final String f9091j;

    public C0925qb(String str) {
        JSONObject jSONObject = new JSONObject(str);
        JSONObject jSONObject2 = jSONObject.getJSONObject("event");
        this.f9082a = Base64.decode(jSONObject2.getString("jvm_crash"), 0);
        this.f9083b = jSONObject2.getString("name");
        this.f9084c = jSONObject2.getInt("bytes_truncated");
        this.f9091j = JsonUtils.optStringOrNull(jSONObject2, "environment");
        String optString = jSONObject2.optString("trimmed_fields");
        this.f9085d = new HashMap();
        if (optString != null) {
            try {
                HashMap c2 = AbstractC0847nb.c(optString);
                if (c2 != null) {
                    for (Map.Entry entry : c2.entrySet()) {
                        this.f9085d.put(T3.valueOf((String) entry.getKey()), Integer.valueOf(Integer.parseInt((String) entry.getValue())));
                    }
                }
            } catch (Throwable unused) {
            }
        }
        JSONObject jSONObject3 = jSONObject.getJSONObject("process_configuration");
        this.f9086e = jSONObject3.getString("package_name");
        this.f9087f = Integer.valueOf(jSONObject3.getInt("pid"));
        this.f9088g = jSONObject3.getString("psid");
        JSONObject jSONObject4 = jSONObject.getJSONObject("reporter_configuration");
        this.f9089h = jSONObject4.getString("api_key");
        this.f9090i = a(jSONObject4);
    }

    public final String a() {
        return this.f9089h;
    }

    public final int b() {
        return this.f9084c;
    }

    public final byte[] c() {
        return this.f9082a;
    }

    public final String d() {
        return this.f9091j;
    }

    public final String e() {
        return this.f9083b;
    }

    public final String f() {
        return this.f9086e;
    }

    public final Integer g() {
        return this.f9087f;
    }

    public final String h() {
        return this.f9088g;
    }

    public final CounterConfigurationReporterType i() {
        return this.f9090i;
    }

    public final HashMap<T3, Integer> j() {
        return this.f9085d;
    }

    public final String k() {
        HashMap hashMap = new HashMap();
        for (Map.Entry entry : this.f9085d.entrySet()) {
            hashMap.put(((T3) entry.getKey()).name(), (Integer) entry.getValue());
        }
        return new JSONObject().put("process_configuration", new JSONObject().put("pid", this.f9087f).put("psid", this.f9088g).put("package_name", this.f9086e)).put("reporter_configuration", new JSONObject().put("api_key", this.f9089h).put("reporter_type", this.f9090i.getStringValue())).put("event", new JSONObject().put("jvm_crash", Base64.encodeToString(this.f9082a, 0)).put("name", this.f9083b).put("bytes_truncated", this.f9084c).put("trimmed_fields", AbstractC0847nb.b(hashMap)).putOpt("environment", this.f9091j)).toString();
    }

    public static CounterConfigurationReporterType a(JSONObject jSONObject) {
        return jSONObject.has("reporter_type") ? CounterConfigurationReporterType.fromStringValue(jSONObject.getString("reporter_type")) : CounterConfigurationReporterType.MAIN;
    }

    public C0925qb(W5 w5, P3 p32, HashMap<T3, Integer> hashMap) {
        this.f9082a = w5.getValueBytes();
        this.f9083b = w5.getName();
        this.f9084c = w5.getBytesTruncated();
        if (hashMap != null) {
            this.f9085d = hashMap;
        } else {
            this.f9085d = new HashMap();
        }
        Gf a6 = p32.a();
        this.f9086e = a6.e();
        this.f9087f = a6.f();
        this.f9088g = a6.g();
        CounterConfiguration b6 = p32.b();
        this.f9089h = b6.getApiKey();
        this.f9090i = b6.getReporterType();
        this.f9091j = w5.f();
    }
}
