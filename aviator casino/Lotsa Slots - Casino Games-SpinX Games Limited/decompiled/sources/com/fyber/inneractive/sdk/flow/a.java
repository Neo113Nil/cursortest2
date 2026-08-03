package com.fyber.inneractive.sdk.flow;

/* loaded from: classes3.dex */
public abstract class a {
    public static void a(com.fyber.inneractive.sdk.external.InneractiveAdRequest inneractiveAdRequest, com.fyber.inneractive.sdk.external.InneractiveInfrastructureError inneractiveInfrastructureError, com.fyber.inneractive.sdk.flow.x xVar, com.fyber.inneractive.sdk.response.e eVar, org.json.JSONArray jSONArray) {
        java.lang.String sb;
        if (inneractiveInfrastructureError.getFyberMarketplaceAdLoadFailureReason() == com.fyber.inneractive.sdk.flow.i.ADM_FETCH_FAILED || inneractiveInfrastructureError.getErrorCode().getMetricable() != com.fyber.inneractive.sdk.external.InneractiveErrorCode.Metricable.INCLUDED_IN_FAILED_METRICS) {
            return;
        }
        if (xVar == null || xVar.b() || xVar.isVideoAd()) {
            com.fyber.inneractive.sdk.network.t tVar = com.fyber.inneractive.sdk.network.t.IA_AD_LOAD_FAILED;
            if (inneractiveInfrastructureError.isErrorAlreadyReported(tVar)) {
                return;
            }
            com.fyber.inneractive.sdk.util.IAlog.a("Firing Event 801 - AdLoadFailed - errorCode - %s", inneractiveInfrastructureError.getErrorCode());
            if (inneractiveInfrastructureError.getCause() != null) {
                sb = java.util.Arrays.toString(inneractiveInfrastructureError.getCause().getStackTrace());
            } else {
                java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
                java.lang.StackTraceElement[] stackTrace = java.lang.Thread.currentThread().getStackTrace();
                for (int i = 7; i >= 0 && i < 13 && i < stackTrace.length; i++) {
                    sb2.append(stackTrace[i].toString());
                    sb2.append(",");
                }
                android.util.Log.d("stack trace:", sb2.toString());
                sb = sb2.toString();
            }
            com.fyber.inneractive.sdk.network.w wVar = new com.fyber.inneractive.sdk.network.w(eVar);
            wVar.b = tVar;
            wVar.f3860a = inneractiveAdRequest;
            wVar.d = jSONArray;
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            java.lang.String obj = inneractiveInfrastructureError.getFyberMarketplaceAdLoadFailureReason().toString();
            try {
                jSONObject.put("message", obj);
            } catch (java.lang.Exception unused) {
                com.fyber.inneractive.sdk.util.IAlog.f("Got exception adding param to json object: %s, %s", "message", obj);
            }
            try {
                jSONObject.put("description", sb);
            } catch (java.lang.Exception unused2) {
                com.fyber.inneractive.sdk.util.IAlog.f("Got exception adding param to json object: %s, %s", "description", sb);
            }
            java.lang.String description = inneractiveInfrastructureError.description();
            try {
                jSONObject.put("extra_description", description);
            } catch (java.lang.Exception unused3) {
                com.fyber.inneractive.sdk.util.IAlog.f("Got exception adding param to json object: %s, %s", "extra_description", description);
            }
            wVar.f.put(jSONObject);
            wVar.a((java.lang.String) null);
            inneractiveInfrastructureError.addReportedError(tVar);
        }
    }
}
