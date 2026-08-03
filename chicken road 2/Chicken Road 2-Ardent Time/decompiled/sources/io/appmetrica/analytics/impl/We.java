package io.appmetrica.analytics.impl;

/* loaded from: classes.dex */
public final class We extends io.appmetrica.analytics.impl.AbstractC0848yd implements io.appmetrica.analytics.impl.Bo {

    /* renamed from: d, reason: collision with root package name */
    public static final long f5201d = 0;

    /* renamed from: e, reason: collision with root package name */
    public static final int f5202e = -1;

    /* renamed from: f, reason: collision with root package name */
    public static final java.lang.String f5203f = "";

    /* renamed from: g, reason: collision with root package name */
    public static final java.lang.String f5204g = "";

    /* renamed from: r, reason: collision with root package name */
    public static final java.lang.String f5215r = "SESSION_";

    /* renamed from: h, reason: collision with root package name */
    public static final io.appmetrica.analytics.impl.Ye f5205h = new io.appmetrica.analytics.impl.Ye("PERMISSIONS_CHECK_TIME", null);

    /* renamed from: i, reason: collision with root package name */
    public static final io.appmetrica.analytics.impl.Ye f5206i = new io.appmetrica.analytics.impl.Ye("PROFILE_ID", null);

    /* renamed from: j, reason: collision with root package name */
    public static final io.appmetrica.analytics.impl.Ye f5207j = new io.appmetrica.analytics.impl.Ye("APP_ENVIRONMENT", null);

    /* renamed from: k, reason: collision with root package name */
    public static final io.appmetrica.analytics.impl.Ye f5208k = new io.appmetrica.analytics.impl.Ye("APP_ENVIRONMENT_REVISION", null);

    /* renamed from: l, reason: collision with root package name */
    public static final io.appmetrica.analytics.impl.Ye f5209l = new io.appmetrica.analytics.impl.Ye("LAST_APP_VERSION_WITH_FEATURES", null);

    /* renamed from: m, reason: collision with root package name */
    public static final io.appmetrica.analytics.impl.Ye f5210m = new io.appmetrica.analytics.impl.Ye("APPLICATION_FEATURES", null);

    /* renamed from: n, reason: collision with root package name */
    public static final io.appmetrica.analytics.impl.Ye f5211n = new io.appmetrica.analytics.impl.Ye("CERTIFICATES_SHA1_FINGERPRINTS", null);

    /* renamed from: o, reason: collision with root package name */
    public static final io.appmetrica.analytics.impl.Ye f5212o = new io.appmetrica.analytics.impl.Ye("VITAL_DATA", null);

    /* renamed from: p, reason: collision with root package name */
    public static final io.appmetrica.analytics.impl.Ye f5213p = new io.appmetrica.analytics.impl.Ye("SENT_EXTERNAL_ATTRIBUTIONS", null);

    /* renamed from: q, reason: collision with root package name */
    public static final io.appmetrica.analytics.impl.Ye f5214q = new io.appmetrica.analytics.impl.Ye("AUTO_COLLECTED_DATA_SUBSCRIBERS", null);

    /* renamed from: s, reason: collision with root package name */
    public static final io.appmetrica.analytics.impl.Ye f5216s = new io.appmetrica.analytics.impl.Ye("MAIN_REPORTER_EVENTS_TRIGGER_CONDITION_MET", null);

    public We(io.appmetrica.analytics.impl.Ha ha) {
        super(ha);
    }

    public final io.appmetrica.analytics.impl.We a(io.appmetrica.analytics.impl.C0421i0 c0421i0) {
        synchronized (this) {
            b(f5207j.f5343b, c0421i0.f6067a);
            b(f5208k.f5343b, c0421i0.f6068b);
        }
        return this;
    }

    public final void b(boolean z2) {
        b(f5216s.f5343b, z2);
    }

    @Override // io.appmetrica.analytics.impl.Xe
    public final java.util.Set<java.lang.String> c() {
        return this.f5302a.a();
    }

    public final io.appmetrica.analytics.impl.C0421i0 d() {
        io.appmetrica.analytics.impl.C0421i0 c0421i0;
        synchronized (this) {
            c0421i0 = new io.appmetrica.analytics.impl.C0421i0(this.f5302a.getString(f5207j.f5343b, "{}"), this.f5302a.getLong(f5208k.f5343b, 0L));
        }
        return c0421i0;
    }

    public final java.lang.String e() {
        return this.f5302a.getString(f5210m.f5343b, "");
    }

    public final java.util.Map<java.lang.String, java.lang.Long> f() {
        java.util.HashMap hashMap = new java.util.HashMap();
        try {
            java.lang.String string = this.f5302a.getString(f5214q.f5343b, null);
            if (!android.text.TextUtils.isEmpty(string)) {
                org.json.JSONObject jSONObject = new org.json.JSONObject(string);
                java.util.Iterator<java.lang.String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    java.lang.String next = keys.next();
                    hashMap.put(next, java.lang.Long.valueOf(jSONObject.getLong(next)));
                }
            }
        } catch (java.lang.Throwable unused) {
        }
        return hashMap;
    }

    public final java.util.List<java.lang.String> g() {
        java.lang.String str = f5211n.f5343b;
        java.util.List emptyList = java.util.Collections.emptyList();
        java.lang.String[] strArr = emptyList == null ? null : (java.lang.String[]) emptyList.toArray(new java.lang.String[emptyList.size()]);
        java.lang.String string = this.f5302a.getString(str, null);
        if (!android.text.TextUtils.isEmpty(string)) {
            try {
                org.json.JSONArray jSONArray = new org.json.JSONArray(string);
                strArr = new java.lang.String[jSONArray.length()];
                for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                    strArr[i2] = jSONArray.optString(i2);
                }
            } catch (java.lang.Throwable unused) {
            }
        }
        if (strArr == null) {
            return null;
        }
        return java.util.Arrays.asList(strArr);
    }

    public final int h() {
        return this.f5302a.getInt(f5209l.f5343b, -1);
    }

    public final long i() {
        return this.f5302a.getLong(f5205h.f5343b, 0L);
    }

    public final java.lang.String j() {
        return this.f5302a.getString(f5206i.f5343b, null);
    }

    public final java.util.Map<java.lang.Integer, java.lang.String> k() {
        java.util.HashMap hashMap = new java.util.HashMap();
        try {
            java.lang.String string = this.f5302a.getString(f5213p.f5343b, null);
            if (string != null) {
                org.json.JSONObject jSONObject = new org.json.JSONObject(string);
                java.util.Iterator<java.lang.String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    java.lang.String next = keys.next();
                    hashMap.put(java.lang.Integer.valueOf(java.lang.Integer.parseInt(next)), jSONObject.getString(next));
                }
            }
        } catch (java.lang.Throwable unused) {
        }
        return hashMap;
    }

    public final void b(java.util.Map<java.lang.Integer, java.lang.String> map) {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        for (java.util.Map.Entry<java.lang.Integer, java.lang.String> entry : map.entrySet()) {
            try {
                jSONObject.put(entry.getKey().toString(), entry.getValue());
            } catch (java.lang.Throwable unused) {
            }
        }
        b(f5213p.f5343b, jSONObject.toString());
    }

    public final java.lang.String h(java.lang.String str) {
        return this.f5302a.getString(new io.appmetrica.analytics.impl.Ye(f5215r, str).f5343b, "");
    }

    public final io.appmetrica.analytics.impl.We i(java.lang.String str) {
        return (io.appmetrica.analytics.impl.We) b(f5210m.f5343b, str);
    }

    public final io.appmetrica.analytics.impl.We j(java.lang.String str) {
        return (io.appmetrica.analytics.impl.We) b(f5206i.f5343b, str);
    }

    public final io.appmetrica.analytics.impl.We e(java.lang.String str, java.lang.String str2) {
        return (io.appmetrica.analytics.impl.We) b(new io.appmetrica.analytics.impl.Ye(f5215r, str).f5343b, str2);
    }

    public final io.appmetrica.analytics.impl.We a(long j2) {
        return (io.appmetrica.analytics.impl.We) b(f5205h.f5343b, j2);
    }

    @Override // io.appmetrica.analytics.impl.AbstractC0848yd
    public final java.lang.String f(java.lang.String str) {
        return new io.appmetrica.analytics.impl.Ye(str, null).f5343b;
    }

    public final io.appmetrica.analytics.impl.We a(int i2) {
        return (io.appmetrica.analytics.impl.We) b(f5209l.f5343b, i2);
    }

    public final io.appmetrica.analytics.impl.We a(java.util.List<java.lang.String> list) {
        return (io.appmetrica.analytics.impl.We) a(f5211n.f5343b, list);
    }

    public final boolean a(boolean z2) {
        return this.f5302a.getBoolean(f5216s.f5343b, z2);
    }

    @Override // io.appmetrica.analytics.impl.Bo
    public final java.lang.String a() {
        return this.f5302a.getString(f5212o.f5343b, null);
    }

    @Override // io.appmetrica.analytics.impl.Bo
    public final void a(java.lang.String str) {
        b(f5212o.f5343b, str);
    }

    public final void a(java.util.Map<java.lang.String, java.lang.Long> map) {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        for (java.util.Map.Entry<java.lang.String, java.lang.Long> entry : map.entrySet()) {
            try {
                jSONObject.put(entry.getKey(), entry.getValue());
            } catch (java.lang.Throwable unused) {
            }
        }
        b(f5214q.f5343b, jSONObject.toString());
    }
}
