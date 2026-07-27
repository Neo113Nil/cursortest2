package com.applovin.impl;

import com.applovin.mediation.MaxAdFormat;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public abstract class l3 extends c3 {
    protected l3(e3 e3Var, JSONObject jSONObject, JSONObject jSONObject2, com.applovin.impl.mediation.h hVar, com.applovin.impl.sdk.l lVar) {
        super(e3Var, jSONObject, jSONObject2, hVar, lVar);
    }

    public float m0() {
        return b("viewability_min_alpha", ((Float) this.f4356a.a(c5.B1)).floatValue() / 100.0f);
    }

    public int n0() {
        return a("viewability_min_pixels", -1);
    }

    public int o0() {
        MaxAdFormat format = getFormat();
        c5 c5Var = format == MaxAdFormat.BANNER ? c5.u1 : format == MaxAdFormat.MREC ? c5.w1 : format == MaxAdFormat.LEADER ? c5.y1 : format == MaxAdFormat.NATIVE ? c5.A1 : null;
        if (c5Var != null) {
            return a("viewability_min_height", ((Integer) this.f4356a.a(c5Var)).intValue());
        }
        return 0;
    }

    public float p0() {
        return b("viewability_min_percentage_dp", -1.0f);
    }

    public float q0() {
        return b("viewability_min_percentage_pixels", -1.0f);
    }

    public long r0() {
        return a("viewability_timer_min_visible_ms", ((Long) this.f4356a.a(c5.C1)).longValue());
    }

    public int s0() {
        MaxAdFormat format = getFormat();
        c5 c5Var = format == MaxAdFormat.BANNER ? c5.t1 : format == MaxAdFormat.MREC ? c5.v1 : format == MaxAdFormat.LEADER ? c5.x1 : format == MaxAdFormat.NATIVE ? c5.z1 : null;
        if (c5Var != null) {
            return a("viewability_min_width", ((Integer) this.f4356a.a(c5Var)).intValue());
        }
        return 0;
    }

    public boolean t0() {
        return n0() >= 0 || p0() >= 0.0f || q0() >= 0.0f;
    }
}
