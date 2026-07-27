package com.ironsource.adqualitysdk.sdk.i;

import com.applovin.impl.sdk.nativeAd.AppLovinNativeAdEventListener;
import com.applovin.impl.sdk.nativeAd.AppLovinNativeAdImpl;
import java.util.ArrayList;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ᖨ, reason: contains not printable characters */
/* loaded from: classes6.dex */
public final class C0883 implements InterfaceC0559 {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ C0759 f2508;

    public C0883(C0759 c0759) {
        this.f2508 = c0759;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0559
    /* renamed from: ﾒ */
    public final Object mo5367(ArrayList arrayList, C0807 c0807) {
        C0759 c0759 = this.f2508;
        AppLovinNativeAdImpl appLovinNativeAdImpl = (AppLovinNativeAdImpl) arrayList.get(0);
        AppLovinNativeAdEventListener appLovinNativeAdEventListener = (AppLovinNativeAdEventListener) arrayList.get(1);
        c0759.getClass();
        appLovinNativeAdImpl.setEventListener(appLovinNativeAdEventListener);
        return null;
    }
}
