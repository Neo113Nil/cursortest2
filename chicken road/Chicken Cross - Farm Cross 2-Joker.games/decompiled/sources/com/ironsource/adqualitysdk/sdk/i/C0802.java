package com.ironsource.adqualitysdk.sdk.i;

import com.smaato.sdk.core.ad.AdPresenter;
import java.util.ArrayList;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ᒻ, reason: contains not printable characters */
/* loaded from: classes6.dex */
public final class C0802 implements InterfaceC0559 {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ C0441 f2315;

    public C0802(C0441 c0441) {
        this.f2315 = c0441;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0559
    /* renamed from: ﾒ */
    public final Object mo5367(ArrayList arrayList, C0807 c0807) {
        C0441 c0441 = this.f2315;
        AdPresenter adPresenter = (AdPresenter) arrayList.get(0);
        c0441.getClass();
        return adPresenter.getSessionId();
    }
}
