package com.applovin.impl;

import com.applovin.impl.sdk.AppLovinError;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinAdLoadListener;
import com.applovin.sdk.AppLovinErrorCodes;
import com.google.android.gms.ads.AdError;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public class j6 extends n5 implements q2 {
    private final JSONObject g;
    private final u h;
    private final long i;
    private final AppLovinAdLoadListener j;
    private final boolean k;

    public j6(JSONObject jSONObject, u uVar, long j, AppLovinAdLoadListener appLovinAdLoadListener, com.applovin.impl.sdk.l lVar) {
        this(jSONObject, uVar, j, false, appLovinAdLoadListener, lVar);
    }

    private void a(JSONObject jSONObject) {
        String string = JsonUtils.getString(jSONObject, "type", AdError.UNDEFINED_DOMAIN);
        if ("applovin".equalsIgnoreCase(string)) {
            if (com.applovin.impl.sdk.p.a()) {
                this.c.a(this.b, "Starting task for AppLovin ad...");
            }
            this.f4351a.s0().a(new p6(jSONObject, this.g, this.i, this, this.f4351a));
            return;
        }
        if (!"vast".equalsIgnoreCase(string)) {
            if (com.applovin.impl.sdk.p.a()) {
                this.c.b(this.b, "Unable to process ad of unknown type: " + string);
            }
            failedToReceiveAdV2(new AppLovinError(AppLovinErrorCodes.INVALID_RESPONSE, "Unknown ad type: " + string));
        } else {
            if (com.applovin.impl.sdk.p.a()) {
                this.c.a(this.b, "Starting task for VAST ad...");
            }
            this.f4351a.s0().a(n6.a(jSONObject, this.g, this, this.f4351a));
        }
    }

    @Override // com.applovin.sdk.AppLovinAdLoadListener
    public void adReceived(AppLovinAd appLovinAd) {
        AppLovinAdLoadListener appLovinAdLoadListener = this.j;
        if (appLovinAdLoadListener != null) {
            appLovinAdLoadListener.adReceived(appLovinAd);
        }
        if (this.k || !(appLovinAd instanceof com.applovin.impl.sdk.ad.b)) {
            return;
        }
        this.f4351a.g().a(h2.D, (com.applovin.impl.sdk.ad.b) appLovinAd);
    }

    @Override // com.applovin.sdk.AppLovinAdLoadListener
    public void failedToReceiveAd(int i) {
        failedToReceiveAdV2(new AppLovinError(i, ""));
    }

    @Override // com.applovin.impl.q2
    public void failedToReceiveAdV2(AppLovinError appLovinError) {
        AppLovinAdLoadListener appLovinAdLoadListener = this.j;
        if (appLovinAdLoadListener == null) {
            return;
        }
        if (appLovinAdLoadListener instanceof q2) {
            ((q2) appLovinAdLoadListener).failedToReceiveAdV2(appLovinError);
        } else {
            appLovinAdLoadListener.failedToReceiveAd(appLovinError.getCode());
        }
        if (this.k) {
            return;
        }
        this.f4351a.g().a(h2.E, this.h, appLovinError);
    }

    @Override // java.lang.Runnable
    public void run() {
        JSONArray jSONArray = JsonUtils.getJSONArray(this.g, com.mbridge.msdk.foundation.entity.b.JSON_KEY_ADS, new JSONArray());
        if (jSONArray.length() > 0) {
            if (com.applovin.impl.sdk.p.a()) {
                this.c.a(this.b, "Processing ad...");
            }
            a(JsonUtils.getJSONObject(jSONArray, 0, new JSONObject()));
        } else {
            if (com.applovin.impl.sdk.p.a()) {
                this.c.k(this.b, "No ads were returned from the server");
            }
            t7.a(this.h.e(), this.h.d(), this.g, this.f4351a);
            failedToReceiveAdV2(AppLovinError.NO_FILL);
        }
    }

    public j6(JSONObject jSONObject, u uVar, long j, boolean z, AppLovinAdLoadListener appLovinAdLoadListener, com.applovin.impl.sdk.l lVar) {
        super("TaskProcessAdResponse", lVar);
        if (jSONObject == null) {
            throw new IllegalArgumentException("No response specified");
        }
        if (uVar == null) {
            throw new IllegalArgumentException("No zone specified");
        }
        this.g = jSONObject;
        this.h = uVar;
        this.i = j;
        this.j = appLovinAdLoadListener;
        this.k = z;
    }
}
