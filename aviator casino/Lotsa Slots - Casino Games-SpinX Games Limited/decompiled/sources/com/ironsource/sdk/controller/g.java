package com.ironsource.sdk.controller;

/* loaded from: classes5.dex */
final class g {
    private static final java.lang.String c = "com.ironsource.sdk.controller.g";
    private static final java.lang.String d = "functionName";
    private static final java.lang.String e = "params";
    private static final java.lang.String f = "hash";

    /* renamed from: a, reason: collision with root package name */
    private final com.ironsource.sdk.controller.b f6635a;
    private final com.ironsource.sdk.controller.s b;

    g(com.ironsource.sdk.controller.b bVar, com.ironsource.sdk.controller.s sVar) {
        this.f6635a = bVar;
        this.b = sVar;
    }

    private void a(java.lang.Exception exc) {
        if (!(exc instanceof java.lang.NoSuchMethodException)) {
            a(exc.getLocalizedMessage());
            return;
        }
        com.ironsource.mediationsdk.logger.IronLog.INTERNAL.error(exc.toString());
        com.ironsource.sdk.utils.Logger.i(c, "messageHandler failed with exception " + exc.getMessage());
    }

    private void b(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        this.f6635a.a(a(str, str2, str3));
    }

    @android.webkit.JavascriptInterface
    public void messageHandler(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        try {
            com.ironsource.sdk.utils.Logger.i(c, "messageHandler(" + str + io.ktor.sse.ServerSentEventKt.SPACE + str3 + ")");
            if (this.b.a(str, str2, str3)) {
                a(str, str2);
            } else {
                b(str, str2, str3);
            }
        } catch (java.lang.Exception e2) {
            a(e2);
        }
    }

    private void a(java.lang.String str, java.lang.String str2) throws java.lang.Exception {
        this.f6635a.a(str, str2);
    }

    private void a(java.lang.String str) {
        this.f6635a.b(str);
    }

    private java.lang.String a(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put("functionName", com.ironsource.sdk.utils.SDKUtils.encodeString(str));
            jSONObject.put("params", com.ironsource.sdk.utils.SDKUtils.encodeString(str2));
            jSONObject.put(f, com.ironsource.sdk.utils.SDKUtils.encodeString(str3));
        } catch (org.json.JSONException e2) {
            com.ironsource.C3180n4.d().a(e2);
            com.ironsource.mediationsdk.logger.IronLog.INTERNAL.error(e2.toString());
        }
        return jSONObject.toString();
    }
}
