package com.fyber.inneractive.sdk.config;

/* loaded from: classes3.dex */
public final class r0 implements com.fyber.inneractive.sdk.config.s0 {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f3627a;
    public java.lang.String b;
    public com.fyber.inneractive.sdk.config.l0 c;
    public com.fyber.inneractive.sdk.config.o0 d;
    public com.fyber.inneractive.sdk.config.p0 e;
    public com.fyber.inneractive.sdk.config.t0 f;
    public com.fyber.inneractive.sdk.config.u0 g;

    public final java.lang.String toString() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        com.fyber.inneractive.sdk.util.c1.a(jSONObject, "id", this.f3627a);
        com.fyber.inneractive.sdk.util.c1.a(jSONObject, "spotId", this.b);
        com.fyber.inneractive.sdk.util.c1.a(jSONObject, "display", this.c);
        com.fyber.inneractive.sdk.util.c1.a(jSONObject, "monitor", this.d);
        com.fyber.inneractive.sdk.util.c1.a(jSONObject, "native", this.e);
        com.fyber.inneractive.sdk.util.c1.a(jSONObject, "video", this.f);
        com.fyber.inneractive.sdk.util.c1.a(jSONObject, "viewability", this.g);
        return jSONObject.toString();
    }
}
