package com.fyber.inneractive.sdk.config;

import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class w0 implements x0 {

    /* renamed from: a, reason: collision with root package name */
    public String f5293a;
    public String b;
    public q0 c;
    public t0 d;
    public u0 e;
    public y0 f;
    public z0 g;

    public final String toString() {
        JSONObject jSONObject = new JSONObject();
        com.fyber.inneractive.sdk.util.c1.a(jSONObject, "id", this.f5293a);
        com.fyber.inneractive.sdk.util.c1.a(jSONObject, "spotId", this.b);
        com.fyber.inneractive.sdk.util.c1.a(jSONObject, "display", this.c);
        com.fyber.inneractive.sdk.util.c1.a(jSONObject, "monitor", this.d);
        com.fyber.inneractive.sdk.util.c1.a(jSONObject, "native", this.e);
        com.fyber.inneractive.sdk.util.c1.a(jSONObject, "video", this.f);
        com.fyber.inneractive.sdk.util.c1.a(jSONObject, "viewability", this.g);
        return jSONObject.toString();
    }
}
