package com.ironsource.adqualitysdk.sdk.i;

import com.unity3d.services.banners.BannerView;
import java.util.ArrayList;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ʴ, reason: contains not printable characters */
/* loaded from: classes6.dex */
public final class C0429 implements InterfaceC0559 {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ C0449 f573;

    public C0429(C0449 c0449) {
        this.f573 = c0449;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0559
    /* renamed from: ﾒ */
    public final Object mo5367(ArrayList arrayList, C0807 c0807) {
        C0449 c0449 = this.f573;
        BannerView bannerView = (BannerView) arrayList.get(0);
        c0449.getClass();
        return bannerView.getListener();
    }
}
