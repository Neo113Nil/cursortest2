package com.ironsource.adqualitysdk.sdk.i;

import com.ogury.ad.OguryRewardedAd;
import com.ogury.ad.OguryRewardedAdListener;
import java.util.ArrayList;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ἱ, reason: contains not printable characters */
/* loaded from: classes6.dex */
public final class C1037 implements InterfaceC0559 {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ C1036 f3086;

    public C1037(C1036 c1036) {
        this.f3086 = c1036;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0559
    /* renamed from: ﾒ */
    public final Object mo5367(ArrayList arrayList, C0807 c0807) {
        C1036 c1036 = this.f3086;
        OguryRewardedAd oguryRewardedAd = (OguryRewardedAd) arrayList.get(0);
        OguryRewardedAdListener oguryRewardedAdListener = (OguryRewardedAdListener) arrayList.get(1);
        c1036.getClass();
        oguryRewardedAd.setListener(oguryRewardedAdListener);
        return null;
    }
}
