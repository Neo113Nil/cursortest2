package com.ironsource;

/* loaded from: classes5.dex */
public final class C3 {

    /* renamed from: a, reason: collision with root package name */
    private final java.lang.Boolean f5645a;
    private final java.lang.Integer b;
    private final com.ironsource.H3 c;

    public C3(org.json.JSONObject features) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(features, "features");
        this.f5645a = features.has("enabled") ? java.lang.Boolean.valueOf(features.getBoolean("enabled")) : null;
        this.b = features.has("maxImpressions") ? java.lang.Integer.valueOf(features.getInt("maxImpressions")) : null;
        this.c = features.has("unit") ? com.ironsource.H3.c.a(features.optString("unit")) : null;
    }

    public final java.lang.Boolean a() {
        return this.f5645a;
    }

    public final java.lang.Integer b() {
        return this.b;
    }

    public final com.ironsource.H3 c() {
        return this.c;
    }
}
