package com.fyber.inneractive.sdk.metrics;

/* loaded from: classes3.dex */
public final class b implements java.lang.Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.fyber.inneractive.sdk.metrics.g f3793a;
    public final /* synthetic */ java.util.Map b;
    public final /* synthetic */ com.fyber.inneractive.sdk.metrics.c c;

    public b(com.fyber.inneractive.sdk.metrics.c cVar, com.fyber.inneractive.sdk.metrics.g gVar, java.util.Map map) {
        this.c = cVar;
        this.f3793a = gVar;
        this.b = map;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.fyber.inneractive.sdk.config.enums.UnitDisplayType unitDisplayType;
        int a2;
        int a3;
        java.lang.String str;
        com.fyber.inneractive.sdk.util.IAlog.a("MetricCreativeReporter: sendMetricEvent()", new java.lang.Object[0]);
        com.fyber.inneractive.sdk.metrics.c cVar = this.c;
        com.fyber.inneractive.sdk.config.enums.UnitDisplayType unitDisplayType2 = cVar.c;
        if (unitDisplayType2 == null || !(unitDisplayType2 == (unitDisplayType = com.fyber.inneractive.sdk.config.enums.UnitDisplayType.BANNER) || unitDisplayType2 == com.fyber.inneractive.sdk.config.enums.UnitDisplayType.MRECT || unitDisplayType2.isFullscreenUnit())) {
            com.fyber.inneractive.sdk.config.enums.UnitDisplayType unitDisplayType3 = cVar.c;
            com.fyber.inneractive.sdk.util.IAlog.a("Unit display type %s is not supported for metric event", unitDisplayType3 != null ? unitDisplayType3.value() : "");
            return;
        }
        com.fyber.inneractive.sdk.util.IAlog.a("MetricCreativeReporter: sendMetricEvent(), collectorData: data: %s", this.f3793a.toString());
        com.fyber.inneractive.sdk.config.o oVar = com.fyber.inneractive.sdk.config.IAConfigManager.N.t.b;
        com.fyber.inneractive.sdk.config.enums.UnitDisplayType unitDisplayType4 = this.c.c;
        if (unitDisplayType4 == unitDisplayType || unitDisplayType4 == com.fyber.inneractive.sdk.config.enums.UnitDisplayType.MRECT) {
            java.lang.String a4 = oVar.a("ad_metrics_interval_banner", com.fyber.inneractive.sdk.metrics.c.g);
            java.lang.String a5 = oVar.a("ad_metrics_limit_banner", com.fyber.inneractive.sdk.metrics.c.h);
            a2 = com.fyber.inneractive.sdk.util.v.a(a4, 24);
            a3 = com.fyber.inneractive.sdk.util.v.a(a5, 3);
            str = "LastSentMetricsBanner";
        } else {
            java.lang.String a6 = oVar.a("ad_metrics_interval_interstitial", com.fyber.inneractive.sdk.metrics.c.i);
            java.lang.String a7 = oVar.a("ad_metrics_limit_interstitial", com.fyber.inneractive.sdk.metrics.c.j);
            a2 = com.fyber.inneractive.sdk.util.v.a(a6, 24);
            a3 = com.fyber.inneractive.sdk.util.v.a(a7, 3);
            str = "LastSentMetricsInterstitial";
        }
        android.app.Application application = com.fyber.inneractive.sdk.util.o.f4302a;
        if (application != null) {
            android.content.SharedPreferences sharedPreferences = application.getSharedPreferences("IAConfigPrefs", 0);
            org.json.JSONArray jSONArray = new org.json.JSONArray();
            try {
                jSONArray = new org.json.JSONArray(sharedPreferences.getString(str, okhttp3.HttpUrl.PATH_SEGMENT_ENCODE_SET_URI));
            } catch (org.json.JSONException unused) {
            }
            java.util.concurrent.CopyOnWriteArrayList copyOnWriteArrayList = new java.util.concurrent.CopyOnWriteArrayList();
            if (oVar.a(false, this.c.f3792a) && !com.fyber.inneractive.sdk.metrics.a.a(a2, a3, jSONArray, copyOnWriteArrayList)) {
                copyOnWriteArrayList.add(java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
                com.fyber.inneractive.sdk.metrics.c cVar2 = this.c;
                com.fyber.inneractive.sdk.external.InneractiveAdRequest inneractiveAdRequest = cVar2.e;
                com.fyber.inneractive.sdk.response.e eVar = cVar2.d;
                java.util.Map map = this.b;
                try {
                    com.fyber.inneractive.sdk.network.u uVar = com.fyber.inneractive.sdk.network.u.METRIC_MEASUREMENTS_EVENT;
                    org.json.JSONArray jSONArray2 = cVar2.f;
                    com.fyber.inneractive.sdk.network.w wVar = new com.fyber.inneractive.sdk.network.w(eVar);
                    wVar.c = uVar;
                    wVar.f3860a = inneractiveAdRequest;
                    wVar.d = jSONArray2;
                    org.json.JSONObject jSONObject = new org.json.JSONObject();
                    for (java.lang.String str2 : map.keySet()) {
                        java.lang.Object obj = map.get(str2);
                        try {
                            jSONObject.put(str2, obj);
                        } catch (java.lang.Exception unused2) {
                            com.fyber.inneractive.sdk.util.IAlog.f("Got exception adding param to json object: %s, %s", str2, obj);
                        }
                    }
                    wVar.f.put(jSONObject);
                    wVar.a((java.lang.String) null);
                } catch (java.lang.Exception unused3) {
                }
            }
            sharedPreferences.edit().putString(str, new org.json.JSONArray((java.util.Collection) copyOnWriteArrayList).toString()).apply();
        }
    }
}
