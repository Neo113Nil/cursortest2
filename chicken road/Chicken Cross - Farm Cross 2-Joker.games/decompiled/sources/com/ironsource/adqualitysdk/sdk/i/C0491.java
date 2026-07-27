package com.ironsource.adqualitysdk.sdk.i;

import com.bytedance.sdk.openadsdk.api.banner.PAGBannerAdWrapperListener;
import com.bytedance.sdk.openadsdk.core.bannerexpress.BannerExpressView;
import java.util.ArrayList;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.Ϝ, reason: contains not printable characters */
/* loaded from: classes6.dex */
public final class C0491 implements InterfaceC0559 {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ C0486 f1128;

    public C0491(C0486 c0486) {
        this.f1128 = c0486;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0559
    /* renamed from: ﾒ */
    public final Object mo5367(ArrayList arrayList, C0807 c0807) {
        C0486 c0486 = this.f1128;
        BannerExpressView bannerExpressView = (BannerExpressView) arrayList.get(0);
        PAGBannerAdWrapperListener pAGBannerAdWrapperListener = (PAGBannerAdWrapperListener) arrayList.get(1);
        c0486.getClass();
        bannerExpressView.setExpressInteractionListener(pAGBannerAdWrapperListener);
        return null;
    }
}
