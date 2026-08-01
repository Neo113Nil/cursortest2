package com.ironsource.adqualitysdk.sdk.i;

import java.util.ArrayList;
import net.pubnative.lite.sdk.vpaid.VideoAdListener;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ł, reason: contains not printable characters */
/* loaded from: classes6.dex */
public final class C0348 implements InterfaceC0559 {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ C0957 f443;

    public C0348(C0957 c0957) {
        this.f443 = c0957;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0559
    /* renamed from: ﾒ */
    public final Object mo5367(ArrayList arrayList, C0807 c0807) {
        C0957 c0957 = this.f443;
        VideoAdListener videoAdListener = (VideoAdListener) arrayList.get(0);
        c0957.getClass();
        return new C0959(c0957, videoAdListener, c0807);
    }
}
