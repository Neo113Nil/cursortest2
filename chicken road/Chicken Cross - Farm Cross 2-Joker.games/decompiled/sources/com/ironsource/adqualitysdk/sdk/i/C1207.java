package com.ironsource.adqualitysdk.sdk.i;

import java.util.ArrayList;
import net.pubnative.lite.sdk.vpaid.VideoAdController;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ﹹ, reason: contains not printable characters */
/* loaded from: classes6.dex */
public final class C1207 implements InterfaceC0559 {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ C0957 f3404;

    public C1207(C0957 c0957) {
        this.f3404 = c0957;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0559
    /* renamed from: ﾒ */
    public final Object mo5367(ArrayList arrayList, C0807 c0807) {
        C0957 c0957 = this.f3404;
        VideoAdController videoAdController = (VideoAdController) arrayList.get(0);
        c0957.getClass();
        return videoAdController.getAdParams();
    }
}
