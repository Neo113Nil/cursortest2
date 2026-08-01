package com.ironsource;

import com.ironsource.U3;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public final class K1 {

    /* renamed from: a, reason: collision with root package name */
    private final JSONObject f7717a;
    private final boolean b;
    private final String c;
    private final boolean d;
    private final boolean e;
    private final int f;
    private final boolean g;
    private final boolean h;
    private final int i;
    private final boolean j;
    private final boolean k;
    private final JSONObject l;
    private final JSONArray m;

    public K1(JSONObject config) {
        Intrinsics.checkNotNullParameter(config, "config");
        this.f7717a = config;
        this.b = config.optBoolean("isExternalArmEventsEnabled", true);
        String optString = config.optString("externalArmEventsUrl", N5.j);
        Intrinsics.checkNotNullExpressionValue(optString, "config.optString(EXTERNA…AL_EVENTS_IMPRESSION_URL)");
        this.c = optString;
        this.d = config.optBoolean("sid", true);
        this.e = config.optBoolean("radvid", false);
        this.f = config.optInt("uaeh", 0);
        this.g = config.optBoolean("sharedThreadPool", false);
        this.h = config.optBoolean("sharedThreadPoolADP", true);
        this.i = config.optInt(L6.V0, -1);
        this.j = config.optBoolean("axal", false);
        this.k = config.optBoolean("psrt", false);
        this.l = config.optJSONObject(U3.a.c);
        this.m = config.optJSONArray("ilrSubscribers");
    }

    private final JSONObject a() {
        return this.f7717a;
    }

    public final int b() {
        return this.i;
    }

    public final JSONObject c() {
        return this.l;
    }

    public final String d() {
        return this.c;
    }

    public final JSONArray e() {
        return this.m;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof K1) && Intrinsics.areEqual(this.f7717a, ((K1) obj).f7717a);
    }

    public final boolean f() {
        return this.k;
    }

    public final boolean g() {
        return this.e;
    }

    public final boolean h() {
        return this.d;
    }

    public int hashCode() {
        return this.f7717a.hashCode();
    }

    public final boolean i() {
        return this.g;
    }

    public final boolean j() {
        return this.h;
    }

    public final int k() {
        return this.f;
    }

    public final boolean l() {
        return this.j;
    }

    public final boolean m() {
        return this.b;
    }

    public String toString() {
        return "ApplicationGeneralSettings(config=" + this.f7717a + ")";
    }

    public final K1 a(JSONObject config) {
        Intrinsics.checkNotNullParameter(config, "config");
        return new K1(config);
    }

    public static /* synthetic */ K1 a(K1 k1, JSONObject jSONObject, int i, Object obj) {
        if ((i & 1) != 0) {
            jSONObject = k1.f7717a;
        }
        return k1.a(jSONObject);
    }
}
