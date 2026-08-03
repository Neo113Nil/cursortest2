package com.fyber.inneractive.sdk.metrics;

/* loaded from: classes3.dex */
public final class c extends com.fyber.inneractive.sdk.metrics.a {
    public static final java.lang.String g = java.lang.String.valueOf(24);
    public static final java.lang.String h = java.lang.String.valueOf(3);
    public static final java.lang.String i = java.lang.String.valueOf(24);
    public static final java.lang.String j = java.lang.String.valueOf(3);
    public final java.lang.String b;
    public final com.fyber.inneractive.sdk.config.enums.UnitDisplayType c;
    public final com.fyber.inneractive.sdk.response.e d;
    public final com.fyber.inneractive.sdk.external.InneractiveAdRequest e;
    public final org.json.JSONArray f;

    public c(com.fyber.inneractive.sdk.response.e eVar, com.fyber.inneractive.sdk.external.InneractiveAdRequest inneractiveAdRequest, java.lang.String str, com.fyber.inneractive.sdk.config.enums.UnitDisplayType unitDisplayType, org.json.JSONArray jSONArray) {
        super("send_metric_report");
        this.d = eVar;
        this.e = inneractiveAdRequest;
        this.b = str;
        this.c = unitDisplayType;
        this.f = jSONArray;
    }

    public final void a() {
        com.fyber.inneractive.sdk.metrics.d dVar = com.fyber.inneractive.sdk.metrics.d.d;
        com.fyber.inneractive.sdk.metrics.g a2 = dVar.a(this.b);
        java.util.HashMap j2 = a2.j();
        if (!a2.a()) {
            com.fyber.inneractive.sdk.util.IAlog.a("MetricCreativeReporter: Metric data not valid, data: %s", dVar.a(this.b).toString());
        } else {
            dVar.f3794a.remove(this.b);
            com.fyber.inneractive.sdk.util.r.f4308a.execute(new com.fyber.inneractive.sdk.metrics.b(this, a2, j2));
        }
    }
}
