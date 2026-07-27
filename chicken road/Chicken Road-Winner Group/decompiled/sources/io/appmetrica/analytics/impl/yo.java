package io.appmetrica.analytics.impl;

import android.util.Base64;
import io.appmetrica.analytics.coreutils.internal.parsing.JsonUtils;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class yo {

    /* renamed from: a, reason: collision with root package name */
    public final Ao f8651a;

    public yo(C0469ef c0469ef, C0568ia c0568ia) {
        this.f8651a = new Ao(c0469ef, c0568ia, new A0.r(16));
    }

    public static final JSONObject a(JSONObject jSONObject, JSONObject jSONObject2) {
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.put("device_id", JsonUtils.optStringOrNullable(jSONObject2, "device_id", JsonUtils.optStringOrNull(jSONObject, "device_id")));
        jSONObject3.put("device_id_hash", JsonUtils.optStringOrNullable(jSONObject2, "device_id_hash", JsonUtils.optStringOrNull(jSONObject, "device_id_hash")));
        jSONObject3.put("referrer", JsonUtils.optStringOrNullable(jSONObject2, "referrer", JsonUtils.optStringOrNull(jSONObject, "referrer")));
        jSONObject3.put("referrer_checked", JsonUtils.optBooleanOrNullable(jSONObject2, "referrer_checked", JsonUtils.optBooleanOrNullable(jSONObject, "referrer_checked", Boolean.FALSE)));
        jSONObject3.put("last_migration_api_level", AbstractC0698nb.a(jSONObject2, "last_migration_api_level", AbstractC0698nb.a(jSONObject, "last_migration_api_level", -1)));
        return jSONObject3;
    }

    public final synchronized void b(String str) {
        Ao ao = this.f8651a;
        ao.a(ao.a().put("device_id_hash", str));
    }

    public final synchronized boolean c() {
        return this.f8651a.a().optBoolean("referrer_checked", false);
    }

    public final synchronized void d() {
        Ao ao = this.f8651a;
        ao.a(ao.a().put("referrer_checked", true));
    }

    public final synchronized C0832sg b() {
        byte[] decode;
        C0832sg c0832sg;
        String optStringOrNull = JsonUtils.optStringOrNull(this.f8651a.a(), "referrer");
        if (optStringOrNull != null) {
            try {
                decode = Base64.decode(optStringOrNull.getBytes(v2.a.f10417a), 0);
            } catch (Throwable unused) {
            }
            c0832sg = (decode == null || decode.length == 0) ? null : new C0832sg(decode);
        }
        return c0832sg;
    }

    public final synchronized void a(String str) {
        Ao ao = this.f8651a;
        ao.a(ao.a().put("device_id", str));
    }

    public final synchronized String a() {
        return JsonUtils.optStringOrNull(this.f8651a.a(), "device_id_hash");
    }

    public final synchronized void a(C0832sg c0832sg) {
        try {
            Ao ao = this.f8651a;
            ao.a(ao.a().put("referrer", c0832sg != null ? new String(Base64.encode(c0832sg.a(), 0), v2.a.f10417a) : null));
        } catch (Throwable th) {
            throw th;
        }
    }
}
