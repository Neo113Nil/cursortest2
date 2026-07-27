package com.ironsource.adqualitysdk.sdk.i;

import com.five_corp.ad.FiveAdInterface;
import com.five_corp.ad.FiveAdLoadListener;
import java.util.ArrayList;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ᚐ, reason: contains not printable characters */
/* loaded from: classes6.dex */
public final class C0914 implements InterfaceC0559 {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ C0832 f2557;

    public C0914(C0832 c0832) {
        this.f2557 = c0832;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0559
    /* renamed from: ﾒ */
    public final Object mo5367(ArrayList arrayList, C0807 c0807) {
        C0832 c0832 = this.f2557;
        FiveAdInterface fiveAdInterface = (FiveAdInterface) arrayList.get(0);
        FiveAdLoadListener fiveAdLoadListener = (FiveAdLoadListener) arrayList.get(1);
        c0832.getClass();
        fiveAdInterface.setLoadListener(fiveAdLoadListener);
        return null;
    }
}
