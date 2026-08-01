package com.ironsource.adqualitysdk.sdk.i;

import com.smaato.sdk.core.ad.InterstitialAdPresenter;
import com.smaato.sdk.video.ad.InterstitialVideoAdPresenter;
import java.util.ArrayList;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ᑦ, reason: contains not printable characters */
/* loaded from: classes6.dex */
public final class C0766 implements InterfaceC0559 {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ C0441 f2203;

    public C0766(C0441 c0441) {
        this.f2203 = c0441;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0559
    /* renamed from: ﾒ */
    public final Object mo5367(ArrayList arrayList, C0807 c0807) {
        C0441 c0441 = this.f2203;
        InterstitialVideoAdPresenter interstitialVideoAdPresenter = (InterstitialVideoAdPresenter) arrayList.get(0);
        InterstitialAdPresenter.Listener listener = (InterstitialAdPresenter.Listener) arrayList.get(1);
        c0441.getClass();
        interstitialVideoAdPresenter.setListener(listener);
        return null;
    }
}
