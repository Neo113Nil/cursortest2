package com.ironsource;

/* loaded from: classes5.dex */
public class Bf {

    /* renamed from: a, reason: collision with root package name */
    private final org.json.JSONObject f5640a;

    public Bf(org.json.JSONObject jSONObject) {
        this.f5640a = jSONObject == null ? new org.json.JSONObject() : jSONObject;
    }

    public boolean a() {
        return this.f5640a.optBoolean("uxt", false);
    }

    public boolean b() {
        return this.f5640a.optBoolean(com.ironsource.X3.a.o, false);
    }

    public boolean c() {
        return this.f5640a.optBoolean(com.ironsource.X3.a.p, false);
    }

    public boolean d() {
        return this.f5640a.optBoolean(com.ironsource.X3.a.l, false);
    }

    public boolean e() {
        return this.f5640a.optBoolean(com.ironsource.X3.a.n, false);
    }
}
