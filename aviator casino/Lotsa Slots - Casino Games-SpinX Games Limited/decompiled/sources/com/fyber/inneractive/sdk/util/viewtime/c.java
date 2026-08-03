package com.fyber.inneractive.sdk.util.viewtime;

/* loaded from: classes3.dex */
public final class c extends com.fyber.inneractive.sdk.util.viewtime.a {
    public final com.fyber.inneractive.sdk.flow.x b;
    public final com.fyber.inneractive.sdk.util.a c;
    public boolean d;

    public c(com.fyber.inneractive.sdk.flow.x xVar, com.fyber.inneractive.sdk.util.a aVar, boolean z) {
        this.b = xVar;
        this.c = aVar;
        this.d = z;
    }

    public final void a(boolean z) {
        java.lang.Object obj;
        com.fyber.inneractive.sdk.config.global.r rVar;
        long j = this.f4318a;
        java.lang.String format = java.lang.String.format(java.util.Locale.US, "%d.%03d", java.lang.Integer.valueOf((int) (j / 1000)), java.lang.Integer.valueOf((int) (j % 1000)));
        com.fyber.inneractive.sdk.network.u uVar = com.fyber.inneractive.sdk.network.u.VAST_WATCHED_DURATION_AND_SKIP_ACTION;
        com.fyber.inneractive.sdk.flow.x xVar = this.b;
        com.fyber.inneractive.sdk.external.InneractiveAdRequest inneractiveAdRequest = xVar != null ? xVar.f3765a : null;
        com.fyber.inneractive.sdk.response.e eVar = xVar != null ? xVar.b : null;
        org.json.JSONArray b = (xVar == null || (rVar = xVar.c) == null) ? null : rVar.b();
        com.fyber.inneractive.sdk.network.w wVar = new com.fyber.inneractive.sdk.network.w(eVar);
        wVar.c = uVar;
        wVar.f3860a = inneractiveAdRequest;
        wVar.d = b;
        java.lang.Boolean valueOf = java.lang.Boolean.valueOf(this.d);
        if (z) {
            com.fyber.inneractive.sdk.util.a aVar = this.c;
            aVar.getClass();
            obj = com.fyber.inneractive.sdk.util.c0.a(java.lang.System.currentTimeMillis(), aVar.d, aVar.f);
        } else {
            obj = -1;
        }
        wVar.a(com.ironsource.mediationsdk.utils.IronSourceConstants.EVENTS_DURATION, format, "is_skip_clickable", valueOf, "skip_action_latency", obj);
        wVar.a((java.lang.String) null);
    }
}
