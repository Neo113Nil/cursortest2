package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.jb, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0457jb {

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f6176a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f6177b;

    /* renamed from: c, reason: collision with root package name */
    public final int f6178c;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.HashMap f6179d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f6180e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.Integer f6181f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f6182g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f6183h;

    /* renamed from: i, reason: collision with root package name */
    public final io.appmetrica.analytics.internal.CounterConfigurationReporterType f6184i;

    /* renamed from: j, reason: collision with root package name */
    public final java.lang.String f6185j;

    public C0457jb(java.lang.String str) {
        org.json.JSONObject jSONObject = new org.json.JSONObject(str);
        org.json.JSONObject jSONObject2 = jSONObject.getJSONObject("event");
        this.f6176a = android.util.Base64.decode(jSONObject2.getString("jvm_crash"), 0);
        this.f6177b = jSONObject2.getString("name");
        this.f6178c = jSONObject2.getInt("bytes_truncated");
        this.f6185j = io.appmetrica.analytics.coreutils.internal.parsing.JsonUtils.optStringOrNull(jSONObject2, "environment");
        java.lang.String optString = jSONObject2.optString("trimmed_fields");
        this.f6179d = new java.util.HashMap();
        if (optString != null) {
            try {
                java.util.HashMap c2 = io.appmetrica.analytics.impl.AbstractC0380gb.c(optString);
                if (c2 != null) {
                    for (java.util.Map.Entry entry : c2.entrySet()) {
                        this.f6179d.put(io.appmetrica.analytics.impl.L3.valueOf((java.lang.String) entry.getKey()), java.lang.Integer.valueOf(java.lang.Integer.parseInt((java.lang.String) entry.getValue())));
                    }
                }
            } catch (java.lang.Throwable unused) {
            }
        }
        org.json.JSONObject jSONObject3 = jSONObject.getJSONObject("process_configuration");
        this.f6180e = jSONObject3.getString("package_name");
        this.f6181f = java.lang.Integer.valueOf(jSONObject3.getInt("pid"));
        this.f6182g = jSONObject3.getString("psid");
        org.json.JSONObject jSONObject4 = jSONObject.getJSONObject("reporter_configuration");
        this.f6183h = jSONObject4.getString("api_key");
        this.f6184i = a(jSONObject4);
    }

    public final java.lang.String a() {
        return this.f6183h;
    }

    public final int b() {
        return this.f6178c;
    }

    public final byte[] c() {
        return this.f6176a;
    }

    public final java.lang.String d() {
        return this.f6185j;
    }

    public final java.lang.String e() {
        return this.f6177b;
    }

    public final java.lang.String f() {
        return this.f6180e;
    }

    public final java.lang.Integer g() {
        return this.f6181f;
    }

    public final java.lang.String h() {
        return this.f6182g;
    }

    public final io.appmetrica.analytics.internal.CounterConfigurationReporterType i() {
        return this.f6184i;
    }

    public final java.util.HashMap<io.appmetrica.analytics.impl.L3, java.lang.Integer> j() {
        return this.f6179d;
    }

    public final java.lang.String k() {
        java.util.HashMap hashMap = new java.util.HashMap();
        for (java.util.Map.Entry entry : this.f6179d.entrySet()) {
            hashMap.put(((io.appmetrica.analytics.impl.L3) entry.getKey()).name(), (java.lang.Integer) entry.getValue());
        }
        return new org.json.JSONObject().put("process_configuration", new org.json.JSONObject().put("pid", this.f6181f).put("psid", this.f6182g).put("package_name", this.f6180e)).put("reporter_configuration", new org.json.JSONObject().put("api_key", this.f6183h).put("reporter_type", this.f6184i.getStringValue())).put("event", new org.json.JSONObject().put("jvm_crash", android.util.Base64.encodeToString(this.f6176a, 0)).put("name", this.f6177b).put("bytes_truncated", this.f6178c).put("trimmed_fields", io.appmetrica.analytics.impl.AbstractC0380gb.b(hashMap)).putOpt("environment", this.f6185j)).toString();
    }

    public static io.appmetrica.analytics.internal.CounterConfigurationReporterType a(org.json.JSONObject jSONObject) {
        return jSONObject.has("reporter_type") ? io.appmetrica.analytics.internal.CounterConfigurationReporterType.fromStringValue(jSONObject.getString("reporter_type")) : io.appmetrica.analytics.internal.CounterConfigurationReporterType.MAIN;
    }

    public C0457jb(io.appmetrica.analytics.impl.P5 p5, io.appmetrica.analytics.impl.H3 h3, java.util.HashMap<io.appmetrica.analytics.impl.L3, java.lang.Integer> hashMap) {
        this.f6176a = p5.getValueBytes();
        this.f6177b = p5.getName();
        this.f6178c = p5.getBytesTruncated();
        if (hashMap != null) {
            this.f6179d = hashMap;
        } else {
            this.f6179d = new java.util.HashMap();
        }
        io.appmetrica.analytics.impl.Bf a2 = h3.a();
        this.f6180e = a2.e();
        this.f6181f = a2.f();
        this.f6182g = a2.g();
        io.appmetrica.analytics.internal.CounterConfiguration b2 = h3.b();
        this.f6183h = b2.getApiKey();
        this.f6184i = b2.getReporterType();
        this.f6185j = p5.f();
    }
}
