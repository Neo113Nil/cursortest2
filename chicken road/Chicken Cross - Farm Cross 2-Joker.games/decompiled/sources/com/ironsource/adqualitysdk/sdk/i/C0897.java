package com.ironsource.adqualitysdk.sdk.i;

import com.qq.e.ads.rewardvideo.RewardVideoAD;
import java.util.ArrayList;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ᗮ, reason: contains not printable characters */
/* loaded from: classes6.dex */
public final class C0897 implements InterfaceC0559 {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ C0804 f2522;

    public C0897(C0804 c0804) {
        this.f2522 = c0804;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0559
    /* renamed from: ﾒ */
    public final Object mo5367(ArrayList arrayList, C0807 c0807) {
        C0804 c0804 = this.f2522;
        RewardVideoAD rewardVideoAD = (RewardVideoAD) arrayList.get(0);
        c0804.getClass();
        return Integer.valueOf(rewardVideoAD.getRewardAdType());
    }
}
