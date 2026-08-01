package com.ironsource;

import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* renamed from: com.ironsource.ad, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C4296ad {

    /* renamed from: a, reason: collision with root package name */
    private final Boolean f8080a;
    private final Integer b;
    private final E3 c;

    public C4296ad(JSONObject features) {
        Intrinsics.checkNotNullParameter(features, "features");
        this.f8080a = features.has("enabled") ? Boolean.valueOf(features.getBoolean("enabled")) : null;
        this.b = features.has("numOfSeconds") ? Integer.valueOf(features.getInt("numOfSeconds")) : null;
        this.c = E3.Second;
    }

    public final Boolean a() {
        return this.f8080a;
    }

    public final Integer b() {
        return this.b;
    }

    public final E3 c() {
        return this.c;
    }
}
