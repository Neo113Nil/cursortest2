package com.ironsource.adqualitysdk.sdk.i;

import com.smaato.sdk.banner.widget.BannerView;
import java.util.ArrayList;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ᑋ, reason: contains not printable characters */
/* loaded from: classes6.dex */
public final class C0765 implements InterfaceC0559 {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ C0441 f2202;

    public C0765(C0441 c0441) {
        this.f2202 = c0441;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0559
    /* renamed from: ﾒ */
    public final Object mo5367(ArrayList arrayList, C0807 c0807) {
        C0441 c0441 = this.f2202;
        BannerView bannerView = (BannerView) arrayList.get(0);
        BannerView.EventListener eventListener = (BannerView.EventListener) arrayList.get(1);
        c0441.getClass();
        bannerView.setEventListener(eventListener);
        return null;
    }
}
