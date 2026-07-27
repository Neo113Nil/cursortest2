package com.ironsource.adqualitysdk.sdk.i;

import com.inmobi.media.ads.network.common.model.AdResponse;
import java.util.ArrayList;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ܥ, reason: contains not printable characters */
/* loaded from: classes6.dex */
public final class C0655 implements InterfaceC0559 {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ C0569 f1801;

    public C0655(C0569 c0569) {
        this.f1801 = c0569;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0559
    /* renamed from: ﾒ */
    public final Object mo5367(ArrayList arrayList, C0807 c0807) {
        C0569 c0569 = this.f1801;
        AdResponse adResponse = (AdResponse) arrayList.get(0);
        c0569.getClass();
        return Long.valueOf(adResponse.getPlacementId());
    }
}
