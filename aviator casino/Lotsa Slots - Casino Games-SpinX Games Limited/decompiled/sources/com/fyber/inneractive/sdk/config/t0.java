package com.fyber.inneractive.sdk.config;

/* loaded from: classes3.dex */
public final class t0 implements com.fyber.inneractive.sdk.util.b1 {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.Boolean f3638a;
    public java.lang.Integer b;
    public java.lang.Integer c;
    public java.lang.Boolean d;
    public com.fyber.inneractive.sdk.config.enums.Orientation e;
    public java.lang.Integer f;
    public java.lang.Integer g;
    public com.fyber.inneractive.sdk.config.enums.Skip h;
    public com.fyber.inneractive.sdk.config.enums.TapAction i;
    public com.fyber.inneractive.sdk.config.enums.UnitDisplayType j;
    public java.util.List k;

    public t0() {
        java.lang.Boolean bool = java.lang.Boolean.TRUE;
        this.f3638a = bool;
        this.b = 5000;
        this.c = 0;
        this.d = bool;
        this.f = 0;
        this.g = 2048;
        this.h = com.fyber.inneractive.sdk.config.enums.Skip.fromValue(0);
        this.k = new java.util.ArrayList();
    }

    @Override // com.fyber.inneractive.sdk.util.b1
    public final org.json.JSONObject a() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        com.fyber.inneractive.sdk.util.c1.a(jSONObject, "autoPlay", this.f3638a);
        com.fyber.inneractive.sdk.util.c1.a(jSONObject, "maxBitrate", this.b);
        com.fyber.inneractive.sdk.util.c1.a(jSONObject, "minBitrate", this.c);
        com.fyber.inneractive.sdk.util.c1.a(jSONObject, "muted", this.d);
        com.fyber.inneractive.sdk.util.c1.a(jSONObject, "orientation", this.e);
        com.fyber.inneractive.sdk.util.c1.a(jSONObject, com.helpshift.proactive.InAppViewConstants.PADDING, this.f);
        com.fyber.inneractive.sdk.util.c1.a(jSONObject, "pivotBitrate", this.g);
        com.fyber.inneractive.sdk.util.c1.a(jSONObject, "skip", this.h);
        com.fyber.inneractive.sdk.util.c1.a(jSONObject, "tapAction", this.i);
        com.fyber.inneractive.sdk.util.c1.a(jSONObject, "unitDisplayType", this.j);
        org.json.JSONArray jSONArray = new org.json.JSONArray();
        java.util.List<java.lang.Integer> list = this.k;
        if (list != null) {
            for (java.lang.Integer num : list) {
                if (num != null) {
                    jSONArray.put(num);
                }
            }
        }
        com.fyber.inneractive.sdk.util.c1.a(jSONObject, "filterApi", jSONArray);
        return jSONObject;
    }
}
