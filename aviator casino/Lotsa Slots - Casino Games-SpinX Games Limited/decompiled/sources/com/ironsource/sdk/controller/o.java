package com.ironsource.sdk.controller;

/* loaded from: classes5.dex */
public class o {
    private static final java.lang.String c = "o";
    private static final java.lang.String d = "activate";
    private static final java.lang.String e = "startSession";
    private static final java.lang.String f = "finishSession";
    private static final java.lang.String g = "impressionOccurred";
    private static final java.lang.String h = "getOmidData";
    private static final java.lang.String i = "omidFunction";
    private static final java.lang.String j = "omidParams";
    private static final java.lang.String k = "success";
    private static final java.lang.String l = "fail";
    private static final java.lang.String m = "%s | unsupported OMID API";

    /* renamed from: a, reason: collision with root package name */
    private final android.content.Context f6656a;
    private final com.ironsource.Fc b = new com.ironsource.Fc();

    private static class a {

        /* renamed from: a, reason: collision with root package name */
        java.lang.String f6657a;
        org.json.JSONObject b;
        java.lang.String c;
        java.lang.String d;

        private a() {
        }
    }

    public o(android.content.Context context) {
        this.f6656a = context;
    }

    void a(java.lang.String str, com.ironsource.InterfaceC3168ma interfaceC3168ma) throws java.lang.Exception {
        char c2;
        com.ironsource.sdk.controller.o.a a2 = a(str);
        com.ironsource.C3101ie c3101ie = new com.ironsource.C3101ie();
        org.json.JSONObject jSONObject = a2.b;
        if (jSONObject != null) {
            java.lang.String optString = jSONObject.optString("adViewId", "");
            if (!android.text.TextUtils.isEmpty(optString)) {
                c3101ie.b("adViewId", optString);
            }
        }
        try {
            java.lang.String str2 = a2.f6657a;
            switch (str2.hashCode()) {
                case -1655974669:
                    if (str2.equals("activate")) {
                        c2 = 0;
                        break;
                    }
                    c2 = 65535;
                    break;
                case -984459207:
                    if (str2.equals(h)) {
                        c2 = 4;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 70701699:
                    if (str2.equals(f)) {
                        c2 = 2;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 1208109646:
                    if (str2.equals(g)) {
                        c2 = 3;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 1850541012:
                    if (str2.equals(e)) {
                        c2 = 1;
                        break;
                    }
                    c2 = 65535;
                    break;
                default:
                    c2 = 65535;
                    break;
            }
            if (c2 == 0) {
                this.b.a(this.f6656a);
                c3101ie = this.b.a();
            } else if (c2 == 1) {
                this.b.d(a2.b);
            } else if (c2 == 2) {
                this.b.b(a2.b);
            } else if (c2 == 3) {
                this.b.c(a2.b);
            } else {
                if (c2 != 4) {
                    throw new java.lang.IllegalArgumentException(java.lang.String.format(m, a2.f6657a));
                }
                c3101ie = this.b.a();
            }
            interfaceC3168ma.a(true, a2.c, c3101ie);
        } catch (java.lang.Exception e2) {
            com.ironsource.C3180n4.d().a(e2);
            c3101ie.b("errMsg", e2.getMessage());
            com.ironsource.sdk.utils.Logger.i(c, "OMIDJSAdapter " + a2.f6657a + " Exception: " + e2.getMessage());
            interfaceC3168ma.a(false, a2.d, c3101ie);
        }
    }

    private com.ironsource.sdk.controller.o.a a(java.lang.String str) throws org.json.JSONException {
        org.json.JSONObject jSONObject = new org.json.JSONObject(str);
        com.ironsource.sdk.controller.o.a aVar = new com.ironsource.sdk.controller.o.a();
        aVar.f6657a = jSONObject.optString(i);
        aVar.b = jSONObject.optJSONObject(j);
        aVar.c = jSONObject.optString("success");
        aVar.d = jSONObject.optString("fail");
        return aVar;
    }
}
