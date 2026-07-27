package com.ironsource.adqualitysdk.sdk.i;

import com.five_corp.ad.FiveAdInterface;
import com.five_corp.ad.FiveAdViewEventListener;
import java.util.ArrayList;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ᘤ, reason: contains not printable characters */
/* loaded from: classes6.dex */
public final class C0906 implements InterfaceC0559 {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ C0832 f2542;

    public C0906(C0832 c0832) {
        this.f2542 = c0832;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0559
    /* renamed from: ﾒ */
    public final Object mo5367(ArrayList arrayList, C0807 c0807) {
        C0832 c0832 = this.f2542;
        FiveAdInterface fiveAdInterface = (FiveAdInterface) arrayList.get(0);
        FiveAdViewEventListener fiveAdViewEventListener = (FiveAdViewEventListener) arrayList.get(1);
        c0832.getClass();
        fiveAdInterface.setViewEventListener(fiveAdViewEventListener);
        return null;
    }
}
