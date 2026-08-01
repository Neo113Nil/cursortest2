package com.ironsource;

import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* renamed from: com.ironsource.z3, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C4759z3 {

    /* renamed from: a, reason: collision with root package name */
    private final Boolean f8788a;
    private final Integer b;
    private final E3 c;

    public C4759z3(JSONObject features) {
        Intrinsics.checkNotNullParameter(features, "features");
        this.f8788a = features.has("enabled") ? Boolean.valueOf(features.getBoolean("enabled")) : null;
        this.b = features.has("maxImpressions") ? Integer.valueOf(features.getInt("maxImpressions")) : null;
        this.c = features.has("unit") ? E3.c.a(features.optString("unit")) : null;
    }

    public final Boolean a() {
        return this.f8788a;
    }

    public final Integer b() {
        return this.b;
    }

    public final E3 c() {
        return this.c;
    }
}
