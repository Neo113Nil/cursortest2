package com.ironsource.adqualitysdk.sdk.i;

import java.util.ArrayList;
import net.pubnative.lite.sdk.vpaid.VideoAd;
import net.pubnative.lite.sdk.vpaid.VideoAdListener;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ị, reason: contains not printable characters */
/* loaded from: classes6.dex */
public final class C1031 implements InterfaceC0559 {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ C0957 f3060;

    public C1031(C0957 c0957) {
        this.f3060 = c0957;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0559
    /* renamed from: ﾒ */
    public final Object mo5367(ArrayList arrayList, C0807 c0807) {
        C0957 c0957 = this.f3060;
        VideoAd videoAd = (VideoAd) arrayList.get(0);
        VideoAdListener videoAdListener = (VideoAdListener) arrayList.get(1);
        c0957.getClass();
        videoAd.setAdListener(videoAdListener);
        return null;
    }
}
