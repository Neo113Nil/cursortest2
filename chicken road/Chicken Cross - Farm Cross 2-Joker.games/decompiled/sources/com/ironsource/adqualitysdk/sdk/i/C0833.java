package com.ironsource.adqualitysdk.sdk.i;

import com.five_corp.ad.FiveAdCustomLayout;
import java.util.ArrayList;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ᓻ, reason: contains not printable characters */
/* loaded from: classes6.dex */
public final class C0833 implements InterfaceC0559 {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ C0832 f2438;

    public C0833(C0832 c0832) {
        this.f2438 = c0832;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0559
    /* renamed from: ﾒ */
    public final Object mo5367(ArrayList arrayList, C0807 c0807) {
        C0832 c0832 = this.f2438;
        FiveAdCustomLayout fiveAdCustomLayout = (FiveAdCustomLayout) arrayList.get(0);
        c0832.getClass();
        return fiveAdCustomLayout.getAdvertiserName();
    }
}
