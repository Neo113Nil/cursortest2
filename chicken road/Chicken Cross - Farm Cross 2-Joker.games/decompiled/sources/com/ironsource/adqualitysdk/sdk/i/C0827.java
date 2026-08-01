package com.ironsource.adqualitysdk.sdk.i;

import com.moloco.sdk.publisher.Banner;
import com.moloco.sdk.publisher.BannerAdShowListener;
import java.util.ArrayList;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ᓵ, reason: contains not printable characters */
/* loaded from: classes6.dex */
public final class C0827 implements InterfaceC0559 {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ C0824 f2405;

    public C0827(C0824 c0824) {
        this.f2405 = c0824;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0559
    /* renamed from: ﾒ */
    public final Object mo5367(ArrayList arrayList, C0807 c0807) {
        C0824 c0824 = this.f2405;
        Banner banner = (Banner) arrayList.get(0);
        BannerAdShowListener bannerAdShowListener = (BannerAdShowListener) arrayList.get(1);
        c0824.getClass();
        banner.setAdShowListener(bannerAdShowListener);
        return null;
    }
}
