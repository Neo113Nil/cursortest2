package com.applovin.impl;

import com.applovin.mediation.MaxAdFormat;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public class f3 extends l3 {
    public f3(e3 e3Var, JSONObject jSONObject, JSONObject jSONObject2, com.applovin.impl.sdk.l lVar) {
        super(e3Var, jSONObject, jSONObject2, null, lVar);
    }

    public boolean A0() {
        return a("proe", (Boolean) this.f4356a.a(v3.m8)).booleanValue();
    }

    @Override // com.applovin.impl.c3
    public c3 a(com.applovin.impl.mediation.h hVar) {
        return new f3(this, hVar);
    }

    public long u0() {
        long a2 = a("ad_refresh_ms", -1L);
        return a2 >= 0 ? a2 : b("ad_refresh_ms", ((Long) this.f4356a.a(v3.K7)).longValue());
    }

    public long v0() {
        return t7.e(a("bg_color", (String) null));
    }

    public int w0() {
        int a2 = a("ad_view_height", -2);
        if (a2 != -2) {
            return a2;
        }
        MaxAdFormat format = getFormat();
        if (format.isAdViewAd()) {
            return format.getSize().getHeight();
        }
        throw new IllegalStateException("Invalid ad format");
    }

    public long x0() {
        return a("viewability_imp_delay_ms", ((Long) this.f4356a.a(c5.s1)).longValue());
    }

    public int y0() {
        int a2 = a("ad_view_width", -2);
        if (a2 != -2) {
            return a2;
        }
        MaxAdFormat format = getFormat();
        if (format.isAdViewAd()) {
            return format.getSize().getWidth();
        }
        throw new IllegalStateException("Invalid ad format");
    }

    public boolean z0() {
        return u0() >= 0;
    }

    private f3(f3 f3Var, com.applovin.impl.mediation.h hVar) {
        super(f3Var.Q(), f3Var.a(), f3Var.g(), hVar, f3Var.f4356a);
    }
}
