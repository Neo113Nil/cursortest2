package com.ironsource.adqualitysdk.sdk.i;

import com.inmobi.ads.AdContainer;
import java.util.ArrayList;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ร, reason: contains not printable characters */
/* loaded from: classes6.dex */
public final class C0704 implements InterfaceC0559 {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ C0569 f1901;

    public C0704(C0569 c0569) {
        this.f1901 = c0569;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0559
    /* renamed from: ﾒ */
    public final Object mo5367(ArrayList arrayList, C0807 c0807) {
        C0569 c0569 = this.f1901;
        AdContainer adContainer = (AdContainer) arrayList.get(0);
        c0569.getClass();
        return adContainer.getDataModel();
    }
}
