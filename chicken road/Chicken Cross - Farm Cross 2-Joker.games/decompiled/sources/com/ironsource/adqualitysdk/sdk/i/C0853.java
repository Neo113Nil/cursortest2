package com.ironsource.adqualitysdk.sdk.i;

import com.five_corp.ad.FiveAdInterface;
import java.util.ArrayList;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ᔩ, reason: contains not printable characters */
/* loaded from: classes6.dex */
public final class C0853 implements InterfaceC0559 {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ C0832 f2465;

    public C0853(C0832 c0832) {
        this.f2465 = c0832;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0559
    /* renamed from: ﾒ */
    public final Object mo5367(ArrayList arrayList, C0807 c0807) {
        C0832 c0832 = this.f2465;
        FiveAdInterface fiveAdInterface = (FiveAdInterface) arrayList.get(0);
        c0832.getClass();
        return fiveAdInterface.getFiveAdTag();
    }
}
