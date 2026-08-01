package com.ironsource.adqualitysdk.sdk.i;

import java.util.ArrayList;
import net.pubnative.lite.sdk.vpaid.response.AdParams;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ﺘ, reason: contains not printable characters */
/* loaded from: classes6.dex */
public final class C1224 implements InterfaceC0559 {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ C0957 f3457;

    public C1224(C0957 c0957) {
        this.f3457 = c0957;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0559
    /* renamed from: ﾒ */
    public final Object mo5367(ArrayList arrayList, C0807 c0807) {
        C0957 c0957 = this.f3457;
        AdParams adParams = (AdParams) arrayList.get(0);
        c0957.getClass();
        return adParams.getVideoFileUrlsList();
    }
}
