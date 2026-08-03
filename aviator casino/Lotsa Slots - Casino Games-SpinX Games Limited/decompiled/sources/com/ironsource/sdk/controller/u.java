package com.ironsource.sdk.controller;

/* loaded from: classes5.dex */
public class u {
    private static final java.lang.String d = "u";
    private static final java.lang.String e = "updateToken";
    private static final java.lang.String f = "getToken";
    private static final java.lang.String g = "functionName";
    private static final java.lang.String h = "functionParams";
    private static final java.lang.String i = "success";
    private static final java.lang.String j = "fail";
    private android.content.Context b;

    /* renamed from: a, reason: collision with root package name */
    private com.ironsource.C3188nc f6671a = new com.ironsource.C3188nc();
    private com.ironsource.C3102ig c = new com.ironsource.C3102ig();

    private static class a {

        /* renamed from: a, reason: collision with root package name */
        java.lang.String f6672a;
        org.json.JSONObject b;
        java.lang.String c;
        java.lang.String d;

        private a() {
        }
    }

    public u(android.content.Context context) {
        this.b = context;
    }

    private com.ironsource.sdk.controller.u.a a(java.lang.String str) throws org.json.JSONException {
        org.json.JSONObject jSONObject = new org.json.JSONObject(str);
        com.ironsource.sdk.controller.u.a aVar = new com.ironsource.sdk.controller.u.a();
        aVar.f6672a = jSONObject.optString("functionName");
        aVar.b = jSONObject.optJSONObject("functionParams");
        aVar.c = jSONObject.optString("success");
        aVar.d = jSONObject.optString("fail");
        return aVar;
    }

    void a(java.lang.String str, com.ironsource.InterfaceC3168ma interfaceC3168ma) throws java.lang.Exception {
        com.ironsource.sdk.controller.u.a a2 = a(str);
        if (e.equals(a2.f6672a)) {
            a(a2.b, a2, interfaceC3168ma);
            return;
        }
        if (f.equals(a2.f6672a)) {
            a(a2, interfaceC3168ma);
            return;
        }
        com.ironsource.sdk.utils.Logger.i(d, "unhandled API request " + str);
    }

    public void a(org.json.JSONObject jSONObject, com.ironsource.sdk.controller.u.a aVar, com.ironsource.InterfaceC3168ma interfaceC3168ma) {
        com.ironsource.C3101ie c3101ie = new com.ironsource.C3101ie();
        try {
            this.f6671a.a(jSONObject);
            interfaceC3168ma.a(true, aVar.c, c3101ie);
        } catch (java.lang.Exception e2) {
            com.ironsource.C3180n4.d().a(e2);
            com.ironsource.mediationsdk.logger.IronLog.INTERNAL.error(e2.toString());
            com.ironsource.sdk.utils.Logger.i(d, "updateToken exception " + e2.getMessage());
            interfaceC3168ma.a(false, aVar.d, c3101ie);
        }
    }

    private void a(com.ironsource.sdk.controller.u.a aVar, com.ironsource.InterfaceC3168ma interfaceC3168ma) {
        try {
            org.json.JSONObject a2 = this.c.a();
            java.util.Iterator<java.lang.String> keys = a2.keys();
            while (keys.hasNext()) {
                java.lang.String next = keys.next();
                java.lang.Object obj = a2.get(next);
                if (obj instanceof java.lang.String) {
                    a2.put(next, com.ironsource.environment.StringUtils.encodeURI((java.lang.String) obj));
                }
            }
            interfaceC3168ma.a(true, aVar.c, a2);
        } catch (java.lang.Exception e2) {
            com.ironsource.C3180n4.d().a(e2);
            interfaceC3168ma.a(false, aVar.d, e2.getMessage());
        }
    }
}
