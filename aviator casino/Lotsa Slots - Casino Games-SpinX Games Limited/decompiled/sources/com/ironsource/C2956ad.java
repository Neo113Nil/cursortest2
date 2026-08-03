package com.ironsource;

/* renamed from: com.ironsource.ad, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2956ad {

    /* renamed from: a, reason: collision with root package name */
    private final java.lang.Boolean f6140a;
    private final java.lang.Integer b;
    private final com.ironsource.H3 c;

    public C2956ad(org.json.JSONObject features) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(features, "features");
        this.f6140a = features.has("enabled") ? java.lang.Boolean.valueOf(features.getBoolean("enabled")) : null;
        this.b = features.has("numOfSeconds") ? java.lang.Integer.valueOf(features.getInt("numOfSeconds")) : null;
        this.c = com.ironsource.H3.Second;
    }

    public final java.lang.Boolean a() {
        return this.f6140a;
    }

    public final java.lang.Integer b() {
        return this.b;
    }

    public final com.ironsource.H3 c() {
        return this.c;
    }
}
