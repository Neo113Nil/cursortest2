package com.ironsource.adqualitysdk.sdk.i;

import com.mbridge.msdk.out.RewardInfo;
import java.util.ArrayList;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ⅹ, reason: contains not printable characters */
/* loaded from: classes6.dex */
public final class C1089 implements InterfaceC0559 {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ C0971 f3208;

    public C1089(C0971 c0971) {
        this.f3208 = c0971;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0559
    /* renamed from: ﾒ */
    public final Object mo5367(ArrayList arrayList, C0807 c0807) {
        C0971 c0971 = this.f3208;
        RewardInfo rewardInfo = (RewardInfo) arrayList.get(0);
        c0971.getClass();
        return rewardInfo.getRewardAmount();
    }
}
