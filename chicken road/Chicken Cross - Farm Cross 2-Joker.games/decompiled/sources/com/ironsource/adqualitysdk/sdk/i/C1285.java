package com.ironsource.adqualitysdk.sdk.i;

import com.unity3d.ads.core.data.model.AdObject;
import java.util.ArrayList;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ｰ, reason: contains not printable characters */
/* loaded from: classes6.dex */
public final class C1285 implements InterfaceC0559 {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ C0449 f3668;

    public C1285(C0449 c0449) {
        this.f3668 = c0449;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0559
    /* renamed from: ﾒ */
    public final Object mo5367(ArrayList arrayList, C0807 c0807) {
        C0449 c0449 = this.f3668;
        AdObject adObject = (AdObject) arrayList.get(0);
        c0449.getClass();
        return adObject.getOpportunityId();
    }
}
