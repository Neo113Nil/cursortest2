package com.ironsource.adqualitysdk.sdk.i;

import com.yandex.mobile.ads.banner.BannerAdEventListener;
import com.yandex.mobile.ads.banner.BannerAdView;
import java.util.ArrayList;

/* loaded from: classes6.dex */
public final class e0 implements InterfaceC0559 {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ o0 f154;

    public e0(o0 o0Var) {
        this.f154 = o0Var;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0559
    /* renamed from: ﾒ */
    public final Object mo5367(ArrayList arrayList, C0807 c0807) {
        o0 o0Var = this.f154;
        BannerAdView bannerAdView = (BannerAdView) arrayList.get(0);
        BannerAdEventListener bannerAdEventListener = (BannerAdEventListener) arrayList.get(1);
        o0Var.getClass();
        bannerAdView.setBannerAdEventListener(bannerAdEventListener);
        return null;
    }
}
