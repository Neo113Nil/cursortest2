package com.ironsource.sdk.controller;

/* loaded from: classes5.dex */
public class a implements com.ironsource.InterfaceC3059g8 {
    private static final java.lang.String d = "loadWithUrl";
    private static final java.lang.String e = "sendMessage";
    public static final java.lang.String f = "removeAdView";
    public static final java.lang.String g = "webviewAction";
    public static final java.lang.String h = "handleGetViewVisibility";
    private static final java.lang.String i = "functionName";
    private static final java.lang.String j = "functionParams";
    private static final java.lang.String k = "success";
    private static final java.lang.String l = "fail";
    public static final java.lang.String m = "errMsg";
    private static final java.lang.String n = "%s | unsupported AdViews API";

    /* renamed from: a, reason: collision with root package name */
    private com.ironsource.ah f6604a;
    private com.ironsource.C3148l8 b = com.ironsource.C3148l8.a();
    private android.content.Context c;

    /* renamed from: com.ironsource.sdk.controller.a$a, reason: collision with other inner class name */
    private static class C0160a {

        /* renamed from: a, reason: collision with root package name */
        java.lang.String f6605a;
        org.json.JSONObject b;
        java.lang.String c;
        java.lang.String d;

        private C0160a() {
        }
    }

    public a(android.content.Context context) {
        this.c = context;
    }

    public void a(com.ironsource.ah ahVar) {
        this.f6604a = ahVar;
    }

    @Override // com.ironsource.InterfaceC3059g8
    public void a(java.lang.String str, org.json.JSONObject jSONObject) {
        if (this.f6604a == null || android.text.TextUtils.isEmpty(str)) {
            return;
        }
        this.f6604a.a(str, jSONObject);
    }

    @Override // com.ironsource.InterfaceC3059g8
    public void a(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        a(str, com.ironsource.Dg.a(str2, str3));
    }

    void a(java.lang.String str, com.ironsource.InterfaceC3168ma interfaceC3168ma) throws java.lang.Exception {
        char c;
        com.ironsource.sdk.controller.a.C0160a a2 = a(str);
        com.ironsource.C3101ie c3101ie = new com.ironsource.C3101ie();
        try {
            java.lang.String str2 = a2.f6605a;
            switch (str2.hashCode()) {
                case -1384357108:
                    if (str2.equals(f)) {
                        c = 2;
                        break;
                    }
                    c = 65535;
                    break;
                case 691453791:
                    if (str2.equals("sendMessage")) {
                        c = 1;
                        break;
                    }
                    c = 65535;
                    break;
                case 842351363:
                    if (str2.equals("loadWithUrl")) {
                        c = 0;
                        break;
                    }
                    c = 65535;
                    break;
                case 1182065477:
                    if (str2.equals("handleGetViewVisibility")) {
                        c = 3;
                        break;
                    }
                    c = 65535;
                    break;
                case 1491535759:
                    if (str2.equals(g)) {
                        c = 4;
                        break;
                    }
                    c = 65535;
                    break;
                default:
                    c = 65535;
                    break;
            }
            if (c == 0) {
                this.b.a(this, a2.b, this.c, a2.c, a2.d);
                return;
            }
            if (c == 1) {
                this.b.d(a2.b, a2.c, a2.d);
                return;
            }
            if (c == 2) {
                this.b.c(a2.b, a2.c, a2.d);
            } else if (c == 3) {
                this.b.a(a2.b, a2.c, a2.d);
            } else {
                if (c != 4) {
                    throw new java.lang.IllegalArgumentException(java.lang.String.format(n, a2.f6605a));
                }
                this.b.b(a2.b, a2.c, a2.d);
            }
        } catch (java.lang.Exception e2) {
            com.ironsource.C3180n4.d().a(e2);
            c3101ie.b("errMsg", e2.getMessage());
            java.lang.String c2 = this.b.c(a2.b);
            if (!android.text.TextUtils.isEmpty(c2)) {
                c3101ie.b("adViewId", c2);
            }
            interfaceC3168ma.a(false, a2.d, c3101ie);
        }
    }

    private com.ironsource.sdk.controller.a.C0160a a(java.lang.String str) throws org.json.JSONException {
        org.json.JSONObject jSONObject = new org.json.JSONObject(str);
        com.ironsource.sdk.controller.a.C0160a c0160a = new com.ironsource.sdk.controller.a.C0160a();
        c0160a.f6605a = jSONObject.optString("functionName");
        c0160a.b = jSONObject.optJSONObject("functionParams");
        c0160a.c = jSONObject.optString("success");
        c0160a.d = jSONObject.optString("fail");
        return c0160a;
    }
}
