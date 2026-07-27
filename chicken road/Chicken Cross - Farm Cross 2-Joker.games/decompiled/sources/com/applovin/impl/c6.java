package com.applovin.impl;

import com.applovin.impl.sdk.nativeAd.AppLovinNativeAdLoadListener;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes5.dex */
public class c6 extends e6 {
    private final k j;

    public c6(k kVar, AppLovinNativeAdLoadListener appLovinNativeAdLoadListener, com.applovin.impl.sdk.l lVar) {
        super(u.a("adtoken_zone"), "TaskFetchNativeTokenAd", appLovinNativeAdLoadListener, lVar);
        this.j = kVar;
    }

    @Override // com.applovin.impl.w5
    protected Map h() {
        HashMap hashMap = new HashMap(2);
        hashMap.put("adtoken", this.j.b());
        hashMap.put("adtoken_prefix", this.j.d());
        return hashMap;
    }
}
