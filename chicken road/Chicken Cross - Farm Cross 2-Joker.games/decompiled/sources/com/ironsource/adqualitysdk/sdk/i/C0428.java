package com.ironsource.adqualitysdk.sdk.i;

import com.unity3d.services.banners.BannerView;
import java.util.ArrayList;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ʳ, reason: contains not printable characters */
/* loaded from: classes6.dex */
public final class C0428 implements InterfaceC0559 {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ C0449 f572;

    public C0428(C0449 c0449) {
        this.f572 = c0449;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0559
    /* renamed from: ﾒ */
    public final Object mo5367(ArrayList arrayList, C0807 c0807) {
        C0449 c0449 = this.f572;
        BannerView bannerView = (BannerView) arrayList.get(0);
        BannerView.IListener iListener = (BannerView.IListener) arrayList.get(1);
        c0449.getClass();
        bannerView.setListener(iListener);
        return null;
    }
}
