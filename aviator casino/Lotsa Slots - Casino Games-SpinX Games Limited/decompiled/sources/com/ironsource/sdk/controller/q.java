package com.ironsource.sdk.controller;

/* loaded from: classes5.dex */
public class q {
    private static final java.lang.String b = "q";
    private static final java.lang.String c = "getPermissions";
    private static final java.lang.String d = "isPermissionGranted";
    private static final java.lang.String e = "permissions";
    private static final java.lang.String f = "permission";
    private static final java.lang.String g = "status";
    private static final java.lang.String h = "functionName";
    private static final java.lang.String i = "functionParams";
    private static final java.lang.String j = "success";
    private static final java.lang.String k = "fail";
    private static final java.lang.String l = "unhandledPermission";

    /* renamed from: a, reason: collision with root package name */
    private android.content.Context f6665a;

    private static class a {

        /* renamed from: a, reason: collision with root package name */
        java.lang.String f6666a;
        org.json.JSONObject b;
        java.lang.String c;
        java.lang.String d;

        private a() {
        }
    }

    public q(android.content.Context context) {
        this.f6665a = context;
    }

    private com.ironsource.sdk.controller.q.a a(java.lang.String str) throws org.json.JSONException {
        org.json.JSONObject jSONObject = new org.json.JSONObject(str);
        com.ironsource.sdk.controller.q.a aVar = new com.ironsource.sdk.controller.q.a();
        aVar.f6666a = jSONObject.optString("functionName");
        aVar.b = jSONObject.optJSONObject("functionParams");
        aVar.c = jSONObject.optString("success");
        aVar.d = jSONObject.optString("fail");
        return aVar;
    }

    public void b(org.json.JSONObject jSONObject, com.ironsource.sdk.controller.q.a aVar, com.ironsource.InterfaceC3168ma interfaceC3168ma) {
        com.ironsource.C3101ie c3101ie = new com.ironsource.C3101ie();
        try {
            java.lang.String string = jSONObject.getString(f);
            c3101ie.b(f, string);
            if (com.ironsource.E1.d(this.f6665a, string)) {
                c3101ie.b("status", java.lang.String.valueOf(com.ironsource.E1.c(this.f6665a, string)));
                interfaceC3168ma.a(true, aVar.c, c3101ie);
            } else {
                c3101ie.b("status", l);
                interfaceC3168ma.a(false, aVar.d, c3101ie);
            }
        } catch (java.lang.Exception e2) {
            com.ironsource.C3180n4.d().a(e2);
            com.ironsource.mediationsdk.logger.IronLog.INTERNAL.error(e2.toString());
            c3101ie.b("errMsg", e2.getMessage());
            interfaceC3168ma.a(false, aVar.d, c3101ie);
        }
    }

    void a(java.lang.String str, com.ironsource.InterfaceC3168ma interfaceC3168ma) throws java.lang.Exception {
        com.ironsource.sdk.controller.q.a a2 = a(str);
        if (c.equals(a2.f6666a)) {
            a(a2.b, a2, interfaceC3168ma);
            return;
        }
        if (d.equals(a2.f6666a)) {
            b(a2.b, a2, interfaceC3168ma);
            return;
        }
        com.ironsource.sdk.utils.Logger.i(b, "PermissionsJSAdapter unhandled API request " + str);
    }

    public void a(org.json.JSONObject jSONObject, com.ironsource.sdk.controller.q.a aVar, com.ironsource.InterfaceC3168ma interfaceC3168ma) {
        com.ironsource.C3101ie c3101ie = new com.ironsource.C3101ie();
        try {
            c3101ie.a("permissions", com.ironsource.E1.a(this.f6665a, jSONObject.getJSONArray("permissions")));
            interfaceC3168ma.a(true, aVar.c, c3101ie);
        } catch (java.lang.Exception e2) {
            com.ironsource.C3180n4.d().a(e2);
            com.ironsource.mediationsdk.logger.IronLog.INTERNAL.error(e2.toString());
            com.ironsource.sdk.utils.Logger.i(b, "PermissionsJSAdapter getPermissions JSON Exception when getting permissions parameter " + e2.getMessage());
            c3101ie.b("errMsg", e2.getMessage());
            interfaceC3168ma.a(false, aVar.d, c3101ie);
        }
    }
}
