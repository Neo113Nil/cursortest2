package com.ironsource.adqualitysdk.sdk.i;

import java.util.ArrayList;
import net.pubnative.lite.sdk.models.Ad;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ḯ, reason: contains not printable characters */
/* loaded from: classes6.dex */
public final class C1001 implements InterfaceC0559 {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ C0957 f2926;

    public C1001(C0957 c0957) {
        this.f2926 = c0957;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0559
    /* renamed from: ﾒ */
    public final Object mo5367(ArrayList arrayList, C0807 c0807) {
        C0957 c0957 = this.f2926;
        Ad ad = (Ad) arrayList.get(0);
        c0957.getClass();
        return ad.getCreativeId();
    }
}
