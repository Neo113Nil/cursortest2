package com.yandex.varioqub.config.impl;

/* renamed from: com.yandex.varioqub.config.impl.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0104c {

    /* renamed from: a, reason: collision with root package name */
    public final com.yandex.varioqub.config.impl.i f2666a;

    /* renamed from: b, reason: collision with root package name */
    public final long f2667b;

    /* renamed from: c, reason: collision with root package name */
    public final com.yandex.varioqub.config.impl.t f2668c;

    /* renamed from: d, reason: collision with root package name */
    public final com.yandex.varioqub.config.impl.C0102a f2669d;

    /* renamed from: e, reason: collision with root package name */
    public final com.yandex.varioqub.config.impl.u f2670e;

    /* renamed from: f, reason: collision with root package name */
    public long f2671f;

    /* renamed from: g, reason: collision with root package name */
    public long f2672g;

    /* renamed from: h, reason: collision with root package name */
    public java.util.HashMap f2673h = new java.util.HashMap();

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f2674i = "";

    /* renamed from: j, reason: collision with root package name */
    public java.lang.String f2675j = "";

    /* renamed from: k, reason: collision with root package name */
    public java.lang.String f2676k = "";

    /* renamed from: l, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicBoolean f2677l = new java.util.concurrent.atomic.AtomicBoolean(false);

    /* renamed from: m, reason: collision with root package name */
    public boolean f2678m;

    public C0104c(com.yandex.varioqub.config.impl.i iVar, long j2, com.yandex.varioqub.config.impl.t tVar, com.yandex.varioqub.config.impl.C0102a c0102a, com.yandex.varioqub.config.impl.u uVar) {
        this.f2666a = iVar;
        this.f2667b = j2;
        this.f2668c = tVar;
        this.f2669d = c0102a;
        this.f2670e = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v12, types: [java.util.HashMap] */
    /* JADX WARN: Type inference failed for: r1v7, types: [i1.s] */
    /* JADX WARN: Type inference failed for: r1v8, types: [java.util.Map] */
    public final void a() {
        ?? r12;
        com.yandex.varioqub.config.model.ConfigValue configValue;
        if (this.f2677l.compareAndSet(false, true)) {
            this.f2671f = com.yandex.varioqub.config.impl.m.a().getLong("last_fetched_time_ms_key", 0L);
            this.f2672g = com.yandex.varioqub.config.impl.m.a().getLong("last_successful_fetched_time_ms_key", 0L);
            java.lang.String string = com.yandex.varioqub.config.impl.m.a().getString("experiments", "");
            if (string == null) {
                string = "";
            }
            this.f2675j = string;
            java.lang.String string2 = com.yandex.varioqub.config.impl.m.a().getString("identifier", "");
            if (string2 == null) {
                string2 = "";
            }
            this.f2674i = string2;
            java.lang.String string3 = com.yandex.varioqub.config.impl.m.a().getString("fetched_config_key", "");
            if (string3 == null || string3.length() == 0) {
                r12 = i1.C0200s.f3326a;
            } else {
                org.json.JSONObject jSONObject = new org.json.JSONObject(string3);
                r12 = new java.util.HashMap();
                java.util.Iterator<java.lang.String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    java.lang.String next = keys.next();
                    java.lang.String string4 = jSONObject.getString(next);
                    if (string4 == null || string4.length() == 0) {
                        configValue = null;
                    } else {
                        org.json.JSONObject jSONObject2 = new org.json.JSONObject(string4);
                        configValue = new com.yandex.varioqub.config.model.ConfigValue(jSONObject2.getString("value"), jSONObject2.getInt("sourceType"), jSONObject2.getLong("testId"));
                    }
                    if (configValue == null) {
                        throw new java.lang.NullPointerException("null cannot be cast to non-null type com.yandex.varioqub.config.model.ConfigValue");
                    }
                    r12.put(next, configValue);
                }
            }
            this.f2673h = new java.util.HashMap((java.util.Map) r12);
            android.content.Context context = com.yandex.varioqub.config.impl.AbstractC0105d.f2679a;
            if (context == null) {
                kotlin.jvm.internal.i.i("appContext");
                throw null;
            }
            this.f2678m = context.getSharedPreferences(context.getPackageName() + "_varioqub_pref", 0).getBoolean("should_notify_adapter", false);
        }
    }
}
