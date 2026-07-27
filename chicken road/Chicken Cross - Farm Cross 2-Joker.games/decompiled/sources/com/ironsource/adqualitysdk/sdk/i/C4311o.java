package com.ironsource.adqualitysdk.sdk.i;

import com.vungle.ads.internal.model.AdPayload;
import java.util.ArrayList;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.o, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C4311o implements InterfaceC0559 {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ C4314s f208;

    public C4311o(C4314s c4314s) {
        this.f208 = c4314s;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0559
    /* renamed from: ﾒ */
    public final Object mo5367(ArrayList arrayList, C0807 c0807) {
        C4314s c4314s = this.f208;
        AdPayload.AdUnit adUnit = (AdPayload.AdUnit) arrayList.get(0);
        c4314s.getClass();
        return adUnit.getCampaign();
    }
}
