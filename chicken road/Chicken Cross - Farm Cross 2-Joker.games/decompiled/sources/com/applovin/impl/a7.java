package com.applovin.impl;

import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tiktok.appevents.edp.TTEDPEventConstants;
import java.util.HashMap;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public class a7 extends b7 {
    private final g3 g;

    public a7(g3 g3Var, com.applovin.impl.sdk.l lVar) {
        super("TaskValidateMaxReward", lVar);
        this.g = g3Var;
    }

    @Override // com.applovin.impl.w6
    protected void a(JSONObject jSONObject) {
        JsonUtils.putString(jSONObject, "ad_unit_id", this.g.getAdUnitId());
        JsonUtils.putString(jSONObject, "placement", this.g.getPlacement());
        JsonUtils.putString(jSONObject, "custom_data", this.g.e());
        JsonUtils.putString(jSONObject, FirebaseAnalytics.Param.AD_FORMAT, this.g.getFormat().getLabel());
        String v0 = this.g.v0();
        if (!StringUtils.isValidString(v0)) {
            v0 = "NO_MCODE";
        }
        JsonUtils.putString(jSONObject, "mcode", v0);
        String C = this.g.C();
        if (!StringUtils.isValidString(C)) {
            C = "NO_BCODE";
        }
        JsonUtils.putString(jSONObject, "bcode", C);
    }

    @Override // com.applovin.impl.w6
    protected String f() {
        return "2.0/mvr";
    }

    @Override // com.applovin.impl.b7
    protected boolean h() {
        return this.g.A0();
    }

    @Override // com.applovin.impl.b7
    protected void a(t4 t4Var) {
        this.g.a(t4Var);
    }

    @Override // com.applovin.impl.w6
    protected void a(int i) {
        String str;
        super.a(i);
        if (i >= 400 && i < 500) {
            str = "rejected";
        } else {
            str = "network_timeout";
        }
        this.g.a(t4.a(str));
        HashMap<String, String> hashMap = CollectionUtils.hashMap("error_message", str);
        hashMap.put(TTEDPEventConstants.EDP_EVENT_PROPERTY_PAY_CODE, String.valueOf(i));
        this.f4351a.R().a(h2.z0, this.g, hashMap);
    }
}
