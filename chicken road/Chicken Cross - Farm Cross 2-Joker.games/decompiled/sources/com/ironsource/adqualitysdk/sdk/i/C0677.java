package com.ironsource.adqualitysdk.sdk.i;

import io.bidmachine.rewarded.RewardedAd;
import io.bidmachine.rewarded.RewardedListener;
import java.util.ArrayList;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.য, reason: contains not printable characters */
/* loaded from: classes6.dex */
public final class C0677 implements InterfaceC0559 {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ C0582 f1848;

    public C0677(C0582 c0582) {
        this.f1848 = c0582;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0559
    /* renamed from: ﾒ */
    public final Object mo5367(ArrayList arrayList, C0807 c0807) {
        C0582 c0582 = this.f1848;
        RewardedAd rewardedAd = (RewardedAd) arrayList.get(0);
        RewardedListener rewardedListener = (RewardedListener) arrayList.get(1);
        c0582.getClass();
        rewardedAd.setListener(rewardedListener);
        return null;
    }
}
