package com.ironsource.adqualitysdk.sdk.i;

import io.bidmachine.banner.BannerListener;
import io.bidmachine.banner.BannerView;
import java.util.ArrayList;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.প, reason: contains not printable characters */
/* loaded from: classes6.dex */
public final class C0675 implements InterfaceC0559 {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ C0582 f1840;

    public C0675(C0582 c0582) {
        this.f1840 = c0582;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0559
    /* renamed from: ﾒ */
    public final Object mo5367(ArrayList arrayList, C0807 c0807) {
        C0582 c0582 = this.f1840;
        BannerView bannerView = (BannerView) arrayList.get(0);
        BannerListener bannerListener = (BannerListener) arrayList.get(1);
        c0582.getClass();
        bannerView.setListener(bannerListener);
        return null;
    }
}
