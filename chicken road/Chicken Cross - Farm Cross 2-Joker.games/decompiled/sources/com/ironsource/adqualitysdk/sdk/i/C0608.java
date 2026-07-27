package com.ironsource.adqualitysdk.sdk.i;

import com.inmobi.media.ads.network.common.model.AdSet;
import java.util.ArrayList;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ٳ, reason: contains not printable characters */
/* loaded from: classes6.dex */
public final class C0608 implements InterfaceC0559 {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ C0569 f1581;

    public C0608(C0569 c0569) {
        this.f1581 = c0569;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0559
    /* renamed from: ﾒ */
    public final Object mo5367(ArrayList arrayList, C0807 c0807) {
        C0569 c0569 = this.f1581;
        AdSet adSet = (AdSet) arrayList.get(0);
        c0569.getClass();
        return adSet.getAds();
    }
}
