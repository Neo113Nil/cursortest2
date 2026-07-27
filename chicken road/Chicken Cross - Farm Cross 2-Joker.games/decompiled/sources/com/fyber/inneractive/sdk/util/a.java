package com.fyber.inneractive.sdk.util;

import android.text.TextUtils;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.external.InneractiveAdSpot;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public InneractiveAdSpot f5941a;
    public boolean c;
    public boolean b = false;
    public long d = 0;
    public long e = 0;
    public long f = 0;

    public final void a(boolean z) {
        this.c = z;
        if (this.b) {
            IAlog.a("%s%s timer could not start. Timer is in action!", "AdExperienceLatency: ", z ? "skip" : "close");
            return;
        }
        IAlog.a("%s%s timer started", "AdExperienceLatency: ", z ? "skip" : "close");
        this.d = System.currentTimeMillis();
        this.b = true;
    }

    public final void a() {
        if (!this.b || this.e <= 0) {
            return;
        }
        this.f += System.currentTimeMillis() - this.e;
        this.e = 0L;
    }

    public final void a(String str) {
        com.fyber.inneractive.sdk.config.global.r rVar;
        if (!this.b || this.c) {
            return;
        }
        String a2 = c0.a(System.currentTimeMillis(), this.d, this.f);
        InneractiveAdSpot inneractiveAdSpot = this.f5941a;
        com.fyber.inneractive.sdk.flow.x adContent = inneractiveAdSpot != null ? inneractiveAdSpot.getAdContent() : null;
        com.fyber.inneractive.sdk.network.u uVar = com.fyber.inneractive.sdk.network.u.USER_CLOSE_ACTION_LATENCY;
        InneractiveAdRequest inneractiveAdRequest = adContent != null ? adContent.f5418a : null;
        com.fyber.inneractive.sdk.response.e eVar = adContent != null ? adContent.b : null;
        JSONArray b = (adContent == null || (rVar = adContent.c) == null) ? null : rVar.b();
        com.fyber.inneractive.sdk.network.w wVar = new com.fyber.inneractive.sdk.network.w(eVar);
        wVar.c = uVar;
        wVar.f5514a = inneractiveAdRequest;
        wVar.d = b;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("close_action_latency", a2);
        } catch (Exception unused) {
            IAlog.f("Got exception adding param to json object: %s, %s", "close_action_latency", a2);
        }
        if (!TextUtils.isEmpty(str)) {
            try {
                jSONObject.put("origin", str);
            } catch (Exception unused2) {
                IAlog.f("Got exception adding param to json object: %s, %s", "origin", str);
            }
        }
        wVar.f.put(jSONObject);
        wVar.a((String) null);
        this.d = 0L;
        this.e = 0L;
        this.f = 0L;
        this.b = false;
    }
}
