package com.ironsource;

import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* renamed from: com.ironsource.z1, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C4757z1 {

    /* renamed from: a, reason: collision with root package name */
    private final Eb f8786a;
    private final G1 b;
    private final boolean c;
    private final D1 d;
    private final K1 e;
    private final C4721x1 f;

    public C4757z1(JSONObject applicationConfigurations) {
        Intrinsics.checkNotNullParameter(applicationConfigurations, "applicationConfigurations");
        JSONObject optJSONObject = applicationConfigurations.optJSONObject(B1.f7562a);
        this.f8786a = new Eb(optJSONObject == null ? new JSONObject() : optJSONObject);
        JSONObject optJSONObject2 = applicationConfigurations.optJSONObject("events");
        this.b = new G1(optJSONObject2 == null ? new JSONObject() : optJSONObject2);
        this.c = applicationConfigurations.optBoolean(B1.g, false);
        JSONObject optJSONObject3 = applicationConfigurations.optJSONObject(B1.h);
        this.d = new D1(optJSONObject3 == null ? new JSONObject() : optJSONObject3);
        JSONObject optJSONObject4 = applicationConfigurations.optJSONObject("settings");
        this.e = new K1(optJSONObject4 == null ? new JSONObject() : optJSONObject4);
        JSONObject optJSONObject5 = applicationConfigurations.optJSONObject(B1.f);
        this.f = new C4721x1(optJSONObject5 == null ? new JSONObject() : optJSONObject5);
    }

    public final C4721x1 a() {
        return this.f;
    }

    public final D1 b() {
        return this.d;
    }

    public final G1 c() {
        return this.b;
    }

    public final K1 d() {
        return this.e;
    }

    public final boolean e() {
        return this.c;
    }

    public final Eb f() {
        return this.f8786a;
    }
}
