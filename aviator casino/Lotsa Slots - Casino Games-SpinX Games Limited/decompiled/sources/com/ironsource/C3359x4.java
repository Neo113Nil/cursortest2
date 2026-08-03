package com.ironsource;

/* renamed from: com.ironsource.x4, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C3359x4 {
    private static final java.lang.String c = "x4";
    private static final java.lang.String d = "setSharedSignal";
    private static final java.lang.String e = "getSharedSignal";
    private static final java.lang.String f = "functionName";
    private static final java.lang.String g = "functionParams";
    private static final java.lang.String h = "success";
    private static final java.lang.String i = "fail";

    /* renamed from: a, reason: collision with root package name */
    private final android.content.Context f6827a;
    com.ironsource.C3341w4 b;

    /* renamed from: com.ironsource.x4$a */
    private static class a {

        /* renamed from: a, reason: collision with root package name */
        java.lang.String f6828a;
        org.json.JSONObject b;
        java.lang.String c;
        java.lang.String d;

        private a() {
        }

        public static com.ironsource.C3359x4.a a(org.json.JSONObject jSONObject) {
            com.ironsource.C3359x4.a aVar = new com.ironsource.C3359x4.a();
            aVar.f6828a = jSONObject.optString("functionName");
            aVar.b = jSONObject.optJSONObject("functionParams");
            aVar.c = jSONObject.optString("success");
            aVar.d = jSONObject.optString("fail");
            return aVar;
        }
    }

    public C3359x4(android.content.Context context, com.ironsource.C3341w4 c3341w4) {
        this.f6827a = context;
        this.b = c3341w4;
    }

    private com.ironsource.C3359x4.a a(java.lang.String str) throws org.json.JSONException {
        return com.ironsource.C3359x4.a.a(new org.json.JSONObject(str));
    }

    private void b(android.content.Context context, com.ironsource.C3359x4.a aVar, com.ironsource.InterfaceC3168ma interfaceC3168ma) {
        com.ironsource.C3101ie c3101ie = new com.ironsource.C3101ie();
        org.json.JSONObject jSONObject = aVar.b;
        this.b.a(context, com.ironsource.EnumC3323v4.a(jSONObject.optString("source")), jSONObject.optString(com.ironsource.X3.i.W), jSONObject.optString("data"));
        interfaceC3168ma.a(true, aVar.c, c3101ie);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0049 A[Catch: Exception -> 0x004f, TRY_LEAVE, TryCatch #0 {Exception -> 0x004f, blocks: (B:3:0x0006, B:11:0x0031, B:14:0x0037, B:15:0x0048, B:16:0x0049, B:18:0x0018, B:21:0x0022), top: B:2:0x0006 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void a(java.lang.String str, com.ironsource.InterfaceC3168ma interfaceC3168ma) throws java.lang.Exception {
        char c2;
        com.ironsource.C3359x4.a a2 = a(str);
        try {
            java.lang.String str2 = a2.f6828a;
            int hashCode = str2.hashCode();
            if (hashCode != 576059875) {
                if (hashCode == 1486812399 && str2.equals(d)) {
                    c2 = 0;
                    if (c2 != 0) {
                        b(this.f6827a, a2, interfaceC3168ma);
                        return;
                    } else if (c2 == 1) {
                        a(this.f6827a, a2, interfaceC3168ma);
                        return;
                    } else {
                        throw new java.lang.UnsupportedOperationException("unsupported API: " + str);
                    }
                }
                c2 = 65535;
                if (c2 != 0) {
                }
            } else {
                if (str2.equals(e)) {
                    c2 = 1;
                    if (c2 != 0) {
                    }
                }
                c2 = 65535;
                if (c2 != 0) {
                }
            }
        } catch (java.lang.Exception e2) {
            a(a2, interfaceC3168ma, e2);
        }
    }

    private void a(android.content.Context context, com.ironsource.C3359x4.a aVar, com.ironsource.InterfaceC3168ma interfaceC3168ma) {
        com.ironsource.C3101ie c3101ie = new com.ironsource.C3101ie();
        org.json.JSONObject jSONObject = aVar.b;
        c3101ie.b("data", this.b.a(context, com.ironsource.EnumC3323v4.a(jSONObject.optString("source")), jSONObject.optString(com.ironsource.X3.i.W)));
        interfaceC3168ma.a(true, aVar.c, c3101ie);
    }

    private void a(com.ironsource.C3359x4.a aVar, com.ironsource.InterfaceC3168ma interfaceC3168ma, java.lang.Exception exc) {
        com.ironsource.C3180n4.d().a(exc);
        java.lang.String message = exc.getMessage();
        com.ironsource.sdk.utils.Logger.i(c, aVar.f6828a + " exception " + message);
        com.ironsource.C3101ie c3101ie = new com.ironsource.C3101ie();
        if (android.text.TextUtils.isEmpty(message)) {
            message = "Unknown error";
        }
        c3101ie.b("error", message);
        interfaceC3168ma.a(false, aVar.d, c3101ie);
    }
}
