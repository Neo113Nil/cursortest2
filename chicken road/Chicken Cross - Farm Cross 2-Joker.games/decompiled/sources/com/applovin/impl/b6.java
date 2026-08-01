package com.applovin.impl;

import android.content.Context;
import com.applovin.impl.r0;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.v;
import com.applovin.impl.z4;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinSdkUtils;
import com.applovin.sdk.AppLovinWebViewActivity;
import com.ironsource.L6;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public class b6 extends n5 {
    private final r0.e g;

    public b6(r0.e eVar, com.applovin.impl.sdk.l lVar) {
        super("TaskFetchMediationDebuggerInfo", lVar, true);
        this.g = eVar;
    }

    protected Map e() {
        HashMap hashMap = new HashMap();
        hashMap.put("sdk_version", AppLovinSdk.VERSION);
        if (!((Boolean) this.f4351a.a(c5.u5)).booleanValue()) {
            hashMap.put(AppLovinWebViewActivity.INTENT_EXTRA_KEY_SDK_KEY, this.f4351a.k0());
        }
        Map H = this.f4351a.B().H();
        hashMap.put("package_name", String.valueOf(H.get("package_name")));
        hashMap.put("app_version", String.valueOf(H.get("app_version")));
        Map O = this.f4351a.B().O();
        hashMap.put(L6.H, String.valueOf(O.get(L6.H)));
        hashMap.put(L6.F, String.valueOf(O.get(L6.F)));
        return hashMap;
    }

    @Override // java.lang.Runnable
    public void run() {
        Map e = e();
        JSONObject a2 = a(a());
        if (((Boolean) this.f4351a.a(c5.M5)).booleanValue() || ((Boolean) this.f4351a.a(c5.J5)).booleanValue()) {
            JsonUtils.putAll(a2, (Map<String, ?>) e);
            e = null;
        }
        a aVar = new a(com.applovin.impl.sdk.network.a.a(this.f4351a).c("POST").b(p3.i(this.f4351a)).a(p3.h(this.f4351a)).b(e).a(a2).a((Object) new JSONObject()).c(((Long) this.f4351a.a(v3.F7)).intValue()).a(z4.a.a(((Integer) this.f4351a.a(c5.B5)).intValue())).a(), this.f4351a, d());
        aVar.c(v3.B7);
        aVar.b(v3.C7);
        this.f4351a.s0().a(aVar);
    }

    class a extends r6 {
        a(com.applovin.impl.sdk.network.a aVar, com.applovin.impl.sdk.l lVar, boolean z) {
            super(aVar, lVar, z);
        }

        @Override // com.applovin.impl.r6, com.applovin.impl.r0.e
        public void a(String str, JSONObject jSONObject, int i) {
            b6.this.g.a(str, jSONObject, i);
        }

        @Override // com.applovin.impl.r6, com.applovin.impl.r0.e
        public void a(String str, int i, String str2, JSONObject jSONObject) {
            b6.this.g.a(str, i, str2, jSONObject);
        }
    }

    private JSONObject a(Context context) {
        JSONObject jSONObject = new JSONObject();
        JsonUtils.putJsonArrayIfValid(jSONObject, "installed_mediation_adapters", a4.b(this.f4351a));
        JsonUtils.putBoolean(jSONObject, "is_tablet", AppLovinSdkUtils.isTablet(context));
        v.a f = this.f4351a.B().f();
        JsonUtils.putStringIfValid(jSONObject, "dnt_code", f.b().b());
        JsonUtils.putStringIfValid(jSONObject, "idfa", f.a());
        Map m0 = this.f4351a.m0();
        if (!CollectionUtils.isEmpty(m0)) {
            JsonUtils.putJSONObject(jSONObject, "segments", new JSONObject(m0));
        }
        return jSONObject;
    }
}
