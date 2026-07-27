package com.ironsource.adqualitysdk.sdk.i;

import com.ironsource.mediationsdk.ads.nativead.LevelPlayNativeAd;
import com.ironsource.mediationsdk.ads.nativead.LevelPlayNativeAdListener;
import java.util.ArrayList;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ๆ, reason: contains not printable characters */
/* loaded from: classes6.dex */
public final class C0718 implements InterfaceC0559 {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ C0713 f1985;

    public C0718(C0713 c0713) {
        this.f1985 = c0713;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0559
    /* renamed from: ﾒ */
    public final Object mo5367(ArrayList arrayList, C0807 c0807) {
        C0713 c0713 = this.f1985;
        LevelPlayNativeAd levelPlayNativeAd = (LevelPlayNativeAd) arrayList.get(0);
        LevelPlayNativeAdListener levelPlayNativeAdListener = (LevelPlayNativeAdListener) arrayList.get(1);
        c0713.getClass();
        levelPlayNativeAd.setListener(levelPlayNativeAdListener);
        return null;
    }
}
