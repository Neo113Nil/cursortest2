package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.qf, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0643qf implements io.appmetrica.analytics.impl.T7 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f6687a;

    /* renamed from: b, reason: collision with root package name */
    public final org.json.JSONObject f6688b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f6689c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f6690d;

    /* renamed from: e, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.S7 f6691e;

    public C0643qf(java.lang.String str, org.json.JSONObject jSONObject, boolean z2, boolean z3, io.appmetrica.analytics.impl.S7 s7) {
        this.f6687a = str;
        this.f6688b = jSONObject;
        this.f6689c = z2;
        this.f6690d = z3;
        this.f6691e = s7;
    }

    @Override // io.appmetrica.analytics.impl.T7
    public final io.appmetrica.analytics.impl.S7 a() {
        return this.f6691e;
    }

    public final org.json.JSONObject b() {
        if (!this.f6689c) {
            return null;
        }
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put("trackingId", this.f6687a);
            if (this.f6688b.length() <= 0) {
                return jSONObject;
            }
            jSONObject.put("additionalParams", this.f6688b);
            return jSONObject;
        } catch (java.lang.Throwable unused) {
            return jSONObject;
        }
    }

    public final org.json.JSONObject c() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put("trackingId", this.f6687a);
            jSONObject.put("additionalParams", this.f6688b);
            jSONObject.put("wasSet", this.f6689c);
            jSONObject.put("autoTracking", this.f6690d);
            jSONObject.put(io.appmetrica.analytics.modulesapi.internal.client.adrevenue.AdRevenueConstants.SOURCE_KEY, this.f6691e.f4958a);
        } catch (java.lang.Throwable unused) {
        }
        return jSONObject;
    }

    public final java.lang.String toString() {
        return "PreloadInfoState{trackingId='" + this.f6687a + "', additionalParameters=" + this.f6688b + ", wasSet=" + this.f6689c + ", autoTrackingEnabled=" + this.f6690d + ", source=" + this.f6691e + '}';
    }

    public static io.appmetrica.analytics.impl.C0643qf a(org.json.JSONObject jSONObject) {
        io.appmetrica.analytics.impl.S7 s7;
        java.lang.String optStringOrNull = io.appmetrica.analytics.coreutils.internal.parsing.JsonUtils.optStringOrNull(jSONObject, "trackingId");
        org.json.JSONObject optJsonObjectOrDefault = io.appmetrica.analytics.coreutils.internal.parsing.JsonUtils.optJsonObjectOrDefault(jSONObject, "additionalParams", new org.json.JSONObject());
        int i2 = 0;
        boolean optBooleanOrDefault = io.appmetrica.analytics.coreutils.internal.parsing.JsonUtils.optBooleanOrDefault(jSONObject, "wasSet", false);
        boolean optBooleanOrDefault2 = io.appmetrica.analytics.coreutils.internal.parsing.JsonUtils.optBooleanOrDefault(jSONObject, "autoTracking", false);
        java.lang.String optStringOrNull2 = io.appmetrica.analytics.coreutils.internal.parsing.JsonUtils.optStringOrNull(jSONObject, io.appmetrica.analytics.modulesapi.internal.client.adrevenue.AdRevenueConstants.SOURCE_KEY);
        io.appmetrica.analytics.impl.S7[] values = io.appmetrica.analytics.impl.S7.values();
        int length = values.length;
        while (true) {
            if (i2 >= length) {
                s7 = null;
                break;
            }
            s7 = values[i2];
            if (kotlin.jvm.internal.i.a(s7.f4958a, optStringOrNull2)) {
                break;
            }
            i2++;
        }
        return new io.appmetrica.analytics.impl.C0643qf(optStringOrNull, optJsonObjectOrDefault, optBooleanOrDefault, optBooleanOrDefault2, s7 == null ? io.appmetrica.analytics.impl.S7.f4953b : s7);
    }
}
