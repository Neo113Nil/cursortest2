package com.ironsource.adqualitysdk.sdk.i;

import java.util.ArrayList;
import net.pubnative.lite.sdk.models.AdData;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.Ɨ, reason: contains not printable characters */
/* loaded from: classes6.dex */
public final class C0365 implements InterfaceC0559 {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ C0957 f464;

    public C0365(C0957 c0957) {
        this.f464 = c0957;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0559
    /* renamed from: ﾒ */
    public final Object mo5367(ArrayList arrayList, C0807 c0807) {
        C0957 c0957 = this.f464;
        AdData adData = (AdData) arrayList.get(0);
        c0957.getClass();
        return adData.getJS();
    }
}
