package com.ironsource;

/* renamed from: com.ironsource.we, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3351we {

    /* renamed from: a, reason: collision with root package name */
    private final com.ironsource.Ve f6807a;
    private final com.ironsource.Fd b;
    private final com.ironsource.Jd c;
    private final com.ironsource.O3 d;
    private final com.ironsource.L5 e;

    public C3351we(com.ironsource.Ve fullResponse) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fullResponse, "fullResponse");
        this.f6807a = fullResponse;
        org.json.JSONObject optJSONObject = fullResponse.j().optJSONObject(com.ironsource.C3369xe.f6841a);
        this.b = new com.ironsource.Fd(optJSONObject == null ? new org.json.JSONObject() : optJSONObject);
        org.json.JSONObject optJSONObject2 = fullResponse.j().optJSONObject(com.ironsource.C3369xe.b);
        this.c = new com.ironsource.Jd(optJSONObject2 == null ? new org.json.JSONObject() : optJSONObject2);
        org.json.JSONObject optJSONObject3 = fullResponse.j().optJSONObject("configurations");
        this.d = new com.ironsource.O3(optJSONObject3 == null ? new org.json.JSONObject() : optJSONObject3);
        org.json.JSONObject optJSONObject4 = fullResponse.j().optJSONObject(com.ironsource.C3369xe.d);
        this.e = new com.ironsource.L5(optJSONObject4 == null ? new org.json.JSONObject() : optJSONObject4);
    }

    public final com.ironsource.O3 a() {
        return this.d;
    }

    public final com.ironsource.L5 b() {
        return this.e;
    }

    public final com.ironsource.Ve c() {
        return this.f6807a;
    }

    public final com.ironsource.Fd d() {
        return this.b;
    }

    public final com.ironsource.Jd e() {
        return this.c;
    }
}
