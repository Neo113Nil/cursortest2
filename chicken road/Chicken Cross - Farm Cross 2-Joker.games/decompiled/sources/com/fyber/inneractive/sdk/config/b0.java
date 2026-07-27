package com.fyber.inneractive.sdk.config;

import com.fyber.inneractive.sdk.util.d1;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class b0 implements u {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ IAConfigManager f5235a;

    public b0(IAConfigManager iAConfigManager) {
        this.f5235a = iAConfigManager;
    }

    @Override // com.fyber.inneractive.sdk.config.u
    public final void onGlobalConfigChanged(v vVar, r rVar) {
        com.fyber.inneractive.sdk.network.f fVar = this.f5235a.H;
        fVar.getClass();
        int a2 = IAConfigManager.R.u.b.a("send_events_batch_interval", 30, -1);
        int i = a2 >= 0 ? a2 : 30;
        String property = System.getProperty("fyber.marketplace.use_batch_interval");
        if (property != null && !Boolean.getBoolean(property)) {
            i = 0;
        }
        fVar.f = true;
        fVar.e = i;
        d1 d1Var = fVar.d;
        if (d1Var != null && d1Var.hasMessages(12312329)) {
            fVar.d.removeMessages(12312329);
        }
        long j = fVar.e * 1000;
        d1 d1Var2 = fVar.d;
        if (d1Var2 != null) {
            d1Var2.post(new com.fyber.inneractive.sdk.network.c(fVar, 12312329, j));
        }
        IAConfigManager iAConfigManager = this.f5235a;
        com.fyber.inneractive.sdk.serverapi.extradata.d dVar = iAConfigManager.J;
        r rVar2 = iAConfigManager.u.b;
        JSONObject jSONObject = new JSONObject();
        String a3 = rVar2.a(CampaignEx.JSON_KEY_AD_K, (String) null);
        if (a3 != null) {
            try {
                jSONObject = new JSONObject(a3);
            } catch (JSONException unused) {
            }
        }
        dVar.getClass();
        HashMap hashMap = new HashMap();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            hashMap.put(next, Integer.valueOf(jSONObject.optInt(next, 0)));
        }
        dVar.e.clear();
        dVar.e.putAll(hashMap);
    }
}
