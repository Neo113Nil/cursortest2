package com.fyber.inneractive.sdk.network;

/* loaded from: classes3.dex */
public abstract class z {
    public static void a(java.lang.String str, java.lang.String str2, com.fyber.inneractive.sdk.external.InneractiveAdRequest inneractiveAdRequest, com.fyber.inneractive.sdk.response.e eVar) {
        com.fyber.inneractive.sdk.network.w wVar = new com.fyber.inneractive.sdk.network.w(com.fyber.inneractive.sdk.network.u.CAUGHT_EXCEPTION, inneractiveAdRequest, eVar);
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put("exception_name", str);
        } catch (java.lang.Exception unused) {
            com.fyber.inneractive.sdk.util.IAlog.f("Got exception adding param to json object: %s, %s", "exception_name", str);
        }
        try {
            jSONObject.put("description", str2);
        } catch (java.lang.Exception unused2) {
            com.fyber.inneractive.sdk.util.IAlog.f("Got exception adding param to json object: %s, %s", "description", str2);
        }
        wVar.f.put(jSONObject);
        wVar.a((java.lang.String) null);
    }

    public static void a(java.lang.Throwable th, com.fyber.inneractive.sdk.external.InneractiveAdRequest inneractiveAdRequest, com.fyber.inneractive.sdk.response.e eVar) {
        java.io.StringWriter stringWriter = new java.io.StringWriter();
        th.printStackTrace(new java.io.PrintWriter(stringWriter));
        java.lang.String stringBuffer = stringWriter.getBuffer().toString();
        com.fyber.inneractive.sdk.network.w wVar = new com.fyber.inneractive.sdk.network.w(com.fyber.inneractive.sdk.network.u.CAUGHT_EXCEPTION, inneractiveAdRequest, eVar);
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        java.lang.String cls = th.getClass().toString();
        try {
            jSONObject.put("exception_name", cls);
        } catch (java.lang.Exception unused) {
            com.fyber.inneractive.sdk.util.IAlog.f("Got exception adding param to json object: %s, %s", "exception_name", cls);
        }
        java.lang.String message = th.getMessage();
        try {
            jSONObject.put("description", message);
        } catch (java.lang.Exception unused2) {
            com.fyber.inneractive.sdk.util.IAlog.f("Got exception adding param to json object: %s, %s", "description", message);
        }
        try {
            jSONObject.put("stack_trace", stringBuffer);
        } catch (java.lang.Exception unused3) {
            com.fyber.inneractive.sdk.util.IAlog.f("Got exception adding param to json object: %s, %s", "stack_trace", stringBuffer);
        }
        wVar.f.put(jSONObject);
        wVar.a((java.lang.String) null);
    }
}
