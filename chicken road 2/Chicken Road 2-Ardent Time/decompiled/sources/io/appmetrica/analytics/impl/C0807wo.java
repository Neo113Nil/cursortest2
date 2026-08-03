package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.wo, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0807wo {

    /* renamed from: a, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.C0859yo f7070a;

    public C0807wo(io.appmetrica.analytics.impl.Ze ze, io.appmetrica.analytics.impl.C0250ba c0250ba) {
        this.f7070a = new io.appmetrica.analytics.impl.C0859yo(ze, c0250ba, new H0.b(20));
    }

    public static final org.json.JSONObject a(org.json.JSONObject jSONObject, org.json.JSONObject jSONObject2) {
        org.json.JSONObject jSONObject3 = new org.json.JSONObject();
        jSONObject3.put("device_id", io.appmetrica.analytics.coreutils.internal.parsing.JsonUtils.optStringOrNullable(jSONObject2, "device_id", io.appmetrica.analytics.coreutils.internal.parsing.JsonUtils.optStringOrNull(jSONObject, "device_id")));
        jSONObject3.put("device_id_hash", io.appmetrica.analytics.coreutils.internal.parsing.JsonUtils.optStringOrNullable(jSONObject2, "device_id_hash", io.appmetrica.analytics.coreutils.internal.parsing.JsonUtils.optStringOrNull(jSONObject, "device_id_hash")));
        jSONObject3.put("referrer", io.appmetrica.analytics.coreutils.internal.parsing.JsonUtils.optStringOrNullable(jSONObject2, "referrer", io.appmetrica.analytics.coreutils.internal.parsing.JsonUtils.optStringOrNull(jSONObject, "referrer")));
        jSONObject3.put("referrer_checked", io.appmetrica.analytics.coreutils.internal.parsing.JsonUtils.optBooleanOrNullable(jSONObject2, "referrer_checked", io.appmetrica.analytics.coreutils.internal.parsing.JsonUtils.optBooleanOrNullable(jSONObject, "referrer_checked", java.lang.Boolean.FALSE)));
        jSONObject3.put("last_migration_api_level", io.appmetrica.analytics.impl.AbstractC0380gb.a(jSONObject2, "last_migration_api_level", io.appmetrica.analytics.impl.AbstractC0380gb.a(jSONObject, "last_migration_api_level", -1)));
        return jSONObject3;
    }

    public final synchronized void b(java.lang.String str) {
        io.appmetrica.analytics.impl.C0859yo c0859yo = this.f7070a;
        c0859yo.a(c0859yo.a().put("device_id_hash", str));
    }

    public final synchronized boolean c() {
        return this.f7070a.a().optBoolean("referrer_checked", false);
    }

    public final synchronized void d() {
        io.appmetrica.analytics.impl.C0859yo c0859yo = this.f7070a;
        c0859yo.a(c0859yo.a().put("referrer_checked", true));
    }

    public final synchronized io.appmetrica.analytics.impl.C0566ng b() {
        byte[] decode;
        io.appmetrica.analytics.impl.C0566ng c0566ng;
        java.lang.String optStringOrNull = io.appmetrica.analytics.coreutils.internal.parsing.JsonUtils.optStringOrNull(this.f7070a.a(), "referrer");
        if (optStringOrNull != null) {
            try {
                decode = android.util.Base64.decode(optStringOrNull.getBytes(y1.a.f8486a), 0);
            } catch (java.lang.Throwable unused) {
            }
            c0566ng = (decode == null || decode.length == 0) ? null : new io.appmetrica.analytics.impl.C0566ng(decode);
        }
        return c0566ng;
    }

    public final synchronized void a(java.lang.String str) {
        io.appmetrica.analytics.impl.C0859yo c0859yo = this.f7070a;
        c0859yo.a(c0859yo.a().put("device_id", str));
    }

    public final synchronized java.lang.String a() {
        return io.appmetrica.analytics.coreutils.internal.parsing.JsonUtils.optStringOrNull(this.f7070a.a(), "device_id_hash");
    }

    public final synchronized void a(io.appmetrica.analytics.impl.C0566ng c0566ng) {
        try {
            io.appmetrica.analytics.impl.C0859yo c0859yo = this.f7070a;
            c0859yo.a(c0859yo.a().put("referrer", c0566ng != null ? new java.lang.String(android.util.Base64.encode(c0566ng.a(), 0), y1.a.f8486a) : null));
        } catch (java.lang.Throwable th) {
            throw th;
        }
    }
}
