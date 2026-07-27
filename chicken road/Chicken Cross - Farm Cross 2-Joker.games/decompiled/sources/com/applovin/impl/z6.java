package com.applovin.impl;

import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.sdk.AppLovinAdRewardListener;
import com.applovin.sdk.AppLovinErrorCodes;
import java.util.Collections;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public class z6 extends b7 {
    private final com.applovin.impl.sdk.ad.b g;
    private final AppLovinAdRewardListener h;

    public z6(com.applovin.impl.sdk.ad.b bVar, AppLovinAdRewardListener appLovinAdRewardListener, com.applovin.impl.sdk.l lVar) {
        super("TaskValidateAppLovinReward", lVar);
        this.g = bVar;
        this.h = appLovinAdRewardListener;
    }

    @Override // com.applovin.impl.w6
    protected void a(JSONObject jSONObject) {
        JsonUtils.putString(jSONObject, "zone_id", this.g.getAdZone().e());
        String clCode = this.g.getClCode();
        if (!StringUtils.isValidString(clCode)) {
            clCode = "NO_CLCODE";
        }
        JsonUtils.putString(jSONObject, "clcode", clCode);
    }

    @Override // com.applovin.impl.w6
    public String f() {
        return "2.0/vr";
    }

    @Override // com.applovin.impl.b7
    protected boolean h() {
        return this.g.K0();
    }

    @Override // com.applovin.impl.b7
    protected void a(t4 t4Var) {
        this.g.a(t4Var);
        String b = t4Var.b();
        Map<String, String> a2 = t4Var.a();
        if (b.equals("accepted")) {
            this.h.userRewardVerified(this.g, a2);
            return;
        }
        if (b.equals("quota_exceeded")) {
            this.h.userOverQuota(this.g, a2);
        } else if (b.equals("rejected")) {
            this.h.userRewardRejected(this.g, a2);
        } else {
            this.h.validationRequestFailed(this.g, AppLovinErrorCodes.INCENTIVIZED_UNKNOWN_SERVER_ERROR);
        }
    }

    @Override // com.applovin.impl.w6
    protected void a(int i) {
        String str;
        super.a(i);
        if (i >= 400 && i < 500) {
            this.h.userRewardRejected(this.g, Collections.emptyMap());
            str = "rejected";
        } else {
            this.h.validationRequestFailed(this.g, i);
            str = "network_timeout";
        }
        this.g.a(t4.a(str));
    }
}
