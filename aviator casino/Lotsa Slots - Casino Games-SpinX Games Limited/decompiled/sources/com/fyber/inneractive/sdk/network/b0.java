package com.fyber.inneractive.sdk.network;

/* loaded from: classes3.dex */
public final class b0 {

    /* renamed from: a, reason: collision with root package name */
    public android.content.SharedPreferences f3832a = null;

    public static void a(android.content.Context context, java.lang.String str, java.lang.String str2, com.fyber.inneractive.sdk.flow.x xVar) {
        int i;
        if (context == null || str == null || xVar.b == null) {
            com.fyber.inneractive.sdk.util.IAlog.a("Invalid report request parameters!", new java.lang.Object[0]);
            return;
        }
        com.fyber.inneractive.sdk.network.b0 b0Var = com.fyber.inneractive.sdk.network.a0.f3831a;
        if (b0Var.f3832a == null) {
            b0Var.f3832a = context.getSharedPreferences("AutoWebActionPrefs", 0);
        }
        com.fyber.inneractive.sdk.util.IAlog.e("IAautoWebActionReporter: reporting action: %s", str);
        com.fyber.inneractive.sdk.util.IAlog.e("IAautoWebActionReporter: url: %s", str2);
        com.fyber.inneractive.sdk.config.IAConfigManager iAConfigManager = com.fyber.inneractive.sdk.config.IAConfigManager.N;
        if (!iAConfigManager.i.c) {
            com.fyber.inneractive.sdk.util.IAlog.a("IAautoWebActionReporter: Report of Non user web actions disabled!", new java.lang.Object[0]);
            return;
        }
        com.fyber.inneractive.sdk.network.t tVar = com.fyber.inneractive.sdk.network.t.MRAID_AUTO_ACTION_DETECTED;
        com.fyber.inneractive.sdk.external.InneractiveAdRequest inneractiveAdRequest = xVar.f3765a;
        com.fyber.inneractive.sdk.response.e eVar = xVar.b;
        org.json.JSONArray b = xVar.c.b();
        com.fyber.inneractive.sdk.network.w wVar = new com.fyber.inneractive.sdk.network.w(eVar);
        wVar.b = tVar;
        wVar.f3860a = inneractiveAdRequest;
        wVar.d = b;
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put("action", str);
        } catch (java.lang.Exception unused) {
            com.fyber.inneractive.sdk.util.IAlog.f("Got exception adding param to json object: %s, %s", "action", str);
        }
        if (!android.text.TextUtils.isEmpty(str2)) {
            try {
                jSONObject.put("url", str2);
            } catch (java.lang.Exception unused2) {
                com.fyber.inneractive.sdk.util.IAlog.f("Got exception adding param to json object: %s, %s", "url", str2);
            }
        }
        long j = b0Var.f3832a.getLong("lastReportTS", 0L);
        java.util.TimeZone timeZone = java.util.TimeZone.getTimeZone("UTC");
        java.util.Calendar calendar = java.util.Calendar.getInstance(timeZone);
        java.util.Calendar calendar2 = java.util.Calendar.getInstance(timeZone);
        calendar2.setTimeInMillis(j);
        if (j <= 0 || calendar.get(6) != calendar2.get(6)) {
            i = 0;
        } else {
            com.fyber.inneractive.sdk.util.IAlog.e("IAautoWebActionReporter: encountered same date", new java.lang.Object[0]);
            i = b0Var.f3832a.getInt("numReportsToday", 0);
        }
        int i2 = iAConfigManager.i.d;
        int i3 = i + 1;
        com.fyber.inneractive.sdk.util.IAlog.e("IAautoWebActionReporter: day counter: %d max: %d", java.lang.Integer.valueOf(i3), java.lang.Integer.valueOf(i2));
        if (i < i2) {
            com.fyber.inneractive.sdk.util.IAlog.e("IAautoWebActionReporter: adding ad data", new java.lang.Object[0]);
            wVar.g = true;
        } else {
            com.fyber.inneractive.sdk.util.IAlog.e("IAautoWebActionReporter: not adding ad data", new java.lang.Object[0]);
        }
        java.lang.Integer valueOf = java.lang.Integer.valueOf(i3);
        try {
            jSONObject.put("daily_count", valueOf);
        } catch (java.lang.Exception unused3) {
            com.fyber.inneractive.sdk.util.IAlog.f("Got exception adding param to json object: %s, %s", "daily_count", valueOf);
        }
        wVar.f.put(jSONObject);
        wVar.a((java.lang.String) null);
        android.content.SharedPreferences.Editor edit = b0Var.f3832a.edit();
        edit.putLong("lastReportTS", calendar.getTimeInMillis());
        edit.putInt("numReportsToday", i3);
        edit.apply();
    }
}
