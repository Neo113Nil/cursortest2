package com.applovin.impl;

import com.applovin.impl.sdk.m;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.v;
import com.applovin.impl.z4;
import com.ironsource.C4761z5;
import com.tiktok.appevents.edp.TTEDPEventConstants;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public class y6 extends n5 {
    private final t2 g;
    private final Exception h;

    public y6(com.applovin.impl.sdk.l lVar, t2 t2Var, Exception exc) {
        super("TaskValidateLicense", lVar);
        this.g = t2Var;
        this.h = exc;
    }

    private String e() {
        return s0.a((String) this.f4351a.a(c5.v0), (String) this.f4351a.a(c5.w0), this.f4351a);
    }

    private JSONObject f() {
        JSONObject jSONObject = new JSONObject();
        v.a f = this.f4351a.B().f();
        JsonUtils.putBoolean(jSONObject, "dnt", f.c());
        JsonUtils.putString(jSONObject, "dnt_code", f.b().b());
        if (((Boolean) this.f4351a.a(c5.G3)).booleanValue() && StringUtils.isValidString(f.a())) {
            JsonUtils.putString(jSONObject, "idfa", f.a());
        }
        m.b I = this.f4351a.B().I();
        if (((Boolean) this.f4351a.a(c5.H3)).booleanValue() && I != null) {
            JsonUtils.putString(jSONObject, "idfv", I.f4481a);
            JsonUtils.putInt(jSONObject, "idfv_scope", I.b);
        }
        String e = this.f4351a.y0().e();
        if (((Boolean) this.f4351a.a(c5.I3)).booleanValue() && StringUtils.isValidString(e)) {
            JsonUtils.putString(jSONObject, "cuid", e);
        }
        if (((Boolean) this.f4351a.a(c5.L3)).booleanValue()) {
            JsonUtils.putString(jSONObject, "compass_random_token", this.f4351a.v());
        }
        if (((Boolean) this.f4351a.a(c5.N3)).booleanValue()) {
            JsonUtils.putString(jSONObject, "applovin_random_token", this.f4351a.j0());
        }
        JsonUtils.putAll(jSONObject, (Map<String, ?>) this.f4351a.B().e());
        JSONObject jSONObject2 = new JSONObject();
        t2 t2Var = this.g;
        if (t2Var != null) {
            JsonUtils.putString(jSONObject2, "lsig", t2Var.d());
            JsonUtils.putString(jSONObject2, "lsigd", this.g.e());
            JsonUtils.putInt(jSONObject2, "r_code", this.g.c());
            JsonUtils.putInt(jSONObject2, C4761z5.q, this.g.b());
        }
        Exception exc = this.h;
        if (exc != null) {
            JsonUtils.putStringIfValid(jSONObject2, "lvfr", exc.toString());
        }
        JsonUtils.putObject(jSONObject, "lvd", jSONObject2);
        return jSONObject;
    }

    private String g() {
        return s0.a((String) this.f4351a.a(c5.u0), (String) this.f4351a.a(c5.w0), this.f4351a);
    }

    @Override // java.lang.Runnable
    public void run() {
        a aVar = new a(com.applovin.impl.sdk.network.a.a(this.f4351a).b(g()).a(e()).a(f()).c("POST").b(((Boolean) this.f4351a.a(c5.b6)).booleanValue()).a((Object) new JSONObject()).a(((Integer) this.f4351a.a(c5.A3)).intValue()).a(z4.a.a(((Integer) this.f4351a.a(c5.I5)).intValue())).a(), this.f4351a);
        aVar.c(c5.u0);
        aVar.b(c5.v0);
        this.f4351a.s0().a(aVar);
    }

    class a extends r6 {
        a(com.applovin.impl.sdk.network.a aVar, com.applovin.impl.sdk.l lVar) {
            super(aVar, lVar);
        }

        @Override // com.applovin.impl.r6, com.applovin.impl.r0.e
        public void a(String str, JSONObject jSONObject, int i) {
            if (com.applovin.impl.sdk.p.a()) {
                this.c.a(this.b, "License Validation successful");
            }
            f5.b(e5.i, Boolean.FALSE, com.applovin.impl.sdk.l.p());
            Map map = CollectionUtils.map(TTEDPEventConstants.EDP_EVENT_PROPERTY_PAY_CODE, String.valueOf(i));
            CollectionUtils.putStringIfValid("url", str, map);
            this.f4351a.x0().d(h2.n, map);
        }

        @Override // com.applovin.impl.r6, com.applovin.impl.r0.e
        public void a(String str, int i, String str2, JSONObject jSONObject) {
            if (com.applovin.impl.sdk.p.a()) {
                this.c.b(this.b, "Failed to validate license: ");
            }
            if (!this.f4351a.c(c5.A).contains(String.valueOf(i))) {
                f5.b(e5.i, Boolean.FALSE, com.applovin.impl.sdk.l.p());
            }
            Map map = CollectionUtils.map("error_code", String.valueOf(i));
            CollectionUtils.putStringIfValid("error_message", str2, map);
            CollectionUtils.putStringIfValid("url", str, map);
            this.f4351a.x0().d(h2.o, map);
        }
    }
}
