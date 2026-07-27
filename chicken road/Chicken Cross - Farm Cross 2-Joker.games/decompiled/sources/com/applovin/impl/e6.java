package com.applovin.impl;

import com.applovin.impl.sdk.AppLovinError;
import com.applovin.impl.sdk.nativeAd.AppLovinNativeAdLoadListener;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public abstract class e6 extends w5 {
    private final AppLovinNativeAdLoadListener i;

    public e6(u uVar, String str, AppLovinNativeAdLoadListener appLovinNativeAdLoadListener, com.applovin.impl.sdk.l lVar) {
        super(uVar, str, lVar);
        this.i = appLovinNativeAdLoadListener;
    }

    @Override // com.applovin.impl.w5
    protected n5 a(JSONObject jSONObject) {
        return new m6(jSONObject, this.i, this.f4351a);
    }

    @Override // com.applovin.impl.w5
    protected String e() {
        return s0.d(this.f4351a);
    }

    @Override // com.applovin.impl.w5
    protected String f() {
        return s0.e(this.f4351a);
    }

    @Override // com.applovin.impl.w5
    protected void a(int i, String str) {
        super.a(i, str);
        this.i.onNativeAdLoadFailed(new AppLovinError(i, str));
    }
}
