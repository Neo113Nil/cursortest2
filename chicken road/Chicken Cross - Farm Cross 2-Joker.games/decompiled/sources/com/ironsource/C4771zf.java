package com.ironsource;

import com.ironsource.U3;
import org.json.JSONObject;

/* renamed from: com.ironsource.zf, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C4771zf {

    /* renamed from: a, reason: collision with root package name */
    private final JSONObject f8801a;

    public C4771zf(JSONObject jSONObject) {
        this.f8801a = jSONObject == null ? new JSONObject() : jSONObject;
    }

    public boolean a() {
        return this.f8801a.optBoolean("uxt", false);
    }

    public boolean b() {
        return this.f8801a.optBoolean(U3.a.o, false);
    }

    public boolean c() {
        return this.f8801a.optBoolean(U3.a.p, false);
    }

    public boolean d() {
        return this.f8801a.optBoolean(U3.a.l, false);
    }

    public boolean e() {
        return this.f8801a.optBoolean(U3.a.n, false);
    }
}
