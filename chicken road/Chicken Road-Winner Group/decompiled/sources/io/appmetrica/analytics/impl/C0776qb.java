package io.appmetrica.analytics.impl;

import android.util.Base64;
import io.appmetrica.analytics.coreutils.internal.parsing.JsonUtils;
import io.appmetrica.analytics.internal.CounterConfiguration;
import io.appmetrica.analytics.internal.CounterConfigurationReporterType;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: io.appmetrica.analytics.impl.qb, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0776qb {

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f8141a;

    /* renamed from: b, reason: collision with root package name */
    public final String f8142b;

    /* renamed from: c, reason: collision with root package name */
    public final int f8143c;

    /* renamed from: d, reason: collision with root package name */
    public final HashMap f8144d;

    /* renamed from: e, reason: collision with root package name */
    public final String f8145e;
    public final Integer f;

    /* renamed from: g, reason: collision with root package name */
    public final String f8146g;

    /* renamed from: h, reason: collision with root package name */
    public final String f8147h;

    /* renamed from: i, reason: collision with root package name */
    public final CounterConfigurationReporterType f8148i;

    /* renamed from: j, reason: collision with root package name */
    public final String f8149j;

    public C0776qb(String str) throws JSONException {
        JSONObject jSONObject = new JSONObject(str);
        JSONObject jSONObject2 = jSONObject.getJSONObject("event");
        this.f8141a = Base64.decode(jSONObject2.getString("jvm_crash"), 0);
        this.f8142b = jSONObject2.getString("name");
        this.f8143c = jSONObject2.getInt("bytes_truncated");
        this.f8149j = JsonUtils.optStringOrNull(jSONObject2, "environment");
        String optString = jSONObject2.optString("trimmed_fields");
        this.f8144d = new HashMap();
        if (optString != null) {
            try {
                HashMap c3 = AbstractC0698nb.c(optString);
                if (c3 != null) {
                    for (Map.Entry entry : c3.entrySet()) {
                        this.f8144d.put(T3.valueOf((String) entry.getKey()), Integer.valueOf(Integer.parseInt((String) entry.getValue())));
                    }
                }
            } catch (Throwable unused) {
            }
        }
        JSONObject jSONObject3 = jSONObject.getJSONObject("process_configuration");
        this.f8145e = jSONObject3.getString("package_name");
        this.f = Integer.valueOf(jSONObject3.getInt("pid"));
        this.f8146g = jSONObject3.getString("psid");
        JSONObject jSONObject4 = jSONObject.getJSONObject("reporter_configuration");
        this.f8147h = jSONObject4.getString("api_key");
        this.f8148i = a(jSONObject4);
    }

    public final String a() {
        return this.f8147h;
    }

    public final int b() {
        return this.f8143c;
    }

    public final byte[] c() {
        return this.f8141a;
    }

    public final String d() {
        return this.f8149j;
    }

    public final String e() {
        return this.f8142b;
    }

    public final String f() {
        return this.f8145e;
    }

    public final Integer g() {
        return this.f;
    }

    public final String h() {
        return this.f8146g;
    }

    public final CounterConfigurationReporterType i() {
        return this.f8148i;
    }

    public final HashMap<T3, Integer> j() {
        return this.f8144d;
    }

    public final String k() throws JSONException {
        HashMap hashMap = new HashMap();
        for (Map.Entry entry : this.f8144d.entrySet()) {
            hashMap.put(((T3) entry.getKey()).name(), (Integer) entry.getValue());
        }
        return new JSONObject().put("process_configuration", new JSONObject().put("pid", this.f).put("psid", this.f8146g).put("package_name", this.f8145e)).put("reporter_configuration", new JSONObject().put("api_key", this.f8147h).put("reporter_type", this.f8148i.getStringValue())).put("event", new JSONObject().put("jvm_crash", Base64.encodeToString(this.f8141a, 0)).put("name", this.f8142b).put("bytes_truncated", this.f8143c).put("trimmed_fields", AbstractC0698nb.b(hashMap)).putOpt("environment", this.f8149j)).toString();
    }

    public static CounterConfigurationReporterType a(JSONObject jSONObject) {
        return jSONObject.has("reporter_type") ? CounterConfigurationReporterType.fromStringValue(jSONObject.getString("reporter_type")) : CounterConfigurationReporterType.MAIN;
    }

    public C0776qb(W5 w5, P3 p3, HashMap<T3, Integer> hashMap) {
        this.f8141a = w5.getValueBytes();
        this.f8142b = w5.getName();
        this.f8143c = w5.getBytesTruncated();
        if (hashMap != null) {
            this.f8144d = hashMap;
        } else {
            this.f8144d = new HashMap();
        }
        Gf a3 = p3.a();
        this.f8145e = a3.e();
        this.f = a3.f();
        this.f8146g = a3.g();
        CounterConfiguration b3 = p3.b();
        this.f8147h = b3.getApiKey();
        this.f8148i = b3.getReporterType();
        this.f8149j = w5.f();
    }
}
