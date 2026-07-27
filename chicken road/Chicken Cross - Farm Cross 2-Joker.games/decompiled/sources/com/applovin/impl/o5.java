package com.applovin.impl;

import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.z4;
import com.facebook.devicerequests.internal.DeviceRequestsHelper;
import com.ironsource.L6;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes5.dex */
class o5 extends n5 {
    o5(com.applovin.impl.sdk.l lVar) {
        super("TaskApiSubmitData", lVar);
    }

    private void b(JSONObject jSONObject) {
        com.applovin.impl.sdk.m B = this.f4351a.B();
        Map p = B.p();
        t7.a(L6.H, "type", p);
        t7.a("api_level", "sdk_version", p);
        JsonUtils.putObject(jSONObject, DeviceRequestsHelper.DEVICE_INFO_PARAM, new JSONObject(p));
        Map H = B.H();
        t7.a("sdk_version", "applovin_sdk_version", H);
        t7.a("ia", "installed_at", H);
        JsonUtils.putObject(jSONObject, "app_info", new JSONObject(H));
    }

    @Override // java.lang.Runnable
    public void run() {
        if (com.applovin.impl.sdk.p.a()) {
            this.c.d(this.b, "Submitting user data...");
        }
        Map c = s0.c(this.f4351a);
        JSONObject jSONObject = new JSONObject();
        b(jSONObject);
        if (((Boolean) this.f4351a.a(c5.P5)).booleanValue() || ((Boolean) this.f4351a.a(c5.J5)).booleanValue()) {
            JsonUtils.putAll(jSONObject, (Map<String, ?>) c);
            c = null;
        }
        a(c, jSONObject);
    }

    class a extends r6 {
        a(com.applovin.impl.sdk.network.a aVar, com.applovin.impl.sdk.l lVar) {
            super(aVar, lVar);
        }

        @Override // com.applovin.impl.r6, com.applovin.impl.r0.e
        public void a(String str, JSONObject jSONObject, int i) {
            o5.this.a(jSONObject);
        }

        @Override // com.applovin.impl.r6, com.applovin.impl.r0.e
        public void a(String str, int i, String str2, JSONObject jSONObject) {
            s0.a(i, this.f4351a);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(JSONObject jSONObject) {
        JSONObject jSONObject2 = JsonUtils.getJSONObject(JsonUtils.getJSONArray(jSONObject, "results", new JSONArray()), 0, new JSONObject());
        this.f4351a.q0().a(c5.f, JsonUtils.getString(jSONObject2, "device_id", ""));
        this.f4351a.q0().a(c5.j, JsonUtils.getString(jSONObject2, "device_token", ""));
        s0.a(jSONObject2, this.f4351a);
    }

    private void a(Map map, JSONObject jSONObject) {
        a aVar = new a(com.applovin.impl.sdk.network.a.a(this.f4351a).b(s0.b("2.0/device", this.f4351a)).a(s0.a("2.0/device", this.f4351a)).b(map).a(jSONObject).c("POST").b(((Boolean) this.f4351a.a(c5.X5)).booleanValue()).a((Object) new JSONObject()).a(((Integer) this.f4351a.a(c5.h3)).intValue()).a(z4.a.a(((Integer) this.f4351a.a(c5.G5)).intValue())).a(), this.f4351a);
        aVar.c(c5.n0);
        aVar.b(c5.o0);
        this.f4351a.s0().a(aVar);
    }
}
