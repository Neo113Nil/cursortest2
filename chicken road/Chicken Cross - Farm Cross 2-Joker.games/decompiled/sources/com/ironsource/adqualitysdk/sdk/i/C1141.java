package com.ironsource.adqualitysdk.sdk.i;

import com.fyber.fairbid.ads.Rewarded;
import com.fyber.fairbid.ads.rewarded.RewardedListener;
import java.util.ArrayList;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.הּ, reason: contains not printable characters */
/* loaded from: classes6.dex */
public final class C1141 implements InterfaceC0559 {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ C1015 f3278;

    public C1141(C1015 c1015) {
        this.f3278 = c1015;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0559
    /* renamed from: ﾒ */
    public final Object mo5367(ArrayList arrayList, C0807 c0807) {
        C1015 c1015 = this.f3278;
        RewardedListener rewardedListener = (RewardedListener) arrayList.get(0);
        c1015.getClass();
        Rewarded.setRewardedListener(rewardedListener);
        return null;
    }
}
