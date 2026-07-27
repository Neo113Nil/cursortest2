package com.ironsource.adqualitysdk.sdk.i;

import com.five_corp.ad.FiveAdInterface;
import java.util.ArrayList;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ᔦ, reason: contains not printable characters */
/* loaded from: classes6.dex */
public final class C0851 implements InterfaceC0559 {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ C0832 f2461;

    public C0851(C0832 c0832) {
        this.f2461 = c0832;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0559
    /* renamed from: ﾒ */
    public final Object mo5367(ArrayList arrayList, C0807 c0807) {
        C0832 c0832 = this.f2461;
        FiveAdInterface fiveAdInterface = (FiveAdInterface) arrayList.get(0);
        c0832.getClass();
        return fiveAdInterface.getCreativeType();
    }
}
