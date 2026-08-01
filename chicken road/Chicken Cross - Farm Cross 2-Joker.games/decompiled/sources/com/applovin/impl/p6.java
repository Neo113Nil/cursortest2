package com.applovin.impl;

import com.applovin.impl.i6;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.sdk.AppLovinAdLoadListener;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public class p6 extends n5 {
    private final JSONObject g;
    private final JSONObject h;
    private final long i;
    private final AppLovinAdLoadListener j;

    public p6(JSONObject jSONObject, JSONObject jSONObject2, long j, AppLovinAdLoadListener appLovinAdLoadListener, com.applovin.impl.sdk.l lVar) {
        super("TaskRenderAppLovinAd", lVar);
        this.g = jSONObject;
        this.h = jSONObject2;
        this.i = j;
        this.j = appLovinAdLoadListener;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (com.applovin.impl.sdk.p.a()) {
            this.c.a(this.b, "Rendering ad...");
        }
        com.applovin.impl.sdk.ad.a aVar = new com.applovin.impl.sdk.ad.a(this.g, this.h, this.f4351a);
        Boolean bool = JsonUtils.getBoolean(this.g, "gs_load_immediately", Boolean.FALSE);
        Boolean bool2 = JsonUtils.getBoolean(this.g, "vs_load_immediately", Boolean.TRUE);
        r5 r5Var = new r5(aVar, this.i, this.f4351a, this.j);
        r5Var.c(bool2.booleanValue());
        r5Var.b(bool.booleanValue());
        this.f4351a.s0().a((n5) r5Var, i6.b.CACHING);
    }
}
