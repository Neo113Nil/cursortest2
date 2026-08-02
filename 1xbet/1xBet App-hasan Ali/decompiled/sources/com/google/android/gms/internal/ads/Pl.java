package com.google.android.gms.internal.ads;

import org.json.JSONObject;

/* loaded from: classes.dex */
public final class Pl {

    /* renamed from: a, reason: collision with root package name */
    public final String f11105a;

    /* renamed from: b, reason: collision with root package name */
    public final String f11106b;

    /* renamed from: c, reason: collision with root package name */
    public final String f11107c;

    /* renamed from: d, reason: collision with root package name */
    public final int f11108d;

    /* renamed from: e, reason: collision with root package name */
    public final String f11109e;
    public final int f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f11110g;

    public Pl(String str, String str2, String str3, int i, String str4, int i5, boolean z3) {
        this.f11105a = str;
        this.f11106b = str2;
        this.f11107c = str3;
        this.f11108d = i;
        this.f11109e = str4;
        this.f = i5;
        this.f11110g = z3;
    }

    public final JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("adapterClassName", this.f11105a);
        jSONObject.put("version", this.f11107c);
        A7 a7 = F7.V8;
        Q2.r rVar = Q2.r.f5053d;
        if (((Boolean) rVar.f5056c.a(a7)).booleanValue()) {
            jSONObject.put("sdkVersion", this.f11106b);
        }
        jSONObject.put("status", this.f11108d);
        jSONObject.put("description", this.f11109e);
        jSONObject.put("initializationLatencyMillis", this.f);
        if (((Boolean) rVar.f5056c.a(F7.W8)).booleanValue()) {
            jSONObject.put("supportsInitialization", this.f11110g);
        }
        return jSONObject;
    }
}
