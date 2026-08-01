package com.ironsource.adqualitysdk.sdk.i;

import java.util.ArrayList;
import net.pubnative.lite.sdk.vpaid.models.vast.VideoClicks;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ﯧ, reason: contains not printable characters */
/* loaded from: classes6.dex */
public final class C1190 implements InterfaceC0559 {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ C0957 f3382;

    public C1190(C0957 c0957) {
        this.f3382 = c0957;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0559
    /* renamed from: ﾒ */
    public final Object mo5367(ArrayList arrayList, C0807 c0807) {
        C0957 c0957 = this.f3382;
        VideoClicks videoClicks = (VideoClicks) arrayList.get(0);
        c0957.getClass();
        return videoClicks.getClickTrackingList();
    }
}
