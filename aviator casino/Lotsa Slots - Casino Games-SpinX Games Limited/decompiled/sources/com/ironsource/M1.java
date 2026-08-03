package com.ironsource;

/* loaded from: classes5.dex */
public final class M1 {

    /* renamed from: a, reason: collision with root package name */
    private final org.json.JSONObject f5818a;
    private final boolean b;
    private final java.lang.String c;
    private final boolean d;
    private final boolean e;
    private final int f;
    private final boolean g;
    private final boolean h;
    private final int i;
    private final boolean j;
    private final boolean k;
    private final org.json.JSONObject l;

    public M1(org.json.JSONObject config) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(config, "config");
        this.f5818a = config;
        this.b = config.optBoolean("isExternalArmEventsEnabled", true);
        java.lang.String optString = config.optString("externalArmEventsUrl", com.ironsource.O5.j);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(optString, "config.optString(EXTERNA…AL_EVENTS_IMPRESSION_URL)");
        this.c = optString;
        this.d = config.optBoolean("sid", true);
        this.e = config.optBoolean("radvid", false);
        this.f = config.optInt("uaeh", 0);
        this.g = config.optBoolean("sharedThreadPool", false);
        this.h = config.optBoolean("sharedThreadPoolADP", true);
        this.i = config.optInt(com.ironsource.M6.V0, -1);
        this.j = config.optBoolean("axal", false);
        this.k = config.optBoolean("psrt", false);
        this.l = config.optJSONObject(com.ironsource.X3.a.c);
    }

    private final org.json.JSONObject a() {
        return this.f5818a;
    }

    public final int b() {
        return this.i;
    }

    public final org.json.JSONObject c() {
        return this.l;
    }

    public final java.lang.String d() {
        return this.c;
    }

    public final boolean e() {
        return this.k;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof com.ironsource.M1) && kotlin.jvm.internal.Intrinsics.areEqual(this.f5818a, ((com.ironsource.M1) obj).f5818a);
    }

    public final boolean f() {
        return this.e;
    }

    public final boolean g() {
        return this.d;
    }

    public final boolean h() {
        return this.g;
    }

    public int hashCode() {
        return this.f5818a.hashCode();
    }

    public final boolean i() {
        return this.h;
    }

    public final int j() {
        return this.f;
    }

    public final boolean k() {
        return this.j;
    }

    public final boolean l() {
        return this.b;
    }

    public java.lang.String toString() {
        return "ApplicationGeneralSettings(config=" + this.f5818a + ")";
    }

    public final com.ironsource.M1 a(org.json.JSONObject config) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(config, "config");
        return new com.ironsource.M1(config);
    }

    public static /* synthetic */ com.ironsource.M1 a(com.ironsource.M1 m1, org.json.JSONObject jSONObject, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            jSONObject = m1.f5818a;
        }
        return m1.a(jSONObject);
    }
}
