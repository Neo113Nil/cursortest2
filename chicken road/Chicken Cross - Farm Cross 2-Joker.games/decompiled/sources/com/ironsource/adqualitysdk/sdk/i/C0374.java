package com.ironsource.adqualitysdk.sdk.i;

import java.util.ArrayList;
import net.pubnative.lite.sdk.models.Ad;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.Ǐ, reason: contains not printable characters */
/* loaded from: classes6.dex */
public final class C0374 implements InterfaceC0559 {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ C0957 f476;

    public C0374(C0957 c0957) {
        this.f476 = c0957;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0559
    /* renamed from: ﾒ */
    public final Object mo5367(ArrayList arrayList, C0807 c0807) {
        C0957 c0957 = this.f476;
        Ad ad = (Ad) arrayList.get(0);
        String str = (String) arrayList.get(1);
        c0957.getClass();
        return ad.getAssetUrl(str);
    }
}
