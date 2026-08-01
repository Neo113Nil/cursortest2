package com.ironsource.adqualitysdk.sdk.i;

import com.yandex.mobile.ads.rewarded.RewardedAd;
import com.yandex.mobile.ads.rewarded.RewardedAdEventListener;
import java.util.ArrayList;

/* loaded from: classes6.dex */
public final class m0 implements InterfaceC0559 {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ o0 f205;

    public m0(o0 o0Var) {
        this.f205 = o0Var;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0559
    /* renamed from: ﾒ */
    public final Object mo5367(ArrayList arrayList, C0807 c0807) {
        o0 o0Var = this.f205;
        RewardedAd rewardedAd = (RewardedAd) arrayList.get(0);
        RewardedAdEventListener rewardedAdEventListener = (RewardedAdEventListener) arrayList.get(1);
        o0Var.getClass();
        rewardedAd.setAdEventListener(rewardedAdEventListener);
        return null;
    }
}
