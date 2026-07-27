package com.ironsource.adqualitysdk.sdk.i;

import com.smaato.sdk.interstitial.InterstitialAdBase;
import java.util.ArrayList;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ˤ, reason: contains not printable characters */
/* loaded from: classes6.dex */
public final class C0459 implements InterfaceC0559 {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ C0441 f850;

    public C0459(C0441 c0441) {
        this.f850 = c0441;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0559
    /* renamed from: ﾒ */
    public final Object mo5367(ArrayList arrayList, C0807 c0807) {
        C0441 c0441 = this.f850;
        InterstitialAdBase interstitialAdBase = (InterstitialAdBase) arrayList.get(0);
        c0441.getClass();
        return interstitialAdBase.getCreativeId();
    }
}
