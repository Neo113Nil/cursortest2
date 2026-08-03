package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.xo, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0833xo {

    /* renamed from: a, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.C0859yo f7123a;

    public C0833xo(io.appmetrica.analytics.impl.We we, io.appmetrica.analytics.impl.Bo bo, java.lang.String str) {
        this.f7123a = new io.appmetrica.analytics.impl.C0859yo(we, bo, new H0.b(21));
    }

    public static final org.json.JSONObject a(org.json.JSONObject jSONObject, org.json.JSONObject jSONObject2) {
        org.json.JSONObject jSONObject3 = new org.json.JSONObject();
        java.lang.Boolean bool = java.lang.Boolean.FALSE;
        jSONObject3.put("first_event_done", io.appmetrica.analytics.coreutils.internal.parsing.JsonUtils.optBooleanOrNullable(jSONObject2, "first_event_done", io.appmetrica.analytics.coreutils.internal.parsing.JsonUtils.optBooleanOrNullable(jSONObject, "first_event_done", bool)));
        jSONObject3.put("init_event_done", io.appmetrica.analytics.coreutils.internal.parsing.JsonUtils.optBooleanOrNullable(jSONObject2, "init_event_done", io.appmetrica.analytics.coreutils.internal.parsing.JsonUtils.optBooleanOrNullable(jSONObject, "init_event_done", bool)));
        jSONObject3.put("report_request_id", io.appmetrica.analytics.impl.AbstractC0380gb.a(jSONObject2, "report_request_id", io.appmetrica.analytics.impl.AbstractC0380gb.a(jSONObject, "report_request_id", -1)));
        jSONObject3.put("global_number", io.appmetrica.analytics.coreutils.internal.parsing.JsonUtils.optLongOrDefault(jSONObject2, "global_number", io.appmetrica.analytics.coreutils.internal.parsing.JsonUtils.optLongOrDefault(jSONObject, "global_number", 0L)));
        jSONObject3.put("session_id", io.appmetrica.analytics.coreutils.internal.parsing.JsonUtils.optLongOrDefault(jSONObject2, "session_id", io.appmetrica.analytics.coreutils.internal.parsing.JsonUtils.optLongOrDefault(jSONObject, "session_id", -1L)));
        jSONObject3.put("referrer_handled", io.appmetrica.analytics.coreutils.internal.parsing.JsonUtils.optBooleanOrNullable(jSONObject2, "referrer_handled", io.appmetrica.analytics.coreutils.internal.parsing.JsonUtils.optBooleanOrNullable(jSONObject, "referrer_handled", bool)));
        jSONObject3.put("numbers_of_type", io.appmetrica.analytics.coreutils.internal.parsing.JsonUtils.optJsonObjectOrNullable(jSONObject2, "numbers_of_type", io.appmetrica.analytics.coreutils.internal.parsing.JsonUtils.optJsonObjectOrNull(jSONObject, "numbers_of_type")));
        jSONObject3.put("open_id", io.appmetrica.analytics.impl.AbstractC0380gb.a(jSONObject2, "open_id", io.appmetrica.analytics.impl.AbstractC0380gb.a(jSONObject, "open_id", 1)));
        jSONObject3.put("attribution_id", io.appmetrica.analytics.impl.AbstractC0380gb.a(jSONObject2, "attribution_id", io.appmetrica.analytics.impl.AbstractC0380gb.a(jSONObject, "attribution_id", 1)));
        jSONObject3.put("last_migration_api_level", io.appmetrica.analytics.impl.AbstractC0380gb.a(jSONObject2, "last_migration_api_level", io.appmetrica.analytics.impl.AbstractC0380gb.a(jSONObject, "last_migration_api_level", 0)));
        jSONObject3.put("external_attribution_window_start", io.appmetrica.analytics.coreutils.internal.parsing.JsonUtils.optLongOrDefault(jSONObject2, "external_attribution_window_start", io.appmetrica.analytics.coreutils.internal.parsing.JsonUtils.optLongOrDefault(jSONObject, "external_attribution_window_start", -1L)));
        return jSONObject3;
    }

    public final synchronized void b(long j2) {
        io.appmetrica.analytics.impl.C0859yo c0859yo = this.f7123a;
        c0859yo.a(c0859yo.a().put("session_id", j2));
    }

    public final synchronized boolean c() {
        return this.f7123a.a().optBoolean("first_event_done", false);
    }

    public final synchronized boolean d() {
        return this.f7123a.a().optBoolean("init_event_done", false);
    }

    public final synchronized int b() {
        return this.f7123a.a().optInt("open_id", 1);
    }

    public final synchronized void c(int i2) {
        io.appmetrica.analytics.impl.C0859yo c0859yo = this.f7123a;
        c0859yo.a(c0859yo.a().put("open_id", i2));
    }

    public final synchronized void b(int i2) {
        io.appmetrica.analytics.impl.C0859yo c0859yo = this.f7123a;
        c0859yo.a(c0859yo.a().put("last_migration_api_level", i2));
    }

    public final synchronized int a() {
        return this.f7123a.a().optInt("attribution_id", 1);
    }

    public final synchronized void a(int i2) {
        io.appmetrica.analytics.impl.C0859yo c0859yo = this.f7123a;
        c0859yo.a(c0859yo.a().put("attribution_id", i2));
    }

    public final synchronized void a(long j2) {
        io.appmetrica.analytics.impl.C0859yo c0859yo = this.f7123a;
        c0859yo.a(c0859yo.a().put("external_attribution_window_start", j2));
    }
}
