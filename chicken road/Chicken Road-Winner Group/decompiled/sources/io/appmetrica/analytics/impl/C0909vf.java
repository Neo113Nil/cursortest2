package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.parsing.JsonUtils;
import io.appmetrica.analytics.modulesapi.internal.client.adrevenue.AdRevenueConstants;
import org.json.JSONObject;

/* renamed from: io.appmetrica.analytics.impl.vf, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0909vf implements Z7 {

    /* renamed from: a, reason: collision with root package name */
    public final String f8514a;

    /* renamed from: b, reason: collision with root package name */
    public final JSONObject f8515b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f8516c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f8517d;

    /* renamed from: e, reason: collision with root package name */
    public final Y7 f8518e;

    public C0909vf(String str, JSONObject jSONObject, boolean z3, boolean z4, Y7 y7) {
        this.f8514a = str;
        this.f8515b = jSONObject;
        this.f8516c = z3;
        this.f8517d = z4;
        this.f8518e = y7;
    }

    @Override // io.appmetrica.analytics.impl.Z7
    public final Y7 a() {
        return this.f8518e;
    }

    public final JSONObject b() {
        if (!this.f8516c) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("trackingId", this.f8514a);
            if (this.f8515b.length() > 0) {
                jSONObject.put("additionalParams", this.f8515b);
            }
        } catch (Throwable unused) {
        }
        return jSONObject;
    }

    public final JSONObject c() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("trackingId", this.f8514a);
            jSONObject.put("additionalParams", this.f8515b);
            jSONObject.put("wasSet", this.f8516c);
            jSONObject.put("autoTracking", this.f8517d);
            jSONObject.put(AdRevenueConstants.SOURCE_KEY, this.f8518e.f6857a);
        } catch (Throwable unused) {
        }
        return jSONObject;
    }

    public final String toString() {
        return "PreloadInfoState{trackingId='" + this.f8514a + "', additionalParameters=" + this.f8515b + ", wasSet=" + this.f8516c + ", autoTrackingEnabled=" + this.f8517d + ", source=" + this.f8518e + '}';
    }

    public static C0909vf a(JSONObject jSONObject) {
        Y7 y7;
        String optStringOrNull = JsonUtils.optStringOrNull(jSONObject, "trackingId");
        JSONObject optJsonObjectOrDefault = JsonUtils.optJsonObjectOrDefault(jSONObject, "additionalParams", new JSONObject());
        int i3 = 0;
        boolean optBooleanOrDefault = JsonUtils.optBooleanOrDefault(jSONObject, "wasSet", false);
        boolean optBooleanOrDefault2 = JsonUtils.optBooleanOrDefault(jSONObject, "autoTracking", false);
        String optStringOrNull2 = JsonUtils.optStringOrNull(jSONObject, AdRevenueConstants.SOURCE_KEY);
        Y7[] values = Y7.values();
        int length = values.length;
        while (true) {
            if (i3 >= length) {
                y7 = null;
                break;
            }
            y7 = values[i3];
            if (kotlin.jvm.internal.j.a(y7.f6857a, optStringOrNull2)) {
                break;
            }
            i3++;
        }
        if (y7 == null) {
            y7 = Y7.f6853b;
        }
        return new C0909vf(optStringOrNull, optJsonObjectOrDefault, optBooleanOrDefault, optBooleanOrDefault2, y7);
    }
}
