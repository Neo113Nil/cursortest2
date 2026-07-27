package com.ironsource.adqualitysdk.sdk.i;

import com.bytedance.sdk.openadsdk.api.banner.PAGBannerAd;
import com.bytedance.sdk.openadsdk.api.banner.PAGBannerAdInteractionListener;
import java.util.ArrayList;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.к, reason: contains not printable characters */
/* loaded from: classes6.dex */
public final class C0511 implements InterfaceC0559 {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ C0486 f1165;

    public C0511(C0486 c0486) {
        this.f1165 = c0486;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0559
    /* renamed from: ﾒ */
    public final Object mo5367(ArrayList arrayList, C0807 c0807) {
        C0486 c0486 = this.f1165;
        PAGBannerAd pAGBannerAd = (PAGBannerAd) arrayList.get(0);
        PAGBannerAdInteractionListener pAGBannerAdInteractionListener = (PAGBannerAdInteractionListener) arrayList.get(1);
        c0486.getClass();
        pAGBannerAd.setAdInteractionListener(pAGBannerAdInteractionListener);
        return null;
    }
}
