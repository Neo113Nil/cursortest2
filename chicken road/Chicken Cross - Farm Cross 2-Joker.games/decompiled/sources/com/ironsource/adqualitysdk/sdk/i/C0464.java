package com.ironsource.adqualitysdk.sdk.i;

import com.mintegral.msdk.out.BannerAdListener;
import com.mintegral.msdk.out.MTGBannerView;
import java.util.ArrayList;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ΐ, reason: contains not printable characters */
/* loaded from: classes6.dex */
public final class C0464 implements InterfaceC0559 {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ C0333 f864;

    public C0464(C0333 c0333) {
        this.f864 = c0333;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0559
    /* renamed from: ﾒ */
    public final Object mo5367(ArrayList arrayList, C0807 c0807) {
        C0333 c0333 = this.f864;
        MTGBannerView mTGBannerView = (MTGBannerView) arrayList.get(0);
        BannerAdListener bannerAdListener = (BannerAdListener) arrayList.get(1);
        c0333.getClass();
        mTGBannerView.setBannerAdListener(bannerAdListener);
        return null;
    }
}
