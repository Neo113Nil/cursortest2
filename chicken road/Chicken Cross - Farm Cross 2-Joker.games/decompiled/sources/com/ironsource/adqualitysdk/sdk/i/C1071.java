package com.ironsource.adqualitysdk.sdk.i;

import io.presage.interstitial.PresageInterstitial;
import io.presage.interstitial.PresageInterstitialCallback;
import java.util.ArrayList;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.⁀, reason: contains not printable characters */
/* loaded from: classes6.dex */
public final class C1071 implements InterfaceC0559 {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ C1057 f3175;

    public C1071(C1057 c1057) {
        this.f3175 = c1057;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0559
    /* renamed from: ﾒ */
    public final Object mo5367(ArrayList arrayList, C0807 c0807) {
        C1057 c1057 = this.f3175;
        PresageInterstitial presageInterstitial = (PresageInterstitial) arrayList.get(0);
        PresageInterstitialCallback presageInterstitialCallback = (PresageInterstitialCallback) arrayList.get(1);
        c1057.getClass();
        presageInterstitial.setInterstitialCallback(presageInterstitialCallback);
        return null;
    }
}
