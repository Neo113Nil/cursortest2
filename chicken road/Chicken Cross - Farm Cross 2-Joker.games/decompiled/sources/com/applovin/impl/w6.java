package com.applovin.impl;

import com.applovin.impl.r0;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.z4;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public abstract class w6 extends n5 {
    protected w6(String str, com.applovin.impl.sdk.l lVar) {
        super(str, lVar);
    }

    protected abstract void a(JSONObject jSONObject);

    void a(JSONObject jSONObject, r0.e eVar) {
        Map c = s0.c(this.f4351a);
        if (((Boolean) this.f4351a.a(c5.Q5)).booleanValue() || ((Boolean) this.f4351a.a(c5.J5)).booleanValue()) {
            JsonUtils.putAll(jSONObject, (Map<String, ?>) c);
            c = null;
        }
        a aVar = new a(com.applovin.impl.sdk.network.a.a(this.f4351a).b(s0.b(f(), this.f4351a)).a(s0.a(f(), this.f4351a)).b(c).a(jSONObject).c("POST").b(((Boolean) this.f4351a.a(c5.a6)).booleanValue()).a((Object) new JSONObject()).a(g()).a(z4.a.a(((Integer) this.f4351a.a(c5.H5)).intValue())).a(), this.f4351a, eVar);
        aVar.c(c5.n0);
        aVar.b(c5.o0);
        this.f4351a.s0().a(aVar);
    }

    protected JSONObject e() {
        JSONObject jSONObject = new JSONObject();
        String e = this.f4351a.y0().e();
        if (((Boolean) this.f4351a.a(c5.J3)).booleanValue() && StringUtils.isValidString(e)) {
            JsonUtils.putString(jSONObject, "cuid", e);
        }
        if (((Boolean) this.f4351a.a(c5.L3)).booleanValue()) {
            JsonUtils.putString(jSONObject, "compass_random_token", this.f4351a.v());
        }
        if (((Boolean) this.f4351a.a(c5.N3)).booleanValue()) {
            JsonUtils.putString(jSONObject, "applovin_random_token", this.f4351a.j0());
        }
        a(jSONObject);
        return jSONObject;
    }

    protected abstract String f();

    protected abstract int g();

    class a extends r6 {
        final /* synthetic */ r0.e n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(com.applovin.impl.sdk.network.a aVar, com.applovin.impl.sdk.l lVar, r0.e eVar) {
            super(aVar, lVar);
            this.n = eVar;
        }

        @Override // com.applovin.impl.r6, com.applovin.impl.r0.e
        public void a(String str, JSONObject jSONObject, int i) {
            this.n.a(str, jSONObject, i);
        }

        @Override // com.applovin.impl.r6, com.applovin.impl.r0.e
        public void a(String str, int i, String str2, JSONObject jSONObject) {
            this.n.a(str, i, str2, jSONObject);
        }
    }

    protected void a(int i) {
        s0.a(i, this.f4351a);
    }
}
