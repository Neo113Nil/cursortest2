package com.ironsource.adqualitysdk.sdk.i;

import com.yandex.mobile.ads.rewarded.Reward;
import java.util.ArrayList;

/* loaded from: classes6.dex */
public final class k0 implements InterfaceC0559 {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ o0 f201;

    public k0(o0 o0Var) {
        this.f201 = o0Var;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0559
    /* renamed from: ﾒ */
    public final Object mo5367(ArrayList arrayList, C0807 c0807) {
        o0 o0Var = this.f201;
        Reward reward = (Reward) arrayList.get(0);
        o0Var.getClass();
        return reward.getType();
    }
}
