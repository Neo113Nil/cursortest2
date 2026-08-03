package com.ironsource.sdk.controller;

/* loaded from: classes5.dex */
public class i {
    private static final java.lang.String c = "i";
    private static final java.lang.String d = "getDeviceData";
    private static final java.lang.String e = "deviceDataFunction";
    private static final java.lang.String f = "deviceDataParams";
    private static final java.lang.String g = "success";
    private static final java.lang.String h = "fail";

    /* renamed from: a, reason: collision with root package name */
    private android.content.Context f6639a;
    private final com.ironsource.InterfaceC3362x7 b = com.ironsource.Jb.Y().a();

    private static class a {

        /* renamed from: a, reason: collision with root package name */
        java.lang.String f6640a;
        org.json.JSONObject b;
        java.lang.String c;
        java.lang.String d;

        private a() {
        }
    }

    public i(android.content.Context context) {
        this.f6639a = context;
    }

    void a(java.lang.String str, com.ironsource.InterfaceC3168ma interfaceC3168ma) throws java.lang.Exception {
        com.ironsource.sdk.controller.i.a a2 = a(str);
        if (d.equals(a2.f6640a)) {
            interfaceC3168ma.a(true, a2.c, a());
            return;
        }
        com.ironsource.sdk.utils.Logger.i(c, "unhandled API request " + str);
    }

    private com.ironsource.C3101ie a() {
        com.ironsource.C3101ie c3101ie = new com.ironsource.C3101ie();
        c3101ie.b(com.ironsource.sdk.utils.SDKUtils.encodeString(com.ironsource.X3.j.i0), com.ironsource.sdk.utils.SDKUtils.encodeString(java.lang.String.valueOf(this.b.j())));
        c3101ie.b(com.ironsource.sdk.utils.SDKUtils.encodeString(com.ironsource.X3.j.j0), com.ironsource.sdk.utils.SDKUtils.encodeString(java.lang.String.valueOf(this.b.r(this.f6639a))));
        c3101ie.b(com.ironsource.sdk.utils.SDKUtils.encodeString(com.ironsource.X3.j.k0), com.ironsource.sdk.utils.SDKUtils.encodeString(java.lang.String.valueOf(this.b.D(this.f6639a))));
        c3101ie.b(com.ironsource.sdk.utils.SDKUtils.encodeString(com.ironsource.X3.j.l0), com.ironsource.sdk.utils.SDKUtils.encodeString(java.lang.String.valueOf(this.b.E(this.f6639a))));
        c3101ie.b(com.ironsource.sdk.utils.SDKUtils.encodeString(com.ironsource.X3.j.m0), com.ironsource.sdk.utils.SDKUtils.encodeString(java.lang.String.valueOf(this.b.f(this.f6639a))));
        c3101ie.b(com.ironsource.sdk.utils.SDKUtils.encodeString(com.ironsource.X3.j.n0), com.ironsource.sdk.utils.SDKUtils.encodeString(java.lang.String.valueOf(this.b.i(this.f6639a))));
        return c3101ie;
    }

    private com.ironsource.sdk.controller.i.a a(java.lang.String str) throws org.json.JSONException {
        org.json.JSONObject jSONObject = new org.json.JSONObject(str);
        com.ironsource.sdk.controller.i.a aVar = new com.ironsource.sdk.controller.i.a();
        aVar.f6640a = jSONObject.optString(e);
        aVar.b = jSONObject.optJSONObject(f);
        aVar.c = jSONObject.optString("success");
        aVar.d = jSONObject.optString("fail");
        return aVar;
    }
}
