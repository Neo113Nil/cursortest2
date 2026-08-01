package com.ironsource.adqualitysdk.sdk.i;

import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinAdSize;
import java.util.ArrayList;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ᘣ, reason: contains not printable characters */
/* loaded from: classes6.dex */
public final class C0905 implements InterfaceC0559 {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ C0759 f2541;

    public C0905(C0759 c0759) {
        this.f2541 = c0759;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0559
    /* renamed from: ﾒ */
    public final Object mo5367(ArrayList arrayList, C0807 c0807) {
        C0759 c0759 = this.f2541;
        boolean z = false;
        AppLovinAd appLovinAd = (AppLovinAd) arrayList.get(0);
        c0759.getClass();
        if (appLovinAd != null && (appLovinAd.getSize() == AppLovinAdSize.BANNER || appLovinAd.getSize() == AppLovinAdSize.LEADER || appLovinAd.getSize() == AppLovinAdSize.MREC)) {
            z = true;
        }
        return Boolean.valueOf(z);
    }
}
