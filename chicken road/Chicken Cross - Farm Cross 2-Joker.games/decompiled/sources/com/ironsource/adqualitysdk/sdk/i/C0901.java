package com.ironsource.adqualitysdk.sdk.i;

import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinAdType;
import java.util.ArrayList;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ᘅ, reason: contains not printable characters */
/* loaded from: classes6.dex */
public final class C0901 implements InterfaceC0559 {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ C0759 f2532;

    public C0901(C0759 c0759) {
        this.f2532 = c0759;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0559
    /* renamed from: ﾒ */
    public final Object mo5367(ArrayList arrayList, C0807 c0807) {
        C0759 c0759 = this.f2532;
        boolean z = false;
        AppLovinAd appLovinAd = (AppLovinAd) arrayList.get(0);
        c0759.getClass();
        if (appLovinAd != null && appLovinAd.getType().equals(AppLovinAdType.INCENTIVIZED)) {
            z = true;
        }
        return Boolean.valueOf(z);
    }
}
