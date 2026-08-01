package com.ironsource.adqualitysdk.sdk.i;

import com.unity3d.ads.core.data.model.AdObject;
import java.util.ArrayList;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ﹺ, reason: contains not printable characters */
/* loaded from: classes6.dex */
public final class C1208 implements InterfaceC0559 {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ C0449 f3405;

    public C1208(C0449 c0449) {
        this.f3405 = c0449;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0559
    /* renamed from: ﾒ */
    public final Object mo5367(ArrayList arrayList, C0807 c0807) {
        C0449 c0449 = this.f3405;
        AdObject adObject = (AdObject) arrayList.get(0);
        c0449.getClass();
        return adObject.getPlacementId();
    }
}
