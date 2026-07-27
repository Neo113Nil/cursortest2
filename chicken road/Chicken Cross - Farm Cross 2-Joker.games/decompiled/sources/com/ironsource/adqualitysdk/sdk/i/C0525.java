package com.ironsource.adqualitysdk.sdk.i;

import com.bytedance.sdk.openadsdk.api.reward.PAGRewardItem;
import java.util.ArrayList;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ѕ, reason: contains not printable characters */
/* loaded from: classes6.dex */
public final class C0525 implements InterfaceC0559 {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ C0486 f1192;

    public C0525(C0486 c0486) {
        this.f1192 = c0486;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0559
    /* renamed from: ﾒ */
    public final Object mo5367(ArrayList arrayList, C0807 c0807) {
        C0486 c0486 = this.f1192;
        PAGRewardItem pAGRewardItem = (PAGRewardItem) arrayList.get(0);
        c0486.getClass();
        return pAGRewardItem.getRewardName();
    }
}
