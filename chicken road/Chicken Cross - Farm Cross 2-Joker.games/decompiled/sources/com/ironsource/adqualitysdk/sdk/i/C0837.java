package com.ironsource.adqualitysdk.sdk.i;

import com.five_corp.ad.FiveAdInterface;
import com.five_corp.ad.FiveAdListener;
import java.util.ArrayList;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ᓿ, reason: contains not printable characters */
/* loaded from: classes6.dex */
public final class C0837 implements InterfaceC0559 {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ C0832 f2445;

    public C0837(C0832 c0832) {
        this.f2445 = c0832;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0559
    /* renamed from: ﾒ */
    public final Object mo5367(ArrayList arrayList, C0807 c0807) {
        C0832 c0832 = this.f2445;
        FiveAdInterface fiveAdInterface = (FiveAdInterface) arrayList.get(0);
        FiveAdListener fiveAdListener = (FiveAdListener) arrayList.get(1);
        c0832.getClass();
        fiveAdInterface.setListener(fiveAdListener);
        return null;
    }
}
