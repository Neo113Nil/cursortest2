package com.ironsource.adqualitysdk.sdk.i;

import java.util.ArrayList;
import tv.superawesome.sdk.publisher.SABannerAd;
import tv.superawesome.sdk.publisher.SAInterface;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ᒢ, reason: contains not printable characters */
/* loaded from: classes6.dex */
public final class C0778 implements InterfaceC0559 {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ C0777 f2274;

    public C0778(C0777 c0777) {
        this.f2274 = c0777;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0559
    /* renamed from: ﾒ */
    public final Object mo5367(ArrayList arrayList, C0807 c0807) {
        C0777 c0777 = this.f2274;
        SABannerAd sABannerAd = (SABannerAd) arrayList.get(0);
        SAInterface sAInterface = (SAInterface) arrayList.get(1);
        c0777.getClass();
        sABannerAd.setListener(sAInterface);
        return null;
    }
}
