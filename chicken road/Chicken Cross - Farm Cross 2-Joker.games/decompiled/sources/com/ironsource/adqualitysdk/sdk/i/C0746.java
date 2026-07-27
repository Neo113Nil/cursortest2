package com.ironsource.adqualitysdk.sdk.i;

import com.smaato.sdk.core.ad.AdPresenter;
import java.util.ArrayList;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ᐢ, reason: contains not printable characters */
/* loaded from: classes6.dex */
public final class C0746 implements InterfaceC0559 {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ C0441 f2079;

    public C0746(C0441 c0441) {
        this.f2079 = c0441;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0559
    /* renamed from: ﾒ */
    public final Object mo5367(ArrayList arrayList, C0807 c0807) {
        C0441 c0441 = this.f2079;
        AdPresenter adPresenter = (AdPresenter) arrayList.get(0);
        c0441.getClass();
        return adPresenter.getCreativeId();
    }
}
